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
 * A representation of the model object '<em><b>Rollback Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition#isMarkRollbackOnly <em>Mark Rollback Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition#isMarkRollbackOnlyLast <em>Mark Rollback Only Last</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition#getMessage <em>Message</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRollbackDefinition()
 * @model extendedMetaData="name='rollbackDefinition' kind='elementOnly'"
 * @generated
 */
public interface RollbackDefinition extends NoOutputDefinition {
	/**
     * Returns the value of the '<em><b>Mark Rollback Only</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mark Rollback Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mark Rollback Only</em>' attribute.
     * @see #isSetMarkRollbackOnly()
     * @see #unsetMarkRollbackOnly()
     * @see #setMarkRollbackOnly(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRollbackDefinition_MarkRollbackOnly()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='markRollbackOnly'"
     * @generated
     */
	boolean isMarkRollbackOnly();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition#isMarkRollbackOnly <em>Mark Rollback Only</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mark Rollback Only</em>' attribute.
     * @see #isSetMarkRollbackOnly()
     * @see #unsetMarkRollbackOnly()
     * @see #isMarkRollbackOnly()
     * @generated
     */
	void setMarkRollbackOnly(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition#isMarkRollbackOnly <em>Mark Rollback Only</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetMarkRollbackOnly()
     * @see #isMarkRollbackOnly()
     * @see #setMarkRollbackOnly(boolean)
     * @generated
     */
	void unsetMarkRollbackOnly();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition#isMarkRollbackOnly <em>Mark Rollback Only</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mark Rollback Only</em>' attribute is set.
     * @see #unsetMarkRollbackOnly()
     * @see #isMarkRollbackOnly()
     * @see #setMarkRollbackOnly(boolean)
     * @generated
     */
	boolean isSetMarkRollbackOnly();

	/**
     * Returns the value of the '<em><b>Mark Rollback Only Last</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mark Rollback Only Last</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mark Rollback Only Last</em>' attribute.
     * @see #isSetMarkRollbackOnlyLast()
     * @see #unsetMarkRollbackOnlyLast()
     * @see #setMarkRollbackOnlyLast(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRollbackDefinition_MarkRollbackOnlyLast()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='markRollbackOnlyLast'"
     * @generated
     */
	boolean isMarkRollbackOnlyLast();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition#isMarkRollbackOnlyLast <em>Mark Rollback Only Last</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mark Rollback Only Last</em>' attribute.
     * @see #isSetMarkRollbackOnlyLast()
     * @see #unsetMarkRollbackOnlyLast()
     * @see #isMarkRollbackOnlyLast()
     * @generated
     */
	void setMarkRollbackOnlyLast(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition#isMarkRollbackOnlyLast <em>Mark Rollback Only Last</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetMarkRollbackOnlyLast()
     * @see #isMarkRollbackOnlyLast()
     * @see #setMarkRollbackOnlyLast(boolean)
     * @generated
     */
	void unsetMarkRollbackOnlyLast();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition#isMarkRollbackOnlyLast <em>Mark Rollback Only Last</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mark Rollback Only Last</em>' attribute is set.
     * @see #unsetMarkRollbackOnlyLast()
     * @see #isMarkRollbackOnlyLast()
     * @see #setMarkRollbackOnlyLast(boolean)
     * @generated
     */
	boolean isSetMarkRollbackOnlyLast();

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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRollbackDefinition_Message()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='message'"
     * @generated
     */
	String getMessage();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition#getMessage <em>Message</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRollbackDefinition_AnyAttribute2()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':8' processing='skip'"
     * @generated
     */
	FeatureMap getAnyAttribute2();

} // RollbackDefinition
