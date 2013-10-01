/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.camel.file;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AdvancedCamelBindingDetailsComposite;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.binding.MessageComposerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * CamelFileBindingTypeExtension
 * 
 * <p/>
 * Editor extension support Camel file bindings.
 */
public class CamelFileBindingTypeExtension implements IBindingTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CreateBindingFeature(fp, new CamelFileBindingFactory(), Messages.label_file,
                Messages.description_tool_file, ImageProvider.IMG_16_FILE) };
    }

    @Override
    public IImageDecorator getImageDecorator(Binding binding) {
        return new ImageDecorator(ImageProvider.IMG_16_FILE);
    }

    @Override
    public boolean supports(Class<? extends Binding> type) {
        return CamelFileBindingType.class.isAssignableFrom(type);
    }

    @Override
    public List<IBindingComposite> createComposites(Binding binding) {
        return createComposites(binding.eContainer() instanceof Service);
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-camel-file"); //$NON-NLS-1$
    }

    @Override
    public String getTypeName(Binding object) {
        return Messages.label_file;
    }
    
    protected static List<IBindingComposite> createComposites(boolean forConsumer) {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(3);
        if (forConsumer) {
            composites.add(new CamelFileConsumerComposite());
            composites.add(new MessageComposerComposite());
            composites.add(new AdvancedCamelBindingDetailsComposite(CONSUMER_ADVANCED_PROPS,
                    FilePackage.eINSTANCE.getBaseCamelBinding_AdditionalUriParameters(), 
                    FilePackage.eINSTANCE.getAdditionalUriParametersType_Parameter(), 
                    FilePackage.eINSTANCE.getParameterType()));
        } else {
            composites.add(new CamelFileProducerComposite());
            composites.add(new MessageComposerComposite());
            composites.add(new AdvancedCamelBindingDetailsComposite(PRODUCER_ADVANCED_PROPS,
                FilePackage.eINSTANCE.getBaseCamelBinding_AdditionalUriParameters(), 
                FilePackage.eINSTANCE.getAdditionalUriParametersType_Parameter(), 
                FilePackage.eINSTANCE.getParameterType()));
        }
        return composites;
    }

    private static final List<String> PRODUCER_ADVANCED_PROPS;
    
    static {
        PRODUCER_ADVANCED_PROPS = new ArrayList<String>();
        PRODUCER_ADVANCED_PROPS.add("bufferSize"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("flatten"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("charset"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("tempPrefix"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("tempFileName"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("keepLastModified"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("eagerDeleteTargetFile"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("doneFileName"); //$NON-NLS-1$
    }

    private static final List<String> CONSUMER_ADVANCED_PROPS;
    
    static {
        CONSUMER_ADVANCED_PROPS = new ArrayList<String>();
        CONSUMER_ADVANCED_PROPS.add("bufferSize"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("flatten"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("charset"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("delete"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("recursive"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("noop"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("idempotent"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("idempotentRepository"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("inProgressRepository"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("filter"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("sorter"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("sortBy"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("readLock"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("readLockTimeout"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("readLockCheckInterval"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("exclusiveReadLockStrategy"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("processStrategy"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("startingDirectoryMustExist"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("directoryMustExist"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("doneFileName"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("initialDelay"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("useFixedDelay"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("sendEmptyMessageWhenIdle"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("timeUnit"); //$NON-NLS-1$
    }

}
