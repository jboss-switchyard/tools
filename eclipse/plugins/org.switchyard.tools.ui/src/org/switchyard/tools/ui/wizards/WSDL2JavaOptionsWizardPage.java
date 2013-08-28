/*************************************************************************************
 * Copyright (c) 2013 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.core.runtime.content.IContentTypeManager;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.internal.ui.dialogs.StatusInfo;
import org.eclipse.jdt.internal.ui.dialogs.TextFieldNavigationHandler;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IDialogFieldListener;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IStringButtonAdapter;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.LayoutUtil;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.SelectionButtonDialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.StringButtonDialogField;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;
import org.switchyard.tools.cxf.WSDL2JavaOptions;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.explorer.ISwitchYardNode;
import org.switchyard.tools.ui.i18n.Messages;
import org.switchyard.tools.ui.operations.CreateJavaFromWSDLOperation;

/**
 * WSDL2JavaOptionsWizardPage
 * 
 * <p/>
 * Wizard page for collecting options for generating a Java interface from a
 * WSDL.
 */
@SuppressWarnings("restriction")
public class WSDL2JavaOptionsWizardPage extends NewTypeWizardPage {

    private static final String WSDL_FILE = "WSDL_FILE"; //$NON-NLS-1$

    private IStatus _wsdlFileStatus = Status.OK_STATUS;

    private StringButtonDialogField _wsdlFileDialogField;
    private SelectionButtonDialogField _overwriteCheckField;
    private SelectionButtonDialogField _generateTypesCheckField;
    private SelectionButtonDialogField _wrappedCheckField;

    /**
     * Create a new WSDL2JavaOptionsWizardPage.
     */
    public WSDL2JavaOptionsWizardPage() {
        super(true, WSDL2JavaOptionsWizardPage.class.getName());
        setTitle(Messages.WSDL2JavaOptionsWizardPage_wizardPageTitle);
        setDescription(Messages.WSDL2JavaOptionsWizardPage_wizardPageDescription);

        _wsdlFileDialogField = new StringButtonDialogField(new IStringButtonAdapter() {
            @Override
            public void changeControlPressed(DialogField field) {
                browseWSDL();
            }
        });
        _wsdlFileDialogField.setDialogFieldListener(new IDialogFieldListener() {
            @Override
            public void dialogFieldChanged(DialogField field) {
                handleFieldChanged(WSDL_FILE);
            }
        });
        _wsdlFileDialogField.setLabelText(Messages.WSDL2JavaOptionsWizardPage_labelWSDLFile);
        _wsdlFileDialogField.setButtonLabel(Messages.WSDL2JavaOptionsWizardPage_buttonBrowse);

        _wrappedCheckField = new SelectionButtonDialogField(SWT.CHECK);
        _wrappedCheckField.setLabelText(Messages.WSDL2JavaOptionsWizardPage_checkboxLabelCreateWrapperForMessageParts);

        _generateTypesCheckField = new SelectionButtonDialogField(SWT.CHECK);
        _generateTypesCheckField.setLabelText(Messages.WSDL2JavaOptionsWizardPage_checkboxLabelGenerateParameterAndResultTypes);

        _overwriteCheckField = new SelectionButtonDialogField(SWT.CHECK);
        _overwriteCheckField.setLabelText(Messages.WSDL2JavaOptionsWizardPage_checkboxLabelOverwriteExistingFiles);
    }

    @Override
    public void createType(IProgressMonitor monitor) throws CoreException, InterruptedException {
        final WSDL2JavaOptions options = new WSDL2JavaOptions();
        options.setGenerateTypes(_generateTypesCheckField.isSelected());
        options.setOutputFolder((IContainer) getPackageFragmentRoot().getResource());
        options.setOverwrite(_overwriteCheckField.isSelected());
        options.setTargetPackage(getPackageFragment());
        options.setWrapped(_wrappedCheckField.isSelected());
        options.setWSDLFile(getWSDLFile());

        new CreateJavaFromWSDLOperation(options).run(monitor);
    }

    /**
     * Initializes default values for the page based on the current selection.
     * 
     * @param selection the current selection.
     */
    public void init(IStructuredSelection selection) {
        if (selection == null || selection.isEmpty()) {
            return;
        }
        IJavaElement elem = getInitialJavaElement(selection);
        initContainerPage(elem);
        initTypePage(elem);
        IFile file = (IFile) Platform.getAdapterManager().getAdapter(selection.getFirstElement(), IFile.class);
        if (wsdlFileChanged(file).isOK()) {
            _wsdlFileDialogField.setText(file.getFullPath().toString());
        }
    }

