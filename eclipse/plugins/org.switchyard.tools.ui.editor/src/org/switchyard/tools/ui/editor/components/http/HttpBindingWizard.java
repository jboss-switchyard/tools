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
package org.switchyard.tools.ui.editor.components.http;

import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractBindingWizard;
import org.switchyard.tools.ui.editor.diagram.binding.IBindingWizard;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * ResteasyBindingWizard
 * 
 * <p/>
 * Wizard for creating new ResteasyBindingType objects.
 * 
 * @author bfitzpat
 */
public class HttpBindingWizard extends AbstractBindingWizard implements IBindingWizard {

    @Override
    protected Binding createBinding() {
        final HTTPBindingType binding = HttpFactory.eINSTANCE.createHTTPBindingType();
        binding.setName(makeUniqueName("http")); //$NON-NLS-1$
        return binding;
    }

    @Override
    protected List<IBindingComposite> createComposites() {
        return HttpBindingTypeExtension.createComposites(getToolkit(), getTargetContainer() instanceof Service);
    }

}
