/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec;
import org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.Operation;
import org.switchyard.tools.models.switchyard1_0.jca.Processor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JCA Outbound Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundInteractionImpl#getConnectionSpec <em>Connection Spec</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundInteractionImpl#getInteractionSpec <em>Interaction Spec</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundInteractionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundInteractionImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundInteractionImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundInteractionImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JCAOutboundInteractionImpl extends EObjectImpl implements JCAOutboundInteraction {
    /**
     * The cached value of the '{@link #getConnectionSpec() <em>Connection Spec</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionSpec()
     * @generated
     * @ordered
     */
    protected ConnectionSpec connectionSpec;

    /**
     * The cached value of the '{@link #getInteractionSpec() <em>Interaction Spec</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInteractionSpec()
     * @generated
     * @ordered
     */
    protected InteractionSpec interactionSpec;

    /**
     * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected Operation operation;

    /**
     * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessor()
     * @generated
     * @ordered
     */
    protected Processor processor;

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
     * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnyAttribute()
     * @generated
     * @ordered
     */
    protected FeatureMap anyAttribute;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JCAOutboundInteractionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JcaPackage.Literals.JCA_OUTBOUND_INTERACTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionSpec getConnectionSpec() {
        return connectionSpec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConnectionSpec(ConnectionSpec newConnectionSpec, NotificationChain msgs) {
        ConnectionSpec oldConnectionSpec = connectionSpec;
        connectionSpec = newConnectionSpec;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_OUTBOUND_INTERACTION__CONNECTION_SPEC, oldConnectionSpec, newConnectionSpec);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectionSpec(ConnectionSpec newConnectionSpec) {
        if (newConnectionSpec != connectionSpec) {
            NotificationChain msgs = null;
            if (connectionSpec != null)
                msgs = ((InternalEObject)connectionSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_OUTBOUND_INTERACTION__CONNECTION_SPEC, null, msgs);
            if (newConnectionSpec != null)
                msgs = ((InternalEObject)newConnectionSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_OUTBOUND_INTERACTION__CONNECTION_SPEC, null, msgs);
            msgs = basicSetConnectionSpec(newConnectionSpec, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_OUTBOUND_INTERACTION__CONNECTION_SPEC, newConnectionSpec, newConnectionSpec));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionSpec getInteractionSpec() {
        return interactionSpec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInteractionSpec(InteractionSpec newInteractionSpec, NotificationChain msgs) {
        InteractionSpec oldInteractionSpec = interactionSpec;
        interactionSpec = newInteractionSpec;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_OUTBOUND_INTERACTION__INTERACTION_SPEC, oldInteractionSpec, newInteractionSpec);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInteractionSpec(InteractionSpec newInteractionSpec) {
        if (newInteractionSpec != interactionSpec) {
            NotificationChain msgs = null;
            if (interactionSpec != null)
                msgs = ((InternalEObject)interactionSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_OUTBOUND_INTERACTION__INTERACTION_SPEC, null, msgs);
            if (newInteractionSpec != null)
                msgs = ((InternalEObject)newInteractionSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_OUTBOUND_INTERACTION__INTERACTION_SPEC, null, msgs);
            msgs = basicSetInteractionSpec(newInteractionSpec, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_OUTBOUND_INTERACTION__INTERACTION_SPEC, newInteractionSpec, newInteractionSpec));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
        Operation oldOperation = operation;
        operation = newOperation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_OUTBOUND_INTERACTION__OPERATION, oldOperation, newOperation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperation(Operation newOperation) {
        if (newOperation != operation) {
            NotificationChain msgs = null;
            if (operation != null)
                msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_OUTBOUND_INTERACTION__OPERATION, null, msgs);
            if (newOperation != null)
                msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_OUTBOUND_INTERACTION__OPERATION, null, msgs);
            msgs = basicSetOperation(newOperation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_OUTBOUND_INTERACTION__OPERATION, newOperation, newOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Processor getProcessor() {
        return processor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProcessor(Processor newProcessor, NotificationChain msgs) {
        Processor oldProcessor = processor;
        processor = newProcessor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_OUTBOUND_INTERACTION__PROCESSOR, oldProcessor, newProcessor);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessor(Processor newProcessor) {
        if (newProcessor != processor) {
            NotificationChain msgs = null;
            if (processor != null)
                msgs = ((InternalEObject)processor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_OUTBOUND_INTERACTION__PROCESSOR, null, msgs);
            if (newProcessor != null)
                msgs = ((InternalEObject)newProcessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_OUTBOUND_INTERACTION__PROCESSOR, null, msgs);
            msgs = basicSetProcessor(newProcessor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_OUTBOUND_INTERACTION__PROCESSOR, newProcessor, newProcessor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, JcaPackage.JCA_OUTBOUND_INTERACTION__ANY);
        }
        return any;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAnyAttribute() {
        if (anyAttribute == null) {
            anyAttribute = new BasicFeatureMap(this, JcaPackage.JCA_OUTBOUND_INTERACTION__ANY_ATTRIBUTE);
        }
        return anyAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JcaPackage.JCA_OUTBOUND_INTERACTION__CONNECTION_SPEC:
                return basicSetConnectionSpec(null, msgs);
            case JcaPackage.JCA_OUTBOUND_INTERACTION__INTERACTION_SPEC:
                return basicSetInteractionSpec(null, msgs);
            case JcaPackage.JCA_OUTBOUND_INTERACTION__OPERATION:
                return basicSetOperation(null, msgs);
            case JcaPackage.JCA_OUTBOUND_INTERACTION__PROCESSOR:
                return basicSetProcessor(null, msgs);
            case JcaPackage.JCA_OUTBOUND_INTERACTION__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case JcaPackage.JCA_OUTBOUND_INTERACTION__ANY_ATTRIBUTE:
                return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
            case JcaPackage.JCA_OUTBOUND_INTERACTION__CONNECTION_SPEC:
                return getConnectionSpec();
            case JcaPackage.JCA_OUTBOUND_INTERACTION__INTERACTION_SPEC:
                return getInteractionSpec();
            case JcaPackage.JCA_OUTBOUND_INTERACTION__OPERATION:
                return getOperation();
            case JcaPackage.JCA_OUTBOUND_INTERACTION__PROCESSOR:
                return getProcessor();
            case JcaPackage.JCA_OUTBOUND_INTERACTION__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case JcaPackage.JCA_OUTBOUND_INTERACTION__ANY_ATTRIBUTE:
                if (coreType) return getAnyAttribute();
                return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
            case JcaPackage.JCA_OUTBOUND_INTERACTION__CONNECTION_SPEC:
                setConnectionSpec((ConnectionSpec)newValue);
                return;
            case JcaPackage.JCA_OUTBOUND_INTERACTION__INTERACTION_SPEC:
                setInteractionSpec((InteractionSpec)newValue);
                return;
            case JcaPackage.JCA_OUTBOUND_INTERACTION__OPERATION:
                setOperation((Operation)newValue);
                return;
            case JcaPackage.JCA_OUTBOUND_INTERACTION__PROCESSOR:
                setProcessor((Processor)newValue);
                return;
            case JcaPackage.JCA_OUTBOUND_INTERACTION__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case JcaPackage.JCA_OUTBOUND_INTERACTION__ANY_ATTRIBUTE:
                ((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
            case JcaPackage.JCA_OUTBOUND_INTERACTION__CONNECTION_SPEC:
                setConnectionSpec((ConnectionSpec)null);
                return;
            case JcaPackage.JCA_OUTBOUND_INTERACTION__INTERACTION_SPEC:
                setInteractionSpec((InteractionSpec)null);
                return;
            case JcaPackage.JCA_OUTBOUND_INTERACTION__OPERATION:
                setOperation((Operation)null);
                return;
            case JcaPackage.JCA_OUTBOUND_INTERACTION__PROCESSOR:
                setProcessor((Processor)null);
                return;
            case JcaPackage.JCA_OUTBOUND_INTERACTION__ANY:
                getAny().clear();
                return;
            case JcaPackage.JCA_OUTBOUND_INTERACTION__ANY_ATTRIBUTE:
                getAnyAttribute().clear();
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
            case JcaPackage.JCA_OUTBOUND_INTERACTION__CONNECTION_SPEC:
                return connectionSpec != null;
            case JcaPackage.JCA_OUTBOUND_INTERACTION__INTERACTION_SPEC:
                return interactionSpec != null;
            case JcaPackage.JCA_OUTBOUND_INTERACTION__OPERATION:
                return operation != null;
            case JcaPackage.JCA_OUTBOUND_INTERACTION__PROCESSOR:
                return processor != null;
            case JcaPackage.JCA_OUTBOUND_INTERACTION__ANY:
                return any != null && !any.isEmpty();
            case JcaPackage.JCA_OUTBOUND_INTERACTION__ANY_ATTRIBUTE:
                return anyAttribute != null && !anyAttribute.isEmpty();
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
        result.append(", anyAttribute: ");
        result.append(anyAttribute);
        result.append(')');
        return result.toString();
    }

} //JCAOutboundInteractionImpl
