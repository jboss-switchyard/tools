/**
 */
package org.switchyard.tools.models.switchyard1_0.rules;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logger Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType1#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType1#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType1#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getLoggerType1()
 * @model extendedMetaData="name='LoggerType' kind='elementOnly'"
 * @generated
 */
public interface LoggerType1 extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Interval</b></em>' attribute.
     * The default value is <code>"1000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interval</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interval</em>' attribute.
     * @see #setInterval(Object)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getLoggerType1_Interval()
     * @model default="1000" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='attribute' name='interval'"
     * @generated
     */
    Object getInterval();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType1#getInterval <em>Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interval</em>' attribute.
     * @see #getInterval()
     * @generated
     */
    void setInterval(Object value);

    /**
     * Returns the value of the '<em><b>Log</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Log</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Log</em>' attribute.
     * @see #setLog(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getLoggerType1_Log()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='log'"
     * @generated
     */
    String getLog();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType1#getLog <em>Log</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log</em>' attribute.
     * @see #getLog()
     * @generated
     */
    void setLog(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"THREADED_FILE"</code>.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.rules.LoggerType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(LoggerType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getLoggerType1_Type()
     * @model default="THREADED_FILE" unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    LoggerType getType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType1#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.rules.LoggerType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(LoggerType value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType1#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(LoggerType)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType1#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(LoggerType)
     * @generated
     */
    boolean isSetType();

} // LoggerType1
