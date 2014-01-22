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
package org.switchyard.tools.ui.editor.components.camel.netty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AdvancedCamelBindingDetailsComposite;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.binding.MessageComposerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * CamelNettyTCPBindingTypeExtension
 * 
 * <p/>
 * Editor extension support Camel Netty TCP bindings.
 */
public class CamelNettyTCPBindingTypeExtension implements IBindingTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CreateBindingFeature(fp, new CamelNettyTCPBindingFactory(), Messages.label_nettyTcp,
                Messages.description_tool_nettyTcp, ImageProvider.IMG_16_NETTY_TCP) };
    }

    @Override
    public IImageDecorator getImageDecorator(Binding binding) {
        return new ImageDecorator(ImageProvider.IMG_16_NETTY_TCP);
    }

    @Override
    public boolean supports(Class<? extends Binding> type) {
        return CamelNettyTcpBindingType.class.isAssignableFrom(type);
    }

    @Override
    public List<IBindingComposite> createComposites(Binding binding) {
        return createComposites();
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-camel-netty"); //$NON-NLS-1$
    }

    @Override
    public String getTypeName(Binding object) {
        return Messages.label_tcp;
    }

    protected static List<IBindingComposite> createComposites() {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(4);
        composites.add(new CamelNettyTCPComposite());
        composites.add(new MessageComposerComposite());
        composites.add(new AdvancedCamelBindingDetailsComposite(ADVANCED_PROPS,
                NettyPackage.eINSTANCE.getBaseCamelBinding_AdditionalUriParameters(), 
                NettyPackage.eINSTANCE.getAdditionalUriParametersType_Parameter(), 
                NettyPackage.eINSTANCE.getParameterType()));
        return composites;
    }

    private static final List<String> ADVANCED_PROPS;
    
    static {
        ADVANCED_PROPS = new ArrayList<String>();
        ADVANCED_PROPS.add("textline"); //$NON-NLS-1$
        ADVANCED_PROPS.add("tcpNoDelay"); //$NON-NLS-1$
        ADVANCED_PROPS.add("reuseAddress"); //$NON-NLS-1$
        ADVANCED_PROPS.add("encoders"); //$NON-NLS-1$
        ADVANCED_PROPS.add("decoders"); //$NON-NLS-1$
        ADVANCED_PROPS.add("allowDefaultCodec"); //$NON-NLS-1$
        ADVANCED_PROPS.add("workerCount"); //$NON-NLS-1$
        ADVANCED_PROPS.add("disconnect"); //$NON-NLS-1$
        ADVANCED_PROPS.add("receiveBufferSize"); //$NON-NLS-1$
        ADVANCED_PROPS.add("sendBufferSize"); //$NON-NLS-1$
        ADVANCED_PROPS.add("ssl"); //$NON-NLS-1$
        ADVANCED_PROPS.add("sslHandler"); //$NON-NLS-1$
        ADVANCED_PROPS.add("needClientAuth"); //$NON-NLS-1$
        ADVANCED_PROPS.add("passphrase"); //$NON-NLS-1$
        ADVANCED_PROPS.add("securityProvider"); //$NON-NLS-1$
        ADVANCED_PROPS.add("keyStoreFormat"); //$NON-NLS-1$
        ADVANCED_PROPS.add("keyStoreFile"); //$NON-NLS-1$
        ADVANCED_PROPS.add("trustStoreFile"); //$NON-NLS-1$
        ADVANCED_PROPS.add("sslContextParametersRef"); //$NON-NLS-1$
        ADVANCED_PROPS.add("sync"); //$NON-NLS-1$
        ADVANCED_PROPS.add("keepAlive"); //$NON-NLS-1$
    }
}
