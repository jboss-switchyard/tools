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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.Port;
import org.eclipse.wst.wsdl.Service;
import org.eclipse.wst.wsdl.util.WSDLResourceImpl;
import org.switchyard.tools.ui.editor.Activator;

/**
 * Allows user to select a port from available project WSDL files.
 * 
 * @author bfitzpat
 * @author Rob Cernich
 */
public class WSDLPortSelectionDialog extends ClasspathResourceSelectionDialog {

    private ListViewer _portsList;
    private Map<IResource, Definition> _wsdlDefinitions = new HashMap<IResource, Definition>();
    private Port _result;

    /**
     * Create a new WSDLPortTypeSelectionDialog.
     * 
     * @param parentShell the parent shell
     * @param container the root container
     */
    public WSDLPortSelectionDialog(Shell parentShell, IContainer container) {
        super(parentShell, container);
        setTitle("Select WSDL file and port");
    }

    /**
     * @return the port selected by the user.
     */
    public Port getSelectedPort() {
        return _result;
    }

    @Override
    protected Control createExtendedContentArea(Composite parent) {
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout());
        contents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

        Label label = new Label(contents, SWT.NONE);
        label.setText("Select port:");

        _portsList = new ListViewer(contents, SWT.SINGLE | SWT.BORDER);
        _portsList.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof Port) {
                    return ((Port) element).getName();
                }
                return super.getText(element);
            }
        });
        _portsList.setContentProvider(new ArrayContentProvider());
        _portsList.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                portSelected((StructuredSelection) event.getSelection());
            }
        });
        _portsList.addDoubleClickListener(new IDoubleClickListener() {
            @Override
            public void doubleClick(DoubleClickEvent event) {
                okPressed();
            }
        });
        GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
        data.heightHint = _portsList.getList().getItemHeight() * 3;
        _portsList.getControl().setLayoutData(data);
        return contents;
    }

    private void portSelected(StructuredSelection selection) {
        super.handleSelected(selection);
    }

    @Override
    protected void handleSelected(StructuredSelection selection) {
        // update portTypes list
        if (selection.isEmpty() || selection.size() != 1 || !(selection.getFirstElement() instanceof IResource)) {
            _portsList.setInput(null);
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
        Collection<?> services = definition == null ? Collections.emptyList() : definition.getServices().values();
        ArrayList<Port> ports = new ArrayList<Port>();
        for (Object object : services) {
            Service service = (Service) object;
            if (!service.getPorts().values().isEmpty()) {
                Collection<?> servicePorts = service.getPorts().values();
                for (Object svcPort : servicePorts) {
                    ports.add((Port) svcPort);
                }
            }
        }
        _portsList.setInput(ports);
        if (ports.size() > 0) {
            selection = new StructuredSelection(ports.iterator().next());
        } else {
            selection = StructuredSelection.EMPTY;
        }
        _portsList.setSelection(selection, true);
    }

    @Override
    protected IStatus validateItem(Object item) {
        if (item instanceof Port) {
            return Status.OK_STATUS;
        }
        return new Status(Status.ERROR, Activator.PLUGIN_ID, "Please select a WSDL file and port.");
    }

    @Override
    protected void computeResult() {
        super.computeResult();

        // stash away the portType
        final StructuredSelection selection = (StructuredSelection) _portsList.getSelection();
        _result = (Port) selection.getFirstElement();
    }

}
