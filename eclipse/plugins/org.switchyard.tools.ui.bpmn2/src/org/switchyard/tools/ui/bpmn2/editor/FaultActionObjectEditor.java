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
 ******************************************************************************/
package org.switchyard.tools.ui.bpmn2.editor;

import java.util.Hashtable;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.FormalExpression;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractDetailComposite;
import org.eclipse.bpmn2.modeler.core.merrimac.dialogs.ComboObjectEditor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Object editor specialized for SwitchYard fault action data input.
 */
public class FaultActionObjectEditor extends ComboObjectEditor {
    /**
     * Create a new FaultActionObjectEditor.
     * 
     * @param parent parent composite
     * @param object the formal expression being edited
     */
    public FaultActionObjectEditor(AbstractDetailComposite parent, FormalExpression object) {
        super(parent, object, Bpmn2Package.eINSTANCE.getFormalExpression_Body());
    }

    @Override
    protected boolean canEdit() {
        return false;
    }

    @Override
    protected boolean canEditInline() {
        return false;
    }

    @Override
    protected boolean canCreateNew() {
        return false;
    }

    @Override
    protected boolean canSetNull() {
        return true;
    }

    @Override
    protected Hashtable<String, Object> getChoiceOfValues(EObject object, EStructuralFeature feature) {
        Hashtable<String, Object> values = new Hashtable<String, Object>();
        values.put("Abort", "abort");
        values.put("Complete", "complete");
        return values;
    }
}
