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
package org.switchyard.tools.ui.properties;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.switchyard.component.bpm.config.model.BPMComponentImplementationModel;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * BPMComponentImplementationtModelPropertySource
 * 
 * <p/>
 * Provides properties for BPMComponentImplementationModel.
 * 
 * @author Rob Cernich
 */
public class BPMComponentImplementationtModelPropertySource implements IPropertySource {

    private static final String PROP_PROCESS_DEFINITION = "process-definition"; //$NON-NLS-1$
    private static final String PROP_MESSAGE_CONTENT_IN_NAME = Messages.BPMComponentImplementationtModelPropertySource_1;
    private static final String PROP_MESSAGE_CONTENT_OUT_NAME = "message-content-out-name"; //$NON-NLS-1$
    private static final String PROP_PROCESS_ID = "process-id"; //$NON-NLS-1$
    private static final PropertyDescriptor[] DESCRIPTORS;

    private final BPMComponentImplementationModel _model;

    /* package */BPMComponentImplementationtModelPropertySource(BPMComponentImplementationModel model) {
        _model = model;
    }

    @Override
    public Object getEditableValue() {
        return _model;
    }

    @Override
    public IPropertyDescriptor[] getPropertyDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public Object getPropertyValue(Object id) {
        if (PROP_PROCESS_DEFINITION.equals(id)) {
            if (_model.getManifest() == null || _model.getManifest().getResources() == null
                    || _model.getManifest().getResources().getResources() == null
                    || _model.getManifest().getResources().getResources().size() != 1) {
                return null;
            }
            return _model.getManifest().getResources().getResources().get(0).getLocation();
        } else if (PROP_PROCESS_ID.equals(id)) {
            return _model.getProcessId();
            // } else if (PROP_MESSAGE_CONTENT_IN_NAME.equals(id)) {
            // return _model.getMessageContentInName();
            // } else if (PROP_MESSAGE_CONTENT_OUT_NAME.equals(id)) {
            // return _model.getMessageContentOutName();
        }
        return null;
    }

    @Override
    public boolean isPropertySet(Object id) {
        return false;
    }

    @Override
    public void resetPropertyValue(Object id) {
    }

    @Override
    public void setPropertyValue(Object id, Object value) {
    }

    static {
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_PROCESS_DEFINITION, Messages.BPMComponentImplementationtModelPropertySource_propertyDescriptor_bpmProcessDefinition),
                new PropertyDescriptor(PROP_PROCESS_ID, Messages.BPMComponentImplementationtModelPropertySource_propertyDescriptor_bpmProcessID)
        /*
         * , new PropertyDescriptor ( PROP_MESSAGE_CONTENT_IN_NAME ,
         * "Message Content In Name" ), new PropertyDescriptor (
         * PROP_MESSAGE_CONTENT_OUT_NAME , "Message Content Out Name" )
         */};
        DESCRIPTORS[0].setDescription(Messages.BPMComponentImplementationtModelPropertySource_propertyDescriptorDescription_bpmProcessDefinition);
        DESCRIPTORS[1].setDescription(Messages.BPMComponentImplementationtModelPropertySource_propertyDescriptorDescription_bpmProcessID);
        /*
         * DESCRIPTORS[2].setDescription(
         * "The name used to identify the input message within the process.");
         * DESCRIPTORS[3].setDescription(
         * "The name used to identify the output message within the process.");
         */
    }
}
