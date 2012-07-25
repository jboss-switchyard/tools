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
package org.switchyard.tools.ui.editor.diagram.service;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.ui.editor.util.GraphitiUtil;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramUpdateServiceFeature extends AbstractUpdateFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramUpdateServiceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canUpdate(IUpdateContext context) {
        // return true, if linked business object is a Service
        Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
        return (bo instanceof Service);
    }

    private Text findText(GraphicsAlgorithm root) {
        for (GraphicsAlgorithm ga : root.getGraphicsAlgorithmChildren()) {
            if (ga instanceof Text) {
                Text text = (Text) ga;
                return text;
            }
            if (ga.getGraphicsAlgorithmChildren().size() > 0) {
                return findText(ga);
            }
        }
        return null;
    }

    @Override
    public IReason updateNeeded(IUpdateContext context) {
        // retrieve name from pictogram model
        String pictogramName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            Text foundText = findText(cs.getGraphicsAlgorithm());
            if (foundText != null) {
                pictogramName = foundText.getValue();
            }
        }

        // retrieve name from business model
        String businessName = null;
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof Service) {
            Service eClass = (Service) bo;
            businessName = eClass.getName();

            // update needed, if names are different
            boolean updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
                    .contentEquals(businessName)));
            if (updateNameNeeded) {
                return Reason.createTrueReason("Service name is out of date");
            } else {
                return Reason.createFalseReason();
            }
        }

        return Reason.createFalseReason();
    }

    @Override
    public boolean update(IUpdateContext context) {
        // retrieve name from business model
        String businessName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof Service) {
            Service eClass = (Service) bo;
            businessName = eClass.getName();
        }

        // Set name in pictogram model
        if (pictogramElement instanceof ContainerShape) {
            GraphicsAlgorithm ga = pictogramElement.getGraphicsAlgorithm();
            Text text = (Text) GraphitiUtil.findChildGA(ga, Text.class);
            if (text != null) {
                text.setValue(businessName);
                return true;
            }
        }
        return false;
    }

}
