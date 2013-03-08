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
 * A representation of the model object '<em><b>SCA Property Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getPolicySets <em>Policy Sets</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getSCAPropertyBase()
 * @model extendedMetaData="name='SCAPropertyBase' kind='mixed'"
 * @generated
 */
public interface SCAPropertyBase extends EObject {
	/**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getSCAPropertyBase_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
	FeatureMap getMixed();

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getSCAPropertyBase_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':1' processing='lax'"
     * @generated
     */
	FeatureMap getAny();

	/**
     * Returns the value of the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Sets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Policy Sets</em>' attribute.
     * @see #setPolicySets(List)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getSCAPropertyBase_PolicySets()
     * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
     *        extendedMetaData="kind='attribute' name='policySets'"
     * @generated
     */
	List<QName> getPolicySets();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getPolicySets <em>Policy Sets</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Policy Sets</em>' attribute.
     * @see #getPolicySets()
     * @generated
     */
	void setPolicySets(List<QName> value);

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getSCAPropertyBase_Requires()
     * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
     *        extendedMetaData="kind='attribute' name='requires'"
     * @generated
     */
	List<QName> getRequires();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getRequires <em>Requires</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Requires</em>' attribute.
     * @see #getRequires()
     * @generated
     */
	void setRequires(List<QName> value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getSCAPropertyBase_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='value'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // SCAPropertyBase
