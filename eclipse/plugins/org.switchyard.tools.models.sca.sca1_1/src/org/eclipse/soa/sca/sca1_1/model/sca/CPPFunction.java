/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPP Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#isOneWay <em>One Way</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPFunction()
 * @model extendedMetaData="name='CPPFunction' kind='empty'"
 * @generated
 */
public interface CPPFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPFunction_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>One Way</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One Way</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Way</em>' attribute.
	 * @see #isSetOneWay()
	 * @see #unsetOneWay()
	 * @see #setOneWay(boolean)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPFunction_OneWay()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='oneWay'"
	 * @generated
	 */
	boolean isOneWay();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#isOneWay <em>One Way</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Way</em>' attribute.
	 * @see #isSetOneWay()
	 * @see #unsetOneWay()
	 * @see #isOneWay()
	 * @generated
	 */
	void setOneWay(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#isOneWay <em>One Way</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOneWay()
	 * @see #isOneWay()
	 * @see #setOneWay(boolean)
	 * @generated
	 */
	void unsetOneWay();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#isOneWay <em>One Way</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>One Way</em>' attribute is set.
	 * @see #unsetOneWay()
	 * @see #isOneWay()
	 * @see #setOneWay(boolean)
	 * @generated
	 */
	boolean isSetOneWay();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' attribute.
	 * @see #setRequires(List)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPFunction_Requires()
	 * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
	 *        extendedMetaData="kind='attribute' name='requires'"
	 * @generated
	 */
	List<QName> getRequires();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#getRequires <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires</em>' attribute.
	 * @see #getRequires()
	 * @generated
	 */
	void setRequires(List<QName> value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPFunction_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // CPPFunction
