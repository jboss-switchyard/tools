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
package org.switchyard.tools.ui.bpel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.open.oasis.docs.ns.opencsa.sca.bpel.BPELImplementation;

/**
 * BPELImplementationPropertySectionFilter
 * 
 * <p/>
 * Filter to make sure the BPEL property section only applies to BPEL
 * components.
 */
public class BPELImplementationPropertySectionFilter extends AbstractPropertySectionFilter {

    @Override
    protected boolean accept(PictogramElement pe) {
        EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
        return bo instanceof Component && ((Component) bo).getImplementation() instanceof BPELImplementation;
    }
}
