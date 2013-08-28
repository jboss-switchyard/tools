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
import org.switchyard.config.model.composite.ComponentReferenceModel;
import org.switchyard.config.model.composite.InterfaceModel;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * ComponentReferenceModelPropertySource
 * 
 * <p/>
 * Provides properties for ComponentReferenceModel.
 * 
 * @author Rob Cernich
 */
public class ComponentReferenceModelPropertySource implements IPropertySource {

    private static final String PROP_NAME = "name"; //$NON-NLS-1$
    private static final String PROP_INTERFACE = "interface"; //$NON-NLS-1$
    private static final String PROP_POLICIES = "policies"; //$NON-NLS-1$
    private static final PropertyDescriptor[] DESCRIPTORS;

    private final ComponentReferenceModel _model;

    /* package */ComponentReferenceModelPropertySource(ComponentReferenceModel model) {
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
        } else if (PROP_INTERFACE.equals(id)) {
            return _model.getInterface();
        } else if (PROP_POLICIES.equals(id)) {
            return _model.getPolicyRequirements();
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
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_NAME, Messages.ComponentReferenceModelPropertySource_propertyDescriptor_name),
                new PropertyDescriptor(PROP_INTERFACE, Messages.ComponentReferenceModelPropertySource_propertyDescriptor_interface),
                new PropertyDescriptor(PROP_POLICIES, Messages.ComponentReferenceModelPropertySource_propertyDescriptor_policyRequirements) };
        DESCRIPTORS[0].setDescription(Messages.ComponentReferenceModelPropertySource_propertyDescriptorDescription_name);
        DESCRIPTORS[1].setDescription(Messages.ComponentReferenceModelPropertySource_propertyDescriptorDescription_interface);
        DESCRIPTORS[1].setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return ((InterfaceModel) element).getType();
            }
        });
        DESCRIPTORS[2].setDescription(Messages.ComponentReferenceModelPropertySource_propertyDescriptorDescription_policyRequirements);
    }
}
