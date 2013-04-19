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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.soa.sca.sca1_1.model.sca.Property;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.switchyard.tools.ui.editor.diagram.shared.DomainPropertyInputDialog;
import org.switchyard.tools.ui.editor.diagram.shared.SCAPropertyTable;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;

/**
 * @author bfitzpat
 * 
 */
public class CompositePropertiesComposite extends AbstractModelComposite<org.eclipse.soa.sca.sca1_1.model.sca.Composite>
    implements ResourceSetListener {

    private org.eclipse.soa.sca.sca1_1.model.sca.Composite _composite;
    private TransactionalEditingDomain _domain = null;
    private SCAPropertyTable _compositeProperties = null;

    /**
     * Create a new InterfaceControlComposite.
     * 
     * @param container the container
     * @param parent the parent composite
     * @param style the style bits
     */
    public CompositePropertiesComposite(ICompositeContainer container, Composite parent, int style) {
        super(org.eclipse.soa.sca.sca1_1.model.sca.Composite.class, container, parent, style);

        FormLayout layout = new FormLayout();
        layout.marginBottom = ITabbedPropertyConstants.VMARGIN;
        layout.marginTop = ITabbedPropertyConstants.VMARGIN;
        layout.marginLeft = ITabbedPropertyConstants.HMARGIN;
        layout.marginRight = ITabbedPropertyConstants.HMARGIN;
        setLayout(layout);

        _compositeProperties = new SCAPropertyTable(this, SWT.NONE) {

            @Override
            protected void removeFromList() {
                final Property toRemove = _compositeProperties.getTableSelection();
                if (toRemove != null) {
                    removeDomainProperty(toRemove);
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
        _compositeProperties.setLayoutData(data);
        
        adaptChildren(_compositeProperties);
        
        addDomainListener();
        
    }

    @Override
    public void refresh() {
        final org.eclipse.soa.sca.sca1_1.model.sca.Composite composite = getTargetObject();
        if (composite != null) {

            _composite = composite;
             Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    if (_compositeProperties != null && !_compositeProperties.isDisposed()) {
                        _compositeProperties.setSelection(_composite.getProperty());
                        _compositeProperties.setTargetObject(_composite);
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

    private void removeDomainProperty(final Property property) {
        if (_composite != null) {
            final EList<Property> properties = _composite.getProperty();
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
        if (_composite != null) {
            _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                @Override
                protected void doExecute() {
                    EList<Property> properties = _composite.getProperty();
                    Property newProperty = ScaFactory.eINSTANCE.createProperty();
                    newProperty.setName(name);
                    newProperty.setValue(value);
                    properties.add(newProperty);
                }
            });
        }
    }

}
