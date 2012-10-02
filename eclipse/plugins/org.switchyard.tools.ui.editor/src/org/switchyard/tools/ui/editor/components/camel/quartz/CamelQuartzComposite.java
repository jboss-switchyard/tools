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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelQuartzBindingType;
import org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorFactory;
import org.switchyard.tools.models.switchyard1_0.commonselector.StaticOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.CamelBindingUtil;
import org.switchyard.tools.ui.editor.diagram.binding.CamelOperationSelectorGroupOp;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorOp;
import org.switchyard.tools.ui.editor.diagram.binding.RemoveOperationSelectorOp;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.InterfaceOpsUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelQuartzComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelQuartzBindingType _binding = null;
    private Text _nameText;
    private Text _cronText;
    private Text _startTimeText;
    private Text _endTimeText;
    private Combo _operationSelectionCombo;
    private TabFolder _tabFolder;
    private List<String> _advancedPropsFilterList;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelQuartzBindingType) {
            this._binding = (CamelQuartzBindingType) impl;
            setInUpdate(true);
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
            String opName = CamelBindingUtil.getOperationNameForStaticOperationSelector(this._binding);
            if (opName != null) {
                setTextValue(_operationSelectionCombo, opName);
            }
           setInUpdate(false);
            if (this._binding.getCamelBindingName() == null || this._binding.getCamelBindingName().trim().isEmpty()) {
                if (getTargetObject() != null && getTargetObject() instanceof Contract) {
                    Contract contract = (Contract) getTargetObject();
                    if (contract.eContainer() != null && contract.eContainer() instanceof org.eclipse.soa.sca.sca1_1.model.sca.Composite) {
                        org.eclipse.soa.sca.sca1_1.model.sca.Composite composite = (org.eclipse.soa.sca.sca1_1.model.sca.Composite) contract.eContainer();
                        _nameText.setText(composite.getName());
                        handleModify(_nameText);
                    }
                }
            }
            super.setTabsBinding(_binding);
            validate();
        } else {
            this._binding = null;
            populateOperationCombo();
        }
        addObservableListeners();
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
        super.validateTabs();
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        _tabFolder = new TabFolder(_panel, SWT.NONE);

        TabItem one = new TabItem(_tabFolder, SWT.NONE);
        one.setText("Scheduler");
        one.setControl(getSchedulerTabControl(_tabFolder));

        addTabs(_tabFolder);
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

            if (getTargetObject() == null) {
                PictogramElement[] pes = SwitchyardSCAEditor.getActiveEditor().getSelectedPictogramElements();
                if (pes.length > 0) {
                    Object bo = SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider()
                            .getBusinessObjectForPictogramElement(pes[0]);
                    if (bo instanceof Service) {
                        setTargetObject(bo);
                    }
                }
            }
            if (getTargetObject() != null && getTargetObject() instanceof Contract) {
                String[] operations = InterfaceOpsUtil.gatherOperations((Contract) getTargetObject());
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

    class CamelOperationSelectorOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding.getOperationSelector() == null) {
                setFeatureValue(_binding, "operationSelector", CommonselectorFactory.eINSTANCE.createStaticOperationSelectorType());
            }
        }
    }
    
    private void updateCamelOperationSelectorFeature(String featureId, Object value) {
        if (CamelBindingUtil.getFirstOperationSelector(_binding) != null) {
            OperationSelectorType opSelect = CamelBindingUtil.getFirstOperationSelector(_binding);
            Object oldValue = getFeatureValue(opSelect, featureId);
            // don't do anything if the value is the same
            if (oldValue == null && value == null) {
                return;
            } else if (oldValue != null && oldValue.equals(value)) {
                return;
            } else if (value != null && value.equals(oldValue)) {
                return;
            }
        }
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        if (featureId.equals("operationName") && value instanceof String && ((String)value).trim().isEmpty()) {
            ops.add(new RemoveOperationSelectorOp(this._binding));
        } else {
            ops.add(new CamelOperationSelectorGroupOp(this._binding));
            ops.add(new OperationSelectorOp(this._binding, featureId, value));
        }
        wrapOperation(ops);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_nameText)) {
            updateFeature(_binding, "camelBindingName", _nameText.getText().trim());
        } else if (control.equals(_cronText)) {
            updateFeature(_binding, "cron", _cronText.getText().trim());
        } else if (control.equals(_startTimeText)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            try {
                XMLGregorianCalendar calendar = null;
                if (_startTimeText.getText().trim().length() > 0) {
                    Date date = sdf.parse(_startTimeText.getText().trim());
                    String dateStr = sdf.format(date);
                    calendar = XMLTypeFactory.eINSTANCE.createDateTime(dateStr);
                }
                updateFeature(_binding, "startTime", calendar);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else if (control.equals(_endTimeText)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            try {
                XMLGregorianCalendar calendar = null;
                if (_startTimeText.getText().trim().length() > 0) {
                    Date date = sdf.parse(_startTimeText.getText().trim());
                    String dateStr = sdf.format(date);
                    calendar = XMLTypeFactory.eINSTANCE.createDateTime(dateStr);
                }
                updateFeature(_binding, "endTime", calendar);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else if (control.equals(_operationSelectionCombo)) {
            updateCamelOperationSelectorFeature("operationName", _operationSelectionCombo.getText().trim());
        }
        super.handleModify(control);
        setHasChanged(false);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_nameText)) {
                _nameText.setText(this._binding.getCamelBindingName());
            } else if (control.equals(_cronText)) {
                _cronText.setText(this._binding.getCron());
            } else if (control.equals(_endTimeText)) {
                _endTimeText.setText(this._binding.getEndTime().toString());
            } else if (control.equals(_startTimeText)) {
                _startTimeText.setText(this._binding.getStartTime().toString());
            } else if (control.equals(_operationSelectionCombo)) {
                if (this._binding.getOperationSelector() != null && this._binding.getOperationSelector() instanceof StaticOperationSelectorType) {
                    populateOperationCombo();
                    String opName = CamelBindingUtil.getOperationNameForStaticOperationSelector(this._binding);
                    setTextValue(_operationSelectionCombo, opName);
                }
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

    @Override
    protected List<String> getAdvancedPropertiesFilterList() {
        if (_advancedPropsFilterList == null) {
            _advancedPropsFilterList = new ArrayList<String>();
            _advancedPropsFilterList.add("stateful");
        }
        return _advancedPropsFilterList;
    }

    @Override
    protected ContextMapperType createContextMapper() {
        return CamelFactory.eINSTANCE.createCamelContextMapperType();
    }

    @Override
    protected MessageComposerType createMessageComposer() {
        return CamelFactory.eINSTANCE.createCamelMessageComposerType();
    }
    
}
