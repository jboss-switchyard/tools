/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.cdi;

import org.eclipse.jdt.core.IType;
import org.jboss.tools.cdi.core.IInjectionPoint;
import org.jboss.tools.cdi.core.extension.ICDIExtension;
import org.jboss.tools.cdi.core.extension.feature.IInjectionPointValidatorFeature;

/**
 * SwitchYardCDIExtension
 * <p/>
 * 
 * Provides integration with JBoss CDI tooling.
 */
public class SwitchYardCDIExtension implements ICDIExtension, IInjectionPointValidatorFeature {

    /** The fully qualified type name for SwitchYard's @Reference annotation. */
    public static final String SWITCHYARD_REFERENCE_ANNOTATION = "org.switchyard.component.bean.Reference"; //$NON-NLS-1$
    /** The fully qualified type name for SwitchYard's @Property annotation. */
    public static final String SWITCHYARD_PROPERTY_ANNOTATION = "org.switchyard.component.bean.Property"; //$NON-NLS-1$
    /** The fully qualified type name for SwitchYard's exchange Context. */
    public static final String SWITCHYARD_CONTEXT_TYPE = "org.switchyard.Context"; //$NON-NLS-1$
    /** The fully qualified type name for SwitchYard's exchange Message. */
    public static final String SWITCHYARD_MESSAGE_TYPE = "org.switchyard.Message"; //$NON-NLS-1$
    /** The fully qualified type name for SwitchYard's BeanBag. */
    public static final String SWITCHYARD_BEANBAG_TYPE = "org.switchyard.component.bean.BeanBag"; //$NON-NLS-1$

    /**
     * Create a new SwitchYardCDIExtension.
     */
    public SwitchYardCDIExtension() {
    }

    @Override
    public boolean shouldIgnoreInjection(IType typeOfInjectionPoint, IInjectionPoint injection) {
        final String typeName = typeOfInjectionPoint == null ? null : typeOfInjectionPoint.getFullyQualifiedName('.');
        return injection.isAnnotationPresent(SWITCHYARD_REFERENCE_ANNOTATION)
                || injection.isAnnotationPresent(SWITCHYARD_PROPERTY_ANNOTATION)
                || SWITCHYARD_CONTEXT_TYPE.equals(typeName) || SWITCHYARD_MESSAGE_TYPE.equals(typeName)
                || SWITCHYARD_BEANBAG_TYPE.equals(typeName);
    }

}
