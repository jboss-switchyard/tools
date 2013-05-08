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

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.views.properties.IPropertySource;
import org.switchyard.component.bean.config.model.BeanComponentImplementationModel;
import org.switchyard.component.bpm.config.model.BPMComponentImplementationModel;
import org.switchyard.component.camel.model.CamelComponentImplementationModel;
import org.switchyard.component.clojure.config.model.ClojureComponentImplementationModel;
import org.switchyard.component.hornetq.config.model.HornetQBindingModel;
import org.switchyard.component.rules.config.model.RulesComponentImplementationModel;
import org.switchyard.component.soap.config.model.SOAPBindingModel;
import org.switchyard.config.model.Model;
import org.switchyard.config.model.composer.ContextMapperModel;
import org.switchyard.config.model.composite.BindingModel;
import org.switchyard.config.model.composite.ComponentModel;
import org.switchyard.config.model.composite.ComponentReferenceModel;
import org.switchyard.config.model.composite.ComponentServiceModel;
import org.switchyard.config.model.composite.CompositeReferenceModel;
import org.switchyard.config.model.composite.CompositeServiceModel;
import org.switchyard.config.model.composite.InterfaceModel;
import org.switchyard.config.model.implementation.bpel.BPELComponentImplementationModel;
import org.switchyard.config.model.switchyard.ArtifactModel;
import org.switchyard.config.model.switchyard.SwitchYardModel;
import org.switchyard.tools.ui.explorer.ISwitchYardNode;
import org.switchyard.tools.ui.explorer.impl.ArtifactNode;
import org.switchyard.tools.ui.explorer.impl.ComponentNode;
import org.switchyard.tools.ui.explorer.impl.ComponentReference;
import org.switchyard.tools.ui.explorer.impl.ComponentService;
import org.switchyard.tools.ui.explorer.impl.ReferenceNode;
import org.switchyard.tools.ui.explorer.impl.ServiceGateway;
import org.switchyard.tools.ui.explorer.impl.ServiceNode;
import org.switchyard.tools.ui.explorer.impl.SwitchYardRootNode;

/**
 * PropertySourceAdapterFactory
 * 
 * <p/>
 * Adapter factory converting ISwitchYardNode objects to IPropertySource
 * objects.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("rawtypes")
public class PropertySourceAdapterFactory implements IAdapterFactory {

    private static final Class[] ADAPTER_LIST = new Class[] {IPropertySource.class };

    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (!IPropertySource.class.equals(adapterType)) {
            return null;
        } else if (adaptableObject instanceof ISwitchYardNode) {
            return getNodeAdapter(adaptableObject);
        } else if (adaptableObject instanceof Model) {
            return getModelAdapter(adaptableObject);
        }
        return null;
    }

    @Override
    public Class[] getAdapterList() {
        return ADAPTER_LIST;
    }

    private Object getNodeAdapter(Object adaptableObject) {
        if (adaptableObject instanceof ArtifactNode) {
            return getModelAdapter(((ArtifactNode) adaptableObject).getModel());
        } else if (adaptableObject instanceof ComponentNode) {
            return getModelAdapter(((ComponentNode) adaptableObject).getModel());
        } else if (adaptableObject instanceof ComponentService) {
            return getModelAdapter(((ComponentService) adaptableObject).getModel());
        } else if (adaptableObject instanceof ComponentReference) {
            return getModelAdapter(((ComponentReference) adaptableObject).getModel());
        } else if (adaptableObject instanceof ReferenceNode) {
            return getModelAdapter(((ReferenceNode) adaptableObject).getModel());
        } else if (adaptableObject instanceof ServiceGateway) {
            return getModelAdapter(((ServiceGateway) adaptableObject).getModel());
        } else if (adaptableObject instanceof ServiceNode) {
            return getModelAdapter(((ServiceNode) adaptableObject).getModel());
        } else if (adaptableObject instanceof SwitchYardRootNode) {
            return new SwitchYardRootPropertySource((SwitchYardRootNode) adaptableObject);
        }
        return null;
    }

    private Object getModelAdapter(Object adaptableObject) {
        if (adaptableObject instanceof ArtifactModel) {
            return new ArtifactModelPropertySource((ArtifactModel) adaptableObject);
        } else if (adaptableObject instanceof SwitchYardModel) {
            return new SwitchYardModelPropertySource((SwitchYardModel) adaptableObject);
        } else if (adaptableObject instanceof ComponentModel) {
            return new ComponentModelPropertySource((ComponentModel) adaptableObject);
        } else if (adaptableObject instanceof BeanComponentImplementationModel) {
            return new BeanComponentImplementationtModelPropertySource(
                    (BeanComponentImplementationModel) adaptableObject);
        } else if (adaptableObject instanceof BPELComponentImplementationModel) {
            return new BPELComponentImplementationtModelPropertySource(
                    (BPELComponentImplementationModel) adaptableObject);
        } else if (adaptableObject instanceof BPMComponentImplementationModel) {
            return new BPMComponentImplementationtModelPropertySource((BPMComponentImplementationModel) adaptableObject);
        } else if (adaptableObject instanceof CamelComponentImplementationModel) {
            return new CamelComponentImplementationtModelPropertySource(
                    (CamelComponentImplementationModel) adaptableObject);
        } else if (adaptableObject instanceof ClojureComponentImplementationModel) {
            return new ClojureComponentImplementationtModelPropertySource(
                    (ClojureComponentImplementationModel) adaptableObject);
        } else if (adaptableObject instanceof RulesComponentImplementationModel) {
            return new RulesComponentImplementationtModelPropertySource(
                    (RulesComponentImplementationModel) adaptableObject);
        } else if (adaptableObject instanceof ComponentServiceModel) {
            return new ComponentServiceModelPropertySource((ComponentServiceModel) adaptableObject);
        } else if (adaptableObject instanceof ComponentReferenceModel) {
            return new ComponentReferenceModelPropertySource((ComponentReferenceModel) adaptableObject);
        } else if (adaptableObject instanceof CompositeReferenceModel) {
            return new CompositeReferenceModelPropertySource((CompositeReferenceModel) adaptableObject);
        } else if (adaptableObject instanceof CompositeServiceModel) {
            return new CompositeServiceModelPropertySource((CompositeServiceModel) adaptableObject);
        } else if (adaptableObject instanceof HornetQBindingModel) {
            return new HornetQBindingModelPropertySource((HornetQBindingModel) adaptableObject);
        } else if (adaptableObject instanceof SOAPBindingModel) {
            return new SOAPBindingModelPropertySource((SOAPBindingModel) adaptableObject);
        } else if (adaptableObject instanceof BindingModel) {
            return new BindingModelPropertySource((BindingModel) adaptableObject);
        } else if (adaptableObject instanceof InterfaceModel) {
            return new InterfaceModelPropertySource((InterfaceModel) adaptableObject);
        } else if (adaptableObject instanceof ContextMapperModel) {
            return new ContextMapperModelPropertySource((ContextMapperModel) adaptableObject);
        }
        return null;
    }
}
