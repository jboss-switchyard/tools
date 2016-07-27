/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;
import org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Mapper Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.ContextMapperTypeImpl#getSoapHeadersType <em>Soap Headers Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextMapperTypeImpl extends org.switchyard.tools.models.switchyard1_0.switchyard.impl.ContextMapperTypeImpl implements ContextMapperType {
    /**
     * The default value of the '{@link #getSoapHeadersType() <em>Soap Headers Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSoapHeadersType()
     * @generated
     * @ordered
     */
    protected static final SoapHeadersType SOAP_HEADERS_TYPE_EDEFAULT = SoapHeadersType.VALUE;

    /**
     * The cached value of the '{@link #getSoapHeadersType() <em>Soap Headers Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSoapHeadersType()
     * @generated
     * @ordered
     */
    protected SoapHeadersType soapHeadersType = SOAP_HEADERS_TYPE_EDEFAULT;

    /**
     * This is true if the Soap Headers Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean soapHeadersTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextMapperTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SOAPPackage.Literals.CONTEXT_MAPPER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SoapHeadersType getSoapHeadersType() {
        return soapHeadersType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSoapHeadersType(SoapHeadersType newSoapHeadersType) {
        SoapHeadersType oldSoapHeadersType = soapHeadersType;
        soapHeadersType = newSoapHeadersType == null ? SOAP_HEADERS_TYPE_EDEFAULT : newSoapHeadersType;
        boolean oldSoapHeadersTypeESet = soapHeadersTypeESet;
        soapHeadersTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.CONTEXT_MAPPER_TYPE__SOAP_HEADERS_TYPE, oldSoapHeadersType, soapHeadersType, !oldSoapHeadersTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSoapHeadersType() {
        SoapHeadersType oldSoapHeadersType = soapHeadersType;
        boolean oldSoapHeadersTypeESet = soapHeadersTypeESet;
        soapHeadersType = SOAP_HEADERS_TYPE_EDEFAULT;
        soapHeadersTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SOAPPackage.CONTEXT_MAPPER_TYPE__SOAP_HEADERS_TYPE, oldSoapHeadersType, SOAP_HEADERS_TYPE_EDEFAULT, oldSoapHeadersTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSoapHeadersType() {
        return soapHeadersTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SOAPPackage.CONTEXT_MAPPER_TYPE__SOAP_HEADERS_TYPE:
                return getSoapHeadersType();
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
            case SOAPPackage.CONTEXT_MAPPER_TYPE__SOAP_HEADERS_TYPE:
                setSoapHeadersType((SoapHeadersType)newValue);
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
            case SOAPPackage.CONTEXT_MAPPER_TYPE__SOAP_HEADERS_TYPE:
                unsetSoapHeadersType();
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
            case SOAPPackage.CONTEXT_MAPPER_TYPE__SOAP_HEADERS_TYPE:
                return isSetSoapHeadersType();
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
        result.append(" (soapHeadersType: ");
        if (soapHeadersTypeESet) result.append(soapHeadersType); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ContextMapperTypeImpl
