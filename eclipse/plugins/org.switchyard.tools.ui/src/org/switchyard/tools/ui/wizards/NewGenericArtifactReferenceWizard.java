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
package org.switchyard.tools.ui.wizards;

import org.eclipse.ui.IWorkbenchWizard;

/**
 * NewGenericArtifactReferenceWizard
 * 
 * <p/>
 * Wizard supporting the creation of a "generic" artifact reference.
 * 
 * @author Rob Cernich
 */
public class NewGenericArtifactReferenceWizard extends NewArtifactReferenceWizard implements IWorkbenchWizard {

    /**
     * Create a new NewGenericArtifactReferenceWizard.
     */
    public NewGenericArtifactReferenceWizard() {
        super(false);
        setWindowTitle("Generic Artifact Reference");
    }

    @Override
    public void addPages() {
        addPage(getArtifactDetailsPage());
    }

}
