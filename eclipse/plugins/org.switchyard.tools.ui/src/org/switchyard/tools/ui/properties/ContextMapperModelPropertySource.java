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
import org.switchyard.common.lang.Strings;
import org.switchyard.config.model.composer.ContextMapperModel;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * ContextMapperModelPropertySource
 * 
 * <p/>
 * Provides properties for SwitchYardModel.
 * 
 * @author Rob Cernich
 */
public class ContextMapperModelPropertySource implements IPropertySource {

    private static final String PROP_CLASS = "class"; //$NON-NLS-1$
    private static final String PROP_INCLUDES = "includes"; //$NON-NLS-1$
    private static final String PROP_EXCLUDES = "excludes"; //$NON-NLS-1$
    private static final String PROP_INCLUDE_NAMESPACES = "include-namespaces"; //$NON-NLS-1$
    private static final String PROP_EXCLUDE_NAMESPACES = "exclude-namespaces"; //$NON-NLS-1$
    private static final PropertyDescriptor[] DESCRIPTORS;

    private final ContextMapperModel _model;

    /* package */ContextMapperModelPropertySource(ContextMapperModel model) {
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
            return Strings.trimToNull(_model.getModelConfiguration().getAttribute("class")); //$NON-NLS-1$
        } else if (PROP_INCLUDES.equals(id)) {
            return _model.getIncludes();
        } else if (PROP_EXCLUDES.equals(id)) {
            return _model.getExcludes();
        } else if (PROP_INCLUDE_NAMESPACES.equals(id)) {
            return _model.getIncludeNamespaces();
        } else if (PROP_EXCLUDE_NAMESPACES.equals(id)) {
            return _model.getExcludeNamespaces();
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
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_CLASS, Messages.ContextMapperModelPropertySource_propertyDescriptor_class),
                new PropertyDescriptor(PROP_INCLUDES, Messages.ContextMapperModelPropertySource_propertyDescriptor_includes), new PropertyDescriptor(PROP_EXCLUDES, Messages.ContextMapperModelPropertySource_propertyDescriptor_exludes),
                new PropertyDescriptor(PROP_INCLUDE_NAMESPACES, Messages.ContextMapperModelPropertySource_propertyDescriptor_includesNS),
                new PropertyDescriptor(PROP_EXCLUDE_NAMESPACES, Messages.ContextMapperModelPropertySource_propertyDescriptor_excludesNS) };
        DESCRIPTORS[0].setDescription(Messages.ContextMapperModelPropertySource_propertyDescriptorDescription_class);
        DESCRIPTORS[1].setDescription(Messages.ContextMapperModelPropertySource_propertyDescriptorDescription_includes);
        DESCRIPTORS[2].setDescription(Messages.ContextMapperModelPropertySource_propertyDescriptorDescription_excludes);
        DESCRIPTORS[3].setDescription(Messages.ContextMapperModelPropertySource_propertyDescriptorDescription_includesNS);
        DESCRIPTORS[4].setDescription(Messages.ContextMapperModelPropertySource_propertyDescriptorDescription_excludesNS);
    }
}
