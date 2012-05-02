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
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

/**
 * @author bfitzpat
 *
 */
public class SwitchyardSCAPropertiesMain extends GFPropertySection implements ITabbedPropertyConstants {

    private Text _nameText;

    /**
     * Constructor. 
     */
    public SwitchyardSCAPropertiesMain() {
        super();
    }

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);

        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        Composite composite = factory.createFlatFormComposite(parent);
        FormData data;

        _nameText = factory.createText(composite, ""); //$NON-NLS-1$
        _nameText.setEditable(false);
        data = new FormData();
        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
        _nameText.setLayoutData(data);

        CLabel valueLabel = factory.createCLabel(composite, "Name:"); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(_nameText, -HSPACE);
        data.top = new FormAttachment(_nameText, 0, SWT.CENTER);
        valueLabel.setLayoutData(data);
    }

    @Override
    public void refresh() {
        PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
            // the filter assured, that it is a EClass
            if (bo == null) {
                return;
            }
            if (bo instanceof org.eclipse.soa.sca.sca1_1.model.sca.Composite) {
                String name = ((org.eclipse.soa.sca.sca1_1.model.sca.Composite) bo).getName();
                _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
            } else if (bo instanceof org.eclipse.soa.sca.sca1_1.model.sca.Component) {
                String name = ((org.eclipse.soa.sca.sca1_1.model.sca.Component) bo).getName();
                _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
            } else if (bo instanceof org.eclipse.soa.sca.sca1_1.model.sca.Service) {
                String name = ((org.eclipse.soa.sca.sca1_1.model.sca.Service) bo).getName();
                _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
            }
        }
    }
}
