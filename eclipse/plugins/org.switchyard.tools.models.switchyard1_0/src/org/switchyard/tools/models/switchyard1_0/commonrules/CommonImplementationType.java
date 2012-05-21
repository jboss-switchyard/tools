/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonrules;

import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#isAgent <em>Agent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#getClock <em>Clock</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#getEventProcessing <em>Event Processing</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#getMaxThreads <em>Max Threads</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#isMultithreadEvaluation <em>Multithread Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getCommonImplementationType()
 * @model abstract="true"
 *        extendedMetaData="name='CommonImplementationType' kind='empty'"
 * @generated
 */
public interface CommonImplementationType extends Implementation {
    /**
     * Returns the value of the '<em><b>Agent</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Agent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Agent</em>' attribute.
     * @see #setAgent(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getCommonImplementationType_Agent()
     * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='agent'"
     * @generated
     */
    boolean isAgent();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#isAgent <em>Agent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Agent</em>' attribute.
     * @see #isAgent()
     * @generated
     */
    void setAgent(boolean value);

    /**
     * Returns the value of the '<em><b>Clock</b></em>' attribute.
     * The default value is <code>"REALTIME"</code>.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.commonrules.ClockType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Clock</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Clock</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ClockType
     * @see #setClock(ClockType)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getCommonImplementationType_Clock()
     * @model default="REALTIME"
     *        extendedMetaData="kind='attribute' name='clock'"
     * @generated
     */
    ClockType getClock();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#getClock <em>Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Clock</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ClockType
     * @see #getClock()
     * @generated
     */
    void setClock(ClockType value);

    /**
     * Returns the value of the '<em><b>Event Processing</b></em>' attribute.
     * The default value is <code>"CLOUD"</code>.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Processing</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Processing</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType
     * @see #setEventProcessing(EventProcessingType)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getCommonImplementationType_EventProcessing()
     * @model default="CLOUD"
     *        extendedMetaData="kind='attribute' name='eventProcessing'"
     * @generated
     */
    EventProcessingType getEventProcessing();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#getEventProcessing <em>Event Processing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Processing</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType
     * @see #getEventProcessing()
     * @generated
     */
    void setEventProcessing(EventProcessingType value);

    /**
     * Returns the value of the '<em><b>Max Threads</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Threads</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Threads</em>' attribute.
     * @see #setMaxThreads(int)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getCommonImplementationType_MaxThreads()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='maxThreads'"
     * @generated
     */
    int getMaxThreads();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#getMaxThreads <em>Max Threads</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Threads</em>' attribute.
     * @see #getMaxThreads()
     * @generated
     */
    void setMaxThreads(int value);

    /**
     * Returns the value of the '<em><b>Multithread Evaluation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multithread Evaluation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Multithread Evaluation</em>' attribute.
     * @see #setMultithreadEvaluation(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getCommonImplementationType_MultithreadEvaluation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='multithreadEvaluation'"
     * @generated
     */
    boolean isMultithreadEvaluation();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#isMultithreadEvaluation <em>Multithread Evaluation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multithread Evaluation</em>' attribute.
     * @see #isMultithreadEvaluation()
     * @generated
     */
    void setMultithreadEvaluation(boolean value);

} // CommonImplementationType
