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
package org.switchyard.tools.ui.editor.validator.wizards;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.models.switchyard1_0.validate.JavaValidateType;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class JavaValidatorComposite extends BaseValidatorComposite {

    private Text _classText;
    private Button _browseButton;
    private Text _beanText;
//    private Button _browseBeanButton;
    private Button _javaClassOption;
    private Button _beanOption;

    @Override
    public void createContents(Composite parent, int style) {
        super.createContents(parent, style);
        
        new Label(getPanel(), SWT.NONE); // spacer
        
        Group inner = new Group(getPanel(), SWT.NONE);
        inner.setText("Java Validator Type");
        GridData innerGD = new GridData(SWT.FILL, SWT.NULL, true, false, 2, 1);
        innerGD.horizontalIndent = -5;
        innerGD.verticalIndent = -5;
        inner.setLayoutData(innerGD);
        inner.setLayout(new GridLayout(3, false));
        
        _javaClassOption = new Button(inner, SWT.RADIO);
        _javaClassOption.addSelectionListener(new SelectionListener(){

            @Override
            public void widgetDefaultSelected(SelectionEvent arg0) {
            }

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                handleSelectedOption(_javaClassOption);
            }
        });
        _javaClassOption.setText("Java Class");
        addGridData(_javaClassOption, 3, SWT.NONE);
        
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

        _beanOption = new Button(inner, SWT.RADIO);
        _beanOption.addSelectionListener(new SelectionListener(){

            @Override
            public void widgetDefaultSelected(SelectionEvent arg0) {
            }

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                handleSelectedOption(_beanOption);
            }
        });
        _beanOption.setText("Bean");
        addGridData(_beanOption, 3, SWT.NONE);

        _beanText = createLabelAndText(inner, "Name");
        addGridData(_beanText, 2, GridData.FILL_HORIZONTAL);

//        _browseBeanButton = new Button(inner, SWT.PUSH);
//        _browseBeanButton.setText("Browse...");
//        _browseBeanButton.addSelectionListener(new SelectionAdapter() {
//            @Override
//            public void widgetSelected(SelectionEvent e) {
//                handleBrowse(_beanText);
//                validate();
//                fireChangedEvent(_browseBeanButton);
//            }
//
//        });
        
        _javaClassOption.setSelection(true);
        handleSelectedOption(_javaClassOption);
    }
    
    private void handleSelectedOption(Control selected) {
        boolean classSelected = selected.equals(_javaClassOption);
        _classText.setEnabled(classSelected);
        _browseButton.setEnabled(classSelected);
        _beanText.setEnabled(!classSelected);
    }

    protected boolean validate() {
        super.validate();
        if (getErrorMessage() == null) {
            String className = _classText.getText().trim();
            String beanName = _beanText.getText().trim();

            // check to see if class is valid
            if (className.isEmpty() && beanName.isEmpty()) {
                setErrorMessage("Java validator class or bean name must be specified.");
//            } else {
//                try {
//                    if (canFindClass(className) == null) {
//                        setErrorMessage("Class specified must exist in project.");
//                    }
//                } catch (JavaModelException e) {
//                    e.fillInStackTrace();
//                }
            }
//            if (!className.isEmpty()) {
//                IProject project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
//                try {
//                    boolean hasRightLineage = classHasRightAnnotationsOrSuperclass(project, className);
//                    if (!hasRightLineage) {
//                        setErrorMessage("Class specified must use the @Transformer annotation or implement the org.switchyard.transform.Transformer interface.");
//                    }
//                } catch (CoreException e) {
//                    e.printStackTrace();
//                }
//            }
        }
        return (getErrorMessage() == null);
    }

//    private IType canFindClass(String classname) throws JavaModelException {
//        IProject project = null;
//        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
//                .getSelection();
//        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
//        if (selection instanceof IStructuredSelection) {
//            selectionToPass = (IStructuredSelection) selection;
//            if (selectionToPass.getFirstElement() instanceof IFile) {
//                project = ((IFile) selectionToPass.getFirstElement()).getProject();
//            }
//        }
//        if (selectionToPass == StructuredSelection.EMPTY) {
//            project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
//        }
//        if (project != null && classname != null) { //$NON-NLS-1$
//            IJavaProject javaProject = JavaCore.create(project);
//            IType superType = javaProject.findType(classname);
//            if (superType != null) {
//                return superType;
//            }
//        }
//        return null;
//    }

    protected void updateFeature(EObject eObject, String featureId, Object value, String removeFeatureId) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new BasicEObjectOperation(eObject, featureId, value));
        ops.add(new BasicEObjectOperation(eObject, removeFeatureId, null));
        wrapOperation(ops);
    }

    protected void handleModify(final Control control) {
        super.handleModify(control);
        if (control.equals(_classText)) {
            updateFeature((JavaValidateType) getValidator(), "class", _classText.getText().trim(), "bean");
        } else if (control.equals(_beanText)) {
                updateFeature((JavaValidateType) getValidator(), "bean", _beanText.getText().trim(), "class");
        } else {
            super.handleModify(control);
        }
        validate();
    }

    protected void handleUndo(final Control control) {
        super.handleUndo(control);
        setInUpdate(true);
        if (getValidator() != null) {
            JavaValidateType javaValidator = (JavaValidateType) getValidator();
            if (control.equals(_classText)) {
                _classText.setText(javaValidator.getClass_());
            } else if (control.equals(_beanText)) {
                _beanText.setText(javaValidator.getBean());
            }
        }
        setInUpdate(false);
    }    
    
    /**
     * @param validator incoming transform type
     */
    public void setValidator(ValidateType validator) {
        super.setValidator(validator);
        setInUpdate(true);
        JavaValidateType javaValidator = (JavaValidateType) getValidator();
        if (javaValidator != null) {
            if (javaValidator.getClass_() != null) {
                setTextValue(_classText, javaValidator.getClass_());
                _beanOption.setSelection(false);
                _javaClassOption.setSelection(true);
                handleSelectedOption(_javaClassOption);
            } else if (javaValidator.getBean() != null) {
                setTextValue(_beanText, javaValidator.getBean());
                _beanOption.setSelection(true);
                _javaClassOption.setSelection(false);
                handleSelectedOption(_beanOption);
            }
        }
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

//    private boolean classHasRightAnnotationsOrSuperclass(IProject project, String className) throws JavaModelException {
//        IType classType = JavaCore.create(project).findType(className);
//
//        boolean isTransformClass = false;
//        String[] interfaceSignatures = classType.getSuperInterfaceNames();
//        for (String signature : interfaceSignatures) {
//            if (signature.contentEquals("Validator")) {
//                isTransformClass = true;
//                break;
//            }
//        }
//
//        ICompilationUnit cu = classType.getCompilationUnit();
//        CompilationUnit parse = parse(cu);
//        AnnotationVisitor visitor = new AnnotationVisitor("Validator");
//        parse.accept(visitor);
//
//        boolean hasTransformAnnotation = visitor.didFindOne();
//
//        if (isTransformClass || hasTransformAnnotation) {
//            return true;
//        }
//        return false;
//    }
//
//    /**
//     * Reads a ICompilationUnit and creates the AST DOM for manipulating the
//     * Java source file
//     * 
//     * @param unit
//     * @return
//     */
//    private static CompilationUnit parse(ICompilationUnit unit) {
//        ASTParser parser = ASTParser.newParser(AST.JLS4);
//        parser.setKind(ASTParser.K_COMPILATION_UNIT);
//        parser.setSource(unit);
//        parser.setResolveBindings(true);
//        return (CompilationUnit) parser.createAST(null); // parse
//    }
}
