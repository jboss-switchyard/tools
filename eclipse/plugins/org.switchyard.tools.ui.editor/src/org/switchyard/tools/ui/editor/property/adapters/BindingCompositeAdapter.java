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
package org.switchyard.tools.ui.editor.property.adapters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.WSDLURISelectionComposite;

/**
 * @author bfitzpat
 * 
 */
public final class BindingCompositeAdapter {

    private BindingCompositeAdapter() {
        // empty constructor
    }

    /**
     * @param object incoming model object
     * @return outgoing composite instance or null
     */
    public static AbstractSwitchyardComposite adaptModelToComposite(EObject object) {
        AbstractSwitchyardComposite composite = null;
        if (object instanceof SOAPBindingType) {
            composite = new WSDLURISelectionComposite();
            GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
            composite.setRootGridData(wsdlGD);
        }
        if (composite != null) {
            return composite;
        }
        return null;
    }

}
