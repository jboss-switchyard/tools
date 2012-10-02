/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPEL Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BPELImplementationImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BPELImplementationImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BPELImplementationImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPELImplementationImpl extends ImplementationImpl implements BPELImplementation {
	/**
     * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAny()
     * @generated
     * @ordered
     */
	protected FeatureMap any;

	/**
     * The default value of the '{@link #getProcess() <em>Process</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProcess()
     * @generated
     * @ordered
     */
	protected static final QName PROCESS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getProcess() <em>Process</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProcess()
     * @generated
     * @ordered
     */
	protected QName process = PROCESS_EDEFAULT;

	/**
     * The cached value of the '{@link #getAnyAttribute1() <em>Any Attribute1</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute1()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute1;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BPELImplementationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getBPELImplementation();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.BPEL_IMPLEMENTATION__ANY);
        }
        return any;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QName getProcess() {
        return process;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setProcess(QName newProcess) {
        QName oldProcess = process;
        process = newProcess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.BPEL_IMPLEMENTATION__PROCESS, oldProcess, process));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute1() {
        if (anyAttribute1 == null) {
            anyAttribute1 = new BasicFeatureMap(this, ScaPackage.BPEL_IMPLEMENTATION__ANY_ATTRIBUTE1);
        }
        return anyAttribute1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.BPEL_IMPLEMENTATION__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case ScaPackage.BPEL_IMPLEMENTATION__ANY_ATTRIBUTE1:
                return ((InternalEList<?>)getAnyAttribute1()).basicRemove(otherEnd, msgs);
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
            case ScaPackage.BPEL_IMPLEMENTATION__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.BPEL_IMPLEMENTATION__PROCESS:
                return getProcess();
            case ScaPackage.BPEL_IMPLEMENTATION__ANY_ATTRIBUTE1:
                if (coreType) return getAnyAttribute1();
                return ((FeatureMap.Internal)getAnyAttribute1()).getWrapper();
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
            case ScaPackage.BPEL_IMPLEMENTATION__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.BPEL_IMPLEMENTATION__PROCESS:
                setProcess((QName)newValue);
                return;
            case ScaPackage.BPEL_IMPLEMENTATION__ANY_ATTRIBUTE1:
                ((FeatureMap.Internal)getAnyAttribute1()).set(newValue);
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
            case ScaPackage.BPEL_IMPLEMENTATION__ANY:
                getAny().clear();
                return;
            case ScaPackage.BPEL_IMPLEMENTATION__PROCESS:
                setProcess(PROCESS_EDEFAULT);
                return;
            case ScaPackage.BPEL_IMPLEMENTATION__ANY_ATTRIBUTE1:
                getAnyAttribute1().clear();
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
            case ScaPackage.BPEL_IMPLEMENTATION__ANY:
                return any != null && !any.isEmpty();
            case ScaPackage.BPEL_IMPLEMENTATION__PROCESS:
                return PROCESS_EDEFAULT == null ? process != null : !PROCESS_EDEFAULT.equals(process);
            case ScaPackage.BPEL_IMPLEMENTATION__ANY_ATTRIBUTE1:
                return anyAttribute1 != null && !anyAttribute1.isEmpty();
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
        result.append(" (any: ");
        result.append(any);
        result.append(", process: ");
        result.append(process);
        result.append(", anyAttribute1: ");
        result.append(anyAttribute1);
        result.append(')');
        return result.toString();
    }

} //BPELImplementationImpl
