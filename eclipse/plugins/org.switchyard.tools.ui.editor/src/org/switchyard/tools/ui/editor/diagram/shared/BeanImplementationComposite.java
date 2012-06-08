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

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.models.switchyard1_0.bean.BeanImplementationType;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.wizards.NewBeanServiceWizard;

/**
 * @author bfitzpat
 * 
 */
public class BeanImplementationComposite extends AbstractSwitchyardComposite implements IImplementationComposite {

    private Composite _panel;
    private Implementation _implementation = null;
    private Link _newBeanLink;
    private Text _beanClassText;
    private Button _browseBeanButton;
    private IJavaProject _project;
    private IType _beanClass;
    private boolean _inUpdate = false;

    /**
     * Constructor.
     */
    public BeanImplementationComposite() {
        // empty
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    public void createContents(Composite parent, int style) {

        _panel = new Composite(parent, SWT.NONE);
        _panel.setLayout(new GridLayout(3, false));

        _newBeanLink = new Link(_panel, SWT.NONE);
        _newBeanLink.setText("<a>Bean Class:</a>");
        _newBeanLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                openNewBeanWizard();
            }

        });

        _beanClassText = new Text(_panel, SWT.READ_ONLY | SWT.BORDER);
        _beanClassText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _beanClassText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                if (!_inUpdate) {
                    handleModify();
                }
            }

        });

        _browseBeanButton = new Button(_panel, SWT.PUSH);
        _browseBeanButton.setText("Browse...");
        _browseBeanButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                handleBrowse();
            }

        });
    }

    @SuppressWarnings("restriction")
    private void handleModify() {
        final String implementationClassText = _beanClassText.getText().trim();
        validate();
        if (_implementation instanceof BeanImplementationType) {
            if (_beanClassText != null && !_beanClassText.isDisposed() && _beanClassText.isEnabled()) {
                if (_implementation.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            ((BeanImplementationType) _implementation).setClass(implementationClassText);
                        }
                    });
                } else {
                    ((BeanImplementationType) _implementation).setClass(implementationClassText);
                }
            }
        }
    }
    
    protected void validate() {
        setErrorMessage(null);
        if (_beanClass == null) {
            setErrorMessage("Please select a bean class.");
        }
    }

    /**
     * @return interface
     */
    public Implementation getImplementation() {
        return _implementation;
    }

    /**
     * @param impl implementation coming in
     */
    public void setImplementation(Implementation impl) {
        this._implementation = impl;
        if (this._implementation != null && this._implementation instanceof BeanImplementationType) {
            BeanImplementationType beanImpl = (BeanImplementationType) this._implementation;
            _inUpdate = true;
            if (beanImpl.getClass_() != null) {
                this._beanClassText.setText(beanImpl.getClass_());
            }
            _inUpdate = false;
        }
    }

    /**
     * @return panel
     */
    public Composite getPanel() {
        return _panel;
    }

    private void handleBrowse() {
        IJavaSearchScope scope = null;
        if (_project == null) {
            scope = SearchEngine.createWorkspaceScope();
        } else {
            scope = SearchEngine.createJavaSearchScope(new IJavaElement[] {_project });
        }
        try {
            SelectionDialog dialog = JavaUI.createTypeDialog(Display.getCurrent().getActiveShell(), null, scope,
                    IJavaElementSearchConstants.CONSIDER_CLASSES, false);
            if (dialog.open() == SelectionDialog.OK) {
                Object[] result = dialog.getResult();
                if (result.length > 0 && result[0] instanceof IType) {
                    _beanClass = (IType) result[0];
                    _beanClassText.setText(((IType) result[0]).getFullyQualifiedName());
                    handleModify();
                }
            }
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
    }

    private void openNewBeanWizard() {
        NewBeanServiceWizard wizard = new NewBeanServiceWizard(false, false);
        SwitchyardSCAEditor editor = SwitchyardSCAEditor.getActiveEditor();
        IStructuredSelection selection = _project == null ? StructuredSelection.EMPTY : new StructuredSelection(
                _project);
        IWorkbench workbench = editor == null ? PlatformUI.getWorkbench() : editor.getEditorSite().getWorkbenchWindow()
                .getWorkbench();
        wizard.init(workbench, selection);
        WizardDialog dialog = new WizardDialog(Display.getCurrent().getActiveShell(), wizard);
        if (dialog.open() == WizardDialog.OK) {
            ICompilationUnit icu = JavaCore.createCompilationUnitFrom(wizard.getNewClassFile());
            if (icu != null) {
                IType type = icu.findPrimaryType();
                if (type != null) {
                    _beanClass = type;
                    _beanClassText.setText(type.getFullyQualifiedName());
                    handleModify();
                }
            }
        }
    }
}
