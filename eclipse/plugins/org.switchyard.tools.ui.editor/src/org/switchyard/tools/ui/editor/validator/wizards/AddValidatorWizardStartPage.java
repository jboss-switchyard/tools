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
package org.switchyard.tools.ui.editor.validator.wizards;

import java.util.List;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.property.adapters.LabelAdapter;
import org.switchyard.tools.ui.editor.util.ValidatorTypesUtil;

/**
 * @author bfitzpat
 * 
 */
public class AddValidatorWizardStartPage extends WizardPage {

    private ListViewer _listViewer;
    private ValidateType _validator = null;

    /**
     * List width in characters.
     */
    private final static int LIST_WIDTH = 60;

    /**
     * List height in characters.
     */
    private final static int LIST_HEIGHT = 10;

    protected AddValidatorWizardStartPage(String pageName) {
        super(pageName);
        setTitle(Messages.title_createNewValidator);
        setDescription(Messages.description_createNewValidator);
    }

    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout gl = new GridLayout();
        gl.numColumns = 2;
        composite.setLayout(gl);

        Label listLabel = new Label(composite, SWT.NONE);
        listLabel.setText(Messages.label_validatorType);
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

        List<ValidateType> typeList = ValidatorTypesUtil.getSupportedValidateTypes();
        // Set the label provider
        _listViewer.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                ValidateType transform = (ValidateType) element;
                return LabelAdapter.getLabel(transform);
            }
        });
        _listViewer.setContentProvider(new IStructuredContentProvider() {
            public Object[] getElements(Object inputElement) {
                if (inputElement instanceof List<?>) {
                    List<?> v = (List<?>) inputElement;
                    return v.toArray();
                }
                return new Object[0];
            }

            public void dispose() {
            }

            public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            }
        });
        _listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection ssel = (IStructuredSelection) event.getSelection();
                if (!ssel.isEmpty() && ssel.getFirstElement() instanceof ValidateType) {
                    _validator = (ValidateType) ssel.getFirstElement();
                    handleModify();
                }

            }
        });
        _listViewer.setInput(typeList);

        setControl(composite);

        validate();
        setErrorMessage(null);
    }

    /**
     * @return updated binding
     */
    public ValidateType getValidator() {
        return this._validator;
    }

    private void handleModify() {
        validate();
    }

    private void validate() {
        String errorMessage = null;
        if (_validator == null) {
            errorMessage = Messages.error_selectValidatorType;
        }
        setErrorMessage(errorMessage);
        setPageComplete(errorMessage == null);
    }

}
