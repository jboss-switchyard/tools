/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSqlBindingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sql Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSqlBindingTypeImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSqlBindingTypeImpl#getDataSourceRef <em>Data Source Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSqlBindingTypeImpl#isBatch <em>Batch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSqlBindingTypeImpl#getPlaceholder <em>Placeholder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelSqlBindingTypeImpl extends BaseCamelBindingImpl implements CamelSqlBindingType {
    /**
     * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQuery()
     * @generated
     * @ordered
     */
    protected static final String QUERY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQuery()
     * @generated
     * @ordered
     */
    protected String query = QUERY_EDEFAULT;

    /**
     * The default value of the '{@link #getDataSourceRef() <em>Data Source Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataSourceRef()
     * @generated
     * @ordered
     */
    protected static final String DATA_SOURCE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataSourceRef() <em>Data Source Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataSourceRef()
     * @generated
     * @ordered
     */
    protected String dataSourceRef = DATA_SOURCE_REF_EDEFAULT;

    /**
     * The default value of the '{@link #isBatch() <em>Batch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBatch()
     * @generated
     * @ordered
     */
    protected static final boolean BATCH_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isBatch() <em>Batch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBatch()
     * @generated
     * @ordered
     */
    protected boolean batch = BATCH_EDEFAULT;

    /**
     * The default value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlaceholder()
     * @generated
     * @ordered
     */
    protected static final String PLACEHOLDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlaceholder()
     * @generated
     * @ordered
     */
    protected String placeholder = PLACEHOLDER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelSqlBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CamelPackage.Literals.CAMEL_SQL_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getQuery() {
        return query;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setQuery(String newQuery) {
        String oldQuery = query;
        query = newQuery;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_SQL_BINDING_TYPE__QUERY, oldQuery, query));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDataSourceRef() {
        return dataSourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataSourceRef(String newDataSourceRef) {
        String oldDataSourceRef = dataSourceRef;
        dataSourceRef = newDataSourceRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_SQL_BINDING_TYPE__DATA_SOURCE_REF, oldDataSourceRef, dataSourceRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isBatch() {
        return batch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBatch(boolean newBatch) {
        boolean oldBatch = batch;
        batch = newBatch;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_SQL_BINDING_TYPE__BATCH, oldBatch, batch));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPlaceholder() {
        return placeholder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPlaceholder(String newPlaceholder) {
        String oldPlaceholder = placeholder;
        placeholder = newPlaceholder;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_SQL_BINDING_TYPE__PLACEHOLDER, oldPlaceholder, placeholder));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__QUERY:
                return getQuery();
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__DATA_SOURCE_REF:
                return getDataSourceRef();
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__BATCH:
                return isBatch();
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__PLACEHOLDER:
                return getPlaceholder();
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
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__QUERY:
                setQuery((String)newValue);
                return;
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__DATA_SOURCE_REF:
                setDataSourceRef((String)newValue);
                return;
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__BATCH:
                setBatch((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__PLACEHOLDER:
                setPlaceholder((String)newValue);
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
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__QUERY:
                setQuery(QUERY_EDEFAULT);
                return;
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__DATA_SOURCE_REF:
                setDataSourceRef(DATA_SOURCE_REF_EDEFAULT);
                return;
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__BATCH:
                setBatch(BATCH_EDEFAULT);
                return;
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__PLACEHOLDER:
                setPlaceholder(PLACEHOLDER_EDEFAULT);
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
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__QUERY:
                return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__DATA_SOURCE_REF:
                return DATA_SOURCE_REF_EDEFAULT == null ? dataSourceRef != null : !DATA_SOURCE_REF_EDEFAULT.equals(dataSourceRef);
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__BATCH:
                return batch != BATCH_EDEFAULT;
            case CamelPackage.CAMEL_SQL_BINDING_TYPE__PLACEHOLDER:
                return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
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
        result.append(" (query: ");
        result.append(query);
        result.append(", dataSourceRef: ");
        result.append(dataSourceRef);
        result.append(", batch: ");
        result.append(batch);
        result.append(", placeholder: ");
        result.append(placeholder);
        result.append(')');
        return result.toString();
    }

} //CamelSqlBindingTypeImpl
