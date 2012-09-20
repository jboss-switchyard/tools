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

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.merge.service.MergeService;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.ReferenceOrderChange;
import org.eclipse.emf.compare.diff.metamodel.UpdateModelElement;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.Match2Elements;
import org.eclipse.emf.compare.match.metamodel.MatchFactory;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.metamodel.MatchPackage;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer;
import org.eclipse.emf.ecore.util.EcoreUtil.UnresolvedProxyCrossReferencer;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.impl.InternalTransaction;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.DomainType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl;
import org.switchyard.tools.ui.editor.Activator;

/**
 * MergedModelAdapterFactory
 * 
 * <p/>
 * Represents a SwitchYard model consisting of "source" elements and "generated"
 * elements.
 */
public class MergedModelAdapterFactory extends AdapterFactoryImpl {

    private Resource _source;
    private Resource _generated;
    private SwitchYardType _switchYard;
    private MatchCrossReferencer _crossReferencedMatches;
    private DiffModel _differences;
    private Map<AbstractMergedModelAdapter, Map<EStructuralFeature, Object>> _cache = new HashMap<AbstractMergedModelAdapter, Map<EStructuralFeature, Object>>();

    /**
     * Create a new MergedModelAdapterFactory.
     * 
     * @param source the source SwitchYard resource
     */
    public MergedModelAdapterFactory(SwitchyardResourceImpl source) {
        _source = source;
        _generated = source.getGeneratedResource();
        if (_source.getContents().isEmpty()) {
            _switchYard = null;
        } else {
            EObject content = _source.getContents().get(0);
            if (content instanceof SwitchYardType) {
                _switchYard = (SwitchYardType) content;
            } else if (content instanceof DocumentRoot) {
                _switchYard = ((DocumentRoot) content).getSwitchyard();
            } else {
                _switchYard = null;
            }
        }
        calculateDifferences();
    }

