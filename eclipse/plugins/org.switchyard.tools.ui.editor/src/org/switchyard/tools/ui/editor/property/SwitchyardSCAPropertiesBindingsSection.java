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

import java.beans.PropertyChangeEvent;

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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.ui.editor.diagram.shared.WSDLURISelectionComposite;

/**
 * @author bfitzpat
 * 
 */
public class SwitchyardSCAPropertiesBindingsSection extends GFPropertySection implements ITabbedPropertyConstants {

    private Binding _binding;
    private PageBook _compositeRight;
    private ListViewer _listViewer;
    private WSDLURISelectionComposite _wsdlComposite = null;
    private Composite _blank = null;

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

        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        Composite composite = factory.createFlatFormComposite(parent);
        composite.setLayout(new GridLayout(3, false));

        Composite compositeLeft = factory.createFlatFormComposite(composite);
        GridData leftGD = new GridData(SWT.FILL, SWT.FILL, true, true);
        compositeLeft.setLayoutData(leftGD);
        compositeLeft.setLayout(new GridLayout());

        factory.createLabel(compositeLeft, "Bindings:");
        _listViewer = new ListViewer(compositeLeft, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
        GridData lvGD = new GridData(SWT.FILL, SWT.FILL, true, true);
        _listViewer.getControl().setLayoutData(lvGD);

        Composite separator = factory.createCompositeSeparator(composite);
        GridData sepGD = new GridData(SWT.FILL, SWT.FILL, false, true);
        sepGD.widthHint = 1;
        separator.setLayoutData(sepGD);

        _compositeRight = new PageBook(composite, SWT.NONE);
        GridData rightGD = new GridData(SWT.FILL, SWT.FILL, true, true);
        _compositeRight.setLayoutData(rightGD);
        _compositeRight.setLayout(new GridLayout());
        factory.adapt(_compositeRight);

        createWSDLInterfaceComposite(_compositeRight);

        // _soapControlsPage = factory.createFlatFormComposite(_compositeRight);
        // _soapControlsPage.setLayout(new GridLayout(2, false));
        // GridData soapGD = new GridData(GridData.FILL_BOTH |
        // GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL);
        // soapGD.verticalSpan = 3;
        // _soapControlsPage.setLayoutData(soapGD);
        // factory.createLabel(_soapControlsPage, "WSDL Path:");
        // _wsdlText = factory.createText(_soapControlsPage, "");
        // GridData wsdlGD = new GridData(GridData.FILL_HORIZONTAL);
        // _wsdlText.setLayoutData(wsdlGD);
        // // createLabelAndTextField(soapControlsPage, "WSDL Path:");
        // _wsdlText.addModifyListener(new ModifyListener() {
        // @SuppressWarnings("restriction")
        // @Override
        // public void modifyText(ModifyEvent e) {
        // if (_binding != null && _binding instanceof SOAPBindingType) {
        // final SOAPBindingType soapBinding = (SOAPBindingType) _binding;
        // if (!soapBinding.getWsdl().contentEquals(_wsdlText.getText().trim()))
        // {
        // TransactionalEditingDomain domain =
        // SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
        // domain.getCommandStack().execute(new RecordingCommand(domain) {
        // @Override
        // protected void doExecute() {
        // soapBinding.setWsdl(_wsdlText.getText().trim());
        // }
        // });
        // }
        // }
        // }
        // });
        // factory.createLabel(_soapControlsPage, "Port:");
        // _portText = factory.createText(_soapControlsPage, "");
        // GridData portGD = new GridData(GridData.FILL_HORIZONTAL);
        // _portText.setLayoutData(portGD);
        // // _portText = createLabelAndTextField(soapControlsPage, "Port:");
        // _portText.addModifyListener(new ModifyListener() {
        // @SuppressWarnings("restriction")
        // @Override
        // public void modifyText(ModifyEvent e) {
        // if (_binding != null && _binding instanceof SOAPBindingType) {
        // final SOAPBindingType soapBinding = (SOAPBindingType) _binding;
        // if
        // (!soapBinding.getSocketAddr().contentEquals(_portText.getText().trim()))
        // {
        // TransactionalEditingDomain domain =
        // SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
        // domain.getCommandStack().execute(new RecordingCommand(domain) {
        // @Override
        // protected void doExecute() {
        // soapBinding.setSocketAddr(_portText.getText().trim());
        // }
        // });
        // }
        // }
        // }
        // });

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

        _blank = factory.createFlatFormComposite(_compositeRight);
        _compositeRight.showPage(_blank);
    }

    private void createWSDLInterfaceComposite(Composite parent) {
        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        _wsdlComposite = new WSDLURISelectionComposite();
        GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
        _wsdlComposite.setRootGridData(wsdlGD);
        _wsdlComposite.setOpenOnCreate(true);
        _wsdlComposite.createContents(parent, SWT.NONE);
        factory.adapt(_wsdlComposite.getcPanel());
    }

    private void handleSelectListItem() {
        if (_binding != null && _binding instanceof SOAPBindingType) {
            SOAPBindingType soapBinding = (SOAPBindingType) _binding;
            _wsdlComposite.setcBinding(soapBinding);
            _compositeRight.showPage(_wsdlComposite.getcPanel());
        } else {
            _compositeRight.showPage(_blank);
        }
    }

    @Override
    public void refresh() {
        _binding = null;
        PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
            // the filter assured, that it is a Service or Reference
            if (bo == null) {
                return;
            }
            if (bo instanceof Service) {
                Service service = (Service) bo;
                EList<Binding> bindings = service.getBinding();
                _listViewer.setInput(bindings);
            } else if (bo instanceof Reference) {
                Reference reference = (Reference) bo;
                EList<Binding> bindings = reference.getBinding();
                _listViewer.setInput(bindings);
            }
            handleSelectListItem();
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.toString());
    }
}
