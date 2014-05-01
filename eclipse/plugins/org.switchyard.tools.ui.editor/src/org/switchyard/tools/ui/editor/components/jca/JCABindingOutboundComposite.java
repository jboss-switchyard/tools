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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.Processor;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;

/**
 * @author bfitzpat
 * 
 */
public class JCABindingOutboundComposite extends AbstractSYBindingComposite {

    private Map<ProcessorType, AbstractJCABindingComposite> _extensionComposites = new HashMap<ProcessorType, AbstractJCABindingComposite>();
    private ProcessorType _activeExtension;
    private Composite _panel;
    private JCABinding _binding = null;
    private Text _nameText;
    private Combo _resourceAdapterText;
//    private Button _browseResourceAdapterButton;
    private Composite _stackComposite;
    private StackLayout _stackLayout;
    private WritableValue _bindingValue;
    private ComboViewer _processorMappingTypeCombo;

    private static enum ProcessorType {
        JMS("JMS Processor", "org.switchyard.component.jca.processor.JMSProcessor", new JCAJMSProcessorPropertiesExtension()),
        CCI("CCI Processor", "org.switchyard.component.jca.processor.CCIProcessor", new JCACCIProcessorPropertiesExtension()),
        CUSTOM("Custom Processor", null, new JCACustomProcessorPropertiesExtension());
        
        private final String _label;
        private final String _processorType;
        private final IJCAEndpointPropertiesExtension _extension;

        private ProcessorType(String label, String processorType, IJCAEndpointPropertiesExtension extension) {
            _label = label;
            _processorType = processorType;
            _extension = extension;
        }

        /**
         * Get the label.
         * 
         * @return the label.
         */
        public String getLabel() {
            return _label;
        }

        /**
         * Get the processorType.
         * 
         * @return the processorType.
         */
        public String getProcessorType() {
            return _processorType;
        }

        public AbstractJCABindingComposite createComposite(FormToolkit toolkit) {
            return _extension.createComposite(toolkit);
        }

        /**
         * @param processorType the processor type
         * @return the corresponding ProcessorType
         */
        public static ProcessorType fromProcessorType(String processorType) {
            if (JMS._processorType.equals(processorType)) {
                return JMS;
            } else if (CCI._processorType.equals(processorType)) {
                return CCI;
            }
            return CUSTOM;
        }
    }

    JCABindingOutboundComposite(FormToolkit toolkit) {
        super(toolkit);
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
            _binding = (JCABinding) impl;
        } else {
            _binding = null;
        }
        _bindingValue.setValue(_binding);
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getJCATabControl(_panel, context);
        
