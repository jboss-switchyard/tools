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
package org.switchyard.tools.ui.editor.components.camel.java;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.AbstractModelWizardPage;

/**
 * @author bfitzpat
 * 
 */
public class CamelJavaRouteImplementationPage extends AbstractModelWizardPage<Component> {

    private ComponentService _serviceInterface;
    private CamelJavaRouteComposite _composite = null;
    private CamelImplementationType _implementation;

    /**
     * @param name String name of page
     */
    public CamelJavaRouteImplementationPage(String name) {
        super(name);
        setTitle("Camel Java Route Details");
        setDescription("Specify the details for the Camel route.");
        // we don't validate until the control is created
        setPageComplete(false);
    }

    @Override
    protected AbstractModelComposite<Component> createComposite(Composite parent, int style) {
        _composite = new CamelJavaRouteComposite(this, parent, style);
        return _composite;
    }

    @Override
    public EObject getSelectedBusinessObject() {
        return _composite.getService();
    }

    /**
     * @param implementation the Camel implementation upon which this page is
     *            operating.
     */
    public void init(CamelImplementationType implementation) {
        _implementation = implementation;
        if (_composite != null) {
            _composite.setImplementation(_implementation);
        }
    }

    /**
     * Must be invoked before the dialog is opened.
     * 
     * @param serviceInterface the interface; may be null, indicating any
     *            interface is OK.
     */
    public void forceServiceInterfaceType(ComponentService serviceInterface) {
        _serviceInterface = serviceInterface;
        if (_composite != null) {
            _composite.forceServiceInterfaceType(_serviceInterface);
        }
    }
}
