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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getCamelOperationSelector <em>Camel Operation Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getBaseCamelBinding()
 * @model abstract="true"
 *        extendedMetaData="name='BaseCamelBinding' kind='elementOnly'"
 * @generated
 */
public interface BaseCamelBinding extends SwitchYardBindingType {
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
