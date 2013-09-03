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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
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
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.undo.CreateFileOperation;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.TransformFactory;
import org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.Messages;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateHashModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

/**
 * XSLTransformProvider
 * 
 * <p/>
 * Provides UI and factory for creating XSL transformer objects.
 */
public class XSLTransformProvider implements ITransformProvider {

    private static final String TEMPLATE = "XSLTemplate.ftl"; //$NON-NLS-1$
    private static final String TRANSFORMS_PARAM = "transforms"; //$NON-NLS-1$

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
        return new XSLTransformControl(parent, container);
    }

    @Override
    public String getName() {
        return Messages.label_xslTransformer;
    }

    private static final class XSLTransformControl implements ITransformControl {

        private final IContainer _container;
        private final IJavaProject _project;
        private Collection<TransformType> _transforms;
        private Composite _content;
        private Text _fileText;
        private Button _createNewFileCheckbox;

        private XSLTransformControl(Composite parent, IContainer container) {
            _container = container;
            _project = JavaCore.create(container.getContainingProject());

            _content = new Composite(parent, SWT.NONE);
            _content.setLayout(new GridLayout(3, false));

            final Label label = new Label(_content, SWT.NONE);
            label.setText(Messages.label_xslFile);

            _fileText = new Text(_content, SWT.BORDER | SWT.SINGLE);
            _fileText.addModifyListener(new ModifyListener() {
                @Override
                public void modifyText(ModifyEvent event) {
                    internalValidate();
                }
            });
            _fileText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

            final Button browseButton = new Button(_content, SWT.PUSH);
            browseButton.setText(Messages.button_browse);
            browseButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    browse();
                }
            });

            // spacer
            new Label(_content, SWT.NONE);

            _createNewFileCheckbox = new Button(_content, SWT.CHECK);
            _createNewFileCheckbox.setText(Messages.label_createNewXslFile);
            _createNewFileCheckbox.setSelection(true);
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
            final IStatus transformsStaus = validateSelectedTransformers();
            if (!transformsStaus.isOK()) {
                return transformsStaus;
            }
            final String pathString = _fileText.getText();
            IPath path = new Path(pathString);
            if (!path.isValidPath(pathString)) {
                return new Status(Status.ERROR, Activator.PLUGIN_ID,
                        Messages.error_invalidXslFilePath);
            }
            try {
                IFile file = _container.getContainingProject().getWorkspace().getRoot().getFile(path);
                if (_createNewFileCheckbox.getSelection()) {
                    if (file.exists()) {
                        return new Status(Status.ERROR, Activator.PLUGIN_ID,
                                Messages.error_xslFileExists);
                    }
                } else if (!file.exists()) {
                    return new Status(Status.ERROR, Activator.PLUGIN_ID,
                            Messages.error_xslFileDoesNotExist);
                }
                if (!_project.isOnClasspath(file.getParent())) {
                    return new Status(Status.WARNING, Activator.PLUGIN_ID,
                            Messages.error_xslFileNotOnClasspath);
                }
            } catch (Exception e) {
                return new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage());
            }
            return Status.OK_STATUS;
        }

        private IStatus validateSelectedTransformers() {
            if (_transforms == null) {
                return Status.OK_STATUS;
            }
            for (TransformType transformer : _transforms) {
                if (NewTransformWizard.isJavaType(transformer.getFrom())
                        || NewTransformWizard.isJavaType(transformer.getTo())) {
                    return new Status(Status.ERROR, Activator.PLUGIN_ID,
                            Messages.error_xslDoesNotSupportJavaTypes);
                }
            }
            return Status.OK_STATUS;
        }

        @Override
        public Collection<TransformType> createTransforms() throws CoreException {
            if (_transforms == null || _transforms.isEmpty()) {
                return Collections.emptyList();
            }
            final IFile xslFile = _project.getProject().getWorkspace().getRoot().getFile(new Path(_fileText.getText()));
            if (_createNewFileCheckbox.getSelection()) {
                createNewXSLFile(xslFile);
            }
            final String xslFilePath = JavaUtil.getJavaPathForResource(xslFile).toString();
            final List<TransformType> xslTransforms = new ArrayList<TransformType>(_transforms.size());
            for (TransformType transform : _transforms) {
                XsltTransformType xslTransform = TransformFactory.eINSTANCE.createXsltTransformType();
                xslTransform.setFrom(transform.getFrom());
                xslTransform.setTo(transform.getTo());
                xslTransform.setXsltFile(xslFilePath);
                xslTransforms.add(xslTransform);
            }
            return xslTransforms;
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

            if (_createNewFileCheckbox.getSelection()) {
                FileSelectionWizard wizard = new FileSelectionWizard(new StructuredSelection(resource));
                WizardDialog dialog = new WizardDialog(_content.getShell(), wizard);
                if (dialog.open() == WizardDialog.OK) {
                    _fileText.setText(wizard.getSelection().toString());
                }
            } else {
                ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(_content.getShell(),
                        resource.getProject(), new HashSet<String>(Arrays.asList("xsl", "xslt"))); //$NON-NLS-1$ //$NON-NLS-2$
                dialog.setInitialPattern("*.xsl"); //$NON-NLS-1$
                dialog.setTitle(Messages.title_selectXslFile);
                if (dialog.open() == ClasspathResourceSelectionDialog.OK) {
                    _fileText.setText(((IResource) dialog.getFirstResult()).getFullPath().toString());
                }
            }
        }

        private void createNewXSLFile(final IFile file) throws CoreException {
            final IAdaptable uiInfo = WorkspaceUndoUtil.getUIInfoAdapter(_content.getShell());
            final InputStream contents = createContents();
            try {
                _container.getContext().run(false, false, new IRunnableWithProgress() {
                    @Override
                    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                        try {
                            ResourcesPlugin.getWorkspace().run(new IWorkspaceRunnable() {
                                @Override
                                public void run(IProgressMonitor monitor) throws CoreException {
                                    try {
                                        new CreateFileOperation(file, null, contents, Messages.message_creatingXslTransformerFile)
                                                .execute(monitor, uiInfo);
                                    } catch (ExecutionException e) {
                                        throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
                                                Messages.error_errorCreatingXslTransformerFile, e));
                                    }
                                }
                            }, monitor);
                        } catch (CoreException e) {
                            throw new InvocationTargetException(e);
                        }
                    }
                });
            } catch (InvocationTargetException e) {
                Throwable realException = e.getTargetException();
                if (realException instanceof CoreException) {
                    throw (CoreException) realException;
                } else {
                    throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            Messages.error_errorCreatingXslTransformerFile, realException));
                }
            } catch (InterruptedException e) {
                throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
                        Messages.error_errorCreatingXslTransformerFile, e));
            } finally {
                try {
                    contents.close();
                } catch (IOException e) {
                    e.fillInStackTrace();
                }
            }
        }

        private InputStream createContents() throws CoreException {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                Configuration config = new Configuration();
                config.setClassForTemplateLoading(getClass(), ""); //$NON-NLS-1$
                config.setObjectWrapper(new DefaultObjectWrapper() {
                    @Override
                    public TemplateModel wrap(final Object obj) throws TemplateModelException {
                        if (obj instanceof TransformType) {
                            return new TemplateHashModel() {
                                @Override
                                public boolean isEmpty() throws TemplateModelException {
                                    return false;
                                }

                                @Override
                                public TemplateModel get(String param) throws TemplateModelException {
                                    final QName qname;
                                    if ("from".equals(param)) { //$NON-NLS-1$
                                        qname = QName.valueOf(((TransformType) obj).getFrom());
                                    } else if ("to".equals(param)) { //$NON-NLS-1$
                                        qname = QName.valueOf(((TransformType) obj).getTo());
                                    } else {
                                        qname = null;
                                    }
                                    if (qname == null) {
                                        return null;
                                    }
                                    return new TemplateHashModel() {
                                        @Override
                                        public boolean isEmpty() throws TemplateModelException {
                                            return false;
                                        }

                                        @Override
                                        public TemplateModel get(String paramFrom) throws TemplateModelException {
                                            if ("localPart".equals(paramFrom)) { //$NON-NLS-1$
                                                return wrap(qname.getLocalPart());
                                            } else if ("namespaceURI".equals(paramFrom)) { //$NON-NLS-1$
                                                return wrap(qname.getNamespaceURI());
                                            }
                                            return null;
                                        }
                                    };
                                }
                            };
                        }
                        return super.wrap(obj);
                    }
                });

                Map<String, Object> parameters = new HashMap<String, Object>();
                parameters.put(TRANSFORMS_PARAM, _transforms);

                Template template = config.getTemplate(TEMPLATE);

                template.process(parameters, new PrintWriter(baos));
                return new ByteArrayInputStream(baos.toByteArray());
            } catch (Exception e) {
                throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
                        Messages.error_errorCreatingXslFile, e));
            } finally {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.fillInStackTrace();
                }
            }
        }

        private final class FileSelectionWizard extends Wizard {
            private WizardNewFileCreationPage _page;
            private IStructuredSelection _selection;
            private IPath _result;

            private FileSelectionWizard(IStructuredSelection selection) {
                _selection = selection;
                setWindowTitle(Messages.title_newXslTransformerFile);
            }

            private IPath getSelection() {
                return _result;
            }

            @Override
            public boolean performFinish() {
                _result = _page.getContainerFullPath().append(_page.getFileName());
                return true;
            }

            @Override
            public void addPages() {
                _page = new WizardNewFileCreationPage("pageName", _selection) { //$NON-NLS-1$
                    @Override
                    protected boolean validatePage() {
                        if (super.validatePage()) {
                            IFile file = _project.getProject().getWorkspace().getRoot()
                                    .getFile(getContainerFullPath().append(getFileName()));
                            if (!_project.isOnClasspath(file.getParent())) {
                                setMessage(Messages.error_specifiedFileNotOnClasspath, WARNING);
                            }
                            return true;
                        }
                        return false;
                    }

                    @Override
                    protected void createAdvancedControls(Composite parent) {
                    }

                    @Override
                    protected IStatus validateLinkedResource() {
                        return Status.OK_STATUS;
                    }
                };
                final IResource resource = (IResource) _selection.getFirstElement();
                if (resource.getType() == IResource.FILE) {
                    _page.setFileName(resource.getFullPath().lastSegment());
                }
                _page.setFileExtension("xsl"); //$NON-NLS-1$
                _page.setDescription(Messages.description_newXslTransformerFile);
                addPage(_page);
            }
        }
    }

}
