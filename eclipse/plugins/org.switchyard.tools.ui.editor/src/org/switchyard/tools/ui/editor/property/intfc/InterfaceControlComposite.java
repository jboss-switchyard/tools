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
package org.switchyard.tools.ui.editor.property.intfc;

import java.util.EnumSet;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.common.InterfaceControl;
import org.switchyard.tools.ui.common.InterfaceControl.InterfaceType;
import org.switchyard.tools.ui.editor.ComponentTypeExtensionManager;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;

/**
 * @author bfitzpat
 * 
 */
public class InterfaceControlComposite extends AbstractModelComposite<Contract> {

    private Interface _interface;

    private InterfaceControl _interfaceControl;
    private Contract _service = null;
    private boolean _inUpdate = false;

    /**
     * Create a new InterfaceControlComposite.
     * 
     * @param container the container
     * @param parent the parent composite
     * @param style the style bits
     */
    public InterfaceControlComposite(ICompositeContainer container, Composite parent, int style) {
        super(Contract.class, container, parent, style);

        _interfaceControl = new InterfaceControl(null, EnumSet.of(InterfaceType.Java, InterfaceType.WSDL,
                InterfaceType.ESB));

        int numColumns = 3;
        setLayout(new GridLayout(numColumns, false));

        _interfaceControl.createControl(this, numColumns);
        _interfaceControl.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                final Interface intf = _interfaceControl.getInterface();
                if (intf != null && !_inUpdate) {
                    if (_service != null) {
                        wrapOperation(new Runnable() {
                            public void run() {
                                _service.setInterface(intf);
                            }
                        });
                    }
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
            _interface = contract.getInterface();
            _service = contract;

            // init controls
            _interfaceControl.init(_interface, null);
            _interfaceControl
                    .setProject(JavaCore.create(PlatformResourceAdapterFactory.getContainingProject(contract)));
            if (_service.eContainer() instanceof Component) {
                _interfaceControl.setSupportedTypes(ComponentTypeExtensionManager
                        .getSupportedInterfaceTypes((Component) contract.eContainer()));
            } else {
                _interfaceControl.setSupportedTypes(EnumSet.allOf(InterfaceType.class));
            }
        }
        _inUpdate = false;
    }

}
