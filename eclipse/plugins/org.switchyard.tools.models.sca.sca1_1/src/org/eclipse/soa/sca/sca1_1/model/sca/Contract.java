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
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getInterfaceGroup <em>Interface Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getBindingGroup <em>Binding Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getCallback <em>Callback</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getPolicySets <em>Policy Sets</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContract()
 * @model abstract="true"
 *        extendedMetaData="name='Contract' kind='elementOnly'"
 * @generated
 */
public interface Contract extends CommonExtensionBase {
	/**
     * Returns the value of the '<em><b>Interface Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Interface Group</em>' attribute list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContract_InterfaceGroup()
     * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
     *        extendedMetaData="kind='group' name='interface:group' namespace='##targetNamespace'"
     * @generated
     */
	FeatureMap getInterfaceGroup();

	/**
     * Returns the value of the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Interface</em>' containment reference.
     * @see #setInterface(Interface)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContract_Interface()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interface' namespace='##targetNamespace' group='interface:group'"
     * @generated
     */
	Interface getInterface();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getInterface <em>Interface</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface</em>' containment reference.
     * @see #getInterface()
     * @generated
     */
    void setInterface(Interface value);

    /**
     * Returns the value of the '<em><b>Binding Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Group</em>' attribute list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContract_BindingGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='binding:group' namespace='##targetNamespace'"
     * @generated
     */
	FeatureMap getBindingGroup();

	/**
     * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.Binding}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContract_Binding()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding' namespace='##targetNamespace' group='binding:group'"
     * @generated
     */
	EList<Binding> getBinding();

	/**
     * Returns the value of the '<em><b>Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callback</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Callback</em>' containment reference.
     * @see #setCallback(Callback)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContract_Callback()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='callback' namespace='##targetNamespace'"
     * @generated
     */
	Callback getCallback();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getCallback <em>Callback</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Callback</em>' containment reference.
     * @see #getCallback()
     * @generated
     */
	void setCallback(Callback value);

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContract_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='lax'"
     * @generated
     */
	FeatureMap getAny();

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContract_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContract_PolicySets()
     * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
     *        extendedMetaData="kind='attribute' name='policySets'"
     * @generated
     */
	List<QName> getPolicySets();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getPolicySets <em>Policy Sets</em>}' attribute.
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContract_Requires()
     * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
     *        extendedMetaData="kind='attribute' name='requires'"
     * @generated
     */
	List<QName> getRequires();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getRequires <em>Requires</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Requires</em>' attribute.
     * @see #getRequires()
     * @generated
     */
	void setRequires(List<QName> value);

} // Contract
