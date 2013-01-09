/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.atom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Poll Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#isUseFixedDelay <em>Use Fixed Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#isSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getAtomScheduledPollConsumerType()
 * @model extendedMetaData="name='AtomScheduledPollConsumerType' kind='elementOnly'"
 * @generated
 */
public interface AtomScheduledPollConsumerType extends EObject {

    /**
     * Returns the value of the '<em><b>Initial Delay</b></em>' attribute.
     * The default value is <code>"1000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Delay</em>' attribute.
     * @see #isSetInitialDelay()
     * @see #unsetInitialDelay()
     * @see #setInitialDelay(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getAtomScheduledPollConsumerType_InitialDelay()
     * @model default="1000" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='initialDelay' namespace='##targetNamespace'"
     * @generated
     */
    int getInitialDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#getInitialDelay <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Delay</em>' attribute.
     * @see #isSetInitialDelay()
     * @see #unsetInitialDelay()
     * @see #getInitialDelay()
     * @generated
     */
    void setInitialDelay(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#getInitialDelay <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInitialDelay()
     * @see #getInitialDelay()
     * @see #setInitialDelay(int)
     * @generated
     */
    void unsetInitialDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#getInitialDelay <em>Initial Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Initial Delay</em>' attribute is set.
     * @see #unsetInitialDelay()
     * @see #getInitialDelay()
     * @see #setInitialDelay(int)
     * @generated
     */
    boolean isSetInitialDelay();

    /**
     * Returns the value of the '<em><b>Delay</b></em>' attribute.
     * The default value is <code>"60000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' attribute.
     * @see #isSetDelay()
     * @see #unsetDelay()
     * @see #setDelay(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getAtomScheduledPollConsumerType_Delay()
     * @model default="60000" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace'"
     * @generated
     */
    int getDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' attribute.
     * @see #isSetDelay()
     * @see #unsetDelay()
     * @see #getDelay()
     * @generated
     */
    void setDelay(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDelay()
     * @see #getDelay()
     * @see #setDelay(int)
     * @generated
     */
    void unsetDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#getDelay <em>Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Delay</em>' attribute is set.
     * @see #unsetDelay()
     * @see #getDelay()
     * @see #setDelay(int)
     * @generated
     */
    boolean isSetDelay();

    /**
     * Returns the value of the '<em><b>Use Fixed Delay</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Fixed Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Fixed Delay</em>' attribute.
     * @see #isSetUseFixedDelay()
     * @see #unsetUseFixedDelay()
     * @see #setUseFixedDelay(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getAtomScheduledPollConsumerType_UseFixedDelay()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='useFixedDelay' namespace='##targetNamespace'"
     * @generated
     */
    boolean isUseFixedDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#isUseFixedDelay <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Fixed Delay</em>' attribute.
     * @see #isSetUseFixedDelay()
     * @see #unsetUseFixedDelay()
     * @see #isUseFixedDelay()
     * @generated
     */
    void setUseFixedDelay(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#isUseFixedDelay <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUseFixedDelay()
     * @see #isUseFixedDelay()
     * @see #setUseFixedDelay(boolean)
     * @generated
     */
    void unsetUseFixedDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#isUseFixedDelay <em>Use Fixed Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Use Fixed Delay</em>' attribute is set.
     * @see #unsetUseFixedDelay()
     * @see #isUseFixedDelay()
     * @see #setUseFixedDelay(boolean)
     * @generated
     */
    boolean isSetUseFixedDelay();

    /**
     * Returns the value of the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Send Empty Message When Idle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Send Empty Message When Idle</em>' attribute.
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getAtomScheduledPollConsumerType_SendEmptyMessageWhenIdle()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='sendEmptyMessageWhenIdle' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSendEmptyMessageWhenIdle();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#isSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Send Empty Message When Idle</em>' attribute.
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #isSendEmptyMessageWhenIdle()
     * @generated
     */
    void setSendEmptyMessageWhenIdle(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#isSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #isSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(boolean)
     * @generated
     */
    void unsetSendEmptyMessageWhenIdle();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#isSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Send Empty Message When Idle</em>' attribute is set.
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #isSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(boolean)
     * @generated
     */
    boolean isSetSendEmptyMessageWhenIdle();

    /**
     * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
     * The default value is <code>"MILLISECONDS"</code>.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.camel.atom.TimeUnitType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Unit</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.TimeUnitType
     * @see #isSetTimeUnit()
     * @see #unsetTimeUnit()
     * @see #setTimeUnit(TimeUnitType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getAtomScheduledPollConsumerType_TimeUnit()
     * @model default="MILLISECONDS" unsettable="true"
     *        extendedMetaData="kind='element' name='timeUnit' namespace='##targetNamespace'"
     * @generated
     */
    TimeUnitType getTimeUnit();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#getTimeUnit <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Unit</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.TimeUnitType
     * @see #isSetTimeUnit()
     * @see #unsetTimeUnit()
     * @see #getTimeUnit()
     * @generated
     */
    void setTimeUnit(TimeUnitType value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#getTimeUnit <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeUnit()
     * @see #getTimeUnit()
     * @see #setTimeUnit(TimeUnitType)
     * @generated
     */
    void unsetTimeUnit();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType#getTimeUnit <em>Time Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Unit</em>' attribute is set.
     * @see #unsetTimeUnit()
     * @see #getTimeUnit()
     * @see #setTimeUnit(TimeUnitType)
     * @generated
     */
    boolean isSetTimeUnit();
} // AtomScheduledPollConsumerType
