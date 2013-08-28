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

import org.eclipse.ui.internal.wizards.AbstractExtensionWizardRegistry;
import org.switchyard.tools.ui.Activator;

/**
 * NewArtifactReferenceWizardRegistry
 * 
 * <p/>
 * Manages wizards contributed by a repository provider.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class NewArtifactReferenceWizardRegistry extends AbstractExtensionWizardRegistry {

    private static final NewArtifactReferenceWizardRegistry INSTANCE = new NewArtifactReferenceWizardRegistry();

    /**
     * @return the registry instance.
     */
    public static NewArtifactReferenceWizardRegistry instance() {
        return INSTANCE;
    }

    @Override
    protected String getExtensionPoint() {
        return "repositorySupport"; //$NON-NLS-1$
    }

    @Override
    protected String getPlugin() {
        return Activator.PLUGIN_ID;
    }

}
