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
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;

/**
 * @author bfitzpat
 * 
 */
public class ImplementationPolicyComposite extends AbstractModelComposite<Component> implements
        ITabbedPropertyConstants {
    
    private final String _noneString = "None"; //$NON-NLS-1$

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
        _supportedImplementationPolicies.add("managedTransaction.Global"); //$NON-NLS-1$
        _supportedImplementationPolicies.add("managedTransaction.Local"); //$NON-NLS-1$
        _supportedImplementationPolicies.add("noManagedTransaction"); //$NON-NLS-1$

        setLayout(new GridLayout(2, false));

        FormToolkit factory = getWidgetFactory();

        factory.createLabel(this, Messages.label_transactionPolicy);

        _implementationCombo = new Combo(this, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
        factory.adapt(_implementationCombo, true, false);
        _implementationCombo.add(_noneString);
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
                List<QName> requires = new ArrayList<QName>();
                component.getImplementation().setRequires(null);
                if (!value.trim().isEmpty() && !value.contentEquals(_noneString)) {
                    QName newQName = new QName(value);
                    requires.add(newQName);
                }
                if (!requires.isEmpty()) {
                    component.getImplementation().setRequires(requires);
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
                                break;
                            }
                        }
                    }
                }
            }
            if (implementationPolicy != null && !_implementationCombo.isDisposed()) {
                try {
                    _implementationCombo.setText(implementationPolicy);
                } catch (SWTException se) {
                    // ignore this - is a post-commit listener issue
                    se.fillInStackTrace();
                }
            } else if (!_implementationCombo.isDisposed()) {
                try {
                    _implementationCombo.setText(_noneString);
                } catch (SWTException se) {
                    // ignore this - is a post-commit listener issue
                    se.fillInStackTrace();
                }
            }
        } finally {
            _inUpdate = false;
        }
    }

}
