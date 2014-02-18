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
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
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
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelSFTPConsumerMoveAndPollComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelSftpBindingType _binding = null;
    private Text _preMoveText;
    private Text _moveText;
    private Text _moveFailedText;
    private Text _delayText;
    private Text _maxMessagesPerPollText;
    private WritableValue _bindingValue;

    CamelSFTPConsumerMoveAndPollComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.CamelFTPConsumerMoveAndPollComposite_MoveAndPoll_wizard_page_title;
    }

    @Override
    public String getDescription() {
        return Messages.CamelFTPConsumerMoveAndPollComposite_MoveAndPoll_wizard_page_description;
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
    public void setTargetObject(EObject target) {
        super.setTargetObject(target);
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

        Group moveGroup = new Group(composite, SWT.NONE);
        moveGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        moveGroup.setLayout(new GridLayout(2, false));
        moveGroup.setText(Messages.label_moveOptions);

        _preMoveText = createLabelAndText(moveGroup, Messages.label_preMove);
        _moveText = createLabelAndText(moveGroup, Messages.label_moveDefaultDotCamel);
        _moveFailedText = createLabelAndText(moveGroup, Messages.label_moveFailed);

        Group pollGroup = new Group(composite, SWT.NONE);
        pollGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        pollGroup.setLayout(new GridLayout(2, false));
        pollGroup.setText(Messages.label_pollOptions);

        _delayText = createLabelAndText(pollGroup, Messages.label_delayBetweenPollsDefault500);
        _maxMessagesPerPollText = createLabelAndText(pollGroup, Messages.label_maxMessagesPerPollDefault0);

        return composite;
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
        final Realm realm = SWTObservables.getRealm(_preMoveText.getDisplay());

        _bindingValue = new WritableValue(realm, null, CamelSftpBindingType.class);

        FeaturePath path = FeaturePath.fromList(
                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__CONSUME,
                FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__PRE_MOVE
              );

        org.eclipse.core.databinding.Binding binding = context
                .bindValue(
                        SWTObservables.observeText(_preMoveText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(
                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__CONSUME,
                FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__MOVE
              );

        binding = context.bindValue(
                        SWTObservables.observeText(_moveText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(
                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__CONSUME,
                FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__MOVE_FAILED
              );

        binding = context.bindValue(
                        SWTObservables.observeText(_moveFailedText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(
                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__CONSUME,
                FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__DELAY
              );

        binding = context.bindValue(
                        SWTObservables.observeText(_delayText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT).setAfterConvertValidator(
                                        new EscapedPropertyIntegerValidator("Delay must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}')."))
                                        , null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(
                FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__CONSUME,
                FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL
              );

        binding = context.bindValue(
                        SWTObservables.observeText(_maxMessagesPerPollText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT).setAfterConvertValidator(
                                        new EscapedPropertyIntegerValidator("Max Messages per Poll must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}')."))
                                        , null);
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
