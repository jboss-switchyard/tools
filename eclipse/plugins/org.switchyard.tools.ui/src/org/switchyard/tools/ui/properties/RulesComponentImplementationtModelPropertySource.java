/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.switchyard.component.rules.config.model.RulesComponentImplementationModel;
import org.switchyard.config.model.resource.ResourceModel;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * RulesComponentImplementationtModelPropertySource
 * 
 * <p/>
 * Provides properties for RulesComponentImplementationModel.
 * 
 * @author Rob Cernich
 */
public class RulesComponentImplementationtModelPropertySource implements IPropertySource {

    private static final String PROP_RESOURCES = "resources"; //$NON-NLS-1$
    private static final PropertyDescriptor[] DESCRIPTORS;

    private final RulesComponentImplementationModel _model;

    /* package */RulesComponentImplementationtModelPropertySource(RulesComponentImplementationModel model) {
        _model = model;
    }

    @Override
    public Object getEditableValue() {
        return _model;
    }

    @Override
    public IPropertyDescriptor[] getPropertyDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public Object getPropertyValue(Object id) {
        if (PROP_RESOURCES.equals(id)) {
            if (_model.getManifest() == null || _model.getManifest().getResources() == null) {
                return null;
            }
            final List<ResourceModel> resources = _model.getManifest().getResources().getResources();
            if (resources == null) {
                return null;
            }
            List<String> resourceStrings = new ArrayList<String>(resources.size());
            for (ResourceModel resource : resources) {
                if (resource.getLocation() == null) {
                    continue;
                }
                resourceStrings.add(resource.getLocation());
            }
            return resourceStrings;
        }
        return null;
    }

    @Override
    public boolean isPropertySet(Object id) {
        return false;
    }

    @Override
    public void resetPropertyValue(Object id) {
    }

    @Override
    public void setPropertyValue(Object id, Object value) {
    }

    static {
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_RESOURCES, Messages.RulesComponentImplementationtModelPropertySource_propertyDescriptor_resources) };
        DESCRIPTORS[0].setDescription(Messages.RulesComponentImplementationtModelPropertySource_propertyDescriptorDescription_resources);
    }
}
