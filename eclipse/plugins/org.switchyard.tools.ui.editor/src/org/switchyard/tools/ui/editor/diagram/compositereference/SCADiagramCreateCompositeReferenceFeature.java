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
package org.switchyard.tools.ui.editor.diagram.compositereference;

import java.io.IOException;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.core.ModelHandlerLocator;
import org.switchyard.tools.ui.editor.util.ExampleUtil;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramCreateCompositeReferenceFeature extends AbstractCreateFeature {

    private static final String TITLE = "Create Composite Reference";
    private static final String USER_QUESTION = "Enter new composite reference name";

    /**
     * @param fp feature provider
     */
    public SCADiagramCreateCompositeReferenceFeature(IFeatureProvider fp) {
        super(fp, "Composite Reference", "Create Composite Reference");
    }

    @Override
    public boolean canCreate(ICreateContext context) {
        if (getBusinessObjectForPictogramElement(context.getTargetContainer()) instanceof Composite) {
            return true;
        }
        return false;
    }

    @Override
    public Object[] create(ICreateContext context) {
        // ask user for EClass name
        String newRefName = ExampleUtil.askString(TITLE, USER_QUESTION, "");
        if (newRefName == null || newRefName.trim().length() == 0) {
            return EMPTY;
        }

        Reference newReference = null;

        try {
            ModelHandler mh = ModelHandlerLocator.getModelHandler(getDiagram().eResource());
            Object o = getBusinessObjectForPictogramElement(context.getTargetContainer());
            newReference = mh.createCompositeReference((Composite) o);
            newReference.setName(newRefName);
        } catch (IOException e) {
            Activator.logError(e);
        }

        // do the add
        addGraphicalRepresentation(context, newReference);

        // return newly created business object(s)
        return new Object[] {newReference };
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_SERVICE;
    }

}
