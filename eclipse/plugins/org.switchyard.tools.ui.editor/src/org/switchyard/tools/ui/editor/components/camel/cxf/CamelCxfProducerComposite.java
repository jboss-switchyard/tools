/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.camel.cxf;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.CompoundValidator;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.NullElement;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.databinding.URLValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class CamelCxfProducerComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelCxfBindingType _binding = null;
    private Text _nameText;
    private Text _feedURIText;
    private Text _cxfClientUserNameText;
    private Button _relayHeadersCheckbox;
    private Button _wrappedCheckbox;
    private WritableValue _bindingValue;
    private Text _wsdlURLText;
    private Button _browseWSDLButton;
    private ComboViewer _dataFormatComboViewer;
    private Text _serviceClassText;
    private Button _browseServiceClassButton;
    private Text _serviceNameText;
    private Text _portNameText;
    private Text _cxfClientPasswordText;
    private ComboViewer _wrappedStyleComboViewer;
    private IObservableValue _wrappedStyleDetail;
    private Text _defaultOpNameText;
    private Text _defaultOpNamespaceText;

    CamelCxfProducerComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return "CXF Binding";
    }

    @Override
    public String getDescription() {
        return "CXF Binding";
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelCxfBindingType) {
            _binding = (CamelCxfBindingType) impl;

            _bindingValue.setValue(_binding);

            /** UGLY workaround to manage three states (null/Boolean True/Boolean False) for
             *  this particular property. Need to find a better way. Tried ComputedValue, but
             *  couldn't get it to work.
             **/
            if (!_binding.isSetWrappedStyle()) {
                _wrappedStyleComboViewer.getCombo().setText("");
            } else {
                _wrappedStyleComboViewer.setSelection(new StructuredSelection(Boolean.valueOf(_binding.isWrappedStyle())));
            }

        } else {
            _bindingValue.setValue(null);
        }
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getProducerTabControl(_panel);
        
        bindControls(context);
    }

    private Control getProducerTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(3, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name, 2);
        _feedURIText = createLabelAndText(composite, "CXF URI*", 2);
        
        _wsdlURLText = createLabelAndText(composite, "WSDL URL");
        _browseWSDLButton = getToolkit().createButton(composite, "...", SWT.PUSH);
        _browseWSDLButton.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                String result = selectResourceFromWorkspace(_panel.getShell(), "wsdl"); //$NON-NLS-1$
                if (result != null) {
                    setTextValueAndNotify(_wsdlURLText, result, false);
                }
            }
        });
        
        _dataFormatComboViewer = createLabelAndComboViewer(composite, "Data Format", true, 2);
        _dataFormatComboViewer.add(new String[] {"POJO", "PAYLOAD", "MESSAGE"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

        _serviceClassText = createLabelAndText(composite, "Service Class");
        _browseServiceClassButton = getToolkit().createButton(composite, "...", SWT.PUSH);
        _browseServiceClassButton.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                String result = handleBrowse(_serviceClassText.getText());
                if (result != null) {
                    setTextValueAndNotify(_serviceClassText, result, false);
                }
            }
        });

        _serviceNameText = createLabelAndText(composite, "Service Name", 2);
        _portNameText = createLabelAndText(composite, "Port Name", 2);

        _relayHeadersCheckbox = createCheckbox(composite, "Relay Headers", 3);
        _wrappedCheckbox = createCheckbox(composite, "Wrapped", 3);

        _wrappedStyleComboViewer = createLabelAndComboViewer(composite, "Wrapped Style", true, 2);
        _wrappedStyleComboViewer.add(new Object[] {NullElement.getInstance(), Boolean.TRUE, Boolean.FALSE});
        _wrappedStyleComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection ssel = (IStructuredSelection) event.getSelection();
                updateWrappedStyleCombo(ssel.getFirstElement());
            }
        });

        Group clientAuthGroup = new Group(composite, SWT.NONE);
        clientAuthGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 3, 1));
        clientAuthGroup.setLayout(new GridLayout(2, false));
        clientAuthGroup.setText("CXF Client Authentication");
        
        _cxfClientUserNameText = createLabelAndText(clientAuthGroup, "User Name");
        _cxfClientPasswordText = createLabelAndText(clientAuthGroup, "Password");
        _cxfClientPasswordText.setEchoChar('*');

        Group defaultOperationGroup = new Group(composite, SWT.NONE);
        defaultOperationGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 3, 1));
        defaultOperationGroup.setLayout(new GridLayout(2, false));
        defaultOperationGroup.setText("Default Operation");
        _defaultOpNameText = createLabelAndText(defaultOperationGroup, "Name");
        _defaultOpNamespaceText = createLabelAndText(defaultOperationGroup, "Namespace");

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    protected void handleModify(final Control control) {
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            super.handleUndo(control);
        }
    }

    private void bindControls(final DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_nameText.getDisplay());

        _bindingValue = new WritableValue(realm, null, CamelCxfBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "CXF binding name should not be empty", Status.WARNING)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context.bindValue(SWTObservables.observeText(_nameText, new int[] {SWT.Modify }), ObservablesUtil
                .observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "CXF binding name should not be empty", Status.WARNING)), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        CompoundValidator uriValidator = new CompoundValidator(
                new StringEmptyValidator("CXF URI may not be empty."),
                new URLValidator("Potential problem with CXF URI")); 
        binding = context
                .bindValue(
                        SWTObservables.observeText(_feedURIText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                               CxfPackage.Literals.CAMEL_CXF_BINDING_TYPE__CXF_URI),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                                .setAfterConvertValidator(uriValidator), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_wsdlURLText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                               CxfPackage.Literals.CAMEL_CXF_BINDING_TYPE__WSDL_URL),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
        
        IObservableValue dataFormatModelValue = ObservablesUtil.observeDetailValue(domain, _bindingValue,
                CxfPackage.Literals.CAMEL_CXF_BINDING_TYPE__DATA_FORMAT);
        binding = context
                .bindValue(
                        ViewersObservables.observeSingleSelection(_dataFormatComboViewer),
                        dataFormatModelValue,
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
        
        final IObservableValue relayHeaders = ObservablesUtil.observeDetailValue(domain, _bindingValue,
                CxfPackage.Literals.CAMEL_CXF_BINDING_TYPE__RELAY_HEADERS);
        
        dataFormatModelValue.addValueChangeListener(new IValueChangeListener(){
            @Override
            public void handleValueChange(ValueChangeEvent event) {
                Object value = event.getObservableValue().getValue();
                if (value != null && value instanceof String) {
                    String strValue = (String) value;
                    boolean isPojo = strValue.equalsIgnoreCase("POJO"); //$NON-NLS-1$ 
                    _relayHeadersCheckbox.setEnabled(isPojo);
                    if (isPojo) {
                        relayHeaders.setValue(Boolean.TRUE); // default to true
                    } else {
                        relayHeaders.setValue(Boolean.FALSE);
                    }
                }
            }
        });
        
        binding = context
                .bindValue(
                        SWTObservables.observeText(_serviceClassText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                               CxfPackage.Literals.CAMEL_CXF_BINDING_TYPE__SERVICE_CLASS),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_serviceNameText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                               CxfPackage.Literals.CAMEL_CXF_BINDING_TYPE__SERVICE_NAME),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_portNameText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                               CxfPackage.Literals.CAMEL_CXF_BINDING_TYPE__PORT_NAME),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_relayHeadersCheckbox),
                        relayHeaders,
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_wrappedCheckbox),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                CxfPackage.Literals.CAMEL_CXF_BINDING_TYPE__WRAPPED),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        _wrappedStyleDetail = ObservablesUtil.observeDetailValue(domain, _bindingValue,
                CxfPackage.Literals.CAMEL_CXF_BINDING_TYPE__WRAPPED_STYLE);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_cxfClientPasswordText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                               CxfPackage.Literals.CAMEL_CXF_BINDING_TYPE__PASSWORD),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
        
        binding = context
                .bindValue(
                        SWTObservables.observeText(_cxfClientUserNameText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                               CxfPackage.Literals.CAMEL_CXF_BINDING_TYPE__USERNAME),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_defaultOpNameText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                               CxfPackage.Literals.CAMEL_CXF_BINDING_TYPE__DEFAULT_OPERATION_NAME),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_defaultOpNamespaceText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                               CxfPackage.Literals.CAMEL_CXF_BINDING_TYPE__DEFAULT_OPERATION_NAMESPACE),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
    }

    /* (non-Javadoc)
     * @see org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite#dispose()
     */
    @Override
    public void dispose() {
        _bindingValue.dispose();
        super.dispose();
    }

    private String selectResourceFromWorkspace(Shell shell, final String extension) {
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IJavaProject javaProject = null;
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                javaProject = JavaCore.create(modelFile.getProject());
            }
        }
        ClasspathResourceSelectionDialog dialog = null;
        if (javaProject == null) {
            dialog = new ClasspathResourceSelectionDialog(shell, ResourcesPlugin.getWorkspace().getRoot(), extension);
        } else {
            dialog = new ClasspathResourceSelectionDialog(shell, javaProject.getProject(), extension); 
        }
        dialog.setTitle("Select WSDL from Project");
        dialog.setInitialPattern("*." + extension); //$NON-NLS-1$
        dialog.open();
        Object[] result = dialog.getResult();
        if (result == null || result.length == 0 || !(result[0] instanceof IResource)) {
            return null;
        }
        return JavaUtil.getJavaPathForResource((IResource) result[0]).toString();
    }

    private String handleBrowse(String initialSelection) {
        IJavaSearchScope scope = null;
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IJavaProject javaProject = null;
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                javaProject = JavaCore.create(modelFile.getProject());
            }
        }
        if (javaProject == null) {
            scope = SearchEngine.createWorkspaceScope();
        } else {
            scope = SearchEngine.createJavaSearchScope(new IJavaElement[] {javaProject });
        }
        try {
            String filter = initialSelection;
            SelectionDialog dialog = JavaUI.createTypeDialog(Display.getCurrent().getActiveShell(), null, scope,
                    IJavaElementSearchConstants.CONSIDER_CLASSES, false, filter.isEmpty() ? "* " : filter); //$NON-NLS-1$
            if (dialog.open() == SelectionDialog.OK) {
                Object[] result = dialog.getResult();
                if (result.length > 0 && result[0] instanceof IType) {
                    return ((IType) result[0]).getFullyQualifiedName();
                }
            }
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private void updateWrappedStyleCombo(Object value) {
        if (value instanceof NullElement) {
            _binding.unsetWrappedStyle();
        } else if (value instanceof Boolean) {
            _wrappedStyleDetail.setValue(value);
        }
    }
}
