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
import org.switchyard.component.bean.config.model.BeanComponentImplementationModel;

/**
 * BeanComponentImplementationtModelPropertySource
 * 
 * <p/>
 * Provides properties for BeanComponentImplementationModel.
 * 
 * @author Rob Cernich
 */
public class BeanComponentImplementationtModelPropertySource implements IPropertySource {

    private static final String PROP_CLASS = "class";
    private static final PropertyDescriptor[] DESCRIPTORS;

    private final BeanComponentImplementationModel _model;

    /* package */BeanComponentImplementationtModelPropertySource(BeanComponentImplementationModel model) {
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
        if (PROP_CLASS.equals(id)) {
            return _model.getClazz();
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
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_CLASS, "Class") };
        DESCRIPTORS[0].setDescription("The class used to implement the component.");
    }
}
