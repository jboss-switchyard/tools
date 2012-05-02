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
 * A representation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getConstrains <em>Constrains</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getIntentType <em>Intent Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#isMutuallyExclusive <em>Mutually Exclusive</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntent()
 * @model extendedMetaData="name='Intent' kind='elementOnly'"
 * @generated
 */
public interface Intent extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntent_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntent_Qualifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IntentQualifier> getQualifier();

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntent_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Constrains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrains</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrains</em>' attribute.
	 * @see #setConstrains(List)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntent_Constrains()
	 * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
	 *        extendedMetaData="kind='attribute' name='constrains'"
	 * @generated
	 */
	List<QName> getConstrains();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getConstrains <em>Constrains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrains</em>' attribute.
	 * @see #getConstrains()
	 * @generated
	 */
	void setConstrains(List<QName> value);

	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excludes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excludes</em>' attribute.
	 * @see #setExcludes(List)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntent_Excludes()
	 * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
	 *        extendedMetaData="kind='attribute' name='excludes'"
	 * @generated
	 */
	List<QName> getExcludes();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getExcludes <em>Excludes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excludes</em>' attribute.
	 * @see #getExcludes()
	 * @generated
	 */
	void setExcludes(List<QName> value);

	/**
	 * Returns the value of the '<em><b>Intent Type</b></em>' attribute.
	 * The default value is <code>"interaction"</code>.
	 * The literals are from the enumeration {@link org.eclipse.soa.sca.sca1_1.model.sca.InteractionOrImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent Type</em>' attribute.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.InteractionOrImplementation
	 * @see #isSetIntentType()
	 * @see #unsetIntentType()
	 * @see #setIntentType(InteractionOrImplementation)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntent_IntentType()
	 * @model default="interaction" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='intentType'"
	 * @generated
	 */
	InteractionOrImplementation getIntentType();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getIntentType <em>Intent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent Type</em>' attribute.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.InteractionOrImplementation
	 * @see #isSetIntentType()
	 * @see #unsetIntentType()
	 * @see #getIntentType()
	 * @generated
	 */
	void setIntentType(InteractionOrImplementation value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getIntentType <em>Intent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntentType()
	 * @see #getIntentType()
	 * @see #setIntentType(InteractionOrImplementation)
	 * @generated
	 */
	void unsetIntentType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getIntentType <em>Intent Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Intent Type</em>' attribute is set.
	 * @see #unsetIntentType()
	 * @see #getIntentType()
	 * @see #setIntentType(InteractionOrImplementation)
	 * @generated
	 */
	boolean isSetIntentType();

	/**
	 * Returns the value of the '<em><b>Mutually Exclusive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutually Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutually Exclusive</em>' attribute.
	 * @see #isSetMutuallyExclusive()
	 * @see #unsetMutuallyExclusive()
	 * @see #setMutuallyExclusive(boolean)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntent_MutuallyExclusive()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='mutuallyExclusive'"
	 * @generated
	 */
	boolean isMutuallyExclusive();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#isMutuallyExclusive <em>Mutually Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutually Exclusive</em>' attribute.
	 * @see #isSetMutuallyExclusive()
	 * @see #unsetMutuallyExclusive()
	 * @see #isMutuallyExclusive()
	 * @generated
	 */
	void setMutuallyExclusive(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#isMutuallyExclusive <em>Mutually Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMutuallyExclusive()
	 * @see #isMutuallyExclusive()
	 * @see #setMutuallyExclusive(boolean)
	 * @generated
	 */
	void unsetMutuallyExclusive();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#isMutuallyExclusive <em>Mutually Exclusive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mutually Exclusive</em>' attribute is set.
	 * @see #unsetMutuallyExclusive()
	 * @see #isMutuallyExclusive()
	 * @see #setMutuallyExclusive(boolean)
	 * @generated
	 */
	boolean isSetMutuallyExclusive();

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntent_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntent_Requires()
	 * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
	 *        extendedMetaData="kind='attribute' name='requires'"
	 * @generated
	 */
	List<QName> getRequires();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getRequires <em>Requires</em>}' attribute.
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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntent_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':9' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // Intent
