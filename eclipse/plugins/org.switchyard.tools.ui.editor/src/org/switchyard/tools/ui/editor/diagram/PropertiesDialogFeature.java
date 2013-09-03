/*************************************************************************************
 * Copyright (c) 2013 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.diagram;

import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.impl.InternalTransactionalEditingDomain;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
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
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * PropertiesDialogFeature
 * 
 * <p/>
 * Opens the properties dialog for the selected object.
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
        return Messages.featureDescription_openProperties;
    }

    @Override
    public String getName() {
        return Messages.featureName_properties;
    }

    @Override
    public String getImageId() {
        return ImageProvider.IMG_16_PROPERTIES;
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        _context = context;
        _openProperties.selectionChanged(getSelectionForContext());
        return _openProperties.isApplicableForSelection();
    }

    @Override
    public void execute(ICustomContext context) {
        final InternalTransactionalEditingDomain transactionalDomain = (InternalTransactionalEditingDomain) getDiagramBehavior()
                .getEditingDomain();
        try {
            /*
             * create a transaction to wrap the transaction used by the property
             * pages. this will allow us to determine if any changes have been
             * made to the model so we can set hasDoneChanges appropriately.
             */
            final Transaction newTransaction = transactionalDomain.startTransaction(false, null);
            PreferenceDialog dialog = _openProperties.createDialog();
            dialog.getTreeViewer().addFilter(new ViewerFilter() {
                @Override
                public boolean select(Viewer viewer, Object parentElement, Object element) {
                    String id = element == null ? null : ((IPreferenceNode) element).getId();
                    // filter out run/debug and svn info
                    return id != null && !id.startsWith("org.eclipse.debug.ui.") && !id.startsWith("org.eclipse.team."); //$NON-NLS-1$ //$NON-NLS-2$
                }
            });
            try {
                dialog.open();
                newTransaction.commit();
                /*
                 * change description will be empty if no changes were made
                 * (i.e. rolled back or just no changes).
                 */
                _hasMadeChanges = !newTransaction.getChangeDescription().isEmpty();
            } catch (RollbackException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
