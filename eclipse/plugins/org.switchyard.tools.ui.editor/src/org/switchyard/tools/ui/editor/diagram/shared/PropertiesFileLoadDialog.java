/*************************************************************************************
 * Copyright (c) 2014 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.diagram.shared;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.editor.Activator;
//import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class PropertiesFileLoadDialog extends TitleAreaDialog {

    private String _propertiesFileValue = null;
    private Button _classpathOption;
    private Text _classpathText;
    private Button _classpathBrowseBtn;
    private Button _urlOption;
    private Text _urlText;
    
    /**
     * DomainPropertiesFileDialog constructor.
     * 
     * @param parent the parent
     */
    public PropertiesFileLoadDialog(Shell parent) {
        super(parent);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        setTitle("Domain Properties File Details");
        setMessage("Specify the location of the domain properties file as a file in the project classpath or publicly available URL.");
        getShell().setText("Domain Properties File");

        Composite area = new Composite(parent, SWT.NULL);
        GridLayout gridLayout = new GridLayout(2, false);
        area.setLayout(gridLayout);
        area.setLayoutData(new GridData(GridData.FILL_BOTH));
        
        Group optionGroup = new Group(area, SWT.NONE);
        optionGroup.setLayout(new GridLayout(2, false));
        optionGroup.setText("Location Options");
        optionGroup.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, true, 2, 3));
       
        _classpathOption = new Button(optionGroup, SWT.RADIO);
        _classpathOption.setText("Project Classpath");
        _classpathOption.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1));
        _classpathOption.setSelection(true);
        
        _classpathText = new Text(optionGroup, SWT.BORDER);
        _classpathText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false));
        _classpathText.addModifyListener(new TextModifyListener());
        
        _classpathBrowseBtn = new Button(optionGroup, SWT.PUSH);
        _classpathBrowseBtn.setText("...");
        _classpathBrowseBtn.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, false, false));
        _classpathBrowseBtn.addSelectionListener(new SelectionListener(){

            @Override
            public void widgetSelected(SelectionEvent e) {
                IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
                IJavaProject javaProject = null;
                if (modelFile != null) {
                    if (modelFile.getProject() != null) { //$NON-NLS-1$
                        javaProject = JavaCore.create(modelFile.getProject());
                    }
                }
                String result = browseForClasspathResource(_classpathBrowseBtn.getShell(), javaProject, "*.*");
                if (result != null) {
                    _classpathText.setText(result);
                    _classpathText.notifyListeners(SWT.Modify, null);
                    _classpathText.setFocus();
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // empty
            }
        });

        _urlOption = new Button(optionGroup, SWT.RADIO);
        _urlOption.setText("Public URL");
        _urlOption.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1));

        _urlText = new Text(optionGroup, SWT.BORDER);
        _urlText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1));
        _urlText.addModifyListener(new TextModifyListener());

        _classpathOption.addSelectionListener(new RadioSelectionListener());
        _urlOption.addSelectionListener(new RadioSelectionListener());
        
        setupBasedOnInitialValue();

        return area;
    }
    
    private void setupBasedOnInitialValue() {
        if (_propertiesFileValue != null) {
            if (_propertiesFileValue.contains("://")) {
                updateRadioButtonSelection(_urlOption);
                _urlText.setText(_propertiesFileValue);
            } else {
                updateRadioButtonSelection(_classpathOption);
                _classpathText.setText(_propertiesFileValue);
            }
        } else {
            updateRadioButtonSelection(_classpathOption);
        }
        validate();
        if (getButton(IDialogConstants.OK_ID) != null) {
            getButton(IDialogConstants.OK_ID).setEnabled(validate());
        }
    }
    
    private class TextModifyListener implements ModifyListener {

        @Override
        public void modifyText(ModifyEvent e) {
            Text control = (Text)e.widget;
            _propertiesFileValue = control.getText();
            validate();
            if (getButton(IDialogConstants.OK_ID) != null) {
                getButton(IDialogConstants.OK_ID).setEnabled(validate());
            }
        }
    }
    
    private class RadioSelectionListener implements SelectionListener {

        @Override
        public void widgetSelected(SelectionEvent e) {
            updateRadioButtonSelection((Button) e.widget);
        }

        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
            // empty
        }
        
    }
    
    private void updateRadioButtonSelection(Button radio) {
        
        if (radio != null && radio.equals(_classpathOption)) {
            _classpathText.setEnabled(true);
            _classpathBrowseBtn.setEnabled(true);
            _classpathOption.setSelection(true);
            _urlOption.setSelection(false);
            _urlText.setEnabled(false);
        } else {
            _classpathText.setEnabled(false);
            _classpathBrowseBtn.setEnabled(false);
            _classpathOption.setSelection(false);
            _urlOption.setSelection(true);
            _urlText.setEnabled(true);
        }
    }
    
    protected Control createButtonBar(Composite parent) {
        Control rtnControl = super.createButtonBar(parent);
        getButton(IDialogConstants.OK_ID).setEnabled(validate());
        setErrorMessage(null);
        
        return rtnControl;
    }

    /**
     * @param parent parent composite
     * @param label string to put in label
     * @return reference to created Text control
     */
    protected Text createLabelAndText(Composite parent, String label) {
        new Label(parent, SWT.NONE).setText(label);
        Text newText = new Text(parent, SWT.BORDER);
        newText.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
        newText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // ignore
            }

            @Override
            public void focusLost(FocusEvent e) {
                getButton(IDialogConstants.OK_ID).setEnabled(validate());
            }
        });
        newText.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                // ignore
            }

            @Override
            public void keyReleased(KeyEvent e) {
                getButton(IDialogConstants.OK_ID).setEnabled(validate());
            }
        });
        return newText;
    }

    private String browseForClasspathResource(Shell shell, IJavaProject project, String initialPattern) {
        FilteredResourcesSelectionDialog dialog = new FilteredResourcesSelectionDialog(getShell(), false,
                ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE) {
            @Override
            protected ItemsFilter createFilter() {
                return new ResourceFilter() {
                    @Override
                    public boolean matchItem(Object item) {
                        IResource resource = (IResource) item;
                        return super.matchItem(item)
                            && ("properties".equals(resource.getFileExtension())
                              || "xml".equals(resource.getFileExtension())); //$NON-NLS-1$
                    }
                };
            }
        };
        dialog.setInitialPattern(initialPattern);
        if (dialog.open() == FilteredResourcesSelectionDialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0 && result[0] instanceof IFile) {
                IFile file = (IFile) result[0];
                String filePath = JavaUtil.getJavaPathForResource(file).toString();
                return filePath.toString();
            }
        }
        return null;
    }
    
    protected boolean validate() {
        setErrorMessage(null);
        
        IStatus validStatus = validatePropertiesLoadValue(_propertiesFileValue);
        if (validStatus != Status.OK_STATUS) {
            setErrorMessage(validStatus.getMessage());
        }

        return (getErrorMessage() == null);
    }

    /**
     * @return String value for properties file location
     */
    public String getPropertiesFileValue() {
        return _propertiesFileValue;
    }

    /**
     * @param value property file value
     */
    public void setPropertiesFileValue(String value) {
        _propertiesFileValue = value;
    }

    /**
     * @param value Incoming properties load value to validate
     * @return Status - OK means no issues. 
     */
    public static IStatus validatePropertiesLoadValue(String value) {
        if (value != null) {
            String loadPath = value;

            
            // first, try to find it in the project classloader
            boolean foundInClassloader = false;
            try {
                IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
                IResource propertiesFile = SwitchYardModelUtils.getJavaResource(modelFile.getProject(), loadPath);
                if (propertiesFile != null) {
                    foundInClassloader = true;
                }
            } catch (Exception e) {
                foundInClassloader = false;
            }
            
            // lastly, check to see if it's a valid public URL
            boolean urlIsValid = false;
            boolean isUrl = false;
            
            if (loadPath.startsWith("http:") || loadPath.startsWith("file:")) {
                isUrl = true;
            }            
            
            if (isUrl) {
                URL resourceURL = null;
                try {
                    resourceURL = new URL(loadPath);
                } catch (MalformedURLException e) {
                    // ignore
                    urlIsValid = false;
                }
                if (resourceURL != null) {
                    try {
                        resourceURL.toURI();
                        urlIsValid = true;
                    } catch (URISyntaxException e) {
                        // ignore
                        urlIsValid = false;
                    }
                }
            }

            if (!urlIsValid && isUrl) {
                return new Status(IStatus.WARNING, Activator.PLUGIN_ID, 
                        "The properties file URL must be well-formed and public http or file URL.");
            } else if (urlIsValid && isUrl) {
                return Status.OK_STATUS;
            } else if (!foundInClassloader) {
                return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                        "The properties file must be specified as a file in the project classpath or publicly available http or file URL.");
            }
        }
        return Status.OK_STATUS;
    }

}
