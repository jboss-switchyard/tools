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
package org.switchyard.tools.ui.editor.transform;

import org.eclipse.swt.widgets.Composite;

/**
 * JavaTransformProvider
 * 
 * <p/>
 * Provides UI and factory for creating Java transformer objects.
 */
public class JavaTransformProvider implements ITransformProvider {

    @Override
    public boolean providesWizard() {
        return true;
    }

    @Override
    public INewTransformWizard createWizard() {
        return new NewJavaTransformerWizard();
    }

    @Override
    public ITransformControl createTransformControl(Composite parent, IContainer container) {
        return null;
    }

    @Override
    public String getName() {
        return "Java Transformer";
    }

}
