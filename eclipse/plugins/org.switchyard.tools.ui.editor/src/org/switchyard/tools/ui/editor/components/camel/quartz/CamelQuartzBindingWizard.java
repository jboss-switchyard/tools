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
package org.switchyard.tools.ui.editor.components.camel.quartz;

import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractBindingWizard;
import org.switchyard.tools.ui.editor.diagram.binding.IBindingWizard;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * CamelQuartzBindingWizard
 * 
 * <p/>
 * Wizard for creating new CamelQuartzBindingType objects.
 * 
 * @author bfitzpat
 */
public class CamelQuartzBindingWizard extends AbstractBindingWizard implements IBindingWizard {

    @Override
    protected Binding createBinding() {
        final CamelQuartzBindingType binding = QuartzFactory.eINSTANCE.createCamelQuartzBindingType();
        final String contractName = getTargetContainer().getName();
        binding.setName(contractName == null ? makeUniqueName("scheduler") : contractName);
        return binding;
    }

    @Override
    protected List<IBindingComposite> createComposites() {
        return CamelQuartzBindingTypeExtension.createComposites();
    }

}
