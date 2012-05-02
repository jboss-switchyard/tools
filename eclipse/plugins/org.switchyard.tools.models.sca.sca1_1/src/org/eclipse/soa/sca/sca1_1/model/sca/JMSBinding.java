/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JMS Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getConnectionFactory <em>Connection Factory</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getActivationSpec <em>Activation Spec</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getResponse <em>Response</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getMessageSelection <em>Message Selection</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getResourceAdapter <em>Resource Adapter</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getOperationProperties <em>Operation Properties</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getCorrelationScheme <em>Correlation Scheme</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getInitialContextFactory <em>Initial Context Factory</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getJndiURL <em>Jndi URL</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getOperationProperties1 <em>Operation Properties1</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getRequestConnection <em>Request Connection</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getResponseConnection <em>Response Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding()
 * @model extendedMetaData="name='JMSBinding' kind='elementOnly'"
 * @generated
 */
public interface JMSBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(JMSDestination)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_Destination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='destination' namespace='##targetNamespace'"
	 * @generated
	 */
	JMSDestination getDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(JMSDestination value);

	/**
	 * Returns the value of the '<em><b>Connection Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Factory</em>' containment reference.
	 * @see #setConnectionFactory(JMSConnectionFactory)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_ConnectionFactory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connectionFactory' namespace='##targetNamespace'"
	 * @generated
	 */
	JMSConnectionFactory getConnectionFactory();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getConnectionFactory <em>Connection Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Factory</em>' containment reference.
	 * @see #getConnectionFactory()
	 * @generated
	 */
	void setConnectionFactory(JMSConnectionFactory value);

	/**
	 * Returns the value of the '<em><b>Activation Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Spec</em>' containment reference.
	 * @see #setActivationSpec(JMSActivationSpec)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_ActivationSpec()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activationSpec' namespace='##targetNamespace'"
	 * @generated
	 */
	JMSActivationSpec getActivationSpec();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getActivationSpec <em>Activation Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Spec</em>' containment reference.
	 * @see #getActivationSpec()
	 * @generated
	 */
	void setActivationSpec(JMSActivationSpec value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(JMSResponse)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_Response()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='response' namespace='##targetNamespace'"
	 * @generated
	 */
	JMSResponse getResponse();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(JMSResponse value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference.
	 * @see #setHeaders(JMSHeaders)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_Headers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='headers' namespace='##targetNamespace'"
	 * @generated
	 */
	JMSHeaders getHeaders();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getHeaders <em>Headers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headers</em>' containment reference.
	 * @see #getHeaders()
	 * @generated
	 */
	void setHeaders(JMSHeaders value);

	/**
	 * Returns the value of the '<em><b>Message Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Selection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Selection</em>' containment reference.
	 * @see #setMessageSelection(JMSMessageSelection)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_MessageSelection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='messageSelection' namespace='##targetNamespace'"
	 * @generated
	 */
	JMSMessageSelection getMessageSelection();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getMessageSelection <em>Message Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Selection</em>' containment reference.
	 * @see #getMessageSelection()
	 * @generated
	 */
	void setMessageSelection(JMSMessageSelection value);

	/**
	 * Returns the value of the '<em><b>Resource Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Adapter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Adapter</em>' containment reference.
	 * @see #setResourceAdapter(JMSResourceAdapter)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_ResourceAdapter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceAdapter' namespace='##targetNamespace'"
	 * @generated
	 */
	JMSResourceAdapter getResourceAdapter();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getResourceAdapter <em>Resource Adapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Adapter</em>' containment reference.
	 * @see #getResourceAdapter()
	 * @generated
	 */
	void setResourceAdapter(JMSResourceAdapter value);

	/**
	 * Returns the value of the '<em><b>Operation Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Properties</em>' containment reference list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_OperationProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operationProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<JMSOperationProperties> getOperationProperties();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':18' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Correlation Scheme</b></em>' attribute.
	 * The default value is <code>"sca:messageId"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Scheme</em>' attribute.
	 * @see #isSetCorrelationScheme()
	 * @see #unsetCorrelationScheme()
	 * @see #setCorrelationScheme(QName)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_CorrelationScheme()
	 * @model default="sca:messageId" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='correlationScheme'"
	 * @generated
	 */
	QName getCorrelationScheme();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getCorrelationScheme <em>Correlation Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Scheme</em>' attribute.
	 * @see #isSetCorrelationScheme()
	 * @see #unsetCorrelationScheme()
	 * @see #getCorrelationScheme()
	 * @generated
	 */
	void setCorrelationScheme(QName value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getCorrelationScheme <em>Correlation Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCorrelationScheme()
	 * @see #getCorrelationScheme()
	 * @see #setCorrelationScheme(QName)
	 * @generated
	 */
	void unsetCorrelationScheme();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getCorrelationScheme <em>Correlation Scheme</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Correlation Scheme</em>' attribute is set.
	 * @see #unsetCorrelationScheme()
	 * @see #getCorrelationScheme()
	 * @see #setCorrelationScheme(QName)
	 * @generated
	 */
	boolean isSetCorrelationScheme();

	/**
	 * Returns the value of the '<em><b>Initial Context Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Context Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Context Factory</em>' attribute.
	 * @see #setInitialContextFactory(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_InitialContextFactory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='initialContextFactory'"
	 * @generated
	 */
	String getInitialContextFactory();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getInitialContextFactory <em>Initial Context Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Context Factory</em>' attribute.
	 * @see #getInitialContextFactory()
	 * @generated
	 */
	void setInitialContextFactory(String value);

	/**
	 * Returns the value of the '<em><b>Jndi URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jndi URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jndi URL</em>' attribute.
	 * @see #setJndiURL(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_JndiURL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='jndiURL'"
	 * @generated
	 */
	String getJndiURL();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getJndiURL <em>Jndi URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi URL</em>' attribute.
	 * @see #getJndiURL()
	 * @generated
	 */
	void setJndiURL(String value);

	/**
	 * Returns the value of the '<em><b>Operation Properties1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Properties1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Properties1</em>' attribute.
	 * @see #setOperationProperties1(QName)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_OperationProperties1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='operationProperties'"
	 * @generated
	 */
	QName getOperationProperties1();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getOperationProperties1 <em>Operation Properties1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Properties1</em>' attribute.
	 * @see #getOperationProperties1()
	 * @generated
	 */
	void setOperationProperties1(QName value);

	/**
	 * Returns the value of the '<em><b>Request Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Connection</em>' attribute.
	 * @see #setRequestConnection(QName)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_RequestConnection()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='requestConnection'"
	 * @generated
	 */
	QName getRequestConnection();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getRequestConnection <em>Request Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Connection</em>' attribute.
	 * @see #getRequestConnection()
	 * @generated
	 */
	void setRequestConnection(QName value);

	/**
	 * Returns the value of the '<em><b>Response Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Connection</em>' attribute.
	 * @see #setResponseConnection(QName)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSBinding_ResponseConnection()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='responseConnection'"
	 * @generated
	 */
	QName getResponseConnection();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getResponseConnection <em>Response Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Connection</em>' attribute.
	 * @see #getResponseConnection()
	 * @generated
	 */
	void setResponseConnection(QName value);

} // JMSBinding
