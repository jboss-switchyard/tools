/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import java.math.BigInteger;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seda Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getNameElement <em>Name Element</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getSize <em>Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getWaitForTaskToComplete <em>Wait For Task To Complete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#isMultipleConsumers <em>Multiple Consumers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#isLimitConcurrentConsumers <em>Limit Concurrent Consumers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelSedaBindingType()
 * @model extendedMetaData="name='CamelSedaBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelSedaBindingType extends BaseCamelBinding {
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelSedaBindingType_NameElement()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getNameElement();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getNameElement <em>Name Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name Element</em>' attribute.
     * @see #getNameElement()
     * @generated
     */
    void setNameElement(String value);

    /**
     * Returns the value of the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Size</em>' attribute.
     * @see #setSize(BigInteger)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelSedaBindingType_Size()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
     *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
     * @generated
     */
	BigInteger getSize();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getSize <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size</em>' attribute.
     * @see #getSize()
     * @generated
     */
	void setSize(BigInteger value);

	/**
     * Returns the value of the '<em><b>Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrent Consumers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Concurrent Consumers</em>' attribute.
     * @see #setConcurrentConsumers(BigInteger)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelSedaBindingType_ConcurrentConsumers()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
     *        extendedMetaData="kind='element' name='concurrentConsumers' namespace='##targetNamespace'"
     * @generated
     */
	BigInteger getConcurrentConsumers();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Concurrent Consumers</em>' attribute.
     * @see #getConcurrentConsumers()
     * @generated
     */
	void setConcurrentConsumers(BigInteger value);

	/**
     * Returns the value of the '<em><b>Wait For Task To Complete</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait For Task To Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Wait For Task To Complete</em>' attribute.
     * @see #setWaitForTaskToComplete(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelSedaBindingType_WaitForTaskToComplete()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='waitForTaskToComplete' namespace='##targetNamespace'"
     * @generated
     */
	String getWaitForTaskToComplete();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getWaitForTaskToComplete <em>Wait For Task To Complete</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wait For Task To Complete</em>' attribute.
     * @see #getWaitForTaskToComplete()
     * @generated
     */
	void setWaitForTaskToComplete(String value);

	/**
     * Returns the value of the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Timeout</em>' attribute.
     * @see #isSetTimeout()
     * @see #unsetTimeout()
     * @see #setTimeout(long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelSedaBindingType_Timeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
     *        extendedMetaData="kind='element' name='timeout' namespace='##targetNamespace'"
     * @generated
     */
	long getTimeout();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timeout</em>' attribute.
     * @see #isSetTimeout()
     * @see #unsetTimeout()
     * @see #getTimeout()
     * @generated
     */
	void setTimeout(long value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetTimeout()
     * @see #getTimeout()
     * @see #setTimeout(long)
     * @generated
     */
	void unsetTimeout();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getTimeout <em>Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Timeout</em>' attribute is set.
     * @see #unsetTimeout()
     * @see #getTimeout()
     * @see #setTimeout(long)
     * @generated
     */
	boolean isSetTimeout();

	/**
     * Returns the value of the '<em><b>Multiple Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Consumers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Multiple Consumers</em>' attribute.
     * @see #isSetMultipleConsumers()
     * @see #unsetMultipleConsumers()
     * @see #setMultipleConsumers(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelSedaBindingType_MultipleConsumers()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
     *        extendedMetaData="kind='element' name='multipleConsumers' namespace='##targetNamespace'"
     * @generated
     */
	boolean isMultipleConsumers();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#isMultipleConsumers <em>Multiple Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multiple Consumers</em>' attribute.
     * @see #isSetMultipleConsumers()
     * @see #unsetMultipleConsumers()
     * @see #isMultipleConsumers()
     * @generated
     */
	void setMultipleConsumers(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#isMultipleConsumers <em>Multiple Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetMultipleConsumers()
     * @see #isMultipleConsumers()
     * @see #setMultipleConsumers(boolean)
     * @generated
     */
	void unsetMultipleConsumers();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#isMultipleConsumers <em>Multiple Consumers</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Multiple Consumers</em>' attribute is set.
     * @see #unsetMultipleConsumers()
     * @see #isMultipleConsumers()
     * @see #setMultipleConsumers(boolean)
     * @generated
     */
	boolean isSetMultipleConsumers();

	/**
     * Returns the value of the '<em><b>Limit Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Concurrent Consumers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Limit Concurrent Consumers</em>' attribute.
     * @see #isSetLimitConcurrentConsumers()
     * @see #unsetLimitConcurrentConsumers()
     * @see #setLimitConcurrentConsumers(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelSedaBindingType_LimitConcurrentConsumers()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
     *        extendedMetaData="kind='element' name='limitConcurrentConsumers' namespace='##targetNamespace'"
     * @generated
     */
	boolean isLimitConcurrentConsumers();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#isLimitConcurrentConsumers <em>Limit Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Limit Concurrent Consumers</em>' attribute.
     * @see #isSetLimitConcurrentConsumers()
     * @see #unsetLimitConcurrentConsumers()
     * @see #isLimitConcurrentConsumers()
     * @generated
     */
	void setLimitConcurrentConsumers(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#isLimitConcurrentConsumers <em>Limit Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetLimitConcurrentConsumers()
     * @see #isLimitConcurrentConsumers()
     * @see #setLimitConcurrentConsumers(boolean)
     * @generated
     */
	void unsetLimitConcurrentConsumers();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#isLimitConcurrentConsumers <em>Limit Concurrent Consumers</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Limit Concurrent Consumers</em>' attribute is set.
     * @see #unsetLimitConcurrentConsumers()
     * @see #isLimitConcurrentConsumers()
     * @see #setLimitConcurrentConsumers(boolean)
     * @generated
     */
	boolean isSetLimitConcurrentConsumers();

} // CamelSedaBindingType
