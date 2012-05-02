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
 * A representation of the model object '<em><b>Set Exchange Pattern Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SetExchangePatternDefinition#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SetExchangePatternDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSetExchangePatternDefinition()
 * @model extendedMetaData="name='setExchangePatternDefinition' kind='elementOnly'"
 * @generated
 */
public interface SetExchangePatternDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.ExchangePattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.ExchangePattern
	 * @see #isSetPattern()
	 * @see #unsetPattern()
	 * @see #setPattern(ExchangePattern)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSetExchangePatternDefinition_Pattern()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='pattern'"
	 * @generated
	 */
	ExchangePattern getPattern();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SetExchangePatternDefinition#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.ExchangePattern
	 * @see #isSetPattern()
	 * @see #unsetPattern()
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(ExchangePattern value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SetExchangePatternDefinition#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPattern()
	 * @see #getPattern()
	 * @see #setPattern(ExchangePattern)
	 * @generated
	 */
	void unsetPattern();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SetExchangePatternDefinition#getPattern <em>Pattern</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pattern</em>' attribute is set.
	 * @see #unsetPattern()
	 * @see #getPattern()
	 * @see #setPattern(ExchangePattern)
	 * @generated
	 */
	boolean isSetPattern();

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSetExchangePatternDefinition_AnyAttribute2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':6' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute2();

} // SetExchangePatternDefinition
