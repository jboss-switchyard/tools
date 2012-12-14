/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Poll Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage#getScheduledPollConsumerType()
 * @model extendedMetaData="name='ScheduledPollConsumerType' kind='elementOnly'"
 * @generated
 */
public interface ScheduledPollConsumerType extends EObject {
    /**
     * Returns the value of the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Delay</em>' attribute.
     * @see #setInitialDelay(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage#getScheduledPollConsumerType_InitialDelay()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='initialDelay' namespace='##targetNamespace'"
     * @generated
     */
    Integer getInitialDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getInitialDelay <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Delay</em>' attribute.
     * @see #getInitialDelay()
     * @generated
     */
    void setInitialDelay(Integer value);

    /**
     * Returns the value of the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' attribute.
     * @see #setDelay(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage#getScheduledPollConsumerType_Delay()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace'"
     * @generated
     */
    Integer getDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' attribute.
     * @see #getDelay()
     * @generated
     */
    void setDelay(Integer value);

    /**
     * Returns the value of the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Fixed Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Fixed Delay</em>' attribute.
     * @see #isSetUseFixedDelay()
     * @see #unsetUseFixedDelay()
     * @see #setUseFixedDelay(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage#getScheduledPollConsumerType_UseFixedDelay()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='useFixedDelay' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getUseFixedDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Fixed Delay</em>' attribute.
     * @see #isSetUseFixedDelay()
     * @see #unsetUseFixedDelay()
     * @see #getUseFixedDelay()
     * @generated
     */
    void setUseFixedDelay(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUseFixedDelay()
     * @see #getUseFixedDelay()
     * @see #setUseFixedDelay(Boolean)
     * @generated
     */
    void unsetUseFixedDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Use Fixed Delay</em>' attribute is set.
     * @see #unsetUseFixedDelay()
     * @see #getUseFixedDelay()
     * @see #setUseFixedDelay(Boolean)
     * @generated
     */
    boolean isSetUseFixedDelay();

    /**
     * Returns the value of the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Send Empty Message When Idle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Send Empty Message When Idle</em>' attribute.
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage#getScheduledPollConsumerType_SendEmptyMessageWhenIdle()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='sendEmptyMessageWhenIdle' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getSendEmptyMessageWhenIdle();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Send Empty Message When Idle</em>' attribute.
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #getSendEmptyMessageWhenIdle()
     * @generated
     */
    void setSendEmptyMessageWhenIdle(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #getSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(Boolean)
     * @generated
     */
    void unsetSendEmptyMessageWhenIdle();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Send Empty Message When Idle</em>' attribute is set.
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #getSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(Boolean)
     * @generated
     */
    boolean isSetSendEmptyMessageWhenIdle();

    /**
     * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Unit</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit
     * @see #isSetTimeUnit()
     * @see #unsetTimeUnit()
     * @see #setTimeUnit(TimeUnit)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage#getScheduledPollConsumerType_TimeUnit()
     * @model unsettable="true"
     *        extendedMetaData="kind='element' name='timeUnit' namespace='##targetNamespace'"
     * @generated
     */
    TimeUnit getTimeUnit();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getTimeUnit <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Unit</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit
     * @see #isSetTimeUnit()
     * @see #unsetTimeUnit()
     * @see #getTimeUnit()
     * @generated
     */
    void setTimeUnit(TimeUnit value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getTimeUnit <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeUnit()
     * @see #getTimeUnit()
     * @see #setTimeUnit(TimeUnit)
     * @generated
     */
    void unsetTimeUnit();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getTimeUnit <em>Time Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Unit</em>' attribute is set.
     * @see #unsetTimeUnit()
     * @see #getTimeUnit()
     * @see #setTimeUnit(TimeUnit)
     * @generated
     */
    boolean isSetTimeUnit();

} // ScheduledPollConsumerType
