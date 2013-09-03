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
package org.switchyard.tools.ui.editor.components.camel.sftp;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class CamelSFTPSecurityComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelSftpBindingType _binding = null;
    private Text _privateKeyFileText;
    private Text _privateKeyFilePassphraseText;
    private Button _browseBtn;

    @Override
    public String getTitle() {
        return Messages.title_sftpSecurityDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_sftpSecurityDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelSftpBindingType) {
            this._binding = (CamelSftpBindingType) impl;
            setInUpdate(true);
            if (this._binding.getPrivateKeyFile() != null) {
                _privateKeyFileText.setText(this._binding.getPrivateKeyFile());
            } else {
                _privateKeyFileText.setText(""); //$NON-NLS-1$
            }
            if (this._binding.getPrivateKeyFilePassphrase() != null) {
                _privateKeyFilePassphraseText.setText(this._binding.getPrivateKeyFilePassphrase());
            } else {
                _privateKeyFilePassphraseText.setText(""); //$NON-NLS-1$
            }
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getFTPSTabControl(_panel);
    }
    
    private Control getFTPSTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(3, false);
        composite.setLayout(gl);
        
        _privateKeyFileText = createLabelAndText(composite, Messages.label_privateKeyFile);
        _browseBtn = new Button(composite, SWT.PUSH);
        _browseBtn.setText(Messages.buton_dots);
        _browseBtn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                browse();
            }
        });
        
        _privateKeyFilePassphraseText = createLabelAndText(composite, Messages.label_privateKeyFilePassphrase);
        GridData gd = new GridData(SWT.FILL, SWT.TOP, true, false);
        gd.horizontalSpan = 2;
        _privateKeyFilePassphraseText.setLayoutData(gd);
        
        return composite;
    }

    private void browse() {
        final String pathString = _privateKeyFileText.getText();
        IResource resource = null;
        IProject resProject = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
        IJavaProject javaProject = JavaCore.create(resProject);
        if (pathString == null || pathString.isEmpty()) {
            final IResource temp = JavaUtil.getFirstResourceRoot(javaProject);
            resource = temp == null ? javaProject.getResource() : temp;
        } else {
            final IPath path = new Path(pathString);
            if (path.isValidPath(pathString)) {
                try {
                    resource = javaProject.getProject().getWorkspace().getRoot().getFile(path);
                } catch (IllegalArgumentException e) {
                    final IResource temp = JavaUtil.getFirstResourceRoot(javaProject);
                    resource = temp == null ? javaProject.getResource() : temp;
                }
            } else {
                final IResource temp = JavaUtil.getFirstResourceRoot(javaProject);
                resource = temp == null ? javaProject.getResource() : temp;
            }
        }

        if (resource != null) {
            ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(getPanel().getShell(),
                    resource.getProject());
            dialog.setInitialPattern("*.*"); //$NON-NLS-1$
            dialog.setTitle(Messages.title_selectPrivateKeyFile);
            if (dialog.open() == ClasspathResourceSelectionDialog.OK) {
                _privateKeyFileText.setText(((IResource) dialog.getFirstResult()).getFullPath().toString());
                handleModify(_privateKeyFileText);
            }
        }
    }
  
    @Override
    public Composite getPanel() {
        return this._panel;
    }

    protected void handleModify(Control control) {
        if (control.equals(_privateKeyFileText)) {
            updateFeature(_binding, "privateKeyFile", _privateKeyFileText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_privateKeyFilePassphraseText)) {
            updateFeature(_binding, "privateKeyFilePassphrase", _privateKeyFilePassphraseText.getText().trim()); //$NON-NLS-1$
        } else {
            super.handleModify(control);
        }
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_privateKeyFileText)) {
                _privateKeyFileText.setText(this._binding.getPrivateKeyFile());
            } else if (control.equals(_privateKeyFilePassphraseText)) {
                _privateKeyFilePassphraseText.setText(this._binding.getPrivateKeyFilePassphrase());
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

}
