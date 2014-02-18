/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.databinding;

import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFObservable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * We provide a more usable error message should conversion fail.
 */
public class EMFUpdateValueStrategyConversionErrorMessage extends EMFUpdateValueStrategy {
    private final String _message;
    private final EditingDomain _domain;
    private final IObservableValue _root;
    private final FeaturePath _features;
    private final boolean _deleteEmptyContainers;

    /**
     * Create a new EMFUpdateValueStrategyConversionErrorMessage.
     * 
     * @param message message to display for conversion errors
     * @param updatePolicy update policy
     * @param domain the editing domain
     * @param root the root object
     * @param features the feature path
     * @param deleteEmptyContainers true if empty containers in the feature path
     *            should be deleted (all but root)
     */
    public EMFUpdateValueStrategyConversionErrorMessage(final String message, int updatePolicy, EditingDomain domain,
            IObservableValue root, FeaturePath features, boolean deleteEmptyContainers) {
        super(updatePolicy);
        _message = message;
        _domain = domain;
        _root = root;
        _features = features;
        _deleteEmptyContainers = deleteEmptyContainers;
    }

    /**
     * Create a new EMFUpdateValueStrategyConversionErrorMessage.
     * 
     * @param message message to display for conversion errors
     * @param updatePolicy update policy
     */
    public EMFUpdateValueStrategyConversionErrorMessage(final String message, int updatePolicy) {
        super(updatePolicy);
        _message = message;
        _domain = null;
        _root = null;
        _features = null;
        _deleteEmptyContainers = false;
    }

    /**
     * Create a new EMFUpdateValueStrategyNullForEmptyString.
     * 
     * @param message message to display for conversion errors
     */
    public EMFUpdateValueStrategyConversionErrorMessage(final String message) {
        _message = message;
        _domain = null;
        _root = null;
        _features = null;
        _deleteEmptyContainers = false;
    }

    /**
     * Create a new EMFUpdateValueStrategyNullForEmptyString.
     */
    public EMFUpdateValueStrategyConversionErrorMessage() {
        this(null);
    }

    @Override
    protected IStatus doSet(final IObservableValue observableValue, final Object value) {
        if (_features != null) {
            try {
                final Object origValue = observableValue.getValue();
                final EStructuralFeature[] features = _features.getFeaturePath();
                final EObject root = _root == null ? null : (EObject) _root.getValue();
                if (_domain != null) {
                    _domain.getCommandStack().execute(
                            new AbstractCommand("Update "
                                    + ((IEMFObservable) observableValue).getStructuralFeature().getName()) {
                                @Override
                                protected boolean prepare() {
                                    return true;
                                }

                                @Override
                                public void execute() {
                                    internalDoSet(root, features, value);
                                }

                                @Override
                                public void redo() {
                                    execute();
                                }

                                @Override
                                public void undo() {
                                    internalDoSet(root, features, origValue);
                                }
                            });
                } else {
                    internalDoSet(root, features, value);
                }
            } catch (Exception e) {
                return ValidationStatus.error("Error setting value", e);

            }
            return Status.OK_STATUS;
        }
        return super.doSet(observableValue, value);
    }

    private IStatus internalDoSet(EObject root, EStructuralFeature[] features, Object value) {
        EObject container = populateFeaturePath(root, features);
        if (container != null) {
            container.eSet(features[features.length-1], value);
        }
        pruneEmptyFeaturePath(root, features);
        return Status.OK_STATUS;
    }

    private EObject populateFeaturePath(EObject root, EStructuralFeature[] features) {
        EObject container = root;
        if (features != null) {
            for (int i = 0, count = features.length - 1; i < count; ++i) {
                final EStructuralFeature feature = features[i];
                EObject childContainer = (EObject) container.eGet(feature);
                if (childContainer == null) {
                    final EClass type = (EClass) feature.getEType();
                    childContainer = type.getEPackage().getEFactoryInstance().create(type);
                    container.eSet(feature, childContainer);
                }
                container = childContainer;
            }
        }
        return container;
    }

    private IStatus pruneEmptyFeaturePath(EObject root, EStructuralFeature[] features) {
        if (_deleteEmptyContainers) {
            removeEmptyFeatures(features, 0, root);
        }
        return Status.OK_STATUS;
    }

    private void removeEmptyFeatures(EStructuralFeature[] features, int index, EObject container) {
        if (container == null || index >= features.length - 1) {
            return;
        }
        EObject childContainer = (EObject) container.eGet(features[index]);
        removeEmptyFeatures(features, index + 1, childContainer);
        if (ObservablesUtil.isEmpty(childContainer)) {
            container.eSet(features[index], null);
        }
    }

    @Override
    protected IConverter createConverter(Object fromType, Object toType) {
        return new ConverterWithErrorMessage(super.createConverter(fromType, toType));
    }

    private final class ConverterWithErrorMessage implements IConverter {
        private final IConverter _delegate;

        private ConverterWithErrorMessage(final IConverter delegate) {
            _delegate = delegate;
        }

        @Override
        public Object convert(Object fromObject) {
            try {
                return _delegate.convert(fromObject);
            } catch (RuntimeException e) {
                if (_message != null) {
                    throw new RuntimeException(_message, e);
                }
                throw e;
            }
        }

        @Override
        public Object getFromType() {
            return _delegate.getFromType();
        }

        @Override
        public Object getToType() {
            return _delegate.getToType();
        }
    }
}
