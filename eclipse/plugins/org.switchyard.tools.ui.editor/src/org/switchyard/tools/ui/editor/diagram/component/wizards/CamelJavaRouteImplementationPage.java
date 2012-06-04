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
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.ui.editor.diagram.shared.CamelJavaRouteComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelJavaRouteImplementationPage extends WizardPage {

    private CamelJavaRouteComposite _camelComposite = null;
    private CamelImplementationType _implementation;

    protected CamelJavaRouteImplementationPage(String pageName) {
        super(pageName);
        setTitle("Camel Java Route Details");
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
        _camelComposite = new CamelJavaRouteComposite();
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
     * @return the component service that may be associated with the route.
     */
    public ComponentService getService() {
        return _camelComposite.getService();
    }

}
