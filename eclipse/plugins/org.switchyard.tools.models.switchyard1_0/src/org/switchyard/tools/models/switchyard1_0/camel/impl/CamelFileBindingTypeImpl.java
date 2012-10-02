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


import org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.FileProducerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl#getProduce <em>Produce</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelFileBindingTypeImpl extends GenericFileBindingTypeImpl implements CamelFileBindingType {
	/**
     * The cached value of the '{@link #getConsume() <em>Consume</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConsume()
     * @generated
     * @ordered
     */
	protected FileConsumerType consume;

	/**
     * The cached value of the '{@link #getProduce() <em>Produce</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProduce()
     * @generated
     * @ordered
     */
	protected FileProducerType produce;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CamelFileBindingTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return CamelPackage.Literals.CAMEL_FILE_BINDING_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FileConsumerType getConsume() {
        return consume;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetConsume(FileConsumerType newConsume, NotificationChain msgs) {
        FileConsumerType oldConsume = consume;
        consume = newConsume;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME, oldConsume, newConsume);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConsume(FileConsumerType newConsume) {
        if (newConsume != consume) {
            NotificationChain msgs = null;
            if (consume != null)
                msgs = ((InternalEObject)consume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME, null, msgs);
            if (newConsume != null)
                msgs = ((InternalEObject)newConsume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME, null, msgs);
            msgs = basicSetConsume(newConsume, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME, newConsume, newConsume));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FileProducerType getProduce() {
        return produce;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetProduce(FileProducerType newProduce, NotificationChain msgs) {
        FileProducerType oldProduce = produce;
        produce = newProduce;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE, oldProduce, newProduce);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setProduce(FileProducerType newProduce) {
        if (newProduce != produce) {
            NotificationChain msgs = null;
            if (produce != null)
                msgs = ((InternalEObject)produce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE, null, msgs);
            if (newProduce != null)
                msgs = ((InternalEObject)newProduce).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE, null, msgs);
            msgs = basicSetProduce(newProduce, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE, newProduce, newProduce));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME:
                return basicSetConsume(null, msgs);
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE:
                return basicSetProduce(null, msgs);
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
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME:
                return getConsume();
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE:
                return getProduce();
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
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME:
                setConsume((FileConsumerType)newValue);
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE:
                setProduce((FileProducerType)newValue);
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
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME:
                setConsume((FileConsumerType)null);
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE:
                setProduce((FileProducerType)null);
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
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME:
                return consume != null;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE:
                return produce != null;
        }
        return super.eIsSet(featureID);
    }

} //CamelFileBindingTypeImpl
