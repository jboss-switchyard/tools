/*************************************************************************************
 * Copyright (c) 2012-2014 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.transform;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.TransformFactory;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * NewTransformWizardPage
 * 
 * </p> Wizard page for creating a new Java class with transformation methods.
 */
public class NewAdHocTransformWizardPage extends WizardPage implements ITransformProvider.IContainer {

    private TransformDetails _details;
    private IProject _project;
    private ComboViewer _transformProviderList;
    private ITransformProvider _selectedProvider;
    private ITransformControl _activeControl;
    private Map<ITransformProvider, ITransformControl> _providerControls = new HashMap<ITransformProvider, ITransformControl>();
    private Map<ITransformProvider, INewTransformWizard> _providerWizards = new HashMap<ITransformProvider, INewTransformWizard>();
    private Collection<TransformType> _newTransforms;
    private ComboViewer _fromCombo;
    private ComboViewer _toCombo;

    /**
     * Create a new NewTransformWizardPage.
     */
    public NewAdHocTransformWizardPage() {
        super(NewAdHocTransformWizardPage.class.getCanonicalName());
        setTitle("New Transformer");
        setDescription("Create transformers for the selected transform pair.");
    }

    /**
     * @param details the set of transformers.
     */
    public void init(TransformDetails details) {
        _details = details;
        _project = PlatformResourceAdapterFactory.getContainingProject(details.getSwitchYard());
        validate(null);
    }
    
    private void handleComboSelection() {
        if (_activeControl == null) {
            INewTransformWizard providerWizard = _providerWizards.get(_selectedProvider);
            if (providerWizard != null) {
                providerWizard.setSelectedTransforms(getSelectedTransforms());
            }
        } else {
            _activeControl.setSelectedTransforms(getSelectedTransforms());
        }
        validate(null);
    }

