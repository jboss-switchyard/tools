/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WSDL Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType#getCallbackInterface <em>Callback Interface</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWSDLPortType()
 * @model extendedMetaData="name='WSDLPortType' kind='elementOnly'"
 * @generated
 */
public interface WSDLPortType extends Interface {
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWSDLPortType_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='lax'"
     * @generated
     */
	FeatureMap getAny();

	/**
     * Returns the value of the '<em><b>Callback Interface</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callback Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Callback Interface</em>' attribute.
     * @see #setCallbackInterface(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWSDLPortType_CallbackInterface()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='callbackInterface'"
     * @generated
     */
	String getCallbackInterface();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType#getCallbackInterface <em>Callback Interface</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Callback Interface</em>' attribute.
     * @see #getCallbackInterface()
     * @generated
     */
	void setCallbackInterface(String value);

	/**
     * Returns the value of the '<em><b>Interface</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Interface</em>' attribute.
     * @see #setInterface(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWSDLPortType_Interface()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
     *        extendedMetaData="kind='attribute' name='interface'"
     * @generated
     */
	String getInterface();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType#getInterface <em>Interface</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface</em>' attribute.
     * @see #getInterface()
     * @generated
     */
	void setInterface(String value);

	/**
     * Returns the value of the '<em><b>Any Attribute1</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Any Attribute1</em>' attribute list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWSDLPortType_AnyAttribute1()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':8' processing='lax'"
     * @generated
     */
	FeatureMap getAnyAttribute1();

} // WSDLPortType
