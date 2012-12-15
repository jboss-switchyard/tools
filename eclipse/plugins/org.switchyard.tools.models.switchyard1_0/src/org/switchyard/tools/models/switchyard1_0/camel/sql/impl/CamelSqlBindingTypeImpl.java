/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.core.impl.BaseCamelBindingImpl;

import org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Sql Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sql.impl.CamelSqlBindingTypeImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sql.impl.CamelSqlBindingTypeImpl#getDataSourceRef <em>Data Source Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sql.impl.CamelSqlBindingTypeImpl#getBatch <em>Batch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sql.impl.CamelSqlBindingTypeImpl#getPlaceholder <em>Placeholder</em>}</li>
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
     * The default value of the '{@link #getBatch() <em>Batch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBatch()
     * @generated
     * @ordered
     */
    protected static final Boolean BATCH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBatch() <em>Batch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBatch()
     * @generated
     * @ordered
     */
    protected Boolean batch = BATCH_EDEFAULT;

    /**
     * This is true if the Batch attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean batchESet;

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
        return SqlPackage.Literals.CAMEL_SQL_BINDING_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.CAMEL_SQL_BINDING_TYPE__QUERY, oldQuery, query));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.CAMEL_SQL_BINDING_TYPE__DATA_SOURCE_REF, oldDataSourceRef, dataSourceRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getBatch() {
        return batch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBatch(Boolean newBatch) {
        Boolean oldBatch = batch;
        batch = newBatch;
        boolean oldBatchESet = batchESet;
        batchESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.CAMEL_SQL_BINDING_TYPE__BATCH, oldBatch, batch, !oldBatchESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBatch() {
        Boolean oldBatch = batch;
        boolean oldBatchESet = batchESet;
        batch = BATCH_EDEFAULT;
        batchESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SqlPackage.CAMEL_SQL_BINDING_TYPE__BATCH, oldBatch, BATCH_EDEFAULT, oldBatchESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBatch() {
        return batchESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.CAMEL_SQL_BINDING_TYPE__PLACEHOLDER, oldPlaceholder, placeholder));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__QUERY:
                return getQuery();
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__DATA_SOURCE_REF:
                return getDataSourceRef();
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__BATCH:
                return getBatch();
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__PLACEHOLDER:
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
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__QUERY:
                setQuery((String)newValue);
                return;
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__DATA_SOURCE_REF:
                setDataSourceRef((String)newValue);
                return;
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__BATCH:
                setBatch((Boolean)newValue);
                return;
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__PLACEHOLDER:
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
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__QUERY:
                setQuery(QUERY_EDEFAULT);
                return;
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__DATA_SOURCE_REF:
                setDataSourceRef(DATA_SOURCE_REF_EDEFAULT);
                return;
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__BATCH:
                unsetBatch();
                return;
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__PLACEHOLDER:
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
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__QUERY:
                return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__DATA_SOURCE_REF:
                return DATA_SOURCE_REF_EDEFAULT == null ? dataSourceRef != null : !DATA_SOURCE_REF_EDEFAULT.equals(dataSourceRef);
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__BATCH:
                return isSetBatch();
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__PLACEHOLDER:
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
        if (batchESet) result.append(batch); else result.append("<unset>");
        result.append(", placeholder: ");
        result.append(placeholder);
        result.append(')');
        return result.toString();
    }

} //CamelSqlBindingTypeImpl
