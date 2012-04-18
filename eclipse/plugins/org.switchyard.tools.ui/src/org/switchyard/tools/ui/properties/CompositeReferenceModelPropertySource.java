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

/**
 * CompositeReferenceModelPropertySource
 * 
 * <p/>
 * Provides properties for CompositeReferenceModel.
 * 
 * @author Rob Cernich
 */
public class CompositeReferenceModelPropertySource implements IPropertySource {

    private static final String PROP_NAME = "name";
    private static final String PROP_INTERFACE = "interface";
    private static final String PROP_PROMOTE = "promote";
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
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_NAME, "Name"),
                new PropertyDescriptor(PROP_PROMOTE, "Promoted Reference"),
                new PropertyDescriptor(PROP_INTERFACE, "Interface") };
        DESCRIPTORS[0].setDescription("The name for the SwitchYard service reference.");
        DESCRIPTORS[1].setDescription("The promoted component reference.");
        DESCRIPTORS[2].setDescription("The interface details for the service reference.");
        DESCRIPTORS[2].setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return ((InterfaceModel) element).getType();
            }
        });
    }
}
