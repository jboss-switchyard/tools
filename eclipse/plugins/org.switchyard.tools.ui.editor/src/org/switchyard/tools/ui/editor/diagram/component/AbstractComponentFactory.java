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

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.swt.widgets.Shell;

/**
 * AbstractComponentFactory
 * 
 * <p/>
 * Factory for creating a new abstract component with no implementation.
 * 
 * @author Rob Cernich
 */
public class AbstractComponentFactory extends BaseComponentFactory {

    @Override
    public Component createType(Shell shell, Composite container) {
        final Component component = ScaFactory.eINSTANCE.createComponent();
        component.setName(getComponentName(null, container));

        return component;
    }

    @Override
    protected IComponentWizard createTypeWizard() {
        return null;
    }

}
