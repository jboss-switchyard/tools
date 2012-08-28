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
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
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
public class ImplementationPolicyPropertySection extends GFPropertySection implements ITabbedPropertyConstants,
        ResourceSetListener {

    private class ComboSelectionListener implements SelectionListener {
        @Override
        public void widgetSelected(SelectionEvent e) {
            widgetDefaultSelected(e);
        }

        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
            if (_businessObject != null && !_inUpdate) {
                CCombo combo = (CCombo) e.widget;
                updatePolicy(_businessObject, combo, combo.getText().trim());
            }
        }
    }

    private Object _businessObject;
    private boolean _inUpdate = false;
    private TransactionalEditingDomain _domain = null;
    private CCombo _implementationCombo;
    private ArrayList<String> _supportedImplementationPolicies;
    private CLabel _implementationComboLabel;

    /**
     * Constructor.
     */
    public ImplementationPolicyPropertySection() {
        super();
        _supportedImplementationPolicies = new ArrayList<String>();
        _supportedImplementationPolicies.add("managedTransaction.Global");
        _supportedImplementationPolicies.add("noManagedTransaction");
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

        Group transactionGroup = factory.createGroup(composite, "Policy Details");
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
        transactionGroup.setLayoutData(data);
        transactionGroup.setLayout(new FormLayout());
        
        _implementationCombo = factory.createCCombo(transactionGroup, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
        _implementationCombo.add("None");
        for (String label : _supportedImplementationPolicies) {
            _implementationCombo.add(label);
        }
        data = new FormData();
        data.left = new FormAttachment(5, 100);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
        _implementationCombo.setLayoutData(data);
        
        _implementationComboLabel = factory.createCLabel(transactionGroup, "Implementation Policy:");
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(_implementationCombo, -HSPACE);
        data.top = new FormAttachment(_implementationCombo, 0, SWT.CENTER);
        _implementationComboLabel.setLayoutData(data);

        _implementationCombo.addSelectionListener(new ComboSelectionListener());

        addDomainListener();
    }

    private void updatePolicy(final Object bo, final Control control, final String value) {
        final Component component = (Component) bo;
        
        _domain.getCommandStack().execute(new RecordingCommand(_domain) {
            @Override
            protected void doExecute() {
                List<QName> requires = component.getImplementation().getRequires();
                if (requires == null) {
                    requires = new ArrayList<QName>();
                    component.getImplementation().setRequires(requires);
                }
                for (QName requiresItem : requires) {
                    String localPart = requiresItem.getLocalPart();
                    if (_supportedImplementationPolicies.contains(localPart)) {
                        requires.remove(requiresItem);
                        break;
                    }
                }
                if (!value.trim().isEmpty()) {
                    QName newQName = new QName(value);
                    requires.add(newQName);
                }
                if (requires.isEmpty()) {
                    component.getImplementation().setRequires(null);
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

                    Component component = (Component) bo;
                    _inUpdate = true;
                    
                    String implementationPolicy = null;
                    List<QName> requires = component.getRequires();
                    if (requires != null) {
                        for (QName requiresItem : requires) {
                            String localPart = requiresItem.getLocalPart();
                            if (_supportedImplementationPolicies.contains(localPart)) {
                                implementationPolicy = localPart;
                            }
                        }
                    }
                    if (implementationPolicy != null && !_implementationCombo.isDisposed()) {
                        _implementationCombo.setText(implementationPolicy);
                    } else {
                        _implementationCombo.setText("None");
                    }

                    _inUpdate = false;
                }
            }
        });
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
