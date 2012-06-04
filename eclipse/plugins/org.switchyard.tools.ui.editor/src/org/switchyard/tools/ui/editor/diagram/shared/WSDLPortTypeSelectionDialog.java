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

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.PortType;
import org.eclipse.wst.wsdl.util.WSDLResourceImpl;
import org.switchyard.tools.ui.editor.Activator;

/**
 * Allows user to select a portType from available project WSDL files.
 * 
 * @author bfitzpat
 * @author Rob Cernich
 */
public class WSDLPortTypeSelectionDialog extends FilteredResourcesSelectionDialog {

    private IJavaModel _fJavaModel;
    private ListViewer _portTypesList;
    private Map<IResource, Definition> _wsdlDefinitions = new HashMap<IResource, Definition>();
    private PortType _result;

    /**
     * Create a new WSDLPortTypeSelectionDialog.
     * 
     * @param parentShell the parent shell
     * @param container the root container
     */
    public WSDLPortTypeSelectionDialog(Shell parentShell, IContainer container) {
        super(parentShell, false, container, IResource.FILE);
        _fJavaModel = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot());
        setTitle("Select WSDL file and portType");
    }

    /**
     * @return the portType selected by the user.
     */
    public PortType getSelectedPortType() {
        return _result;
    }

    @Override
    protected ItemsFilter createFilter() {
        return new WSDLFileResourceFilter();
    }

    @Override
    protected Control createExtendedContentArea(Composite parent) {
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout());
        contents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

        Label label = new Label(contents, SWT.NONE);
        label.setText("Select portType:");

        _portTypesList = new ListViewer(contents, SWT.SINGLE | SWT.BORDER);
        _portTypesList.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof PortType) {
                    return ((PortType) element).getQName().getLocalPart();
                }
                return super.getText(element);
            }
        });
        _portTypesList.setContentProvider(new ArrayContentProvider());
        _portTypesList.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                portTypeSelected((StructuredSelection) event.getSelection());
            }
        });
        _portTypesList.addDoubleClickListener(new IDoubleClickListener() {
            @Override
            public void doubleClick(DoubleClickEvent event) {
                okPressed();
            }
        });
        GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
        data.heightHint = _portTypesList.getList().getItemHeight() * 3;
        _portTypesList.getControl().setLayoutData(data);
        return contents;
    }

    private void portTypeSelected(StructuredSelection selection) {
        super.handleSelected(selection);
    }

    @Override
    protected void handleSelected(StructuredSelection selection) {
        // update portTypes list
        if (selection.isEmpty() || selection.size() != 1 || !(selection.getFirstElement() instanceof IResource)) {
            _portTypesList.setInput(null);
            return;
        }
        Definition definition = _wsdlDefinitions.get(selection.getFirstElement());
        if (definition == null) {
            // we need to load the definition
            final IResource wsdlFile = (IResource) selection.getFirstElement();
            final Definition[] holder = new Definition[1];
            BusyIndicator.showWhile(getShell().getDisplay(), new Runnable() {
                public void run() {
                    try {
                        ResourceSet resourceSet = new ResourceSetImpl();
                        WSDLResourceImpl resource = (WSDLResourceImpl) resourceSet.getResource(
                                URI.createPlatformResourceURI(wsdlFile.getFullPath().toString(), true), true);
                        holder[0] = resource.getDefinition();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            definition = holder[0];
            _wsdlDefinitions.put(wsdlFile, definition);
        }
        Collection<?> portTypes = definition == null ? Collections.emptyList() : definition.getEPortTypes();
        _portTypesList.setInput(portTypes);
        if (portTypes.size() > 0) {
            selection = new StructuredSelection(portTypes.iterator().next());
        } else {
            selection = StructuredSelection.EMPTY;
        }
        _portTypesList.setSelection(selection, true);
    }

    @Override
    protected IStatus validateItem(Object item) {
        if (item instanceof PortType) {
            return Status.OK_STATUS;
        }
        return new Status(Status.ERROR, Activator.PLUGIN_ID, "Please select a WSDL file and portType.");
    }

    @Override
    protected void computeResult() {
        super.computeResult();

        // stash away the portType
        final StructuredSelection selection = (StructuredSelection) _portTypesList.getSelection();
        _result = (PortType) selection.getFirstElement();
    }

    private class WSDLFileResourceFilter extends ResourceFilter {

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog.
         * ResourceFilter#matchItem(java.lang.Object)
         */
        @Override
        public boolean matchItem(Object item) {
            IResource resource = (IResource) item;
            return super.matchItem(item) && "wsdl".equals(resource.getFullPath().getFileExtension())
                    && select(resource);
        }

        private boolean isParentOnClassPath(IJavaProject javaProject, IResource resource) {
            boolean flag = false;
            while (!flag && resource.getParent() != null) {
                flag = javaProject.isOnClasspath(resource);
                if (!flag) {
                    resource = resource.getParent();
                } else {
                    return flag;
                }
            }
            return flag;
        }

        /**
         * This is the orignal <code>select</code> method. Since
         * <code>GotoResourceDialog</code> needs to extend
         * <code>FilteredResourcesSelectionDialog</code> result of this method
         * must be combined with the <code>matchItem</code> method from super
         * class (<code>ResourceFilter</code>).
         * 
         * @param resource A resource
         * @return <code>true</code> if item matches against given conditions
         *         <code>false</code> otherwise
         */
        private boolean select(IResource resource) {
            IProject project = resource.getProject();
            IJavaProject javaProject = JavaCore.create(project);
            try {
                return (javaProject != null && isParentOnClassPath(javaProject, resource))
                        || (project.getNature(JavaCore.NATURE_ID) != null && _fJavaModel.contains(resource));
            } catch (CoreException e) {
                return false;
            }
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog.
         * ResourceFilter
         * #equalsFilter(org.eclipse.ui.dialogs.FilteredItemsSelectionDialog
         * .ItemsFilter)
         */
        @Override
        public boolean equalsFilter(ItemsFilter filter) {
            return filter instanceof WSDLFileResourceFilter && super.equalsFilter(filter);
        }
    }

}
