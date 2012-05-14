/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.SoapJaxbDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soap Jaxb Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SoapJaxbDataFormatImpl#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SoapJaxbDataFormatImpl#getElementNameStrategyRef <em>Element Name Strategy Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SoapJaxbDataFormatImpl#getEncoding <em>Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoapJaxbDataFormatImpl extends DataFormatImpl implements SoapJaxbDataFormat {
	/**
     * The default value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getContextPath()
     * @generated
     * @ordered
     */
	protected static final String CONTEXT_PATH_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getContextPath()
     * @generated
     * @ordered
     */
	protected String contextPath = CONTEXT_PATH_EDEFAULT;

	/**
     * The default value of the '{@link #getElementNameStrategyRef() <em>Element Name Strategy Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getElementNameStrategyRef()
     * @generated
     * @ordered
     */
	protected static final String ELEMENT_NAME_STRATEGY_REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getElementNameStrategyRef() <em>Element Name Strategy Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getElementNameStrategyRef()
     * @generated
     * @ordered
     */
	protected String elementNameStrategyRef = ELEMENT_NAME_STRATEGY_REF_EDEFAULT;

	/**
     * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEncoding()
     * @generated
     * @ordered
     */
	protected static final String ENCODING_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEncoding()
     * @generated
     * @ordered
     */
	protected String encoding = ENCODING_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SoapJaxbDataFormatImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getSoapJaxbDataFormat();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getContextPath() {
        return contextPath;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setContextPath(String newContextPath) {
        String oldContextPath = contextPath;
        contextPath = newContextPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.SOAP_JAXB_DATA_FORMAT__CONTEXT_PATH, oldContextPath, contextPath));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getElementNameStrategyRef() {
        return elementNameStrategyRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setElementNameStrategyRef(String newElementNameStrategyRef) {
        String oldElementNameStrategyRef = elementNameStrategyRef;
        elementNameStrategyRef = newElementNameStrategyRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.SOAP_JAXB_DATA_FORMAT__ELEMENT_NAME_STRATEGY_REF, oldElementNameStrategyRef, elementNameStrategyRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getEncoding() {
        return encoding;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEncoding(String newEncoding) {
        String oldEncoding = encoding;
        encoding = newEncoding;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.SOAP_JAXB_DATA_FORMAT__ENCODING, oldEncoding, encoding));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.SOAP_JAXB_DATA_FORMAT__CONTEXT_PATH:
                return getContextPath();
            case SpringPackage.SOAP_JAXB_DATA_FORMAT__ELEMENT_NAME_STRATEGY_REF:
                return getElementNameStrategyRef();
            case SpringPackage.SOAP_JAXB_DATA_FORMAT__ENCODING:
                return getEncoding();
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
            case SpringPackage.SOAP_JAXB_DATA_FORMAT__CONTEXT_PATH:
                setContextPath((String)newValue);
                return;
            case SpringPackage.SOAP_JAXB_DATA_FORMAT__ELEMENT_NAME_STRATEGY_REF:
                setElementNameStrategyRef((String)newValue);
                return;
            case SpringPackage.SOAP_JAXB_DATA_FORMAT__ENCODING:
                setEncoding((String)newValue);
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
            case SpringPackage.SOAP_JAXB_DATA_FORMAT__CONTEXT_PATH:
                setContextPath(CONTEXT_PATH_EDEFAULT);
                return;
            case SpringPackage.SOAP_JAXB_DATA_FORMAT__ELEMENT_NAME_STRATEGY_REF:
                setElementNameStrategyRef(ELEMENT_NAME_STRATEGY_REF_EDEFAULT);
                return;
            case SpringPackage.SOAP_JAXB_DATA_FORMAT__ENCODING:
                setEncoding(ENCODING_EDEFAULT);
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
            case SpringPackage.SOAP_JAXB_DATA_FORMAT__CONTEXT_PATH:
                return CONTEXT_PATH_EDEFAULT == null ? contextPath != null : !CONTEXT_PATH_EDEFAULT.equals(contextPath);
            case SpringPackage.SOAP_JAXB_DATA_FORMAT__ELEMENT_NAME_STRATEGY_REF:
                return ELEMENT_NAME_STRATEGY_REF_EDEFAULT == null ? elementNameStrategyRef != null : !ELEMENT_NAME_STRATEGY_REF_EDEFAULT.equals(elementNameStrategyRef);
            case SpringPackage.SOAP_JAXB_DATA_FORMAT__ENCODING:
                return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
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
        result.append(" (contextPath: ");
        result.append(contextPath);
        result.append(", elementNameStrategyRef: ");
        result.append(elementNameStrategyRef);
        result.append(", encoding: ");
        result.append(encoding);
        result.append(')');
        return result.toString();
    }

} //SoapJaxbDataFormatImpl
