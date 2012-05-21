/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Soap Headers Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getSoapHeadersType()
 * @model extendedMetaData="name='soapHeadersType'"
 * @generated
 */
public enum SoapHeadersType implements Enumerator {
    /**
     * The '<em><b>CONFIG</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONFIG_VALUE
     * @generated
     * @ordered
     */
    CONFIG(0, "CONFIG", "CONFIG"),

    /**
     * The '<em><b>DOM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOM_VALUE
     * @generated
     * @ordered
     */
    DOM(1, "DOM", "DOM"),

    /**
     * The '<em><b>VALUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VALUE_VALUE
     * @generated
     * @ordered
     */
    VALUE(2, "VALUE", "VALUE"),

    /**
     * The '<em><b>XML</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #XML_VALUE
     * @generated
     * @ordered
     */
    XML(3, "XML", "XML");

    /**
     * The '<em><b>CONFIG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CONFIG</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONFIG
     * @model
     * @generated
     * @ordered
     */
    public static final int CONFIG_VALUE = 0;

    /**
     * The '<em><b>DOM</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DOM</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DOM
     * @model
     * @generated
     * @ordered
     */
    public static final int DOM_VALUE = 1;

    /**
     * The '<em><b>VALUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VALUE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VALUE
     * @model
     * @generated
     * @ordered
     */
    public static final int VALUE_VALUE = 2;

    /**
     * The '<em><b>XML</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>XML</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #XML
     * @model
     * @generated
     * @ordered
     */
    public static final int XML_VALUE = 3;

    /**
     * An array of all the '<em><b>Soap Headers Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SoapHeadersType[] VALUES_ARRAY =
        new SoapHeadersType[] {
            CONFIG,
            DOM,
            VALUE,
            XML,
        };

    /**
     * A public read-only list of all the '<em><b>Soap Headers Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SoapHeadersType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Soap Headers Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SoapHeadersType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SoapHeadersType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Soap Headers Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SoapHeadersType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SoapHeadersType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Soap Headers Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SoapHeadersType get(int value) {
        switch (value) {
            case CONFIG_VALUE: return CONFIG;
            case DOM_VALUE: return DOM;
            case VALUE_VALUE: return VALUE;
            case XML_VALUE: return XML;
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
    private SoapHeadersType(int value, String name, String literal) {
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
    
} //SoapHeadersType
