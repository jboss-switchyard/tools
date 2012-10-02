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
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.TransformFactory;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.editor.Activator;

/**
 * JAXBTransformProvider
 * 
 * <p/>
 * Provides UI and factory for creating JAXB transformer objects.
 */
public class JAXBTransformProvider implements ITransformProvider {

    @Override
    public boolean providesWizard() {
        return false;
    }

    @Override
    public INewTransformWizard createWizard() {
        return null;
    }

    @Override
    public ITransformControl createTransformControl(Composite parent, IContainer container) {
        return new JAXBTransformControl(parent, container);
    }

    @Override
    public String getName() {
        return "JAXB Transformer";
    }

    private static final class JAXBTransformControl implements ITransformControl {

        private final IContainer _container;
        private final IJavaProject _project;
        private Composite _content;
        private Collection<TransformType> _transforms;
        private Set<String> _packages = new LinkedHashSet<String>();
        private ListViewer _packagesView;

        private JAXBTransformControl(Composite parent, IContainer container) {
            _container = container;
            _project = JavaCore.create(container.getContainingProject());
            _content = new Composite(parent, SWT.NONE);
            _content.setLayout(new GridLayout(3, false));

            final Label label = new Label(_content, SWT.NONE);
            label.setText("Context path:");
            label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 2));

            _packagesView = new ListViewer(_content, SWT.READ_ONLY | SWT.MULTI | SWT.BORDER | SWT.H_SCROLL
                    | SWT.V_SCROLL);
            _packagesView.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
            _packagesView.setContentProvider(ArrayContentProvider.getInstance());
            _packagesView.setLabelProvider(new LabelProvider());
            ((GridData) _packagesView.getControl().getLayoutData()).heightHint = _packagesView.getList()
                    .getItemHeight() * 3;
            _packagesView.setInput(_packages);

            final Button addButton = new Button(_content, SWT.PUSH);
            addButton.setText("Add Packages");
            addButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
            addButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    if (addPackages()) {
                        _packagesView.refresh();
                        internalValidate();
                    }
                }
            });

            final Button removeButton = new Button(_content, SWT.PUSH);
            removeButton.setText("Remove Packages");
            removeButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
            removeButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    if (removePackages()) {
                        _packagesView.refresh();
                        internalValidate();
                    }
                }
            });
        }

        @Override
        public void dispose() {
        }

        @Override
        public void setVisible(boolean visible) {
            _content.setVisible(visible);
        }

        @Override
        public void setSelectedTransforms(Collection<TransformType> transforms) {
            _transforms = transforms;
        }

        @Override
        public IStatus validate() {
            // for (String pkg : _packages) {
            // // TODO: ensure packages contain required jaxb meta-data
            // }
            if (_transforms != null) {
                for (TransformType transformer : _transforms) {
                    if (NewTransformWizard.isJavaType(transformer.getFrom())) {
                        if (NewTransformWizard.isJavaType(transformer.getTo())) {
                            return new Status(Status.ERROR, Activator.PLUGIN_ID,
                                    "JAXB transformers only support Java->XML or XML->Java.");
                        }
                    } else if (!NewTransformWizard.isJavaType(transformer.getTo())) {
                        return new Status(Status.ERROR, Activator.PLUGIN_ID,
                                "JAXB transformers only support Java->XML or XML->Java.");
                    }
                }
            }
            return Status.OK_STATUS;
        }

        @Override
        public Collection<TransformType> createTransforms() {
            if (_transforms == null) {
                return Collections.emptyList();
            }
            final String contextPath = createContextPath();
            final List<TransformType> jaxbTransforms = new ArrayList<TransformType>(_transforms.size());
            for (TransformType transform : _transforms) {
                JAXBTransformType jaxbTransform = TransformFactory.eINSTANCE.createJAXBTransformType();
                jaxbTransform.setFrom(transform.getFrom());
                jaxbTransform.setTo(transform.getTo());
                jaxbTransform.setContextPath(contextPath);
                jaxbTransforms.add(jaxbTransform);
            }
            return jaxbTransforms;
        }

        @Override
        public void setLayoutData(Object data) {
            _content.setLayoutData(data);
        }

        private String createContextPath() {
            final StringBuffer buf = new StringBuffer();
            for (String pkg : _packages) {
                buf.append(pkg).append(":");
            }
            if (buf.length() > 0) {
                buf.deleteCharAt(buf.length() - 1);
                return buf.toString();
            }
            return null;
        }

        private void internalValidate() {
            _container.updateStatus(this, validate());
        }

        private boolean addPackages() {
            boolean changed = false;
            try {
                final IJavaElement filter = JavaUtil.getInitialPackageForProject(_project);
                SelectionDialog dialog = JavaUI.createPackageDialog(_content.getShell(), _project,
                        IJavaElementSearchConstants.CONSIDER_REQUIRED_PROJECTS
                                | IJavaElementSearchConstants.CONSIDER_BINARIES,
                        filter instanceof IPackageFragment ? ((IPackageFragment) filter).getElementName() : "");
                dialog.setTitle("Select Packages");
                dialog.setMessage("Selected packages to include in JAXB context path.");
                if (dialog.open() == SelectionDialog.OK) {
                    for (Object obj : dialog.getResult()) {
                        changed = _packages.add(((IPackageFragment) obj).getElementName()) || changed;
                    }
                }
            } catch (JavaModelException e) {
                Activator.logStatus(e.getStatus());
            }
            return changed;
        }

        private boolean removePackages() {
            IStructuredSelection selection = (IStructuredSelection) _packagesView.getSelection();
            if (selection == null || selection.isEmpty()) {
                return false;
            }
            boolean changed = false;
            for (Object obj : selection.toList()) {
                changed = _packages.remove(obj) || changed;
            }
            return changed;
        }

    }
}
