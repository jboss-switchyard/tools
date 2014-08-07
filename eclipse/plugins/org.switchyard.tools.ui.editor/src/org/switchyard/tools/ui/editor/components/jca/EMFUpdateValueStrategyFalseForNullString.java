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
package org.switchyard.tools.ui.editor.components.jca;

import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyConversionErrorMessage;

/**
 * The default version doesn't support empty strings, so we convert those to
 * null. We also provide a more usable error message should conversion fail.
 */
public class EMFUpdateValueStrategyFalseForNullString extends EMFUpdateValueStrategyConversionErrorMessage {

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
    public EMFUpdateValueStrategyFalseForNullString(String message, int updatePolicy, EditingDomain domain,
            IObservableValue root, FeaturePath features, boolean deleteEmptyContainers) {
        super(message, updatePolicy, domain, root, features, deleteEmptyContainers);
    }

    /**
     * Create a new EMFUpdateValueStrategyFalseForNullString.
     * 
     * @param message message to display for conversion errors
     * @param updatePolicy update policy
     */
    public EMFUpdateValueStrategyFalseForNullString(final String message, int updatePolicy) {
        super(message, updatePolicy);
    }

    /**
     * Create a new EMFUpdateValueStrategyFalseForNullString.
     * 
     * @param message message to display for conversion errors
     */
    public EMFUpdateValueStrategyFalseForNullString(final String message) {
        super(message);
    }

    /**
     * Create a new EMFUpdateValueStrategyFalseForNullString.
     */
    public EMFUpdateValueStrategyFalseForNullString() {
        this(null);
    }
    @Override
    protected IConverter createConverter(Object fromType, Object toType) {
        return fromType == String.class && toType == boolean.class ? new NullIsFalseConverterWithErrorMessage(super.createConverter(fromType, toType))
                : super.createConverter(fromType, toType);
    }

    private final class NullIsFalseConverterWithErrorMessage implements IConverter {
        private final IConverter _delegate;

        private NullIsFalseConverterWithErrorMessage(final IConverter delegate) {
            _delegate = delegate;
        }

        @Override
        public Object convert(Object fromObject) {
            if (fromObject == null || ((String) fromObject).trim().isEmpty()) {
                String value = (String) (fromObject == null ? null : fromObject.toString());
                Boolean boolValue = Boolean.valueOf(value);
                return boolValue;
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
