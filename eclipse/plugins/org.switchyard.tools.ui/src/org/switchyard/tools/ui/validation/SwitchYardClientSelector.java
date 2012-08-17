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
package org.switchyard.tools.ui.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.model.IClientSelector;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl;

/**
 * SwitchYardClientSelector
 * 
 * <p/>
 * Selector for EMF validation framework.
 */
public class SwitchYardClientSelector implements IClientSelector {

    @Override
    public boolean selects(Object object) {
        // only available for switchyard files
        return object instanceof EObject && ((EObject) object).eResource() instanceof SwitchyardResourceImpl;
    }

}
