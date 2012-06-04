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

import org.switchyard.tools.ui.editor.diagram.component.wizards.CamelXMLImplementationWizard;
import org.switchyard.tools.ui.editor.diagram.component.wizards.IImplementationWizard;

/**
 * CamelXMLImplementationFactory
 * 
 * <p/>
 * Factory for creating Camel XML based route implementations.
 * 
 * @author Rob Cernich
 */
public class CamelXMLImplementationFactory extends BaseImplementationFactory {

    @Override
    protected IImplementationWizard createImplementationWizard() {
        return new CamelXMLImplementationWizard();
    }

}
