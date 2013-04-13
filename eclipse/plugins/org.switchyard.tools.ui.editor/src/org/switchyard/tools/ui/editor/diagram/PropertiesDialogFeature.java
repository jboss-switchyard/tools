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

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.PropertyDialogAction;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * AutoLayoutFeature
 * 
 * <p/>
 * Automatically lays out diagram using Zest.
 * 
 * @author Rob Cernich
 */
public class PropertiesDialogFeature extends AbstractCustomFeature {

    private boolean _hasMadeChanges;
    private ICustomContext _context;
    private PropertyDialogAction _openProperties;

    /**
     * Create a new AutoLayoutFeature.
     * 
     * @param fp the feature provider.
     */
    public PropertiesDialogFeature(IFeatureProvider fp) {
        super(fp);
        _openProperties = new PropertyDialogAction(new IShellProvider() {
            public Shell getShell() {
                return SwitchyardSCAEditor.getEditor(getDiagram()).getEditorSite().getShell();
            }
        }, new ISelectionProvider() {
            public void addSelectionChangedListener(ISelectionChangedListener listener) {
            }

            public ISelection getSelection() {
                return getSelectionForContext();
            }

            public void removeSelectionChangedListener(ISelectionChangedListener listener) {
            }

            public void setSelection(ISelection selection) {
            }
        });
    }

    @Override
    public String getDescription() {
        return "Open properties dialog.";
    }

    @Override
    public String getName() {
        return "Properties";
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        _context = context;
        _openProperties.selectionChanged(getSelectionForContext());
        return _openProperties.isApplicableForSelection();
    }

    @Override
    public void execute(ICustomContext context) {
        PreferenceDialog dialog = _openProperties.createDialog();
        dialog.getTreeViewer().addFilter(new ViewerFilter() {
            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                String id = element == null ? null : ((IPreferenceNode) element).getId();
                // filter out run/debug and svn info
                return id != null && !id.startsWith("org.eclipse.debug.ui.") && !id.startsWith("org.eclipse.team.");
            }
        });
        _hasMadeChanges = dialog.open() == Dialog.OK;
    }

    @Override
    public boolean hasDoneChanges() {
        return _hasMadeChanges;
    }

    private ISelection getSelectionForContext() {
        PictogramElement[] elements = _context == null ? null : _context.getPictogramElements();
        if (elements == null || elements.length != 1) {
            return StructuredSelection.EMPTY;
        }
        Object bo = getBusinessObjectForPictogramElement(elements[0]);
        if (bo == null) {
            return StructuredSelection.EMPTY;
        }
        return new StructuredSelection(bo);
    }

}
