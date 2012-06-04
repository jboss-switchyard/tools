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
package org.switchyard.tools.ui.editor.diagram.shared;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Shell;

/**
 * IExtendedTypeFactory
 * 
 * <p/>
 * Interface to be implemented by wizards providing support for extended types.
 * For example, CamelImplementation, which extends Implementation.
 * 
 * @param <T> the extended type
 * @param <C> the container type
 * 
 * @author Rob Cernich
 */
public interface ITypeFactory<T extends EObject, C extends EObject> {

    /**
     * @param shell the shell in which the factory is executing.
     * @param container the object which will contain the new object.
     * 
     * @return the created implementation.
     */
    public T createType(Shell shell, C container);

}
