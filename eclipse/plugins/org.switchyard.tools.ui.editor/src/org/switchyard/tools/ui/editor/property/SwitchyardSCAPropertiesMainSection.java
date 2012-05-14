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

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class SwitchyardSCAPropertiesMainSection extends GFPropertySection implements ITabbedPropertyConstants {

    private Text _nameText;
    private Object _businessObject;
    private boolean _inUpdate = false;
    private PictogramElement _pe = null;

    /**
     * Constructor.
     */
    public SwitchyardSCAPropertiesMainSection() {
        super();
    }

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);

        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        Composite composite = factory.createFlatFormComposite(parent);
        FormData data;

        _nameText = factory.createText(composite, ""); //$NON-NLS-1$
//        _nameText.setEditable(false);
//        _nameText.setBackground(factory.getColors().getInactiveBackground());
        data = new FormData();
        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
        _nameText.setLayoutData(data);
        _nameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                if (_businessObject != null && !_inUpdate) {
                    updateObjectName(_businessObject, _nameText.getText().trim());
                }
            }
        });

        CLabel valueLabel = factory.createCLabel(composite, "Name:"); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(_nameText, -HSPACE);
        data.top = new FormAttachment(_nameText, 0, SWT.CENTER);
        valueLabel.setLayoutData(data);
    }

    @SuppressWarnings("restriction")
    private void updateObjectName(final Object bo, final String value) {
        TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
        if (bo instanceof org.eclipse.soa.sca.sca1_1.model.sca.Composite) {
            final org.eclipse.soa.sca.sca1_1.model.sca.Composite composite = 
                    (org.eclipse.soa.sca.sca1_1.model.sca.Composite) bo;
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    composite.setName(value.trim());
                }
            });
        } else if (bo instanceof Component) {
            final Component component = (Component) bo;
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    component.setName(value.trim());
                }
            });
            getDiagramEditor().refresh(_pe);
        } else if (bo instanceof Service) {
            final Service service = (Service) bo;
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    service.setName(value.trim());
                }
            });
        } else if (bo instanceof Reference) {
            final Reference reference = (Reference) bo;
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    reference.setName(value.trim());
                }
            });
        }
        if (_pe != null) {
            IUpdateContext updateContext = new UpdateContext(_pe);
            if (SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider() != null) {
                if (SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider() != null) {
                    SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider().updateIfPossible(updateContext);        
                }
            }
        }
    }

    @Override
    public void refresh() {
        PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            _pe = null;
            _businessObject = null;
            Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
            // the filter assured, that it is a EClass
            if (bo == null) {
                return;
            }
            _businessObject = bo;
            _pe = pe;
            _inUpdate = true;
            if (bo instanceof org.eclipse.soa.sca.sca1_1.model.sca.Composite) {
                String name = ((org.eclipse.soa.sca.sca1_1.model.sca.Composite) bo).getName();
                _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
            } else if (bo instanceof Component) {
                String name = ((Component) bo).getName();
                _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
            } else if (bo instanceof Service) {
                String name = ((Service) bo).getName();
                _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
            } else if (bo instanceof Reference) {
                String name = ((Reference) bo).getName();
                _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
            }
            _inUpdate = false;
        }
    }
}
