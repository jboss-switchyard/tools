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
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.ui.editor.diagram.binding.MessageComposerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

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

    class SOAPRemoveContextMapperOp extends RemoveContextMapperOp {
        
        protected boolean checkForEmpties(SwitchYardBindingType sybinding) throws Exception {
            ContextMapperType contextMapper = sybinding.getContextMapper();
            org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType soapContextMapper = null;
            if (contextMapper instanceof org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType) {
                soapContextMapper = (org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType) contextMapper;
            } else {
                throw new Exception("Context Mapper for SOAP binding incorrect.");
            }
            if (soapContextMapper.getSoapHeadersType() != null) {
                return false; 
            }
            return true;
        }
    }
    
    @Override
    protected ModelOperation getRemoveContextMapperOp() {
        return new SOAPRemoveContextMapperOp();
    }

    @Override
    protected ModelOperation getRemoveMessageComposerOp() {
        return new SOAPRemoveMessageComposerOp();
    }

    class SOAPRemoveMessageComposerOp extends RemoveMessageComposerOp {

        protected boolean checkForEmpties(SwitchYardBindingType sybinding) throws Exception {
            MessageComposerType messageComposer = sybinding.getMessageComposer();
            org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType soapMessageComposer = null;
            if (messageComposer instanceof org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType) {
                soapMessageComposer = (org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType) messageComposer;
            } else {
                throw new Exception("Message Composer for SOAP binding incorrect.");
            }
            if (soapMessageComposer.isUnwrapped()) {
                return false;
            }
            return true;
        }
    }
}
