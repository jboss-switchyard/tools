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
package org.switchyard.tools.ui.editor.components.bean;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
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
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.models.switchyard1_0.bean.BeanImplementationType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;
import org.switchyard.tools.ui.wizards.NewBeanServiceWizard;

/**
 * @author bfitzpat
 * 
 */
public class BeanImplementationComposite extends GFPropertySection {

    private Composite _panel;
    private BeanImplementationType _implementation = null;
    private Link _newBeanLink;
    private Text _beanClassText;
    private Button _browseBeanButton;
    private IJavaProject _project;
    private boolean _updating;

    /**
     * Constructor.
     */
    public BeanImplementationComposite() {
        // empty
    }

    @Override
    public void refresh() {
        _implementation = null;
        _project = null;
        final PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            final Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
            _implementation = (BeanImplementationType) ((Component) bo).getImplementation();
        }
        _updating = true;
        if (_implementation.getClass_() != null) {
            _beanClassText.setText(_implementation.getClass_());
        } else {
            _beanClassText.setText("");
        }
        final boolean enabled = !MergedModelUtil.isReadOnly(_implementation);
        _browseBeanButton.setEnabled(enabled);
        _newBeanLink.setEnabled(enabled);
        _updating = false;

        final Resource resource = MergedModelUtil.getSwitchYard(_implementation).eResource();
        if (resource.getURI().isPlatformResource()) {
            final IFile file = ResourcesPlugin.getWorkspace().getRoot()
                    .getFile(new Path(resource.getURI().toPlatformString(true)));
            if (file != null) {
                _project = JavaCore.create(file.getProject());
            }
        }
    }

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);

        final TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        _panel = factory.createComposite(parent);
        _panel.setLayout(new GridLayout(3, false));

        _newBeanLink = new Link(_panel, SWT.NONE);
        factory.adapt(_newBeanLink, true, true);
        _newBeanLink.setText("<a>Bean Class:</a>");
        _newBeanLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                openNewBeanWizard();
            }

        });

        _beanClassText = factory.createText(_panel, "");
        _beanClassText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _beanClassText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                if (!_updating) {
                    handleModify((Control) event.getSource());
                }
            }

        });

        _browseBeanButton = factory.createButton(_panel, "Browse...", SWT.PUSH);
        _browseBeanButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                handleBrowse();
            }
        });
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
                    IJavaElementSearchConstants.CONSIDER_CLASSES, false, filter.isEmpty() ? "* " : filter);
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

    private void wrapOperation(final Runnable runner) {
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(_implementation);
        if (domain != null) {
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    try {
                        runner.run();
                    } catch (Exception e) {
                        Activator.logError(e);
                    }
                }
            });
        } else {
            try {
                runner.run();
            } catch (Exception e) {
                Activator.logError(e);
            }
        }
    }
}
