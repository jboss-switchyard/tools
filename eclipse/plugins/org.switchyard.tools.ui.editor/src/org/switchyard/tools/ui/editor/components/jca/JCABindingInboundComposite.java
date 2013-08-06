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
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorUtil;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 * 
 */
public class JCABindingInboundComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private JCABinding _binding = null;
//    private Combo _resourceAdapterText;
    private JCAPropertyTable _propsList;
    private Text _nameText;
    private OperationSelectorComposite _opSelectorComposite;
    private AbstractJCABindingComposite _resAdapterComposite;
    private HashMap<IJCAResourceAdapterExtension, AbstractJCABindingComposite> _resAdapterMap;
    private Combo _resourceAdapterTypeCombo;
    private Composite _stackComposite;
    private StackLayout _stackLayout;
    private IJCAResourceAdapterExtension _defaultJCAExtension;

    private String getResourceAdapterPropertyValue(ActivationSpec as, String propertyName) {
        if (as != null && as.getProperty() != null && as.getProperty().size() > 0) {
            Iterator<Property> propIter = as.getProperty().iterator();
            while (propIter.hasNext()) {
                Property current = propIter.next();
                if (current.getName().equals(propertyName)) {
                    return (String) current.getValue();
                }
            }
        }
        return null;
    }
    
    private void swapExtensionComposites(IJCAResourceAdapterExtension extension, boolean updateValues) {
        AbstractJCABindingComposite syComposite;
        if (_resAdapterMap.containsKey(extension)) {
            syComposite = _resAdapterMap.get(extension);
        } else {
            syComposite = (AbstractJCABindingComposite) extension.getComposite(_stackComposite);
            syComposite.createContents(_stackComposite, SWT.NONE);
            _resAdapterMap.put(extension, syComposite);
        }
        if (updateValues) {
            updateInboundConnectionResourceAdapterFeature("name", _defaultJCAExtension.getResourceAdapter());
            updatePropertiesFromPropertyArray(_defaultJCAExtension.getPropertyList());
        }
        _propsList.setSelection(_binding.getInboundConnection().getActivationSpec().getProperty());
        _stackLayout.topControl = syComposite.getPanel();
        _resAdapterComposite = (AbstractJCABindingComposite) syComposite;
        _resAdapterComposite.setBinding(_binding);
        _stackComposite.layout();
        validate();
    }
    
    @Override
    public String getTitle() {
        return "JCA Binding Details";
    }

    @Override
    public String getDescription() {
        return "Specify pertinent details for your JCA Binding. Resource adapters may require unique properties.";
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof JCABinding) {
            this._binding = (JCABinding) impl;
            setInUpdate(true);
            _propsList.setTargetObject(this._binding);
            if (this._binding.getInboundConnection() != null) {
                JCAInboundConnection inbound = this._binding.getInboundConnection();
                if (inbound.getResourceAdapter() != null) {
                    String raName = inbound.getResourceAdapter().getName();
                    String destinationType = 
                            getResourceAdapterPropertyValue(inbound.getActivationSpec(), "destinationType");
                    IJCAResourceAdapterExtension extension = findJCAExtension(raName, destinationType, true, this._binding);
                    if (extension == null) {
                        extension = findJCAExtension(raName, destinationType, false, this._binding);
                    }
                    _resourceAdapterTypeCombo.setText(extension.getDisplayName());
                    swapExtensionComposites(extension, false);
                } else {
                    if (_defaultJCAExtension != null) {
                        String defaultText = _defaultJCAExtension.getDisplayName();
                        for (int i = 0; i < _resourceAdapterTypeCombo.getItems().length; i++) {
                            if (_resourceAdapterTypeCombo.getItem(i).equals(defaultText)) {
                                _resourceAdapterTypeCombo.select(i);
                                swapExtensionComposites(_defaultJCAExtension, true);
                                break;
                            }
                        }
                    }
                }

                if (inbound.getActivationSpec() != null && inbound.getActivationSpec().getProperty().size() > 0) {
                    EList<Property> properties = inbound.getActivationSpec().getProperty();
                    _propsList.setSelection(properties);
                }

                OperationSelectorType opSelector = OperationSelectorUtil.getFirstOperationSelector(this._binding);
                _opSelectorComposite.setBinding(this._binding);
                _opSelectorComposite.setOperation((SwitchYardOperationSelectorType) opSelector);
            }
            if (_binding.getName() == null) {
                _nameText.setText("");
            } else {
                _nameText.setText(_binding.getName());
            }
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    @Override
    public void setTargetObject(EObject target) {
        super.setTargetObject(target);
        if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
            _opSelectorComposite.setTargetObject(target);
        }
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_resAdapterComposite != null && !_resAdapterComposite.validate()) {
               setErrorMessage(_resAdapterComposite.getErrorMessage());
            }
        }
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new GridLayout(1, false));

        _resAdapterMap = new HashMap<IJCAResourceAdapterExtension, AbstractJCABindingComposite>();

        getJCATabControl(_panel).setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        getJCAOperationSelectorTabControl(_panel).setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
    }
    
    private void processJCAExtensionSelection(boolean addChangeListener, boolean updateValues) {
        Combo combo = _resourceAdapterTypeCombo;
        IJCAResourceAdapterExtension extension = 
                (IJCAResourceAdapterExtension) combo.getData(combo.getText());
        AbstractJCABindingComposite syComposite = null;
        if (_resAdapterMap.containsKey(extension)) {
            syComposite = _resAdapterMap.get(extension);
        } else {
            syComposite = (AbstractJCABindingComposite) extension.getComposite(_stackComposite);
            syComposite.createContents(_stackComposite, SWT.NONE);
            _resAdapterMap.put(extension, syComposite);
        }
        if (updateValues) {
            updateInboundConnectionResourceAdapterFeature("name", extension.getResourceAdapter());
            updatePropertiesFromPropertyArray(extension.getPropertyList());
            _propsList.setSelection(_binding.getInboundConnection().getActivationSpec().getProperty());
        }
        _stackLayout.topControl = syComposite.getPanel();
        _resAdapterComposite = (AbstractJCABindingComposite) syComposite;
        _resAdapterComposite.setBinding(getBinding());
        _stackComposite.layout();
        _panel.layout();
        validate();
        
        if (addChangeListener) {
            _resAdapterComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    if (_resAdapterComposite != null && !_resAdapterComposite.validate()) {
                        setErrorMessage(_resAdapterComposite.getErrorMessage());
                    } else {
                        _propsList.setSelection(_binding.getInboundConnection().getActivationSpec().getProperty());
                        validate();
                    }
                    fireChangedEvent(_resAdapterComposite);
                }
            });
        }
    }
    
    private IJCAResourceAdapterExtension findJCAExtension(String raName, String destinationType, boolean findBoth, JCABinding binding) {
        for (int i = 0; i < _resourceAdapterTypeCombo.getItems().length; i++) {
            String itemText = _resourceAdapterTypeCombo.getItem(i);
            IJCAResourceAdapterExtension extension = 
                    (IJCAResourceAdapterExtension) _resourceAdapterTypeCombo.getData(itemText);
            boolean foundRA = extension.getResourceAdapter() != null && extension.getResourceAdapter().equals(raName);
            boolean foundDT = extension.getDestinationType() != null && extension.getDestinationType().equals(destinationType);
            if (findBoth && foundRA && foundDT) {
                return extension;
            } else if (!findBoth) {
                return extension;
            }
        }
        return null;
    }

    private Control getJCATabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);
        
        _nameText = createLabelAndText(composite, "Name");

        Collection<IJCAResourceAdapterExtension> extensions =
                IJCAResourceAdapterExtensionManager.instance().getExtensions();
        _resourceAdapterTypeCombo = createLabelAndCombo(composite, "Resource Adapter Type:", true);
        _defaultJCAExtension = null;
        Iterator<IJCAResourceAdapterExtension> iter = extensions.iterator();
        while (iter.hasNext()) {
            IJCAResourceAdapterExtension extension = iter.next();
            _resourceAdapterTypeCombo.add(extension.getDisplayName());
            _resourceAdapterTypeCombo.setData(extension.getDisplayName(), extension);
            if (extension.isDefault()) {
                _defaultJCAExtension = extension;
            }
        }

        _stackComposite = new Composite(composite, SWT.NONE);
        GridData gd = new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1);
        _stackComposite.setLayoutData(gd);
        _stackLayout = new StackLayout();
        _stackComposite.setLayout(_stackLayout);
        Composite dummy = new Composite(_stackComposite, SWT.NONE);
        _stackLayout.topControl = dummy;
        
        _resourceAdapterTypeCombo.addSelectionListener(new SelectionListener(){

            @Override
            public void widgetSelected(SelectionEvent e) {
                processJCAExtensionSelection(true, true);
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });

        Group activationPropsGroup = new Group(composite, SWT.NONE);
        activationPropsGroup.setText("Activation Properties");
        activationPropsGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
        activationPropsGroup.setLayout(new GridLayout(1, false));

        _propsList = new JCAActivationSpecPropertyTable(activationPropsGroup, SWT.NONE);
        _propsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
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

        return composite;
    }

    private Control getJCAOperationSelectorTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);
        
        _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE);
        _opSelectorComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        _opSelectorComposite.setLayout(new GridLayout(2, false));
        _opSelectorComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                handleModify(_opSelectorComposite);
            }
         });

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

    class ActivationSpecOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInboundConnection() == null) {
                JCAInboundConnection inbound = JcaFactory.eINSTANCE.createJCAInboundConnection();
                setFeatureValue(_binding, "inboundConnection", inbound);
            }
            if (_binding != null && _binding.getInboundConnection().getActivationSpec() == null) {
                ActivationSpec activationSpec = JcaFactory.eINSTANCE.createActivationSpec();
                setFeatureValue(_binding.getInboundConnection(), "activationSpec", activationSpec);
            }
        }
    }
    
    class ResourceAdapterOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInboundConnection() != null
                    && _binding.getInboundConnection().getResourceAdapter() == null) {
                ResourceAdapter resAdapter = JcaFactory.eINSTANCE.createResourceAdapter();
                setFeatureValue(_binding.getInboundConnection(), "resourceAdapter", resAdapter);
            }
        }
    }
    
    class ActivationSpecPropertyOp extends ModelOperation {
        private Property _property;
        public ActivationSpecPropertyOp(Property prop) {
            _property = prop;
        }
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInboundConnection() != null
                    && _binding.getInboundConnection().getActivationSpec() != null 
                    && _binding.getInboundConnection().getActivationSpec().getProperty() != null) {
                EList<Property> props = _binding.getInboundConnection().getActivationSpec().getProperty();
                props.add(_property);
            }
        }
    }

    class ClearActivationSpecPropertiesOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInboundConnection() != null
                    && _binding.getInboundConnection().getActivationSpec() != null 
                    && _binding.getInboundConnection().getActivationSpec().getProperty() != null) {
                EList<Property> props = _binding.getInboundConnection().getActivationSpec().getProperty();
                props.clear();
            }
        }
    }

    protected void updateInboundConnectionFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new InboundConnectionOp());
        ops.add(new BasicOperation("inboundConnection", featureId, value));
        wrapOperation(ops);
    }

    protected void updateInboundConnectionResourceAdapterFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new InboundConnectionOp());
        ops.add(new ResourceAdapterOp());
        ops.add(new BasicOperation("inboundConnection/resourceAdapter", featureId, value));
        wrapOperation(ops);
    }
    
    protected void updatePropertiesFromPropertyArray(Property[] propList) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new ActivationSpecOp());
        ops.add(new ClearActivationSpecPropertiesOp());
        if (propList != null && propList.length > 0) {
            for (int i = 0; i < propList.length; i++) {
                Property property = propList[i];
                ops.add(new ActivationSpecPropertyOp(property));
            }
        }
        wrapOperation(ops);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_opSelectorComposite)) {
            int opType = _opSelectorComposite.getSelectedOperationSelectorType();
            updateOperationSelectorFeature(opType, _opSelectorComposite.getSelectedOperationSelectorValue());
        } else if (control.equals(_nameText)) {
            super.updateFeature(_binding, "name", _nameText.getText().trim());
        } else {
            super.handleModify(control);
        }
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_nameText)) {
                _nameText.setText(_binding.getName() == null ? "" : _binding.getName());
            } else {
                super.handleUndo(control);
            }
        }
    }

}
