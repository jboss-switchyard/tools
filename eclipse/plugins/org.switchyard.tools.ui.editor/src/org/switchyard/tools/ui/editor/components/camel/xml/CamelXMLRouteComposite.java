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
package org.switchyard.tools.ui.editor.components.camel.xml;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
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
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.property.AbstractChangeAwareModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;

/**
 * @author bfitzpat
 * 
 */
public class CamelXMLRouteComposite extends AbstractChangeAwareModelComposite<Component> {

    private Composite _panel;
    private CamelImplementationType _implementation = null;
    private ComponentService _service;
    private String _camelRouteFilePath = null;
    private Link _newXMLLink;
    private Button _browseXMLBtn;
    private Text _mXMLText;
    private boolean _updating;

    /**
     * Create a new CamelXMLRouteComposite.
     * 
     * @param container the container.
     * @param parent the parent composite.
     * @param style style bits.
     */
    public CamelXMLRouteComposite(ICompositeContainer container, Composite parent, int style) {

        super(Component.class, container, parent, style);

        FormToolkit factory = getWidgetFactory();
        _panel = this;
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
                    handleModify(_newXMLLink);
                    fireChangedEvent(_newXMLLink);
                }
            }
        });
        _mXMLText = factory.createText(_panel, "", SWT.READ_ONLY | SWT.BORDER);
        _mXMLText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // ignore
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (!_updating) {
                    handleModify(_mXMLText);
                    fireChangedEvent(_mXMLText);
                }
            }
        });

        GridData uriGDXML = new GridData(GridData.FILL_HORIZONTAL);
        _mXMLText.setLayoutData(uriGDXML);

        _browseXMLBtn = factory.createButton(_panel, "Browse...", SWT.PUSH);
        GridData btnGDXML = new GridData();
        _browseXMLBtn.setLayoutData(btnGDXML);
        _browseXMLBtn.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                String path = selectResourceFromWorkspace(_panel.getShell(), "xml");
                if (path != null) {
                    _mXMLText.setText(path);
                    handleModify(_browseXMLBtn);
                    fireChangedEvent(_browseXMLBtn);
                }
            }
        });

        _camelRouteFilePath = _mXMLText.getText();

        validate();

        adaptChildren(this);
    }

    /**
     * @param serviceInterface the interface; may be null, indicating any
     *            interface is OK.
     */
    public void forceServiceInterfaceType(ComponentService serviceInterface) {
        _service = serviceInterface;
    }

    protected void handleModify(Control control) {
        _camelRouteFilePath = _mXMLText.getText().trim();
        getContainer().validated(validate());
        if (!_updating) {
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

    @Override
    public IStatus validate() {
        String errMessage = null;

        String routeFileName = _mXMLText.getText();

        if (routeFileName == null || routeFileName.trim().length() == 0) {
            errMessage = "No Route file specified";
        } else if (routeFileName.trim().length() < routeFileName.length()) {
            errMessage = "No spaces allowed in Route file name/path";
        }
        if (errMessage != null) {
            return new Status(IStatus.ERROR, Activator.PLUGIN_ID, errMessage);
        }
        return Status.OK_STATUS;
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
            _updating = true;
            if (_implementation != null && _mXMLText != null) {
                if (_implementation.getXml() != null) {
                    _mXMLText.setText(_implementation.getXml().getPath());
                } else {
                    handleModify(_mXMLText);
                }
            }
            _updating = false;
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
        newWizard.forceServiceInterfaceType(getComponentContract());
        newWizard.setCreatedFilePath(defaultName);
        WizardDialog dialog = new WizardDialog(_panel.getShell(), newWizard);
        if (dialog.open() == Window.OK) {
            _service = newWizard.getService();
            return newWizard.getCreatedFilePath();
        }
        return null;
    }

    private ComponentService getComponentContract() {
        if (_implementation != null && _implementation.eContainer() instanceof Component) {
            Component component = (Component) _implementation.eContainer();
            if (component.getService() != null) {
                for (ComponentService service : component.getService()) {
                    _service = service;
                    break;
                }
            }
        }
        return _service;
    }

    @Override
    public void refresh() {
        _implementation = null;
        final Component bo = getTargetObject();
        if (bo != null) {
            _implementation = (CamelImplementationType) ((Component) bo).getImplementation();
            setImplementation(_implementation);
        }
    }
}
