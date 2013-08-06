/*************************************************************************************
 * Copyright (c) 2013 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.components.binding.sca;

import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.SCABinding;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractBindingWizard;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * BindingSCAWizard
 * 
 * <p/>
 * Wizard for creating new SCA Binding objects.
 */
public class BindingSCAWizard extends AbstractBindingWizard {

    @Override
    protected Binding createBinding() {
        final SCABinding binding = ScaFactory.eINSTANCE.createSCABinding();
        binding.setName(makeUniqueName("sca"));
        return binding;
    }

    @Override
    protected List<IBindingComposite> createComposites() {
        return BindingSCATypeExtension.createComposites(getTargetContainer() instanceof Service);
    }

}
