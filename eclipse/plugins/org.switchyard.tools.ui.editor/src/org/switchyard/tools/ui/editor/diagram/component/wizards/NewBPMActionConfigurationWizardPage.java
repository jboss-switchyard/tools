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

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.switchyard.tools.models.switchyard1_0.bpm.ActionType1;

/**
 * NewBPMActionConfigurationWizardPage
 * 
 * <p/>
 * Provides details regarding the service interface to be implemented by the
 * process.
 * 
 * @author Rob Cernich
 */
public class NewBPMActionConfigurationWizardPage extends WizardPage {

    // operation name : action configuration
    private Map<String, ActionType1> _actions = new LinkedHashMap<String, ActionType1>();
    private TableViewer _actionsTable;

    /**
     * Create a new NewBPMActionConfigurationWizardPage.
     * 
     * @param pageName the page name.
     */
    public NewBPMActionConfigurationWizardPage(String pageName) {
        super(pageName);
    }

    @Override
    public void createControl(Composite parent) {
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout());

        Label label = new Label(contents, SWT.NONE);
        label.setText("Actions:");

        _actionsTable = new TableViewer(contents, SWT.H_SCROLL | SWT.V_SCROLL);
        // TODO: initialize providers, cell editors, etc.
        _actionsTable.setInput(_actions.entrySet());
    }

}
