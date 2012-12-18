/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getReleaseId <em>Release Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getSessionName <em>Session Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getContainerType()
 * @model extendedMetaData="name='ContainerType' kind='elementOnly'"
 * @generated
 */
public interface ContainerType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Base Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Name</em>' attribute.
     * @see #setBaseName(String)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getContainerType_BaseName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='baseName'"
     * @generated
     */
    String getBaseName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getBaseName <em>Base Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Name</em>' attribute.
     * @see #getBaseName()
     * @generated
     */
    void setBaseName(String value);

    /**
     * Returns the value of the '<em><b>Release Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Release Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Release Id</em>' attribute.
     * @see #setReleaseId(String)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getContainerType_ReleaseId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='releaseId'"
     * @generated
     */
    String getReleaseId();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getReleaseId <em>Release Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Release Id</em>' attribute.
     * @see #getReleaseId()
     * @generated
     */
    void setReleaseId(String value);

    /**
     * Returns the value of the '<em><b>Session Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Session Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Session Name</em>' attribute.
     * @see #setSessionName(String)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getContainerType_SessionName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='sessionName'"
     * @generated
     */
    String getSessionName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getSessionName <em>Session Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Session Name</em>' attribute.
     * @see #getSessionName()
     * @generated
     */
    void setSessionName(String value);

} // ContainerType
