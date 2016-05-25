/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;

import org.eclipse.soa.sca.sca1_1.model.sca.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Esb Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface#getFaultType <em>Fault Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface#getOutputType <em>Output Type</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getEsbInterface()
 * @model extendedMetaData="name='EsbInterface' kind='elementOnly'"
 * @generated
 */
public interface EsbInterface extends Interface {

    /**
     * Returns the value of the '<em><b>Input Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Type</em>' attribute.
     * @see #setInputType(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getEsbInterface_InputType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='inputType'"
     * @generated
     */
    String getInputType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface#getInputType <em>Input Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Type</em>' attribute.
     * @see #getInputType()
     * @generated
     */
    void setInputType(String value);

    /**
     * Returns the value of the '<em><b>Output Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Type</em>' attribute.
     * @see #setOutputType(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getEsbInterface_OutputType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='outputType'"
     * @generated
     */
    String getOutputType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface#getOutputType <em>Output Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Type</em>' attribute.
     * @see #getOutputType()
     * @generated
     */
    void setOutputType(String value);

    /**
     * Returns the value of the '<em><b>Fault Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fault Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fault Type</em>' attribute.
     * @see #setFaultType(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getEsbInterface_FaultType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='faultType'"
     * @generated
     */
    String getFaultType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface#getFaultType <em>Fault Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fault Type</em>' attribute.
     * @see #getFaultType()
     * @generated
     */
    void setFaultType(String value);
} // EsbInterface
