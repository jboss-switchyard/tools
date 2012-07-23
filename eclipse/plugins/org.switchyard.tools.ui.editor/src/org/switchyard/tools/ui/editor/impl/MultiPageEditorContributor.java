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

import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.ide.IDEActionFactory;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;

/**
 * Manages the installation/deinstallation of global actions for multi-page
 * editors. Responsible for the redirection of global actions to the active
 * editor. Multi-page contributor replaces the contributors for the individual
 * editors in the multi-page editor.
 */
public class MultiPageEditorContributor extends MultiPageEditorActionBarContributor {
    private IEditorPart _activeEditorPart;

    /**
     * Creates a multi-page contributor.
     */
    public MultiPageEditorContributor() {
        super();
    }

    /**
     * Returns the action registed with the given text editor.
     * 
     * @return IAction or null if editor is null.
     */
    protected IAction getAction(IEditorPart editor, String actionID) {
        if (editor instanceof ITextEditor) {
            return ((ITextEditor) editor).getAction(actionID);
        } else if (editor instanceof DiagramEditor) {
            ActionRegistry registry = (ActionRegistry) ((DiagramEditor) editor).getAdapter(ActionRegistry.class);
            return registry == null ? null : registry.getAction(actionID);
        }
        return null;
    }

    /*
     * (non-JavaDoc) Method declared in
     * AbstractMultiPageEditorActionBarContributor.
     */
    @Override
    public void setActivePage(IEditorPart part) {
        if (_activeEditorPart == part) {
            return;
        }

        _activeEditorPart = part;

        IActionBars actionBars = getActionBars();
        if (actionBars != null) {
            actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(),
                    getAction(part, ITextEditorActionConstants.DELETE));
            actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(),
                    getAction(part, ITextEditorActionConstants.UNDO));
            actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(),
                    getAction(part, ITextEditorActionConstants.REDO));
            actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(),
                    getAction(part, ITextEditorActionConstants.CUT));
            actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(),
                    getAction(part, ITextEditorActionConstants.COPY));
            actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(),
                    getAction(part, ITextEditorActionConstants.PASTE));
            actionBars.setGlobalActionHandler(ActionFactory.SELECT_ALL.getId(),
                    getAction(part, ITextEditorActionConstants.SELECT_ALL));
            actionBars.setGlobalActionHandler(ActionFactory.FIND.getId(),
                    getAction(part, ITextEditorActionConstants.FIND));
            actionBars.setGlobalActionHandler(IDEActionFactory.BOOKMARK.getId(),
                    getAction(part, IDEActionFactory.BOOKMARK.getId()));
            actionBars.updateActionBars();
        }
    }

}
