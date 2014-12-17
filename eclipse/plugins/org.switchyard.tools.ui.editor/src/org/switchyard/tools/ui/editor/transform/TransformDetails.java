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
package org.switchyard.tools.ui.editor.transform;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.switchyard.ExchangePattern;
import org.switchyard.metadata.ServiceInterface;
import org.switchyard.metadata.ServiceOperation;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformTypeImpl;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.model.merge.SwitchYardMergedModelAdapter;

/**
 * TransformDetails
 * 
 * <p/>
 * Details about transformations provided and required for a SwitchYard
 * configuration.
 */
public class TransformDetails {

    private SwitchYardType _switchYard;
    private SortedSet<TransformType> _transforms = new TreeSet<TransformType>(new TranformTypeComparator());
    private NavigableMap<TransformType, Set<String>> _required = new TreeMap<TransformType, Set<String>>(
            new TranformTypeComparator());

    /**
     * Create a new TransformDetails for all the connections in the SwitchYard
     * diagram.
     * 
     * @param switchYard the SwitchYard model.
     * @throws Exception if something goes awry
     */
    public TransformDetails(SwitchYardType switchYard) throws Exception {
        _switchYard = switchYard;

        final ClassLoader oldTCCL = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(
                JavaUtil.getProjectClassLoader(
                        JavaCore.create(PlatformResourceAdapterFactory.getContainingProject(switchYard)), null));
        try {
            collectProvidedTransforms();
            collectRequiredTransforms(switchYard);
        } finally {
            Thread.currentThread().setContextClassLoader(oldTCCL);
        }
    }

    /**
     * Create a new TransformDetails scoped to the connection.
     * 
     * @param switchYard the root SwitchYard model
     * @param source the calling contract
     * @param target the target contract
     * @throws Exception if something goes awry
     */
    public TransformDetails(SwitchYardType switchYard, Contract source, Contract target) throws Exception {
        _switchYard = switchYard;

        final ClassLoader oldTCCL = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(
                JavaUtil.getProjectClassLoader(JavaCore.create(PlatformResourceAdapterFactory
                        .getContainingProject(switchYard)), getClass().getClassLoader()));
        try {
            collectProvidedTransforms();
            collectRequiredTransforms(source, target);
        } finally {
            Thread.currentThread().setContextClassLoader(oldTCCL);
        }
    }

    /**
     * @return the root SwitchYard model.
     */
    public SwitchYardType getSwitchYard() {
        return _switchYard;
    }

    /**
     * @return the exisisting transforms
     */
    public SortedSet<TransformType> getDeclaredTransforms() {
        return Collections.unmodifiableSortedSet(_transforms);
    }

    /**
     * @return the required transforms for the current scope (global or service
     *         interation).
     */
    public SortedSet<TransformType> getRequiredTransforms() {
        return Collections.unmodifiableSortedSet(_required.navigableKeySet());
    }

    /**
     * @param transform the transform
     * @return the set of operation details associated with the transform.
     */
    public Set<String> getTransformDetails(TransformType transform) {
        return _required.get(transform);
    }

    private void collectProvidedTransforms() {
        final SwitchYardMergedModelAdapter switchYardAdapter = (SwitchYardMergedModelAdapter) EcoreUtil
                .getRegisteredAdapter(_switchYard, SwitchYardMergedModelAdapter.class);
        if (switchYardAdapter == null) {
            return;
        }
        _transforms.addAll(switchYardAdapter.getTransforms());
    }

    private void collectRequiredTransforms(SwitchYardType switchYard) {
        final SwitchyardSCAEditor editor = SwitchyardSCAEditor.getEditor(switchYard);
        if (editor == null) {
            return;
        }
        final Diagram diagram = editor.getDiagramTypeProvider().getDiagram();
        final IFeatureProvider featureProvider = editor.getDiagramTypeProvider().getFeatureProvider();
        for (Connection connection : diagram.getConnections()) {
            final Object sourceBO = featureProvider.getBusinessObjectForPictogramElement(connection.getStart());
            final Object targetBO = featureProvider.getBusinessObjectForPictogramElement(connection.getEnd());
            if (sourceBO instanceof Contract && targetBO instanceof Contract) {
                collectRequiredTransforms((Contract) sourceBO, (Contract) targetBO);
            }
        }
    }

