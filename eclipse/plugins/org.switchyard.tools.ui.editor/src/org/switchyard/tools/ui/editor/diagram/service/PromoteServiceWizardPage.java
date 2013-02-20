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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.operation.IRunnableWithProgress;
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
//    private Button _isRemotedCheck;
    private NewTransformWizard _transformWizard;
    private boolean _creatingTransformers;
//    private boolean _isRemoted = false;

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
    
//    /**
//     * @return true/false if remoted checkbox is clicked
//     */
//    public boolean isRemoted() {
//        return _isRemoted;
//    }

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
        
        if (nColumns > 1) {
            new Label(content, SWT.NONE);
        }
//        _isRemotedCheck = new Button(content, SWT.CHECK);
//        _isRemotedCheck.setText("Enable remote channel");
//        _isRemotedCheck.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, nColumns - 1, 1));
//        _isRemotedCheck.setSelection(false);
//        _isRemotedCheck.addSelectionListener(new SelectionAdapter() {
//            @Override
//            public void widgetSelected(SelectionEvent event) {
//                _isRemoted = _isRemotedCheck.getSelection();
//            }
//        });

        _transformWizard.addPages();
    }

    @Override
    protected void validate() {
        final IFile newSourceResource = PlatformResourceAdapterFactory.getFileForObject(getContract(), _project);
        if (newSourceResource != null && _targetResource != null && !newSourceResource.equals(_targetResource)
                && newSourceResource.exists() && _targetResource.exists()) {
            if (!newSourceResource.equals(_sourceResource)) {
                // need to update required transforms
                _sourceResource = newSourceResource;
                try {
                    getWizard().getContainer().run(false, false, new IRunnableWithProgress() {
                        @Override
                        public void run(IProgressMonitor monitor) throws InvocationTargetException,
                                InterruptedException {
                            Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, monitor);
                            try {
                                _details = new TransformDetails(_switchYard, getContract(), _targetContract);
                            } catch (Exception e) {
                                throw new InvocationTargetException(e);
                            }

                        }
                    });
                    if (!_details.getDeclaredTransforms().containsAll(_details.getRequiredTransforms())) {
                        _transformWizard.init(_details);
                        _createTransformersCheck.setEnabled(true);
                    } else {
                        _createTransformersCheck.setEnabled(false);
                    }
                } catch (Exception e) {
                    _createTransformersCheck.setEnabled(false);
                }
            }
        } else {
            // we either can't resolve the corresponding resources or the
            // interfaces are the same
            _createTransformersCheck.setEnabled(false);
            _sourceResource = newSourceResource;
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

}
