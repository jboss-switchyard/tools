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
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
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
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.TransformFactory;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.Activator;

/**
 * SmooksTransformProvider
 * 
 * <p/>
 * Provides UI and factory for creating Smooks transformer objects.
 */
public class SmooksTransformProvider implements ITransformProvider {

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
        return new SmooksTransformControl(parent, container);
    }

    @Override
    public String getName() {
        return "Smooks Transformer";
    }

    private static final class SmooksTransformControl implements ITransformControl {

        private final IContainer _container;
        private final IJavaProject _project;
        private Collection<TransformType> _transforms;
        private Composite _content;
        private Text _fileText;
        private Button _createNewFileCheckbox;

        private SmooksTransformControl(Composite parent, IContainer container) {
            _container = container;
            _project = JavaCore.create(container.getContainingProject());

            _content = new Composite(parent, SWT.NONE);
            _content.setLayout(new GridLayout(3, false));

            final Label label = new Label(_content, SWT.NONE);
            label.setText("Smooks file:");

            _fileText = new Text(_content, SWT.BORDER | SWT.SINGLE);
            _fileText.addModifyListener(new ModifyListener() {
                @Override
                public void modifyText(ModifyEvent event) {
                    internalValidate();
                }
            });
            _fileText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

            final Button browseButton = new Button(_content, SWT.PUSH);
            browseButton.setText("Browse...");
            browseButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    browse();
                }
            });

            // spacer
            new Label(_content, SWT.NONE);

            _createNewFileCheckbox = new Button(_content, SWT.CHECK);
            _createNewFileCheckbox.setText("Create new Smooks file");
            _createNewFileCheckbox.setSelection(false);
            _createNewFileCheckbox.setEnabled(false);
            _createNewFileCheckbox.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    internalValidate();
                }
            });
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
            if (_transforms.size() > 1) {
                return new Status(
                        Status.ERROR,
                        Activator.PLUGIN_ID,
                        "A Smooks configuration file can only provide support for a single transformer.  Please select a single transformer pair.");
            }
            final String pathString = _fileText.getText();
            final IPath path = new Path(pathString);
            if (!path.isValidPath(pathString)) {
                return new Status(Status.ERROR, Activator.PLUGIN_ID,
                        "The specified Smooks file is an invalid path.  Please specify a valid path.");
            }
            try {
                IFile file = _container.getContainingProject().getWorkspace().getRoot().getFile(path);
                if (_createNewFileCheckbox.getSelection()) {
                    if (file.exists()) {
                        return new Status(Status.ERROR, Activator.PLUGIN_ID,
                                "The specified Smooks file exists in the workspace.  Specify a unique name or uncheck \"Create...\"");
                    }
                } else if (!file.exists()) {
                    return new Status(Status.ERROR, Activator.PLUGIN_ID,
                            "The specified Smooks file does not exist in the workspace.");
                }
                if (!_project.isOnClasspath(file.getParent())) {
                    return new Status(Status.WARNING, Activator.PLUGIN_ID,
                            "The specified Smooks file is not on the project's classpath.  The file may not be available at runtime.");
                }
            } catch (Exception e) {
                return new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage());
            }
            return Status.OK_STATUS;
        }

        @Override
        public Collection<TransformType> createTransforms() throws CoreException {
            if (_transforms == null || _transforms.isEmpty()) {
                return Collections.emptyList();
            }
            final IFile smooksFile = _project.getProject().getWorkspace().getRoot()
                    .getFile(new Path(_fileText.getText()));
            final String smooksFilePath = JavaUtil.getJavaPathForResource(smooksFile).toString();
            final List<TransformType> smooksTransforms = new ArrayList<TransformType>(_transforms.size());
            for (TransformType transform : _transforms) {
                SmooksTransformType1 smooksTransform = TransformFactory.eINSTANCE.createSmooksTransformType1();
                smooksTransform.setFrom(transform.getFrom());
                smooksTransform.setTo(transform.getTo());
                smooksTransform.setConfig(smooksFilePath);
                if (NewTransformWizard.isJavaType(transform.getFrom())) {
                    if (NewTransformWizard.isJavaType(transform.getTo())) {
                        smooksTransform.setType(SmooksTransformType.SMOOKS);
                    } else {
                        smooksTransform.setType(SmooksTransformType.JAVA2XML);
                    }
                } else if (NewTransformWizard.isJavaType(transform.getTo())) {
                    smooksTransform.setType(SmooksTransformType.XML2JAVA);
                } else {
                    smooksTransform.setType(SmooksTransformType.SMOOKS);
                }
                smooksTransforms.add(smooksTransform);
            }
            return smooksTransforms;
        }

        @Override
        public void setLayoutData(Object data) {
            _content.setLayoutData(data);
        }

        @Override
        public void dispose() {
        }

        private void internalValidate() {
            _container.updateStatus(this, validate());
        }

        private void browse() {
            final String pathString = _fileText.getText();
            final IResource resource;
            if (pathString == null || pathString.isEmpty()) {
                final IResource temp = JavaUtil.getFirstResourceRoot(_project);
                resource = temp == null ? _project.getResource() : temp;
            } else {
                final IPath path = new Path(pathString);
                if (path.isValidPath(pathString)) {
                    resource = _project.getProject().getWorkspace().getRoot().getFile(path);
                } else {
                    final IResource temp = JavaUtil.getFirstResourceRoot(_project);
                    resource = temp == null ? _project.getResource() : temp;
                }
            }

            // if (_createNewFileCheckbox.getSelection()) {
            // } else {
            ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(_content.getShell(),
                    resource.getProject(), "xml");
            dialog.setInitialPattern("*.xml");
            dialog.setTitle("Select Smooks File");
            if (dialog.open() == ClasspathResourceSelectionDialog.OK) {
                _fileText.setText(((IResource) dialog.getFirstResult()).getFullPath().toString());
            }
            // }
        }

    }

}
