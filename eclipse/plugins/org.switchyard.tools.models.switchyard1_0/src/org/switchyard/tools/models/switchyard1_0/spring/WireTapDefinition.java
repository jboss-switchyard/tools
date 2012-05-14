/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire Tap Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#getBody <em>Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#isCopy <em>Copy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#getOnPrepareRef <em>On Prepare Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#getProcessorRef <em>Processor Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#getRef <em>Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#getUri <em>Uri</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWireTapDefinition()
 * @model extendedMetaData="name='wireTapDefinition' kind='elementOnly'"
 * @generated
 */
public interface WireTapDefinition extends NoOutputDefinition {
	/**
     * Returns the value of the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Body</em>' containment reference.
     * @see #setBody(ExpressionSubElementDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWireTapDefinition_Body()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='body' namespace='##targetNamespace'"
     * @generated
     */
	ExpressionSubElementDefinition getBody();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#getBody <em>Body</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' containment reference.
     * @see #getBody()
     * @generated
     */
	void setBody(ExpressionSubElementDefinition value);

	/**
     * Returns the value of the '<em><b>Set Header</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SetHeaderDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Set Header</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWireTapDefinition_SetHeader()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='setHeader' namespace='##targetNamespace'"
     * @generated
     */
	EList<SetHeaderDefinition> getSetHeader();

	/**
     * Returns the value of the '<em><b>Copy</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Copy</em>' attribute.
     * @see #isSetCopy()
     * @see #unsetCopy()
     * @see #setCopy(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWireTapDefinition_Copy()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='copy'"
     * @generated
     */
	boolean isCopy();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#isCopy <em>Copy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Copy</em>' attribute.
     * @see #isSetCopy()
     * @see #unsetCopy()
     * @see #isCopy()
     * @generated
     */
	void setCopy(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#isCopy <em>Copy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetCopy()
     * @see #isCopy()
     * @see #setCopy(boolean)
     * @generated
     */
	void unsetCopy();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#isCopy <em>Copy</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Copy</em>' attribute is set.
     * @see #unsetCopy()
     * @see #isCopy()
     * @see #setCopy(boolean)
     * @generated
     */
	boolean isSetCopy();

	/**
     * Returns the value of the '<em><b>Executor Service Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor Service Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Executor Service Ref</em>' attribute.
     * @see #setExecutorServiceRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWireTapDefinition_ExecutorServiceRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='executorServiceRef'"
     * @generated
     */
	String getExecutorServiceRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Executor Service Ref</em>' attribute.
     * @see #getExecutorServiceRef()
     * @generated
     */
	void setExecutorServiceRef(String value);

	/**
     * Returns the value of the '<em><b>On Prepare Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Prepare Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>On Prepare Ref</em>' attribute.
     * @see #setOnPrepareRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWireTapDefinition_OnPrepareRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='onPrepareRef'"
     * @generated
     */
	String getOnPrepareRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#getOnPrepareRef <em>On Prepare Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>On Prepare Ref</em>' attribute.
     * @see #getOnPrepareRef()
     * @generated
     */
	void setOnPrepareRef(String value);

	/**
     * Returns the value of the '<em><b>Processor Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Processor Ref</em>' attribute.
     * @see #setProcessorRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWireTapDefinition_ProcessorRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='processorRef'"
     * @generated
     */
	String getProcessorRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#getProcessorRef <em>Processor Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Processor Ref</em>' attribute.
     * @see #getProcessorRef()
     * @generated
     */
	void setProcessorRef(String value);

	/**
     * Returns the value of the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ref</em>' attribute.
     * @see #setRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWireTapDefinition_Ref()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='ref'"
     * @generated
     */
	String getRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#getRef <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref</em>' attribute.
     * @see #getRef()
     * @generated
     */
	void setRef(String value);

	/**
     * Returns the value of the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Uri</em>' attribute.
     * @see #setUri(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWireTapDefinition_Uri()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='uri'"
     * @generated
     */
	String getUri();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition#getUri <em>Uri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uri</em>' attribute.
     * @see #getUri()
     * @generated
     */
	void setUri(String value);

	/**
     * Returns the value of the '<em><b>Any Attribute2</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Any Attribute2</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWireTapDefinition_AnyAttribute2()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':13' processing='skip'"
     * @generated
     */
	FeatureMap getAnyAttribute2();

} // WireTapDefinition
