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
package org.switchyard.tools.ui.explorer;

import java.util.List;

/**
 * IServicesNode
 * 
 * <p/>
 * Root node for SwitchYard services content in project explorer.
 * 
 * @author Rob Cernich
 */
public interface IServicesNode extends ISwitchYardNode {

    /**
     * @return the services provided by the application.
     */
    public List<IServiceNode> getServices();
    
}
