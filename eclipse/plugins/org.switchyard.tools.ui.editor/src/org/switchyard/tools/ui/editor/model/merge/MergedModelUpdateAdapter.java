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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * MergedModelUpdateAdapter
 * 
 * <p/>
 * Keeps the generated model synchronized with changes to the source.
 */
public class MergedModelUpdateAdapter extends EContentAdapter implements Adapter {

    private MergedModelAdapterFactory _factory;

    /**
     * Create a new MergedModelUpdateAdapter.
     * 
     * @param factory the factory that manages the differences.
     */
    protected MergedModelUpdateAdapter(MergedModelAdapterFactory factory) {
        _factory = factory;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void notifyChanged(Notification notification) {
        if (notification.isTouch() || !(notification.getNotifier() instanceof EObject)) {
            return;
        }
        final EObject generated = getGenerated((EObject) notification.getNotifier());
        if (generated == null) {
            return;
        }
        final boolean oldDeliver = generated.eDeliver();
        generated.eSetDeliver(false);
        try {
            // make sure the generated model is kept up-to-date
            final EStructuralFeature feature = ExtendedMetaData.INSTANCE.getAffiliation(generated.eClass(),
                    (EStructuralFeature) notification.getFeature());
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
            super.notifyChanged(notification);
        }
    }

    @Override
    public boolean isAdapterForType(Object type) {
        return type instanceof Class && ((Class<?>) type).isAssignableFrom(getClass());
    }

    private EObject getGenerated(EObject changed) {
        if (changed instanceof EObject) {
            return _factory.getGenerated((EObject) changed);
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
