/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getGlobals <em>Globals</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getEventId <em>Event Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getActionType1()
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
     * @see #setGlobals(GlobalsType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getActionType1_Globals()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='globals' namespace='##targetNamespace'"
     * @generated
     */
    GlobalsType getGlobals();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getGlobals <em>Globals</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Globals</em>' containment reference.
     * @see #getGlobals()
     * @generated
     */
    void setGlobals(GlobalsType value);

    /**
     * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inputs</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inputs</em>' containment reference.
     * @see #setInputs(InputsType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getActionType1_Inputs()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='inputs' namespace='##targetNamespace'"
     * @generated
     */
    InputsType getInputs();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getInputs <em>Inputs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inputs</em>' containment reference.
     * @see #getInputs()
     * @generated
     */
    void setInputs(InputsType value);

    /**
     * Returns the value of the '<em><b>Outputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outputs</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outputs</em>' containment reference.
     * @see #setOutputs(OutputsType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getActionType1_Outputs()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='outputs' namespace='##targetNamespace'"
     * @generated
     */
    OutputsType getOutputs();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getOutputs <em>Outputs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outputs</em>' containment reference.
     * @see #getOutputs()
     * @generated
     */
    void setOutputs(OutputsType value);

    /**
     * Returns the value of the '<em><b>Event Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Id</em>' attribute.
     * @see #setEventId(String)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getActionType1_EventId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='eventId'"
     * @generated
     */
    String getEventId();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getEventId <em>Event Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Id</em>' attribute.
     * @see #getEventId()
     * @generated
     */
    void setEventId(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getActionType1_Operation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='operation'"
     * @generated
     */
    String getOperation();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getOperation <em>Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation</em>' attribute.
     * @see #getOperation()
     * @generated
     */
    void setOperation(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(ActionType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getActionType1_Type()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    ActionType getType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(ActionType value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(ActionType)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getType <em>Type</em>}' attribute is set.
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
