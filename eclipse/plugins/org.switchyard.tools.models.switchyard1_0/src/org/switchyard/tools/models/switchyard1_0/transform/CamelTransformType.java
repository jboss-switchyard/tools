/**
 */
package org.switchyard.tools.models.switchyard1_0.transform;

import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Transform Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Camel Transformer Configuration.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.CamelTransformType#getEndpointUri <em>Endpoint Uri</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getCamelTransformType()
 * @model extendedMetaData="name='CamelTransformType' kind='empty'"
 * @generated
 */
public interface CamelTransformType extends TransformType {
    /**
     * Returns the value of the '<em><b>Endpoint Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Endpoint Uri</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Endpoint Uri</em>' attribute.
     * @see #setEndpointUri(String)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getCamelTransformType_EndpointUri()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='endpointUri'"
     * @generated
     */
    String getEndpointUri();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.CamelTransformType#getEndpointUri <em>Endpoint Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Endpoint Uri</em>' attribute.
     * @see #getEndpointUri()
     * @generated
     */
    void setEndpointUri(String value);

} // CamelTransformType
