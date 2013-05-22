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
package org.switchyard.tools.ui.editor.impl.security;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecuritiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.diagram.shared.DomainPropertyInputDialog;
import org.switchyard.tools.ui.editor.diagram.shared.DomainPropertyTable;
import org.switchyard.tools.ui.editor.impl.DomainPropertyTextValueChangeListener;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 *
 */
public class NewSecurityTypeWizardPage extends WizardPage {

    private SecurityType _securityType;
    private SecuritiesType _securitiesType;

    private DomainPropertyTable _securityProperties;
    private Text _callbackHandlerText;
    private String _callbackHandler;
    private Button _callbackHandlerBrowseBtn;
    private Text _moduleNameText;
    private String _moduleName;
    private Text _rolesAllowedText;
    private String _rolesAllowed;
    private Text _securityDomainText;
    private String _securityDomain;
    private Text _runAsText;
    private String _runAs;
    private boolean _editing = false;
    private String _oldModuleName;

    private ModuleNameTextValueChangeListener _moduleNameListener;
    private ISWTObservableValue _moduleNameFocusObserver;
    private RolesAllowedTextValueChangeListener _rolesAllowedListener;
    private ISWTObservableValue _rolesAllowedFocusObserver;
    private RunAsTextValueChangeListener _runAsListener;
    private ISWTObservableValue _runAsFocusObserver;
    private SecurityDomainTextValueChangeListener _securityDomainListener;
    private ISWTObservableValue _securityDomainFocusObserver;

    protected NewSecurityTypeWizardPage(String pageName) {
        super(pageName);
    }

