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
package org.switchyard.tools.ui.editor.components.jca;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.jca.Connection;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.Processor;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 * 
 */
public class JCABindingOutboundComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private JCABinding _binding = null;
    private Combo _resourceAdapterText;
    private Text _connectionJNDINameText;
//    private Button _browseResourceAdapterButton;
    private JCAPropertyTable _propsList;
    private Combo _processorMappingTypeCombo;
    private enum ENDPOINT_MAPPING_TYPE {
        JMSPROCESSOR, CCIPROCESSOR
    }
    private TabFolder _tabFolder;
//    private List<String> _advancedPropsFilterList;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof JCABinding) {
            this._binding = (JCABinding) impl;
            setInUpdate(true);
            _propsList.setTargetObject(this._binding);
            if (this._binding.getOutboundConnection() != null) {
                JCAOutboundConnection outbound = this._binding.getOutboundConnection();
                if (outbound.getResourceAdapter() != null) {
                    this._resourceAdapterText.setText(outbound.getResourceAdapter().getName());
                } else {
                    _resourceAdapterText.setText("hornetq-ra.rar");
                    handleModify(_resourceAdapterText);
                }
                if (outbound.getConnection() != null) {
                    this._connectionJNDINameText.setText(outbound.getConnection().getJndiName());
                } else {
                    _connectionJNDINameText.setText("");
                }

                if (_binding.getOutboundInteraction() != null) {
                    JCAOutboundInteraction interaction = _binding.getOutboundInteraction();
                    if (interaction.getProcessor() != null) {
                        String className = interaction.getProcessor().getType();
                        className = className.substring(className.lastIndexOf('.') + 1);
                        _processorMappingTypeCombo.setText(className);
                        
                        EList<Property> properties = interaction.getProcessor().getProperty();
                        _propsList.setSelection(properties);
                    }
                }
            }
            super.setTabsBinding(_binding);
            setInUpdate(false);
        } else {
            this._binding = null;
        }
        validate();
        addObservableListeners();
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            super.validateTabs();
        }
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }
        _tabFolder = new TabFolder(_panel, SWT.NONE);

        TabItem one = new TabItem(_tabFolder, SWT.NONE);
        one.setText("JCA Outbound Binding");
        one.setControl(getJCATabControl(_tabFolder));

        addTabs(_tabFolder);
    }

    private Control getJCATabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group outboundConnectionGroup = new Group(composite, SWT.NONE);
        outboundConnectionGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        outboundConnectionGroup.setLayout(new GridLayout(2, false));
        outboundConnectionGroup.setText("Outbound Connection Options");

        _resourceAdapterText = createLabelAndCombo(outboundConnectionGroup, "Resource Adapter Archive", false);
        _resourceAdapterText.add("hornetq-ra.rar");
