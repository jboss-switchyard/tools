/*************************************************************************************
 * Copyright (c) 2016 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.components.camel;

import java.util.Collections;
import java.util.List;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.fusesource.ide.camel.editor.features.create.ext.CreateEndpointFigureFeature;
import org.fusesource.ide.camel.editor.provider.ext.ICustomPaletteEntry;
import org.fusesource.ide.camel.model.service.core.catalog.CamelModelFactory;
import org.fusesource.ide.camel.model.service.core.catalog.Dependency;
import org.switchyard.tools.ui.editor.Messages;

/**
 * Simple implementation to add SwitchYard to palette in Camel Editor.
 * 
 * @author bfitzpat
 *
 */
public class CamelComponentPaletteEntry implements ICustomPaletteEntry {

    private static final String PROTOCOL = "switchyard"; //$NON-NLS-1$
    private static final String DEFAULT_URI = "switchyard://MySwitchYardServiceName"; //$NON-NLS-1$

    @Override
    public ICreateFeature newCreateFeature(IFeatureProvider fp) {
        return new CreateEndpointFigureFeature(fp, Messages.CamelComponentPaletteEntry_SwitchYard_Camel_Palette_title,
                Messages.CamelComponentPaletteEntry_SwitchYard_Camel_Palette_tooltip, DEFAULT_URI,
                getRequiredDependencies(null));
    }

    @Override
    public List<Dependency> getRequiredDependencies(String runtimeProvider) {
        return Collections.emptyList();
    }

    @Override
    public boolean providesProtocol(String protocol) {
        return PROTOCOL.equalsIgnoreCase(protocol);
    }

    @Override
    public String getProtocol() {
        return PROTOCOL;
    }
    
    @Override
    public boolean isValid(String runtimeProvider) {
    	return CamelModelFactory.RUNTIME_PROVIDER_KARAF.equals(runtimeProvider);
    }

}
