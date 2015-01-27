/******************************************************************************* 
 * Copyright (c) 2013-2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.binding.sca;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.SCABinding;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.jms.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
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
    private Button _preferLocalCheckbox;
    private ComboViewer _loadBalancingCombo;
    private Text _loadBalancingCustomClassText;
    private Button _browseLoadBalancingClassButton;
    private Text _targetServiceText;
    private Text _targetNamespaceText;
    private boolean _showConsumer;
    private IJavaProject _project;
    private WritableValue _bindingValue;

    BindingSCAComposite(FormToolkit toolkit) {
        super(toolkit);
    }

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
            _bindingValue.setValue(_binding);
            final Resource resource = MergedModelUtil.getSwitchYard((EObject) getTargetObject()).eResource();
            if (resource.getURI().isPlatformResource()) {
                final IFile file = ResourcesPlugin.getWorkspace().getRoot()
                        .getFile(new Path(resource.getURI().toPlatformString(true)));
                if (file != null) {
                    _project = JavaCore.create(file.getProject());
                }
            }
        } else {
            _bindingValue.setValue(null);
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
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = getToolkit().createComposite(parent, style);
        _panel.setLayout(new FillLayout());
        getConsumerTabControl(_panel, context);
        bindControls(context);
    }

    private Control getConsumerTabControl(Composite tabFolder, DataBindingContext context) {
        final FormToolkit toolkit = getToolkit();
        Composite composite = toolkit.createComposite(tabFolder, SWT.NONE);
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
        toolkit.adapt(clusteringGroup);
        
        _clusteredCheckbox = createCheckbox(clusteringGroup, Messages.label_clustered);
        addGridData(_clusteredCheckbox, 3, GridData.FILL_HORIZONTAL);
        
        if (!_showConsumer) {
            _preferLocalCheckbox = createCheckbox(clusteringGroup, "Prefer Local");
            addGridData(_preferLocalCheckbox, 3, GridData.FILL_HORIZONTAL);
            _loadBalancingCombo = createLabelAndComboViewer(clusteringGroup, Messages.label_loadBalancing, true);
            addGridData(_loadBalancingCombo.getCombo(), 2, GridData.FILL_HORIZONTAL);
            _loadBalancingCombo.setContentProvider(ArrayContentProvider.getInstance());
            _loadBalancingCombo.setLabelProvider(new LabelProvider());
            String[] authTypes = new String[] {"", "RoundRobinStrategy", "RandomStrategy", Messages.constant_customLoadBalanceStrategy};
            _loadBalancingCombo.setInput(authTypes);
            
            _loadBalancingCustomClassText = createLabelAndText(clusteringGroup, Messages.label_customClass);
            _loadBalancingCombo.getCombo().setEnabled(false);
            _loadBalancingCustomClassText.setEnabled(false);

            _browseLoadBalancingClassButton = toolkit.createButton(clusteringGroup, Messages.button_browse, SWT.PUSH);
            GridData btnGD = new GridData();
            _browseLoadBalancingClassButton.setLayoutData(btnGD);
            _browseLoadBalancingClassButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    String newClass = handleBrowse(_loadBalancingCustomClassText.getText());
                    if (newClass != null) {
                        setTextValueAndNotify(_loadBalancingCustomClassText, newClass, true);
                    }
                }
            });
            _browseLoadBalancingClassButton.setEnabled(false);
        }

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
    
    private void bindControls(final DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_nameText.getDisplay());

        _bindingValue = new WritableValue(realm, null, CamelJmsBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "SCA binding name should not be empty.", Status.WARNING)), null);
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
                                "SCA binding name should not be empty.", Status.WARNING)), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        final IObservableValue clusteredValue =  ObservablesUtil.observeDetailValue(domain, _bindingValue,
                SwitchyardPackage.eINSTANCE.getDocumentRoot_Clustered());
        binding = context.bindValue(
                SWTObservables.observeSelection(_clusteredCheckbox), clusteredValue,
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        if (!_showConsumer) {
            final IObservableValue loadBalanceValue = new WritableValue(realm, null, String.class);
            final IObservableValue loadBalanceCustomValue = new WritableValue(realm, null, String.class);
            final IObservableValue preferLocalValue =  ObservablesUtil.observeDetailValue(domain, _bindingValue,
                    SwitchyardPackage.eINSTANCE.getDocumentRoot_PreferLocal());

            clusteredValue.addChangeListener(new IChangeListener() {
                @Override
                public void handleChange(ChangeEvent event) {
                    boolean isClustered = ((Boolean) clusteredValue.getValue()).booleanValue();
                    _loadBalancingCombo.getControl().setEnabled(isClustered);
                    _preferLocalCheckbox.setEnabled(isClustered);
                    String value = (String) loadBalanceValue.getValue();
                    if (!isClustered && value != null) {
                        loadBalanceValue.setValue(null);
                        preferLocalValue.setValue(null);
                    }
                }
            });
    
            binding = context.bindValue(
                    SWTObservables.observeSelection(_preferLocalCheckbox), preferLocalValue,
                    new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

            loadBalanceValue.addChangeListener(new IChangeListener() {
                @Override
                public void handleChange(ChangeEvent event) {
                    String value = (String) loadBalanceValue.getValue();
                    boolean isCustom = false;
                    if (value != null) {
                        isCustom = value.equals(Messages.constant_customLoadBalanceStrategy);
                    }
                    _loadBalancingCustomClassText.setEnabled(isCustom);
                    _browseLoadBalancingClassButton.setEnabled(isCustom);
                    if (!isCustom) {
                        loadBalanceCustomValue.setValue(null);
                    }
                }
            });
    
            binding = context.bindValue(
                    SWTObservables.observeText(_targetServiceText, new int[] {SWT.Modify }),
                    ObservablesUtil.observeDetailValue(domain, _bindingValue,
                            SwitchyardPackage.eINSTANCE.getDocumentRoot_Target()),
                    new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
    
            binding = context.bindValue(
                    SWTObservables.observeText(_targetNamespaceText, new int[] {SWT.Modify }),
                    ObservablesUtil.observeDetailValue(domain, _bindingValue,
                            SwitchyardPackage.eINSTANCE.getDocumentRoot_TargetNamespace()),
                    new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
    
            binding = 
                    context.bindValue(ViewersObservables.observeSingleSelection(_loadBalancingCombo), 
                            loadBalanceValue, new EMFUpdateValueStrategyNullForEmptyString(null,
                                    UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
    
            binding = 
                    context.bindValue(SWTObservables.observeText(_loadBalancingCustomClassText, SWT.Modify), 
                            loadBalanceCustomValue, new EMFUpdateValueStrategyNullForEmptyString(null,
                                    UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
    
            ComputedValue computedLoadBalanceValue = new ComputedValue() {
                @Override
                protected Object calculate() {
                    final String loadBalance = (String) loadBalanceValue.getValue();
                    final String customLoadBalance = (String) loadBalanceCustomValue.getValue();
                    if (loadBalance != null 
                            && loadBalance.equalsIgnoreCase(Messages.constant_customLoadBalanceStrategy) 
                            && customLoadBalance != null) {
                        return customLoadBalance;
                    } else if (loadBalance != null
                            && !loadBalance.equalsIgnoreCase(Messages.constant_customLoadBalanceStrategy)) {
                        loadBalanceCustomValue.setValue(null);
                        return loadBalance;
                    }
                    return null;
                }
    
                protected void doSetValue(Object value) {
                    final String strValue = (String) value;
                    //"RoundRobinStrategy", "RandomStrategy"
                    if (strValue != null 
                            && !strValue.equalsIgnoreCase("RoundRobinStrategy")
                            && !strValue.equalsIgnoreCase("RandomStrategy")) {
                        loadBalanceValue.setValue(Messages.constant_customLoadBalanceStrategy);
                        loadBalanceCustomValue.setValue(strValue);
                    } else if (strValue != null) {
                        loadBalanceValue.setValue(strValue);
                        loadBalanceCustomValue.setValue(null);
                        setTextValueAndNotify(_loadBalancingCustomClassText, "", false);
                    } else {
                        loadBalanceValue.setValue(null);
                        loadBalanceCustomValue.setValue(null);
                    }
                    getValue();
                }
            };
    
            // now bind the proxy into the binding
            binding = context.bindValue(
                    computedLoadBalanceValue, ObservablesUtil.observeDetailValue(domain, _bindingValue, 
                            SwitchyardPackage.eINSTANCE.getDocumentRoot_LoadBalance()));
        }
    }
    
}
