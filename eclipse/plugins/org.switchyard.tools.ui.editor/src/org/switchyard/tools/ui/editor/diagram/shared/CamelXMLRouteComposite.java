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
package org.switchyard.tools.ui.editor.diagram.shared;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType;
import org.switchyard.tools.ui.editor.diagram.component.wizards.NewCamelXMLRouteCompenentWizard;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.JavaUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelXMLRouteComposite extends AbstractSwitchyardComposite implements IImplementationComposite {

    private Composite _panel;
    private CamelImplementationType _implementation = null;
    private ComponentService _service;
    private String _camelRouteFilePath = null;
    private Link _newXMLLink;
    private Button _browseXMLBtn;
    private Text _mXMLText;
    private boolean _inUpdate = false;

    /**
     * Constructor.
     */
    public CamelXMLRouteComposite() {
        // empty
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    public void createContents(Composite parent, int style) {

        _panel = new Composite(parent, SWT.NONE);
        _panel.setLayout(new GridLayout(3, false));

        _newXMLLink = new Link(_panel, SWT.NONE);
        String xmlmessage = "<a>Route XML File:</a>";
        _newXMLLink.setText(xmlmessage);
        _newXMLLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                String path = getPathToNewXML(_mXMLText.getText());
                if (path != null) {
                    _mXMLText.setText(path);
                    handleModify();
                    fireChangedEvent(_newXMLLink);
                }
            }
        });
        _mXMLText = new Text(_panel, SWT.BORDER);
        _mXMLText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                if (!_inUpdate) {
                    handleModify();
                    fireChangedEvent(_mXMLText);
                }
            }
        });
        GridData uriGDXML = new GridData(GridData.FILL_HORIZONTAL);
        _mXMLText.setLayoutData(uriGDXML);

        _browseXMLBtn = new Button(_panel, SWT.PUSH);
        _browseXMLBtn.setText("Browse...");
        GridData btnGDXML = new GridData();
        _browseXMLBtn.setLayoutData(btnGDXML);
        _browseXMLBtn.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                String path = selectResourceFromWorkspace(_panel.getShell(), "xml");
                if (path != null) {
                    _mXMLText.setText(path);
                    handleModify();
                    fireChangedEvent(_browseXMLBtn);
                }
            }
        });

        _camelRouteFilePath = _mXMLText.getText();

        validate();
    }

    private void handleModify() {
        _camelRouteFilePath = _mXMLText.getText().trim();
        validate();
        if (!_inUpdate) {
            if (_mXMLText != null && !_mXMLText.isDisposed()) {
                if (_implementation == null) {
                    _implementation = CamelFactory.eINSTANCE.createCamelImplementationType();
                }
                // handle xml file path
                XMLDSLType xmltype = _implementation.getXml();
                if (xmltype == null) {
                    xmltype = CamelFactory.eINSTANCE.createXMLDSLType();
                    _implementation.setXml(xmltype);
                }
                xmltype.setPath(_mXMLText.getText());
                _implementation.setJava(null);
            }
        }
    }

    protected void validate() {
        setErrorMessage(null);

        String routeFileName = _mXMLText.getText();

        if (routeFileName == null || routeFileName.trim().length() == 0) {
            setErrorMessage("No Route file specified");
        } else if (routeFileName.trim().length() < routeFileName.length()) {
            setErrorMessage("No spaces allowed in Route file name/path");
        }
    }

    /**
     * @return interface
     */
    public Implementation getImplementation() {
        return _implementation;
    }

    /**
     * @param impl implementation coming in
     */
    public void setImplementation(Implementation impl) {
        if (impl instanceof CamelImplementationType) {
            _implementation = (CamelImplementationType) impl;
            _inUpdate = true;
            if (_implementation != null && _mXMLText != null) {
                if (_implementation.getXml() != null) {
                    _mXMLText.setText(_implementation.getXml().getPath());
                } else {
                    handleModify();
                }
            }
            _inUpdate = false;
        }
    }

    /**
     * @return the service associated with the implementation; may be null.
     */
    public ComponentService getService() {
        return _service;
    }

    /**
     * @return panel
     */
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @return String for camel route
     */
    public String getCamelRouteString() {
        return _camelRouteFilePath;
    }

    private static String selectResourceFromWorkspace(Shell shell, final String extension) {
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IJavaProject javaProject = null;
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                javaProject = JavaCore.create(modelFile.getProject());
            }
        }
        ClasspathResourceSelectionDialog dialog = null;
        if (javaProject == null) {
            dialog = new ClasspathResourceSelectionDialog(shell, ResourcesPlugin.getWorkspace().getRoot(), "xml");
        } else {
            dialog = new ClasspathResourceSelectionDialog(shell, javaProject.getProject(), "xml");
        }
        dialog.setTitle("Select Route XML File from Project");
        dialog.setInitialPattern("*.xml");
        dialog.open();
        Object[] result = dialog.getResult();
        if (result == null || result.length == 0 || !(result[0] instanceof IResource)) {
            return null;
        }
        return JavaUtil.getJavaPathForResource((IResource) result[0]).toString();
    }

    private String getPathToNewXML(String defaultName) {
        NewCamelXMLRouteCompenentWizard newWizard = new NewCamelXMLRouteCompenentWizard(false);
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                IJavaProject javaProject = JavaCore.create(modelFile.getProject());
                IResource container = JavaUtil.getFirstResourceRoot(javaProject);
                if (container == null) {
                    selectionToPass = new StructuredSelection(modelFile.getParent());
                } else {
                    selectionToPass = new StructuredSelection(container);
                }
            }
        }
        newWizard.init(PlatformUI.getWorkbench(), selectionToPass);
        newWizard.setCreatedFilePath(defaultName);
        WizardDialog dialog = new WizardDialog(_panel.getShell(), newWizard);
        if (dialog.open() == Window.OK) {
            _service = newWizard.getService();
            return newWizard.getCreatedFilePath();
        }
        return null;
    }

}
