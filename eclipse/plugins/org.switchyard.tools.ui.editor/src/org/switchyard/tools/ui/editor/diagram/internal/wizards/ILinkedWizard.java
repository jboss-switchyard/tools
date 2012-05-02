/*******************************************************************************
 * Copyright (c) 2005 Sybase, Inc.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: rcernich - initial API and implementation
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.internal.wizards;

import org.eclipse.jface.wizard.IWizard;

/**
 * Interface for a linked wizard. Linked wizards can contain other wizards in
 * their series of pages. Clients should extend the base class LinkedWizardBase.
 * 
 * @author rcernich
 */
public interface ILinkedWizard extends IWizard {

    /**
     * Sets the wizard that precedes this wizard in the chain. Clients should
     * not need to invoke this method directly (it is invoked automatically on
     * the wizard passed to setNext()).
     * 
     * @param previous earlier wizard
     */
    public void setPrevious(ILinkedWizard previous);

    /**
     * @return the wizard that precedes this wizard in the chain
     */
    public ILinkedWizard getPrevious();

    /**
     * Sets the wizard that follows this wizard. Sets next's previous wizard to
     * this.
     * 
     * @param next the next wizard in the chain.
     */
    public void setNext(ILinkedWizard next);

    /**
     * @return the next wizard in the chain
     */
    public ILinkedWizard getNext();

    /**
     * @return true if this wizard has successfully completed its
     *         performFinish() work.
     */
    public boolean isFinished();
}
