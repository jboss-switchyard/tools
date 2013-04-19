/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
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
package org.switchyard.tools.ui.editor.property.component;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.graphiti.notification.INotificationService;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;

/**
 * @author bfitzpat
 * 
 */
public class ComponentMainComposite extends AbstractModelComposite<Component> {

    private Text _nameText;
    private Object _businessObject;
    private boolean _inUpdate = false;
    private NameListener _nameListener = null;

    /**
     * Create a new SecurityPolicyComposite.
     * 
     * @param container the container
     * @param parent the parent composite
     * @param style style bits
     */
    public ComponentMainComposite(ICompositeContainer container, Composite parent, int style) {
        super(Component.class, container, parent, style);

        FormLayout layout = new FormLayout();
        layout.marginBottom = ITabbedPropertyConstants.VMARGIN;
        layout.marginTop = ITabbedPropertyConstants.VMARGIN;
        layout.marginLeft = ITabbedPropertyConstants.HMARGIN;
        layout.marginRight = ITabbedPropertyConstants.HMARGIN;
        setLayout(layout);

        FormToolkit factory = getWidgetFactory();

        _nameText = factory.createText(this, ""); //$NON-NLS-1$
        FormData data = new FormData();
        data.left = new FormAttachment(0, 85);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, 4);
        _nameText.setLayoutData(data);

        _nameText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // ignore
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (_businessObject != null && !_inUpdate) {
                    updateObjectName(_businessObject, _nameText.getText().trim());
                }
            }
        });

        Label valueLabel = factory.createLabel(this, "Name:"); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(_nameText, -5);
        data.top = new FormAttachment(_nameText, 0, SWT.CENTER);
        valueLabel.setLayoutData(data);
        
    }

    private void updateObjectName(final Object bo, final String value) {
        wrapOperation(new Runnable() {
            @Override
            public void run() {
                if (bo instanceof Component) {
                    final Component component = (Component) bo;
                    if (!component.getName().contentEquals(value.trim())) {
                        component.setName(value.trim());
                        if (component.eContainer() instanceof SwitchYardType) {
                            SwitchYardType switchyard = (SwitchYardType) component.eContainer();
                            switchyard.setName(value.trim());
                        }
                        SwitchyardSCAEditor editor = SwitchyardSCAEditor.getEditor(component);
                        INotificationService notificationService = editor.getDiagramTypeProvider()
                                .getNotificationService();
                        notificationService.updatePictogramElements(notificationService
                                .calculateRelatedPictogramElements(new Object[] {component }));
                    }
                }
            }
        });
    }

    @Override
    public void refresh() {
        _inUpdate = true;
        try {
            Component composite = getTargetObject();
            if (composite != null) {
                _businessObject = composite;
                if (_nameListener == null) {
                    _nameListener = new NameListener();
                }
                composite.eAdapters().add(_nameListener);

                if (_nameText != null && !_nameText.isDisposed()) {
                    String name = composite.getName();
                    _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
                }
            }
        } finally {
            _inUpdate = false;
        }
    }

    private final class NameListener extends AdapterImpl {

        @Override
        public void notifyChanged(Notification msg) {
            if (msg.getFeature().equals(ScaPackage.eINSTANCE.getComponent_Name())) {
                refresh();
            }
            super.notifyChanged(msg);
        }

    }
}
