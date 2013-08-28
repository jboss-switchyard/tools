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
package org.switchyard.tools.ui.wizards;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.ui.explorer.ISwitchYardRootNode;
import org.switchyard.tools.ui.explorer.impl.ComponentReference;
import org.switchyard.tools.ui.explorer.impl.ComponentService;
import org.switchyard.tools.ui.explorer.impl.SwitchYardRootNode;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * Java2WSDLOptionsWizardPage
 * 
 * <p/>
 * Wizard page for collecting options for generating a WSDL from a SwitchYard
 * Java service.
 * 
 * @author Rob Cernich
 */
public class Java2WSDLOptionsWizardPage extends WizardPage {

    private static final String DEFAULT_LOCATION = "http://localhost:8080/%1$s/%2$s"; //$NON-NLS-1$
    private static final String DEFAULT_LOCATION_MATCH = "(^.+?:.*\\/)%1$s$"; //$NON-NLS-1$

    private IStructuredSelection _selection;
    private boolean _isInitialized;
    private IType _serviceInterface;
    private String _serviceName;
    private String _oldServiceName;
    private String _targetNamespace;
    private String _applicationName;
    private String _locationURI = String.format(DEFAULT_LOCATION, "", ""); //$NON-NLS-1$ //$NON-NLS-2$
    private boolean _useImportedSchema;
    private boolean _useWrappedMessages = true;
    private Text _serviceInterfaceText;
    private Text _serviceNameText;
    private Text _targetNamespaceText;
    private Text _locationURIText;
    private Button _useWrappedMessagesCheck;
    private Button _useImportedSchemaCheck;

    /**
     * Create a new Java2WSDLOptionsWizardPage.
     */
    public Java2WSDLOptionsWizardPage() {
        super(Java2WSDLOptionsWizardPage.class.getName());
        setTitle(Messages.Java2WSDLOptionsWizardPage_wizardPageTitle);
        setDescription(Messages.Java2WSDLOptionsWizardPage_wizardPageDescription);
    }

    /**
     * Initializes default values for the page based on the current selection.
     * 
     * @param selection the current selection.
     */
    public void init(IStructuredSelection selection) {
        _selection = selection;
    }

    private void init() {
        if (_selection == null || _selection.isEmpty()) {
            return;
        }
        _isInitialized = true;

        Object obj = _selection.getFirstElement();
        if (obj instanceof IProject) {
            initFromProject((IProject) obj);
        } else if (obj instanceof ISwitchYardRootNode) {
            initFromSwitchYardRoot((ISwitchYardRootNode) obj);
        } else if (obj instanceof ComponentService) {
            initFromComponentService((ComponentService) obj);
        } else if (obj instanceof ComponentReference) {
            initFromComponentReference((ComponentReference) obj);
        } else if (obj instanceof IFile) {
            IFile file = (IFile) obj;
            IJavaElement javaElement = JavaCore.create(file);
            if (javaElement instanceof IType) {
                initFromType((IType) javaElement);
            } else if (javaElement instanceof ICompilationUnit) {
                initFromCU((ICompilationUnit) javaElement);
            } else {
                initFromProject(file.getProject());
            }
        } else if (obj instanceof IResource) {
            initFromProject(((IResource) obj).getProject());
        } else if (obj instanceof IJavaElement) {
            initFromJavaElement((IJavaElement) obj);
        }
    }

    private void initFromJavaElement(IJavaElement javaElement) {
        if (javaElement.getElementType() == IJavaElement.TYPE) {
            initFromType((IType) javaElement);
        } else if (javaElement.getElementType() == IJavaElement.COMPILATION_UNIT) {
            initFromCU((ICompilationUnit) javaElement);
        } else if (javaElement.getJavaProject() != null) {
            initFromProject(javaElement.getJavaProject().getProject());
        }
    }

    private void initFromCU(ICompilationUnit icu) {
        _serviceInterface = icu.findPrimaryType();
        if (_serviceInterface != null) {
            initFromType(_serviceInterface);
        }
    }

    private void initFromType(IType type) {
        _serviceInterface = (IType) type;
        _serviceName = _serviceInterface.getElementName();
        if (_serviceInterface.getJavaProject() != null) {
            initFromProject(_serviceInterface.getJavaProject().getProject());
        }
    }

    private void initFromComponentReference(ComponentReference reference) {
        IJavaProject javaProject = JavaCore.create(reference.getRoot().getProject());
        if (reference.getModel().getInterface() != null && reference.getModel().getInterface().getInterface() != null) {
            try {
                _serviceInterface = javaProject.findType(reference.getModel().getInterface().getInterface());
            } catch (JavaModelException e) {
                e.fillInStackTrace();
            }
        }
        _serviceName = reference.getModel().getName();
        _targetNamespace = reference.getRoot().getTargetNamespace();
        _applicationName = reference.getRoot().getName();
        _locationURI = String.format(DEFAULT_LOCATION, _applicationName, _serviceName);
    }

