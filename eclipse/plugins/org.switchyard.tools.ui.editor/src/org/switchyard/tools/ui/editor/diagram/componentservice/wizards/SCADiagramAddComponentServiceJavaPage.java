/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.componentservice.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;
import org.switchyard.tools.ui.editor.diagram.shared.JavaInterfaceSelectionComposite;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddComponentServiceJavaPage extends BaseWizardPage implements IRefreshablePage {

    private JavaInterfaceSelectionComposite _javaInterfaceComposite = null;
    private WizardPage _startPage = null;

    /**
     * @param start start page
     * @param pageName page name
     */
    public SCADiagramAddComponentServiceJavaPage(WizardPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    protected SCADiagramAddComponentServiceJavaPage(String pageName) {
        super(pageName);
        setTitle("Specify Java Class");
        setDescription("Specify the fully qualified class name for the Java interface.");
    }

    @Override
    public void createControl(Composite parent) {
        _javaInterfaceComposite = new JavaInterfaceSelectionComposite();
        Interface intfc = getInterfaceFromStartPage();
        if (intfc instanceof JavaInterface) {
            _javaInterfaceComposite.setInterface(intfc);
        }
        _javaInterfaceComposite.createContents(parent, SWT.NONE);

        setControl(_javaInterfaceComposite.getcPanel());
    }

    /**
     * @return java interface string
     */
    public String getJavaInterfaceString() {
        return _javaInterfaceComposite.getInterfaceClassName();
    }

    @Override
    public boolean getSkippable() {
        if (this._startPage != null && getInterfaceFromStartPage() != null) {
            Interface intfc = getInterfaceFromStartPage();
            if (intfc instanceof JavaInterface) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void refresh() {
        if (_startPage != null && getInterfaceFromStartPage() != null) {
            Interface intfc = getInterfaceFromStartPage();
            if (intfc instanceof JavaInterface) {
                _javaInterfaceComposite.setInterface(intfc);
            }
        }
    }

    private Interface getInterfaceFromStartPage() {
        if (_startPage != null) {
            if (_startPage instanceof SCADiagramAddComponentServiceStartPage) {
                SCADiagramAddComponentServiceStartPage compositeSvcStart = (SCADiagramAddComponentServiceStartPage) _startPage;
                return compositeSvcStart.getInterface();
            }
        }
        return null;
    }
}
