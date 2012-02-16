/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2012 Red Hat Inc. and/or its affiliates and other contributors
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
package org.switchyard.tools.ui.common;

import java.util.List;

import org.apache.maven.model.Dependency;

/**
 * ISwitchYardComponentExtension
 * 
 * <p/>
 * Represents an instance of an org.switchyard.tools.ui.switchYardComponent
 * extension.
 * 
 * @author Rob Cernich
 */
public interface ISwitchYardComponentExtension {

    /**
     * @return the ID of this component.
     */
    public String getId();

    /**
     * @return the display name for this component.
     */
    public String getName();

    /**
     * @return the description of this component.
     */
    public String getDescription();

    /**
     * @return the name of a scanner class associated with this component, if
     *         any.
     */
    public String getScannerClassName();

    /**
     * @return the Maven dependencies required by this component.
     */
    public List<Dependency> getDependencies();
}
