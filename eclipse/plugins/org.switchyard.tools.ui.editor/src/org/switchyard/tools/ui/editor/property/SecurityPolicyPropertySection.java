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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class SecurityPolicyPropertySection extends GFPropertySection implements ITabbedPropertyConstants,
        ResourceSetListener {

    private static final String CONFIDENTIALITY = "confidentiality";
    private static final String CLIENT_AUTHENTICATION = "clientAuthentication";
    private static final String AUTHORIZATION = "authorization";
    private Object _businessObject;
    private boolean _inUpdate = false;
    private TransactionalEditingDomain _domain = null;
    private Button _clientAuthCheckbox;
    private Button _confidentialityCheckbox;
    private Button _authorizationCheckbox;

    /**
     * Constructor.
     */
    public SecurityPolicyPropertySection() {
        super();
    }

    private void addDomainListener() {
        if (_domain == null) {
            _domain = (TransactionalEditingDomainImpl) SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
            _domain.addResourceSetListener(this);
        }
    }

    private void removeDomainListener() {
        if (_domain != null) {
            _domain.removeResourceSetListener(this);
        }
    }

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);

        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        Composite composite = factory.createFlatFormComposite(parent);
        FormData data;

        Group securityGroup = factory.createGroup(composite, "Security Policy");
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
        securityGroup.setLayoutData(data);
        securityGroup.setLayout(new FormLayout());
        
        _authorizationCheckbox = factory.createButton(securityGroup, "Authorization", SWT.CHECK);
        data = new FormData();
        data.left = new FormAttachment(1, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
        _authorizationCheckbox.setLayoutData(data);
        _authorizationCheckbox.addSelectionListener(new CheckboxSelectionListener());
        _authorizationCheckbox.setData(AUTHORIZATION);

        _clientAuthCheckbox = factory.createButton(securityGroup, "Client Authentication", SWT.CHECK);
        data = new FormData();
        data.left = new FormAttachment(1, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(_authorizationCheckbox, 5, VSPACE);
        _clientAuthCheckbox.setLayoutData(data);
        _clientAuthCheckbox.addSelectionListener(new CheckboxSelectionListener());
        _clientAuthCheckbox.setData(CLIENT_AUTHENTICATION);
        
        _confidentialityCheckbox = factory.createButton(securityGroup, "Confidentiality", SWT.CHECK);
        data = new FormData();
        data.left = new FormAttachment(1, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(_clientAuthCheckbox, 5, VSPACE);
        _confidentialityCheckbox.setLayoutData(data);
        _confidentialityCheckbox.addSelectionListener(new CheckboxSelectionListener());
        _confidentialityCheckbox.setData(CONFIDENTIALITY);
        
        addDomainListener();
    }

    private void updatePolicy(final Object bo, final Button control) {
        final Contract contract = (Contract) bo;
        final String securityPolicy = (String) control.getData();
        
        _domain.getCommandStack().execute(new RecordingCommand(_domain) {
            @Override
            protected void doExecute() {
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
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                PictogramElement pe = getSelectedPictogramElement();
                if (pe != null) {
                    _inUpdate = true;
                    _businessObject = null;
                    Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
                    // the filter assured, that it is a EClass
                    if (bo == null) {
                        return;
                    }
                    _businessObject = bo;

                    Contract contract = (Contract) bo;
                    _inUpdate = true;
                    boolean clientAuthentication = false;
                    boolean confidentiality = false;
                    boolean authentication = false;
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
                    boolean showClientAuthCheckbox = true;
                    if (contract.eContainer() instanceof Component && contract instanceof ComponentReference) {
                        showClientAuthCheckbox = false;
                    }
                    if (!_clientAuthCheckbox.isDisposed()) {
                        _clientAuthCheckbox.setEnabled(showClientAuthCheckbox);
                    }

                    if (clientAuthentication && _clientAuthCheckbox != null && !_clientAuthCheckbox.isDisposed())  {
                        _clientAuthCheckbox.setSelection(clientAuthentication);
                    }
                    
                    if (confidentiality && !_confidentialityCheckbox.isDisposed())  {
                        _confidentialityCheckbox.setSelection(confidentiality);
                    }

                    boolean showAuthorizationCheckbox = true;
                    if (contract.eContainer() instanceof Component && contract instanceof ComponentReference) {
                        showAuthorizationCheckbox = false;
                    }
                    if (!_authorizationCheckbox.isDisposed()) {
                        _authorizationCheckbox.setEnabled(showAuthorizationCheckbox);
                    }

                    if (authentication && !_authorizationCheckbox.isDisposed())  {
                        _authorizationCheckbox.setSelection(confidentiality);
                    }
                    _inUpdate = false;
                }
            }
        });
    }

    private class CheckboxSelectionListener implements SelectionListener {
        @Override
        public void widgetSelected(SelectionEvent e) {
            widgetDefaultSelected(e);
        }

        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
            if (_businessObject != null && !_inUpdate) {
                Button button = (Button) e.widget;
                updatePolicy(_businessObject, button);
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.emf.transaction.ResourceSetListener#transactionAboutToCommit
     * (org.eclipse.emf.transaction.ResourceSetChangeEvent)
     */
    @Override
    public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.emf.transaction.ResourceSetListener#isAggregatePrecommitListener
     * ()
     */
    @Override
    public boolean isAggregatePrecommitListener() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.emf.transaction.ResourceSetListener#isPrecommitOnly()
     */
    @Override
    public boolean isPrecommitOnly() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.emf.transaction.ResourceSetListener#isPostcommitOnly()
     */
    @Override
    public boolean isPostcommitOnly() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.emf.transaction.ResourceSetListener#resourceSetChanged(org
     * .eclipse.emf.transaction.ResourceSetChangeEvent)
     */
    @Override
    public void resourceSetChanged(ResourceSetChangeEvent event) {
        refresh();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.emf.transaction.ResourceSetListener#getFilter()
     */
    @Override
    public NotificationFilter getFilter() {
        return null;
    }

    @Override
    public void dispose() {
        removeDomainListener();
        super.dispose();
    }

    @Override
    public void aboutToBeHidden() {
        _inUpdate = true;
        super.aboutToBeHidden();
    }
}
