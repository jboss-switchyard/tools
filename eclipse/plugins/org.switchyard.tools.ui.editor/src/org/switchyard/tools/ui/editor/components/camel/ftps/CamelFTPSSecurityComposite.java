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
package org.switchyard.tools.ui.editor.components.camel.ftps;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelFTPSSecurityComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelFtpsBindingType _binding = null;
    private Button _isImplicitCheckbox;
    private ComboViewer _execProtCombo;
    private ComboViewer _securityProtocolCombo;
    private WritableValue _bindingValue;

    CamelFTPSSecurityComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_ftpsSecurityDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_ftpsSecurityDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelFtpsBindingType) {
            this._binding = (CamelFtpsBindingType) impl;
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
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);
        
        _securityProtocolCombo = createLabelAndComboViewer(composite, Messages.label_securityProtocol, true);
        _securityProtocolCombo.setContentProvider(ArrayContentProvider.getInstance());
        _securityProtocolCombo.setLabelProvider(new LabelProvider());
        String[] securityProtocols = new String[] {Messages.label_tls, Messages.label_ssl};
        _securityProtocolCombo.setInput(securityProtocols);
        getToolkit().adapt(_securityProtocolCombo.getControl(), true, true);

        _isImplicitCheckbox = createCheckbox(composite, Messages.label_implicit, 2);
        
        _execProtCombo = createLabelAndComboViewer(composite, Messages.label_executionProtocol, true);
        _execProtCombo.setContentProvider(ArrayContentProvider.getInstance());
        _execProtCombo.setLabelProvider(new LabelProvider());
        String[] execProts = new String[] {"C", "S", "E", "P"};
        _execProtCombo.setInput(execProts);
        getToolkit().adapt(_securityProtocolCombo.getControl(), true, true);
        
        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    protected void handleModify(final Control control) {
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
        final Realm realm = SWTObservables.getRealm(_securityProtocolCombo.getCombo().getDisplay());

        _bindingValue = new WritableValue(realm, null, CamelFtpsBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                ViewersObservables.observeSingleSelection(_securityProtocolCombo),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        FtpPackage.Literals.CAMEL_FTPS_BINDING_TYPE__SECURITY_PROTOCOL));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context.bindValue(
                ViewersObservables.observeSingleSelection(_execProtCombo),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        FtpPackage.Literals.CAMEL_FTPS_BINDING_TYPE__EXEC_PROT));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_isImplicitCheckbox),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                FtpPackage.Literals.CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

    }    
}
