/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zip Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ZipDataFormat#getCompressionLevel <em>Compression Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getZipDataFormat()
 * @model extendedMetaData="name='zipDataFormat' kind='empty'"
 * @generated
 */
public interface ZipDataFormat extends DataFormat {
	/**
     * Returns the value of the '<em><b>Compression Level</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Compression Level</em>' attribute.
     * @see #isSetCompressionLevel()
     * @see #unsetCompressionLevel()
     * @see #setCompressionLevel(int)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getZipDataFormat_CompressionLevel()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='compressionLevel'"
     * @generated
     */
	int getCompressionLevel();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ZipDataFormat#getCompressionLevel <em>Compression Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Compression Level</em>' attribute.
     * @see #isSetCompressionLevel()
     * @see #unsetCompressionLevel()
     * @see #getCompressionLevel()
     * @generated
     */
	void setCompressionLevel(int value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ZipDataFormat#getCompressionLevel <em>Compression Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetCompressionLevel()
     * @see #getCompressionLevel()
     * @see #setCompressionLevel(int)
     * @generated
     */
	void unsetCompressionLevel();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ZipDataFormat#getCompressionLevel <em>Compression Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Compression Level</em>' attribute is set.
     * @see #unsetCompressionLevel()
     * @see #getCompressionLevel()
     * @see #setCompressionLevel(int)
     * @generated
     */
	boolean isSetCompressionLevel();

} // ZipDataFormat
