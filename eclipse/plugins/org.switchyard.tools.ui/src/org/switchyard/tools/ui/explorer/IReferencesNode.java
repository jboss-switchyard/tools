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
 * IReferencesNode
 * 
 * <p/>
 * Root node for SwitchYard references content in project explorer.
 * 
 * @author Rob Cernich
 */
public interface IReferencesNode extends ISwitchYardNode {

    /**
     * @return the references used by the application.
     */
    public List<IReferenceNode> getReferences();

}
