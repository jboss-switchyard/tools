/**
 */
package org.switchyard.tools.models.switchyard1_0.jca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Batch Commit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.BatchCommit#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.BatchCommit#getBatchTimeout <em>Batch Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getBatchCommit()
 * @model extendedMetaData="name='batchCommit' kind='empty'"
 * @generated
 */
public interface BatchCommit extends EObject {
    /**
     * Returns the value of the '<em><b>Batch Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Batch Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Batch Size</em>' attribute.
     * @see #setBatchSize(Object)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getBatchCommit_BatchSize()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger" required="true"
     *        extendedMetaData="kind='attribute' name='batchSize'"
     * @generated
     */
    Object getBatchSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.BatchCommit#getBatchSize <em>Batch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Batch Size</em>' attribute.
     * @see #getBatchSize()
     * @generated
     */
    void setBatchSize(Object value);

    /**
     * Returns the value of the '<em><b>Batch Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Batch Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Batch Timeout</em>' attribute.
     * @see #setBatchTimeout(Object)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getBatchCommit_BatchTimeout()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger" required="true"
     *        extendedMetaData="kind='attribute' name='batchTimeout'"
     * @generated
     */
    Object getBatchTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.BatchCommit#getBatchTimeout <em>Batch Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Batch Timeout</em>' attribute.
     * @see #getBatchTimeout()
     * @generated
     */
    void setBatchTimeout(Object value);

} // BatchCommit
