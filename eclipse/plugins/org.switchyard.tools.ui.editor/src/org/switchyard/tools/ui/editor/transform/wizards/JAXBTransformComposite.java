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

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType;

/**
 * @author bfitzpat
 * 
 */
public class JAXBTransformComposite extends BaseTransformComposite {

    private Text _contextPathText;

    @Override
    public void createContents(Composite parent, int style) {
        super.createContents(parent, style);
        _contextPathText = createLabelAndText(getPanel(), "Context Path");
    }

    protected boolean validate() {
        super.validate();
        if (getErrorMessage() == null) {
            // check to see if context path is valid Java class
            if (!_contextPathText.getText().trim().isEmpty()) {
                try {
                    if (canFindPackage(_contextPathText.getText().trim()) == null) {
                        setErrorMessage("Package specified as context path must exist in project.");
                    }
                } catch (JavaModelException e) {
                    e.fillInStackTrace();
                }
            }
        }
        return (getErrorMessage() == null);
    }
    
    protected void handleModify(final Control control) {
        if (control.equals(_contextPathText)) {
            updateFeature((JAXBTransformType) getTransform(), "contextPath", _contextPathText.getText().trim());
        } else {
            super.handleModify(control);
        }
        validate();
    }

    protected void handleUndo(Control control) {
        super.handleUndo(control);
        setInUpdate(true);
        if (getTransform() != null) {
            JAXBTransformType jaxbTransform = (JAXBTransformType) getTransform();
            if (control.equals(_contextPathText)) {
                _contextPathText.setText(jaxbTransform.getContextPath());
            }
        }
        setInUpdate(false);
    }    

    /**
     * @param transform incoming transform type
     */
    public void setTransform(TransformType transform) {
        super.setTransform(transform);
        setInUpdate(true);
        JAXBTransformType jaxbTransform = (JAXBTransformType) getTransform();
        if (_contextPathText != null && !_contextPathText.isDisposed() && jaxbTransform.getContextPath() != null) {
            _contextPathText.setText(jaxbTransform.getContextPath());
        }
        setInUpdate(false);
        addObservableListeners();
    }

}
