/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Service Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding#getWsdlElement <em>Wsdl Element</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding#getWsdlLocation <em>Wsdl Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWebServiceBinding()
 * @model extendedMetaData="name='WebServiceBinding' kind='elementOnly'"
 * @generated
 */
public interface WebServiceBinding extends Binding {
	/**
     * Returns the value of the '<em><b>Endpoint Reference</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Endpoint Reference</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWebServiceBinding_EndpointReference()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='endpointReference' namespace='##targetNamespace'"
     * @generated
     */
	EList<EndpointReferenceType> getEndpointReference();

	/**
     * Returns the value of the '<em><b>Any</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Any</em>' attribute list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWebServiceBinding_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':11' processing='lax'"
     * @generated
     */
	FeatureMap getAny();

	/**
     * Returns the value of the '<em><b>Wsdl Element</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Wsdl Element</em>' attribute.
     * @see #setWsdlElement(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWebServiceBinding_WsdlElement()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='wsdlElement'"
     * @generated
     */
	String getWsdlElement();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding#getWsdlElement <em>Wsdl Element</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wsdl Element</em>' attribute.
     * @see #getWsdlElement()
     * @generated
     */
	void setWsdlElement(String value);

	/**
     * Returns the value of the '<em><b>Wsdl Location</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       This attribute can be used to provide some hints on where
     *       additional WSDL information for a given namespace can be
     *       found in order to help with QName resolution
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wsdl Location</em>' attribute.
     * @see #setWsdlLocation(List)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWebServiceBinding_WsdlLocation()
     * @model dataType="org.eclipse.soa.sca.core.model.instance.WsdlLocationType" many="false"
     *        extendedMetaData="kind='attribute' name='wsdlLocation' namespace='http://www.w3.org/ns/wsdl-instance'"
     * @generated
     */
	List<String> getWsdlLocation();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding#getWsdlLocation <em>Wsdl Location</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wsdl Location</em>' attribute.
     * @see #getWsdlLocation()
     * @generated
     */
	void setWsdlLocation(List<String> value);

} // WebServiceBinding
