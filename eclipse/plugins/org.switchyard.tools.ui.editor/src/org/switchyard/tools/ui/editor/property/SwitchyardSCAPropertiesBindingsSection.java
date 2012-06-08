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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.property.adapters.BindingCompositeAdapter;

/**
 * @author bfitzpat
 * 
 */
public class SwitchyardSCAPropertiesBindingsSection extends GFPropertySection implements ITabbedPropertyConstants, ResourceSetListener {

    private Binding _binding;
    private ListViewer _listViewer;
    private FormToolkit _toolkit = null;
    private SashForm _sashForm;
    private Section _tableSection;
    private Composite _tableComposite;
    private Section _detailSection;
//    private Button _addButton;
    private Button _removeButton;
    private Object _targetBO;
    private ModelHandler _modelHandler = SwitchyardSCAEditor.getActiveEditor().getModelHandler();
    private TransactionalEditingDomain _domain = null;

    /**
     * Constructor.
     */
    public SwitchyardSCAPropertiesBindingsSection() {
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
                
        parent.setLayout(new GridLayout(3, false));
        _toolkit = this.getWidgetFactory();
        _sashForm = new SashForm(parent, SWT.NONE);
        _sashForm.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));

        _tableSection = _toolkit.createSection(_sashForm, ExpandableComposite.TITLE_BAR);
        _tableSection.setLayout(new FillLayout());
        _tableSection.setText("Bindings List");

        _tableComposite = _toolkit.createComposite(_tableSection, SWT.NONE);
        _tableComposite.setLayout(new FillLayout());
        _tableSection.setClient(_tableComposite);
        _tableComposite.setLayout(new GridLayout(3, false));
        createTableAndButtons(_tableComposite, SWT.NONE);

        _detailSection = _toolkit.createSection(_sashForm, ExpandableComposite.TITLE_BAR);
        _detailSection.setLayout(new FillLayout());
        _detailSection.setExpanded(true);
        _detailSection.setText("Binding Details");

        _sashForm.setWeights(new int[]{25,75});
        addDomainListener();
    }

    private void handleSelectListItem() {
        if (_removeButton != null && !_removeButton.isDisposed()) {
            _removeButton.setEnabled(_binding != null);
        }
        if (_binding != null) {
            TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
            IBindingComposite composite = (IBindingComposite) BindingCompositeAdapter
                    .adaptModelToComposite(_binding);
            if (composite != null) {
                if (_detailSection.getClient() != null) {
                    _detailSection.getClient().setVisible(false);
                }
                ((AbstractSwitchyardComposite) composite).setOpenOnCreate(true);
                ((AbstractSwitchyardComposite) composite).createContents(_detailSection, SWT.NONE);
                ((AbstractSwitchyardComposite) composite).setRootGridData(new GridData(SWT.FILL, SWT.FILL, true, true));
                factory.adapt(((AbstractSwitchyardComposite) composite).getPanel());
                composite.setBinding(_binding);
                _detailSection.setClient(((AbstractSwitchyardComposite)composite).getPanel());
                _detailSection.setExpanded(true);
            } else {
                if (_detailSection.getClient() != null) {
                    _detailSection.getClient().setVisible(false);
                }
            }
        } else {
            if (_detailSection.getClient() != null) {
                _detailSection.getClient().setVisible(false);
            }
        }
    }

    @Override
    public void refresh() {
        PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            _targetBO = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
            // the filter assured, that it is a Service or Reference
            if (_targetBO == null) {
                return;
            }
            EList<Binding> bindings = null;
            if (_targetBO instanceof Service) {
                Service service = (Service) _targetBO;
                bindings = service.getBinding();
            } else if (_targetBO instanceof Reference) {
                Reference reference = (Reference) _targetBO;
               bindings = reference.getBinding();
            }
            if (bindings != null) {
                _listViewer.setInput(bindings);
                if (bindings.size() > 0) {
                    _listViewer.setSelection(new StructuredSelection(bindings.get(0)));
                } else {
                    _detailSection.setExpanded(false);
                }
            }
        }
    }

    private void createTableAndButtons(Composite parent, int style) {

        GridData gridData;
        
        boolean showButtons = true;

        // //////////////////////////////////////////////////////////
        // Create a composite to hold the buttons and table
        // //////////////////////////////////////////////////////////
        Composite tableAndButtonsComposite = _toolkit.createComposite(parent, SWT.NONE);
        gridData = new GridData(SWT.FILL, SWT.TOP, true, true, 3, 1);
        gridData.verticalIndent = -5;
        tableAndButtonsComposite.setLayoutData(gridData);
        tableAndButtonsComposite.setLayout(new GridLayout(3, false));

        // //////////////////////////////////////////////////////////
        // Create button section for add/remove/up/down buttons
        // //////////////////////////////////////////////////////////
        Composite buttonsComposite = _toolkit.createComposite(tableAndButtonsComposite);
        buttonsComposite.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
        buttonsComposite.setLayout(new FillLayout(SWT.VERTICAL));

        int span = 2;
        if (!showButtons) {
            span = 3;
        }
        _listViewer = new ListViewer(tableAndButtonsComposite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
        gridData = new GridData(SWT.FILL, SWT.TOP, true, true, span, 1);
        gridData.widthHint = 100;
        gridData.heightHint = 100;
        _listViewer.getList().setLayoutData(gridData);

        _listViewer.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                Binding binding = (Binding) element;
                return _modelHandler.getLabelForBindingType(binding);
            }
        });
        _listViewer.setContentProvider(new IStructuredContentProvider() {
            public Object[] getElements(Object inputElement) {
                if (inputElement instanceof EList<?>) {
                    EList<?> v = (EList<?>) inputElement;
                    return v.toArray();
                }
                return new Object[0];
            }

            public void dispose() {
            }

            public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            }
        });
        _listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection ssel = (IStructuredSelection) event.getSelection();
                if (!ssel.isEmpty() && ssel.getFirstElement() instanceof Binding) {
                    _binding = (Binding) ssel.getFirstElement();
                    handleSelectListItem();
                }

            }
        });

        if (showButtons) {
//            _addButton = _toolkit.createButton(buttonsComposite, "Add", SWT.PUSH);
//            _addButton.addSelectionListener(new SelectionListener(){
//    
//                @Override
//                public void widgetSelected(SelectionEvent e) {
//                    // add new binding
////                    addBinding();
//                }
//    
//                @Override
//                public void widgetDefaultSelected(SelectionEvent e) {
//                    widgetSelected(e);
//                }
//             });
            _removeButton = _toolkit.createButton(buttonsComposite, "Remove", SWT.PUSH);
            _removeButton.setEnabled(false);
            _removeButton.addSelectionListener(new SelectionListener(){
    
                @Override
                public void widgetSelected(SelectionEvent e) {
                    // remove old binding
                    IStructuredSelection ssel = (IStructuredSelection) _listViewer.getSelection();
                    removeBinding((Binding) ssel.getFirstElement());
                }
    
                @Override
                public void widgetDefaultSelected(SelectionEvent e) {
                    widgetSelected(e);
                }
             });
        }
    }

    private void removeBinding(final Binding selected) {
        if (selected != null && _domain != null) {
            _domain.getCommandStack().execute(new RecordingCommand(_domain) {
                @Override
                protected void doExecute() {
                    if (_targetBO instanceof Service) {
                        Service svc = (Service) _targetBO;
                        int index = svc.getBinding().indexOf(selected);
                        EStructuralFeature feature = svc.eClass().getEStructuralFeature("binding");
                        removeListItem(svc, feature, index);
                    } else if (_targetBO instanceof Reference) {
                        Reference refs = (Reference) _targetBO;
                        int index = refs.getBinding().indexOf(selected);
                        EStructuralFeature feature = refs.eClass().getEStructuralFeature("binding");
                        removeListItem(refs, feature, index);
                    }

                }
            });
            refresh();
        }
    }

    private Object removeListItem(EObject object, EStructuralFeature feature, int index) {
        @SuppressWarnings("unchecked")
        EList<EObject> list = (EList<EObject>) object.eGet(feature);
        return list.remove(index);
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
    public void dispose() {
        removeDomainListener();
        super.dispose();
    }
}
