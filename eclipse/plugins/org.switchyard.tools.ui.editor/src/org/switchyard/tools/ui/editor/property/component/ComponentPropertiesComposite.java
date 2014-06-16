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

import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.switchyard.tools.ui.editor.diagram.shared.DomainPropertyInputDialog;
import org.switchyard.tools.ui.editor.diagram.shared.SCAPropertyValueTable;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;

/**
 * @author bfitzpat
 * 
 */
public class ComponentPropertiesComposite extends AbstractModelComposite<Component>
    implements ResourceSetListener {

    private Component _component;
    private FormToolkit _toolkit = null;
    private TransactionalEditingDomain _domain = null;
    private SCAPropertyValueTable _componentProperties = null;

    /**
     * Create a new InterfaceControlComposite.
     * 
     * @param container the container
     * @param parent the parent composite
     * @param style the style bits
     */
    public ComponentPropertiesComposite(ICompositeContainer container, Composite parent, int style) {
        super(Component.class, container, parent, style);

        FormLayout layout = new FormLayout();
        layout.marginBottom = ITabbedPropertyConstants.VMARGIN;
        layout.marginTop = ITabbedPropertyConstants.VMARGIN;
        layout.marginLeft = ITabbedPropertyConstants.HMARGIN;
        layout.marginRight = ITabbedPropertyConstants.HMARGIN;
        setLayout(layout);

        _toolkit = getWidgetFactory();
        
        _componentProperties = new SCAPropertyValueTable(this, SWT.MULTI) {

            @Override
            protected void removeFromList() {
                final IStructuredSelection ssel = _componentProperties.getStructuredSelection();
                if (ssel != null && !ssel.isEmpty() && ssel.size() > 1) {
                    if (ssel != null && _domain != null) {
                        _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                            @Override
                            protected void doExecute() {
                                Iterator<?> iter = ssel.iterator();
                                while (iter.hasNext()) {
                                    PropertyValue toRemove = (PropertyValue) iter.next();
                                    removeDomainProperty(toRemove);
                                }
                            } 
                        });
                    }
                } else if (ssel != null && ssel.size() == 1) {
                    final PropertyValue toRemove = _componentProperties.getTableSelection();
                    if (toRemove != null) {
                        removeDomainProperty(toRemove);
                    }
                }
            }

            @Override
            protected void addPropertyTypeToList() {
                final DomainPropertyInputDialog dialog = new DomainPropertyInputDialog(Display.getCurrent()
                        .getActiveShell());
                int rtn_value = dialog.open();
                if (rtn_value == DomainPropertyInputDialog.OK) {
                    final String name = dialog.getPropertyName();
                    final String value = dialog.getPropertyValue();
                    addDomainProperty(name, value);
                }

            }
         };
        FormData data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, 0);
        data.bottom = new FormAttachment(100,0);
        _componentProperties.setLayoutData(data);
        
        _toolkit.adapt(_componentProperties);
        
        addDomainListener();
        
    }

    @Override
    public void refresh() {
        final Object targetObj = getTargetObject();
        if (targetObj != null && targetObj instanceof Component) {

            _component = (Component) targetObj;
             Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    if (_componentProperties != null && !_componentProperties.isDisposed()) {
                        _componentProperties.setSelection(_component.getProperty());
                        _componentProperties.setTargetObject(_component);
                    }
                }
            });
        }
    }

    @Override
    public NotificationFilter getFilter() {
        return null;
    }

    @Override
    public boolean isAggregatePrecommitListener() {
        return false;
    }

    @Override
    public boolean isPostcommitOnly() {
        return false;
    }

    @Override
    public boolean isPrecommitOnly() {
        return false;
    }

    @Override
    public void resourceSetChanged(ResourceSetChangeEvent arg0) {
        refresh();
    }

    @Override
    public Command transactionAboutToCommit(ResourceSetChangeEvent arg0) throws RollbackException {
        return null;
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
    public void dispose() {
        removeDomainListener();
        super.dispose();
    }

    private void removeDomainProperty(final PropertyValue property) {
        if (_component != null) {
            final EList<PropertyValue> properties = _component.getProperty();
            if (properties != null) {
                _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                    @Override
                    protected void doExecute() {
                        properties.remove(property);
                    }
                });
            }
        }
    }

    private void addDomainProperty(final String name, final String value) {
        if (_component != null) {
            _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                @Override
                protected void doExecute() {
                    EList<PropertyValue> properties = _component.getProperty();
                    PropertyValue newProperty = ScaFactory.eINSTANCE.createPropertyValue();
                    newProperty.setName(name);
                    newProperty.setValue(value);
                    properties.add(newProperty);
                }
            });
        }
    }

}
