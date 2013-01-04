/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getActionType()
 * @model extendedMetaData="name='actionType'"
 * @generated
 */
public enum ActionType implements Enumerator {
	/**
     * The '<em><b>EXECUTE</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #EXECUTE_VALUE
     * @generated
     * @ordered
     */
	EXECUTE(0, "EXECUTE", "EXECUTE"),

	/**
     * The '<em><b>INSERT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSERT_VALUE
     * @generated
     * @ordered
     */
    INSERT(1, "INSERT", "INSERT"), /**
     * The '<em><b>FIREALLRULES</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #FIREALLRULES_VALUE
     * @generated
     * @ordered
     */
	FIREALLRULES(2, "FIREALLRULES", "FIRE_ALL_RULES"),

	/**
     * The '<em><b>FIREUNTILHALT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #FIREUNTILHALT_VALUE
     * @generated
     * @ordered
     */
	FIREUNTILHALT(3, "FIREUNTILHALT", "FIRE_UNTIL_HALT");

	/**
     * The '<em><b>EXECUTE</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXECUTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #EXECUTE
     * @model
     * @generated
     * @ordered
     */
	public static final int EXECUTE_VALUE = 0;

	/**
     * The '<em><b>INSERT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>INSERT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INSERT
     * @model
     * @generated
     * @ordered
     */
    public static final int INSERT_VALUE = 1;

    /**
     * The '<em><b>FIREALLRULES</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIREALLRULES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #FIREALLRULES
     * @model literal="FIRE_ALL_RULES"
     * @generated
     * @ordered
     */
	public static final int FIREALLRULES_VALUE = 2;

	/**
     * The '<em><b>FIREUNTILHALT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIREUNTILHALT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #FIREUNTILHALT
     * @model literal="FIRE_UNTIL_HALT"
     * @generated
     * @ordered
     */
	public static final int FIREUNTILHALT_VALUE = 3;

	/**
     * An array of all the '<em><b>Action Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ActionType[] VALUES_ARRAY =
		new ActionType[] {
            EXECUTE,
            INSERT,
            FIREALLRULES,
            FIREUNTILHALT,
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
            case EXECUTE_VALUE: return EXECUTE;
            case INSERT_VALUE: return INSERT;
            case FIREALLRULES_VALUE: return FIREALLRULES;
            case FIREUNTILHALT_VALUE: return FIREUNTILHALT;
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
