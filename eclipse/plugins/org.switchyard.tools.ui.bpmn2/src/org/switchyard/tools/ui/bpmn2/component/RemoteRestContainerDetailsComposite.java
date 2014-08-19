/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.bpmn2.component;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.RemoteRestType;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.property.AbstractChangeAwareModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;
import org.switchyard.tools.ui.editor.util.PropTypeUtil;

/**
 * RemoteRestContainerDetailsComposite
 * 
 * Controls for editing a Remote REST container object (ContainerType).
 */
public class RemoteRestContainerDetailsComposite extends AbstractChangeAwareModelComposite<BPMImplementationType> {

    private static final Pattern GAV_PATTERN = Pattern.compile("([^: ]*)(:([^: ]*)(:([^: ]*))?)?"); //$NON-NLS-1$

    private RemoteRestType _remoteREST = BPMFactory.eINSTANCE.createRemoteRestType();
    private boolean _updating;
    private Text _deploymentIdText;
    private Text _userNameText;
    private Text _passwordText;
    private Text _timeoutText;
    private Text _urlText;
    private Combo _useFormBasedAuthCombo;
    private BpmExtraJaxbClassesTable _extraJaxbClassesTable;

    /**
     * Create a new KIEContainerDetailsComposite.
     * 
     * @param container the composite container.
     * @param parent the parent composite.
     * @param style any style bits from SWT.
     * @param factory the widget factory.
     */
    public RemoteRestContainerDetailsComposite(ICompositeContainer container, Composite parent, int style, FormToolkit factory) {
        super(BPMImplementationType.class, container, parent, style);
        setLayout(new GridLayout(2, false));

        Composite deploymentIdComposite = factory.createComposite(this);
        deploymentIdComposite.setLayout(new GridLayout(2, false));
        deploymentIdComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

        factory.createLabel(deploymentIdComposite, "Deployment ID");
        _deploymentIdText = factory.createText(deploymentIdComposite, "", SWT.BORDER); //$NON-NLS-1$
        _deploymentIdText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_deploymentIdText, BPMPackage.eINSTANCE.getRemoteType_DeploymentId());

        Group restGroup = new Group(this, SWT.NONE); 
        restGroup.setText("REST Details");
        restGroup.setLayout(new GridLayout(2, false));
        restGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        restGroup.setToolTipText("Details for the remote REST resources location");

