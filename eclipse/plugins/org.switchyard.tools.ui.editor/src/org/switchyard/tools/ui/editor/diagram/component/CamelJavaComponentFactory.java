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
package org.switchyard.tools.ui.editor.diagram.component;

import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.ui.editor.diagram.component.wizards.IComponentWizard;
import org.switchyard.tools.ui.editor.diagram.component.wizards.NewCamelJavaRouteComponentWizard;

/**
 * BeanComponentFactory
 * 
 * <p/>
 * Factory for creating a new component based on a Bean implementation.
 * 
 * @author Rob Cernich
 */
public class CamelJavaComponentFactory extends BaseComponentFactory {

    @Override
    protected IComponentWizard createTypeWizard() {
        return new NewCamelJavaRouteComponentWizard();
    }

    @Override
    protected String getComponentName(Implementation implementation, Composite container) {
        return getTypeName((CamelImplementationType) implementation);
    }

    private String getTypeName(CamelImplementationType implementation) {
        final String name = implementation.getJava().getClass_();
        final int index = name.lastIndexOf('.');
        if (index < 0) {
            return name;
        }
        return name.substring(index + 1);
    }

}
