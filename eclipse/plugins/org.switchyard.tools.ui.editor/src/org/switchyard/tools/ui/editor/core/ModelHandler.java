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
package org.switchyard.tools.ui.editor.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.open.oasis.docs.ns.opencsa.sca.bpel.BPELPackage;
import org.switchyard.tools.models.switchyard1_0.bean.BeanPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType;
import org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType;
import org.switchyard.tools.models.switchyard1_0.clojure.ClojurePackage;
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;
import org.switchyard.tools.models.switchyard1_0.hornetq.BindingType;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;
import org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl;
import org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.JsonTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.TransformFactory;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;
import org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType;
import org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage;
import org.switchyard.tools.ui.editor.Activator;

/**
 * @author bfitzpat
 * 
 */
/**
 * @author bfitzpat
 * 
 */
public class ModelHandler {

    private SwitchyardResourceImpl _resource;

    ModelHandler() {
    }

    void createDefinitionsIfMissing() {
        EList<EObject> contents = _resource.getContents();

        if (contents.isEmpty() || !(contents.get(0) instanceof DocumentRoot)) {

            TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(_resource);

            if (domain != null) {

                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        DocumentRoot docRoot = createDocumentRoot();
                        SwitchYardType switchYardRoot = createSY(SwitchYardType.class);
                        docRoot.setSwitchyard(switchYardRoot);
                        Composite composite = createSCA(Composite.class);
                        composite.setTargetNamespace(switchYardRoot.getTargetNamespace());
                        composite.setName(switchYardRoot.getName());
                        switchYardRoot.setComposite(composite);
                        _resource.getContents().add(docRoot);
                    }
                });
                return;
            }
        } else if (contents.get(0) instanceof DocumentRoot) {
            TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(_resource);
            final DocumentRoot docRoot = (DocumentRoot) contents.get(0);
            if (docRoot.getSwitchyard() == null) {
                if (domain != null) {
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            SwitchYardType switchYardRoot = createSY(SwitchYardType.class);
                            docRoot.setSwitchyard(switchYardRoot);
                            Composite composite = createSCA(Composite.class);
                            composite.setTargetNamespace(switchYardRoot.getTargetNamespace());
                            composite.setName(switchYardRoot.getName());
                            switchYardRoot.setComposite(composite);
                        }
                    });
                    return;
                }
            } else if (docRoot.getSwitchyard().getComposite() == null) {
                if (domain != null) {
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            SwitchYardType switchYardRoot = docRoot.getSwitchyard();
                            Composite composite = createSCA(Composite.class);
                            composite.setTargetNamespace(switchYardRoot.getTargetNamespace());
                            composite.setName(switchYardRoot.getName());
                            switchYardRoot.setComposite(composite);
                        }
                    });
                    return;
                }
            }
        }
    }

    /**
     * Get the ModelHandler instance for the EMF object instance.
     * 
     * @param object instance to search for
     * @return ModelHandler instance
     * @throws IOException the ioexception
     */
    public static ModelHandler getInstance(EObject object) throws IOException {
        return ModelHandlerLocator.getModelHandler(object.eResource());
    }

    /**
     * Get the resource associated with this ModelHandler.
     * 
     * @return a SwitchyardResource instance
     */
    public SwitchyardResourceImpl getResource() {
        return _resource;
    }

    /**
     * @param resource resource
     */
    protected void setResource(SwitchyardResourceImpl resource) {
        this._resource = resource;
    }

    /**
     * Save the file.
     */
    public void save() {
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(_resource);
        if (domain != null) {
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    saveResource();
                }
            });
        } else {
            saveResource();
        }
    }

    private void saveResource() {
        try {
            _resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            Activator.logError(e);
        }
    }

    /**
     * @return DocumentRoot for the EMF resource
     */
    public DocumentRoot getDocumentRoot() {
        if (!_resource.getContents().isEmpty() && _resource.getContents().get(0) instanceof DocumentRoot) {
            DocumentRoot documentRoot = (DocumentRoot) _resource.getContents().get(0);
            return documentRoot;
        }
        return null;
    }

    /**
     * @return the root SwitchYard element
     */
    public SwitchYardType getRootSwitchYard() {
        DocumentRoot documentRoot = getDocumentRoot();
        if (documentRoot != null && documentRoot.eContents().get(0) instanceof SwitchYardType) {
            SwitchYardType syType = (SwitchYardType) documentRoot.eContents().get(0);
            return syType;
        }
        return null;
    }

    /**
     * @return the root Composite
     */
    public Composite getRootComposite() {
        SwitchYardType syType = getRootSwitchYard();
        if (syType != null) {
            return syType.getComposite();
        }
        return null;
    }

    /**
     * @return the created DocumentRoot
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRoot documentRoot = createSY(DocumentRoot.class);
        return documentRoot;
    }

    /**
     * @return the created SwitchYard element
     */
    public SwitchYardType createSwitchYard() {
        SwitchYardType switchYardRoot = createSY(SwitchYardType.class);
        if (getDocumentRoot() == null) {
            createDocumentRoot();
        }
        getDocumentRoot().setSwitchyard(switchYardRoot);
        return switchYardRoot;
    }

    /**
     * @return the created Composite
     */
    public Composite createComposite() {
        if (getDocumentRoot() == null) {
            createDocumentRoot();
        }
        if (getRootSwitchYard() == null) {
            createSwitchYard();
        }
        Composite composite = createSCA(Composite.class);
        composite.setTargetNamespace(getRootSwitchYard().getTargetNamespace());
        getRootSwitchYard().setComposite(composite);
        return composite;
    }

    /**
     * @param source the composite to create the service for
     * @return the service
     */
    public Service createService(Composite source) {
        Service service = createSCA(Service.class);
        source.getService().add(service);
        return service;
    }

    /**
     * @param source the composite to create the component for
     * @return the component
     */
    public Component createComponent(Composite source) {
        Component component = createSCA(Component.class);
        source.getComponent().add(component);
        return component;
    }

    /**
     * @param source the composite to create the composite reference for
     * @return the composite reference
     */
    public Reference createCompositeReference(Composite source) {
        Reference compositeRef = createSCA(Reference.class);
        source.getReference().add(compositeRef);
        return compositeRef;
    }

    /**
     * @param source the Component to create the component reference for
     * @return the component reference
     */
    public ComponentReference createComponentReference(Component source) {
        ComponentReference componentRef = createSCA(ComponentReference.class);
        source.getReference().add(componentRef);
        return componentRef;
    }

    /**
     * @param source the component to create the component service for
     * @return the component service
     */
    public ComponentService createComponentService(Component source) {
        ComponentService componentService = createSCA(ComponentService.class);
        source.getService().add(componentService);
        return componentService;
    }

    /**
     * @param source the Service to create the SOAP binding for
     * @return the soap binding
     */
    public SOAPBindingType createSOAPBinding(Service source) {
        SOAPBindingType soapBinding = SOAPFactory.eINSTANCE.createSOAPBindingType();
        source.getBindingGroup().add(SOAPPackage.eINSTANCE.getDocumentRoot_BindingSoap(), soapBinding);
        return soapBinding;
    }

    /**
     * @param source Reference to create the SOAP binding for
     * @return the soap binding
     */
    public SOAPBindingType createSOAPBinding(Reference source) {
        SOAPBindingType soapBinding = createSOAP(SOAPBindingType.class);
        source.getBindingGroup().add(SOAPPackage.eINSTANCE.getDocumentRoot_BindingSoap(), soapBinding);
        return soapBinding;
    }

    /**
     * @param source Service to create new camel binding for
     * @return new camel binding
     */
    public CamelBindingType createCamelBinding(Service source) {
        CamelBindingType camelBinding = createSY(CamelBindingType.class);
        source.getBindingGroup().add(CamelPackage.eINSTANCE.getDocumentRoot_BindingCamel(), camelBinding);
        return camelBinding;
    }

    /**
     * @param source camel implementation
     * @return new XML DSL type class
     */
    public XMLDSLType createCamelXMLDSLType(CamelImplementationType source) {
        XMLDSLType xmlDSLType = createCamel(XMLDSLType.class);
        if (xmlDSLType != null) {
            source.setXml(xmlDSLType);
        }
        return xmlDSLType;
    }

    /**
     * @param source camel implementation
     * @return new Java DSL type class
     */
    public JavaDSLType createCamelJavaDSLType(CamelImplementationType source) {
        JavaDSLType javaDSLType = createCamel(JavaDSLType.class);
        if (javaDSLType != null) {
            source.setJava(javaDSLType);
        }
        return javaDSLType;
    }

    /**
     * @param source Camel implementation to create route for
     * @return new route definition
     */
    public RouteDefinition createRouteDefinition(CamelImplementationType source) {
        RouteDefinition routeDefn = createSpring(RouteDefinition.class);
        source.setRoute(routeDefn);
        return routeDefn;
    }

    /**
     * @param resourceSet register all the EMF packages for the SY resource set
     */
    public static void registerPackages(ResourceSet resourceSet) {
        resourceSet.getPackageRegistry().put("http://docs.oasis-open.org/ns/opencsa/sca/200912", ScaPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-config:switchyard:1.0", SwitchyardPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-config:transform:1.0", TransformPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-bean:config:1.0", BeanPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-config:validate:1.0", ValidatePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-soap:config:1.0", SOAPPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-rules:config:1.0", RulesPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-hornetq:config:1.0", HornetQPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-common-rules:config:1.0",
                CommonRulesPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-clojure:config:1.0", ClojurePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-camel:config:1.0", CamelPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-bpm:config:1.0", BPMPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("http://docs.oasis-open.org/ns/opencsa/sca/200903", BPELPackage.eINSTANCE);
    }

    void loadResource() {
        URI fileuri = _resource.getURI();

        TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(_resource);
        ResourceSet resourceSet = editingDomain.getResourceSet();

        ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
        editingDomain.getResourceSet().getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
        editingDomain.getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new SwitchyardResourceFactoryImpl());

        // Register the package to make it available during loading.
        registerPackages(resourceSet);

        try {
            _resource = (SwitchyardResourceImpl) resourceSet.getResource(fileuri, true);
        } catch (WrappedException we) {
            _resource = (SwitchyardResourceImpl) resourceSet.getResource(fileuri, true);
        } catch (Exception e) {
            _resource = (SwitchyardResourceImpl) resourceSet.getResource(fileuri, true);
        }
    }

    /**
     * List all instances of a class in the resource.
     * 
     * @param class1 class to search for
     * @param <T> class
     * @return list to return
     */
    @SuppressWarnings("unchecked")
    public <T> List<T> getAll(final Class<T> class1) {
        ArrayList<T> l = new ArrayList<T>();
        TreeIterator<EObject> contents = _resource.getAllContents();
        for (; contents.hasNext();) {
            Object t = contents.next();
            if (class1.isInstance(t)) {
                l.add((T) t);
            }
        }
        return l;
    }

    /**
     * General-purpose factory method that sets appropriate default values for
     * new objects.
     * 
     * @param eClass to create
     * @return class instance
     */
    public EObject create(EClass eClass) {
        EObject newObject = null;
        EPackage pkg = eClass.getEPackage();
        EFactory factory = pkg.getEFactoryInstance();
        newObject = factory.create(eClass);
        initialize(newObject);
        return newObject;
    }

    /**
     * @param clazz the class from the Switchyard factory to create
     * @param <T> the class
     * @return the class instance
     */
    @SuppressWarnings("unchecked")
    public <T extends EObject> T createSY(Class<T> clazz) {
        EObject newObject = null;
        EClassifier eClassifier = SwitchyardPackage.eINSTANCE.getEClassifier(clazz.getSimpleName());
        if (eClassifier instanceof EClass) {
            EClass eClass = (EClass) eClassifier;
            newObject = SwitchyardFactory.eINSTANCE.create(eClass);
        }

        if (newObject != null) {
            initialize(newObject);
        }

        return (T) newObject;
    }

    /**
     * @param clazz the class from the Camel factory to create
     * @param <T> the class
     * @return the class instance
     */
    @SuppressWarnings("unchecked")
    public <T extends EObject> T createCamel(Class<T> clazz) {
        EObject newObject = null;
        EClassifier eClassifier = CamelPackage.eINSTANCE.getEClassifier(clazz.getSimpleName());
        if (eClassifier instanceof EClass) {
            EClass eClass = (EClass) eClassifier;
            newObject = CamelFactory.eINSTANCE.create(eClass);
        }

        if (newObject != null) {
            initialize(newObject);
        }

        return (T) newObject;
    }

    /**
     * @param clazz the class from the SOAP factory to create
     * @param <T> the class
     * @return the class instance
     */
    @SuppressWarnings("unchecked")
    public <T extends EObject> T createSOAP(Class<T> clazz) {
        EObject newObject = null;
        EClassifier eClassifier = SOAPPackage.eINSTANCE.getEClassifier(clazz.getSimpleName());
        if (eClassifier instanceof EClass) {
            EClass eClass = (EClass) eClassifier;
            newObject = SOAPFactory.eINSTANCE.create(eClass);
        }

        if (newObject != null) {
            initialize(newObject);
        }

        return (T) newObject;
    }

    /**
     * @param clazz the class from the SCA factory to create
     * @param <T> the class
     * @return the class instance
     */
    @SuppressWarnings("unchecked")
    public <T extends EObject> T createSCA(Class<T> clazz) {
        EObject newObject = null;
        EClassifier eClassifier = ScaPackage.eINSTANCE.getEClassifier(clazz.getSimpleName());
        if (eClassifier instanceof EClass) {
            EClass eClass = (EClass) eClassifier;
            newObject = ScaFactory.eINSTANCE.create(eClass);
        }

        if (newObject != null) {
            initialize(newObject);
        }

        return (T) newObject;
    }

    /**
     * @param clazz the class from the Spring factory to create
     * @param <T> the class
     * @return the class instance
     */
    @SuppressWarnings("unchecked")
    public <T extends EObject> T createSpring(Class<T> clazz) {
        EObject newObject = null;
        EClassifier eClassifier = SpringPackage.eINSTANCE.getEClassifier(clazz.getSimpleName());
        if (eClassifier instanceof EClass) {
            EClass eClass = (EClass) eClassifier;
            newObject = SpringFactory.eINSTANCE.create(eClass);
        }

        if (newObject != null) {
            initialize(newObject);
        }

        return (T) newObject;
    }

    /**
     * @param sourceBO source business object (service or reference)
     * @param binding binding to add
     */
    public void addBindingToSource(Object sourceBO, Binding binding) {
        if (binding != null && sourceBO != null) {
            FeatureMap bindingGroup = null;
            if (sourceBO instanceof Service) {
                bindingGroup = ((Service) sourceBO).getBindingGroup();
            } else if (sourceBO instanceof Reference) {
                bindingGroup = ((Reference) sourceBO).getBindingGroup();
            }
            if (binding instanceof SOAPBindingType) {
                bindingGroup.add(SOAPPackage.eINSTANCE.getDocumentRoot_BindingSoap(), binding);
            } else if (binding instanceof CamelBindingType) {
                bindingGroup.add(CamelPackage.eINSTANCE.getDocumentRoot_BindingCamel(), binding);
            } else if (binding instanceof CamelDirectBindingType) {
                bindingGroup.add(CamelPackage.eINSTANCE.getDocumentRoot_BindingDirect(), binding);
            } else if (binding instanceof CamelSedaBindingType) {
                bindingGroup.add(CamelPackage.eINSTANCE.getDocumentRoot_BindingSeda(), binding);
            } else if (binding instanceof CamelTimerBindingType) {
                bindingGroup.add(CamelPackage.eINSTANCE.getDocumentRoot_BindingTimer(), binding);
            } else if (binding instanceof CamelAtomBindingType) {
                bindingGroup.add(CamelPackage.eINSTANCE.getDocumentRoot_BindingAtom(), binding);
            } else if (binding instanceof CamelJmsBindingType) {
                bindingGroup.add(CamelPackage.eINSTANCE.getDocumentRoot_BindingJms(), binding);
            } else if (binding instanceof CamelFileBindingType) {
                bindingGroup.add(CamelPackage.eINSTANCE.getDocumentRoot_BindingFile(), binding);
            } else if (binding instanceof CamelFtpBindingType) {
                bindingGroup.add(CamelPackage.eINSTANCE.getDocumentRoot_BindingFtp(), binding);
            } else if (binding instanceof CamelFtpsBindingType) {
                bindingGroup.add(CamelPackage.eINSTANCE.getDocumentRoot_BindingFtps(), binding);
            }
        }
    }

    /**
     * @return list of supported binding types
     */
    public List<Binding> getSupportedBindingTypes() {
        ArrayList<Binding> typeList = new ArrayList<Binding>();

        Binding soapBindingType = SOAPFactory.eINSTANCE.createSOAPBindingType();
        ((SOAPBindingType) soapBindingType).setWsdl("MyService.wsdl");
        ((SOAPBindingType) soapBindingType).setSocketAddr(":18001");
        typeList.add(soapBindingType);

        Binding camelFileType = CamelFactory.eINSTANCE.createCamelFileBindingType();
        ((CamelFileBindingType) camelFileType).setDirectory("my/directory");
        typeList.add(camelFileType);

        Binding camelFTPType = CamelFactory.eINSTANCE.createCamelFtpBindingType();
        ((CamelFtpBindingType) camelFTPType).setDirectory("my/directory");
        typeList.add(camelFTPType);

        return typeList;
    }

    /**
     * @return list of supported transform types
     */
    public List<TransformType> getSupportedTransformTypes() {
        ArrayList<TransformType> typeList = new ArrayList<TransformType>();

        TransformType jaxbType = TransformFactory.eINSTANCE.createJAXBTransformType();
        typeList.add(jaxbType);

        TransformType xsltType = TransformFactory.eINSTANCE.createXsltTransformType();
        typeList.add(xsltType);

        TransformType smooksType = TransformFactory.eINSTANCE.createSmooksTransformType1();
        typeList.add(smooksType);

        return typeList;
    }

    /**
     * @param transform transform to check
     * @return String label
     */
    public String getLabelForTransformType(TransformType transform) {
        if (transform instanceof JAXBTransformType) {
            return "JAXB";
        } else if (transform instanceof XsltTransformType) {
            return "XSLT";
        } else if (transform instanceof JavaTransformType1) {
            return "Java";
        } else if (transform instanceof JsonTransformType) {
            return "JSON";
        } else if (transform instanceof SmooksTransformType1) {
            return "Smooks";
        } else {
            return "Unsupported (" + transform.eClass().getClass().getName() + ")";
        }

    }

    /**
     * @param binding binding to check
     * @return String label
     */
    public String getLabelForBindingType(Binding binding) {
        if (binding instanceof SOAPBindingType) {
            return "SOAP";
        } else if (binding instanceof BindingType) {
            return "HornetQ";
        } else if (binding instanceof CamelBindingType) {
            return "Camel";
        } else if (binding instanceof CamelFileBindingType) {
            return "File";
        } else if (binding instanceof CamelSftpBindingType) {
            return "SFTP";
        } else if (binding instanceof CamelFtpBindingType) {
            return "FTP";
        } else if (binding instanceof CamelNettyBindingType) {
            return "Netty";
        } else if (binding instanceof CamelJmsBindingType) {
            return "JMS";
        } else if (binding instanceof CamelAtomBindingType) {
            return "Atom";
        } else if (binding instanceof CamelDirectBindingType) {
            return "Direct";
        } else if (binding instanceof CamelSedaBindingType) {
            return "Seda";
        } else if (binding instanceof CamelTimerBindingType) {
            return "Timer";
        } else {
            return "Unsupported (" + binding.eClass().getClass().getName() + ")";
        }

    }

    /**
     * @param newObject the object to initialize from
     */
    public void initialize(EObject newObject) {
        // not used currently, brought over from the BPMN2 editor
        return;
        // if (newObject != null) {
        // // if (newObject.eClass().getEPackage() == Bpmn2Package.eINSTANCE) {
        // // // Set appropriate default values for the object features here
        // // switch (newObject.eClass().getClassifierID()) {
        // // case Bpmn2Package.ITEM_DEFINITION:
        // // ((ItemDefinition)newObject).setItemKind(ItemKind.INFORMATION);
        // // }
        // // }
        //
        // // if the object has an "id", assign it now.
        // // String id = ModelUtil.setID(newObject,resource);
        // // also set a default name
        // // EStructuralFeature feature =
        // // newObject.eClass().getEStructuralFeature("name");
        // // if (feature!=null) {
        // // if (id!=null)
        // // newObject.eSet(feature, ModelUtil.toDisplayName(id));
        // // else
        // // newObject.eSet(feature,
        // // "New "+ModelUtil.toDisplayName(newObject.eClass().getName()));
        // // }
        // }
    }
}
