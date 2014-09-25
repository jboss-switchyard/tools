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
package org.switchyard.tools.ui.editor.components.camel.jpa;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.databinding.FeaturePath;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage;
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
public class CamelJPAProducerComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelJpaBindingType _binding = null;
    private Text _nameText;
    private Text _entityClassNameText;
    private Button _browseEntityClassButton;
    private Text _persistenceUnitText;
    private Text _transcationManagerText;
    private Button _flushOnSendCheckbox;
    private Button _usePersistCheckbox;
    private IJavaProject _project;
    private WritableValue _bindingValue;

    CamelJPAProducerComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_jpaBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_jpaBindingDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelJpaBindingType) {
            this._binding = (CamelJpaBindingType) impl;
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

        _nameText = createLabelAndText(composite, Messages.label_name);
        _nameText.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));

        _entityClassNameText = createLabelAndText(composite, Messages.label_entityClassName);
        _browseEntityClassButton = new Button(composite, SWT.PUSH);
        _browseEntityClassButton.setText(Messages.button_browse);
        GridData btnGD = new GridData();
        _browseEntityClassButton.setLayoutData(btnGD);
        _browseEntityClassButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                String newClass = handleBrowse(_entityClassNameText.getText());
                if (newClass != null) {
                    setTextValueAndNotify(_entityClassNameText, newClass, true);
                }
            }
        });

        _persistenceUnitText = createLabelAndText(composite, Messages.label_persistenceUnit);
        addGridData(_persistenceUnitText, 2, GridData.FILL_HORIZONTAL);
        
        _transcationManagerText = createLabelAndText(composite, Messages.label_transactionManager);
        addGridData(_transcationManagerText, 2, GridData.FILL_HORIZONTAL);

        Group producerGroup = new Group(composite, SWT.NONE);
        producerGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        producerGroup.setLayout(new GridLayout(2, false));
        producerGroup.setText(Messages.label_producerOptions);
        
        _flushOnSendCheckbox = createCheckbox(producerGroup, Messages.label_flushOnSend, 2);
        _usePersistCheckbox = createCheckbox(producerGroup, Messages.label_usePersist, 2);

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

        _bindingValue = new WritableValue(realm, null, CamelJpaBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "JPA binding name should not be empty", Status.WARNING)), null);
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
                                "JPA binding name should not be empty", Status.WARNING)), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_entityClassNameText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                JpaPackage.Literals.CAMEL_JPA_BINDING_TYPE__ENTITY_CLASS_NAME),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                                .setAfterConvertValidator(new StringEmptyValidator(
                                        Messages.error_emptyEntityClassName)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_persistenceUnitText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                JpaPackage.Literals.CAMEL_JPA_BINDING_TYPE__PERSISTENCE_UNIT),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                                .setAfterConvertValidator(new StringEmptyValidator(
                                        Messages.error_emptyPersistenceUnit)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_transcationManagerText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                JpaPackage.Literals.CAMEL_JPA_BINDING_TYPE__TRANSACTION_MANAGER),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);


        FeaturePath path = FeaturePath.fromList(
                JpaPackage.Literals.CAMEL_JPA_BINDING_TYPE__PRODUCE,
                JpaPackage.Literals.JPA_PRODUCER_TYPE__FLUSH_ON_SEND
              );
        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_flushOnSendCheckbox),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(
                JpaPackage.Literals.CAMEL_JPA_BINDING_TYPE__PRODUCE,
                JpaPackage.Literals.JPA_PRODUCER_TYPE__USE_PERSIST
              );
        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_usePersistCheckbox),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
    }
}
