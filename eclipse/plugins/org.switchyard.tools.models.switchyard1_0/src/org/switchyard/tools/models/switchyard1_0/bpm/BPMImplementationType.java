/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import java.math.BigInteger;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getActions <em>Actions</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getListeners <em>Listeners</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getLoggers <em>Loggers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getUserGroupCallback <em>User Group Callback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getWorkItemHandlers <em>Work Item Handlers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessId <em>Process Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType()
 * @model extendedMetaData="name='BPMImplementationType' kind='elementOnly'"
 * @generated
 */
public interface BPMImplementationType extends Implementation {
	/**
     * Returns the value of the '<em><b>Actions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actions</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actions</em>' containment reference.
     * @see #setActions(ActionsType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Actions()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='actions' namespace='##targetNamespace'"
     * @generated
     */
    ActionsType getActions();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getActions <em>Actions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actions</em>' containment reference.
     * @see #getActions()
     * @generated
     */
    void setActions(ActionsType value);

    /**
     * Returns the value of the '<em><b>Channels</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Channels</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Channels</em>' containment reference.
     * @see #setChannels(ChannelsType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Channels()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='channels' namespace='##targetNamespace'"
     * @generated
     */
    ChannelsType getChannels();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getChannels <em>Channels</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Channels</em>' containment reference.
     * @see #getChannels()
     * @generated
     */
    void setChannels(ChannelsType value);

    /**
     * Returns the value of the '<em><b>Listeners</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Listeners</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Listeners</em>' containment reference.
     * @see #setListeners(ListenersType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Listeners()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='listeners' namespace='##targetNamespace'"
     * @generated
     */
    ListenersType getListeners();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getListeners <em>Listeners</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Listeners</em>' containment reference.
     * @see #getListeners()
     * @generated
     */
    void setListeners(ListenersType value);

    /**
     * Returns the value of the '<em><b>Loggers</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loggers</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loggers</em>' containment reference.
     * @see #setLoggers(LoggersType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Loggers()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='loggers' namespace='##targetNamespace'"
     * @generated
     */
    LoggersType getLoggers();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getLoggers <em>Loggers</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loggers</em>' containment reference.
     * @see #getLoggers()
     * @generated
     */
    void setLoggers(LoggersType value);

    /**
     * Returns the value of the '<em><b>Manifest</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Manifest</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Manifest</em>' containment reference.
     * @see #setManifest(ManifestType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Manifest()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='manifest' namespace='##targetNamespace'"
     * @generated
     */
    ManifestType getManifest();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getManifest <em>Manifest</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Manifest</em>' containment reference.
     * @see #getManifest()
     * @generated
     */
    void setManifest(ManifestType value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference.
     * @see #setProperties(PropertiesType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Properties()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
     * @generated
     */
    PropertiesType getProperties();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
    void setProperties(PropertiesType value);

    /**
     * Returns the value of the '<em><b>User Group Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Group Callback</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User Group Callback</em>' containment reference.
     * @see #setUserGroupCallback(UserGroupCallbackType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_UserGroupCallback()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='userGroupCallback' namespace='##targetNamespace'"
     * @generated
     */
    UserGroupCallbackType getUserGroupCallback();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getUserGroupCallback <em>User Group Callback</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User Group Callback</em>' containment reference.
     * @see #getUserGroupCallback()
     * @generated
     */
    void setUserGroupCallback(UserGroupCallbackType value);

    /**
     * Returns the value of the '<em><b>Work Item Handlers</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Work Item Handlers</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Work Item Handlers</em>' containment reference.
     * @see #setWorkItemHandlers(WorkItemHandlersType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_WorkItemHandlers()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='workItemHandlers' namespace='##targetNamespace'"
     * @generated
     */
    WorkItemHandlersType getWorkItemHandlers();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getWorkItemHandlers <em>Work Item Handlers</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Work Item Handlers</em>' containment reference.
     * @see #getWorkItemHandlers()
     * @generated
     */
    void setWorkItemHandlers(WorkItemHandlersType value);

    /**
     * Returns the value of the '<em><b>Process Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Id</em>' attribute.
     * @see #setProcessId(String)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_ProcessId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='processId'"
     * @generated
     */
    String getProcessId();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessId <em>Process Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Id</em>' attribute.
     * @see #getProcessId()
     * @generated
     */
    void setProcessId(String value);

    /**
     * Returns the value of the '<em><b>Persistent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Persistent</em>' attribute.
     * @see #isSetPersistent()
     * @see #unsetPersistent()
     * @see #setPersistent(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Persistent()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='persistent'"
     * @generated
     */
    boolean isPersistent();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#isPersistent <em>Persistent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Persistent</em>' attribute.
     * @see #isSetPersistent()
     * @see #unsetPersistent()
     * @see #isPersistent()
     * @generated
     */
    void setPersistent(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#isPersistent <em>Persistent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPersistent()
     * @see #isPersistent()
     * @see #setPersistent(boolean)
     * @generated
     */
    void unsetPersistent();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#isPersistent <em>Persistent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Persistent</em>' attribute is set.
     * @see #unsetPersistent()
     * @see #isPersistent()
     * @see #setPersistent(boolean)
     * @generated
     */
    boolean isSetPersistent();

} // BPMImplementationType
