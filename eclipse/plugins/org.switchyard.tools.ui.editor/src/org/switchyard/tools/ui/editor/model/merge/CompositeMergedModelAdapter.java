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

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;

/**
 * CompositeMergedModelAdapter
 * 
 * <p/>
 * Presents a merged view of a Composite.
 */
public class CompositeMergedModelAdapter extends AbstractMergedModelAdapter {

    /**
     * Create a new CompositeMergedModelAdapter.
     * 
     * @param factory the factory that manages the differences.
     */
    public CompositeMergedModelAdapter(MergedModelAdapterFactory factory) {
        super(factory);
    }

    /**
     * @return the merged components list.
     */
    public List<Component> getComponents() {
        @SuppressWarnings("unchecked")
        List<Component> retVal = (List<Component>) getAggregatedValue(ScaPackage.eINSTANCE.getComposite_Component());
        if (retVal == null) {
            return Collections.emptyList();
        }
        return retVal;
    }

    /**
     * @return the merged services list.
     */
    public List<Service> getServices() {
        @SuppressWarnings("unchecked")
        List<Service> retVal = (List<Service>) getAggregatedValue(ScaPackage.eINSTANCE.getComposite_Service());
        if (retVal == null) {
            return Collections.emptyList();
        }
        return retVal;
    }

    /**
     * @return the merged references list.
     */
    public List<Reference> getReferences() {
        @SuppressWarnings("unchecked")
        List<Reference> retVal = (List<Reference>) getAggregatedValue(ScaPackage.eINSTANCE.getComposite_Reference());
        if (retVal == null) {
            return Collections.emptyList();
        }
        return retVal;
    }
}
