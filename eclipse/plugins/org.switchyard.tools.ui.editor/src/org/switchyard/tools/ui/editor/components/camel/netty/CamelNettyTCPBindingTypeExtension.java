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
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.binding.AdvancedBindingDetailsComposite;
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
        return new ICreateFeature[] {new CreateBindingFeature(fp, new CamelNettyTCPBindingFactory(), "Netty TCP",
                "A Camel Netty TCP based endpoint.", ImageProvider.IMG_16_NETTY_TCP) };
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
        return Collections.singletonList("org.switchyard.components:switchyard-component-camel-netty");
    }

    @Override
    public String getTypeName(Binding object) {
        return "TCP";
    }

    protected static List<IBindingComposite> createComposites() {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(4);
        composites.add(new CamelNettyTCPComposite());
        composites.add(new MessageComposerComposite());
        composites.add(new AdvancedBindingDetailsComposite(ADVANCED_PROPS));
        return composites;
    }

    private static final List<String> ADVANCED_PROPS;
    
    static {
        ADVANCED_PROPS = new ArrayList<String>();
        ADVANCED_PROPS.add("textline");
        ADVANCED_PROPS.add("tcpNoDelay");
        ADVANCED_PROPS.add("reuseAddress");
        ADVANCED_PROPS.add("encoders");
        ADVANCED_PROPS.add("decoders");
        ADVANCED_PROPS.add("allowDefaultCodec");
        ADVANCED_PROPS.add("workerCount");
        ADVANCED_PROPS.add("disconnect");
        ADVANCED_PROPS.add("receiveBufferSize");
        ADVANCED_PROPS.add("sendBufferSize");
        ADVANCED_PROPS.add("ssl");
        ADVANCED_PROPS.add("sslHandler");
        ADVANCED_PROPS.add("passphrase");
        ADVANCED_PROPS.add("securityProvider");
        ADVANCED_PROPS.add("keyStoreFormat");
        ADVANCED_PROPS.add("keyStoreFile");
        ADVANCED_PROPS.add("trustStoreFile");
        ADVANCED_PROPS.add("sslContextParametersRef");
        ADVANCED_PROPS.add("sync");
        ADVANCED_PROPS.add("keepAlive");
    }
}
