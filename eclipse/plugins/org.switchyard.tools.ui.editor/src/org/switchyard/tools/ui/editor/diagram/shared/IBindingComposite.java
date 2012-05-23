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
package org.switchyard.tools.ui.editor.diagram.shared;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;

/**
 * @author bfitzpat
 *
 */
public interface IBindingComposite {

    /**
     * @return interface
     */
    public Binding getBinding();

    /**
     * @param impl implementation coming in
     */
    public void setBinding(Binding impl);
}
