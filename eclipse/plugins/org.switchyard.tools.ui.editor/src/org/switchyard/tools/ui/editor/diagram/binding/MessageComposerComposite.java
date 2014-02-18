/******************************************************************************* 
 * Copyright (c) 2012-2013 Red Hat, Inc. 
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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.ObservableTracker;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.validation.MultiValidator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.actions.OpenNewClassWizardAction;
import org.eclipse.jdt.ui.wizards.NewClassWizardPage;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.AccessibleClassValidator;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.RegexListValidator;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * Composite for editing message composer and context mapper associated with a
 * binding.
 * 
 * @author bfitzpat
 */
@SuppressWarnings("restriction")
public class MessageComposerComposite extends AbstractSYBindingComposite implements IBindingComposite {

    private Composite _panel;
    private Text _composerClassText;
    private Button _browseComposerClassBtn;
    private Text _mapperClassText;
    private Button _browseMapperClassBtn;
    private Text _includesText;
    private Text _includesNSText;
    private Text _excludesText;
    private Text _excludesNSText;
    private Hyperlink _newComposerClassLink;
    private Hyperlink _newMapperClassLink;
    private final EClass _messageComposerType;
    private final EStructuralFeature _messageComposerFeature;
    private final EClass _contextMapperType;
    private final EStructuralFeature _contextMapperFeature;
    private IObservableValue _bindingValue;

    /**
     * Create a new MessageComposerComposite.
     * 
     * @param toolkit to be used for creating controls
     * @param messageComposerFeature the feature for accessing the message composer
     * @param contextMapperFeature the feature for accessing the context mapper
     */
    public MessageComposerComposite(FormToolkit toolkit, EStructuralFeature messageComposerFeature,
            EStructuralFeature contextMapperFeature) {
        this(toolkit, SwitchyardPackage.Literals.MESSAGE_COMPOSER_TYPE, messageComposerFeature, SwitchyardPackage.Literals.CONTEXT_MAPPER_TYPE, contextMapperFeature);
    }
    
    /**
     * Create a new MessageComposerComposite.
     * 
     * @param toolkit to be used for creating controls
     * @param messageComposerType the type of message composer
     * @param messageComposerFeature the feature for accessing the message composer
     * @param contextMapperType the type of context mapper
     * @param contextMapperFeature the feature for accessing the context mapper
     */
    public MessageComposerComposite(FormToolkit toolkit, EClass messageComposerType, EStructuralFeature messageComposerFeature,
            EClass contextMapperType, EStructuralFeature contextMapperFeature) {
        super(toolkit);
        _messageComposerType = messageComposerType;
        _messageComposerFeature = messageComposerFeature;
        _contextMapperType = contextMapperType;
        _contextMapperFeature = contextMapperFeature;
    }

    @Override
    public Composite getPanel() {
        return _panel;
    }

    @Override
    public String getTitle() {
        return Messages.title_messageComposer;
    }

