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
 * A representation of the literals of the enumeration '<em><b>Error Handler Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerType()
 * @model extendedMetaData="name='errorHandlerType'"
 * @generated
 */
public enum ErrorHandlerType implements Enumerator {
	/**
	 * The '<em><b>Default Error Handler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_ERROR_HANDLER_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT_ERROR_HANDLER(0, "DefaultErrorHandler", "DefaultErrorHandler"),

	/**
	 * The '<em><b>Dead Letter Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEAD_LETTER_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	DEAD_LETTER_CHANNEL(1, "DeadLetterChannel", "DeadLetterChannel"),

	/**
	 * The '<em><b>Logging Error Handler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGGING_ERROR_HANDLER_VALUE
	 * @generated
	 * @ordered
	 */
	LOGGING_ERROR_HANDLER(2, "LoggingErrorHandler", "LoggingErrorHandler"),

	/**
	 * The '<em><b>No Error Handler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ERROR_HANDLER_VALUE
	 * @generated
	 * @ordered
	 */
	NO_ERROR_HANDLER(3, "NoErrorHandler", "NoErrorHandler"),

	/**
	 * The '<em><b>Transaction Error Handler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_ERROR_HANDLER_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_ERROR_HANDLER(4, "TransactionErrorHandler", "TransactionErrorHandler");

	/**
	 * The '<em><b>Default Error Handler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default Error Handler</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_ERROR_HANDLER
	 * @model name="DefaultErrorHandler"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_ERROR_HANDLER_VALUE = 0;

	/**
	 * The '<em><b>Dead Letter Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dead Letter Channel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEAD_LETTER_CHANNEL
	 * @model name="DeadLetterChannel"
	 * @generated
	 * @ordered
	 */
	public static final int DEAD_LETTER_CHANNEL_VALUE = 1;

	/**
	 * The '<em><b>Logging Error Handler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Logging Error Handler</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGGING_ERROR_HANDLER
	 * @model name="LoggingErrorHandler"
	 * @generated
	 * @ordered
	 */
	public static final int LOGGING_ERROR_HANDLER_VALUE = 2;

	/**
	 * The '<em><b>No Error Handler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Error Handler</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_ERROR_HANDLER
	 * @model name="NoErrorHandler"
	 * @generated
	 * @ordered
	 */
	public static final int NO_ERROR_HANDLER_VALUE = 3;

	/**
	 * The '<em><b>Transaction Error Handler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transaction Error Handler</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_ERROR_HANDLER
	 * @model name="TransactionErrorHandler"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_ERROR_HANDLER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Error Handler Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ErrorHandlerType[] VALUES_ARRAY =
		new ErrorHandlerType[] {
			DEFAULT_ERROR_HANDLER,
			DEAD_LETTER_CHANNEL,
			LOGGING_ERROR_HANDLER,
			NO_ERROR_HANDLER,
			TRANSACTION_ERROR_HANDLER,
		};

	/**
	 * A public read-only list of all the '<em><b>Error Handler Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ErrorHandlerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Error Handler Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErrorHandlerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ErrorHandlerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Error Handler Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErrorHandlerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ErrorHandlerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Error Handler Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErrorHandlerType get(int value) {
		switch (value) {
			case DEFAULT_ERROR_HANDLER_VALUE: return DEFAULT_ERROR_HANDLER;
			case DEAD_LETTER_CHANNEL_VALUE: return DEAD_LETTER_CHANNEL;
			case LOGGING_ERROR_HANDLER_VALUE: return LOGGING_ERROR_HANDLER;
			case NO_ERROR_HANDLER_VALUE: return NO_ERROR_HANDLER;
			case TRANSACTION_ERROR_HANDLER_VALUE: return TRANSACTION_ERROR_HANDLER;
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
	private ErrorHandlerType(int value, String name, String literal) {
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
	
} //ErrorHandlerType
