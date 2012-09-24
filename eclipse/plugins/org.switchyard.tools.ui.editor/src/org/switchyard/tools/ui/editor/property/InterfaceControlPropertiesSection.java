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
package org.switchyard.tools.ui.editor.property;

import java.util.EnumSet;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.switchyard.tools.ui.common.InterfaceControl;
import org.switchyard.tools.ui.common.InterfaceControl.InterfaceType;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class InterfaceControlPropertiesSection extends GFPropertySection implements ITabbedPropertyConstants, ResourceSetListener {

    private Interface _interface;

    private InterfaceControl _interfaceControl;
    private Contract _service = null;
    private TransactionalEditingDomain _domain = null;
    private boolean _inUpdate = false;
    
    /**
     * Constructor.
     */
    public InterfaceControlPropertiesSection() {
        super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.views.properties.tabbed.AbstractPropertySection#createControls
     * (org.eclipse.swt.widgets.Composite,
     * org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
     */
    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);

        _interfaceControl = new InterfaceControl(null, EnumSet.of(InterfaceType.Java, InterfaceType.WSDL, InterfaceType.ESB));
        
        int numColumns = 3;
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout(numColumns, false));

        _interfaceControl.createControl(contents, 1);
        _interfaceControl.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                final Interface intf = _interfaceControl.getInterface();
                if (intf != null && !_inUpdate) {
                    if (_service != null && _domain != null) {
                        _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                            @Override
                            protected void doExecute() {
                                _service.getInterfaceGroup().clear();
                                _service.getInterfaceGroup().set(intf.getDocumentFeature(), intf);                            }
                        });
                    }
                }
            }
        });
        
        addDomainListener();
    }

    @Override
    public void refresh() {
        _inUpdate = true;
        PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
            _interface = null;
            if (bo instanceof Contract) {
                Contract contract = (Contract) bo;
                _interface = contract.getInterface();
                _service = contract;
                
                // init controls
                _interfaceControl.init(_interface, null);
            }
        }
        _inUpdate = false;
    }

    private void addDomainListener() {
        if (_domain == null) {
            _domain = (TransactionalEditingDomainImpl) SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
            _domain.addResourceSetListener(this);
        }
    }

    private void removeDomainListener() {
        if (_domain != null) {
            _domain.removeResourceSetListener(this);
        }
    }

    @Override
    public void dispose() {
        removeDomainListener();
        super.dispose();
    }

    @Override
    public NotificationFilter getFilter() {
        return null;
    }

    @Override
    public boolean isAggregatePrecommitListener() {
        return false;
    }

    @Override
    public boolean isPostcommitOnly() {
        return false;
    }

    @Override
    public boolean isPrecommitOnly() {
        return false;
    }

    @Override
    public void resourceSetChanged(ResourceSetChangeEvent arg0) {
        refresh();
    }

    @Override
    public Command transactionAboutToCommit(ResourceSetChangeEvent arg0) throws RollbackException {
        return null;
    }
}