    @Override
    public String getDescription() {
        return Messages.description_messageComposer;
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = getToolkit().createComposite(parent, SWT.NONE);
        GridLayout gl = new GridLayout(3, false);
        _panel.setLayout(gl);

        _newComposerClassLink = getToolkit().createHyperlink(_panel, Messages.link_customMessageComposerClass, SWT.NONE);
        _newComposerClassLink.setEnabled(canEdit());
        _newComposerClassLink.addHyperlinkListener(new HyperlinkAdapter() {
            @Override
            public void linkActivated(HyperlinkEvent e) {
                handleClassLink(_composerClassText, _newComposerClassLink,
                        "org.switchyard.component.common.composer.MessageComposer<T>"); //$NON-NLS-1$
            }
        });

        _composerClassText = createLabelAndText(_panel, null);
        _composerClassText.setEnabled(canEdit());
        _composerClassText.setData("class"); //$NON-NLS-1$

        _browseComposerClassBtn = getToolkit().createButton(_panel, Messages.button_browse, SWT.PUSH);
        _browseComposerClassBtn.setEnabled(canEdit());
        GridData btnGD = new GridData();
        _browseComposerClassBtn.setLayoutData(btnGD);
        _browseComposerClassBtn.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                handleClassBrowse(_browseComposerClassBtn, _composerClassText,
                        "org.switchyard.component.common.composer.MessageComposer"); //$NON-NLS-1$
            }
        });

        _newMapperClassLink = getToolkit().createHyperlink(_panel, Messages.link_customContextMapperClass, SWT.NONE);
        _newMapperClassLink.setEnabled(canEdit());
        _newMapperClassLink.addHyperlinkListener(new HyperlinkAdapter() {
            @Override
            public void linkActivated(HyperlinkEvent e) {
                handleClassLink(_mapperClassText, _newMapperClassLink,
                        "org.switchyard.component.common.composer.ContextMapper<T>"); //$NON-NLS-1$
            }
        });

        _mapperClassText = createLabelAndText(_panel, null);
        _mapperClassText.setEnabled(canEdit());
        _mapperClassText.setData("class"); //$NON-NLS-1$

        _browseMapperClassBtn = getToolkit().createButton(_panel, Messages.button_browse, SWT.PUSH);
        _browseMapperClassBtn.setEnabled(canEdit());
        GridData btnGD2 = new GridData();
        _browseMapperClassBtn.setLayoutData(btnGD2);
        _browseMapperClassBtn.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                handleClassBrowse(_browseMapperClassBtn, _mapperClassText,
                        "org.switchyard.component.common.composer.ContextMapper"); //$NON-NLS-1$
            }
        });

        Group regExGroup = new Group(_panel, SWT.NONE);
        regExGroup.setText(Messages.label_regularExpressions);
        regExGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 3, 1));
        regExGroup.setLayout(new GridLayout(2, false));

        _includesText = createLabelAndText(regExGroup, Messages.label_includes);
        _includesText.setEnabled(canEdit());
        _includesText.setData("includes"); //$NON-NLS-1$

        _excludesText = createLabelAndText(regExGroup, Messages.label_excludes);
        _excludesText.setEnabled(canEdit());
        _excludesText.setData("excludes"); //$NON-NLS-1$

        _includesNSText = createLabelAndText(regExGroup, Messages.label_includeNamespaces);
        _includesNSText.setEnabled(canEdit());
        _includesNSText.setData("includeNamespaces"); //$NON-NLS-1$

        _excludesNSText = createLabelAndText(regExGroup, Messages.label_excludeNamespaces);
        _excludesNSText.setEnabled(canEdit());
        _excludesNSText.setData("excludeNamespaces"); //$NON-NLS-1$
        
        bindControls(context);
    }

    private void bindControls(DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_panel.getDisplay());

        _bindingValue = new WritableValue(realm, null, Binding.class);

        // bind the controls
        final FeaturePath messageComposerClassFeature = FeaturePath.fromList(_messageComposerFeature,
                SwitchyardPackage.Literals.MESSAGE_COMPOSER_TYPE__CLASS);
        final IObservableValue composerClassValue = EMFProperties.value(messageComposerClassFeature).observeDetail(
                _bindingValue);
        org.eclipse.core.databinding.Binding binding = context.bindValue(SWTObservables.observeText(_composerClassText,
                new int[] {SWT.Modify }), composerClassValue, new EMFUpdateValueStrategyNullForEmptyString(null,
                UpdateValueStrategy.POLICY_CONVERT, domain, _bindingValue, messageComposerClassFeature, true)
                .setAfterConvertValidator(new AccessibleClassValidator(BeanProperties.value("targetObject").observe(
                        this))), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        final FeaturePath contextMapperClassFeature = FeaturePath.fromList(_contextMapperFeature,
                SwitchyardPackage.Literals.CONTEXT_MAPPER_TYPE__CLASS);
        final IObservableValue mapperClassTextValue = SWTObservables.observeText(_mapperClassText,
                new int[] {SWT.Modify });
        final IObservableValue mapperClassValue = EMFProperties.value(contextMapperClassFeature).observeDetail(
                _bindingValue);
        final org.eclipse.core.databinding.Binding mapperClassBinding = context.bindValue(mapperClassTextValue,
                mapperClassValue, new EMFUpdateValueStrategyNullForEmptyString(null,
                        UpdateValueStrategy.POLICY_CONVERT, domain, _bindingValue, contextMapperClassFeature, true)
                        .setAfterConvertValidator(new AccessibleClassValidator(BeanProperties.value("targetObject")
                                .observe(this))), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(mapperClassBinding), SWT.TOP | SWT.LEFT);

        final FeaturePath contextMapperIncludesFeature = FeaturePath.fromList(_contextMapperFeature,
                SwitchyardPackage.Literals.CONTEXT_MAPPER_TYPE__INCLUDES);
        final IObservableValue includesTextValue = SWTObservables.observeText(_includesText, new int[] {SWT.Modify });
        final IObservableValue includesValue = EMFProperties.value(contextMapperIncludesFeature).observeDetail(
                _bindingValue);
        binding = context.bindValue(includesTextValue, includesValue, new EMFUpdateValueStrategyNullForEmptyString(
                null, UpdateValueStrategy.POLICY_CONVERT, domain, _bindingValue, contextMapperIncludesFeature, true)
                .setAfterConvertValidator(new RegexListValidator()), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        final FeaturePath contextMapperExcludesFeature = FeaturePath.fromList(_contextMapperFeature,
                SwitchyardPackage.Literals.CONTEXT_MAPPER_TYPE__EXCLUDES);
        final IObservableValue excludesTextValue = SWTObservables.observeText(_excludesText, new int[] {SWT.Modify });
        final IObservableValue excludesValue = EMFProperties.value(contextMapperExcludesFeature).observeDetail(
                _bindingValue);
        binding = context.bindValue(excludesTextValue, excludesValue, new EMFUpdateValueStrategyNullForEmptyString(
                null, UpdateValueStrategy.POLICY_CONVERT, domain, _bindingValue, contextMapperExcludesFeature, true)
                .setAfterConvertValidator(new RegexListValidator()), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        final FeaturePath contextMapperIncludesNSFeature = FeaturePath.fromList(_contextMapperFeature,
                SwitchyardPackage.Literals.CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES);
        final IObservableValue includesNSTextValue = SWTObservables.observeText(_includesNSText,
                new int[] {SWT.Modify });
        final IObservableValue includesNSValue = EMFProperties.value(contextMapperIncludesNSFeature).observeDetail(
                _bindingValue);
        binding = context.bindValue(includesNSTextValue, includesNSValue, new EMFUpdateValueStrategyNullForEmptyString(
                null, UpdateValueStrategy.POLICY_CONVERT, domain, _bindingValue, contextMapperIncludesNSFeature, true)
                .setAfterConvertValidator(new RegexListValidator()), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        final FeaturePath contextMapperExcludesNSFeature = FeaturePath.fromList(_contextMapperFeature,
                SwitchyardPackage.Literals.CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES);
        final IObservableValue excludesNSTextValue = SWTObservables.observeText(_excludesNSText,
                new int[] {SWT.Modify });
        final IObservableValue excludesNSValue = EMFProperties.value(contextMapperExcludesNSFeature).observeDetail(
                _bindingValue);
        binding = context.bindValue(excludesNSTextValue, excludesNSValue, new EMFUpdateValueStrategyNullForEmptyString(
                null, UpdateValueStrategy.POLICY_CONVERT, domain, _bindingValue, contextMapperExcludesNSFeature, true)
                .setAfterConvertValidator(new RegexListValidator()), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        /*
         * add a warning if there are regex patterns set, but the specified
         * context mapper class doesn't support them
         */
        context.addValidationStatusProvider(new MultiValidator() {
            @Override
            protected IStatus validate() {
                final IStatus mapperClassStatus;
                ObservableTracker.setIgnore(true);
                try {
                    // we don't want to track status updates
                    mapperClassStatus = (IStatus) mapperClassBinding.getValidationStatus().getValue();
                } finally {
                    ObservableTracker.setIgnore(false);
                }
                /*
                 * read from everything we require (ensures we get called when
                 * any of these get updated)
                 */
                final String mapperClass = (String) mapperClassTextValue.getValue();
                final String includes = (String) includesTextValue.getValue();
                final String excludes = (String) excludesTextValue.getValue();
                final String includesNS = (String) includesNSTextValue.getValue();
                final String excludesNS = (String) excludesNSTextValue.getValue();

                // do the actual validation
                if ((mapperClassStatus != null && !mapperClassStatus.isOK()) || cmClassSupportsRegEx(mapperClass)) {
                    return Status.OK_STATUS;
                }
                if (isNullOrEmpty(mapperClass)
                        || (isNullOrEmpty(includes) && isNullOrEmpty(excludes) && isNullOrEmpty(includesNS) && isNullOrEmpty(excludesNS))) {
                    return Status.OK_STATUS;
                }
                return new Status(Status.WARNING, Activator.PLUGIN_ID,
                        "Selected context mapper class does not support regular expressions.");
            }
        });
    }

    private boolean isNullOrEmpty(final String value) {
        return value == null || value.trim().isEmpty();
    }

    private void handleClassBrowse(Button classBrowseBtn, Text classText, String interfaceName) {
        try {
            IProject project = null;
            if (getBinding() != null) {
                IResource modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
                if (modelFile != null) {
                    project = modelFile.getProject();
                }
            }
            IType selected = selectType(getPanel().getShell(), interfaceName, project);
            if (selected != null) {
                classText.setText(selected.getFullyQualifiedName());
                // make sure a notify event gets sent, to update the binding
                classText.notifyListeners(SWT.Modify, null);
                // simulate "ENTER" to commit the change
                classText.notifyListeners(SWT.DefaultSelection, null);
                classText.setFocus();
            }
        } catch (JavaModelException e1) {
            e1.printStackTrace();
        }
    }

    private void handleClassLink(Text classText, Hyperlink classLink, String interfaceName) {
        if (classText != null && !classText.isDisposed()) {
            String classname = classText.getText();
            try {
                IType foundClass = canFindClass(classname);
                if (foundClass == null) {
                    String className = handleCreateJavaClass(classname, interfaceName);
                    if (className != null) {
                        classText.setText(className);
                        // make sure a notify event gets sent, to update the binding
                        classText.notifyListeners(SWT.Modify, null);
                        // simulate "ENTER" to commit the change
                        classText.notifyListeners(SWT.DefaultSelection, null);
                        classText.setFocus();
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

    @Override
    public void setBinding(Binding switchYardBindingType) {
        super.setBinding(switchYardBindingType);
        _bindingValue.setValue(switchYardBindingType);
        
    }

    private boolean cmClassSupportsRegEx(String classname) {
        try {
            IType cmClassType = canFindClass(classname);
            if (cmClassType != null) {
                ITypeHierarchy hierarchy = cmClassType.newSupertypeHierarchy(new NullProgressMonitor());
                if (hierarchy != null) {
                    for (IType intf : hierarchy.getAllInterfaces()) {
                        if ("RegexContextMapper".equals(intf.getElementName())) { //$NON-NLS-1$
                            return true;
                        }
                    }
                }
            }
        } catch (JavaModelException e) {
            e.fillInStackTrace();
        }
        return false;
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
            } else if (selectionToPass.getFirstElement() instanceof AbstractGraphicalEditPart) {
                project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
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
            page.setSuperInterfaces(interfaces, true);
        }
        IPackageFragmentRoot packRoot = null;
        if (project != null) { //$NON-NLS-1$
            javaProject = JavaCore.create(project);
            if (!className.isEmpty()) {
                if (className.contains(".")) { //$NON-NLS-1$
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
        dialog.setTitle(Messages.title_selectEntries);
        dialog.setMessage(Messages.description_matchingItems);
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
            String[] path = parseString(_localObjectPath, "/"); //$NON-NLS-1$
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

    protected Text getComposerClassText() {
        return _composerClassText;
    }

    protected Text getMapperClassText() {
        return _mapperClassText;
    }

    protected Text getIncludesText() {
        return _includesText;
    }

    protected Text getIncludesNSText() {
        return _includesNSText;
    }

    protected Text getExcludesText() {
        return _excludesText;
    }

    protected Text getExcludesNSText() {
        return _excludesNSText;
    }

}
