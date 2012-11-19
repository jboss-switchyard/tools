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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.compare.diff.metamodel.AttributeChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.DifferenceKind;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.util.DiffSwitch;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;

/**
 * AbstractMergedModelAdapter
 * 
 * <p/>
 * Helper class that aggregates generated content with source content.
 */
public abstract class AbstractMergedModelAdapter implements Adapter {

    private static final Object NULL_VALUE = new Object();
    private MergedModelAdapterFactory _factory;
    private Notifier _target;

    /**
     * Create a new AbstractMergedModelAdapter.
     * 
     * @param factory the factory that manages the differences.
     */
    protected AbstractMergedModelAdapter(MergedModelAdapterFactory factory) {
        _factory = factory;
    }

    /**
     * @return the root SwitchYard object from the source.
     */
    public SwitchYardType getSwitchYard() {
        return _factory.getSwitchYard();
    }

    @Override
    public void notifyChanged(Notification notification) {
    }

    @Override
    public Notifier getTarget() {
        return _target;
    }

    @Override
    public void setTarget(Notifier newTarget) {
        if (newTarget != _target) {
            _factory.clearFeatureDifferencesCache(this);
        }
        _target = newTarget;
    }

    @Override
    public boolean isAdapterForType(Object type) {
        return type instanceof Class && ((Class<?>) type).isAssignableFrom(getClass());
    }

    protected EObject getSource() {
        if (_target instanceof EObject) {
            return _factory.getSource((EObject) _target);
        }
        return null;
    }

    protected EObject getGenerated() {
        if (_target instanceof EObject) {
            return _factory.getGenerated((EObject) _target);
        }
        return null;
    }

    /**
     * Returns an aggregated value for the specified feature. This will include
     * all elements defined in the source plus any elements additionally defined
     * in the generated file. In the case where <code>!feature.isMany()</code>,
     * the generated value is only returned if the source value is not set.
     * 
     * @param feature the feature.
     * @return the aggregate value.
     */
    @SuppressWarnings("unchecked")
    protected Object getAggregatedValue(EStructuralFeature feature) {
        final EObject source = getSource();
        final EObject generated = getGenerated();
        if (source == null) {
            if (generated == null) {
                return null;
            }
            return generated.eGet(feature);
        }
        final Object value = source.eGet(feature);
        final DiffModel diffModel = _factory == null ? null : _factory.getDifferences(source);
        if (diffModel == null) {
            return value;
        }
        if (feature.isMany()) {
            List<Object> added = (List<Object>) _factory.getCachedFeatureDifferences(this, feature);
            if (added == null) {
                added = new ArrayList<Object>();
                if (_factory.isCopiedSource(source, generated)) {
                    final Collection<?> sourceValues = (Collection<?>) value;
                    final Collection<?> generatedValues = (Collection<?>) generated.eGet(feature);
                    for (Object obj : generatedValues) {
                        if (obj instanceof EObject) {
                            /*
                             * only add the unique values, in case some of the
                             * children were copied into the source too.
                             */
                            if (_factory.getSource((EObject) obj) == obj) {
                                added.add(obj);
                            }
                        } else {
                            // XXX: not sure if this is good enough
                            // assume the list does not contain EObjects
                            added.addAll(generatedValues);
                            added.removeAll(sourceValues);
                            break;
                        }
                    }
                } else {
                    for (DiffElement difference : _factory.getDifferencesFor(source)) {
                        /*
                         * Because of the way we compare, generated content is
                         * marked as "deleted" from the source, i.e. the source
                         * file is missing the generated content.
                         */
                        if (difference.getKind() == DifferenceKind.DELETION) {
                            Object addedElement = getRightTarget(feature, difference);
                            if (addedElement != null) {
                                added.add(addedElement);
                            }
                        }
                    }
                }
                _factory.cacheFeatureDifferences(this, feature, added);
            }
            final List<Object> aggregate = new ArrayList<Object>();
            if (value instanceof Collection) {
                aggregate.addAll((Collection<?>) value);
            }
            aggregate.addAll(added);
            return aggregate;
        } else if (!source.eIsSet(feature)) {
            Object added = _factory.getCachedFeatureDifferences(this, feature);
            if (added == null) {
                for (DiffElement difference : _factory.getDifferencesFor(source)) {
                    /*
                     * Because of the way we compare, generated content is
                     * marked as "deleted" from the source, i.e. the source file
                     * is missing the generated content.
                     */
                    if (difference.getKind() == DifferenceKind.DELETION) {
                        added = getRightTarget(feature, difference);
                        if (added != null) {
                            _factory.cacheFeatureDifferences(this, feature, added);
                            return added;
                        }
                    }
                }
                added = NULL_VALUE;
                _factory.cacheFeatureDifferences(this, feature, added);
            }
            if (added != NULL_VALUE) {
                return added;
            }
        }
        // this will be either the set value or the default value.
        return value;
    }

    private Object getRightTarget(final EStructuralFeature feature, final DiffElement difference) {
        return new DiffSwitch<Object>() {
            @Override
            public Object caseAttributeChangeRightTarget(AttributeChangeRightTarget object) {
                if (feature.equals(ExtendedMetaData.INSTANCE.getAffiliation(object.getLeftElement().eClass(),
                        object.getAttribute()))) {
                    return object.getRightTarget();
                }
                return null;
            }

            @Override
            public Object caseModelElementChangeRightTarget(ModelElementChangeRightTarget object) {
                final EObject rightTarget = object.getRightElement();
                if (feature.equals(ExtendedMetaData.INSTANCE.getAffiliation(object.getLeftParent().eClass(),
                        rightTarget.eContainmentFeature()))) {
                    return rightTarget;
                }
                return null;
            }

            @Override
            public Object caseReferenceChangeRightTarget(ReferenceChangeRightTarget object) {
                if (feature.equals(ExtendedMetaData.INSTANCE.getAffiliation(object.getLeftElement().eClass(),
                        object.getReference()))) {
                    return object.getRightTarget();
                }
                return null;
            }

            @Override
            public Object defaultCase(EObject object) {
                return null;
            }
        }.doSwitch(difference);
    }

}
