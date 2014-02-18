/******************************************************************************* 
 * Copyright (c) 2012-2014 Red Hat, Inc. 
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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;

/**
 * @author bfitzpat
 * 
 */
public class SOAPInterceptorsComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private SOAPBindingType _binding = null;
    private InterceptorTable _inInterceptorTable;
    private InterceptorTable _outInterceptorTable;
    private DataBindingContext _context;

    SOAPInterceptorsComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_interceptors;
    }

    @Override
    public String getDescription() {
        return Messages.description_interceptors;
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());
        _context = context;
        getInterceptorsTabControl(_panel);
    }

    private Control getInterceptorsTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);
        
        Group inGroup = new Group(composite, SWT.NONE);
        inGroup.setText(Messages.label_inboundInterceptors);
        GridData inGrpGD = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
        inGrpGD.verticalSpan = 4;
        inGroup.setLayoutData(inGrpGD);
        inGroup.setLayout(new GridLayout(2, false));
        
        _inInterceptorTable = new InterceptorTable(inGroup, SWT.NONE, 
                SOAPPackage.eINSTANCE.getSOAPBindingType_InInterceptors(), 
                SOAPPackage.eINSTANCE.getInterceptorsType_Interceptor(),
                SOAPPackage.eINSTANCE.getInterceptorType(),
                _context);
        _inInterceptorTable.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 5));

        Group outGroup = new Group(composite, SWT.NONE);
        outGroup.setText(Messages.label_outboundInterceptors);
        GridData outGrpGD = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
        outGroup.setLayoutData(outGrpGD);
        outGroup.setLayout(new GridLayout(2, false));

        _outInterceptorTable = new InterceptorTable(outGroup, SWT.NONE, 
                SOAPPackage.eINSTANCE.getSOAPBindingType_OutInterceptors(), 
                SOAPPackage.eINSTANCE.getInterceptorsType_Interceptor(),
                SOAPPackage.eINSTANCE.getInterceptorType(),
                _context);
        _outInterceptorTable.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 5));

        return composite;
    }
    
    protected void handleModify(Control control) {
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            super.handleUndo(control);
        }
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
            _inInterceptorTable.setTargetObject(switchYardBindingType);
            _outInterceptorTable.setTargetObject(switchYardBindingType);
        }
    }
}
