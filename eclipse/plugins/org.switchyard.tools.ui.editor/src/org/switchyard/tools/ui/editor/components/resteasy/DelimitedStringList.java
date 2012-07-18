/******************************************************************************* 
 * Copyright (c) 2004-2005, 2008 Sybase, Inc; 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Sybase, Inc. - Initial API and implementation
 * IBM Corporation - defect fix #213266
 * Red Hat, Inc. - adapting for use with list of classes 
 *
 * @author bfitzpat/brianf
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.resteasy;

import java.util.StringTokenizer;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * Composite that provides a method of managing a delimited list of strings.
 * 
 * Repurposed from Eclipse DTP org.eclipse.datatools.connectivity.ui project
 * 
 * @author brianf
 */
public class DelimitedStringList extends Composite {

    // delimiter used
    private static final String DELIMITER = ","; //$NON-NLS-1$

    // ui elements
    private Button _mAddButton;
    private Button _mClearAllButton;
    private Button _mRemoveButton;
    private Button _mDownButton;
    private Button _mUpButton;
    private List _mPropsList;
    private Text _mAddText;
    private Text _mHiddenText;
    private boolean _isReadOnly = false;

    // current delimiter
    private String _mDelimiter = DELIMITER;

    // Warning
    private String _mWarning = null;

    // change listeners
    private ListenerList _changeListeners;

//    private class AddTextModifyListener implements ModifyListener {
//
//        private DelimitedStringList _parent;
//
//        public AddTextModifyListener(DelimitedStringList parent) {
//            this._parent = parent;
//        }
//
//        public void modifyText(ModifyEvent e) {
//            updatePropertyButtons();
//            fireChangedEvent(_parent);
//        }
//    }

    /**
     * Constructor.
     * 
     * @param parent composite
     * @param style style bits
     */
    public DelimitedStringList(Composite parent, int style) {
        this(parent, style, false);
    }

    /**
     * Constructor.
     * 
     * @param parent composite
     * @param style style bits
     * @param isReadOnly boolean indicating read only status
     */
    public DelimitedStringList(Composite parent, int style, boolean isReadOnly) {
        super(parent, style);
        this._isReadOnly = isReadOnly;
        this._changeListeners = new ListenerList();

//        int additionalStyles = SWT.NONE;
//        if (isReadOnly) {
//            additionalStyles = SWT.READ_ONLY;
//        }

        final GridLayout gridLayout = new GridLayout();
        gridLayout.marginWidth = 0;
        gridLayout.marginHeight = 0;
        gridLayout.numColumns = 2;
        setLayout(gridLayout);

//        this._mAddText = new Text(this, SWT.BORDER | additionalStyles);
//        this._mAddText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
//        this._mAddText.addModifyListener(new AddTextModifyListener(this));

//        this._mAddButton = new Button(this, SWT.NONE);
//        this._mAddButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
//        this._mAddButton.setText("Add");
//        this._mAddButton.addSelectionListener(new SelectionAdapter() {
//
//            public void widgetSelected(SelectionEvent e) {
//                addStringToList();
//                fireChangedEvent(e.getSource());
//            }
//        });
//
//        this._mAddButton.setEnabled(false);

//        Composite mSpacerComposite = new Composite(this, SWT.NONE);
//        GridData gridData = new GridData();
//        gridData.heightHint = 10;
//        gridData.horizontalSpan = 2;
//        mSpacerComposite.setLayoutData(gridData);
//        mSpacerComposite.setLayout(new GridLayout());

        this._mPropsList = new List(this, SWT.BORDER);
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
        gridData.verticalSpan = 5;
        this._mPropsList.setLayoutData(gridData);
        this._mPropsList.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                updatePropertyButtons();
            }
        });

        this._mAddButton = new Button(this, SWT.NONE);
        this._mAddButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mAddButton.setText("Add");
        this._mAddButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                try {
                    IType selected = selectType(DelimitedStringList.this.getShell(), null, null);
                    if (selected != null) {
                        addStringToList(selected.getFullyQualifiedName());
                    }
                } catch (JavaModelException e1) {
                    e1.printStackTrace();
                }
                fireChangedEvent(e.getSource());
            }
        });

        this._mUpButton = new Button(this, SWT.NONE);
        this._mUpButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mUpButton.setText("Up");
        this._mUpButton.setEnabled(false);
        this._mUpButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                moveUpInList();
            }
        });

        this._mDownButton = new Button(this, SWT.NONE);
        this._mDownButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mDownButton.setText("Down");
        this._mDownButton.setEnabled(false);
        this._mDownButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                moveDownInList();
            }
        });

        this._mRemoveButton = new Button(this, SWT.NONE);
        this._mRemoveButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mRemoveButton.setText("Remove");
        this._mRemoveButton.setEnabled(false);
        this._mRemoveButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                removeFromList();
            }
        });

        this._mClearAllButton = new Button(this, SWT.NONE);
        this._mClearAllButton.setEnabled(false);
        this._mClearAllButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mClearAllButton.setText("Clear All");
        this._mClearAllButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                DelimitedStringList.this._mPropsList.removeAll();
                DelimitedStringList.this._mHiddenText.setText(DelimitedStringList.this.getSelection().trim());
                updatePropertyButtons();
            }
        });

        this._mHiddenText = new Text(this, SWT.BORDER);
        gridData = new GridData();
        gridData.horizontalSpan = 2;
        this._mHiddenText.setLayoutData(gridData);
        this._mHiddenText.setVisible(false);

        updatePropertyButtons();
    }

    /**
     * Add a listener to receive notifications when the property list is
     * modified.
     * 
     * @param listener New listener
     */
    public void addModifyListener(ModifyListener listener) {
        this._mHiddenText.addModifyListener(listener);
    }

    /**
     * Remove a listener.
     * 
     * @param listener Listener to remove
     */
    public void removeModifyListener(ModifyListener listener) {
        this._mHiddenText.removeModifyListener(listener);
    }

    /**
     * @see org.eclipse.swt.widgets.Widget#dispose()
     */
    public void dispose() {
        super.dispose();
    }

    protected void checkSubclass() {
        // empty
    }

