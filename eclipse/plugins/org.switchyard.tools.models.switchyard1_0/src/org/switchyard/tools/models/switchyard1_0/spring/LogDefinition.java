/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.LogDefinition#getLoggingLevel <em>Logging Level</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.LogDefinition#getLogName <em>Log Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.LogDefinition#getMessage <em>Message</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.LogDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getLogDefinition()
 * @model extendedMetaData="name='logDefinition' kind='elementOnly'"
 * @generated
 */
public interface LogDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Logging Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logging Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logging Level</em>' attribute.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel
	 * @see #isSetLoggingLevel()
	 * @see #unsetLoggingLevel()
	 * @see #setLoggingLevel(LoggingLevel)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getLogDefinition_LoggingLevel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='loggingLevel'"
	 * @generated
	 */
	LoggingLevel getLoggingLevel();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.LogDefinition#getLoggingLevel <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logging Level</em>' attribute.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel
	 * @see #isSetLoggingLevel()
	 * @see #unsetLoggingLevel()
	 * @see #getLoggingLevel()
	 * @generated
	 */
	void setLoggingLevel(LoggingLevel value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.LogDefinition#getLoggingLevel <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLoggingLevel()
	 * @see #getLoggingLevel()
	 * @see #setLoggingLevel(LoggingLevel)
	 * @generated
	 */
	void unsetLoggingLevel();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.LogDefinition#getLoggingLevel <em>Logging Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Logging Level</em>' attribute is set.
	 * @see #unsetLoggingLevel()
	 * @see #getLoggingLevel()
	 * @see #setLoggingLevel(LoggingLevel)
	 * @generated
	 */
	boolean isSetLoggingLevel();

	/**
	 * Returns the value of the '<em><b>Log Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Name</em>' attribute.
	 * @see #setLogName(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getLogDefinition_LogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logName'"
	 * @generated
	 */
	String getLogName();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.LogDefinition#getLogName <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Name</em>' attribute.
	 * @see #getLogName()
	 * @generated
	 */
	void setLogName(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getLogDefinition_Message()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='message'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.LogDefinition#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute2</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute2</em>' attribute list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getLogDefinition_AnyAttribute2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':8' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute2();

} // LogDefinition
