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
package org.switchyard.tools.ui.editor.diagram.composite;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.util.ExampleUtil;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramCreateCompositeFeature extends AbstractCreateFeature {

    private static final String TITLE = "Create Composite";
    private static final String USER_QUESTION = "Enter new composite name";

    private boolean _hasDoneChanges;

    /**
     * @param fp the feature provider
     */
    public SCADiagramCreateCompositeFeature(IFeatureProvider fp) {
        super(fp, "Composite", "Create Composite");
    }

    @Override
    public boolean hasDoneChanges() {
        return _hasDoneChanges;
    }

    @Override
    public boolean canCreate(ICreateContext context) {
        return context.getTargetContainer() instanceof Diagram;
    }

    @Override
    public Object[] create(ICreateContext context) {
        // ask user for EClass name
        String newCompositeName = ExampleUtil.askString(TITLE, USER_QUESTION, "");
        if (newCompositeName == null || newCompositeName.trim().length() == 0) {
            _hasDoneChanges = false;
            return EMPTY;
        }

        Composite newComposite = ScaFactory.eINSTANCE.createComposite();
        newComposite.setName(newCompositeName);

        // do the add
        addGraphicalRepresentation(context, newComposite);

        // make sure we look like we actually did something.
        _hasDoneChanges = true;

        // return newly created business object(s)
        return new Object[] {newComposite };
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_COMPOSITE;
    }

}
