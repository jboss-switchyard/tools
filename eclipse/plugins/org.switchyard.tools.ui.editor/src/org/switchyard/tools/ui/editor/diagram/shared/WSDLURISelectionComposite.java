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

import java.net.URI;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;

/**
 * @author bfitzpat
 *
 */
public class WSDLURISelectionComposite {

    // change listeners
    private ListenerList _changeListeners;

    private Composite _panel;
    private Text _mWSDLInterfaceURIText;
    private String _sWSDLURI = null;
    private Interface _interface = null;
    private SOAPBindingType _binding = null;
    private String _errorMessage = null;
    private Text _mWSDLPortText;
    private Label _portLabel;
    private String _bindingPort = null;

    /**
     * Constructor.
     */
    public WSDLURISelectionComposite() {
        // empty
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    public void createContents(Composite parent, int style) {

        // TODO: Add support for choosing an existing WSDL in the project
        // (relative path)
        // TODO: Add support for importing a WSDL from the file system (into the
        // project, ends up being relative path)
        // TODO: Add support for creating a new WSDL in the project (ends up
        // being relative path)

        _panel = new Composite(parent, style);
        GridLayout gl = new GridLayout();
        gl.numColumns = 3;
        _panel.setLayout(gl);
        // name
        new Label(_panel, SWT.NONE).setText("WSDL URI:");
        _mWSDLInterfaceURIText = new Text(_panel, SWT.BORDER);
        if (_interface != null && _interface instanceof WSDLPortType) {
            _mWSDLInterfaceURIText.setText(((WSDLPortType) _interface).getInterface());
        }
        _mWSDLInterfaceURIText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                handleModify();
                fireChangedEvent(_mWSDLInterfaceURIText);
            }
        });
        GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
        uriGD.horizontalSpan = 2;
        _mWSDLInterfaceURIText.setLayoutData(uriGD);

        _portLabel = new Label(_panel, SWT.NONE);
        _portLabel.setText("Port:");
        _mWSDLPortText = new Text(_panel, SWT.BORDER);
        _mWSDLPortText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                _bindingPort = _mWSDLPortText.getText().trim();
                handleModify();
                fireChangedEvent(_mWSDLPortText);
            }
        });

        GridData portGD = new GridData(GridData.FILL_HORIZONTAL);
        portGD.horizontalSpan = 2;
        _mWSDLPortText.setLayoutData(portGD);

        setVisibilityOfPortControls(this._binding != null);
    }

    private void setVisibilityOfPortControls(boolean flag) {
        _portLabel.setVisible(flag);
        _mWSDLPortText.setVisible(flag);
    }

    private void handleModify() {
        _sWSDLURI = _mWSDLInterfaceURIText.getText().trim();
        if (_interface != null && _interface instanceof WSDLPortType) {
            ((WSDLPortType) _interface).setInterface(_sWSDLURI);
        }
        if (_binding != null) {
            _binding.setWsdl(_sWSDLURI);
            if (_bindingPort != null && _bindingPort.trim().length() > 0) {
                try {
                    Integer.parseInt(_bindingPort);
                    _binding.setSocketAddr(_bindingPort);
                } catch (NumberFormatException nfe) {
                    _binding.setSocketAddr(null);
                }
            }
            ContextMapperType contextMapper = SwitchyardFactory.eINSTANCE.createContextMapperType();
            _binding.setContextMapper(contextMapper);
        }
        validate();
    }

    private void validate() {
        this._errorMessage = null;
        String uriString = _mWSDLInterfaceURIText.getText();

        if (uriString == null || uriString.trim().length() == 0) {
            _errorMessage = "No uri specified";
        } else if (uriString.trim().length() < uriString.length()) {
            _errorMessage = "No spaces allowed in uri";
        } else {
            try {
                URI.create(uriString);
            } catch (IllegalArgumentException e) {
                _errorMessage = "Invalid URI";
            }
        }

        String portString = _bindingPort;
        if (portString != null && portString.trim().length() > 0) {
            try {
                Integer.parseInt(_bindingPort);
            } catch (NumberFormatException nfe) {
                _errorMessage = "Port must be a valid integer";
            }
        }
    }

    /**
     * @return wsdl URI string
     */
    public String getWSDLURI() {
        return this._sWSDLURI;
    }

    /**
     * @return interface
     */
    public Interface getInterface() {
        return _interface;
    }

    /**
     * @param cInterface interface
     */
    public void setInterface(Interface cInterface) {
        this._interface = cInterface;
        if (_mWSDLInterfaceURIText != null && !_mWSDLInterfaceURIText.isDisposed()) {
            _mWSDLInterfaceURIText.setText(((WSDLPortType) this._interface).getInterface());
        }
    }

    /**
     * @return string error message
     */
    public String getErrorMessage() {
        return _errorMessage;
    }

    /**
     * If we changed, fire a changed event.
     * 
     * @param source
     */
    private void fireChangedEvent(Object source) {
        ChangeEvent e = new ChangeEvent(source);
        // inform any listeners of the resize event
        Object[] listeners = this._changeListeners.getListeners();
        for (int i = 0; i < listeners.length; ++i) {
            ((ChangeListener) listeners[i]).stateChanged(e);
        }
    }

    /**
     * Add a change listener.
     * 
     * @param listener new listener
     */
    public void addChangeListener(ChangeListener listener) {
        if (this._changeListeners == null) {
            this._changeListeners = new ListenerList();
        }
        this._changeListeners.add(listener);
    }

    /**
     * Remove a change listener.
     * 
     * @param listener to remove
     */
    public void removeChangeListener(ChangeListener listener) {
        this._changeListeners.remove(listener);
    }

    /**
     * @return panel
     */
    public Composite getcPanel() {
        return _panel;
    }

    /**
     * @param switchYardBindingType binding
     */
    public void setcBinding(SOAPBindingType switchYardBindingType) {
        this._binding = switchYardBindingType;
        if (_mWSDLInterfaceURIText != null && !_mWSDLInterfaceURIText.isDisposed()) {
            _mWSDLInterfaceURIText.setText(_binding.getWsdl());
        }
        setVisibilityOfPortControls(this._binding != null);
    }

    /**
     * @return string port
     */
    public String getsBindingPort() {
        return _bindingPort;
    }
}
