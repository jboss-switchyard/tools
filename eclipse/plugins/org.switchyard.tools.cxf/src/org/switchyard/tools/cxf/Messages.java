/*************************************************************************************
 * Copyright (c) 2013 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.cxf;

import org.eclipse.osgi.util.NLS;

/**
 * Messages class for processing localized messages.
 *
 */
public final class Messages extends NLS {
    
    private static final String BUNDLE_NAME = "org.switchyard.tools.cxf.messages"; //$NON-NLS-1$
    
    /**
     * Warning for Skipping Overloaded Operation. 
     */
    public static String SwitchYardWSDLToJavaProcessor_warning_SkipOverloadedOperation;
    
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