    @Override
    public void createControl(Composite parent) {
        initializeDialogUnits(parent);

        Composite content = new Composite(parent, SWT.NONE);
        content.setFont(parent.getFont());
        content.setLayout(new GridLayout(2, false));

        final Label fromLabel = new Label(content, SWT.NONE);
        fromLabel.setText("From Type");
        fromLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false));
        
        final Label toLabel = new Label(content, SWT.NONE);
        toLabel.setText("To Type");
        toLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false));
        
        _fromCombo = new ComboViewer(content, SWT.DROP_DOWN);
        _fromCombo.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
        _fromCombo.setContentProvider(new TransformDetailsContentProvider());
        _fromCombo.setLabelProvider(new TransformTypeFromLabelProvider());
        _fromCombo.addSelectionChangedListener(new ISelectionChangedListener() {
            
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                handleComboSelection();
            }
        });
        
        _fromCombo.getCombo().addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                handleComboSelection();
                validate(null);
            }
        });
        
        _toCombo = new ComboViewer(content, SWT.DROP_DOWN);
        _toCombo.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
        _toCombo.setContentProvider(new TransformDetailsContentProvider());
        _toCombo.setLabelProvider(new TransformTypeToLabelProvider());
        _toCombo.addSelectionChangedListener(new ISelectionChangedListener() {
            
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                handleComboSelection();
            }
        });
        
        _toCombo.getCombo().addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                handleComboSelection();
                validate(null);
            }
        });

        final Label separator = new Label(content, SWT.SEPARATOR | SWT.HORIZONTAL);
        separator.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
        ((GridData) separator.getLayoutData()).heightHint = 20;

        final Label transformTypeLabel = new Label(content, SWT.NONE);
        transformTypeLabel.setText(Messages.label_transformerType);

        _transformProviderList = new ComboViewer(content);
        _transformProviderList.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        _transformProviderList.setContentProvider(ArrayContentProvider.getInstance());
        _transformProviderList.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return ((ITransformProvider) element).getName();
            }
        });
        _transformProviderList.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                if (_activeControl != null) {
                    _activeControl.setVisible(false);
                }
                if (event.getSelection().isEmpty()) {
                    _activeControl = null;
                    _selectedProvider = null;
                } else {
                    _selectedProvider = (ITransformProvider) ((IStructuredSelection) event.getSelection())
                            .getFirstElement();
                    if (!_selectedProvider.providesWizard()) {
                        _activeControl = _providerControls.get(_selectedProvider);
                        if (_activeControl != null) {
                            _activeControl.setSelectedTransforms(getSelectedTransforms());
                            _activeControl.setVisible(true);
                        }
                    } else {
                        _activeControl = null;
                    }
                }
                validate(null);
                if (getWizard().getContainer().getCurrentPage() != null) {
                    getWizard().getContainer().updateButtons();
                }
            }
        });

        Composite providers = new Composite(content, SWT.NONE);
        providers.setLayout(new FormLayout());
        providers.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
        for (ITransformProvider provider : TransformProviderRegistry.instance().getProviders()) {
            if (provider.providesWizard()) {
                continue;
            }
            ITransformControl providerControl = provider.createTransformControl(providers, this);
            FormData formData = new FormData();
            formData.top = new FormAttachment(0);
            formData.bottom = new FormAttachment(100);
            formData.left = new FormAttachment(0);
            formData.right = new FormAttachment(100);
            providerControl.setLayoutData(formData);
            providerControl.setVisible(false);
            _providerControls.put(provider, providerControl);
        }

        setControl(content);

        Dialog.applyDialogFont(content);

        initControls();
        validate(null);
        setErrorMessage(null);
    }

    @Override
    public void dispose() {
        for (ITransformControl control : _providerControls.values()) {
            if (control != null) {
                try {
                    control.dispose();
                } catch (Exception e) {
                    e.fillInStackTrace();
                }
            }
        }
        for (INewTransformWizard wizard : _providerWizards.values()) {
            if (wizard != null) {
                try {
                    wizard.dispose();
                } catch (Exception e) {
                    e.fillInStackTrace();
                }
            }
        }
        super.dispose();
    }

    @Override
    public IRunnableContext getContext() {
        return getWizard().getContainer();
    }

    @Override
    public void updateStatus(ITransformControl control, IStatus status) {
        if (control != _activeControl) {
            return;
        }
        validate(status);
    }

    @Override
    public IProject getContainingProject() {
        return _project;
    }

    /**
     * Creates the new transformers.
     * 
     * @return true if successfully finished.
     */
    public boolean performFinish() {
        if (_activeControl != null) {
            try {
                _newTransforms = _activeControl.createTransforms();
            } catch (CoreException e) {
                Activator.logStatus(e.getStatus());
            }
        }
        return true;
    }

    /**
     * @return the transforms created by this wizard.
     */
    public Collection<TransformType> getCreatedTransforms() {
        if (_activeControl == null) {
            INewTransformWizard providerWizard = _providerWizards.get(_selectedProvider);
            return providerWizard.getCreatedTransforms();
        }
        return _newTransforms;
    }

    private void initControls() {
        _fromCombo.setInput(_details);
        _toCombo.setInput(_details);

        List<ITransformProvider> providers = TransformProviderRegistry.instance().getProviders();
        _transformProviderList.setInput(providers);
        if (providers.size() > 0) {
            _transformProviderList.setSelection(new StructuredSelection(providers.get(0)), true);
        }
    }

    private String typeIsValid(String value) {
        String javaStart = "java:";
        String nsPattern = "^\\{.*\\}";
        Pattern pattern = Pattern.compile(nsPattern);
        Matcher matcher = pattern.matcher(value);
        if (value.startsWith(javaStart)) {
            // we have a java type
            String className = value.replace(javaStart, "");
            if (!(isValidClassOnClasspath(className))) {
                return "Java class '" + className + "' cannot be found in the project classpath";
            }
            return null;
        } else if (matcher.find()) {
            // we have a ns-prefixed type 
            return null;
        } else {
            // we have a problem
            return "Value must specify a Java type (java:class.name) or a namespaced type ({namespace}simpletype).";
        }
        
        // null = valid
    }
    
    private void validate(IStatus status) {
        setMessage(null);
        setErrorMessage(null);
        
        if (_fromCombo != null && _toCombo != null && (_fromCombo.getCombo().getText().isEmpty() || _toCombo.getCombo().getText().isEmpty())) {
            setErrorMessage("You must specify an input and an output for the new transformer.");
        } else if (_fromCombo != null && _toCombo != null) {
            String fromType = _fromCombo.getCombo().getText();
            String fromValidMsg = typeIsValid(fromType);
            if (fromValidMsg != null) {
                setErrorMessage("From type: " + fromValidMsg);
            }
            String toType = _toCombo.getCombo().getText();
            String toValidMsg = typeIsValid(toType);
            if (toValidMsg != null) {
                setErrorMessage("To type: " + toValidMsg);
            }
        } else {
            if (status == null && _selectedProvider != null && !_selectedProvider.providesWizard()) {
                status = _activeControl.validate();
            }
            if (status != null && !status.isOK()) {
                switch (status.getSeverity()) {
                case IStatus.INFO:
                    setMessage(status.getMessage(), INFORMATION);
                    break;
                case IStatus.WARNING:
                    setMessage(status.getMessage(), WARNING);
                    break;
                default: // error or cancel?
                    setErrorMessage(status.getMessage());
                }
            }
        }
        
        setPageComplete(getErrorMessage() == null);
    }
    
    private boolean isValidClassOnClasspath(String className) {
        IJavaProject javaProject = JavaCore.create(SwitchyardSCAEditor.getActiveEditor()
                .getTargetModelFile().getProject());
        IType testClass;
        try {
            testClass = javaProject.findType(className);
        } catch (JavaModelException e) {
            // can't find class
            testClass = null;
        }
        if (testClass != null) {
            return true;
        }
        return false;
    }
    

    protected INewTransformWizard getNextWizard() {
        if (_selectedProvider == null || !_selectedProvider.providesWizard()) {
            return null;
        }
        INewTransformWizard providerWizard = _providerWizards.get(_selectedProvider);
        if (providerWizard == null) {
            providerWizard = _selectedProvider.createWizard();
            providerWizard.init(_project);
            providerWizard.setSelectedTransforms(getSelectedTransforms());
            providerWizard.addPages();
            _providerWizards.put(_selectedProvider, providerWizard);
        }
        return providerWizard;
    }

    private Collection<TransformType> getSelectedTransforms() {
        if (_fromCombo.getCombo().getText().isEmpty() || _toCombo.getCombo().getText().isEmpty()) {
            return Collections.emptyList();
        }

        final ArrayList<TransformType> transforms = new ArrayList<TransformType>(1);

        // grab the types
        String fromType = _fromCombo.getCombo().getText();
        String toType = _toCombo.getCombo().getText();
        
        // use the JAXB transform type as an intermediary
        JAXBTransformType newTransform = TransformFactory.eINSTANCE.createJAXBTransformType();
        newTransform.setTo(toType);
        newTransform.setFrom(fromType);
        
        transforms.add(newTransform);
        
        return transforms;
    }

    private static final class TransformDetailsContentProvider implements IStructuredContentProvider {

        @Override
        public void dispose() {
        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }

        @Override
        public Object[] getElements(Object inputElement) {
            return ((TransformDetails) inputElement).getRequiredTransforms().toArray();
        }

    }

    private static final class TransformTypeToLabelProvider extends LabelProvider implements IBaseLabelProvider {

        /* (non-Javadoc)
         * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
         */
        @Override
        public String getText(Object element) {
            final QName qname = QName.valueOf(((TransformType) element).getTo());
            return qname.toString();
        }
    }

    private static final class TransformTypeFromLabelProvider extends LabelProvider implements IBaseLabelProvider {

        /* (non-Javadoc)
         * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
         */
        @Override
        public String getText(Object element) {
            final QName qname = QName.valueOf(((TransformType) element).getFrom());
            return qname.toString();
        }
    }
}
