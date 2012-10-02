/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.hornetq;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.BindingType#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getBindingType()
 * @model extendedMetaData="name='BindingType' kind='elementOnly'"
 * @generated
 */
public interface BindingType extends SwitchYardBindingType {
    /**
     * Returns the value of the '<em><b>Config</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Config</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Config</em>' containment reference.
     * @see #setConfig(ConfigType)
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getBindingType_Config()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='config' namespace='##targetNamespace'"
     * @generated
     */
    ConfigType getConfig();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.BindingType#getConfig <em>Config</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Config</em>' containment reference.
     * @see #getConfig()
     * @generated
     */
    void setConfig(ConfigType value);

} // BindingType
