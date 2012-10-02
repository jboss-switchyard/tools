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

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.CommonPlugin.Implementation;
import org.eclipse.emf.compare.FactoryException;
import org.eclipse.emf.compare.match.engine.AbstractSimilarityChecker;
import org.eclipse.emf.compare.match.engine.GenericMatchEngine;
import org.eclipse.emf.compare.match.engine.IMatchEngine;
import org.eclipse.emf.compare.match.engine.internal.DistinctEcoreSimilarityChecker;
import org.eclipse.emf.compare.match.engine.internal.GenericMatchEngineToCheckerBridge;
import org.eclipse.emf.compare.match.internal.statistic.NameSimilarity;
import org.eclipse.emf.compare.match.statistic.MetamodelFilter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.open.oasis.docs.ns.opencsa.sca.bpel.BPELImplementation;
import org.switchyard.tools.models.switchyard1_0.bean.BeanImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;

/**
 * SwitchYardMatchEngine
 * 
 * <p/>
 * Match engine for SwitchYard configuration models.
 */
@SuppressWarnings("restriction")
public class SwitchYardMatchEngine extends GenericMatchEngine implements IMatchEngine {

    /**
     * Create a new SwitchYardMatchEngine.
     */
    public SwitchYardMatchEngine() {
        super();
        filter = new MetamodelFilter() {

            @Override
            public List<EStructuralFeature> getFilteredFeatures(EObject eObj) {
                final List<EStructuralFeature> result = super.getFilteredFeatures(eObj);
                for (Iterator<EStructuralFeature> it = result.iterator(); it.hasNext();) {
                    if (FeatureMapUtil.isFeatureMap(it.next())) {
                        it.remove();
                    }
                }
                return result;
            }

        };
    }

    @Override
    protected AbstractSimilarityChecker prepareChecker() {
        GenericMatchEngineToCheckerBridge bridge = new GenericMatchEngineToCheckerBridge() {

            @Override
            public double nameSimilarity(EObject obj1, EObject obj2) {
                return SwitchYardMatchEngine.this.nameSimilarity(obj1, obj2);
            }

            @SuppressWarnings("deprecation")
            @Override
            public double contentSimilarity(EObject obj1, EObject obj2) throws FactoryException {
                return SwitchYardMatchEngine.this.contentSimilarity(obj1, obj2);
            }
        };
        return new SwitchYardChecker(filter, bridge);
    }

    @Override
    protected double nameSimilarity(EObject obj1, EObject obj2) {
        return NameSimilarity.nameSimilarityMetric(getName(obj1), getName(obj2));
    }

    private String getName(EObject obj) {
        if (obj instanceof Contract) {
            return ((Contract) obj).getName();
        } else if (obj instanceof Component) {
            return ((Component) obj).getName();
        } else if (obj instanceof Composite) {
            return "{" + ((Composite) obj).getTargetNamespace() + "}" + ((Composite) obj).getName();
        } else if (obj instanceof Interface) {
            // TODO: a more extensible solution
            if (obj instanceof JavaInterface) {
                return obj.eClass().getName() + ":" + ((JavaInterface) obj).getInterface();
            } else if (obj instanceof WSDLPortType) {
                return obj.eClass().getName() + ":" + ((WSDLPortType) obj).getInterface();
            } else if (obj instanceof EsbInterface) {
                EsbInterface esb = (EsbInterface) obj;
                return obj.eClass().getName() + ":" + esb.getInputType() + ":" + esb.getOutputType() + ":"
                        + esb.getFaultType();
            }
        } else if (obj instanceof Implementation) {
            // TODO: a more extensible solution
            if (obj instanceof BeanImplementationType) {
                return obj.eClass().getName() + ":" + ((BeanImplementationType) obj).getClass_();
            } else if (obj instanceof BPELImplementation) {
                return obj.eClass().getName() + ":" + ((BPELImplementation) obj).getProcess();
            } else if (obj instanceof BPMImplementationType) {
                return obj.eClass().getName() + ":" + ((BPMImplementationType) obj).getProcessDefinition();
            } else if (obj instanceof CamelImplementationType) {
                CamelImplementationType camel = (CamelImplementationType) obj;
                if (camel.getJava() != null) {
                    return obj.eClass().getName() + ":" + camel.getJava().getClass_();
                } else if (camel.getXml() != null) {
                    return obj.eClass().getName() + ":" + camel.getXml().getPath();
                }
                // } else if (obj instanceof ClojureImplementationType) {
                // } else if (obj instanceof RulesImplementationType) {
            }
            return obj.eClass().getName();
        }
        try {
            return NameSimilarity.findName(obj);
        } catch (FactoryException e) {
            return null;
        }
    }

    private final class SwitchYardChecker extends DistinctEcoreSimilarityChecker {

        private SwitchYardChecker(MetamodelFilter filter, GenericMatchEngineToCheckerBridge bridge) {
            super(filter, bridge);
        }

        @Override
        protected boolean hasSameUri(EObject obj1, EObject obj2) {
            return false;
        }

        @Override
        public double absoluteMetric(EObject obj1, EObject obj2) throws FactoryException {
            final double nameWeight = 0.8d;
            final double contentWeight = 0.2d;
            final double nameSimilarity = nameSimilarity(obj1, obj2);
            final double contentSimilarity = contentSimilarity(obj1, obj2);
            return (contentSimilarity * contentWeight + nameSimilarity * nameWeight) / (contentWeight + nameWeight);
        }

        @Override
        protected double contentSimilarity(EObject obj1, EObject obj2) throws FactoryException {
            return (compareAttributes(obj1, obj2) + compareAttributes(obj2, obj1)) / 2;
        }

        private double compareAttributes(EObject obj1, EObject obj2) throws FactoryException {
            final EClass class1 = obj1.eClass();
            final EClass class2 = obj2.eClass();
            int count = 0;
            double similarity = 0d;
            for (EAttribute attribute : class1.getEAllAttributes()) {
                Object value1 = obj1.eGet(attribute);
                EStructuralFeature feature2 = class2.getEStructuralFeature(attribute.getName());
                Object value2 = feature2 == null ? null : obj2.eGet(feature2);
                if (value1 == null && value2 == null && feature2 != null) {
                    // don't include null attributes in comparison
                    continue;
                } else {
                    similarity += NameSimilarity.nameSimilarityMetric(getStringValue(value1), getStringValue(value2));
                    ++count;
                }
            }
            return count == 0 ? 0d : similarity / count;
        }

        private String getStringValue(Object obj) {
            // stripping any object hash off the string (e.g. @deadbeef)
            return obj instanceof EObject ? getName((EObject) obj) : obj == null ? null : String.valueOf(obj)
                    .replaceAll("@[0-9a-fA-f]+ ", " ");
        }

    }

}
