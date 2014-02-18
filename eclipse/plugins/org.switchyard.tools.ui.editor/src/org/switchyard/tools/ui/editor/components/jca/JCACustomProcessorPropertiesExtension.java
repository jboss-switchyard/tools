/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;

/**
 * Provides controls for configuring a custom JCA processor (i.e. custom processor
 * type).
 */
public class JCACustomProcessorPropertiesExtension implements IJCAEndpointPropertiesExtension {

    @Override
    public AbstractJCABindingComposite createComposite(FormToolkit toolkit) {
        return new JCACustomProcessorPropertiesComposite(toolkit);
    }

    private static final class JCACustomProcessorPropertiesComposite extends AbstractJCABindingComposite {

        /**
         * @param toolkit Form toolkit to use during control creation
         */
        private JCACustomProcessorPropertiesComposite(FormToolkit toolkit) {
            super(toolkit);
        }

        private JCABinding _binding;
        private Composite _panel;
        private JCAProcessorPropertyTable _propsList;
        private Text _processorTypeText;
        private WritableValue _bindingValue;

        @Override
        public String getTitle() {
            return "Custom JCA Processor";
        }

        @Override
        public String getDescription() {
            return getTitle();
        }

        @Override
        public void createContents(Composite parent, int style, DataBindingContext context) {
            _panel = getToolkit().createComposite(parent, style);
            _panel.setLayout(new GridLayout(2, false));

            Group processorPropsGroup = new Group(_panel, SWT.NONE);
            processorPropsGroup.setText(getTitle());
            processorPropsGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, true, 3, 1));
            processorPropsGroup.setLayout(new GridLayout(2, false));
            getToolkit().adapt(processorPropsGroup);

            _processorTypeText = createLabelAndText(processorPropsGroup, "Processor Type");

            getToolkit().createLabel(processorPropsGroup, "Processor Properties");
            getToolkit().createLabel(processorPropsGroup, ""); // spacer

            _propsList = new JCAProcessorPropertyTable(processorPropsGroup, SWT.NONE, getToolkit(), context,
                    getDomain(getTargetObject()));
            _propsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 4));
            getToolkit().adapt(_propsList, false, false);

            bindControls(context);
        }

        private void bindControls(DataBindingContext context) {
            final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
            final Realm realm = SWTObservables.getRealm(_panel.getDisplay());

            _bindingValue = new WritableValue(realm, null, JCABinding.class);

            final FeaturePath processorTypeFeaturePath = FeaturePath.fromList(
                    JcaPackage.Literals.JCA_BINDING__OUTBOUND_INTERACTION,
                    JcaPackage.Literals.JCA_OUTBOUND_INTERACTION__PROCESSOR, JcaPackage.Literals.PROCESSOR__TYPE);
            org.eclipse.core.databinding.Binding binding = context.bindValue(SWTObservables.observeText(
                    _processorTypeText, SWT.Modify),
                    EMFProperties.value(processorTypeFeaturePath).observeDetail(_bindingValue),
                    new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT, domain,
                            _bindingValue, processorTypeFeaturePath, false), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
        }

        @Override
        public Composite getPanel() {
            return _panel;
        }

        @Override
        public void setBinding(Binding impl) {
            super.setBinding(impl);
            _binding = (JCABinding) impl;
            _bindingValue.setValue(_binding);
            _propsList.setTargetObject(_binding);
        }
    }
}
