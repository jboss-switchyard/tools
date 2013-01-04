/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getGlobals <em>Globals</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getId <em>Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getActionType1()
 * @model extendedMetaData="name='ActionType' kind='elementOnly'"
 * @generated
 */
public interface ActionType1 extends CommonExtensionBase {

    /**
     * Returns the value of the '<em><b>Globals</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Globals</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Globals</em>' containment reference.
     * @see #setGlobals(MappingsType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getActionType1_Globals()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='globals' namespace='##targetNamespace'"
     * @generated
     */
    MappingsType getGlobals();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getGlobals <em>Globals</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Globals</em>' containment reference.
     * @see #getGlobals()
     * @generated
     */
    void setGlobals(MappingsType value);

    /**
     * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inputs</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inputs</em>' containment reference.
     * @see #setInputs(MappingsType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getActionType1_Inputs()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='inputs' namespace='##targetNamespace'"
     * @generated
     */
    MappingsType getInputs();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getInputs <em>Inputs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inputs</em>' containment reference.
     * @see #getInputs()
     * @generated
     */
    void setInputs(MappingsType value);

    /**
     * Returns the value of the '<em><b>Outputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outputs</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outputs</em>' containment reference.
     * @see #setOutputs(MappingsType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getActionType1_Outputs()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='outputs' namespace='##targetNamespace'"
     * @generated
     */
    MappingsType getOutputs();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getOutputs <em>Outputs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outputs</em>' containment reference.
     * @see #getOutputs()
     * @generated
     */
    void setOutputs(MappingsType value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getActionType1_Id()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' attribute.
     * @see #setOperation(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getActionType1_Operation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='operation'"
     * @generated
     */
    String getOperation();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getOperation <em>Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation</em>' attribute.
     * @see #getOperation()
     * @generated
     */
    void setOperation(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.rules.ActionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(ActionType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getActionType1_Type()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    ActionType getType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(ActionType value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(ActionType)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(ActionType)
     * @generated
     */
    boolean isSetType();
} // ActionType1
