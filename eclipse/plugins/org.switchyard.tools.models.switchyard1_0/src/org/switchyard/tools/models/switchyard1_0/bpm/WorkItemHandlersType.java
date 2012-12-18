/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Item Handlers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlersType#getWorkItemHandler <em>Work Item Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getWorkItemHandlersType()
 * @model extendedMetaData="name='WorkItemHandlersType' kind='elementOnly'"
 * @generated
 */
public interface WorkItemHandlersType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Work Item Handler</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlerType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Work Item Handler</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Work Item Handler</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getWorkItemHandlersType_WorkItemHandler()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='workItemHandler' namespace='##targetNamespace'"
     * @generated
     */
    EList<WorkItemHandlerType> getWorkItemHandler();

} // WorkItemHandlersType
