/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage#getTimeUnit()
 * @model extendedMetaData="name='TimeUnit'"
 * @generated
 */
public enum TimeUnit implements Enumerator {
    /**
     * The '<em><b>NANOSECONDS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NANOSECONDS_VALUE
     * @generated
     * @ordered
     */
    NANOSECONDS(0, "NANOSECONDS", "NANOSECONDS"),

    /**
     * The '<em><b>MICROSECONDS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MICROSECONDS_VALUE
     * @generated
     * @ordered
     */
    MICROSECONDS(1, "MICROSECONDS", "MICROSECONDS"),

    /**
     * The '<em><b>MILLISECONDS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MILLISECONDS_VALUE
     * @generated
     * @ordered
     */
    MILLISECONDS(2, "MILLISECONDS", "MILLISECONDS"),

    /**
     * The '<em><b>SECONDS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SECONDS_VALUE
     * @generated
     * @ordered
     */
    SECONDS(3, "SECONDS", "SECONDS"),

    /**
     * The '<em><b>MINUTES</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MINUTES_VALUE
     * @generated
     * @ordered
     */
    MINUTES(4, "MINUTES", "MINUTES"),

    /**
     * The '<em><b>HOURS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HOURS_VALUE
     * @generated
     * @ordered
     */
    HOURS(5, "HOURS", "HOURS"),

    /**
     * The '<em><b>DAYS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DAYS_VALUE
     * @generated
     * @ordered
     */
    DAYS(6, "DAYS", "DAYS");

    /**
     * The '<em><b>NANOSECONDS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NANOSECONDS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NANOSECONDS
     * @model
     * @generated
     * @ordered
     */
    public static final int NANOSECONDS_VALUE = 0;

    /**
     * The '<em><b>MICROSECONDS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MICROSECONDS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MICROSECONDS
     * @model
     * @generated
     * @ordered
     */
    public static final int MICROSECONDS_VALUE = 1;

    /**
     * The '<em><b>MILLISECONDS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MILLISECONDS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MILLISECONDS
     * @model
     * @generated
     * @ordered
     */
    public static final int MILLISECONDS_VALUE = 2;

    /**
     * The '<em><b>SECONDS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SECONDS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SECONDS
     * @model
     * @generated
     * @ordered
     */
    public static final int SECONDS_VALUE = 3;

    /**
     * The '<em><b>MINUTES</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MINUTES</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MINUTES
     * @model
     * @generated
     * @ordered
     */
    public static final int MINUTES_VALUE = 4;

    /**
     * The '<em><b>HOURS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>HOURS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HOURS
     * @model
     * @generated
     * @ordered
     */
    public static final int HOURS_VALUE = 5;

    /**
     * The '<em><b>DAYS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DAYS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DAYS
     * @model
     * @generated
     * @ordered
     */
    public static final int DAYS_VALUE = 6;

    /**
     * An array of all the '<em><b>Time Unit</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TimeUnit[] VALUES_ARRAY =
        new TimeUnit[] {
            NANOSECONDS,
            MICROSECONDS,
            MILLISECONDS,
            SECONDS,
            MINUTES,
            HOURS,
            DAYS,
        };

    /**
     * A public read-only list of all the '<em><b>Time Unit</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<TimeUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Time Unit</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TimeUnit get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TimeUnit result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Time Unit</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TimeUnit getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TimeUnit result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Time Unit</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TimeUnit get(int value) {
        switch (value) {
            case NANOSECONDS_VALUE: return NANOSECONDS;
            case MICROSECONDS_VALUE: return MICROSECONDS;
            case MILLISECONDS_VALUE: return MILLISECONDS;
            case SECONDS_VALUE: return SECONDS;
            case MINUTES_VALUE: return MINUTES;
            case HOURS_VALUE: return HOURS;
            case DAYS_VALUE: return DAYS;
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
    private TimeUnit(int value, String name, String literal) {
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
    
} //TimeUnit
