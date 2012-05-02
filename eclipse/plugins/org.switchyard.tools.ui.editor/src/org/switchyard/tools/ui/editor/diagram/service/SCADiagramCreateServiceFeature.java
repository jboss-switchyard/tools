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

import java.io.IOException;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.core.ModelHandlerLocator;
import org.switchyard.tools.ui.editor.util.ExampleUtil;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramCreateServiceFeature extends AbstractCreateFeature {

    private static final String TITLE = "Create service";
    private static final String USER_QUESTION = "Enter new service name";

    /**
     * @param fp the feature provider
     */
    public SCADiagramCreateServiceFeature(IFeatureProvider fp) {
        super(fp, "Service", "Create service");
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
        Service newClass = null;

        // ask user for EClass name
        String newClassName = ExampleUtil.askString(TITLE, USER_QUESTION, "");
        if (newClassName == null || newClassName.trim().length() == 0) {
            return EMPTY;
        }

        try {
            ModelHandler mh = ModelHandlerLocator.getModelHandler(getDiagram().eResource());
            Object o = getBusinessObjectForPictogramElement(context.getTargetContainer());
            newClass = mh.createService((Composite) o);
            newClass.setName(newClassName);
        } catch (IOException e) {
            Activator.logError(e);
        }

        // do the add
        addGraphicalRepresentation(context, newClass);

        // return newly created business object(s)
        return new Object[] {newClass };
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_SERVICE;
    }

}
