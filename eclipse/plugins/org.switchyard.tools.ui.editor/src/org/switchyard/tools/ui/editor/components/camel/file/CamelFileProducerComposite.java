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
package org.switchyard.tools.ui.editor.components.camel.file;

import java.util.ArrayList;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.file.FileFactory;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 * 
 */
public class CamelFileProducerComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelFileBindingType _binding = null;
    private Text _nameText;
    private Text _directoryText;
    private Text _fileNameText;
    private Button _autoCreateButton;
    private Text _fileExistText;
    private Text _tempPrefixText;

    @Override
    public String getTitle() {
        return Messages.title_fileBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_fileBindingDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelFileBindingType) {
            this._binding = (CamelFileBindingType) impl;
            setInUpdate(true);
            if (this._binding.getProduce() != null) {
                if (this._binding.getProduce().getFileExist() != null) {
                    _fileExistText.setText(this._binding.getProduce().getFileExist());
                } else {
                    _fileExistText.setText(""); //$NON-NLS-1$
                }
                if (this._binding.getProduce().getTempPrefix() != null) {
                    _tempPrefixText.setText(this._binding.getProduce().getTempPrefix());
                } else {
                    _tempPrefixText.setText(""); //$NON-NLS-1$
                }
            }
            if (this._binding.getDirectory() != null) {
                _directoryText.setText(this._binding.getDirectory());
            } else {
                _directoryText.setText(""); //$NON-NLS-1$
            }
            if (this._binding.getFileName() != null) {
                _fileNameText.setText(this._binding.getFileName());
            } else {
                _fileNameText.setText(""); //$NON-NLS-1$
            }
            if (_binding.getName() == null) {
                _nameText.setText(""); //$NON-NLS-1$
            } else {
                _nameText.setText(_binding.getName());
            }
            _autoCreateButton.setSelection(this._binding.isAutoCreate());
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_directoryText.getText().trim().isEmpty()) {
                setErrorMessage(Messages.error_emptyDirectory);
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

        getProducerTabControl(_panel);
    }

    private Control getProducerTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);

        _directoryText = createLabelAndText(composite, Messages.label_directoryStar);
        _fileNameText = createLabelAndText(composite, Messages.label_fileName);
        _autoCreateButton = createCheckbox(composite, Messages.label_autoCreateMissingDirectories);
        _fileExistText = createLabelAndText(composite, Messages.label_fileExist);
        _tempPrefixText = createLabelAndText(composite, Messages.label_tempPrefix);

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    class ProduceOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getProduce() == null) {
                setFeatureValue(_binding, "produce", FileFactory.eINSTANCE.createFileProducerType()); //$NON-NLS-1$
            }
        }
    }

    protected void updateProduceFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new ProduceOp());
        ops.add(new BasicOperation("produce", featureId, value)); //$NON-NLS-1$
        wrapOperation(ops);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_directoryText)) {
            updateFeature(_binding, "directory", _directoryText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_fileNameText)) {
            updateFeature(_binding, "fileName", _fileNameText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_autoCreateButton)) {
            updateFeature(_binding, "autoCreate", new Boolean(_autoCreateButton.getSelection())); //$NON-NLS-1$
        } else if (control.equals(_fileExistText)) {
            updateProduceFeature("fileExist", _fileExistText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_tempPrefixText)) {
            updateProduceFeature("tempPrefix", _tempPrefixText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_nameText)) {
            super.updateFeature(_binding, "name", _nameText.getText().trim()); //$NON-NLS-1$
        } else {
            super.handleModify(control);
        }
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_directoryText)) {
                _directoryText.setText(this._binding.getDirectory());
            } else if (control.equals(_fileNameText)) {
                _fileNameText.setText(this._binding.getFileName());
            } else if (control.equals(_autoCreateButton)) {
                _autoCreateButton.setSelection(this._binding.isAutoCreate());
            } else if (control.equals(_nameText)) {
                _nameText.setText(_binding.getName() == null ? "" : _binding.getName()); //$NON-NLS-1$
            } else if (this._binding.getProduce() != null) {
                if (control.equals(_fileExistText)) {
                    _fileExistText.setText(this._binding.getProduce().getFileExist());
                } else if (control.equals(_tempPrefixText)) {
                    _tempPrefixText.setText(this._binding.getProduce().getTempPrefix());
                }
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

}
