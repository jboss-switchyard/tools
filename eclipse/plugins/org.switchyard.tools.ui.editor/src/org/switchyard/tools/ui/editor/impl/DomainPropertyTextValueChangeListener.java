/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
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
package org.switchyard.tools.ui.editor.impl;

import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.jface.internal.databinding.swt.SWTVetoableValueDecorator;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.ui.editor.util.ErrorUtils;

/**
 * Abstract text value change listener for domain page of editor.
 * @author bfitzpat
 *
 */
@SuppressWarnings("restriction")
public abstract class DomainPropertyTextValueChangeListener implements IValueChangeListener {

    @Override
    public void handleValueChange(ValueChangeEvent e) {
        if (e.diff != null && !e.diff.getOldValue().equals(e.diff.getNewValue())) {
            SWTVetoableValueDecorator decorator = (SWTVetoableValueDecorator) e.getSource();
            Text textControl = (Text) decorator.getWidget();
            updateField(textControl);
            ErrorUtils.showErrorMessage(null);
        }
    }
    
    protected abstract void updateField(Text control);

}
