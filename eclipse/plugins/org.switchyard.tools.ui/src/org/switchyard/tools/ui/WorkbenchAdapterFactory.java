/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

/**
 * WorkbenchAdapterFactory
 * 
 * <p/>
 * Converts SwitchYard model objects to IWorkbenchAdapter objects.
 */
@SuppressWarnings({"rawtypes", "unchecked" })
public class WorkbenchAdapterFactory implements IAdapterFactory {

    private static final Class[] ADAPTER_LIST = new Class[] {IWorkbenchAdapter.class };

    @Override
    public Class[] getAdapterList() {
        return ADAPTER_LIST;
    }

    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adapterType.isAssignableFrom(IWorkbenchAdapter.class)) {
            return getWorkbenchAdapter(adaptableObject);
        }
        return null;
    }

    /**
     * @param adaptableObject the object to adapt
     * @return the workbench adapter
     */
    private Object getWorkbenchAdapter(Object adaptableObject) {
        return adaptableObject instanceof EObject ? new EObjectWorkbenchAdapter() : null;
    }

    private static final class EObjectWorkbenchAdapter implements IWorkbenchAdapter {

        @Override
        public Object[] getChildren(Object o) {
            return new Object[0];
        }

        @Override
        public ImageDescriptor getImageDescriptor(Object object) {
            return null;
        }

        @Override
        public String getLabel(Object o) {
            final EStructuralFeature nameFeature = ((EObject) o).eClass().getEStructuralFeature("name"); //$NON-NLS-1$
            return nameFeature == null ? "<implement me>" : "" + ((EObject) o).eGet(nameFeature); //$NON-NLS-1$ //$NON-NLS-2$
        }

        @Override
        public Object getParent(Object o) {
            return ((EObject) o).eContainer();
        }

    }
}
