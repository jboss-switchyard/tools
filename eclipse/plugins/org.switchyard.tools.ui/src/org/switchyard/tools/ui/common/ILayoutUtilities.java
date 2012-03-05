/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.common;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;

/**
 * ILayoutUtilities
 * 
 * <p/>
 * Simple interface providing layout utilities.
 * 
 * @author Rob Cernich
 */
public interface ILayoutUtilities {

    /**
     * Takes care of setting the button's layout data.
     * 
     * @param button the button
     * @return the layout data set on the button.
     */
    public GridData setButtonLayoutData(Button button);

}
