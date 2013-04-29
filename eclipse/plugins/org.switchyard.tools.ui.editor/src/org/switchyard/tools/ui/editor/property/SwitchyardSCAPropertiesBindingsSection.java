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
package org.switchyard.tools.ui.editor.property;

import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.ui.editor.property.contract.BindingsControlComposite;

/**
 * @author bfitzpat
 * 
 */
public class SwitchyardSCAPropertiesBindingsSection extends AbstractTabbedPropertySection<Contract> {

    @Override
    protected AbstractModelComposite<Contract> createComposite(Composite parent, int style) {
        return new BindingsControlComposite(this, parent, style);
    }
    
    @Override
    public boolean shouldUseExtraSpace() {
        return true;
    }

}
