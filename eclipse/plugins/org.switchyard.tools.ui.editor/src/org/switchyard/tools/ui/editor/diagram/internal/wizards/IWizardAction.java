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

/**
 * Allows the wizard pages to listen to the event of switching of the page.
 * 
 * @author shongxum
 */
public interface IWizardAction {

    /**
     * Called just before switching the page.
     * 
     * @return boolean
     */
    public boolean onWizardNext();

    /**
     * Called before showing this page.
     */
    public void onSetActive();
}
