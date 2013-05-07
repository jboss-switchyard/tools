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
 ******************************************************************************/
package org.switchyard.tools.ui.editor.model.merge;

import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.IMatchEngine.Factory;
import org.eclipse.emf.compare.match.eobject.EditionDistance;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.internal.ReflectiveWeightProvider;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.switchyard.tools.models.switchyard1_0.bean.BeanPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl;

/**
 * SwitchYardMatchEngineFactory
 * <p/>
 * 
 * Creates match engines for matching switchyard.xml files.
 */
@SuppressWarnings("restriction")
public class SwitchYardMatchEngineFactory implements Factory {

    private final IMatchEngine _matchEngine;
    private int _ranking = 20;

    /**
     * Create a new SwitchYardMatchEngineFactory.
     * 
     */
    public SwitchYardMatchEngineFactory() {
        ProximityEObjectMatcher.DistanceFunction meter = EditionDistance.builder()
                .weightProvider(new ReflectiveWeightProvider() {
                    @Override
                    public int getWeight(EStructuralFeature feature) {
                        // treat the following features as id's/names
                        if (feature == ScaPackage.eINSTANCE.getComposite_TargetNamespace()) {
                            return 8;
                        } else if (feature == ScaPackage.eINSTANCE.getJavaInterface_Interface()) {
                            return 8;
                        } else if (feature == ScaPackage.eINSTANCE.getWSDLPortType_Interface()) {
                            return 8;
                        } else if (feature == SwitchyardPackage.eINSTANCE.getEsbInterface_FaultType()) {
                            return 8;
                        } else if (feature == SwitchyardPackage.eINSTANCE.getEsbInterface_InputType()) {
                            return 8;
                        } else if (feature == SwitchyardPackage.eINSTANCE.getEsbInterface_OutputType()) {
                            return 8;
                        } else if (feature == BeanPackage.eINSTANCE.getBeanImplementationType_Class()) {
                            return 8;
                        } else if (feature == ScaPackage.eINSTANCE.getBPELImplementation_Process()) {
                            return 8;
                        } else if (feature == BPMPackage.eINSTANCE.getBPMImplementationType_ProcessId()) {
                            return 8;
                        } else if (feature == CamelPackage.eINSTANCE.getCamelImplementationType_Java()) {
                            return 8;
                        } else if (feature == CamelPackage.eINSTANCE.getCamelImplementationType_Xml()) {
                            return 8;
                        } else if (feature == RulesPackage.eINSTANCE.getRulesImplementationType_Manifest()) {
                            return 8;
                        }
                        return super.getWeight(feature);
                    }
                }).build();
        IEObjectMatcher matcher = new IdentifierEObjectMatcher(new ProximityEObjectMatcher(meter));
        _matchEngine = new DefaultMatchEngine(matcher, new DefaultComparisonFactory(new DefaultEqualityHelperFactory()));
    }

    @Override
    public IMatchEngine getMatchEngine() {
        return _matchEngine;
    }

    @Override
    public int getRanking() {
        return _ranking;
    }

    @Override
    public void setRanking(int ranking) {
        _ranking = ranking;
    }

    @Override
    public boolean isMatchEngineFactoryFor(IComparisonScope scope) {
        return scope.getLeft() instanceof SwitchyardResourceImpl && scope.getRight() instanceof SwitchyardResourceImpl;
    }

}
