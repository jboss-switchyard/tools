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
package org.switchyard.tools.ui.editor.transform.wizards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.actions.OpenNewClassWizardAction;
import org.eclipse.jdt.ui.wizards.NewClassWizardPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.TransformTypesUtil;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class BaseTransformComposite extends AbstractSwitchyardComposite {

    private Composite _panel;
    private TransformType _transform;
    private Combo _toText;
    private Combo _fromText;
    private WizardPage _page = null;
    private String _warningMessage = null;
    private boolean _ignoreListUpdate = false;
    private EObject _toObject = null;
    private EObject _fromObject = null;
    private HashMap<String, String> _typeMappings = null;

    /**
     * Constructor.
     */
    public BaseTransformComposite() {
        super();
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        setWarningMessage(null);
        String toText = null;
        String fromText = null;
        if (_toText != null && !_toText.isDisposed()) {
            toText = _toText.getText().trim();
            if (toText.length() == 0) {
                setErrorMessage("To field may not be empty.");
            } else {
                try {
                    QName.valueOf(toText);
                } catch (IllegalArgumentException e) {
                    setErrorMessage("To field must be a valid QName.");
                }
            }
        }
        if (_fromText != null && !_fromText.isDisposed()) {
            fromText = _fromText.getText().trim();
            if (fromText.length() == 0) {
                setErrorMessage("From field may not be empty.");
            } else {
                try {
                    QName.valueOf(fromText);
                } catch (IllegalArgumentException e) {
                    setErrorMessage("From field must be a valid QName.");
                }
            }
        }
        if (toText != null && toText.trim().length() > 0 && fromText != null && fromText.trim().length() > 0) {
            if (getTransformTypes().transformExists(fromText, toText)) {
                setWarningMessage("A transform already exists between these two types.");
            }
            // boolean isToInput = _typesUtil.isQNameInput(toText);
            // boolean isToOutput = _typesUtil.isQNameOutput(toText);
            // boolean isFromInput = _typesUtil.isQNameInput(fromText);
            // boolean isFromOutput = _typesUtil.isQNameOutput(fromText);
            // if (isToInput && !isFromInput) {
            // setErrorMessage("Both to and from must be input types. Please reselect a from type.");
            // } else if (!isToInput && isFromInput) {
            // setErrorMessage("Both to and from must be input types. Please reselect a to type.");
            // } else if (!isToOutput && isFromOutput) {
            // setErrorMessage("Both to and from must be output types. Please reselect a to type.");
            // } else if (isToOutput && !isFromOutput) {
            // setErrorMessage("Both to and from must be output types. Please reselect a from type.");
            // }
        }

        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        _panel.setLayout(gl);
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }
        _fromText = createLabelAndCombo(_panel, "From");
        _toText = createLabelAndCombo(_panel, "To");
    }

    private void updateToList(Control control) {
        final TransformTypesUtil typesUtil = getTransformTypes();
        boolean isInput = false;
        boolean isOutput = false;
        Combo opposite = null;
        if (control == _fromText) {
            String from = _fromText.getText().trim();
            isInput = typesUtil.isQNameInput(from);
            isOutput = typesUtil.isQNameOutput(from);
            opposite = _toText;
        }
        String[] types = null;
        try {
            if (isInput && isOutput) {
                types = typesUtil.getTypesAsStringsForConfig();
                if (getToObject() != null && opposite == _toText) {
                    types = typesUtil.getTypesAsStringsForEObjectConfig(getToObject());
                }
            } else if (isInput) {
                types = typesUtil.getInputTypesAsStringsForConfig();
                if (getToObject() != null && opposite == _toText) {
                    types = typesUtil.getInputTypesAsStringsForEObjectConfig(getToObject());
                }
            } else if (isOutput) {
                types = typesUtil.getOutputTypesAsStringsForConfig();
                if (getToObject() != null && opposite == _toText) {
                    types = typesUtil.getOutputTypesAsStringsForEObjectConfig(getToObject());
                }
            } else {
                types = new String[0];
            }
            if (opposite == _toText && !_ignoreListUpdate) {
                updateList(opposite, types);
            }
            // if (_typeMappings != null) {
            // String testToType = _typeMappings.get(_fromText.getText());
            // if (!_typeMappings.isEmpty() && testToType != null) {
            // System.out.println("Found opposite number: from " +
            // _fromText.getText() + ", to " + testToType);
            // for (int i =0; i< types.length; i++) {
            // if (types[i].equals(testToType)) {
            // _toText.select(i);
            // break;
            // }
            // }
            // }
            // }
            validate();
        } catch (Exception exception) {
            // ignore
            exception.fillInStackTrace();
            exception.printStackTrace();
        }
    }

    @Override
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @param page incoming wizard page
     */
    public void setWizardPage(WizardPage page) {
        this._page = page;
    }

    private void updateList(Combo list, String[] types) {
        if (list != null) {
            list.removeAll();
            for (int i = 0; i < types.length; i++) {
                list.add(types[i]);
            }
        }
        // because we cleared and reloaded the list of items, we must reset the
        // listeners
        addObservableListeners(true);
    }

    /**
     * @param transform incoming transform type
     */
    public void setTransform(TransformType transform) {
        final TransformTypesUtil typesUtil = getTransformTypes();
        setInUpdate(true);
        boolean autoSelectTo = false;
        boolean autoSelectFrom = false;
        _ignoreListUpdate = true;
        try {
            String[] fromtypes = null;
            String[] totypes = null;
            if (_page != null) {
                fromtypes = typesUtil.getTypesAsStringsForConfig();
                if (getFromObject() != null) {
                    fromtypes = typesUtil.getTypesAsStringsForEObjectConfig(getFromObject());
                }
                autoSelectFrom = false;
                totypes = typesUtil.getTypesAsStringsForConfig();
                if (getToObject() != null) {
                    totypes = typesUtil.getTypesAsStringsForEObjectConfig(getToObject());
                }
                autoSelectTo = false;
                if (getFromObject() != null && getToObject() != null) {
                    _typeMappings = typesUtil.createMappings(getFromObject(), getToObject());
                }
            }
            updateList(_fromText, fromtypes);
            updateList(_toText, totypes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this._transform = transform;
        setTextValue(_toText, transform.getTo());
        setTextValue(_fromText, transform.getFrom());
        setInUpdate(false);
        if (_toText.getText().trim().length() == 0 && _fromText.getText().trim().length() == 0) {
            try {
                if (typesUtil.isOnlyOneServiceOperation(getFromObject())
                        && typesUtil.isOnlyOneServiceOperation(getToObject()) && !_typeMappings.isEmpty()) {
                    setTextValue(_fromText, (String) _typeMappings.keySet().toArray()[0]);
                    setTextValue(_toText, (String) _typeMappings.get(_fromText.getText()));
                }
            } catch (Exception e) {
                // ignore
                e.fillInStackTrace();
            }
        }
        if (_toText != null && !_toText.isDisposed()) {
            if (_toText.getText().trim().length() == 0 && autoSelectTo) {
                _toText.select(0);
                handleModify(_toText);
            }
        }
        if (_fromText != null && !_fromText.isDisposed()) {
            if (_fromText.getText().trim().length() == 0 && autoSelectFrom) {
                _fromText.select(0);
                handleModify(_fromText);
            }
        }
        _ignoreListUpdate = false;
        validate();
    }

    /**
     * @return outgoing transform type
     */
    public TransformType getTransform() {
        return this._transform;
    }

    protected void handleModify(Control control) {
        if (control.equals(_toText)) {
            updateFeature(_transform, "to", _toText.getText().trim());
            // updateListsModifyListener(control);
        } else if (control.equals(_fromText)) {
            updateFeature(_transform, "from", _fromText.getText().trim());
            updateToList(control);
        }
        validate();
    }

    protected void handleUndo(Control control) {
        setInUpdate(true);
        if (_transform != null) {
            if (control.equals(_fromText)) {
                _fromText.setText(this._transform.getFrom());
            } else if (control.equals(_toText)) {
                _toText.setText(this._transform.getTo());
            }
        }
        setInUpdate(false);
    }

    protected void wrapOperation(final List<ModelOperation> ops) {
        wrapOperation(this._transform, ops);
    }

    protected void updateFeature(EObject eObject, String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new BasicEObjectOperation(eObject, featureId, value));
        wrapOperation(ops);
    }

    protected String getWarningMessage() {
        return _warningMessage;
    }

    protected void setWarningMessage(String warningMessage) {
        this._warningMessage = warningMessage;
    }

    protected IType canFindClass(String classname) throws JavaModelException {
        IProject project = null;
        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
                .getSelection();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        if (selection instanceof IStructuredSelection) {
            selectionToPass = (IStructuredSelection) selection;
            if (selectionToPass.getFirstElement() instanceof IFile) {
                project = ((IFile) selectionToPass.getFirstElement()).getProject();
            } else {
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

    protected IPackageFragment canFindPackage(String packagename) throws JavaModelException {
        IProject project = null;
        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
                .getSelection();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        if (selection instanceof IStructuredSelection) {
            selectionToPass = (IStructuredSelection) selection;
            if (selectionToPass.getFirstElement() instanceof IFile) {
                project = ((IFile) selectionToPass.getFirstElement()).getProject();
            } else {
                project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
            }
        }
        if (selectionToPass == StructuredSelection.EMPTY) {
            project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
        }
        if (project != null && packagename != null) { //$NON-NLS-1$
            IJavaProject javaProject = JavaCore.create(project);
            String packageNameForPath = packagename.replace('.', '/');
            IPath packagePath = new Path(packageNameForPath);
            IJavaElement javaEl = javaProject.findElement(packagePath);
            if (javaEl != null && javaEl instanceof IPackageFragment) {
                return (IPackageFragment) javaEl;
            }
        }
        return null;
    }

    protected void handleOpenJavaClass(IType classToOpen) {
        if (classToOpen != null) {
            try {
                JavaUI.openInEditor(classToOpen);
            } catch (PartInitException e) {
                e.printStackTrace();
            } catch (JavaModelException e) {
                e.printStackTrace();
            }
        }
        setInUpdate(false);
    }

    protected String handleCreateJavaClass(String className, String interfaceName) throws JavaModelException {
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
     * @return get the TO object
     */
    public EObject getToObject() {
        return _toObject;
    }

    /**
     * @param toObject set the TO object
     */
    public void setToObject(EObject toObject) {
        this._toObject = toObject;
    }

    /**
     * @return get the FROM object
     */
    public EObject getFromObject() {
        return _fromObject;
    }

    /**
     * @param fromObject set the FROM object
     */
    public void setFromObject(EObject fromObject) {
        this._fromObject = fromObject;
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    protected TransformTypesUtil getTransformTypes() {
        return ((AddTransformWizard) _page.getWizard()).getTransformTypes();
    }
}
