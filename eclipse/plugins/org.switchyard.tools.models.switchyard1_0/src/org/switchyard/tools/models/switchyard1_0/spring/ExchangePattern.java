/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Exchange Pattern</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExchangePattern()
 * @model extendedMetaData="name='exchangePattern'"
 * @generated
 */
public enum ExchangePattern implements Enumerator {
	/**
	 * The '<em><b>In Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	IN_ONLY(0, "InOnly", "InOnly"),

	/**
	 * The '<em><b>Robust In Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROBUST_IN_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	ROBUST_IN_ONLY(1, "RobustInOnly", "RobustInOnly"),

	/**
	 * The '<em><b>In Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	IN_OUT(2, "InOut", "InOut"),

	/**
	 * The '<em><b>In Optional Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_OPTIONAL_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	IN_OPTIONAL_OUT(3, "InOptionalOut", "InOptionalOut"),

	/**
	 * The '<em><b>Out Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	OUT_ONLY(4, "OutOnly", "OutOnly"),

	/**
	 * The '<em><b>Robust Out Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROBUST_OUT_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	ROBUST_OUT_ONLY(5, "RobustOutOnly", "RobustOutOnly"),

	/**
	 * The '<em><b>Out In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT_IN_VALUE
	 * @generated
	 * @ordered
	 */
	OUT_IN(6, "OutIn", "OutIn"),

	/**
	 * The '<em><b>Out Optional In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT_OPTIONAL_IN_VALUE
	 * @generated
	 * @ordered
	 */
	OUT_OPTIONAL_IN(7, "OutOptionalIn", "OutOptionalIn");

	/**
	 * The '<em><b>In Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_ONLY
	 * @model name="InOnly"
	 * @generated
	 * @ordered
	 */
	public static final int IN_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Robust In Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Robust In Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROBUST_IN_ONLY
	 * @model name="RobustInOnly"
	 * @generated
	 * @ordered
	 */
	public static final int ROBUST_IN_ONLY_VALUE = 1;

	/**
	 * The '<em><b>In Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_OUT
	 * @model name="InOut"
	 * @generated
	 * @ordered
	 */
	public static final int IN_OUT_VALUE = 2;

	/**
	 * The '<em><b>In Optional Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Optional Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_OPTIONAL_OUT
	 * @model name="InOptionalOut"
	 * @generated
	 * @ordered
	 */
	public static final int IN_OPTIONAL_OUT_VALUE = 3;

	/**
	 * The '<em><b>Out Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Out Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUT_ONLY
	 * @model name="OutOnly"
	 * @generated
	 * @ordered
	 */
	public static final int OUT_ONLY_VALUE = 4;

	/**
	 * The '<em><b>Robust Out Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Robust Out Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROBUST_OUT_ONLY
	 * @model name="RobustOutOnly"
	 * @generated
	 * @ordered
	 */
	public static final int ROBUST_OUT_ONLY_VALUE = 5;

	/**
	 * The '<em><b>Out In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Out In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUT_IN
	 * @model name="OutIn"
	 * @generated
	 * @ordered
	 */
	public static final int OUT_IN_VALUE = 6;

	/**
	 * The '<em><b>Out Optional In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Out Optional In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUT_OPTIONAL_IN
	 * @model name="OutOptionalIn"
	 * @generated
	 * @ordered
	 */
	public static final int OUT_OPTIONAL_IN_VALUE = 7;

	/**
	 * An array of all the '<em><b>Exchange Pattern</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExchangePattern[] VALUES_ARRAY =
		new ExchangePattern[] {
			IN_ONLY,
			ROBUST_IN_ONLY,
			IN_OUT,
			IN_OPTIONAL_OUT,
			OUT_ONLY,
			ROBUST_OUT_ONLY,
			OUT_IN,
			OUT_OPTIONAL_IN,
		};

	/**
	 * A public read-only list of all the '<em><b>Exchange Pattern</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExchangePattern> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Exchange Pattern</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExchangePattern get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExchangePattern result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exchange Pattern</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExchangePattern getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExchangePattern result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exchange Pattern</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExchangePattern get(int value) {
		switch (value) {
			case IN_ONLY_VALUE: return IN_ONLY;
			case ROBUST_IN_ONLY_VALUE: return ROBUST_IN_ONLY;
			case IN_OUT_VALUE: return IN_OUT;
			case IN_OPTIONAL_OUT_VALUE: return IN_OPTIONAL_OUT;
			case OUT_ONLY_VALUE: return OUT_ONLY;
			case ROBUST_OUT_ONLY_VALUE: return ROBUST_OUT_ONLY;
			case OUT_IN_VALUE: return OUT_IN;
			case OUT_OPTIONAL_IN_VALUE: return OUT_OPTIONAL_IN;
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
	private ExchangePattern(int value, String name, String literal) {
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
	
} //ExchangePattern
