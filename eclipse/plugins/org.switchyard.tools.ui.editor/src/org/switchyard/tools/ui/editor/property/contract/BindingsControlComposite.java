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
package org.switchyard.tools.ui.editor.property.contract;

import java.util.HashMap;
import java.util.Map;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
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
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledPageBook;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.BindingTypeExtensionManager;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;
import org.switchyard.tools.ui.editor.property.adapters.LabelAdapter;

/**
 * @author bfitzpat
 * 
 */
public class BindingsControlComposite extends AbstractModelComposite<Contract> implements ResourceSetListener {

    private Binding _binding = null;
    private ListViewer _listViewer;
    private FormToolkit _toolkit = null;
    private SashForm _sashForm;
    private Composite _tableComposite;
    private Button _removeButton;
    private Object _targetBO;
    private TransactionalEditingDomain _domain = null;
    private IBindingComposite _composite = null;
    private Map<String, IBindingComposite> _composites = new HashMap<String, IBindingComposite>();
    private ScrolledPageBook _pageBook = null;
    private String _validError = null;

    /**
     * Create a new InterfaceControlComposite.
     * 
     * @param container the container
     * @param parent the parent composite
     * @param style the style bits
     */
    public BindingsControlComposite(ICompositeContainer container, Composite parent, int style) {
        super(Contract.class, container, parent, style);

        FormLayout layout = new FormLayout();
        layout.marginBottom = ITabbedPropertyConstants.VMARGIN;
        layout.marginTop = ITabbedPropertyConstants.VMARGIN;
        layout.marginLeft = ITabbedPropertyConstants.HMARGIN;
        layout.marginRight = ITabbedPropertyConstants.HMARGIN;
        setLayout(layout);

        _toolkit = getWidgetFactory();

        _sashForm = new SashForm(this, SWT.NONE);
        FormData data = new FormData();
        data.top = new FormAttachment(0);
        data.bottom = new FormAttachment(100);
        data.left = new FormAttachment(0);
        data.right = new FormAttachment(100);
        _sashForm.setLayoutData(data);
        _sashForm.setLayout(new FillLayout());

        _tableComposite = _toolkit.createComposite(_sashForm, SWT.NONE);
        _tableComposite.setLayout(new FillLayout());
        createTableAndButtons(_tableComposite, SWT.NONE);
        data = new FormData();
        data.top = new FormAttachment(0);
        data.bottom = new FormAttachment(100);
        data.left = new FormAttachment(0);
        data.right = new FormAttachment(20);
        _tableComposite.setLayoutData(data);

        _pageBook = new ScrolledPageBook(_sashForm);
        data = new FormData();
        data.top = new FormAttachment(0, 0);
        data.bottom = new FormAttachment(100, 0);
        data.left = new FormAttachment(20, 5);
        data.right = new FormAttachment(100, 0);
        _pageBook.setLayoutData(data);

        _sashForm.setWeights(new int[] {25, 75 });

        addDomainListener();
        
        adaptChildren(this);
    }

    private void createTableAndButtons(Composite parent, int style) {

        GridData gridData;

        boolean showButtons = true;

        // //////////////////////////////////////////////////////////
        // Create a composite to hold the buttons and table
        // //////////////////////////////////////////////////////////
        Composite tableAndButtonsComposite = _toolkit.createComposite(parent, SWT.NONE);
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
        gridData = new GridData(SWT.FILL, SWT.FILL, true, true, span, 1);
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
                        testcomposite = BindingTypeExtensionManager.instance().getExtensionFor(testBinding.getClass())
                                .createComposite(testBinding);
                        _composites.put(key, testcomposite);
                    }
                    if (_composite == null || _composite != testcomposite) {
                        justRefresh = false;
                    }
                    _binding = testBinding;
                    handleSelectListItem(justRefresh);
                }
            }
        });

        if (showButtons) {
            _removeButton = _toolkit.createButton(buttonsComposite, "Remove", SWT.PUSH);
            _removeButton.setEnabled(false);
            _removeButton.addSelectionListener(new SelectionListener() {

                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (e.widget.equals(_removeButton) && _removeButton.isEnabled() && _removeButton.isFocusControl()) {
                        if (_composite != null && ((AbstractSYBindingComposite) _composite).getDidSomething()) {
                            ((AbstractSYBindingComposite) _composite).setDidSomething(false);
                            return;
                        }
                        // remove old binding
                        IStructuredSelection ssel = (IStructuredSelection) _listViewer.getSelection();
                        Binding binding = (Binding) ssel.getFirstElement();
                        removeBinding(binding);
                        _binding = null;
                        refresh();
                    }
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
    public void refresh() {
        final Contract contract = getTargetObject();
        if (contract != null) {

            Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    getContainer().layout();
                    if (_listViewer.getList().isDisposed()) {
                        return;
                    }
                    Object newTarget = contract;
                    if (contract instanceof Service) {
                        _listViewer.setInput(((Service) contract).getBinding());
                    } else if (contract instanceof Reference) {
                        _listViewer.setInput(((Reference) contract).getBinding());
                    }
                    if (_composite != null && ((AbstractSYBindingComposite) _composite).getDidSomething()) {
                        ((AbstractSYBindingComposite) _composite).setDidSomething(false);
                    }
                    if (_targetBO == null) {
                        _targetBO = newTarget;
                    } else if (_targetBO != newTarget) {
                        _targetBO = newTarget;
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
                            _pageBook.showEmptyPage();
//                            _pageBook.showPage(getDefaultControl());
                        }
                        _listViewer.getControl().setFocus();
                    }
                    _pageBook.getContainer().layout();
                    getContainer().layout();
                }
            });
        }
    }

    private String createKey(Binding binding) {
        return binding.getClass().getCanonicalName() + binding.eContainer().getClass().getCanonicalName();
    }

    private void handleSelectListItem(boolean justRefresh) {
        if (_removeButton != null && !_removeButton.isDisposed()) {
            _removeButton.setEnabled(_binding != null);
        }
        if (_binding != null) {
            String bindingKey = createKey(_binding);
            IBindingComposite composite = _composites.get(bindingKey);
            if (((AbstractSwitchyardComposite) composite).getPanel() == null) {
                ((AbstractSwitchyardComposite) composite).setOpenOnCreate(true);
                if (composite instanceof AbstractSYBindingComposite) {
                    AbstractSYBindingComposite bindingComposite = (AbstractSYBindingComposite) composite;
                    bindingComposite.setTargetObject(_binding.eContainer());
                    bindingComposite.addChangeListener(new ChangeListener() {
                        @Override
                        public void stateChanged(ChangeEvent arg0) {
                            if (_composite != null && _composite instanceof AbstractSYBindingComposite) {
                                AbstractSYBindingComposite syComposite = (AbstractSYBindingComposite) _composite;
                                _validError = syComposite.getErrorMessage();
                                getContainer().validated(validate());
                            }
                        }
                    });
                }
                ((AbstractSwitchyardComposite) composite).createContents(_pageBook.getContainer(), SWT.NONE);
                _pageBook.registerPage(bindingKey, ((AbstractSwitchyardComposite) composite).getPanel());
                adaptChildren(((AbstractSwitchyardComposite) composite).getPanel());
            }
            _composite = composite;
            composite.setBinding(_binding);
            _pageBook.showPage(bindingKey);
        } else {
            _pageBook.showEmptyPage();
        }
        getContainer().layout();
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

    @Override
    public IStatus validate() {
        if (_validError != null) {
            return new Status(IStatus.ERROR, Activator.PLUGIN_ID, _validError);
        }
        return super.validate();
    }

}
