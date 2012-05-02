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
package org.switchyard.tools.ui.editor.diagram.componentreference.wizards;

import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.internal.core.SourceType;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.JavaUIMessages;
import org.eclipse.jdt.internal.ui.dialogs.OpenTypeSelectionDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;

/**
 * @author bfitzpat
 *
 */
@SuppressWarnings("restriction")
public class SCADiagramAddComponentReferenceJavaPage extends BaseWizardPage implements IRefreshablePage {

    private Text _javaInterfaceNameText;
    private String _javaInterface = null;
    private SCADiagramAddComponentReferenceStartPage _startPage = null;

    /**
     * @param start start page
     * @param pageName page name
     */
    public SCADiagramAddComponentReferenceJavaPage(SCADiagramAddComponentReferenceStartPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    protected SCADiagramAddComponentReferenceJavaPage(String pageName) {
        super(pageName);
        setTitle("Specify Java Class");
        setDescription("Specify the fully qualified class name for the Java interface.");
    }

    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout gl = new GridLayout();
        gl.numColumns = 3;
        composite.setLayout(gl);
        // Component service name
        new Label(composite, SWT.NONE).setText("Name:");
        _javaInterfaceNameText = new Text(composite, SWT.BORDER);
        if (_startPage != null && _startPage.getInterface() instanceof JavaInterface) {
            _javaInterfaceNameText.setText(((JavaInterface) _startPage.getInterface()).getInterface());
        }
        _javaInterfaceNameText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                handleModify();
            }
        });
        _javaInterfaceNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        Button browseBtn = new Button(composite, SWT.PUSH);
        browseBtn.setText("...");
        browseBtn.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
        browseBtn.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                String out = browseForClass();
                _javaInterfaceNameText.setText(out);
                if (_startPage != null && _startPage.getInterface() instanceof JavaInterface) {
                    ((JavaInterface) _startPage.getInterface()).setInterface(out);
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });

        setControl(composite);

        validate();
        setErrorMessage(null);
    }

    /**
     * @return java interface string
     */
    public String getJavaInterfaceString() {
        return this._javaInterface;
    }

    private void handleModify() {
        _javaInterface = _javaInterfaceNameText.getText().trim();
        if (_startPage != null && _startPage.getInterface() instanceof WSDLPortType) {
            ((JavaInterface) _startPage.getInterface()).setInterface(_javaInterface);
        }
        validate();
    }

    private void validate() {
        String errorMessage = null;
        String cpName = _javaInterfaceNameText.getText();

        if (cpName == null || cpName.trim().length() == 0) {
            errorMessage = "No name specified";
        } else if (cpName.trim().length() < cpName.length()) {
            errorMessage = "No spaces allowed in name";
        }
        setErrorMessage(errorMessage);
        setPageComplete(errorMessage == null);
    }

    private String browseForClass() {
        Shell parent = JavaPlugin.getActiveWorkbenchShell();
        SelectionDialog dialog = new OpenTypeSelectionDialog(parent, false, PlatformUI.getWorkbench()
                .getProgressService(), null, IJavaSearchConstants.INTERFACE);
        dialog.setTitle(JavaUIMessages.OpenTypeAction_dialogTitle);
        dialog.setMessage(JavaUIMessages.OpenTypeAction_dialogMessage);
        int rtn_code = dialog.open();
        if (rtn_code == Window.OK) {
            SourceType result = (SourceType) dialog.getResult()[0];
            return result.getFullyQualifiedName();
        }
        return null;
    }

    @Override
    public boolean getSkippable() {
        if (this._startPage != null && this._startPage.getInterface() != null) {
            if (_startPage.getInterface() instanceof JavaInterface) {
                return false;
            }
//            if (_startPage.getInterface() instanceof JavaInterface) {
//                return false;
//            } else {
//                return true;
//            }
        }
        return super.getSkippable();
    }

    @Override
    public void refresh() {
        if (_startPage != null && _startPage.getInterface() instanceof JavaInterface) {
            _javaInterfaceNameText.setText(((JavaInterface) _startPage.getInterface()).getInterface());
        }
    }
}
