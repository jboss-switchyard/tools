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
package org.switchyard.tools.ui.editor.diagram.service;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.editor.diagram.shared.NewContractWizardPage;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;
import org.switchyard.tools.ui.editor.transform.NewTransformWizard;
import org.switchyard.tools.ui.editor.transform.TransformDetails;

/**
 * PromoteServiceWizardPage
 * 
 * <p/>
 * Page for collecting information for the promoted service.
 */
public class PromoteServiceWizardPage extends NewContractWizardPage {

    private Contract _targetContract;
    private SwitchYardType _switchYard;
    private IProject _project;
    private TransformDetails _details;
    private IResource _targetResource;
    private IResource _sourceResource;
    private Button _createTransformersCheck;
    private NewTransformWizard _transformWizard;
    private boolean _creatingTransformers;

    /**
     * Create a new PromoteServiceWizardPage.
     */
    public PromoteServiceWizardPage() {
        super(PromoteServiceWizardPage.class.getCanonicalName(), "Promote Component Service",
                "Specify details for the new composite service.", ScaPackage.eINSTANCE.getService());
        _transformWizard = new NewTransformWizard();
    }

    @Override
    public void init(Contract contract, Contract related) {
        super.init(contract, related);
        _targetContract = related;
        _switchYard = MergedModelUtil.getSwitchYard(_targetContract);
        _project = PlatformResourceAdapterFactory.getContainingProject(_switchYard);
        _targetResource = PlatformResourceAdapterFactory.getFileForObject(_targetContract, _project);
    }

    /**
     * @return any created transformers
     */
    public Collection<TransformType> getCreatedTransforms() {
        if (_creatingTransformers) {
            return _transformWizard.getCreatedTransforms();
        }
        return Collections.emptyList();
    }

    @Override
    protected void createAdditionalControls(Composite content, int nColumns) {
        if (nColumns > 1) {
            new Label(content, SWT.NONE);
        }
        _createTransformersCheck = new Button(content, SWT.CHECK);
        _createTransformersCheck.setText("Create required transformers");
        _createTransformersCheck.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, nColumns - 1, 1));
        _createTransformersCheck.setSelection(true);
        _createTransformersCheck.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                validate();
            }
        });
        _transformWizard.addPages();
    }

    @Override
    protected void validate() {
        if (!typesMatch()) {
            try {
                _details = new TransformDetails(_switchYard, getContract(), _targetContract);
                if (!_details.getDeclaredTransforms().containsAll(_details.getRequiredTransforms())) {
                    _transformWizard.init(_details);
                    _createTransformersCheck.setEnabled(true);
                } else {
                    _createTransformersCheck.setEnabled(false);
                }
            } catch (Exception e) {
                _createTransformersCheck.setEnabled(false);
            }
        } else {
            _createTransformersCheck.setEnabled(false);
        }
        _creatingTransformers = _createTransformersCheck.isEnabled() && _createTransformersCheck.getSelection();
        super.validate();
    }

    protected IWizard getNextWizard() {
        if (_createTransformersCheck.isEnabled() && _createTransformersCheck.getSelection()) {
            return _transformWizard;
        }
        return null;
    }

    private boolean typesMatch() {
        final IFile newSourceResource = PlatformResourceAdapterFactory.getFileForObject(getContract(), _project);
        if (newSourceResource == null || _targetResource == null || newSourceResource.equals(_targetResource)
                || newSourceResource.equals(_sourceResource) || !newSourceResource.exists()
                || !_targetResource.exists()) {
            return true;
        }
        _sourceResource = newSourceResource;
        return false;
    }

}
