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

import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.swt.widgets.Shell;
import org.switchyard.tools.ui.editor.diagram.component.wizards.IComponentWizard;
import org.switchyard.tools.ui.editor.diagram.implementation.IImplementationTypeFactory;

/**
 * ComponentWithImplementationFactory
 * 
 * <p/>
 * Factory for creating a new component based on an implementation factory.
 * 
 * @deprecated when creating components, we no longer allow the user to select
 *             an existing implementation. Should that change, this class is
 *             around to support it.
 * 
 * @author Rob Cernich
 */
public class ComponentWithImplementationFactory extends BaseComponentFactory {

    private IImplementationTypeFactory _delegate;

    /**
     * Create a new ComponentWithImplementationFactory.
     * 
     * @param delegate the implementation factory to delegate to.
     */
    public ComponentWithImplementationFactory(IImplementationTypeFactory delegate) {
        _delegate = delegate;
    }

    @Override
    public Component createType(Shell shell, Composite container) {
        final Implementation implementation = _delegate.createType(shell, null);
        if (implementation == null) {
            return null;
        }

        // create the component
        final Component component = ScaFactory.eINSTANCE.createComponent();

        component.setName(getComponentName(implementation, container));

        component.getImplementationGroup().set(implementation.getDocumentFeature(), implementation);

        // add any new services
        final ComponentService service = _delegate.getImplementedService();
        if (service != null) {
            component.getService().add(service);
        }

        // add any new references
        final List<ComponentReference> references = _delegate.getImplementationReferences();
        if (references != null) {
            for (ComponentReference reference : references) {
                component.getReference().add(reference);
            }
        }

        return component;
    }

    @Override
    protected IComponentWizard createTypeWizard() {
        return null;
    }

}
