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
package org.switchyard.tools.ui.editor.transform.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class JAXBTransformComposite extends BaseTransformComposite {

    private Text _contextPathText;

    @Override
    public void createContents(Composite parent, int style) {
        super.createContents(parent, style);
        _contextPathText = createLabelAndText(getPanel(), "Context Path");
    }

    protected boolean validate() {
        super.validate();
        if (getErrorMessage() == null) {
            // check to see if context path is valid Java class
            if (!_contextPathText.getText().trim().isEmpty()) {
                try {
                    if (canFindPackage(_contextPathText.getText().trim()) == null) {
                        setErrorMessage("Package specified as context path must exist in project.");
                    }
                } catch (JavaModelException e) {
                    e.fillInStackTrace();
                }
            }
        }
        return (getErrorMessage() == null);
    }
    
    private IPackageFragment canFindPackage(String packagename) throws JavaModelException {
        IProject project = null;
        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
                .getSelection();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        if (selection instanceof IStructuredSelection) {
            selectionToPass = (IStructuredSelection) selection;
            if (selectionToPass.getFirstElement() instanceof IFile) {
                project = ((IFile) selectionToPass.getFirstElement()).getProject();
            }
        }
        if (selectionToPass == StructuredSelection.EMPTY) {
            project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
        }
        if (project != null && packagename != null) { //$NON-NLS-1$
            IJavaProject javaProject = JavaCore.create(project);
            String packageNameForPath = packagename.replace('.', '/');
            IPath packagePath = new Path(packageNameForPath);
            IJavaElement javaEl = javaProject.findElement(packagePath);
            if (javaEl != null && javaEl instanceof IPackageFragment) {
                return (IPackageFragment) javaEl;
            }
        }
        return null;
    }


    @SuppressWarnings("restriction")
    protected void handleModify(final Control control) {
        TransactionalEditingDomain domain = null;
        if (getTransform().eContainer() != null) {
            domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
        }
        if (control.equals(_contextPathText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        ((JAXBTransformType) getTransform()).setContextPath(_contextPathText.getText().trim());
                    }
                });
            } else {
                ((JAXBTransformType) getTransform()).setContextPath(_contextPathText.getText().trim());
            }
        } else {
            super.handleModify(control);
        }
        validate();
    }

    /**
     * @param transform incoming transform type
     */
    public void setTransform(TransformType transform) {
        super.setTransform(transform);
        setInUpdate(true);
        JAXBTransformType jaxbTransform = (JAXBTransformType) getTransform();
        if (_contextPathText != null && !_contextPathText.isDisposed() && jaxbTransform.getContextPath() != null) {
            _contextPathText.setText(jaxbTransform.getContextPath());
        }
        setInUpdate(false);
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (getTransform() != null && !inUpdate()) {
            validate();
            handleModify((Control) e.getSource());
            fireChangedEvent((Control) e.getSource());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.keyCode == SWT.ESC) {
            // cancel out and return to original value
            setInUpdate(true);
            if (getTransform() != null) {
                Control control = (Control) e.getSource();
                JAXBTransformType jaxbTransform = (JAXBTransformType) getTransform();
                if (control.equals(_contextPathText)) {
                    _contextPathText.setText(jaxbTransform.getContextPath());
                }
            }
            setInUpdate(false);
        } else if (e.keyCode == SWT.CR) {
            // accept change
            if (getTransform() != null && !inUpdate()) {
                validate();
                handleModify((Control) e.getSource());
                fireChangedEvent((Control) e.getSource());
            }
        }
    }
}
