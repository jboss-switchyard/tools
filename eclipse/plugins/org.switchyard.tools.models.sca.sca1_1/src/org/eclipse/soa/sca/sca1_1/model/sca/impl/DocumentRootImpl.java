/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.BindingType;
import org.eclipse.soa.sca.sca1_1.model.sca.CExport;
import org.eclipse.soa.sca.sca1_1.model.sca.CImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.CImport;
import org.eclipse.soa.sca.sca1_1.model.sca.CInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.CPPExport;
import org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.CPPImport;
import org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.Callback;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentType;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType;
import org.eclipse.soa.sca.sca1_1.model.sca.ContributionType;
import org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot;
import org.eclipse.soa.sca.sca1_1.model.sca.Documentation;
import org.eclipse.soa.sca.sca1_1.model.sca.EJBImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding;
import org.eclipse.soa.sca.sca1_1.model.sca.Export;
import org.eclipse.soa.sca.sca1_1.model.sca.ExportType;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType;
import org.eclipse.soa.sca.sca1_1.model.sca.Import;
import org.eclipse.soa.sca.sca1_1.model.sca.ImportType;
import org.eclipse.soa.sca.sca1_1.model.sca.Include;
import org.eclipse.soa.sca.sca1_1.model.sca.Intent;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JCABinding;
import org.eclipse.soa.sca.sca1_1.model.sca.JEEImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaExportType;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaImportType;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.eclipse.soa.sca.sca1_1.model.sca.PolicySet;
import org.eclipse.soa.sca.sca1_1.model.sca.PolicySetAttachment;
import org.eclipse.soa.sca.sca1_1.model.sca.SCABinding;
import org.eclipse.soa.sca.sca1_1.model.sca.SCAImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.SpringImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions;
import org.eclipse.soa.sca.sca1_1.model.sca.ValueType;
import org.eclipse.soa.sca.sca1_1.model.sca.WSCallbackType;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.soa.sca.sca1_1.model.sca.WebImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding;
import org.eclipse.soa.sca.sca1_1.model.sca.WireFormatType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getBindingEjb <em>Binding Ejb</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getBindingJca <em>Binding Jca</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getBindingJms <em>Binding Jms</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getBindingSca <em>Binding Sca</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getBindingWs <em>Binding Ws</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getBindingType <em>Binding Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getCallback <em>Callback</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getComposite <em>Composite</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getConstrainingType <em>Constraining Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getExport <em>Export</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getExportBase <em>Export Base</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getExportC <em>Export C</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getExportCpp <em>Export Cpp</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getExportJava <em>Export Java</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImplementationBpel <em>Implementation Bpel</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImplementationC <em>Implementation C</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImplementationComposite <em>Implementation Composite</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImplementationCpp <em>Implementation Cpp</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImplementationEjb <em>Implementation Ejb</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImplementationJava <em>Implementation Java</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImplementationJee <em>Implementation Jee</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImplementationSpring <em>Implementation Spring</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImplementationWeb <em>Implementation Web</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImportBase <em>Import Base</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImportC <em>Import C</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImportCpp <em>Import Cpp</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getImportJava <em>Import Java</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getInterfaceC <em>Interface C</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getInterfaceCpp <em>Interface Cpp</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getInterfaceJava <em>Interface Java</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getInterfaceWsdl <em>Interface Wsdl</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getOperationSelector <em>Operation Selector</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getOperationSelectorJmsDefault <em>Operation Selector Jms Default</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getPolicySet <em>Policy Set</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getPolicySetAttachment <em>Policy Set Attachment</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getWireFormat <em>Wire Format</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getWireFormatJmsDefault <em>Wire Format Jms Default</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getWSCallback <em>WS Callback</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getCallback1 <em>Callback1</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
	protected FeatureMap mixed;

	/**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
	protected EMap<String, String> xSISchemaLocation;

	/**
     * The default value of the '{@link #getCallback1() <em>Callback1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCallback1()
     * @generated
     * @ordered
     */
	protected static final String CALLBACK1_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCallback1() <em>Callback1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCallback1()
     * @generated
     * @ordered
     */
	protected String callback1 = CALLBACK1_EDEFAULT;

	/**
     * The default value of the '{@link #getRequires() <em>Requires</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRequires()
     * @generated
     * @ordered
     */
	protected static final List<QName> REQUIRES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRequires() <em>Requires</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRequires()
     * @generated
     * @ordered
     */
	protected List<QName> requires = REQUIRES_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DocumentRootImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getDocumentRoot();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, ScaPackage.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EMap<String, String> getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ScaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return xMLNSPrefixMap;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EMap<String, String> getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ScaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Binding getBinding() {
        return (Binding)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_Binding(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBinding(Binding newBinding, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_Binding(), newBinding, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EJBSessionBeanBinding getBindingEjb() {
        return (EJBSessionBeanBinding)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_BindingEjb(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBindingEjb(EJBSessionBeanBinding newBindingEjb, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_BindingEjb(), newBindingEjb, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBindingEjb(EJBSessionBeanBinding newBindingEjb) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_BindingEjb(), newBindingEjb);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JCABinding getBindingJca() {
        return (JCABinding)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_BindingJca(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBindingJca(JCABinding newBindingJca, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_BindingJca(), newBindingJca, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBindingJca(JCABinding newBindingJca) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_BindingJca(), newBindingJca);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSBinding getBindingJms() {
        return (JMSBinding)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_BindingJms(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBindingJms(JMSBinding newBindingJms, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_BindingJms(), newBindingJms, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBindingJms(JMSBinding newBindingJms) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_BindingJms(), newBindingJms);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SCABinding getBindingSca() {
        return (SCABinding)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_BindingSca(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBindingSca(SCABinding newBindingSca, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_BindingSca(), newBindingSca, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBindingSca(SCABinding newBindingSca) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_BindingSca(), newBindingSca);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WebServiceBinding getBindingWs() {
        return (WebServiceBinding)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_BindingWs(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBindingWs(WebServiceBinding newBindingWs, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_BindingWs(), newBindingWs, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBindingWs(WebServiceBinding newBindingWs) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_BindingWs(), newBindingWs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BindingType getBindingType() {
        return (BindingType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_BindingType(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBindingType(BindingType newBindingType, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_BindingType(), newBindingType, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBindingType(BindingType newBindingType) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_BindingType(), newBindingType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Callback getCallback() {
        return (Callback)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_Callback(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetCallback(Callback newCallback, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_Callback(), newCallback, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCallback(Callback newCallback) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_Callback(), newCallback);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComponentType getComponentType() {
        return (ComponentType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ComponentType(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetComponentType(ComponentType newComponentType, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ComponentType(), newComponentType, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setComponentType(ComponentType newComponentType) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ComponentType(), newComponentType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Composite getComposite() {
        return (Composite)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_Composite(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetComposite(Composite newComposite, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_Composite(), newComposite, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setComposite(Composite newComposite) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_Composite(), newComposite);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConstrainingType getConstrainingType() {
        return (ConstrainingType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ConstrainingType(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetConstrainingType(ConstrainingType newConstrainingType, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ConstrainingType(), newConstrainingType, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConstrainingType(ConstrainingType newConstrainingType) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ConstrainingType(), newConstrainingType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ContributionType getContribution() {
        return (ContributionType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_Contribution(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetContribution(ContributionType newContribution, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_Contribution(), newContribution, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setContribution(ContributionType newContribution) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_Contribution(), newContribution);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TDefinitions getDefinitions() {
        return (TDefinitions)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_Definitions(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetDefinitions(TDefinitions newDefinitions, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_Definitions(), newDefinitions, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDefinitions(TDefinitions newDefinitions) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_Definitions(), newDefinitions);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Documentation getDocumentation() {
        return (Documentation)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_Documentation(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetDocumentation(Documentation newDocumentation, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_Documentation(), newDocumentation, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDocumentation(Documentation newDocumentation) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_Documentation(), newDocumentation);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExportType getExport() {
        return (ExportType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_Export(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetExport(ExportType newExport, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_Export(), newExport, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExport(ExportType newExport) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_Export(), newExport);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Export getExportBase() {
        return (Export)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ExportBase(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetExportBase(Export newExportBase, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ExportBase(), newExportBase, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CExport getExportC() {
        return (CExport)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ExportC(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetExportC(CExport newExportC, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ExportC(), newExportC, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExportC(CExport newExportC) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ExportC(), newExportC);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CPPExport getExportCpp() {
        return (CPPExport)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ExportCpp(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetExportCpp(CPPExport newExportCpp, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ExportCpp(), newExportCpp, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExportCpp(CPPExport newExportCpp) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ExportCpp(), newExportCpp);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaExportType getExportJava() {
        return (JavaExportType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ExportJava(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetExportJava(JavaExportType newExportJava, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ExportJava(), newExportJava, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExportJava(JavaExportType newExportJava) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ExportJava(), newExportJava);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Implementation getImplementation() {
        return (Implementation)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_Implementation(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImplementation(Implementation newImplementation, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_Implementation(), newImplementation, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BPELImplementation getImplementationBpel() {
        return (BPELImplementation)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationBpel(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImplementationBpel(BPELImplementation newImplementationBpel, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationBpel(), newImplementationBpel, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImplementationBpel(BPELImplementation newImplementationBpel) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationBpel(), newImplementationBpel);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CImplementation getImplementationC() {
        return (CImplementation)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationC(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImplementationC(CImplementation newImplementationC, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationC(), newImplementationC, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImplementationC(CImplementation newImplementationC) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationC(), newImplementationC);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SCAImplementation getImplementationComposite() {
        return (SCAImplementation)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationComposite(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImplementationComposite(SCAImplementation newImplementationComposite, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationComposite(), newImplementationComposite, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImplementationComposite(SCAImplementation newImplementationComposite) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationComposite(), newImplementationComposite);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CPPImplementation getImplementationCpp() {
        return (CPPImplementation)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationCpp(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImplementationCpp(CPPImplementation newImplementationCpp, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationCpp(), newImplementationCpp, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImplementationCpp(CPPImplementation newImplementationCpp) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationCpp(), newImplementationCpp);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EJBImplementation getImplementationEjb() {
        return (EJBImplementation)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationEjb(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImplementationEjb(EJBImplementation newImplementationEjb, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationEjb(), newImplementationEjb, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImplementationEjb(EJBImplementation newImplementationEjb) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationEjb(), newImplementationEjb);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaImplementation getImplementationJava() {
        return (JavaImplementation)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationJava(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImplementationJava(JavaImplementation newImplementationJava, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationJava(), newImplementationJava, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImplementationJava(JavaImplementation newImplementationJava) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationJava(), newImplementationJava);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JEEImplementation getImplementationJee() {
        return (JEEImplementation)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationJee(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImplementationJee(JEEImplementation newImplementationJee, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationJee(), newImplementationJee, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImplementationJee(JEEImplementation newImplementationJee) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationJee(), newImplementationJee);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SpringImplementation getImplementationSpring() {
        return (SpringImplementation)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationSpring(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImplementationSpring(SpringImplementation newImplementationSpring, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationSpring(), newImplementationSpring, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImplementationSpring(SpringImplementation newImplementationSpring) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationSpring(), newImplementationSpring);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WebImplementation getImplementationWeb() {
        return (WebImplementation)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationWeb(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImplementationWeb(WebImplementation newImplementationWeb, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationWeb(), newImplementationWeb, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImplementationWeb(WebImplementation newImplementationWeb) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationWeb(), newImplementationWeb);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ImplementationType getImplementationType() {
        return (ImplementationType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationType(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImplementationType(ImplementationType newImplementationType, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationType(), newImplementationType, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImplementationType(ImplementationType newImplementationType) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationType(), newImplementationType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ImportType getImport() {
        return (ImportType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_Import(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImport(ImportType newImport, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_Import(), newImport, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImport(ImportType newImport) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_Import(), newImport);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Import getImportBase() {
        return (Import)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ImportBase(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImportBase(Import newImportBase, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ImportBase(), newImportBase, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CImport getImportC() {
        return (CImport)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ImportC(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImportC(CImport newImportC, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ImportC(), newImportC, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImportC(CImport newImportC) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ImportC(), newImportC);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CPPImport getImportCpp() {
        return (CPPImport)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ImportCpp(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImportCpp(CPPImport newImportCpp, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ImportCpp(), newImportCpp, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImportCpp(CPPImport newImportCpp) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ImportCpp(), newImportCpp);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaImportType getImportJava() {
        return (JavaImportType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_ImportJava(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImportJava(JavaImportType newImportJava, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_ImportJava(), newImportJava, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImportJava(JavaImportType newImportJava) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_ImportJava(), newImportJava);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Include getInclude() {
        return (Include)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_Include(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetInclude(Include newInclude, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_Include(), newInclude, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInclude(Include newInclude) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_Include(), newInclude);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Intent getIntent() {
        return (Intent)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_Intent(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetIntent(Intent newIntent, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_Intent(), newIntent, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIntent(Intent newIntent) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_Intent(), newIntent);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Interface getInterface() {
        return (Interface)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_Interface(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_Interface(), newInterface, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CInterface getInterfaceC() {
        return (CInterface)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceC(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetInterfaceC(CInterface newInterfaceC, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceC(), newInterfaceC, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInterfaceC(CInterface newInterfaceC) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceC(), newInterfaceC);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CPPInterface getInterfaceCpp() {
        return (CPPInterface)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceCpp(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetInterfaceCpp(CPPInterface newInterfaceCpp, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceCpp(), newInterfaceCpp, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInterfaceCpp(CPPInterface newInterfaceCpp) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceCpp(), newInterfaceCpp);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaInterface getInterfaceJava() {
        return (JavaInterface)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetInterfaceJava(JavaInterface newInterfaceJava, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(), newInterfaceJava, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInterfaceJava(JavaInterface newInterfaceJava) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(), newInterfaceJava);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WSDLPortType getInterfaceWsdl() {
        return (WSDLPortType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceWsdl(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetInterfaceWsdl(WSDLPortType newInterfaceWsdl, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceWsdl(), newInterfaceWsdl, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInterfaceWsdl(WSDLPortType newInterfaceWsdl) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceWsdl(), newInterfaceWsdl);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OperationSelectorType getOperationSelector() {
        return (OperationSelectorType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_OperationSelector(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetOperationSelector(OperationSelectorType newOperationSelector, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_OperationSelector(), newOperationSelector, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OperationSelectorType getOperationSelectorJmsDefault() {
        return (OperationSelectorType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_OperationSelectorJmsDefault(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetOperationSelectorJmsDefault(OperationSelectorType newOperationSelectorJmsDefault, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_OperationSelectorJmsDefault(), newOperationSelectorJmsDefault, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOperationSelectorJmsDefault(OperationSelectorType newOperationSelectorJmsDefault) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_OperationSelectorJmsDefault(), newOperationSelectorJmsDefault);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicySet getPolicySet() {
        return (PolicySet)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_PolicySet(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetPolicySet(PolicySet newPolicySet, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_PolicySet(), newPolicySet, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPolicySet(PolicySet newPolicySet) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_PolicySet(), newPolicySet);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicySetAttachment getPolicySetAttachment() {
        return (PolicySetAttachment)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_PolicySetAttachment(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetPolicySetAttachment(PolicySetAttachment newPolicySetAttachment, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_PolicySetAttachment(), newPolicySetAttachment, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPolicySetAttachment(PolicySetAttachment newPolicySetAttachment) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_PolicySetAttachment(), newPolicySetAttachment);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ValueType getValue() {
        return (ValueType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_Value(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetValue(ValueType newValue, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_Value(), newValue, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setValue(ValueType newValue) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_Value(), newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WireFormatType getWireFormat() {
        return (WireFormatType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_WireFormat(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetWireFormat(WireFormatType newWireFormat, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_WireFormat(), newWireFormat, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WireFormatType getWireFormatJmsDefault() {
        return (WireFormatType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_WireFormatJmsDefault(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetWireFormatJmsDefault(WireFormatType newWireFormatJmsDefault, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_WireFormatJmsDefault(), newWireFormatJmsDefault, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setWireFormatJmsDefault(WireFormatType newWireFormatJmsDefault) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_WireFormatJmsDefault(), newWireFormatJmsDefault);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WSCallbackType getWSCallback() {
        return (WSCallbackType)getMixed().get(ScaPackage.eINSTANCE.getDocumentRoot_WSCallback(), true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetWSCallback(WSCallbackType newWSCallback, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ScaPackage.eINSTANCE.getDocumentRoot_WSCallback(), newWSCallback, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setWSCallback(WSCallbackType newWSCallback) {
        ((FeatureMap.Internal)getMixed()).set(ScaPackage.eINSTANCE.getDocumentRoot_WSCallback(), newWSCallback);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getCallback1() {
        return callback1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCallback1(String newCallback1) {
        String oldCallback1 = callback1;
        callback1 = newCallback1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.DOCUMENT_ROOT__CALLBACK1, oldCallback1, callback1));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<QName> getRequires() {
        return requires;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRequires(List<QName> newRequires) {
        List<QName> oldRequires = requires;
        requires = newRequires;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.DOCUMENT_ROOT__REQUIRES, oldRequires, requires));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case ScaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case ScaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case ScaPackage.DOCUMENT_ROOT__BINDING:
                return basicSetBinding(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__BINDING_EJB:
                return basicSetBindingEjb(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__BINDING_JCA:
                return basicSetBindingJca(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__BINDING_JMS:
                return basicSetBindingJms(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__BINDING_SCA:
                return basicSetBindingSca(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__BINDING_WS:
                return basicSetBindingWs(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__BINDING_TYPE:
                return basicSetBindingType(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__CALLBACK:
                return basicSetCallback(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__COMPONENT_TYPE:
                return basicSetComponentType(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__COMPOSITE:
                return basicSetComposite(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__CONSTRAINING_TYPE:
                return basicSetConstrainingType(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__CONTRIBUTION:
                return basicSetContribution(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__DEFINITIONS:
                return basicSetDefinitions(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__DOCUMENTATION:
                return basicSetDocumentation(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__EXPORT:
                return basicSetExport(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__EXPORT_BASE:
                return basicSetExportBase(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__EXPORT_C:
                return basicSetExportC(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__EXPORT_CPP:
                return basicSetExportCpp(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__EXPORT_JAVA:
                return basicSetExportJava(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION:
                return basicSetImplementation(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPEL:
                return basicSetImplementationBpel(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_C:
                return basicSetImplementationC(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE:
                return basicSetImplementationComposite(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_CPP:
                return basicSetImplementationCpp(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_EJB:
                return basicSetImplementationEjb(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_JAVA:
                return basicSetImplementationJava(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_JEE:
                return basicSetImplementationJee(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_SPRING:
                return basicSetImplementationSpring(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_WEB:
                return basicSetImplementationWeb(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_TYPE:
                return basicSetImplementationType(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPORT:
                return basicSetImport(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPORT_BASE:
                return basicSetImportBase(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPORT_C:
                return basicSetImportC(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPORT_CPP:
                return basicSetImportCpp(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__IMPORT_JAVA:
                return basicSetImportJava(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__INCLUDE:
                return basicSetInclude(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__INTENT:
                return basicSetIntent(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__INTERFACE:
                return basicSetInterface(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_C:
                return basicSetInterfaceC(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_CPP:
                return basicSetInterfaceCpp(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_JAVA:
                return basicSetInterfaceJava(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_WSDL:
                return basicSetInterfaceWsdl(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__OPERATION_SELECTOR:
                return basicSetOperationSelector(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__OPERATION_SELECTOR_JMS_DEFAULT:
                return basicSetOperationSelectorJmsDefault(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__POLICY_SET:
                return basicSetPolicySet(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__POLICY_SET_ATTACHMENT:
                return basicSetPolicySetAttachment(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__VALUE:
                return basicSetValue(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__WIRE_FORMAT:
                return basicSetWireFormat(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__WIRE_FORMAT_JMS_DEFAULT:
                return basicSetWireFormatJmsDefault(null, msgs);
            case ScaPackage.DOCUMENT_ROOT__WS_CALLBACK:
                return basicSetWSCallback(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScaPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case ScaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case ScaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case ScaPackage.DOCUMENT_ROOT__BINDING:
                return getBinding();
            case ScaPackage.DOCUMENT_ROOT__BINDING_EJB:
                return getBindingEjb();
            case ScaPackage.DOCUMENT_ROOT__BINDING_JCA:
                return getBindingJca();
            case ScaPackage.DOCUMENT_ROOT__BINDING_JMS:
                return getBindingJms();
            case ScaPackage.DOCUMENT_ROOT__BINDING_SCA:
                return getBindingSca();
            case ScaPackage.DOCUMENT_ROOT__BINDING_WS:
                return getBindingWs();
            case ScaPackage.DOCUMENT_ROOT__BINDING_TYPE:
                return getBindingType();
            case ScaPackage.DOCUMENT_ROOT__CALLBACK:
                return getCallback();
            case ScaPackage.DOCUMENT_ROOT__COMPONENT_TYPE:
                return getComponentType();
            case ScaPackage.DOCUMENT_ROOT__COMPOSITE:
                return getComposite();
            case ScaPackage.DOCUMENT_ROOT__CONSTRAINING_TYPE:
                return getConstrainingType();
            case ScaPackage.DOCUMENT_ROOT__CONTRIBUTION:
                return getContribution();
            case ScaPackage.DOCUMENT_ROOT__DEFINITIONS:
                return getDefinitions();
            case ScaPackage.DOCUMENT_ROOT__DOCUMENTATION:
                return getDocumentation();
            case ScaPackage.DOCUMENT_ROOT__EXPORT:
                return getExport();
            case ScaPackage.DOCUMENT_ROOT__EXPORT_BASE:
                return getExportBase();
            case ScaPackage.DOCUMENT_ROOT__EXPORT_C:
                return getExportC();
            case ScaPackage.DOCUMENT_ROOT__EXPORT_CPP:
                return getExportCpp();
            case ScaPackage.DOCUMENT_ROOT__EXPORT_JAVA:
                return getExportJava();
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION:
                return getImplementation();
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPEL:
                return getImplementationBpel();
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_C:
                return getImplementationC();
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE:
                return getImplementationComposite();
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_CPP:
                return getImplementationCpp();
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_EJB:
                return getImplementationEjb();
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_JAVA:
                return getImplementationJava();
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_JEE:
                return getImplementationJee();
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_SPRING:
                return getImplementationSpring();
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_WEB:
                return getImplementationWeb();
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_TYPE:
                return getImplementationType();
            case ScaPackage.DOCUMENT_ROOT__IMPORT:
                return getImport();
            case ScaPackage.DOCUMENT_ROOT__IMPORT_BASE:
                return getImportBase();
            case ScaPackage.DOCUMENT_ROOT__IMPORT_C:
                return getImportC();
            case ScaPackage.DOCUMENT_ROOT__IMPORT_CPP:
                return getImportCpp();
            case ScaPackage.DOCUMENT_ROOT__IMPORT_JAVA:
                return getImportJava();
            case ScaPackage.DOCUMENT_ROOT__INCLUDE:
                return getInclude();
            case ScaPackage.DOCUMENT_ROOT__INTENT:
                return getIntent();
            case ScaPackage.DOCUMENT_ROOT__INTERFACE:
                return getInterface();
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_C:
                return getInterfaceC();
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_CPP:
                return getInterfaceCpp();
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_JAVA:
                return getInterfaceJava();
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_WSDL:
                return getInterfaceWsdl();
            case ScaPackage.DOCUMENT_ROOT__OPERATION_SELECTOR:
                return getOperationSelector();
            case ScaPackage.DOCUMENT_ROOT__OPERATION_SELECTOR_JMS_DEFAULT:
                return getOperationSelectorJmsDefault();
            case ScaPackage.DOCUMENT_ROOT__POLICY_SET:
                return getPolicySet();
            case ScaPackage.DOCUMENT_ROOT__POLICY_SET_ATTACHMENT:
                return getPolicySetAttachment();
            case ScaPackage.DOCUMENT_ROOT__VALUE:
                return getValue();
            case ScaPackage.DOCUMENT_ROOT__WIRE_FORMAT:
                return getWireFormat();
            case ScaPackage.DOCUMENT_ROOT__WIRE_FORMAT_JMS_DEFAULT:
                return getWireFormatJmsDefault();
            case ScaPackage.DOCUMENT_ROOT__WS_CALLBACK:
                return getWSCallback();
            case ScaPackage.DOCUMENT_ROOT__CALLBACK1:
                return getCallback1();
            case ScaPackage.DOCUMENT_ROOT__REQUIRES:
                return getRequires();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ScaPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__BINDING_EJB:
                setBindingEjb((EJBSessionBeanBinding)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__BINDING_JCA:
                setBindingJca((JCABinding)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__BINDING_JMS:
                setBindingJms((JMSBinding)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__BINDING_SCA:
                setBindingSca((SCABinding)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__BINDING_WS:
                setBindingWs((WebServiceBinding)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__BINDING_TYPE:
                setBindingType((BindingType)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__CALLBACK:
                setCallback((Callback)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__COMPONENT_TYPE:
                setComponentType((ComponentType)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__COMPOSITE:
                setComposite((Composite)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__CONSTRAINING_TYPE:
                setConstrainingType((ConstrainingType)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__CONTRIBUTION:
                setContribution((ContributionType)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__DEFINITIONS:
                setDefinitions((TDefinitions)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__DOCUMENTATION:
                setDocumentation((Documentation)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__EXPORT:
                setExport((ExportType)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__EXPORT_C:
                setExportC((CExport)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__EXPORT_CPP:
                setExportCpp((CPPExport)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__EXPORT_JAVA:
                setExportJava((JavaExportType)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPEL:
                setImplementationBpel((BPELImplementation)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_C:
                setImplementationC((CImplementation)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE:
                setImplementationComposite((SCAImplementation)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_CPP:
                setImplementationCpp((CPPImplementation)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_EJB:
                setImplementationEjb((EJBImplementation)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_JAVA:
                setImplementationJava((JavaImplementation)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_JEE:
                setImplementationJee((JEEImplementation)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_SPRING:
                setImplementationSpring((SpringImplementation)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_WEB:
                setImplementationWeb((WebImplementation)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_TYPE:
                setImplementationType((ImplementationType)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPORT:
                setImport((ImportType)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPORT_C:
                setImportC((CImport)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPORT_CPP:
                setImportCpp((CPPImport)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPORT_JAVA:
                setImportJava((JavaImportType)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__INCLUDE:
                setInclude((Include)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__INTENT:
                setIntent((Intent)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_C:
                setInterfaceC((CInterface)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_CPP:
                setInterfaceCpp((CPPInterface)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_JAVA:
                setInterfaceJava((JavaInterface)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_WSDL:
                setInterfaceWsdl((WSDLPortType)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__OPERATION_SELECTOR_JMS_DEFAULT:
                setOperationSelectorJmsDefault((OperationSelectorType)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__POLICY_SET:
                setPolicySet((PolicySet)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__POLICY_SET_ATTACHMENT:
                setPolicySetAttachment((PolicySetAttachment)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__VALUE:
                setValue((ValueType)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__WIRE_FORMAT_JMS_DEFAULT:
                setWireFormatJmsDefault((WireFormatType)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__WS_CALLBACK:
                setWSCallback((WSCallbackType)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__CALLBACK1:
                setCallback1((String)newValue);
                return;
            case ScaPackage.DOCUMENT_ROOT__REQUIRES:
                setRequires((List<QName>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case ScaPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case ScaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case ScaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case ScaPackage.DOCUMENT_ROOT__BINDING_EJB:
                setBindingEjb((EJBSessionBeanBinding)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__BINDING_JCA:
                setBindingJca((JCABinding)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__BINDING_JMS:
                setBindingJms((JMSBinding)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__BINDING_SCA:
                setBindingSca((SCABinding)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__BINDING_WS:
                setBindingWs((WebServiceBinding)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__BINDING_TYPE:
                setBindingType((BindingType)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__CALLBACK:
                setCallback((Callback)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__COMPONENT_TYPE:
                setComponentType((ComponentType)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__COMPOSITE:
                setComposite((Composite)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__CONSTRAINING_TYPE:
                setConstrainingType((ConstrainingType)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__CONTRIBUTION:
                setContribution((ContributionType)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__DEFINITIONS:
                setDefinitions((TDefinitions)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__DOCUMENTATION:
                setDocumentation((Documentation)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__EXPORT:
                setExport((ExportType)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__EXPORT_C:
                setExportC((CExport)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__EXPORT_CPP:
                setExportCpp((CPPExport)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__EXPORT_JAVA:
                setExportJava((JavaExportType)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPEL:
                setImplementationBpel((BPELImplementation)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_C:
                setImplementationC((CImplementation)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE:
                setImplementationComposite((SCAImplementation)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_CPP:
                setImplementationCpp((CPPImplementation)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_EJB:
                setImplementationEjb((EJBImplementation)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_JAVA:
                setImplementationJava((JavaImplementation)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_JEE:
                setImplementationJee((JEEImplementation)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_SPRING:
                setImplementationSpring((SpringImplementation)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_WEB:
                setImplementationWeb((WebImplementation)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_TYPE:
                setImplementationType((ImplementationType)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPORT:
                setImport((ImportType)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPORT_C:
                setImportC((CImport)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPORT_CPP:
                setImportCpp((CPPImport)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__IMPORT_JAVA:
                setImportJava((JavaImportType)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__INCLUDE:
                setInclude((Include)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__INTENT:
                setIntent((Intent)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_C:
                setInterfaceC((CInterface)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_CPP:
                setInterfaceCpp((CPPInterface)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_JAVA:
                setInterfaceJava((JavaInterface)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_WSDL:
                setInterfaceWsdl((WSDLPortType)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__OPERATION_SELECTOR_JMS_DEFAULT:
                setOperationSelectorJmsDefault((OperationSelectorType)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__POLICY_SET:
                setPolicySet((PolicySet)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__POLICY_SET_ATTACHMENT:
                setPolicySetAttachment((PolicySetAttachment)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__VALUE:
                setValue((ValueType)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__WIRE_FORMAT_JMS_DEFAULT:
                setWireFormatJmsDefault((WireFormatType)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__WS_CALLBACK:
                setWSCallback((WSCallbackType)null);
                return;
            case ScaPackage.DOCUMENT_ROOT__CALLBACK1:
                setCallback1(CALLBACK1_EDEFAULT);
                return;
            case ScaPackage.DOCUMENT_ROOT__REQUIRES:
                setRequires(REQUIRES_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ScaPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case ScaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case ScaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case ScaPackage.DOCUMENT_ROOT__BINDING:
                return getBinding() != null;
            case ScaPackage.DOCUMENT_ROOT__BINDING_EJB:
                return getBindingEjb() != null;
            case ScaPackage.DOCUMENT_ROOT__BINDING_JCA:
                return getBindingJca() != null;
            case ScaPackage.DOCUMENT_ROOT__BINDING_JMS:
                return getBindingJms() != null;
            case ScaPackage.DOCUMENT_ROOT__BINDING_SCA:
                return getBindingSca() != null;
            case ScaPackage.DOCUMENT_ROOT__BINDING_WS:
                return getBindingWs() != null;
            case ScaPackage.DOCUMENT_ROOT__BINDING_TYPE:
                return getBindingType() != null;
            case ScaPackage.DOCUMENT_ROOT__CALLBACK:
                return getCallback() != null;
            case ScaPackage.DOCUMENT_ROOT__COMPONENT_TYPE:
                return getComponentType() != null;
            case ScaPackage.DOCUMENT_ROOT__COMPOSITE:
                return getComposite() != null;
            case ScaPackage.DOCUMENT_ROOT__CONSTRAINING_TYPE:
                return getConstrainingType() != null;
            case ScaPackage.DOCUMENT_ROOT__CONTRIBUTION:
                return getContribution() != null;
            case ScaPackage.DOCUMENT_ROOT__DEFINITIONS:
                return getDefinitions() != null;
            case ScaPackage.DOCUMENT_ROOT__DOCUMENTATION:
                return getDocumentation() != null;
            case ScaPackage.DOCUMENT_ROOT__EXPORT:
                return getExport() != null;
            case ScaPackage.DOCUMENT_ROOT__EXPORT_BASE:
                return getExportBase() != null;
            case ScaPackage.DOCUMENT_ROOT__EXPORT_C:
                return getExportC() != null;
            case ScaPackage.DOCUMENT_ROOT__EXPORT_CPP:
                return getExportCpp() != null;
            case ScaPackage.DOCUMENT_ROOT__EXPORT_JAVA:
                return getExportJava() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION:
                return getImplementation() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPEL:
                return getImplementationBpel() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_C:
                return getImplementationC() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE:
                return getImplementationComposite() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_CPP:
                return getImplementationCpp() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_EJB:
                return getImplementationEjb() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_JAVA:
                return getImplementationJava() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_JEE:
                return getImplementationJee() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_SPRING:
                return getImplementationSpring() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_WEB:
                return getImplementationWeb() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_TYPE:
                return getImplementationType() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPORT:
                return getImport() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPORT_BASE:
                return getImportBase() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPORT_C:
                return getImportC() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPORT_CPP:
                return getImportCpp() != null;
            case ScaPackage.DOCUMENT_ROOT__IMPORT_JAVA:
                return getImportJava() != null;
            case ScaPackage.DOCUMENT_ROOT__INCLUDE:
                return getInclude() != null;
            case ScaPackage.DOCUMENT_ROOT__INTENT:
                return getIntent() != null;
            case ScaPackage.DOCUMENT_ROOT__INTERFACE:
                return getInterface() != null;
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_C:
                return getInterfaceC() != null;
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_CPP:
                return getInterfaceCpp() != null;
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_JAVA:
                return getInterfaceJava() != null;
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_WSDL:
                return getInterfaceWsdl() != null;
            case ScaPackage.DOCUMENT_ROOT__OPERATION_SELECTOR:
                return getOperationSelector() != null;
            case ScaPackage.DOCUMENT_ROOT__OPERATION_SELECTOR_JMS_DEFAULT:
                return getOperationSelectorJmsDefault() != null;
            case ScaPackage.DOCUMENT_ROOT__POLICY_SET:
                return getPolicySet() != null;
            case ScaPackage.DOCUMENT_ROOT__POLICY_SET_ATTACHMENT:
                return getPolicySetAttachment() != null;
            case ScaPackage.DOCUMENT_ROOT__VALUE:
                return getValue() != null;
            case ScaPackage.DOCUMENT_ROOT__WIRE_FORMAT:
                return getWireFormat() != null;
            case ScaPackage.DOCUMENT_ROOT__WIRE_FORMAT_JMS_DEFAULT:
                return getWireFormatJmsDefault() != null;
            case ScaPackage.DOCUMENT_ROOT__WS_CALLBACK:
                return getWSCallback() != null;
            case ScaPackage.DOCUMENT_ROOT__CALLBACK1:
                return CALLBACK1_EDEFAULT == null ? callback1 != null : !CALLBACK1_EDEFAULT.equals(callback1);
            case ScaPackage.DOCUMENT_ROOT__REQUIRES:
                return REQUIRES_EDEFAULT == null ? requires != null : !REQUIRES_EDEFAULT.equals(requires);
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(", callback1: ");
        result.append(callback1);
        result.append(", requires: ");
        result.append(requires);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
