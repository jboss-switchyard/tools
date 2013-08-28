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

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.switchyard.tools.ui.explorer.impl.ServiceNode;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * ServicePropertySource
 * 
 * <p/>
 * Provides properties for ServiceNode objects.
 * 
 * @author Rob Cernich
 */
public class ServicePropertySource implements IPropertySource {

    private static final String PROP_MODEL = "model"; //$NON-NLS-1$
    private static final PropertyDescriptor[] DESCRIPTORS;

    private ServiceNode _node;

    /* package */ServicePropertySource(ServiceNode node) {
        _node = node;
    }

    @Override
    public Object getEditableValue() {
        return null;
    }

    @Override
    public IPropertyDescriptor[] getPropertyDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public Object getPropertyValue(Object id) {
        if (PROP_MODEL.equals(id)) {
            return _node.getModel();
        }
        return ""; //$NON-NLS-1$
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
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_MODEL, Messages.ServicePropertySource_propertyDescriptor_syService) };
        DESCRIPTORS[0].setDescription(Messages.ServicePropertySource_propertyDescriptorDescription_syService);
    }
}
