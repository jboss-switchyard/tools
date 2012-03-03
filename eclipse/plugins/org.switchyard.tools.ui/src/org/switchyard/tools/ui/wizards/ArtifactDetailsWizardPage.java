/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2012 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.switchyard.tools.ui.wizards;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardPage;
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
        setTitle("Artifact Details");
        setDescription("Specify details about the artifact reference.");
    }

    @Override
    public void createControl(Composite parent) {
        Composite content = new Composite(parent, SWT.NONE);
        content.setLayout(new GridLayout(2, false));

        Label label = new Label(content, SWT.NONE);
        label.setText("Artifact Name:");

        _nameText = new Text(content, SWT.SINGLE | SWT.BORDER);
        _nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _nameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                validate();
            }
        });

        label = new Label(content, SWT.NONE);
        label.setText("Artifact URL:");

        _urlText = new Text(content, SWT.SINGLE | SWT.BORDER);
        _urlText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _urlText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                validate();
            }
        });

        _downloadCheckbox = new Button(content, SWT.CHECK);
        _downloadCheckbox.setText("Download artifact to workspace?");
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
        _nameText.setText(name == null ? "" : name);
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
        _urlText.setText(url == null ? "" : url);
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
            setErrorMessage("Must specify a name.");
        } else if (isDuplicateName(_nameText.getText())) {
            setErrorMessage("An artifact with the specified name already exists.  Please specify a unique name.");
        } else if (_urlText.getText().isEmpty()) {
            setErrorMessage("Must specify a URL.");
        } else {
            try {
                new URL(_urlText.getText());
                setErrorMessage(null);
            } catch (MalformedURLException e) {
                setErrorMessage("The specified URL is invalid: " + e.getLocalizedMessage());
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
