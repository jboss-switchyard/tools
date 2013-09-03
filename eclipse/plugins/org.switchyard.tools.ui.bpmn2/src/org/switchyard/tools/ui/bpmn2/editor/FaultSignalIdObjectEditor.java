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
import org.eclipse.bpmn2.Definitions;
import org.eclipse.bpmn2.FormalExpression;
import org.eclipse.bpmn2.Signal;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractDetailComposite;
import org.eclipse.bpmn2.modeler.core.merrimac.dialogs.ComboObjectEditor;
import org.eclipse.bpmn2.modeler.core.merrimac.dialogs.FeatureEditingDialog;
import org.eclipse.bpmn2.modeler.core.utils.ModelUtil;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.window.Window;

/**
 * Object editor specialized for SwitchYard fault signal id data input.
 */
public class FaultSignalIdObjectEditor extends ComboObjectEditor {
    /**
     * Create a new FaultSignalIdObjectEditor.
     * 
     * @param parent parent composite
     * @param object the formal expression being edited
     */
    public FaultSignalIdObjectEditor(AbstractDetailComposite parent, FormalExpression object) {
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
        return true;
    }

    @Override
    protected boolean canSetNull() {
        return true;
    }

    @Override
    protected Hashtable<String, Object> getChoiceOfValues(EObject object, EStructuralFeature feature) {
        Hashtable<String, Object> values = new Hashtable<String, Object>();
        for (EObject available : ModelUtil.collectAncestorObjects(object, "rootElements", //$NON-NLS-1$
                new Class[] {Definitions.class }, new Class[] {Signal.class })) {
            Signal signal = (Signal) available;
            values.put("" + signal.getId() + " (" + signal.getName() + ")", signal.getId()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        }
        return values;
    }

    @Override
    protected boolean setValue(Object result) {
        if (result instanceof Signal) {
            return super.setValue(((Signal) result).getId());
        }
        return super.setValue(result);
    }

    protected EObject createObject() throws Exception {
        FeatureEditingDialog dialog = new FeatureEditingDialog(getDiagramEditor(), ModelUtil.findNearestAncestor(
                object, new Class[] {Definitions.class }), Bpmn2Package.eINSTANCE.getDefinitions_RootElements(), null);
        dialog.setFeatureEType(Bpmn2Package.eINSTANCE.getSignal());
        if (dialog.open() == Window.OK) {
            return dialog.getNewObject();
        }
        throw new OperationCanceledException("Dialog Cancelled"); //$NON-NLS-1$
    }
    
}
