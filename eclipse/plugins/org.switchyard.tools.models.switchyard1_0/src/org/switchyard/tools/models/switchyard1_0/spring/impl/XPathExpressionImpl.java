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

import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.XPathExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XPath Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XPathExpressionImpl#getFactoryRef <em>Factory Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XPathExpressionImpl#getObjectModel <em>Object Model</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XPathExpressionImpl#getResultType <em>Result Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XPathExpressionImpl#isSaxon <em>Saxon</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XPathExpressionImpl#isTraceNamespaces <em>Trace Namespaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XPathExpressionImpl extends NamespaceAwareExpressionImpl implements XPathExpression {
	/**
     * The default value of the '{@link #getFactoryRef() <em>Factory Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFactoryRef()
     * @generated
     * @ordered
     */
    protected static final String FACTORY_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFactoryRef() <em>Factory Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFactoryRef()
     * @generated
     * @ordered
     */
    protected String factoryRef = FACTORY_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getObjectModel() <em>Object Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjectModel()
     * @generated
     * @ordered
     */
    protected static final String OBJECT_MODEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getObjectModel() <em>Object Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjectModel()
     * @generated
     * @ordered
     */
    protected String objectModel = OBJECT_MODEL_EDEFAULT;

    /**
     * The default value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResultType()
     * @generated
     * @ordered
     */
	protected static final String RESULT_TYPE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResultType()
     * @generated
     * @ordered
     */
	protected String resultType = RESULT_TYPE_EDEFAULT;

	/**
     * The default value of the '{@link #isSaxon() <em>Saxon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSaxon()
     * @generated
     * @ordered
     */
    protected static final boolean SAXON_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSaxon() <em>Saxon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSaxon()
     * @generated
     * @ordered
     */
    protected boolean saxon = SAXON_EDEFAULT;

    /**
     * This is true if the Saxon attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean saxonESet;

    /**
     * The default value of the '{@link #isTraceNamespaces() <em>Trace Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTraceNamespaces()
     * @generated
     * @ordered
     */
    protected static final boolean TRACE_NAMESPACES_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTraceNamespaces() <em>Trace Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTraceNamespaces()
     * @generated
     * @ordered
     */
    protected boolean traceNamespaces = TRACE_NAMESPACES_EDEFAULT;

    /**
     * This is true if the Trace Namespaces attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean traceNamespacesESet;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected XPathExpressionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getXPathExpression();
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFactoryRef() {
        return factoryRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFactoryRef(String newFactoryRef) {
        String oldFactoryRef = factoryRef;
        factoryRef = newFactoryRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XPATH_EXPRESSION__FACTORY_REF, oldFactoryRef, factoryRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getObjectModel() {
        return objectModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObjectModel(String newObjectModel) {
        String oldObjectModel = objectModel;
        objectModel = newObjectModel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XPATH_EXPRESSION__OBJECT_MODEL, oldObjectModel, objectModel));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getResultType() {
        return resultType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setResultType(String newResultType) {
        String oldResultType = resultType;
        resultType = newResultType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XPATH_EXPRESSION__RESULT_TYPE, oldResultType, resultType));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSaxon() {
        return saxon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSaxon(boolean newSaxon) {
        boolean oldSaxon = saxon;
        saxon = newSaxon;
        boolean oldSaxonESet = saxonESet;
        saxonESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XPATH_EXPRESSION__SAXON, oldSaxon, saxon, !oldSaxonESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSaxon() {
        boolean oldSaxon = saxon;
        boolean oldSaxonESet = saxonESet;
        saxon = SAXON_EDEFAULT;
        saxonESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.XPATH_EXPRESSION__SAXON, oldSaxon, SAXON_EDEFAULT, oldSaxonESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSaxon() {
        return saxonESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTraceNamespaces() {
        return traceNamespaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTraceNamespaces(boolean newTraceNamespaces) {
        boolean oldTraceNamespaces = traceNamespaces;
        traceNamespaces = newTraceNamespaces;
        boolean oldTraceNamespacesESet = traceNamespacesESet;
        traceNamespacesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XPATH_EXPRESSION__TRACE_NAMESPACES, oldTraceNamespaces, traceNamespaces, !oldTraceNamespacesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTraceNamespaces() {
        boolean oldTraceNamespaces = traceNamespaces;
        boolean oldTraceNamespacesESet = traceNamespacesESet;
        traceNamespaces = TRACE_NAMESPACES_EDEFAULT;
        traceNamespacesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.XPATH_EXPRESSION__TRACE_NAMESPACES, oldTraceNamespaces, TRACE_NAMESPACES_EDEFAULT, oldTraceNamespacesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTraceNamespaces() {
        return traceNamespacesESet;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.XPATH_EXPRESSION__FACTORY_REF:
                return getFactoryRef();
            case SpringPackage.XPATH_EXPRESSION__OBJECT_MODEL:
                return getObjectModel();
            case SpringPackage.XPATH_EXPRESSION__RESULT_TYPE:
                return getResultType();
            case SpringPackage.XPATH_EXPRESSION__SAXON:
                return isSaxon();
            case SpringPackage.XPATH_EXPRESSION__TRACE_NAMESPACES:
                return isTraceNamespaces();
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
            case SpringPackage.XPATH_EXPRESSION__FACTORY_REF:
                setFactoryRef((String)newValue);
                return;
            case SpringPackage.XPATH_EXPRESSION__OBJECT_MODEL:
                setObjectModel((String)newValue);
                return;
            case SpringPackage.XPATH_EXPRESSION__RESULT_TYPE:
                setResultType((String)newValue);
                return;
            case SpringPackage.XPATH_EXPRESSION__SAXON:
                setSaxon((Boolean)newValue);
                return;
            case SpringPackage.XPATH_EXPRESSION__TRACE_NAMESPACES:
                setTraceNamespaces((Boolean)newValue);
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
            case SpringPackage.XPATH_EXPRESSION__FACTORY_REF:
                setFactoryRef(FACTORY_REF_EDEFAULT);
                return;
            case SpringPackage.XPATH_EXPRESSION__OBJECT_MODEL:
                setObjectModel(OBJECT_MODEL_EDEFAULT);
                return;
            case SpringPackage.XPATH_EXPRESSION__RESULT_TYPE:
                setResultType(RESULT_TYPE_EDEFAULT);
                return;
            case SpringPackage.XPATH_EXPRESSION__SAXON:
                unsetSaxon();
                return;
            case SpringPackage.XPATH_EXPRESSION__TRACE_NAMESPACES:
                unsetTraceNamespaces();
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
            case SpringPackage.XPATH_EXPRESSION__FACTORY_REF:
                return FACTORY_REF_EDEFAULT == null ? factoryRef != null : !FACTORY_REF_EDEFAULT.equals(factoryRef);
            case SpringPackage.XPATH_EXPRESSION__OBJECT_MODEL:
                return OBJECT_MODEL_EDEFAULT == null ? objectModel != null : !OBJECT_MODEL_EDEFAULT.equals(objectModel);
            case SpringPackage.XPATH_EXPRESSION__RESULT_TYPE:
                return RESULT_TYPE_EDEFAULT == null ? resultType != null : !RESULT_TYPE_EDEFAULT.equals(resultType);
            case SpringPackage.XPATH_EXPRESSION__SAXON:
                return isSetSaxon();
            case SpringPackage.XPATH_EXPRESSION__TRACE_NAMESPACES:
                return isSetTraceNamespaces();
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
        result.append(" (factoryRef: ");
        result.append(factoryRef);
        result.append(", objectModel: ");
        result.append(objectModel);
        result.append(", resultType: ");
        result.append(resultType);
        result.append(", saxon: ");
        if (saxonESet) result.append(saxon); else result.append("<unset>");
        result.append(", traceNamespaces: ");
        if (traceNamespacesESet) result.append(traceNamespaces); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //XPathExpressionImpl
