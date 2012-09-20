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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.diff.metamodel.AttributeChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.DifferenceKind;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChangeRightTarget;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.util.FeatureMap;
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

    @SuppressWarnings("unchecked")
    @Override
    public void notifyChanged(Notification notification) {
        if (notification.isTouch()) {
            return;
        }
        final EObject generated = getGenerated();
        if (generated == null) {
            return;
        }
        final boolean oldDeliver = generated.eDeliver();
        generated.eSetDeliver(false);
        try {
            // make sure the generated model is kept up-to-date
            final EStructuralFeature feature = (EStructuralFeature) notification.getFeature();
            if (FeatureMap.Entry.class.isAssignableFrom(feature.getEType().getInstanceClass())) {
                /*
                 * don't process notifications on feature maps (i.e. the groups
                 * that actually hold the contained objects).
                 */
                return;
            } else if (notification.isReset()) {
                generated.eUnset(feature);
            } else {
                if (feature.isMany()) {
                    final Object newValue = notification.getNewValue();
                    switch (notification.getEventType()) {
                    case Notification.ADD:
                        if (feature instanceof EReference
                                && (((EReference) feature).isContainment() || ((EReference) feature).isContainer())) {
                            ((EList<Object>) generated.eGet(feature)).add(notification.getPosition(), copy(newValue));
                        } else {
                            ((EList<Object>) generated.eGet(feature)).add(notification.getPosition(),
                                    getGeneratedReference(newValue));
                        }
                        break;
                    case Notification.ADD_MANY:
                        if (feature instanceof EReference
                                && (((EReference) feature).isContainment() || ((EReference) feature).isContainer())) {
                            ((EList<Object>) generated.eGet(feature)).addAll(notification.getPosition(),
                                    (Collection<?>) copy(newValue));
                        } else {
                            ((EList<Object>) generated.eGet(feature)).addAll(notification.getPosition(),
                                    (Collection<?>) getGeneratedReference(newValue));
                        }
                        break;
                    case Notification.REMOVE:
                        do {
                            ((EList<Object>) generated.eGet(feature)).remove(notification.getPosition());
                            if (feature instanceof EReference
                                    && (((EReference) feature).isContainment() || ((EReference) feature).isContainer())) {
                                _factory.removeMatchFromSource(notification.getOldValue());
                            }
                        } while (false);
                        break;
                    case Notification.REMOVE_MANY:
                        for (int index = ((int[]) newValue).length - 1; index >= 0; --index) {
                            ((EList<Object>) generated.eGet(feature)).remove(((int[]) newValue)[index]);
                        }
                        if (feature instanceof EReference
                                && (((EReference) feature).isContainment() || ((EReference) feature).isContainer())) {
                            for (Object removed : (Collection<Object>) notification.getOldValue()) {
                                if (removed instanceof EObject) {
                                    _factory.removeMatchFromSource(removed);
                                }
                            }
                        }
                        break;
                    case Notification.MOVE:
                        ((EList<Object>) generated.eGet(feature)).move(notification.getPosition(),
                                notification.getOldIntValue());
                        break;
                    }
                } else {
                    if (feature instanceof EReference
                            && (((EReference) feature).isContainment() || ((EReference) feature).isContainer())) {
                        generated.eSet(feature, copy(notification.getNewValue()));
                    } else {
                        generated.eSet(feature, getGeneratedReference(notification.getNewValue()));
                    }
                }
            }
        } finally {
            generated.eSetDeliver(oldDeliver);
        }
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
    protected Object getAggregatedValue(EStructuralFeature feature) {
        final EObject source = getSource();
        if (source == null) {
            final EObject generated = getGenerated();
            if (generated == null) {
                return null;
            }
            return generated.eGet(feature);
        }
        final Object value = source.eGet(feature);
        final DiffModel differences = _factory == null ? null : _factory.getDifferences(source);
        if (differences == null) {
            return value;
        }
        if (feature.isMany()) {
            @SuppressWarnings("unchecked")
            List<Object> added = (List<Object>) _factory.getCachedFeatureDifferences(this, feature);
            if (added == null) {
                added = new ArrayList<Object>();
                for (DiffElement difference : differences.getDifferences(source)) {
                    /*
                     * Because of the way we compare, generated content is
                     * marked as "deleted" from the source, i.e. the source file
                     * is missing the generated content.
                     */
                    if (difference.getKind() == DifferenceKind.DELETION) {
                        Object addedElement = getRightTarget(feature, difference);
                        if (addedElement != null) {
                            added.add(addedElement);
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
                for (DiffElement difference : differences.getDifferences(source)) {
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

    private Object getRightTarget(EStructuralFeature feature, DiffElement difference) {
        if (difference instanceof ModelElementChangeRightTarget) {
            EObject rightTarget = ((ModelElementChangeRightTarget) difference).getRightElement();
            if (feature.equals(rightTarget.eContainmentFeature())) {
                return rightTarget;
            }
        } else if (difference instanceof ReferenceChangeRightTarget) {
            ReferenceChangeRightTarget change = (ReferenceChangeRightTarget) difference;
            if (feature.equals(change.getReference())) {
                return change.getRightTarget();
            }
        } else if (difference instanceof AttributeChangeRightTarget) {
            AttributeChangeRightTarget change = (AttributeChangeRightTarget) difference;
            if (feature.equals(change.getAttribute())) {
                return change.getRightTarget();
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private Object copy(Object object) {
        if (object instanceof EObject) {
            Copier copier = new NoReferenceCopier();
            EObject copy = copier.copy((EObject) object);
            copier.copyReferences();
            return copy;
        } else if (object instanceof List) {
            List<?> list = (List<?>) object;
            if (list.size() > 0) {
                if (list.get(0) instanceof EObject) {
                    return new NoReferenceCopier().copyAll((List<? extends EObject>) list);
                }
            }
        }
        /*
         * just return the object. theoretically, this shouldn't cause any
         * problems. these should be primitive types or collections of primitive
         * types.
         */
        return object;
    }

    @SuppressWarnings({"unchecked", "rawtypes" })
    private Object getGeneratedReference(Object object) {
        if (object instanceof EObject) {
            EObject generated = _factory.getGenerated((EObject) object);
            if (generated == null) {
                // XXX: this should never be null
                generated = (EObject) copy(object);
                if (generated != null) {
                    EObject source = (EObject) object;
                    EObject generatedContainer = _factory.getGenerated(source.eContainer());
                    if (generatedContainer != null) {
                        EStructuralFeature containingFeature = source.eContainingFeature();
                        ((List) generatedContainer.eGet(containingFeature)).add(
                                ((List) source.eContainer().eGet(containingFeature)).indexOf(source), generated);
                    }
                    _factory.setMatchedFromSource((EObject) object, generated);
                }
            }
            return generated;
        } else if (object instanceof List) {
            List<?> list = (List<?>) object;
            if (list.size() > 0) {
                if (list.get(0) instanceof EObject) {
                    List<EObject> generatedList = new ArrayList<EObject>(list.size());
                    for (EObject source : (List<EObject>) list) {
                        EObject generated = (EObject) getGeneratedReference(source);
                        if (generated != null) {
                            // XXX: this should never be null
                            generatedList.add(generated);
                        }
                    }
                    return generatedList;
                }
            }
        }
        /*
         * just return the object. theoretically, this shouldn't cause any
         * problems. these should be primitive types or collections of primitive
         * types.
         */
        return object;
    }

    private final class NoReferenceCopier extends Copier {
        private static final long serialVersionUID = 1L;

        public NoReferenceCopier() {
            super(true, false);
        }

        @Override
        public EObject get(Object key) {
            EObject copy = super.get(key);
            if (copy == null) {
                copy = _factory.getGenerated((EObject) key);
                if (copy == null) {
                    copy = (EObject) key;
                }
                put((EObject) key, copy);
            }
            return copy;
        }

        @Override
        protected EObject createCopy(EObject eObject) {
            final EObject copy = super.createCopy(eObject);
            // make sure the copy is matched up
            _factory.setMatchedFromSource(eObject, copy);
            return copy;
        }
    }
}