    private void initFromComponentService(ComponentService service) {
        IJavaProject javaProject = JavaCore.create(service.getRoot().getProject());
        if (service.getModel().getInterface() != null && service.getModel().getInterface().getInterface() != null) {
            try {
                _serviceInterface = javaProject.findType(service.getModel().getInterface().getInterface());
            } catch (JavaModelException e) {
                e.fillInStackTrace();
            }
        }
        _serviceName = service.getModel().getName();
        _targetNamespace = service.getRoot().getTargetNamespace();
        _applicationName = service.getRoot().getName();
        _locationURI = String.format(DEFAULT_LOCATION, _applicationName, _serviceName);
    }

    private void initFromSwitchYardRoot(ISwitchYardRootNode root) {
        _targetNamespace = root.getTargetNamespace();
        _applicationName = root.getName();
        _locationURI = String.format(DEFAULT_LOCATION, _applicationName, ""); //$NON-NLS-1$
    }

    private void initFromProject(final IProject project) {
        try {
            getWizard().getContainer().run(false, false, new IRunnableWithProgress() {
                @Override
                public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                    SwitchYardRootNode switchYardNode = new SwitchYardRootNode(project);
                    switchYardNode.reload(monitor);
                    _targetNamespace = switchYardNode.getTargetNamespace();
                    _applicationName = switchYardNode.getName();
                    _locationURI = String.format(DEFAULT_LOCATION, _applicationName, _serviceName == null ? "" //$NON-NLS-1$
                            : _serviceName);
                }
            });
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }

    @Override
    public void createControl(Composite parent) {
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout(3, false));

