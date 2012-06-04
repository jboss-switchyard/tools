/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CPP Implementation Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCPPImplementationScope()
 * @model extendedMetaData="name='CPPImplementationScope'"
 * @generated
 */
public enum CPPImplementationScope implements Enumerator {
	/**
     * The '<em><b>Stateless</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #STATELESS_VALUE
     * @generated
     * @ordered
     */
	STATELESS(0, "stateless", "stateless"),

	/**
     * The '<em><b>Composite</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #COMPOSITE_VALUE
     * @generated
     * @ordered
     */
	COMPOSITE(1, "composite", "composite");

	/**
     * The '<em><b>Stateless</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stateless</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #STATELESS
     * @model name="stateless"
     * @generated
     * @ordered
     */
	public static final int STATELESS_VALUE = 0;

	/**
     * The '<em><b>Composite</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Composite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #COMPOSITE
     * @model name="composite"
     * @generated
     * @ordered
     */
	public static final int COMPOSITE_VALUE = 1;

	/**
     * An array of all the '<em><b>CPP Implementation Scope</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final CPPImplementationScope[] VALUES_ARRAY =
		new CPPImplementationScope[] {
            STATELESS,
            COMPOSITE,
        };

	/**
     * A public read-only list of all the '<em><b>CPP Implementation Scope</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<CPPImplementationScope> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>CPP Implementation Scope</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static CPPImplementationScope get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CPPImplementationScope result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>CPP Implementation Scope</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static CPPImplementationScope getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CPPImplementationScope result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>CPP Implementation Scope</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static CPPImplementationScope get(int value) {
        switch (value) {
            case STATELESS_VALUE: return STATELESS;
            case COMPOSITE_VALUE: return COMPOSITE;
        }
        return null;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final int value;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String name;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String literal;

	/**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private CPPImplementationScope(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getValue() {
      return value;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
      return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLiteral() {
      return literal;
    }

	/**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        return literal;
    }
	
} //CPPImplementationScope
