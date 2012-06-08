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
package org.switchyard.tools.ui.editor.diagram.implementation;

import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.ui.editor.diagram.shared.ITypeFactory;

/**
 * IImplementationTypeFactory
 * 
 * <p/>
 * Factory for creating new Implementation types.
 * 
 * @author Rob Cernich
 */
public interface IImplementationTypeFactory extends ITypeFactory<Implementation, Component> {

    /**
     * @return any service implemented by the implementation.
     */
    public ComponentService getImplementedService();

    /**
     * @return any services referenced by the implementation.
     */
    public List<ComponentReference> getImplementationReferences();
}
