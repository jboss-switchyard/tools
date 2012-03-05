/*************************************************************************************
 * Copyright (c) 2011 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui;

import org.switchyard.config.model.switchyard.SwitchYardModel;
import org.switchyard.config.model.switchyard.v1.V1SwitchYardModel;

/**
 * SwitchYardModelUtils
 * 
 * Utility methods for working with SwitchYard models.
 * 
 * @author Rob Cernich
 */
public final class SwitchYardModelUtils {

    /**
     * Creates a new SwitchYardModel.
     * 
     * @param name the name of the application.
     * @param targetNamespace the application's targetNamespace.
     * @return a new SwitchYardModel.
     */
    public static SwitchYardModel createSwitchYardModel(String name, String targetNamespace) {
        SwitchYardModel switchYardModel = new V1SwitchYardModel();
        switchYardModel.setName(name);
        // switchYardModel.setTargetNamespace(_targetNamespace);
        switchYardModel.getModelConfiguration().setAttribute("targetNamespace", targetNamespace);
        return switchYardModel;
    }

    /**
     * Creates a targetNamespace in the form: urn:&lt;groupId&gt;:&lt;artifactId&gt;:&lt;version&gt;.
     * 
     * @param groupId the groupId.
     * @param artifactId the artifactId.
     * @param version the version.
     * @return the targetNamespace.
     */
    public static String createTargetnamespace(String groupId, String artifactId, String version) {
        return "urn:" + groupId + ":" + artifactId + ":" + version;
    }

    private SwitchYardModelUtils() {
    }

}
