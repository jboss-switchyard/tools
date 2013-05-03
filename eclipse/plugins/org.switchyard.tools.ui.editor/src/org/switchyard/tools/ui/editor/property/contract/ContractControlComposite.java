/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.switchyard.tools.ui.editor.property.contract;

import java.util.EnumSet;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.common.ContractControl;
import org.switchyard.tools.ui.common.InterfaceControl.InterfaceType;
import org.switchyard.tools.ui.editor.ComponentTypeExtensionManager;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;

/**
 * ContractControlComposite
 * 
 * <p/>
 * Used for Contract property pages.
 */
public class ContractControlComposite extends AbstractModelComposite<Contract> {

    private ContractControl _serviceControl;
    private boolean _inUpdate = false;

    /**
     * Create a new InterfaceControlComposite.
     * 
     * @param container the container
     * @param parent the parent composite
     * @param style the style bits
     */
    public ContractControlComposite(ICompositeContainer container, Composite parent, int style) {
        super(Contract.class, container, parent, style);

        _serviceControl = new ContractControl(ScaPackage.eINSTANCE.getService(), null, EnumSet.of(InterfaceType.Java,
                InterfaceType.WSDL, InterfaceType.ESB));

        int numColumns = 3;
        setLayout(new GridLayout(numColumns, false));

        _serviceControl.createControl(this, numColumns);
        _serviceControl.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                if (!_inUpdate) {
                    getContainer().validated(_serviceControl.getStatus());
                }
            }
        });

        adaptChildren(this);
    }

    @Override
    public void refresh() {
        _inUpdate = true;
        Contract contract = getTargetObject();
        if (contract != null) {
            _serviceControl.setProject(JavaCore.create(PlatformResourceAdapterFactory.getContainingProject(contract)));
            _serviceControl.setSelection(new StructuredSelection(contract));
            if (contract.eContainer() instanceof Component) {
                _serviceControl.setSupportedInterfaceTypes(ComponentTypeExtensionManager
                        .getSupportedInterfaceTypes((Component) contract.eContainer()));
            } else {
                _serviceControl.setSupportedInterfaceTypes(EnumSet.allOf(InterfaceType.class));
            }
        }
        _inUpdate = false;
    }
}
