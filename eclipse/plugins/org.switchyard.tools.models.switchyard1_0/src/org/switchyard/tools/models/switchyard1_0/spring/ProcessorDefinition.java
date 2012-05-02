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
 * A representation of the model object '<em><b>Processor Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ProcessorDefinition#isInheritErrorHandler <em>Inherit Error Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ProcessorDefinition#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getProcessorDefinition()
 * @model abstract="true"
 *        extendedMetaData="name='processorDefinition' kind='elementOnly'"
 * @generated
 */
public interface ProcessorDefinition extends OptionalIdentifiedDefinition {
	/**
	 * Returns the value of the '<em><b>Inherit Error Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherit Error Handler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherit Error Handler</em>' attribute.
	 * @see #isSetInheritErrorHandler()
	 * @see #unsetInheritErrorHandler()
	 * @see #setInheritErrorHandler(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getProcessorDefinition_InheritErrorHandler()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='inheritErrorHandler'"
	 * @generated
	 */
	boolean isInheritErrorHandler();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ProcessorDefinition#isInheritErrorHandler <em>Inherit Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherit Error Handler</em>' attribute.
	 * @see #isSetInheritErrorHandler()
	 * @see #unsetInheritErrorHandler()
	 * @see #isInheritErrorHandler()
	 * @generated
	 */
	void setInheritErrorHandler(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ProcessorDefinition#isInheritErrorHandler <em>Inherit Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInheritErrorHandler()
	 * @see #isInheritErrorHandler()
	 * @see #setInheritErrorHandler(boolean)
	 * @generated
	 */
	void unsetInheritErrorHandler();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ProcessorDefinition#isInheritErrorHandler <em>Inherit Error Handler</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inherit Error Handler</em>' attribute is set.
	 * @see #unsetInheritErrorHandler()
	 * @see #isInheritErrorHandler()
	 * @see #setInheritErrorHandler(boolean)
	 * @generated
	 */
	boolean isSetInheritErrorHandler();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getProcessorDefinition_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ProcessorDefinition
