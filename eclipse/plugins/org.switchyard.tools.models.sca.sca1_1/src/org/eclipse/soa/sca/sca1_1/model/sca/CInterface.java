/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CInterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getCallbackFunction <em>Callback Function</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getCallbackHeader <em>Callback Header</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCInterface()
 * @model extendedMetaData="name='CInterface' kind='elementOnly'"
 * @generated
 */
public interface CInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.CFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCInterface_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CFunction> getFunction();

	/**
	 * Returns the value of the '<em><b>Callback Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.CFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callback Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callback Function</em>' containment reference list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCInterface_CallbackFunction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='callbackFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CFunction> getCallbackFunction();

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCInterface_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Callback Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callback Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callback Header</em>' attribute.
	 * @see #setCallbackHeader(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCInterface_CallbackHeader()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='callbackHeader'"
	 * @generated
	 */
	String getCallbackHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getCallbackHeader <em>Callback Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callback Header</em>' attribute.
	 * @see #getCallbackHeader()
	 * @generated
	 */
	void setCallbackHeader(String value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCInterface_Header()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='header'"
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCInterface_AnyAttribute1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':10' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute1();

} // CInterface
