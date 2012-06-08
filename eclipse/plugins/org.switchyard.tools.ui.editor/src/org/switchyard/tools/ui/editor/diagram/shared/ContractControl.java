/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.diagram.shared;

import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.diagram.shared.InterfaceControl.InterfaceType;

/**
 * ContractControl
 * 
 * <p/>
 * Control for editing contract details (e.g. service name, service interface).
 * 
 * @author Rob Cernich
 */
public class ContractControl implements ISelectionProvider {

    private IJavaProject _project;
    private Contract _service;
    private InterfaceControl _interfaceControl;
    private String _oldServiceName;
    private Text _serviceNameText;
    private Set<ISelectionChangedListener> _listeners = new LinkedHashSet<ISelectionChangedListener>();

    /**
     * Create a new ContractControl.
     * 
     * @param contractType the contract type
     * @param project the containing project.
     * @param supportedTypes the interface types supported by the container.
     */
    public ContractControl(EClass contractType, IJavaProject project, Set<InterfaceType> supportedTypes) {
        if (!contractType.getEAllSuperTypes().contains(ScaPackage.eINSTANCE.getContract())) {
            throw new IllegalArgumentException("contractType must extend Contract: " + contractType.getName());
        }
        _service = (Contract) contractType.getEPackage().getEFactoryInstance().create(contractType);
    }

    /**
     * Create the controls for editing a Contract's details.
     * 
     * @param parent the parent composite.
     * @param numColumns the number of colums in the layout.
     */
    public void createControl(Composite parent, int numColumns) {
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout(numColumns, false));
        contents.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        _interfaceControl = new InterfaceControl(_project, EnumSet.of(InterfaceType.Java, InterfaceType.WSDL));
        _interfaceControl.createControl(contents, numColumns);
        _interfaceControl.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                Interface intf = _interfaceControl.getInterface();
                if (intf == null) {
                    _service.getInterfaceGroup().clear();
                } else {
                    _service.getInterfaceGroup().set(intf.getDocumentFeature(), intf);
                    String newName = InterfaceControl.getSimpleServiceInterfaceName(intf);
                    String currentName = _serviceNameText.getText();
                    if (_oldServiceName == null || _oldServiceName.length() == 0 || currentName.length() == 0
                            || _oldServiceName.equals(currentName)) {
                        _serviceNameText.setText(newName == null ? "" : newName);
                        // we don't want to fire two change notices, so update
                        // the old name and return
                        _oldServiceName = newName;
                        return;
                    }
                    _oldServiceName = newName;
                    fireSelectionChanged();
                }
            }
        });

        Label label = new Label(contents, SWT.NONE);
        label.setText("Name:");

        _serviceNameText = new Text(contents, SWT.SINGLE | SWT.BORDER);
        _serviceNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, numColumns - 2, 1));
        _serviceNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                final String name = _serviceNameText.getText();
                _service.setName(name.length() == 0 ? null : name);
                fireSelectionChanged();
            }
        });
        // spacer
        new Label(contents, SWT.NONE);
    }

    /**
     * @return the current validation status of the control.
     */
    public IStatus getStatus() {
        IStatus status = _interfaceControl.getStatus();
        if (status.getSeverity() != IStatus.ERROR) {
            // validate service name
            if (_service.getName() == null) {
                return new Status(Status.ERROR, Activator.PLUGIN_ID, "Please specify a name.");
            }
        }
        return status;
    }

    /**
     * @param project the project containing the resources.
     */
    public void setProject(IJavaProject project) {
        _project = project;
        _interfaceControl.setProject(_project);
    }

    /**
     * @return the contract being edited.
     */
    public Contract getContract() {
        return _service;
    }

    @Override
    public ISelection getSelection() {
        if (_service == null) {
            return StructuredSelection.EMPTY;
        }
        return new StructuredSelection(_service);
    }

    @Override
    public void addSelectionChangedListener(ISelectionChangedListener listener) {
        _listeners.add(listener);
    }

    @Override
    public void removeSelectionChangedListener(ISelectionChangedListener listener) {
        _listeners.remove(listener);
    }

    @Override
    public void setSelection(ISelection selection) {
        if (selection.isEmpty()) {
            return;
        }
        _service = (Contract) ((IStructuredSelection) selection).getFirstElement();
        if (_service.getInterface() != null) {
            _interfaceControl.setSelection(new StructuredSelection(_service.getInterface()));
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

}
