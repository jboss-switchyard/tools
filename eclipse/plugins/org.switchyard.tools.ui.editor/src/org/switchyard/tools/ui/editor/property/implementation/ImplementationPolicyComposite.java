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
package org.switchyard.tools.ui.editor.property.implementation;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;

/**
 * @author bfitzpat
 * 
 */
public class ImplementationPolicyComposite extends AbstractModelComposite<Component> implements
        ITabbedPropertyConstants {

    private class ComboSelectionListener implements SelectionListener {
        @Override
        public void widgetSelected(SelectionEvent e) {
            widgetDefaultSelected(e);
        }

        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
            final Component component = getTargetObject();
            if (component != null && !_inUpdate) {
                updatePolicy(component, _implementationCombo, _implementationCombo.getText().trim());
            }
        }
    }

    private boolean _inUpdate = false;
    private Combo _implementationCombo;
    private ArrayList<String> _supportedImplementationPolicies;

    /**
     * Create a new ImplementationPolicyComposite.
     * 
     * @param container the container
     * @param parent the parent composite
     * @param style style bits
     */
    public ImplementationPolicyComposite(ICompositeContainer container, Composite parent, int style) {
        super(Component.class, container, parent, style);
        _supportedImplementationPolicies = new ArrayList<String>();
        _supportedImplementationPolicies.add("managedTransaction.Global");
        _supportedImplementationPolicies.add("managedTransaction.Local");
        _supportedImplementationPolicies.add("noManagedTransaction");

        setLayout(new GridLayout(2, false));

        FormToolkit factory = getWidgetFactory();

        factory.createLabel(this, "Transaction Policy:");

        _implementationCombo = new Combo(this, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
        factory.adapt(_implementationCombo, true, false);
        _implementationCombo.add("None");
        for (String policy : _supportedImplementationPolicies) {
            _implementationCombo.add(policy);
        }
        _implementationCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

        _implementationCombo.addSelectionListener(new ComboSelectionListener());
    }

    private void updatePolicy(final Component component, final Control control, final String value) {
        wrapOperation(new Runnable() {
            @Override
            public void run() {
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
        _inUpdate = true;
        try {
            String implementationPolicy = null;
            Component component = getTargetObject();
            if (component != null) {
                if (component.getImplementation() != null) {
                    List<QName> requires = component.getImplementation().getRequires();
                    if (requires != null) {
                        for (QName requiresItem : requires) {
                            String localPart = requiresItem.getLocalPart();
                            if (_supportedImplementationPolicies.contains(localPart)) {
                                implementationPolicy = localPart;
                            }
                        }
                    }
                }
            }
            if (implementationPolicy != null && !_implementationCombo.isDisposed()) {
                _implementationCombo.setText(implementationPolicy);
            } else {
                _implementationCombo.setText("None");
            }
        } finally {
            _inUpdate = false;
        }
    }

}
