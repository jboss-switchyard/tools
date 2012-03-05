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

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.internal.corext.refactoring.StubTypeContext;
import org.eclipse.jdt.internal.corext.refactoring.TypeContextChecker;
import org.eclipse.jdt.internal.corext.util.JavaModelUtil;
import org.eclipse.jdt.internal.ui.dialogs.FilteredTypesSelectionDialog;
import org.eclipse.jdt.internal.ui.dialogs.StatusInfo;
import org.eclipse.jdt.internal.ui.dialogs.TextFieldNavigationHandler;
import org.eclipse.jdt.internal.ui.refactoring.contentassist.CompletionContextRequestor;
import org.eclipse.jdt.internal.ui.refactoring.contentassist.ControlContentAssistHelper;
import org.eclipse.jdt.internal.ui.refactoring.contentassist.JavaTypeCompletionProcessor;
import org.eclipse.jdt.internal.ui.wizards.SuperInterfaceSelectionDialog;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IDialogFieldListener;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IStringButtonAdapter;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.LayoutUtil;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.SelectionButtonDialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.StringButtonDialogField;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

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

    private StringButtonDialogField _serviceInterfaceDialogField;
    private SelectionButtonDialogField _createTestClassButton;
    private StubTypeContext _serviceInterfaceStubTypeContext;
    private StatusInfo _serviceInterfaceStatus;

    /**
     * Create a new NewBeanServiceClassWizardPage.
     */
    public NewBeanServiceClassWizardPage() {
        super(true, NewBeanServiceClassWizardPage.class.getSimpleName());

        setTitle("New Bean Service Class");
        setDescription("Create a new Bean service implementation class.");

        _serviceInterfaceDialogField = new StringButtonDialogField(new IStringButtonAdapter() {
            @Override
            public void changeControlPressed(DialogField field) {
                browseServiceInterface();
            }
        });
        _serviceInterfaceDialogField.setDialogFieldListener(new IDialogFieldListener() {
            @Override
            public void dialogFieldChanged(DialogField field) {
                serviceInterfaceChanged();
                handleFieldChanged(SERVICE_INTERFACE);
            }
        });
        _serviceInterfaceDialogField.setLabelText("Service Interface:");
        _serviceInterfaceDialogField.setButtonLabel("Browse...");

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
        ICompilationUnit cu = (ICompilationUnit) elem.getAncestor(IJavaElement.COMPILATION_UNIT);
        if (cu != null) {
            elem = cu.findPrimaryType();
        }
        initContainerPage(elem);
        initTypePage(elem);
        List<String> superInterfaces = getSuperInterfaces();
        if (superInterfaces.size() > 0) {
            _serviceInterfaceDialogField.setText(superInterfaces.get(0));
            superInterfaces.remove(0);
            setSuperInterfaces(superInterfaces, getPackageFragmentRoot() != null);
        }
        setModifiers(Flags.AccPublic, false);
        if (getTypeName().length() == 0) {
            String simpleServiceInterfaceName = getSimpleServiceInterfaceName();
            if (simpleServiceInterfaceName.length() > 0) {
                setTypeName(simpleServiceInterfaceName + "Impl", true);
            }
        }
        _createTestClassButton.setSelection(true);
        doStatusUpdate();
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
        createServiceInterfaceControls(composite, nColumns);

        DialogField.createEmptySpace(composite);
        _createTestClassButton.doFillIntoGrid(composite, nColumns - 1);
        _createTestClassButton.setEnabled(true);

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
        String serviceInterfaceName = getServiceInterface();
        if (serviceInterfaceName != null && serviceInterfaceName.length() > 0) {
            result.add(0, serviceInterfaceName);
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
        String serviceInterfaceName = getServiceInterface();
        if (serviceInterfaceName != null) {
            interfacesNames.remove(serviceInterfaceName);
        }
        super.setSuperInterfaces(interfacesNames, canBeModified);
    }

    @Override
    protected String constructCUContent(ICompilationUnit cu, String typeContent, String lineDelimiter)
            throws CoreException {
        // add annotations to the basic type.
        return super.constructCUContent(cu, "@Service(" + getSimpleServiceInterfaceName() + ".class)" + typeContent,
                lineDelimiter);
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
    protected void handleFieldChanged(String fieldName) {
        super.handleFieldChanged(fieldName);

        if (fieldName == CONTAINER) {
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
     * @return the selected service interface.
     */
    public String getServiceInterface() {
        return _serviceInterfaceDialogField.getText();
    }

    private void createTestClassChanged() {
        IWizard wizard = getWizard();
        if (wizard != null) {
            wizard.getContainer().updateButtons();
        }
        doStatusUpdate();
    }

    /**
     * TODO: consider allowing the creation of a new interface, including from
     * wsdl or other sources.
     */
    private void browseServiceInterface() {
        IJavaProject project = getJavaProject();
        if (project == null) {
            return;
        }

        IJavaElement[] elements = new IJavaElement[] {project };
        IJavaSearchScope scope = SearchEngine.createJavaSearchScope(elements);

        FilteredTypesSelectionDialog dialog = new FilteredTypesSelectionDialog(getShell(), false, getWizard()
                .getContainer(), scope, IJavaSearchConstants.INTERFACE);
        dialog.setTitle("Service Interface Selection");
        dialog.setMessage("Choose a type:");
        dialog.setInitialPattern(getServiceInterface());

        if (dialog.open() == Window.OK) {
            _serviceInterfaceDialogField.setText(SuperInterfaceSelectionDialog.getNameWithTypeParameters((IType) dialog
                    .getFirstResult()));
            // remove the service interface from the list of interfaces
            setSuperInterfaces(getSuperInterfaces(), getPackageFragmentRoot() != null);
        }
    }

    private void createServiceInterfaceControls(Composite composite, int nColumns) {
        _serviceInterfaceDialogField.doFillIntoGrid(composite, nColumns);
        Text text = _serviceInterfaceDialogField.getTextControl(null);
        LayoutUtil.setWidthHint(text, getMaxFieldWidth());

        JavaTypeCompletionProcessor superClassCompletionProcessor = new JavaTypeCompletionProcessor(false, false, true);
        superClassCompletionProcessor.setCompletionContextRequestor(new CompletionContextRequestor() {
            @Override
            public StubTypeContext getStubTypeContext() {
                return getServiceInterfaceStubTypeContext();
            }
        });

        ControlContentAssistHelper.createTextContentAssistant(text, superClassCompletionProcessor);
        TextFieldNavigationHandler.install(text);
    }

    private void serviceInterfaceChanged() {
        _serviceInterfaceStatus = new StatusInfo();
        IPackageFragmentRoot root = getPackageFragmentRoot();
        _serviceInterfaceDialogField.enableButton(root != null);

        _serviceInterfaceStubTypeContext = null;

        String serviceInterfaceName = getServiceInterface();
        if (serviceInterfaceName.length() == 0) {
            _serviceInterfaceStatus.setError("A service interface must be specified.");
        } else if (root == null) {
            _serviceInterfaceStatus.setError(""); //$NON-NLS-1$
        } else {
            Type type = TypeContextChecker.parseSuperInterface(serviceInterfaceName);
            if (type == null) {
                _serviceInterfaceStatus.setError("Service interface type is invalid.");
            } else if (type instanceof ParameterizedType && !JavaModelUtil.is50OrHigher(root.getJavaProject())) {
                _serviceInterfaceStatus
                        .setError("Service interface cannot be parameterized unless source level is 1.5");
            }
        }
        if (!_serviceInterfaceStatus.isError()) {
            setSuperInterfaces(super.getSuperInterfaces(), true);
        }
    }

    private StubTypeContext getServiceInterfaceStubTypeContext() {
        if (_serviceInterfaceStubTypeContext == null) {
            String typeName = getTypeName();
            if (typeName == null || typeName.length() == 0) {
                typeName = JavaTypeCompletionProcessor.DUMMY_CLASS_NAME;
            }
            _serviceInterfaceStubTypeContext = TypeContextChecker.createSuperInterfaceStubTypeContext(typeName, null,
                    getPackageFragment());
        }
        return _serviceInterfaceStubTypeContext;
    }

    /**
     * @return the simple (unqualified) name for the service interface
     */
    public String getSimpleServiceInterfaceName() {
        String serviceInterfaceName = getServiceInterface();
        int lastDotIndex = serviceInterfaceName.lastIndexOf('.');
        if (lastDotIndex > 0) {
            return serviceInterfaceName.substring(lastDotIndex + 1);
        }
        return serviceInterfaceName;
    }

}
