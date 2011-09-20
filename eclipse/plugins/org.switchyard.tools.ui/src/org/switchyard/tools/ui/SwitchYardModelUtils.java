/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
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
