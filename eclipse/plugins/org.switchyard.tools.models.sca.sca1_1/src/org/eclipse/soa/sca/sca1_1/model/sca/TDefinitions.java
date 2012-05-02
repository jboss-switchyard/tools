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
 * A representation of the model object '<em><b>TDefinitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getPolicySet <em>Policy Set</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getBindingGroup <em>Binding Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getBindingType <em>Binding Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getTDefinitions()
 * @model extendedMetaData="name='tDefinitions' kind='elementOnly'"
 * @generated
 */
public interface TDefinitions extends CommonExtensionBase {
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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getTDefinitions_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:2'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.Intent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' containment reference list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getTDefinitions_Intent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='intent' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<Intent> getIntent();

	/**
	 * Returns the value of the '<em><b>Policy Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Set</em>' containment reference list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getTDefinitions_PolicySet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='policySet' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<PolicySet> getPolicySet();

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getTDefinitions_BindingGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='binding:group' namespace='##targetNamespace' group='#group:2'"
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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getTDefinitions_Binding()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binding' namespace='##targetNamespace' group='binding:group'"
	 * @generated
	 */
	EList<Binding> getBinding();

	/**
	 * Returns the value of the '<em><b>Binding Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.BindingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Type</em>' containment reference list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getTDefinitions_BindingType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bindingType' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<BindingType> getBindingType();

	/**
	 * Returns the value of the '<em><b>Implementation Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Type</em>' containment reference list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getTDefinitions_ImplementationType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='implementationType' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<ImplementationType> getImplementationType();

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getTDefinitions_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':9' processing='lax' group='#group:2'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getTDefinitions_TargetNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='targetNamespace'"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

} // TDefinitions
