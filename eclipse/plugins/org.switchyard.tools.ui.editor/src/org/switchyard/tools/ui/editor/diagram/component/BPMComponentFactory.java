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
package org.switchyard.tools.ui.editor.diagram.component;

import org.eclipse.core.runtime.Path;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.ui.editor.diagram.component.wizards.IComponentWizard;
import org.switchyard.tools.ui.editor.diagram.component.wizards.NewBPMComponentWizard;

/**
 * BPMComponentFactory
 * 
 * <p/>
 * Factory for creating a new component based on a BPM implementation.
 * 
 * @author Rob Cernich
 */
public class BPMComponentFactory extends BaseComponentFactory {

    @Override
    protected IComponentWizard createTypeWizard() {
        return new NewBPMComponentWizard(true);
    }

    @Override
    protected String getComponentName(Implementation implementation, Composite container) {
        return makeUniqueComponentName(getTypeName((BPMImplementationType) implementation), container);
    }

    private String getTypeName(BPMImplementationType implementation) {
        return new Path(implementation.getProcessDefinition()).removeFileExtension().lastSegment();
    }

}