        factory.createLabel(deploymentIdComposite, "REST URL");
        _urlText = factory.createText(deploymentIdComposite, "", SWT.BORDER); //$NON-NLS-1$
        _urlText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_urlText, BPMPackage.eINSTANCE.getRemoteRestType_Url());

        factory.createLabel(restGroup, "User Name");
        _userNameText = factory.createText(restGroup, "", SWT.BORDER); //$NON-NLS-1$
        _userNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_userNameText, BPMPackage.eINSTANCE.getRemoteType_UserName());

        factory.createLabel(restGroup, "Password");
        _passwordText = factory.createText(restGroup, "", SWT.BORDER); //$NON-NLS-1$
        _passwordText.setEchoChar('*');
        _passwordText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_passwordText, BPMPackage.eINSTANCE.getRemoteType_Password());

        factory.createLabel(restGroup, "Timeout");
        _timeoutText = factory.createText(restGroup, "", SWT.BORDER); //$NON-NLS-1$
        _timeoutText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_timeoutText, BPMPackage.eINSTANCE.getRemoteType_Timeout());

        factory.createLabel(restGroup, "Use Form Based Authentication");
        _useFormBasedAuthCombo = new Combo(restGroup, SWT.DROP_DOWN | SWT.BORDER);
        factory.adapt(_useFormBasedAuthCombo);
        _useFormBasedAuthCombo.add("true");
        _useFormBasedAuthCombo.add("false");
        _useFormBasedAuthCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_useFormBasedAuthCombo, BPMPackage.eINSTANCE.getRemoteRestType_UseFormBasedAuth());

        Composite actionsComposite = factory.createComposite(this);
        actionsComposite.setLayout(new GridLayout());
        GridData tableGD = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 4);
        actionsComposite.setLayoutData(tableGD);

        Section actionsSection = factory.createSection(actionsComposite, Section.TITLE_BAR | Section.EXPANDED);
        actionsSection.setText("Extra JAXB Classes");
        actionsSection.setLayout(new GridLayout());
        actionsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        _extraJaxbClassesTable = new BpmExtraJaxbClassesTable(actionsSection, SWT.NONE);
        _extraJaxbClassesTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        factory.adapt(_extraJaxbClassesTable);
        actionsSection.setClient(_extraJaxbClassesTable);
    }

    /**
     * @param remoteREST the container to be edited.
     */
    public void setRemoteREST(RemoteRestType remoteREST) {
        if (remoteREST == null) {
            remoteREST = BPMFactory.eINSTANCE.createRemoteRestType();
        }
        _remoteREST = remoteREST;

        _updating = true;

        _deploymentIdText.setText(_remoteREST.getDeploymentId() == null ? "" : _remoteREST.getDeploymentId()); //$NON-NLS-1$
        _passwordText.setText(_remoteREST.getPassword() == null ? "" : _remoteREST.getPassword()); //$NON-NLS-1$
        _urlText.setText(_remoteREST.getUrl() == null ? "" : _remoteREST.getUrl()); //$NON-NLS-1$
        String timeoutValue = PropTypeUtil.getPropValueString(_remoteREST.getTimeout());
        _timeoutText.setText(timeoutValue == null ? "" : timeoutValue); //$NON-NLS-1$
        _userNameText.setText(_remoteREST.getUserName() == null ? "" : _remoteREST.getUserName()); //$NON-NLS-1$
        String formBasedAuthValue = PropTypeUtil.getPropValueString(_remoteREST.getUseFormBasedAuth());
        _useFormBasedAuthCombo.setText(formBasedAuthValue == null ? "" : formBasedAuthValue); //$NON-NLS-1$
        _extraJaxbClassesTable.setTargetObject(_remoteREST);
        
        _updating = false;
    }

    /**
     * @return the container being edited.
     */
    public RemoteRestType getRemoteREST() {
        return _remoteREST;
    }

    protected void wrapOperation(final Runnable runner) {
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(_remoteREST);
        if (domain != null) {
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    try {
                        runner.run();
                    } catch (Exception e) {
                        Activator.logError(e);
                    }
                }
            });
        } else {
            try {
                runner.run();
            } catch (Exception e) {
                Activator.logError(e);
            }
        }
    }

    private void handleTextChange(final Text text, final EObject eobj, final EStructuralFeature feature) {
        final String newValue = text.getText().length() == 0 ? null 
                : text.getText();
        if (!_updating
                && ((newValue == null && eobj.eGet(feature) != null) 
                        || (newValue != null && !newValue.equals(eobj.eGet(feature))))) {
            wrapOperation(new Runnable() {
                public void run() {
                    eobj.eSet(feature, newValue);
                }
            });
            fireChangedEvent(this);
            if (getContainer() != null) {
                getContainer().validated(validate());
            }
        }
    }
    
    private void handleComboChange(final Combo combo, final EObject eobj, final EStructuralFeature feature) {
        final String newValue = combo.getText().length() == 0 ? null 
                : combo.getText();
        if (!_updating
                && ((newValue == null && eobj.eGet(feature) != null) 
                        || (newValue != null && !newValue.equals(eobj.eGet(feature))))) {
            wrapOperation(new Runnable() {
                public void run() {
                    eobj.eSet(feature, newValue);
                }
            });
            fireChangedEvent(this);
            if (getContainer() != null) {
                getContainer().validated(validate());
            }
        }
    }

    @Override
    public void refresh() {
        if (getTargetObject().getManifest() != null) {
            setRemoteREST(getTargetObject().getManifest().getRemoteRest());
        }
    }

    private void addModifyText(final Control control, final EStructuralFeature feature) {
        if (control instanceof Text) {
            final Text text = (Text) control;
            text.addModifyListener(new ModifyListener() {
                @Override
                public void modifyText(ModifyEvent e) {
                    handleTextChange(text, getRemoteREST(), feature);
                }
            });
        } else if (control instanceof Combo) {
            final Combo combo = (Combo) control;
            combo.addModifyListener(new ModifyListener() {
                @Override
                public void modifyText(ModifyEvent e) {
                    handleComboChange(combo, getRemoteREST(), feature);
                }
            });
        }
    }

    /* (non-Javadoc)
     * @see org.switchyard.tools.ui.editor.property.AbstractModelComposite#validate()
     */
    @Override
    public IStatus validate() {
        String errMessage = null;

        if (getRemoteREST() != null) {
            if (getRemoteREST().getDeploymentId() == null || getRemoteREST().getDeploymentId().trim().isEmpty()) {
                errMessage = "Deployment ID must be specified.";
            } else if (!getRemoteREST().getDeploymentId().matches(GAV_PATTERN.toString())) {
                errMessage = "Deployment ID must be specified in the GAV pattern - 'groupID:artifactId:version'.";
            } else if (getRemoteREST().getUrl() == null || getRemoteREST().getUrl().trim().isEmpty()) {
                errMessage = "REST URL must be specified.";
            } else if (getRemoteREST().getUrl() != null) {
                try {
                    new URL(getRemoteREST().getUrl());
                } catch (MalformedURLException e) {
                    errMessage = e.getLocalizedMessage();
                }
            }
        }

        if (errMessage != null) {
            return new Status(IStatus.ERROR, Activator.PLUGIN_ID, errMessage);
        }
        return Status.OK_STATUS;
    }
}
