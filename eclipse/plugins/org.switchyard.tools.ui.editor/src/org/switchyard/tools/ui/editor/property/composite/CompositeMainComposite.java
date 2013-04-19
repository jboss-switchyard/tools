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
package org.switchyard.tools.ui.editor.property.composite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.notification.INotificationService;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
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
public class CompositeMainComposite extends AbstractModelComposite<org.eclipse.soa.sca.sca1_1.model.sca.Composite> {

    private Text _nameText;
    private Object _businessObject;
    private boolean _inUpdate = false;
    private PictogramElement _pe = null;
    private NameListener _nameListener = null;
    private Text _targetNamespaceText;
    private Label _tnsLabel;

    /**
     * Create a new SecurityPolicyComposite.
     * 
     * @param container the container
     * @param parent the parent composite
     * @param style style bits
     */
    public CompositeMainComposite(ICompositeContainer container, Composite parent, int style) {
        super(org.eclipse.soa.sca.sca1_1.model.sca.Composite.class, container, parent, style);

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

//        if (getContainer() instanceof PropertyPage) {
//            _nameText.addModifyListener(new ModifyListener() {
//    
//                @Override
//                public void modifyText(ModifyEvent arg0) {
//                    if (!_inUpdate) {
//                        updateObjectName(_businessObject, _nameText.getText().trim());
//                    }
//                }
//                
//            });
//        } else {
//            _nameText.addKeyListener(new KeyListener() {
//                @Override
//                public void keyPressed(KeyEvent e) {
//                    // ignore
//                }
//    
//                @Override
//                public void keyReleased(KeyEvent e) {
//                    if (e.keyCode == SWT.ESC) {
//                        _inUpdate = true;
//                        String name = ((org.eclipse.soa.sca.sca1_1.model.sca.Composite) _businessObject).getName();
//                        _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
//                        _inUpdate = false;
//                    } else if (e.keyCode == SWT.CR) {
//                        updateObjectName(_businessObject, _nameText.getText().trim());
//                    }
//                }
//            });
//        }

        Label valueLabel = factory.createLabel(this, "Name:"); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(_nameText, -5);
        data.top = new FormAttachment(_nameText, 0, SWT.CENTER);
        valueLabel.setLayoutData(data);
        
        _targetNamespaceText = factory.createText(this, "");
        data = new FormData();
        Integer widthTimes1Point5 = new Integer((int) (85 * 1.5));
        data.left = new FormAttachment(0, widthTimes1Point5.intValue());
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(_nameText, 4);
        _targetNamespaceText.setLayoutData(data);

        _targetNamespaceText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // ignore
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (_businessObject != null && !_inUpdate) {
                    updateTargetNamespace(_businessObject, _targetNamespaceText.getText().trim());
                }
            }
        });
        
        _targetNamespaceText.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                // ignore
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.keyCode == SWT.ESC) {
                    _inUpdate = true;
                    undo(_targetNamespaceText);
                    _inUpdate = false;
                } else if (e.keyCode == SWT.CR || e.keyCode == SWT.TAB) {
                    updateTargetNamespace(_businessObject, _targetNamespaceText.getText().trim());
                }
            }
        });

        _tnsLabel = factory.createLabel(this, "Target Namespace:");
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(_targetNamespaceText, -5);
        data.top = new FormAttachment(_targetNamespaceText, 0, SWT.CENTER);
        _tnsLabel.setLayoutData(data);
        
//        addDomainListener();
    }

    private void updateObjectName(final Object bo, final String value) {
        wrapOperation(new Runnable() {
            @Override
            public void run() {
                boolean changed = false;
                if (bo instanceof org.eclipse.soa.sca.sca1_1.model.sca.Composite) {
                    final org.eclipse.soa.sca.sca1_1.model.sca.Composite composite = (org.eclipse.soa.sca.sca1_1.model.sca.Composite) bo;
                    if (!composite.getName().contentEquals(value.trim())) {
                        changed = true;
                        composite.setName(value.trim());
                        if (composite.eContainer() instanceof SwitchYardType) {
                            SwitchYardType switchyard = (SwitchYardType) composite.eContainer();
                            switchyard.setName(value.trim());
                        }
                        SwitchyardSCAEditor editor = SwitchyardSCAEditor.getEditor(composite);
                        INotificationService notificationService = editor.getDiagramTypeProvider()
                                .getNotificationService();
                        notificationService.updatePictogramElements(notificationService
                                .calculateRelatedPictogramElements(new Object[] {composite }));
                    }
                }
                if (_pe != null && changed) {
                    IUpdateContext updateContext = new UpdateContext(_pe);
                    if (SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider() != null) {
                        if (SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider() != null) {
                            SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider()
                                    .updateIfPossible(updateContext);
                        }
                    }
                }
            }
        });
    }

    @Override
    public void refresh() {
        _inUpdate = true;
        try {
            org.eclipse.soa.sca.sca1_1.model.sca.Composite composite = getTargetObject();
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
                if (_targetNamespaceText != null && !_targetNamespaceText.isDisposed()) {
                    // update TNS text box based on SY/composite settings
                    String tns = composite.getTargetNamespace();
                    _targetNamespaceText.setText(tns);
                }
            }
        } finally {
            _inUpdate = false;
        }
    }

    private final class NameListener extends AdapterImpl {

        @Override
        public void notifyChanged(Notification msg) {
            if (msg.getFeature().equals(ScaPackage.eINSTANCE.getComposite_Name())) {
                refresh();
            } else if (msg.getFeature().equals(ScaPackage.eINSTANCE.getComponent_Name())) {
                refresh();
            } else {
                refresh();
            }
            super.notifyChanged(msg);
        }

    }

    private void undo(Control control) {
        if (control.equals(_targetNamespaceText)) {
            if (_targetNamespaceText != null && !_targetNamespaceText.isDisposed()) {
                // update TNS text box based on SY/composite settings
                if (_businessObject instanceof org.eclipse.soa.sca.sca1_1.model.sca.Composite) {
                    final org.eclipse.soa.sca.sca1_1.model.sca.Composite composite = (org.eclipse.soa.sca.sca1_1.model.sca.Composite) _businessObject;
                    _targetNamespaceText.setText(composite.getTargetNamespace());
                }
            }
        }
    }

    private void updateTargetNamespace(final Object bo, final String value) {
        wrapOperation(new Runnable() {
            @Override
            public void run() {
                boolean changed = false;
                if (bo instanceof org.eclipse.soa.sca.sca1_1.model.sca.Composite) {
                    final org.eclipse.soa.sca.sca1_1.model.sca.Composite composite = (org.eclipse.soa.sca.sca1_1.model.sca.Composite) _businessObject;
                    final SwitchYardType switchyard = (SwitchYardType) composite.eContainer();
                    changed = true;
                    switchyard.setTargetNamespace(value);
                    composite.setTargetNamespace(value);
                }
                if (_pe != null && changed) {
                    IUpdateContext updateContext = new UpdateContext(_pe);
                    if (SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider() != null) {
                        if (SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider() != null) {
                            SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider()
                                    .updateIfPossible(updateContext);
                        }
                    }
                }
            }
        });
    }
}
