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

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.switchyard.config.model.composite.ComponentImplementationModel;
import org.switchyard.config.model.composite.ComponentModel;

/**
 * ComponentModelPropertySource
 * 
 * <p/>
 * Provides properties for ComponentModel.
 * 
 * @author Rob Cernich
 */
public class ComponentModelPropertySource implements IPropertySource {

    private static final String PROP_NAME = "name";
    private static final String PROP_IMPLEMENTATION = "implementation";
    private static final PropertyDescriptor[] DESCRIPTORS;

    private final ComponentModel _model;

    /* package */ComponentModelPropertySource(ComponentModel model) {
        _model = model;
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
        if (PROP_NAME.equals(id)) {
            return _model.getName();
        } else if (PROP_IMPLEMENTATION.equals(id)) {
            return _model.getImplementation();
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
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_NAME, "Name"),
                new PropertyDescriptor(PROP_IMPLEMENTATION, "Implementation") };
        DESCRIPTORS[0].setDescription("The name for the SwitchYard component.");
        DESCRIPTORS[1].setDescription("The implementation details for the component.");
        DESCRIPTORS[1].setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return ((ComponentImplementationModel) element).getType();
            }
        });
    }
}