    private void collectRequiredTransforms(Contract sourceBO, Contract targetBO) {
        try {
            final ServiceInterface source = sourceBO.getInterface() == null ? null : SwitchYardModelUtils
                    .getServiceInterface(sourceBO.getInterface());
            final ServiceInterface target = targetBO.getInterface() == null ? null : SwitchYardModelUtils
                    .getServiceInterface(targetBO.getInterface());
            if (source.getOperations().size() == 1 && target.getOperations().size() == 1) {
                // special case for single op interfaces
                collectRequiredTransforms(sourceBO.getName(), targetBO.getName(), source.getOperations().iterator()
                        .next(), target.getOperations().iterator().next());
            } else {
                for (ServiceOperation operation : source.getOperations()) {
                    collectRequiredTransforms(sourceBO.getName(), targetBO.getName(), operation,
                            target.getOperation(operation.getName()));
                }
            }
        } catch (Exception e) {
            // eat it
            e.fillInStackTrace();
        }
    }

    private void collectRequiredTransforms(String sourceServiceName, String targetServiceName, ServiceOperation source,
            ServiceOperation target) {
        if (source == null || target == null) {
            return;
        }
        if (source.getInputType() != null && target.getInputType() != null
                && !source.getInputType().equals(target.getInputType())) {
            addRequiredMapping(
                    new MissingTransformType(source.getInputType(), target.getInputType()),
                    createOperationDetails(sourceServiceName, targetServiceName, source.getName(), target.getName(),
                            MapType.Input));
        }
        if (source.getExchangePattern() == ExchangePattern.IN_OUT) {
            if (source.getOutputType() != null && target.getOutputType() != null
                    && !source.getOutputType().equals(target.getOutputType())) {
                addRequiredMapping(
                        new MissingTransformType(target.getOutputType(), source.getOutputType()),
                        createOperationDetails(sourceServiceName, targetServiceName, source.getName(),
                                target.getName(), MapType.Output));
            }
            if (source.getFaultType() != null && target.getFaultType() != null
                    && !source.getFaultType().equals(target.getFaultType())) {
                addRequiredMapping(
                        new MissingTransformType(target.getFaultType(), source.getFaultType()),
                        createOperationDetails(sourceServiceName, targetServiceName, source.getName(),
                                target.getName(), MapType.Fault));
            }
        }
    }

    private void addRequiredMapping(final TransformType transform, final String detail) {
        Set<String> details = _required.get(transform);
        if (details == null) {
            details = new LinkedHashSet<String>();
            _required.put(transform, details);
        }
        details.add(detail);
    }

    private final class MissingTransformType extends TransformTypeImpl {
        public MissingTransformType(QName from, QName to) {
            super();
            setFrom(from == null ? null : from.toString());
            setTo(to == null ? null : to.toString());
        }
    }

    private static String createOperationDetails(String invokingServiceName, String targetServiceName,
            String invokingOperationName, String targetOperationName, MapType type) {
        return "" + type + ": " + invokingServiceName + "." + invokingOperationName //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                + (type == MapType.Input ? "() => " : "() <=") + targetServiceName + "." + targetOperationName + "()"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    }

    private static enum MapType {
        Input, Output, Fault;
    }

    private static final class TranformTypeComparator implements Comparator<TransformType> {
        @Override
        public int compare(TransformType t1, TransformType t2) {
            int retVal = compareValues(t1.getFrom(), t2.getFrom());
            if (retVal == 0) {
                retVal = compareValues(t1.getTo(), t2.getTo());
            }
            return retVal;
        }

        private int compareValues(String s1, String s2) {
            if (s1 == null) {
                if (s2 == null) {
                    return 0;
                }
                return 1;
            } else if (s2 == null) {
                return -1;
            }
            return s1.compareTo(s2);
        }

    }
}