    @Override
    protected IJavaElement getInitialJavaElement(IStructuredSelection selection) {
        if (selection != null && !selection.isEmpty()) {
            final Object obj = selection.getFirstElement();
            if (obj instanceof ISwitchYardNode) {
                return JavaUtil.getInitialJavaElementForResource(((ISwitchYardNode) obj).getRoot().getProject());
            } else if (obj instanceof IJavaElement) {
                return JavaUtil.getInitialPackageForProject(((IJavaElement) obj).getJavaProject());
            } else if (obj instanceof IResource) {
                return JavaUtil.getInitialJavaElementForResource(((IResource) obj).getProject());
            }
        }
        return super.getInitialJavaElement(selection);
    }

    @Override
    public void createControl(Composite parent) {
        initializeDialogUnits(parent);

        int nColumns = 4;

        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout(nColumns, false));

        createContainerControls(contents, nColumns);
        createPackageControls(contents, nColumns);

        createSeparator(contents, nColumns);

        createTypeSelectionControls(contents, nColumns);
        createWrappedControls(contents, nColumns);
        createGenerateTypesControls(contents, nColumns);
        createOverwriteControls(contents, nColumns);

        _generateTypesCheckField.setSelection(true);
        _overwriteCheckField.setSelection(true);

        handleFieldChanged(CONTAINER);
        handleFieldChanged(WSDL_FILE);
        setErrorMessage(null);
        setControl(contents);
    }

    private void createTypeSelectionControls(Composite composite, int nColumns) {
        _wsdlFileDialogField.doFillIntoGrid(composite, nColumns);
        Text text = _wsdlFileDialogField.getTextControl(null);
        LayoutUtil.setWidthHint(text, getMaxFieldWidth());
        LayoutUtil.setHorizontalGrabbing(text);
        TextFieldNavigationHandler.install(text);
    }

    private void createWrappedControls(Composite composite, int nColumns) {
        DialogField.createEmptySpace(composite);
        _wrappedCheckField.doFillIntoGrid(composite, nColumns - 1);
    }

    private void createGenerateTypesControls(Composite composite, int nColumns) {
        DialogField.createEmptySpace(composite);
        _generateTypesCheckField.doFillIntoGrid(composite, nColumns - 1);
    }

    private void createOverwriteControls(Composite composite, int nColumns) {
        DialogField.createEmptySpace(composite);
        _overwriteCheckField.doFillIntoGrid(composite, nColumns - 1);
    }

    @Override
    protected void handleFieldChanged(String fieldName) {
        super.handleFieldChanged(fieldName);
        if (WSDL_FILE.equals(fieldName)) {
            _wsdlFileStatus = wsdlFileChanged(getWSDLFile());
        } else if (PACKAGE.equals(fieldName) && !fPackageStatus.matches(IStatus.ERROR)
                && getPackageFragment().isDefaultPackage()) {
            ((StatusInfo) fPackageStatus).setError(Messages.WSDL2JavaOptionsWizardPage_errorMessage_cannotGenerateIntoDefaultPackage);
        }
        doStatusUpdate();
    }

    private void doStatusUpdate() {
        // status of all used components
        updateStatus(new IStatus[] {fContainerStatus, fPackageStatus, _wsdlFileStatus });
    }

    private void browseWSDL() {
        FilteredResourcesSelectionDialog dialog = new FilteredResourcesSelectionDialog(getShell(), false,
                getWorkspaceRoot(), IResource.FILE) {
            @Override
            protected ItemsFilter createFilter() {
                return new ResourceFilter() {
                    @Override
                    public boolean matchItem(Object item) {
                        IResource resource = (IResource) item;
                        return super.matchItem(item) && "wsdl".equals(resource.getFileExtension()); //$NON-NLS-1$
                    }
                };
            }
        };
        dialog.setInitialPattern("* "); //$NON-NLS-1$
        if (dialog.open() == FilteredResourcesSelectionDialog.OK) {
            Object[] result = dialog.getResult();
            if (result == null || result.length != 1 || !(result[0] instanceof IResource)) {
                return;
            }
            _wsdlFileDialogField.setText(((IResource) result[0]).getFullPath().toString());
        }
    }

    private IFile getWSDLFile() {
        IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(_wsdlFileDialogField.getText());
        if (resource instanceof IFile) {
            return (IFile) resource;
        }
        return null;
    }

    private IStatus wsdlFileChanged(IFile wsdlFile) {
        if (wsdlFile == null || !wsdlFile.exists() || !wsdlFile.isAccessible()) {
            return new Status(Status.ERROR, Activator.PLUGIN_ID, Messages.WSDL2JavaOptionsWizardPage_errorStatus_specifiedWSDLDoesNotExist);
        }
        IContentTypeManager manager = Platform.getContentTypeManager();
        IContentType wsdlType = manager.getContentType("org.eclipse.wst.wsdl.wsdlsource"); //$NON-NLS-1$
        for (IContentType type : manager.findContentTypesFor(wsdlFile.getName())) {
            if (type.isKindOf(wsdlType)) {
                return Status.OK_STATUS;
            }
        }
        return new Status(Status.ERROR, Activator.PLUGIN_ID, Messages.WSDL2JavaOptionsWizardPage_errorStatus_specifiedFileNotAWSDL);
    }

}
