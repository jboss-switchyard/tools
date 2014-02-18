/******************************************************************************* 
 * Copyright (c) 2013-1014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.binding;

import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.ui.editor.Messages;

/**
 * Composite for editing advanced properties associated with a binding.
 * 
 * @author bfitzpat
 */
public class AdvancedCamelBindingDetailsComposite extends AdvancedBindingDetailsComposite {

    private CamelAdditionalURIPropertyTable _propTable;
    private final EReference _parameterFeature;
    private final EReference _additionalUriParametersFeature;
    private final EClass _parameterType;

    /**
     * Create a new AdvancedBindingDetailsComposite.
     * 
     * @param toolkit to be used for creating controls
     * @param advancedProperties list of properties
     * @param additionalUriParametersFeature feature for additional URI parameters container
     * @param parameterFeature feature for parameter list
     * @param parameterType EClass for the specific model's parameter type
     */
    public AdvancedCamelBindingDetailsComposite(FormToolkit toolkit, List<String> advancedProperties, 
            EReference additionalUriParametersFeature, 
            EReference parameterFeature, 
            EClass parameterType) {
        super(toolkit, advancedProperties);
        _additionalUriParametersFeature = additionalUriParametersFeature;
        _parameterFeature = parameterFeature;
        _parameterType = parameterType;
    }

    
    
    @Override
    protected void addAdvancedPropertiesTable(Composite parent, DataBindingContext context) {
        if (!getAdvancedPropertiesList().isEmpty()) {
            Label advancedPropertiesLabel = getToolkit().createLabel(parent,
                    Messages.AdvancedCamelBindingDetailsComposite_labelTextAdvancedProperties, SWT.NONE);
            GridData gd3 = new GridData(SWT.FILL, SWT.NONE, true, false);
            advancedPropertiesLabel.setLayoutData(gd3);
    
            super.addAdvancedPropertiesTable(parent, context);
        }

        Label additionalURIPropsLabel = getToolkit().createLabel(parent,
                Messages.AdvancedCamelBindingDetailsComposite_labelTextAdditionalURIParameters, SWT.NONE);
        GridData gd = new GridData(SWT.FILL, SWT.NONE, true, false);
        additionalURIPropsLabel.setLayoutData(gd);
        
        // add the additional URI properties table
        _propTable = new CamelAdditionalURIPropertyTable(getPanel(), SWT.NONE, _additionalUriParametersFeature,
                _parameterFeature, _parameterType, context);
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
