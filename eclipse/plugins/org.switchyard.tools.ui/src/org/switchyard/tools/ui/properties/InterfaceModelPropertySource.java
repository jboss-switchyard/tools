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
import org.switchyard.config.model.composite.InterfaceModel;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * InterfaceModelPropertySource
 * 
 * <p/>
 * Provides properties for InterfaceModel.
 * 
 * @author Rob Cernich
 */
public class InterfaceModelPropertySource implements IPropertySource {

    private static final String PROP_INTERFACE = "interface"; //$NON-NLS-1$
    private static final PropertyDescriptor[] DESCRIPTORS;

    private final InterfaceModel _model;

    /* package */InterfaceModelPropertySource(InterfaceModel model) {
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
        if (PROP_INTERFACE.equals(id)) {
            return _model.getInterface();
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
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_INTERFACE, Messages.InterfaceModelPropertySource_propertyDescriptor_interface) };
        DESCRIPTORS[0].setDescription(Messages.InterfaceModelPropertySource_propertyDescriptorDescription_interface);
    }
}
