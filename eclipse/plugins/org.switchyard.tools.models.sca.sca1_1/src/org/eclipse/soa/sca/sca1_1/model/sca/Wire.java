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
 * A representation of the model object '<em><b>Wire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#isReplace <em>Replace</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#getSource2 <em>Source2</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#getTarget2 <em>Target2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWire()
 * @model extendedMetaData="name='Wire' kind='elementOnly'"
 * @generated
 */
public interface Wire extends CommonExtensionBase {
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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWire_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Replace</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replace</em>' attribute.
	 * @see #isSetReplace()
	 * @see #unsetReplace()
	 * @see #setReplace(boolean)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWire_Replace()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='replace'"
	 * @generated
	 */
	boolean isReplace();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#isReplace <em>Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replace</em>' attribute.
	 * @see #isSetReplace()
	 * @see #unsetReplace()
	 * @see #isReplace()
	 * @generated
	 */
	void setReplace(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#isReplace <em>Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReplace()
	 * @see #isReplace()
	 * @see #setReplace(boolean)
	 * @generated
	 */
	void unsetReplace();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#isReplace <em>Replace</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Replace</em>' attribute is set.
	 * @see #unsetReplace()
	 * @see #isReplace()
	 * @see #setReplace(boolean)
	 * @generated
	 */
	boolean isSetReplace();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWire_Source()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWire_Target()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='target'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Source2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source2</em>' reference.
	 * @see #setSource2(ComponentReference)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWire_Source2()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='source2'"
	 * @generated
	 */
	ComponentReference getSource2();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#getSource2 <em>Source2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source2</em>' reference.
	 * @see #getSource2()
	 * @generated
	 */
	void setSource2(ComponentReference value);

	/**
	 * Returns the value of the '<em><b>Target2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target2</em>' reference.
	 * @see #setTarget2(ComponentService)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getWire_Target2()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='target2'"
	 * @generated
	 */
	ComponentService getTarget2();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#getTarget2 <em>Target2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target2</em>' reference.
	 * @see #getTarget2()
	 * @generated
	 */
	void setTarget2(ComponentService value);

} // Wire
