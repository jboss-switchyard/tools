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
package org.switchyard.tools.ui.editor.diagram.implementation;

import org.switchyard.tools.ui.editor.diagram.component.wizards.CamelJavaImplementationWizard;
import org.switchyard.tools.ui.editor.diagram.component.wizards.IImplementationWizard;

/**
 * CamelJavaImplementationFactory
 * 
 * <p/>
 * Factory for creating Camel Java based route implementations.
 * 
 * @author Rob Cernich
 */
public class CamelJavaImplementationFactory extends BaseImplementationFactory {

    @Override
    protected IImplementationWizard createTypeWizard() {
        return new CamelJavaImplementationWizard();
    }

}
