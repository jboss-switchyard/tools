/**
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.soap.InterceptorType;
import org.switchyard.tools.models.switchyard1_0.soap.InterceptorsType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interceptors Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.InterceptorsTypeImpl#getInterceptor <em>Interceptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterceptorsTypeImpl extends CommonExtensionBaseImpl implements InterceptorsType {
    /**
     * The cached value of the '{@link #getInterceptor() <em>Interceptor</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterceptor()
     * @generated
     * @ordered
     */
    protected EList<InterceptorType> interceptor;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InterceptorsTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SOAPPackage.Literals.INTERCEPTORS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InterceptorType> getInterceptor() {
        if (interceptor == null) {
            interceptor = new EObjectContainmentEList<InterceptorType>(InterceptorType.class, this, SOAPPackage.INTERCEPTORS_TYPE__INTERCEPTOR);
        }
        return interceptor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SOAPPackage.INTERCEPTORS_TYPE__INTERCEPTOR:
                return ((InternalEList<?>)getInterceptor()).basicRemove(otherEnd, msgs);
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
            case SOAPPackage.INTERCEPTORS_TYPE__INTERCEPTOR:
                return getInterceptor();
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
            case SOAPPackage.INTERCEPTORS_TYPE__INTERCEPTOR:
                getInterceptor().clear();
                getInterceptor().addAll((Collection<? extends InterceptorType>)newValue);
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
            case SOAPPackage.INTERCEPTORS_TYPE__INTERCEPTOR:
                getInterceptor().clear();
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
            case SOAPPackage.INTERCEPTORS_TYPE__INTERCEPTOR:
                return interceptor != null && !interceptor.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //InterceptorsTypeImpl
