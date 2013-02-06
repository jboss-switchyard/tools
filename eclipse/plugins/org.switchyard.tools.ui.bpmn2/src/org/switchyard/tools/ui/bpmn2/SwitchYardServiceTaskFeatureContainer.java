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

import org.eclipse.bpmn2.modeler.core.features.FeatureContainer;
import org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.features.JbpmCustomTaskFeatureContainer;
import org.eclipse.bpmn2.modeler.ui.editor.BPMN2Editor;
import org.eclipse.bpmn2.modeler.ui.features.activity.task.TaskFeatureContainer;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.wst.common.project.facet.core.FacetedProjectFramework;
import org.switchyard.tools.ui.facets.ISwitchYardFacetConstants;
import org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.features.JbpmTaskFeatureContainer.JbpmAddTaskFeature;

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
	public boolean isAvailable(IFeatureProvider fp) {
		return isSwitchYardProject(fp);
	}

	@Override
	protected FeatureContainer createFeatureContainer(IFeatureProvider fp) {
		
		return new TaskFeatureContainer() {
			@Override
			public ICreateFeature getCreateFeature(final IFeatureProvider fp) {
				return new JbpmCreateCustomTaskFeature(fp) {

					@Override
					public boolean isAvailable(IContext context) {
						return super.isAvailable(context) && isSwitchYardProject(fp);
					}
			    };
			}
			
			@Override
			public IAddFeature getAddFeature(IFeatureProvider fp) {
		        return new JbpmAddTaskFeature(fp);
			}
			
			@Override
			public ICustomFeature[] getCustomFeatures(IFeatureProvider fp) {
				return new ICustomFeature[] {new ConfigureWorkItemFeature(fp)};
			}

		};
	}

    private boolean isSwitchYardProject(IFeatureProvider fp) {
        try {
        	BPMN2Editor editor = (BPMN2Editor)fp.getDiagramTypeProvider().getDiagramEditor();
            return FacetedProjectFramework.hasProjectFacet(
            		editor.getModelFile().getProject(),
                    ISwitchYardFacetConstants.SWITCHYARD_FACET_ID);
        } catch (CoreException e) {
            return false;
        }

    }
}
