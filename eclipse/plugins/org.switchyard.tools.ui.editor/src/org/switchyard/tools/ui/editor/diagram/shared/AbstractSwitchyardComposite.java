/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.shared;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author bfitzpat
 * 
 */
public abstract class AbstractSwitchyardComposite implements FocusListener, KeyListener, ModifyListener,
        SelectionListener {

    private boolean _canEdit = true;
    private String _errorMessage = null;
    private GridData _rootGridData = null;
    private boolean _openOnCreate = false;
    private boolean _hasChanged = false;
    private boolean _inUpdate = false;

    // change listeners
    private ListenerList _changeListeners;

    /**
     * Empty constructor.
     */
    public AbstractSwitchyardComposite() {
        // empty
    }

    abstract protected boolean validate();

    protected boolean hasChanged() {
        return _hasChanged;
    }

    protected void setHasChanged(boolean flag) {
        this._inUpdate = flag;
    }

    /**
     * @param parent Composite parent
     * @param style any style bits
     */
    abstract public void createContents(Composite parent, int style);

    abstract protected void handleModify(final Control control);

    /**
     * @return panel
     */
    abstract public Composite getPanel();

    /**
     * @return string error message
     */
    public String getErrorMessage() {
        return this._errorMessage;
    }

    /**
     * @param msg string to set
     */
    public void setErrorMessage(String msg) {
        this._errorMessage = msg;
    }

    /**
     * If we changed, fire a changed event.
     * 
     * @param source
     */
    protected void fireChangedEvent(Object source) {
        ChangeEvent e = new ChangeEvent(source);
        // inform any listeners of the change event
        if (this._changeListeners != null && !this._changeListeners.isEmpty()) {
            Object[] listeners = this._changeListeners.getListeners();
            for (int i = 0; i < listeners.length; ++i) {
                ((ChangeListener) listeners[i]).stateChanged(e);
            }
        }
    }

    /**
     * Add a change listener.
     * 
     * @param listener new listener
     */
    public void addChangeListener(ChangeListener listener) {
        if (this._changeListeners == null) {
            this._changeListeners = new ListenerList();
        }
        this._changeListeners.add(listener);
    }

    /**
     * Remove a change listener.
     * 
     * @param listener to remove
     */
    public void removeChangeListener(ChangeListener listener) {
        this._changeListeners.remove(listener);
    }

    /**
     * @return flag
     */
    public boolean canEdit() {
        return this._canEdit;
    }

    /**
     * @param canEdit flag
     */
    public void setCanEdit(boolean canEdit) {
        this._canEdit = canEdit;
    }

    /**
     * @param rootGridData the _rootGridData to set
     */
    public void setRootGridData(GridData rootGridData) {
        this._rootGridData = rootGridData;
    }

    /**
     * @return GridData or null
     */
    public GridData getRootGridData() {
        return this._rootGridData;
    }

    /**
     * @param flag open on create? true/false
     */
    public void setOpenOnCreate(boolean flag) {
        this._openOnCreate = flag;
    }

    /**
     * @return true/false
     */
    public boolean openOnCreate() {
        return this._openOnCreate;
    }

    /**
     * Dispose of the composite widgets.
     */
    public void dispose() {
        if (getPanel() != null) {
            disposeChildWidgets(getPanel());
        }
    }

    /**
     * @param parent Parent composite
     */
    public static void disposeChildWidgets(Composite parent) {
        Control[] kids = parent.getChildren();
        for (Control k : kids) {
            if (k instanceof Composite) {
                disposeChildWidgets((Composite) k);
            }
            k.dispose();
        }
    }

    /**
     * @param parent parent composite
     * @param label string for label
     * @return reference to created Button
     */
    protected Button createCheckbox(Composite parent, String label) {
        Button newButton = new Button(parent, SWT.CHECK | SWT.LEFT);
        newButton.setText(label);
        newButton.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false, 2, 1));
        newButton.addFocusListener(this);
        newButton.addSelectionListener(this);
        return newButton;
    }

    /**
     * @param parent parent composite
     * @param label string to put in label
     * @return reference to created Text control
     */
    protected Text createLabelAndText(Composite parent, String label) {
        if (label != null && !label.trim().isEmpty()) {
            new Label(parent, SWT.NONE).setText(label);
        }
        Text newText = new Text(parent, SWT.BORDER);
        newText.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
        newText.addFocusListener(this);
        newText.addKeyListener(this);
        newText.addModifyListener(this);
        return newText;
    }

    /**
     * @param parent parent composite
     * @param label string to put in label
     * @return reference to created Text control
     */
    protected Combo createLabelAndCombo(Composite parent, String label) {
        if (label != null && !label.trim().isEmpty()) {
            new Label(parent, SWT.NONE).setText(label);
        }
        Combo combo = new Combo(parent, SWT.BORDER | SWT.DROP_DOWN);
        combo.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
        combo.addFocusListener(this);
        combo.addSelectionListener(this);
        return combo;
    }

    protected Combo createLabelAndCombo(Composite parent, String label, boolean readOnly) {
        if (label != null && !label.trim().isEmpty()) {
            new Label(parent, SWT.NONE).setText(label);
        }
        Combo combo = new Combo(parent, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
        combo.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
        combo.addFocusListener(this);
        combo.addSelectionListener(this);
        return combo;
    }

    @Override
    public void focusGained(FocusEvent e) {
        // ignore
    }

    @Override
    public void focusLost(FocusEvent e) {
        // ignore
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // ignore
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // if (e.keyCode == SWT.ESC) {
        // // cancel out and return to original value
        // } else if (e.keyCode == SWT.CR) {
        // // accept change
        // }
    }

    protected boolean inUpdate() {
        return _inUpdate;
    }

    protected void setInUpdate(boolean inUpdate) {
        this._inUpdate = inUpdate;
    }

    @Override
    public void modifyText(ModifyEvent e) {
        if (!inUpdate()) {
            _hasChanged = true;
        }
    }

    @Override
    public void widgetSelected(SelectionEvent e) {
        if (!inUpdate()) {
            _hasChanged = true;
        }
    }

    @Override
    public void widgetDefaultSelected(SelectionEvent e) {
        widgetSelected(e);
    }
}
