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
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#getXopExpand <em>Xop Expand</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getMtomType()
 * @model extendedMetaData="name='MtomType' kind='elementOnly'"
 * @generated
 */
public interface MtomType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enabled</em>' attribute.
     * @see #setEnabled(Object)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getMtomType_Enabled()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropBoolean"
     *        extendedMetaData="kind='attribute' name='enabled'"
     * @generated
     */
    Object getEnabled();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#getEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enabled</em>' attribute.
     * @see #getEnabled()
     * @generated
     */
    void setEnabled(Object value);

    /**
     * Returns the value of the '<em><b>Threshold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Threshold</em>' attribute.
     * @see #setThreshold(Object)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getMtomType_Threshold()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='attribute' name='threshold'"
     * @generated
     */
    Object getThreshold();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#getThreshold <em>Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Threshold</em>' attribute.
     * @see #getThreshold()
     * @generated
     */
    void setThreshold(Object value);

    /**
     * Returns the value of the '<em><b>Xop Expand</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xop Expand</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xop Expand</em>' attribute.
     * @see #setXopExpand(Object)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getMtomType_XopExpand()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropBoolean"
     *        extendedMetaData="kind='attribute' name='xopExpand'"
     * @generated
     */
    Object getXopExpand();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#getXopExpand <em>Xop Expand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xop Expand</em>' attribute.
     * @see #getXopExpand()
     * @generated
     */
    void setXopExpand(Object value);

} // MtomType
