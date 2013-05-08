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
package org.switchyard.tools.ui.bpel;

import javax.xml.namespace.QName;

import org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.ui.editor.diagram.component.BaseComponentFactory;
import org.switchyard.tools.ui.editor.diagram.component.IComponentWizard;

/**
 * BPELComponentFactory
 * 
 * <p/>
 * Factory for creating a new component based on a BPEL implementation.
 * 
 * @author Rob Cernich
 */
public class BPELComponentFactory extends BaseComponentFactory {

    @Override
    protected IComponentWizard createTypeWizard() {
        return new BPELComponentWizard(false);
    }

    @Override
    protected String getComponentName(Implementation implementation, Composite container) {
        return makeUniqueComponentName(getTypeName((BPELImplementation) implementation), container);
    }

    private String getTypeName(BPELImplementation implementation) {
        final QName process = implementation.getProcess();
        if (process == null || process.getLocalPart() == null || process.getLocalPart().length() == 0) {
            return "BPELProcess";
        }
        return process.getLocalPart();
    }

}
