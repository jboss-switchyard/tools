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
package org.switchyard.tools.ui.editor.diagram.binding;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.switchyard.tools.ui.editor.Messages;

/**
 * Composite for editing advanced properties associated with a binding.
 * 
 * @author bfitzpat
 */
public class AdvancedCamelBindingDetailsComposite extends AdvancedBindingDetailsComposite {

    private CamelAdditionalURIPropertyTable _propTable;
    private final EReference _mappingsFeature;
    private final EReference _actionVariableFeature;
    private final EClass _parameterType;

    /**
     * Create a new AdvancedBindingDetailsComposite.
     * 
     * @param advancedProperties list of properties
     * @param actionVariableFeature collection
     * @param mappingsFeature items in collection
     * @param parameterType individual items
     */
    public AdvancedCamelBindingDetailsComposite(List<String> advancedProperties, 
            EReference actionVariableFeature, 
            EReference mappingsFeature, 
            EClass parameterType) {
        super(advancedProperties);
        _actionVariableFeature = actionVariableFeature;
        _mappingsFeature = mappingsFeature;
        _parameterType = parameterType;
    }

    
    
    @Override
    protected void addAdvancedPropertiesTable(Composite parent) {
        if (!getAdvancedPropertiesList().isEmpty()) {
            Label advancedPropertiesLabel = new Label(parent, SWT.NONE);
            advancedPropertiesLabel.setText(Messages.AdvancedCamelBindingDetailsComposite_labelTextAdvancedProperties);
            GridData gd3 = new GridData(SWT.FILL, SWT.NONE, true, false);
            advancedPropertiesLabel.setLayoutData(gd3);
    
            super.addAdvancedPropertiesTable(parent);
        }

        Label additionalURIPropsLabel = new Label(parent, SWT.NONE);
        additionalURIPropsLabel.setText(Messages.AdvancedCamelBindingDetailsComposite_labelTextAdditionalURIParameters);
        GridData gd = new GridData(SWT.FILL, SWT.NONE, true, false);
        additionalURIPropsLabel.setLayoutData(gd);
        
        // add the additional URI properties table
        _propTable = new CamelAdditionalURIPropertyTable(getPanel(), SWT.NONE, 
                _actionVariableFeature, 
                _mappingsFeature, 
                _parameterType);
        GridData gd2 = new GridData(SWT.FILL, SWT.FILL, true, false);
        gd2.verticalSpan = 5;
        _propTable.setLayoutData(gd2);
    }

    @Override
    public void setBinding(Binding switchYardBindingType) {
        super.setBinding(switchYardBindingType);
        _propTable.setTargetObject(switchYardBindingType);
    }

}
