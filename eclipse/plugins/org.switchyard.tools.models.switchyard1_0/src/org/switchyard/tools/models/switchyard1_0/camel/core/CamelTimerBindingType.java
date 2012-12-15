/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getCamelBindingName <em>Camel Binding Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getTime <em>Time</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getFixedRate <em>Fixed Rate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getDaemon <em>Daemon</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelTimerBindingType()
 * @model extendedMetaData="name='CamelTimerBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelTimerBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Camel Binding Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Camel Binding Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Camel Binding Name</em>' attribute.
     * @see #setCamelBindingName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelTimerBindingType_CamelBindingName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getCamelBindingName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getCamelBindingName <em>Camel Binding Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Camel Binding Name</em>' attribute.
     * @see #getCamelBindingName()
     * @generated
     */
    void setCamelBindingName(String value);

    /**
     * Returns the value of the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time</em>' attribute.
     * @see #setTime(XMLGregorianCalendar)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelTimerBindingType_Time()
     * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
     *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
     * @generated
     */
    XMLGregorianCalendar getTime();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getTime <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time</em>' attribute.
     * @see #getTime()
     * @generated
     */
    void setTime(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pattern</em>' attribute.
     * @see #setPattern(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelTimerBindingType_Pattern()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='pattern' namespace='##targetNamespace'"
     * @generated
     */
    String getPattern();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getPattern <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pattern</em>' attribute.
     * @see #getPattern()
     * @generated
     */
    void setPattern(String value);

    /**
     * Returns the value of the '<em><b>Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Period</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Period</em>' attribute.
     * @see #setPeriod(Long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelTimerBindingType_Period()
     * @model dataType="org.eclipse.emf.ecore.xml.type.LongObject"
     *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
     * @generated
     */
    Long getPeriod();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getPeriod <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Period</em>' attribute.
     * @see #getPeriod()
     * @generated
     */
    void setPeriod(Long value);

    /**
     * Returns the value of the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' attribute.
     * @see #setDelay(Long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelTimerBindingType_Delay()
     * @model dataType="org.eclipse.emf.ecore.xml.type.LongObject"
     *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace'"
     * @generated
     */
    Long getDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' attribute.
     * @see #getDelay()
     * @generated
     */
    void setDelay(Long value);

    /**
     * Returns the value of the '<em><b>Fixed Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fixed Rate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fixed Rate</em>' attribute.
     * @see #isSetFixedRate()
     * @see #unsetFixedRate()
     * @see #setFixedRate(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelTimerBindingType_FixedRate()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='fixedRate' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getFixedRate();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getFixedRate <em>Fixed Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fixed Rate</em>' attribute.
     * @see #isSetFixedRate()
     * @see #unsetFixedRate()
     * @see #getFixedRate()
     * @generated
     */
    void setFixedRate(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getFixedRate <em>Fixed Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFixedRate()
     * @see #getFixedRate()
     * @see #setFixedRate(Boolean)
     * @generated
     */
    void unsetFixedRate();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getFixedRate <em>Fixed Rate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fixed Rate</em>' attribute is set.
     * @see #unsetFixedRate()
     * @see #getFixedRate()
     * @see #setFixedRate(Boolean)
     * @generated
     */
    boolean isSetFixedRate();

    /**
     * Returns the value of the '<em><b>Daemon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Daemon</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Daemon</em>' attribute.
     * @see #isSetDaemon()
     * @see #unsetDaemon()
     * @see #setDaemon(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelTimerBindingType_Daemon()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='daemon' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getDaemon();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getDaemon <em>Daemon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Daemon</em>' attribute.
     * @see #isSetDaemon()
     * @see #unsetDaemon()
     * @see #getDaemon()
     * @generated
     */
    void setDaemon(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getDaemon <em>Daemon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDaemon()
     * @see #getDaemon()
     * @see #setDaemon(Boolean)
     * @generated
     */
    void unsetDaemon();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getDaemon <em>Daemon</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Daemon</em>' attribute is set.
     * @see #unsetDaemon()
     * @see #getDaemon()
     * @see #setDaemon(Boolean)
     * @generated
     */
    boolean isSetDaemon();

} // CamelTimerBindingType
