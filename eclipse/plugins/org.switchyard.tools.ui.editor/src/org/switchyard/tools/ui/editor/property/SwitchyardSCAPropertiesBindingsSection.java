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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
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
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.ui.editor.BindingTypeExtensionManager;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.property.adapters.LabelAdapter;

/**
 * @author bfitzpat
 * 
 */
public class SwitchyardSCAPropertiesBindingsSection extends GFPropertySection implements ITabbedPropertyConstants,
        ResourceSetListener {

    private TabbedPropertySheetPage _page;
    private Binding _binding = null;
    private ListViewer _listViewer;
    private FormToolkit _toolkit = null;
    private SashForm _sashForm;
    private Section _tableSection;
    private Composite _tableComposite;
    private Section _detailSection;
    // private Button _addButton;
    private Button _removeButton;
    private Object _targetBO;
    private TransactionalEditingDomain _domain = null;
    private IBindingComposite _composite = null;
    private Map<String, IBindingComposite> _composites = new HashMap<String, IBindingComposite>();

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

        _page = tabbedPropertySheetPage;

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

        _sashForm.setWeights(new int[] {25, 75 });
        addDomainListener();
    }

    private void handleSelectListItem(boolean justRefresh) {
        if (_removeButton != null && !_removeButton.isDisposed()) {
            _removeButton.setEnabled(_binding != null);
        }
        if (_binding != null) {
            TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
            IBindingComposite composite = _composites.get(createKey(_binding));
            if (_detailSection.getClient() != null) {
                _detailSection.getClient().setVisible(false);
            }
            if (((AbstractSwitchyardComposite) composite).getPanel() == null) {
                ((AbstractSwitchyardComposite) composite).setOpenOnCreate(true);
                ((AbstractSwitchyardComposite) composite).createContents(_detailSection, SWT.NONE);
                ((AbstractSwitchyardComposite) composite).setRootGridData(new GridData(SWT.FILL, SWT.FILL, true, true));
                factory.adapt(((AbstractSwitchyardComposite) composite).getPanel());
            }
            _composite = composite;
            if (composite instanceof AbstractSYBindingComposite) {
                AbstractSYBindingComposite bindingComposite = (AbstractSYBindingComposite) composite;
                bindingComposite.setTargetObject(_binding.eContainer());
            }
            composite.setBinding(_binding);
            _detailSection.setClient(((AbstractSwitchyardComposite) composite).getPanel());
            _detailSection.getClient().setVisible(true);
            _detailSection.setExpanded(true);
            _page.resizeScrolledComposite();
        } else {
            if (_detailSection.getClient() != null) {
                _detailSection.getClient().setVisible(false);
            }
        }
    }

    @Override
    public void refresh() {

        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                if (_composite != null && ((AbstractSYBindingComposite)_composite).getDidSomething()) {
                    ((AbstractSYBindingComposite)_composite).setDidSomething(false);
                }
                PictogramElement pe = getSelectedPictogramElement();
                if (pe != null) {
                    Object newTarget = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
                    // the filter assured, that it is a Service or Reference
                    if (newTarget == null) {
                        return;
                    }
                    if (_targetBO == null) {
                        _targetBO = newTarget;
                    } else if (_targetBO != newTarget) {
                        _targetBO = newTarget;
                    }
                }                
                
                StructuredSelection ssel = (StructuredSelection) _listViewer.getSelection();
                if (!ssel.isEmpty()) {
                    Binding test = (Binding) ssel.getFirstElement();
                    if (test.eContainer() != _targetBO) {
                        _binding = null;
                    } else {
                        _binding = test;
                    }
                }
                EList<Binding> bindings = null;
                if (_targetBO instanceof Service) {
                    Service service = (Service) _targetBO;
                    bindings = service.getBinding();
                } else if (_targetBO instanceof Reference) {
                    Reference reference = (Reference) _targetBO;
                    bindings = reference.getBinding();
                }
                if (bindings != null && _listViewer != null && !_listViewer.getList().isDisposed()) {
                    _listViewer.setInput(bindings);
                    if (bindings.size() > 0) {
                        if (_binding != null) {
                            _listViewer.setSelection(new StructuredSelection(_binding), true);
                        } else {
                            _listViewer.setSelection(new StructuredSelection(bindings.get(0)));
                        }
                    } else {
                        _detailSection.setExpanded(false);
                    }
                    _listViewer.getControl().setFocus();
                }
            }
        });
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
                return LabelAdapter.getLabel(binding);
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
                    boolean justRefresh = true;
                    Binding testBinding = (Binding) ssel.getFirstElement();
                    String key = createKey(testBinding);
                    IBindingComposite testcomposite = _composites.get(key);
                    if (testcomposite == null) {
                        testcomposite = BindingTypeExtensionManager.instance().getExtensionFor(testBinding.getClass()).createComposite(testBinding);
                        _composites.put(key, testcomposite);
                    }
                    if (_composite == null || _composite != testcomposite) {
                        justRefresh = false;
                    }
                    _binding = testBinding;
                    _detailSection.setRedraw(false);
                    handleSelectListItem(justRefresh);
                    _detailSection.setRedraw(true);
                }

            }
        });

        if (showButtons) {
            // _addButton = _toolkit.createButton(buttonsComposite, "Add",
            // SWT.PUSH);
            // _addButton.addSelectionListener(new SelectionListener(){
            //
            // @Override
            // public void widgetSelected(SelectionEvent e) {
            // // add new binding
            // // addBinding();
            // }
            //
            // @Override
            // public void widgetDefaultSelected(SelectionEvent e) {
            // widgetSelected(e);
            // }
            // });
            _removeButton = _toolkit.createButton(buttonsComposite, "Remove", SWT.PUSH);
            _removeButton.setEnabled(false);
            _removeButton.addSelectionListener(new SelectionListener() {

                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (e.widget.equals(_removeButton) && _removeButton.isEnabled() && _removeButton.isFocusControl()) {
                        if (_composite != null && ((AbstractSYBindingComposite)_composite).getDidSomething()) {
                            ((AbstractSYBindingComposite)_composite).setDidSomething(false);
                            return;
                        }
                        // remove old binding
                        IStructuredSelection ssel = (IStructuredSelection) _listViewer.getSelection();
                        removeBinding((Binding) ssel.getFirstElement());
                        refreshDiagram();
                    }
                }

                @Override
                public void widgetDefaultSelected(SelectionEvent e) {
                    widgetSelected(e);
                }
            });
        }
    }

    private void refreshDiagram() {
        PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            IDiagramTypeProvider diagramTypeProvider = SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider();
            if (diagramTypeProvider != null) {
                if (diagramTypeProvider.getDiagramEditor() != null) {
                    diagramTypeProvider.getDiagramEditor().refreshRenderingDecorators(pe);
                }
            }
        }
    }

    private void removeBinding(final Binding selected) {
        if (selected != null && _domain != null) {
            if (_targetBO instanceof Contract) {
                RecordingCommand rcmd = new RecordingCommand(_domain) {
                    @Override
                    protected void doExecute() {
                        Contract contract = (Contract) _targetBO;
                        contract.getBindingGroup().remove(_listViewer.getList().getSelectionIndex());
                    }
                };
                _domain.getCommandStack().execute(rcmd);
            }
            refresh();
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
        _composites.clear();
        super.dispose();
    }
    
    private String createKey(Binding binding) {
        return binding.getClass().getCanonicalName() + binding.eContainer().getClass().getCanonicalName();
    }
}
