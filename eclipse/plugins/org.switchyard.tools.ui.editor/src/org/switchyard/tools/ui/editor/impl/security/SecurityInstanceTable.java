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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.switchyard.tools.models.switchyard1_0.switchyard.DomainType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecuritiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;

/**
 * @author bfitzpat
 * 
 */
public class SecurityInstanceTable extends Composite {

    private class SecurityTypeTreeContentProvider implements ITreeContentProvider {
        private EList<SecurityType> _properties;

        @Override
        public void dispose() {
        }

        @SuppressWarnings("unchecked")
        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            if (newInput instanceof EList<?>) {
                _properties = (EList<SecurityType>) newInput;
            }
        }

        @Override
        public Object[] getElements(Object inputElement) {
            if (inputElement instanceof EList<?>) {
                return _properties.toArray();
            }
            return null;
        }

        @Override
        public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof SecurityType[]) {
                return new Object[] {_properties.toArray() };
            }
            return null;
        }

        @Override
        public Object getParent(Object element) {
            if (element instanceof SecurityType) {
                return ((SecurityType) element).eContainer();
            }
            return null;
        }

        @Override
        public boolean hasChildren(Object element) {
            if (element instanceof EList<?>) {
                return ((EList<?>) element).size() > 0;
            }
            return false;
        }
    }

    private class SecurityTypeTreeLabelProvider implements ITableLabelProvider {
        @Override
        public void addListener(ILabelProviderListener listener) {
        }

        @Override
        public void dispose() {
        }

        @Override
        public boolean isLabelProperty(Object element, String property) {
            if (element instanceof SecurityType && property.equalsIgnoreCase(NAME_COLUMN)) {
                return true;
            } else if (element instanceof SecurityType && property.equalsIgnoreCase(CALLBACK_HANDLER_COLUMN)) {
                return true;
            } else if (element instanceof SecurityType && property.equalsIgnoreCase(ROLES_ALLOWED_COLUMN)) {
                return true;
            } else if (element instanceof SecurityType && property.equalsIgnoreCase(RUN_AS_COLUMN)) {
                return true;
            } else if (element instanceof SecurityType && property.equalsIgnoreCase(SECURITY_DOMAIN_COLUMN)) {
                return true;
            }
            return false;
        }

        @Override
        public void removeListener(ILabelProviderListener listener) {
        }

        @Override
        public Image getColumnImage(Object element, int columnIndex) {
            return null;
        }

        @Override
        public String getColumnText(Object element, int columnIndex) {
            if (element instanceof SecurityType && columnIndex == 0) {
                SecurityType tp = (SecurityType) element;
                if (tp.getName() == null) {
                    return "default";
                }
                return ((SecurityType) element).getName();
            } else if (element instanceof SecurityType && columnIndex == 1) {
                SecurityType tp = (SecurityType) element;
                return (String) tp.getCallbackHandler();
            } else if (element instanceof SecurityType && columnIndex == 2) {
                SecurityType tp = (SecurityType) element;
                return (String) tp.getRolesAllowed();
            } else if (element instanceof SecurityType && columnIndex == 3) {
                SecurityType tp = (SecurityType) element;
                return (String) tp.getRunAs();
            } else if (element instanceof SecurityType && columnIndex == 4) {
                SecurityType tp = (SecurityType) element;
                return (String) tp.getSecurityDomain();
            }
            return null;
        }
    }

    private TreeViewer _propertyTreeTable;
    private SwitchYardType _syRoot = null;
    private TransactionalEditingDomain _editDomain = null;
    
    /**
     *  Name column.
     */
    public static final String NAME_COLUMN = "name";
    /**
     * Callback Handler column.
     */
    public static final String CALLBACK_HANDLER_COLUMN = "callbackHandler";
    /**
     * Roles Allowed column. 
     */
    public static final String ROLES_ALLOWED_COLUMN = "rolesAllowed";
    /**
     * Run As column.
     */
    public static final String RUN_AS_COLUMN = "runAs";
    /**
     * Security domain column.
     */
    public static final String SECURITY_DOMAIN_COLUMN = "securityDomain";
    private static final String[] TREE_COLUMNS = new String[] {NAME_COLUMN, CALLBACK_HANDLER_COLUMN, ROLES_ALLOWED_COLUMN, RUN_AS_COLUMN, SECURITY_DOMAIN_COLUMN };

    private Button _mAddButton;
    private Button _mEditButton;
    private Button _mRemoveButton;
    private boolean _isReadOnly = false;
    private EObject _targetObj = null;
    private String _mWarning = null;
    private ListenerList _changeListeners;

    /**
     * Constructor.
     * 
     * @param parent Composite parent
     * @param style any SWT style bits to pass along
     */
    public SecurityInstanceTable(Composite parent, int style) {
        this(parent, style, false);
    }
    
    private TreeColumn createColumn(Tree tree, int style, String text, int width) {
        TreeColumn newColumn = new TreeColumn(tree, style);
        newColumn.setText(text);
        newColumn.setWidth(width);
        return newColumn;
    }
    
    /**
     * @param root Passed in SY root
     */
    public void setSwitchYardRoot(SwitchYardType root) {
        this._syRoot = root;
    }
    
    /**
     * @param domain Passed in editing domain
     */
    public void setEditingDomain(TransactionalEditingDomain domain) {
        this._editDomain = domain;
    }

    /**
     * Constructor.
     * 
     * @param parent composite parent
     * @param style any SWT style bits
     * @param isReadOnly boolean flag
     */
    public SecurityInstanceTable(Composite parent, int style, boolean isReadOnly) {
        super(parent, style);
        this._isReadOnly = isReadOnly;
        this._changeListeners = new ListenerList();

        int additionalStyles = SWT.NONE;
        if (isReadOnly) {
            additionalStyles = SWT.READ_ONLY;
        }

        final GridLayout gridLayout = new GridLayout();
        gridLayout.marginWidth = 0;
        gridLayout.marginHeight = 0;
        gridLayout.numColumns = 2;
        setLayout(gridLayout);

        _propertyTreeTable = new TreeViewer(this, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.FULL_SELECTION
                | additionalStyles);
        this._propertyTreeTable.setAutoExpandLevel(TreeViewer.ALL_LEVELS);
        GridData gd11 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 5);
        gd11.heightHint = 100;
        _propertyTreeTable.getTree().setLayoutData(gd11);
        _propertyTreeTable.getTree().setHeaderVisible(true);
        TreeColumn nameColumn = createColumn(_propertyTreeTable.getTree(), SWT.LEFT, "Name", 150);
        nameColumn.setData(NAME_COLUMN);
        TreeColumn callbackHandlerColumn = createColumn(_propertyTreeTable.getTree(), SWT.LEFT, "Callback Handler", 150);
        callbackHandlerColumn.setData(CALLBACK_HANDLER_COLUMN);
        TreeColumn rolesAllowedColumn = createColumn(_propertyTreeTable.getTree(), SWT.LEFT, "Roles Allowed", 150);
        rolesAllowedColumn.setData(ROLES_ALLOWED_COLUMN);
        TreeColumn runAsColumn = createColumn(_propertyTreeTable.getTree(), SWT.LEFT, "Run As", 150);
        runAsColumn.setData(RUN_AS_COLUMN);
        TreeColumn securityDomainColumn = createColumn(_propertyTreeTable.getTree(), SWT.LEFT, "Security Domain", 150);
        securityDomainColumn.setData(SECURITY_DOMAIN_COLUMN);

        _propertyTreeTable.setColumnProperties(TREE_COLUMNS);

        _propertyTreeTable.setLabelProvider(new SecurityTypeTreeLabelProvider());

        _propertyTreeTable.setContentProvider(new SecurityTypeTreeContentProvider());

        this._mAddButton = new Button(this, SWT.NONE);
        this._mAddButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mAddButton.setText("Add");
        this._mAddButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                addSecurityTypeToList();
                _propertyTreeTable.refresh();
                fireChangedEvent(e.getSource());
            }
        });

        this._mAddButton.setEnabled(false);

        _propertyTreeTable.getTree().addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                updateSecurityTypeButtons();
            }
        });

        this._mEditButton = new Button(this, SWT.NONE);
        this._mEditButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mEditButton.setText("Edit");
        this._mEditButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                editSecurityType();
                _propertyTreeTable.refresh();
                fireChangedEvent(e.getSource());
            }
        });

        this._mEditButton.setEnabled(false);

        this._mRemoveButton = new Button(this, SWT.NONE);
        this._mRemoveButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mRemoveButton.setText("Remove");
        this._mRemoveButton.setEnabled(false);
        this._mRemoveButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                removeFromList();
                _propertyTreeTable.refresh();
                fireChangedEvent(e.getSource());
            }
        });

        updateSecurityTypeButtons();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    protected void checkSubclass() {
        // empty
    }

    /**
     * Add a new property to the list
     */
    protected void addSecurityTypeToList() {
        NewSecurityTypeWizard wizard = new NewSecurityTypeWizard();
        if (_syRoot.getDomain() != null && _syRoot.getDomain().getSecurities() != null) {
            wizard.setSecuritiesType(_syRoot.getDomain().getSecurities());
        }
        WizardDialog dialog = new WizardDialog(this.getShell(), wizard);
        int rtn_code = dialog.open();
        if (rtn_code == Window.OK) {
            if (_syRoot != null) {
                final SwitchYardType finalRoot = _syRoot;
                final SecurityType newSecurity = wizard.getSecurityType();
                _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                    @Override
                    protected void doExecute() {
                        DomainType domain = finalRoot.getDomain();
                        if (domain == null) {
                            domain = SwitchyardFactory.eINSTANCE.createDomainType();
                            finalRoot.setDomain(domain);
                        }
                        SecuritiesType security = domain.getSecurities();
                        if (security == null) {
                            security = SwitchyardFactory.eINSTANCE.createSecuritiesType();
                            domain.setSecurities(security);
                        }
                        security.getSecurity().add(newSecurity);
                    }
                });
            }
        }
    }
    
    protected void editSecurityType() {
        StructuredSelection ssel = (StructuredSelection) _propertyTreeTable.getSelection();
        if (ssel.getFirstElement() != null && ssel.getFirstElement() instanceof SecurityType) {
            final SecurityType security = (SecurityType) ssel.getFirstElement();
            
            NewSecurityTypeWizard wizard = new NewSecurityTypeWizard(true);
            wizard.setSecurityType(security);
            wizard.setSecuritiesType(_syRoot.getDomain().getSecurities());
            WizardDialog dialog = new WizardDialog(this.getShell(), wizard);
            int rtn_code = dialog.open();
            if (rtn_code == Window.OK) {
                if (_syRoot != null) {
                    final SwitchYardType finalRoot = _syRoot;
                    final SecurityType newSecurity = wizard.getSecurityType();
                    _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                        @Override
                        protected void doExecute() {
                            DomainType domain = finalRoot.getDomain();
                            if (domain == null) {
                                domain = SwitchyardFactory.eINSTANCE.createDomainType();
                                finalRoot.setDomain(domain);
                            }
                            SecuritiesType securities = domain.getSecurities();
                            securities.getSecurity().remove(security);
                            securities.getSecurity().add(newSecurity);
                        }
                    });
                }
            }
        }
    }

    /**
     * Remove a property from the list
     */
    protected void removeFromList() {
        StructuredSelection ssel = (StructuredSelection) _propertyTreeTable.getSelection();
        if (ssel.getFirstElement() != null && ssel.getFirstElement() instanceof SecurityType) {
            final SecurityType security = (SecurityType) ssel.getFirstElement();
            if (_syRoot != null) {
                final SwitchYardType finalRoot = _syRoot;
                _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                    @Override
                    protected void doExecute() {
                        DomainType domain = finalRoot.getDomain();
                        if (domain == null) {
                            domain = SwitchyardFactory.eINSTANCE.createDomainType();
                            finalRoot.setDomain(domain);
                        }
                        SecuritiesType securities = domain.getSecurities();
                        securities.getSecurity().remove(security);
                    }
                });
            }
        }
    };

    /**
     * Return the current selection.
     * 
     * @return String list
     */
    @SuppressWarnings("unchecked")
    public EList<SecurityType> getSelection() {
        if (_propertyTreeTable != null && _propertyTreeTable.getInput() != null) {
            return (EList<SecurityType>) _propertyTreeTable.getInput();
        }
        return null;
    }
    
    /**
     * @return the currently selected SecurityType
     */
    public SecurityType getTableSelection() {
        if (_propertyTreeTable != null && !_propertyTreeTable.getSelection().isEmpty()) {
            IStructuredSelection ssel = (IStructuredSelection) _propertyTreeTable.getSelection();
            if (ssel.getFirstElement() instanceof SecurityType) {
                return (SecurityType) ssel.getFirstElement();
            }
        }
        return null;
    }

    /**
     * Update button state based on what's selected.
     */
    public void updateSecurityTypeButtons() {
        if (_isReadOnly) {
            this._mAddButton.setEnabled(false);
            this._mRemoveButton.setEnabled(false);

        } else {
            this._mAddButton.setEnabled(true);
            if (getSelection() != null) {
                _mEditButton.setEnabled(true);
                _mRemoveButton.setEnabled(true);
            }
        }
    }

    /**
     * @param properties incoming property list
     */
    public void setSelection(EList<SecurityType> properties) {
        _propertyTreeTable.setInput(properties);
        updateSecurityTypeButtons();
    }
    
    /**
     * @param securities set the incoming security objects
     */
    public void setSecurity(SecuritiesType securities) {
        if (securities != null) {
            _propertyTreeTable.setInput(securities.getSecurity());
        }
        updateSecurityTypeButtons();
    }

    /**
     * @return warning string
     */
    public String getWarning() {
        return this._mWarning;
    }

    /**
     * If we changed, fire a changed event.
     * 
     * @param source
     */
    protected void fireChangedEvent(Object source) {
        ChangeEvent e = new ChangeEvent(source);
        // inform any listeners of the resize event
        Object[] listeners = this._changeListeners.getListeners();
        for (int i = 0; i < listeners.length; ++i) {
            ((ChangeListener) listeners[i]).stateChanged(e);
        }
    }

    /**
     * Add a change listener.
     * 
     * @param listener new listener
     */
    public void addChangeListener(ChangeListener listener) {
        this._changeListeners.add(listener);
    }

    /**
     * Remove a change listener.
     * 
     * @param listener old listener
     */
    public void removeChangeListener(ChangeListener listener) {
        this._changeListeners.remove(listener);
    }

    /**
     * @param target Passed in what we're dropping on
     */
    public void setTargetObject(EObject target) {
        this._targetObj = target;
    }

    protected EObject getTargetObject() {
        return this._targetObj;
    }
    
    protected void setFeatureValue(EObject eObject, String featureId, Object value) {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    eObject.eSet(eStructuralFeature, value);
                    break;
                }
            }
        }
    }

    protected TreeViewer getTreeViewer() {
        return this._propertyTreeTable;
    }
}
