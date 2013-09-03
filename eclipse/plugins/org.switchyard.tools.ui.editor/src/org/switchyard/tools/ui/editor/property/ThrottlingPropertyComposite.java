/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.switchyard.tools.ui.editor.property;

import java.util.Collection;

import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.ExtensionsType;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType;
import org.switchyard.tools.ui.editor.Messages;

/**
 * ThrottlingPropertyComposite
 * <p/>
 * Property details for throttling.
 */
public class ThrottlingPropertyComposite extends AbstractModelComposite<Contract> {

    private boolean _updating = false;
    private Contract _service;
    private ThrottlingType _throttlingType;
    private Button _enableCheck;
    private Text _maximumRequestsText;
    private Text _timePeriodText;

    /**
     * Create a new InteractionPolicyComposite.
     * 
     * @param container the container
     * @param parent the parent composite
     * @param style style bits
     */
    public ThrottlingPropertyComposite(ICompositeContainer container, Composite parent, int style) {
        super(Contract.class, container, parent, style);
        setLayout(new GridLayout(2, false));

        FormToolkit factory = getWidgetFactory();

        factory.createText(this, Messages.tooltip_enableThrottling,
                SWT.READ_ONLY | SWT.WRAP).setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        _enableCheck = factory.createButton(this, Messages.label_enableThrottling, SWT.CHECK);
        _enableCheck.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        _enableCheck.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                if (_updating) {
                    return;
                }
                throttlingEnabled(_enableCheck.getSelection());
            }
        });

        factory.createLabel(this, Messages.label_maximumRequests);
        _maximumRequestsText = factory.createText(this, "", SWT.BORDER); //$NON-NLS-1$
        _maximumRequestsText.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        _maximumRequestsText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                final String newValue;
                if (_maximumRequestsText.getText().length() == 0) {
                    newValue = null;
                } else {
                    newValue = _maximumRequestsText.getText();
                }
                if (!_updating
                        && ((newValue == null && _throttlingType.getMaxRequests() != null) || (newValue != null && !newValue
                                .equals(_throttlingType.getMaxRequests())))) {
                    wrapOperation(new Runnable() {
                        public void run() {
                            _throttlingType.setMaxRequests(newValue);
                        }
                    });
                }
            }
        });

        factory.createLabel(this, Messages.label_timePeriod);
        _timePeriodText = factory.createText(this, "1000", SWT.BORDER | SWT.READ_ONLY); //$NON-NLS-1$
        _timePeriodText.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        _timePeriodText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                final String newValue;
                if (_timePeriodText.getText().length() == 0) {
                    newValue = null;
                } else {
                    newValue = _maximumRequestsText.getText();
                }
                if (!_updating
                        && ((newValue == null && _throttlingType.getTimePeriod() != null) || (newValue != null && !newValue
                                .equals(_throttlingType.getTimePeriod())))) {
                    wrapOperation(new Runnable() {
                        public void run() {
                            _throttlingType.setTimePeriod(newValue);
                        }
                    });
                }
            }
        });
    }

    @Override
    public void refresh() {
        if (_service == getTargetObject()) {
            return;
        }
        _updating = true;
        try {
            _service = getTargetObject();
            _throttlingType = null;
            if (_service == null) {
                _throttlingType = SwitchyardFactory.eINSTANCE.createThrottlingType();

                _enableCheck.setSelection(false);
                _timePeriodText.setText(""); //$NON-NLS-1$
                _maximumRequestsText.setText(""); //$NON-NLS-1$

                _enableCheck.setEnabled(false);
                _timePeriodText.setEnabled(false);
                _maximumRequestsText.setEnabled(false);
            } else {
                final ExtensionsType extensions = _service.getExtensions();
                if (extensions != null) {
                    @SuppressWarnings("unchecked")
                    Collection<ThrottlingType> throttlings = (Collection<ThrottlingType>) extensions.getAny().get(
                            SwitchyardPackage.eINSTANCE.getDocumentRoot_Throttling(), true);
                    if (throttlings != null && throttlings.size() > 0) {
                        _throttlingType = throttlings.iterator().next();
                    }
                }
                if (_throttlingType == null) {
                    _enableCheck.setSelection(false);
                    _enableCheck.setEnabled(true);
                    _timePeriodText.setEnabled(false);
                    _maximumRequestsText.setEnabled(false);
                    _throttlingType = SwitchyardFactory.eINSTANCE.createThrottlingType();
                } else {
                    _enableCheck.setSelection(true);
                    _enableCheck.setEnabled(true);
                    _timePeriodText.setEnabled(true);
                    _maximumRequestsText.setEnabled(true);
                }
                _timePeriodText.setText(_throttlingType.getTimePeriod() == null ? "" : _throttlingType.getTimePeriod() //$NON-NLS-1$
                        .toString());
                _maximumRequestsText.setText(_throttlingType.getMaxRequests() == null ? "" : _throttlingType //$NON-NLS-1$
                        .getMaxRequests().toString());
            }
        } finally {
            _updating = false;
        }
    }

    private void throttlingEnabled(boolean selected) {
        if (selected) {
            _timePeriodText.setEnabled(true);
            _maximumRequestsText.setEnabled(true);
            wrapOperation(new Runnable() {
                public void run() {
                    ExtensionsType extensions = _service.getExtensions();
                    if (extensions == null) {
                        extensions = ScaFactory.eINSTANCE.createExtensionsType();
                        extensions.getAny().add(SwitchyardPackage.eINSTANCE.getDocumentRoot_Throttling(),
                                _throttlingType);
                        _service.setExtensions(extensions);
                    } else {
                        extensions.getAny().add(SwitchyardPackage.eINSTANCE.getDocumentRoot_Throttling(),
                                _throttlingType);
                    }
                }
            });
        } else {
            _timePeriodText.setEnabled(false);
            _maximumRequestsText.setEnabled(false);
            wrapOperation(new Runnable() {
                public void run() {
                    ExtensionsType extensions = _service.getExtensions();
                    if (extensions == null) {
                        return;
                    }
                    extensions.getAny().unset(SwitchyardPackage.eINSTANCE.getDocumentRoot_Throttling());
                    if (extensions.getAny().isEmpty()) {
                        _service.setExtensions(null);
                    }
                }
            });
        }
    }

}
