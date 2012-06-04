/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Create Resource</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getCreateResource()
 * @model extendedMetaData="name='CreateResource'"
 * @generated
 */
public enum CreateResource implements Enumerator {
	/**
     * The '<em><b>Always</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ALWAYS_VALUE
     * @generated
     * @ordered
     */
	ALWAYS(0, "always", "always"),

	/**
     * The '<em><b>Never</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #NEVER_VALUE
     * @generated
     * @ordered
     */
	NEVER(1, "never", "never"),

	/**
     * The '<em><b>Ifnotexist</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #IFNOTEXIST_VALUE
     * @generated
     * @ordered
     */
	IFNOTEXIST(2, "ifnotexist", "ifnotexist");

	/**
     * The '<em><b>Always</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Always</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #ALWAYS
     * @model name="always"
     * @generated
     * @ordered
     */
	public static final int ALWAYS_VALUE = 0;

	/**
     * The '<em><b>Never</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Never</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #NEVER
     * @model name="never"
     * @generated
     * @ordered
     */
	public static final int NEVER_VALUE = 1;

	/**
     * The '<em><b>Ifnotexist</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ifnotexist</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #IFNOTEXIST
     * @model name="ifnotexist"
     * @generated
     * @ordered
     */
	public static final int IFNOTEXIST_VALUE = 2;

	/**
     * An array of all the '<em><b>Create Resource</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final CreateResource[] VALUES_ARRAY =
		new CreateResource[] {
            ALWAYS,
            NEVER,
            IFNOTEXIST,
        };

	/**
     * A public read-only list of all the '<em><b>Create Resource</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<CreateResource> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Create Resource</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static CreateResource get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CreateResource result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Create Resource</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static CreateResource getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CreateResource result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Create Resource</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static CreateResource get(int value) {
        switch (value) {
            case ALWAYS_VALUE: return ALWAYS;
            case NEVER_VALUE: return NEVER;
            case IFNOTEXIST_VALUE: return IFNOTEXIST;
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
	private CreateResource(int value, String name, String literal) {
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
	
} //CreateResource
