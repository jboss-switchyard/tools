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
package org.switchyard.tools.ui.editor.model.merge;

import java.util.Map;

import org.eclipse.emf.compare.diff.merge.IMerger;
import org.eclipse.emf.compare.diff.merge.IMergerProvider;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeRightTarget;
import org.eclipse.emf.compare.util.EMFCompareMap;

/**
 * SwitchYardMergerProvider
 * 
 * <p/>
 * Work around bugs when containment feature is "affiliated".
 */
public class SwitchYardMergerProvider implements IMergerProvider {

    private Map<Class<? extends DiffElement>, Class<? extends IMerger>> _mergerTypes;

    /**
     * Create a new SwitchYardMergerProvider.
     */
    public SwitchYardMergerProvider() {
    }

    @Override
    public Map<Class<? extends DiffElement>, Class<? extends IMerger>> getMergers() {
        if (_mergerTypes == null) {
            _mergerTypes = new EMFCompareMap<Class<? extends DiffElement>, Class<? extends IMerger>>();
            _mergerTypes.put(ModelElementChangeRightTarget.class, ModelElementChangeRightTargetMerger.class);
            _mergerTypes.put(ModelElementChangeLeftTarget.class, ModelElementChangeLeftTargetMerger.class);
        }
        return _mergerTypes;
    }

}