//    /**
//     * Add a new string to the list
//     */
//    private void addStringToList() {
//        if (this._mAddText.getText().length() > 0) {
//            this._mPropsList.add(this._mAddText.getText().trim());
//            if (!_isReadOnly) {
//                this._mClearAllButton.setEnabled(true);
//            }
//            String selected = getSelection();
//            this._mHiddenText.setText(selected.trim());
//            this._mAddText.setSelection(0, this._mAddText.getText().length());
//            this._mAddText.setFocus();
//        }
//    }

    /**
     * Add a new string to the list
     */
    private void addStringToList(String text) {
        if (text.length() > 0) {
            this._mPropsList.add(text.trim());
            if (!_isReadOnly) {
                this._mClearAllButton.setEnabled(true);
            }
            String selected = getSelection();
            this._mHiddenText.setText(selected.trim());
        }
    }

    /**
     * Remove a string from the list
     */
    private void removeFromList() {
        if (this._mPropsList.getSelectionCount() == 1) {
            int index = this._mPropsList.getSelectionIndex();
            this._mPropsList.remove(index);
            String selected = getSelection();
            this._mHiddenText.setText(selected.trim());

            try {
                if (this._mPropsList.getItem(index) != null) {
                    this._mPropsList.select(index);
                }
            } catch (IllegalArgumentException e) {
                // do nothing
                e.fillInStackTrace();
            }
        }

        this._mPropsList.setFocus();

        updatePropertyButtons();
    }

    /**
     * Move a string up in the list
     */
    private void moveUpInList() {
        if (this._mPropsList.getSelectionCount() == 1) {
            int selection = this._mPropsList.getSelectionIndex();
            int destination = -1;
            if (selection > 0) {
                destination = selection - 1;
                String value_a = this._mPropsList.getItem(destination);
                String value_b = this._mPropsList.getItem(selection);

                String[] items = this._mPropsList.getItems();
                this._mPropsList.removeAll();

                int counter = 0;
                while (counter < items.length) {
                    if (counter == destination) {
                        this._mPropsList.add(value_b);
                        this._mPropsList.add(value_a);
                        counter = counter + 2;
                    } else {
                        this._mPropsList.add(items[counter]);
                        counter++;
                    }
                }

                String selected = getSelection();
                this._mHiddenText.setText(selected.trim());
                this._mPropsList.setSelection(destination);
            }
        }
        this._mPropsList.setFocus();
        updatePropertyButtons();
    }

    /**
     * Move a string down in the list
     */
    private void moveDownInList() {
        if (this._mPropsList.getSelectionCount() == 1) {
            int selection = this._mPropsList.getSelectionIndex();
            int destination = -1;
            if (selection < this._mPropsList.getItemCount() - 1) {

                destination = selection + 1;

                String value_a = this._mPropsList.getItem(destination);
                String value_b = this._mPropsList.getItem(selection);

                String[] items = this._mPropsList.getItems();
                this._mPropsList.removeAll();

                int counter = 0;
                while (counter < items.length) {
                    if (counter == selection) {
                        this._mPropsList.add(value_a);
                        this._mPropsList.add(value_b);
                    } else if (counter == destination) {
                        // ignore
                        System.out.println("");
                    } else {
                        this._mPropsList.add(items[counter]);
                    }
                    counter++;
                }

                String selected = getSelection();
                this._mHiddenText.setText(selected.trim());
                this._mPropsList.setSelection(destination);

            }
        }
        this._mPropsList.setFocus();
        updatePropertyButtons();
    }

    /**
     * Return the current selection.
     * @return the comma delimited string
     */
    public String getSelection() {
        String selectString = ""; //$NON-NLS-1$
        for (int i = 0; i < this._mPropsList.getItems().length; i++) {
            String testitem = this._mPropsList.getItem(i).trim();
            selectString = selectString + testitem;
            if (i < this._mPropsList.getItems().length - 1) {
                selectString = selectString + this._mDelimiter; //$NON-NLS-1$
            }
        }
        return selectString;
    }

    /**
     * Update button state based on what's selected.
     */
    public void updatePropertyButtons() {
        if (!_isReadOnly) {
            this._mDownButton.setEnabled(false);
            this._mUpButton.setEnabled(false);
            this._mRemoveButton.setEnabled(false);
            this._mClearAllButton.setEnabled(false);

            if (this._mPropsList.getItemCount() > 0) {

                this._mClearAllButton.setEnabled(true);

                if (this._mPropsList.getSelectionCount() == 1) {
                    int selection = this._mPropsList.getSelectionIndex();

                    this._mRemoveButton.setEnabled(true);

                    if (selection - 1 >= 0) {
                        this._mUpButton.setEnabled(true);
                    }
                    if (selection + 1 < this._mPropsList.getItemCount()) {
                        this._mDownButton.setEnabled(true);
                    }
                }
            }

//            String value = ""; //$NON-NLS-1$
//            value = this._mAddText.getText();
//            boolean flag = value != null && value.trim().length() > 0;
//            boolean valid = validateText(value);
//            this._mAddButton.setEnabled(flag && valid);
        }
    }

