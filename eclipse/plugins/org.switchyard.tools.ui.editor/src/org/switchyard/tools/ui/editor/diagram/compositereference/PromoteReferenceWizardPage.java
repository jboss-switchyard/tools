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
package org.switchyard.tools.ui.editor.diagram.compositereference;

import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.NewContractWizardPage;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;
import org.switchyard.tools.ui.editor.transform.NewTransformWizard;
import org.switchyard.tools.ui.editor.transform.TransformDetails;

/**
 * PromoteReferenceWizardPage
 * 
 * <p/>
 * Page for collecting information for the promoted reference.
 */
public class PromoteReferenceWizardPage extends NewContractWizardPage {

    private Contract _sourceContract;
    private SwitchYardType _switchYard;
    private IProject _project;
    private TransformDetails _details;
    private IResource _targetResource;
    private IResource _sourceResource;
    private Button _createTransformersCheck;
    private NewTransformWizard _transformWizard;
    private boolean _creatingTransformers;
//    private Button _isRemotedCheck;
//    private boolean _isRemoted = false;

    /**
     * Create a new PromoteReferenceWizardPage.
     */
    public PromoteReferenceWizardPage() {
        super(PromoteReferenceWizardPage.class.getCanonicalName(), Messages.title_promoteComponentReference,
                Messages.description_promoteComponentReference, ScaPackage.eINSTANCE.getReference());
        _transformWizard = new NewTransformWizard();
    }

    @Override
    public void init(Contract contract, Contract related) {
        super.init(contract, related);
        _sourceContract = related;
        _switchYard = MergedModelUtil.getSwitchYard(_sourceContract);
        _project = PlatformResourceAdapterFactory.getContainingProject(_switchYard);
        _sourceResource = PlatformResourceAdapterFactory.getFileForObject(_sourceContract, _project);
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
        _createTransformersCheck.setText(Messages.label_createRequiredTransformers);
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
        super.validate();
        boolean canPromote = validatePromotion();
        if (!canPromote) {
            setErrorMessage(MessageFormat.format(Messages.error_compositeReferenceExists, getContract().getName()));
        }
        
        final IFile newTargetResource = PlatformResourceAdapterFactory.getFileForObject(getContract(), _project);
        if (newTargetResource != null && _sourceResource != null && !newTargetResource.equals(_sourceResource)
                && newTargetResource.exists() && _sourceResource.exists()) {
            if (!newTargetResource.equals(_targetResource)) {
                // need to update required transforms
                _targetResource = newTargetResource;
                try {
                    getWizard().getContainer().run(false, false, new IRunnableWithProgress() {
                        @Override
                        public void run(IProgressMonitor monitor) throws InvocationTargetException,
                                InterruptedException {
                            Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, monitor);
                            try {
                                _details = new TransformDetails(_switchYard, _sourceContract, getContract());
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
            _targetResource = newTargetResource;
        }
        _creatingTransformers = _createTransformersCheck.isEnabled() && _createTransformersCheck.getSelection();
        setPageComplete(getErrorMessage() == null);
    }

    protected IWizard getNextWizard() {
        if (_createTransformersCheck.isEnabled() && _createTransformersCheck.getSelection()) {
            return _transformWizard;
        }
        return null;
    }

    /*
     * Check to see if the promotion is valid. If it has the same name and interface, it's good.
     * If it has the same name and a different interface, it's invalid.
     * If it has a different name, it's fine.
     * @return true/false this is a valid promotion
     */
    private boolean validatePromotion() {
        EList<Reference> refs = _switchYard.getComposite().getReference();
        for (Reference ref : refs) {
            boolean nameMatch = false;
            boolean foundDupe = false;
            if (ref.getName().equals(getContract().getName())) {
                nameMatch = true;
                if (ref.getInterface().eClass().getName().equals(getContract().getInterface().eClass().getName())) {
                    if (ref.getInterface() instanceof JavaInterface) {
                        JavaInterface refIntfc = (JavaInterface) ref.getInterface();
                        JavaInterface newRefIntfc = (JavaInterface) getContract().getInterface();
                        if (refIntfc.getInterface().equals(newRefIntfc.getInterface())) {
                            foundDupe = true;
                        }
                    } else if (ref.getInterface() instanceof EsbInterface) {
                        EsbInterface refIntfc = (EsbInterface) ref.getInterface();
                        EsbInterface newRefIntfc = (EsbInterface) getContract().getInterface();
                        boolean inputMatch = false;
                        if (refIntfc.getInputType() != null && refIntfc.getInputType().equals(newRefIntfc.getInputType())) {
                            inputMatch = true;
                        } else if (refIntfc.getInputType() == null && newRefIntfc.getInputType() == null) {
                            inputMatch = true;
                        }
                        boolean outputMatch = false;
                        if (refIntfc.getOutputType() != null && refIntfc.getOutputType().equals(newRefIntfc.getOutputType())) {
                            outputMatch = true;
                        } else if (refIntfc.getOutputType() == null && newRefIntfc.getOutputType() == null) {
                            outputMatch = true;
                        }
                        boolean faultMatch = false;
                        if (refIntfc.getFaultType() != null && refIntfc.getFaultType().equals(newRefIntfc.getFaultType())) {
                            faultMatch = true;
                        } else if (refIntfc.getFaultType() == null && newRefIntfc.getFaultType() == null) {
                            faultMatch = true;
                        }
                        if (inputMatch && outputMatch && faultMatch) {
                            foundDupe = true;
                        }
                    } else if (ref.getInterface() instanceof WSDLPortType) {
                        WSDLPortType refIntfc = (WSDLPortType) ref.getInterface();
                        WSDLPortType newRefIntfc = (WSDLPortType) getContract().getInterface();
                        if (refIntfc.getInterface().equals(newRefIntfc.getInterface())) {
                            foundDupe = true;
                        }
                    }
                }
            }
            if (foundDupe && nameMatch) {
                // found a dupe
                return true;
            } else if (!foundDupe && nameMatch) {
                // invalid - name match but no interface match
                return false;
            }
        }
        return true;
    }
}
