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
 * IArtifactsNode
 * 
 * <p/>
 * Root node for SwitchYard artifacts in the project explorer.
 * 
 * @author Rob Cernich
 */
public interface IArtifactsNode extends ISwitchYardNode {

    /**
     * @return the artifacts referenced by the application.
     */
    public List<IArtifactNode> getArtifacts();

}
