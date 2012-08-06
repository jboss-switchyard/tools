/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import java.math.BigInteger;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mock Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getNameElement <em>Name Element</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getReportGroup <em>Report Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelMockBindingType()
 * @model extendedMetaData="name='CamelMockBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelMockBindingType extends SwitchYardBindingType {
	/**
     * Returns the value of the '<em><b>Name Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name Element</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name Element</em>' attribute.
     * @see #setNameElement(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelMockBindingType_NameElement()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getNameElement();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getNameElement <em>Name Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name Element</em>' attribute.
     * @see #getNameElement()
     * @generated
     */
    void setNameElement(String value);

    /**
     * Returns the value of the '<em><b>Report Group</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Report Group</em>' attribute.
     * @see #setReportGroup(BigInteger)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelMockBindingType_ReportGroup()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
     *        extendedMetaData="kind='element' name='reportGroup' namespace='##targetNamespace'"
     * @generated
     */
	BigInteger getReportGroup();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getReportGroup <em>Report Group</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Report Group</em>' attribute.
     * @see #getReportGroup()
     * @generated
     */
	void setReportGroup(BigInteger value);

} // CamelMockBindingType
