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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#isScan <em>Scan</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getScanInterval <em>Scan Interval</em>}</li>
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
     * Returns the value of the '<em><b>Scan</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scan</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scan</em>' attribute.
     * @see #isSetScan()
     * @see #unsetScan()
     * @see #setScan(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getContainerType_Scan()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='scan'"
     * @generated
     */
    boolean isScan();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#isScan <em>Scan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scan</em>' attribute.
     * @see #isSetScan()
     * @see #unsetScan()
     * @see #isScan()
     * @generated
     */
    void setScan(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#isScan <em>Scan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScan()
     * @see #isScan()
     * @see #setScan(boolean)
     * @generated
     */
    void unsetScan();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#isScan <em>Scan</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scan</em>' attribute is set.
     * @see #unsetScan()
     * @see #isScan()
     * @see #setScan(boolean)
     * @generated
     */
    boolean isSetScan();

    /**
     * Returns the value of the '<em><b>Scan Interval</b></em>' attribute.
     * The default value is <code>"60000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scan Interval</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scan Interval</em>' attribute.
     * @see #isSetScanInterval()
     * @see #unsetScanInterval()
     * @see #setScanInterval(long)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getContainerType_ScanInterval()
     * @model default="60000" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        extendedMetaData="kind='attribute' name='scanInterval'"
     * @generated
     */
    long getScanInterval();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getScanInterval <em>Scan Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scan Interval</em>' attribute.
     * @see #isSetScanInterval()
     * @see #unsetScanInterval()
     * @see #getScanInterval()
     * @generated
     */
    void setScanInterval(long value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getScanInterval <em>Scan Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScanInterval()
     * @see #getScanInterval()
     * @see #setScanInterval(long)
     * @generated
     */
    void unsetScanInterval();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getScanInterval <em>Scan Interval</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scan Interval</em>' attribute is set.
     * @see #unsetScanInterval()
     * @see #getScanInterval()
     * @see #setScanInterval(long)
     * @generated
     */
    boolean isSetScanInterval();

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
