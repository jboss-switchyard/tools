/**
 */
package org.switchyard.tools.models.switchyard1_0.soap;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mtom Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#isXopExpand <em>Xop Expand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getMtomType()
 * @model extendedMetaData="name='MtomType' kind='empty' namespace='##targetNamespace'"
 * @generated
 */
public interface MtomType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Enabled</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enabled</em>' attribute.
     * @see #setEnabled(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getMtomType_Enabled()
     * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='enabled'"
     * @generated
     */
    boolean isEnabled();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#isEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enabled</em>' attribute.
     * @see #isEnabled()
     * @generated
     */
    void setEnabled(boolean value);

    /**
     * Returns the value of the '<em><b>Threshold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Threshold</em>' attribute.
     * @see #setThreshold(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getMtomType_Threshold()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='attribute' name='threshold'"
     * @generated
     */
    Integer getThreshold();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#getThreshold <em>Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Threshold</em>' attribute.
     * @see #getThreshold()
     * @generated
     */
    void setThreshold(Integer value);

    /**
     * Returns the value of the '<em><b>Xop Expand</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xop Expand</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xop Expand</em>' attribute.
     * @see #setXopExpand(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getMtomType_XopExpand()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='xopExpand'"
     * @generated
     */
    boolean isXopExpand();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#isXopExpand <em>Xop Expand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xop Expand</em>' attribute.
     * @see #isXopExpand()
     * @generated
     */
    void setXopExpand(boolean value);

} // MtomType
