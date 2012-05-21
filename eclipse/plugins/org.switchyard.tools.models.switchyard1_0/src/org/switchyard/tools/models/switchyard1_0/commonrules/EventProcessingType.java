/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonrules;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Event Processing Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getEventProcessingType()
 * @model extendedMetaData="name='eventProcessingType'"
 * @generated
 */
public enum EventProcessingType implements Enumerator {
    /**
     * The '<em><b>CLOUD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CLOUD_VALUE
     * @generated
     * @ordered
     */
    CLOUD(0, "CLOUD", "CLOUD"),

    /**
     * The '<em><b>STREAM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STREAM_VALUE
     * @generated
     * @ordered
     */
    STREAM(1, "STREAM", "STREAM");

    /**
     * The '<em><b>CLOUD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CLOUD</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CLOUD
     * @model
     * @generated
     * @ordered
     */
    public static final int CLOUD_VALUE = 0;

    /**
     * The '<em><b>STREAM</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>STREAM</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STREAM
     * @model
     * @generated
     * @ordered
     */
    public static final int STREAM_VALUE = 1;

    /**
     * An array of all the '<em><b>Event Processing Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final EventProcessingType[] VALUES_ARRAY =
        new EventProcessingType[] {
            CLOUD,
            STREAM,
        };

    /**
     * A public read-only list of all the '<em><b>Event Processing Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<EventProcessingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Event Processing Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EventProcessingType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EventProcessingType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Event Processing Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EventProcessingType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EventProcessingType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Event Processing Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EventProcessingType get(int value) {
        switch (value) {
            case CLOUD_VALUE: return CLOUD;
            case STREAM_VALUE: return STREAM;
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
    private EventProcessingType(int value, String name, String literal) {
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
    
} //EventProcessingType
