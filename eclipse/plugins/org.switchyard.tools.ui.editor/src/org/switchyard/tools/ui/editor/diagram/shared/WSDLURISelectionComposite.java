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

import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.wst.wsdl.PortType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.OpenFileUtil;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class WSDLURISelectionComposite extends AbstractSwitchyardComposite implements IInterfaceComposite {

    private Composite _panel;
    private Text _mWSDLInterfaceURIText;
    private String _sWSDLURI = null;
    private WSDLPortType _interface = null;

    private Button _browseBtnWorkspace;
    private Button _browseBtnFile;
    private Link _newWSDLLink;

    /**
     * Constructor.
     */
    public WSDLURISelectionComposite() {
        // empty
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    public void createContents(Composite parent, int style) {

        _panel = new Composite(parent, style);
        GridLayout gl = new GridLayout();
        gl.numColumns = 3;
        _panel.setLayout(gl);
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        _newWSDLLink = new Link(_panel, SWT.NONE);
        String message = "<a>WSDL URI:</a>";
        _newWSDLLink.setText(message);
        _newWSDLLink.setEnabled(canEdit());
        // link.setSize(400, 100);
        _newWSDLLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                String oldResult = _mWSDLInterfaceURIText.getText().trim();
                if (oldResult.indexOf('#') > -1) {
                    oldResult = oldResult.substring(0, oldResult.indexOf('#'));
                }
                IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
                IPath wsdlPath = modelFile.getParent().getParent().getProjectRelativePath();
                wsdlPath = wsdlPath.append(oldResult);
                IProject project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
                if (project.exists(wsdlPath)) {
                    IResource wsdlFile = project.findMember(wsdlPath);
                    OpenFileUtil.openFile(wsdlFile);
                } else {
                    String result = getPathToNewWSDL(_panel.getShell(), wsdlPath, openOnCreate());
                    if (result != null) {
                        _mWSDLInterfaceURIText.setText(result);
                        setHasChanged(true);
                        handleModify(_newWSDLLink);
                        fireChangedEvent(_newWSDLLink);
                    }
                }
            }
        });
        _mWSDLInterfaceURIText = new Text(_panel, SWT.BORDER);
        if (_interface != null && _interface instanceof WSDLPortType) {
            _mWSDLInterfaceURIText.setText(((WSDLPortType) _interface).getInterface());
        }
        _mWSDLInterfaceURIText.setEnabled(canEdit());
        _mWSDLInterfaceURIText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // ignore
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (!inUpdate()) {
                    setHasChanged(true);
                    handleModify(_mWSDLInterfaceURIText);
                    fireChangedEvent(_mWSDLInterfaceURIText);
                }
            }
        });

        GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
        // uriGD.horizontalSpan = 2;
        _mWSDLInterfaceURIText.setLayoutData(uriGD);

        _browseBtnWorkspace = new Button(_panel, SWT.PUSH);
        _browseBtnWorkspace.setText("Workspace...");
        _browseBtnWorkspace.setEnabled(canEdit());
        GridData btnGD = new GridData();
        _browseBtnWorkspace.setLayoutData(btnGD);
        _browseBtnWorkspace.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
                IJavaProject javaProject = null;
                if (modelFile != null) {
                    if (modelFile.getProject() != null) { //$NON-NLS-1$
                        javaProject = JavaCore.create(modelFile.getProject());
                    }
                }
                PortType result = browse(_panel.getShell(), javaProject);
                if (result != null) {
                    setHasChanged(true);
                    handleModify(_browseBtnWorkspace);
                    fireChangedEvent(_browseBtnWorkspace);
                }
            }
        });
    }

    protected void handleModify(Control control) {
        _sWSDLURI = _mWSDLInterfaceURIText.getText().trim();
        if (_interface != null && _interface instanceof WSDLPortType) {
            if (_interface.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        ((WSDLPortType) _interface).setInterface(_sWSDLURI);
                    }
                });

            } else {
                ((WSDLPortType) _interface).setInterface(_sWSDLURI);
            }
        }
        validate();
        setHasChanged(false);
    }

    protected boolean validate() {
        setErrorMessage(null);
        String uriString = _mWSDLInterfaceURIText.getText();

        if (uriString == null || uriString.trim().length() == 0) {
            setErrorMessage("No uri specified");
        } else if (uriString.trim().length() < uriString.length()) {
            setErrorMessage("No spaces allowed in uri");
        } else {
            try {
                URI.create(uriString);
            } catch (IllegalArgumentException e) {
                setErrorMessage("Invalid URI");
            }
        }

        return (getErrorMessage() == null);
    }

    /**
     * @return wsdl URI string
     */
    public String getWSDLURI() {
        return this._sWSDLURI;
    }

    /**
     * @return interface
     */
    public Interface getInterface() {
        return _interface;
    }

    /**
     * @param cInterface interface
     */
    public void setInterface(Interface cInterface) {
        if (cInterface instanceof WSDLPortType && _mWSDLInterfaceURIText != null
                && !_mWSDLInterfaceURIText.isDisposed()) {
            this._interface = (WSDLPortType) cInterface;
            setInUpdate(true);
            if (_interface.getInterface() != null) {
                _mWSDLInterfaceURIText.setText(_interface.getInterface());
            } else {
                _mWSDLInterfaceURIText.setText("MyService.wsdl#wsdl.porttype(MyPortType)");
            }
            setInUpdate(false);
        }
    }

    /**
     * @return panel
     */
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @param shell Shell for dialog
     * @param project java project to use for resolving classpaths
     * @return PortType result
     */
    public PortType browse(Shell shell, IJavaProject project) {
        WSDLPortTypeSelectionDialog dialog = new WSDLPortTypeSelectionDialog(shell, project == null ? ResourcesPlugin
                .getWorkspace().getRoot() : project.getProject());
        dialog.setInitialPattern("*.wsdl");
        if (dialog.open() == WSDLPortTypeSelectionDialog.OK) {
            PortType result = dialog.getSelectedPortType();
            if (result != null) {
//                _interface.setInterface(getInterfaceURL(project, result));
                _sWSDLURI = getInterfaceURL(project, result);
                _mWSDLInterfaceURIText.setText(_sWSDLURI);
                return result;
            }
        }
        return null;
    }

    private static String getPathToNewWSDL(final Shell shell, final IPath path, boolean _openWhenFinish) {
        NewWSDLFileWizard newWizard = new NewWSDLFileWizard();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                IJavaProject javaProject = JavaCore.create(modelFile.getProject());
                IPackageFragmentRoot folder = javaProject.getPackageFragmentRoot(modelFile);
                selectionToPass = new StructuredSelection(folder);
            }
        }
        if (path != null) {
            newWizard.setStartingFileName(path.lastSegment());
        }
        newWizard.setOpenOnFinish(_openWhenFinish);
        newWizard.init(PlatformUI.getWorkbench(), selectionToPass);
        WizardDialog dialog = new WizardDialog(shell, newWizard);
        if (dialog.open() == Window.OK) {
            return newWizard.getCreatedFilePath();
        }
        return null;
    }

    /**
     * @param canEdit flag
     */
    public void setCanEdit(boolean canEdit) {
        super.setCanEdit(canEdit);
        if (this._mWSDLInterfaceURIText != null && !this._mWSDLInterfaceURIText.isDisposed()) {
            this._mWSDLInterfaceURIText.setEnabled(canEdit());
        }
        if (this._newWSDLLink != null && !this._newWSDLLink.isDisposed()) {
            this._newWSDLLink.setEnabled(canEdit());
        }
        if (this._browseBtnFile != null && !this._browseBtnFile.isDisposed()) {
            this._browseBtnFile.setEnabled(canEdit());
        }
        if (this._browseBtnWorkspace != null && !this._browseBtnWorkspace.isDisposed()) {
            this._browseBtnWorkspace.setEnabled(canEdit());
        }
    }

    private String getInterfaceURL(IJavaProject project, PortType portType) {
        IPath filePath = new Path(portType.eResource().getURI().toPlatformString(true));
        IResource resource = project.getProject().getWorkspace().getRoot().getFile(filePath);
        filePath = JavaUtil.getJavaPathForResource(resource);
        return filePath.toString() + "#wsdl.porttype(" + portType.getQName().getLocalPart() + ")";
    }
}
