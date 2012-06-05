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
import org.eclipse.jface.wizard.IWizard;

/**
 * ITypeWizard
 * 
 * <p/>
 * Base interface for wizards providing support for extended types.
 * 
 * @param <T> the type of object to be created.
 * @param <C> the type containing the object.
 * 
 * @author Rob Cernich
 */
public interface ITypeWizard<T extends EObject, C extends EObject> extends IWizard {

    /**
     * Returns the created object. It is the caller's responsibility to
     * associate the new object with the model.
     * 
     * @return the newly created object.
     */
    public T getCreatedObject();

    /**
     * The container should be used by implementors to initialize the wizard
     * using the target container for the object to be created.
     * 
     * @param container the container for the object being created.
     */
    public void init(C container);
}
