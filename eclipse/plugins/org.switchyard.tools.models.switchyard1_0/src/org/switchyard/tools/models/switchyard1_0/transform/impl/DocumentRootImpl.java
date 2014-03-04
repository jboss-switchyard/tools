/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.transform.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.transform.DozerTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.JsonTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;
import org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DocumentRootImpl#getTransformDozer <em>Transform Dozer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DocumentRootImpl#getTransformJava <em>Transform Java</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DocumentRootImpl#getTransformJaxb <em>Transform Jaxb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DocumentRootImpl#getTransformJson <em>Transform Json</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DocumentRootImpl#getTransformSmooks <em>Transform Smooks</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DocumentRootImpl#getTransformXslt <em>Transform Xslt</em>}</li>
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
        return TransformPackage.Literals.DOCUMENT_ROOT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, TransformPackage.DOCUMENT_ROOT__MIXED);
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
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TransformPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TransformPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DozerTransformType getTransformDozer() {
        return (DozerTransformType)getMixed().get(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_DOZER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransformDozer(DozerTransformType newTransformDozer, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_DOZER, newTransformDozer, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransformDozer(DozerTransformType newTransformDozer) {
        ((FeatureMap.Internal)getMixed()).set(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_DOZER, newTransformDozer);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaTransformType1 getTransformJava() {
        return (JavaTransformType1)getMixed().get(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_JAVA, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTransformJava(JavaTransformType1 newTransformJava, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_JAVA, newTransformJava, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTransformJava(JavaTransformType1 newTransformJava) {
        ((FeatureMap.Internal)getMixed()).set(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_JAVA, newTransformJava);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JAXBTransformType getTransformJaxb() {
        return (JAXBTransformType)getMixed().get(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_JAXB, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTransformJaxb(JAXBTransformType newTransformJaxb, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_JAXB, newTransformJaxb, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTransformJaxb(JAXBTransformType newTransformJaxb) {
        ((FeatureMap.Internal)getMixed()).set(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_JAXB, newTransformJaxb);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JsonTransformType getTransformJson() {
        return (JsonTransformType)getMixed().get(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_JSON, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTransformJson(JsonTransformType newTransformJson, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_JSON, newTransformJson, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTransformJson(JsonTransformType newTransformJson) {
        ((FeatureMap.Internal)getMixed()).set(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_JSON, newTransformJson);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SmooksTransformType1 getTransformSmooks() {
        return (SmooksTransformType1)getMixed().get(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_SMOOKS, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTransformSmooks(SmooksTransformType1 newTransformSmooks, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_SMOOKS, newTransformSmooks, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTransformSmooks(SmooksTransformType1 newTransformSmooks) {
        ((FeatureMap.Internal)getMixed()).set(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_SMOOKS, newTransformSmooks);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XsltTransformType getTransformXslt() {
        return (XsltTransformType)getMixed().get(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_XSLT, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTransformXslt(XsltTransformType newTransformXslt, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_XSLT, newTransformXslt, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTransformXslt(XsltTransformType newTransformXslt) {
        ((FeatureMap.Internal)getMixed()).set(TransformPackage.Literals.DOCUMENT_ROOT__TRANSFORM_XSLT, newTransformXslt);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TransformPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case TransformPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case TransformPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_DOZER:
                return basicSetTransformDozer(null, msgs);
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JAVA:
                return basicSetTransformJava(null, msgs);
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JAXB:
                return basicSetTransformJaxb(null, msgs);
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JSON:
                return basicSetTransformJson(null, msgs);
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_SMOOKS:
                return basicSetTransformSmooks(null, msgs);
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_XSLT:
                return basicSetTransformXslt(null, msgs);
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
            case TransformPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case TransformPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case TransformPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_DOZER:
                return getTransformDozer();
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JAVA:
                return getTransformJava();
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JAXB:
                return getTransformJaxb();
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JSON:
                return getTransformJson();
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_SMOOKS:
                return getTransformSmooks();
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_XSLT:
                return getTransformXslt();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TransformPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case TransformPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case TransformPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_DOZER:
                setTransformDozer((DozerTransformType)newValue);
                return;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JAVA:
                setTransformJava((JavaTransformType1)newValue);
                return;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JAXB:
                setTransformJaxb((JAXBTransformType)newValue);
                return;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JSON:
                setTransformJson((JsonTransformType)newValue);
                return;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_SMOOKS:
                setTransformSmooks((SmooksTransformType1)newValue);
                return;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_XSLT:
                setTransformXslt((XsltTransformType)newValue);
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
            case TransformPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case TransformPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case TransformPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_DOZER:
                setTransformDozer((DozerTransformType)null);
                return;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JAVA:
                setTransformJava((JavaTransformType1)null);
                return;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JAXB:
                setTransformJaxb((JAXBTransformType)null);
                return;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JSON:
                setTransformJson((JsonTransformType)null);
                return;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_SMOOKS:
                setTransformSmooks((SmooksTransformType1)null);
                return;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_XSLT:
                setTransformXslt((XsltTransformType)null);
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
            case TransformPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case TransformPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case TransformPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_DOZER:
                return getTransformDozer() != null;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JAVA:
                return getTransformJava() != null;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JAXB:
                return getTransformJaxb() != null;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_JSON:
                return getTransformJson() != null;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_SMOOKS:
                return getTransformSmooks() != null;
            case TransformPackage.DOCUMENT_ROOT__TRANSFORM_XSLT:
                return getTransformXslt() != null;
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
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
