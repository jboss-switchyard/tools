/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.switchyard.tools.ui.editor.property;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;

/**
 * ThrottlingPropertyFilter
 * <p/>
 * Property filter for types supporting throttling.
 */
public class ThrottlingPropertyFilter extends AbstractPropertySectionFilter {

    @Override
    protected boolean accept(PictogramElement pe) {
        EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
        if (bo instanceof Service) {
            return true;
        }
        return false;
    }
}
