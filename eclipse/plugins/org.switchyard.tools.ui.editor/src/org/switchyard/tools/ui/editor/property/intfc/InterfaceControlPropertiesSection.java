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
package org.switchyard.tools.ui.editor.property.intfc;

import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.AbstractTabbedPropertySection;

/**
 * @author bfitzpat
 * 
 */
public class InterfaceControlPropertiesSection extends AbstractTabbedPropertySection<Contract> {

    @Override
    protected AbstractModelComposite<Contract> createComposite(Composite parent, int style) {
        return new InterfaceControlComposite(this, parent, style);
    }

}
