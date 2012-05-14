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
package org.switchyard.tools.ui.editor.diagram.compositereference.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramAddReferenceInterfaceStartPage extends BaseWizardPage {

    private ListViewer _listViewer;
    private Interface _interface = null;
    private Interface _inheritedInterface = null;

    /**
     * List width in characters.
     */
    private final static int LIST_WIDTH = 60;

    /**
     * List height in characters.
     */
    private final static int LIST_HEIGHT = 10;

    protected SCADiagramAddReferenceInterfaceStartPage(String pageName) {
        super(pageName);
        setTitle("Specify an Interface");
        setDescription("Specify the interface type details for the new promoted reference.");
    }

    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout gl = new GridLayout();
        gl.numColumns = 2;
        composite.setLayout(gl);

        Label listLabel = new Label(composite, SWT.NONE);
        listLabel.setText("Interface Type:");
        GridData labelGD = new GridData(GridData.FILL_HORIZONTAL);
        labelGD.horizontalSpan = 2;
        listLabel.setLayoutData(labelGD);

        _listViewer = new ListViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
        GridData data = new GridData(GridData.FILL_BOTH);
        data.horizontalSpan = 2;
        data.heightHint = convertHeightInCharsToPixels(LIST_HEIGHT);
        data.widthHint = convertWidthInCharsToPixels(LIST_WIDTH);
        _listViewer.getList().setLayoutData(data);
        _listViewer.getList().setFont(parent.getFont());
        ArrayList<Interface> typeList = new ArrayList<Interface>();
        getInterfaceTypes(typeList);
        // Set the label provider
        _listViewer.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                Interface interfaceType = (Interface) element;
                if (interfaceType instanceof JavaInterface) {
                    JavaInterface javaInterface = (JavaInterface) interfaceType;
                    if (javaInterface.getInterface() == null || javaInterface.getInterface().trim().length() == 0) {
                        return "Java";
                    } else {
                        return "Inherited (" + javaInterface.getInterface() + ")";
                    }
                } else if (interfaceType instanceof WSDLPortType) {
                    WSDLPortType wsdlInterface = (WSDLPortType) interfaceType;
                    if (wsdlInterface.getInterface() == null || wsdlInterface.getInterface().trim().length() == 0) {
                        return "WSDL";
                    } else {
                        return "Inherited (" + wsdlInterface.getInterface() + ")";
                    }
                } else {
                    return "";
                }
            }
        });
        _listViewer.setContentProvider(new IStructuredContentProvider() {
            public Object[] getElements(Object inputElement) {
                if (inputElement instanceof List<?>) {
                    List<?> v = (List<?>) inputElement;
                    return v.toArray();
                }
                return new Object[0];
            }

            public void dispose() {
            }

            public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            }
        });
        _listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection ssel = (IStructuredSelection) event.getSelection();
                if (!ssel.isEmpty() && ssel.getFirstElement() instanceof Interface) {
                    _interface = (Interface) ssel.getFirstElement();
                    handleModify();
                }

            }
        });
        _listViewer.setInput(typeList);

        setControl(composite);

        validate();
        setErrorMessage(null);
    }

    /**
     * @return interface
     */
    public Interface getInterface() {
        return this._interface;
    }

    private void handleModify() {
        validate();
    }

    private void validate() {
        String errorMessage = null;
        setErrorMessage(errorMessage);
        setPageComplete(errorMessage == null);
    }

    private void getInterfaceTypes(List<Interface> types) {
        Interface javaInterfaceType = ScaFactory.eINSTANCE.createJavaInterface();
        types.add(javaInterfaceType);
        Interface wsdlPortType = ScaFactory.eINSTANCE.createWSDLPortType();
        types.add(wsdlPortType);
        if (_inheritedInterface != null) {
            types.add(_inheritedInterface);
        }
    }

    /**
     * @return inherited interface
     */
    public Interface getInheritedInterface() {
        return _inheritedInterface;
    }

    /**
     * @param inheritedInterface interface from the component service to promote
     */
    public void setInheritedInterface(Interface inheritedInterface) {
        this._inheritedInterface = copyInterface(inheritedInterface);
    }

    private Interface copyInterface(Interface incoming) {
        if (incoming instanceof JavaInterface) {
            JavaInterface oldInterface = (JavaInterface) incoming;
            JavaInterface newInterface = ScaFactory.eINSTANCE.createJavaInterface();
            newInterface.setInterface(oldInterface.getInterface());
            return newInterface;
        } else if (incoming instanceof WSDLPortType) {
            WSDLPortType oldInterface = (WSDLPortType) incoming;
            WSDLPortType newInterface = ScaFactory.eINSTANCE.createWSDLPortType();
            newInterface.setInterface(oldInterface.getInterface());
            return newInterface;
        }
        return null;
    }

    /**
     * @param source Interface 1
     * @param target Interface 2
     * @return true/false are they equal?
     */
    protected boolean interfaceIsEqual(Interface source, Interface target) {
        if (source instanceof JavaInterface && target instanceof JavaInterface) {
            JavaInterface oldInterface = (JavaInterface) source;
            JavaInterface newInterface = (JavaInterface) target;
            if (oldInterface.getInterface() == null || newInterface.getInterface() == null) {
                return false;
            } else if (!oldInterface.getInterface().equals(newInterface.getInterface())) {
                return false;
            }
            return true;
        } else if (source instanceof WSDLPortType && target instanceof WSDLPortType) {
            WSDLPortType oldInterface = (WSDLPortType) source;
            WSDLPortType newInterface = (WSDLPortType) target;
            if (oldInterface.getInterface() == null || newInterface.getInterface() == null) {
                return false;
            } else if (!oldInterface.getInterface().equals(newInterface.getInterface())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
