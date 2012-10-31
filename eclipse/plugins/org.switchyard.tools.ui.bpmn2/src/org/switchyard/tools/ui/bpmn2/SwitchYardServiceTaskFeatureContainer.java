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
package org.switchyard.tools.ui.bpmn2;

import org.eclipse.bpmn2.Assignment;
import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.DataInput;
import org.eclipse.bpmn2.DataInputAssociation;
import org.eclipse.bpmn2.FormalExpression;
import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.modeler.core.utils.GraphicsUtil;
import org.eclipse.bpmn2.modeler.core.utils.ModelUtil;
import org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.features.JbpmCustomTaskFeatureContainer;
import org.eclipse.bpmn2.modeler.ui.editor.BPMN2Editor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.wst.common.project.facet.core.FacetedProjectFramework;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.facets.ISwitchYardFacetConstants;

/**
 * SwitchYardServiceTaskFeatureContainer
 * 
 * <p/>
 * Custom task container for "SwitchYard Service" tasks. This guy creates and
 * initializes "SwitchYard Service" tasks.
 * 
 * @author Rob Cernich
 */
public class SwitchYardServiceTaskFeatureContainer extends JbpmCustomTaskFeatureContainer {

    @Override
    public ICreateFeature getCreateFeature(IFeatureProvider fp) {
        return new SwitchYardServiceTaskCreateFeature(fp);
    }

    @Override
    public IAddFeature getAddFeature(IFeatureProvider fp) {
        return new AddCustomTaskFeature(fp) {
            @Override
            protected void decorateActivityRectangle(RoundedRectangle rect) {
                IGaService service = Graphiti.getGaService();
                Image img = service.createImage(rect, ImageProvider.IMG_16_SWITCHYARD);
                service.setLocationAndSize(img, 2, 2, GraphicsUtil.TASK_IMAGE_SIZE, GraphicsUtil.TASK_IMAGE_SIZE);
            }
        };
    }

    /**
     * SwitchYardServiceTaskCreateFeature
     * 
     * <p/>
     * Custom task for creating "SwitchYard Service" tasks.
     * 
     * @author Rob Cernich
     */
    public class SwitchYardServiceTaskCreateFeature extends JbpmCreateCustomTaskFeature {

        /**
         * Create a new SwitchYardServiceTaskCreateFeature.
         * 
         * @param fp the feature provider.
         */
        public SwitchYardServiceTaskCreateFeature(IFeatureProvider fp) {
            super(fp, customTaskDescriptor.getName(), customTaskDescriptor.getDescription(),
                    ImageProvider.IMG_16_SWITCHYARD);
        }

        @Override
        public boolean isAvailable(IContext context) {
            return canCreate((ICreateContext) context) && super.isAvailable(context);
        }

        @Override
        public boolean canCreate(ICreateContext context) {
            return super.canCreate(context) && isSwitchYardProject(context);
        }

        @Override
        public Task createBusinessObject(ICreateContext context) {
            Task task = super.createBusinessObject(context);

            Resource resource = ((EObject) getBusinessObjectForPictogramElement(context.getTargetContainer()))
                    .eResource();

            // patch up the input associations. we can't specify input.getId()
            // in the plugin.xml, so we need to add the assignments manually.
            for (DataInputAssociation inputAssociation : task.getDataInputAssociations()) {
                DataInput input = (DataInput) inputAssociation.getTargetRef();
                if ("ServiceName".equals(input.getName())) {
                    addInputAssignment(resource, inputAssociation, input, "SomeSwitchYardService");
                } else if ("ServiceOperationName".equals(input.getName())) {
//                    addInputAssignment(resource, inputAssociation, input, "someServiceOperation");
                    // now do nothing
                    inputAssociation.getTargetRef();
                } else if ("FaultResultName".equals(input.getName())) {
                    // do nothing
                    inputAssociation.getTargetRef();
                } else if ("FaultEventType".equals(input.getName())) {
                    // do nothing
                    inputAssociation.getTargetRef();
                } else if ("CompleteAfterFault".equals(input.getName())) {
                    // do nothing
                    inputAssociation.getTargetRef();
                } else if ("messageContentIn".equals(input.getName())) {
                    // do nothing
                    inputAssociation.getTargetRef();
                }
            }

            return task;
        }

        private void addInputAssignment(Resource resource, DataInputAssociation inputAssociation, DataInput input,
                String fromBody) {
            Assignment assignment = Bpmn2Factory.eINSTANCE.createAssignment();
            FormalExpression fromExpression = Bpmn2Factory.eINSTANCE.createFormalExpression();
            FormalExpression toExpression = Bpmn2Factory.eINSTANCE.createFormalExpression();

            ModelUtil.setID(assignment, resource);
            ModelUtil.setID(fromExpression, resource);
            ModelUtil.setID(toExpression, resource);

            fromExpression.setBody(fromBody);
            toExpression.setBody(input.getId());

            assignment.setFrom(fromExpression);
            assignment.setTo(toExpression);

            inputAssociation.getAssignment().add(assignment);
        }

    }

    private boolean isSwitchYardProject(ICreateContext context) {
        try {
            return FacetedProjectFramework.hasProjectFacet(BPMN2Editor.getActiveEditor().getModelFile().getProject(),
                    ISwitchYardFacetConstants.SWITCHYARD_FACET_ID);
        } catch (CoreException e) {
            return false;
        }

    }
}
