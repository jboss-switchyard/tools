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
package org.switchyard.tools.ui.editor.property.composite;

import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.AbstractTabbedPropertySection;

/**
 * @author bfitzpat
 * 
 */
public class TransformPropertySection extends AbstractTabbedPropertySection<org.eclipse.soa.sca.sca1_1.model.sca.Composite> {

    @Override
    protected AbstractModelComposite<org.eclipse.soa.sca.sca1_1.model.sca.Composite> createComposite(Composite parent, int style) {
        return new TransformsControlComposite(this, parent, style);
    }
}
