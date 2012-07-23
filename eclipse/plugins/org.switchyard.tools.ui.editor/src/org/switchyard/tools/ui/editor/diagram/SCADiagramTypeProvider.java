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
package org.switchyard.tools.ui.editor.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramTypeProvider extends AbstractDiagramTypeProvider {

    private IToolBehaviorProvider[] _toolBehaviorProviders;

    /**
     * Constructor.
     */
    public SCADiagramTypeProvider() {
        super();
        setFeatureProvider(new SCADiagramFeatureProvider(this));
    }

    @Override
    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
        if (_toolBehaviorProviders == null) {
            _toolBehaviorProviders = new IToolBehaviorProvider[] {new SCADiagramToolBehaviorProvider(this) };
        }
        return _toolBehaviorProviders;
    }

    @Override
    public boolean isAutoUpdateAtStartup() {
        return true;
    }

    @Override
    public boolean isAutoUpdateAtReset() {
        return true;
    }

}
