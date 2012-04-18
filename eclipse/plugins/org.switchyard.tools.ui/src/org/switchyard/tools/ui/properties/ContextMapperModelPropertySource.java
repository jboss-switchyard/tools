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

/**
 * ContextMapperModelPropertySource
 * 
 * <p/>
 * Provides properties for SwitchYardModel.
 * 
 * @author Rob Cernich
 */
public class ContextMapperModelPropertySource implements IPropertySource {

    private static final String PROP_CLASS = "class";
    private static final String PROP_INCLUDES = "includes";
    private static final String PROP_EXCLUDES = "excludes";
    private static final String PROP_INCLUDE_NAMESPACES = "include-namespaces";
    private static final String PROP_EXCLUDE_NAMESPACES = "exclude-namespaces";
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
            return Strings.trimToNull(_model.getModelConfiguration().getAttribute("class"));
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
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_CLASS, "Class"),
                new PropertyDescriptor(PROP_INCLUDES, "Includes"), new PropertyDescriptor(PROP_EXCLUDES, "Excludes"),
                new PropertyDescriptor(PROP_INCLUDE_NAMESPACES, "Include Namespaces"),
                new PropertyDescriptor(PROP_EXCLUDE_NAMESPACES, "Exclude Namespaces") };
        DESCRIPTORS[0].setDescription("The class implementing the context mapper.");
        DESCRIPTORS[1].setDescription("The included context properties.");
        DESCRIPTORS[2].setDescription("The excluded context properties.");
        DESCRIPTORS[3].setDescription("The included namespaces.");
        DESCRIPTORS[4].setDescription("The excluded namespaces.");
    }
}
