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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.ui.editor.Messages;
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
    private Text _nameText;
    private Button _clusteredCheckbox;
    private Combo _loadBalancingCombo;
    private Text _loadBalancingCustomClassText;
    private Button _browseLoadBalancingClassButton;
    private Text _targetServiceText;
    private Text _targetNamespaceText;
    private boolean _showConsumer;
    private IJavaProject _project;

    @Override
    public String getTitle() {
        return Messages.title_scaBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_scaBindingDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof SCABinding) {
            this._binding = (SCABinding) impl;
            setInUpdate(true);
            
            Boolean clusteredValue = (Boolean) getFunkyAttributeValue("clustered"); //$NON-NLS-1$
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
            if (_binding.getName() == null) {
                _nameText.setText(""); //$NON-NLS-1$
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

    private void updateProducerControls() {
        if (!_showConsumer) {
            _loadBalancingCombo.setEnabled(_clusteredCheckbox.getSelection());

            String loadBalanceValue = (String) getFunkyAttributeValue("loadBalance"); //$NON-NLS-1$
            if (loadBalanceValue != null && (!(loadBalanceValue.equalsIgnoreCase("RandomStrategy")  //$NON-NLS-1$
                    || loadBalanceValue.equalsIgnoreCase("RoundRobinStrategy") || loadBalanceValue.trim().length() == 0))) { //$NON-NLS-1$
                // custom class
                setTextValue(_loadBalancingCombo, Messages.constant_customLoadBalanceStrategy);
                _loadBalancingCustomClassText.setEnabled(true);
                _browseLoadBalancingClassButton.setEnabled(true);
                setTextValue(_loadBalancingCustomClassText, loadBalanceValue);
            } else {
                if (loadBalanceValue == null) {
                    _loadBalancingCombo.select(0);
                    setTextValue(_loadBalancingCustomClassText, ""); //$NON-NLS-1$
                } else {
                    setTextValue(_loadBalancingCombo, loadBalanceValue);
                    _loadBalancingCustomClassText.setEnabled(false);
                    _browseLoadBalancingClassButton.setEnabled(false);
                    setTextValue(_loadBalancingCustomClassText, ""); //$NON-NLS-1$
                }
            }
            
            String targetValue = (String) getFunkyAttributeValue("target"); //$NON-NLS-1$
            setTextValue(_targetServiceText, targetValue);
            String targetNamespaceValue = (String) getFunkyAttributeValue("targetNamespace"); //$NON-NLS-1$
            setTextValue(_targetNamespaceText, targetNamespaceValue);

            if (_clusteredCheckbox.getSelection() 
                    && _loadBalancingCombo.getText().equalsIgnoreCase(Messages.constant_customLoadBalanceStrategy)) {
                _loadBalancingCustomClassText.setEnabled(true);
                _browseLoadBalancingClassButton.setEnabled(true);
                
            } else {
                _loadBalancingCustomClassText.setEnabled(false);
                _browseLoadBalancingClassButton.setEnabled(false);
            }
        }
    }
    
    @Override
    public void setTargetObject(EObject target) {
        super.setTargetObject(target);
        if (target instanceof Service) {
            _showConsumer = true;
        }
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());
        getConsumerTabControl(_panel);
    }

    private Control getConsumerTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);

        if (!_showConsumer) {
            _targetServiceText = createLabelAndText(composite, Messages.label_targetService);
            _targetNamespaceText = createLabelAndText(composite, Messages.label_targetNamespace);
        }

        Group clusteringGroup = new Group(composite, SWT.NONE);
        clusteringGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        clusteringGroup.setLayout(new GridLayout(3, false));
        clusteringGroup.setText(Messages.label_clustering);
        
        _clusteredCheckbox = createCheckbox(clusteringGroup, Messages.label_clustered);
        addGridData(_clusteredCheckbox, 3, GridData.FILL_HORIZONTAL);
        
        if (!_showConsumer) {
            _loadBalancingCombo = createLabelAndCombo(clusteringGroup, Messages.label_loadBalancing, true);
            addGridData(_loadBalancingCombo, 2, GridData.FILL_HORIZONTAL);
            _loadBalancingCombo.removeAll();
            _loadBalancingCombo.add(""); //$NON-NLS-1$
            _loadBalancingCombo.add("RoundRobinStrategy"); //$NON-NLS-1$
            _loadBalancingCombo.add("RandomStrategy"); //$NON-NLS-1$
            _loadBalancingCombo.add(Messages.constant_customLoadBalanceStrategy);
            
            _loadBalancingCustomClassText = createLabelAndText(clusteringGroup, Messages.label_customClass);

            _browseLoadBalancingClassButton = new Button(clusteringGroup, SWT.PUSH);
            _browseLoadBalancingClassButton.setText(Messages.button_browse);
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
            
            if (_localFeature.contentEquals("clustered")) { //$NON-NLS-1$
                boolean removeAll = false;
                if (_localValue instanceof Boolean) {
                    // if clustered = false, remove all other properties
                    removeAll = !((Boolean)_localValue).booleanValue();
                }
                setFunkyAttributeValue(SwitchyardPackage.eINSTANCE.getDocumentRoot_Clustered(), "clustered", _localValue); //$NON-NLS-1$
                if (removeAll) {
                    removeFunkyAttributeValue("target"); //$NON-NLS-1$
                    removeFunkyAttributeValue("targetNamespace"); //$NON-NLS-1$
                    removeFunkyAttributeValue("loadBalance"); //$NON-NLS-1$
                }
            } else if (_localFeature.contentEquals("target")) { //$NON-NLS-1$
                setFunkyAttributeValue(SwitchyardPackage.eINSTANCE.getDocumentRoot_Target(), "target", _localValue); //$NON-NLS-1$
            } else if (_localFeature.contentEquals("targetNamespace")) { //$NON-NLS-1$
                setFunkyAttributeValue(SwitchyardPackage.eINSTANCE.getDocumentRoot_TargetNamespace(), "targetNamespace", _localValue); //$NON-NLS-1$
            } else if (_localFeature.contentEquals("loadBalance")) { //$NON-NLS-1$
                setFunkyAttributeValue(SwitchyardPackage.eINSTANCE.getDocumentRoot_LoadBalance(), "loadBalance", _localValue); //$NON-NLS-1$
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
            updateFeature(_binding, "clustered", _clusteredCheckbox.getSelection()); //$NON-NLS-1$
        } else if (control.equals(_targetServiceText)) {
            updateFeature(_binding, "target", _targetServiceText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_targetNamespaceText)) {
            updateFeature(_binding, "targetNamespace", _targetNamespaceText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_loadBalancingCombo)) {
            String value = _loadBalancingCombo.getText().trim();
            if (value.contentEquals(Messages.constant_customLoadBalanceStrategy)) {
                value = _loadBalancingCustomClassText.getText().trim();
                if (value.trim().isEmpty()) {
                    value = "CustomLoadBalanceStrategyClass"; //$NON-NLS-1$
                }
            }
            updateFeature(_binding, "loadBalance", value); //$NON-NLS-1$
        } else if (control.equals(_loadBalancingCustomClassText)) {
            String value = _loadBalancingCombo.getText().trim();
            if (value.contentEquals(Messages.constant_customLoadBalanceStrategy)) {
                value = _loadBalancingCustomClassText.getText().trim();
            }
            updateFeature(_binding, "loadBalance", value); //$NON-NLS-1$
        } else if (control.equals(_nameText)) {
            super.updateFeature(_binding, "name", _nameText.getText().trim()); //$NON-NLS-1$
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
                if (name.equals("clustered")) { //$NON-NLS-1$
                    Boolean clusteredValue = (Boolean) entry.getValue();
                    return clusteredValue;
                } else if (name.equals("loadBalance")) { //$NON-NLS-1$
                    String value = (String) entry.getValue();
                    return value;
                } else if (name.equals("target")) { //$NON-NLS-1$
                    String value = (String) entry.getValue();
                    return value;
                } else if (name.equals("targetNamespace")) { //$NON-NLS-1$
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
                Boolean value = (Boolean) getFunkyAttributeValue("clustered"); //$NON-NLS-1$
                _clusteredCheckbox.setSelection(value.booleanValue());
            } else if (control.equals(_targetServiceText)) {
                String value = (String) getFunkyAttributeValue("target"); //$NON-NLS-1$
                _targetServiceText.setText(value);
            } else if (control.equals(_targetNamespaceText)) {
                String value = (String) getFunkyAttributeValue("targetNamespace"); //$NON-NLS-1$
                _targetNamespaceText.setText(value);
            } else if (control.equals(_loadBalancingCombo) || control.equals(_loadBalancingCustomClassText)) {
                String value = (String) getFunkyAttributeValue("loadBalance"); //$NON-NLS-1$
                if (!(value.equalsIgnoreCase("RoundRobinStrategy"))) { //$NON-NLS-1$
                    // custom class
                    setTextValue(_loadBalancingCombo, Messages.constant_customLoadBalanceStrategy);
                    _loadBalancingCustomClassText.setEnabled(true);
                    setTextValue(_loadBalancingCustomClassText, value);
                } else {
                    setTextValue(_loadBalancingCombo, value);
                    _loadBalancingCustomClassText.setEnabled(false);
                    setTextValue(_loadBalancingCustomClassText, ""); //$NON-NLS-1$
                }
            } else if (control.equals(_nameText)) {
                _nameText.setText(_binding.getName() == null ? "" : _binding.getName()); //$NON-NLS-1$
            } else {
                super.handleUndo(control);
            }
        }
        updateProducerControls();
        setHasChanged(false);
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
}
