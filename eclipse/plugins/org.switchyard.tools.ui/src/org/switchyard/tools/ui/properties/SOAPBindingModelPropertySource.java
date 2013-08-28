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
import org.switchyard.component.soap.config.model.SOAPBindingModel;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * SOAPBindingModelPropertySource
 * 
 * <p/>
 * Provides properties for SOAPBindingModel.
 * 
 * @author Rob Cernich
 */
public class SOAPBindingModelPropertySource extends BindingModelPropertySource implements IPropertySource {

    private static final String PROP_WSDL = "wsdl"; //$NON-NLS-1$
    private static final String PROP_WSDL_PORT = "port"; //$NON-NLS-1$
    private static final String PROP_SOCKET_ADDRESS = "socket-address"; //$NON-NLS-1$
    private static final String PROP_CONTEXT_PATH = "context-path"; //$NON-NLS-1$
    private static final PropertyDescriptor[] DESCRIPTORS;

    private final SOAPBindingModel _model;

    /* package */SOAPBindingModelPropertySource(SOAPBindingModel model) {
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
        if (PROP_WSDL.equals(id)) {
            return _model.getWsdl();
        } else if (PROP_WSDL_PORT.equals(id)) {
            if (_model.getPort().getName() == null) {
                return null;
            }
            return _model.getPort().toString();
        } else if (PROP_SOCKET_ADDRESS.equals(id)) {
            return _model.getSocketAddr().toString();
        } else if (PROP_CONTEXT_PATH.equals(id)) {
            return _model.getContextPath();
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
        temp.add(new PropertyDescriptor(PROP_WSDL, Messages.SOAPBindingModelPropertySource_propertyDescriptor_wsdlFile));
        temp.add(new PropertyDescriptor(PROP_WSDL_PORT, Messages.SOAPBindingModelPropertySource_propertyDescriptor_wsdlPort));
        temp.add(new PropertyDescriptor(PROP_SOCKET_ADDRESS, Messages.SOAPBindingModelPropertySource_propertyDescriptor_socketAddress));
        temp.add(new PropertyDescriptor(PROP_CONTEXT_PATH, Messages.SOAPBindingModelPropertySource_propertyDescriptor_contextPath));
        temp.get(0).setDescription(Messages.SOAPBindingModelPropertySource_propertyDescriptorDescription_wsdlFile);
        temp.get(0).setCategory(Messages.SOAPBindingModelPropertySource_propertyDescriptorCategory_soap);
        temp.get(1).setDescription(Messages.SOAPBindingModelPropertySource_propertyDescriptorDescription_wsdlPort);
        temp.get(1).setCategory(Messages.SOAPBindingModelPropertySource_propertyDescriptorCategory_soap);
        temp.get(2).setDescription(Messages.SOAPBindingModelPropertySource_propertyDescriptorDescription_socketAddress);
        temp.get(2).setCategory(Messages.SOAPBindingModelPropertySource_propertyDescriptorCategory_soap);
        temp.get(3).setDescription(Messages.SOAPBindingModelPropertySource_propertyDescriptorDescription_contextPath);
        temp.get(3).setCategory(Messages.SOAPBindingModelPropertySource_propertyDescriptorCategory_soap);
        temp.addAll(Arrays.asList(BindingModelPropertySource.DESCRIPTORS));
        DESCRIPTORS = temp.toArray(new PropertyDescriptor[temp.size()]);
    }
}
