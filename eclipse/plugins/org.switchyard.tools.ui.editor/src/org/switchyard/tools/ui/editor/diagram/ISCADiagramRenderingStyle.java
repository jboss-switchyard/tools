/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram;

import org.eclipse.graphiti.util.IPredefinedRenderingStyle;

/**
 * @author bfitzpat
 *
 */
public interface ISCADiagramRenderingStyle extends IPredefinedRenderingStyle {

    /**
     * Composite gradient ID.
     */
    public static final String COMPOSITE_ID = "sca-composite";
    /**
     * Component gradient ID.
     */
    public static final String COMPONENT_ID = "sca-component";
    /**
     * Service gradient ID.
     */
    public static final String SERVICE_ID = "sca-service";
    /**
     * Reference gradient ID.
     */
    public static final String REFERENCE_ID = "sca-reference";

}
