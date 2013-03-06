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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.AnnotationVisitor;

/**
 * @author bfitzpat
 * 
 */
public class JavaTransformComposite extends BaseTransformComposite {

    private Text _classText;
    private Button _browseButton;
    private Text _beanText;
    private Button _browseBeanButton;

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
                handleBrowse(_classText);
                validate();
                fireChangedEvent(_browseButton);
            }

        });
        _beanText = createLabelAndText(inner, "Bean");

        _browseBeanButton = new Button(inner, SWT.PUSH);
        _browseBeanButton.setText("Browse...");
        _browseBeanButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleBrowse(_beanText);
                validate();
                fireChangedEvent(_browseBeanButton);
            }

        });
    }

    protected boolean validate() {
        super.validate();
        if (getErrorMessage() == null) {

            String className = _classText.getText().trim();

            // check to see if context path is valid Java class
            if (className.isEmpty()) {
                setErrorMessage("Java transform class must be specified.");
            } else {
                try {
                    if (canFindClass(className) == null) {
                        setErrorMessage("Class specified must exist in project.");
                    }
                } catch (JavaModelException e) {
                    e.fillInStackTrace();
                }
            }
            if (!className.isEmpty()) {
                IProject project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
                try {
                    boolean hasRightLineage = classHasRightAnnotationsOrSuperclass(project, className);
                    if (!hasRightLineage) {
                        setErrorMessage("Class specified must use the @Transformer annotation or implement the org.switchyard.transform.Transformer interface.");
                    }
                } catch (CoreException e) {
                    e.printStackTrace();
                }
            }
        }
        return (getErrorMessage() == null);
    }

    protected void handleModify(final Control control) {
        super.handleModify(control);
        if (control.equals(_classText)) {
            updateFeature((JavaTransformType1) getTransform(), "class", _classText.getText().trim());
        } else if (control.equals(_beanText)) {
            updateFeature((JavaTransformType1) getTransform(), "bean", _beanText.getText().trim());
        } else {
            super.handleModify(control);
        }
        validate();
    }

    protected void handleUndo(Control control) {
        super.handleUndo(control);
        setInUpdate(true);
        if (getTransform() != null) {
            JavaTransformType1 javaTransform = (JavaTransformType1) getTransform();
            if (control.equals(_classText)) {
                _classText.setText(javaTransform.getClass_());
            } else if (control.equals(_beanText)) {
                _beanText.setText(javaTransform.getBean());
            }
        }
        setInUpdate(false);
    }

    /**
     * @param transform incoming transform type
     */
    public void setTransform(TransformType transform) {
        super.setTransform(transform);
        setInUpdate(true);
        JavaTransformType1 javaTransform = (JavaTransformType1) getTransform();
        setTextValue(_classText, javaTransform.getClass_());
        setTextValue(_beanText, javaTransform.getBean());
        setInUpdate(false);
        addObservableListeners();
    }

    private void handleBrowse(final Text control) {
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
                    control.setText(clazz.getFullyQualifiedName());
                    handleModify(control);
                }
            }
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
    }

    private boolean classHasRightAnnotationsOrSuperclass(IProject project, String className) throws JavaModelException {
        IType classType = JavaCore.create(project).findType(className);

        boolean isTransformClass = false;
        String[] interfaceSignatures = classType.getSuperInterfaceNames();
        for (String signature : interfaceSignatures) {
            if (signature.contentEquals("Transformer")) {
                isTransformClass = true;
                break;
            }
        }

        ICompilationUnit cu = classType.getCompilationUnit();
        CompilationUnit parse = parse(cu);
        AnnotationVisitor visitor = new AnnotationVisitor("Transformer");
        parse.accept(visitor);

        boolean hasTransformAnnotation = visitor.didFindOne();

        if (isTransformClass || hasTransformAnnotation) {
            return true;
        }
        return false;
    }

    /**
     * Reads a ICompilationUnit and creates the AST DOM for manipulating the
     * Java source file
     * 
     * @param unit
     * @return
     */
    private static CompilationUnit parse(ICompilationUnit unit) {
        ASTParser parser = ASTParser.newParser(AST.JLS4);
        parser.setKind(ASTParser.K_COMPILATION_UNIT);
        parser.setSource(unit);
        parser.setResolveBindings(true);
        return (CompilationUnit) parser.createAST(null); // parse
    }

}
