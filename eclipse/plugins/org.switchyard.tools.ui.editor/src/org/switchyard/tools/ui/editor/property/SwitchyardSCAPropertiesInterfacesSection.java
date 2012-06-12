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

import java.util.HashMap;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IInterfaceComposite;
import org.switchyard.tools.ui.editor.property.adapters.InterfaceCompositeAdapter;

/**
 * @author bfitzpat
 * 
 */
public class SwitchyardSCAPropertiesInterfacesSection extends GFPropertySection implements ITabbedPropertyConstants {

    private Interface _interface;

    private HashMap<Interface, IInterfaceComposite> _modelComposites = null;
    
    private PageBook _composite;
    private Composite _blank = null;
    
    /**
     * Constructor.
     */
    public SwitchyardSCAPropertiesInterfacesSection() {
        super();
        _modelComposites = new HashMap<Interface, IInterfaceComposite>();
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

        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        _composite = new PageBook(parent, SWT.NONE);
        factory.adapt(_composite);

        _blank = factory.createFlatFormComposite(_composite);
        _composite.showPage(_blank);
    }

    @Override
    public void refresh() {
        PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
            _interface = null;

            // the filter assured, that it is a Service or Reference
            if (bo == null) {
                _composite.showPage(_blank);
                _composite.redraw();
                return;
            }
            if (bo instanceof Contract) {
                Contract contract = (Contract) bo;
                _interface = contract.getInterface();
            }
            
            if (_interface != null) {
                if (_modelComposites.get(_interface) == null) {
                    TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
                    IInterfaceComposite composite = 
                            (IInterfaceComposite) InterfaceCompositeAdapter.adaptModelToComposite(_interface);
                    if (composite != null) {
                        ((AbstractSwitchyardComposite) composite).createContents(_composite, SWT.NONE);
                        factory.adapt(((AbstractSwitchyardComposite) composite).getPanel());
                        _modelComposites.put(_interface, composite);
                    }
                }
                IInterfaceComposite composite = (IInterfaceComposite) _modelComposites.get(_interface);
                if (composite != null) {
                    composite.setInterface(_interface);
                    _composite.showPage(((AbstractSwitchyardComposite)composite).getPanel());
                    Composite parent = _composite;
                    // this is a hack to get it to refresh properly
                    while (parent != null) {
                        parent.layout(true, true);
                        parent = parent.getParent();
                    }
                } else {
                    _composite.getParent().layout();
                    _composite.showPage(_blank);
                    _composite.layout(true, true);
                }
            } else {
                _composite.showPage(_blank);
                _composite.getParent().layout();
                _composite.layout(true, true);
            }
        }
    }
}
