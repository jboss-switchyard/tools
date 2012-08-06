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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
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

    /**
     * Create a new AutoLayoutFeature.
     * 
     * @param fp the feature provider.
     */
    public PropertiesDialogFeature(IFeatureProvider fp) {
        super(fp);
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
        PictogramElement[] elements = context.getPictogramElements();
        return elements != null && elements.length == 1 && getBusinessObjectForPictogramElement(elements[0]) != null;
    }

    @Override
    public void execute(ICustomContext context) {
        PropertyDialogAction openProperties= new PropertyDialogAction(
                new IShellProvider() {
                    public Shell getShell() {
                        return SwitchyardSCAEditor.getActiveEditor().getSite().getShell();
                    }
                },
                new ISelectionProvider() {
                    public void addSelectionChangedListener(ISelectionChangedListener
                            listener) {
                    }
                    public ISelection getSelection() {
                        PictogramElement[] elements =
                                SwitchyardSCAEditor.getActiveEditor().getSelectedPictogramElements();
                        Object bo = getBusinessObjectForPictogramElement(elements[0]);
                        return new StructuredSelection(bo);
                    }
                    public void removeSelectionChangedListener(ISelectionChangedListener
                            listener) {
                    }
                    public void setSelection(ISelection selection) {
                    }
                });
        openProperties.run();
    }

//    private void openProperties(Object bo) {
//        // look at - http://wiki.eclipse.org/FAQ_How_do_I_open_a_Property_dialog%3F
//        ISelection sel = new StructuredSelection(bo);
//        TabbedPropertySheetPage namepage = new TabbedPropertySheetPage(new ITabbedPropertySheetPageContributor() {
//            public String getContributorId() {
//                return "contributorId";
//            }
//        });
//        PropertyPage page = null; // how do I get from a tabbed property sheet page to a PropertyPage?
//        PreferenceManager mgr = new PreferenceManager();
//        IPreferenceNode node = new PreferenceNode("1", page);
//        mgr.addToRoot(node);
//        PropertyDialog dialog = new PropertyDialog(shell, mgr, sel);
//        dialog.create();
//        dialog.setMessage(page.getTitle());
//        dialog.open();
//    }

}
