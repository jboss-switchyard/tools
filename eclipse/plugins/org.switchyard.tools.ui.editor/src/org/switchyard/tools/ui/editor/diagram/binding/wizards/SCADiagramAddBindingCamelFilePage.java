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
import org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;
import org.switchyard.tools.ui.editor.diagram.shared.CamelFileConsumerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.CamelFileProducerComposite;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramAddBindingCamelFilePage extends BaseWizardPage implements IRefreshablePage {

    private SCADiagramAddBindingStartPage _startPage = null;
    private CamelFileConsumerComposite _consumerComposite = null;
    private CamelFileProducerComposite _producerComposite = null;

    /**
     * @param start Start page reference
     * @param pageName String for name
     */
    public SCADiagramAddBindingCamelFilePage(SCADiagramAddBindingStartPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    protected SCADiagramAddBindingCamelFilePage(String pageName) {
        super(pageName);
        setTitle("Specify Camel File Binding Details");
        setDescription("Specify pertinent details for your Camel File Binding.");
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
            _consumerComposite = new CamelFileConsumerComposite();
            if (_startPage != null && _startPage.getBinding() != null && _startPage.getBinding() instanceof CamelFileBindingType) {
                _consumerComposite.setBinding((CamelFileBindingType) _startPage.getBinding());
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
            _producerComposite = new CamelFileProducerComposite();
            if (_startPage != null && _startPage.getBinding() != null && _startPage.getBinding() instanceof CamelFileBindingType) {
                _producerComposite.setBinding((CamelFileBindingType) _startPage.getBinding());
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
                && _startPage.getBinding() instanceof CamelFileBindingType) {
            return false;
        }
        return super.getSkippable();
    }

    @Override
    public void refresh() {
        if (_startPage != null && _startPage.getBinding() instanceof CamelFileBindingType) {
            if (_consumerComposite != null && _consumerComposite.getPanel() != null) {
                _consumerComposite.setBinding(_startPage.getBinding());
            } else if (_producerComposite != null && _producerComposite.getPanel() != null) {
                _producerComposite.setBinding(_startPage.getBinding());
            }
        }
    }
}
