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
package org.switchyard.tools.ui.validation;

import static org.switchyard.tools.ui.validation.ValidationProblem.CamelImplementationIncomplete;
import static org.switchyard.tools.ui.validation.ValidationProblem.CamelJavaUnresolvableClass;
import static org.switchyard.tools.ui.validation.ValidationProblem.CamelJavaUnspecifiedClass;
import static org.switchyard.tools.ui.validation.ValidationProblem.CamelJavaWrongSuperclass;
import static org.switchyard.tools.ui.validation.ValidationProblem.CamelRouteMoreThanOneFromFound;
import static org.switchyard.tools.ui.validation.ValidationProblem.CamelRouteOperationNotFoundAsReference;
import static org.switchyard.tools.ui.validation.ValidationProblem.CamelRouteOperationNotFoundAsService;
import static org.switchyard.tools.ui.validation.ValidationProblem.CamelRouteOperationRequiredNotSpecified;
import static org.switchyard.tools.ui.validation.ValidationProblem.CamelRouteURIInvalid;
import static org.switchyard.tools.ui.validation.ValidationProblem.CamelXMLNotFound;
import static org.switchyard.tools.ui.validation.ValidationProblem.CamelXMLUnspecified;
import static org.switchyard.tools.ui.validation.ValidationProblem.MissingReferenceDeclaration;
import static org.switchyard.tools.ui.validation.ValidationProblem.MissingServiceDeclaration;
import static org.switchyard.tools.ui.validation.ValidationProblem.CamelRouteNoSYFromFound;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.switchyard.metadata.ServiceInterface;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.validation.SwitchYardProjectValidator.ValidationAdapter;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * CamelComponentConstraint
 * 
 * <p/>
 * Validates details specific to Camel components.
 * Specifically if it's a Camel Java implementation, it verifies that the class exists
 * and if it points "to" or "from" particular services or references that those match
 * what's in the switchyard.xml.
 * Same for Camel XML implementations, where it verifies the route file is accessible
 * and that the referenced services and references (to/from) exist in the switchyard
 * configuration.
 */
public class CamelComponentConstraint extends AbstractModelConstraint {

    private static final String CONFIGURE_METHOD = "configure"; //$NON-NLS-1$
    private static final String TO_TAG = "to"; //$NON-NLS-1$
    private static final String URI_ATTRIBUTE = "uri"; //$NON-NLS-1$
    private static final String FROM_TAG = "from"; //$NON-NLS-1$
    private static final String ROUTE_TAG = "route"; //$NON-NLS-1$

    @Override
    public IStatus validate(IValidationContext ctx) {
        EObject eObj = ctx.getTarget();
        EMFEventType eType = ctx.getEventType();

        // In the case of batch mode.
        if (eType == EMFEventType.NULL) {
            if (eObj instanceof CamelImplementationType) {
                CamelImplementationType camelImpl = (CamelImplementationType) eObj;
                if (camelImpl.getJava() != null) {
                    return validateJava(ctx, camelImpl);
                } else if (camelImpl.getXml() != null) {
                    return validateXML(ctx, camelImpl);
                } else {
                    Component component = (Component) camelImpl.eContainer();
                    return ConstraintStatus.createStatus(ctx, component, null, CamelImplementationIncomplete.getSeverity(),
                            CamelImplementationIncomplete.ordinal(), CamelImplementationIncomplete.getMessage(), component.getName());
                }
            }
            // } else { // In the case of live mode.
        }

        return ctx.createSuccessStatus();
    }
    
