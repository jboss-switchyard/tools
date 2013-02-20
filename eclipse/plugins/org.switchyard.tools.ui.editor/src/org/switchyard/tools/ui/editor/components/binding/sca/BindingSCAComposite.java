/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.binding.sca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.SCABinding;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;

/**
 * @author bfitzpat
 * 
 */
public class BindingSCAComposite extends AbstractSYBindingComposite  {

    private Composite _panel;
    private SCABinding _binding = null;
    private Button _clusteredCheckbox;
    private Combo _loadBalancingCombo;
    private Text _loadBalancingCustomClassText;
    private Button _browseLoadBalancingClassButton;
    private Text _targetServiceText;
    private Text _targetNamespaceText;
    private TabFolder _tabFolder;
    private List<String> _advancedPropsFilterList;
    private boolean _showConsumer;
    private IJavaProject _project;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof SCABinding) {
            this._binding = (SCABinding) impl;
            setInUpdate(true);
            
            Boolean clusteredValue = (Boolean) getFunkyAttributeValue("clustered");
            if (clusteredValue != null) {
                _clusteredCheckbox.setSelection(clusteredValue.booleanValue());
            }
            
            if (!_showConsumer) {
                 updateProducerControls();
            }

            final Resource resource = MergedModelUtil.getSwitchYard((EObject) getTargetObject()).eResource();
            if (resource.getURI().isPlatformResource()) {
                final IFile file = ResourcesPlugin.getWorkspace().getRoot()
                        .getFile(new Path(resource.getURI().toPlatformString(true)));
                if (file != null) {
                    _project = JavaCore.create(file.getProject());
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

    private void updateProducerControls() {
        if (!_showConsumer) {
            _loadBalancingCombo.setEnabled(_clusteredCheckbox.getSelection());

            String loadBalanceValue = (String) getFunkyAttributeValue("loadBalance");
            if (loadBalanceValue != null && (!(loadBalanceValue.equalsIgnoreCase("RandomStrategy") 
                    || loadBalanceValue.equalsIgnoreCase("RoundRobin") || loadBalanceValue.trim().length() == 0))) {
                // custom class
                setTextValue(_loadBalancingCombo, "Custom Load Balance Strategy");
                _loadBalancingCustomClassText.setEnabled(true);
                setTextValue(_loadBalancingCustomClassText, loadBalanceValue);
            } else {
                if (loadBalanceValue == null) {
                    _loadBalancingCombo.select(0);
                    setTextValue(_loadBalancingCustomClassText, "");
                } else {
                    setTextValue(_loadBalancingCombo, loadBalanceValue);
                    _loadBalancingCustomClassText.setEnabled(false);
                    setTextValue(_loadBalancingCustomClassText, "");
                }
            }
            
            String targetValue = (String) getFunkyAttributeValue("target");
            setTextValue(_targetServiceText, targetValue);
            String targetNamespaceValue = (String) getFunkyAttributeValue("targetNamespace");
            setTextValue(_targetNamespaceText, targetNamespaceValue);

            if (_clusteredCheckbox.getSelection() 
                    && _loadBalancingCombo.getText().equalsIgnoreCase("Custom Load Balance Strategy")) {
                _loadBalancingCustomClassText.setEnabled(true);
            } else {
                _loadBalancingCustomClassText.setEnabled(false);
            }
            _targetServiceText.setEnabled(_clusteredCheckbox.getSelection());
            _targetNamespaceText.setEnabled(_clusteredCheckbox.getSelection());
        }
    }
    
    @Override
    public void setTargetObject(Object target) {
        super.setTargetObject(target);
        if (target instanceof Service) {
            _showConsumer = true;
        }
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        // nothing really to validate
        super.validateTabs();
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
        if (_showConsumer) {
            one.setText("Consumer");
        } else {
            one.setText("Producer");
        }
        one.setControl(getConsumerTabControl(_tabFolder));
        
        addTabs(_tabFolder, false, false);
    }

    private Control getConsumerTabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group clusteringGroup = new Group(composite, SWT.NONE);
        clusteringGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        clusteringGroup.setLayout(new GridLayout(3, false));
        clusteringGroup.setText("Clustering");
        
        _clusteredCheckbox = createCheckbox(clusteringGroup, "Clustered");
        addGridData(_clusteredCheckbox, 3, GridData.FILL_HORIZONTAL);
        
        if (!_showConsumer) {
            _loadBalancingCombo = createLabelAndCombo(clusteringGroup, "Load Balancing", true);
            addGridData(_loadBalancingCombo, 3, GridData.FILL_HORIZONTAL);
            _loadBalancingCombo.removeAll();
            _loadBalancingCombo.add("");
            _loadBalancingCombo.add("RoundRobin");
            _loadBalancingCombo.add("RandomStrategy");
            _loadBalancingCombo.add("Custom Load Balance Strategy");
            
            _loadBalancingCustomClassText = createLabelAndText(clusteringGroup, "Custom Class");

            _browseLoadBalancingClassButton = new Button(clusteringGroup, SWT.PUSH);
            _browseLoadBalancingClassButton.setText("Browse...");
            GridData btnGD = new GridData();
            _browseLoadBalancingClassButton.setLayoutData(btnGD);
            _browseLoadBalancingClassButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    String newClass = handleBrowse(_loadBalancingCustomClassText.getText());
                    if (newClass != null) {
                        _loadBalancingCustomClassText.setText(newClass);
                        setHasChanged(true);
                        handleModify(_loadBalancingCustomClassText);
                        fireChangedEvent(_loadBalancingCustomClassText);
                    }
                }
            });
            
            _targetServiceText = createLabelAndText(clusteringGroup, "Target Service");
            addGridData(_targetServiceText, 3, GridData.FILL_HORIZONTAL);

            _targetNamespaceText = createLabelAndText(clusteringGroup, "Target Namespace");
            addGridData(_targetNamespaceText, 3, GridData.FILL_HORIZONTAL);
        }

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    private class FunkyAttributeBindingOperation extends ModelOperation {

        private Binding _localObject;
        private String _localFeature;
        private Object _localValue;

        /**
         * @param object incoming object
         * @param featureId feature id
         * @param value incoming value
         */
        public FunkyAttributeBindingOperation(Binding object, String featureId, Object value) {
            _localObject = object;
            _localFeature = featureId;
            _localValue = value;
        }

        private void removeFunkyAttributeValue(String propertyName) {
            Iterator<Entry> iter = _localObject.getAnyAttribute().iterator();
            while (iter.hasNext()) {
                Entry entry = iter.next();
                String name = entry.getEStructuralFeature().getName();
                if (name.contentEquals(propertyName)) {
                    _localObject.getAnyAttribute().remove(entry);
                    break;
                }
            }
        }
        
        private void setFunkyAttributeValue(EAttribute attribute, String propertyName, Object propertyValue) {
            Iterator<Entry> iter = _localObject.getAnyAttribute().iterator();
            boolean foundIt = false;
            while (iter.hasNext()) {
                Entry entry = iter.next();
                String name = entry.getEStructuralFeature().getName();
                if (name.contentEquals(propertyName)) {
                    _localObject.getAnyAttribute().add(
                            attribute, propertyValue);
                    foundIt = true;
                    break;
                }
            }
            if (!foundIt) {
                _localObject.getAnyAttribute().add(
                        attribute, propertyValue);
            }
        }

        @Override
        public void run() throws Exception {
            
            if (_localFeature.contentEquals("clustered")) {
                boolean removeAll = false;
                if (_localValue instanceof Boolean) {
                    // if clustered = false, remove all other properties
                    removeAll = !((Boolean)_localValue).booleanValue();
                }
                setFunkyAttributeValue(SwitchyardPackage.eINSTANCE.getDocumentRoot_Clustered(), "clustered", _localValue);
                if (removeAll) {
                    removeFunkyAttributeValue("target");
                    removeFunkyAttributeValue("targetNamespace");
                    removeFunkyAttributeValue("loadBalance");
                }
            } else if (_localFeature.contentEquals("target")) {
                setFunkyAttributeValue(SwitchyardPackage.eINSTANCE.getDocumentRoot_Target(), "target", _localValue);
            } else if (_localFeature.contentEquals("targetNamespace")) {
                setFunkyAttributeValue(SwitchyardPackage.eINSTANCE.getDocumentRoot_TargetNamespace(), "targetNamespace", _localValue);
            } else if (_localFeature.contentEquals("loadBalance")) {
                setFunkyAttributeValue(SwitchyardPackage.eINSTANCE.getDocumentRoot_LoadBalance(), "loadBalance", _localValue);
            }
        }
    }
    
    protected void updateFeature(final Binding eObject, final String featureId, final Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new FunkyAttributeBindingOperation(eObject, featureId, value));
        wrapOperation(ops);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_clusteredCheckbox)) {
            updateFeature(_binding, "clustered", _clusteredCheckbox.getSelection());
        } else if (control.equals(_targetServiceText)) {
            updateFeature(_binding, "target", _targetServiceText.getText().trim());
        } else if (control.equals(_targetNamespaceText)) {
            updateFeature(_binding, "targetNamespace", _targetNamespaceText.getText().trim());
        } else if (control.equals(_loadBalancingCombo)) {
            String value = _loadBalancingCombo.getText().trim();
            if (value.contentEquals("Custom Load Balance Strategy")) {
                value = _loadBalancingCustomClassText.getText().trim();
            }
            updateFeature(_binding, "loadBalance", value);
        } else if (control.equals(_loadBalancingCustomClassText)) {
            String value = _loadBalancingCombo.getText().trim();
            if (value.contentEquals("Custom Load Balance Strategy")) {
                value = _loadBalancingCustomClassText.getText().trim();
            }
            updateFeature(_binding, "loadBalance", value);
        } else {
            super.handleModify(control);
        }
        validate();
        setHasChanged(false);
        setDidSomething(true);
        updateProducerControls();
    }

    private Object getFunkyAttributeValue(String propertyName) {
        Iterator<Entry> iter = this._binding.getAnyAttribute().iterator();
        while (iter.hasNext()) {
            Entry entry = iter.next();
            String name = entry.getEStructuralFeature().getName();
            if (name.contentEquals(propertyName)) {
                if (name.equals("clustered")) {
                    Boolean clusteredValue = (Boolean) entry.getValue();
                    return clusteredValue;
                } else if (name.equals("loadBalance")) {
                    String value = (String) entry.getValue();
                    return value;
                } else if (name.equals("target")) {
                    String value = (String) entry.getValue();
                    return value;
                } else if (name.equals("targetNamespace")) {
                    String value = (String) entry.getValue();
                    return value;
                }
            }
        }
        return null;
    }
    
    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_clusteredCheckbox)) {
                Boolean value = (Boolean) getFunkyAttributeValue("clustered");
                _clusteredCheckbox.setSelection(value.booleanValue());
            } else if (control.equals(_targetServiceText)) {
                String value = (String) getFunkyAttributeValue("target");
                _targetServiceText.setText(value);
            } else if (control.equals(_targetNamespaceText)) {
                String value = (String) getFunkyAttributeValue("targetNamespace");
                _targetNamespaceText.setText(value);
            } else if (control.equals(_loadBalancingCombo) || control.equals(_loadBalancingCustomClassText)) {
                String value = (String) getFunkyAttributeValue("loadBalance");
                if (!(value.equalsIgnoreCase("RoundRobinStrategy") 
                        || value.equalsIgnoreCase("RoundRobin"))) {
                    // custom class
                    setTextValue(_loadBalancingCombo, "Custom Load Balance Strategy");
                    _loadBalancingCustomClassText.setEnabled(true);
                    setTextValue(_loadBalancingCustomClassText, value);
                } else {
                    setTextValue(_loadBalancingCombo, value);
                    _loadBalancingCustomClassText.setEnabled(false);
                    setTextValue(_loadBalancingCustomClassText, "");
                }
            } else {
                super.handleUndo(control);
            }
        }
        updateProducerControls();
        setHasChanged(false);
    }

    @Override
    protected List<String> getAdvancedPropertiesFilterList() {
        return _advancedPropsFilterList;
    }

    @Override
    protected ContextMapperType createContextMapper() {
        return SwitchyardFactory.eINSTANCE.createContextMapperType();
    }

    @Override
    protected MessageComposerType createMessageComposer() {
        return SwitchyardFactory.eINSTANCE.createMessageComposerType();
    }
    
    /**
     * Must be called prior to creating the control.
     * 
     * @param showConsumer true to show consumer details; false to show producer
     *            details.
     */
    public void setShowConsumer(boolean showConsumer) {
        _showConsumer = showConsumer;
    }

    private String handleBrowse(String filter) {
        IJavaSearchScope scope = null;
        if (_project == null) {
            scope = SearchEngine.createWorkspaceScope();
        } else {
            scope = SearchEngine.createJavaSearchScope(new IJavaElement[] {_project });
        }
        try {
            SelectionDialog dialog = JavaUI.createTypeDialog(Display.getCurrent().getActiveShell(), null, scope,
                    IJavaElementSearchConstants.CONSIDER_CLASSES, false, filter.isEmpty() ? "* " : filter);
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
}
