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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getMessageComposer <em>Message Composer</em>}</li>
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
     * Returns the value of the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Mapper</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Mapper</em>' reference.
     * @see #isSetContextMapper()
     * @see #unsetContextMapper()
     * @see #setContextMapper(ContextMapperType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelMockBindingType_ContextMapper()
     * @model unsettable="true"
     *        extendedMetaData="kind='element' name='contextMapper' namespace='##targetNamespace'"
     * @generated
     */
    ContextMapperType getContextMapper();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getContextMapper <em>Context Mapper</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Mapper</em>' reference.
     * @see #isSetContextMapper()
     * @see #unsetContextMapper()
     * @see #getContextMapper()
     * @generated
     */
    void setContextMapper(ContextMapperType value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getContextMapper <em>Context Mapper</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetContextMapper()
     * @see #getContextMapper()
     * @see #setContextMapper(ContextMapperType)
     * @generated
     */
    void unsetContextMapper();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getContextMapper <em>Context Mapper</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Context Mapper</em>' reference is set.
     * @see #unsetContextMapper()
     * @see #getContextMapper()
     * @see #setContextMapper(ContextMapperType)
     * @generated
     */
    boolean isSetContextMapper();

    /**
     * Returns the value of the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Composer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Composer</em>' reference.
     * @see #setMessageComposer(MessageComposerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelMockBindingType_MessageComposer()
     * @model extendedMetaData="kind='element' name='messageComposer' namespace='##targetNamespace'"
     * @generated
     */
    MessageComposerType getMessageComposer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getMessageComposer <em>Message Composer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Composer</em>' reference.
     * @see #getMessageComposer()
     * @generated
     */
    void setMessageComposer(MessageComposerType value);

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
