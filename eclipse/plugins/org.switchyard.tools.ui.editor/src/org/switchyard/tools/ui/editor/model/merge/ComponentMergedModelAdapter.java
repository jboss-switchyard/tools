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

import javax.xml.namespace.QName;

import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * ComponentMergedModelAdapter
 * <p/>
 * Presents a merged view of a Component.
 */
public class ComponentMergedModelAdapter extends AbstractMergedModelAdapter {

    /**
     * Create a new ComponentMergedModelAdapter.
     * 
     * @param factory the factory that manages the differences.
     */
    public ComponentMergedModelAdapter(MergedModelAdapterFactory factory) {
        super(factory);
    }

    /**
     * @return the merged implementation value.
     */
    public Implementation getImplementation() {
        return (Implementation) getAggregatedValue(ScaPackage.eINSTANCE.getComponent_Implementation());
    }

    /**
     * @return the merged services list.
     */
    public List<ComponentService> getServices() {
        @SuppressWarnings("unchecked")
        List<ComponentService> retVal = (List<ComponentService>) getAggregatedValue(ScaPackage.eINSTANCE
                .getComponent_Service());
        if (retVal == null) {
            return Collections.emptyList();
        }
        return retVal;
    }

    /**
     * @return the merged references list.
     */
    public List<ComponentReference> getReferences() {
        @SuppressWarnings("unchecked")
        List<ComponentReference> retVal = (List<ComponentReference>) getAggregatedValue(ScaPackage.eINSTANCE
                .getComponent_Reference());
        if (retVal == null) {
            return Collections.emptyList();
        }
        return retVal;
    }

    /**
     * @return the merged requires list.
     */
    public List<QName> getRequires() {
        @SuppressWarnings("unchecked")
        List<QName> retVal = (List<QName>) getAggregatedValue(ScaPackage.eINSTANCE.getComponent_Requires());
        if (retVal == null) {
            return Collections.emptyList();
        }
        return retVal;
    }

}
