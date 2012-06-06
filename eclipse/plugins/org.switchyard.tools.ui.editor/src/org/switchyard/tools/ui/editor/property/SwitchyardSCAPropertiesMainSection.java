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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
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
public class SwitchyardSCAPropertiesMainSection extends GFPropertySection implements ITabbedPropertyConstants,
        ResourceSetListener {

    private Text _nameText;
    private Object _businessObject;
    private boolean _inUpdate = false;
    private PictogramElement _pe = null;
    private NameListener _nameListener = null;
    private TransactionalEditingDomain _domain = null;

    /**
     * Constructor.
     */
    public SwitchyardSCAPropertiesMainSection() {
        super();
    }

    @SuppressWarnings("restriction")
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
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);

        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        Composite composite = factory.createFlatFormComposite(parent);
        FormData data;

        _nameText = factory.createText(composite, ""); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
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

        _nameText.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                // ignore
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.keyCode == SWT.ESC) {
                    _inUpdate = true;
                    if (_businessObject instanceof org.eclipse.soa.sca.sca1_1.model.sca.Composite) {
                        String name = ((org.eclipse.soa.sca.sca1_1.model.sca.Composite) _businessObject).getName();
                        _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
                    } else if (_businessObject instanceof Component) {
                        String name = ((Component) _businessObject).getName();
                        _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
                    } else if (_businessObject instanceof Service) {
                        String name = ((Service) _businessObject).getName();
                        _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
                    } else if (_businessObject instanceof Reference) {
                        String name = ((Reference) _businessObject).getName();
                        _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
                    } else if (_businessObject instanceof ComponentService) {
                        String name = ((ComponentService) _businessObject).getName();
                        _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
                    } else if (_businessObject instanceof ComponentReference) {
                        String name = ((ComponentReference) _businessObject).getName();
                        _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
                    }
                    _inUpdate = false;
                } else if (e.keyCode == SWT.CR) {
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

        addDomainListener();
    }

    @SuppressWarnings("restriction")
    private void updateObjectName(final Object bo, final String value) {
        if (bo instanceof org.eclipse.soa.sca.sca1_1.model.sca.Composite) {
            final org.eclipse.soa.sca.sca1_1.model.sca.Composite composite = (org.eclipse.soa.sca.sca1_1.model.sca.Composite) bo;
            _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                @Override
                protected void doExecute() {
                    composite.setName(value.trim());
                }
            });
        } else if (bo instanceof Component) {
            final Component component = (Component) bo;
            _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                @Override
                protected void doExecute() {
                    component.setName(value.trim());
                }
            });
            if (_pe != null && getDiagramEditor() != null) {
                getDiagramEditor().refresh(_pe);
            }
        } else if (bo instanceof Service) {
            final Service service = (Service) bo;
            _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                @Override
                protected void doExecute() {
                    service.setName(value.trim());
                }
            });
        } else if (bo instanceof Reference) {
            final Reference reference = (Reference) bo;
            _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                @Override
                protected void doExecute() {
                    reference.setName(value.trim());
                }
            });
        } else if (bo instanceof ComponentService) {
            final ComponentService cservice = (ComponentService) bo;
            _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                @Override
                protected void doExecute() {
                    cservice.setName(value.trim());
                }
            });
        } else if (bo instanceof ComponentReference) {
            final ComponentReference creference = (ComponentReference) bo;
            _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                @Override
                protected void doExecute() {
                    creference.setName(value.trim());
                }
            });
        }
        if (_pe != null) {
            IUpdateContext updateContext = new UpdateContext(_pe);
            if (SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider() != null) {
                if (SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider() != null) {
                    SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider()
                            .updateIfPossible(updateContext);
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

            if (_nameListener == null) {
                _nameListener = new NameListener();
            }
            EObject eobj = (EObject) bo;
            eobj.eAdapters().add(_nameListener);

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
            } else if (bo instanceof ComponentService) {
                String name = ((ComponentService) bo).getName();
                _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
            } else if (bo instanceof ComponentReference) {
                String name = ((ComponentReference) bo).getName();
                _nameText.setText(name == null ? "" : name); //$NON-NLS-1$
            }
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

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.emf.transaction.ResourceSetListener#transactionAboutToCommit
     * (org.eclipse.emf.transaction.ResourceSetChangeEvent)
     */
    @Override
    public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.emf.transaction.ResourceSetListener#isAggregatePrecommitListener
     * ()
     */
    @Override
    public boolean isAggregatePrecommitListener() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.emf.transaction.ResourceSetListener#isPrecommitOnly()
     */
    @Override
    public boolean isPrecommitOnly() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.emf.transaction.ResourceSetListener#isPostcommitOnly()
     */
    @Override
    public boolean isPostcommitOnly() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.emf.transaction.ResourceSetListener#resourceSetChanged(org
     * .eclipse.emf.transaction.ResourceSetChangeEvent)
     */
    @Override
    public void resourceSetChanged(ResourceSetChangeEvent event) {
        refresh();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.emf.transaction.ResourceSetListener#getFilter()
     */
    @Override
    public NotificationFilter getFilter() {
        return null;
    }

    @Override
    public void dispose() {
        removeDomainListener();
        super.dispose();
    }
}
