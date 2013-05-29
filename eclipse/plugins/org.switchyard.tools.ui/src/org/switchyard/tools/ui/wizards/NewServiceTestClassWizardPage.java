/*************************************************************************************
 * Copyright (c) 2011 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.wizards;

import static org.switchyard.tools.ui.M2EUtils.getSwitchYardOutputFile;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.xml.XMLConstants;
import javax.xml.namespace.QName;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.BindingKey;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.ChildListPropertyDescriptor;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.StructuralPropertyDescriptor;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.internal.core.CreateElementInCUOperation;
import org.eclipse.jdt.internal.ui.dialogs.StatusInfo;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.ComboDialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IDialogFieldListener;
import org.eclipse.jdt.ui.CodeGeneration;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.MavenProjectUtils;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.switchyard.config.model.composite.ComponentServiceModel;
import org.switchyard.config.model.composite.InterfaceModel;
import org.switchyard.metadata.ServiceInterface;
import org.switchyard.metadata.ServiceOperation;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.ISwitchYardTestMixInExtension;
import org.switchyard.tools.ui.common.InterfaceControl;
import org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager;
import org.switchyard.tools.ui.common.SwitchYardTestMixInExtensionManager;
import org.switchyard.tools.ui.explorer.ISwitchYardNode;
import org.switchyard.tools.ui.explorer.impl.ComponentService;

/**
 * NewServiceTestClassWizardPage
 * 
 * Create a new service test implementation.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class NewServiceTestClassWizardPage extends NewTypeWizardPage {

    private static final String SERVICE_INTERFACE = "SERVICE_INTERFACE";

    private ComboDialogField _serviceDialogField;
    private InterfaceControl _interfaceControl;
    private StatusInfo _serviceInterfaceStatus;
    private StatusInfo _rootStatus;
    private Map<String, Contract> _configuredServices;
    private Map<File, Map<String, Contract>> _servicesCache = new HashMap<File, Map<String, Contract>>();
    private Set<Resource> _loadedResources = new HashSet<Resource>();
    private IMavenProjectFacade _mavenProjectFacade;
    private IProject _project;
    private String _oldTypeName;
    private CheckboxTableViewer _componentsTable;
    private Object[] _checkedMixins = new Object[0];

    /**
     * Create a new NewServiceTestClassWizardPage.
     */
    public NewServiceTestClassWizardPage() {
        super(true, NewServiceTestClassWizardPage.class.getSimpleName());

        setTitle("New Service Test Class");
        setDescription("Create a new service test class.");

        _serviceDialogField = new ComboDialogField(SWT.DROP_DOWN | SWT.READ_ONLY);
        _serviceDialogField.setDialogFieldListener(new IDialogFieldListener() {
            @Override
            public void dialogFieldChanged(DialogField field) {
                handleFieldChanged(SERVICE_INTERFACE);
            }
        });
        _serviceDialogField.setLabelText("Service:");
        _interfaceControl = new InterfaceControl(getJavaProject());
    }

    /**
     * @param selection the current selection
     */
    public void init(IStructuredSelection selection) {
        IJavaElement elem = getInitialJavaElement(selection);
        ICompilationUnit cu = elem == null ? null : (ICompilationUnit) elem.getAncestor(IJavaElement.COMPILATION_UNIT);
        if (cu != null) {
            elem = cu.findPrimaryType();
        }
        initContainerPage(getInitialContainerElement(selection, elem));
        initTypePage(elem);
        // clear out super types
        setSuperClass("", true);
        setSuperInterfaces(Collections.<String> emptyList(), true);
        setModifiers(Flags.AccPublic, false);
        if (getTypeName().length() == 0) {
            String simpleServiceInterfaceName = getSimpleServiceInterfaceName();
            if (simpleServiceInterfaceName.length() > 0) {
                _oldTypeName = createDefaultClassName();
                setTypeName(_oldTypeName, true);
            }
        }
        if (_mavenProjectFacade != null) {
            IPath[] testSourcePaths = _mavenProjectFacade.getTestCompileSourceLocations();
            if (testSourcePaths != null && testSourcePaths.length > 0) {
                setPackageFragmentRoot(getJavaProject().getPackageFragmentRoot(_project.getFolder(testSourcePaths[0])),
                        true);
            }
        }
        setSuperInterfaces(Collections.<String> emptyList(), false);
        doStatusUpdate();
    }

    @Override
    public void createControl(Composite parent) {
        initializeDialogUnits(parent);

        Composite composite = new Composite(parent, SWT.NONE);
        composite.setFont(parent.getFont());

        int nColumns = 4;

        GridLayout layout = new GridLayout();
        layout.numColumns = nColumns;
        composite.setLayout(layout);

        // pick & choose the wanted UI components

        createContainerControls(composite, nColumns);
        createPackageControls(composite, nColumns);

        createSeparator(composite, nColumns);

        createTypeNameControls(composite, nColumns);

        createSeparator(composite, nColumns);

        createServiceInterfaceControls(composite, nColumns);

        createSeparator(composite, nColumns);

        createMixInsTable(composite, nColumns);

        createSeparator(composite, nColumns);

        createModifierControls(composite, nColumns);

        createSeparator(composite, nColumns);

        createCommentControls(composite, nColumns);
        enableCommentControl(true);

        setControl(composite);

        Dialog.applyDialogFont(composite);
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            setFocus();
        }
    }

    /**
     * Set the service contract.
     * 
     * @param serviceContract the service contract.
     * @param canBeModified true if the user can modify the value.
     */
    public void setServiceContract(Contract serviceContract, boolean canBeModified) {
        if (canBeModified) {
            if (!_serviceDialogField.isEnabled()) {
                // if we're going from disabled to enabled, make sure the
                // current list is loaded.
                loadConfiguredServices();
                if (_configuredServices.size() == 0 && serviceContract.getName() != null) {
                    _configuredServices = Collections.singletonMap(serviceContract.getName(), serviceContract);
                }
                updateServicesList();
            }
        } else {
            if (serviceContract.getName() != null) {
                _configuredServices = Collections.singletonMap(serviceContract.getName(), serviceContract);
            } else {
                _configuredServices = Collections.emptyMap();
            }
            _serviceDialogField.setEnabled(false);
            updateServicesList();
        }
        _serviceDialogField.selectItem(serviceContract.getName());
    }

    @Override
    public void dispose() {
        super.dispose();

        _configuredServices = Collections.emptyMap();
        for (Map<String, Contract> configuredServices : _servicesCache.values()) {
            configuredServices.clear();
        }
        _servicesCache.clear();
        for (Resource resource : _loadedResources) {
            resource.unload();
        }
        _loadedResources.clear();
    }

    @Override
    protected IJavaElement getInitialJavaElement(IStructuredSelection selection) {
        if (selection != null && !selection.isEmpty() && selection.getFirstElement() instanceof ISwitchYardNode) {
            if (selection.getFirstElement() instanceof ComponentService) {
                ComponentService componentService = (ComponentService) selection.getFirstElement();
                ComponentServiceModel service = (ComponentServiceModel) componentService.getModel();
                if (service.getInterface() != null && InterfaceModel.JAVA.equals(service.getInterface().getType())) {
                    IResource javaInterface = SwitchYardModelUtils.getAssociatedResource(componentService.getRoot()
                            .getProject(), service.getInterface());
                    if (javaInterface != null) {
                        return super.getInitialJavaElement(new StructuredSelection(javaInterface));
                    }
                }
            }
            return JavaUtil.getInitialJavaElementForResource(((ISwitchYardNode) selection.getFirstElement()).getRoot()
                    .getProject());
        }
        return super.getInitialJavaElement(selection);
    }

    private IJavaElement getInitialContainerElement(IStructuredSelection selection, IJavaElement initialElement) {
        if (selection != null && !selection.isEmpty() && selection.getFirstElement() instanceof ISwitchYardNode) {
            ISwitchYardNode switchYardNode = (ISwitchYardNode) selection.getFirstElement();
            if (initialElement == null || initialElement.getJavaProject() == null
                    || !initialElement.getJavaProject().getProject().equals(switchYardNode.getRoot().getProject())) {
                return JavaCore.create(switchYardNode.getRoot().getProject());
            }
        }
        return initialElement;
    }

    @Override
    protected void createTypeMembers(IType type, ImportsManager imports, IProgressMonitor monitor) throws CoreException {
        addTypeAnnotations(type, imports, monitor);

        String lineDelimiter = getJavaProject().getJavaModel().findRecommendedLineSeparator();
        type.createField("private " + imports.addImport("org.switchyard.test.SwitchYardTestKit") + " testKit;", null,
                false, new SubProgressMonitor(monitor, 1));
        for (String mixin : getSelectedMixinClasses()) {
            type.createField("private " + imports.addImport(mixin) + " " + getFieldNameForType(mixin) + ";", null,
                    false, new SubProgressMonitor(monitor, 1));
        }
        type.createField(
                "@" + imports.addImport("org.switchyard.test.ServiceOperation") + "(\""
                        + getSimpleServiceInterfaceName() + "\")" + lineDelimiter + "private "
                        + imports.addImport("org.switchyard.test.Invoker") + " service;", null, false,
                new SubProgressMonitor(monitor, 1));

        ServiceInterface serviceTypeBinding = resolveServiceType();
        if (serviceTypeBinding == null) {
            return;
        }

        createTestMethodsForType(type, serviceTypeBinding, type.getCompilationUnit(), imports, lineDelimiter, monitor);

        if (monitor != null) {
            monitor.done();
        }
    }

    private String getFieldNameForType(String mixin) {
        final int lastDot = mixin.lastIndexOf('.');
        StringBuffer simpleName = new StringBuffer();
        if (lastDot > 0) {
            simpleName.append(mixin.substring(lastDot + 1));
        } else {
            simpleName.append(mixin);
        }
        for (int lastUpper = 0, nextUpper = 1, length = simpleName.length(); lastUpper < length
                && Character.isUpperCase(simpleName.charAt(lastUpper))
                && (nextUpper == length || Character.isUpperCase(simpleName.charAt(nextUpper))); lastUpper++, nextUpper++) {
            simpleName.setCharAt(lastUpper, Character.toLowerCase(simpleName.charAt(lastUpper)));
        }
        return simpleName.toString();
    }

    private void addTypeAnnotations(IType type, ImportsManager imports, IProgressMonitor monitor)
            throws JavaModelException {
        new CreateSwitchYardTestAnnotationOperation(type, imports).runOperation(monitor);
        new CreateRunWithAnnotationOperation(type, imports).runOperation(monitor);
    }

    private void createTestMethodsForType(IType type, ServiceInterface interfaceType, ICompilationUnit cu,
            ImportsManager imports, String lineDelimiter, IProgressMonitor monitor) throws CoreException {
        String typeName = type.getFullyQualifiedName();
        for (ServiceOperation method : interfaceType.getOperations()) {
            if (method.getOutputType() == null || "void".equals(method.getOutputType())) {
                type.createMethod(createInOnlyTestMethodContents(method, typeName, cu, imports, lineDelimiter), null,
                        false, new SubProgressMonitor(monitor, 1));
            } else {
                type.createMethod(createInOutTestMethodContents(method, typeName, cu, imports, lineDelimiter), null,
                        false, new SubProgressMonitor(monitor, 1));
            }
        }
    }

    private String getTestMethodName(String name) {
        // ESB interfaces only have a single, unnamed "process" method
        return "test"
                + (name == null || name.length() == 0 ? "Process" : name.substring(0, 1).toUpperCase()
                        + name.substring(1));
    }

    private StringBuffer getTestMethodPreface(String testMethodName, ImportsManager imports, String lineDelimiter) {
        StringBuffer sb = new StringBuffer();
        sb.append("@").append(imports.addImport("org.junit.Test")).append(lineDelimiter);
        sb.append("public void ").append(testMethodName).append("() throws Exception {").append(lineDelimiter);
        return sb;
    }

    private String createInOutTestMethodContents(ServiceOperation method, String typeName, ICompilationUnit cu,
            ImportsManager imports, String lineDelimiter) {
        String methodName = method.getName();
        String testMethodName = getTestMethodName(methodName);
        BindingKey returnTypeBinding = getBindingForQName(method.getOutputType());
        String resultType;
        String contentCastType;

        StringBuffer body = getBodyStart(method, imports, lineDelimiter);
        if (returnTypeBinding.isParameterizedType()) {
            String signature = returnTypeBinding.toSignature();
            resultType = imports.addImport(Signature.toString(signature));
            for (String parameterType : returnTypeBinding.getTypeArguments()) {
                imports.addImport(Signature.toString(parameterType));
            }
            contentCastType = imports.addImport(Signature.toString(Signature.getTypeErasure(signature)));
            body.append("@SuppressWarnings(\"unchecked\")").append(lineDelimiter);
        } else {
            resultType = imports.addImport(Signature.toString(returnTypeBinding.toSignature()));
            contentCastType = resultType;
        }
        body.append(resultType).append(" result = service.operation(\"").append(methodName)
                .append("\").sendInOut(message).getContent(").append(contentCastType).append(".class);")
                .append(lineDelimiter).append(lineDelimiter);
        body.append(getBodyEnd(imports, lineDelimiter));

        StringBuffer sb = getTestMethodPreface(testMethodName, imports, lineDelimiter);
        try {
            sb.append(CodeGeneration.getMethodBodyContent(cu, typeName, testMethodName, false, body.toString(),
                    lineDelimiter));
        } catch (CoreException e) {
            sb.append(body);
        }
        sb.append("}");
        return sb.toString();
    }

    private String createInOnlyTestMethodContents(ServiceOperation method, String typeName, ICompilationUnit cu,
            ImportsManager imports, String lineDelimiter) {
        String methodName = method.getName();
        String testMethodName = getTestMethodName(methodName);

        StringBuffer body = getBodyStart(method, imports, lineDelimiter);
        body.append("service.operation(\"").append(methodName).append("\").sendInOnly(message);").append(lineDelimiter)
                .append(lineDelimiter);
        body.append(getBodyEnd(imports, lineDelimiter));

        StringBuffer sb = getTestMethodPreface(testMethodName, imports, lineDelimiter);
        try {
            sb.append(CodeGeneration.getMethodBodyContent(cu, typeName, testMethodName, false, body.toString(),
                    lineDelimiter));
        } catch (CoreException e) {
            sb.append(body);
        }
        sb.append("}");
        return sb.toString();
    }

    private StringBuffer getBodyStart(ServiceOperation method, ImportsManager imports, String lineDelimiter) {
        BindingKey parameterType = getBindingForQName(method.getInputType());
        StringBuffer sb = new StringBuffer();
        sb.append("// initialize your test message").append(lineDelimiter);
        sb.append(parameterType == null ? "Object" : imports.addImport(Signature.toString(parameterType.toSignature())))
                .append(" message = null;").append(lineDelimiter);
        return sb;
    }

    private StringBuffer getBodyEnd(ImportsManager imports, String lineDelimiter) {
        StringBuffer sb = new StringBuffer();
        sb.append("// validate the results").append(lineDelimiter);
        sb.append(imports.addImport("org.junit.Assert")).append(".assertTrue(\"Implement me\", false);")
                .append(lineDelimiter);
        return sb;
    }

    private BindingKey getBindingForQName(QName typeName) {
        if (typeName == null) {
            return null;
        }
        String typeString = Object.class.getCanonicalName();
        if (typeName.getNamespaceURI() == XMLConstants.NULL_NS_URI && typeName.getLocalPart() != null
                && typeName.getLocalPart().startsWith("java:")) {
            typeString = typeName.getLocalPart().substring(5);
        }
        return new BindingKey(BindingKey.createTypeBindingKey(typeString));
    }

    @Override
    protected void handleFieldChanged(String fieldName) {
        super.handleFieldChanged(fieldName);

        if (fieldName == CONTAINER) {
            checkPackageRoot();
        } else if (fieldName == SERVICE_INTERFACE) {
            serviceInterfaceChanged();
        }
        doStatusUpdate();
    }

    private void checkPackageRoot() {
        _rootStatus = new StatusInfo();
        IPackageFragmentRoot root = getPackageFragmentRoot();
        if (root == null || _mavenProjectFacade == null) {
            return;
        }
        if (!Arrays.asList(_mavenProjectFacade.getTestCompileSourceLocations()).contains(root.getPath())) {
            _rootStatus.setWarning("Source folder is not configured for test source.");
        }
    }

    @Override
    protected IStatus containerChanged() {
        IJavaProject newProject = getJavaProject();
        if (_project == null) {
            if (newProject != null) {
                _project = newProject.getProject();
                updateMavenProjectFacade();
                loadConfiguredServices();
                updateServicesList();
            }
        } else if (newProject == null) {
            _project = null;
            _configuredServices = Collections.emptyMap();
            updateMavenProjectFacade();
            updateServicesList();
        } else if (!_project.equals(newProject.getProject())) {
            _project = newProject.getProject();
            updateMavenProjectFacade();
            loadConfiguredServices();
            updateServicesList();
        }
        return super.containerChanged();
    }

    @Override
    protected IStatus typeNameChanged() {
        IStatus status = super.typeNameChanged();
        if (status.isOK()) {
            if (!getTypeName().endsWith("Test")) {
                return new StatusInfo(StatusInfo.ERROR, "Class name must end with \"Test\"");
            }
        }
        return status;
    }

    private void updateMavenProjectFacade() {
        if (_project == null) {
            _mavenProjectFacade = null;
            return;
        }
        _mavenProjectFacade = MavenPlugin.getMavenProjectRegistry().create(_project, new NullProgressMonitor());
    }

    private void updateServicesList() {
        Set<String> services = _configuredServices.keySet();
        String serviceInterfaceName = getSimpleServiceInterfaceName();
        _serviceDialogField.setItems(services.toArray(new String[services.size()]));
        if (serviceInterfaceName != null && serviceInterfaceName.length() > 0) {
            _serviceDialogField.selectItem(serviceInterfaceName);
        } else if (_serviceDialogField.getSelectionIndex() < 0 && services.size() > 0) {
            _serviceDialogField.selectItem(0);
        }
    }

    private void loadConfiguredServices() {
        if (!_serviceDialogField.isEnabled()) {
            // don't reload if the user can't modify
            return;
        }
        _configuredServices = Collections.emptyMap();
        if (_mavenProjectFacade == null) {
            return;
        }
        File switchYardOutputFile;
        try {
            switchYardOutputFile = getSwitchYardOutputFile(_mavenProjectFacade
                    .getMavenProject(new NullProgressMonitor()));
        } catch (CoreException e) {
            switchYardOutputFile = null;
        }
        if (switchYardOutputFile == null) {
            return;
        }
        if (_servicesCache.containsKey(switchYardOutputFile)) {
            _configuredServices = _servicesCache.get(switchYardOutputFile);
            return;
        }

        Resource resource = null;
        try {
            ResourceSet rs = new ResourceSetImpl();
            rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new SwitchyardResourceFactoryImpl());
            try {
                resource = rs.getResource(URI.createPlatformResourceURI(
                        MavenProjectUtils.getFullPath(_mavenProjectFacade.getProject(), switchYardOutputFile)
                                .toString(), true), true);
            } catch (Exception e) {
                e.fillInStackTrace();
            }
            if (resource == null || resource.getContents().size() == 0
                    || !(resource.getContents().get(0) instanceof DocumentRoot)) {
                return;
            }
            DocumentRoot document = (DocumentRoot) resource.getContents().get(0);
            SwitchYardType switchYard = document.getSwitchyard();
            org.eclipse.soa.sca.sca1_1.model.sca.Composite composite = switchYard.getComposite();
            if (composite == null) {
                return;
            }
            // TreeMap gets us a sorted list when using values() or keys().
            _configuredServices = new TreeMap<String, Contract>();
            // services first. any like-named component services will overwrite
            for (Contract contract : composite.getService()) {
                if (contract.getName() != null) {
                    _configuredServices.put(contract.getName(), contract);
                }
            }
            for (Component component : composite.getComponent()) {
                for (Contract contract : component.getService()) {
                    if (contract.getName() != null) {
                        _configuredServices.put(contract.getName(), contract);
                    }
                }
            }
            // allow the user to deselect services
            _configuredServices.put("", null);
        } finally {
            _servicesCache.put(switchYardOutputFile, _configuredServices);
            if (resource != null) {
                _loadedResources.add(resource);
            }
        }
    }

    private void doStatusUpdate() {
        // status of all used components
        IStatus[] status = new IStatus[] {fContainerStatus, fPackageStatus, fTypeNameStatus, fModifierStatus,
                fSuperClassStatus, fSuperInterfacesStatus, _serviceInterfaceStatus };

        updateStatus(status);
    }

    private Contract getServiceContract() {
        String serviceName = getSimpleServiceInterfaceName();
        if (serviceName == null || serviceName.length() == 0 || !_configuredServices.containsKey(serviceName)) {
            return null;
        }
        return _configuredServices.get(serviceName);
    }

    private String getSimpleServiceInterfaceName() {
        int selection = _serviceDialogField.getSelectionIndex();
        String[] items = _serviceDialogField.getItems();
        if (selection < 0 || selection > items.length) {
            return "";
        }
        return items[selection];
    }

    private void createServiceInterfaceControls(Composite composite, int nColumns) {
        _serviceDialogField.doFillIntoGrid(composite, nColumns);
        _interfaceControl.createControl(composite, nColumns);
        _interfaceControl.setEnabled(false);
        serviceInterfaceChanged();
    }

    private void serviceInterfaceChanged() {
        _serviceInterfaceStatus = new StatusInfo();
        IPackageFragmentRoot root = getPackageFragmentRoot();
        _serviceDialogField.setEnabled(root != null);

        Contract contract = getServiceContract();
        if (contract == null) {
            _serviceInterfaceStatus.setWarning("No service is specified. A simple stub class will be created.");
        } else if (contract.getInterface() == null) {
            _serviceInterfaceStatus.setError("Selected service does not define any interface.");
        }
        _interfaceControl.init(contract == null ? null : contract.getInterface(), null);

        String newName = createDefaultClassName();
        if (updateDefault(_oldTypeName, newName, getTypeName())) {
            setTypeName(newName, true);
        }
        _oldTypeName = newName;
    }

    private String createDefaultClassName() {
        String serviceName = getSimpleServiceInterfaceName();
        if (serviceName == null) {
            return "";
        }
        return serviceName + "Test";
    }

    private ServiceInterface resolveServiceType() throws CoreException {
        final Contract contract = getServiceContract();
        if (contract == null || contract.getInterface() == null) {
            return null;
        }
        try {
            final ClassLoader oldTCCL = Thread.currentThread().getContextClassLoader();
            final ClassLoader classLoader = JavaUtil.getProjectClassLoader(getJavaProject(), null);
            Thread.currentThread().setContextClassLoader(classLoader);
            try {
                return SwitchYardModelUtils.getServiceInterface(contract.getInterface());
            } finally {
                Thread.currentThread().setContextClassLoader(oldTCCL);
            }
        } catch (Exception e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error resolving service interface.",
                    e));
        }
    }

    private boolean updateDefault(String oldValue, String newValue, String currentValue) {
        return currentValue == null
                || currentValue.length() == 0
                || (!currentValue.equals(newValue) && (oldValue == null || oldValue.length() == 0 || oldValue
                        .equals(currentValue)));
    }

    private void createMixInsTable(Composite parent, int nColumns) {
        Label label = new Label(parent, SWT.NONE);
        label.setText("Test Mix-ins:");
        label.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, false, false));

        _componentsTable = CheckboxTableViewer.newCheckList(parent, SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL
                | SWT.V_SCROLL);
        _componentsTable.setLabelProvider(new MixInsLabelProvider());
        _componentsTable.setContentProvider(ArrayContentProvider.getInstance());
        _componentsTable.getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, nColumns - 2, 1));
        _componentsTable.setComparator(new ViewerSorter());
        ColumnViewerToolTipSupport.enableFor(_componentsTable, ToolTip.NO_RECREATE);
        TableLayout layout = new TableLayout();
        _componentsTable.getTable().setLayout(layout);
        TableViewerColumn column = new TableViewerColumn(_componentsTable, SWT.LEFT);
        layout.addColumnData(new ColumnWeightData(100));
        column.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof ISwitchYardTestMixInExtension) {
                    return ((ISwitchYardTestMixInExtension) element).getName();
                }
                return super.getText(element);
            }

            @Override
            public String getToolTipText(Object element) {
                if (element instanceof ISwitchYardTestMixInExtension) {
                    final ISwitchYardTestMixInExtension extension = (ISwitchYardTestMixInExtension) element;
                    if (extension.getDescription() == null) {
                        if (extension.getMixInClass() == null) {
                            return extension.getName();
                        }
                        return extension.getMixInClass();
                    }
                    return extension.getDescription();
                }
                return super.getToolTipText(element);
            }
        });
        _componentsTable.addCheckStateListener(new ICheckStateListener() {
            @Override
            public void checkStateChanged(CheckStateChangedEvent event) {
                _checkedMixins = _componentsTable.getCheckedElements();
            }
        });
        _componentsTable.setInput(SwitchYardTestMixInExtensionManager.instance().getExtensions());
        // spacer
        new Label(parent, SWT.NONE);
    }

    private Collection<String> getSelectedMixinClasses() {
        final Collection<String> mixins = new LinkedHashSet<String>();
        // always add CDI mixin
        mixins.add("org.switchyard.component.test.mixins.cdi.CDIMixIn");
        for (Object o : _checkedMixins) {
            final String mixin = ((ISwitchYardTestMixInExtension) o).getMixInClass();
            if (mixin != null) {
                mixins.add(mixin);
            }
        }
        return mixins;
    }

    private final static class MixInsLabelProvider extends LabelProvider {
        public String getText(Object element) {
            if (element instanceof ISwitchYardTestMixInExtension) {
                return ((ISwitchYardTestMixInExtension) element).getName();
            }
            return super.getText(element);
        }
    }

    private final static class CreateRunWithAnnotationOperation extends CreateElementInCUOperation {

        private final ImportsManager _imports;

        private CreateRunWithAnnotationOperation(IType type, ImportsManager imports) {
            super(type);
            _imports = imports;
        }

        @Override
        protected StructuralPropertyDescriptor getChildPropertyDescriptor(ASTNode parent) {
            return TypeDeclaration.MODIFIERS2_PROPERTY;
        }

        @Override
        protected ASTNode generateElementAST(ASTRewrite rewriter, ICompilationUnit cu) throws JavaModelException {
            final AST ast = cuAST.getAST();
            final SingleMemberAnnotation annotation = ast.newSingleMemberAnnotation();
            final TypeLiteral value = ast.newTypeLiteral();
            value.setType(ast.newSimpleType(createTypeName(ast, "org.switchyard.test.SwitchYardRunner")));
            annotation.setTypeName(createTypeName(ast, "org.junit.runner.RunWith"));
            annotation.setValue(value);
            return annotation;
        }

        @Override
        protected IJavaElement generateResultHandle() {
            return getType().getAnnotation(_imports.addImport("org.junit.runner.RunWith"));
        }

        @Override
        public String getMainTaskName() {
            return "Creating annotation";
        }

        @Override
        protected void insertASTNode(ASTRewrite rewriter, ASTNode parent, ASTNode child) throws JavaModelException {
            final ChildListPropertyDescriptor childListPropertyDescriptor = (ChildListPropertyDescriptor) getChildPropertyDescriptor(parent);
            rewriter.getListRewrite(parent, childListPropertyDescriptor).insertFirst(child, null);
        }

        private IType getType() {
            return (IType) getParentElement();
        }

        private Name createTypeName(final AST ast, final String qualifiedName) {
            final String simpleName = _imports.addImport(qualifiedName);
            if (simpleName.equals(qualifiedName)) {
                return ast.newName(qualifiedName);
            }
            return ast.newSimpleName(simpleName);
        }
    }

    private final class CreateSwitchYardTestAnnotationOperation extends CreateElementInCUOperation {

        private final ImportsManager _imports;

        private CreateSwitchYardTestAnnotationOperation(IType type, ImportsManager imports) {
            super(type);
            _imports = imports;
        }

        @Override
        protected StructuralPropertyDescriptor getChildPropertyDescriptor(ASTNode parent) {
            return TypeDeclaration.MODIFIERS2_PROPERTY;
        }

        @Override
        @SuppressWarnings("unchecked")
        protected ASTNode generateElementAST(ASTRewrite rewriter, ICompilationUnit cu) throws JavaModelException {
            final AST ast = cuAST.getAST();
            final NormalAnnotation annotation = ast.newNormalAnnotation();
            annotation.setTypeName(createTypeName(ast, "org.switchyard.test.SwitchYardTestCaseConfig"));
            annotation.values().add(createConfigValue(ast));
            annotation.values().add(createMixInsValue(ast));
            return annotation;
        }

        private Object createConfigValue(AST ast) {
            final MemberValuePair pair = ast.newMemberValuePair();
            final Name value = ast.newQualifiedName(
                    createTypeName(ast, "org.switchyard.test.SwitchYardTestCaseConfig"),
                    ast.newSimpleName("SWITCHYARD_XML"));
            pair.setName(ast.newSimpleName("config"));
            pair.setValue(value);
            return pair;
        }

        @SuppressWarnings("unchecked")
        private Object createMixInsValue(AST ast) {
            final MemberValuePair pair = ast.newMemberValuePair();
            final ArrayInitializer value = ast.newArrayInitializer();
            pair.setName(ast.newSimpleName("mixins"));
            for (String mixin : getSelectedMixinClasses()) {
                final TypeLiteral mixinType = ast.newTypeLiteral();
                mixinType.setType(ast.newSimpleType(createTypeName(ast, mixin)));
                value.expressions().add(mixinType);
            }
            pair.setValue(value);
            return pair;
        }

        @Override
        protected IJavaElement generateResultHandle() {
            return getType().getAnnotation(_imports.addImport("org.switchyard.test.SwitchYardTestCaseConfig"));
        }

        @Override
        public String getMainTaskName() {
            return "Creating annotation";
        }

        @Override
        protected void insertASTNode(ASTRewrite rewriter, ASTNode parent, ASTNode child) throws JavaModelException {
            final ChildListPropertyDescriptor childListPropertyDescriptor = (ChildListPropertyDescriptor) getChildPropertyDescriptor(parent);
            rewriter.getListRewrite(parent, childListPropertyDescriptor).insertFirst(child, null);
        }

        private IType getType() {
            return (IType) getParentElement();
        }

        private Name createTypeName(final AST ast, final String qualifiedName) {
            final String simpleName = _imports.addImport(qualifiedName);
            if (simpleName.equals(qualifiedName)) {
                return ast.newName(qualifiedName);
            }
            return ast.newSimpleName(simpleName);
        }
    }

    /**
     * @return list of required components
     */
    public Collection<ISwitchYardComponentExtension> getSelectedMixInComponents() {
        final Collection<ISwitchYardComponentExtension> retValue = new LinkedHashSet<ISwitchYardComponentExtension>();
        // always included; provides CDI mixin
        retValue.add(SwitchYardComponentExtensionManager.instance().getRuntimeComponentExtension());
        for (Object o : _checkedMixins) {
            ISwitchYardComponentExtension component = ((ISwitchYardTestMixInExtension) o).getRequiredComponent();
            if (component != null) {
                retValue.add(component);
            }
        }
        return retValue;
    }

}