    @Override
    public void createControl(Composite parent) {
        FormToolkit toolkit = new FormToolkit(parent.getDisplay());
        Composite client3 = toolkit.createComposite(parent, SWT.WRAP);
        GridLayout layout3 = new GridLayout();
        layout3.numColumns = 3;
        layout3.marginWidth = 2;
        layout3.marginHeight = 2;
        client3.setLayout(layout3);

        toolkit.createLabel(client3, "Name (Optional)");
        _moduleNameText = toolkit.createText(client3, "");
        _moduleNameText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1));

        toolkit.createLabel(client3, "Roles Allowed");
        _rolesAllowedText = toolkit.createText(client3, "");
        _rolesAllowedText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1));

        toolkit.createLabel(client3, "Run As");
        _runAsText = toolkit.createText(client3, "");
        _runAsText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1));

        toolkit.createLabel(client3, "Security Domain");
        _securityDomainText = toolkit.createText(client3, "");
        _securityDomainText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1));

        toolkit.createLabel(client3, "Callback Handler Class");
        _callbackHandlerText = toolkit.createText(client3, "", SWT.READ_ONLY);
        _callbackHandlerText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false));

        _callbackHandlerBrowseBtn = toolkit.createButton(client3, "Browse...", SWT.PUSH);
        _callbackHandlerBrowseBtn.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                handleBrowse();
                setPageComplete(validate());
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        });

        Label separator = toolkit.createLabel(client3, null, SWT.HORIZONTAL);
        separator.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 3, 1));

        _securityProperties = new DomainPropertyTable(client3, SWT.NONE) {

            @Override
            protected void removeFromList() {
                final PropertyType toRemove = _securityProperties.getTableSelection();
                if (toRemove != null) {
                    removeSecurityProperty(toRemove);
                }
            }

            @Override
            protected void addPropertyTypeToList() {
                final DomainPropertyInputDialog dialog = new DomainPropertyInputDialog(Display.getCurrent()
                        .getActiveShell());
                int rtn_value = dialog.open();
                if (rtn_value == DomainPropertyInputDialog.OK) {
                    final String name = dialog.getPropertyName();
                    final String value = dialog.getPropertyValue();
                    addSecurityProperty(name, value);
                }

            }
        };
        _securityProperties.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 3, 5));
        if (_securityType != null) {
            if (_securityType.getProperties() != null) {
                _securityProperties.setSelection(_securityType.getProperties().getProperty());
            }
            if (_securityType.getName() != null) {
                _moduleNameText.setText(_securityType.getName());
                _moduleName = _securityType.getName();
                _oldModuleName = _moduleName;
            } else {
                _moduleNameText.setText("default");
                _moduleName = null;
                _oldModuleName = null;
            }
            if (_securityType.getCallbackHandler() != null) {
                _callbackHandlerText.setText(_securityType.getCallbackHandler());
                _callbackHandler = _securityType.getCallbackHandler();
            }
            if (_securityType.getRolesAllowed() != null) {
                _rolesAllowedText.setText(_securityType.getRolesAllowed());
                _rolesAllowed = _securityType.getRolesAllowed();
            }
            if (_securityType.getRunAs() != null) {
                _runAsText.setText(_securityType.getRunAs());
                _runAs = _securityType.getRunAs();
            }
            if (_securityType.getSecurityDomain() != null) {
                _securityDomainText.setText(_securityType.getSecurityDomain());
                _securityDomain = _securityType.getSecurityDomain();
            }
        }

        addObservableListeners();
        setControl(client3);
        setPageComplete(validate());
    }

    private void handleBrowse() {
        IJavaSearchScope scope = null;
        IProject project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
        IJavaProject javaProject = JavaCore.create(project);
        if (javaProject == null) {
            scope = SearchEngine.createWorkspaceScope();
        } else {
            try {
                IType superType = javaProject.findType("javax.security.auth.callback.CallbackHandler");
                if (superType != null) {
                    scope = SearchEngine.createStrictHierarchyScope(javaProject, superType, true, false, null);
                } else {
                    scope = SearchEngine.createJavaSearchScope(new IJavaElement[] {javaProject });
                }
            } catch (JavaModelException e) {
                e.printStackTrace();
            }
        }

        try {
            SelectionDialog dialog = JavaUI.createTypeDialog(Display.getCurrent().getActiveShell(), null, scope,
                    IJavaElementSearchConstants.CONSIDER_CLASSES_AND_INTERFACES, false);
            if (dialog.open() == SelectionDialog.OK) {
                Object[] result = dialog.getResult();
                if (result.length > 0 && result[0] instanceof IType) {
                    IType clazz = (IType) result[0];
                    String className = clazz.getFullyQualifiedName();
                    _callbackHandlerText.setText(className);
                    _callbackHandler = className;
                }
            }
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
    }

    private void addSecurityProperty(final String name, final String value) {
        TransactionalEditingDomain editDomain =
                (TransactionalEditingDomainImpl) SwitchyardSCAEditor.getActiveEditor().getEditingDomain();        
        if (_securityType != null) {
            final SecurityType finalSecurity = _securityType;
            editDomain.getCommandStack().execute(new RecordingCommand(editDomain) {
                @Override
                protected void doExecute() {
                    PropertiesType properties = finalSecurity.getProperties();
                    if (properties == null) {
                        properties = SwitchyardFactory.eINSTANCE.createPropertiesType();
                        finalSecurity.setProperties(properties);
                    }
                    EList<PropertyType> propertyList = properties.getProperty();
                    PropertyType newProperty = SwitchyardFactory.eINSTANCE.createPropertyType();
                    newProperty.setName(name);
                    newProperty.setValue(value);
                    propertyList.add(newProperty);
                    _securityProperties.setSelection(_securityType.getProperties().getProperty());
                }
            });
        }
    }

    private void removeSecurityProperty(final PropertyType property) {
        TransactionalEditingDomain editDomain =
                (TransactionalEditingDomainImpl) SwitchyardSCAEditor.getActiveEditor().getEditingDomain();        
        if (_securityType != null) {
            final SecurityType finalSecurity = _securityType;
            editDomain.getCommandStack().execute(new RecordingCommand(editDomain) {
                @Override
                protected void doExecute() {
                    PropertiesType properties = finalSecurity.getProperties();
                    properties.getProperty().remove(property);
                }
            });
        }
    }

    private void addObservableListeners() {
        if (_moduleNameListener == null) {
            _moduleNameListener = new ModuleNameTextValueChangeListener();
        }
        updateListener(_moduleNameListener, _moduleNameFocusObserver, _moduleNameText);
        if (_rolesAllowedListener == null) {
            _rolesAllowedListener = new RolesAllowedTextValueChangeListener();
        }
        updateListener(_rolesAllowedListener, _rolesAllowedFocusObserver, _rolesAllowedText);
        if (_runAsListener == null) {
            _runAsListener = new RunAsTextValueChangeListener();
        }
        updateListener(_runAsListener, _runAsFocusObserver, _runAsText);
        if (_securityDomainListener == null) {
            _securityDomainListener = new SecurityDomainTextValueChangeListener();
        }
        updateListener(_securityDomainListener, _securityDomainFocusObserver, _securityDomainText);
    }

    private void removeObservableListeners() {
        removeListener(_moduleNameListener, _moduleNameFocusObserver);
        removeListener(_rolesAllowedListener, _rolesAllowedFocusObserver);
        removeListener(_runAsListener, _runAsFocusObserver);
        removeListener(_securityDomainListener, _securityDomainFocusObserver);
    }

    private void updateListener(DomainPropertyTextValueChangeListener listener, 
            ISWTObservableValue focus, Text control) {
        if (listener != null && focus != null) {
            focus.removeValueChangeListener(listener);
        }
        if (focus == null) {
            focus = SWTObservables.observeText(control, SWT.FocusOut);
        }
        focus.addValueChangeListener(listener);
    }

    private void removeListener(DomainPropertyTextValueChangeListener listener, 
            ISWTObservableValue focus) {
        if (listener != null && focus != null) {
            focus.removeValueChangeListener(listener);
            focus.dispose();
            listener = null;
        }
    }

    class ModuleNameTextValueChangeListener extends DomainPropertyTextValueChangeListener {

        @Override
        protected void updateField(Text control) {
            String value = control.getText();
            if (value.trim().isEmpty()) {
                value = null;
            }
            _moduleName = value;
            setPageComplete(validate());
        }
    }

    class RolesAllowedTextValueChangeListener extends DomainPropertyTextValueChangeListener {
        @Override
        protected void updateField(Text control) {
            String value = control.getText();
            if (value.trim().isEmpty()) {
                value = null;
            }
            _rolesAllowed = value;
            setPageComplete(validate());
        }
    }

    class RunAsTextValueChangeListener extends DomainPropertyTextValueChangeListener {
        @Override
        protected void updateField(Text control) {
            String value = control.getText();
            if (value.trim().isEmpty()) {
                value = null;
            }
            _runAs = value;
            setPageComplete(validate());
        }
    }

    class SecurityDomainTextValueChangeListener extends DomainPropertyTextValueChangeListener {
        @Override
        protected void updateField(Text control) {
            String value = control.getText();
            if (value.trim().isEmpty()) {
                value = null;
            }
            _securityDomain = value;
            setPageComplete(validate());
        }
    }

    @Override
    public void dispose() {
        removeObservableListeners();
        super.dispose();
    }

    /**
     * @param security incoming Security Type
     */
    public void setSecurityType(SecurityType security) {
        this._securityType = security;
    }

    /**
     * @return the updated security type
     */
    public SecurityType getSecurityType() {
        return this._securityType;
    }
    
    protected String getCallbackHandler() {
        return this._callbackHandler;
    }
    
    protected String getModuleName() {
        return this._moduleName;
    }
    
    protected String getRolesAllowed() {
        return this._rolesAllowed;
    }
    
    protected String getRunAs() {
        return this._runAs;
    }

    protected String getSecurityDomain() {
        return this._securityDomain;
    }
    
    /**
     * @param securities incoming Securities Type
     */
    public void setSecuritiesType(SecuritiesType securities) {
        this._securitiesType = securities;
    }

    /**
     * @return the updated Securities type
     */
    public SecuritiesType getSecuritiesType() {
        return this._securitiesType;
    }
    
    private boolean validate() {
        setErrorMessage(null);
        if (getSecuritiesType() != null) {
            Iterator<SecurityType> iter = getSecuritiesType().getSecurity().iterator();
            while (iter.hasNext()) {
                SecurityType securityType = iter.next();
                String name = securityType.getName();
                boolean nameIsNull = (name == null);
                boolean fieldNameIsNull = (_moduleName == null);
                boolean fieldNameIsEmpty = fieldNameIsNull || _moduleName.trim().isEmpty();
                boolean fieldNameIsDefault = fieldNameIsNull || _moduleName.equals("default");
                boolean fieldNameIsSTName = (nameIsNull && fieldNameIsNull) || (!nameIsNull && !fieldNameIsNull && _moduleName.equals(name));
                boolean oldNameIsNull = (_oldModuleName == null);
                boolean fieldNameIsOldName = (oldNameIsNull && fieldNameIsNull) || (!oldNameIsNull && !fieldNameIsNull && _moduleName.equals(_oldModuleName));
                
                if (nameIsNull && (fieldNameIsNull || fieldNameIsEmpty || fieldNameIsDefault) && !_editing) {
                    setErrorMessage("One default Security Configuration already exists. Please set the name.");
                    return false;
                } else if (nameIsNull && (fieldNameIsNull || fieldNameIsEmpty || fieldNameIsDefault) && _editing && !fieldNameIsOldName) {
                    setErrorMessage("One default Security Configuration already exists. Please set the name.");
                    return false;
                } else if (!nameIsNull && fieldNameIsSTName && !_editing) {
                    setErrorMessage("A Security Configuration already exists with the name '" + _moduleName + "'. Please select a different name.");
                    return false;
                } else if (!nameIsNull && fieldNameIsSTName && _editing && !fieldNameIsOldName) {
                    setErrorMessage("A Security Configuration already exists with the name '" + _moduleName + "'. Please select a different name.");
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * @param editing Are we editing?
     */
    public void setEditing(boolean editing) {
        this._editing = editing;
    }
}