//    private boolean validateText(String text) {
//        if (text != null && text.trim().length() > 0 && text.indexOf(",") > -1) { //$NON-NLS-1$
//            this._mWarning = "Commas may not be used in list items";
//            return false;
//        }
//        this._mWarning = null;
//        return true;
//    }
//
    /**
     * Set focus to the add text box.
     * @return true/false 
     */
    public boolean setFocus() {
        if (this._mAddText != null) {
            return this._mAddText.setFocus();
        }
        return false;
    }

    /**
     * Set the initial delimited list.
     * 
     * @param str_list Incoming delimited list
     */
    public void setSelection(String str_list) {
        String[] str_array = parseString(str_list);
        this._mPropsList.setItems(str_array);
        updatePropertyButtons();
    }

    /**
     * Parse the list
     * 
     * @param str_list
     * @return
     */
    private String[] parseString(String str_list) {
        StringTokenizer tk = new StringTokenizer(str_list, this._mDelimiter);
        String[] pieces = new String[tk.countTokens()];
        int index = 0;
        while (tk.hasMoreTokens()) {
            pieces[index++] = tk.nextToken();
        }
        return pieces;
    }

    /**
     * Change the delimiter.
     * 
     * @param delimiter New delim (defaults to comma)
     */
    public void setDelimiter(String delimiter) {
        this._mDelimiter = delimiter;
    }

    /**
     * Return the current delimiter.
     * 
     * @return current delimiter characters
     */
    public String getDelimiter() {
        return this._mDelimiter;
    }

    /**
     * @return Warning string
     */
    public String getWarning() {
        return this._mWarning;
    }

    /**
     * If we changed, fire a changed event.
     * 
     * @param source
     */
    private void fireChangedEvent(Object source) {
        ChangeEvent e = new ChangeEvent(source);
        // inform any listeners of the resize event
        Object[] listeners = this._changeListeners.getListeners();
        for (int i = 0; i < listeners.length; ++i) {
            ((ChangeListener) listeners[i]).stateChanged(e);
        }
    }

    /**
     * Add a change listener.
     * 
     * @param listener to add
     */
    public void addChangeListener(ChangeListener listener) {
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
     * @param shell Shell for the window
     * @param superTypeName supertype to search for
     * @param project project to look in
     * @return IType the type created
     * @throws JavaModelException exception thrown
     */
    public IType selectType(Shell shell, String superTypeName, IProject project) throws JavaModelException {
        IJavaSearchScope searchScope = null;
        if (project == null) {
            ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
                    .getSelection();
            IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
            if (selection instanceof IStructuredSelection) {
                selectionToPass = (IStructuredSelection) selection;
                if (selectionToPass.getFirstElement() instanceof IFile) {
                    project = ((IFile) selectionToPass.getFirstElement()).getProject();
                }
            }
        }
        if (superTypeName != null && !superTypeName.equals("java.lang.Object")) { //$NON-NLS-1$
            if (project == null) {
                project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
            }
            IJavaProject javaProject = JavaCore.create(project);
            IType superType = javaProject.findType(superTypeName);
            if (superType != null) {
                searchScope = SearchEngine.createStrictHierarchyScope(javaProject, superType, true, false, null);
            }
        } else {
            searchScope = SearchEngine.createWorkspaceScope();
        }
        SelectionDialog dialog = JavaUI.createTypeDialog(shell, new ProgressMonitorDialog(shell), searchScope,
                IJavaElementSearchConstants.CONSIDER_CLASSES_AND_INTERFACES, false);
        dialog.setTitle("Select entries");
        dialog.setMessage("Matching items");
        if (dialog.open() == IDialogConstants.CANCEL_ID) {
            return null;
        }
        Object[] types = dialog.getResult();
        if (types == null || types.length == 0) {
            return null;
        }
        return (IType) types[0];
    }

}
