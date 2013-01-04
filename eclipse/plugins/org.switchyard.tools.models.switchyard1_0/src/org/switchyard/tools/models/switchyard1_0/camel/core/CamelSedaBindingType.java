/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seda Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getCamelBindingName <em>Camel Binding Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getSize <em>Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getWaitForTaskToComplete <em>Wait For Task To Complete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getMultipleConsumers <em>Multiple Consumers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getLimitConcurrentConsumers <em>Limit Concurrent Consumers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelSedaBindingType()
 * @model extendedMetaData="name='CamelSedaBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelSedaBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Camel Binding Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Camel Binding Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Camel Binding Name</em>' attribute.
     * @see #setCamelBindingName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelSedaBindingType_CamelBindingName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getCamelBindingName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getCamelBindingName <em>Camel Binding Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Camel Binding Name</em>' attribute.
     * @see #getCamelBindingName()
     * @generated
     */
    void setCamelBindingName(String value);

    /**
     * Returns the value of the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size</em>' attribute.
     * @see #setSize(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelSedaBindingType_Size()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject" required="true"
     *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
     * @generated
     */
    Integer getSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getSize <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size</em>' attribute.
     * @see #getSize()
     * @generated
     */
    void setSize(Integer value);

    /**
     * Returns the value of the '<em><b>Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Concurrent Consumers</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Concurrent Consumers</em>' attribute.
     * @see #setConcurrentConsumers(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelSedaBindingType_ConcurrentConsumers()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject" required="true"
     *        extendedMetaData="kind='element' name='concurrentConsumers' namespace='##targetNamespace'"
     * @generated
     */
    Integer getConcurrentConsumers();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Concurrent Consumers</em>' attribute.
     * @see #getConcurrentConsumers()
     * @generated
     */
    void setConcurrentConsumers(Integer value);

    /**
     * Returns the value of the '<em><b>Wait For Task To Complete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wait For Task To Complete</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wait For Task To Complete</em>' attribute.
     * @see #setWaitForTaskToComplete(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelSedaBindingType_WaitForTaskToComplete()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='waitForTaskToComplete' namespace='##targetNamespace'"
     * @generated
     */
    String getWaitForTaskToComplete();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getWaitForTaskToComplete <em>Wait For Task To Complete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wait For Task To Complete</em>' attribute.
     * @see #getWaitForTaskToComplete()
     * @generated
     */
    void setWaitForTaskToComplete(String value);

    /**
     * Returns the value of the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timeout</em>' attribute.
     * @see #isSetTimeout()
     * @see #unsetTimeout()
     * @see #setTimeout(Long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelSedaBindingType_Timeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.LongObject" required="true"
     *        extendedMetaData="kind='element' name='timeout' namespace='##targetNamespace'"
     * @generated
     */
    Long getTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timeout</em>' attribute.
     * @see #isSetTimeout()
     * @see #unsetTimeout()
     * @see #getTimeout()
     * @generated
     */
    void setTimeout(Long value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeout()
     * @see #getTimeout()
     * @see #setTimeout(Long)
     * @generated
     */
    void unsetTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getTimeout <em>Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Timeout</em>' attribute is set.
     * @see #unsetTimeout()
     * @see #getTimeout()
     * @see #setTimeout(Long)
     * @generated
     */
    boolean isSetTimeout();

    /**
     * Returns the value of the '<em><b>Multiple Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multiple Consumers</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Multiple Consumers</em>' attribute.
     * @see #isSetMultipleConsumers()
     * @see #unsetMultipleConsumers()
     * @see #setMultipleConsumers(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelSedaBindingType_MultipleConsumers()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject" required="true"
     *        extendedMetaData="kind='element' name='multipleConsumers' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getMultipleConsumers();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getMultipleConsumers <em>Multiple Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multiple Consumers</em>' attribute.
     * @see #isSetMultipleConsumers()
     * @see #unsetMultipleConsumers()
     * @see #getMultipleConsumers()
     * @generated
     */
    void setMultipleConsumers(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getMultipleConsumers <em>Multiple Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMultipleConsumers()
     * @see #getMultipleConsumers()
     * @see #setMultipleConsumers(Boolean)
     * @generated
     */
    void unsetMultipleConsumers();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getMultipleConsumers <em>Multiple Consumers</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Multiple Consumers</em>' attribute is set.
     * @see #unsetMultipleConsumers()
     * @see #getMultipleConsumers()
     * @see #setMultipleConsumers(Boolean)
     * @generated
     */
    boolean isSetMultipleConsumers();

    /**
     * Returns the value of the '<em><b>Limit Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Limit Concurrent Consumers</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Limit Concurrent Consumers</em>' attribute.
     * @see #isSetLimitConcurrentConsumers()
     * @see #unsetLimitConcurrentConsumers()
     * @see #setLimitConcurrentConsumers(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelSedaBindingType_LimitConcurrentConsumers()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject" required="true"
     *        extendedMetaData="kind='element' name='limitConcurrentConsumers' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getLimitConcurrentConsumers();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getLimitConcurrentConsumers <em>Limit Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Limit Concurrent Consumers</em>' attribute.
     * @see #isSetLimitConcurrentConsumers()
     * @see #unsetLimitConcurrentConsumers()
     * @see #getLimitConcurrentConsumers()
     * @generated
     */
    void setLimitConcurrentConsumers(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getLimitConcurrentConsumers <em>Limit Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLimitConcurrentConsumers()
     * @see #getLimitConcurrentConsumers()
     * @see #setLimitConcurrentConsumers(Boolean)
     * @generated
     */
    void unsetLimitConcurrentConsumers();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getLimitConcurrentConsumers <em>Limit Concurrent Consumers</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Limit Concurrent Consumers</em>' attribute is set.
     * @see #unsetLimitConcurrentConsumers()
     * @see #getLimitConcurrentConsumers()
     * @see #setLimitConcurrentConsumers(Boolean)
     * @generated
     */
    boolean isSetLimitConcurrentConsumers();

} // CamelSedaBindingType
