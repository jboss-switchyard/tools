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
import org.switchyard.component.camel.model.CamelComponentImplementationModel;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * CamelComponentImplementationtModelPropertySource
 * 
 * <p/>
 * Provides properties for CamelComponentImplementationModel.
 * 
 * @author Rob Cernich
 */
public class CamelComponentImplementationtModelPropertySource implements IPropertySource {

    private static final String PROP_JAVA_CLASS = "java-class"; //$NON-NLS-1$
    private static final String PROP_ROUTE = "route"; //$NON-NLS-1$
    private static final PropertyDescriptor[] DESCRIPTORS;

    private final CamelComponentImplementationModel _model;

    /* package */CamelComponentImplementationtModelPropertySource(CamelComponentImplementationModel model) {
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
        if (PROP_JAVA_CLASS.equals(id)) {
            return _model.getJavaClass();
        } else if (PROP_ROUTE.equals(id)) {
            return _model.getXMLPath();
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
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_JAVA_CLASS, Messages.CamelComponentImplementationtModelPropertySource_propertyDescriptor_javaClass),
                new PropertyDescriptor(PROP_ROUTE, Messages.CamelComponentImplementationtModelPropertySource_propertyDescriptor_route) };
        DESCRIPTORS[0].setDescription(Messages.CamelComponentImplementationtModelPropertySource_propertyDescriptorDescription_javaClass);
        DESCRIPTORS[1].setDescription(Messages.CamelComponentImplementationtModelPropertySource_propertyDescriptorDescription_route);
    }
}
