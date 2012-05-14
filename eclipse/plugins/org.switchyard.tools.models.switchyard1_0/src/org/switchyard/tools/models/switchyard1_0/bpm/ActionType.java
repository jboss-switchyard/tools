/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getActionType()
 * @model extendedMetaData="name='actionType'"
 * @generated
 */
public enum ActionType implements Enumerator {
	/**
     * The '<em><b>STARTPROCESS</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #STARTPROCESS_VALUE
     * @generated
     * @ordered
     */
	STARTPROCESS(0, "STARTPROCESS", "START_PROCESS"),

	/**
     * The '<em><b>SIGNALEVENT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SIGNALEVENT_VALUE
     * @generated
     * @ordered
     */
	SIGNALEVENT(1, "SIGNALEVENT", "SIGNAL_EVENT"),

	/**
     * The '<em><b>ABORTPROCESSINSTANCE</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ABORTPROCESSINSTANCE_VALUE
     * @generated
     * @ordered
     */
	ABORTPROCESSINSTANCE(2, "ABORTPROCESSINSTANCE", "ABORT_PROCESS_INSTANCE");

	/**
     * The '<em><b>STARTPROCESS</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STARTPROCESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #STARTPROCESS
     * @model literal="START_PROCESS"
     * @generated
     * @ordered
     */
	public static final int STARTPROCESS_VALUE = 0;

	/**
     * The '<em><b>SIGNALEVENT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIGNALEVENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #SIGNALEVENT
     * @model literal="SIGNAL_EVENT"
     * @generated
     * @ordered
     */
	public static final int SIGNALEVENT_VALUE = 1;

	/**
     * The '<em><b>ABORTPROCESSINSTANCE</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABORTPROCESSINSTANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #ABORTPROCESSINSTANCE
     * @model literal="ABORT_PROCESS_INSTANCE"
     * @generated
     * @ordered
     */
	public static final int ABORTPROCESSINSTANCE_VALUE = 2;

	/**
     * An array of all the '<em><b>Action Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ActionType[] VALUES_ARRAY =
		new ActionType[] {
            STARTPROCESS,
            SIGNALEVENT,
            ABORTPROCESSINSTANCE,
        };

	/**
     * A public read-only list of all the '<em><b>Action Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Action Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ActionType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ActionType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Action Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ActionType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ActionType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Action Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ActionType get(int value) {
        switch (value) {
            case STARTPROCESS_VALUE: return STARTPROCESS;
            case SIGNALEVENT_VALUE: return SIGNALEVENT;
            case ABORTPROCESSINSTANCE_VALUE: return ABORTPROCESSINSTANCE;
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
	private ActionType(int value, String name, String literal) {
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
	
} //ActionType
