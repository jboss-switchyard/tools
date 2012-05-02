/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.hornetq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discovery Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getLocalBindAddress <em>Local Bind Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getGroupAddress <em>Group Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getGroupPort <em>Group Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getRefreshTimeout <em>Refresh Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getInitialWaitTimeout <em>Initial Wait Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getDiscoveryGroupType()
 * @model extendedMetaData="name='discoveryGroupType' kind='elementOnly'"
 * @generated
 */
public interface DiscoveryGroupType extends EObject {
	/**
	 * Returns the value of the '<em><b>Local Bind Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Bind Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Bind Address</em>' attribute.
	 * @see #setLocalBindAddress(String)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getDiscoveryGroupType_LocalBindAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='localBindAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocalBindAddress();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getLocalBindAddress <em>Local Bind Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Bind Address</em>' attribute.
	 * @see #getLocalBindAddress()
	 * @generated
	 */
	void setLocalBindAddress(String value);

	/**
	 * Returns the value of the '<em><b>Group Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Address</em>' attribute.
	 * @see #setGroupAddress(String)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getDiscoveryGroupType_GroupAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='groupAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupAddress();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getGroupAddress <em>Group Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Address</em>' attribute.
	 * @see #getGroupAddress()
	 * @generated
	 */
	void setGroupAddress(String value);

	/**
	 * Returns the value of the '<em><b>Group Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Port</em>' attribute.
	 * @see #isSetGroupPort()
	 * @see #unsetGroupPort()
	 * @see #setGroupPort(int)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getDiscoveryGroupType_GroupPort()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='groupPort' namespace='##targetNamespace'"
	 * @generated
	 */
	int getGroupPort();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getGroupPort <em>Group Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Port</em>' attribute.
	 * @see #isSetGroupPort()
	 * @see #unsetGroupPort()
	 * @see #getGroupPort()
	 * @generated
	 */
	void setGroupPort(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getGroupPort <em>Group Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupPort()
	 * @see #getGroupPort()
	 * @see #setGroupPort(int)
	 * @generated
	 */
	void unsetGroupPort();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getGroupPort <em>Group Port</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Group Port</em>' attribute is set.
	 * @see #unsetGroupPort()
	 * @see #getGroupPort()
	 * @see #setGroupPort(int)
	 * @generated
	 */
	boolean isSetGroupPort();

	/**
	 * Returns the value of the '<em><b>Refresh Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Timeout</em>' attribute.
	 * @see #isSetRefreshTimeout()
	 * @see #unsetRefreshTimeout()
	 * @see #setRefreshTimeout(long)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getDiscoveryGroupType_RefreshTimeout()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='refreshTimeout' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRefreshTimeout();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getRefreshTimeout <em>Refresh Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Timeout</em>' attribute.
	 * @see #isSetRefreshTimeout()
	 * @see #unsetRefreshTimeout()
	 * @see #getRefreshTimeout()
	 * @generated
	 */
	void setRefreshTimeout(long value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getRefreshTimeout <em>Refresh Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefreshTimeout()
	 * @see #getRefreshTimeout()
	 * @see #setRefreshTimeout(long)
	 * @generated
	 */
	void unsetRefreshTimeout();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getRefreshTimeout <em>Refresh Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refresh Timeout</em>' attribute is set.
	 * @see #unsetRefreshTimeout()
	 * @see #getRefreshTimeout()
	 * @see #setRefreshTimeout(long)
	 * @generated
	 */
	boolean isSetRefreshTimeout();

	/**
	 * Returns the value of the '<em><b>Initial Wait Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Wait Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Wait Timeout</em>' attribute.
	 * @see #isSetInitialWaitTimeout()
	 * @see #unsetInitialWaitTimeout()
	 * @see #setInitialWaitTimeout(long)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getDiscoveryGroupType_InitialWaitTimeout()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='initialWaitTimeout' namespace='##targetNamespace'"
	 * @generated
	 */
	long getInitialWaitTimeout();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getInitialWaitTimeout <em>Initial Wait Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Wait Timeout</em>' attribute.
	 * @see #isSetInitialWaitTimeout()
	 * @see #unsetInitialWaitTimeout()
	 * @see #getInitialWaitTimeout()
	 * @generated
	 */
	void setInitialWaitTimeout(long value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getInitialWaitTimeout <em>Initial Wait Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialWaitTimeout()
	 * @see #getInitialWaitTimeout()
	 * @see #setInitialWaitTimeout(long)
	 * @generated
	 */
	void unsetInitialWaitTimeout();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getInitialWaitTimeout <em>Initial Wait Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial Wait Timeout</em>' attribute is set.
	 * @see #unsetInitialWaitTimeout()
	 * @see #getInitialWaitTimeout()
	 * @see #setInitialWaitTimeout(long)
	 * @generated
	 */
	boolean isSetInitialWaitTimeout();

} // DiscoveryGroupType
