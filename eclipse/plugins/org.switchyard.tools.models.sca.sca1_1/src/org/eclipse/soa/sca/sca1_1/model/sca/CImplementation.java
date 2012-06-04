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
 * A representation of the model object '<em><b>CImplementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isAllowsPassByReference <em>Allows Pass By Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isDestoy <em>Destoy</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isEagerInit <em>Eager Init</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isInit <em>Init</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isLibrary <em>Library</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getModule <em>Module</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementation()
 * @model extendedMetaData="name='CImplementation' kind='elementOnly'"
 * @generated
 */
public interface CImplementation extends Implementation {
	/**
     * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementation_Operation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
     * @generated
     */
	EList<CImplementationFunction> getOperation();

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementation_Any()
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementation_AllowsPassByReference()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='allowsPassByReference'"
     * @generated
     */
	boolean isAllowsPassByReference();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isAllowsPassByReference <em>Allows Pass By Reference</em>}' attribute.
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
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isAllowsPassByReference <em>Allows Pass By Reference</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetAllowsPassByReference()
     * @see #isAllowsPassByReference()
     * @see #setAllowsPassByReference(boolean)
     * @generated
     */
	void unsetAllowsPassByReference();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isAllowsPassByReference <em>Allows Pass By Reference</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Component Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Component Type</em>' attribute.
     * @see #setComponentType(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementation_ComponentType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='componentType'"
     * @generated
     */
	String getComponentType();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getComponentType <em>Component Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Component Type</em>' attribute.
     * @see #getComponentType()
     * @generated
     */
	void setComponentType(String value);

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementation_Destoy()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='destoy'"
     * @generated
     */
	boolean isDestoy();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isDestoy <em>Destoy</em>}' attribute.
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
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isDestoy <em>Destoy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetDestoy()
     * @see #isDestoy()
     * @see #setDestoy(boolean)
     * @generated
     */
	void unsetDestoy();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isDestoy <em>Destoy</em>}' attribute is set.
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementation_EagerInit()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='eagerInit'"
     * @generated
     */
	boolean isEagerInit();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isEagerInit <em>Eager Init</em>}' attribute.
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
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isEagerInit <em>Eager Init</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetEagerInit()
     * @see #isEagerInit()
     * @see #setEagerInit(boolean)
     * @generated
     */
	void unsetEagerInit();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isEagerInit <em>Eager Init</em>}' attribute is set.
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementation_Init()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='init'"
     * @generated
     */
	boolean isInit();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isInit <em>Init</em>}' attribute.
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
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isInit <em>Init</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetInit()
     * @see #isInit()
     * @see #setInit(boolean)
     * @generated
     */
	void unsetInit();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isInit <em>Init</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Library</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Library</em>' attribute.
     * @see #isSetLibrary()
     * @see #unsetLibrary()
     * @see #setLibrary(boolean)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementation_Library()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='library'"
     * @generated
     */
	boolean isLibrary();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isLibrary <em>Library</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Library</em>' attribute.
     * @see #isSetLibrary()
     * @see #unsetLibrary()
     * @see #isLibrary()
     * @generated
     */
	void setLibrary(boolean value);

	/**
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isLibrary <em>Library</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetLibrary()
     * @see #isLibrary()
     * @see #setLibrary(boolean)
     * @generated
     */
	void unsetLibrary();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isLibrary <em>Library</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Library</em>' attribute is set.
     * @see #unsetLibrary()
     * @see #isLibrary()
     * @see #setLibrary(boolean)
     * @generated
     */
	boolean isSetLibrary();

	/**
     * Returns the value of the '<em><b>Module</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Module</em>' attribute.
     * @see #setModule(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementation_Module()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
     *        extendedMetaData="kind='attribute' name='module'"
     * @generated
     */
	String getModule();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getModule <em>Module</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Module</em>' attribute.
     * @see #getModule()
     * @generated
     */
	void setModule(String value);

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementation_Path()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='path'"
     * @generated
     */
	String getPath();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #getPath()
     * @generated
     */
	void setPath(String value);

	/**
     * Returns the value of the '<em><b>Scope</b></em>' attribute.
     * The literals are from the enumeration {@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationScope}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Scope</em>' attribute.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementationScope
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #setScope(CImplementationScope)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementation_Scope()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='scope'"
     * @generated
     */
	CImplementationScope getScope();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scope</em>' attribute.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementationScope
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #getScope()
     * @generated
     */
	void setScope(CImplementationScope value);

	/**
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetScope()
     * @see #getScope()
     * @see #setScope(CImplementationScope)
     * @generated
     */
	void unsetScope();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getScope <em>Scope</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scope</em>' attribute is set.
     * @see #unsetScope()
     * @see #getScope()
     * @see #setScope(CImplementationScope)
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCImplementation_AnyAttribute1()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':15' processing='lax'"
     * @generated
     */
	FeatureMap getAnyAttribute1();

} // CImplementation
