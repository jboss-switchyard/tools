package org.switchyard.tools.ui.editor.diagram;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.jdt.ui.actions.OpenAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramOpenOnDoubleClickFeature extends AbstractCustomFeature {

    private OpenAction _action;

    /**
     * @param fp Feature provider
     */
    public SCADiagramOpenOnDoubleClickFeature(IFeatureProvider fp) {
        super(fp);
        _action = new OpenAction(SwitchyardSCAEditor.getActiveEditor().getEditorSite());
    }

    @Override
    public void execute(ICustomContext context) {
        _action.run(getResourceFromContext(context));
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        _action.selectionChanged(getResourceFromContext(context));
        return _action.isEnabled();
    }

    @Override
    public boolean hasDoneChanges() {
        // don't mark as dirty after this action.
        return false;
    }

    private IStructuredSelection getResourceFromContext(ICustomContext context) {
        IResource file = null;
        PictogramElement[] elements = context.getPictogramElements();
        if (elements != null && elements.length == 1) {
            Object obj = getFeatureProvider().getBusinessObjectForPictogramElement(elements[0]);
            file = (IResource) Platform.getAdapterManager().loadAdapter(obj, IResource.class.getCanonicalName());
        }
        if (file == null) {
            return StructuredSelection.EMPTY;
        }
        return new StructuredSelection(file);
    }
}
