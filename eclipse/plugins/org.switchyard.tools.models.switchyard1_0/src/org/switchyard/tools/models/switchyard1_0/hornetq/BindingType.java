/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.hornetq;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.BindingType#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.BindingType#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.BindingType#getHqOperationSelector <em>Hq Operation Selector</em>}</li>
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
     * Returns the value of the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Mapper</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Mapper</em>' containment reference.
     * @see #setContextMapper(ContextMapperType)
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getBindingType_ContextMapper()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='contextMapper' namespace='##targetNamespace'"
     * @generated
     */
    ContextMapperType getContextMapper();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.BindingType#getContextMapper <em>Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Mapper</em>' containment reference.
     * @see #getContextMapper()
     * @generated
     */
    void setContextMapper(ContextMapperType value);

    /**
     * Returns the value of the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Composer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Composer</em>' containment reference.
     * @see #setMessageComposer(MessageComposerType)
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getBindingType_MessageComposer()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='messageComposer' namespace='##targetNamespace'"
     * @generated
     */
    MessageComposerType getMessageComposer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.BindingType#getMessageComposer <em>Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Composer</em>' containment reference.
     * @see #getMessageComposer()
     * @generated
     */
    void setMessageComposer(MessageComposerType value);

    /**
     * Returns the value of the '<em><b>Hq Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hq Operation Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Hq Operation Selector</em>' containment reference.
     * @see #setHqOperationSelector(OperationSelectorType)
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getBindingType_HqOperationSelector()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='operationSelector' namespace='##targetNamespace'"
     * @generated
     */
	OperationSelectorType getHqOperationSelector();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.BindingType#getHqOperationSelector <em>Hq Operation Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hq Operation Selector</em>' containment reference.
     * @see #getHqOperationSelector()
     * @generated
     */
	void setHqOperationSelector(OperationSelectorType value);

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
