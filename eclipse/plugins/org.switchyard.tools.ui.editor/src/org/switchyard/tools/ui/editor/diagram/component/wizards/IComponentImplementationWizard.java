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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.ILinkedWizard;

/**
 * IComponentImplementationWizard
 * 
 * <p/>
 * Interface to be implemented by wizards providing support for component
 * implementations.
 * 
 * @author Rob Cernich
 */
public interface IComponentImplementationWizard extends ILinkedWizard {

    /**
     * @return the display name for this wizard (e.g. Camel).
     */
    public String getDisplayName();

    /**
     * @return the created implementation.
     */
    public Implementation getImplementation();

    /**
     * @param implementation the existing implementation.
     * @throws ClassCastException if the wizard does not support the
     *             implementation type.
     */
    public void setImplementation(Implementation implementation) throws ClassCastException;

    /**
     * Returns the structural feature corresponding to the Implementation type.
     * For example:
     * 
     * <pre>
     * <code>
     * return CamelPackage.eINSTANCE.getDocumentRoot_ImplementationCamel();
     * </code>
     * </pre>
     * 
     * @return the corresponding structural feature
     */
    public EStructuralFeature getFeatureForImplementation();

    // extra methods for introspecting implementation
    /**
     * @return any services implemented by the implementation.
     */
    public List<ComponentService> getImplementationServices();

    /**
     * @return any services referenced by the implementation.
     */
    public List<ComponentReference> getImplementationReferences();
}
