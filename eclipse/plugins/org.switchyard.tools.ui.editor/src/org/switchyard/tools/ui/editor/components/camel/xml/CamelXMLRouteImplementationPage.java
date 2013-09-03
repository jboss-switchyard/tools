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
package org.switchyard.tools.ui.editor.components.camel.xml;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.AbstractModelWizardPage;

/**
 * @author bfitzpat
 * 
 */
public class CamelXMLRouteImplementationPage extends AbstractModelWizardPage<Component> {

    private ComponentService _serviceInterface;
    private CamelXMLRouteComposite _camelComposite = null;
    private CamelImplementationType _implementation;

    protected CamelXMLRouteImplementationPage(String pageName) {
        super(pageName);
        setTitle(Messages.title_camelRouteDetails);
        setDescription(Messages.description_camelRouteDetails);
        // we don't validate until the control is created
        setPageComplete(false);
    }

    /**
     * @param implementation the Camel implementation upon which this page is
     *            operating.
     */
    public void init(CamelImplementationType implementation) {
        _implementation = implementation;
        if (_camelComposite != null) {
            _camelComposite.setImplementation(_implementation);
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
        if (_camelComposite != null) {
            _camelComposite.forceServiceInterfaceType(_serviceInterface);
        }
    }

    @Override
    protected AbstractModelComposite<Component> createComposite(Composite parent, int style) {
        _camelComposite = new CamelXMLRouteComposite(this, parent, style);
        if (_serviceInterface != null) {
            _camelComposite.forceServiceInterfaceType(_serviceInterface);
        }
        if (_implementation != null) {
            _camelComposite.setImplementation(_implementation);
        }
        return _camelComposite;
    }

    @Override
    public EObject getSelectedBusinessObject() {
        return null;
    }

    /**
     * @return the component service that may be associated with the route.
     */
    public ComponentService getService() {
        return _camelComposite.getService();
    }

}
