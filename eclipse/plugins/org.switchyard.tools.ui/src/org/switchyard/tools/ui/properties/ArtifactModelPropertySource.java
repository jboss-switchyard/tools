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
import org.switchyard.config.model.switchyard.ArtifactModel;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * ArtifactModelPropertySource
 * 
 * <p/>
 * Provides properties for ArtifactModel.
 * 
 * @author Rob Cernich
 */
public class ArtifactModelPropertySource implements IPropertySource {

    private static final String PROP_NAME = "name"; //$NON-NLS-1$
    private static final String PROP_URL = "url"; //$NON-NLS-1$
    private static final PropertyDescriptor[] DESCRIPTORS;

    private final ArtifactModel _model;

    /* package */ArtifactModelPropertySource(ArtifactModel model) {
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
        } else if (PROP_URL.equals(id)) {
            return _model.getURL();
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
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_NAME, Messages.ArtifactModelPropertySource_propertyDescriptor_name),
                new PropertyDescriptor(PROP_URL, Messages.ArtifactModelPropertySource_propertyDescriptor_url) };
        DESCRIPTORS[0].setDescription(Messages.ArtifactModelPropertySource_propertyDescriptorDescription_name);
        DESCRIPTORS[1].setDescription(Messages.ArtifactModelPropertySource_propertyDescriptorDescription_url);
    }
}
