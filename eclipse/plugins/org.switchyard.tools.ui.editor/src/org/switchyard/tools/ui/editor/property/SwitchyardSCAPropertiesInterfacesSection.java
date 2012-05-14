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

import java.beans.PropertyChangeEvent;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.ui.editor.diagram.shared.JavaInterfaceSelectionComposite;
import org.switchyard.tools.ui.editor.diagram.shared.WSDLURISelectionComposite;

/**
 * @author bfitzpat
 * 
 */
public class SwitchyardSCAPropertiesInterfacesSection extends GFPropertySection implements ITabbedPropertyConstants {

    private Interface _interface;

    private PageBook _composite;
    private JavaInterfaceSelectionComposite _javaInterfaceComposite = null;
    private WSDLURISelectionComposite _wsdlComposite = null;
    private Composite _blank = null;
    
    /**
     * Constructor.
     */
    public SwitchyardSCAPropertiesInterfacesSection() {
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

        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        _composite = new PageBook(parent, SWT.NONE);
        factory.adapt(_composite);

        _blank = factory.createFlatFormComposite(_composite);
        _composite.showPage(_blank);

        createJavaInterfaceComposite(_composite);
        createWSDLInterfaceComposite(_composite);

    }

    private void createJavaInterfaceComposite(Composite parent) {
        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        _javaInterfaceComposite = new JavaInterfaceSelectionComposite();
        _javaInterfaceComposite.createContents(parent, SWT.NONE);
        factory.adapt(_javaInterfaceComposite.getcPanel());
    }
    
    private void createWSDLInterfaceComposite(Composite parent) {
        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        _wsdlComposite = new WSDLURISelectionComposite();
        _wsdlComposite.createContents(parent, SWT.NONE);
        factory.adapt(_wsdlComposite.getcPanel());
    }

    @Override
    public void refresh() {
        PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
            _interface = null;

            // the filter assured, that it is a Service or Reference
            if (bo == null) {
                return;
            }
            if (bo instanceof Service) {
                Service service = (Service) bo;
                _interface = service.getInterface();
            } else if (bo instanceof Reference) {
                Reference reference = (Reference) bo;
                _interface = reference.getInterface();
            }

            if (_interface != null) {
                if (_interface instanceof JavaInterface) {
                    _javaInterfaceComposite.setInterface(_interface);
                    _composite.showPage(_javaInterfaceComposite.getcPanel());
                } else if (_interface instanceof WSDLPortType) {
                    _wsdlComposite.setInterface(_interface);
                    _composite.showPage(_wsdlComposite.getcPanel());
                } else {
                    _composite.showPage(_blank);
                }
            }
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.toString());
    }
}
