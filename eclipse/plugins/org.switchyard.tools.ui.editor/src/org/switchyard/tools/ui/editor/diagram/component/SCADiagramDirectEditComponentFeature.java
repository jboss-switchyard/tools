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
package org.switchyard.tools.ui.editor.diagram.component;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramDirectEditComponentFeature extends AbstractDirectEditingFeature {

    /**
     * @param fp feature provider
     */
    public SCADiagramDirectEditComponentFeature(IFeatureProvider fp) {
        super(fp);
    }

    /* (non-Javadoc)
     * @see org.eclipse.graphiti.func.IDirectEditing#getEditingType()
     */
    @Override
    public int getEditingType() {
        // there are several possible editor-types supported:
        // text-field, checkbox, color-chooser, combobox, ...
        return TYPE_TEXT;
    }

    @Override
    public boolean canDirectEdit(IDirectEditingContext context) {
        PictogramElement pe = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pe);
        GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
        // support direct editing, if it is a EClass, and the user clicked
        // directly on the text and not somewhere else in the rectangle
        if (bo instanceof Component && ga instanceof Text) {
            // EClass eClass = (EClass) bo;
            // additionally the flag isFrozen must be false
            // return !eClass.isFrozen();
            return true;
        }
        // direct editing not supported in all other cases
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.graphiti.func.IDirectEditing#getInitialValue(org.eclipse.graphiti.features.context.IDirectEditingContext)
     */
    @Override
    public String getInitialValue(IDirectEditingContext context) {
        // return the current name of the EClass
        PictogramElement pe = context.getPictogramElement();
        Component eClass = (Component) getBusinessObjectForPictogramElement(pe);
        return eClass.getName();
    }

    @Override
    public String checkValueValid(String value, IDirectEditingContext context) {
        if (value.length() < 1) {
            return "Please enter any text as Component name."; //$NON-NLS-1$
        }
        if (value.contains(" ")) { //$NON-NLS-1$
            return "Spaces are not allowed in Component names."; //$NON-NLS-1$
        }
        if (value.contains("\n")) { //$NON-NLS-1$
            return "Line breaks are not allowed in Component names."; //$NON-NLS-1$
        }

        // null means, that the value is valid
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature#setValue(java.lang.String, org.eclipse.graphiti.features.context.IDirectEditingContext)
     */
    @Override
    public void setValue(String value, IDirectEditingContext context) {
        // set the new name for the EClass
        PictogramElement pe = context.getPictogramElement();
        Component eClass = (Component) getBusinessObjectForPictogramElement(pe);
        eClass.setName(value);

        // Explicitly update the shape to display the new value in the diagram
        // Note, that this might not be necessary in future versions of Graphiti
        // (currently in discussion)
        IUpdateContext updateContext = new UpdateContext(pe);
        if (getFeatureProvider() != null) {
            getFeatureProvider().updateIfPossible(updateContext);        
        }
    }
}