        Label label = new Label(contents, SWT.NONE);
        label.setText(Messages.Java2WSDLOptionsWizardPage_labelServiceInterface);
        _serviceInterfaceText = new Text(contents, SWT.READ_ONLY | SWT.BORDER | SWT.SINGLE);
        _serviceInterfaceText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        Button selectType = new Button(contents, SWT.PUSH);
        selectType.setText(Messages.Java2WSDLOptionsWizardPage_labelSelectType);
        selectType.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                try {
                    SelectionDialog dialog = JavaUI
                            .createTypeDialog(getShell(), getWizard().getContainer(), SearchEngine
                                    .createJavaSearchScope(new IJavaElement[] {JavaCore.create(getTargetProject()) }),
                                    IJavaSearchConstants.INTERFACE, false, _serviceInterfaceText.getText());
                    if (dialog.open() == SelectionDialog.OK) {
                        Object[] result = dialog.getResult();
                        if (result.length == 1 && result[0] instanceof IType) {
                            _serviceInterface = (IType) result[0];
                            _serviceInterfaceText.setText(_serviceInterface.getFullyQualifiedName());
                            final String newServiceName = _serviceInterface.getElementName();
                            if (updateDefault(_oldServiceName, newServiceName, _serviceName)) {
                                _serviceNameText.setText(newServiceName);
                            }
                            _oldServiceName = newServiceName;
                        }
                    }
                } catch (JavaModelException e) {
                    e.fillInStackTrace();
                }
            }
        });

        label = new Label(contents, SWT.NONE);
        label.setText(Messages.Java2WSDLOptionsWizardPage_labelServiceName);
        _serviceNameText = new Text(contents, SWT.BORDER | SWT.SINGLE);
        _serviceNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        _serviceNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                final Matcher matcher = Pattern.compile(
                        String.format(DEFAULT_LOCATION_MATCH, _serviceName == null ? "" : _serviceName)).matcher(//$NON-NLS-1$
                        _locationURI);
                _serviceName = _serviceNameText.getText();
                if (matcher.matches()) {
                    _locationURIText.setText(matcher.replaceFirst("$1" + _serviceName)); //$NON-NLS-1$
                }
                validate();
            }
        });

        label = new Label(contents, SWT.NONE);
        label.setText(Messages.Java2WSDLOptionsWizardPage_labelTargetNamespace);
        _targetNamespaceText = new Text(contents, SWT.BORDER | SWT.SINGLE);
        _targetNamespaceText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        _targetNamespaceText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                _targetNamespace = _targetNamespaceText.getText();
                validate();
            }
        });

        // advanced
        label = new Label(contents, SWT.NONE);
        label.setText(Messages.Java2WSDLOptionsWizardPage_labelEndpointURI);
        _locationURIText = new Text(contents, SWT.BORDER | SWT.SINGLE);
        _locationURIText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        _locationURIText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                _locationURI = _locationURIText.getText();
                validate();
            }
        });

        new Label(contents, SWT.NONE);
        _useWrappedMessagesCheck = new Button(contents, SWT.CHECK);
        _useWrappedMessagesCheck.setText(Messages.Java2WSDLOptionsWizardPage_checkboxUseWrappedMessages);
        _useWrappedMessagesCheck.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        _useWrappedMessagesCheck.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                _useWrappedMessages = _useWrappedMessagesCheck.getSelection();
                validate();
            }
        });

        new Label(contents, SWT.NONE);
        _useImportedSchemaCheck = new Button(contents, SWT.CHECK);
        _useImportedSchemaCheck.setText(Messages.Java2WSDLOptionsWizardPage_checkboxUseImportsForGeneratedSchemas);
        _useImportedSchemaCheck.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        _useImportedSchemaCheck.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                _useImportedSchema = _useImportedSchemaCheck.getSelection();
                validate();
            }
        });

        setDefaults();
        setErrorMessage(null);
        setControl(contents);
    }

    /**
     * @return the selected service interface.
     */
    public IType getServiceInterface() {
        return _serviceInterface;
    }

    /**
     * @return the service name.
     */
    public String getServiceName() {
        return _serviceName;
    }

    /**
     * @return the target namespace for the WSDL.
     */
    public String getTargetNamespace() {
        return _targetNamespace;
    }

    /**
     * @return the location URI for the SOAP port.
     */
    public String getLocationURI() {
        return _locationURI;
    }

    /**
     * @return the true if messages should use "wrapped" style.
     */
    public boolean isUseWrappedMessages() {
        return _useWrappedMessages;
    }

    /**
     * @return the true if external schema should be generated.
     */
    public boolean isUseImportedSchema() {
        return _useImportedSchema;
    }

    private IProject getTargetProject() {
        return ((Java2WSDLWizard) getWizard()).getTargetProject();
    }

    private void validate() {
        setErrorMessage(null);
        if (_serviceInterface == null) {
            setErrorMessage(Messages.Java2WSDLOptionsWizardPage_errorMessage_mustSelectServiceInterface);
        } else if (_serviceName == null || _serviceName.length() == 0) {
            setErrorMessage(Messages.Java2WSDLOptionsWizardPage_errorMessage_mustSpecifyServiceName);
        } else if (_serviceName.matches("[^_\\p{Alpha}]")) { //$NON-NLS-1$
            setErrorMessage(Messages.Java2WSDLOptionsWizardPage_errorMessage_serviceNameMustStartWithUnderscoreOrLetter);
        } else if (_serviceName.matches(".*:")) { //$NON-NLS-1$
            setErrorMessage(Messages.Java2WSDLOptionsWizardPage_errorMessage_invalidColonInServiceName);
        } else if (_targetNamespace == null || _targetNamespace.length() == 0) {
            setErrorMessage(Messages.Java2WSDLOptionsWizardPage_errorMessage_mustSpecifyTargetNamespace);
        } else if (_locationURI == null || _locationURI.length() == 0) {
            setErrorMessage(Messages.Java2WSDLOptionsWizardPage_errorMessage_mustSpecifyEndpointURI);
        } else {
            try {
                new URI(_targetNamespace);
            } catch (URISyntaxException e) {
                setErrorMessage(Messages.Java2WSDLOptionsWizardPage_errorMessage_invalidTargetNamespace + e.getReason());
            }
            try {
                new URI(_locationURI);
            } catch (URISyntaxException e) {
                setErrorMessage(Messages.Java2WSDLOptionsWizardPage_errorMessage_invalidEndpoint + e.getReason());
            }
        }
        setPageComplete(getErrorMessage() == null);
    }

    private void setDefaults() {
        init();
        if (_serviceInterface != null) {
            _serviceInterfaceText.setText(_serviceInterface.getFullyQualifiedName());
        }
        if (_serviceName != null) {
            _serviceNameText.setText(_serviceName);
        }
        if (_targetNamespace != null) {
            _targetNamespaceText.setText(_targetNamespace);
        }
        if (_locationURI != null) {
            _locationURIText.setText(_locationURI);
        }
        _useWrappedMessagesCheck.setSelection(_useWrappedMessages);
    }

    @Override
    public void setVisible(boolean visible) {
        if (visible && !_isInitialized) {
            // update defaults
            _selection = new StructuredSelection(getTargetProject());
            setDefaults();
            setErrorMessage(null);
        }
        super.setVisible(visible);
    }

    private boolean updateDefault(String oldValue, String newValue, String currentValue) {
        return currentValue == null
                || currentValue.length() == 0
                || (!currentValue.equals(newValue) && (oldValue == null || oldValue.length() == 0 || currentValue
                        .matches(oldValue)));
    }

}
