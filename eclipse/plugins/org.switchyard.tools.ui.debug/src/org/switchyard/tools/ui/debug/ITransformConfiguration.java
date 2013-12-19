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
package org.switchyard.tools.ui.debug;

import java.util.Map;
import java.util.Set;

import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;

/**
 * ITransformConfiguration
 * <p/>
 * Configuration for transform breakpoints.
 */
public interface ITransformConfiguration {

    /**
     * @return the from/to transforms triggering the associated breakpoint.
     */
    Set<TransformType> getTransforms();

    /**
     * @return an attributes map corresponding to this configurations settings.
     */
    public Map<String, Object> toAttributesMap();
}
