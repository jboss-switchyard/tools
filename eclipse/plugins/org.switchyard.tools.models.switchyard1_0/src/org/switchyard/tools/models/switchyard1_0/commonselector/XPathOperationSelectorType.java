/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonselector;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XPath Operation Selector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonselector.XPathOperationSelectorType#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage#getXPathOperationSelectorType()
 * @model extendedMetaData="name='XPathOperationSelectorType' kind='empty'"
 * @generated
 */
public interface XPathOperationSelectorType extends SwitchYardOperationSelectorType {
    /**
     * Returns the value of the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' attribute.
     * @see #setExpression(String)
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage#getXPathOperationSelectorType_Expression()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='expression'"
     * @generated
     */
    String getExpression();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.XPathOperationSelectorType#getExpression <em>Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' attribute.
     * @see #getExpression()
     * @generated
     */
    void setExpression(String value);

} // XPathOperationSelectorType
