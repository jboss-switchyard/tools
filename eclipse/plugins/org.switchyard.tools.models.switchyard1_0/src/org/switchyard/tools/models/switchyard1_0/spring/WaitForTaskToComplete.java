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
 * A representation of the literals of the enumeration '<em><b>Wait For Task To Complete</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWaitForTaskToComplete()
 * @model extendedMetaData="name='waitForTaskToComplete'"
 * @generated
 */
public enum WaitForTaskToComplete implements Enumerator {
	/**
     * The '<em><b>Never</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #NEVER_VALUE
     * @generated
     * @ordered
     */
	NEVER(0, "Never", "Never"),

	/**
     * The '<em><b>If Reply Expected</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #IF_REPLY_EXPECTED_VALUE
     * @generated
     * @ordered
     */
	IF_REPLY_EXPECTED(1, "IfReplyExpected", "IfReplyExpected"),

	/**
     * The '<em><b>Always</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ALWAYS_VALUE
     * @generated
     * @ordered
     */
	ALWAYS(2, "Always", "Always");

	/**
     * The '<em><b>Never</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Never</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #NEVER
     * @model name="Never"
     * @generated
     * @ordered
     */
	public static final int NEVER_VALUE = 0;

	/**
     * The '<em><b>If Reply Expected</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>If Reply Expected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #IF_REPLY_EXPECTED
     * @model name="IfReplyExpected"
     * @generated
     * @ordered
     */
	public static final int IF_REPLY_EXPECTED_VALUE = 1;

	/**
     * The '<em><b>Always</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Always</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #ALWAYS
     * @model name="Always"
     * @generated
     * @ordered
     */
	public static final int ALWAYS_VALUE = 2;

	/**
     * An array of all the '<em><b>Wait For Task To Complete</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final WaitForTaskToComplete[] VALUES_ARRAY =
		new WaitForTaskToComplete[] {
            NEVER,
            IF_REPLY_EXPECTED,
            ALWAYS,
        };

	/**
     * A public read-only list of all the '<em><b>Wait For Task To Complete</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<WaitForTaskToComplete> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Wait For Task To Complete</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static WaitForTaskToComplete get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            WaitForTaskToComplete result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Wait For Task To Complete</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static WaitForTaskToComplete getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            WaitForTaskToComplete result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Wait For Task To Complete</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static WaitForTaskToComplete get(int value) {
        switch (value) {
            case NEVER_VALUE: return NEVER;
            case IF_REPLY_EXPECTED_VALUE: return IF_REPLY_EXPECTED;
            case ALWAYS_VALUE: return ALWAYS;
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
	private WaitForTaskToComplete(int value, String name, String literal) {
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
	
} //WaitForTaskToComplete
