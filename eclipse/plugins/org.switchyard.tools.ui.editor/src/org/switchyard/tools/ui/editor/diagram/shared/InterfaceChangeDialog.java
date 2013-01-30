/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
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

import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.switchyard.tools.ui.common.InterfaceControl;
import org.switchyard.tools.ui.common.InterfaceControl.InterfaceType;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * This dialog takes an incoming Contract (Service or Reference), prompts the user
 * to change it. 
 * @author bfitzpat
 *
 */
public class InterfaceChangeDialog extends TitleAreaDialog 
    implements ISelectionProvider {
    
    private InterfaceControl _interfaceControl;
    private Contract _service;
    private Interface _originalInterface;
    private Set<ISelectionChangedListener> _listeners = 
            new LinkedHashSet<ISelectionChangedListener>();

    /**
     * Opens a dialog to allow changing the interface.
     * @param parentShell parent shell
     * @param container the container
     * @param originalIntfc the original interface class from the contract
     */
    public InterfaceChangeDialog(Shell parentShell, IContainer container, Interface originalIntfc) {
        super(parentShell);
        _originalInterface = originalIntfc;
        _interfaceControl = new InterfaceControl(null, EnumSet.of(InterfaceType.Java, InterfaceType.WSDL,
                InterfaceType.ESB));
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        setTitle("Edit Interface");
        setMessage("Edit details for the interface.");
        getShell().setText("Edit Interface");
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setFont(parent.getFont());
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        int nColumns = 3;

        GridLayout layout = new GridLayout();
        layout.numColumns = nColumns;
        composite.setLayout(layout);

        IProject project = null;
        IJavaProject javaProject = null;
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        if (modelFile != null) {
            selectionToPass = new StructuredSelection(modelFile);
            project = ((IFile) selectionToPass.getFirstElement()).getProject();
            javaProject = JavaCore.create(project);
        }

        _interfaceControl.createControl(composite, nColumns);
        _interfaceControl.setProject(javaProject);
        _interfaceControl.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                Interface intf = _interfaceControl.getInterface();
                if (intf != null) {
                    validate();
                    fireSelectionChanged();
                }
            }
        });

        return parent;
    }

    /**
     * Adds a new selection changed listener..
     * @param listener New listener to add
     * @see org.eclipse.jface.viewers.ISelectionProvider#addSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
     */
    public void addSelectionChangedListener(ISelectionChangedListener listener) {
        _listeners.add(listener);
    }

    /**
     * Removes an existing selection changed listener..
     * @param listener New listener to remove
     * @see org.eclipse.jface.viewers.ISelectionProvider#addSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
     */
    public void removeSelectionChangedListener(ISelectionChangedListener listener) {
        _listeners.remove(listener);
    }

    /**
     * Retrieve the current selection (returns the new interface).
     * @return ISelection - containing the new interface
     * @see org.eclipse.jface.viewers.ISelectionProvider#getSelection()
     */
    public ISelection getSelection() {
        Interface intfc = _interfaceControl.getInterface();
        return new StructuredSelection(intfc);
    }
    
    /**
     * Sets the selection. In this case, it should be the incoming Contract with the interface
     * to change.
     * @param selection Incoming with Contract object
     * @see org.eclipse.jface.viewers.ISelectionProvider#setSelection(org.eclipse.jface.viewers.ISelection)
     */
    public void setSelection(ISelection selection) {
        if (selection.isEmpty()) {
            return;
        }
        _service = (Contract) ((IStructuredSelection) selection).getFirstElement();
        if (_service.getInterface() != null) {
            Interface intfc = _service.getInterface();
            _interfaceControl.setSelection(new StructuredSelection(intfc));
            
        }
    }

    private void fireSelectionChanged() {
        final Set<ISelectionChangedListener> listeners = new LinkedHashSet<ISelectionChangedListener>(_listeners);
        final SelectionChangedEvent event = new SelectionChangedEvent(this, getSelection());
        for (ISelectionChangedListener listener : listeners) {
            try {
                listener.selectionChanged(event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void validate() {
        setMessage(null);
        setErrorMessage(null);

        IStatus status = _interfaceControl.getStatus();
        switch (status.getSeverity()) {
        case IStatus.ERROR:
            setErrorMessage(status.getMessage());
            break;
        }

        if (getErrorMessage() == null) {
            setMessage("Specify details for the new interface.");
        }
        
        Interface intfc = _interfaceControl.getInterface();
        if (intfc.equals(_originalInterface)) {
            setMessage("Specify details for the new interface. Original interface type selected.");
            getButton(OK).setEnabled(false);
        } else {
            getButton(OK).setEnabled(getErrorMessage() == null);
        }
    }

}
