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
package org.switchyard.tools.ui.editor.components.soap;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;

/**
 * @author bfitzpat
 * 
 */
public class SOAPBindingWizardPage extends WizardPage {

    private SOAPBindingType _binding = SOAPFactory.eINSTANCE.createSOAPBindingType();
    private SOAPBindingServiceComposite _soapServiceComposite = null;
    private SOAPBindingReferenceComposite _soapReferenceComposite = null;
    private Contract _targetContainer;

    /**
     * @param pageName String for name
     */
    public SOAPBindingWizardPage(String pageName) {
        super(pageName);
        setTitle("Specify SOAP Binding Details");
        setDescription("Specify pertinent details for your SOAP Binding.");
    }

    @Override
    public void createControl(Composite parent) {
        _targetContainer = ((SOAPBindingWizard) getWizard()).getTargetContainer();
        if (_targetContainer instanceof Reference) {
            _binding.setSocketAddr(null);
        }
        if (_targetContainer.getInterface() instanceof WSDLPortType) {
            String wsdlPortType = ((WSDLPortType) _targetContainer.getInterface()).getInterface();
            if (wsdlPortType != null) {
                final int fragmentIndex = wsdlPortType.indexOf('#');
                if (fragmentIndex >= 0) {
                    _binding.setWsdl(wsdlPortType.substring(0, fragmentIndex));
                } else {
                    _binding.setWsdl(wsdlPortType);
                }
            }
        }
        if (_targetContainer instanceof Reference) {
            _soapReferenceComposite = new SOAPBindingReferenceComposite();
            _soapReferenceComposite.setTargetObject(_targetContainer);
            _soapReferenceComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent arg0) {
                    setErrorMessage(_soapReferenceComposite.getErrorMessage());
                    setPageComplete(_soapReferenceComposite.getErrorMessage() == null);
                }
            });
            _soapReferenceComposite.createContents(parent, SWT.NONE);
            _soapReferenceComposite.setBinding(_binding);
            setControl(_soapReferenceComposite.getPanel());
            setPageComplete(_soapReferenceComposite.getErrorMessage() == null);
        } else {
            _soapServiceComposite = new SOAPBindingServiceComposite();
            _soapServiceComposite.setTargetObject(_targetContainer);
            _soapServiceComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent arg0) {
                    setErrorMessage(_soapServiceComposite.getErrorMessage());
                    setPageComplete(_soapServiceComposite.getErrorMessage() == null);
                }
            });
            _soapServiceComposite.createContents(parent, SWT.NONE);
            _soapServiceComposite.setBinding(_binding);
            setControl(_soapServiceComposite.getPanel());
            setPageComplete(_soapServiceComposite.getErrorMessage() == null);
        }
        setErrorMessage(null);
    }

    /**
     * @return the binding being edited.
     */
    public Binding getBinding() {
        return _soapServiceComposite.getBinding();
    }

}
