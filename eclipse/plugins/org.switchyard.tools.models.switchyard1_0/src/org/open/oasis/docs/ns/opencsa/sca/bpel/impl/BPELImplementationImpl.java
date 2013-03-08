/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.ns.opencsa.sca.bpel.impl;

import javax.xml.namespace.QName;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.impl.ImplementationImpl;

import org.open.oasis.docs.ns.opencsa.sca.bpel.BPELImplementation;
import org.open.oasis.docs.ns.opencsa.sca.bpel.BPELPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.bpel.impl.BPELImplementationImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.bpel.impl.BPELImplementationImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPELImplementationImpl extends ImplementationImpl implements BPELImplementation {
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
        return BPELPackage.Literals.BPEL_IMPLEMENTATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getProcess() {
        return process;
    }

    public void setProcess(QName newProcess) {
        setProcessGen(newProcess == null ? null : XMLTypeFactory.eINSTANCE.createQName(newProcess.getNamespaceURI(),
                newProcess.getLocalPart(), newProcess.getPrefix()));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessGen(QName newProcess) {
        QName oldProcess = process;
        process = newProcess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPELPackage.BPEL_IMPLEMENTATION__PROCESS, oldProcess, process));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAnyAttribute1() {
        if (anyAttribute1 == null) {
            anyAttribute1 = new BasicFeatureMap(this, BPELPackage.BPEL_IMPLEMENTATION__ANY_ATTRIBUTE1);
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
            case BPELPackage.BPEL_IMPLEMENTATION__ANY_ATTRIBUTE1:
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
            case BPELPackage.BPEL_IMPLEMENTATION__PROCESS:
                return getProcess();
            case BPELPackage.BPEL_IMPLEMENTATION__ANY_ATTRIBUTE1:
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
            case BPELPackage.BPEL_IMPLEMENTATION__PROCESS:
                setProcess((QName)newValue);
                return;
            case BPELPackage.BPEL_IMPLEMENTATION__ANY_ATTRIBUTE1:
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
            case BPELPackage.BPEL_IMPLEMENTATION__PROCESS:
                setProcess(PROCESS_EDEFAULT);
                return;
            case BPELPackage.BPEL_IMPLEMENTATION__ANY_ATTRIBUTE1:
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
            case BPELPackage.BPEL_IMPLEMENTATION__PROCESS:
                return PROCESS_EDEFAULT == null ? process != null : !PROCESS_EDEFAULT.equals(process);
            case BPELPackage.BPEL_IMPLEMENTATION__ANY_ATTRIBUTE1:
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
        result.append(" (process: ");
        result.append(process);
        result.append(", anyAttribute1: ");
        result.append(anyAttribute1);
        result.append(')');
        return result.toString();
    }

} //BPELImplementationImpl
