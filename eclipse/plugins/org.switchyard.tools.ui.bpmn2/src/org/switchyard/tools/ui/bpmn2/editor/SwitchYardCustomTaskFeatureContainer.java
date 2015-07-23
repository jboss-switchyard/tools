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
package org.switchyard.tools.ui.bpmn2.editor;

import java.util.List;

import org.eclipse.bpmn2.Assignment;
import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.DataInput;
import org.eclipse.bpmn2.DataInputAssociation;
import org.eclipse.bpmn2.FormalExpression;
import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.modeler.core.features.IShapeFeatureContainer;
import org.eclipse.bpmn2.modeler.core.utils.ModelUtil;
import org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.features.JbpmCustomTaskFeatureContainer;
import org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.features.JbpmTaskFeatureContainer.JbpmAddTaskFeature;
import org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.util.JbpmModelUtil;
import org.eclipse.bpmn2.modeler.ui.editor.BPMN2Editor;
import org.eclipse.bpmn2.modeler.ui.features.activity.task.TaskFeatureContainer;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.wst.common.project.facet.core.FacetedProjectFramework;
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
public class SwitchYardCustomTaskFeatureContainer extends JbpmCustomTaskFeatureContainer {

    @Override
    public boolean isAvailable(IFeatureProvider fp) {
        return isSwitchYardProject(fp);
    }

    @Override
    protected IShapeFeatureContainer createFeatureContainer(IFeatureProvider fp) {

        return new TaskFeatureContainer() {
            @Override
            public ICreateFeature getCreateFeature(final IFeatureProvider fp) {
                return new SwitchYardServiceTaskCreateFeature(fp);
            }

            @Override
            public IAddFeature getAddFeature(IFeatureProvider fp) {
                return new JbpmAddTaskFeature(fp);
            }

        };
    }

    private boolean isSwitchYardProject(IFeatureProvider fp) {
        try {
            BPMN2Editor editor = (BPMN2Editor) fp.getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer();
            return FacetedProjectFramework.hasProjectFacet(editor.getModelFile().getProject(),
                    ISwitchYardFacetConstants.SWITCHYARD_FACET_ID);
        } catch (CoreException e) {
            return false;
        }

    }

    private final class SwitchYardServiceTaskCreateFeature extends JbpmCreateCustomTaskFeature {

        private SwitchYardServiceTaskCreateFeature(IFeatureProvider fp) {
            super(fp);
        }

        @Override
        public boolean isAvailable(IContext context) {
            return super.isAvailable(context) && isSwitchYardProject(fp);
        }

        @Override
        public Task createBusinessObject(ICreateContext context) {
            Task task = (Task) super.createBusinessObject(context);

            Resource resource = ((EObject) getBusinessObjectForPictogramElement(context.getTargetContainer()))
                    .eResource();

            // patch up the input associations. we can't specify input.getId()
            // in the plugin.xml, so we need to add the assignments manually.
            for (DataInputAssociation inputAssociation : task.getDataInputAssociations()) {
                DataInput input = (DataInput) inputAssociation.getTargetRef();
                if ("ParameterName".equals(input.getName()) || "ResultName".equals(input.getName())) { //$NON-NLS-1$ //$NON-NLS-2$
                    addInputAssignment(resource, inputAssociation.getAssignment(), input);
                }
                input.setItemSubjectRef(JbpmModelUtil.getDataType(context.getTargetContainer(), "String"));
            }

            return task;
        }

        private void addInputAssignment(Resource resource, List<Assignment> assignments, DataInput input) {
            if (assignments == null) {
                return;
            }
            for (Assignment assignment : assignments) {
                FormalExpression toExpression = (FormalExpression) assignment.getTo();
                if (toExpression == null) {
                    toExpression = Bpmn2Factory.eINSTANCE.createFormalExpression();
                    ModelUtil.setID(toExpression, resource);
                }
                toExpression.setBody(input.getId());
                return;
            }
        }

    }
}
