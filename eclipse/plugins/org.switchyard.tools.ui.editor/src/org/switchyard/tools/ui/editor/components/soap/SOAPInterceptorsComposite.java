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
package org.switchyard.tools.ui.editor.components.soap;

import java.util.ArrayList;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.switchyard.tools.models.switchyard1_0.soap.InterceptorType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 * 
 */
public class SOAPInterceptorsComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private SOAPBindingType _binding = null;
    private InterceptorTable _inInterceptorTable;
    private InterceptorTable _outInterceptorTable;

    /**
     * Create a new SOAPInterceptorsComposite.
     */
    public SOAPInterceptorsComposite() {
    }

    @Override
    public String getTitle() {
        return "Interceptors";
    }

    @Override
    public String getDescription() {
        return "Specify inbound and outbound interceptors for your SOAP Binding.";
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getInterceptorsTabControl(_panel);
    }

    private Control getInterceptorsTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);
        
        Group inGroup = new Group(composite, SWT.NONE);
        inGroup.setText("Inbound Interceptors");
        GridData inGrpGD = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
        inGroup.setLayoutData(inGrpGD);
        inGroup.setLayout(new GridLayout(2, false));
        
        _inInterceptorTable = new InterceptorTable(inGroup, SWT.NONE) {
            
            @Override
            protected void removeFromList() {
                final InterceptorType interceptor = _inInterceptorTable.getTableSelection();
                if (interceptor != null) {
                    removeInInterceptorTypeFeature(interceptor);
                }
            }
            
            @Override
            protected void addInterceptorTypeToList() {
                final InterceptorTypeInputDialog dialog = new InterceptorTypeInputDialog(Display.getCurrent()
                        .getActiveShell());
                InterceptorType interceptor = SOAPFactory.eINSTANCE.createInterceptorType();
                dialog.setInterceptor(interceptor);
                int rtn_value = dialog.open();
                if (rtn_value == InterceptorTypeInputDialog.OK) {
                    addInInterceptorTypeFeature(interceptor);
                    _inInterceptorTable.setSelection(_binding.getInInterceptors().getInterceptor());
                }
            }

            @Override
            protected void editInterceptorType() {
                final InterceptorType interceptor = _inInterceptorTable.getTableSelection();
                if (interceptor != null) {
                    final InterceptorTypeInputDialog dialog = new InterceptorTypeInputDialog(Display.getCurrent()
                            .getActiveShell());
                    dialog.setInterceptor(interceptor);
                    int rtn_value = dialog.open();
                    if (rtn_value == InterceptorTypeInputDialog.OK) {
                        addInInterceptorTypeFeature(interceptor);
                        _inInterceptorTable.setSelection(_binding.getInInterceptors().getInterceptor());
                    }
                }
            }
        };
        _inInterceptorTable.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 5));

        Group outGroup = new Group(composite, SWT.NONE);
        outGroup.setText("Outbound Interceptors");
        GridData outGrpGD = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
        outGroup.setLayoutData(outGrpGD);
        outGroup.setLayout(new GridLayout(2, false));

        _outInterceptorTable = new InterceptorTable(outGroup, SWT.NONE) {
            
            @Override
            protected void removeFromList() {
                final InterceptorType interceptor = _outInterceptorTable.getTableSelection();
                if (interceptor != null) {
                    removeOutInterceptorTypeFeature(interceptor);
                }
            }
            
            @Override
            protected void addInterceptorTypeToList() {
                final InterceptorTypeInputDialog dialog = new InterceptorTypeInputDialog(Display.getCurrent()
                        .getActiveShell());
                InterceptorType interceptor = SOAPFactory.eINSTANCE.createInterceptorType();
                dialog.setInterceptor(interceptor);
                int rtn_value = dialog.open();
                if (rtn_value == InterceptorTypeInputDialog.OK) {
                    addOutInterceptorTypeFeature(interceptor);
                    _outInterceptorTable.setSelection(_binding.getOutInterceptors().getInterceptor());
                }
            }

            @Override
            protected void editInterceptorType() {
                final InterceptorType interceptor = _outInterceptorTable.getTableSelection();
                if (interceptor != null) {
                    final InterceptorTypeInputDialog dialog = new InterceptorTypeInputDialog(Display.getCurrent()
                            .getActiveShell());
                    dialog.setInterceptor(interceptor);
                    int rtn_value = dialog.open();
                    if (rtn_value == InterceptorTypeInputDialog.OK) {
                        addOutInterceptorTypeFeature(interceptor);
                        _outInterceptorTable.setSelection(_binding.getOutInterceptors().getInterceptor());
                    }
                }
            }
        };
        _outInterceptorTable.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 5));

        return composite;
    }
    
    protected void handleModify(Control control) {
        super.handleModify(control);
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        super.handleUndo(control);
        setHasChanged(false);
    }

    protected boolean validate() {
        setErrorMessage(null);
        return (getErrorMessage() == null);
    }

    /**
     * @return panel
     */
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @param switchYardBindingType binding
     */
    public void setBinding(Binding switchYardBindingType) {
        super.setBinding(switchYardBindingType);
        if (switchYardBindingType instanceof SOAPBindingType) {
            setTargetObject(switchYardBindingType.eContainer());
            this._binding = (SOAPBindingType) switchYardBindingType;
            setInUpdate(true);
            if (_binding.getInInterceptors() != null && !_inInterceptorTable.isDisposed()) {
                _inInterceptorTable.setSelection(_binding.getInInterceptors().getInterceptor());
            }
            if (_binding.getOutInterceptors() != null && !_outInterceptorTable.isDisposed()) {
                _outInterceptorTable.setSelection(_binding.getOutInterceptors().getInterceptor());
            }
            setInUpdate(false);
            validate();
        }
        addObservableListeners();
    }

    class AddInInterceptorTypeOp extends ModelOperation {
        
        private InterceptorType _interceptor = null;
        
        public AddInInterceptorTypeOp(InterceptorType interceptor) {
            _interceptor = interceptor;
        }
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInInterceptors() == null) {
                _binding.setInInterceptors(SOAPFactory.eINSTANCE.createInterceptorsType());
            }
            if (_binding.getInInterceptors().getInterceptor().contains(_interceptor)) {
                _binding.getInInterceptors().getInterceptor().remove(_interceptor);
            }
            _binding.getInInterceptors().getInterceptor().add(_interceptor);
        }
    }
    
    class RemoveInInterceptorTypeOp extends ModelOperation {
        private InterceptorType _interceptor = null;
        
        public RemoveInInterceptorTypeOp(InterceptorType interceptor) {
            _interceptor = interceptor;
        }
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInInterceptors() != null) {
                _binding.getInInterceptors().getInterceptor().remove(_interceptor);
            }
            if (_binding.getInInterceptors().getInterceptor().isEmpty()) {
                setFeatureValue(_binding, "inInterceptors", null);
            }
        }
    }
    
    class AddOutInterceptorTypeOp extends ModelOperation {
        
        private InterceptorType _interceptor = null;
        
        public AddOutInterceptorTypeOp(InterceptorType interceptor) {
            _interceptor = interceptor;
        }
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getOutInterceptors() == null) {
                _binding.setOutInterceptors(SOAPFactory.eINSTANCE.createInterceptorsType());
            }
            _binding.getOutInterceptors().getInterceptor().add(_interceptor);
        }
    }

    class RemoveOutInterceptorTypeOp extends ModelOperation {
        private InterceptorType _interceptor = null;
        
        public RemoveOutInterceptorTypeOp(InterceptorType interceptor) {
            _interceptor = interceptor;
        }
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getOutInterceptors() != null) {
                _binding.getOutInterceptors().getInterceptor().remove(_interceptor);
            }
            if (_binding.getOutInterceptors().getInterceptor().isEmpty()) {
                setFeatureValue(_binding, "outInterceptors", null);
            }
        }
    }

    protected void addInInterceptorTypeFeature(final InterceptorType interceptor) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new AddInInterceptorTypeOp(interceptor));
        wrapOperation(ops);
    }
    
    protected void removeInInterceptorTypeFeature(final InterceptorType interceptor) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new RemoveInInterceptorTypeOp(interceptor));
        wrapOperation(ops);
    }

    protected void addOutInterceptorTypeFeature(final InterceptorType interceptor) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new AddOutInterceptorTypeOp(interceptor));
        wrapOperation(ops);
    }

    protected void removeOutInterceptorTypeFeature(final InterceptorType interceptor) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new RemoveOutInterceptorTypeOp(interceptor));
        wrapOperation(ops);
    }
}
