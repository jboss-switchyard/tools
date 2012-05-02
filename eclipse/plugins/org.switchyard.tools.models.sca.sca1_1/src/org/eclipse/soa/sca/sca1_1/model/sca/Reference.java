/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#isAutowire <em>Autowire</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#isWiredByImpl <em>Wired By Impl</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#getPromote <em>Promote</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getReference()
 * @model extendedMetaData="name='Reference' kind='elementOnly'"
 * @generated
 */
public interface Reference extends Contract {
	/**
	 * Returns the value of the '<em><b>Autowire</b></em>' attribute.
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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getReference_Autowire()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='autowire'"
	 * @generated
	 */
	boolean isAutowire();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#isAutowire <em>Autowire</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#isAutowire <em>Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutowire()
	 * @see #isAutowire()
	 * @see #setAutowire(boolean)
	 * @generated
	 */
	void unsetAutowire();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#isAutowire <em>Autowire</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The default value is <code>"1..1"</code>.
	 * The literals are from the enumeration {@link org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity
	 * @see #isSetMultiplicity()
	 * @see #unsetMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getReference_Multiplicity()
	 * @model default="1..1" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='multiplicity'"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity
	 * @see #isSetMultiplicity()
	 * @see #unsetMultiplicity()
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @generated
	 */
	void unsetMultiplicity();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#getMultiplicity <em>Multiplicity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiplicity</em>' attribute is set.
	 * @see #unsetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @generated
	 */
	boolean isSetMultiplicity();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(List)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getReference_Target()
	 * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfAnyURIs" many="false"
	 *        extendedMetaData="kind='attribute' name='target'"
	 * @generated
	 */
	List<String> getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(List<String> value);

	/**
	 * Returns the value of the '<em><b>Wired By Impl</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wired By Impl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wired By Impl</em>' attribute.
	 * @see #isSetWiredByImpl()
	 * @see #unsetWiredByImpl()
	 * @see #setWiredByImpl(boolean)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getReference_WiredByImpl()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='wiredByImpl'"
	 * @generated
	 */
	boolean isWiredByImpl();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#isWiredByImpl <em>Wired By Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wired By Impl</em>' attribute.
	 * @see #isSetWiredByImpl()
	 * @see #unsetWiredByImpl()
	 * @see #isWiredByImpl()
	 * @generated
	 */
	void setWiredByImpl(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#isWiredByImpl <em>Wired By Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWiredByImpl()
	 * @see #isWiredByImpl()
	 * @see #setWiredByImpl(boolean)
	 * @generated
	 */
	void unsetWiredByImpl();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#isWiredByImpl <em>Wired By Impl</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wired By Impl</em>' attribute is set.
	 * @see #unsetWiredByImpl()
	 * @see #isWiredByImpl()
	 * @see #setWiredByImpl(boolean)
	 * @generated
	 */
	boolean isSetWiredByImpl();

	/**
	 * Returns the value of the '<em><b>Promote</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promote</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promote</em>' reference list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getReference_Promote()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='promote'"
	 * @generated
	 */
	EList<ComponentReference> getPromote();

} // Reference
