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
package org.switchyard.tools.ui.editor.diagram.component.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

/**
 * NewBPMExtraResourcesWizardPage
 * 
 * <p/>
 * Provides details regarding additional resources used by the process, e.g.
 * task handlers, rules, etc.
 * 
 * @author Rob Cernich
 */
public class NewBPMExtraResourcesWizardPage extends WizardPage {

    /**
     * Create a new NewBPMExtraResourcesWizardPage.
     * 
     * @param pageName the page name.
     */
    public NewBPMExtraResourcesWizardPage(String pageName) {
        super(pageName);
    }

    @Override
    public void createControl(Composite parent) {
        // FIXME createControl

    }

}
