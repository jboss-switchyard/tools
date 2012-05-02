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

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardPage;

/**
 * Base class for every wizard page in the plugin. Provides default support for
 * listening to wizard switching pages and visibility (through skippable)
 * control.
 * 
 * @author shongxum
 */
abstract public class BaseWizardPage extends WizardPage implements IWizardAction, ISkippable {

    private boolean _skippable = false;
    private boolean _needMediation = false;

    /**
     * Default constructor.
     * @param name page name
     */
    public BaseWizardPage(String name) {
        super(name);
    }

    /**
     * @param pageName page name
     * @param title page title
     * @param titleImage page image
     */
    public BaseWizardPage(String pageName, String title, ImageDescriptor titleImage) {
        super(pageName, title, titleImage);
    }

    /* (non-Javadoc)
     * @see org.switchyard.tools.ui.editor.diagram.internal.wizards.ISkippable#getSkippable()
     */
    @Override
    public boolean getSkippable() {
        return _skippable;
    }

    /* (non-Javadoc)
     * @see org.switchyard.tools.ui.editor.diagram.internal.wizards.ISkippable#setSkippable(boolean)
     */
    @Override
    public void setSkippable(boolean b) {
        _skippable = b;
    }

    /**
     * @param needMediation flag
     */
    public void setNeedMediation(boolean needMediation) {
        _needMediation = needMediation;
    }

    /* (non-Javadoc)
     * @see org.switchyard.tools.ui.editor.diagram.internal.wizards.IWizardAction#onWizardNext()
     */
    @Override
    public boolean onWizardNext() {
        if (!_needMediation) {
            return true;
        }

        IWizard wiz = getWizard();
        if (wiz instanceof IMediator) {
            ((IMediator) wiz).mediatePage(this);
        }
        return true;
    }

    /**
     * @see com.sybase.wst.eclipse.internal.ui.wizards.IWizardAction#onSetActive()
     */
    public void onSetActive() {
        // Empty
    }

}
