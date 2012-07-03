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
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class JavaTransformComposite extends BaseTransformComposite {

    private Text _classText;
    private Button _browseButton;

    @Override
    public void createContents(Composite parent, int style) {
        super.createContents(parent, style);
        Composite inner = new Composite(getPanel(), SWT.NONE);
        GridData innerGD = new GridData(SWT.FILL, SWT.NULL, true, false, 2, 1);
        innerGD.horizontalIndent = -5;
        innerGD.verticalIndent = -5;
        inner.setLayoutData(innerGD);
        inner.setLayout(new GridLayout(3, false));
        _classText = createLabelAndText(inner, "Class");

        _browseButton = new Button(inner, SWT.PUSH);
        _browseButton.setText("Browse...");
        _browseButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleBrowse();
                validate();
                fireChangedEvent(_browseButton);
            }

        });
    }

    protected boolean validate() {
        super.validate();
        if (getErrorMessage() == null) {
            // check to see if context path is valid Java class
            if (_classText.getText().trim().isEmpty()) {
                setErrorMessage("Java transform class must be specified.");
            } else {
                try {
                    if (canFindClass(_classText.getText().trim()) == null) {
                        setErrorMessage("Class specified must exist in project.");
                    }
                } catch (JavaModelException e) {
                    e.fillInStackTrace();
                }
            }
        }
        return (getErrorMessage() == null);
    }

    private IType canFindClass(String classname) throws JavaModelException {
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
        if (project != null && classname != null) { //$NON-NLS-1$
            IJavaProject javaProject = JavaCore.create(project);
            IType superType = javaProject.findType(classname);
            if (superType != null) {
                return superType;
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
        if (control.equals(_classText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        ((JavaTransformType1) getTransform()).setClass(_classText.getText().trim());
                    }
                });
            } else {
                ((JavaTransformType1) getTransform()).setClass(_classText.getText().trim());
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
        JavaTransformType1 javaTransform = (JavaTransformType1) getTransform();
        if (_classText != null && !_classText.isDisposed() && javaTransform.getClass_() != null) {
            _classText.setText(javaTransform.getClass_());
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
                JavaTransformType1 javaTransform = (JavaTransformType1) getTransform();
                if (control.equals(_classText)) {
                    _classText.setText(javaTransform.getClass_());
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

    private void handleBrowse() {
        IJavaSearchScope scope = null;
        IProject project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
        IJavaProject javaProject = JavaCore.create(project);
        if (javaProject == null) {
            scope = SearchEngine.createWorkspaceScope();
        } else {
            scope = SearchEngine.createJavaSearchScope(new IJavaElement[] {javaProject });
        }
        try {
            SelectionDialog dialog = JavaUI.createTypeDialog(Display.getCurrent().getActiveShell(), null, scope,
                    IJavaElementSearchConstants.CONSIDER_CLASSES, false);
            if (dialog.open() == SelectionDialog.OK) {
                Object[] result = dialog.getResult();
                if (result.length > 0 && result[0] instanceof IType) {
                    IType clazz = (IType) result[0];
                    _classText.setText(clazz.getFullyQualifiedName());
                    handleModify(_classText);
                }
            }
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
    }
}
