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
package org.switchyard.tools.ui.editor.components.soap;

import org.eclipse.swt.widgets.Button;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.ui.editor.diagram.binding.MessageComposerComposite;

/**
 * SOAPMessageComposerComposite
 * <p/>
 * Specialized for SOAP binding.
 */
public class SOAPMessageComposerComposite extends MessageComposerComposite {

    @Override
    protected ContextMapperType createContextMapper() {
        return SOAPFactory.eINSTANCE.createContextMapperType();
    }

    @Override
    protected MessageComposerType createMessageComposer() {
        return SOAPFactory.eINSTANCE.createMessageComposerType();
    }

    @Override
    protected void updateContextMapperFeature(String featureId, Object value) {
        super.updateContextMapperFeature(featureId, value);
    }

    @Override
    protected void updateMessageComposerFeature(Button control) {
        super.updateMessageComposerFeature(control);
    }

}
