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

import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.Property;

/**
 * @author bfitzpat
 *
 */
public abstract class AbstractResourceAdapterExtension implements IJCAResourceAdapterExtension {

    @Override
    public boolean isDefault() {
        return false;
    }

    @Override
    public Property[] getPropertyList() {
        return new Property[0];
    }
    
    protected Property createNewProperty(String name, String value) {
        Property newProperty = JcaFactory.eINSTANCE.createProperty();
        newProperty.setName(name);
        newProperty.setValue(value);
        return newProperty;
    }

    @Override
    public String getResourceAdapter() {
        return null;
    }

    @Override
    public String getDestinationType() {
        return null;
    }

}
