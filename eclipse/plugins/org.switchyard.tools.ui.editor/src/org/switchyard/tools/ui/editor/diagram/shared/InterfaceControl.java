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
package org.switchyard.tools.ui.editor.diagram.shared;

import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
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
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;
import org.switchyard.tools.ui.editor.Activator;

/**
 * InterfaceControl
 * 
 * <p/>
 * Collects information for a bean component implementation.
 * 
 * @author Rob Cernich
 */
public class InterfaceControl implements ISelectionProvider {

    private Button _javaRadio;
    private Button _wsdlRadio;
    private Button _esbRadio;
    private Link _newLink;
    private Text _text;
    private Button _browseButton;
    private IInterfaceControlAdapter _adapter;
    private Set<InterfaceType> _supportedTypes;
    private Interface _interface;
    private IJavaProject _project;
    private Set<ISelectionChangedListener> _listeners = new LinkedHashSet<ISelectionChangedListener>();

    /**
     * The types of available interfaces.
     * 
     * TODO: this should probably be pulled out into some sort of plugin
     * mechanism.
     */
    public enum InterfaceType {
        /** Java interface. */
        Java,
        /** WSDL portType interface. */
        WSDL,
        /** Generic ESB interface. */
        ESB
    }

    /**
     * TODO: move this someplace more sensible.
     * 
     * @param intf the interface.
     * 
     * @return a possible service name derived from the interface type and
     *         settings.
     */
    public static String getSimpleServiceInterfaceName(Interface intf) {
        if (intf == null) {
            return "";
        }
        if (intf instanceof JavaInterface) {
            String serviceInterfaceName = ((JavaInterface) intf).getInterface();
            if (serviceInterfaceName == null) {
                return "";
            }
            int lastDotIndex = serviceInterfaceName.lastIndexOf('.');
            if (lastDotIndex > 0) {
                return serviceInterfaceName.substring(lastDotIndex + 1);
            }
            return serviceInterfaceName;
        } else if (intf instanceof WSDLPortType) {
            String serviceInterfaceName = ((WSDLPortType) intf).getInterface();
            if (serviceInterfaceName == null) {
                return "";
            }
            Pattern pattern = Pattern.compile(".*#wsdl\\.porttype\\(([^\\)]*)\\)");
            Matcher matcher = pattern.matcher(serviceInterfaceName);
            if (matcher.matches()) {
                return matcher.group(1);
            }
            return "";
        }
        return "";
    }

    /**
     * Create a new InterfaceControl.
     * 
     * @param project the containing project.
     */
    public InterfaceControl(IJavaProject project) {
        this(project, EnumSet.allOf(InterfaceType.class));
    }

    /**
     * Create a new InterfaceControl.
     * 
     * @param project the containing project.
     * @param supportedTypes the interface types supported by the container.
     */
    public InterfaceControl(IJavaProject project, Set<InterfaceType> supportedTypes) {
        _project = project;
        _supportedTypes = supportedTypes;
    }

