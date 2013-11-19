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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.ComparePackage;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.merge.BatchMerger;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.compare.util.CompareSwitch;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
import org.switchyard.tools.ui.SwitchYardModelUtils;

import com.google.common.base.Predicate;

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
    private Comparison _comparison;
    private Map<AbstractMergedModelAdapter, Map<EStructuralFeature, Object>> _cache = new HashMap<AbstractMergedModelAdapter, Map<EStructuralFeature, Object>>();
    private MergedModelUpdateAdapter _mergedModelUpdater;

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
        _mergedModelUpdater = new MergedModelUpdateAdapter(this);
        if (_switchYard != null) {
            _mergedModelUpdater.setTarget(source);
        }
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
        final ResourceSet rs = SwitchYardModelUtils.newResourceSet();
        
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
            final Comparison comparison = createComparison(generatedResource, _generated);
            final List<Diff> generatedDifferences = comparison.getDifferences();
            if (generatedDifferences.size() > 0) {
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
                    if (_generated.getContents().size() == 0) {
                        if (generatedResource.getContents().size() > 0) {
                            _generated.getContents().addAll(generatedResource.getContents());
                            generatedResource.getContents().clear();
                        }
                    } else {
                        new BatchMerger(EMFCompareRCPPlugin.getDefault().getMergerRegistry(), new Predicate<Diff>() {
                            public boolean apply(Diff object) {
                                return object.getKind() != DifferenceKind.MOVE;
                            }
                        }).copyAllLeftToRight(generatedDifferences, BasicMonitor.toMonitor(new NullProgressMonitor()));
                        pruneMissingReferences();
                    }
                } finally {
                    if (transaction != null) {
                        transaction.resume(null);
                    }
                }
                calculateDifferences();
                final DiagramAffectedDiffSwitch affectedSwitch = new DiagramAffectedDiffSwitch();
                for (Diff element : generatedDifferences) {
                    final Boolean affected = affectedSwitch.doSwitch(element);
                    if (affected != null && affected) {
                        // we only care about ordering. other changes should
                        // be picked up by an update feature.
                        return true;
                    }
                }
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
    protected Comparison getDifferences(EObject target) {
        if (target == null || target.eResource() != _source) {
            return null;
        }
        return _comparison;
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
            if (setting.getEStructuralFeature() == ComparePackage.eINSTANCE.getMatch_Left()) {
                return ((Match) setting.getEObject()).getRight();
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
            if (setting.getEStructuralFeature() == ComparePackage.eINSTANCE.getMatch_Right()) {
                return ((Match) setting.getEObject()).getLeft();
            }
        }
        // this must be the source object
        return generated;
    }

    protected void setMatchedFromSource(EObject source, EObject generated) {
        if (_crossReferencedMatches == null) {
            return;
        }
        Match match = getMatch(source, true);
        if (match == null) {
            return;
        }
        // pair them up
        match.setRight(generated);

        // update the cross reference
        _crossReferencedMatches.getCollection(generated).add(
                ((InternalEObject) match).eSetting(ComparePackage.eINSTANCE.getMatch_Right()));
    }

    @SuppressWarnings("rawtypes")
    protected void removeMatchFromSource(Object source) {
        if (!(source instanceof EObject)) {
            return;
        }
        Match match = getMatch((EObject) source, true);
        ((Collection) match.eContainer().eGet(match.eContainingFeature())).remove(match);
        _crossReferencedMatches.remove((EObject) source);
        if (match.getRight() != null) {
            _crossReferencedMatches.remove(match.getRight());
        }
    }

    private Match getMatch(EObject object, boolean isLeft) {
        if (object == null) {
            return null;
        }
        Collection<EStructuralFeature.Setting> settings = _crossReferencedMatches.getCollection(object);
        if (settings.isEmpty()) {
            Match parentMatch = getMatch(object.eContainer(), isLeft);
            if (parentMatch == null) {
                return null;
            }
            Match newMatch = CompareFactory.eINSTANCE.createMatch();
            if (isLeft) {
                newMatch.setLeft(object);
                // update the cross reference
                settings.add(((InternalEObject) newMatch).eSetting(ComparePackage.eINSTANCE.getMatch_Left()));
            } else {
                newMatch.setRight(object);
                // update the cross reference
                settings.add(((InternalEObject) newMatch).eSetting(ComparePackage.eINSTANCE.getMatch_Right()));
            }
            parentMatch.getSubmatches().add(newMatch);
            return newMatch;
        }
        for (final EStructuralFeature.Setting setting : settings) {
            return (Match) setting.getEObject();
        }
        // no matches???
        return null;
    }

    /**
     * Calculate differences between the source and generated files.
     */
    public void calculateDifferences() {
        if (_generated == null) {
            _comparison = null;
            _crossReferencedMatches = null;
            return;
        }
        _comparison = createComparison(_source, _generated);
        _crossReferencedMatches = new MatchCrossReferencer(_comparison.getMatches());
        // clear the cache
        _cache.clear();
    }

    private Comparison createComparison(Notifier source, Notifier generated) {
        return EMFCompare.builder()
                .setMatchEngineFactoryRegistry(EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry())
                .setDiffEngine(new SwitchYardDiffEngine(new DiffBuilder())).build()
                .compare(EMFCompare.createDefaultScope(source, generated));
    }

    protected boolean isCopiedSource(EObject source, EObject generated) {
        if (source == generated) {
            return true;
        }
        if (getDifferencesFor(source).size() > 0 || generated == null) {
            return false;
        }
        final EObject sourceParent = getSource(generated.eContainer());
        for (Diff diff : getDifferencesFor(generated)) {
            if (new CompareSwitch<Boolean>() {
                @Override
                public Boolean caseAttributeChange(AttributeChange object) {
                    return object.getMatch().getLeft() == sourceParent;
                }

                @Override
                public Boolean caseReferenceChange(ReferenceChange object) {
                    return object.getMatch().getLeft() == sourceParent;
                }

                @Override
                public Boolean defaultCase(EObject object) {
                    return false;
                }
            }.doSwitch(diff)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Work around bug in DiffModel that doesn't account for the object (i.e it
     * gives us all the diff's).
     * 
     * Also account for whether the object is source or generated (i.e. left or
     * right).
     * 
     * @param object the object for which we are collecting differences.
     * 
     * @return the differences for the object.
     */
    protected List<Diff> getDifferencesFor(EObject object) {
        if (_comparison == null) {
            return Collections.emptyList();
        }
        final List<Diff> objectDifferences = new ArrayList<Diff>();
        for (Diff diff : _comparison.getDifferences()) {
            if (isPertinentDiff(diff, object)) {
                objectDifferences.add(diff);
            }
        }

        return objectDifferences;
    }

    private boolean isPertinentDiff(final Diff diff, final EObject modelElement) {
        return new CompareSwitch<Boolean>() {
            @Override
            public Boolean caseAttributeChange(AttributeChange object) {
                return object.getMatch().getLeft() == modelElement || object.getMatch().getRight() == modelElement;
            }

            @Override
            public Boolean caseReferenceChange(ReferenceChange object) {
                return object.getMatch().getLeft() == modelElement || object.getMatch().getRight() == modelElement;
            }

            @Override
            public Boolean defaultCase(EObject object) {
                return false;
            }
        }.doSwitch(diff);
    }

    private static final class MatchCrossReferencer extends CrossReferencer {
        /** The serialVersionUID */
        private static final long serialVersionUID = 1L;

        private MatchCrossReferencer(Collection<?> emfObjects) {
            super(emfObjects);
            crossReference();
        }

        @Override
        protected boolean crossReference(EObject eObject, EReference eReference, EObject crossReferencedEObject) {
            return eReference == ComparePackage.eINSTANCE.getMatch_Left()
                    || eReference == ComparePackage.eINSTANCE.getMatch_Right();
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

    private static final class DiagramAffectedDiffSwitch extends CompareSwitch<Boolean> {

        @Override
        public Boolean caseDiff(Diff object) {
            if (object.getKind() != DifferenceKind.MOVE) {
                return false;
            }
            final EObject leftTarget = object.getMatch().getLeft();
            final EObject rightTarget = object.getMatch().getRight();
            return leftTarget instanceof Component || leftTarget instanceof Contract
                    || rightTarget instanceof Component || rightTarget instanceof Contract;
        }

    }
}