    /**
     * @param generatedFile the generated configuration file.
     * 
     * @return true if the generated file's changes should trigger a diagram
     *         refresh.
     */
    public boolean processUpdatesToGenerated(IFile generatedFile) {
        if (_generated == null || generatedFile == null || !generatedFile.exists()) {
            return false;
        }

        // load the new version of the generated file
        final ResourceSet rs = new ResourceSetImpl();
        final Resource generatedResource = rs.createResource(
                URI.createPlatformResourceURI(generatedFile.getFullPath().toString(), true),
                SwitchyardResourceFactoryImpl.CONTENT_TYPE);
        try {
            try {
                generatedResource.load(null);
            } catch (IOException e) {
                e.fillInStackTrace();
            }

            if (!generatedResource.isLoaded()) {
                return false;
            }

            // calculate differences from the currently loaded generated model
            try {
                final MatchModel match = MatchService.doResourceMatch(generatedResource, _generated,
                        Collections.<String, Object> emptyMap());
                final DiffModel generatedDifferences = DiffService.doDiff(match);
                if (generatedDifferences.getDifferences().size() > 0) {
                    final EList<DiffElement> diffs = generatedDifferences.getDifferences();
                    final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(_switchYard);
                    final InternalTransaction transaction;
                    if (domain instanceof TransactionalEditingDomainImpl) {
                        transaction = ((TransactionalEditingDomainImpl) domain).getActiveTransaction();
                    } else {
                        transaction = null;
                    }
                    if (transaction != null) {
                        transaction.pause();
                    }
                    try {
                        MergeService.merge(diffs, true);
                        pruneMissingReferences();
                    } finally {
                        if (transaction != null) {
                            transaction.resume(null);
                        }
                    }
                    calculateDifferences();
                    for (DiffElement element : diffs) {
                        if (!(element instanceof UpdateModelElement || element instanceof ReferenceOrderChange)) {
                            // if it's just ordering, we don't care
                            return true;
                        }
                    }
                }
            } catch (InterruptedException e) {
                Activator
                        .getDefault()
                        .getLog()
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                                "Error occurred while updating generated content in SwitchYard editor.", e));
            }
        } finally {
            generatedResource.unload();
        }
        return false;
    }

    private void pruneMissingReferences() {
        for (Map.Entry<EObject, Collection<Setting>> entry : new MissingReferencesCrossReferencer(_switchYard)
                .findMissingCrossReferences().entrySet()) {
            final EObject proxySource = entry.getKey();
            for (Setting setting : entry.getValue()) {
                final EStructuralFeature feature = setting.getEStructuralFeature();
                if (feature.isMany()) {
                    @SuppressWarnings("unchecked")
                    final List<EObject> value = (List<EObject>) setting.getEObject().eGet(
                            setting.getEStructuralFeature());
                    value.remove(proxySource);
                } else if (feature.isUnsettable()) {
                    setting.getEObject().eUnset(feature);
                } else {
                    setting.getEObject().eSet(feature, null);
                }
            }
        }
    }

    @Override
    public boolean isFactoryForType(Object type) {
        return type instanceof Class
                && (AbstractMergedModelAdapter.class.isAssignableFrom((Class<?>) type) || type == getClass());
    }

    @Override
    protected Adapter createAdapter(Notifier target) {
        if (target instanceof SwitchYardType) {
            return new SwitchYardMergedModelAdapter(this);
        } else if (target instanceof ArtifactsType) {
            return new ArtifactsMergedModelAdapter(this);
        } else if (target instanceof Composite) {
            return new CompositeMergedModelAdapter(this);
        } else if (target instanceof Component) {
            return new ComponentMergedModelAdapter(this);
        } else if (target instanceof Contract) {
            return new ContractMergedModelAdapter(this);
        } else if (target instanceof DomainType) {
            return new DomainMergedModelAdapter(this);
        } else if (target instanceof TransformsType) {
            return new TransformsMergedModelAdapter(this);
        } else if (target instanceof ValidatesType) {
            return new ValidatesMergedModelAdapter(this);
        }
        return null;
    }

    /**
     * @param target the target object
     * 
     * @return the current differences
     */
    protected DiffModel getDifferences(EObject target) {
        if (target == null || target.eResource() != _source) {
            return null;
        }
        return _differences;
    }

    /**
     * @return the root SwitchYard object from the source model.
     */
    protected SwitchYardType getSwitchYard() {
        return _switchYard;
    }

    protected Object getCachedFeatureDifferences(AbstractMergedModelAdapter mergedModel, EStructuralFeature feature) {
        Map<EStructuralFeature, Object> modelCache = _cache.get(mergedModel);
        if (modelCache == null) {
            return null;
        }
        return modelCache.get(feature);
    }

    protected void cacheFeatureDifferences(AbstractMergedModelAdapter mergedModel, EStructuralFeature feature,
            Object differences) {
        Map<EStructuralFeature, Object> modelCache = _cache.get(mergedModel);
        if (modelCache == null) {
            modelCache = new HashMap<EStructuralFeature, Object>();
            _cache.put(mergedModel, modelCache);
        }
        modelCache.put(feature, differences);
    }

    protected void clearFeatureDifferencesCache(AbstractMergedModelAdapter mergedModel) {
        _cache.remove(mergedModel);
    }

    protected EObject getGenerated(EObject source) {
        if (_crossReferencedMatches == null || source == null) {
            return null;
        }
        final Collection<EStructuralFeature.Setting> settings = _crossReferencedMatches.get(source);
        if (settings == null) {
            return null;
        }
        for (final EStructuralFeature.Setting setting : settings) {
            if (setting.getEStructuralFeature() == MatchPackage.eINSTANCE.getMatch2Elements_LeftElement()) {
                return ((Match2Elements) setting.getEObject()).getRightElement();
            }
        }
        // assume this is the generated object
        return source;
    }

    /**
     * @param generated the model object from the generated resource.
     * @return the corresponding model object from the source resource.
     */
    public EObject getSource(EObject generated) {
        // if there is no generated model, this is the source object
        if (_crossReferencedMatches == null || generated == null) {
            return generated;
        }
        final Collection<EStructuralFeature.Setting> settings = _crossReferencedMatches.get(generated);
        if (settings == null) {
            return generated;
        }
        for (final EStructuralFeature.Setting setting : settings) {
            if (setting.getEStructuralFeature() == MatchPackage.eINSTANCE.getMatch2Elements_RightElement()) {
                return ((Match2Elements) setting.getEObject()).getLeftElement();
            }
        }
        // this must be the source object
        return generated;
    }

    protected void setMatchedFromSource(EObject source, EObject generated) {
        if (_crossReferencedMatches == null) {
            return;
        }
        Match2Elements match = getMatch(source, true);
        if (match == null) {
            return;
        }
        // pair them up
        match.setRightElement(generated);
        match.setSimilarity(1d);

        // update the cross reference
        _crossReferencedMatches.getCollection(generated).add(
                ((InternalEObject) match).eSetting(MatchPackage.eINSTANCE.getMatch2Elements_RightElement()));
    }

    @SuppressWarnings("rawtypes")
    protected void removeMatchFromSource(Object source) {
        if (!(source instanceof EObject)) {
            return;
        }
        Match2Elements match = getMatch((EObject) source, true);
        ((Collection) match.eContainer().eGet(match.eContainingFeature())).remove(match);
        _crossReferencedMatches.remove((EObject) source);
        if (match.getRightElement() != null) {
            _crossReferencedMatches.remove(match.getRightElement());
        }
    }

    private Match2Elements getMatch(EObject object, boolean isLeft) {
        if (object == null) {
            return null;
        }
        Collection<EStructuralFeature.Setting> settings = _crossReferencedMatches.getCollection(object);
        if (settings.isEmpty()) {
            Match2Elements parentMatch = getMatch(object.eContainer(), isLeft);
            if (parentMatch == null) {
                return null;
            }
            Match2Elements newMatch = MatchFactory.eINSTANCE.createMatch2Elements();
            if (isLeft) {
                newMatch.setLeftElement(object);
                // update the cross reference
                settings.add(((InternalEObject) newMatch).eSetting(MatchPackage.eINSTANCE
                        .getMatch2Elements_LeftElement()));
            } else {
                newMatch.setRightElement(object);
                // update the cross reference
                settings.add(((InternalEObject) newMatch).eSetting(MatchPackage.eINSTANCE
                        .getMatch2Elements_RightElement()));
            }
            parentMatch.getSubMatchElements().add(newMatch);
            return newMatch;
        }
        for (final EStructuralFeature.Setting setting : settings) {
            return (Match2Elements) setting.getEObject();
        }
        // no matches???
        return null;
    }

    /**
     * Calculate differences between the source and generated files.
     */
    public void calculateDifferences() {
        if (_generated == null) {
            _differences = null;
            _crossReferencedMatches = null;
            return;
        }
        try {
            MatchModel matches = MatchService.doResourceMatch(_source, _generated,
                    Collections.<String, Object> emptyMap());
            _differences = DiffService.doDiff(matches);
            _crossReferencedMatches = new MatchCrossReferencer(matches);
        } catch (InterruptedException e) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            "Error occurred while calculating generated switchyard.xml content.", e));
        }
        // clear the cache
        _cache.clear();
    }

    private static final class MatchCrossReferencer extends CrossReferencer {
        /** The serialVersionUID */
        private static final long serialVersionUID = 1L;

        private MatchCrossReferencer(EObject eObject) {
            super(eObject);
            crossReference();
        }

        @Override
        protected boolean crossReference(EObject eObject, EReference eReference, EObject crossReferencedEObject) {
            return eReference == MatchPackage.eINSTANCE.getMatch2Elements_LeftElement()
                    || eReference == MatchPackage.eINSTANCE.getMatch2Elements_RightElement();
        }

        @Override
        public Collection<Setting> getCollection(Object key) {
            return super.getCollection(key);
        }
    }

    private static final class MissingReferencesCrossReferencer extends UnresolvedProxyCrossReferencer {
        /** The serialVersionUID */
        private static final long serialVersionUID = 1L;

        private MissingReferencesCrossReferencer(EObject eObject) {
            super(eObject);
            crossReference();
        }

        protected Map<EObject, Collection<Setting>> findMissingCrossReferences() {
            return super.findUnresolvedProxyCrossReferences();
        }

        @Override
        protected boolean crossReference(EObject eObject, EReference eReference, EObject crossReferencedEObject) {
            return crossReferencedEObject.eResource() == null;
        }
    }

}
