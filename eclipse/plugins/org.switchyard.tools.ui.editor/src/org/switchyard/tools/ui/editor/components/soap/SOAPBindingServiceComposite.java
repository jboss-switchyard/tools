/******************************************************************************* 
 * Copyright (c) 2012-2014 Red Hat, Inc. 
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
package org.switchyard.tools.ui.editor.components.soap;

import java.math.BigInteger;
import java.util.regex.Pattern;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wst.wsdl.Port;
import org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType;
import org.switchyard.tools.models.switchyard1_0.soap.MtomType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;
import org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType;
import org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.WSDLPortSelectionDialog;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.OpenFileUtil;
import org.switchyard.tools.ui.wizards.NewWSDLFileWizard;

/**
 * @author bfitzpat
 * 
 */
public class SOAPBindingServiceComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private Text _nameText;
    private Text _mWSDLURIText;
    private SOAPBindingType _binding = null;
    private Text _mWSDLSocketText;
    private ComboViewer _soapHeadersTypeCombo = null;
    private Text _contextPathText = null;
    private Button _unwrappedPayloadCheckbox = null;
    private Text _portNameText = null;
    private Button _browseBtnWorkspace;
    private Button _browseBtnConfigWorkspace;
    private Link _newWSDLLink;
    private Button _enableMtomCheckbox = null;
    private Button _enableXopExpandCheckbox = null;
    private Button _disableMtomCheckbox =  null;
    private Text _configFileText;
    private Text _configNameText;
    private Text _mtomThresholdText = null;
    private WritableValue _bindingValue;

    /**
     * Create a new SOAPBindingServiceComposite.
     * 
     * @param toolkit the associated form toolkit to use.
     */
    public SOAPBindingServiceComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_soapBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_soapBindingDetails;
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getSOAPTabControl(_panel);

        bindControls(context);
    }

    private Control getSOAPTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(3, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);
        _nameText.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));

        _newWSDLLink = new Link(composite, SWT.NONE);
        String message = Messages.link_wsdlUri;
        _newWSDLLink.setText(message);
        _newWSDLLink.setEnabled(canEdit());
        _newWSDLLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                String oldResult = _mWSDLURIText.getText().trim();
                IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
                IPath wsdlPath = modelFile.getParent().getParent().getProjectRelativePath();
                wsdlPath = wsdlPath.append(oldResult);
                IProject project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
                if (project.exists(wsdlPath)) {
                    IResource wsdlFile = project.findMember(wsdlPath);
                    OpenFileUtil.openFile(wsdlFile);
                } else {
                    String result = getPathToNewWSDL(_panel.getShell(), wsdlPath, openOnCreate());
                    if (result != null) {
                        setTextValueAndNotify(_mWSDLURIText, result, false);
                    }
                }
            }
        });
        _mWSDLURIText = createLabelAndText(composite, null);
        _mWSDLURIText.setEnabled(canEdit());
        _mWSDLURIText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        _browseBtnWorkspace = new Button(composite, SWT.PUSH);
        _browseBtnWorkspace.setText(Messages.button_browse);
        _browseBtnWorkspace.setEnabled(canEdit());
        GridData btnGD = new GridData();
        _browseBtnWorkspace.setLayoutData(btnGD);
        _browseBtnWorkspace.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                String result = selectResourceFromWorkspace(_panel.getShell(), "*.wsdl"); //$NON-NLS-1$
                if (result != null) {
                    setTextValueAndNotify(_mWSDLURIText, result, false);
                }
            }
        });

        _portNameText = createLabelAndText(composite, Messages.label_wsdlPort);
        _portNameText.setEnabled(canEdit());
        GridData pnGD = new GridData(GridData.FILL_HORIZONTAL);
        pnGD.horizontalSpan = 2;
        _portNameText.setLayoutData(pnGD);

        if (getTargetObject() != null && getTargetObject() instanceof Service) {
            _contextPathText = createLabelAndText(composite, Messages.label_contextPath);
            _contextPathText.setEnabled(canEdit());
            GridData cpGD = new GridData(GridData.FILL_HORIZONTAL);
            cpGD.horizontalSpan = 2;
            _contextPathText.setLayoutData(cpGD);

            _mWSDLSocketText = createLabelAndText(composite, Messages.label_serverPort);
            _mWSDLSocketText.setEnabled(canEdit());

            GridData portGD = new GridData(GridData.FILL_HORIZONTAL);
            portGD.horizontalSpan = 2;
            _mWSDLSocketText.setLayoutData(portGD);
        }

        _unwrappedPayloadCheckbox = createCheckbox(composite, Messages.label_unwrappedPayload);
        GridData upChxGD = new GridData(GridData.FILL_HORIZONTAL);
        upChxGD.horizontalSpan = 3;
        _unwrappedPayloadCheckbox.setLayoutData(upChxGD);

        _soapHeadersTypeCombo = createLabelAndComboViewer(composite, Messages.label_soapHeadersType, true);
        GridData cmcGD = new GridData(GridData.FILL_HORIZONTAL);
        cmcGD.horizontalSpan = 2;
        _soapHeadersTypeCombo.getCombo().setLayoutData(cmcGD);
        _soapHeadersTypeCombo.setContentProvider(ArrayContentProvider.getInstance());
        _soapHeadersTypeCombo.setLabelProvider(new LabelProvider());
        _soapHeadersTypeCombo.setInput(SoapHeadersType.values());
        
        Group endpointConfigGroup = new Group(composite, SWT.NONE);
        endpointConfigGroup.setText(Messages.label_endpointConfiguration);
        GridData epGrpGD = new GridData(GridData.FILL_HORIZONTAL);
        epGrpGD.horizontalSpan = 3;
        endpointConfigGroup.setLayoutData(epGrpGD);
        GridLayout groupGridLayout = new GridLayout(3, false);
        groupGridLayout.marginLeft = -5;
        endpointConfigGroup.setLayout(groupGridLayout);
        
        _configFileText = createLabelAndText(endpointConfigGroup,  Messages.label_configFile);
        _configFileText.setEnabled(canEdit());
        _configFileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        _browseBtnConfigWorkspace = new Button(endpointConfigGroup, SWT.PUSH);
        _browseBtnConfigWorkspace.setText(Messages.button_browse);
        _browseBtnConfigWorkspace.setEnabled(canEdit());
        GridData btnConfigGD = new GridData();
        _browseBtnConfigWorkspace.setLayoutData(btnConfigGD);
        _browseBtnConfigWorkspace.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                String result = selectConfigFileWorkspace(_panel.getShell(), "*.xml"); //$NON-NLS-1$
                if (result != null) {
                    setTextValueAndNotify(_configFileText, result, false);
                }
            }
        });

        _configNameText = createLabelAndText(endpointConfigGroup,  Messages.label_configName);
        _configNameText.setEnabled(canEdit());
        GridData cnGD = new GridData(GridData.FILL_HORIZONTAL);
        cnGD.horizontalSpan = 2;
        _configNameText.setLayoutData(cnGD);
        
        addMtomControls(composite);

        return composite;
    }
    
    private void addMtomControls(Composite composite) {
        Group mtomGroup = new Group(composite, SWT.NONE);
        mtomGroup.setText(Messages.label_mtom);
        mtomGroup.setLayout(new GridLayout(4, false));
        GridData epConfigGroupGD = new GridData(GridData.FILL_HORIZONTAL);
        epConfigGroupGD.horizontalSpan = 3;
        epConfigGroupGD.horizontalIndent = -5;
        mtomGroup.setLayoutData(epConfigGroupGD);

        _enableMtomCheckbox = createCheckbox(mtomGroup, Messages.label_enable);
        GridData enableMtomChxGD = new GridData();
        enableMtomChxGD.horizontalSpan = 4;
        _enableMtomCheckbox.setLayoutData(enableMtomChxGD);

        _disableMtomCheckbox = createCheckbox(mtomGroup, Messages.label_temporarilyDisable);
        GridData disableMtomChxGD = new GridData();
        disableMtomChxGD.horizontalIndent = 10;
        _disableMtomCheckbox.setLayoutData(disableMtomChxGD);

        _enableXopExpandCheckbox = createCheckbox(mtomGroup, Messages.label_xopExpand);
        GridData enableXopExpandChxGD = new GridData();
        _enableXopExpandCheckbox.setLayoutData(enableXopExpandChxGD);
        
        _mtomThresholdText = createLabelAndText(mtomGroup, Messages.label_threshold);
        GridData mtomThresholdGD = new GridData(GridData.FILL_HORIZONTAL);
        _mtomThresholdText.setLayoutData(mtomThresholdGD);
    }

    protected void handleModify(Control control) {
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            super.handleUndo(control);
        }
    }

    /**
     * @return panel
     */
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @param switchYardBindingType binding
     */
    public void setBinding(Binding switchYardBindingType) {
        super.setBinding(switchYardBindingType);
        if (switchYardBindingType instanceof SOAPBindingType) {
            setTargetObject(switchYardBindingType.eContainer());
            this._binding = (SOAPBindingType) switchYardBindingType;
            _bindingValue.setValue(_binding);
        } else {
            _bindingValue.setValue(null);
        }
    }

    /**
     * @param shell Shell for dialog
     * @param project java project to use for resolving classpaths
     * @param initialPattern the file type to look for (*.xml, *.wsdl, etc)
     * @return PortType result
     */
    public Port browse(Shell shell, IJavaProject project, String initialPattern) {
        WSDLPortSelectionDialog dialog = new WSDLPortSelectionDialog(shell, project == null ? ResourcesPlugin
                .getWorkspace().getRoot() : project.getProject());
        dialog.setInitialPattern(initialPattern);
        if (dialog.open() == WSDLPortSelectionDialog.OK) {
            Port result = dialog.getSelectedPort();
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    private String selectResourceFromWorkspace(Shell shell, final String extension) {

        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IJavaProject javaProject = null;
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                javaProject = JavaCore.create(modelFile.getProject());
            }
        }
        Port port = browse(shell, javaProject, extension);
        if (port != null) {
            this._portNameText.setText(port.getName());
            IPath filePath = new Path(port.eResource().getURI().toPlatformString(true));
            IResource resource = javaProject.getProject().getWorkspace().getRoot().getFile(filePath);
            filePath = JavaUtil.getJavaPathForResource(resource);
            return filePath.toString();
        }
        return null;
    }

    private String selectConfigFileWorkspace(Shell shell, final String extension) {
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(shell,
                modelFile == null ? ResourcesPlugin.getWorkspace().getRoot() : modelFile.getProject());
        dialog.setInitialPattern(extension);
        if (dialog.open() == SelectionDialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0 && result[0] instanceof IFile) {
                IFile file = (IFile) result[0];
                String filePath = JavaUtil.getJavaPathForResource(file).toString();
                return filePath.toString();
            }
        }
        return null;
    }

    private static String getPathToNewWSDL(final Shell shell, final IPath path, boolean _openWhenFinish) {
        NewWSDLFileWizard newWizard = new NewWSDLFileWizard();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                IJavaProject javaProject = JavaCore.create(modelFile.getProject());
                IPackageFragmentRoot folder = javaProject.getPackageFragmentRoot(modelFile);
                selectionToPass = new StructuredSelection(folder);
            }
        }
        if (path != null) {
            newWizard.setStartingFileName(path.lastSegment());
        }
        newWizard.setOpenOnFinish(_openWhenFinish);
        newWizard.init(PlatformUI.getWorkbench(), selectionToPass);
        WizardDialog dialog = new WizardDialog(shell, newWizard);
        if (dialog.open() == Window.OK) {
            return newWizard.getCreatedFilePath();
        }
        return null;
    }

    private void bindControls(final DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_nameText.getDisplay());

        _bindingValue = new WritableValue(realm, null, SOAPBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "SOAP binding name should not be empty", Status.WARNING)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        /*
         * we also want to bind the name field to the binding name. note that
         * the model to target updater is configured to NEVER update. we want
         * the camel binding name to be the definitive source for this field.
         */
        binding = context.bindValue(SWTObservables.observeText(_nameText, new int[] {SWT.Modify }), ObservablesUtil
                .observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "SOAP binding name should not be empty", Status.WARNING)), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_mWSDLURIText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                SOAPPackage.Literals.SOAP_BINDING_TYPE__WSDL),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(Messages.error_noUri)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_portNameText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                SOAPPackage.Literals.SOAP_BINDING_TYPE__WSDL_PORT),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        bindMessageComposerAndContextMapperControls(context, domain, realm);

        final IObservableValue endpointConfigConfigFile = new WritableValue(realm, null, String.class);
        final IObservableValue endpointConfigConfigName = new WritableValue(realm, null, String.class);

        binding = 
                context.bindValue(SWTObservables.observeText(_configFileText, SWT.Modify), endpointConfigConfigFile,
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = 
                context.bindValue(SWTObservables.observeText(_configNameText, SWT.Modify), endpointConfigConfigName,
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        ComputedValue computedEndpointConfig = new ComputedValue() {
            @Override
            protected Object calculate() {
                final String configFile = (String) endpointConfigConfigFile.getValue();
                final String configName = (String) endpointConfigConfigName.getValue();
                if (configFile != null || configName != null) {
                    final EndpointConfigType endpointConfig = SOAPFactory.eINSTANCE
                            .createEndpointConfigType();
                    endpointConfig.setConfigFile(configFile);
                    endpointConfig.setConfigName(configName);
                    return endpointConfig;
                }
                return null;
            }

            protected void doSetValue(Object value) {
                if (value instanceof EndpointConfigType) {
                    final EndpointConfigType endpointConfig = (EndpointConfigType) value;
                    endpointConfigConfigFile.setValue(endpointConfig.getConfigFile());
                    endpointConfigConfigName.setValue(endpointConfig.getConfigName());
                } else {
                    endpointConfigConfigFile.setValue(null);
                    endpointConfigConfigName.setValue(null);
                }
                getValue();
            }
        };

        // now bind the endpoint config into the binding
        binding = context.bindValue(
                computedEndpointConfig,
                ObservablesUtil.observeDetailValue(domain, _bindingValue, 
                        SOAPPackage.Literals.SOAP_BINDING_TYPE__ENDPOINT_CONFIG));

        bindMtomControls(context, domain, realm);

        if (getTargetObject() != null && getTargetObject() instanceof Service) {
            
            final IObservableValue wsdlSocketValue = SWTObservables.observeText(_mWSDLSocketText, new int[] {SWT.Modify });
            final UpdateValueStrategy wsdlSocketUpdateValueStrategy = new EMFUpdateValueStrategyNullForEmptyString(
                    null, UpdateValueStrategy.POLICY_CONVERT);
            wsdlSocketUpdateValueStrategy.setConverter(new WSDLPortConverter());
            wsdlSocketUpdateValueStrategy.setAfterConvertValidator(
                    new ServerPortValidator("Server Port value must be in the form '1234', ':1234', or 'host:1234' or follow the pattern for escaped properties (i.e. ':${propName}' or '${propName1}:${propName2}')."));
            
            binding = context
                    .bindValue(
                            SWTObservables.observeText(_contextPathText, new int[] {SWT.Modify }),
                            ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                    SOAPPackage.Literals.SOAP_BINDING_TYPE__CONTEXT_PATH),
                            new EMFUpdateValueStrategyNullForEmptyString(
                                    null,
                                    UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
            
            binding = context
                    .bindValue(
                            wsdlSocketValue,
                            ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                    SOAPPackage.Literals.SOAP_BINDING_TYPE__SOCKET_ADDR),
                                    wsdlSocketUpdateValueStrategy, null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
        }
    }
    
    private class WSDLPortConverter extends Converter {
        
        public WSDLPortConverter() {
            super(String.class, String.class);
        }

        @Override
        public Object convert(Object fromObject) {
            if (fromObject == null || ((String) fromObject).trim().isEmpty()) {
                return null;
            }
            String fromString = (String) fromObject;
            Pattern numOnly = Pattern.compile("\\d+");
            if (numOnly.matcher(fromString).matches()) {
                fromString = ":" + fromString;
                return fromString;
            } else {
                return fromString; 
            }
        }
        
    }

    private void bindMessageComposerAndContextMapperControls(final DataBindingContext context, 
            final EditingDomain domain, final Realm realm) {
        final IObservableValue msgComposerUnwrappedValue = new WritableValue(realm, null, Boolean.class);

        org.eclipse.core.databinding.Binding binding = context
                .bindValue(
                        SWTObservables.observeSelection(_unwrappedPayloadCheckbox), msgComposerUnwrappedValue,
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        ComputedValue computedMessageComposer = new ComputedValue() {
            @Override
            protected Object calculate() {
                final Boolean unwrapped = (Boolean) msgComposerUnwrappedValue.getValue();
                if (unwrapped != null) {
                    final MessageComposerType msgComposer = SOAPFactory.eINSTANCE
                            .createMessageComposerType();
                    msgComposer.setUnwrapped(unwrapped.booleanValue());
                    return msgComposer;
                }
                return null;
            }

            protected void doSetValue(Object value) {
                if (value instanceof MessageComposerType) {
                    final MessageComposerType msgComposer = (MessageComposerType) value;
                    msgComposerUnwrappedValue.setValue(new Boolean(msgComposer.isUnwrapped()));
                } else {
                    msgComposerUnwrappedValue.setValue(null);
                }
                getValue();
            }
        };

        // now bind the message composer into the binding
        binding = context.bindValue(
                computedMessageComposer,
                ObservablesUtil.observeDetailValue(domain, _bindingValue, 
                        SOAPPackage.Literals.SOAP_BINDING_TYPE__MESSAGE_COMPOSER));

        final IObservableValue contextMapperSOAPHeaders = new WritableValue(realm, null, SoapHeadersType.class);

        binding = context
                .bindValue(
                        ViewersObservables.observeSingleSelection(_soapHeadersTypeCombo), contextMapperSOAPHeaders,
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        ComputedValue computedContextMapper = new ComputedValue() {
            @Override
            protected Object calculate() {
                final SoapHeadersType soapHeaders = (SoapHeadersType) contextMapperSOAPHeaders.getValue();
                if (soapHeaders != null) {
                    final ContextMapperType ctxMapper = SOAPFactory.eINSTANCE
                            .createContextMapperType();
                    ctxMapper.setSoapHeadersType(soapHeaders);
                    return ctxMapper;
                }
                return null;
            }

            protected void doSetValue(Object value) {
                if (value instanceof ContextMapperType) {
                    final ContextMapperType ctxMapper = (ContextMapperType) value;
                    contextMapperSOAPHeaders.setValue(ctxMapper.getSoapHeadersType());
                } else {
                    contextMapperSOAPHeaders.setValue(null);
                }
                getValue();
            }
        };

        // now bind the context mapper into the binding
        binding = context.bindValue(
                computedContextMapper,
                ObservablesUtil.observeDetailValue(domain, _bindingValue, 
                        SOAPPackage.Literals.SOAP_BINDING_TYPE__CONTEXT_MAPPER));
    }

    private void bindMtomControls(final DataBindingContext context, 
            final EditingDomain domain, final Realm realm) {
        final IObservableValue mtomEnabled = new WritableValue(realm, null, Boolean.class);
        final IObservableValue mtomDisabled = new WritableValue(realm, null, Boolean.class);
        final IObservableValue mtomXopExpand = new WritableValue(realm, null, Boolean.class);
        final IObservableValue mtomThreshold = new WritableValue(realm, null, BigInteger.class);

        org.eclipse.core.databinding.Binding binding = context
                .bindValue(
                        SWTObservables.observeSelection(_enableMtomCheckbox), mtomEnabled,
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_disableMtomCheckbox), mtomDisabled,
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_enableXopExpandCheckbox), mtomXopExpand,
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_mtomThresholdText, SWT.Modify), mtomThreshold,
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        ComputedValue computedMtom = new ComputedValue() {
            @Override
            protected Object calculate() {
                final Boolean enabled = (Boolean) mtomEnabled.getValue();
                final Boolean disabled = (Boolean) mtomDisabled.getValue();
                final Boolean xopExpand = (Boolean) mtomXopExpand.getValue();
                final BigInteger threshold = (BigInteger) mtomThreshold.getValue();
                if (enabled != null && enabled.booleanValue()) {
                    final MtomType mtom = SOAPFactory.eINSTANCE
                            .createMtomType();
                    mtom.setEnabled(disabled);
                    mtom.setXopExpand(xopExpand);
                    mtom.setThreshold(threshold);
                    return mtom;
                }
                return null;
            }
            
            protected void doSetValue(Object value) {
                if (value instanceof MtomType) {
                    final MtomType mtom = (MtomType) value;
                    mtomEnabled.setValue(new Boolean(true));
                    mtomDisabled.setValue(mtom.getEnabled());
                    mtomXopExpand.setValue(mtom.getXopExpand());
                    mtomThreshold.setValue(mtom.getThreshold());
                } else {
                    mtomEnabled.setValue(new Boolean(false));
                    mtomDisabled.setValue(null);
                    mtomXopExpand.setValue(null);
                    mtomThreshold.setValue(null);
                }
                getValue();
            }
        };
        
        mtomEnabled.addChangeListener(new IChangeListener() {
            
            @Override
            public void handleChange(ChangeEvent event) {
                Boolean value = (Boolean) mtomEnabled.getValue();
                _disableMtomCheckbox.setEnabled(value.booleanValue());
                _enableXopExpandCheckbox.setEnabled(value.booleanValue());
                _mtomThresholdText.setEnabled(value.booleanValue());
            }
        });

        // now bind the mtom into the binding
        binding = context.bindValue(
                computedMtom,
                ObservablesUtil.observeDetailValue(domain, _bindingValue, 
                        SOAPPackage.Literals.SOAP_BINDING_TYPE__MTOM));

    }

    /* (non-Javadoc)
     * @see org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite#dispose()
     */
    @Override
    public void dispose() {
        _bindingValue.dispose();
        super.dispose();
    }
}
