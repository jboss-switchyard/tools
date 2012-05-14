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

import org.eclipse.jface.wizard.IWizardPage;

/**
 * Base linked wizard. Linked wizards can contain other wizards in their series
 * of pages. To link wizards together, initalize the following wizard in your
 * wizard's addPages() method, e.g.
 * 
 * <pre>
 *  public void addPages() {
 *      super.addPages();
 *  
 *      // Add this wizard's pages.
 *      ...
 *       
 *      // Create the next wizard
 *      MyNextWizard mnw = new MyNextWizard();
 *      
 *      // Initialize the wizard
 *      mnw.init();
 *      
 *      // Create the wizards pages
 *      mnw.addPages();
 *     
 *      // Link the wizard into the chain
 *      setNext(mnw);
 *  }
 * </pre>
 * 
 * The linked wizard's starting page is automatically returned by getNextPage()
 * when all this wizard's pages have been displayed.
 * 
 * @author rcernich
 */
public abstract class LinkedWizardBase extends BaseWizard implements ILinkedWizard {

    private ILinkedWizard _previous = null;
    private ILinkedWizard _next = null;
    private boolean _finished = false;

    /**
     * Default constructor.
     */
    public LinkedWizardBase() {
        super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.switchyard.tools.ui.editor.diagram.internal.wizards.ILinkedWizard#setPrevious
     * (org.switchyard.tools.ui.editor.diagram.internal.wizards.ILinkedWizard)
     */
    @Override
    public void setPrevious(ILinkedWizard previous) {
        _previous = previous;
        if (_previous != null && (getWindowTitle() == null || getWindowTitle().length() == 0)) {
            setWindowTitle(_previous.getWindowTitle());
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.switchyard.tools.ui.editor.diagram.internal.wizards.ILinkedWizard#getPrevious()
     */
    @Override
    public ILinkedWizard getPrevious() {
        return _previous;
    }

    @Override
    public void setNext(ILinkedWizard next) {
        _next = next;
        if (next != null) {
            if (next.getStartingPage() == null) {
                next.addPages();
            }
            _next.setPrevious(this);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.switchyard.tools.ui.editor.diagram.internal.wizards.ILinkedWizard#getNext()
     */
    @Override
    public ILinkedWizard getNext() {
        return _next;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.wizard.IWizard#canFinish()
     */
    @Override
    public boolean canFinish() {
        boolean canFinish = super.canFinish();
        if (canFinish && getNext() != null) {
            canFinish = canFinish && getNext().canFinish();
        }
        return canFinish;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.switchyard.tools.ui.editor.diagram.internal.wizards.ILinkedWizard#isFinished()
     */
    @Override
    public boolean isFinished() {
        return _finished;
    }

    /**
     * @see org.eclipse.jface.wizard.IWizard#dispose()
     */
    public void dispose() {
        super.dispose();
        _previous = null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.wizard.Wizard#performFinish()
     */
    @Override
    public boolean performFinish() {
        boolean noFailures = true;
        if (!_finished) {
            // Get the last unfinished wizard
            LinkedWizardBase lastWiz = this;
            if (getNext() != null && !getNext().isFinished()) {
                lastWiz = (LinkedWizardBase) getNext();
                while (lastWiz.getNext() != null && !lastWiz.getNext().isFinished()) {
                    lastWiz = (LinkedWizardBase) lastWiz.getNext();
                }
            }

            // finish the wizards from last to first
            do {
                lastWiz._finished = lastWiz.doFinish();
                noFailures = noFailures && lastWiz.isFinished();
                lastWiz = (LinkedWizardBase) lastWiz.getPrevious();
            } while (noFailures && lastWiz != null && !lastWiz.isFinished());
        }
        return _finished && noFailures;
    }

    /**
     * @return flag
     */
    public abstract boolean doFinish();

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizard#getNextPage(org
     * .eclipse.jface.wizard.IWizardPage)
     */
    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        IWizardPage nextPage = super.getNextPage(page);
        if (nextPage == null && getNext() != null) {
            nextPage = getNext().getStartingPage();
        }
        return nextPage;
    }

    /**
     * @param finished flag
     */
    public void setFinished(boolean finished) {
        this._finished = finished;
    }

}
