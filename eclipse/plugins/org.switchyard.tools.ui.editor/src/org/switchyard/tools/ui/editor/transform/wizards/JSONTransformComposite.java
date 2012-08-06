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

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;

/**
 * @author bfitzpat
 * 
 */
public class JSONTransformComposite extends BaseTransformComposite {

    @Override
    public void createContents(Composite parent, int style) {
        super.createContents(parent, style);
    }

    @Override
    public void setTransform(TransformType transform) {
        super.setTransform(transform);
        addObservableListeners();
    }

    @Override
    protected void handleModify(Control control) {
        super.handleModify(control);
    }

    @Override
    protected void handleUndo(Control control) {
        super.handleUndo(control);
    }

    @Override
    protected boolean validate() {
        return super.validate();
    }

}
