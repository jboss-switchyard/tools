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

import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author bfitzpat
 * 
 */
public class InteractionPolicyComposite extends AbstractModelComposite<Contract> {

    private class ComboSelectionListener implements SelectionListener {
        @Override
        public void widgetSelected(SelectionEvent e) {
            widgetDefaultSelected(e);
        }

        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
            final Contract contract = getTargetObject();
            if (contract != null && !_inUpdate) {
                updatePolicy(contract, _interactionCombo, _interactionCombo.getText().trim());
            }
        }
    }

    private boolean _inUpdate = false;
    private Combo _interactionCombo;
    private ArrayList<String> _supportedInteractionPolicies;

    /**
     * Create a new InteractionPolicyComposite.
     * 
     * @param container the container
     * @param parent the parent composite
     * @param style style bits
     */
    public InteractionPolicyComposite(ICompositeContainer container, Composite parent, int style) {
        super(Contract.class, container, parent, style);
        _supportedInteractionPolicies = new ArrayList<String>();
        _supportedInteractionPolicies.add("propagatesTransaction");
        _supportedInteractionPolicies.add("suspendsTransaction");

        setLayout(new GridLayout(2, false));

        FormToolkit factory = getWidgetFactory();

        factory.createLabel(this, "Transaction Policy:");

        _interactionCombo = new Combo(this, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
        factory.adapt(_interactionCombo, true, false);
        _interactionCombo.add("None");
        for (String label : _supportedInteractionPolicies) {
            _interactionCombo.add(label);
        }
        _interactionCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

        _interactionCombo.addSelectionListener(new ComboSelectionListener());
    }

    private void updatePolicy(final Contract contract, final Control control, final String value) {
        wrapOperation(new Runnable() {
            @Override
            public void run() {
                List<QName> requires = contract.getRequires();
                ArrayList<String> existing = new ArrayList<String>();
                
                if (requires != null) {
                    for (QName requiresItem : requires) {
                        String localPart = requiresItem.getLocalPart();
                        if (!_supportedInteractionPolicies.contains(localPart)) {
                            existing.add(localPart);
                        }
                    }
                }
                contract.setRequires(null);

                requires = new ArrayList<QName>();
                for (String existingItem : existing) {
                    QName newQName = new QName(existingItem);
                    requires.add(newQName);
                }
                if (!value.trim().contentEquals("None")) {
                    QName newQName = new QName(value);
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
            String interactionPolicy = null;
            Contract contract = getTargetObject();
            if (contract != null) {
                List<QName> requires = contract.getRequires();
                if (requires != null) {
                    for (QName requiresItem : requires) {
                        String localPart = requiresItem.getLocalPart();
                        if (_supportedInteractionPolicies.contains(localPart)) {
                            interactionPolicy = localPart;
                        }
                    }
                }
            }
            if (interactionPolicy != null && !_interactionCombo.isDisposed()) {
                _interactionCombo.setText(interactionPolicy);
            } else {
                _interactionCombo.setText("None");
            }
        } finally {
            _inUpdate = false;
        }
    }

}
