/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Export Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaExportType#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJavaExportType()
 * @model extendedMetaData="name='JavaExportType' kind='elementOnly'"
 * @generated
 */
public interface JavaExportType extends Export {
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJavaExportType_Package()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='package'"
     * @generated
     */
	String getPackage();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaExportType#getPackage <em>Package</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' attribute.
     * @see #getPackage()
     * @generated
     */
	void setPackage(String value);

} // JavaExportType
