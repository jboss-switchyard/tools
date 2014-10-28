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
package org.switchyard.tools.ui.editor.validator.wizards;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.models.switchyard1_0.validate.FileEntryType;
import org.switchyard.tools.models.switchyard1_0.validate.SchemaCatalogsType;
import org.switchyard.tools.models.switchyard1_0.validate.SchemaFilesType;
import org.switchyard.tools.models.switchyard1_0.validate.ValidateFactory;
import org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType;
import org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class XMLValidatorComposite extends BaseValidatorComposite {

    private Button _failOnWarningText;
    private Text _xsdFileText;
//    private Button _browseButton;
    private Combo _schemaTypeCombo;
    private FileEntryTable _schemaFileTable;
    private FileEntryTable _catalogFileTable;
    private Button _namespaceAwareCheckbox;

    XMLValidatorComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    private void handleSchemaTypeSelection(SelectionEvent e) {
        wrapOperation(new Runnable(){
            public void run() {
                XmlValidateType xmlValidator = (XmlValidateType) getValidator();
                String selectedSchemaType = _schemaTypeCombo.getText();
                XmlSchemaType actualSchemaType = (XmlSchemaType) _schemaTypeCombo.getData(selectedSchemaType);
                xmlValidator.setSchemaType(actualSchemaType);
                fireChangedEvent(this);
                handleModify(_schemaFileTable);
                _schemaFileTable.getTreeViewer().refresh(true);
            }
        });
    }
    
    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        super.createContents(parent, style, context);

        Composite outer = getToolkit().createComposite(getPanel(), SWT.NONE);
        GridData outerGD = new GridData(SWT.FILL, SWT.NULL, true, true, 2, 1);
        outerGD.horizontalIndent = -5;
        outerGD.verticalIndent = -5;
        outer.setLayoutData(outerGD);
        outer.setLayout(new GridLayout(2, false));

        _schemaTypeCombo = createLabelAndCombo(outer, Messages.label_schemaType, true);
        _schemaTypeCombo.add("DTD", 0); //$NON-NLS-1$
        _schemaTypeCombo.setData("DTD", XmlSchemaType.DTD); //$NON-NLS-1$
        _schemaTypeCombo.add("XMLSCHEMA", 1); //$NON-NLS-1$
        _schemaTypeCombo.setData("XMLSCHEMA", XmlSchemaType.XMLSCHEMA); //$NON-NLS-1$
        _schemaTypeCombo.add("RELAX_NG",2); //$NON-NLS-1$
        _schemaTypeCombo.setData("RELAX_NG", XmlSchemaType.RELAXNG); //$NON-NLS-1$
        _schemaTypeCombo.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleSchemaTypeSelection(e);
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });

        Composite inner = getToolkit().createComposite(getPanel(), SWT.NONE);
        GridData innerGD = new GridData(SWT.FILL, SWT.NULL, true, true, 2, 1);
        innerGD.horizontalIndent = -5;
        innerGD.verticalIndent = -5;
        inner.setLayoutData(innerGD);
        inner.setLayout(new GridLayout(1, false));
        
        getToolkit().createLabel(inner, Messages.label_schemaFiles, SWT.NULL);
        
        _schemaFileTable = new FileEntryTable(inner, SWT.NONE) {

            @Override
            protected void removeFromList() {
                final FileEntryType toRemove = _schemaFileTable.getTableSelection();
                if (toRemove != null) {
                    removeFileEntry(toRemove);
                }
            }

            @Override
            protected void addFileEntryTypeToList() {
                wrapOperation(new Runnable(){
                    public void run() {
                        String filepath = handleBrowse(_schemaTypeCombo.getText().trim());
                        if (filepath != null) {
                            FileEntryType fileEntry = ValidateFactory.eINSTANCE.createFileEntryType();
                            fileEntry.setFile(filepath);
                            if (_schemaFileTable.getSelection() == null) {
                                XmlValidateType xmlValidator = (XmlValidateType) getValidator();
                                String selectedSchemaType = _schemaTypeCombo.getText();
                                XmlSchemaType actualSchemaType = (XmlSchemaType) _schemaTypeCombo.getData(selectedSchemaType);
                                xmlValidator.setSchemaType(actualSchemaType);
                                xmlValidator.setSchemaFiles(ValidateFactory.eINSTANCE.createSchemaFilesType());
                                _schemaFileTable.setSelection(xmlValidator.getSchemaFiles().getEntry());
                            }
                            _schemaFileTable.getSelection().add(fileEntry);
                            fireChangedEvent(this);
                            handleModify(_schemaFileTable);
                            _schemaFileTable.getTreeViewer().refresh(true);
                        }
                    }
                });
            }
        };

        _schemaFileTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
        
        getToolkit().createLabel(inner, Messages.label_catalogFiles, SWT.NULL);
        _catalogFileTable = new FileEntryTable(inner, SWT.NONE) {

            @Override
            protected void removeFromList() {
                final FileEntryType toRemove = _catalogFileTable.getTableSelection();
                if (toRemove != null) {
                    removeCatalogFileEntry(toRemove);
                }
            }

            @Override
            protected void addFileEntryTypeToList() {
                wrapOperation(new Runnable(){
                    public void run() {
                        String filepath = handleBrowse(_schemaTypeCombo.getText().trim());
                        if (filepath != null) {
                            FileEntryType fileEntry = ValidateFactory.eINSTANCE.createFileEntryType();
                            fileEntry.setFile(filepath);
                            if (_catalogFileTable.getSelection() == null) {
                                XmlValidateType xmlValidator = (XmlValidateType) getValidator();
                                xmlValidator.setSchemaCatalogs(ValidateFactory.eINSTANCE.createSchemaCatalogsType());
                                _catalogFileTable.setSelection(xmlValidator.getSchemaCatalogs().getEntry());
                            }
                            _catalogFileTable.getSelection().add(fileEntry);
                            fireChangedEvent(this);
                            handleModify(_schemaFileTable);
                            _catalogFileTable.getTreeViewer().refresh(true);
                        }
                    }
                });
            }
        };

        _catalogFileTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
 
        _failOnWarningText = createCheckbox(getPanel(), Messages.label_failOnWarning);
        addGridData(_failOnWarningText, 1, GridData.FILL_HORIZONTAL);
        _failOnWarningText.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (!inUpdate()) {
                    handleModify(_failOnWarningText);
                    fireChangedEvent(_failOnWarningText);
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });
        
        _namespaceAwareCheckbox = createCheckbox(getPanel(), Messages.label_namespaceAware);
        _namespaceAwareCheckbox.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (!inUpdate()) {
                    handleModify(_namespaceAwareCheckbox);
                    fireChangedEvent(_namespaceAwareCheckbox);
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });
        
        setValidator(getValidator());
    }

    private void wrapOperation(final Runnable runner) {
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(getValidator());
        if (domain != null) {
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    try {
                        runner.run();
                    } catch (Exception e) {
                        Activator.logError(e);
                    }
                }
            });
        } else {
            try {
                runner.run();
            } catch (Exception e) {
                Activator.logError(e);
            }
        }
    }
    
    private void removeFileEntry(final FileEntryType fileEntry) {
        if (getValidator() != null) {
            final XmlValidateType xmlValidator = (XmlValidateType) getValidator();
            final SchemaFilesType schemaFiles = xmlValidator.getSchemaFiles();
            final TransactionalEditingDomainImpl _editDomain = 
                    (TransactionalEditingDomainImpl) SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
            if (schemaFiles != null) {
                _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                    @Override
                    protected void doExecute() {
                        schemaFiles.getEntry().remove(fileEntry);
                    }
                });
            }
         }
    }

    private void removeCatalogFileEntry(final FileEntryType fileEntry) {
        if (getValidator() != null) {
            final XmlValidateType xmlValidator = (XmlValidateType) getValidator();
            final SchemaCatalogsType catalogFiles = xmlValidator.getSchemaCatalogs();
            final TransactionalEditingDomainImpl _editDomain = 
                    (TransactionalEditingDomainImpl) SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
            if (catalogFiles != null) {
                _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                    @Override
                    protected void doExecute() {
                        catalogFiles.getEntry().remove(fileEntry);
                    }
                });
            }
         }
    }

    protected boolean validate() {
        super.validate();
        if (getErrorMessage() == null) {
            if (_xsdFileText != null && !_xsdFileText.isDisposed()) {
                String text = _xsdFileText.getText().trim();
                if (text.length() == 0) {
                    setErrorMessage(Messages.error_emptyFileName);
                }
            }
        }
        return (getErrorMessage() == null);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_failOnWarningText)) {
            String value = Boolean.toString(_failOnWarningText.getSelection());                        
            updateFeature((XmlValidateType) getValidator(), "failOnWarning", value); //$NON-NLS-1$
        } else if (control.equals(_namespaceAwareCheckbox)) {
            String value = Boolean.toString(_namespaceAwareCheckbox.getSelection());                        
            updateFeature((XmlValidateType) getValidator(), "namespaceAware", value); //$NON-NLS-1$
        } else if (control.equals(_xsdFileText)) {
            updateFeature((XmlValidateType) getValidator(), "schemaFile", _xsdFileText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_schemaTypeCombo)) {
            XmlSchemaType selectedType = (XmlSchemaType) _schemaTypeCombo.getData(_schemaTypeCombo.getText());
            updateFeature((XmlValidateType) getValidator(), "schemaType", selectedType); //$NON-NLS-1$
        } else {
            super.handleModify(control);
        }
        validate();
    }

    protected void handleUndo(Control control) {
        super.handleUndo(control);
        setInUpdate(true);
        if (getValidator() != null) {
            XmlValidateType xmlValidator = (XmlValidateType) getValidator();
            if (control.equals(_failOnWarningText)) { 
                boolean value = Boolean.parseBoolean(xmlValidator.getFailOnWarning());                        
                _failOnWarningText.setSelection(value);
            } else if (control.equals(_namespaceAwareCheckbox)) {
                boolean value = Boolean.parseBoolean(xmlValidator.getNamespaceAware());                        
                _namespaceAwareCheckbox.setSelection(value);
            } else if (control.equals(_schemaTypeCombo)) {
                _schemaTypeCombo.select(xmlValidator.getSchemaType().getValue());
            }
        }
        setInUpdate(false);
    }    

    /**
     * @param validator incoming validator type
     */
    public void setValidator(ValidateType validator) {
        setInUpdate(true);
        super.setValidator(validator);
        XmlValidateType xmlValidator = (XmlValidateType) getValidator();
        if (xmlValidator != null) {
            if (_failOnWarningText != null && !_failOnWarningText.isDisposed() && xmlValidator.getFailOnWarning() != null) {
                boolean value = Boolean.parseBoolean(xmlValidator.getFailOnWarning());                        
                _failOnWarningText.setSelection(value);
            }
            if (_namespaceAwareCheckbox != null && !_namespaceAwareCheckbox.isDisposed() && xmlValidator.getNamespaceAware() != null) {
                boolean value = Boolean.parseBoolean(xmlValidator.getNamespaceAware());                        
                _namespaceAwareCheckbox.setSelection(value);
            }
            if (_schemaFileTable != null && !_schemaFileTable.isDisposed() && xmlValidator != null && xmlValidator.getSchemaFiles() != null) {
                SchemaFilesType schemaFiles = xmlValidator.getSchemaFiles();
                if (schemaFiles.getEntry() != null) {
                    _schemaFileTable.setTargetObject(schemaFiles);
                    _schemaFileTable.setSelection(schemaFiles.getEntry());
                }
            }
            if (_catalogFileTable != null && !_catalogFileTable.isDisposed() && xmlValidator != null && xmlValidator.getSchemaCatalogs() !=  null) {
                SchemaCatalogsType catalogFiles = xmlValidator.getSchemaCatalogs();
                if (catalogFiles.getEntry() != null) {
                    _catalogFileTable.setTargetObject(catalogFiles);
                    _catalogFileTable.setSelection(catalogFiles.getEntry());
                }
            }
            if (_schemaTypeCombo != null && !_schemaTypeCombo.isDisposed() && xmlValidator.getSchemaType() != null) {
                _schemaTypeCombo.select(xmlValidator.getSchemaType().getValue());
            }
        }
        setInUpdate(false);
        addObservableListeners();
    }

    /**
     * @author bfitzpat
     */
    public class BasicOperation extends ModelOperation {

        private String _localObjectPath;
        private String _localFeature;
        private Object _localValue;

        /**
         * @param objectpath incoming path to the object with the feature
         * @param featureId feature id
         * @param value incoming value
         */
        public BasicOperation(String objectpath, String featureId, Object value) {
            _localObjectPath = objectpath;
            _localFeature = featureId;
            _localValue = value;
        }

        @Override
        public void run() throws Exception {
            String[] path = parseString(_localObjectPath, "/"); //$NON-NLS-1$
            EObject object = getValidator();
            for (int i = 0; i < path.length; i++) {
                object = (EObject) getFeatureValue(object, path[i]);
            }
            if (object != null) {
                if (_localValue instanceof String && ((String) _localValue).length() == 0) {
                    setFeatureValue(object, _localFeature, null);
                } else {
                    setFeatureValue(object, _localFeature, _localValue);
                }
            } else {
                throw new Exception();
            }
        }
    }

    private String handleBrowse(String type) {

        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IJavaProject javaProject = null;
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                javaProject = JavaCore.create(modelFile.getProject());
            }
        }
        ClasspathResourceSelectionDialog dialog = null;
        if (javaProject == null) {
            dialog = new ClasspathResourceSelectionDialog(Display.getCurrent().getActiveShell(), ResourcesPlugin.getWorkspace().getRoot());
        } else {
            dialog = new ClasspathResourceSelectionDialog(Display.getCurrent().getActiveShell(), javaProject.getProject());
        }
        String title = Messages.title_selectXsdDtdRngFile;
        String extension = "*.xsd,*.dtd,*.rng,*.rnc"; //$NON-NLS-1$
        if (type != null) {
            String value = type.trim();
            if (value.contentEquals("DTD")) { //$NON-NLS-1$
                title = Messages.title_selectDtdFile;
                extension = "*.dtd"; //$NON-NLS-1$
            } else if (value.contentEquals("XMLSCHEMA")) { //$NON-NLS-1$
                title = Messages.title_selectXsdFile;
                extension = "*.xsd"; //$NON-NLS-1$
            } else if (value.contentEquals("RELAX_NG")) { //$NON-NLS-1$
                title = Messages.title_selectRelaxNgFile;
                extension = "*.rng"; //$NON-NLS-1$
            }
        }
        dialog.setTitle(title);
        dialog.setInitialPattern(extension);
        dialog.open();
        Object[] result = dialog.getResult();
        if (result == null || result.length == 0 || !(result[0] instanceof IResource)) {
            return null;
        }
        String filepath = JavaUtil.getJavaPathForResource((IResource) result[0]).toString();
        return filepath;
    }
}
