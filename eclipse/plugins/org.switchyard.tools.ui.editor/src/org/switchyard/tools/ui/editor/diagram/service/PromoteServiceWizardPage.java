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
package org.switchyard.tools.ui.editor.diagram.service;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.switchyard.tools.ui.editor.diagram.shared.NewContractWizardPage;

/**
 * PromoteServiceWizardPage
 * 
 * <p/>
 * Page for collecting information for the promoted service.
 */
public class PromoteServiceWizardPage extends NewContractWizardPage {

    /**
     * Create a new PromoteServiceWizardPage.
     */
    public PromoteServiceWizardPage() {
        super(PromoteServiceWizardPage.class.getCanonicalName(), "Promote Component Service",
                "Specify details for the new composite service.", ScaPackage.eINSTANCE.getService());
    }

}
