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
 * A representation of the model object '<em><b>Channel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getInput <em>Input</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getName <em>Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getChannelType()
 * @model extendedMetaData="name='ChannelType' kind='empty'"
 * @generated
 */
public interface ChannelType extends CommonExtensionBase {

    /**
     * Returns the value of the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Class</em>' attribute.
     * @see #setClass(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getChannelType_Class()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="name='class' kind='attribute'"
     * @generated
     */
    String getClass_();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getClass_ <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Class</em>' attribute.
     * @see #getClass_()
     * @generated
     */
    void setClass(String value);

    /**
     * Returns the value of the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' attribute.
     * @see #setInput(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getChannelType_Input()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="name='input' kind='attribute'"
     * @generated
     */
    String getInput();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getInput <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input</em>' attribute.
     * @see #getInput()
     * @generated
     */
    void setInput(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getChannelType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
     *        extendedMetaData="name='name' kind='attribute'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getChannelType_Operation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
     *        extendedMetaData="name='operation' kind='attribute'"
     * @generated
     */
    String getOperation();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getOperation <em>Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation</em>' attribute.
     * @see #getOperation()
     * @generated
     */
    void setOperation(String value);

    /**
     * Returns the value of the '<em><b>Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference</em>' attribute.
     * @see #setReference(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getChannelType_Reference()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="name='reference' kind='attribute'"
     * @generated
     */
    String getReference();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getReference <em>Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference</em>' attribute.
     * @see #getReference()
     * @generated
     */
    void setReference(String value);
} // ChannelType
