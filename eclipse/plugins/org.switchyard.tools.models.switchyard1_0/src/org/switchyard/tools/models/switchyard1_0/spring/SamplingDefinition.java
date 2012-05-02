/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sampling Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition#getMessageFrequency <em>Message Frequency</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition#getSamplePeriod <em>Sample Period</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition#getUnits <em>Units</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSamplingDefinition()
 * @model extendedMetaData="name='samplingDefinition' kind='elementOnly'"
 * @generated
 */
public interface SamplingDefinition extends Output {
	/**
	 * Returns the value of the '<em><b>Message Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Frequency</em>' attribute.
	 * @see #isSetMessageFrequency()
	 * @see #unsetMessageFrequency()
	 * @see #setMessageFrequency(long)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSamplingDefinition_MessageFrequency()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='messageFrequency'"
	 * @generated
	 */
	long getMessageFrequency();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition#getMessageFrequency <em>Message Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Frequency</em>' attribute.
	 * @see #isSetMessageFrequency()
	 * @see #unsetMessageFrequency()
	 * @see #getMessageFrequency()
	 * @generated
	 */
	void setMessageFrequency(long value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition#getMessageFrequency <em>Message Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageFrequency()
	 * @see #getMessageFrequency()
	 * @see #setMessageFrequency(long)
	 * @generated
	 */
	void unsetMessageFrequency();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition#getMessageFrequency <em>Message Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Frequency</em>' attribute is set.
	 * @see #unsetMessageFrequency()
	 * @see #getMessageFrequency()
	 * @see #setMessageFrequency(long)
	 * @generated
	 */
	boolean isSetMessageFrequency();

	/**
	 * Returns the value of the '<em><b>Sample Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Period</em>' attribute.
	 * @see #isSetSamplePeriod()
	 * @see #unsetSamplePeriod()
	 * @see #setSamplePeriod(long)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSamplingDefinition_SamplePeriod()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='samplePeriod'"
	 * @generated
	 */
	long getSamplePeriod();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition#getSamplePeriod <em>Sample Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Period</em>' attribute.
	 * @see #isSetSamplePeriod()
	 * @see #unsetSamplePeriod()
	 * @see #getSamplePeriod()
	 * @generated
	 */
	void setSamplePeriod(long value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition#getSamplePeriod <em>Sample Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSamplePeriod()
	 * @see #getSamplePeriod()
	 * @see #setSamplePeriod(long)
	 * @generated
	 */
	void unsetSamplePeriod();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition#getSamplePeriod <em>Sample Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sample Period</em>' attribute is set.
	 * @see #unsetSamplePeriod()
	 * @see #getSamplePeriod()
	 * @see #setSamplePeriod(long)
	 * @generated
	 */
	boolean isSetSamplePeriod();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSamplingDefinition_Units()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='units'"
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(String value);

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSamplingDefinition_AnyAttribute2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':11' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute2();

} // SamplingDefinition
