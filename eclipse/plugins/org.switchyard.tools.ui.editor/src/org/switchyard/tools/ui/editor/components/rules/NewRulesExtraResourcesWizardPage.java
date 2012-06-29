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

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

/**
 * NewRulesExtraResourcesWizardPage
 * 
 * <p/>
 * Provides details regarding additional resources used by the process, e.g.
 * other rules, etc.
 * 
 * @author Rob Cernich
 */
public class NewRulesExtraResourcesWizardPage extends WizardPage {

    /**
     * Create a new NewRulesExtraResourcesWizardPage.
     * 
     * @param pageName the page name.
     */
    public NewRulesExtraResourcesWizardPage(String pageName) {
        super(pageName);
    }

    @Override
    public void createControl(Composite parent) {
        // FIXME createControl

    }

}
