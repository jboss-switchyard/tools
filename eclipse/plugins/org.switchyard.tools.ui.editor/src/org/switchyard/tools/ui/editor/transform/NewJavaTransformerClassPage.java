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
package org.switchyard.tools.ui.editor.transform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaConventions;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.CodeGeneration;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.Messages;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * NewJavaTransformerClassPage
 * 
 * <p/>
 * Wizard page for collecting information required to create Java based
 * transformer implementations.
 */
public class NewJavaTransformerClassPage extends NewTypeWizardPage {

    private static final String XML_ESB_TYPE = "XML_ESB_TYPE"; //$NON-NLS-1$
    private static final List<String> XML_ESB_TYPES = Arrays.asList(Element.class.getCanonicalName(),
            Document.class.getCanonicalName(), Node.class.getCanonicalName(), String.class.getCanonicalName(),
            "org.switchyard.Message", Object.class.getCanonicalName()); //$NON-NLS-1$

    private Collection<TransformType> _transforms;
    private IStatus _xmlESBTypeStatus = Status.OK_STATUS;
    private XMLESBTypeComboViewer _xmlESBTypeList;
    private String _xmlESBType = XML_ESB_TYPES.get(0);

    /**
     * Create a new NewJavaTransformerClassPage.
     */
    public NewJavaTransformerClassPage() {
        super(true, NewTransformWizardPage.class.getCanonicalName());
        setTitle(Messages.title_newJavaTransformerClass);
        setDescription(Messages.description_newJavaTransformerClass);
    }

    /**
     * @param project the containing project
     */
    public void init(IProject project) {
        IJavaElement initialElement = JavaUtil.getInitialPackageForProject(JavaCore.create(project));
        initContainerPage(initialElement);
        initTypePage(initialElement);

        setModifiers(Flags.AccPublic | Flags.AccFinal, false);

        doStatusUpdate();
    }

    protected void setSelectedTransforms(Collection<TransformType> transforms) {
        _transforms = transforms;
    }

    @Override
    public void createControl(Composite parent) {
        initializeDialogUnits(parent);

        Composite composite = new Composite(parent, SWT.NONE);
        composite.setFont(parent.getFont());

        int nColumns = 4;

        GridLayout layout = new GridLayout();
        layout.numColumns = nColumns;
        composite.setLayout(layout);

        // pick & choose the wanted UI components
        createContainerControls(composite, nColumns);
        createPackageControls(composite, nColumns);

        createSeparator(composite, nColumns);

        createTypeNameControls(composite, nColumns);
        createModifierControls(composite, nColumns);
        createSuperClassControls(composite, nColumns);
        createXMLESBTypeControls(composite, nColumns);

        createSeparator(composite, nColumns);

        createCommentControls(composite, nColumns);
        enableCommentControl(true);

        setControl(composite);

        Dialog.applyDialogFont(composite);
    }

