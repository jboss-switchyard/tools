/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonrules;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Clock Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getClockType()
 * @model extendedMetaData="name='clockType'"
 * @generated
 */
public enum ClockType implements Enumerator {
    /**
     * The '<em><b>REALTIME</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REALTIME_VALUE
     * @generated
     * @ordered
     */
    REALTIME(0, "REALTIME", "REALTIME"),

    /**
     * The '<em><b>PSEUDO</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PSEUDO_VALUE
     * @generated
     * @ordered
     */
    PSEUDO(1, "PSEUDO", "PSEUDO");

    /**
     * The '<em><b>REALTIME</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>REALTIME</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REALTIME
     * @model
     * @generated
     * @ordered
     */
    public static final int REALTIME_VALUE = 0;

    /**
     * The '<em><b>PSEUDO</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PSEUDO</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PSEUDO
     * @model
     * @generated
     * @ordered
     */
    public static final int PSEUDO_VALUE = 1;

    /**
     * An array of all the '<em><b>Clock Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ClockType[] VALUES_ARRAY =
        new ClockType[] {
            REALTIME,
            PSEUDO,
        };

    /**
     * A public read-only list of all the '<em><b>Clock Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ClockType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Clock Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ClockType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ClockType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Clock Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ClockType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ClockType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Clock Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ClockType get(int value) {
        switch (value) {
            case REALTIME_VALUE: return REALTIME;
            case PSEUDO_VALUE: return PSEUDO;
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
    private ClockType(int value, String name, String literal) {
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
    
} //ClockType
