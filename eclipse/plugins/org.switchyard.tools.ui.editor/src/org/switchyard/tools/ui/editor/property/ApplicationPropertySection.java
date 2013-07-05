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
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.DomainType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class ApplicationPropertySection extends GFPropertySection implements ITabbedPropertyConstants,
        ResourceSetListener {

    private static final String MESSAGE_TRACE_KEY = "org.switchyard.handlers.messageTrace.enabled";
    private Button _messageTraceCheckbox;
    private Object _businessObject;
    private boolean _inUpdate = false;
    private PictogramElement _pe = null;
    private TransactionalEditingDomain _domain = null;

    /**
     * Constructor.
     */
    public ApplicationPropertySection() {
        super();
    }

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

        _messageTraceCheckbox = factory.createButton(composite, "Enable Message Trace", SWT.CHECK | SWT.LEFT); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
        _messageTraceCheckbox.setLayoutData(data);

        _messageTraceCheckbox.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                widgetDefaultSelected(e);
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                if (_businessObject != null && !_inUpdate) {
                    updateMessageTraceHandler(_businessObject, _messageTraceCheckbox.getSelection());
                }
            }
        });

        _messageTraceCheckbox.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                // ignore
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.keyCode == SWT.ESC) {
                    _inUpdate = true;
                    _inUpdate = false;
                } else if (e.keyCode == SWT.CR) {
                    updateMessageTraceHandler(_businessObject, _messageTraceCheckbox.getSelection());
                }
            }
        });

        addDomainListener();
    }

    private void updateMessageTraceHandler(final Object bo, final boolean value) {
        boolean changed = false;
        if (bo instanceof DocumentRoot) {
            final DocumentRoot root = (DocumentRoot) bo;
            boolean handlerExists = testForMessageTraceHandler(root);
            if (handlerExists && !value) {
                changed = true;
                _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                    @Override
                    protected void doExecute() {
                        removeMessageTraceHandler(root);
                    }
                });
            } else if (!handlerExists && value) {
                changed = true;
                _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                    @Override
                    protected void doExecute() {
                        addMessageTraceHandler(root);
                    }
                });
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

    private void removeMessageTraceHandler(final DocumentRoot root) {
        if (root.getSwitchyard() != null) {
            DomainType domain = root.getSwitchyard().getDomain();
            if (domain != null) {
                PropertiesType properties = domain.getProperties();
                if (properties != null) {
                    for (PropertyType property : properties.getProperty()) {
                        if (MESSAGE_TRACE_KEY.equals(property.getName())) {
                            property.setValue(Boolean.toString(false));
                            return;
                        }
                    }
                }
            }
        }
    }

    private void addMessageTraceHandler(final DocumentRoot root) {
        if (root.getSwitchyard() != null) {
            DomainType domain = root.getSwitchyard().getDomain();
            if (domain == null) {
                domain = SwitchyardFactory.eINSTANCE.createDomainType();
                root.setDomain(domain);
            }
            PropertiesType properties = domain.getProperties();
            if (properties == null) {
                properties = SwitchyardFactory.eINSTANCE.createPropertiesType();
                domain.setProperties(properties);
            }
            for (PropertyType property : properties.getProperty()) {
                if (MESSAGE_TRACE_KEY.equals(property.getName())) {
                    property.setValue(Boolean.toString(true));
                    return;
                }
            }
            PropertyType messageTraceProperty = SwitchyardFactory.eINSTANCE.createPropertyType();
            messageTraceProperty.setName(MESSAGE_TRACE_KEY);
            messageTraceProperty.setValue(Boolean.toString(true));
            properties.getProperty().add(messageTraceProperty);
        }
    }

    private boolean testForMessageTraceHandler(final DocumentRoot root) {
        if (root.getSwitchyard() != null) {
            DomainType domain = root.getSwitchyard().getDomain();
            if (domain != null) {
                PropertiesType properties = domain.getProperties();
                if (properties != null) {
                    for (PropertyType property : properties.getProperty()) {
                        if (MESSAGE_TRACE_KEY.equals(property.getName())) {
                            return Boolean.valueOf(property.getValue());
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void refresh() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                PictogramElement pe = getSelectedPictogramElement();
                if (pe != null) {
                    _inUpdate = true;
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
                    if (_messageTraceCheckbox != null && !_messageTraceCheckbox.isDisposed()) {
                        // update checkbox based on SY/domain/handlers settings
                        if (_businessObject instanceof DocumentRoot) {
                            DocumentRoot root = (DocumentRoot) _businessObject;
                            boolean messageTraceHandlerExists = testForMessageTraceHandler(root);
                            _messageTraceCheckbox.setSelection(messageTraceHandlerExists);
                        }
                    }
                    _inUpdate = false;
                }
            }
        });
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

    @Override
    public void aboutToBeHidden() {
        _inUpdate = true;
        super.aboutToBeHidden();
    }
}
