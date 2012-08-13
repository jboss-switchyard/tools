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
package org.switchyard.tools.ui.bpmn2;

import org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.property.JbpmCustomTaskDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.AbstractBpmn2PropertySection;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;

/**
 * SwitchYardServiceTaskPropertiesComposite
 * 
 * <p/>
 * Custom properties control for "SwitchYard Service" custom tasks.
 * 
 * @author Rob Cernich
 */
public class SwitchYardServiceTaskPropertiesComposite extends JbpmCustomTaskDetailComposite {

    /**
     * Create a new SwitchYardServiceTaskPropertiesComposite.
     * 
     * @param parent the parent composite.
     * @param style the style bits.
     */
    public SwitchYardServiceTaskPropertiesComposite(Composite parent, int style) {
        super(parent, style);
    }

    /**
     * Create a new SwitchYardServiceTaskPropertiesComposite.
     * 
     * @param section the containing section.
     */
    public SwitchYardServiceTaskPropertiesComposite(AbstractBpmn2PropertySection section) {
        super(section);
    }

    @Override
    public void createBindings(EObject be) {
        super.createBindings(be);

        // TODO:
        // custom controls for setting service, operation, input/output param
        // names, input/output values.
    }

}
