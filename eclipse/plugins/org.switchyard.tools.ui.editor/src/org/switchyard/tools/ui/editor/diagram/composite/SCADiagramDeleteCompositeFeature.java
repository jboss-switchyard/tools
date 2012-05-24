package org.switchyard.tools.ui.editor.diagram.composite;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramDeleteCompositeFeature extends DefaultDeleteFeature {

    /**
     * @param fp feature provider
     */
    public SCADiagramDeleteCompositeFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canDelete(IDeleteContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof Composite) {
            return false;
        }
        return true;
    }

    @Override
    public boolean hasDoneChanges() {
        return false;
    }
}
