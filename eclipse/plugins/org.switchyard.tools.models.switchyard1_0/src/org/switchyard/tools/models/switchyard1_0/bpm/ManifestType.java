/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ManifestType#getContainer <em>Container</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ManifestType#getResources <em>Resources</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ManifestType#getRemoteJms <em>Remote Jms</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ManifestType#getRemoteRest <em>Remote Rest</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getManifestType()
 * @model extendedMetaData="name='ManifestType' kind='elementOnly'"
 * @generated
 */
public interface ManifestType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Container</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container</em>' containment reference.
     * @see #setContainer(ContainerType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getManifestType_Container()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='container' namespace='##targetNamespace'"
     * @generated
     */
    ContainerType getContainer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ManifestType#getContainer <em>Container</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container</em>' containment reference.
     * @see #getContainer()
     * @generated
     */
    void setContainer(ContainerType value);

    /**
     * Returns the value of the '<em><b>Resources</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resources</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resources</em>' containment reference.
     * @see #setResources(ResourcesType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getManifestType_Resources()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='resources' namespace='##targetNamespace'"
     * @generated
     */
    ResourcesType getResources();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ManifestType#getResources <em>Resources</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resources</em>' containment reference.
     * @see #getResources()
     * @generated
     */
    void setResources(ResourcesType value);

    /**
     * Returns the value of the '<em><b>Remote Jms</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Jms</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Jms</em>' containment reference.
     * @see #setRemoteJms(RemoteJmsType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getManifestType_RemoteJms()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='remoteJms' namespace='##targetNamespace'"
     * @generated
     */
    RemoteJmsType getRemoteJms();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ManifestType#getRemoteJms <em>Remote Jms</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Jms</em>' containment reference.
     * @see #getRemoteJms()
     * @generated
     */
    void setRemoteJms(RemoteJmsType value);

    /**
     * Returns the value of the '<em><b>Remote Rest</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Rest</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Rest</em>' containment reference.
     * @see #setRemoteRest(RemoteRestType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getManifestType_RemoteRest()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='remoteRest' namespace='##targetNamespace'"
     * @generated
     */
    RemoteRestType getRemoteRest();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ManifestType#getRemoteRest <em>Remote Rest</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Rest</em>' containment reference.
     * @see #getRemoteRest()
     * @generated
     */
    void setRemoteRest(RemoteRestType value);

} // ManifestType
