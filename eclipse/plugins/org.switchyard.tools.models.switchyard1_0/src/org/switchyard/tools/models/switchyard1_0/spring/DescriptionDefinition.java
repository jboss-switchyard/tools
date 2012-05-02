/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getValue <em>Value</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLang <em>Lang</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutHeight <em>Layout Height</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutWidth <em>Layout Width</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutX <em>Layout X</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutY <em>Layout Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDescriptionDefinition()
 * @model extendedMetaData="name='descriptionDefinition' kind='simple'"
 * @generated
 */
public interface DescriptionDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDescriptionDefinition_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDescriptionDefinition_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lang'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Height</em>' attribute.
	 * @see #isSetLayoutHeight()
	 * @see #unsetLayoutHeight()
	 * @see #setLayoutHeight(double)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDescriptionDefinition_LayoutHeight()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='layoutHeight'"
	 * @generated
	 */
	double getLayoutHeight();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutHeight <em>Layout Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Height</em>' attribute.
	 * @see #isSetLayoutHeight()
	 * @see #unsetLayoutHeight()
	 * @see #getLayoutHeight()
	 * @generated
	 */
	void setLayoutHeight(double value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutHeight <em>Layout Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayoutHeight()
	 * @see #getLayoutHeight()
	 * @see #setLayoutHeight(double)
	 * @generated
	 */
	void unsetLayoutHeight();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutHeight <em>Layout Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layout Height</em>' attribute is set.
	 * @see #unsetLayoutHeight()
	 * @see #getLayoutHeight()
	 * @see #setLayoutHeight(double)
	 * @generated
	 */
	boolean isSetLayoutHeight();

	/**
	 * Returns the value of the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Width</em>' attribute.
	 * @see #isSetLayoutWidth()
	 * @see #unsetLayoutWidth()
	 * @see #setLayoutWidth(double)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDescriptionDefinition_LayoutWidth()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='layoutWidth'"
	 * @generated
	 */
	double getLayoutWidth();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutWidth <em>Layout Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Width</em>' attribute.
	 * @see #isSetLayoutWidth()
	 * @see #unsetLayoutWidth()
	 * @see #getLayoutWidth()
	 * @generated
	 */
	void setLayoutWidth(double value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutWidth <em>Layout Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayoutWidth()
	 * @see #getLayoutWidth()
	 * @see #setLayoutWidth(double)
	 * @generated
	 */
	void unsetLayoutWidth();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutWidth <em>Layout Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layout Width</em>' attribute is set.
	 * @see #unsetLayoutWidth()
	 * @see #getLayoutWidth()
	 * @see #setLayoutWidth(double)
	 * @generated
	 */
	boolean isSetLayoutWidth();

	/**
	 * Returns the value of the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout X</em>' attribute.
	 * @see #isSetLayoutX()
	 * @see #unsetLayoutX()
	 * @see #setLayoutX(double)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDescriptionDefinition_LayoutX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='layoutX'"
	 * @generated
	 */
	double getLayoutX();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutX <em>Layout X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout X</em>' attribute.
	 * @see #isSetLayoutX()
	 * @see #unsetLayoutX()
	 * @see #getLayoutX()
	 * @generated
	 */
	void setLayoutX(double value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutX <em>Layout X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayoutX()
	 * @see #getLayoutX()
	 * @see #setLayoutX(double)
	 * @generated
	 */
	void unsetLayoutX();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutX <em>Layout X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layout X</em>' attribute is set.
	 * @see #unsetLayoutX()
	 * @see #getLayoutX()
	 * @see #setLayoutX(double)
	 * @generated
	 */
	boolean isSetLayoutX();

	/**
	 * Returns the value of the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Y</em>' attribute.
	 * @see #isSetLayoutY()
	 * @see #unsetLayoutY()
	 * @see #setLayoutY(double)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDescriptionDefinition_LayoutY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='layoutY'"
	 * @generated
	 */
	double getLayoutY();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutY <em>Layout Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Y</em>' attribute.
	 * @see #isSetLayoutY()
	 * @see #unsetLayoutY()
	 * @see #getLayoutY()
	 * @generated
	 */
	void setLayoutY(double value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutY <em>Layout Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayoutY()
	 * @see #getLayoutY()
	 * @see #setLayoutY(double)
	 * @generated
	 */
	void unsetLayoutY();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition#getLayoutY <em>Layout Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layout Y</em>' attribute is set.
	 * @see #unsetLayoutY()
	 * @see #getLayoutY()
	 * @see #setLayoutY(double)
	 * @generated
	 */
	boolean isSetLayoutY();

} // DescriptionDefinition
