/******************************************************************************* 
 * Copyright (c) 2012-2014 Red Hat, Inc. 
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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
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
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
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
    private WritableValue _bindingValue;

    CamelSFTPSecurityComposite(FormToolkit toolkit) {
        super(toolkit);
    }

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
            _bindingValue.setValue(_binding);
        } else {
            _bindingValue.setValue(null);
        }
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getFTPSTabControl(_panel);

        bindControls(context);
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
                // make sure a notify event gets sent, to update the binding
                _privateKeyFileText.notifyListeners(SWT.Modify, null);
                // simulate "ENTER" to commit the change
                _privateKeyFileText.notifyListeners(SWT.DefaultSelection, null);
                _privateKeyFileText.setFocus();
            }
        }
    }
  
    @Override
    public Composite getPanel() {
        return this._panel;
    }

    protected void handleModify(Control control) {
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            super.handleUndo(control);
        }
    }

    private void bindControls(final DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_privateKeyFileText.getDisplay());

        _bindingValue = new WritableValue(realm, null, CamelSftpBindingType.class);

        org.eclipse.core.databinding.Binding binding = context
                .bindValue(
                        SWTObservables.observeText(_privateKeyFileText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_privateKeyFilePassphraseText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
    }    

    /* (non-Javadoc)
     * @see org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite#dispose()
     */
    @Override
    public void dispose() {
        _bindingValue.dispose();
        super.dispose();
    }
}