//        _browseResourceAdapterButton = new Button(outboundConnectionGroup, SWT.PUSH);
//        _browseResourceAdapterButton.setText("Browse...");
//        _browseResourceAdapterButton.addSelectionListener(new SelectionAdapter() {
//            public void widgetSelected(final SelectionEvent e) {
//                IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
//                IJavaProject javaProject = null;
//                if (modelFile != null) {
//                    if (modelFile.getProject() != null) { //$NON-NLS-1$
//                        javaProject = JavaCore.create(modelFile.getProject());
//                    }
//                }
//                IResource result = browse(_panel.getShell(), javaProject);
//                if (result != null) {
//                    setHasChanged(true);
//                    handleModify(_browseResourceAdapterButton);
//                    fireChangedEvent(_browseResourceAdapterButton);
//                }
//            }
//        });

        _connectionJNDINameText = createLabelAndText(outboundConnectionGroup, "JNDI Name");

        Group outboundInteractionGroup = new Group(composite, SWT.NONE);
        outboundInteractionGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        outboundInteractionGroup.setLayout(new GridLayout(2, false));
        outboundInteractionGroup.setText("Outbound Interaction Options");

        _processorMappingTypeCombo = createLabelAndCombo(outboundInteractionGroup, "Endpoint Mapping Type", true);
        _processorMappingTypeCombo.add("JMSProcessor", ENDPOINT_MAPPING_TYPE.JMSPROCESSOR.ordinal());
        _processorMappingTypeCombo.setData("JMSProcessor", ENDPOINT_MAPPING_TYPE.JMSPROCESSOR);
        _processorMappingTypeCombo.add("CCIProcessor", ENDPOINT_MAPPING_TYPE.CCIPROCESSOR.ordinal());
        _processorMappingTypeCombo.setData("CCIProcessor", ENDPOINT_MAPPING_TYPE.CCIPROCESSOR);

        Group activationPropsGroup = new Group(outboundInteractionGroup, SWT.NONE);
        activationPropsGroup.setText("Processor Properties");
        activationPropsGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
        activationPropsGroup.setLayout(new GridLayout(1, false));

        _propsList = new JCAProcessorPropertyTable(activationPropsGroup, SWT.NONE);
        _propsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 4));
        _propsList.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                if (!inUpdate() && hasChanged()) {
                    validate();
                    handleModify(_propsList);
                    fireChangedEvent(_propsList);
                }
            }
        });

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    class OutboundInteractionOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getOutboundInteraction() == null) {
                JCAOutboundInteraction interaction = JcaFactory.eINSTANCE.createJCAOutboundInteraction();
                setFeatureValue(_binding, "outboundInteraction", interaction);
            }
        }
    }
    
    class OutboundConnectionOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getOutboundConnection() == null) {
                JCAOutboundConnection outbound = JcaFactory.eINSTANCE.createJCAOutboundConnection();
                setFeatureValue(_binding, "outboundConnection", outbound);
            }
        }
    }

    class ResourceAdapterOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getOutboundConnection() != null
                    && _binding.getOutboundConnection().getResourceAdapter() == null) {
                ResourceAdapter resAdapter = JcaFactory.eINSTANCE.createResourceAdapter();
//                resAdapter.setType("javax.resource.spi.ResourceAdapter");
                setFeatureValue(_binding.getOutboundConnection(), "resourceAdapter", resAdapter);
            }
        }
    }

    class ConnectionOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getOutboundConnection() != null
                    && _binding.getOutboundConnection().getConnection() == null) {
                Connection outConnection = JcaFactory.eINSTANCE.createConnection();
                setFeatureValue(_binding.getOutboundConnection(), "connection", outConnection);
            }
        }
    }
    
    class UpdateProcessorOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            JCAOutboundInteraction interaction = _binding.getOutboundInteraction();
            ENDPOINT_MAPPING_TYPE type = (ENDPOINT_MAPPING_TYPE) _processorMappingTypeCombo.getData(_processorMappingTypeCombo.getText());
            String destination = null;
            String processorClass = null;
            boolean foundProcessor = true;
            switch (type) {
                case JMSPROCESSOR:
                    destination = "TestQueue";
                    processorClass = "org.switchyard.component.jca.processor.JMSProcessor";
                    break;
                case CCIPROCESSOR:
                    processorClass = "org.switchyard.component.jca.processor.CCIProcessor";
                    break;
                default:
                    foundProcessor = false;
                    break;
            }
            
            if (foundProcessor) {
                if (interaction.getProcessor() == null) {
                    Processor processor = JcaFactory.eINSTANCE.createProcessor();
                    interaction.setProcessor(processor);
                }
                setFeatureValue(interaction.getProcessor(), "type", processorClass);
                
                if (!interaction.getProcessor().getProperty().isEmpty()) {
                    interaction.getProcessor().getProperty().clear();
                }
                if (destination != null) {
                    Property prop = JcaFactory.eINSTANCE.createProperty();
                    prop.setName("destination");
                    prop.setValue(destination);
                    interaction.getProcessor().getProperty().add(prop);
                }
                
                EList<Property> properties = interaction.getProcessor().getProperty();
                _propsList.setSelection(properties);
            }
        }
    }

    protected void updateOutboundConnectionResourceAdapterFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new OutboundConnectionOp());
        ops.add(new ResourceAdapterOp());
        ops.add(new BasicOperation("outboundConnection/resourceAdapter", featureId, value));
        wrapOperation(ops);
    }

    protected void updateOutboundConnectionConnectionFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new OutboundConnectionOp());
        ops.add(new ConnectionOp());
        ops.add(new BasicOperation("outboundConnection/connection", featureId, value));
        wrapOperation(ops);
    }
    
    protected void updateProcessorFeature() {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new OutboundInteractionOp());
        ops.add(new UpdateProcessorOp());
        wrapOperation(ops);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_resourceAdapterText) /*|| control.equals(_browseResourceAdapterButton) */) {
            updateOutboundConnectionResourceAdapterFeature("name", _resourceAdapterText.getText().trim());
        } else if (control.equals(_connectionJNDINameText)) {
            updateOutboundConnectionConnectionFeature("jndiName", _connectionJNDINameText.getText().trim());
        } else if (control.equals(_processorMappingTypeCombo)) {
            updateProcessorFeature();
        } else {
            super.handleModify(control);
        }
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (_binding != null) {
                 if (control.equals(_resourceAdapterText)) {
                     _resourceAdapterText.setText(_binding.getInboundConnection().getResourceAdapter().getName());
                }
            } else {
                super.handleUndo(control);
            }
        }
    }

    /**
     * @param shell Shell for dialog
     * @param project java project to use for resolving classpaths
     * @return PortType result
     */
    public IResource browse(Shell shell, IJavaProject project) {
        ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(shell, project == null ? ResourcesPlugin
                .getWorkspace().getRoot() : project.getProject());
        dialog.setInitialPattern("*.jar,*.rar");
        if (dialog.open() == ClasspathResourceSelectionDialog.OK) {
            IResource result = (IResource) dialog.getFirstResult();
            if (result != null) {
                _resourceAdapterText.setText(result.getName());
                return result;
            }
        }
        return null;
    }

    @Override
    protected List<String> getAdvancedPropertiesFilterList() {
        return null;
//        if (_advancedPropsFilterList == null) {
//            _advancedPropsFilterList = new ArrayList<String>();
//            _advancedPropsFilterList.add("jndiURL");
//            _advancedPropsFilterList.add("initialContextFactory");
//            _advancedPropsFilterList.add("resAuth");
//            _advancedPropsFilterList.add("managed");
//        }
//        return _advancedPropsFilterList;
    }

    @Override
    protected ContextMapperType createContextMapper() {
        return JcaFactory.eINSTANCE.createJCAContextMapperType();
    }

    @Override
    protected MessageComposerType createMessageComposer() {
        return JcaFactory.eINSTANCE.createJCAMessageComposerType();
    }
    
}
