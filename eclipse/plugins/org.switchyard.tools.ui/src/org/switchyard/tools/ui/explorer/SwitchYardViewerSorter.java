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
package org.switchyard.tools.ui.explorer;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * SwitchYardViewerSorter
 * 
 * <p/>
 * Sorter for SwitchYard project explorer content.
 * 
 * @author Rob Cernich
 */
public class SwitchYardViewerSorter extends ViewerSorter {

    private static final int SERVICES_CATEGORY = 0;
    private static final int REFERENCES_CATEGORY = 1;
    private static final int COMPONENTS_CATEGORY = 2;
    private static final int ARTIFACTS_CATEGORY = 3;
    private static final int COMPONENT_SERVICES_CATEGORY = 4;
    private static final int COMPONENT_REFERENCES_CATEGORY = 5;

    @Override
    public int category(Object element) {
        if (element instanceof IServicesNode) {
            return SERVICES_CATEGORY;
        } else if (element instanceof IReferencesNode) {
            return REFERENCES_CATEGORY;
        } else if (element instanceof IComponentsNode) {
            return COMPONENTS_CATEGORY;
        } else if (element instanceof IArtifactsNode) {
            return ARTIFACTS_CATEGORY;
        } else if (element instanceof IComponentService) {
            return COMPONENT_SERVICES_CATEGORY;
        } else if (element instanceof IComponentReference) {
            return COMPONENT_REFERENCES_CATEGORY;
        }
        return super.category(element);
    }

}
