/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getAction <em>Action</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getAudit <em>Audit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getTaskHandler <em>Task Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType()
 * @model extendedMetaData="name='BPMImplementationType' kind='elementOnly'"
 * @generated
 */
public interface BPMImplementationType extends Implementation {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActionType1> getAction();

	/**
	 * Returns the value of the '<em><b>Audit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audit</em>' containment reference.
	 * @see #setAudit(AuditType)
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Audit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='audit' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditType getAudit();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getAudit <em>Audit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit</em>' containment reference.
	 * @see #getAudit()
	 * @generated
	 */
	void setAudit(AuditType value);

	/**
	 * Returns the value of the '<em><b>Task Handler</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Handler</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Handler</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_TaskHandler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='taskHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TaskHandlerType> getTaskHandler();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.bpm.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResourceType> getResource();

} // BPMImplementationType
