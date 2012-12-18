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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getNameElement <em>Name Element</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getCron <em>Cron</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getStateful <em>Stateful</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getTriggerStartTime <em>Trigger Start Time</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getTriggerEndTime <em>Trigger End Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage#getCamelQuartzBindingType()
 * @model extendedMetaData="name='CamelQuartzBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelQuartzBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Name Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name Element</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name Element</em>' attribute.
     * @see #setNameElement(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage#getCamelQuartzBindingType_NameElement()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getNameElement();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getNameElement <em>Name Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name Element</em>' attribute.
     * @see #getNameElement()
     * @generated
     */
    void setNameElement(String value);

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
     * Returns the value of the '<em><b>Stateful</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stateful</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stateful</em>' attribute.
     * @see #isSetStateful()
     * @see #unsetStateful()
     * @see #setStateful(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage#getCamelQuartzBindingType_Stateful()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='stateful' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getStateful();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getStateful <em>Stateful</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stateful</em>' attribute.
     * @see #isSetStateful()
     * @see #unsetStateful()
     * @see #getStateful()
     * @generated
     */
    void setStateful(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getStateful <em>Stateful</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStateful()
     * @see #getStateful()
     * @see #setStateful(Boolean)
     * @generated
     */
    void unsetStateful();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getStateful <em>Stateful</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stateful</em>' attribute is set.
     * @see #unsetStateful()
     * @see #getStateful()
     * @see #setStateful(Boolean)
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

} // CamelQuartzBindingType
