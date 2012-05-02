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
 * A representation of the model object '<em><b>CPP Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getCallbackFunction <em>Callback Function</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getCallbackClass <em>Callback Class</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getCallbackHeader <em>Callback Header</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPInterface()
 * @model extendedMetaData="name='CPPInterface' kind='elementOnly'"
 * @generated
 */
public interface CPPInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPInterface_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CPPFunction> getFunction();

	/**
	 * Returns the value of the '<em><b>Callback Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callback Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callback Function</em>' containment reference list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPInterface_CallbackFunction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='callbackFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CPPFunction> getCallbackFunction();

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPInterface_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Callback Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callback Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callback Class</em>' attribute.
	 * @see #setCallbackClass(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPInterface_CallbackClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name"
	 *        extendedMetaData="kind='attribute' name='callbackClass'"
	 * @generated
	 */
	String getCallbackClass();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getCallbackClass <em>Callback Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callback Class</em>' attribute.
	 * @see #getCallbackClass()
	 * @generated
	 */
	void setCallbackClass(String value);

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPInterface_CallbackHeader()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='callbackHeader'"
	 * @generated
	 */
	String getCallbackHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getCallbackHeader <em>Callback Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callback Header</em>' attribute.
	 * @see #getCallbackHeader()
	 * @generated
	 */
	void setCallbackHeader(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPInterface_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPInterface_Header()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='header'"
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getHeader <em>Header</em>}' attribute.
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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPInterface_AnyAttribute1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':12' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute1();

} // CPPInterface
