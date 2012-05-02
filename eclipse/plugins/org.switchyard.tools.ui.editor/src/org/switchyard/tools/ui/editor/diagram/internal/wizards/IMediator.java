/*******************************************************************************
 * Copyright (c) 2005 Sybase, Inc.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: shongxum - initial API and implementation
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.internal.wizards;

import org.eclipse.jface.wizard.IWizardPage;

/**
 * Specifies the behaivour of a wizard that can determine which page will be
 * next in the sequence.
 * 
 * Used in conjuction with <cide>ISkippable</code>.
 * 
 * @author shongxum
 */
public interface IMediator {

    /**
     * Mediates the wizard page with respect to which page will be next in the
     * sequence.
     * 
     * @param wizardPage Mediated page
     */
    public void mediatePage(IWizardPage wizardPage);
}
