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
package org.switchyard.tools.ui.editor.diagram.component.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramAddImplementationStartPage extends BaseWizardPage {

    private ListViewer _listViewer;
    private IComponentImplementationWizard _wizard = null;

    /**
     * List width in characters.
     */
    private final static int LIST_WIDTH = 60;

    /**
     * List height in characters.
     */
    private final static int LIST_HEIGHT = 10;

    protected SCADiagramAddImplementationStartPage(String pageName) {
        super(pageName);
        setTitle("Create a New Component");
        setDescription("Specify the name and implementation type details for the new component.");
    }

    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout gl = new GridLayout();
        gl.numColumns = 2;
        composite.setLayout(gl);

        Label listLabel = new Label(composite, SWT.NONE);
        listLabel.setText("Implementation Type:");
        GridData labelGD = new GridData(GridData.FILL_HORIZONTAL);
        labelGD.horizontalSpan = 2;
        listLabel.setLayoutData(labelGD);

        _listViewer = new ListViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
        GridData data = new GridData(GridData.FILL_BOTH);
        data.horizontalSpan = 2;
        data.heightHint = convertHeightInCharsToPixels(LIST_HEIGHT);
        data.widthHint = convertWidthInCharsToPixels(LIST_WIDTH);
        _listViewer.getList().setLayoutData(data);
        _listViewer.getList().setFont(parent.getFont());
        // Set the label provider
        _listViewer.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                return ((IComponentImplementationWizard) element).getDisplayName();
            }
        });
        _listViewer.setContentProvider(new ArrayContentProvider());
        _listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection ssel = (IStructuredSelection) event.getSelection();
                if (!ssel.isEmpty()) {
                    _wizard = (IComponentImplementationWizard) ssel.getFirstElement();
                    handleModify();
                    getWizard().getContainer().updateButtons();
                }

            }
        });
        _listViewer.setInput(getImplementationWizards());

        setControl(composite);

        validate();
        setErrorMessage(null);
    }

    /**
     * @return the selected implementation wizard.
     */
    public IComponentImplementationWizard getImplementationWizard() {
        return _wizard;
    }

    private void handleModify() {
        validate();
    }

    private void validate() {
        String errorMessage = null;
        if (_listViewer.getSelection().isEmpty()) {
            errorMessage = "Please select an implementation type.";
        }
        setErrorMessage(errorMessage);
        setPageComplete(errorMessage == null);
    }

    private List<IComponentImplementationWizard> getImplementationWizards() {
        final List<IComponentImplementationWizard> wizards = new ArrayList<IComponentImplementationWizard>(2);
        wizards.add(new BeanImplementationWizard());
        wizards.add(new CamelImplementationWizard());
        return wizards;
    }

}
