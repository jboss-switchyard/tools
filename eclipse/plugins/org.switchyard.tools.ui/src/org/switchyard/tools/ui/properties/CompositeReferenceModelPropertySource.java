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
import org.switchyard.config.model.composite.CompositeReferenceModel;
import org.switchyard.config.model.composite.InterfaceModel;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * CompositeReferenceModelPropertySource
 * 
 * <p/>
 * Provides properties for CompositeReferenceModel.
 * 
 * @author Rob Cernich
 */
public class CompositeReferenceModelPropertySource implements IPropertySource {

    private static final String PROP_NAME = "name"; //$NON-NLS-1$
    private static final String PROP_INTERFACE = "interface"; //$NON-NLS-1$
    private static final String PROP_PROMOTE = "promote"; //$NON-NLS-1$
    private static final PropertyDescriptor[] DESCRIPTORS;

    private final CompositeReferenceModel _model;

    /* package */CompositeReferenceModelPropertySource(CompositeReferenceModel model) {
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
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_NAME, Messages.CompositeReferenceModelPropertySource_propertyDescriptor_name),
                new PropertyDescriptor(PROP_PROMOTE, Messages.CompositeReferenceModelPropertySource_propertyDescriptor_promotedReference),
                new PropertyDescriptor(PROP_INTERFACE, Messages.CompositeReferenceModelPropertySource_propertyDescriptor_interface) };
        DESCRIPTORS[0].setDescription(Messages.CompositeReferenceModelPropertySource_propertyDescriptorDescription_name);
        DESCRIPTORS[1].setDescription(Messages.CompositeReferenceModelPropertySource_propertyDescriptorDescription_promotedReference);
        DESCRIPTORS[2].setDescription(Messages.CompositeReferenceModelPropertySource_propertyDescriptorDescription_interface);
        DESCRIPTORS[2].setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return ((InterfaceModel) element).getType();
            }
        });
    }
}
