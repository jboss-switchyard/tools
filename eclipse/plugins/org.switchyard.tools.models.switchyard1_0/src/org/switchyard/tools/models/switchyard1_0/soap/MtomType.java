/**
 */
package org.switchyard.tools.models.switchyard1_0.soap;

import java.math.BigInteger;
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
 * @model extendedMetaData="name='MtomType' kind='elementOnly'"
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
     * @see #isSetEnabled()
     * @see #unsetEnabled()
     * @see #setEnabled(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getMtomType_Enabled()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='enabled'"
     * @generated
     */
    boolean isEnabled();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#isEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enabled</em>' attribute.
     * @see #isSetEnabled()
     * @see #unsetEnabled()
     * @see #isEnabled()
     * @generated
     */
    void setEnabled(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#isEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnabled()
     * @see #isEnabled()
     * @see #setEnabled(boolean)
     * @generated
     */
    void unsetEnabled();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#isEnabled <em>Enabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Enabled</em>' attribute is set.
     * @see #unsetEnabled()
     * @see #isEnabled()
     * @see #setEnabled(boolean)
     * @generated
     */
    boolean isSetEnabled();

    /**
     * Returns the value of the '<em><b>Threshold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Threshold</em>' attribute.
     * @see #setThreshold(BigInteger)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getMtomType_Threshold()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
     *        extendedMetaData="kind='attribute' name='threshold'"
     * @generated
     */
    BigInteger getThreshold();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#getThreshold <em>Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Threshold</em>' attribute.
     * @see #getThreshold()
     * @generated
     */
    void setThreshold(BigInteger value);

    /**
     * Returns the value of the '<em><b>Xop Expand</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xop Expand</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xop Expand</em>' attribute.
     * @see #isSetXopExpand()
     * @see #unsetXopExpand()
     * @see #setXopExpand(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getMtomType_XopExpand()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='xopExpand'"
     * @generated
     */
    boolean isXopExpand();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#isXopExpand <em>Xop Expand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xop Expand</em>' attribute.
     * @see #isSetXopExpand()
     * @see #unsetXopExpand()
     * @see #isXopExpand()
     * @generated
     */
    void setXopExpand(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#isXopExpand <em>Xop Expand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXopExpand()
     * @see #isXopExpand()
     * @see #setXopExpand(boolean)
     * @generated
     */
    void unsetXopExpand();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#isXopExpand <em>Xop Expand</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xop Expand</em>' attribute is set.
     * @see #unsetXopExpand()
     * @see #isXopExpand()
     * @see #setXopExpand(boolean)
     * @generated
     */
    boolean isSetXopExpand();

} // MtomType
