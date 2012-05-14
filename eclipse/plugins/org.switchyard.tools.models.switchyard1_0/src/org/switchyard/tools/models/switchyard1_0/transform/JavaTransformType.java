/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.transform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Java Transform Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getJavaTransformType()
 * @model extendedMetaData="name='javaTransformType'"
 * @generated
 */
public enum JavaTransformType implements Enumerator {
	/**
     * The '<em><b>XML2JAVA</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #XML2JAVA_VALUE
     * @generated
     * @ordered
     */
	XML2JAVA(0, "XML2JAVA", "XML2JAVA"),

	/**
     * The '<em><b>JAVA2XML</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #JAVA2XML_VALUE
     * @generated
     * @ordered
     */
	JAVA2XML(1, "JAVA2XML", "JAVA2XML");

	/**
     * The '<em><b>XML2JAVA</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                         XML to Java Transformation.
     *                     
     * <!-- end-model-doc -->
     * @see #XML2JAVA
     * @model
     * @generated
     * @ordered
     */
	public static final int XML2JAVA_VALUE = 0;

	/**
     * The '<em><b>JAVA2XML</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                         Java to XML Transformation.
     *                     
     * <!-- end-model-doc -->
     * @see #JAVA2XML
     * @model
     * @generated
     * @ordered
     */
	public static final int JAVA2XML_VALUE = 1;

	/**
     * An array of all the '<em><b>Java Transform Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final JavaTransformType[] VALUES_ARRAY =
		new JavaTransformType[] {
            XML2JAVA,
            JAVA2XML,
        };

	/**
     * A public read-only list of all the '<em><b>Java Transform Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<JavaTransformType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Java Transform Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static JavaTransformType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            JavaTransformType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Java Transform Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static JavaTransformType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            JavaTransformType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Java Transform Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static JavaTransformType get(int value) {
        switch (value) {
            case XML2JAVA_VALUE: return XML2JAVA;
            case JAVA2XML_VALUE: return JAVA2XML;
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
	private JavaTransformType(int value, String name, String literal) {
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
	
} //JavaTransformType
