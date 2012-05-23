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
package org.switchyard.tools.ui.editor.diagram.component.wizards;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.ui.editor.diagram.shared.CamelRouteSelectionComposite;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramAddComponentImplementationCamelPage extends WizardPage {

    private CamelRouteSelectionComposite _camelComposite = null;
    private CamelImplementationType _implementation;

    protected SCADiagramAddComponentImplementationCamelPage(String pageName) {
        super(pageName);
        setTitle("Camel Implementation Details");
        setDescription("Specify the details for the Camel route.");
        // we don't validate until the control is created
        setPageComplete(false);
    }

    /**
     * @param implementation the Camel implementation upon which this page is
     *            operating.
     */
    public void init(CamelImplementationType implementation) {
        _implementation = implementation;
    }

    @Override
    public void createControl(Composite parent) {
        _camelComposite = new CamelRouteSelectionComposite();
        _camelComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_camelComposite.getErrorMessage());
                setPageComplete(_camelComposite.getErrorMessage() == null);
            }
        });
        _camelComposite.setImplementation(_implementation);
        _camelComposite.createContents(parent, SWT.NONE);

        setControl(_camelComposite.getPanel());
    }

    /**
     * @return String for camel route
     */
    public String getCamelRouteXMLFile() {
        return _camelComposite.getCamelRouteString();
    }

    /**
     * @return String for camel route class name
     */
    public String getCamelRouteClassName() {
        return _camelComposite.getCamelRouteClass();
    }

}
