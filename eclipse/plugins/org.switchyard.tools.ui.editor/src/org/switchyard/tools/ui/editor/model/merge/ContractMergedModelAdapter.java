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

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * ContractMergedModelAdapter
 * 
 * <p/>
 * Presents a merged view of a Contract.
 */
public class ContractMergedModelAdapter extends AbstractMergedModelAdapter {

    /**
     * Create a new ContractMergedModelAdapter.
     * 
     * @param factory the factory that manages the differences.
     */
    public ContractMergedModelAdapter(MergedModelAdapterFactory factory) {
        super(factory);
    }

    /**
     * @return the merged interface value.
     */
    public Interface getInterface() {
        return (Interface) getAggregatedValue(ScaPackage.eINSTANCE.getContract_Interface());
    }

    /**
     * @return the merged name value.
     */
    public String getName() {
        return (String) getAggregatedValue(ScaPackage.eINSTANCE.getContract_Name());
    }

    /**
     * @return the merged requires list.
     */
    public List<QName> getRequires() {
        @SuppressWarnings("unchecked")
        List<QName> retVal = (List<QName>) getAggregatedValue(ScaPackage.eINSTANCE.getContract_Requires());
        if (retVal == null) {
            return Collections.emptyList();
        }
        return retVal;
    }

    /**
     * @return the merged bindings list.
     */
    public List<Binding> getBindings() {
        @SuppressWarnings("unchecked")
        List<Binding> retVal = (List<Binding>) getAggregatedValue(ScaPackage.eINSTANCE.getContract_Binding());
        if (retVal == null) {
            return Collections.emptyList();
        }
        return retVal;
    }

}
