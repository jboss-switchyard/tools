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

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IImplementationComposite;
import org.switchyard.tools.ui.editor.property.adapters.ImplementationCompositeAdapter;

/**
 * @author bfitzpat
 * 
 */
public class SwitchyardSCAPropertiesImplementationSection extends GFPropertySection implements ITabbedPropertyConstants {

    private Implementation _implementation;

    private PageBook _composite;
    private Composite _blank = null;
    
    /**
     * Constructor.
     */
    public SwitchyardSCAPropertiesImplementationSection() {
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
    }

    @Override
    public void refresh() {
        PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
            _implementation = null;

            // the filter assured, that it is a Service or Reference
            if (bo == null) {
                return;
            }
            if (bo instanceof Component) {
                Component component = (Component) bo;
                _implementation = component.getImplementation();
            }
            
            if (_implementation != null) {
                TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
                IImplementationComposite composite = 
                        (IImplementationComposite) ImplementationCompositeAdapter.adaptModelToComposite(_implementation);
                if (composite != null) {
                    ((AbstractSwitchyardComposite) composite).createContents(_composite, SWT.NONE);
                    factory.adapt(((AbstractSwitchyardComposite) composite).getPanel());
                }
                if (composite != null) {
                    composite.setImplementation(_implementation);
                    _composite.showPage(((AbstractSwitchyardComposite)composite).getPanel());
                    _composite.redraw();
                } else {
                    _composite.showPage(_blank);
                    _composite.redraw();
                }
            }
        }
    }
}
