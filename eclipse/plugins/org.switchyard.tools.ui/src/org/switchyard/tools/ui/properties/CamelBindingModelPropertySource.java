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
import java.util.Arrays;
import java.util.List;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.switchyard.component.camel.config.model.CamelBindingModel;

/**
 * CamelBindingModelPropertySource
 * 
 * <p/>
 * Provides properties for CamelBindingModel.
 * 
 * @author Rob Cernich
 */
public class CamelBindingModelPropertySource extends BindingModelPropertySource implements IPropertySource {

    private static final String PROP_URI = "uri";
    private static final PropertyDescriptor[] DESCRIPTORS;

    private final CamelBindingModel _model;

    /* package */CamelBindingModelPropertySource(CamelBindingModel model) {
        super(model);
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
        if (PROP_URI.equals(id)) {
            return _model.getComponentURI();
        }
        return super.getPropertyValue(id);
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
        List<PropertyDescriptor> temp = new ArrayList<PropertyDescriptor>(10);
        temp.add(new PropertyDescriptor(PROP_URI, "Camel URI"));
        temp.get(0).setDescription("The Camel URI.");
        temp.get(0).setCategory("Camel");
        temp.addAll(Arrays.asList(BindingModelPropertySource.DESCRIPTORS));
        DESCRIPTORS = temp.toArray(new PropertyDescriptor[temp.size()]);
    }
}
