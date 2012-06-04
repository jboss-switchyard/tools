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
package org.switchyard.tools.ui.editor.diagram.component.wizards;

import java.util.List;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;

/**
 * IImplementationWizard
 * 
 * <p/>
 * Base interface for implementation wizards.
 * 
 * @author Rob Cernich
 */
public interface IImplementationWizard extends IWizard {

    /**
     * @return the new implementation.
     */
    public Implementation getImplementation();

    /**
     * @return the services implemented by the implementation.
     */
    public List<ComponentService> getImplementationServices();

    /**
     * @return the services referenced by the implementation.
     */
    public List<ComponentReference> getImplementationReferences();

}
