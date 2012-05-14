/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.ImplementationImpl;


import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType;
import org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType;
import org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelImplementationTypeImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelImplementationTypeImpl#getJava <em>Java</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelImplementationTypeImpl#getXml <em>Xml</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelImplementationTypeImpl extends ImplementationImpl implements CamelImplementationType {
	/**
     * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRoute()
     * @generated
     * @ordered
     */
	protected RouteDefinition route;

	/**
     * The cached value of the '{@link #getJava() <em>Java</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJava()
     * @generated
     * @ordered
     */
	protected JavaDSLType java;

	/**
     * The cached value of the '{@link #getXml() <em>Xml</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXml()
     * @generated
     * @ordered
     */
    protected XMLDSLType xml;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CamelImplementationTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return CamelPackage.Literals.CAMEL_IMPLEMENTATION_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RouteDefinition getRoute() {
        return route;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetRoute(RouteDefinition newRoute, NotificationChain msgs) {
        RouteDefinition oldRoute = route;
        route = newRoute;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_IMPLEMENTATION_TYPE__ROUTE, oldRoute, newRoute);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRoute(RouteDefinition newRoute) {
        if (newRoute != route) {
            NotificationChain msgs = null;
            if (route != null)
                msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_IMPLEMENTATION_TYPE__ROUTE, null, msgs);
            if (newRoute != null)
                msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_IMPLEMENTATION_TYPE__ROUTE, null, msgs);
            msgs = basicSetRoute(newRoute, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_IMPLEMENTATION_TYPE__ROUTE, newRoute, newRoute));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaDSLType getJava() {
        return java;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetJava(JavaDSLType newJava, NotificationChain msgs) {
        JavaDSLType oldJava = java;
        java = newJava;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_IMPLEMENTATION_TYPE__JAVA, oldJava, newJava);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setJava(JavaDSLType newJava) {
        if (newJava != java) {
            NotificationChain msgs = null;
            if (java != null)
                msgs = ((InternalEObject)java).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_IMPLEMENTATION_TYPE__JAVA, null, msgs);
            if (newJava != null)
                msgs = ((InternalEObject)newJava).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_IMPLEMENTATION_TYPE__JAVA, null, msgs);
            msgs = basicSetJava(newJava, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_IMPLEMENTATION_TYPE__JAVA, newJava, newJava));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLDSLType getXml() {
        return xml;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetXml(XMLDSLType newXml, NotificationChain msgs) {
        XMLDSLType oldXml = xml;
        xml = newXml;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_IMPLEMENTATION_TYPE__XML, oldXml, newXml);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXml(XMLDSLType newXml) {
        if (newXml != xml) {
            NotificationChain msgs = null;
            if (xml != null)
                msgs = ((InternalEObject)xml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_IMPLEMENTATION_TYPE__XML, null, msgs);
            if (newXml != null)
                msgs = ((InternalEObject)newXml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_IMPLEMENTATION_TYPE__XML, null, msgs);
            msgs = basicSetXml(newXml, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_IMPLEMENTATION_TYPE__XML, newXml, newXml));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__ROUTE:
                return basicSetRoute(null, msgs);
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__JAVA:
                return basicSetJava(null, msgs);
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__XML:
                return basicSetXml(null, msgs);
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
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__ROUTE:
                return getRoute();
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__JAVA:
                return getJava();
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__XML:
                return getXml();
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
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__ROUTE:
                setRoute((RouteDefinition)newValue);
                return;
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__JAVA:
                setJava((JavaDSLType)newValue);
                return;
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__XML:
                setXml((XMLDSLType)newValue);
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
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__ROUTE:
                setRoute((RouteDefinition)null);
                return;
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__JAVA:
                setJava((JavaDSLType)null);
                return;
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__XML:
                setXml((XMLDSLType)null);
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
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__ROUTE:
                return route != null;
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__JAVA:
                return java != null;
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE__XML:
                return xml != null;
        }
        return super.eIsSet(featureID);
    }

} //CamelImplementationTypeImpl
