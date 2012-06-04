/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPP Implementation Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction#isAllowsPassByReference <em>Allows Pass By Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementationFunction()
 * @model extendedMetaData="name='CPPImplementationFunction' kind='empty'"
 * @generated
 */
public interface CPPImplementationFunction extends EObject {
	/**
     * Returns the value of the '<em><b>Allows Pass By Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allows Pass By Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Allows Pass By Reference</em>' attribute.
     * @see #isSetAllowsPassByReference()
     * @see #unsetAllowsPassByReference()
     * @see #setAllowsPassByReference(boolean)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementationFunction_AllowsPassByReference()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='allowsPassByReference'"
     * @generated
     */
	boolean isAllowsPassByReference();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction#isAllowsPassByReference <em>Allows Pass By Reference</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Allows Pass By Reference</em>' attribute.
     * @see #isSetAllowsPassByReference()
     * @see #unsetAllowsPassByReference()
     * @see #isAllowsPassByReference()
     * @generated
     */
	void setAllowsPassByReference(boolean value);

	/**
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction#isAllowsPassByReference <em>Allows Pass By Reference</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetAllowsPassByReference()
     * @see #isAllowsPassByReference()
     * @see #setAllowsPassByReference(boolean)
     * @generated
     */
	void unsetAllowsPassByReference();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction#isAllowsPassByReference <em>Allows Pass By Reference</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Allows Pass By Reference</em>' attribute is set.
     * @see #unsetAllowsPassByReference()
     * @see #isAllowsPassByReference()
     * @see #setAllowsPassByReference(boolean)
     * @generated
     */
	boolean isSetAllowsPassByReference();

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementationFunction_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementationFunction_AnyAttribute()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':2' processing='lax'"
     * @generated
     */
	FeatureMap getAnyAttribute();

} // CPPImplementationFunction
