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
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
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
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.switchyard.tools.models.switchyard1_0.switchyard.DomainType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecuritiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

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
    private Combo _securityCombo;
    private Contract _contract;
    private ArrayList<String> _supportedSecurityPolicies;
    
    /**
     * Create a new SecurityPolicyComposite.
     * 
     * @param container the container
     * @param parent the parent composite
     * @param style style bits
     */
    public SecurityPolicyComposite(ICompositeContainer container, Composite parent, int style) {
        super(Contract.class, container, parent, style);

        _supportedSecurityPolicies = new ArrayList<String>();
        _supportedSecurityPolicies.add(CONFIDENTIALITY);
        _supportedSecurityPolicies.add(CLIENT_AUTHENTICATION);
        _supportedSecurityPolicies.add(AUTHORIZATION);

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
        
        Label _securityComboLabel = factory.createLabel(this, "Security Configuration");
        data = new FormData();
        data.left = new FormAttachment(1,0);
        data.top = new FormAttachment(_confidentialityCheckbox, 5, 0);
        _securityComboLabel.setLayoutData(data);
        
        _securityCombo = new Combo(this, SWT.DROP_DOWN | SWT.READ_ONLY);
        data = new FormData();
        data.left = new FormAttachment(_securityComboLabel, 5, 0);
        data.top = new FormAttachment(_confidentialityCheckbox, 5, 0);
        data.right = new FormAttachment(100, 0);
        _securityCombo.setLayoutData(data);
        _securityCombo.addSelectionListener(new SelectionListener(){

            @Override
            public void widgetSelected(SelectionEvent e) {
                updateSecurity(_contract, _securityCombo.getText());
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
         });
        
    }

    private void updatePolicy(final Contract contract, final Button control) {
        final String securityPolicy = (String) control.getData();
        wrapOperation(new Runnable() {
            @Override
            public void run() {
                List<QName> requires = contract.getRequires();
                ArrayList<String> existing = new ArrayList<String>();
                
                if (requires != null) {
                    for (QName requiresItem : requires) {
                        String localPart = requiresItem.getLocalPart();
                        existing.add(localPart);
                    }
                    if (existing.contains(securityPolicy)) {
                        existing.remove(securityPolicy);
                    }
                }
                contract.setRequires(null);
                requires = new ArrayList<QName>();
                for (String existingItem : existing) {
                    QName newQName = new QName(existingItem);
                    requires.add(newQName);
                }
                if (control.getSelection()) {
                    QName newQName = new QName(securityPolicy);
                    requires.add(newQName);
                }
                if (!requires.isEmpty()) {
                    contract.setRequires(requires);
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
            boolean authorization = false;
            boolean showClientAuthCheckbox = true;
            boolean showAuthorizationCheckbox = true;
            boolean hasSecurityAttr = false;
            String securityName = null;
            Contract contract = getTargetObject();
            if (contract != null) {
                _contract = contract;
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
                            authorization = true;
                        }
                    }
                }
                if (contract.eContainer() instanceof Component && contract instanceof ComponentReference) {
                    showClientAuthCheckbox = false;
                }
                if (contract.eContainer() instanceof Component && contract instanceof ComponentReference) {
                    showAuthorizationCheckbox = false;
                }
                if (getFunkyAttributeValue(contract, "securityAttr") != null) {
                    hasSecurityAttr = true;
                    securityName = (String) getFunkyAttributeValue(contract,  "securityAttr");
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

            if (authorization && _authorizationCheckbox != null && !_authorizationCheckbox.isDisposed()) {
                _authorizationCheckbox.setSelection(authorization);
            }
            
            if (!_securityCombo.isDisposed()) {
                setupSecurityCombo(contract);
                if (hasSecurityAttr) {
                    _securityCombo.setText(securityName);
                } else {
                    _securityCombo.setText("default");
                }
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

    private Object getFunkyAttributeValue(Contract object, String propertyName) {
        Iterator<Entry> iter = object.getAnyAttribute().iterator();
        while (iter.hasNext()) {
            Entry entry = iter.next();
            String name = entry.getEStructuralFeature().getName();
            if (name.contentEquals(propertyName)) {
                if (name.equals("securityAttr")) {
                    String value = (String) entry.getValue();
                    return value;
                }
            }
        }
        return null;
    }
    
    private void setupSecurityCombo(Contract object) {
        _securityCombo.removeAll();
        EObject parent = object;
        while (parent.eContainer() != null && !(parent instanceof SwitchYardType)) {
            parent = parent.eContainer();
        }
        if (parent != null && parent instanceof SwitchYardType) {
            SwitchYardType root = (SwitchYardType) parent;
            DomainType domain = root.getDomain();
            if (domain != null) {
                SecuritiesType securities = domain.getSecurities();
                if (securities != null) {
                    Iterator<SecurityType> securityTypes = securities.getSecurity().iterator();
                    while (securityTypes.hasNext()) {
                        SecurityType security = securityTypes.next();
                        String name = "default";
                        if (security.getName() != null) {
                            name = security.getName();
                        }
                        _securityCombo.add(name);
                        _securityCombo.setData(name, security);
                    }
                }
            }
        }
        if (_securityCombo.getItemCount() > 1) {
            _securityCombo.setEnabled(true);
        } else {
            _securityCombo.setEnabled(false);
        }
    }

    private class FunkyAttributeContractOperation extends ModelOperation {

        private Contract _localObject;
        private String _localFeature;
        private Object _localValue;

        /**
         * @param object incoming object
         * @param featureId feature id
         * @param value incoming value
         */
        public FunkyAttributeContractOperation(Contract object, String featureId, Object value) {
            _localObject = object;
            _localFeature = featureId;
            _localValue = value;
        }

        private void setFunkyAttributeValue(EAttribute attribute, String propertyName, Object propertyValue) {
            Iterator<Entry> iter = _localObject.getAnyAttribute().iterator();
            boolean foundIt = false;
            while (iter.hasNext()) {
                Entry entry = iter.next();
                String name = entry.getEStructuralFeature().getName();
                if (name.contentEquals(propertyName)) {
                    _localObject.getAnyAttribute().add(
                            attribute, propertyValue);
                    foundIt = true;
                    break;
                }
            }
            if (!foundIt) {
                _localObject.getAnyAttribute().add(
                        attribute, propertyValue);
            }
        }

        @Override
        public void run() throws Exception {
            if (_localFeature.contentEquals("securityAttr")) {
                setFunkyAttributeValue(SwitchyardPackage.eINSTANCE.getDocumentRoot_SecurityAttr(), "securityAttr", _localValue);
            }
        }
    }
    
    private void updateSecurity(final Contract contract, final String securityName) {
        wrapOperation(new Runnable() {
            @Override
            public void run() {
                FunkyAttributeContractOperation operation = 
                        new FunkyAttributeContractOperation(contract, "securityAttr", securityName);
                try {
                    operation.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
