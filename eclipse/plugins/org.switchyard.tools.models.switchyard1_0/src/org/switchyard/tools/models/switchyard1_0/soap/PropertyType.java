/**
 */
package org.switchyard.tools.models.switchyard1_0.soap;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.PropertyType#getPropName <em>Prop Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.PropertyType#getPropValue <em>Prop Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getPropertyType()
 * @model extendedMetaData="name='PropertyType' kind='empty' namespace='##targetNamespace'"
 * @generated
 */
public interface PropertyType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Prop Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prop Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prop Name</em>' attribute.
     * @see #setPropName(String)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getPropertyType_PropName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getPropName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.PropertyType#getPropName <em>Prop Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prop Name</em>' attribute.
     * @see #getPropName()
     * @generated
     */
    void setPropName(String value);

    /**
     * Returns the value of the '<em><b>Prop Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prop Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prop Value</em>' attribute.
     * @see #setPropValue(String)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getPropertyType_PropValue()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='value'"
     * @generated
     */
    String getPropValue();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.PropertyType#getPropValue <em>Prop Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prop Value</em>' attribute.
     * @see #getPropValue()
     * @generated
     */
    void setPropValue(String value);

} // PropertyType
