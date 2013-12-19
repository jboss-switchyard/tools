/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.debug.structure;

import org.eclipse.debug.internal.ui.viewers.model.provisional.IModelProxy;
import org.eclipse.debug.internal.ui.viewers.model.provisional.IModelProxyFactory;
import org.eclipse.debug.internal.ui.viewers.model.provisional.IPresentationContext;

/**
 * SwitchYardModelProxyFactory
 * <p/>
 * IModelProxyFactory supporting SwitchYardContext objects.
 */
@SuppressWarnings("restriction")
public class SwitchYardModelProxyFactory implements IModelProxyFactory {

    @Override
    public IModelProxy createModelProxy(Object element, IPresentationContext context) {
        if (element instanceof SwitchYardContext) {
            return new SwitchYardContextModelProxy((SwitchYardContext) element);
        }
        return null;
    }

}
