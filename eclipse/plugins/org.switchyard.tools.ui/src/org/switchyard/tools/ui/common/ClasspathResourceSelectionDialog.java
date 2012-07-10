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
package org.switchyard.tools.ui.common;

import java.util.Collections;
import java.util.Set;

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

/**
 * Allows user to select a resource on the project's classpath.
 * 
 * @author bfitzpat
 * @author Rob Cernich
 */
public class ClasspathResourceSelectionDialog extends FilteredResourcesSelectionDialog {

    private Set<String> _fileExtensions;
    private IJavaModel _fJavaModel;

    /**
     * Create a new ClasspathResourceSelectionDialog.
     * 
     * @param parentShell the parent shell
     * @param container the root container
     */
    public ClasspathResourceSelectionDialog(Shell parentShell, IContainer container) {
        this(parentShell, container, Collections.<String> emptySet());
    }

    /**
     * Create a new ClasspathResourceSelectionDialog.
     * 
     * @param parentShell the parent shell
     * @param container the root container
     * @param fileExtension the type of files to display; may be null
     */
    public ClasspathResourceSelectionDialog(Shell parentShell, IContainer container, String fileExtension) {
        this(parentShell, container, fileExtension == null ? Collections.<String> emptySet() : Collections
                .singleton(fileExtension));
    }

    /**
     * Create a new ClasspathResourceSelectionDialog.
     * 
     * @param parentShell the parent shell
     * @param container the root container
     * @param fileExtensions the types of files to display; may be null
     */
    public ClasspathResourceSelectionDialog(Shell parentShell, IContainer container, Set<String> fileExtensions) {
        super(parentShell, false, container, IResource.FILE);
        _fJavaModel = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot());
        _fileExtensions = fileExtensions == null ? Collections.<String> emptySet() : fileExtensions;
        setTitle("Select Resource");
    }

    @Override
    protected ItemsFilter createFilter() {
        return new ClasspathResourceFilter();
    }

    private class ClasspathResourceFilter extends ResourceFilter {

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog.
         * ResourceFilter#matchItem(java.lang.Object)
         */
        @Override
        public boolean matchItem(Object item) {
            IResource resource = (IResource) item;
            return super.matchItem(item)
                    && (_fileExtensions == null || _fileExtensions.isEmpty() || _fileExtensions.contains(resource
                            .getFullPath().getFileExtension())) && select(resource);
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
         * <code>FilteredResourcesSelectionDialog</code> result of this method
         * must be combined with the <code>matchItem</code> method from super
         * class (<code>ResourceFilter</code>).
         * 
         * @param resource A resource
         * @return <code>true</code> if item matches against given conditions
         *         <code>false</code> otherwise
         */
        private boolean select(IResource resource) {
            IProject project = resource.getProject();
            IJavaProject javaProject = JavaCore.create(project);
            try {
                return (javaProject != null && isParentOnClassPath(javaProject, resource))
                        || (project.getNature(JavaCore.NATURE_ID) != null && _fJavaModel.contains(resource));
            } catch (CoreException e) {
                return false;
            }
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
            return filter instanceof ClasspathResourceFilter && super.equalsFilter(filter);
        }
    }

}
