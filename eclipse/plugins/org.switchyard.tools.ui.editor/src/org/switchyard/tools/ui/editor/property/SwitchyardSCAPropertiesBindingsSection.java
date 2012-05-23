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

import org.eclipse.emf.common.util.EList;
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
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;
import org.switchyard.tools.ui.editor.property.adapters.BindingCompositeAdapter;

/**
 * @author bfitzpat
 * 
 */
public class SwitchyardSCAPropertiesBindingsSection extends GFPropertySection implements ITabbedPropertyConstants {

    private Binding _binding;
    private ListViewer _listViewer;
//    private Composite _blank = null;
    private HashMap<Binding, IBindingComposite> _modelComposites = null;
    private FormToolkit _toolkit = null;
    private SashForm _sashForm;
    private Section _tableSection;
    private Composite _tableComposite;
    private Section _detailSection;
    private Button _addButton;
    private Button _removeButton;
    private Object _targetBO;

    /**
     * Constructor.
     */
    public SwitchyardSCAPropertiesBindingsSection() {
        super();
        _modelComposites = new HashMap<Binding, IBindingComposite>();
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
        _tableSection.setText("Bindings List");

        _tableComposite = _toolkit.createComposite(_tableSection, SWT.NONE);
        _tableSection.setClient(_tableComposite);
        _tableComposite.setLayout(new GridLayout(3, false));
        createTableAndButtons(_tableComposite, SWT.NONE);

        _detailSection = _toolkit.createSection(_sashForm, ExpandableComposite.TITLE_BAR);
        _detailSection.setExpanded(true);
        _detailSection.setText("Binding Details");

        _sashForm.setWeights(new int[]{25,75});
//        _blank = getWidgetFactory().createFlatFormComposite(_detailSection);
//        _blank.setLayout(new FillLayout());
    }

    private void handleSelectListItem() {
        if (_removeButton != null && !_removeButton.isDisposed()) {
            _removeButton.setEnabled(_binding != null);
        }
        if (_binding != null && _binding instanceof SOAPBindingType) {
            if (_modelComposites.get(_binding) == null) {
                TabbedPropertySheetWidgetFactory factory = getWidgetFactory();

                IBindingComposite composite = (IBindingComposite) BindingCompositeAdapter
                        .adaptModelToComposite(_binding);
                if (composite != null) {
                    ((AbstractSwitchyardComposite) composite).setOpenOnCreate(true);
                    ((AbstractSwitchyardComposite) composite).createContents(_detailSection, SWT.NONE);
                    factory.adapt(((AbstractSwitchyardComposite) composite).getPanel());
                    _modelComposites.put(_binding, composite);
                }
            }
            IBindingComposite composite = (IBindingComposite) _modelComposites.get(_binding);
            if (composite != null) {
                composite.setBinding(_binding);
                _detailSection.setExpanded(true);
                _detailSection.setClient(((AbstractSwitchyardComposite)composite).getPanel());
            } else {
                _detailSection.setExpanded(false);
            }
        } else {
            _detailSection.setExpanded(false);
        }
        _detailSection.layout();
    }

    @Override
    public void refresh() {
        _binding = null;
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
        
        boolean showButtons = false;

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
                SwitchYardBindingType interfaceType = (SwitchYardBindingType) element;
                if (interfaceType instanceof SOAPBindingType) {
                    return "SOAP";
                } else {
                    return "";
                }
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
                if (!ssel.isEmpty() && ssel.getFirstElement() instanceof SwitchYardBindingType) {
                    _binding = (SwitchYardBindingType) ssel.getFirstElement();
                    handleSelectListItem();
                }

            }
        });

        if (showButtons) {
            _addButton = _toolkit.createButton(buttonsComposite, "Add", SWT.PUSH);
            _addButton.addSelectionListener(new SelectionListener(){
    
                @Override
                public void widgetSelected(SelectionEvent e) {
                    // add new binding
                }
    
                @Override
                public void widgetDefaultSelected(SelectionEvent e) {
                    widgetSelected(e);
                }
             });
            _removeButton = _toolkit.createButton(buttonsComposite, "Remove", SWT.PUSH);
            _removeButton.setEnabled(false);
            _removeButton.addSelectionListener(new SelectionListener(){
    
                @Override
                public void widgetSelected(SelectionEvent e) {
                    // remove old binding
                }
    
                @Override
                public void widgetDefaultSelected(SelectionEvent e) {
                    widgetSelected(e);
                }
             });
        }
    }

}
