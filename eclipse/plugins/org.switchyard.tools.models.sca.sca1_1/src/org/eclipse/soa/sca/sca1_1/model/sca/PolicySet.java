/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getPolicySetReference <em>Policy Set Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getIntentMap <em>Intent Map</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getAttachTo <em>Attach To</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPolicySet()
 * @model extendedMetaData="name='PolicySet' kind='elementOnly'"
 * @generated
 */
public interface PolicySet extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPolicySet_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Policy Set Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySetReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Set Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Set Reference</em>' containment reference list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPolicySet_PolicySetReference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='policySetReference' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PolicySetReference> getPolicySetReference();

	/**
	 * Returns the value of the '<em><b>Intent Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.IntentMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent Map</em>' containment reference list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPolicySet_IntentMap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='intentMap' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IntentMap> getIntentMap();

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPolicySet_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' attribute.
	 * @see #setAppliesTo(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPolicySet_AppliesTo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='appliesTo'"
	 * @generated
	 */
	String getAppliesTo();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getAppliesTo <em>Applies To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To</em>' attribute.
	 * @see #getAppliesTo()
	 * @generated
	 */
	void setAppliesTo(String value);

	/**
	 * Returns the value of the '<em><b>Attach To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach To</em>' attribute.
	 * @see #setAttachTo(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPolicySet_AttachTo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='attachTo'"
	 * @generated
	 */
	String getAttachTo();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getAttachTo <em>Attach To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach To</em>' attribute.
	 * @see #getAttachTo()
	 * @generated
	 */
	void setAttachTo(String value);

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPolicySet_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' attribute.
	 * @see #setProvides(List)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPolicySet_Provides()
	 * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
	 *        extendedMetaData="kind='attribute' name='provides'"
	 * @generated
	 */
	List<QName> getProvides();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getProvides <em>Provides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides</em>' attribute.
	 * @see #getProvides()
	 * @generated
	 */
	void setProvides(List<QName> value);

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPolicySet_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':8' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PolicySet
