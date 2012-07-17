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
package org.switchyard.tools.ui.editor.components.bean;

import org.switchyard.tools.ui.editor.diagram.implementation.BaseImplementationFactory;
import org.switchyard.tools.ui.editor.diagram.implementation.IImplementationWizard;

/**
 * BeanImplementationFactory
 * 
 * <p/>
 * Factory for creating BeanImplementation types.
 * 
 * @author Rob Cernich
 */
public class BeanImplementationFactory extends BaseImplementationFactory {

    @Override
    protected IImplementationWizard createTypeWizard() {
        return new BeanImplementationWizard();
    }
}
