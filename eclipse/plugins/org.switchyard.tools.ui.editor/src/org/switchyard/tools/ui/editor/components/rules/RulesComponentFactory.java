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
package org.switchyard.tools.ui.editor.components.rules;

import org.eclipse.core.runtime.Path;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.models.switchyard1_0.rules.ResourceType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.ui.editor.diagram.component.BaseComponentFactory;
import org.switchyard.tools.ui.editor.diagram.component.IComponentWizard;

/**
 * RulesComponentFactory
 * 
 * <p/>
 * Factory for creating a new component based on a rules implementation.
 * 
 * @author Rob Cernich
 */
public class RulesComponentFactory extends BaseComponentFactory {

    @Override
    protected IComponentWizard createTypeWizard() {
        return new NewRulesComponentWizard(false);
    }

    @Override
    protected String getComponentName(Implementation implementation, Composite container) {
        return makeUniqueComponentName(getTypeName((RulesImplementationType) implementation), container);
    }

    private String getTypeName(RulesImplementationType implementation) {
        if (implementation.getManifest() != null && implementation.getManifest().getResources() != null) {
            for (ResourceType resource : implementation.getManifest().getResources().getResource()) {
                return new Path(resource.getLocation()).removeFileExtension().lastSegment();
            }
        }
        return "RulesComponent";
    }

}
