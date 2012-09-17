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
import org.switchyard.common.lang.Strings;
import org.switchyard.config.model.composer.ContextMapperModel;
import org.switchyard.config.model.composite.BindingModel;

/**
 * BindingModelPropertySource
 * 
 * <p/>
 * Provides properties for BindingModel.
 * 
 * @author Rob Cernich
 */
public class BindingModelPropertySource implements IPropertySource {

    private static final String PROP_TYPE = "type";
    private static final String PROP_CONTEXT_MAPPER = "context-mapper";
    private static final String PROP_MESSAGE_COMPOSER = "message-composer";
    private static final String PROP_OPERATION_SELECTOR = "operation-selector";
    protected static final PropertyDescriptor[] DESCRIPTORS;

    private final BindingModel _model;

    /* package */BindingModelPropertySource(BindingModel model) {
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
        if (PROP_TYPE.equals(id)) {
            return _model.getType();
        } else if (PROP_CONTEXT_MAPPER.equals(id)) {
            return _model.getContextMapper();
        } else if (PROP_MESSAGE_COMPOSER.equals(id)) {
            if (_model.getMessageComposer() == null) {
                return null;
            }
            return _model.getMessageComposer().getClazz();
//        } else if (PROP_OPERATION_SELECTOR.equals(id)) {
//            OperationSelector selector = _model.getOperationSelector();
//            if (selector == null || selector.getOperationName() == null) {
//                return null;
//            }
//            return new QName(selector.getNamespace(), selector.getOperationName());
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
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_TYPE, "Binding Type"),
                new PropertyDescriptor(PROP_CONTEXT_MAPPER, "Context Mapper"),
                new PropertyDescriptor(PROP_MESSAGE_COMPOSER, "Message Composer"),
                new PropertyDescriptor(PROP_OPERATION_SELECTOR, "Operation Selector")};
        DESCRIPTORS[0].setDescription("The binding type.");
        DESCRIPTORS[0].setCategory("General");
        DESCRIPTORS[1].setDescription("The context mapper for the binding.");
        DESCRIPTORS[1].setCategory("General");
        DESCRIPTORS[1].setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return Strings.trimToNull(((ContextMapperModel) element).getModelConfiguration().getAttribute("class"));
            }
        });
        DESCRIPTORS[1].setDescription("The message composer for the binding.");
        DESCRIPTORS[2].setCategory("General");
    }
}
