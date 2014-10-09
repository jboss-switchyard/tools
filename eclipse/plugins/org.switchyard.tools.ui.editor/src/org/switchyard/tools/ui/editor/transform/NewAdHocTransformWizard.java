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
package org.switchyard.tools.ui.editor.transform;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.ui.editor.Messages;

/**
 * NewTransformWizard
 * 
 * <p/>
 * Wizard for creating new transformers.
 */
public class NewAdHocTransformWizard extends Wizard {

    private NewAdHocTransformWizardPage _page;

    /**
     * @param type the type, must be a QName.
     * @return true if the type is a Java type.
     */
    public static boolean isJavaType(String type) {
        return QName.valueOf(type).getLocalPart().startsWith("java:"); //$NON-NLS-1$
    }

    /**
     * Create a new NewTransformWizard.
     */
    public NewAdHocTransformWizard() {
        setWindowTitle(Messages.title_newTransformers);
        setForcePreviousAndNextButtons(true);
        _page = new NewAdHocTransformWizardPage();
    }

    /**
     * @param details the set of transformers.
     */
    public void init(TransformDetails details) {
        _page.init(details);
    }

    @Override
    public void addPages() {
        addPage(_page);
    }

    @Override
    public boolean performFinish() {
        return _page.performFinish();
    }

    /**
     * @return the transforms created by this wizard.
     */
    public Collection<TransformType> getCreatedTransforms() {
        return _page.getCreatedTransforms();
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        if (page == _page && _page.getNextWizard() != null) {
            return _page.getNextWizard().getStartingPage();
        }
        return super.getNextPage(page);
    }

    @Override
    public boolean canFinish() {
        boolean canFinish = super.canFinish();
        if (canFinish && _page.getNextWizard() != null) {
            canFinish = canFinish && _page.getNextWizard().canFinish();
        }
        return canFinish && _page.getControl() != null;
    }
}
