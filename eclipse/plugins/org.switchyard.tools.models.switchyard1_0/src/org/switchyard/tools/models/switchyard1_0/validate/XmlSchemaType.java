/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.validate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Xml Schema Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getXmlSchemaType()
 * @model extendedMetaData="name='xmlSchemaType'"
 * @generated
 */
public enum XmlSchemaType implements Enumerator {
	/**
     * The '<em><b>DTD</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DTD_VALUE
     * @generated
     * @ordered
     */
	DTD(0, "DTD", "DTD"),

	/**
     * The '<em><b>XMLSCHEMA</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #XMLSCHEMA_VALUE
     * @generated
     * @ordered
     */
	XMLSCHEMA(1, "XMLSCHEMA", "XML_SCHEMA"),

	/**
     * The '<em><b>RELAXNG</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #RELAXNG_VALUE
     * @generated
     * @ordered
     */
	RELAXNG(2, "RELAXNG", "RELAX_NG");

	/**
     * The '<em><b>DTD</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                         DTD.
     *                     
     * <!-- end-model-doc -->
     * @see #DTD
     * @model
     * @generated
     * @ordered
     */
	public static final int DTD_VALUE = 0;

	/**
     * The '<em><b>XMLSCHEMA</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                         W3C XML Schema.
     *                     
     * <!-- end-model-doc -->
     * @see #XMLSCHEMA
     * @model literal="XML_SCHEMA"
     * @generated
     * @ordered
     */
	public static final int XMLSCHEMA_VALUE = 1;

	/**
     * The '<em><b>RELAXNG</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                         RELAX NG.
     *                     
     * <!-- end-model-doc -->
     * @see #RELAXNG
     * @model literal="RELAX_NG"
     * @generated
     * @ordered
     */
	public static final int RELAXNG_VALUE = 2;

	/**
     * An array of all the '<em><b>Xml Schema Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final XmlSchemaType[] VALUES_ARRAY =
		new XmlSchemaType[] {
            DTD,
            XMLSCHEMA,
            RELAXNG,
        };

	/**
     * A public read-only list of all the '<em><b>Xml Schema Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<XmlSchemaType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Xml Schema Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static XmlSchemaType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            XmlSchemaType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Xml Schema Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static XmlSchemaType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            XmlSchemaType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Xml Schema Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static XmlSchemaType get(int value) {
        switch (value) {
            case DTD_VALUE: return DTD;
            case XMLSCHEMA_VALUE: return XMLSCHEMA;
            case RELAXNG_VALUE: return RELAXNG;
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
	private XmlSchemaType(int value, String name, String literal) {
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
	
} //XmlSchemaType
