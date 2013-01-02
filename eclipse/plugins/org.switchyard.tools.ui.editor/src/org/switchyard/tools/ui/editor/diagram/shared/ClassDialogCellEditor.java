/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.switchyard.tools.ui.editor.diagram.shared;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.ui.editor.Activator;

/**
 * ClassDialogCellEditor
 * 
 * <p/>
 * Cell editor that opens a type selection dialog.
 */
public abstract class ClassDialogCellEditor extends DialogCellEditor {

    private final String _baseType;
    private final String _title;
    private final String _description;

    /**
     * Create a new ClassDialogCellEditor.
     * 
     * @param parent the parent composite.
     * @param baseType the type that must be implemented by the selected class.
     * @param title dialog title.
     * @param description dialog description.
     */
    public ClassDialogCellEditor(Composite parent, String baseType, String title, String description) {
        super(parent);
        _baseType = baseType;
        _title = title;
        _description = description;
    }

    @Override
    protected Object openDialogBox(Control cellEditorWindow) {
        try {
            final Resource resource = getResource();
            final String platformPath = resource == null ? null : resource.getURI().toPlatformString(true);
            final IPath path = platformPath == null ? null : new Path(platformPath);
            final IProject project = path == null || path.segmentCount() == 0 ? null : ResourcesPlugin.getWorkspace()
                    .getRoot().getProject(path.segment(0));
            final IJavaProject javaProject = project == null || !project.exists() || !project.isOpen() ? null
                    : JavaCore.create(project);
            final IType type = javaProject == null ? null : javaProject.findType(_baseType);
            final SelectionDialog dialog = JavaUI.createTypeDialog(cellEditorWindow.getShell(), PlatformUI
                    .getWorkbench().getProgressService(), javaProject == null ? SearchEngine.createWorkspaceScope()
                    : SearchEngine.createStrictHierarchyScope(javaProject, type, true, false, null),
                    IJavaElementSearchConstants.CONSIDER_CLASSES, false, "* ");
            dialog.setTitle(_title);
            dialog.setMessage(_description);

            if (dialog.open() == SelectionDialog.OK) {
                Object[] types = dialog.getResult();

                if (types != null && types.length > 0) {
                    final IType selection = (IType) types[0];
                    return selection.getFullyQualifiedName();
                }
            }
        } catch (JavaModelException e) {
            Activator.logStatus(e.getStatus());
        }

        return null;
    }

    /**
     * @return the resource being edited.
     */
    protected abstract Resource getResource();

}