    private void createXMLESBTypeControls(Composite composite, int nColumns) {
        final Label label = new Label(composite, SWT.NONE);
        label.setText(Messages.label_forXmlEsbTypesUse);

        _xmlESBTypeList = new XMLESBTypeComboViewer(composite);
        _xmlESBTypeList.getCombo().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _xmlESBTypeList.setLabelProvider(new LabelProvider());
        _xmlESBTypeList.setContentProvider(ArrayContentProvider.getInstance());
        _xmlESBTypeList.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, nColumns - 2, 1));
        _xmlESBTypeList.setInput(XML_ESB_TYPES);
        if (_xmlESBType != null) {
            _xmlESBTypeList.setSelection(new StructuredSelection(_xmlESBType));
        }
        _xmlESBTypeList.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                handleFieldChanged(XML_ESB_TYPE);
            }
        });

        final Button button = new Button(composite, SWT.PUSH);
        button.setText(Messages.button_browse);
        button.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
        button.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                browseXMLESBType();
            }
        });
    }

    @Override
    protected void handleFieldChanged(String fieldName) {
        super.handleFieldChanged(fieldName);

        if (fieldName == XML_ESB_TYPE) {
            _xmlESBType = _xmlESBTypeList.getSelection().isEmpty() ? "" : ((IStructuredSelection) _xmlESBTypeList //$NON-NLS-1$
                    .getSelection()).getFirstElement().toString();
            validateXMLESBType();
        }
        doStatusUpdate();
    }

    private void doStatusUpdate() {
        // status of all used components
        IStatus[] status = new IStatus[] {fContainerStatus, fPackageStatus, fTypeNameStatus, fModifierStatus,
                fSuperClassStatus, fSuperInterfacesStatus, _xmlESBTypeStatus };

        updateStatus(status);
    }

    private void validateXMLESBType() {
        if (_xmlESBType == null || _xmlESBType.length() == 0) {
            _xmlESBTypeStatus = new Status(Status.ERROR, Activator.PLUGIN_ID,
                    Messages.error_selectJavaTypeforXmlEsbTypes);
            return;
        }
        IJavaProject javaProject = getJavaProject();
        if (javaProject == null) {
            _xmlESBTypeStatus = JavaConventions.validateJavaTypeName(_xmlESBType, JavaCore.VERSION_1_5,
                    JavaCore.VERSION_1_5);
            return;
        } else {
            try {
                if (javaProject.findType(_xmlESBType) != null) {
                    _xmlESBTypeStatus = Status.OK_STATUS;
                    return;
                }
            } catch (JavaModelException e) {
                e.fillInStackTrace();
            }
        }
        _xmlESBTypeStatus = new Status(Status.WARNING, Activator.PLUGIN_ID,
                Messages.error_selectedXmlEsbTypeNotOnClasspath);
    }

    private void browseXMLESBType() {
        IJavaProject project = getJavaProject();
        if (project == null) {
            return;
        }

        try {
            IJavaElement[] elements = new IJavaElement[] {project };
            IJavaSearchScope scope = SearchEngine.createJavaSearchScope(elements);
            String filter = _xmlESBType == null ? "" : _xmlESBType; //$NON-NLS-1$
            SelectionDialog dialog = JavaUI.createTypeDialog(getShell(), getContainer(), scope,
                    IJavaElementSearchConstants.CONSIDER_CLASSES, false, filter);
            dialog.setTitle(Messages.title_selectXmlEsbType);
            dialog.setMessage(Messages.description_selectXmlEsbType);

            if (dialog.open() == Window.OK) {
                _xmlESBTypeList.setSelection(new StructuredSelection(((IType) dialog.getResult()[0])
                        .getFullyQualifiedName()));
            }
        } catch (JavaModelException e) {
            Activator.logStatus(e.getStatus());
        }
    }

    private final class XMLESBTypeComboViewer extends ComboViewer {
        private XMLESBTypeComboViewer(Composite parent) {
            super(parent, SWT.DROP_DOWN);
            getCombo().addModifyListener(new ModifyListener() {
                @Override
                public void modifyText(ModifyEvent e) {
                    SelectionChangedEvent event = new SelectionChangedEvent(XMLESBTypeComboViewer.this, getSelection());
                    fireSelectionChanged(event);
                }
            });
        }

        @Override
        protected List<?> getSelectionFromWidget() {
            if (getCombo().getSelectionIndex() < 0) {
                List<String> selected = new ArrayList<String>();
                try {
                    selected.add(getCombo().getText());
                } catch (Exception e) {
                    e.fillInStackTrace();
                }
                return selected;
            }
            return super.getSelectionFromWidget();
        }

        @Override
        protected void setSelectionToWidget(ISelection selection, boolean reveal) {
            if (!selection.isEmpty() && XML_ESB_TYPES != null) {
                Object obj = ((IStructuredSelection) selection).getFirstElement();
                if (!XML_ESB_TYPES.contains(obj)) {
                    getCombo().setText(obj.toString());
                    return;
                }
            }
            super.setSelectionToWidget(selection, reveal);
        }
    }

    @Override
    protected void createTypeMembers(IType type, ImportsManager imports, IProgressMonitor monitor) throws CoreException {
        final String lineDelimiter = getJavaProject().getJavaModel().findRecommendedLineSeparator();
        final Set<String> methodNames = new HashSet<String>();
        for (TransformType transform : _transforms) {
            createTransformMethod(type, transform, type.getCompilationUnit(), imports, lineDelimiter, methodNames,
                    monitor);
        }

        if (monitor != null) {
            monitor.done();
        }
    }

    private void createTransformMethod(IType type, TransformType transform, ICompilationUnit cu,
            ImportsManager imports, String lineDelimiter, Collection<String> methodNames, IProgressMonitor monitor)
            throws CoreException {
        final String typeName = type.getFullyQualifiedName();
        final TypeHelper fromType = new TypeHelper(QName.valueOf(transform.getFrom()));
        final TypeHelper toType = new TypeHelper(QName.valueOf(transform.getTo()));
        final String methodName = createTransformMethodName(fromType, toType, methodNames);
        final String body = "return null;"; //$NON-NLS-1$
        final StringBuffer methodText = new StringBuffer();
        createMethodAnnotation(methodText, fromType, toType, imports, lineDelimiter);
        createMethodSignature(methodText, methodName, fromType, toType, imports, lineDelimiter);
        try {
            methodText
                    .append(CodeGeneration.getMethodBodyContent(cu, typeName, methodName, false, body, lineDelimiter));
        } catch (CoreException e) {
            methodText.append(body);
        }
        methodText.append("}"); //$NON-NLS-1$

        type.createMethod(methodText.toString(), null, false, new SubProgressMonitor(monitor, 1));
    }

    private String createTransformMethodName(TypeHelper fromType, TypeHelper toType, Collection<String> names) {
        final String baseName = "transform" + getSimpleTypeName(fromType) + "To" + getSimpleTypeName(toType); //$NON-NLS-1$ //$NON-NLS-2$
        String name = baseName;
        int count = 1;
        while (names.contains(name)) {
            name = baseName + count++;
        }
        names.add(name);
        return name;
    }

    private String getSimpleTypeName(TypeHelper type) {
        String name;
        if (type._annotationType == null) {
            final int lastDot = type._methodType.lastIndexOf('.');
            if (lastDot >= 0) {
                name = type._methodType.substring(lastDot + 1);
            } else {
                name = type._methodType;
            }
        } else {
            name = QName.valueOf(type._annotationType).getLocalPart();
        }
        if (name.length() == 0) {
            name = "_"; //$NON-NLS-1$
        } else if (Character.isLowerCase(name.charAt(0))) {
            name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        }
        return name;
    }

    private void createMethodAnnotation(StringBuffer methodText, TypeHelper fromType, TypeHelper toType,
            ImportsManager imports, String lineDelimiter) {
        methodText.append("@").append(imports.addImport("org.switchyard.annotations.Transformer")); //$NON-NLS-1$ //$NON-NLS-2$
        if (fromType._annotationType != null) {
            methodText.append("(from=\"").append(fromType._annotationType).append('"'); //$NON-NLS-1$
            if (toType._annotationType != null) {
                methodText.append(", to=\"").append(toType._annotationType).append('"'); //$NON-NLS-1$
            }
            methodText.append(")"); //$NON-NLS-1$
        } else if (toType._annotationType != null) {
            methodText.append("(to=\"").append(toType._annotationType).append("\")"); //$NON-NLS-1$ //$NON-NLS-2$
        }
        methodText.append(lineDelimiter);
    }

    private void createMethodSignature(StringBuffer methodText, String methodName, TypeHelper fromType,
            TypeHelper toType, ImportsManager imports, String lineDelimiter) {
        methodText.append("public ").append(imports.addImport(toType._methodType)).append(" ").append(methodName) //$NON-NLS-1$ //$NON-NLS-2$
                .append("(").append(imports.addImport(fromType._methodType)).append(" from) {").append(lineDelimiter); //$NON-NLS-1$ //$NON-NLS-2$
    }

    private final class TypeHelper {
        private String _annotationType;
        private String _methodType;

        private TypeHelper(QName type) {
            if (type.getLocalPart().startsWith("java:")) { //$NON-NLS-1$
                _methodType = type.getLocalPart().substring(5);
                _annotationType = null;
            } else {
                _methodType = _xmlESBType;
                _annotationType = type.toString();
            }
        }
    }
}
