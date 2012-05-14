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
 * A representation of the literals of the enumeration '<em><b>Management Statistics Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getManagementStatisticsLevel()
 * @model extendedMetaData="name='managementStatisticsLevel'"
 * @generated
 */
public enum ManagementStatisticsLevel implements Enumerator {
	/**
     * The '<em><b>All</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ALL_VALUE
     * @generated
     * @ordered
     */
	ALL(0, "All", "All"),

	/**
     * The '<em><b>Routes Only</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ROUTES_ONLY_VALUE
     * @generated
     * @ordered
     */
	ROUTES_ONLY(1, "RoutesOnly", "RoutesOnly"),

	/**
     * The '<em><b>Off</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #OFF_VALUE
     * @generated
     * @ordered
     */
	OFF(2, "Off", "Off");

	/**
     * The '<em><b>All</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #ALL
     * @model name="All"
     * @generated
     * @ordered
     */
	public static final int ALL_VALUE = 0;

	/**
     * The '<em><b>Routes Only</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Routes Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #ROUTES_ONLY
     * @model name="RoutesOnly"
     * @generated
     * @ordered
     */
	public static final int ROUTES_ONLY_VALUE = 1;

	/**
     * The '<em><b>Off</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Off</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #OFF
     * @model name="Off"
     * @generated
     * @ordered
     */
	public static final int OFF_VALUE = 2;

	/**
     * An array of all the '<em><b>Management Statistics Level</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ManagementStatisticsLevel[] VALUES_ARRAY =
		new ManagementStatisticsLevel[] {
            ALL,
            ROUTES_ONLY,
            OFF,
        };

	/**
     * A public read-only list of all the '<em><b>Management Statistics Level</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ManagementStatisticsLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Management Statistics Level</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ManagementStatisticsLevel get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ManagementStatisticsLevel result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Management Statistics Level</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ManagementStatisticsLevel getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ManagementStatisticsLevel result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Management Statistics Level</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ManagementStatisticsLevel get(int value) {
        switch (value) {
            case ALL_VALUE: return ALL;
            case ROUTES_ONLY_VALUE: return ROUTES_ONLY;
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
	private ManagementStatisticsLevel(int value, String name, String literal) {
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
	
} //ManagementStatisticsLevel
