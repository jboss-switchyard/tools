/*************************************************************************************
 * Copyright (c) 2014 Red Hat, Inc. and others.
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
import java.util.Iterator;
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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.undo.CreateFileOperation;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.DozerFileEntryType;
import org.switchyard.tools.models.switchyard1_0.transform.DozerMappingFilesType;
import org.switchyard.tools.models.switchyard1_0.transform.DozerTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.TransformFactory;
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
 * DozerTransformProvider
 * 
 * <p/>
 * Provides UI and factory for creating Dozer transformer objects.
 */
public class DozerTransformProvider implements ITransformProvider {

    private static final String TEMPLATE = "DozerTemplate.ftl"; //$NON-NLS-1$
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
        return new DozerTransformControl(parent, container);
    }

    @Override
    public String getName() {
        return Messages.DozerTransformProvider_Dozer_Transform_Title;
    }

    private static final class DozerTransformControl implements ITransformControl {

        private final IContainer _container;
        private final IJavaProject _project;
        private Collection<TransformType> _transforms;
        private Composite _content;
        private org.eclipse.swt.widgets.List _fileList;
        private Button _removeButton;
        private Button _upButton;
        private Button _downButton;
        private Button _clearAllButton;

        private DozerTransformControl(Composite parent, IContainer container) {
            _container = container;
            _project = JavaCore.create(container.getContainingProject());

            _content = new Composite(parent, SWT.NONE);
            _content.setLayout(new GridLayout(1, false));
            
            Group group = new Group(_content, SWT.NONE);
            group.setText(Messages.DozerTransformProvider_Dozer_file_group_title);
            group.setLayout(new GridLayout(2, false));
            group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
            
            _fileList = new org.eclipse.swt.widgets.List(group, SWT.V_SCROLL | SWT.BORDER);
            _fileList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 6));
            _fileList.addSelectionListener(new SelectionListener() {
                
                @Override
                public void widgetSelected(SelectionEvent arg0) {
                    updateButtons();
                }
                
                @Override
                public void widgetDefaultSelected(SelectionEvent arg0) {
                    updateButtons();
                }
            });
            
            final Button browseButton = new Button(group, SWT.PUSH);
            browseButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
            browseButton.setText(Messages.button_browse);
            browseButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    browse();
                }
            });

            final Button newButton = new Button(group, SWT.PUSH);
            newButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
            newButton.setText(Messages.DozerTransformProvider_New_Button);
            newButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    browseNew();
                }
            });

            _removeButton = new Button(group, SWT.PUSH);
            _removeButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
            _removeButton.setText(Messages.button_remove);
            _removeButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    remove();
                }
            });

            _upButton = new Button(group, SWT.PUSH);
            _upButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
            _upButton.setText(Messages.button_up);
            _upButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    moveUp();
                }
            });

            _downButton = new Button(group, SWT.PUSH);
            _downButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
            _downButton.setText(Messages.button_down);
            _downButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    moveDown();
                }
            });

            _clearAllButton = new Button(group, SWT.PUSH);
            _clearAllButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
            _clearAllButton.setText(Messages.button_clearAll);
            _clearAllButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    clearAll();
                }
            });
            
            updateButtons();
        }
        
        private void updateButtons() {
            boolean enabled = _fileList.getSelectionCount() > 0;
            _removeButton.setEnabled(enabled);
            _upButton.setEnabled(enabled);
            _downButton.setEnabled(enabled);
            _clearAllButton.setEnabled(_fileList.getItemCount() > 0);
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
            String[] items = _fileList.getItems();
            for (int i=0; i < items.length; i++) {
                final String pathString = items[i];
                if (pathString != null && !pathString.trim().isEmpty()) {
                    IPath path = new Path(pathString);
                    if (!path.isValidPath(pathString)) {
                        return new Status(Status.ERROR, Activator.PLUGIN_ID,
                                Messages.DozerTransformProvider_invalid_path_error);
                    }
                    try {
                        IFile file = _container.getContainingProject().getWorkspace().getRoot().getFile(path);
                        if (!_project.isOnClasspath(file.getParent())) {
                            return new Status(Status.WARNING, Activator.PLUGIN_ID,
                                    Messages.DozerTransformProvider_file_not_on_classpath_error);
                        }
                    } catch (Exception e) {
                        return new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage());
                    }
                }
            }
            return Status.OK_STATUS;
        }

        private IStatus validateSelectedTransformers() {
            if (_transforms == null) {
                return Status.OK_STATUS;
            }
            for (TransformType transformer : _transforms) {
                if (!NewTransformWizard.isJavaType(transformer.getFrom())
                        || !NewTransformWizard.isJavaType(transformer.getTo())) {
                    return new Status(Status.ERROR, Activator.PLUGIN_ID,
                            Messages.DozerTransformProvider_Only_java_types_supported);
                }
            }
            return Status.OK_STATUS;
        }

        @Override
        public Collection<TransformType> createTransforms() throws CoreException {
            if (_transforms == null || _transforms.isEmpty()) {
                return Collections.emptyList();
            }
            final List<TransformType> dozerTransforms = new ArrayList<TransformType>(_transforms.size());
            ArrayList<String> dozerFilePaths = new ArrayList<String>();
            if (_fileList.getItemCount() > 0) {
                for (int i = 0; i < _fileList.getItemCount(); i++) {
                    String item = _fileList.getItem(i);
                    IFile dozerFile = _project.getProject().getWorkspace().getRoot().getFile(new Path(item));
                    if (!dozerFile.exists()) {
                        createNewDozerFile(dozerFile);
                    }
                    String dozerFilePath = JavaUtil.getJavaPathForResource(dozerFile).toString();
                    dozerFilePaths.add(dozerFilePath);
                }
            }
            for (TransformType transform : _transforms) {
                DozerTransformType dozerTransform = TransformFactory.eINSTANCE.createDozerTransformType();
                dozerTransform.setFrom(transform.getFrom());
                dozerTransform.setTo(transform.getTo());
                if (!dozerFilePaths.isEmpty()) {
                    DozerMappingFilesType mappingFiles = TransformFactory.eINSTANCE.createDozerMappingFilesType();
                    Iterator<String> iterator = dozerFilePaths.iterator();
                    while (iterator.hasNext()) {
                        String dozerFilePath = iterator.next();
                        DozerFileEntryType model = TransformFactory.eINSTANCE.createDozerFileEntryType();
                        model.setFile(dozerFilePath);
                        mappingFiles.getEntry().add(model);
                    }
                    dozerTransform.setMappingFiles(mappingFiles);
                }
                dozerTransforms.add(dozerTransform);
            }
            return dozerTransforms;
        }

        @Override
        public void setLayoutData(Object data) {
            _content.setLayoutData(data);
        }

        @Override
        public void dispose() {
        }
        
        /*
         * Move the selected item one up
         */
        private void moveUp() {
            int index = _fileList.getSelectionIndex();
            if (index > 0) {
                List<String> itemList = (List<String>) Arrays.asList(_fileList.getItems());
                ArrayList<String> newList = new ArrayList<String>(itemList);
                String itemToMove = newList.get(index);
                newList.remove(index);
                newList.add(index -1, itemToMove);
                _fileList.setItems(newList.toArray(new String[newList.size()]));
                _fileList.select(index -1);
                updateButtons();
            }
        }

        /*
         * Move the selected item one down
         */
        private void moveDown() {
            int index = _fileList.getSelectionIndex();
            if (index < _fileList.getItemCount() - 1) {
                List<String> itemList = (List<String>) Arrays.asList(_fileList.getItems());
                ArrayList<String> newList = new ArrayList<String>(itemList);
                String itemToMove = newList.get(index);
                newList.remove(index);
                newList.add(index +1, itemToMove);
                _fileList.setItems(newList.toArray(new String[newList.size()]));
                _fileList.select(index +1);
                updateButtons();
            }
        }

        /*
         * Let the user create a new file in the classpath. 
         */
        private void browseNew() {
            String pathString = ""; //$NON-NLS-1$
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

            FileSelectionWizard wizard = new FileSelectionWizard(new StructuredSelection(resource));
            WizardDialog dialog = new WizardDialog(_content.getShell(), wizard);
            if (dialog.open() == WizardDialog.OK) {
                _fileList.add(wizard.getSelection().toString());
                updateButtons();
            }
        }

        /*
         * Let the user select a new file in the classpath. 
         */
        private void browse() {
            String pathString = ""; //$NON-NLS-1$
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

            ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(_content.getShell(),
                    resource.getProject(), new HashSet<String>(Arrays.asList("xml"))); //$NON-NLS-1$
            dialog.setInitialPattern("*.xml"); //$NON-NLS-1$
            dialog.setTitle(Messages.DozerTransformProvider_Select_Dozer_File_dialog_title);
            if (dialog.open() == ClasspathResourceSelectionDialog.OK) {
                _fileList.add(((IResource) dialog.getFirstResult()).getFullPath().toString());
                updateButtons();
            }
        }
        
        /*
         * Remove the selected item 
         */
        private void remove() {
            int index = _fileList.getSelectionIndex();
            if (index > 0) {
                _fileList.remove(index);
                updateButtons();
            }
        }

        /*
         * Clear the list 
         */
        private void clearAll() {
            if (_fileList.getItemCount() > 0) {
                _fileList.removeAll();
                updateButtons();
            }
        }

        private void createNewDozerFile(final IFile file) throws CoreException {
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
                                        new CreateFileOperation(file, null, contents, Messages.DozerTransformProvider_creating_transformation_status)
                                                .execute(monitor, uiInfo);
                                    } catch (ExecutionException e) {
                                        throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
                                                Messages.DozerTransformProvider_error_creating_dozer_transformer, e));
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
                            Messages.DozerTransformProvider_error_creating_dozer_transformer, realException));
                }
            } catch (InterruptedException e) {
                throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
                        Messages.DozerTransformProvider_error_creating_dozer_transformer, e));
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
                        Messages.DozerTransformProvider_error_creating_dozer_transformer, e));
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
                setWindowTitle(Messages.DozerTransformProvider_new_transform_wizard_title);
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
                _page.setFileExtension("xml"); //$NON-NLS-1$
                _page.setTitle(Messages.DozerTransformProvider_new_transform_wizard_title);
                _page.setDescription(Messages.DozerTransformProvider_new_file_wizard_page_description);
                addPage(_page);
            }
        }
    }

}
