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
import org.switchyard.tools.models.switchyard1_0.bpm.RemoteJmsType;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.property.AbstractChangeAwareModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;
import org.switchyard.tools.ui.editor.util.PropTypeUtil;

/**
 * RemoteJMSContainerDetailsComposite
 * 
 * Controls for editing a Remote JMS container object (ContainerType).
 */
public class RemoteJMSContainerDetailsComposite extends AbstractChangeAwareModelComposite<BPMImplementationType> {

    private static final Pattern GAV_PATTERN = Pattern.compile("([^: ]*)(:([^: ]*)(:([^: ]*))?)?"); //$NON-NLS-1$

    private RemoteJmsType _remoteJMS = null;
    private boolean _updating = false;
    private Text _deploymentIdText;
    private Text _userNameText;
    private Text _passwordText;
    private Text _timeoutText;
    private Combo _useSSLCombo;
    private Text _hostNameText;
    private Text _keystorePasswordText;
    private Text _keystoreLocationText;
    private Text _truststorePasswordText;
    private Text _truststoreLocationText;
    private Text _remotingPortText;
    private Text _messagingPortText;
    private boolean _usesSSL = false;
    private BpmExtraJaxbClassesTable _extraJaxbClassesTable;

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
            if (newValue != null) {
                _usesSSL = !newValue.equals("false");
            } else {
                _usesSSL = false;
            }
            wrapOperation(new Runnable() {
                public void run() {
                    eobj.eSet(feature, newValue);
                }
            });
            updateSSLFields();
            fireChangedEvent(this);
            if (getContainer() != null) {
                getContainer().validated(validate());
            }
       }
    }
    
    private void updateSSLFields() {
        _keystoreLocationText.setEnabled(_usesSSL);
        _keystorePasswordText.setEnabled(_usesSSL);
        _truststoreLocationText.setEnabled(_usesSSL);
        _truststorePasswordText.setEnabled(_usesSSL);
        
        if (!_updating && !_usesSSL) {
            wrapOperation(new Runnable() {
                public void run() {
                    if (!_keystoreLocationText.getText().isEmpty()) {
                        _keystoreLocationText.setText("");
                        getRemoteJMS().setKeystoreLocation(null);
                    }
                    if (!_keystorePasswordText.getText().isEmpty()) {
                        _keystorePasswordText.setText("");
                        getRemoteJMS().setKeystorePassword(null);
                    }
                    if (!_truststoreLocationText.getText().isEmpty()) {
                        _truststoreLocationText.setText("");
                        getRemoteJMS().setTruststoreLocation(null);
                    }
                    if (!_truststorePasswordText.getText().isEmpty()) {
                        _truststorePasswordText.setText("");
                        getRemoteJMS().setTruststorePassword(null);
                    }
                }
            });
        }
    }

    private void addModifyText(final Control control, final EStructuralFeature feature) {
        if (control instanceof Text) {
            final Text text = (Text) control;
            text.addModifyListener(new ModifyListener() {
                @Override
                public void modifyText(ModifyEvent e) {
                    handleTextChange(text, getRemoteJMS(), feature);
                }
            });
        } else if (control instanceof Combo) {
            final Combo combo = (Combo) control;
            combo.addModifyListener(new ModifyListener() {
                @Override
                public void modifyText(ModifyEvent e) {
                    handleComboChange(combo, getRemoteJMS(), feature);
                }
            });
        }
    }
    
    /**
     * Create a new KIEContainerDetailsComposite.
     * 
     * @param container the composite container.
     * @param parent the parent composite.
     * @param style any style bits from SWT.
     * @param factory the widget factory.
     */
    public RemoteJMSContainerDetailsComposite(ICompositeContainer container, Composite parent, int style, FormToolkit factory) {
        super(BPMImplementationType.class, container, parent, style);
        setLayout(new GridLayout(2, false));

        Composite deploymentIdComposite = factory.createComposite(this);
        deploymentIdComposite.setLayout(new GridLayout(2, false));
        deploymentIdComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

        factory.createLabel(deploymentIdComposite, "Deployment ID");
        _deploymentIdText = factory.createText(deploymentIdComposite, "", SWT.BORDER); //$NON-NLS-1$
        _deploymentIdText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_deploymentIdText, BPMPackage.eINSTANCE.getRemoteType_DeploymentId());

        Group jmsGroup = new Group(this, SWT.NONE); 
        jmsGroup.setText("JMS Details");
        jmsGroup.setLayout(new GridLayout(2, false));
        jmsGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 4));
        jmsGroup.setToolTipText("Details for the remote resources location");

        factory.createLabel(jmsGroup, "Host Name");
        _hostNameText = factory.createText(jmsGroup, "", SWT.BORDER); //$NON-NLS-1$
        _hostNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_hostNameText, BPMPackage.eINSTANCE.getRemoteJmsType_HostName());

        factory.createLabel(jmsGroup, "Remoting Port");
        _remotingPortText = factory.createText(jmsGroup, "", SWT.BORDER); //$NON-NLS-1$
        _remotingPortText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_remotingPortText, BPMPackage.eINSTANCE.getRemoteJmsType_RemotingPort());

        factory.createLabel(jmsGroup, "Messaging Port");
        _messagingPortText = factory.createText(jmsGroup, "", SWT.BORDER); //$NON-NLS-1$
        _messagingPortText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_messagingPortText, BPMPackage.eINSTANCE.getRemoteJmsType_MessagingPort());

        factory.createLabel(jmsGroup, "User Name");
        _userNameText = factory.createText(jmsGroup, "", SWT.BORDER); //$NON-NLS-1$
        _userNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_userNameText, BPMPackage.eINSTANCE.getRemoteType_UserName());

        factory.createLabel(jmsGroup, "Password");
        _passwordText = factory.createText(jmsGroup, "", SWT.BORDER); //$NON-NLS-1$
        _passwordText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _passwordText.setEchoChar('*');
        addModifyText(_passwordText, BPMPackage.eINSTANCE.getRemoteType_Password());

        factory.createLabel(jmsGroup, "Timeout");
        _timeoutText = factory.createText(jmsGroup, "", SWT.BORDER); //$NON-NLS-1$
        _timeoutText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_timeoutText, BPMPackage.eINSTANCE.getRemoteType_Timeout());
    
        Group secureGroup = new Group(this, SWT.NONE); 
        secureGroup.setText("SSL Details");
        secureGroup.setLayout(new GridLayout(2, false));
        secureGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 4));
        secureGroup.setToolTipText("Details for the remote JMS resources location");
        
        factory.createLabel(secureGroup, "Use SSL");
        _useSSLCombo = new Combo(secureGroup, SWT.DROP_DOWN | SWT.BORDER);
        factory.adapt(_useSSLCombo);
        _useSSLCombo.add("true");
        _useSSLCombo.add("false");
        _useSSLCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_useSSLCombo, BPMPackage.eINSTANCE.getRemoteJmsType_UseSsl());

        factory.createLabel(secureGroup, "Keystore Password");
        _keystorePasswordText = factory.createText(secureGroup, "", SWT.BORDER); //$NON-NLS-1$
        _keystorePasswordText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _keystorePasswordText.setEchoChar('*');
        addModifyText(_keystorePasswordText, BPMPackage.eINSTANCE.getRemoteJmsType_KeystorePassword());

        factory.createLabel(secureGroup, "Keystore Location");
        _keystoreLocationText = factory.createText(secureGroup, "", SWT.BORDER); //$NON-NLS-1$
        _keystoreLocationText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_keystoreLocationText, BPMPackage.eINSTANCE.getRemoteJmsType_KeystoreLocation());

        factory.createLabel(secureGroup, "Truststore Password");
        _truststorePasswordText = factory.createText(secureGroup, "", SWT.BORDER); //$NON-NLS-1$
        _truststorePasswordText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _truststorePasswordText.setEchoChar('*');
        addModifyText(_truststorePasswordText, BPMPackage.eINSTANCE.getRemoteJmsType_TruststorePassword());

        factory.createLabel(secureGroup, "Truststore Location");
        _truststoreLocationText = factory.createText(secureGroup, "", SWT.BORDER); //$NON-NLS-1$
        _truststoreLocationText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        addModifyText(_truststoreLocationText, BPMPackage.eINSTANCE.getRemoteJmsType_TruststoreLocation());

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
     * @param remoteJMS the container to be edited.
     */
    public void setRemoteJMS(RemoteJmsType remoteJMS) {
        if (remoteJMS == null) {
            remoteJMS = BPMFactory.eINSTANCE.createRemoteJmsType();
        }
        _remoteJMS = remoteJMS;

        _updating = true;
        
        _deploymentIdText.setText(_remoteJMS.getDeploymentId() == null ? "" : _remoteJMS.getDeploymentId()); //$NON-NLS-1$
        _hostNameText.setText(_remoteJMS.getHostName() == null ? "" : _remoteJMS.getHostName()); //$NON-NLS-1$
        String remotingPortValue = PropTypeUtil.getPropValueString(_remoteJMS.getRemotingPort());
        _remotingPortText.setText(remotingPortValue == null ? "" : remotingPortValue); //$NON-NLS-1$
        String messagingPortValue = PropTypeUtil.getPropValueString(_remoteJMS.getMessagingPort());
        _messagingPortText.setText(messagingPortValue == null ? "" : messagingPortValue); //$NON-NLS-1$
        String sslValue = PropTypeUtil.getPropValueString(_remoteJMS.getUseSsl());
        if (sslValue != null) {
            _usesSSL = !sslValue.equals("false");
        } else {
            _usesSSL = false;
        }
        _useSSLCombo.setText(sslValue == null ? "" : sslValue); //$NON-NLS-1$
        _keystoreLocationText.setText(_remoteJMS.getKeystoreLocation() == null ? "" : _remoteJMS.getKeystoreLocation()); //$NON-NLS-1$
        _keystorePasswordText.setText(_remoteJMS.getKeystorePassword() == null ? "" : _remoteJMS.getKeystorePassword()); //$NON-NLS-1$
        _passwordText.setText(_remoteJMS.getPassword() == null ? "" : _remoteJMS.getPassword()); //$NON-NLS-1$
        String timeoutValue = PropTypeUtil.getPropValueString(_remoteJMS.getTimeout());
        _timeoutText.setText(timeoutValue == null ? "" : timeoutValue); //$NON-NLS-1$
        _truststoreLocationText.setText(_remoteJMS.getTruststoreLocation() == null ? "" : _remoteJMS.getTruststoreLocation()); //$NON-NLS-1$
        _truststorePasswordText.setText(_remoteJMS.getTruststorePassword() == null ? "" : _remoteJMS.getTruststorePassword()); //$NON-NLS-1$
        _userNameText.setText(_remoteJMS.getUserName() == null ? "" : _remoteJMS.getUserName()); //$NON-NLS-1$
        _extraJaxbClassesTable.setTargetObject(_remoteJMS);
        updateSSLFields();
        
        _updating = false;
    }

    /**
     * @return the container being edited.
     */
    public RemoteJmsType getRemoteJMS() {
        return _remoteJMS;
    }

    protected void wrapOperation(final Runnable runner) {
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(_remoteJMS);
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

    @Override
    public void refresh() {
        if (getTargetObject().getManifest() != null) {
            setRemoteJMS(getTargetObject().getManifest().getRemoteJms());
        }
    }

    /* (non-Javadoc)
     * @see org.switchyard.tools.ui.editor.property.AbstractModelComposite#validate()
     */
    @Override
    public IStatus validate() {
        String errMessage = null;

        if (_remoteJMS != null) {
            if (_remoteJMS.getDeploymentId() == null || _remoteJMS.getDeploymentId().trim().isEmpty()) {
                errMessage = "Deployment ID must be specified.";
            } else if (!_remoteJMS.getDeploymentId().matches(GAV_PATTERN.toString())) {
                errMessage = "Deployment ID must be specified in the GAV pattern - 'groupID:artifactId:version'.";
            }
        }

        if (errMessage != null) {
            return new Status(IStatus.ERROR, Activator.PLUGIN_ID, errMessage);
        }
        return Status.OK_STATUS;
    }
}
