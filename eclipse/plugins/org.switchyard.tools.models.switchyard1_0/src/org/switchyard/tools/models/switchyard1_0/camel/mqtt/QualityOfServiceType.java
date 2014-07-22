/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mqtt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Quality Of Service Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getQualityOfServiceType()
 * @model extendedMetaData="name='qualityOfService_._type'"
 * @generated
 */
public enum QualityOfServiceType implements Enumerator {
    /**
     * The '<em><b>At Most Once</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AT_MOST_ONCE_VALUE
     * @generated
     * @ordered
     */
    AT_MOST_ONCE(0, "AtMostOnce", "AtMostOnce"),

    /**
     * The '<em><b>At Least Once</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AT_LEAST_ONCE_VALUE
     * @generated
     * @ordered
     */
    AT_LEAST_ONCE(1, "AtLeastOnce", "AtLeastOnce"),

    /**
     * The '<em><b>Exactly Once</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXACTLY_ONCE_VALUE
     * @generated
     * @ordered
     */
    EXACTLY_ONCE(2, "ExactlyOnce", "ExactlyOnce");

    /**
     * The '<em><b>At Most Once</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>At Most Once</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AT_MOST_ONCE
     * @model name="AtMostOnce"
     * @generated
     * @ordered
     */
    public static final int AT_MOST_ONCE_VALUE = 0;

    /**
     * The '<em><b>At Least Once</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>At Least Once</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AT_LEAST_ONCE
     * @model name="AtLeastOnce"
     * @generated
     * @ordered
     */
    public static final int AT_LEAST_ONCE_VALUE = 1;

    /**
     * The '<em><b>Exactly Once</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Exactly Once</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXACTLY_ONCE
     * @model name="ExactlyOnce"
     * @generated
     * @ordered
     */
    public static final int EXACTLY_ONCE_VALUE = 2;

    /**
     * An array of all the '<em><b>Quality Of Service Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final QualityOfServiceType[] VALUES_ARRAY =
        new QualityOfServiceType[] {
            AT_MOST_ONCE,
            AT_LEAST_ONCE,
            EXACTLY_ONCE,
        };

    /**
     * A public read-only list of all the '<em><b>Quality Of Service Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<QualityOfServiceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Quality Of Service Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static QualityOfServiceType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            QualityOfServiceType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Quality Of Service Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static QualityOfServiceType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            QualityOfServiceType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Quality Of Service Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static QualityOfServiceType get(int value) {
        switch (value) {
            case AT_MOST_ONCE_VALUE: return AT_MOST_ONCE;
            case AT_LEAST_ONCE_VALUE: return AT_LEAST_ONCE;
            case EXACTLY_ONCE_VALUE: return EXACTLY_ONCE;
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
    private QualityOfServiceType(int value, String name, String literal) {
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
    
} //QualityOfServiceType
