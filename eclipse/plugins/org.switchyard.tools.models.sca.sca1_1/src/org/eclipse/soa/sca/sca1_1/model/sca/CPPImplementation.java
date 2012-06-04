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
 * A representation of the model object '<em><b>CPP Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#isAllowsPassByReference <em>Allows Pass By Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#isEagerInit <em>Eager Init</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementation()
 * @model extendedMetaData="name='CPPImplementation' kind='elementOnly'"
 * @generated
 */
public interface CPPImplementation extends Implementation {
	/**
     * Returns the value of the '<em><b>Function</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Function</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementation_Function()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
     * @generated
     */
	EList<CPPImplementationFunction> getFunction();

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementation_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='lax'"
     * @generated
     */
	FeatureMap getAny();

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementation_AllowsPassByReference()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='allowsPassByReference'"
     * @generated
     */
	boolean isAllowsPassByReference();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#isAllowsPassByReference <em>Allows Pass By Reference</em>}' attribute.
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
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#isAllowsPassByReference <em>Allows Pass By Reference</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetAllowsPassByReference()
     * @see #isAllowsPassByReference()
     * @see #setAllowsPassByReference(boolean)
     * @generated
     */
	void unsetAllowsPassByReference();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#isAllowsPassByReference <em>Allows Pass By Reference</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Class</em>' attribute.
     * @see #setClass(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementation_Class()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Name"
     *        extendedMetaData="kind='attribute' name='class'"
     * @generated
     */
	String getClass_();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getClass_ <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Class</em>' attribute.
     * @see #getClass_()
     * @generated
     */
	void setClass(String value);

	/**
     * Returns the value of the '<em><b>Component Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Component Type</em>' attribute.
     * @see #setComponentType(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementation_ComponentType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='componentType'"
     * @generated
     */
	String getComponentType();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getComponentType <em>Component Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Component Type</em>' attribute.
     * @see #getComponentType()
     * @generated
     */
	void setComponentType(String value);

	/**
     * Returns the value of the '<em><b>Eager Init</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eager Init</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Eager Init</em>' attribute.
     * @see #isSetEagerInit()
     * @see #unsetEagerInit()
     * @see #setEagerInit(boolean)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementation_EagerInit()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='eagerInit'"
     * @generated
     */
	boolean isEagerInit();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#isEagerInit <em>Eager Init</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eager Init</em>' attribute.
     * @see #isSetEagerInit()
     * @see #unsetEagerInit()
     * @see #isEagerInit()
     * @generated
     */
	void setEagerInit(boolean value);

	/**
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#isEagerInit <em>Eager Init</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetEagerInit()
     * @see #isEagerInit()
     * @see #setEagerInit(boolean)
     * @generated
     */
	void unsetEagerInit();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#isEagerInit <em>Eager Init</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eager Init</em>' attribute is set.
     * @see #unsetEagerInit()
     * @see #isEagerInit()
     * @see #setEagerInit(boolean)
     * @generated
     */
	boolean isSetEagerInit();

	/**
     * Returns the value of the '<em><b>Header</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Header</em>' attribute.
     * @see #setHeader(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementation_Header()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
     *        extendedMetaData="kind='attribute' name='header'"
     * @generated
     */
	String getHeader();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getHeader <em>Header</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Header</em>' attribute.
     * @see #getHeader()
     * @generated
     */
	void setHeader(String value);

	/**
     * Returns the value of the '<em><b>Library</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Library</em>' attribute.
     * @see #setLibrary(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementation_Library()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
     *        extendedMetaData="kind='attribute' name='library'"
     * @generated
     */
	String getLibrary();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getLibrary <em>Library</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Library</em>' attribute.
     * @see #getLibrary()
     * @generated
     */
	void setLibrary(String value);

	/**
     * Returns the value of the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Path</em>' attribute.
     * @see #setPath(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementation_Path()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='path'"
     * @generated
     */
	String getPath();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #getPath()
     * @generated
     */
	void setPath(String value);

	/**
     * Returns the value of the '<em><b>Scope</b></em>' attribute.
     * The literals are from the enumeration {@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationScope}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Scope</em>' attribute.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationScope
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #setScope(CPPImplementationScope)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementation_Scope()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='scope'"
     * @generated
     */
	CPPImplementationScope getScope();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scope</em>' attribute.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationScope
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #getScope()
     * @generated
     */
	void setScope(CPPImplementationScope value);

	/**
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetScope()
     * @see #getScope()
     * @see #setScope(CPPImplementationScope)
     * @generated
     */
	void unsetScope();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getScope <em>Scope</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scope</em>' attribute is set.
     * @see #unsetScope()
     * @see #getScope()
     * @see #setScope(CPPImplementationScope)
     * @generated
     */
	boolean isSetScope();

	/**
     * Returns the value of the '<em><b>Any Attribute1</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Any Attribute1</em>' attribute list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementation_AnyAttribute1()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':14' processing='lax'"
     * @generated
     */
	FeatureMap getAnyAttribute1();

} // CPPImplementation
