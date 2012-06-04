/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Import Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaImportType#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaImportType#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJavaImportType()
 * @model extendedMetaData="name='JavaImportType' kind='elementOnly'"
 * @generated
 */
public interface JavaImportType extends Import {
	/**
     * Returns the value of the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' attribute.
     * @see #setLocation(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJavaImportType_Location()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='location'"
     * @generated
     */
	String getLocation();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaImportType#getLocation <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' attribute.
     * @see #getLocation()
     * @generated
     */
	void setLocation(String value);

	/**
     * Returns the value of the '<em><b>Package</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' attribute.
     * @see #setPackage(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJavaImportType_Package()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='package'"
     * @generated
     */
	String getPackage();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaImportType#getPackage <em>Package</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' attribute.
     * @see #getPackage()
     * @generated
     */
	void setPackage(String value);

} // JavaImportType
