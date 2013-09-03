/*******************************************************************************
 * Copyright (c) 2011, 2012 Red Hat, Inc.
 *  All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Red Hat, Inc. - initial API and implementation
 *
 * @author Bob Brodt
 ******************************************************************************/

package org.switchyard.tools.ui.bpmn2.editor;

import java.util.Hashtable;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.ServiceTask;
import org.eclipse.bpmn2.modeler.core.adapters.FeatureDescriptor;
import org.eclipse.bpmn2.modeler.ui.adapters.properties.ServiceTaskPropertiesAdapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author Bob Brodt
 * 
 * 
 *         This class needs to go into the SwitchYard extension for the jBPM
 *         Target Runtime extension
 * 
 */
public class SwitchYardServiceTaskPropertiesAdapter extends ServiceTaskPropertiesAdapter {

    private static final String SWITCHYARD_IMPLEMENTATION = "##SwitchYard"; //$NON-NLS-1$

    /**
     * @param adapterFactory the factory
     * @param object the ServiceTask
     */
    public SwitchYardServiceTaskPropertiesAdapter(AdapterFactory adapterFactory, ServiceTask object) {
        super(adapterFactory, object);

        final EStructuralFeature feature = Bpmn2Package.eINSTANCE.getServiceTask_Implementation();
        final FeatureDescriptor<ServiceTask> parentDescriptor = getFeatureDescriptor(feature);
        setFeatureDescriptor(feature, new FeatureDescriptor<ServiceTask>(adapterFactory, object, feature) {
            @Override
            public Hashtable<String, Object> getChoiceOfValues(Object context) {
                if (choiceOfValues == null) {
                    if (parentDescriptor != null) {
                        choiceOfValues = parentDescriptor.getChoiceOfValues(context);
                    }
                    if (choiceOfValues == null) {
                        choiceOfValues = new Hashtable<String, Object>();
                    }
                    choiceOfValues.put("SwitchYard Service", SWITCHYARD_IMPLEMENTATION); //$NON-NLS-1$
                }
                return choiceOfValues;
            }
        });
    }

}
