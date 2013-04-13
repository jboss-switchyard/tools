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
package org.switchyard.tools.ui.editor.impl;

import java.util.Iterator;

import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.UpdateAction;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.editor.DiagramEditorActionBarContributor;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.RetargetAction;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.wst.xml.ui.internal.tabletree.SourcePageActionContributor;

/**
 * Manages the installation/deinstallation of global actions for multi-page
 * editors. Responsible for the redirection of global actions to the active
 * editor. Multi-page contributor replaces the contributors for the individual
 * editors in the multi-page editor.
 */
@SuppressWarnings("restriction")
public class MultiPageEditorContributor extends MultiPageEditorActionBarContributor {

    private DiagramEditorActionBarContributor _designActionBarContributor;
    private SourcePageActionContributor _sourceActionBarContributor;
    private IEditorPart _activeEditorPart;
    private IEditorPart _activeEditorPage;

    /**
     * Creates a multi-page contributor.
     */
    public MultiPageEditorContributor() {
        super();
        _designActionBarContributor = new DiagramEditorActionBarContributor() {
            @Override
            protected void buildActions() {
                super.buildActions();
                addRetargetAction((RetargetAction) ActionFactory.PROPERTIES.create(PlatformUI.getWorkbench().getActiveWorkbenchWindow()));
            }

            @Override
            public void setActiveEditor(IEditorPart editor) {
                if (editor == null) {
                    if (_activeEditorPage instanceof DiagramEditor) {
                        // disable diagram actions
                        updateActionEnablement((DiagramEditor) _activeEditorPage, false);
                    }
                    return;
                }
                if (editor instanceof DiagramEditor) {
                    // enable diagram actions
                    updateActionEnablement((DiagramEditor) editor, true);
                }
                super.setActiveEditor(editor);
            }

            private void updateActionEnablement(DiagramEditor editor, boolean enabled) {
                ActionRegistry registry = (ActionRegistry) editor.getAdapter(ActionRegistry.class);
                if (registry != null) {
                    for (Iterator<?> it = registry.getActions(); it.hasNext();) {
                        IAction action = (IAction) it.next();
                        action.setEnabled(enabled);
                        if (enabled && action instanceof UpdateAction) {
                            ((UpdateAction) action).update();
                        }
                    }
                }
            }
        };
        _sourceActionBarContributor = new SourcePageActionContributor();
    }

    @Override
    public void init(IActionBars bars) {
        super.init(bars);

        if (bars != null) {
            _designActionBarContributor.init(bars, getPage());
            _sourceActionBarContributor.init(bars, getPage());
        }
    }

    @Override
    public void dispose() {
        _designActionBarContributor.dispose();
        _sourceActionBarContributor.dispose();
        _activeEditorPart = null;
        super.dispose();
    }

    @Override
    public void setActiveEditor(IEditorPart part) {
        _activeEditorPart = part;

        super.setActiveEditor(part);
    }

    @Override
    public void setActivePage(IEditorPart activeEditor) {
        if (_activeEditorPart != null) {
            // order is important here. make sure the active contributor is
            // last.
            if (activeEditor instanceof ITextEditor) {
                _designActionBarContributor.setActiveEditor(null);
                _sourceActionBarContributor.setActiveEditor(activeEditor);
                _sourceActionBarContributor.setViewerSpecificContributionsEnabled(true);
            } else {
                _sourceActionBarContributor.setActiveEditor(null);
                _sourceActionBarContributor.setViewerSpecificContributionsEnabled(false);
                _designActionBarContributor.setActiveEditor(activeEditor);
            }
        }

        IActionBars bars = getActionBars();
        if (bars != null) {
            // update menu bar and tool bar
            bars.updateActionBars();
        }
        _activeEditorPage = activeEditor;
    }

}
