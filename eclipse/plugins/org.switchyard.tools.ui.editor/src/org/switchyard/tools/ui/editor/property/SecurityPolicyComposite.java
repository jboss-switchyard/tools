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
package org.switchyard.tools.ui.editor.property;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;

/**
 * @author bfitzpat
 * 
 */
public class SecurityPolicyComposite extends AbstractModelComposite<Contract> {

    private static final String CONFIDENTIALITY = "confidentiality";
    private static final String CLIENT_AUTHENTICATION = "clientAuthentication";
    private static final String AUTHORIZATION = "authorization";
    private boolean _inUpdate = false;
    private Button _clientAuthCheckbox;
    private Button _confidentialityCheckbox;
    private Button _authorizationCheckbox;

    /**
     * Create a new SecurityPolicyComposite.
     * 
     * @param container the container
     * @param parent the parent composite
     * @param style style bits
     */
    public SecurityPolicyComposite(ICompositeContainer container, Composite parent, int style) {
        super(Contract.class, container, parent, style);

        FormLayout layout = new FormLayout();
        layout.marginBottom = ITabbedPropertyConstants.VMARGIN;
        layout.marginTop = ITabbedPropertyConstants.VMARGIN;
        layout.marginLeft = ITabbedPropertyConstants.HMARGIN;
        layout.marginRight = ITabbedPropertyConstants.HMARGIN;
        setLayout(layout);

        FormToolkit factory = getWidgetFactory();

        _authorizationCheckbox = factory.createButton(this, "Authorization", SWT.CHECK);
        FormData data = new FormData();
        data.left = new FormAttachment(1, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, 0);
        _authorizationCheckbox.setLayoutData(data);
        _authorizationCheckbox.addSelectionListener(new CheckboxSelectionListener());
        _authorizationCheckbox.setData(AUTHORIZATION);

        _clientAuthCheckbox = factory.createButton(this, "Client Authentication", SWT.CHECK);
        data = new FormData();
        data.left = new FormAttachment(1, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(_authorizationCheckbox, 5, 0);
        _clientAuthCheckbox.setLayoutData(data);
        _clientAuthCheckbox.addSelectionListener(new CheckboxSelectionListener());
        _clientAuthCheckbox.setData(CLIENT_AUTHENTICATION);

        _confidentialityCheckbox = factory.createButton(this, "Confidentiality", SWT.CHECK);
        data = new FormData();
        data.left = new FormAttachment(1, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(_clientAuthCheckbox, 5, 0);
        _confidentialityCheckbox.setLayoutData(data);
        _confidentialityCheckbox.addSelectionListener(new CheckboxSelectionListener());
        _confidentialityCheckbox.setData(CONFIDENTIALITY);
    }

    private void updatePolicy(final Contract contract, final Button control) {
        final String securityPolicy = (String) control.getData();
        wrapOperation(new Runnable() {
            @Override
            public void run() {
                List<QName> requires = contract.getRequires();
                if (requires == null) {
                    requires = new ArrayList<QName>();
                    contract.setRequires(requires);
                }
                for (QName requiresItem : requires) {
                    String localPart = requiresItem.getLocalPart();
                    if (securityPolicy.contentEquals(localPart)) {
                        requires.remove(requiresItem);
                        break;
                    }
                }
                if (control.getSelection()) {
                    QName newQName = new QName(securityPolicy);
                    requires.add(newQName);
                }
                if (requires.isEmpty()) {
                    contract.setRequires(null);
                }
            }
        });
    }

    @Override
    public void refresh() {
        _inUpdate = true;
        try {
            boolean clientAuthentication = false;
            boolean confidentiality = false;
            boolean authentication = false;
            boolean showClientAuthCheckbox = true;
            boolean showAuthorizationCheckbox = true;
            Contract contract = getTargetObject();
            if (contract != null) {
                List<QName> requires = contract.getRequires();
                if (requires != null) {
                    for (QName requiresItem : requires) {
                        String localPart = requiresItem.getLocalPart();
                        if (CLIENT_AUTHENTICATION.contentEquals(localPart)) {
                            clientAuthentication = true;
                        }
                        if (CONFIDENTIALITY.contentEquals(localPart)) {
                            confidentiality = true;
                        }
                        if (AUTHORIZATION.contentEquals(localPart)) {
                            authentication = true;
                        }
                    }
                }
                if (contract.eContainer() instanceof Component && contract instanceof ComponentReference) {
                    showClientAuthCheckbox = false;
                }
                if (contract.eContainer() instanceof Component && contract instanceof ComponentReference) {
                    showAuthorizationCheckbox = false;
                }
            }

            if (!_clientAuthCheckbox.isDisposed()) {
                _clientAuthCheckbox.setEnabled(showClientAuthCheckbox);
            }

            if (clientAuthentication && _clientAuthCheckbox != null && !_clientAuthCheckbox.isDisposed()) {
                _clientAuthCheckbox.setSelection(clientAuthentication);
            }

            if (confidentiality && !_confidentialityCheckbox.isDisposed()) {
                _confidentialityCheckbox.setSelection(confidentiality);
            }

            if (!_authorizationCheckbox.isDisposed()) {
                _authorizationCheckbox.setEnabled(showAuthorizationCheckbox);
            }

            if (authentication && !_authorizationCheckbox.isDisposed()) {
                _authorizationCheckbox.setSelection(confidentiality);
            }
        } finally {
            _inUpdate = false;
        }
    }

    private class CheckboxSelectionListener implements SelectionListener {
        @Override
        public void widgetSelected(SelectionEvent e) {
            widgetDefaultSelected(e);
        }

        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
            final Contract contract = getTargetObject();
            if (contract != null && !_inUpdate) {
                Button button = (Button) e.widget;
                updatePolicy(contract, button);
            }
        }
    }

}
