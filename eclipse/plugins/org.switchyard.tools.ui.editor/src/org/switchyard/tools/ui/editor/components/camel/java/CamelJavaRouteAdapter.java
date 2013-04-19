/*************************************************************************************
 * Copyright (c) 2013 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.components.camel.java;

import org.eclipse.core.runtime.IAdapterFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType;

/**
 * @author bfitzpat
 *
 */
@SuppressWarnings({"rawtypes", "unchecked" })
public class CamelJavaRouteAdapter implements IAdapterFactory {

    private static final Class[] ADAPTER_LIST = new Class[] {JavaDSLType.class};

    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adapterType.isAssignableFrom(JavaDSLType.class)) {
            if (adaptableObject instanceof CamelImplementationType) {
                return getJavaRouteClass(adaptableObject);
            }
        }
        return null;
    }

    @Override
    public Class[] getAdapterList() {
        return ADAPTER_LIST;
    }

    private Object getJavaRouteClass(Object adaptableObject) {
        CamelImplementationType camelImpl = (CamelImplementationType) adaptableObject;
        if (camelImpl.getJava() != null) {
            return camelImpl.getJava();
        }
        return null;
    }

}
