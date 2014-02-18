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

import java.util.ArrayList;

import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * The default version doesn't support empty strings, so we convert those to
 * null. We also provide a more usable error message should conversion fail.
 */
public class EMFUpdateValueStrategyNullForEmptyString extends EMFUpdateValueStrategyConversionErrorMessage {

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
    public EMFUpdateValueStrategyNullForEmptyString(String message, int updatePolicy, EditingDomain domain,
            IObservableValue root, FeaturePath features, boolean deleteEmptyContainers) {
        super(message, updatePolicy, domain, root, features, deleteEmptyContainers);
    }

    /**
     * Create a new EMFUpdateValueStrategyNullForEmptyString.
     * 
     * @param message message to display for conversion errors
     * @param updatePolicy update policy
     */
    public EMFUpdateValueStrategyNullForEmptyString(final String message, int updatePolicy) {
        super(message, updatePolicy);
    }

    /**
     * Create a new EMFUpdateValueStrategyNullForEmptyString.
     * 
     * @param message message to display for conversion errors
     */
    public EMFUpdateValueStrategyNullForEmptyString(final String message) {
        super(message);
    }

    /**
     * Create a new EMFUpdateValueStrategyNullForEmptyString.
     */
    public EMFUpdateValueStrategyNullForEmptyString() {
        this(null);
    }

    @Override
    protected IConverter createConverter(Object fromType, Object toType) {
        return fromType == String.class ? new NullOkConverterWithErrorMessage(super.createConverter(fromType, toType))
                : super.createConverter(fromType, toType);
    }

    private final class NullOkConverterWithErrorMessage implements IConverter {
        private final IConverter _delegate;

        private NullOkConverterWithErrorMessage(final IConverter delegate) {
            _delegate = delegate;
        }

        @Override
        public Object convert(Object fromObject) {
            if (fromObject == null || ((String) fromObject).trim().isEmpty()) {
                if (getToType() instanceof EAttribute && ((EAttribute) getToType()).isMany()) {
                    return new ArrayList<Object>();
                }
                return null;
            }
            return _delegate.convert(fromObject);
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
