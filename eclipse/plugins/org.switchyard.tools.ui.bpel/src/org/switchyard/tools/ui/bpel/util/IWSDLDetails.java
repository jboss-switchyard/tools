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

import org.eclipse.wst.wsdl.PortType;

/**
 * IWSDLDetails
 * <p/>
 * 
 * Provides details about the WSDL file referenced by the process.
 */
public interface IWSDLDetails {

    /**
     * @return the WSDL URL.
     */
    public String getWsdlUrl();

    /**
     * @return true if the WSDL should be imported.
     */
    public boolean isImportWsdl();

    /**
     * @return the portType referenced by the process.
     */
    public PortType getPortType();

}
