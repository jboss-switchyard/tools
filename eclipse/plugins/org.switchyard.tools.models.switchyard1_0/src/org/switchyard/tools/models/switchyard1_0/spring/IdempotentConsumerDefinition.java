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
 * A representation of the model object '<em><b>Idempotent Consumer Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition#isEager <em>Eager</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition#getMessageIdRepositoryRef <em>Message Id Repository Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition#isSkipDuplicate <em>Skip Duplicate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getIdempotentConsumerDefinition()
 * @model extendedMetaData="name='idempotentConsumerDefinition' kind='elementOnly'"
 * @generated
 */
public interface IdempotentConsumerDefinition extends ExpressionNode {
	/**
	 * Returns the value of the '<em><b>Eager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eager</em>' attribute.
	 * @see #isSetEager()
	 * @see #unsetEager()
	 * @see #setEager(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getIdempotentConsumerDefinition_Eager()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='eager'"
	 * @generated
	 */
	boolean isEager();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition#isEager <em>Eager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eager</em>' attribute.
	 * @see #isSetEager()
	 * @see #unsetEager()
	 * @see #isEager()
	 * @generated
	 */
	void setEager(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition#isEager <em>Eager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEager()
	 * @see #isEager()
	 * @see #setEager(boolean)
	 * @generated
	 */
	void unsetEager();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition#isEager <em>Eager</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eager</em>' attribute is set.
	 * @see #unsetEager()
	 * @see #isEager()
	 * @see #setEager(boolean)
	 * @generated
	 */
	boolean isSetEager();

	/**
	 * Returns the value of the '<em><b>Message Id Repository Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Id Repository Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Id Repository Ref</em>' attribute.
	 * @see #setMessageIdRepositoryRef(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getIdempotentConsumerDefinition_MessageIdRepositoryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='messageIdRepositoryRef'"
	 * @generated
	 */
	String getMessageIdRepositoryRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition#getMessageIdRepositoryRef <em>Message Id Repository Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Id Repository Ref</em>' attribute.
	 * @see #getMessageIdRepositoryRef()
	 * @generated
	 */
	void setMessageIdRepositoryRef(String value);

	/**
	 * Returns the value of the '<em><b>Skip Duplicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skip Duplicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip Duplicate</em>' attribute.
	 * @see #isSetSkipDuplicate()
	 * @see #unsetSkipDuplicate()
	 * @see #setSkipDuplicate(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getIdempotentConsumerDefinition_SkipDuplicate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='skipDuplicate'"
	 * @generated
	 */
	boolean isSkipDuplicate();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition#isSkipDuplicate <em>Skip Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Duplicate</em>' attribute.
	 * @see #isSetSkipDuplicate()
	 * @see #unsetSkipDuplicate()
	 * @see #isSkipDuplicate()
	 * @generated
	 */
	void setSkipDuplicate(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition#isSkipDuplicate <em>Skip Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSkipDuplicate()
	 * @see #isSkipDuplicate()
	 * @see #setSkipDuplicate(boolean)
	 * @generated
	 */
	void unsetSkipDuplicate();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition#isSkipDuplicate <em>Skip Duplicate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Skip Duplicate</em>' attribute is set.
	 * @see #unsetSkipDuplicate()
	 * @see #isSkipDuplicate()
	 * @see #setSkipDuplicate(boolean)
	 * @generated
	 */
	boolean isSetSkipDuplicate();

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getIdempotentConsumerDefinition_AnyAttribute2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':43' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute2();

} // IdempotentConsumerDefinition
