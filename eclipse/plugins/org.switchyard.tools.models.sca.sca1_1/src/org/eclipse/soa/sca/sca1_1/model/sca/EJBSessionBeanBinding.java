/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EJB Session Bean Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getEjbLinkName <em>Ejb Link Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getEjbVersion <em>Ejb Version</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getHomeInterface <em>Home Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getEJBSessionBeanBinding()
 * @model extendedMetaData="name='EJBSessionBeanBinding' kind='elementOnly'"
 * @generated
 */
public interface EJBSessionBeanBinding extends Binding {
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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getEJBSessionBeanBinding_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':10' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Ejb Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Link Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Link Name</em>' attribute.
	 * @see #setEjbLinkName(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getEJBSessionBeanBinding_EjbLinkName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ejb-link-name'"
	 * @generated
	 */
	String getEjbLinkName();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getEjbLinkName <em>Ejb Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Link Name</em>' attribute.
	 * @see #getEjbLinkName()
	 * @generated
	 */
	void setEjbLinkName(String value);

	/**
	 * Returns the value of the '<em><b>Ejb Version</b></em>' attribute.
	 * The default value is <code>"EJB3"</code>.
	 * The literals are from the enumeration {@link org.eclipse.soa.sca.sca1_1.model.sca.VersionValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Version</em>' attribute.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.VersionValue
	 * @see #isSetEjbVersion()
	 * @see #unsetEjbVersion()
	 * @see #setEjbVersion(VersionValue)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getEJBSessionBeanBinding_EjbVersion()
	 * @model default="EJB3" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ejb-version'"
	 * @generated
	 */
	VersionValue getEjbVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getEjbVersion <em>Ejb Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Version</em>' attribute.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.VersionValue
	 * @see #isSetEjbVersion()
	 * @see #unsetEjbVersion()
	 * @see #getEjbVersion()
	 * @generated
	 */
	void setEjbVersion(VersionValue value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getEjbVersion <em>Ejb Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEjbVersion()
	 * @see #getEjbVersion()
	 * @see #setEjbVersion(VersionValue)
	 * @generated
	 */
	void unsetEjbVersion();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getEjbVersion <em>Ejb Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ejb Version</em>' attribute is set.
	 * @see #unsetEjbVersion()
	 * @see #getEjbVersion()
	 * @see #setEjbVersion(VersionValue)
	 * @generated
	 */
	boolean isSetEjbVersion();

	/**
	 * Returns the value of the '<em><b>Home Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Interface</em>' attribute.
	 * @see #setHomeInterface(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getEJBSessionBeanBinding_HomeInterface()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='homeInterface'"
	 * @generated
	 */
	String getHomeInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getHomeInterface <em>Home Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Interface</em>' attribute.
	 * @see #getHomeInterface()
	 * @generated
	 */
	void setHomeInterface(String value);

} // EJBSessionBeanBinding
