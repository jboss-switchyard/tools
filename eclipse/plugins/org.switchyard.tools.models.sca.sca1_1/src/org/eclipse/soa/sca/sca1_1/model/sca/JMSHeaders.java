/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JMS Headers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getDeliveryMode <em>Delivery Mode</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getTimeToLive <em>Time To Live</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSHeaders()
 * @model extendedMetaData="name='JMSHeaders' kind='elementOnly'"
 * @generated
 */
public interface JMSHeaders extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSHeaders_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BindingProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Delivery Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.soa.sca.sca1_1.model.sca.DeliveryModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Mode</em>' attribute.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.DeliveryModeType
	 * @see #isSetDeliveryMode()
	 * @see #unsetDeliveryMode()
	 * @see #setDeliveryMode(DeliveryModeType)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSHeaders_DeliveryMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='deliveryMode'"
	 * @generated
	 */
	DeliveryModeType getDeliveryMode();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getDeliveryMode <em>Delivery Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Mode</em>' attribute.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.DeliveryModeType
	 * @see #isSetDeliveryMode()
	 * @see #unsetDeliveryMode()
	 * @see #getDeliveryMode()
	 * @generated
	 */
	void setDeliveryMode(DeliveryModeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getDeliveryMode <em>Delivery Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeliveryMode()
	 * @see #getDeliveryMode()
	 * @see #setDeliveryMode(DeliveryModeType)
	 * @generated
	 */
	void unsetDeliveryMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getDeliveryMode <em>Delivery Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delivery Mode</em>' attribute is set.
	 * @see #unsetDeliveryMode()
	 * @see #getDeliveryMode()
	 * @see #setDeliveryMode(DeliveryModeType)
	 * @generated
	 */
	boolean isSetDeliveryMode();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.soa.sca.sca1_1.model.sca.PriorityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.PriorityType
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(PriorityType)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSHeaders_Priority()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='priority'"
	 * @generated
	 */
	PriorityType getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.PriorityType
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(PriorityType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(PriorityType)
	 * @generated
	 */
	void unsetPriority();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(PriorityType)
	 * @generated
	 */
	boolean isSetPriority();

	/**
	 * Returns the value of the '<em><b>Time To Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time To Live</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time To Live</em>' attribute.
	 * @see #isSetTimeToLive()
	 * @see #unsetTimeToLive()
	 * @see #setTimeToLive(long)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSHeaders_TimeToLive()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='timeToLive'"
	 * @generated
	 */
	long getTimeToLive();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getTimeToLive <em>Time To Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Live</em>' attribute.
	 * @see #isSetTimeToLive()
	 * @see #unsetTimeToLive()
	 * @see #getTimeToLive()
	 * @generated
	 */
	void setTimeToLive(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getTimeToLive <em>Time To Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeToLive()
	 * @see #getTimeToLive()
	 * @see #setTimeToLive(long)
	 * @generated
	 */
	void unsetTimeToLive();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getTimeToLive <em>Time To Live</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time To Live</em>' attribute is set.
	 * @see #unsetTimeToLive()
	 * @see #getTimeToLive()
	 * @see #setTimeToLive(long)
	 * @generated
	 */
	boolean isSetTimeToLive();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSHeaders_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // JMSHeaders
