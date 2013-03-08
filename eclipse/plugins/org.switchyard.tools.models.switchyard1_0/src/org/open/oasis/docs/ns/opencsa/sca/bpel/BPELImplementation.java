/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.ns.opencsa.sca.bpel;

import javax.xml.namespace.QName;
import org.eclipse.emf.ecore.util.FeatureMap;
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
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.bpel.BPELImplementation#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.ns.opencsa.sca.bpel.BPELPackage#getBPELImplementation()
 * @model extendedMetaData="name='BPELImplementation' kind='elementOnly'"
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

    /**
     * Returns the value of the '<em><b>Any Attribute1</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Any Attribute1</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any Attribute1</em>' attribute list.
     * @see org.open.oasis.docs.ns.opencsa.sca.bpel.BPELPackage#getBPELImplementation_AnyAttribute1()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':8' processing='lax'"
     * @generated
     */
    FeatureMap getAnyAttribute1();
} // BPELImplementation
