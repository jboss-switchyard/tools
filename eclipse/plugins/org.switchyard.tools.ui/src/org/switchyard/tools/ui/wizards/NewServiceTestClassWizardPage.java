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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
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
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.internal.ui.dialogs.StatusInfo;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.ComboDialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IDialogFieldListener;
import org.eclipse.jdt.ui.CodeGeneration;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.MavenProjectUtils;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
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
import org.switchyard.tools.ui.common.InterfaceControl;
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
    protected String constructCUContent(ICompilationUnit cu, String typeContent, String lineDelimiter)
            throws CoreException {
        // add annotations to the basic type.
        return super.constructCUContent(cu, "@RunWith(SwitchYardRunner.class)" + lineDelimiter
                + "@SwitchYardTestCaseConfig(mixins=CDIMixIn.class, config=SwitchYardTestCaseConfig.SWITCHYARD_XML)"
                + lineDelimiter + typeContent, lineDelimiter);
    }

    @Override
    protected void createTypeMembers(IType type, ImportsManager imports, IProgressMonitor monitor) throws CoreException {
        // add imports
        imports.addImport("org.junit.Assert");
        imports.addImport("org.junit.Test");
        imports.addImport("org.junit.runner.RunWith");
        imports.addImport("org.switchyard.test.Invoker");
        imports.addImport("org.switchyard.test.ServiceOperation");
        imports.addImport("org.switchyard.test.SwitchYardRunner");
        imports.addImport("org.switchyard.test.SwitchYardTestCaseConfig");
        imports.addImport("org.switchyard.test.mixins.CDIMixIn");

        String lineDelimiter = getJavaProject().getJavaModel().findRecommendedLineSeparator();
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
        return "test" + name.substring(0, 1).toUpperCase() + name.substring(1);
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
            resource = rs.getResource(URI.createPlatformResourceURI(
                    MavenProjectUtils.getFullPath(_mavenProjectFacade.getProject(), switchYardOutputFile).toString(),
                    true), true);
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
            _serviceInterfaceStatus.setError("A service must be specified.");
        } else if (contract.getInterface() == null) {
            _serviceInterfaceStatus.setError("Selected service does not define any interface.");
        }
        _interfaceControl.init(contract == null ? null : contract.getInterface());

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

}
