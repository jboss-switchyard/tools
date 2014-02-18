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

import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author bfitzpat
 *
 */
public interface IJCAEndpointPropertiesExtension {

    /**
     * @param toolkit Form toolkit to use for control creation
     * @return Composite with controls
     */
    public AbstractJCABindingComposite createComposite(FormToolkit toolkit);
    
}
