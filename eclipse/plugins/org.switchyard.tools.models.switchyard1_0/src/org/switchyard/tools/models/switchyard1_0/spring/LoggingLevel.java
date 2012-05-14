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
 * A representation of the literals of the enumeration '<em><b>Logging Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getLoggingLevel()
 * @model extendedMetaData="name='loggingLevel'"
 * @generated
 */
public enum LoggingLevel implements Enumerator {
	/**
     * The '<em><b>DEBUG</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DEBUG_VALUE
     * @generated
     * @ordered
     */
	DEBUG(0, "DEBUG", "DEBUG"),

	/**
     * The '<em><b>ERROR</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ERROR_VALUE
     * @generated
     * @ordered
     */
	ERROR(1, "ERROR", "ERROR"),

	/**
     * The '<em><b>INFO</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #INFO_VALUE
     * @generated
     * @ordered
     */
	INFO(2, "INFO", "INFO"),

	/**
     * The '<em><b>TRACE</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #TRACE_VALUE
     * @generated
     * @ordered
     */
	TRACE(3, "TRACE", "TRACE"),

	/**
     * The '<em><b>WARN</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #WARN_VALUE
     * @generated
     * @ordered
     */
	WARN(4, "WARN", "WARN"),

	/**
     * The '<em><b>OFF</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #OFF_VALUE
     * @generated
     * @ordered
     */
	OFF(5, "OFF", "OFF");

	/**
     * The '<em><b>DEBUG</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEBUG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #DEBUG
     * @model
     * @generated
     * @ordered
     */
	public static final int DEBUG_VALUE = 0;

	/**
     * The '<em><b>ERROR</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #ERROR
     * @model
     * @generated
     * @ordered
     */
	public static final int ERROR_VALUE = 1;

	/**
     * The '<em><b>INFO</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INFO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #INFO
     * @model
     * @generated
     * @ordered
     */
	public static final int INFO_VALUE = 2;

	/**
     * The '<em><b>TRACE</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #TRACE
     * @model
     * @generated
     * @ordered
     */
	public static final int TRACE_VALUE = 3;

	/**
     * The '<em><b>WARN</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WARN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #WARN
     * @model
     * @generated
     * @ordered
     */
	public static final int WARN_VALUE = 4;

	/**
     * The '<em><b>OFF</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #OFF
     * @model
     * @generated
     * @ordered
     */
	public static final int OFF_VALUE = 5;

	/**
     * An array of all the '<em><b>Logging Level</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final LoggingLevel[] VALUES_ARRAY =
		new LoggingLevel[] {
            DEBUG,
            ERROR,
            INFO,
            TRACE,
            WARN,
            OFF,
        };

	/**
     * A public read-only list of all the '<em><b>Logging Level</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<LoggingLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Logging Level</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static LoggingLevel get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LoggingLevel result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Logging Level</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static LoggingLevel getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LoggingLevel result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Logging Level</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static LoggingLevel get(int value) {
        switch (value) {
            case DEBUG_VALUE: return DEBUG;
            case ERROR_VALUE: return ERROR;
            case INFO_VALUE: return INFO;
            case TRACE_VALUE: return TRACE;
            case WARN_VALUE: return WARN;
            case OFF_VALUE: return OFF;
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
	private LoggingLevel(int value, String name, String literal) {
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
	
} //LoggingLevel
