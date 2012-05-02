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
package org.switchyard.tools.ui.editor.diagram.componentreference.wizards;

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
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddComponentReferenceStartPage extends BaseWizardPage {

    private Text _componentReferenceNameText;
    private String _componentReferenceName = null;
    private ListViewer _listViewer;
    private Interface _interface = null;

    /**
     * List width in characters.
     */
    private final static int LIST_WIDTH = 60;

    /**
     * List height in characters.
     */
    private final static int LIST_HEIGHT = 10;

    /**
     * @param pageName page name
     */
    protected SCADiagramAddComponentReferenceStartPage(String pageName) {
        super(pageName);
        setTitle("Create a New Component Reference");
        setDescription("Specify the name and interface details for the new component reference.");
    }

    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout gl = new GridLayout();
        gl.numColumns = 2;
        composite.setLayout(gl);
        // Component service name
        new Label(composite, SWT.NONE).setText("Name:");
        _componentReferenceNameText = new Text(composite, SWT.BORDER);
        _componentReferenceNameText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                handleModify();
            }
        });

        _componentReferenceNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

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
                    return "Java";
                } else if (interfaceType instanceof WSDLPortType) {
                    return "WSDL";
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
     * @return component reference name
     */
    public String getComponentReferenceName() {
        return this._componentReferenceName;
    }

    /**
     * @return interface
     */
    public Interface getInterface() {
        return this._interface;
    }

    private void handleModify() {
        _componentReferenceName = _componentReferenceNameText.getText().trim();
        validate();
    }

    private void validate() {
        String errorMessage = null;
        String cpName = _componentReferenceNameText.getText();

        if (cpName == null || cpName.trim().length() == 0) {
            errorMessage = "No name specified";
        } else if (cpName.trim().length() < cpName.length()) {
            errorMessage = "No spaces allowed in name";
        }
        setErrorMessage(errorMessage);
        setPageComplete(errorMessage == null);
    }

    private void getInterfaceTypes(List<Interface> types) {
        Interface javaInterfaceType = ScaFactory.eINSTANCE.createJavaInterface();
        ((JavaInterface) javaInterfaceType).setInterface("uno.dos.tres");
        types.add(javaInterfaceType);
        Interface wsdlPortType = ScaFactory.eINSTANCE.createWSDLPortType();
        ((WSDLPortType) wsdlPortType).setInterface("http://wwww.someserver.com/mywsdl.wsdl");
        types.add(wsdlPortType);
    }

    // private void getImplementationTypes ( List<Implementation> types ) {
    //
    // Implementation beanImplementation =
    // BeanFactory.eINSTANCE.createBeanImplementationType();
    // types.add(beanImplementation);
    //
    // Implementation soapImplementation =
    // SOAPFactory.eINSTANCE.createSOAPBindingType().eClass();
    // types.add(soapImplementation);
    //
    // EClass implementationTypeEClass = null;
    // EList<EClass> superTypes =
    // BeanFactory.eINSTANCE.createBeanImplementationType().eClass().getEAllSuperTypes();
    // for (EClass eClass : superTypes) {
    // if (eClass.getName().contentEquals(Implementation.class.getSimpleName()))
    // {
    // implementationTypeEClass = eClass;
    // break;
    // }
    // }
    // for (EClassifier eclassifier :
    // implementationTypeEClass.getEPackage().getEClassifiers() ) {
    // if (eclassifier instanceof EClass) {
    // EClass eclass = (EClass)eclassifier;
    // if (eclass.getESuperTypes().contains(implementationTypeEClass)) {
    // types.add(eclass);
    // }
    // }
    // }
    // }

}
