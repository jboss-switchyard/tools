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
package org.switchyard.tools.ui.wizards;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.switchyard.config.model.switchyard.ArtifactModel;
import org.switchyard.config.model.switchyard.ArtifactsModel;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * ArtifactDetailsWizardPage
 * 
 * <p/>
 * Wizard page for collecting details about a referenced artifact.
 * 
 * @author Rob Cernich
 */
public class ArtifactDetailsWizardPage extends WizardPage {

    private boolean _supportsDownload;
    private Text _nameText;
    private Text _urlText;
    private Button _downloadCheckbox;

    /**
     * Create a new ArtifactDetailsWizardPage.
     * 
     * @param supportsDownload true if the containing wizard supports download.
     */
    protected ArtifactDetailsWizardPage(boolean supportsDownload) {
        super(ArtifactDetailsWizardPage.class.getName());
        _supportsDownload = supportsDownload;
        setTitle(Messages.ArtifactDetailsWizardPage_wizardPageTitle);
        setDescription(Messages.ArtifactDetailsWizardPage_wizardPageDescription);
    }

    @Override
    public void createControl(Composite parent) {
        Composite content = new Composite(parent, SWT.NONE);
        content.setLayout(new GridLayout(2, false));

        Label label = new Label(content, SWT.NONE);
        label.setText(Messages.ArtifactDetailsWizardPage_labelArtifactName);

        _nameText = new Text(content, SWT.SINGLE | SWT.BORDER);
        _nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _nameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                validate();
            }
        });

        label = new Label(content, SWT.NONE);
        label.setText(Messages.ArtifactDetailsWizardPage_labelArtifactURL);

        _urlText = new Text(content, SWT.SINGLE | SWT.BORDER);
        _urlText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _urlText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                validate();
            }
        });

        _downloadCheckbox = new Button(content, SWT.CHECK);
        _downloadCheckbox.setText(Messages.ArtifactDetailsWizardPage__checkboxLabelDownloadArtifactToWorkspace);
        _downloadCheckbox.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false, 2, 1));
        _downloadCheckbox.setEnabled(_supportsDownload);
        _downloadCheckbox.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                getContainer().updateButtons();
            }
        });

        validate();
        setErrorMessage(null);

        _nameText.setFocus();
        
        setControl(content);
    }

    /**
     * @return the specified name
     */
    public String getArtifactName() {
        if (_nameText == null) {
            return null;
        }
        return _nameText.getText();
    }

    /**
     * @param name the specified name
     */
    public void setArtifactName(String name) {
        if (_nameText == null) {
            return;
        }
        _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
    }

    /**
     * @return the specified url
     */
    public String getArtifactURL() {
        if (_urlText == null) {
            return null;
        }
        return _urlText.getText();
    }

    /**
     * @param url the specified url
     */
    public void setArtifactURL(String url) {
        if (_urlText == null) {
            return;
        }
        _urlText.setText(url == null ? "" : url); //$NON-NLS-1$
    }

    /**
     * @return true if the wizard should attempt to download the artifact on
     *         finish
     */
    public boolean isDownloadArtifact() {
        if (_downloadCheckbox == null) {
            return false;
        }
        return _downloadCheckbox.getSelection();
    }

    private void validate() {
        if (_nameText.getText().isEmpty()) {
            setErrorMessage(Messages.ArtifactDetailsWizardPage_errorMessage_mustSpecifyName);
        } else if (isDuplicateName(_nameText.getText())) {
            setErrorMessage(Messages.ArtifactDetailsWizardPage_errorMessage_nameAlreadyExists);
        } else if (_urlText.getText().isEmpty()) {
            setErrorMessage(Messages.ArtifactDetailsWizardPage_errorMessage_mustSpecifyURL);
        } else {
            try {
                new URL(_urlText.getText());
                setErrorMessage(null);
            } catch (MalformedURLException e) {
                String message = NLS.bind(Messages.ArtifactDetailsWizardPage_errorMessage_urlInvalid, e.getLocalizedMessage());
                setErrorMessage(message);
            }
        }
        setPageComplete(getErrorMessage() == null);
    }

    private boolean isDuplicateName(String name) {
        IWizard wizard = getWizard();
        if (wizard instanceof NewArtifactReferenceWizard) {
            ArtifactsModel artifacts = ((NewArtifactReferenceWizard) wizard).getArtifacts();
            if (artifacts == null) {
                return false;
            }
            for (ArtifactModel artifact : artifacts.getArtifacts()) {
                if (name.equals(artifact.getName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
