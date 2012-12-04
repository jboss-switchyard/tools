/**
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mail Consumer Account Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getMailConsumerAccountType()
 * @model extendedMetaData="name='MailConsumerAccountType'"
 * @generated
 */
public enum MailConsumerAccountType implements Enumerator {
    /**
     * The '<em><b>Imap</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMAP_VALUE
     * @generated
     * @ordered
     */
    IMAP(0, "imap", "imap"),

    /**
     * The '<em><b>Pop3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POP3_VALUE
     * @generated
     * @ordered
     */
    POP3(1, "pop3", "pop3");

    /**
     * The '<em><b>Imap</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Imap</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IMAP
     * @model name="imap"
     * @generated
     * @ordered
     */
    public static final int IMAP_VALUE = 0;

    /**
     * The '<em><b>Pop3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pop3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POP3
     * @model name="pop3"
     * @generated
     * @ordered
     */
    public static final int POP3_VALUE = 1;

    /**
     * An array of all the '<em><b>Mail Consumer Account Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final MailConsumerAccountType[] VALUES_ARRAY =
        new MailConsumerAccountType[] {
            IMAP,
            POP3,
        };

    /**
     * A public read-only list of all the '<em><b>Mail Consumer Account Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<MailConsumerAccountType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Mail Consumer Account Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MailConsumerAccountType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MailConsumerAccountType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Mail Consumer Account Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MailConsumerAccountType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MailConsumerAccountType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Mail Consumer Account Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MailConsumerAccountType get(int value) {
        switch (value) {
            case IMAP_VALUE: return IMAP;
            case POP3_VALUE: return POP3;
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
    private MailConsumerAccountType(int value, String name, String literal) {
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
    
} //MailConsumerAccountType
