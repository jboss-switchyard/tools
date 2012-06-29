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

import org.switchyard.tools.ui.editor.diagram.component.wizards.IImplementationWizard;
import org.switchyard.tools.ui.editor.diagram.implementation.BaseImplementationFactory;

/**
 * RulesImplementationFactory
 * 
 * <p/>
 * Factory for creating RulesImplementationType types.
 * 
 * @author Rob Cernich
 */
public class RulesImplementationFactory extends BaseImplementationFactory {

    @Override
    protected IImplementationWizard createTypeWizard() {
        return new RulesImplementationWizard();
    }
}
