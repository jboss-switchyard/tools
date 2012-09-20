/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.model.merge;

import org.switchyard.tools.models.switchyard1_0.hornetq.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.HandlersType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType;

/**
 * DomainMergedModelAdapter
 * 
 * <p/>
 * Presents a merged view of the domain.
 */
public class DomainMergedModelAdapter extends AbstractMergedModelAdapter {

    /**
     * Create a new DomainMergedModelAdapter.
     * 
     * @param factory the factory that manages the differences.
     */
    public DomainMergedModelAdapter(MergedModelAdapterFactory factory) {
        super(factory);
    }

    /**
     * @return the merged name value.
     */
    public String getName() {
        return (String) getAggregatedValue(SwitchyardPackage.eINSTANCE.getDomainType_Name());
    }

    /**
     * @return the merged handlers value.
     */
    public HandlersType getHandlers() {
        return (HandlersType) getAggregatedValue(SwitchyardPackage.eINSTANCE.getDomainType_Handlers());
    }

    /**
     * @return the merged properties value.
     */
    public PropertiesType getProperties() {
        return (PropertiesType) getAggregatedValue(SwitchyardPackage.eINSTANCE.getDomainType_Properties());
    }

    /**
     * @return the merged transforms value.
     */
    public TransformsType getTransforms() {
        return (TransformsType) getAggregatedValue(SwitchyardPackage.eINSTANCE.getDomainType_Transforms());
    }

    /**
     * @return the merged validates value.
     */
    public ValidatesType getValidates() {
        return (ValidatesType) getAggregatedValue(SwitchyardPackage.eINSTANCE.getDomainType_Validates());
    }

}
