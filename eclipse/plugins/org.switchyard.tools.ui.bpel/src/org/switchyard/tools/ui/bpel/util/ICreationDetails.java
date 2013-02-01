/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.bpel.util;

import org.eclipse.bpel.ui.wizards.NewBpelFileFirstPage.BpelCreationMode;

/**
 * ICreationDetails
 * <p/>
 * 
 * Provides details used to determine how a BPEL process is created.
 */
public interface ICreationDetails {

    /**
     * @return the name for the new process.
     */
    public String getProcessName();

    /**
     * @return the namespace for the new process.
     */
    public String getProcessNamespace();

    /**
     * @return true if the new process should be abstract.
     */
    public boolean isAbstractProcess();

    /**
     * @return the creationMode
     */
    public BpelCreationMode getCreationMode();

    /**
     * @return the SwitchYard service name provided by the process
     */
    public String getServiceName();

}
