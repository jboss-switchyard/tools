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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.widgets.Shell;
import org.switchyard.tools.ui.editor.diagram.component.wizards.IComponentWizard;
import org.switchyard.tools.ui.editor.diagram.shared.BaseTypeFactory;
import org.switchyard.tools.ui.editor.diagram.shared.ITypeFactory;

/**
 * BaseComponentFactory
 * 
 * <p/>
 * Base factory creating a component with no implementation.
 * 
 * @author Rob Cernich
 */
public abstract class BaseComponentFactory extends BaseTypeFactory<Component, Composite, IComponentWizard> implements
        ITypeFactory<Component, Composite> {

    @Override
    public Component createType(Shell shell, Composite container) {
        // create the component
        final Component component = super.createType(shell, container);
        if (component.getName() == null) {
            component.setName(getComponentName(component.getImplementation(), container));
        } else {
            component.setName(makeUniqueComponentName(component.getName(), container));
        }

        return component;
    }

    /**
     * Create a name for the new component. Default returns "Component".
     * 
     * @param implementation the new implementation
     * @param container the composite container
     * 
     * @return the name for the new component
     */
    protected String getComponentName(Implementation implementation, Composite container) {
        return makeUniqueComponentName("Component", container);
    }

    /**
     * Uniquifies the name by adding a digit to the baseName.
     * 
     * @param baseName the base name
     * @param container the containing composite
     * 
     * @return a uniquified name.
     */
    protected String makeUniqueComponentName(String baseName, Composite container) {
        // collect the existing names
        final Set<String> componentNames = new HashSet<String>();
        for (Component component : container.getComponent()) {
            if (component.getName() != null) {
                componentNames.add(component.getName());
            }
        }

        String componentName = baseName;
        int count = 1;
        while (componentNames.contains(componentName)) {
            // create a unique name
            componentName = baseName + count++;
        }

        return componentName;
    }

}
