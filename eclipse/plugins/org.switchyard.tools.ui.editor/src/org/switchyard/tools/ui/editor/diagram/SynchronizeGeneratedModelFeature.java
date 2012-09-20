/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.diagram;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor.SwitchyardSCAEditorAdapter;

/**
 * SynchronizeGeneratedModelFeature
 * 
 * <p/>
 * A feature that synchronizes the in-memory generated model.
 */
public class SynchronizeGeneratedModelFeature extends AbstractCustomFeature {

    private boolean _hasDoneChanges;
    private boolean _automated;

    /**
     * Create a new SynchronizeGeneratedModelFeature.
     * 
     * @param fp the feature provider
     */
    public SynchronizeGeneratedModelFeature(IFeatureProvider fp) {
        this(fp, false);
    }

    /**
     * Create a new SynchronizeGeneratedModelFeature.
     * 
     * @param fp the feature provider
     * @param automated if this is an automated invocation (i.e. don't prompt
     *            the user)
     */
    public SynchronizeGeneratedModelFeature(IFeatureProvider fp, boolean automated) {
        super(fp);
        _automated = automated;
    }

    @Override
    public void execute(ICustomContext context) {
        _hasDoneChanges = false;
        final ResourceSet rs = getDiagramEditor().getResourceSet();
        final SwitchyardSCAEditorAdapter editorAdapter = (SwitchyardSCAEditorAdapter) EcoreUtil.getAdapter(
                rs.eAdapters(), SwitchyardSCAEditorAdapter.class);
        if (editorAdapter == null) {
            return;
        } else if (editorAdapter.getSwitchyardEditor().isDirty()) {
            if (!_automated) {
                MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                        "Cannot Synchronize",
                        "Please save the file before synchronizing with the generated configuration.");
            }
            return;
        } else if (!getUserDecision()) {
            return;
        }
        _hasDoneChanges = editorAdapter.getSwitchyardEditor().synchronizeGeneratedModel();
    }

    @Override
    public String getName() {
        return "Synchronize with Generated Configuration";
    }

    @Override
    public String getDescription() {
        return "Synchronizes the content in the editor with the generated configuration file.";
    }

    @Override
    public String getImageId() {
        return ImageProvider.IMG_16_SYNCHRONIZE;
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        final SwitchyardSCAEditorAdapter editorAdapter = (SwitchyardSCAEditorAdapter) EcoreUtil.getAdapter(
                getDiagramEditor().getEditingDomain().getResourceSet().eAdapters(), SwitchyardSCAEditorAdapter.class);
        return editorAdapter != null && editorAdapter.getSwitchyardEditor().needToSynchronizeGeneratedModel();
    }

    @Override
    public boolean hasDoneChanges() {
        return _hasDoneChanges;
    }

    @Override
    public boolean canUndo(IContext context) {
        return false;
    }

    @Override
    protected boolean getUserDecision() {
        return _automated
                || MessageDialog
                        .openQuestion(
                                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                                "Synchronize Generated Configuration",
                                "The generated configuration associated with this file has changed.\n\n"
                                        + "Do you wish to synchronize the contents of the editor with the generated configuration?\n\n"
                                        + "WARNING: this operation cannot be undone.");
    }

}
