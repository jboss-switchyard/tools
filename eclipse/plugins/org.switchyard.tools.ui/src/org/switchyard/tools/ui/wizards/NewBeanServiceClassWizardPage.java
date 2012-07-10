/*************************************************************************************
 * Copyright (c) 2011 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.wizards;

import java.util.EnumSet;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IDialogFieldListener;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.SelectionButtonDialogField;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.config.model.composite.ComponentReferenceModel;
import org.switchyard.config.model.composite.InterfaceModel;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.common.ContractControl;
import org.switchyard.tools.ui.common.InterfaceControl.InterfaceType;
import org.switchyard.tools.ui.explorer.ISwitchYardNode;
import org.switchyard.tools.ui.explorer.impl.ComponentReference;

/**
 * NewBeanServiceClassWizardPage
 * 
 * Create a new Bean service implementation.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class NewBeanServiceClassWizardPage extends NewTypeWizardPage {

    private static final String SERVICE_INTERFACE = "SERVICE_INTERFACE";

    private ContractControl _serviceInterfaceControl;
    private SelectionButtonDialogField _createTestClassButton;
    private IStatus _serviceInterfaceStatus;
    private String _oldTypeName;

    /**
     * Create a new NewBeanServiceClassWizardPage.
     */
    public NewBeanServiceClassWizardPage() {
        super(true, NewBeanServiceClassWizardPage.class.getSimpleName());

        setTitle("New Bean Service Class");
        setDescription("Create a new Bean service implementation class.");

        _serviceInterfaceControl = new ContractControl(ScaPackage.eINSTANCE.getComponentService(), getJavaProject(),
                EnumSet.of(InterfaceType.Java));
        _serviceInterfaceControl.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                handleFieldChanged(SERVICE_INTERFACE);
            }
        });

        _createTestClassButton = new SelectionButtonDialogField(SWT.CHECK);
        _createTestClassButton.setLabelText("Create test class");
        _createTestClassButton.setDialogFieldListener(new IDialogFieldListener() {
            @Override
            public void dialogFieldChanged(DialogField field) {
                createTestClassChanged();
            }
        });
    }

    /**
     * @param selection the current selection
     */
    public void init(IStructuredSelection selection) {
        IJavaElement elem = getInitialJavaElement(selection);
        ICompilationUnit cu = elem == null ? null : (ICompilationUnit) elem.getAncestor(IJavaElement.COMPILATION_UNIT);
        if (cu != null) {
            elem = cu.findPrimaryType();
        }
        initContainerPage(getInitialContainerElement(selection, elem));
        initTypePage(elem);
        List<String> superInterfaces = getSuperInterfaces();
        if (superInterfaces.size() > 0) {
            initServiceInterface(superInterfaces.get(0));
        }
        setModifiers(Flags.AccPublic, false);
        _createTestClassButton.setSelection(false);
        doStatusUpdate();
    }

    /**
     * Forces the bean to implement the specified interface.
     * 
     * @param serviceInterface the service interface type.
     */
    public void forceServiceInterfaceType(ComponentService serviceInterface) {
        if (serviceInterface == null) {
            return;
        }
        _serviceInterfaceControl.init(serviceInterface);
        _serviceInterfaceControl.setEnabled(false);

        serviceInterfaceChanged();
    }

    private void initServiceInterface(String interfaceName) {
        if (interfaceName == null || interfaceName.length() == 0) {
            return;
        }
        JavaInterface javaInterface = ScaFactory.eINSTANCE.createJavaInterface();
        javaInterface.setInterface(interfaceName);
        _serviceInterfaceControl.setInterface(javaInterface);
        serviceInterfaceChanged();
        List<String> superInterfaces = getSuperInterfaces();
        if (superInterfaces != null && superInterfaces.remove(interfaceName)) {
            setSuperInterfaces(superInterfaces, getPackageFragmentRoot() != null);
        }
    }

    @Override
    public void createControl(Composite parent) {
        initializeDialogUnits(parent);

        Composite composite = new Composite(parent, SWT.NONE);
        composite.setFont(parent.getFont());

        int nColumns = 4;

        GridLayout layout = new GridLayout();
        layout.numColumns = nColumns;
        composite.setLayout(layout);

        // pick & choose the wanted UI components

        createContainerControls(composite, nColumns);
        createPackageControls(composite, nColumns);

        createSeparator(composite, nColumns);

        createTypeNameControls(composite, nColumns);
        createSeparator(composite, nColumns);
        createServiceInterfaceControls(composite, nColumns);

        // createSeparator(composite, nColumns);
        // DialogField.createEmptySpace(composite);
        // _createTestClassButton.doFillIntoGrid(composite, nColumns - 1);
        // _createTestClassButton.setEnabled(true);

        createSeparator(composite, nColumns);

        createModifierControls(composite, nColumns);

        createSuperClassControls(composite, nColumns);
        createSuperInterfacesControls(composite, nColumns);

        createSeparator(composite, nColumns);

        createCommentControls(composite, nColumns);
        enableCommentControl(true);

        setControl(composite);

        Dialog.applyDialogFont(composite);
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            setFocus();
        }
    }

    @Override
    public List<String> getSuperInterfaces() {
        // add the service interface to the list
        List<String> result = super.getSuperInterfaces();
        JavaInterface serviceInterface = getServiceInterface();
        if (serviceInterface != null && serviceInterface.getInterface() != null
                && serviceInterface.getInterface().length() > 0) {
            result.add(0, serviceInterface.getInterface());
        }
        return result;
    }

    @Override
    public boolean addSuperInterface(String superInterface) {
        if (superInterface.equals(getServiceInterface())) {
            return false;
        }
        return super.addSuperInterface(superInterface);
    }

    @Override
    public void setSuperInterfaces(List<String> interfacesNames, boolean canBeModified) {
        // remove the service name from the list
        JavaInterface serviceInterface = getServiceInterface();
        if (serviceInterface != null && serviceInterface.getInterface() != null) {
            interfacesNames.remove(serviceInterface.getInterface());
        }
        super.setSuperInterfaces(interfacesNames, canBeModified);
    }

    @Override
    protected String constructCUContent(ICompilationUnit cu, String typeContent, String lineDelimiter)
            throws CoreException {
        // add annotations to the basic type.
        final String simpleServiceInterfaceName = getSimpleServiceInterfaceName(getServiceInterface());
        final String serviceAnnotation;
        if (simpleServiceInterfaceName == null || simpleServiceInterfaceName.equals(getServiceName())) {
            serviceAnnotation = "@Service(" + simpleServiceInterfaceName + ".class)" + lineDelimiter;
        } else {
            serviceAnnotation = "@Service(value=" + simpleServiceInterfaceName + ".class, name=\"" + getServiceName()
                    + "\")" + lineDelimiter;
        }
        return super.constructCUContent(cu, serviceAnnotation + typeContent, lineDelimiter);
    }

    @Override
    protected void createTypeMembers(IType type, ImportsManager imports, IProgressMonitor monitor) throws CoreException {
        createInheritedMethods(type, false, true, imports, new SubProgressMonitor(monitor, 1));

        // add the import for @Service
        imports.addImport("org.switchyard.component.bean.Service");

        if (monitor != null) {
            monitor.done();
        }
    }

    @Override
    protected IJavaElement getInitialJavaElement(IStructuredSelection selection) {
        if (selection != null && !selection.isEmpty() && selection.getFirstElement() instanceof ISwitchYardNode) {
            if (selection.getFirstElement() instanceof ComponentReference) {
                ComponentReference componentReference = (ComponentReference) selection.getFirstElement();
                ComponentReferenceModel reference = (ComponentReferenceModel) componentReference.getModel();
                if (reference.getInterface() != null && InterfaceModel.JAVA.equals(reference.getInterface().getType())) {
                    IResource javaInterface = SwitchYardModelUtils.getAssociatedResource(componentReference.getRoot()
                            .getProject(), reference.getInterface());
                    if (javaInterface != null) {
                        return super.getInitialJavaElement(new StructuredSelection(javaInterface));
                    }
                }
            }
            return JavaUtil.getInitialJavaElementForResource(((ISwitchYardNode) selection.getFirstElement()).getRoot()
                    .getProject());
        }
        return super.getInitialJavaElement(selection);
    }

    private IJavaElement getInitialContainerElement(IStructuredSelection selection, IJavaElement initialElement) {
        if (selection != null && !selection.isEmpty() && selection.getFirstElement() instanceof ISwitchYardNode) {
            ISwitchYardNode switchYardNode = (ISwitchYardNode) selection.getFirstElement();
            if (initialElement == null || initialElement.getJavaProject() == null
                    || !initialElement.getJavaProject().getProject().equals(switchYardNode.getRoot().getProject())) {
                return JavaCore.create(switchYardNode.getRoot().getProject());
            }
        }
        return initialElement;
    }

    @Override
    protected void handleFieldChanged(String fieldName) {
        super.handleFieldChanged(fieldName);

        if (fieldName == SERVICE_INTERFACE) {
            serviceInterfaceChanged();
        } else if (fieldName == CONTAINER) {
            _serviceInterfaceControl.setProject(getJavaProject());
            serviceInterfaceChanged();
        }
        doStatusUpdate();
    }

    /**
     * @param createTestClass true to create service test class.
     */
    public void setCreateTestClass(boolean createTestClass) {
        _createTestClassButton.setSelection(createTestClass);
    }

    /**
     * @return true if the user wishes to create a test class.
     */
    public boolean getCreateTestClass() {
        return _createTestClassButton.isSelected();
    }

    private void doStatusUpdate() {
        // status of all used components
        IStatus[] status = new IStatus[] {fContainerStatus, fPackageStatus, fTypeNameStatus, fModifierStatus,
                fSuperClassStatus, fSuperInterfacesStatus, _serviceInterfaceStatus };

        updateStatus(status);
    }

    /**
     * @return the specified service contract.
     */
    public Contract getServiceContract() {
        return _serviceInterfaceControl.getContract();
    }

    private JavaInterface getServiceInterface() {
        Interface intf = getServiceContract().getInterface();
        if (intf instanceof JavaInterface) {
            return (JavaInterface) intf;
        }
        return null;
    }

    private void createTestClassChanged() {
        IWizard wizard = getWizard();
        if (wizard != null) {
            wizard.getContainer().updateButtons();
        }
        doStatusUpdate();
    }

    private void createServiceInterfaceControls(Composite composite, int nColumns) {
        _serviceInterfaceControl.createControl(composite, nColumns);
    }

    private void serviceInterfaceChanged() {
        _serviceInterfaceControl.setProject(getJavaProject());

        _serviceInterfaceStatus = _serviceInterfaceControl.getStatus();

        setSuperInterfaces(super.getSuperInterfaces(), true);

        String newName = createDefaultClassName();
        if (updateDefault(_oldTypeName, newName, getTypeName())) {
            setTypeName(newName, true);
        }
        _oldTypeName = newName;
    }

    private String getSimpleServiceInterfaceName(Interface serviceInterface) {
        if (serviceInterface == null || !(serviceInterface instanceof JavaInterface)
                || ((JavaInterface) serviceInterface).getInterface() == null) {
            return "";
        }
        String serviceInterfaceName = ((JavaInterface) serviceInterface).getInterface();
        int lastDotIndex = serviceInterfaceName.lastIndexOf('.');
        if (lastDotIndex > 0) {
            return serviceInterfaceName.substring(lastDotIndex + 1);
        }
        return serviceInterfaceName;
    }

    private String getServiceName() {
        return _serviceInterfaceControl.getContract().getName();
    }

    private String createDefaultClassName() {
        String serviceName = getServiceName();
        if (serviceName == null) {
            return "";
        }
        return serviceName + "Bean";
    }

    private boolean updateDefault(String oldValue, String newValue, String currentValue) {
        return currentValue == null
                || currentValue.length() == 0
                || (!currentValue.equals(newValue) && (oldValue == null || oldValue.length() == 0 || oldValue
                        .equals(currentValue)));
    }

}