        bindControls(context);
    }

    private Control getJCATabControl(Composite tabFolder, DataBindingContext context) {
        Composite composite = getToolkit().createComposite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);

        _resourceAdapterText = createLabelAndCombo(composite, Messages.label_resourceAdapterArchive, false);
        _resourceAdapterText.add("hornetq-ra.rar"); //$NON-NLS-1$

        _processorMappingTypeCombo = new ComboViewer(createLabelAndCombo(composite, "Processor Type", true));
        _processorMappingTypeCombo.setContentProvider(ArrayContentProvider.getInstance());
        _processorMappingTypeCombo.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return ((ProcessorType) element).getLabel();
            }
        });
        _processorMappingTypeCombo.setInput(ProcessorType.values());
        _processorMappingTypeCombo.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                processProcessorComboSelection();
            }
        });

        _stackComposite = getToolkit().createComposite(composite, SWT.NONE);
        GridData gd = new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1);
        _stackComposite.setLayoutData(gd);
        _stackLayout = new StackLayout();
        _stackComposite.setLayout(_stackLayout);
        Composite dummy = getToolkit().createComposite(_stackComposite, SWT.NONE);
        _stackLayout.topControl = dummy;

        // initialize processor composites
        for (ProcessorType processorType : ProcessorType.values()) {
            AbstractJCABindingComposite processorComposite = processorType.createComposite(getToolkit());
            processorComposite.setTargetObject(getTargetObject());
            processorComposite.createContents(_stackComposite, SWT.NONE, context);
            processorComposite.setBinding(null);
            _extensionComposites.put(processorType, processorComposite);
        }

        return composite;
    }

    @Override
    public Composite getPanel() {
        return _panel;
    }

    private void bindControls(DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_stackComposite.getDisplay());

        _bindingValue = new WritableValue(realm, null, JCABinding.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "JCA binding name should not be empty", Status.WARNING)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        final FeaturePath batchTimeoutFeaturePath = FeaturePath
                .fromList(JcaPackage.Literals.JCA_BINDING__OUTBOUND_CONNECTION,
                        JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER,
                        JcaPackage.Literals.RESOURCE_ADAPTER__NAME);
        binding = context.bindValue(SWTObservables.observeText(_resourceAdapterText),
                EMFProperties.value(batchTimeoutFeaturePath).observeDetail(_bindingValue),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT, domain,
                        _bindingValue, batchTimeoutFeaturePath, true), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        IObservableValue processorType = ObservablesUtil.observeDetailValue(domain, _bindingValue, FeaturePath.fromList(
                JcaPackage.Literals.JCA_BINDING__OUTBOUND_INTERACTION,
                JcaPackage.Literals.JCA_OUTBOUND_INTERACTION__PROCESSOR, JcaPackage.Literals.PROCESSOR__TYPE));
        processorType.addValueChangeListener(new IValueChangeListener() {
            @Override
            public void handleValueChange(ValueChangeEvent event) {
                final ProcessorType newExtension = ProcessorType.fromProcessorType((String) event.diff.getNewValue());
                if (newExtension != _activeExtension) {
                    swapExtensionComposites(newExtension, false);
                    _processorMappingTypeCombo.setSelection(new StructuredSelection(newExtension), true);
                }
            }
        });
    }

    private void processProcessorComboSelection() {
        final IStructuredSelection selection = (IStructuredSelection) _processorMappingTypeCombo.getSelection();
        swapExtensionComposites(selection.isEmpty() ? null : (ProcessorType) selection.getFirstElement(), true);
    }

    private void swapExtensionComposites(final ProcessorType newExtension, final boolean updateValues) {
        if (newExtension == null || newExtension == _activeExtension) {
            return;
        }
        final TransactionalEditingDomain domain = getDomain(_binding);
        if (updateValues && domain != null) {
            domain.getCommandStack().execute(
                    new RecordingCommand(domain, "Change JCA processor type") {
                        @Override
                        protected void doExecute() {
                            deactivateExtension(_activeExtension);
                            activateExtension(newExtension, updateValues);
                        }
                    });
        } else {
            deactivateExtension(_activeExtension);
            activateExtension(newExtension, updateValues);
        }

        _activeExtension = newExtension;

        AbstractJCABindingComposite processorComposite = _extensionComposites.get(newExtension);
        _stackLayout.topControl = processorComposite.getPanel();
        _stackComposite.layout();
        if (_stackComposite.getParent() != null) {
            _stackComposite.getParent().layout();
        }
    }
 
    private void activateExtension(ProcessorType extension, boolean updateValues) {
        if (extension == null) {
            return;
        }
        if (updateValues) {
            JCAOutboundInteraction interaction = _binding.getOutboundInteraction();
            if (interaction == null) {
                interaction = JcaFactory.eINSTANCE.createJCAOutboundInteraction();
                _binding.setOutboundInteraction(interaction);
            }
            Processor processor = interaction.getProcessor();
            if (processor == null) {
                processor = JcaFactory.eINSTANCE.createProcessor();
                interaction.setProcessor(processor);
            }
            processor.setType(extension.getProcessorType());
        }
        _extensionComposites.get(extension).setBinding(_binding);
    }

    private void deactivateExtension(ProcessorType extension) {
        if (extension == null) {
            return;
        }
        final AbstractJCABindingComposite extensionComposite = _extensionComposites.get(extension);
        extensionComposite.setBinding(null);
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
