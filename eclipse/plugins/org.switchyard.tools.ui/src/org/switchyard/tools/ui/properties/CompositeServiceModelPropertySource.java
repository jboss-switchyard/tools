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
import org.switchyard.config.model.composite.CompositeServiceModel;
import org.switchyard.config.model.composite.InterfaceModel;

/**
 * CompositeServiceModelPropertySource
 * 
 * <p/>
 * Provides properties for CompositeServiceModel.
 * 
 * @author Rob Cernich
 */
public class CompositeServiceModelPropertySource implements IPropertySource {

    private static final String PROP_NAME = "name";
    private static final String PROP_INTERFACE = "interface";
    private static final String PROP_PROMOTE = "promote";
    private static final PropertyDescriptor[] DESCRIPTORS;

    private final CompositeServiceModel _model;

    /* package */CompositeServiceModelPropertySource(CompositeServiceModel model) {
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
        } else if (PROP_PROMOTE.equals(id)) {
            return _model.getName();
        } else if (PROP_INTERFACE.equals(id)) {
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
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_NAME, "Name"),
                new PropertyDescriptor(PROP_PROMOTE, "Promoted Service"),
                new PropertyDescriptor(PROP_INTERFACE, "Interface") };
        DESCRIPTORS[0].setDescription("The name for the SwitchYard service.");
        DESCRIPTORS[1].setDescription("The promoted component service.");
        DESCRIPTORS[2].setDescription("The interface details for the service.");
        DESCRIPTORS[2].setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return ((InterfaceModel) element).getType();
            }
        });
    }
}
