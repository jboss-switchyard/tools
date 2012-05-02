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
import org.eclipse.jface.wizard.Wizard;

/**
 * Base class for all wizards.
 * 
 * @author shongxum
 */
abstract public class BaseWizard extends Wizard implements IMediator {

    /* 
     * (non-Javadoc) Method declared on IWizard. Returns the next page for the
     * wizard to display. This implementation ignores skipped pages.
     * @see org.eclipse.jface.wizard.Wizard#getNextPage(org.eclipse.jface.wizard.IWizardPage)
     */
    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        IWizardAction wizActions = null;
        IWizardPage nextPage = null;
        ISkippable nextPG = null;
        if (page instanceof IWizardAction) {
            wizActions = (IWizardAction) page;
            if (!wizActions.onWizardNext()) {
                return page;
            }
        }
        nextPage = super.getNextPage(page);
        while ((nextPage != null) && (nextPage instanceof ISkippable)) {
            nextPG = (ISkippable) nextPage;
            if (!nextPG.getSkippable()) {
                break;
            }
            nextPage = super.getNextPage(nextPage);
        }
        if (nextPage != null && nextPage instanceof IWizardAction) {
            wizActions = (IWizardAction) nextPage;
            wizActions.onSetActive();
        }
        return nextPage;
    }

    /* (non-Javadoc)
     * Method declared on IWizard. Returns the previous page displayed in the
     * wizard. This implementation ignores skipped pages.
     * @see org.eclipse.jface.wizard.Wizard#getPreviousPage(org.eclipse.jface.wizard.IWizardPage)
     */
    @Override
    public IWizardPage getPreviousPage(IWizardPage page) {
        IWizardPage prevPage = null;
        ISkippable prevPG = null;
        prevPage = super.getPreviousPage(page);
        while ((prevPage != null) && (prevPage instanceof ISkippable)) {
            prevPG = (ISkippable) prevPage;
            if (!prevPG.getSkippable()) {
                break;
            }
            prevPage = super.getPreviousPage(prevPage);
        }
        return prevPage;
    }

    /**
     * Method declared on IWizard. By default this is the first page inserted
     * into the wizard. This implementation ignores skipped pages.
     * 
     * @return the first wizard page
     * @see org.eclipse.jface.wizard.IWizard#getStartingPage()
     */
    public IWizardPage getStartingPage() {
        IWizardAction wizActions = null;
        IWizardPage[] pages = getPages();
        IWizardPage page = null;
        ISkippable pg = null;
        if (pages.length == 0) {
            return page;
        }
        for (int i = 0; i < pages.length; i++) {
            page = pages[i];
            if (page instanceof ISkippable) {
                pg = (ISkippable) page;
                if (!pg.getSkippable()) {
                    break;
                }
            } else {
                break;
            }
        }
        if (page != null && page instanceof IWizardAction) {
            wizActions = (IWizardAction) page;
            wizActions.onSetActive();
        }
        return page;
    }

    /* (non-Javadoc)
     * Method declared on IWizard. Default implementation allows the wizard to
     * finish if current page is a summary page.
     * @see org.eclipse.jface.wizard.Wizard#canFinish()
     */
    @Override
    public boolean canFinish() {
        IWizardPage[] pages = getPages();
        for (int i = 0; i < pages.length; i++) {
            if (!pages[i].isPageComplete()) {
                if ((pages[i] instanceof ISkippable) && ((ISkippable) pages[i]).getSkippable()) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
        // return getContainer().getCurrentPage() instanceof ISummary;
    }

    /* (non-Javadoc)
     * Client need to override this method if mediation is needed. Mediation is
     * made by the wizard controller to allow wizard pages independent of each
     * other, it can be used to initialize data for wizard page, or can be used
     * to make some wizard pages invisible if a certain condition is met.
     * @see org.switchyard.tools.ui.editor.diagram.internal.wizards.IMediator#mediatePage(org.eclipse.jface.wizard.IWizardPage)
     */
    @Override
    public void mediatePage(IWizardPage wizardPage) {
        // Do nothing by default
    }
}
