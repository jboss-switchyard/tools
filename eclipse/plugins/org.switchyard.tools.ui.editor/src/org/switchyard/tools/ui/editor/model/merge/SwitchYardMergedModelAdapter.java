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

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.DomainType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType;

/**
 * SwitchYardMergedModelAdapter
 * <p/>
 * Presents a merged view of the SwitchYard model.
 */
public class SwitchYardMergedModelAdapter extends AbstractMergedModelAdapter {

    /**
     * Create a new SwitchYardMergedModelAdapter.
     * 
     * @param factory the factory that manages the differences.
     */
    public SwitchYardMergedModelAdapter(MergedModelAdapterFactory factory) {
        super(factory);
    }

    /**
     * @return the merged artifacts value.
     */
    public List<ArtifactType> getArtifacts() {
        ArtifactsType artifacts = (ArtifactsType) getAggregatedValue(SwitchyardPackage.eINSTANCE
                .getSwitchYardType_Artifacts());
        if (artifacts == null) {
            return Collections.emptyList();
        }
        return ((ArtifactsMergedModelAdapter) EcoreUtil.getRegisteredAdapter(artifacts,
                ArtifactsMergedModelAdapter.class)).getArtifacts();
    }

    /**
     * @return the merged composite value.
     */
    public Composite getComposite() {
        return (Composite) getAggregatedValue(SwitchyardPackage.eINSTANCE.getSwitchYardType_Composite());
    }

    /**
     * @return the merged domain value.
     */
    public DomainType getDomain() {
        return (DomainType) getAggregatedValue(SwitchyardPackage.eINSTANCE.getSwitchYardType_Domain());
    }

    /**
     * @return the merged name value.
     */
    public String getName() {
        return (String) getAggregatedValue(SwitchyardPackage.eINSTANCE.getSwitchYardType_Name());
    }

    /**
     * @return the merged target namespace value.
     */
    public String getTargetNamespace() {
        return (String) getAggregatedValue(SwitchyardPackage.eINSTANCE.getSwitchYardType_TargetNamespace());
    }

    /**
     * @return the merged transforms value.
     */
    public List<TransformType> getTransforms() {
        TransformsType transforms = (TransformsType) getAggregatedValue(SwitchyardPackage.eINSTANCE
                .getSwitchYardType_Transforms());
        if (transforms == null) {
            return Collections.emptyList();
        }
        return ((TransformsMergedModelAdapter) EcoreUtil.getRegisteredAdapter(transforms,
                TransformsMergedModelAdapter.class)).getTransforms();
    }

    /**
     * @return the merged validates value.
     */
    public List<ValidateType> getValidates() {
        ValidatesType validates = (ValidatesType) getAggregatedValue(SwitchyardPackage.eINSTANCE
                .getSwitchYardType_Validates());
        if (validates == null) {
            return Collections.emptyList();
        }
        return ((ValidatesMergedModelAdapter) EcoreUtil.getRegisteredAdapter(validates,
                ValidatesMergedModelAdapter.class)).getValidates();
    }

}
