/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Sql Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType#getQuery <em>Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType#getDataSourceRef <em>Data Source Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType#isBatch <em>Batch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType#getPlaceholder <em>Placeholder</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.sql.SqlPackage#getCamelSqlBindingType()
 * @model extendedMetaData="name='CamelSqlBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelSqlBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Query</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Query</em>' attribute.
     * @see #setQuery(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sql.SqlPackage#getCamelSqlBindingType_Query()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='query' namespace='##targetNamespace'"
     * @generated
     */
    String getQuery();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType#getQuery <em>Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Query</em>' attribute.
     * @see #getQuery()
     * @generated
     */
    void setQuery(String value);

    /**
     * Returns the value of the '<em><b>Data Source Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Source Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Source Ref</em>' attribute.
     * @see #setDataSourceRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sql.SqlPackage#getCamelSqlBindingType_DataSourceRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='dataSourceRef' namespace='##targetNamespace'"
     * @generated
     */
    String getDataSourceRef();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType#getDataSourceRef <em>Data Source Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Source Ref</em>' attribute.
     * @see #getDataSourceRef()
     * @generated
     */
    void setDataSourceRef(String value);

    /**
     * Returns the value of the '<em><b>Batch</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Batch</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Batch</em>' attribute.
     * @see #isSetBatch()
     * @see #unsetBatch()
     * @see #setBatch(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sql.SqlPackage#getCamelSqlBindingType_Batch()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='batch' namespace='##targetNamespace'"
     * @generated
     */
    boolean isBatch();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType#isBatch <em>Batch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Batch</em>' attribute.
     * @see #isSetBatch()
     * @see #unsetBatch()
     * @see #isBatch()
     * @generated
     */
    void setBatch(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType#isBatch <em>Batch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBatch()
     * @see #isBatch()
     * @see #setBatch(boolean)
     * @generated
     */
    void unsetBatch();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType#isBatch <em>Batch</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Batch</em>' attribute is set.
     * @see #unsetBatch()
     * @see #isBatch()
     * @see #setBatch(boolean)
     * @generated
     */
    boolean isSetBatch();

    /**
     * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Placeholder</em>' attribute.
     * @see #setPlaceholder(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sql.SqlPackage#getCamelSqlBindingType_Placeholder()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='placeholder' namespace='##targetNamespace'"
     * @generated
     */
    String getPlaceholder();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType#getPlaceholder <em>Placeholder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Placeholder</em>' attribute.
     * @see #getPlaceholder()
     * @generated
     */
    void setPlaceholder(String value);

} // CamelSqlBindingType
