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
package org.switchyard.tools.ui.editor.transform.wizards;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.util.TransformTypesUtil;

/**
 * @author bfitzpat
 * 
 */
public class BaseTransformComposite extends AbstractSwitchyardComposite {

    private Composite _panel;
    private TransformType _transform;
    private Combo _toText;
    private Combo _fromText;
    private TransformTypesUtil _typesUtil = new TransformTypesUtil();

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (_toText != null && !_toText.isDisposed()) {
            String text = _toText.getText().trim();
            if (text.length() == 0) {
                setErrorMessage("To field may not be empty.");
            } else {
                try {
                    QName.valueOf(text);
                } catch (IllegalArgumentException e) {
                    setErrorMessage("To field must be a valid QName.");
                }
            }
        }
        if (_fromText != null && !_fromText.isDisposed()) {
            String text = _fromText.getText().trim();
            if (text.length() == 0) {
                setErrorMessage("From field may not be empty.");
            } else {
                try {
                    QName.valueOf(text);
                } catch (IllegalArgumentException e) {
                    setErrorMessage("From field must be a valid QName.");
                }
            }
        }
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        _panel.setLayout(gl);
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }
        _fromText = createLabelAndCombo(_panel, "From");
        _toText = createLabelAndCombo(_panel, "To");
    }

    @Override
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @param transform incoming transform type
     */
    public void setTransform(TransformType transform) {
        setInUpdate(true);
        try {
            String[] types = _typesUtil.getTypesAsStringsForConfig();
            if (_fromText != null && _toText != null) {
                _fromText.removeAll();
                _toText.removeAll();
                for (int i = 0; i < types.length; i++) {
                    _fromText.add(types[i]);
                    _toText.add(types[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this._transform = transform;
        setTextValue(_toText, transform.getTo());
        setTextValue(_fromText, transform.getTo());
        setInUpdate(false);
    }

    /**
     * @return outgoing transform type
     */
    public TransformType getTransform() {
        return this._transform;
    }

    protected void handleModify(final Control control) {
        if (control.equals(_toText)) {
            updateFeature(_transform, "to", _toText.getText().trim());
        } else if (control.equals(_fromText)) {
            updateFeature(_transform, "from", _fromText.getText().trim());
        }
        validate();
    }

    protected void handleUndo(Control control) {
        setInUpdate(true);
        if (_transform != null) {
            if (control.equals(_fromText)) {
                _fromText.setText(this._transform.getFrom());
            } else if (control.equals(_toText)) {
                _toText.setText(this._transform.getTo());
            }
        }
        setInUpdate(false);
    }

    protected void wrapOperation(final List<ModelOperation> ops) {
        wrapOperation(this._transform, ops);
    }

    protected void updateFeature(EObject eObject, String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new BasicEObjectOperation(eObject, featureId, value));
        wrapOperation(ops);
    }
}
