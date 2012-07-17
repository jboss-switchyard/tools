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
package org.switchyard.tools.ui.editor.diagram.component;

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.switchyard.tools.ui.editor.diagram.shared.ITypeWizard;

/**
 * IComponentWizard
 * 
 * <p/>
 * Base interface for component wizards.
 * 
 * @author Rob Cernich
 */
public interface IComponentWizard extends ITypeWizard<Component, Composite> {

}
