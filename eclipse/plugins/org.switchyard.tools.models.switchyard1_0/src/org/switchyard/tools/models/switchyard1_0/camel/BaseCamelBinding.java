/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Camel Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getCamelOperationSelector <em>Camel Operation Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getBaseCamelBinding()
 * @model extendedMetaData="name='BaseCamelBinding' kind='elementOnly'"
 * @generated
 */
public interface BaseCamelBinding extends SwitchYardBindingType {
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getBaseCamelBinding_ContextMapper()
     * @model unsettable="true"
     *        extendedMetaData="kind='element' name='contextMapper' namespace='##targetNamespace'"
     * @generated
     */
    ContextMapperType getContextMapper();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getContextMapper <em>Context Mapper</em>}' reference.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getContextMapper <em>Context Mapper</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetContextMapper()
     * @see #getContextMapper()
     * @see #setContextMapper(ContextMapperType)
     * @generated
     */
    void unsetContextMapper();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getContextMapper <em>Context Mapper</em>}' reference is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getBaseCamelBinding_MessageComposer()
     * @model extendedMetaData="kind='element' name='messageComposer' namespace='##targetNamespace'"
     * @generated
     */
    MessageComposerType getMessageComposer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getMessageComposer <em>Message Composer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Composer</em>' reference.
     * @see #getMessageComposer()
     * @generated
     */
    void setMessageComposer(MessageComposerType value);

    /**
     * Returns the value of the '<em><b>Camel Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Camel Operation Selector</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Camel Operation Selector</em>' containment reference.
     * @see #setCamelOperationSelector(CamelOperationSelectorType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getBaseCamelBinding_CamelOperationSelector()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='operationSelector' namespace='##targetNamespace'"
     * @generated
     */
    CamelOperationSelectorType getCamelOperationSelector();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getCamelOperationSelector <em>Camel Operation Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Camel Operation Selector</em>' containment reference.
     * @see #getCamelOperationSelector()
     * @generated
     */
    void setCamelOperationSelector(CamelOperationSelectorType value);

} // BaseCamelBinding
