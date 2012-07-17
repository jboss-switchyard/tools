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
package org.switchyard.tools.ui.editor.components.camel.quartz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelQuartzBindingType;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.InterfaceOpsUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelQuartzComposite extends AbstractSwitchyardComposite implements IBindingComposite {

    private Composite _panel;
    private CamelQuartzBindingType _binding = null;
    private boolean _inUpdate = false;
    private Text _nameText;
    private Text _cronText;
    private Text _startTimeText;
    private Text _endTimeText;
    private Combo _operationSelectionCombo;
    private Object _targetObj = null;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelQuartzBindingType) {
            this._binding = (CamelQuartzBindingType) impl;
            _inUpdate = true;
            if (this._binding.getCamelBindingName() != null) {
                _nameText.setText(this._binding.getCamelBindingName());
            }
            if (this._binding.getCron() != null) {
                _cronText.setText(this._binding.getCron());
            }
            if (this._binding.getStartTime() != null) {
                
                _startTimeText.setText(this._binding.getStartTime().toString());
            }
            if (this._binding.getEndTime() != null) {
                _endTimeText.setText(this._binding.getEndTime().toString());
            }
            populateOperationCombo();
            if (this._binding.getCamelOperationSelector() != null) {
                CamelOperationSelectorType camelOpSelector = (CamelOperationSelectorType) this._binding
                        .getCamelOperationSelector();
                _operationSelectionCombo.setText(camelOpSelector.getOperationName());
            }
            _inUpdate = false;
            if (this._binding.getCamelBindingName() == null || this._binding.getCamelBindingName().trim().isEmpty()) {
                _nameText.setText(SwitchyardSCAEditor.getActiveEditor().getModelHandler().getRootSwitchYard().getComposite().getName());
                handleModify(_nameText);
            }
            validate();
        } else {
            this._binding = null;
            populateOperationCombo();
        }
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_nameText.getText().trim().isEmpty()) {
                setErrorMessage("Name may not be empty.");
            }
            if (_cronText.getText().trim().isEmpty()) {
                setErrorMessage("Cron may not be empty.");
            }
            if (!_startTimeText.getText().trim().isEmpty()) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                try {
                    sdf.parse(_startTimeText.getText().trim());
                } catch (ParseException pe) {
                    setErrorMessage("Start time must match the format yyyy-MM-ddTHH:mm:ss");
                }
            }
            if (!_endTimeText.getText().trim().isEmpty()) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                try {
                    sdf.parse(_endTimeText.getText().trim());
                } catch (ParseException pe) {
                    setErrorMessage("End time must match the format yyyy-MM-ddTHH:mm:ss");
                }
            }
        }
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        TabFolder tabFolder = new TabFolder(_panel, SWT.NONE);

        TabItem one = new TabItem(tabFolder, SWT.NONE);
        one.setText("Scheduler");
        one.setControl(getSchedulerTabControl(tabFolder));
    }

    private Control getSchedulerTabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group schedulerGroup = new Group(composite, SWT.NONE);
        schedulerGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        schedulerGroup.setLayout(new GridLayout(2, false));
        schedulerGroup.setText("Scheduler Options");

        _nameText = createLabelAndText(schedulerGroup, "Name*");
        _cronText = createLabelAndText(schedulerGroup, "Cron*");
        _startTimeText = createLabelAndText(schedulerGroup, "Start Time");
        _endTimeText = createLabelAndText(schedulerGroup, "End Time");

        Group opGroup = new Group(composite, SWT.NONE);
        opGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        opGroup.setLayout(new GridLayout(2, false));
        opGroup.setText("Operation Options");
        _operationSelectionCombo = createLabelAndCombo(opGroup, "Operation");
        populateOperationCombo();

        return composite;
    }

    private void populateOperationCombo() {
        if (_operationSelectionCombo != null && !_operationSelectionCombo.isDisposed()) {
            _operationSelectionCombo.removeAll();
            _operationSelectionCombo.clearSelection();

            if (_targetObj == null) {
                @SuppressWarnings("restriction")
                PictogramElement[] pes = SwitchyardSCAEditor.getActiveEditor().getSelectedPictogramElements();
                if (pes.length > 0) {
                    @SuppressWarnings("restriction")
                    Object bo = SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider()
                            .getBusinessObjectForPictogramElement(pes[0]);
                    if (bo instanceof Service) {
                        _targetObj = bo;
                    }
                }
            }
            if (_targetObj != null && _targetObj instanceof Service) {
                String[] operations = InterfaceOpsUtil.gatherOperations((Service) _targetObj);
                for (int i = 0; i < operations.length; i++) {
                    _operationSelectionCombo.add(operations[i]);
                }
            }
        }
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    /**
     * @param parent parent composite
     * @param label string to put in label
     * @return reference to created Text control
     */
    protected Combo createLabelAndCombo(Composite parent, String label) {
        Combo combo = super.createLabelAndCombo(parent, label);
        combo.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (!_inUpdate) {
                    validate();
                    handleModify((Control) e.getSource());
                    fireChangedEvent((Control) e.getSource());
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });
        return combo;
    }

    /**
     * @param parent parent composite
     * @param label string for label
     * @return reference to created Button
     */
    protected Button createCheckbox(Composite parent, String label) {
        Button newButton = super.createCheckbox(parent, label);
        newButton.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (!_inUpdate) {
                    handleModify((Control) e.getSource());
                    validate();
                    fireChangedEvent((Control) e.getSource());
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });
        return newButton;
    }

    private void setFeatureValue(EObject eObject, String featureId, Object value) {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    eObject.eSet(eStructuralFeature, value);
                    break;
                }
            }
        }
    }

    private class BindingRecordingCommand extends RecordingCommand {

        private CamelQuartzBindingType _innerBinding;
        private String _featureId;
        private Object _value;

        public BindingRecordingCommand(TransactionalEditingDomain domain, CamelQuartzBindingType binding,
                String featureId, Object value) {
            super(domain);
            this._innerBinding = binding;
            this._featureId = featureId;
            this._value = value;
        }

        @Override
        protected void doExecute() {
            setFeatureValue(_innerBinding, _featureId, _value);
        }

    }

    @SuppressWarnings("restriction")
    protected void handleModify(final Control control) {
        TransactionalEditingDomain domain = null;
        if (_binding.eContainer() != null) {
            domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
        }
        if (control.equals(_nameText)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "camelBindingName",
                        _nameText.getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                _binding.setCamelBindingName(_nameText.getText().trim());
            }
        } else if (control.equals(_cronText)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "cron", _cronText
                        .getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                _binding.setCron(_cronText.getText().trim());
            }
        } else if (control.equals(_startTimeText)) {
            if (domain != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                try {
                    XMLGregorianCalendar calendar = null;
                    if (_startTimeText.getText().trim().length() > 0) {
                        Date date = sdf.parse(_startTimeText.getText().trim());
                        String dateStr = sdf.format(date);
                        calendar = XMLTypeFactory.eINSTANCE.createDateTime(dateStr);
                    }
                    BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "startTime", 
                            calendar);
                    domain.getCommandStack().execute(command);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                try {
                    XMLGregorianCalendar calendar = null;
                    if (_startTimeText.getText().trim().length() > 0) {
                        Date date = sdf.parse(_startTimeText.getText().trim());
                        String dateStr = sdf.format(date);
                        calendar = XMLTypeFactory.eINSTANCE.createDateTime(dateStr);
                    }
                    _binding.setStartTime(calendar);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        } else if (control.equals(_endTimeText)) {
            if (domain != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                try {
                    XMLGregorianCalendar calendar = null;
                    if (_startTimeText.getText().trim().length() > 0) {
                        Date date = sdf.parse(_startTimeText.getText().trim());
                        String dateStr = sdf.format(date);
                        calendar = XMLTypeFactory.eINSTANCE.createDateTime(dateStr);
                    }
                    BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "endTime", 
                            calendar);
                    domain.getCommandStack().execute(command);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                try {
                    XMLGregorianCalendar calendar = null;
                    if (_startTimeText.getText().trim().length() > 0) {
                        Date date = sdf.parse(_startTimeText.getText().trim());
                        String dateStr = sdf.format(date);
                        calendar = XMLTypeFactory.eINSTANCE.createDateTime(dateStr);
                    }
                    _binding.setEndTime(calendar);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        } else if (control.equals(_operationSelectionCombo)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (_binding.getOperationSelector() == null) {
                            _binding.setCamelOperationSelector(CamelFactory.eINSTANCE
                                    .createCamelOperationSelectorType());
                        }
                        ((CamelOperationSelectorType) _binding.getCamelOperationSelector())
                                .setOperationName(_operationSelectionCombo.getText().trim());
                    }
                });
            } else {
                if (_binding.getOperationSelector() == null) {
                    _binding.setCamelOperationSelector(CamelFactory.eINSTANCE.createCamelOperationSelectorType());
                }
                ((CamelOperationSelectorType) _binding.getCamelOperationSelector())
                        .setOperationName(_operationSelectionCombo.getText().trim());
            }
        }
    }

    /**
     * @param target Passed in what we're dropping on
     */
    public void setTargetObject(Object target) {
        this._targetObj = target;
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (_binding != null && !_inUpdate && hasChanged()) {
            validate();
            handleModify((Control) e.getSource());
            fireChangedEvent((Control) e.getSource());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.keyCode == SWT.ESC) {
            // cancel out and return to original value
            _inUpdate = true;
            if (_binding != null) {
                Control control = (Control) e.getSource();
                if (control.equals(_nameText)) {
                    _nameText.setText(this._binding.getCamelBindingName());
                } else if (control.equals(_cronText)) {
                    _cronText.setText(this._binding.getCron());
                } else if (control.equals(_endTimeText)) {
                    _startTimeText.setText(this._binding.getEndTime().toString());
                } else if (control.equals(_startTimeText)) {
                    _startTimeText.setText(this._binding.getStartTime().toString());
                } else if (control.equals(_operationSelectionCombo)) {
                    if (this._binding.getCamelOperationSelector() != null) {
                        populateOperationCombo();
                        CamelOperationSelectorType camelOpSelector = (CamelOperationSelectorType) this._binding
                                .getCamelOperationSelector();
                        _operationSelectionCombo.setText(camelOpSelector.getOperationName());
                    }
                }
            }
            _inUpdate = false;
        } else if (e.keyCode == SWT.CR) {
            // accept change
            if (_binding != null && !_inUpdate) {
                validate();
                handleModify((Control) e.getSource());
                fireChangedEvent((Control) e.getSource());
            }
        }
    }
}
