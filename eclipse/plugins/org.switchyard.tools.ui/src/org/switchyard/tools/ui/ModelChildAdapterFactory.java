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
package org.switchyard.tools.ui;

import java.util.List;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;

/**
 * PlatformResourceAdapterFactory
 * 
 * <p/>
 * Adapter factory for converting model objects to contained children, e.g.
 * Component->Implementation.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings({"rawtypes", "unchecked" })
public class ModelChildAdapterFactory implements IAdapterFactory {

    private static final Class[] ADAPTER_LIST = new Class[] {Implementation.class, Interface.class, Contract.class };

    @Override
    public Class[] getAdapterList() {
        return ADAPTER_LIST;
    }

    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adapterType.isAssignableFrom(Implementation.class)) {
            return getImplementation(adaptableObject);
        } else if (adapterType.isAssignableFrom(Interface.class)) {
            return getInterface(adaptableObject);
        } else if (adapterType.isAssignableFrom(Contract.class)) {
            return getContract(adaptableObject);
        }
        return null;
    }

    /**
     * @param adaptableObject the object to adapt
     * @return the interface defining the object
     */
    private Object getInterface(Object adaptableObject) {
        if (adaptableObject instanceof Contract) {
            return ((Contract) adaptableObject).getInterface();
        } else if (adaptableObject instanceof Component) {
            List<ComponentService> services = ((Component) adaptableObject).getService();
            return services == null || services.size() == 0 ? null : getInterface(services.get(0));
        }
        return null;
    }

    /**
     * @param adaptableObject the object to adapt
     * @return the implementation for the component
     */
    private Object getImplementation(Object adaptableObject) {
        if (adaptableObject instanceof Component) {
            return ((Component) adaptableObject).getImplementation();
        }
        return null;
    }

    /**
     * @param adaptableObject the object to adapt
     * @return the service defining the component
     */
    private Object getContract(Object adaptableObject) {
        if (adaptableObject instanceof Component) {
            List<ComponentService> services = ((Component) adaptableObject).getService();
            return services == null || services.size() == 0 ? null : services.get(0);
        }
        return null;
    }

}
