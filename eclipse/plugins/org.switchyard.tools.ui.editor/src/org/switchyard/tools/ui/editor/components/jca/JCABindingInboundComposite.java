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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.jca.Endpoint;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.CamelBindingUtil;
import org.switchyard.tools.ui.editor.diagram.binding.CamelOperationSelectorGroupOp;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorOp;
import org.switchyard.tools.ui.editor.diagram.binding.RemoveOperationSelectorOp;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.InterfaceOpsUtil;

/**
 * @author bfitzpat
 * 
 */
public class JCABindingInboundComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private JCABinding _binding = null;
    private Text _resourceAdapterText;
    private Button _browseResourceAdapterButton;
    private JCAPropertyTable _propsList;
    private Combo _endpointMappingTypeCombo;
    private Button _transactedButton;
    private Combo _operationSelectionCombo;
    private TabFolder _tabFolder;
    private List<String> _advancedPropsFilterList;

    private enum ENDPOINT_MAPPING_TYPE {
        JMSENDPOINT, CCIENDPOINT
    }

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
            if (this._binding.getInboundConnection() != null) {
                JCAInboundConnection inbound = this._binding.getInboundConnection();
                if (inbound.getResourceAdapter() != null) {
                    this._resourceAdapterText.setText(inbound.getResourceAdapter().getName());
                }

                if (inbound.getActivationSpec() != null && inbound.getActivationSpec().getProperty().size() > 0) {
                    EList<Property> properties = inbound.getActivationSpec().getProperty();
                    _propsList.setSelection(properties);
                }

                if (_binding.getInboundInteraction() != null) {
                    JCAInboundInteraction interaction = _binding.getInboundInteraction();
                    if (interaction.getEndpoint() != null) {
                        String className = interaction.getEndpoint().getType();
                        className = className.substring(className.lastIndexOf('.') + 1);
                        if (className.equalsIgnoreCase("jmsendpoint")) {
                            _endpointMappingTypeCombo.select(ENDPOINT_MAPPING_TYPE.JMSENDPOINT.ordinal());
                        } else if (className.equalsIgnoreCase("cciendpoint")) {
                            _endpointMappingTypeCombo.select(ENDPOINT_MAPPING_TYPE.CCIENDPOINT.ordinal());
                        }
                    }
                    if (interaction.isTransacted()) {
                        _transactedButton.setSelection(interaction.isTransacted());
                    }
                    populateOperationCombo();
                    String opName = CamelBindingUtil.getOperationNameForStaticOperationSelector(this._binding);
                    if (opName != null) {
                        setTextValue(_operationSelectionCombo, opName);
                    }
                }
            }
            super.setTabsBinding(_binding);
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_resourceAdapterText.getText().trim().isEmpty()) {
                setErrorMessage("Resource adapter name must not be empty.");
            } else if (_endpointMappingTypeCombo.getSelectionIndex() == -1) {
                setErrorMessage("You must select an endpoint mapping type.");
            }
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
        one.setText("JCA Inbound Gateway");
        one.setControl(getJCATabControl(_tabFolder));

        addTabs(_tabFolder);
    }

    private Control getJCATabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group inboundConnectionGroup = new Group(composite, SWT.NONE);
        inboundConnectionGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        inboundConnectionGroup.setLayout(new GridLayout(3, false));
        inboundConnectionGroup.setText("Inbound Connection Options");

        _resourceAdapterText = createLabelAndText(inboundConnectionGroup, "Resource Adapter Archive");
        _browseResourceAdapterButton = new Button(inboundConnectionGroup, SWT.PUSH);
        _browseResourceAdapterButton.setText("Browse...");
        _browseResourceAdapterButton.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
                IJavaProject javaProject = null;
                if (modelFile != null) {
                    if (modelFile.getProject() != null) { //$NON-NLS-1$
                        javaProject = JavaCore.create(modelFile.getProject());
                    }
                }
                IResource result = browse(_panel.getShell(), javaProject);
                if (result != null) {
                    setHasChanged(true);
                    handleModify(_browseResourceAdapterButton);
                    fireChangedEvent(_browseResourceAdapterButton);
                }
            }
        });

        Group activationPropsGroup = new Group(inboundConnectionGroup, SWT.NONE);
        activationPropsGroup.setText("Activation Properties");
        activationPropsGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
        activationPropsGroup.setLayout(new GridLayout(1, false));

        _propsList = new JCAActivationSpecPropertyTable(activationPropsGroup, SWT.NONE);
        _propsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 4));
        _propsList.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (_binding != null && !inUpdate() && hasChanged()) {
                    validate();
                    handleModify(_propsList);
                    fireChangedEvent(_propsList);
                }
            }
        });

        Group inboundInteractionGroup = new Group(composite, SWT.NONE);
        inboundInteractionGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        inboundInteractionGroup.setLayout(new GridLayout(2, false));
        inboundInteractionGroup.setText("Inbound Interaction Options");

        _endpointMappingTypeCombo = createLabelAndCombo(inboundInteractionGroup, "Endpoint Mapping Type", true);
        _endpointMappingTypeCombo.add("JMS Endpoint", ENDPOINT_MAPPING_TYPE.JMSENDPOINT.ordinal());
        _endpointMappingTypeCombo.setData("JMS Endpoint", ENDPOINT_MAPPING_TYPE.JMSENDPOINT);
        _endpointMappingTypeCombo.add("CCI Endpoint", ENDPOINT_MAPPING_TYPE.CCIENDPOINT.ordinal());
        _endpointMappingTypeCombo.setData("CCI Endpoint", ENDPOINT_MAPPING_TYPE.CCIENDPOINT);

        _transactedButton = createCheckbox(inboundInteractionGroup, "Transacted");

        Group opGroup = new Group(inboundInteractionGroup, SWT.NONE);
        GridData opGroupGD = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
        opGroup.setLayoutData(opGroupGD);
        opGroup.setLayout(new GridLayout(2, false));
        opGroup.setText("Inbound Operation Options");
        _operationSelectionCombo = createLabelAndCombo(opGroup, "Operation");
        populateOperationCombo();

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    class InboundConnectionOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInboundConnection() == null) {
                JCAInboundConnection inbound = JcaFactory.eINSTANCE.createJCAInboundConnection();
                setFeatureValue(_binding, "inboundConnection", inbound);
            }
        }
    }

    class InboundInteractionOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInboundInteraction() == null) {
                JCAInboundInteraction interaction = JcaFactory.eINSTANCE.createJCAInboundInteraction();
                setFeatureValue(_binding, "inboundInteraction", interaction);
            }
        }
    }

    private void updateCamelOperationSelectorFeature(String featureId, Object value) {
        if (CamelBindingUtil.getFirstOperationSelector(_binding) != null) {
            OperationSelectorType opSelect = CamelBindingUtil.getFirstOperationSelector(_binding);
            Object oldValue = getFeatureValue(opSelect, featureId);
            // don't do anything if the value is the same
            if (oldValue == null && value == null) {
                return;
            } else if (oldValue != null && oldValue.equals(value)) {
                return;
            } else if (value != null && value.equals(oldValue)) {
                return;
            }
        }
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        if (featureId.equals("operationName") && value instanceof String && ((String)value).trim().isEmpty()) {
            ops.add(new RemoveOperationSelectorOp(this._binding));
        } else {
            ops.add(new CamelOperationSelectorGroupOp(this._binding));
            ops.add(new OperationSelectorOp(this._binding, featureId, value));
        }
        wrapOperation(ops);
    }
    
    class ResourceAdapterOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInboundConnection() != null
                    && _binding.getInboundConnection().getResourceAdapter() == null) {
                ResourceAdapter resAdapter = JcaFactory.eINSTANCE.createResourceAdapter();
                resAdapter.setType("javax.resource.spi.ResourceAdapter");
                setFeatureValue(_binding.getInboundConnection(), "resourceAdapter", resAdapter);
            }
        }
    }

    class EndpointOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            JCAInboundInteraction interaction = _binding.getInboundInteraction();
            ENDPOINT_MAPPING_TYPE type = (ENDPOINT_MAPPING_TYPE) _endpointMappingTypeCombo
                    .getData(_endpointMappingTypeCombo.getText());
            String listener = null;
            // String inboundOpName = null;
            String endpointClass = null;
            boolean foundEndpoint = true;
            switch (type) {
            case JMSENDPOINT:
                listener = "javax.jms.MessageListener";
                // inboundOpName = "onMessage";
                endpointClass = "org.switchyard.component.jca.endpoint.JMSEndpoint";
                break;
            case CCIENDPOINT:
                listener = "javax.resource.cci.MessageListener";
                // inboundOpName = "onMessage";
                endpointClass = "org.switchyard.component.jca.endpoint.CCIEndpoint";
                break;
            default:
                foundEndpoint = false;
                break;
            }

            if (foundEndpoint) {
                interaction.setListener(listener);
                if (interaction.getEndpoint() == null) {
                    Endpoint endpoint = JcaFactory.eINSTANCE.createEndpoint();
                    endpoint.setType(endpointClass);
                    setFeatureValue(interaction, "endpoint", endpoint);
                } else {
                    interaction.getEndpoint().setType(endpointClass);
                }
            }
        }
    }

    protected void updateInboundConnectionFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new InboundConnectionOp());
        ops.add(new BasicOperation("inboundConnection", featureId, value));
        wrapOperation(ops);
    }

    protected void updateInboundInteractionFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new InboundInteractionOp());
        ops.add(new BasicOperation("inboundInteraction", featureId, value));
        wrapOperation(ops);
    }

    protected void updateInboundConnectionResourceAdapterFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new InboundConnectionOp());
        ops.add(new ResourceAdapterOp());
        ops.add(new BasicOperation("inboundConnection/resourceAdapter", featureId, value));
        wrapOperation(ops);
    }

    protected void updateEndpoint() {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new InboundInteractionOp());
        ops.add(new EndpointOp());
        wrapOperation(ops);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_resourceAdapterText) || control.equals(_browseResourceAdapterButton)) {
            updateInboundConnectionResourceAdapterFeature("name", _resourceAdapterText.getText().trim());
        } else if (control.equals(_endpointMappingTypeCombo)) {
            updateEndpoint();
        } else if (control.equals(_transactedButton)) {
            updateInboundInteractionFeature("transacted", Boolean.valueOf(_transactedButton.getSelection()));
        } else if (control.equals(_operationSelectionCombo)) {
            updateCamelOperationSelectorFeature("operationName", _operationSelectionCombo.getText().trim());
        } else {
            super.handleModify(control);
        }
        validate();
        setHasChanged(false);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_resourceAdapterText)) {
                _resourceAdapterText.setText(_binding.getInboundConnection().getResourceAdapter().getName());
            } else if (control.equals(_operationSelectionCombo)) {
                String opName = CamelBindingUtil.getOperationNameForStaticOperationSelector(this._binding);
                setTextValue(_operationSelectionCombo, opName);
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
        ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(shell,
                project == null ? ResourcesPlugin.getWorkspace().getRoot() : project.getProject());
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

    private void populateOperationCombo() {
        if (_operationSelectionCombo != null && !_operationSelectionCombo.isDisposed()) {
            _operationSelectionCombo.removeAll();
            _operationSelectionCombo.clearSelection();

            if (getTargetObject() == null) {
                PictogramElement[] pes = SwitchyardSCAEditor.getActiveEditor().getSelectedPictogramElements();
                if (pes.length > 0) {
                    Object bo = SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider()
                            .getBusinessObjectForPictogramElement(pes[0]);
                    if (bo instanceof Service) {
                        setTargetObject(bo);
                    }
                }
            }
            if (getTargetObject() != null && getTargetObject() instanceof Contract) {
                String[] operations = InterfaceOpsUtil.gatherOperations((Contract) getTargetObject());
                for (int i = 0; i < operations.length; i++) {
                    _operationSelectionCombo.add(operations[i]);
                }
            }
        }
    }

    @Override
    protected List<String> getAdvancedPropertiesFilterList() {
        return _advancedPropsFilterList;
    }

    protected void updateJCAOperationSelectorFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new JCAOperationSelectorOp());
        ops.add(new BasicOperation("operationSelector", featureId, value));
        wrapOperation(ops);
    }

    @Override
    protected ContextMapperType createContextMapper() {
        return JcaFactory.eINSTANCE.createJCAContextMapperType();
    }

    @Override
    protected MessageComposerType createMessageComposer() {
        return JcaFactory.eINSTANCE.createJCAMessageComposerType();
    }
    
    class JCAOperationSelectorOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding.getOperationSelector() == null) {
                setFeatureValue(_binding, "operationSelector", SwitchyardFactory.eINSTANCE.createStaticOperationSelectorType());
            }
        }
    }
}
