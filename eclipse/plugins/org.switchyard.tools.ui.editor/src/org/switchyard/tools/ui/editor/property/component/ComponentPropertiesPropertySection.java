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
package org.switchyard.tools.ui.editor.property.component;

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.AbstractTabbedPropertySection;

/**
 * @author bfitzpat
 * 
 */
public class ComponentPropertiesPropertySection extends AbstractTabbedPropertySection<Component>  {

    @Override
    protected AbstractModelComposite<Component> createComposite(Composite parent, int style) {
        return new ComponentPropertiesComposite(this, parent, style);
    }

}
