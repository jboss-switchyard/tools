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

import java.util.Collections;
import java.util.List;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;

/**
 * TransformsMergedModelAdapter
 * 
 * <p/>
 * Presents a merged view of artifacts.
 */
public class TransformsMergedModelAdapter extends AbstractMergedModelAdapter {

    /**
     * Create a new TransformsMergedModelAdapter.
     * 
     * @param factory the factory that manages the differences.
     */
    public TransformsMergedModelAdapter(MergedModelAdapterFactory factory) {
        super(factory);
    }

    /**
     * @return the merged transforms list.
     */
    public List<TransformType> getTransforms() {
        @SuppressWarnings("unchecked")
        List<TransformType> retVal = (List<TransformType>) getAggregatedValue(SwitchyardPackage.eINSTANCE
                .getTransformsType_Transform());
        if (retVal == null) {
            return Collections.emptyList();
        }
        return retVal;
    }

}
