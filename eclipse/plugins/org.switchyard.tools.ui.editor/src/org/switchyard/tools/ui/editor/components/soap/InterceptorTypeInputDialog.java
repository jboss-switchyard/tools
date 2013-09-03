/*************************************************************************************
 * Copyright (c) 2013 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.components.soap;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.models.switchyard1_0.soap.InterceptorType;
import org.switchyard.tools.models.switchyard1_0.soap.PropertyType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class InterceptorTypeInputDialog extends TitleAreaDialog {

    private Text _classNameText;
    private Button _browseButton;
    private InterceptorType _interceptor = null;
    private InterceptorPropertyTable _interceptorPropertyTable;

    /**
     * ESBInterfaceInputDialog constructor.
     * 
     * @param parent the parent
     */
    public InterceptorTypeInputDialog(Shell parent) {
        super(parent);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        setTitle(Messages.title_newInterceptorDetails);
        setMessage(Messages.description_newInterceptorDetails);
        getShell().setText(Messages.title_addInterceptor);

        Composite area = new Composite(parent, SWT.NULL);
        GridLayout gridLayout = new GridLayout(3, false);
        area.setLayout(gridLayout);
        area.setLayoutData(new GridData(GridData.FILL_BOTH));
        _classNameText = createLabelAndText(area, Messages.label_classNameStar);
        if (_interceptor != null && _interceptor.getClass_() != null && !_interceptor.getClass_().trim().isEmpty()) {
            _classNameText.setText(_interceptor.getClass_());
            getShell().setText(Messages.title_editInterceptor);
            setTitle(Messages.title_interceptorDetails);
            setMessage(Messages.description_interceptorDetails);
        }
        _classNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                _interceptor.setClass(_classNameText.getText().trim());
            }
        });
        _browseButton = new Button(area, SWT.PUSH);
        _browseButton.setText(Messages.button_browse);
        _browseButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleBrowse();
                validate();
            }

        });
        
        Group propertyGroup = new Group(area, SWT.NONE);
        propertyGroup.setText(Messages.label_interceptorProperties);
        propertyGroup.setLayout(new GridLayout(1, false));
        GridData grpGD = new GridData(GridData.FILL, GridData.FILL, true, false);
        grpGD.horizontalSpan = 3;
        propertyGroup.setLayoutData(grpGD);

        _interceptorPropertyTable = new InterceptorPropertyTable(propertyGroup, SWT.NONE) {
            
            @Override
            protected void removeFromList() {
                final PropertyType toRemove = _interceptorPropertyTable.getTableSelection();
                if (toRemove != null) {
                    removeInterceptorProperty(toRemove);
                }
            }
            
            @Override
            protected void addPropertyTypeToList() {
                final InterceptorPropertyInputDialog dialog = new InterceptorPropertyInputDialog(Display.getCurrent()
                        .getActiveShell());
                int rtn_value = dialog.open();
                if (rtn_value == InterceptorPropertyInputDialog.OK) {
                    final String name = dialog.getPropertyName();
                    final String value = dialog.getPropertyValue();
                    addInterceptorProperty(name, value);
                    _interceptorPropertyTable.setSelection(_interceptor.getProperties().getProperty());
                }
            }
        };
        _interceptorPropertyTable.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 1, 5));
        
        if (_interceptor != null && _interceptor.getProperties() != null && _interceptor.getProperties().getProperty() != null) {
            _interceptorPropertyTable.setSelection(_interceptor.getProperties().getProperty());
        }

        return area;
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
                    _classNameText.setText(clazz.getFullyQualifiedName());
                    _interceptor.setClass(clazz.getFullyQualifiedName());
                }
                getButton(IDialogConstants.OK_ID).setEnabled(validate());
            }
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
    }

    protected Control createButtonBar(Composite parent) {
        Control rtnControl = super.createButtonBar(parent);
        getButton(IDialogConstants.OK_ID).setEnabled(validate());
        setErrorMessage(null);
        return rtnControl;
    }

    /**
     * @param parent parent composite
     * @param label string to put in label
     * @return reference to created Text control
     */
    protected Text createLabelAndText(Composite parent, String label) {
        new Label(parent, SWT.NONE).setText(label);
        Text newText = new Text(parent, SWT.BORDER);
        newText.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
        newText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // ignore
            }

            @Override
            public void focusLost(FocusEvent e) {
                getButton(IDialogConstants.OK_ID).setEnabled(validate());
            }
        });
        newText.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                // ignore
            }

            @Override
            public void keyReleased(KeyEvent e) {
                getButton(IDialogConstants.OK_ID).setEnabled(validate());
            }
        });
        return newText;
    }

    protected boolean validate() {
        setErrorMessage(null);
        if (_classNameText.getText().trim().isEmpty()) {
            setErrorMessage(Messages.error_noInterceptorClass);
        }
        return (getErrorMessage() == null);
    }

    /**
     * @param interceptor Incoming interceptor type
     */
    public void setInterceptor(InterceptorType interceptor) {
        _interceptor = interceptor;
    }

    /**
     * @return outgoing interceptor
     */
    public InterceptorType getInterceptor() {
        return this._interceptor;
    }

    private void removeInterceptorProperty(final PropertyType property) {
        if (_interceptor != null) {
            _interceptor.getProperties().getProperty().remove(property);
        }
    }

    private void addInterceptorProperty(final String name, final String value) {
        if (_interceptor != null) {
            if (_interceptor.getProperties() == null) {
                _interceptor.setProperties(SOAPFactory.eINSTANCE.createPropertiesType());
            }
            PropertyType property = SOAPFactory.eINSTANCE.createPropertyType();
            property.setName(name);
            property.setValue(value);
            _interceptor.getProperties().getProperty().add(property);
        }
    }
}
