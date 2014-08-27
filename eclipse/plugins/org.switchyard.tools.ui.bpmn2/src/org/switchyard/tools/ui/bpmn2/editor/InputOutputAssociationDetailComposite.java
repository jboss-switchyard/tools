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

import org.eclipse.bpmn2.modeler.core.merrimac.dialogs.ObjectEditor;
import org.eclipse.bpmn2.modeler.core.merrimac.dialogs.ReadonlyTextObjectEditor;
import org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.property.JbpmDataAssociationDetailComposite;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Section;

/**
 * Specialized section for SwitchYard service task input/output.
 */
public class InputOutputAssociationDetailComposite extends JbpmDataAssociationDetailComposite {

    /**
     * Create a new InputOutputAssociationDetailComposite.
     * 
     * @param parent parent control
     */
    public InputOutputAssociationDetailComposite(Section parent) {
        super(parent, SWT.NONE);
    }

    @Override
    protected DataInputOutputDetailComposite createDataInputOutputDetailComposite(EObject be, Composite parent,
            int style) {
        return new MyDataInputOutputDetailComposite(parent, style);
    }

    private final class MyDataInputOutputDetailComposite extends DataInputOutputDetailComposite {

        private MyDataInputOutputDetailComposite(Composite parent, int style) {
            super(parent, style);
        }

        @Override
        protected void createEmptyLabel(EObject be) {
        }

        @Override
        protected boolean isModelObjectEnabled(EClass eclass, EStructuralFeature feature) {
            return "name".equals(feature.getName()); //$NON-NLS-1$
        }

        @Override
        protected void bindAttribute(Composite parent, EObject object, EAttribute attribute, String label) {
            if ("name".equals(attribute.getName())) { //$NON-NLS-1$
                if (label == null) {
                    label = getBusinessObjectDelegate().getLabel(object, attribute);
                }
                ObjectEditor editor = new ReadonlyTextObjectEditor(this, object, attribute);
                editor.createControl(parent, label);
                return;
            }
            super.bindAttribute(parent, object, attribute, label);
        }

    }
}
