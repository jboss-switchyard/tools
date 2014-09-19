/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.quartz;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Quartz Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getCamelBindingName <em>Camel Binding Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getCron <em>Cron</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getTriggerRepeatCount <em>Trigger Repeat Count</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getTriggerRepeatInterval <em>Trigger Repeat Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#isStateful <em>Stateful</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getTriggerStartTime <em>Trigger Start Time</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getTriggerEndTime <em>Trigger End Time</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getTriggerTimeZone <em>Trigger Time Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage#getCamelQuartzBindingType()
 * @model extendedMetaData="name='CamelQuartzBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelQuartzBindingType extends BaseCamelBinding {
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage#getCamelQuartzBindingType_CamelBindingName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getCamelBindingName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getCamelBindingName <em>Camel Binding Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Camel Binding Name</em>' attribute.
     * @see #getCamelBindingName()
     * @generated
     */
    void setCamelBindingName(String value);

    /**
     * Returns the value of the '<em><b>Cron</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cron</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cron</em>' attribute.
     * @see #setCron(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage#getCamelQuartzBindingType_Cron()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='cron' namespace='##targetNamespace'"
     * @generated
     */
    String getCron();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getCron <em>Cron</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cron</em>' attribute.
     * @see #getCron()
     * @generated
     */
    void setCron(String value);

    /**
     * Returns the value of the '<em><b>Trigger Repeat Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger Repeat Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger Repeat Count</em>' attribute.
     * @see #setTriggerRepeatCount(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage#getCamelQuartzBindingType_TriggerRepeatCount()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='trigger.repeatCount' namespace='##targetNamespace'"
     * @generated
     */
    Object getTriggerRepeatCount();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getTriggerRepeatCount <em>Trigger Repeat Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger Repeat Count</em>' attribute.
     * @see #getTriggerRepeatCount()
     * @generated
     */
    void setTriggerRepeatCount(Object value);

    /**
     * Returns the value of the '<em><b>Trigger Repeat Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger Repeat Interval</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger Repeat Interval</em>' attribute.
     * @see #setTriggerRepeatInterval(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage#getCamelQuartzBindingType_TriggerRepeatInterval()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropLong"
     *        extendedMetaData="kind='element' name='trigger.repeatInterval' namespace='##targetNamespace'"
     * @generated
     */
    Object getTriggerRepeatInterval();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getTriggerRepeatInterval <em>Trigger Repeat Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger Repeat Interval</em>' attribute.
     * @see #getTriggerRepeatInterval()
     * @generated
     */
    void setTriggerRepeatInterval(Object value);

    /**
     * Returns the value of the '<em><b>Stateful</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stateful</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stateful</em>' attribute.
     * @see #isSetStateful()
     * @see #unsetStateful()
     * @see #setStateful(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage#getCamelQuartzBindingType_Stateful()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='stateful' namespace='##targetNamespace'"
     * @generated
     */
    boolean isStateful();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#isStateful <em>Stateful</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stateful</em>' attribute.
     * @see #isSetStateful()
     * @see #unsetStateful()
     * @see #isStateful()
     * @generated
     */
    void setStateful(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#isStateful <em>Stateful</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStateful()
     * @see #isStateful()
     * @see #setStateful(boolean)
     * @generated
     */
    void unsetStateful();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#isStateful <em>Stateful</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stateful</em>' attribute is set.
     * @see #unsetStateful()
     * @see #isStateful()
     * @see #setStateful(boolean)
     * @generated
     */
    boolean isSetStateful();

    /**
     * Returns the value of the '<em><b>Trigger Start Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger Start Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger Start Time</em>' attribute.
     * @see #setTriggerStartTime(XMLGregorianCalendar)
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage#getCamelQuartzBindingType_TriggerStartTime()
     * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
     *        extendedMetaData="kind='element' name='trigger.startTime' namespace='##targetNamespace'"
     * @generated
     */
    XMLGregorianCalendar getTriggerStartTime();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getTriggerStartTime <em>Trigger Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger Start Time</em>' attribute.
     * @see #getTriggerStartTime()
     * @generated
     */
    void setTriggerStartTime(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>Trigger End Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger End Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger End Time</em>' attribute.
     * @see #setTriggerEndTime(XMLGregorianCalendar)
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage#getCamelQuartzBindingType_TriggerEndTime()
     * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
     *        extendedMetaData="kind='element' name='trigger.endTime' namespace='##targetNamespace'"
     * @generated
     */
    XMLGregorianCalendar getTriggerEndTime();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getTriggerEndTime <em>Trigger End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger End Time</em>' attribute.
     * @see #getTriggerEndTime()
     * @generated
     */
    void setTriggerEndTime(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>Trigger Time Zone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger Time Zone</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger Time Zone</em>' attribute.
     * @see #setTriggerTimeZone(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage#getCamelQuartzBindingType_TriggerTimeZone()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='trigger.timeZone' namespace='##targetNamespace'"
     * @generated
     */
    String getTriggerTimeZone();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getTriggerTimeZone <em>Trigger Time Zone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger Time Zone</em>' attribute.
     * @see #getTriggerTimeZone()
     * @generated
     */
    void setTriggerTimeZone(String value);

} // CamelQuartzBindingType
