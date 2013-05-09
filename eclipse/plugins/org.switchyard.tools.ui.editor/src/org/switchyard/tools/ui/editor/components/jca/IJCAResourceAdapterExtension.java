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
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.jca;

import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;

/**
 * @author bfitzpat
 *
 */
public interface IJCAResourceAdapterExtension {

    /**
     * @return array of Property objects
     */
    public Property[] getPropertyList();
    
    /**
     * @return Display name
     */
    public String getDisplayName();

    /**
     * @param parent Composite
     * @return Composite with controls
     */
    public AbstractSwitchyardComposite getComposite(Composite parent);
    
    /**
     * @return boolean true = default
     */
    public boolean isDefault();
    
    /**
     * @return String corresponding to resource adapter name
     */
    public String getResourceAdapter();
    
    /**
     * @return String corresponding to destination type
     */
    public String getDestinationType();
}
