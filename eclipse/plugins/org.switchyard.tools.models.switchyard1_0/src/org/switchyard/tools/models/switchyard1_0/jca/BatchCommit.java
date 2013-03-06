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
     * @see #setBatchSize(String)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getBatchCommit_BatchSize()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='batchSize'"
     * @generated
     */
    String getBatchSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.BatchCommit#getBatchSize <em>Batch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Batch Size</em>' attribute.
     * @see #getBatchSize()
     * @generated
     */
    void setBatchSize(String value);

    /**
     * Returns the value of the '<em><b>Batch Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Batch Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Batch Timeout</em>' attribute.
     * @see #setBatchTimeout(String)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getBatchCommit_BatchTimeout()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='batchTimeout'"
     * @generated
     */
    String getBatchTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.BatchCommit#getBatchTimeout <em>Batch Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Batch Timeout</em>' attribute.
     * @see #getBatchTimeout()
     * @generated
     */
    void setBatchTimeout(String value);

} // BatchCommit
