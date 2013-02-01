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

import java.util.Map;

import org.eclipse.bpel.ui.Templates.Template;

/**
 * ITemplateDetails
 * 
 * <p/>
 * Provides details used to create a process from a template.
 */
public interface ITemplateDetails {

    /**
     * @return the processTemplateProperties
     */
    public Map<String, String> getProcessTemplateProperties();

    /**
     * @return the template
     */
    public Template getSelectedTemplate();
}
