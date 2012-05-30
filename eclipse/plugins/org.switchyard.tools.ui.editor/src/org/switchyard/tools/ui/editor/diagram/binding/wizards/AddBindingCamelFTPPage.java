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
package org.switchyard.tools.ui.editor.diagram.binding.wizards;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;
import org.switchyard.tools.ui.editor.diagram.shared.CamelFTPConsumerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.CamelFTPProducerComposite;

/**
 * @author bfitzpat
 * 
 */
public class AddBindingCamelFTPPage extends BaseWizardPage implements IRefreshablePage {

    private SCADiagramAddBindingStartPage _startPage = null;
    private CamelFTPConsumerComposite _consumerComposite = null;
    private CamelFTPProducerComposite _producerComposite = null;

    /**
     * @param start Start page reference
     * @param pageName String for name
     */
    public AddBindingCamelFTPPage(SCADiagramAddBindingStartPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    protected AddBindingCamelFTPPage(String pageName) {
        super(pageName);
        setTitle("Specify FTP Binding Details");
        setDescription("Specify pertinent details for your FTP Binding.");
    }

    @Override
    public void createControl(Composite parent) {
        
        boolean showConsumer = true;
        if (getWizard() instanceof SCADiagramAddBindingWizard) {
            if (((SCADiagramAddBindingWizard)getWizard()).getParentObject() instanceof Reference) {
                showConsumer = false;
            }
        }
        
        if (showConsumer) {
            _consumerComposite = new CamelFTPConsumerComposite();
            if (_startPage != null && _startPage.getBinding() != null && _startPage.getBinding() instanceof CamelFtpBindingType) {
                _consumerComposite.setBinding((CamelFtpBindingType) _startPage.getBinding());
            }
            _consumerComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent arg0) {
                    setErrorMessage(_consumerComposite.getErrorMessage());
                    setPageComplete(_consumerComposite.getErrorMessage() == null);
                }
            });
            _consumerComposite.createContents(parent, SWT.NONE);
    
            setControl(_consumerComposite.getPanel());
        } else {
            _producerComposite = new CamelFTPProducerComposite();
            if (_startPage != null && _startPage.getBinding() != null && _startPage.getBinding() instanceof CamelFtpBindingType) {
                _producerComposite.setBinding((CamelFtpBindingType) _startPage.getBinding());
            }
            _producerComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent arg0) {
                    setErrorMessage(_producerComposite.getErrorMessage());
                    setPageComplete(_producerComposite.getErrorMessage() == null);
                }
            });
            _producerComposite.createContents(parent, SWT.NONE);
    
            setControl(_producerComposite.getPanel());
        }

        setErrorMessage(null);
    }

    @Override
    public boolean getSkippable() {
        if (this._startPage != null && this._startPage.getBinding() != null
                && _startPage.getBinding() instanceof CamelFtpBindingType) {
            return false;
        }
        return true;
    }

    @Override
    public void refresh() {
        if (_startPage != null && _startPage.getBinding() instanceof CamelFtpBindingType) {
            if (_consumerComposite != null && _consumerComposite.getPanel() != null) {
                _consumerComposite.setBinding(_startPage.getBinding());
            } else if (_producerComposite != null && _producerComposite.getPanel() != null) {
                _producerComposite.setBinding(_startPage.getBinding());
            }
        }
    }
}
