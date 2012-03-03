/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2012 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
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
        return "repositorySupport";
    }

    @Override
    protected String getPlugin() {
        return Activator.PLUGIN_ID;
    }

}
