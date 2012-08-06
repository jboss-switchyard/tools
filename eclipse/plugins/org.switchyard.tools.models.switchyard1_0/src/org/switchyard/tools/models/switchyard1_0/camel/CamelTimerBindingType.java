/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import javax.xml.datatype.XMLGregorianCalendar;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getNameElement <em>Name Element</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getTime <em>Time</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#isFixedRate <em>Fixed Rate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#isDaemon <em>Daemon</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelTimerBindingType()
 * @model extendedMetaData="name='CamelTimerBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelTimerBindingType extends SwitchYardBindingType {
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelTimerBindingType_NameElement()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getNameElement();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getNameElement <em>Name Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name Element</em>' attribute.
     * @see #getNameElement()
     * @generated
     */
    void setNameElement(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelTimerBindingType_Time()
     * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
     *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
     * @generated
     */
	XMLGregorianCalendar getTime();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getTime <em>Time</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelTimerBindingType_Pattern()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='pattern' namespace='##targetNamespace'"
     * @generated
     */
	String getPattern();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getPattern <em>Pattern</em>}' attribute.
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
     * @see #isSetPeriod()
     * @see #unsetPeriod()
     * @see #setPeriod(long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelTimerBindingType_Period()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
     * @generated
     */
	long getPeriod();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getPeriod <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Period</em>' attribute.
     * @see #isSetPeriod()
     * @see #unsetPeriod()
     * @see #getPeriod()
     * @generated
     */
	void setPeriod(long value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getPeriod <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetPeriod()
     * @see #getPeriod()
     * @see #setPeriod(long)
     * @generated
     */
	void unsetPeriod();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getPeriod <em>Period</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Period</em>' attribute is set.
     * @see #unsetPeriod()
     * @see #getPeriod()
     * @see #setPeriod(long)
     * @generated
     */
	boolean isSetPeriod();

	/**
     * Returns the value of the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' attribute.
     * @see #isSetDelay()
     * @see #unsetDelay()
     * @see #setDelay(long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelTimerBindingType_Delay()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace'"
     * @generated
     */
	long getDelay();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' attribute.
     * @see #isSetDelay()
     * @see #unsetDelay()
     * @see #getDelay()
     * @generated
     */
	void setDelay(long value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetDelay()
     * @see #getDelay()
     * @see #setDelay(long)
     * @generated
     */
	void unsetDelay();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getDelay <em>Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Delay</em>' attribute is set.
     * @see #unsetDelay()
     * @see #getDelay()
     * @see #setDelay(long)
     * @generated
     */
	boolean isSetDelay();

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
     * @see #setFixedRate(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelTimerBindingType_FixedRate()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='fixedRate' namespace='##targetNamespace'"
     * @generated
     */
	boolean isFixedRate();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#isFixedRate <em>Fixed Rate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fixed Rate</em>' attribute.
     * @see #isSetFixedRate()
     * @see #unsetFixedRate()
     * @see #isFixedRate()
     * @generated
     */
	void setFixedRate(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#isFixedRate <em>Fixed Rate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetFixedRate()
     * @see #isFixedRate()
     * @see #setFixedRate(boolean)
     * @generated
     */
	void unsetFixedRate();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#isFixedRate <em>Fixed Rate</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fixed Rate</em>' attribute is set.
     * @see #unsetFixedRate()
     * @see #isFixedRate()
     * @see #setFixedRate(boolean)
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
     * @see #setDaemon(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelTimerBindingType_Daemon()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='daemon' namespace='##targetNamespace'"
     * @generated
     */
	boolean isDaemon();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#isDaemon <em>Daemon</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Daemon</em>' attribute.
     * @see #isSetDaemon()
     * @see #unsetDaemon()
     * @see #isDaemon()
     * @generated
     */
	void setDaemon(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#isDaemon <em>Daemon</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetDaemon()
     * @see #isDaemon()
     * @see #setDaemon(boolean)
     * @generated
     */
	void unsetDaemon();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#isDaemon <em>Daemon</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Daemon</em>' attribute is set.
     * @see #unsetDaemon()
     * @see #isDaemon()
     * @see #setDaemon(boolean)
     * @generated
     */
	boolean isSetDaemon();

} // CamelTimerBindingType
