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
package org.switchyard.tools.ui.common;

/**
 * ISwitchYardTestMixInExtension
 * 
 * <p/>
 * Provides access MixIn extensions details required to configure SwitchYard
 * unit tests.
 */
public interface ISwitchYardTestMixInExtension {

    /**
     * @return display name for this mix-in.
     */
    public String getName();
    
    /**
     * @return description for this mix-in.
     */
    public String getDescription();
    
    /**
     * @return fully qualified MixIn class name that should be added to the list
     *         of mix-ins configured on the test class through
     * @SwitchYardTestCaseConfig.
     */
    public String getMixInClass();

    /**
     * Returns component ID required to use this MixIn within a project. The ID
     * returned will be used to resolve a component extension, adding the listed
     * dependencies to the project's pom.
     * 
     * @return a SwitchYard component extension ID that is required to use this
     *         mix-in within a project.
     * @See {@link org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager#getComponentExtension(String)}
     */
    public ISwitchYardComponentExtension getRequiredComponent();
}
