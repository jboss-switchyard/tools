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
 * A representation of the model object '<em><b>CImplementation Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isAllowsPassByReference <em>Allows Pass By Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isDestoy <em>Destoy</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isInit <em>Init</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementationFunction()
 * @model extendedMetaData="name='CImplementationFunction' kind='empty'"
 * @generated
 */
public interface CImplementationFunction extends EObject {
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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementationFunction_AllowsPassByReference()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='allowsPassByReference'"
	 * @generated
	 */
	boolean isAllowsPassByReference();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isAllowsPassByReference <em>Allows Pass By Reference</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isAllowsPassByReference <em>Allows Pass By Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowsPassByReference()
	 * @see #isAllowsPassByReference()
	 * @see #setAllowsPassByReference(boolean)
	 * @generated
	 */
	void unsetAllowsPassByReference();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isAllowsPassByReference <em>Allows Pass By Reference</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Destoy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destoy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destoy</em>' attribute.
	 * @see #isSetDestoy()
	 * @see #unsetDestoy()
	 * @see #setDestoy(boolean)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementationFunction_Destoy()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='destoy'"
	 * @generated
	 */
	boolean isDestoy();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isDestoy <em>Destoy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destoy</em>' attribute.
	 * @see #isSetDestoy()
	 * @see #unsetDestoy()
	 * @see #isDestoy()
	 * @generated
	 */
	void setDestoy(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isDestoy <em>Destoy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDestoy()
	 * @see #isDestoy()
	 * @see #setDestoy(boolean)
	 * @generated
	 */
	void unsetDestoy();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isDestoy <em>Destoy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Destoy</em>' attribute is set.
	 * @see #unsetDestoy()
	 * @see #isDestoy()
	 * @see #setDestoy(boolean)
	 * @generated
	 */
	boolean isSetDestoy();

	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #isSetInit()
	 * @see #unsetInit()
	 * @see #setInit(boolean)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementationFunction_Init()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='init'"
	 * @generated
	 */
	boolean isInit();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #isSetInit()
	 * @see #unsetInit()
	 * @see #isInit()
	 * @generated
	 */
	void setInit(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInit()
	 * @see #isInit()
	 * @see #setInit(boolean)
	 * @generated
	 */
	void unsetInit();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isInit <em>Init</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Init</em>' attribute is set.
	 * @see #unsetInit()
	 * @see #isInit()
	 * @see #setInit(boolean)
	 * @generated
	 */
	boolean isSetInit();

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementationFunction_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementationFunction_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // CImplementationFunction
