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
package org.switchyard.tools.ui.editor.property;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.ui.editor.diagram.shared.DomainPropertyInputDialog;
import org.switchyard.tools.ui.editor.diagram.shared.SCAPropertyValueTable;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class ComponentPropertiesPropertySection extends GFPropertySection implements ITabbedPropertyConstants,
        ResourceSetListener {

    private Object _businessObject;
    private boolean _inUpdate = false;
    private PictogramElement _pe = null;
    private TransactionalEditingDomain _domain = null;
    private SCAPropertyValueTable _componentProperties = null;
    private Component _componentObject = null;

    /**
     * Constructor.
     */
    public ComponentPropertiesPropertySection() {
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

        FormToolkit toolkit = new FormToolkit(parent.getDisplay());
        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        Composite composite = factory.createFlatFormComposite(parent);
        Section section2 = toolkit.createSection(composite, Section.TITLE_BAR);
        section2.setText("Component Properties"); //$NON-NLS-1$
        section2.setLayout(new GridLayout(1, false));
        FormData sectionFD = new FormData();
        sectionFD.left = new FormAttachment(0,0);
        sectionFD.right = new FormAttachment(100, 0);
        section2.setLayoutData(sectionFD);

        // Composite for storing controls of the main section
        Composite client2 = toolkit.createComposite(section2, SWT.WRAP);
        GridLayout layout2 = new GridLayout(2, false);
        client2.setLayout(layout2);

        _componentProperties = new SCAPropertyValueTable(client2, SWT.NONE) {

            @Override
            protected void removeFromList() {
                final PropertyValue toRemove = _componentProperties.getTableSelection();
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
        _componentProperties.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 5));

        section2.setClient(client2);

        addDomainListener();
    }

    private void removeDomainProperty(final PropertyValue property) {
        if (_componentObject != null) {
            final EList<PropertyValue> properties = _componentObject.getProperty();
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
        if (_componentObject != null) {
            _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                @Override
                protected void doExecute() {
                    EList<PropertyValue> properties = _componentObject.getProperty();
                    PropertyValue newProperty = ScaFactory.eINSTANCE.createPropertyValue();
                    newProperty.setName(name);
                    newProperty.setValue(value);
                    properties.add(newProperty);
                }
            });
        }
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
                    if (_componentProperties != null && !_componentProperties.isDisposed()) {
                        if (_businessObject instanceof Component) {
                            _componentObject = (Component) _businessObject;
                            _componentProperties.setSelection(_componentObject.getProperty());
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
