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
import org.switchyard.config.model.switchyard.SwitchYardModel;

/**
 * SwitchYardModelPropertySource
 * 
 * <p/>
 * Provides properties for SwitchYardModel.
 * 
 * @author Rob Cernich
 */
public class SwitchYardModelPropertySource implements IPropertySource {

    private static final String PROP_NAME = "name";
    private static final String PROP_TARGET_NAMESPACE = "targetNamespace";
    private static final PropertyDescriptor[] DESCRIPTORS;

    private final SwitchYardModel _model;

    /* package */SwitchYardModelPropertySource(SwitchYardModel model) {
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
        } else if (PROP_TARGET_NAMESPACE.equals(id)) {
            if (_model.getTargetNamespace() == null) {
                if (_model.getComposite() == null) {
                    return null;
                }
                return _model.getComposite().getTargetNamespace();
            }
            return _model.getTargetNamespace();
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
                new PropertyDescriptor(PROP_TARGET_NAMESPACE, "Target Namespace") };
        DESCRIPTORS[0].setDescription("The name for the SwitchYard application.");
        DESCRIPTORS[1].setDescription("The target namespace for the SwitchYard application.");
    }
}
