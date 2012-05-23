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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * @author bfitzpat
 * 
 */
public abstract class AbstractSwitchyardComposite {

    private boolean _canEdit = true;
    private String _errorMessage = null;
    private GridData _rootGridData = null;
    private boolean _openOnCreate = false;

    // change listeners
    private ListenerList _changeListeners;

    /**
     * Empty constructor.
     */
    public AbstractSwitchyardComposite() {
        // empty
    }

    abstract protected void validate();
    
    /**
     * @param parent Composite parent
     * @param style any style bits
     */
    abstract public void createContents(Composite parent, int style);

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
                disposeChildWidgets((Composite)k);
            }
            k.dispose();
        }
    }
}
