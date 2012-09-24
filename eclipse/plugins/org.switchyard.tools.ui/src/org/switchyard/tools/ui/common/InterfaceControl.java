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
package org.switchyard.tools.ui.common;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
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
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.impl.ESBInterfaceControlAdapter;
import org.switchyard.tools.ui.common.impl.JavaInterfaceControlAdapter;
import org.switchyard.tools.ui.common.impl.WSDLInterfaceControlAdapter;

/**
 * InterfaceControl
 * 
 * <p/>
 * Collects information for a bean component implementation.
 * 
 * @author Rob Cernich
 */
public class InterfaceControl implements ISelectionProvider {

    private boolean _enabled = true;
    private Button _javaRadio;
    private Button _wsdlRadio;
    private Button _esbRadio;
    private Link _newLink;
    private Text _text;
    private Button _browseButton;
    private IInterfaceControlAdapter _adapter;
    private Set<InterfaceType> _supportedTypes;
    private Interface _interface;
    private Interface _related;
    private IJavaProject _project;
    private Set<ISelectionChangedListener> _listeners = new LinkedHashSet<ISelectionChangedListener>();
    private Map<EClass, IInterfaceControlAdapter> _adapters = new HashMap<EClass, IInterfaceControlAdapter>();

    /**
     * The types of available interfaces.
     * 
     * TODO: this should probably be pulled out into some sort of plugin
     * mechanism.
     */
    public enum InterfaceType {
        /** Java interface. */
        Java(ScaPackage.eINSTANCE.getJavaInterface()),
        /** WSDL portType interface. */
        WSDL(ScaPackage.eINSTANCE.getWSDLPortType()),
        /** Generic ESB interface. */
        ESB(SwitchyardPackage.eINSTANCE.getEsbInterface());

        /**
         * @return the EClass supported by the type.
         */
        public EClass eClass() {
            return _eClass;
        }

        private EClass _eClass;

        private InterfaceType(EClass eClass) {
            _eClass = eClass;
        }
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

        _adapters.put(InterfaceType.Java.eClass(), new JavaInterfaceControlAdapter());
        _adapters.put(InterfaceType.WSDL.eClass(), new WSDLInterfaceControlAdapter());
        _adapters.put(InterfaceType.ESB.eClass(), new ESBInterfaceControlAdapter());
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
        _javaRadio.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                updateAdapter(_adapters.get(InterfaceType.Java.eClass()));
            }
        });

        _wsdlRadio = new Button(group, SWT.RADIO);
        _wsdlRadio.setText("WSDL");
        _wsdlRadio.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                updateAdapter(_adapters.get(InterfaceType.WSDL.eClass()));
            }
        });

        _esbRadio = new Button(group, SWT.RADIO);
        _esbRadio.setText("ESB");
        _esbRadio.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                updateAdapter(_adapters.get(InterfaceType.ESB.eClass()));
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

        init(_interface, _related);
        setEnabled(_enabled);
    }

    /**
     * @return the enablement state of the controls.
     */
    public boolean getEnabled() {
        return _enabled;
    }

    /**
     * @param enabled the enablement state of the controls.
     */
    public void setEnabled(boolean enabled) {
        _enabled = enabled;
        if (_newLink == null) {
            return;
        }
        _newLink.setEnabled(_enabled);
        _text.setEnabled(_enabled);
        _browseButton.setEnabled(_enabled);

        _javaRadio.setEnabled(_enabled && _supportedTypes.contains(InterfaceType.Java));
        _wsdlRadio.setEnabled(_enabled && _supportedTypes.contains(InterfaceType.WSDL));
        _esbRadio.setEnabled(_enabled && _supportedTypes.contains(InterfaceType.ESB));
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
        if (obj instanceof Interface) {
            init((Interface) obj, _related);
        }
    }

    /**
     * Initializes the controls with the information in the specified interface.
     * The specified interface object will not be modified.
     * 
     * @param intf the interface whose details should be used to initialize the
     *            controls
     * @param related the related interface (e.g. if creating a service during
     *            promotion)
     */
    public void init(Interface intf, Interface related) {
        _interface = intf;
        _related = related;
        IInterfaceControlAdapter adapter = getAdapter(intf);
        if (adapter != null) {
            adapter.init(_interface);
            adapter.setRelatedInterface(_related);
        }
        if (_javaRadio == null) {
            _adapter = adapter;
            fireSelectionChanged();
            return;
        }
        final Button radio;
        if (adapter instanceof JavaInterfaceControlAdapter) {
            radio = _javaRadio;
        } else if (adapter instanceof WSDLInterfaceControlAdapter) {
            radio = _wsdlRadio;
        } else if (adapter instanceof ESBInterfaceControlAdapter) {
            radio = _esbRadio;
        } else {
            radio = null;
        }
        if (radio == null) {
            _text.setText("");
            return;
        }
        radio.setSelection(true);
        updateAdapter(adapter);
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

    private IInterfaceControlAdapter getAdapter(Interface intf) {
        if (intf == null) {
            if (_supportedTypes.contains(InterfaceType.Java)) {
                return _adapters.get(InterfaceType.Java.eClass());
            } else if (_supportedTypes.contains(InterfaceType.WSDL)) {
                return _adapters.get(InterfaceType.WSDL.eClass());
            } else if (_supportedTypes.contains(InterfaceType.ESB)) {
                return _adapters.get(InterfaceType.ESB.eClass());
            }
        }
        return _adapters.get(intf.eClass());
    }

    private void updateAdapter(IInterfaceControlAdapter adapter) {
        _adapter = adapter;
        if (adapter != null) {
            if (adapter.getText() != null) {
                _text.setText(adapter.getText());
            }
            adapter.setRelatedInterface(_related);
        }
    }

    private void handleBrowse() {
        if (_adapter.browse(_browseButton.getShell(), _project)) {
            _text.setText(_adapter.getText());
        }
    }

    private void openInterface() {
        // TODO: use a preference for "useRelated"; for now, always true
        if (_adapter.open(_browseButton.getShell(), _project, true)) {
            _text.setText(_adapter.getText());
        }
    }
}