    private IStatus validateXML(IValidationContext ctx, CamelImplementationType camelImpl) {
        final Component component = (Component) camelImpl.eContainer();
        final String xmlName = camelImpl.getXml().getPath();
        if (xmlName == null || xmlName.trim().isEmpty()) {
            return ConstraintStatus.createStatus(ctx, component, null, CamelXMLUnspecified.getSeverity(),
                    CamelXMLUnspecified.ordinal(), CamelXMLUnspecified.getMessage(), component.getName());
        }
        final List<IStatus> statuses = new ArrayList<IStatus>();
        final ValidationAdapter adapter = (ValidationAdapter) EcoreUtil.getAdapter(camelImpl.eResource().eAdapters(),
                ValidationAdapter.class);
        
        final IJavaProject javaProject = adapter.getJavaProject();
        IResource xmlFileResource;
        
        /* look in any of the resource folders for the first instance of the xml file */
        xmlFileResource = PlatformResourceAdapterFactory.getFileForObject(camelImpl, javaProject.getProject());
        if (xmlFileResource == null) {
            return ConstraintStatus.createStatus(ctx, component, null, CamelXMLNotFound.getSeverity(),
                    CamelXMLNotFound.ordinal(), CamelXMLNotFound.getMessage(), xmlName, component.getName());
        }
        
        if (xmlFileResource != null && xmlFileResource instanceof IFile) {
            IFile xmlFile = (IFile) xmlFileResource;
            IPath location = xmlFile.getLocation();
            java.io.File file = location.toFile();
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db;
            try {
                db = dbf.newDocumentBuilder();
                Document document = db.parse(file);
                NodeList routeTags = document.getElementsByTagName(ROUTE_TAG);
                if (routeTags.getLength() > 0) {
                    for (int i = 0; i < routeTags.getLength(); i++) {
                        Node routeTag = routeTags.item(i);
                        
                        int switchyardFromCount = 0;
                        if (routeTag.hasChildNodes()) {
                            for (int j = 0; j < routeTag.getChildNodes().getLength(); j++) {
                                Node childNode = routeTag.getChildNodes().item(j);
                                if (childNode.getNodeName().equals(FROM_TAG)) {
                                    Node uriAttribute = childNode.getAttributes().getNamedItem(URI_ATTRIBUTE);
                                    if (uriAttribute != null) {
                                        String switchyardString = uriAttribute.getNodeValue();
                                        IStatus status = verifyURI(switchyardString, ctx, component, true, javaProject);
                                        if (status != Status.OK_STATUS) {
                                            statuses.add(status);
                                        }
                                        if (switchyardString.startsWith("switchyard://")) {
                                            switchyardFromCount++;
                                        }
                                    }
                                }
                            }
                            if (switchyardFromCount > 1) {
                                // only one SwitchYard "from" supported per component
                                IStatus nodeStatus = ConstraintStatus.createStatus(ctx, component, null, CamelRouteMoreThanOneFromFound.getSeverity(),
                                        CamelRouteMoreThanOneFromFound.ordinal(), CamelRouteMoreThanOneFromFound.getMessage(), component.getName());
                                statuses.add(nodeStatus);
                            } else if (switchyardFromCount == 0) {
                                // no from tags found referencing SwitchYard endpoint
                                IStatus status =  ConstraintStatus.createStatus(ctx, component, null, CamelRouteNoSYFromFound.getSeverity(),
                                        CamelRouteNoSYFromFound.ordinal(), CamelRouteNoSYFromFound.getMessage(), component.getName());
                                statuses.add(status);
                            }
                        } else {
                            // no from tags found referencing SwitchYard endpoint
                            IStatus status =  ConstraintStatus.createStatus(ctx, component, null, CamelRouteNoSYFromFound.getSeverity(),
                                    CamelRouteNoSYFromFound.ordinal(), CamelRouteNoSYFromFound.getMessage(), component.getName());
                            statuses.add(status);
                        }
                    }
                } else {
                    // no from tags found referencing SwitchYard endpoint
                    IStatus status =  ConstraintStatus.createStatus(ctx, component, null, CamelRouteNoSYFromFound.getSeverity(),
                            CamelRouteNoSYFromFound.ordinal(), CamelRouteNoSYFromFound.getMessage(), component.getName());
                    statuses.add(status);
                }
                
                NodeList toTags = document.getElementsByTagName(TO_TAG);
                if (toTags.getLength() > 0) {
                    for (int i = 0; i < toTags.getLength(); i++) {
                        Node fromTag = toTags.item(i);
                        Node uriAttribute = fromTag.getAttributes().getNamedItem(URI_ATTRIBUTE);
                        if (uriAttribute != null) {
                            String switchyardString = uriAttribute.getNodeValue();
                            IStatus status = verifyURI(switchyardString, ctx, component, false, javaProject);
                            if (status != Status.OK_STATUS) {
                                statuses.add(status);
                            }
                        }
                    }
                }
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (SAXException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (statuses.isEmpty()) {
            return ctx.createSuccessStatus();
        }
        return ConstraintStatus.createMultiStatus(ctx, statuses);
    }

    private IStatus validateJava(IValidationContext ctx, CamelImplementationType camelImpl) {
        final Component component = (Component) camelImpl.eContainer();
        final String className = camelImpl.getJava().getClass_();
        if (className == null || className.length() == 0) {
            return ConstraintStatus.createStatus(ctx, component, null, CamelJavaUnspecifiedClass.getSeverity(),
                    CamelJavaUnspecifiedClass.ordinal(), CamelJavaUnspecifiedClass.getMessage(), component.getName());
        }
        final ValidationAdapter adapter = (ValidationAdapter) EcoreUtil.getAdapter(camelImpl.eResource().eAdapters(),
                ValidationAdapter.class);
        final IJavaProject javaProject = adapter.getJavaProject();
        try {
            final IType javaClass = javaProject == null ? null : javaProject.findType(className);
            if (javaClass == null) {
                return ConstraintStatus.createStatus(ctx, component, null, CamelJavaUnresolvableClass.getSeverity(),
                        CamelJavaUnresolvableClass.ordinal(), CamelJavaUnresolvableClass.getMessage(), className,
                        component.getName());
            }
            final List<IStatus> statuses = new ArrayList<IStatus>();
            adapter.addDependency(javaClass.getResource());
            statuses.add(validateRouteClass(camelImpl, className, javaProject, ctx, component));
            return ConstraintStatus.createMultiStatus(ctx, statuses);
        } catch (JavaModelException e) {
            return ConstraintStatus
                    .createStatus(ctx, component, null, CamelJavaUnresolvableClass.getSeverity(),
                            CamelJavaUnresolvableClass.ordinal(), CamelJavaUnresolvableClass.getMessage(), className,
                            component.getName());
        }
    }

    private boolean canFindSuperClass(IType searchType, String superClassName) throws JavaModelException {
        if (searchType.getSuperclassName() != null  
                && searchType.getSuperclassName().contentEquals(superClassName)) {
            return true;
        }
        ITypeHierarchy supertypehierarchy = searchType.newSupertypeHierarchy(new NullProgressMonitor());
        IType supertype = supertypehierarchy.getSuperclass(searchType);
        if (supertype != null) {
            return canFindSuperClass(supertype, superClassName);
        }
        return false;
    }
    
    private IStatus validateRouteClass(CamelImplementationType impl, String className, final IJavaProject javaProject, IValidationContext ctx, Component component) {
        final List<IStatus> statuses = new ArrayList<IStatus>();

        try {
            final IType javaClass = javaProject == null ? null : javaProject.findType(className);
            if (javaClass != null) {
                boolean extendsRouteBuilder = canFindSuperClass(javaClass, "RouteBuilder"); //$NON-NLS-1$
                if (!extendsRouteBuilder) {
                    return ConstraintStatus
                            .createStatus(ctx, component, null, CamelJavaWrongSuperclass.getSeverity(),
                                    CamelJavaWrongSuperclass.ordinal(), CamelJavaWrongSuperclass.getMessage(), className,
                                    component.getName());
                }
                IMethod[] methods = javaClass.getMethods();
                IMethod configureMethod = null;
                if (methods != null && methods.length > 0) {
                    for (int i = 0; i < methods.length; i++) {
                        IMethod method = methods[i];
                        if (method.getElementName().contentEquals(CONFIGURE_METHOD)) {
                            configureMethod = method;
                            break;
                        }
                    }
                }
                if (configureMethod != null) {
                    String source = configureMethod.getSource();
                    
                    // first pass just to make sure we're dealing with one FROM
                    String tryThis = ".?from\\(\".*?\"\\)(.?)"; //$NON-NLS-1$
                    Pattern fromPattern = Pattern.compile(tryThis); //$NON-NLS-1$
                    Matcher fromMatcher = fromPattern.matcher(source);
                    int fromCount = 0;
                    while (fromMatcher.find()) {
                        fromCount++;
                    }

                    if (fromCount > 0) {
                        // now process the FROMs and TOs to verify URIs
                        int switchyardFromCount = 0;
                        String tryThisNext = ".?(from)\\(\".*?\"\\)(.?)"; //$NON-NLS-1$
                        Pattern fromToPattern = Pattern.compile(tryThisNext);
                        Matcher fromToMatcher = fromToPattern.matcher(source);
                        while (fromToMatcher.find()) {
                            String fromToString = source.substring(fromToMatcher.start(), fromToMatcher.end());
                            Pattern switchyardPattern = Pattern.compile("switchyard://.*\""); //$NON-NLS-1$
                            Matcher switchyardMatcher = switchyardPattern.matcher(fromToString);
                            boolean isFrom = (fromToString.matches(tryThis)); //$NON-NLS-1$
                            while (switchyardMatcher.find()) {
                                String switchyardString = fromToString.substring(switchyardMatcher.start(), switchyardMatcher.end() - 1);
                                IStatus status = verifyURI(switchyardString, ctx, component, isFrom, javaProject);
                                if (status != Status.OK_STATUS) {
                                    statuses.add(status);
                                }
                                if (switchyardString.startsWith("switchyard://")) {
                                    switchyardFromCount++;
                                } else if (switchyardFromCount == 0) {
                                    // no from tags found referencing SwitchYard endpoint
                                }
                            }
                        }
                        
                        if (switchyardFromCount > 1) {
                            // only one SwitchYard "from" supported per component
                            IStatus status =  ConstraintStatus.createStatus(ctx, component, null, CamelRouteMoreThanOneFromFound.getSeverity(),
                                    CamelRouteMoreThanOneFromFound.ordinal(), CamelRouteMoreThanOneFromFound.getMessage(), component.getName());
                            statuses.add(status);
                        } else if (switchyardFromCount == 0) {
                            // no from tags found referencing SwitchYard endpoint
                            IStatus status =  ConstraintStatus.createStatus(ctx, component, null, CamelRouteNoSYFromFound.getSeverity(),
                                    CamelRouteNoSYFromFound.ordinal(), CamelRouteNoSYFromFound.getMessage(), component.getName());
                            statuses.add(status);
                        }
                    } else {
                        // no from tags found referencing SwitchYard endpoint
                        IStatus status =  ConstraintStatus.createStatus(ctx, component, null, CamelRouteNoSYFromFound.getSeverity(),
                                CamelRouteNoSYFromFound.ordinal(), CamelRouteNoSYFromFound.getMessage(), component.getName());
                        statuses.add(status);
                    }
                    
                    String tryThisNext = ".?to\\(\".*?\"\\)(.?)"; //$NON-NLS-1$
                    Pattern toPattern = Pattern.compile(tryThisNext); //$NON-NLS-1$
                    Matcher toMatcher = fromPattern.matcher(source);
                    int toCount = 0;
                    while (toMatcher.find()) {
                        toCount++;
                    }

                    if (toCount > 0) {
                        // now process the TOs to verify URIs
                        String tryThisPatternNext = ".?(to)\\(\".*?\"\\)(.?)"; //$NON-NLS-1$
                        toPattern = Pattern.compile(tryThisPatternNext);
                        toMatcher = toPattern.matcher(source);
                        while (toMatcher.find()) {
                            String toString = source.substring(toMatcher.start(), toMatcher.end());
                            Pattern switchyardPattern = Pattern.compile("switchyard://.*\""); //$NON-NLS-1$
                            Matcher switchyardMatcher = switchyardPattern.matcher(toString);
                            while (switchyardMatcher.find()) {
                                String switchyardString = toString.substring(switchyardMatcher.start(), switchyardMatcher.end() - 1);
                                IStatus status = verifyURI(switchyardString, ctx, component, false, javaProject);
                                if (status != Status.OK_STATUS) {
                                    statuses.add(status);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JavaModelException e) {
            return ConstraintStatus
                    .createStatus(ctx, component, null, CamelJavaUnresolvableClass.getSeverity(),
                            CamelJavaUnresolvableClass.ordinal(), CamelJavaUnresolvableClass.getMessage(), className,
                            component.getName());
        }
        
        if (statuses.isEmpty()) {
            return ctx.createSuccessStatus();
        }
        return ConstraintStatus.createMultiStatus(ctx, statuses);
    }
    
    private ComponentService findService(String serviceName, Component component) {
        if (component != null && !component.getService().isEmpty()) {
            EList<ComponentService> list = component.getService();
            Iterator<ComponentService> iter = list.iterator();
            while (iter.hasNext()) {
                ComponentService cs = iter.next();
                if (cs.getName().equals(serviceName)) {
                    return cs;
                }
            }
        }
        return null;
    }
    
    private ComponentReference findReference(String referenceName, Component component) {
        if (component != null && !component.getReference().isEmpty()) {
            EList<ComponentReference> list = component.getReference();
            Iterator<ComponentReference> iter = list.iterator();
            while (iter.hasNext()) {
                ComponentReference cr = iter.next();
                if (cr.getName().equals(referenceName)) {
                    return cr;
                }
            }
        }
        return null;
    }
    
    private IStatus verifyURI(String uriValue, IValidationContext ctx, Component component, boolean isFrom,
            IJavaProject javaProject) {
        final List<IStatus> statuses = new ArrayList<IStatus>();
        
        // switchyard://[service-name]?operationName=[operation-name]
        // switchyard://ReverseService?hack=one&amp;operationName=[operation-name]&amp;jimminy=cricket
        URI testURI = null;
        try {
            testURI = new URI(uriValue);
        } catch (URISyntaxException ex) {
            String fromOrTo = "TO";
            if (isFrom) {
                fromOrTo = "FROM";
            }
            statuses.add(ConstraintStatus
                    .createStatus(ctx, component, null, CamelRouteURIInvalid.getSeverity(),
                            CamelRouteURIInvalid.ordinal(), CamelRouteURIInvalid.getMessage(), fromOrTo, 
                            component.getName(),
                            ex.getLocalizedMessage()));
        }
        
        if (testURI != null) {
            final String scheme = testURI.getScheme();
            ComponentService serviceFound = null;
            ComponentReference referenceFound = null;
            
            // does the URI start with "switchyard"? if not, ignore it
            if (scheme.equals("switchyard")) {
                
                // the authority is equivalent to the referenced service or reference
                final String schemeName = testURI.getAuthority();
                
                if (isFrom) {
                    // verify that the named service exists in the component
                    final String serviceName = schemeName;
                    serviceFound = findService(serviceName, component);
                    if (serviceFound == null) {
                        statuses.add(ConstraintStatus
                                .createStatus(ctx, component, null, MissingServiceDeclaration.getSeverity(),
                                        MissingServiceDeclaration.ordinal(), MissingServiceDeclaration.getMessage(), serviceName,
                                        component.getName()));
                    } 
                } else {
                    // verify that the named reference exists in the component
                    final String referenceName = schemeName;
                    referenceFound = findReference(referenceName, component);
                    if (referenceFound == null) {
                        statuses.add(ConstraintStatus
                                .createStatus(ctx, component, null, MissingReferenceDeclaration.getSeverity(),
                                        MissingReferenceDeclaration.ordinal(), MissingReferenceDeclaration.getMessage(), referenceName,
                                        component.getName()));
                    }
                }
    
                String operationName = getOperationName(testURI);
                if (!isFrom && operationName != null && referenceFound != null) {
                    // verify that the referenced interface includes the operation
                    if (!checkInterfaceForOperation(referenceFound.getInterface(), operationName, javaProject)) {
                        statuses.add(ConstraintStatus
                                .createStatus(ctx, component, null, CamelRouteOperationNotFoundAsReference.getSeverity(),
                                        CamelRouteOperationNotFoundAsReference.ordinal(), CamelRouteOperationNotFoundAsReference.getMessage(), operationName,
                                        referenceFound.getName()));
                    }
                } else if (isFrom && operationName != null && serviceFound != null) {
                    // verify that the referenced interface includes the operation
                    if (!checkInterfaceForOperation(serviceFound.getInterface(), operationName, javaProject)) {
                        statuses.add(ConstraintStatus
                                .createStatus(ctx, component, null, CamelRouteOperationNotFoundAsService.getSeverity(),
                                        CamelRouteOperationNotFoundAsService.ordinal(), CamelRouteOperationNotFoundAsService.getMessage(), operationName,
                                        serviceFound.getName()));
                    }
                }
                if (operationName == null && referenceFound != null) {
                    // verify that the referenced interface has zero or one operation.
                    // if more, it's invalid and an operation name must be specified
                    if (!checkInterfaceForNumberOfOperations(referenceFound.getInterface(), javaProject)) {
                        statuses.add(ConstraintStatus
                                .createStatus(ctx, component, null, CamelRouteOperationRequiredNotSpecified.getSeverity(),
                                        CamelRouteOperationRequiredNotSpecified.ordinal(), CamelRouteOperationRequiredNotSpecified.getMessage(),
                                        component.getName()));
                    }
                }
            }
        }
        // by this point the URI has already been validated or not, so any messages 
        // should have been created

        if (statuses.isEmpty()) {
            return ctx.createSuccessStatus();
        }
        return ConstraintStatus.createMultiStatus(ctx, statuses);
    }
    
    private String getOperationName(URI uri) {
        try {
            final String query = uri.getQuery();
            if (query == null) {
                return null;
            }
            // XXX: we should be using the encoding specified in the XML
            for (String pair : URLDecoder.decode(query, "UTF-8").split("&")) {
                final int index = pair.indexOf('=');
                if (index < 0) {
                    continue;
                }
                final String name = pair.substring(0, index);
                if ("operationName".equals(name)) {
                    return pair.substring(index + 1);
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private boolean checkInterfaceForOperation(Interface intfc, String opName, IJavaProject javaProject) {
        ClassLoader oldTCCL = Thread.currentThread().getContextClassLoader();
        try {
            Thread.currentThread().setContextClassLoader(
                    JavaUtil.getProjectClassLoader(
                            JavaCore.create(WorkspaceSynchronizer.getFile(intfc.eResource()).getProject()), 
                            getClass().getClassLoader()));
            if (intfc instanceof JavaInterface) {
                JavaInterface javaIntfc = (JavaInterface) intfc;
                String className = javaIntfc.getInterface();
                final IType javaClass = javaProject == null ? null : javaProject.findType(className);
                if (javaClass != null && javaClass.getMethods() != null && javaClass.getMethods().length > 0) {
                    for (int i = 0; i < javaClass.getMethods().length; i++) {
                        IMethod method = javaClass.getMethods()[i];
                        if (method.getElementName().equals(opName)) {
                            return true;
                        }
                    }
                }
            } else if (intfc instanceof EsbInterface) {
                // ignore operation names for ESB?
                return true;
            } else {
                ServiceInterface serviceIntfc = SwitchYardModelUtils.getServiceInterface(intfc);
                if (serviceIntfc != null && serviceIntfc.getOperations() != null) {
                    if (serviceIntfc.getOperation(opName) != null) {
                        return true;
                    } else {
                        try {
                            QName qname = new QName(opName);
                            if (serviceIntfc.getOperation(qname.getLocalPart()) != null) {
                                return true;
                            }
                        } catch (IllegalArgumentException e) {
                            return false;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.currentThread().setContextClassLoader(oldTCCL);
        }
        return false;
    }
    
    private boolean checkInterfaceForNumberOfOperations(Interface intfc, IJavaProject javaProject) {
        ClassLoader oldTCCL = Thread.currentThread().getContextClassLoader();
        // if we have zero or one operation, no operation name is required
        try {
            Thread.currentThread().setContextClassLoader(
                    JavaUtil.getProjectClassLoader(
                            JavaCore.create(WorkspaceSynchronizer.getFile(intfc.eResource()).getProject()), 
                            getClass().getClassLoader()));
            if (intfc instanceof JavaInterface) {
                JavaInterface javaIntfc = (JavaInterface) intfc;
                String className = javaIntfc.getInterface();
                final IType javaClass = javaProject == null ? null : javaProject.findType(className);
                if (javaClass != null && javaClass.getMethods() != null && javaClass.getMethods().length < 2) {
                    return true;
                }
            } else if (intfc instanceof EsbInterface) {
                // ignore operation names for ESB?
                return true;
            } else {
                ServiceInterface serviceIntfc = SwitchYardModelUtils.getServiceInterface(intfc);
                if (serviceIntfc != null && serviceIntfc.getOperations() != null) {
                    if (serviceIntfc.getOperations().size() < 2) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.currentThread().setContextClassLoader(oldTCCL);
        }
        return false;
    }
}
