/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetHeaderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wire Tap Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.WireTapDefinitionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.WireTapDefinitionImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.WireTapDefinitionImpl#isCopy <em>Copy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.WireTapDefinitionImpl#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.WireTapDefinitionImpl#getOnPrepareRef <em>On Prepare Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.WireTapDefinitionImpl#getProcessorRef <em>Processor Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.WireTapDefinitionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.WireTapDefinitionImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.WireTapDefinitionImpl#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WireTapDefinitionImpl extends NoOutputDefinitionImpl implements WireTapDefinition {
	/**
     * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBody()
     * @generated
     * @ordered
     */
	protected ExpressionSubElementDefinition body;

	/**
     * The cached value of the '{@link #getSetHeader() <em>Set Header</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSetHeader()
     * @generated
     * @ordered
     */
	protected EList<SetHeaderDefinition> setHeader;

	/**
     * The default value of the '{@link #isCopy() <em>Copy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isCopy()
     * @generated
     * @ordered
     */
	protected static final boolean COPY_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isCopy() <em>Copy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isCopy()
     * @generated
     * @ordered
     */
	protected boolean copy = COPY_EDEFAULT;

	/**
     * This is true if the Copy attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean copyESet;

	/**
     * The default value of the '{@link #getExecutorServiceRef() <em>Executor Service Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExecutorServiceRef()
     * @generated
     * @ordered
     */
	protected static final String EXECUTOR_SERVICE_REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getExecutorServiceRef() <em>Executor Service Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExecutorServiceRef()
     * @generated
     * @ordered
     */
	protected String executorServiceRef = EXECUTOR_SERVICE_REF_EDEFAULT;

	/**
     * The default value of the '{@link #getOnPrepareRef() <em>On Prepare Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOnPrepareRef()
     * @generated
     * @ordered
     */
	protected static final String ON_PREPARE_REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getOnPrepareRef() <em>On Prepare Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOnPrepareRef()
     * @generated
     * @ordered
     */
	protected String onPrepareRef = ON_PREPARE_REF_EDEFAULT;

	/**
     * The default value of the '{@link #getProcessorRef() <em>Processor Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProcessorRef()
     * @generated
     * @ordered
     */
	protected static final String PROCESSOR_REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getProcessorRef() <em>Processor Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProcessorRef()
     * @generated
     * @ordered
     */
	protected String processorRef = PROCESSOR_REF_EDEFAULT;

	/**
     * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
	protected static final String REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
	protected String ref = REF_EDEFAULT;

	/**
     * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUri()
     * @generated
     * @ordered
     */
	protected static final String URI_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUri()
     * @generated
     * @ordered
     */
	protected String uri = URI_EDEFAULT;

	/**
     * The cached value of the '{@link #getAnyAttribute2() <em>Any Attribute2</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute2()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute2;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected WireTapDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getWireTapDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExpressionSubElementDefinition getBody() {
        return body;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBody(ExpressionSubElementDefinition newBody, NotificationChain msgs) {
        ExpressionSubElementDefinition oldBody = body;
        body = newBody;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.WIRE_TAP_DEFINITION__BODY, oldBody, newBody);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBody(ExpressionSubElementDefinition newBody) {
        if (newBody != body) {
            NotificationChain msgs = null;
            if (body != null)
                msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.WIRE_TAP_DEFINITION__BODY, null, msgs);
            if (newBody != null)
                msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.WIRE_TAP_DEFINITION__BODY, null, msgs);
            msgs = basicSetBody(newBody, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.WIRE_TAP_DEFINITION__BODY, newBody, newBody));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetHeaderDefinition> getSetHeader() {
        if (setHeader == null) {
            setHeader = new EObjectContainmentEList<SetHeaderDefinition>(SetHeaderDefinition.class, this, SpringPackage.WIRE_TAP_DEFINITION__SET_HEADER);
        }
        return setHeader;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isCopy() {
        return copy;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCopy(boolean newCopy) {
        boolean oldCopy = copy;
        copy = newCopy;
        boolean oldCopyESet = copyESet;
        copyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.WIRE_TAP_DEFINITION__COPY, oldCopy, copy, !oldCopyESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetCopy() {
        boolean oldCopy = copy;
        boolean oldCopyESet = copyESet;
        copy = COPY_EDEFAULT;
        copyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.WIRE_TAP_DEFINITION__COPY, oldCopy, COPY_EDEFAULT, oldCopyESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetCopy() {
        return copyESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getExecutorServiceRef() {
        return executorServiceRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExecutorServiceRef(String newExecutorServiceRef) {
        String oldExecutorServiceRef = executorServiceRef;
        executorServiceRef = newExecutorServiceRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.WIRE_TAP_DEFINITION__EXECUTOR_SERVICE_REF, oldExecutorServiceRef, executorServiceRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getOnPrepareRef() {
        return onPrepareRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOnPrepareRef(String newOnPrepareRef) {
        String oldOnPrepareRef = onPrepareRef;
        onPrepareRef = newOnPrepareRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.WIRE_TAP_DEFINITION__ON_PREPARE_REF, oldOnPrepareRef, onPrepareRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getProcessorRef() {
        return processorRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setProcessorRef(String newProcessorRef) {
        String oldProcessorRef = processorRef;
        processorRef = newProcessorRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.WIRE_TAP_DEFINITION__PROCESSOR_REF, oldProcessorRef, processorRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getRef() {
        return ref;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRef(String newRef) {
        String oldRef = ref;
        ref = newRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.WIRE_TAP_DEFINITION__REF, oldRef, ref));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getUri() {
        return uri;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUri(String newUri) {
        String oldUri = uri;
        uri = newUri;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.WIRE_TAP_DEFINITION__URI, oldUri, uri));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute2() {
        if (anyAttribute2 == null) {
            anyAttribute2 = new BasicFeatureMap(this, SpringPackage.WIRE_TAP_DEFINITION__ANY_ATTRIBUTE2);
        }
        return anyAttribute2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SpringPackage.WIRE_TAP_DEFINITION__BODY:
                return basicSetBody(null, msgs);
            case SpringPackage.WIRE_TAP_DEFINITION__SET_HEADER:
                return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
            case SpringPackage.WIRE_TAP_DEFINITION__ANY_ATTRIBUTE2:
                return ((InternalEList<?>)getAnyAttribute2()).basicRemove(otherEnd, msgs);
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
            case SpringPackage.WIRE_TAP_DEFINITION__BODY:
                return getBody();
            case SpringPackage.WIRE_TAP_DEFINITION__SET_HEADER:
                return getSetHeader();
            case SpringPackage.WIRE_TAP_DEFINITION__COPY:
                return isCopy();
            case SpringPackage.WIRE_TAP_DEFINITION__EXECUTOR_SERVICE_REF:
                return getExecutorServiceRef();
            case SpringPackage.WIRE_TAP_DEFINITION__ON_PREPARE_REF:
                return getOnPrepareRef();
            case SpringPackage.WIRE_TAP_DEFINITION__PROCESSOR_REF:
                return getProcessorRef();
            case SpringPackage.WIRE_TAP_DEFINITION__REF:
                return getRef();
            case SpringPackage.WIRE_TAP_DEFINITION__URI:
                return getUri();
            case SpringPackage.WIRE_TAP_DEFINITION__ANY_ATTRIBUTE2:
                if (coreType) return getAnyAttribute2();
                return ((FeatureMap.Internal)getAnyAttribute2()).getWrapper();
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
            case SpringPackage.WIRE_TAP_DEFINITION__BODY:
                setBody((ExpressionSubElementDefinition)newValue);
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__SET_HEADER:
                getSetHeader().clear();
                getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__COPY:
                setCopy((Boolean)newValue);
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__EXECUTOR_SERVICE_REF:
                setExecutorServiceRef((String)newValue);
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__ON_PREPARE_REF:
                setOnPrepareRef((String)newValue);
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__PROCESSOR_REF:
                setProcessorRef((String)newValue);
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__REF:
                setRef((String)newValue);
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__URI:
                setUri((String)newValue);
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__ANY_ATTRIBUTE2:
                ((FeatureMap.Internal)getAnyAttribute2()).set(newValue);
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
            case SpringPackage.WIRE_TAP_DEFINITION__BODY:
                setBody((ExpressionSubElementDefinition)null);
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__SET_HEADER:
                getSetHeader().clear();
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__COPY:
                unsetCopy();
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__EXECUTOR_SERVICE_REF:
                setExecutorServiceRef(EXECUTOR_SERVICE_REF_EDEFAULT);
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__ON_PREPARE_REF:
                setOnPrepareRef(ON_PREPARE_REF_EDEFAULT);
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__PROCESSOR_REF:
                setProcessorRef(PROCESSOR_REF_EDEFAULT);
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__REF:
                setRef(REF_EDEFAULT);
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__URI:
                setUri(URI_EDEFAULT);
                return;
            case SpringPackage.WIRE_TAP_DEFINITION__ANY_ATTRIBUTE2:
                getAnyAttribute2().clear();
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
            case SpringPackage.WIRE_TAP_DEFINITION__BODY:
                return body != null;
            case SpringPackage.WIRE_TAP_DEFINITION__SET_HEADER:
                return setHeader != null && !setHeader.isEmpty();
            case SpringPackage.WIRE_TAP_DEFINITION__COPY:
                return isSetCopy();
            case SpringPackage.WIRE_TAP_DEFINITION__EXECUTOR_SERVICE_REF:
                return EXECUTOR_SERVICE_REF_EDEFAULT == null ? executorServiceRef != null : !EXECUTOR_SERVICE_REF_EDEFAULT.equals(executorServiceRef);
            case SpringPackage.WIRE_TAP_DEFINITION__ON_PREPARE_REF:
                return ON_PREPARE_REF_EDEFAULT == null ? onPrepareRef != null : !ON_PREPARE_REF_EDEFAULT.equals(onPrepareRef);
            case SpringPackage.WIRE_TAP_DEFINITION__PROCESSOR_REF:
                return PROCESSOR_REF_EDEFAULT == null ? processorRef != null : !PROCESSOR_REF_EDEFAULT.equals(processorRef);
            case SpringPackage.WIRE_TAP_DEFINITION__REF:
                return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
            case SpringPackage.WIRE_TAP_DEFINITION__URI:
                return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
            case SpringPackage.WIRE_TAP_DEFINITION__ANY_ATTRIBUTE2:
                return anyAttribute2 != null && !anyAttribute2.isEmpty();
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
        result.append(" (copy: ");
        if (copyESet) result.append(copy); else result.append("<unset>");
        result.append(", executorServiceRef: ");
        result.append(executorServiceRef);
        result.append(", onPrepareRef: ");
        result.append(onPrepareRef);
        result.append(", processorRef: ");
        result.append(processorRef);
        result.append(", ref: ");
        result.append(ref);
        result.append(", uri: ");
        result.append(uri);
        result.append(", anyAttribute2: ");
        result.append(anyAttribute2);
        result.append(')');
        return result.toString();
    }

} //WireTapDefinitionImpl
