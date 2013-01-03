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
     * @return the category of the component
     */
    public Category getCategory();

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

    /**
     * Represents a component category.
     */
    public enum Category {
        /** Unknown category. */
        UNKNOWN,
        /** Implementation components (e.g. bean, bpm, etc.). */
        IMPLEMENTATION,
        /** Gateway components (e.g. SOAP, JMS, etc.). */
        GATEWAY,
        /** Test components (e.g. HTTP mixin, CDI mixin, etc.). */
        TEST
    };
}
