/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Jpa Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getEntityClassName <em>Entity Class Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getPersistenceUnit <em>Persistence Unit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getTransactionManager <em>Transaction Manager</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getProduce <em>Produce</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getCamelJpaBindingType()
 * @model extendedMetaData="name='CamelJpaBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelJpaBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Entity Class Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Class Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Class Name</em>' attribute.
     * @see #setEntityClassName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getCamelJpaBindingType_EntityClassName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='entityClassName' namespace='##targetNamespace'"
     * @generated
     */
    String getEntityClassName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getEntityClassName <em>Entity Class Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Class Name</em>' attribute.
     * @see #getEntityClassName()
     * @generated
     */
    void setEntityClassName(String value);

    /**
     * Returns the value of the '<em><b>Persistence Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persistence Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Persistence Unit</em>' attribute.
     * @see #setPersistenceUnit(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getCamelJpaBindingType_PersistenceUnit()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='persistenceUnit' namespace='##targetNamespace'"
     * @generated
     */
    String getPersistenceUnit();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getPersistenceUnit <em>Persistence Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Persistence Unit</em>' attribute.
     * @see #getPersistenceUnit()
     * @generated
     */
    void setPersistenceUnit(String value);

    /**
     * Returns the value of the '<em><b>Transaction Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transaction Manager</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transaction Manager</em>' attribute.
     * @see #setTransactionManager(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getCamelJpaBindingType_TransactionManager()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='transactionManager' namespace='##targetNamespace'"
     * @generated
     */
    String getTransactionManager();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getTransactionManager <em>Transaction Manager</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transaction Manager</em>' attribute.
     * @see #getTransactionManager()
     * @generated
     */
    void setTransactionManager(String value);

    /**
     * Returns the value of the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consume</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consume</em>' containment reference.
     * @see #setConsume(JpaConsumerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getCamelJpaBindingType_Consume()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='consume' namespace='##targetNamespace'"
     * @generated
     */
    JpaConsumerType getConsume();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getConsume <em>Consume</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consume</em>' containment reference.
     * @see #getConsume()
     * @generated
     */
    void setConsume(JpaConsumerType value);

    /**
     * Returns the value of the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Produce</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Produce</em>' containment reference.
     * @see #setProduce(JpaProducerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getCamelJpaBindingType_Produce()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='produce' namespace='##targetNamespace'"
     * @generated
     */
    JpaProducerType getProduce();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getProduce <em>Produce</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Produce</em>' containment reference.
     * @see #getProduce()
     * @generated
     */
    void setProduce(JpaProducerType value);

} // CamelJpaBindingType
