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
 * A representation of the literals of the enumeration '<em><b>Shutdown Running Task</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getShutdownRunningTask()
 * @model extendedMetaData="name='shutdownRunningTask'"
 * @generated
 */
public enum ShutdownRunningTask implements Enumerator {
	/**
	 * The '<em><b>Complete Current Task Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_CURRENT_TASK_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE_CURRENT_TASK_ONLY(0, "CompleteCurrentTaskOnly", "CompleteCurrentTaskOnly"),

	/**
	 * The '<em><b>Complete All Tasks</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_ALL_TASKS_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE_ALL_TASKS(1, "CompleteAllTasks", "CompleteAllTasks");

	/**
	 * The '<em><b>Complete Current Task Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Complete Current Task Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_CURRENT_TASK_ONLY
	 * @model name="CompleteCurrentTaskOnly"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_CURRENT_TASK_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Complete All Tasks</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Complete All Tasks</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_ALL_TASKS
	 * @model name="CompleteAllTasks"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_ALL_TASKS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Shutdown Running Task</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ShutdownRunningTask[] VALUES_ARRAY =
		new ShutdownRunningTask[] {
			COMPLETE_CURRENT_TASK_ONLY,
			COMPLETE_ALL_TASKS,
		};

	/**
	 * A public read-only list of all the '<em><b>Shutdown Running Task</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ShutdownRunningTask> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Shutdown Running Task</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShutdownRunningTask get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ShutdownRunningTask result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shutdown Running Task</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShutdownRunningTask getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ShutdownRunningTask result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shutdown Running Task</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShutdownRunningTask get(int value) {
		switch (value) {
			case COMPLETE_CURRENT_TASK_ONLY_VALUE: return COMPLETE_CURRENT_TASK_ONLY;
			case COMPLETE_ALL_TASKS_VALUE: return COMPLETE_ALL_TASKS;
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
	private ShutdownRunningTask(int value, String name, String literal) {
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
	
} //ShutdownRunningTask
