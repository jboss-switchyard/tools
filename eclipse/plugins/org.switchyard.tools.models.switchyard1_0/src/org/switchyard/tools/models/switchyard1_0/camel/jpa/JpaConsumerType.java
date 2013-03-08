/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getScheduledPollConsumerType <em>Scheduled Poll Consumer Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getScheduledBatchPollConsumerType <em>Scheduled Batch Poll Consumer Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumeDelete <em>Consume Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumeLockEntity <em>Consume Lock Entity</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getMaximumResults <em>Maximum Results</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerQuery <em>Consumer Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerNamedQuery <em>Consumer Named Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerNativeQuery <em>Consumer Native Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerResultClass <em>Consumer Result Class</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumerTransacted <em>Consumer Transacted</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType()
 * @model extendedMetaData="name='JpaConsumerType' kind='elementOnly'"
 * @generated
 */
public interface JpaConsumerType extends EObject {
    /**
     * Returns the value of the '<em><b>Scheduled Poll Consumer Type</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scheduled Poll Consumer Type</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scheduled Poll Consumer Type</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_ScheduledPollConsumerType()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='ScheduledPollConsumerType:0'"
     * @generated
     */
    FeatureMap getScheduledPollConsumerType();

    /**
     * Returns the value of the '<em><b>Initial Delay</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Object}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Delay</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Delay</em>' attribute list.
     * @see #isSetInitialDelay()
     * @see #unsetInitialDelay()
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_InitialDelay()
     * @model default="1000" unique="false" unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='initialDelay' namespace='##targetNamespace' group='#ScheduledPollConsumerType:0'"
     * @generated
     */
    EList<Object> getInitialDelay();

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getInitialDelay <em>Initial Delay</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInitialDelay()
     * @see #getInitialDelay()
     * @generated
     */
    void unsetInitialDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getInitialDelay <em>Initial Delay</em>}' attribute list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Initial Delay</em>' attribute list is set.
     * @see #unsetInitialDelay()
     * @see #getInitialDelay()
     * @generated
     */
    boolean isSetInitialDelay();

    /**
     * Returns the value of the '<em><b>Delay</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Object}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delay</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' attribute list.
     * @see #isSetDelay()
     * @see #unsetDelay()
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_Delay()
     * @model default="500" unique="false" unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace' group='#ScheduledPollConsumerType:0'"
     * @generated
     */
    EList<Object> getDelay();

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getDelay <em>Delay</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDelay()
     * @see #getDelay()
     * @generated
     */
    void unsetDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getDelay <em>Delay</em>}' attribute list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Delay</em>' attribute list is set.
     * @see #unsetDelay()
     * @see #getDelay()
     * @generated
     */
    boolean isSetDelay();

    /**
     * Returns the value of the '<em><b>Use Fixed Delay</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Boolean}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Fixed Delay</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Fixed Delay</em>' attribute list.
     * @see #isSetUseFixedDelay()
     * @see #unsetUseFixedDelay()
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_UseFixedDelay()
     * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='useFixedDelay' namespace='##targetNamespace' group='#ScheduledPollConsumerType:0'"
     * @generated
     */
    EList<Boolean> getUseFixedDelay();

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUseFixedDelay()
     * @see #getUseFixedDelay()
     * @generated
     */
    void unsetUseFixedDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}' attribute list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Use Fixed Delay</em>' attribute list is set.
     * @see #unsetUseFixedDelay()
     * @see #getUseFixedDelay()
     * @generated
     */
    boolean isSetUseFixedDelay();

    /**
     * Returns the value of the '<em><b>Send Empty Message When Idle</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Boolean}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Send Empty Message When Idle</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Send Empty Message When Idle</em>' attribute list.
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_SendEmptyMessageWhenIdle()
     * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sendEmptyMessageWhenIdle' namespace='##targetNamespace' group='#ScheduledPollConsumerType:0'"
     * @generated
     */
    EList<Boolean> getSendEmptyMessageWhenIdle();

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #getSendEmptyMessageWhenIdle()
     * @generated
     */
    void unsetSendEmptyMessageWhenIdle();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Send Empty Message When Idle</em>' attribute list is set.
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #getSendEmptyMessageWhenIdle()
     * @generated
     */
    boolean isSetSendEmptyMessageWhenIdle();

    /**
     * Returns the value of the '<em><b>Time Unit</b></em>' attribute list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType}.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Unit</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Unit</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_TimeUnit()
     * @model default="MILLISECONDS" unique="false" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='timeUnit' namespace='##targetNamespace' group='#ScheduledPollConsumerType:0'"
     * @generated
     */
    EList<TimeUnitType> getTimeUnit();

    /**
     * Returns the value of the '<em><b>Scheduled Batch Poll Consumer Type</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scheduled Batch Poll Consumer Type</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scheduled Batch Poll Consumer Type</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_ScheduledBatchPollConsumerType()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='ScheduledBatchPollConsumerType:6'"
     * @generated
     */
    FeatureMap getScheduledBatchPollConsumerType();

    /**
     * Returns the value of the '<em><b>Max Messages Per Poll</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Object}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Messages Per Poll</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Messages Per Poll</em>' attribute list.
     * @see #isSetMaxMessagesPerPoll()
     * @see #unsetMaxMessagesPerPoll()
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_MaxMessagesPerPoll()
     * @model default="0" unique="false" unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='maxMessagesPerPoll' namespace='##targetNamespace' group='#ScheduledBatchPollConsumerType:6'"
     * @generated
     */
    EList<Object> getMaxMessagesPerPoll();

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxMessagesPerPoll()
     * @see #getMaxMessagesPerPoll()
     * @generated
     */
    void unsetMaxMessagesPerPoll();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}' attribute list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Messages Per Poll</em>' attribute list is set.
     * @see #unsetMaxMessagesPerPoll()
     * @see #getMaxMessagesPerPoll()
     * @generated
     */
    boolean isSetMaxMessagesPerPoll();

    /**
     * Returns the value of the '<em><b>Consume Delete</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consume Delete</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consume Delete</em>' attribute.
     * @see #isSetConsumeDelete()
     * @see #unsetConsumeDelete()
     * @see #setConsumeDelete(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_ConsumeDelete()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='consumeDelete' namespace='##targetNamespace'"
     * @generated
     */
    boolean isConsumeDelete();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumeDelete <em>Consume Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consume Delete</em>' attribute.
     * @see #isSetConsumeDelete()
     * @see #unsetConsumeDelete()
     * @see #isConsumeDelete()
     * @generated
     */
    void setConsumeDelete(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumeDelete <em>Consume Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConsumeDelete()
     * @see #isConsumeDelete()
     * @see #setConsumeDelete(boolean)
     * @generated
     */
    void unsetConsumeDelete();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumeDelete <em>Consume Delete</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Consume Delete</em>' attribute is set.
     * @see #unsetConsumeDelete()
     * @see #isConsumeDelete()
     * @see #setConsumeDelete(boolean)
     * @generated
     */
    boolean isSetConsumeDelete();

    /**
     * Returns the value of the '<em><b>Consume Lock Entity</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consume Lock Entity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consume Lock Entity</em>' attribute.
     * @see #isSetConsumeLockEntity()
     * @see #unsetConsumeLockEntity()
     * @see #setConsumeLockEntity(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_ConsumeLockEntity()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='consumeLockEntity' namespace='##targetNamespace'"
     * @generated
     */
    boolean isConsumeLockEntity();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumeLockEntity <em>Consume Lock Entity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consume Lock Entity</em>' attribute.
     * @see #isSetConsumeLockEntity()
     * @see #unsetConsumeLockEntity()
     * @see #isConsumeLockEntity()
     * @generated
     */
    void setConsumeLockEntity(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumeLockEntity <em>Consume Lock Entity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConsumeLockEntity()
     * @see #isConsumeLockEntity()
     * @see #setConsumeLockEntity(boolean)
     * @generated
     */
    void unsetConsumeLockEntity();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumeLockEntity <em>Consume Lock Entity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Consume Lock Entity</em>' attribute is set.
     * @see #unsetConsumeLockEntity()
     * @see #isConsumeLockEntity()
     * @see #setConsumeLockEntity(boolean)
     * @generated
     */
    boolean isSetConsumeLockEntity();

    /**
     * Returns the value of the '<em><b>Maximum Results</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maximum Results</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Maximum Results</em>' attribute.
     * @see #isSetMaximumResults()
     * @see #unsetMaximumResults()
     * @see #setMaximumResults(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_MaximumResults()
     * @model default="-1" unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='maximumResults' namespace='##targetNamespace'"
     * @generated
     */
    Object getMaximumResults();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getMaximumResults <em>Maximum Results</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Results</em>' attribute.
     * @see #isSetMaximumResults()
     * @see #unsetMaximumResults()
     * @see #getMaximumResults()
     * @generated
     */
    void setMaximumResults(Object value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getMaximumResults <em>Maximum Results</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaximumResults()
     * @see #getMaximumResults()
     * @see #setMaximumResults(Object)
     * @generated
     */
    void unsetMaximumResults();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getMaximumResults <em>Maximum Results</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Maximum Results</em>' attribute is set.
     * @see #unsetMaximumResults()
     * @see #getMaximumResults()
     * @see #setMaximumResults(Object)
     * @generated
     */
    boolean isSetMaximumResults();

    /**
     * Returns the value of the '<em><b>Consumer Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consumer Query</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consumer Query</em>' attribute.
     * @see #setConsumerQuery(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_ConsumerQuery()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='consumer.query' namespace='##targetNamespace'"
     * @generated
     */
    String getConsumerQuery();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerQuery <em>Consumer Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consumer Query</em>' attribute.
     * @see #getConsumerQuery()
     * @generated
     */
    void setConsumerQuery(String value);

    /**
     * Returns the value of the '<em><b>Consumer Named Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consumer Named Query</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consumer Named Query</em>' attribute.
     * @see #setConsumerNamedQuery(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_ConsumerNamedQuery()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='consumer.namedQuery' namespace='##targetNamespace'"
     * @generated
     */
    String getConsumerNamedQuery();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerNamedQuery <em>Consumer Named Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consumer Named Query</em>' attribute.
     * @see #getConsumerNamedQuery()
     * @generated
     */
    void setConsumerNamedQuery(String value);

    /**
     * Returns the value of the '<em><b>Consumer Native Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consumer Native Query</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consumer Native Query</em>' attribute.
     * @see #setConsumerNativeQuery(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_ConsumerNativeQuery()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='consumer.nativeQuery' namespace='##targetNamespace'"
     * @generated
     */
    String getConsumerNativeQuery();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerNativeQuery <em>Consumer Native Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consumer Native Query</em>' attribute.
     * @see #getConsumerNativeQuery()
     * @generated
     */
    void setConsumerNativeQuery(String value);

    /**
     * Returns the value of the '<em><b>Consumer Result Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consumer Result Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consumer Result Class</em>' attribute.
     * @see #setConsumerResultClass(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_ConsumerResultClass()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='consumer.resultClass' namespace='##targetNamespace'"
     * @generated
     */
    String getConsumerResultClass();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerResultClass <em>Consumer Result Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consumer Result Class</em>' attribute.
     * @see #getConsumerResultClass()
     * @generated
     */
    void setConsumerResultClass(String value);

    /**
     * Returns the value of the '<em><b>Consumer Transacted</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consumer Transacted</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consumer Transacted</em>' attribute.
     * @see #isSetConsumerTransacted()
     * @see #unsetConsumerTransacted()
     * @see #setConsumerTransacted(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaConsumerType_ConsumerTransacted()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='consumer.transacted' namespace='##targetNamespace'"
     * @generated
     */
    boolean isConsumerTransacted();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumerTransacted <em>Consumer Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consumer Transacted</em>' attribute.
     * @see #isSetConsumerTransacted()
     * @see #unsetConsumerTransacted()
     * @see #isConsumerTransacted()
     * @generated
     */
    void setConsumerTransacted(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumerTransacted <em>Consumer Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConsumerTransacted()
     * @see #isConsumerTransacted()
     * @see #setConsumerTransacted(boolean)
     * @generated
     */
    void unsetConsumerTransacted();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumerTransacted <em>Consumer Transacted</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Consumer Transacted</em>' attribute is set.
     * @see #unsetConsumerTransacted()
     * @see #isConsumerTransacted()
     * @see #setConsumerTransacted(boolean)
     * @generated
     */
    boolean isSetConsumerTransacted();

} // JpaConsumerType
