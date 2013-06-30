/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.switchyard.tools.ui.editor.property;

import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.widgets.Composite;

/**
 * ThrottlingPropertyPage
 * 
 * <p/>
 * Property page implementation for throttling configuration.
 */
public class ThrottlingPropertyPage extends AbstractPropertyPage<Contract> {

    @Override
    protected AbstractModelComposite<Contract> createComposite(Composite parent, int style) {
        return new ThrottlingPropertyComposite(this, parent, style);
    }

}
