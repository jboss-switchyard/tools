/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.ns.opencsa.sca.bpel;

import javax.xml.namespace.QName;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.bpel.BPELImplementation#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.ns.opencsa.sca.bpel.BPELPackage#getBPELImplementation()
 * @model extendedMetaData="name='BPELImplementation' kind='empty'"
 * @generated
 */
public interface BPELImplementation extends Implementation {

    /**
     * Returns the value of the '<em><b>Process</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process</em>' attribute.
     * @see #setProcess(QName)
     * @see org.open.oasis.docs.ns.opencsa.sca.bpel.BPELPackage#getBPELImplementation_Process()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='process'"
     * @generated
     */
    QName getProcess();

    /**
     * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.bpel.BPELImplementation#getProcess <em>Process</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process</em>' attribute.
     * @see #getProcess()
     * @generated
     */
    void setProcess(QName value);
} // BPELImplementation
