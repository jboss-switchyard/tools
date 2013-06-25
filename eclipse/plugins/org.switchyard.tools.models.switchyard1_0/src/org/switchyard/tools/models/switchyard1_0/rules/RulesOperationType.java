/**
 */
package org.switchyard.tools.models.switchyard1_0.rules;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getGlobals <em>Globals</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getFaults <em>Faults</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getEventId <em>Event Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getName <em>Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesOperationType()
 * @model extendedMetaData="name='RulesOperationType' kind='elementOnly'"
 * @generated
 */
public interface RulesOperationType extends CommonExtensionBase {
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesOperationType_Globals()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='globals' namespace='##targetNamespace'"
     * @generated
     */
    GlobalsType getGlobals();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getGlobals <em>Globals</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesOperationType_Inputs()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='inputs' namespace='##targetNamespace'"
     * @generated
     */
    InputsType getInputs();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getInputs <em>Inputs</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesOperationType_Outputs()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='outputs' namespace='##targetNamespace'"
     * @generated
     */
    OutputsType getOutputs();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getOutputs <em>Outputs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outputs</em>' containment reference.
     * @see #getOutputs()
     * @generated
     */
    void setOutputs(OutputsType value);

    /**
     * Returns the value of the '<em><b>Faults</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Faults</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Faults</em>' containment reference.
     * @see #setFaults(FaultsType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesOperationType_Faults()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='faults' namespace='##targetNamespace'"
     * @generated
     */
    FaultsType getFaults();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getFaults <em>Faults</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Faults</em>' containment reference.
     * @see #getFaults()
     * @generated
     */
    void setFaults(FaultsType value);

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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesOperationType_EventId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='eventId'"
     * @generated
     */
    String getEventId();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getEventId <em>Event Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Id</em>' attribute.
     * @see #getEventId()
     * @generated
     */
    void setEventId(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesOperationType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.rules.OperationType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.rules.OperationType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(OperationType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesOperationType_Type()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    OperationType getType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.rules.OperationType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(OperationType value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(OperationType)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(OperationType)
     * @generated
     */
    boolean isSetType();

} // RulesOperationType
