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
package org.switchyard.tools.ui.facets;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntimeComponent;
import org.eclipse.wst.common.project.facet.ui.IRuntimeComponentLabelProvider;

/**
 * SwitchYardFacetsAdapterFactory
 * <p/>
 * Adapter factory for SwitchYard integration with the Facet framework.
 */
public class SwitchYardFacetsAdapterFactory implements IAdapterFactory {

    @SuppressWarnings("rawtypes")
    private static final Class[] ADAPTABLE_TYPES = {IRuntimeComponentLabelProvider.class };

    @SuppressWarnings("rawtypes")
    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adaptableObject instanceof IRuntimeComponent) {
            return new RuntimeComponentLabelProvider((IRuntimeComponent) adaptableObject);
        }
        return null;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Class[] getAdapterList() {
        return ADAPTABLE_TYPES;
    }

    private static final class RuntimeComponentLabelProvider implements IRuntimeComponentLabelProvider {
        private final IRuntimeComponent _runtimeComponent;

        private RuntimeComponentLabelProvider(final IRuntimeComponent runtimeComponent) {
            _runtimeComponent = runtimeComponent;
        }

        @Override
        public String getLabel() {
            String label = _runtimeComponent
                    .getProperty(ISwitchYardFacetConstants.SWITCHYARD_RUNTIME_LABEL_KEY);
            if (label == null || label.length() == 0) {
                label = _runtimeComponent.getRuntimeComponentType().getId() + ' '
                        + _runtimeComponent.getRuntimeComponentVersion().getVersionString();
            }
            return label;
        }
    }
}
