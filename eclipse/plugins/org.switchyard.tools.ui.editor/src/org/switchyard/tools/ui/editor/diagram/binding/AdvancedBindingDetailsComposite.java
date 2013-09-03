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
package org.switchyard.tools.ui.editor.diagram.binding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * Composite for editing advanced properties associated with a binding.
 * 
 * @author bfitzpat
 */
public class AdvancedBindingDetailsComposite extends AbstractSYBindingComposite implements IBindingComposite {

    private Composite _panel;
    private AdvancedBindingPropertyTable _advPropsTable;
    private List<String> _advancedProperties;

    /**
     * Create a new AdvancedBindingDetailsComposite.
     * 
     * @param advancedProperties list of properties
     */
    public AdvancedBindingDetailsComposite(List<String> advancedProperties) {
        super();
        _advancedProperties = advancedProperties == null ? Collections.<String> emptyList() : advancedProperties;
    }

    @Override
    public String getTitle() {
        return Messages.title_advancedBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_advancedBindingDetails;
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        _panel.setLayout(gl);

        _advPropsTable = new AdvancedBindingPropertyTable(_panel, SWT.NONE);        
        GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
        _advPropsTable.setLayoutData(gd);
    }
    
    @Override
    public Composite getPanel() {
        return _panel;
    }

    private List<PropertyObject> processFeatures(EObject eobj) {
        List<PropertyObject> properties = new ArrayList<PropertyObject>();
        
        EList<EStructuralFeature> features = eobj.eClass().getEAllStructuralFeatures();
        Iterator<EStructuralFeature> iter = features.iterator();
        while (iter.hasNext()) {
            EStructuralFeature feature = iter.next();
            String name = feature.getName();
            
            if (_advancedProperties.contains(name)) {
                properties.add(new PropertyObject(eobj, name));
            }
            
            Object featureObj = eobj.eGet(feature);
            if (featureObj != null && featureObj instanceof EObject) {
                EObject innerEObj = (EObject) featureObj;
                List<PropertyObject> innerList = processFeatures(innerEObj);
                properties.addAll(innerList);
            }
        }
        
        return properties;
    }

    protected void getAdvancedProperties(Binding switchYardBindingType) {
        List<PropertyObject> properties = processFeatures(switchYardBindingType);
        if (_advPropsTable != null && !_advPropsTable.isDisposed()) {
            _advPropsTable.setTargetObject(switchYardBindingType);
            _advPropsTable.getTreeViewer().setInput(properties);
        }
    }

    @Override
    public void setBinding(Binding switchYardBindingType) {
        super.setBinding(switchYardBindingType);
        getAdvancedProperties(switchYardBindingType);
    }

    @Override
    protected boolean validate() {
        return (getErrorMessage() == null);
    }

}
