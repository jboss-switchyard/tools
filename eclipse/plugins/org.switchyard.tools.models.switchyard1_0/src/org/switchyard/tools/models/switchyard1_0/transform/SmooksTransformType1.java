/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.transform;

import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smooks Transform Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Smooks Transformer Configuration.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1#getType <em>Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1#getConfig <em>Config</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1#getReportPath <em>Report Path</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getSmooksTransformType1()
 * @model extendedMetaData="name='SmooksTransformType' kind='empty'"
 * @generated
 */
public interface SmooksTransformType1 extends TransformType {

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(SmooksTransformType)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getSmooksTransformType1_Type()
     * @model unsettable="true" required="true"
     *        extendedMetaData="name='type' kind='attribute'"
     * @generated
     */
    SmooksTransformType getType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(SmooksTransformType value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(SmooksTransformType)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(SmooksTransformType)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Config</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Config</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Config</em>' attribute.
     * @see #setConfig(String)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getSmooksTransformType1_Config()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="name='config' kind='attribute'"
     * @generated
     */
    String getConfig();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1#getConfig <em>Config</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Config</em>' attribute.
     * @see #getConfig()
     * @generated
     */
    void setConfig(String value);

    /**
     * Returns the value of the '<em><b>Report Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Report Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Report Path</em>' attribute.
     * @see #setReportPath(String)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getSmooksTransformType1_ReportPath()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="name='reportPath' kind='attribute'"
     * @generated
     */
    String getReportPath();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1#getReportPath <em>Report Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Report Path</em>' attribute.
     * @see #getReportPath()
     * @generated
     */
    void setReportPath(String value);
} // SmooksTransformType1
