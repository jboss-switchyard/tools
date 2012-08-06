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
package org.switchyard.tools.ui.editor.diagram.binding;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.actions.OpenNewClassWizardAction;
import org.eclipse.jdt.ui.wizards.NewClassWizardPage;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * Adds standard binding tabs.
 * 
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public abstract class AbstractSYBindingComposite extends AbstractSwitchyardComposite implements IBindingComposite {

    private SwitchYardBindingType _binding;
    private Text _composerClassText;
    private Button _browseComposerClassBtn;
    private Text _mapperClassText;
    private Button _browseMapperClassBtn;
    private Text _includesText;
    private Text _includesNSText;
    private Text _excludesText;
    private Text _excludesNSText;
    private Link _newComposerClassLink;
    private Link _newMapperClassLink;
    private Object _targetObj = null;
    private TabFolder _tabFolder;
    private static int _selectedTab = 0;

    /**
     * @param tabFolder folder to add tabs to
     */
    public void addTabs(final TabFolder tabFolder) {
        _tabFolder = tabFolder;
        createComposerTab(_tabFolder);
//        createAdvancedTab(_tabFolder);

        _tabFolder.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                _selectedTab = _tabFolder.getSelectionIndex();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });
    }
    
    protected void resetSelectedTab() {
        if (_tabFolder != null) {
            _tabFolder.setSelection(getSelectedTabIndex());
        }
    }

    protected int getSelectedTabIndex() {
        return _selectedTab;
    }

    protected void createComposerTab(TabFolder tabFolder) {
        TabItem composer = new TabItem(tabFolder, SWT.NONE);
        composer.setText("Message Composer/Context Mapper");
        composer.setControl(getComposerTabControl(tabFolder));
    }

    protected void createAdvancedTab(TabFolder tabFolder) {
        TabItem advanced = new TabItem(tabFolder, SWT.NONE);
        advanced.setText("Advanced");
        advanced.setControl(getAdvancedTabControl(tabFolder));
    }

    protected Control getAdvancedTabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(3, false);
        composite.setLayout(gl);
        
        // add controls
        
        return composite;
    }
    
    /**
     * @param tabFolder folder to add new tab to
     * @return composite for tab
     */
    protected Control getComposerTabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(3, false);
        composite.setLayout(gl);

        _newComposerClassLink = new Link(composite, SWT.NONE);
        String message = "<a>Custom Message Composer Class</a>";
        _newComposerClassLink.setText(message);
        _newComposerClassLink.setEnabled(canEdit());
        _newComposerClassLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleClassLink(_composerClassText, _newComposerClassLink,
                        "org.switchyard.component.common.composer.MessageComposer");
            }
        });

        _composerClassText = createLabelAndText(composite, null);
        _composerClassText.setEnabled(canEdit());
        _composerClassText.setData("class");

        _browseComposerClassBtn = new Button(composite, SWT.PUSH);
        _browseComposerClassBtn.setText("Browse...");
        _browseComposerClassBtn.setEnabled(canEdit());
        GridData btnGD = new GridData();
        _browseComposerClassBtn.setLayoutData(btnGD);
        _browseComposerClassBtn.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                handleClassBrowse(_browseComposerClassBtn, _composerClassText,
                        "org.switchyard.component.common.composer.MessageComposer");
            }
        });

        _newMapperClassLink = new Link(composite, SWT.NONE);
        message = "<a>Custom Context Mapper Class</a>";
        _newMapperClassLink.setText(message);
        _newMapperClassLink.setEnabled(canEdit());
        _newMapperClassLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleClassLink(_mapperClassText, _newMapperClassLink,
                        "org.switchyard.component.common.composer.ContextMapper");
            }
        });

        _mapperClassText = createLabelAndText(composite, null);
        _mapperClassText.setEnabled(canEdit());
        _mapperClassText.setData("class");

        _browseMapperClassBtn = new Button(composite, SWT.PUSH);
        _browseMapperClassBtn.setText("Browse...");
        _browseMapperClassBtn.setEnabled(canEdit());
        GridData btnGD2 = new GridData();
        _browseMapperClassBtn.setLayoutData(btnGD2);
        _browseMapperClassBtn.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                handleClassBrowse(_browseMapperClassBtn, _mapperClassText,
                        "org.switchyard.component.common.composer.ContextMapper");
            }
        });

        Group regExGroup = new Group(composite, SWT.NONE);
        regExGroup.setText("Regular Expressions");
        regExGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
        regExGroup.setLayout(new GridLayout(2, false));

        _includesText = createLabelAndText(regExGroup, "Includes");
        _includesText.setEnabled(canEdit());
        _includesText.setData("includes");

        _excludesText = createLabelAndText(regExGroup, "Excludes");
        _excludesText.setEnabled(canEdit());
        _excludesText.setData("excludes");

        _includesNSText = createLabelAndText(regExGroup, "Include Namespaces");
        _includesNSText.setEnabled(canEdit());
        _includesNSText.setData("includeNamespaces");

        _excludesNSText = createLabelAndText(regExGroup, "Exclude Namespaces");
        _excludesNSText.setEnabled(canEdit());
        _excludesNSText.setData("excludeNamespaces");

        return composite;
    }

    private void handleClassBrowse(Button classBrowseBtn, Text classText, String interfaceName) {
        try {
            IProject project = null;
            if (_binding != null) {
                IResource modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
                if (modelFile != null) {
                    project = modelFile.getProject();
                }
            }
            IType selected = selectType(getPanel().getShell(), interfaceName, project);
            if (selected != null) {
                classText.setText(selected.getFullyQualifiedName());
                handleModify(classText);
                fireChangedEvent(this);
            }
        } catch (JavaModelException e1) {
            e1.printStackTrace();
        }
    }

    private void handleClassLink(Text classText, Link classLink, String interfaceName) {
        if (classText != null && !classText.isDisposed()) {
            String classname = classText.getText();
            try {
                IType foundClass = canFindClass(classname);
                if (foundClass == null) {
                    String className = handleCreateJavaClass(classname, interfaceName);
                    if (className != null) {
                        classText.setText(className);
                        handleModify(classText);
                        fireChangedEvent(this);
                    }
                    return;
                } else {
                    handleOpenJavaClass(foundClass);
                }
            } catch (JavaModelException e1) {
                e1.printStackTrace();
            }
        }
    }

    /**
     * @param switchYardBindingType incoming binding
     */
    public void setTabsBinding(Binding switchYardBindingType) {
        if (switchYardBindingType != null && switchYardBindingType instanceof SwitchYardBindingType) {
            SwitchYardBindingType binding = (SwitchYardBindingType) switchYardBindingType;
            this._binding = binding;
            if (binding.getContextMapper() != null && binding.getContextMapper().getClass_() != null) {
                setTextValue(_mapperClassText, binding.getContextMapper().getClass_());
            }
            if (binding.getMessageComposer() != null && binding.getMessageComposer().getClass_() != null) {
                setTextValue(_composerClassText, binding.getMessageComposer().getClass_());
            }
            if (binding.getContextMapper() != null && binding.getContextMapper().getIncludes() != null) {
                setTextValue(_includesText, binding.getContextMapper().getIncludes());
            }
            if (binding.getContextMapper() != null && binding.getContextMapper().getIncludeNamespaces() != null) {
                setTextValue(_includesNSText, binding.getContextMapper().getIncludeNamespaces());
            }
            if (binding.getContextMapper() != null && binding.getContextMapper().getExcludes() != null) {
                setTextValue(_excludesText, binding.getContextMapper().getExcludes());
            }
            if (binding.getContextMapper() != null && binding.getContextMapper().getExcludeNamespaces() != null) {
                setTextValue(_excludesNSText, binding.getContextMapper().getExcludeNamespaces());
            }
        }
        resetSelectedTab();
    }

    /**
     * @return true/false if tab is valid or not
     */
    public boolean validateTabs() {

        String includesMsg = validateRegExField(_includesText);
        if (includesMsg != null) {
            setErrorMessage(includesMsg);
            return false;
        }

        String includesNSMsg = validateRegExField(_includesNSText);
        if (includesNSMsg != null) {
            setErrorMessage(includesNSMsg);
            return false;
        }

        String excludesMsg = validateRegExField(_excludesText);
        if (excludesMsg != null) {
            setErrorMessage(excludesMsg);
            return false;
        }

        String excludesNSMsg = validateRegExField(_excludesNSText);
        if (excludesNSMsg != null) {
            setErrorMessage(excludesNSMsg);
            return false;
        }

        return (getErrorMessage() == null);
    }

    private String validateRegExField(Text text) {
        if (text != null && !text.isDisposed()) {
            if (text.getText() != null && text.getText().trim().length() > 0) {
                String pattern = text.getText().trim();
                PatternSyntaxException result = validateRegEx(pattern);
                if (result != null) {
                    return result.getLocalizedMessage();
                }
            }
        }
        return null;
    }

    private PatternSyntaxException validateRegEx(String userInputPattern) {
        try {
            Pattern.compile(userInputPattern);
        } catch (PatternSyntaxException exception) {
            return exception;
        }
        return null;
    }

    protected void updateFeature(final EObject eObject, final String featureId, final Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new ContextMapperOp());
        ops.add(new BasicEObjectOperation(eObject, featureId, value));
        wrapOperation(ops);
    }

    protected void updateFeature(EObject eObject, String[] featureId, Object[] value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();

        if (featureId != null && featureId.length > 0 && value != null && value.length > 0
                && featureId.length == value.length) {
            for (int i = 0; i < featureId.length; i++) {
                ops.add(new BasicEObjectOperation(eObject, featureId[i], value[i]));
            }
        }

        wrapOperation(ops);
    }

    protected ContextMapperType createContextMapper() {
        ContextMapperType contextMapper = SwitchyardFactory.eINSTANCE.createContextMapperType();
        return contextMapper;
    }

    class ContextMapperOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getContextMapper() == null) {
                ContextMapperType contextMapper = createContextMapper();
                setFeatureValue(_binding, "contextMapper", contextMapper);
            }
        }
    }

    class MessageComposerOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getMessageComposer() == null) {
                MessageComposerType messageComposer = createMessageComposer();
                setFeatureValue(_binding, "messageComposer", messageComposer);
            }
        }
    }

    protected void updateContextMapperFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new ContextMapperOp());
        ops.add(new BasicOperation("contextMapper", featureId, value));
        wrapOperation(ops);
    }

    protected void updateMessageComposerFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new MessageComposerOp());
        ops.add(new BasicOperation("messageComposer", featureId, value));
        wrapOperation(ops);
    }

    protected void updateContextMapperFeature(Text control) {
        String value = control.getText().trim();
        updateContextMapperFeature((String) control.getData(), value);
    }

    protected void undoContextMapperFeature(Text control) {
        String feature = (String) control.getData();
        Object value = null;
        if (_binding.getContextMapper() != null) {
            value = getFeatureValue(_binding.getContextMapper(), feature);
        }
        if (value == null) {
            control.setText("");
        } else if (value instanceof String) {
            control.setText((String) value);
        }
    }

    protected void updateMessageComposerFeature(Button control) {
        boolean value = control.getSelection();
        updateMessageComposerFeature((String) control.getData(), value);
    }

    protected MessageComposerType createMessageComposer() {
        MessageComposerType messageComposer = SwitchyardFactory.eINSTANCE.createMessageComposerType();
        return messageComposer;
    }

    protected void updateMessageComposerFeature(final Text control) {
        String value = control.getText().trim();
        updateMessageComposerFeature((String) control.getData(), value);
    }

    protected void undoMessageComposerFeature(Text control) {
        String feature = (String) control.getData();
        Object value = null;
        if (_binding.getMessageComposer() != null) {
            value = getFeatureValue(_binding.getMessageComposer(), feature);
        }
        if (value == null) {
            control.setText("");
        } else if (value instanceof String) {
            control.setText((String) value);
        }
    }

    /**
     * @param control Control to modify value for
     */
    protected void handleModify(Control control) {
        if (_binding != null) {
            if (control.equals(_mapperClassText)) {
                updateContextMapperFeature(_mapperClassText);
            } else if (control.equals(_composerClassText)) {
                updateMessageComposerFeature(_composerClassText);
            } else if (control.equals(_includesText)) {
                updateContextMapperFeature(_includesText);
            } else if (control.equals(_excludesText)) {
                updateContextMapperFeature(_excludesText);
            } else if (control.equals(_includesNSText)) {
                updateContextMapperFeature(_includesNSText);
            } else if (control.equals(_excludesNSText)) {
                updateContextMapperFeature(_excludesNSText);
            }
        }
    }

    private IType canFindClass(String classname) throws JavaModelException {
        IProject project = null;
        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
                .getSelection();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        if (selection instanceof IStructuredSelection) {
            selectionToPass = (IStructuredSelection) selection;
            if (selectionToPass.getFirstElement() instanceof IFile) {
                project = ((IFile) selectionToPass.getFirstElement()).getProject();
            }
        }
        if (selectionToPass == StructuredSelection.EMPTY) {
            project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
        }
        if (project != null && classname != null) { //$NON-NLS-1$
            IJavaProject javaProject = JavaCore.create(project);
            IType superType = javaProject.findType(classname);
            if (superType != null) {
                return superType;
            }
        }
        return null;
    }

    private void handleOpenJavaClass(IType classToOpen) {
        if (classToOpen != null) {
            try {
                JavaUI.openInEditor(classToOpen);
            } catch (PartInitException e) {
                e.printStackTrace();
            } catch (JavaModelException e) {
                e.printStackTrace();
            }
        }
    }

    private String handleCreateJavaClass(String className, String interfaceName) throws JavaModelException {
        IProject project = null;
        IJavaProject javaProject = null;
        OpenNewClassWizardAction action = new OpenNewClassWizardAction();
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        if (modelFile != null) {
            selectionToPass = new StructuredSelection(modelFile);
            project = ((IFile) selectionToPass.getFirstElement()).getProject();
        }
        NewClassWizardPage page = new NewClassWizardPage();
        ArrayList<String> interfaces = new ArrayList<String>();
        if (interfaceName != null && interfaceName.trim().length() > 0) {
            interfaces.add(interfaceName);
            page.setSuperInterfaces(interfaces, false);
        }
        IPackageFragmentRoot packRoot = null;
        if (project != null) { //$NON-NLS-1$
            javaProject = JavaCore.create(project);
            if (!className.isEmpty()) {
                if (className.contains(".")) {
                    className = className.substring(className.lastIndexOf('.') + 1);
                }
                page.setTypeName(className, true);
            }
            IPackageFragment[] packages = javaProject.getPackageFragments();
            for (IPackageFragment mypackage : packages) {
                if (mypackage.getKind() == IPackageFragmentRoot.K_SOURCE) {
                    selectionToPass = new StructuredSelection(mypackage);
                    packRoot = (IPackageFragmentRoot) mypackage.getParent();
                    break;
                }
            }
            page.setPackageFragmentRoot(packRoot, true);
        }
        action.setSelection(selectionToPass);
        if (javaProject != null) {
            IJavaElement[] roots = packRoot.getChildren();
            PackageFragment stashFrag = null;
            for (int i = 0; i < roots.length; i++) {
                PackageFragment frag = (PackageFragment) roots[i];
                if (!frag.isDefaultPackage() && !frag.hasSubpackages()) {
                    stashFrag = frag;
                    break;
                }
            }
            if (stashFrag != null) {
                page.setPackageFragment(stashFrag, true);
            }
        }
        action.setConfiguredWizardPage(page);
        action.setOpenEditorOnFinish(false);
        action.run();
        IJavaElement createdElement = action.getCreatedElement();
        if (createdElement != null && createdElement instanceof IType) {
            IType stype = (IType) createdElement;
            String name = stype.getFullyQualifiedName();
            if (name != null) {
                return name;
            }
        }
        return null;
    }

    /**
     * @param shell Shell for the window
     * @param superTypeName supertype to search for
     * @param project project to look in
     * @return IType the type created
     * @throws JavaModelException exception thrown
     */
    public IType selectType(Shell shell, String superTypeName, IProject project) throws JavaModelException {
        IJavaSearchScope searchScope = null;
        if (project != null && superTypeName != null && !superTypeName.equals("java.lang.Object")) { //$NON-NLS-1$
            IJavaProject javaProject = JavaCore.create(project);
            IType superType = javaProject.findType(superTypeName);
            if (superType != null) {
                searchScope = SearchEngine.createHierarchyScope(superType);
            }
        } else if (project != null) {
            IJavaProject javaProject = JavaCore.create(project);
            searchScope = SearchEngine.createJavaSearchScope(javaProject.getJavaModel().getChildren());
        } else {
            searchScope = SearchEngine.createWorkspaceScope();
        }
        SelectionDialog dialog = JavaUI.createTypeDialog(shell, new ProgressMonitorDialog(shell), searchScope,
                IJavaElementSearchConstants.CONSIDER_CLASSES_AND_INTERFACES, false);
        dialog.setTitle("Select entries");
        dialog.setMessage("Matching items");
        if (dialog.open() == IDialogConstants.CANCEL_ID) {
            return null;
        }
        Object[] types = dialog.getResult();
        if (types == null || types.length == 0) {
            return null;
        }
        return (IType) types[0];
    }

    protected void wrapOperation(final List<ModelOperation> ops) {
        wrapOperation(getBinding(), ops);
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
            String[] path = parseString(_localObjectPath, "/");
            EObject object = getBinding();
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

    protected boolean validChange(String objectpath, String featureId, Object value) {
        String[] path = parseString(objectpath, "/");
        EObject object = _binding;
        for (int i = 0; i < path.length; i++) {
            object = (EObject) getFeatureValue(object, path[i]);
        }
        if (object == null) {
            return false;
        }
        Object oldvalue = getFeatureValue(object, featureId);
        if (oldvalue == value) {
            return false;
        }
        return true;
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            setInUpdate(true);
            if (control.equals(_mapperClassText)) {
                undoContextMapperFeature(_mapperClassText);
            } else if (control.equals(_composerClassText)) {
                undoMessageComposerFeature(_composerClassText);
            } else if (control.equals(_includesText)) {
                undoContextMapperFeature(_includesText);
            } else if (control.equals(_excludesText)) {
                undoContextMapperFeature(_excludesText);
            } else if (control.equals(_includesNSText)) {
                undoContextMapperFeature(_includesNSText);
            } else if (control.equals(_excludesNSText)) {
                undoContextMapperFeature(_excludesNSText);
            }
            setInUpdate(false);
        }
    }

    protected void updateControlEditable(Control control) {
        if (control != null && !control.isDisposed()) {
            control.setEnabled(canEdit());
        }
    }

    /**
     * @param canEdit flag
     */
    public void setCanEdit(boolean canEdit) {
        super.setCanEdit(canEdit);
        updateControlEditable(_mapperClassText);
        updateControlEditable(_composerClassText);
        updateControlEditable(_includesText);
        updateControlEditable(_excludesText);
        updateControlEditable(_includesNSText);
        updateControlEditable(_excludesNSText);
    }

    /**
     * @param target Passed in what we're dropping on
     */
    public void setTargetObject(Object target) {
        this._targetObj = target;
    }

    /**
     * @return object stashed
     */
    public Object getTargetObject() {
        return this._targetObj;
    }

}
