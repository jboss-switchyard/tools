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
 * A representation of the literals of the enumeration '<em><b>Thread Pool Rejected Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThreadPoolRejectedPolicy()
 * @model extendedMetaData="name='threadPoolRejectedPolicy'"
 * @generated
 */
public enum ThreadPoolRejectedPolicy implements Enumerator {
	/**
     * The '<em><b>Abort</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ABORT_VALUE
     * @generated
     * @ordered
     */
	ABORT(0, "Abort", "Abort"),

	/**
     * The '<em><b>Caller Runs</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CALLER_RUNS_VALUE
     * @generated
     * @ordered
     */
	CALLER_RUNS(1, "CallerRuns", "CallerRuns"),

	/**
     * The '<em><b>Discard Oldest</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DISCARD_OLDEST_VALUE
     * @generated
     * @ordered
     */
	DISCARD_OLDEST(2, "DiscardOldest", "DiscardOldest"),

	/**
     * The '<em><b>Discard</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DISCARD_VALUE
     * @generated
     * @ordered
     */
	DISCARD(3, "Discard", "Discard");

	/**
     * The '<em><b>Abort</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abort</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #ABORT
     * @model name="Abort"
     * @generated
     * @ordered
     */
	public static final int ABORT_VALUE = 0;

	/**
     * The '<em><b>Caller Runs</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Caller Runs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CALLER_RUNS
     * @model name="CallerRuns"
     * @generated
     * @ordered
     */
	public static final int CALLER_RUNS_VALUE = 1;

	/**
     * The '<em><b>Discard Oldest</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Discard Oldest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #DISCARD_OLDEST
     * @model name="DiscardOldest"
     * @generated
     * @ordered
     */
	public static final int DISCARD_OLDEST_VALUE = 2;

	/**
     * The '<em><b>Discard</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Discard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #DISCARD
     * @model name="Discard"
     * @generated
     * @ordered
     */
	public static final int DISCARD_VALUE = 3;

	/**
     * An array of all the '<em><b>Thread Pool Rejected Policy</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ThreadPoolRejectedPolicy[] VALUES_ARRAY =
		new ThreadPoolRejectedPolicy[] {
            ABORT,
            CALLER_RUNS,
            DISCARD_OLDEST,
            DISCARD,
        };

	/**
     * A public read-only list of all the '<em><b>Thread Pool Rejected Policy</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ThreadPoolRejectedPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Thread Pool Rejected Policy</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ThreadPoolRejectedPolicy get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ThreadPoolRejectedPolicy result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Thread Pool Rejected Policy</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ThreadPoolRejectedPolicy getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ThreadPoolRejectedPolicy result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Thread Pool Rejected Policy</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ThreadPoolRejectedPolicy get(int value) {
        switch (value) {
            case ABORT_VALUE: return ABORT;
            case CALLER_RUNS_VALUE: return CALLER_RUNS;
            case DISCARD_OLDEST_VALUE: return DISCARD_OLDEST;
            case DISCARD_VALUE: return DISCARD;
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
	private ThreadPoolRejectedPolicy(int value, String name, String literal) {
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
	
} //ThreadPoolRejectedPolicy
