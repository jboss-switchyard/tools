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
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getWire <em>Wire</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#isAutowire <em>Autowire</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getConstrainingType <em>Constraining Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#isLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getPolicySets <em>Policy Sets</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite()
 * @model extendedMetaData="name='Composite' kind='elementOnly'"
 * @generated
 */
public interface Composite extends CommonExtensionBase {
	/**
     * Returns the value of the '<em><b>Include</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.Include}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Include</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_Include()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
     * @generated
     */
	EList<Include> getInclude();

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:3'"
     * @generated
     */
	FeatureMap getGroup();

	/**
     * Returns the value of the '<em><b>Service</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.Service}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Service</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_Service()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace' group='#group:3'"
     * @generated
     */
	EList<Service> getService();

	/**
     * Returns the value of the '<em><b>Property</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.Property}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_Property()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace' group='#group:3'"
     * @generated
     */
	EList<Property> getProperty();

	/**
     * Returns the value of the '<em><b>Component</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.Component}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Component</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_Component()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace' group='#group:3'"
     * @generated
     */
	EList<Component> getComponent();

	/**
     * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.Reference}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Reference</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_Reference()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace' group='#group:3'"
     * @generated
     */
	EList<Reference> getReference();

	/**
     * Returns the value of the '<em><b>Wire</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.Wire}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Wire</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_Wire()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='wire' namespace='##targetNamespace' group='#group:3'"
     * @generated
     */
	EList<Wire> getWire();

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':9' processing='lax'"
     * @generated
     */
	FeatureMap getAny();

	/**
     * Returns the value of the '<em><b>Autowire</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autowire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Autowire</em>' attribute.
     * @see #isSetAutowire()
     * @see #unsetAutowire()
     * @see #setAutowire(boolean)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_Autowire()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='autowire'"
     * @generated
     */
	boolean isAutowire();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#isAutowire <em>Autowire</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Autowire</em>' attribute.
     * @see #isSetAutowire()
     * @see #unsetAutowire()
     * @see #isAutowire()
     * @generated
     */
	void setAutowire(boolean value);

	/**
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#isAutowire <em>Autowire</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetAutowire()
     * @see #isAutowire()
     * @see #setAutowire(boolean)
     * @generated
     */
	void unsetAutowire();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#isAutowire <em>Autowire</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Autowire</em>' attribute is set.
     * @see #unsetAutowire()
     * @see #isAutowire()
     * @see #setAutowire(boolean)
     * @generated
     */
	boolean isSetAutowire();

	/**
     * Returns the value of the '<em><b>Constraining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraining Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Constraining Type</em>' attribute.
     * @see #setConstrainingType(QName)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_ConstrainingType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='constrainingType'"
     * @generated
     */
	QName getConstrainingType();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getConstrainingType <em>Constraining Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constraining Type</em>' attribute.
     * @see #getConstrainingType()
     * @generated
     */
	void setConstrainingType(QName value);

	/**
     * Returns the value of the '<em><b>Local</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Local</em>' attribute.
     * @see #isSetLocal()
     * @see #unsetLocal()
     * @see #setLocal(boolean)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_Local()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='local'"
     * @generated
     */
	boolean isLocal();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#isLocal <em>Local</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local</em>' attribute.
     * @see #isSetLocal()
     * @see #unsetLocal()
     * @see #isLocal()
     * @generated
     */
	void setLocal(boolean value);

	/**
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#isLocal <em>Local</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetLocal()
     * @see #isLocal()
     * @see #setLocal(boolean)
     * @generated
     */
	void unsetLocal();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#isLocal <em>Local</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Local</em>' attribute is set.
     * @see #unsetLocal()
     * @see #isLocal()
     * @see #setLocal(boolean)
     * @generated
     */
	boolean isSetLocal();

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getName <em>Name</em>}' attribute.
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_PolicySets()
     * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
     *        extendedMetaData="kind='attribute' name='policySets'"
     * @generated
     */
	List<QName> getPolicySets();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getPolicySets <em>Policy Sets</em>}' attribute.
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_Requires()
     * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
     *        extendedMetaData="kind='attribute' name='requires'"
     * @generated
     */
	List<QName> getRequires();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getRequires <em>Requires</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Requires</em>' attribute.
     * @see #getRequires()
     * @generated
     */
	void setRequires(List<QName> value);

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComposite_TargetNamespace()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
     *        extendedMetaData="kind='attribute' name='targetNamespace'"
     * @generated
     */
	String getTargetNamespace();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getTargetNamespace <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Namespace</em>' attribute.
     * @see #getTargetNamespace()
     * @generated
     */
	void setTargetNamespace(String value);

} // Composite
