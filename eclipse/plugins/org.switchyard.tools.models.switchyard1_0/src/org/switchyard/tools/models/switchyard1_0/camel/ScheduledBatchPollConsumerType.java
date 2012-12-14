/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Batch Poll Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ScheduledBatchPollConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getScheduledBatchPollConsumerType()
 * @model extendedMetaData="name='ScheduledBatchPollConsumerType' kind='elementOnly'"
 * @generated
 */
public interface ScheduledBatchPollConsumerType extends ScheduledPollConsumerType {
    /**
     * Returns the value of the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Messages Per Poll</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Messages Per Poll</em>' attribute.
     * @see #setMaxMessagesPerPoll(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getScheduledBatchPollConsumerType_MaxMessagesPerPoll()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='maxMessagesPerPoll' namespace='##targetNamespace'"
     * @generated
     */
    Integer getMaxMessagesPerPoll();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ScheduledBatchPollConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Messages Per Poll</em>' attribute.
     * @see #getMaxMessagesPerPoll()
     * @generated
     */
    void setMaxMessagesPerPoll(Integer value);

} // ScheduledBatchPollConsumerType
