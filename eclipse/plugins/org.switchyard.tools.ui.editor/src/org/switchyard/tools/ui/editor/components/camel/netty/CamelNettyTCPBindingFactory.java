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
package org.switchyard.tools.ui.editor.components.camel.netty;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.switchyard.tools.ui.editor.diagram.binding.IBindingWizard;
import org.switchyard.tools.ui.editor.diagram.shared.BaseTypeFactory;

/**
 * CamelFileBindingFactory
 * 
 * <p/>
 * Factory for creating new Camel File bindings.
 * 
 * @author Rob Cernich
 */
public class CamelNettyTCPBindingFactory extends BaseTypeFactory<Binding, Contract, IBindingWizard> {

    @Override
    protected IBindingWizard createTypeWizard() {
        return new CamelNettyTCPBindingWizard();
    }

}
