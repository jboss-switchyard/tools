/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.netty;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Uri Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.AdditionalUriParametersType#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getAdditionalUriParametersType()
 * @model extendedMetaData="name='additionalUriParameters_._type' kind='elementOnly'"
 * @generated
 */
public interface AdditionalUriParametersType extends EObject {
    /**
     * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.camel.netty.ParameterType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getAdditionalUriParametersType_Parameter()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
     * @generated
     */
    EList<ParameterType> getParameter();

} // AdditionalUriParametersType
