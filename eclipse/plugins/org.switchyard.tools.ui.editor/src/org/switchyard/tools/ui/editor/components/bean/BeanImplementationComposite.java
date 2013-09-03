/******************************************************************************* 
 * Copyright (c) 2012-2013 Red Hat, Inc. 
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
package org.switchyard.tools.ui.editor.components.bean;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.swt.SWT;
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
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.bean.BeanImplementationType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;
import org.switchyard.tools.ui.wizards.NewBeanServiceWizard;

/**
 * @author bfitzpat
 * 
 */
public class BeanImplementationComposite extends AbstractModelComposite<Component> {

    private Composite _panel;
    private BeanImplementationType _implementation = null;
    private Link _newBeanLink;
    private Text _beanClassText;
    private Button _browseBeanButton;
    private IJavaProject _project;
    private boolean _updating;

    /**
     * Create a new BeanImplementationComposite.
     * 
     * @param container the container.
     * @param parent the parent composite.
     * @param style style bits.
     */
    public BeanImplementationComposite(ICompositeContainer container, Composite parent, int style) {
        super(Component.class, container, parent, style);

        final FormToolkit factory = getWidgetFactory();
        _panel = this;
        setLayout(new GridLayout(3, false));

        _newBeanLink = new Link(_panel, SWT.NONE);
        factory.adapt(_newBeanLink, true, true);
        _newBeanLink.setText(Messages.link_beanClass);
        _newBeanLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                openNewBeanWizard();
            }

        });

        _beanClassText = factory.createText(_panel, ""); //$NON-NLS-1$
        _beanClassText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _beanClassText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                if (!_updating) {
                    handleModify((Control) event.getSource());
                }
            }

        });

        _browseBeanButton = factory.createButton(_panel, Messages.button_browse, SWT.PUSH);
        _browseBeanButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                handleBrowse();
            }
        });
    }

    @Override
    public void refresh() {
        _implementation = null;
        _project = null;
        final Component bo = getTargetObject();
        if (bo != null) {
            _implementation = (BeanImplementationType) ((Component) bo).getImplementation();
        }
        _updating = true;
        try {
            if (_implementation.getClass_() != null) {
                _beanClassText.setText(_implementation.getClass_());
            } else {
                _beanClassText.setText(""); //$NON-NLS-1$
            }
            final boolean enabled = !MergedModelUtil.isReadOnly(_implementation);
            _browseBeanButton.setEnabled(enabled);
            _newBeanLink.setEnabled(enabled);

            final Resource resource = MergedModelUtil.getSwitchYard(_implementation).eResource();
            if (resource.getURI().isPlatformResource()) {
                final IFile file = ResourcesPlugin.getWorkspace().getRoot()
                        .getFile(new Path(resource.getURI().toPlatformString(true)));
                if (file != null) {
                    _project = JavaCore.create(file.getProject());
                }
            }
        } finally {
            _updating = false;
       }
    }

    private void handleModify(Control control) {
        final String implementationClassText = _beanClassText.getText().trim();
        if (!implementationClassText.equals(_implementation.getClass_())
                || (((BeanImplementationType) _implementation).getClass_() == null && !implementationClassText
                        .isEmpty())) {
            wrapOperation(new Runnable() {
                @Override
                public void run() {
                    _implementation.setClass(implementationClassText);
                }
            });
        }
    }

    private void handleBrowse() {
        IJavaSearchScope scope = null;
        if (_project == null) {
            scope = SearchEngine.createWorkspaceScope();
        } else {
            scope = SearchEngine.createJavaSearchScope(new IJavaElement[] {_project });
        }
        try {
            String filter = _beanClassText.getText();
            SelectionDialog dialog = JavaUI.createTypeDialog(Display.getCurrent().getActiveShell(), null, scope,
                    IJavaElementSearchConstants.CONSIDER_CLASSES, false, filter.isEmpty() ? "* " : filter); //$NON-NLS-1$
            if (dialog.open() == SelectionDialog.OK) {
                Object[] result = dialog.getResult();
                if (result.length > 0 && result[0] instanceof IType) {
                    _beanClassText.setText(((IType) result[0]).getFullyQualifiedName());
                    handleModify(_beanClassText);
                }
            }
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
    }

    private void openNewBeanWizard() {
        NewBeanServiceWizard wizard = new NewBeanServiceWizard(false, false);
        SwitchyardSCAEditor editor = SwitchyardSCAEditor.getEditor(_implementation);
        IStructuredSelection selection = _project == null ? StructuredSelection.EMPTY : new StructuredSelection(
                JavaUtil.getInitialPackageForProject(_project));
        IWorkbench workbench = editor == null ? PlatformUI.getWorkbench() : editor.getEditorSite().getWorkbenchWindow()
                .getWorkbench();
        List<ComponentService> services = ((Component) _implementation.eContainer()).getService();
        wizard.init(workbench, selection);
        wizard.forceServiceInterfaceType(services.isEmpty()
                || !(services.get(0).getInterface() instanceof JavaInterface) ? null : services.get(0));

        WizardDialog dialog = new WizardDialog(Display.getCurrent().getActiveShell(), wizard);
        if (dialog.open() == WizardDialog.OK) {
            ICompilationUnit icu = JavaCore.createCompilationUnitFrom(wizard.getNewClassFile());
            if (icu != null) {
                IType type = icu.findPrimaryType();
                if (type != null) {
                    _beanClassText.setText(type.getFullyQualifiedName());
                    handleModify(_beanClassText);
                }
            }
        }
    }

}