    /**
     * Create the controls for editing an interface.
     * 
     * @param parent the parent composite.
     * @param numColumns the number of colums in the layout.
     */
    public void createControl(Composite parent, int numColumns) {
        Label label = new Label(parent, SWT.NONE);
        label.setText("Interface Type:");

        Composite group = new Composite(parent, SWT.SHADOW_NONE);
        group.setLayout(new GridLayout(3, false));
        group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, numColumns - 2, 1));

        _javaRadio = new Button(group, SWT.RADIO);
        _javaRadio.setText("Java");
        _javaRadio.setData(new JavaInterfaceControlAdapter());
        _javaRadio.setEnabled(_supportedTypes.contains(InterfaceType.Java));
        _javaRadio.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                updateAdapter((IInterfaceControlAdapter) _javaRadio.getData());
            }
        });

        _wsdlRadio = new Button(group, SWT.RADIO);
        _wsdlRadio.setText("WSDL");
        _wsdlRadio.setData(new WSDLInterfaceControlAdapter());
        _wsdlRadio.setEnabled(_supportedTypes.contains(InterfaceType.WSDL));
        _wsdlRadio.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                updateAdapter((IInterfaceControlAdapter) _wsdlRadio.getData());
            }
        });

        _esbRadio = new Button(group, SWT.RADIO);
        _esbRadio.setText("ESB");
        _esbRadio.setData(new ESBInterfaceControlAdapter());
        _esbRadio.setEnabled(_supportedTypes.contains(InterfaceType.ESB));
        _esbRadio.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                updateAdapter((IInterfaceControlAdapter) _esbRadio.getData());
            }
        });

        // spacer
        label = new Label(parent, SWT.NONE);

        _newLink = new Link(parent, SWT.NONE);
        _newLink.setText("<a>Interface:</a>");
        _newLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                openInterface();
            }

        });

        _text = new Text(parent, SWT.READ_ONLY | SWT.BORDER);
        _text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, numColumns - 2, 1));
        _text.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                fireSelectionChanged();
            }

        });

        _browseButton = new Button(parent, SWT.PUSH);
        _browseButton.setText("Browse...");
        _browseButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
        _browseButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                handleBrowse();
            }
        });

        initControls();
    }

    /**
     * @return the current validation status of the control.
     */
    public IStatus getStatus() {
        if (_adapter == null) {
            return new Status(Status.ERROR, Activator.PLUGIN_ID, "Please select an interface type.");
        }
        return _adapter.validate(_project);
    }

    /**
     * @param project the project containing the resources.
     */
    public void setProject(IJavaProject project) {
        _project = project;
    }

    /**
     * @return the interface being edited.
     */
    public Interface getInterface() {
        if (_adapter == null) {
            return null;
        }
        return _adapter.getInterface();
    }

    @Override
    public void addSelectionChangedListener(ISelectionChangedListener listener) {
        _listeners.add(listener);
    }

    @Override
    public ISelection getSelection() {
        if (_adapter == null) {
            return StructuredSelection.EMPTY;
        }
        return new StructuredSelection(_adapter.getInterface());
    }

    @Override
    public void removeSelectionChangedListener(ISelectionChangedListener listener) {
        _listeners.remove(listener);
    }

    @Override
    public void setSelection(ISelection selection) {
        if (selection.isEmpty()) {
            return;
        }
        Object obj = ((IStructuredSelection) selection).getFirstElement();
        if (_javaRadio == null) {
            if (obj instanceof Interface) {
                _interface = (Interface) obj;
                return;
            }
        }
        final Button radio;
        if (obj instanceof JavaInterface) {
            radio = _javaRadio;
        } else if (obj instanceof WSDLPortType) {
            radio = _wsdlRadio;
        } else if (obj instanceof EsbInterface) {
            radio = _esbRadio;
        } else {
            radio = null;
        }
        if (radio == null) {
            return;
        }
        IInterfaceControlAdapter adapter = (IInterfaceControlAdapter) radio.getData();
        adapter.init((Interface) obj);
        radio.setSelection(true);
    }

    private void fireSelectionChanged() {
        final Set<ISelectionChangedListener> listeners = new LinkedHashSet<ISelectionChangedListener>(_listeners);
        final SelectionChangedEvent event = new SelectionChangedEvent(this, getSelection());
        for (ISelectionChangedListener listener : listeners) {
            try {
                listener.selectionChanged(event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void initControls() {
        if (_interface == null) {
            if (_supportedTypes.contains(InterfaceType.Java)) {
                _javaRadio.setSelection(true);
                updateAdapter((IInterfaceControlAdapter) _javaRadio.getData());
            } else if (_supportedTypes.contains(InterfaceType.WSDL)) {
                _wsdlRadio.setSelection(true);
                updateAdapter((IInterfaceControlAdapter) _wsdlRadio.getData());
            } else if (_supportedTypes.contains(InterfaceType.ESB)) {
                _esbRadio.setSelection(true);
                updateAdapter((IInterfaceControlAdapter) _esbRadio.getData());
            }
        } else {
            setSelection(new StructuredSelection(_interface));
        }
    }

    private void updateAdapter(IInterfaceControlAdapter adapter) {
        _adapter = adapter;
        _text.setText(adapter.getText());
    }

    private void handleBrowse() {
        if (_adapter.browse(_browseButton.getShell(), _project)) {
            _text.setText(_adapter.getText());
        }
    }

    private void openInterface() {
        if (_adapter.open(_browseButton.getShell(), _project)) {
            _text.setText(_adapter.getText());
        }
    }
}
