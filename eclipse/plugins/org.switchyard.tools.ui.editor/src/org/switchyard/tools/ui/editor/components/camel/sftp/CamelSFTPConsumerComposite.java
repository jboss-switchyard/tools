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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.EscapedPropertyIntegerValidator;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelSFTPConsumerComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelSftpBindingType _binding = null;
    private Text _nameText;
    private Text _hostText;
    private Text _portText;
    private Text _usernameText;
    private Text _pwdText;
    private Button _binaryButton;
    private Text _directoryText;
    private Button _autoCreateButton;
    private Text _fileNameText;
    private Button _deleteButton;
    private Button _recursiveButton;
    private Text _includeText;
    private Text _excludeText;
    private OperationSelectorComposite _opSelectorComposite;
    private WritableValue _bindingValue;

    CamelSFTPConsumerComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_sftpBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_sftpBindingDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelSftpBindingType) {
            this._binding = (CamelSftpBindingType) impl;
            _bindingValue.setValue(_binding);
            // refresh the operation selector control
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed() && getTargetObject() != null) {
                _opSelectorComposite.setTargetObject(getTargetObject());
            }

            _opSelectorComposite.setBinding(_binding);
        } else {
            _bindingValue.setValue(null);
        }
    }

    @Override
    public void setTargetObject(EObject target) {
        super.setTargetObject(target);
        if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
            _opSelectorComposite.setTargetObject((EObject) target);
        }
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getConsumerTabControl(_panel);
        
        bindControls(context);
    }
    
    private Control getConsumerTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);

        _hostText = createLabelAndText(composite, Messages.label_host);
        _portText = createLabelAndText(composite, Messages.label_portDefault21);
        _usernameText = createLabelAndText(composite, Messages.label_userName);
        _pwdText = createLabelAndText(composite, Messages.label_password);
        _pwdText.setEchoChar('*');
        _binaryButton = createCheckbox(composite, Messages.label_useBinaryTransferMode, 2);

        Group fileGroup = new Group(composite, SWT.NONE);
        fileGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        fileGroup.setLayout(new GridLayout(2, false));
        fileGroup.setText(Messages.label_fileAndDirectoryOptions);

        _directoryText = createLabelAndText(fileGroup, Messages.label_directoryStar);
        _fileNameText = createLabelAndText(fileGroup, Messages.label_fileName);
        _autoCreateButton = createCheckbox(fileGroup, Messages.label_autoCreateMissingDirectories, 2);
        _includeText = createLabelAndText(fileGroup, Messages.label_include);
        _excludeText = createLabelAndText(fileGroup, Messages.label_exclude);
        _deleteButton = createCheckbox(fileGroup, Messages.label_deleteFilesOnceProcessed, 2);
        _recursiveButton = createCheckbox(fileGroup, Messages.label_processSubDirectoriesRecursively, 2);

        _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE, this);
        _opSelectorComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        _opSelectorComposite.setLayout(new GridLayout(2, false));
        _opSelectorComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                handleModify(_opSelectorComposite);
            }
         });

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    protected void handleModify(Control control) {
        // at this point, this is the only control we can't do with strict
        // databinding
        if (control.equals(_opSelectorComposite)) {
            fireChangedEvent(_opSelectorComposite);
        }
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            super.handleUndo(control);
        }
    }

    private void bindConsumerControls(final DataBindingContext context, final EditingDomain domain) {
        FeaturePath path = FeaturePath.fromList(
                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__CONSUME,
                FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__INCLUDE
              );

        org.eclipse.core.databinding.Binding binding = context
                .bindValue(
                        SWTObservables.observeText(_includeText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(
                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__CONSUME,
                FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__EXCLUDE
              );
        
        binding = context
                .bindValue(
                        SWTObservables.observeText(_excludeText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(
                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__CONSUME,
                FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__DELETE
              );
        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_deleteButton),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(
                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__CONSUME,
                FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__RECURSIVE
              );
        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_recursiveButton),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

    }

    private void bindControls(final DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_nameText.getDisplay());

        _bindingValue = new WritableValue(realm, null, CamelSftpBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "SFTP binding name should not be empty", Status.WARNING)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        /*
         * we also want to bind the name field to the binding name. note that
         * the model to target updater is configured to NEVER update. we want
         * the camel binding name to be the definitive source for this field.
         */
        binding = context.bindValue(SWTObservables.observeText(_nameText, new int[] {SWT.Modify }), ObservablesUtil
                .observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "SFTP binding name should not be empty", Status.WARNING)), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_directoryText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__DIRECTORY),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                                .setAfterConvertValidator(new StringEmptyValidator(
                                        Messages.error_emptyDirectory)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_fileNameText , new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__FILE_NAME),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                "", UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_hostText , new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__HOST),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                "", UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_portText , new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__PORT),
                                new EMFUpdateValueStrategyNullForEmptyString("", 
                                        UpdateValueStrategy.POLICY_CONVERT).setAfterConvertValidator(
                                                new EscapedPropertyIntegerValidator("Port must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}')."))
                                                , null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_usernameText , new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__USERNAME),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                "", UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_pwdText , new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__PASSWORD),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                "", UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_autoCreateButton),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__AUTO_CREATE),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_binaryButton),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__BINARY),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        bindConsumerControls(context, domain);

        _opSelectorComposite.bindControls(domain, context);
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
