/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protobuf Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ProtobufDataFormat#getInstanceClass <em>Instance Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getProtobufDataFormat()
 * @model extendedMetaData="name='protobufDataFormat' kind='empty'"
 * @generated
 */
public interface ProtobufDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Class</em>' attribute.
	 * @see #setInstanceClass(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getProtobufDataFormat_InstanceClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='instanceClass'"
	 * @generated
	 */
	String getInstanceClass();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ProtobufDataFormat#getInstanceClass <em>Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Class</em>' attribute.
	 * @see #getInstanceClass()
	 * @generated
	 */
	void setInstanceClass(String value);

} // ProtobufDataFormat
