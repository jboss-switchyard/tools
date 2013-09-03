/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.shared;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;
import org.switchyard.tools.ui.editor.Messages;

/**
 * @author bfitzpat
 *
 */
class FindResourceDialog extends FilteredResourcesSelectionDialog {
    private IJavaModel _fJavaModel;

    public FindResourceDialog(Shell parentShell, IContainer container) {
        super(parentShell, false, container, IResource.FILE | IResource.FOLDER | IResource.PROJECT);
        _fJavaModel = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot());
        setTitle(Messages.title_findWorkspaceFile);
    }

    @Override
    protected ItemsFilter createFilter() {
        return new FindResourceFilter();
    }
    
    private class FindResourceFilter extends ResourceFilter {

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog.
         * ResourceFilter#matchItem(java.lang.Object)
         */
        @Override
        public boolean matchItem(Object item) {
            IResource resource = (IResource) item;
            return super.matchItem(item) && select(resource);
        }

        private boolean isParentOnClassPath(IJavaProject javaProject, IResource resource) {
            boolean flag = false;
            while (!flag && resource.getParent() != null) {
                flag = javaProject.isOnClasspath(resource);
                if (!flag) {
                    resource = resource.getParent();
                } else {
                    return flag;
                }
            }
            return flag;
        }
        
        /**
         * This is the orignal <code>select</code> method. Since
         * <code>GotoResourceDialog</code> needs to extend
         * <code>FilteredResourcesSelectionDialog</code> result of this
         * method must be combined with the <code>matchItem</code> method
         * from super class (<code>ResourceFilter</code>).
         * 
         * @param resource A resource
         * @return <code>true</code> if item matches against given
         *         conditions <code>false</code> otherwise
         */
        private boolean select(IResource resource) {
            IProject project = resource.getProject();
            IJavaProject javaProject = JavaCore.create(project);
            if (javaProject != null) {
                if (!isParentOnClassPath(javaProject, resource)) {
                    return false;
                }
            }
            
            try {
                if (project.getNature(JavaCore.NATURE_ID) != null) {
                    return _fJavaModel.contains(resource);
                }
            } catch (CoreException e) {
                // do nothing. Consider resource;
                e.fillInStackTrace();
            }
            return true;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog.
         * ResourceFilter
         * #equalsFilter(org.eclipse.ui.dialogs.FilteredItemsSelectionDialog
         * .ItemsFilter)
         */
        @Override
        public boolean equalsFilter(ItemsFilter filter) {
            if (!super.equalsFilter(filter)) {
                return false;
            }
            if (!(filter instanceof FindResourceFilter)) {
                return false;
            }
            return true;
        }
    }

}
