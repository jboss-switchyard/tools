/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.property.adapters;

import org.eclipse.emf.ecore.EObject;
import org.switchyard.tools.models.switchyard1_0.bean.BeanImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.ui.editor.components.bean.BeanImplementationComposite;
import org.switchyard.tools.ui.editor.components.camel.java.CamelJavaRouteComposite;
import org.switchyard.tools.ui.editor.components.camel.xml.CamelXMLRouteComposite;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;

/**
 * @author bfitzpat
 * 
 */
public final class ImplementationCompositeAdapter {

    private ImplementationCompositeAdapter() {
        // empty constructor
    }

    /**
     * @param object incoming model object
     * @return outgoing composite instance or null
     */
    public static AbstractSwitchyardComposite adaptModelToComposite(EObject object) {
        AbstractSwitchyardComposite composite = null;
        if (object instanceof CamelImplementationType) {
            if (((CamelImplementationType) object).getJava() == null) {
                composite = new CamelXMLRouteComposite();
            } else {
                composite = new CamelJavaRouteComposite();
            }
        } else if (object instanceof BeanImplementationType) {
            composite = new BeanImplementationComposite();
        }
        if (composite != null) {
            return composite;
        }
        return null;
    }

}
