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
package org.switchyard.tools.ui.editor.components.jca;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;


/**
 * @author bfitzpat
 *
 */
public class JCAGenericResourceAdapterExtension extends AbstractResourceAdapterExtension {

    @Override
    public AbstractJCABindingComposite createComposite(FormToolkit toolkit) {
        return new JCACustomResourceAdapterComposite(toolkit);
    }

    /**
     * Constructor.
     */
    public JCAGenericResourceAdapterExtension() {
    }

    @Override
    public String getDisplayName() {
        return Messages.label_genericResourceAdapter;
    }

    @Override
    public int score(JCABinding binding) {
        return 0;
    }

    @Override
    public IInboundInteractionSettings getInboundInteractionSettings() {
        return null;
    }

    @Override
    public IInboundConnectionSettings getInboundConnectionSettings() {
        return null;
    }

    @Override
    public IOutboundInteractionSettings getOutboundInteractionSettings() {
        return null;
    }

    @Override
    public IOutboundConnectionSettings getOutboundConnectionSettings() {
        return null;
    }

    private final class JCACustomResourceAdapterComposite extends AbstractJCABindingComposite {

        private Text _resourceAdapterText;
        private JCABinding _binding;
        private Composite _panel;
        private Set<org.eclipse.core.databinding.Binding> _validators = new HashSet<org.eclipse.core.databinding.Binding>();
        private WritableValue _bindingValue;

        private JCACustomResourceAdapterComposite(FormToolkit toolkit) {
            super(toolkit);
        }

        @Override
        public String getTitle() {
            return getDisplayName();
        }

        @Override
        public String getDescription() {
            return getTitle();
        }

        @Override
        public void createContents(Composite parent, int style, DataBindingContext context) {
            _panel = getToolkit().createComposite(parent, style);
            _panel.setLayout(new GridLayout(2, false));
            _resourceAdapterText = createLabelAndText(_panel, Messages.label_resourceAdapterArchive);
            bindControls(context);
        }

        @Override
        protected void handleModify(Control control) {
            setHasChanged(false);
            setDidSomething(true);
        }

        @Override
        public Composite getPanel() {
            return _panel;
        }

        @Override
        public void setBinding(Binding impl) {
            super.setBinding(impl);
            _binding = (JCABinding) impl;
            if (_bindingValue != null) {
                _bindingValue.setValue(_binding);
                if (_binding == null) {
                    for (org.eclipse.core.databinding.Binding binding : _validators) {
                        binding.getValidationStatus().setValue(Status.OK_STATUS);
                    }
                } else {
                    for (org.eclipse.core.databinding.Binding binding : _validators) {
                        binding.validateTargetToModel();
                    }
                }
            }
        }

        protected void bindControls(final DataBindingContext context) {
            final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
            final Realm realm = SWTObservables.getRealm(_resourceAdapterText.getDisplay());

            _bindingValue = new WritableValue(realm, null, JCABinding.class);

            final FeaturePath resourceAdapterNamePath;
            if (getTargetObject() instanceof Service) {
                resourceAdapterNamePath = FeaturePath.fromList(JcaPackage.Literals.JCA_BINDING__INBOUND_CONNECTION,
                        JcaPackage.Literals.JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER,
                        JcaPackage.Literals.RESOURCE_ADAPTER__NAME);
            } else {
                resourceAdapterNamePath = FeaturePath.fromList(JcaPackage.Literals.JCA_BINDING__OUTBOUND_CONNECTION,
                        JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER,
                        JcaPackage.Literals.RESOURCE_ADAPTER__NAME);
            }
            org.eclipse.core.databinding.Binding binding = context
                    .bindValue(SWTObservables.observeText(_resourceAdapterText, SWT.Modify),
                            EMFProperties.value(resourceAdapterNamePath).observeDetail(_bindingValue),
                            new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT,
                                    domain, _bindingValue, resourceAdapterNamePath, false)
                                    .setAfterConvertValidator(new StringEmptyValidator(
                                            "Resource Adapter name cannot be empty")), null);
            _validators.add(binding);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT, _panel);

            if (_binding != null) {
                _bindingValue.setValue(_binding);
            }
        }

    }

}
