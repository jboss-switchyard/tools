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
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.jca.Connection;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.Processor;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 * 
 */
public class JCABindingOutboundComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private JCABinding _binding = null;
    private Text _nameText;
    private Combo _resourceAdapterText;
    private Text _connectionJNDINameText;
//    private Button _browseResourceAdapterButton;
    private JCAPropertyTable _propsList;
    private Combo _processorMappingTypeCombo;
    private enum ENDPOINT_MAPPING_TYPE {
        JMSPROCESSOR, CCIPROCESSOR
    }

    @Override
    public String getTitle() {
        return Messages.title_jcaBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_jcaBindingDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof JCABinding) {
            this._binding = (JCABinding) impl;
            setInUpdate(true);
            _propsList.setTargetObject(this._binding);
            if (this._binding.getOutboundConnection() != null) {
                JCAOutboundConnection outbound = this._binding.getOutboundConnection();
                if (outbound.getResourceAdapter() != null) {
                    this._resourceAdapterText.setText(outbound.getResourceAdapter().getName());
                } else {
                    _resourceAdapterText.setText("hornetq-ra.rar"); //$NON-NLS-1$
                    handleModify(_resourceAdapterText);
                }
                if (outbound.getConnection() != null) {
                    this._connectionJNDINameText.setText(outbound.getConnection().getJndiName());
                } else {
                    _connectionJNDINameText.setText(""); //$NON-NLS-1$
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
            if (_binding.getName() == null) {
                _nameText.setText(""); //$NON-NLS-1$
            } else {
                _nameText.setText(_binding.getName());
            }
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
            if (_connectionJNDINameText.getText().trim().isEmpty()) {
                setErrorMessage(Messages.error_jndiNameRequired);
            }
        }
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getJCATabControl(_panel);
    }

    private Control getJCATabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);

        _resourceAdapterText = createLabelAndCombo(composite, Messages.label_resourceAdapterArchive, false);
        _resourceAdapterText.add("hornetq-ra.rar"); //$NON-NLS-1$
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

        _connectionJNDINameText = createLabelAndText(composite, Messages.label_jndiName);

        Group outboundInteractionGroup = new Group(composite, SWT.NONE);
        outboundInteractionGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, true, 2, 1));
        outboundInteractionGroup.setLayout(new GridLayout(2, false));
        outboundInteractionGroup.setText(Messages.label_outboundInteractionOptions);

        _processorMappingTypeCombo = createLabelAndCombo(outboundInteractionGroup, Messages.label_endpointMappingType, true);
        _processorMappingTypeCombo.add("JMSProcessor", ENDPOINT_MAPPING_TYPE.JMSPROCESSOR.ordinal()); //$NON-NLS-1$
        _processorMappingTypeCombo.setData("JMSProcessor", ENDPOINT_MAPPING_TYPE.JMSPROCESSOR); //$NON-NLS-1$
        _processorMappingTypeCombo.add("CCIProcessor", ENDPOINT_MAPPING_TYPE.CCIPROCESSOR.ordinal()); //$NON-NLS-1$
        _processorMappingTypeCombo.setData("CCIProcessor", ENDPOINT_MAPPING_TYPE.CCIPROCESSOR); //$NON-NLS-1$

        Group activationPropsGroup = new Group(outboundInteractionGroup, SWT.NONE);
        activationPropsGroup.setText(Messages.label_processorProperties);
        activationPropsGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, true, 3, 1));
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
                setFeatureValue(_binding, "outboundInteraction", interaction); //$NON-NLS-1$
            }
        }
    }
    
    class OutboundConnectionOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getOutboundConnection() == null) {
                JCAOutboundConnection outbound = JcaFactory.eINSTANCE.createJCAOutboundConnection();
                setFeatureValue(_binding, "outboundConnection", outbound); //$NON-NLS-1$
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
                setFeatureValue(_binding.getOutboundConnection(), "resourceAdapter", resAdapter); //$NON-NLS-1$
            }
        }
    }

    class ConnectionOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getOutboundConnection() != null
                    && _binding.getOutboundConnection().getConnection() == null) {
                Connection outConnection = JcaFactory.eINSTANCE.createConnection();
                setFeatureValue(_binding.getOutboundConnection(), "connection", outConnection); //$NON-NLS-1$
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
                    destination = "TestQueue"; //$NON-NLS-1$
                    processorClass = "org.switchyard.component.jca.processor.JMSProcessor"; //$NON-NLS-1$
                    break;
                case CCIPROCESSOR:
                    processorClass = "org.switchyard.component.jca.processor.CCIProcessor"; //$NON-NLS-1$
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
                setFeatureValue(interaction.getProcessor(), "type", processorClass); //$NON-NLS-1$
                
                if (!interaction.getProcessor().getProperty().isEmpty()) {
                    interaction.getProcessor().getProperty().clear();
                }
                if (destination != null) {
                    Property prop = JcaFactory.eINSTANCE.createProperty();
                    prop.setName("destination"); //$NON-NLS-1$
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
        ops.add(new BasicOperation("outboundConnection/resourceAdapter", featureId, value)); //$NON-NLS-1$
        wrapOperation(ops);
    }

    protected void updateOutboundConnectionConnectionFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new OutboundConnectionOp());
        ops.add(new ConnectionOp());
        ops.add(new BasicOperation("outboundConnection/connection", featureId, value)); //$NON-NLS-1$
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
            updateOutboundConnectionResourceAdapterFeature("name", _resourceAdapterText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_connectionJNDINameText)) {
            updateOutboundConnectionConnectionFeature("jndiName", _connectionJNDINameText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_processorMappingTypeCombo)) {
            updateProcessorFeature();
        } else if (control.equals(_nameText)) {
            super.updateFeature(_binding, "name", _nameText.getText().trim()); //$NON-NLS-1$
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
                 } else if (control.equals(_nameText)) {
                     _nameText.setText(_binding.getName() == null ? "" : _binding.getName()); //$NON-NLS-1$
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
        dialog.setInitialPattern("*.jar,*.rar"); //$NON-NLS-1$
        if (dialog.open() == ClasspathResourceSelectionDialog.OK) {
            IResource result = (IResource) dialog.getFirstResult();
            if (result != null) {
                _resourceAdapterText.setText(result.getName());
                return result;
            }
        }
        return null;
    }

}
