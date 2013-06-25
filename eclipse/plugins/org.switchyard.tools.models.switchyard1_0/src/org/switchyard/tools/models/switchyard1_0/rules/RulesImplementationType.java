/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules;

import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getListeners <em>Listeners</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getLoggers <em>Loggers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesImplementationType()
 * @model extendedMetaData="name='RulesImplementationType' kind='elementOnly'"
 * @generated
 */
public interface RulesImplementationType extends Implementation {
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesImplementationType_Channels()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='channels' namespace='##targetNamespace'"
     * @generated
     */
    ChannelsType getChannels();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getChannels <em>Channels</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesImplementationType_Listeners()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='listeners' namespace='##targetNamespace'"
     * @generated
     */
    ListenersType getListeners();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getListeners <em>Listeners</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesImplementationType_Loggers()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='loggers' namespace='##targetNamespace'"
     * @generated
     */
    LoggersType getLoggers();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getLoggers <em>Loggers</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesImplementationType_Manifest()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='manifest' namespace='##targetNamespace'"
     * @generated
     */
    ManifestType getManifest();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getManifest <em>Manifest</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Manifest</em>' containment reference.
     * @see #getManifest()
     * @generated
     */
    void setManifest(ManifestType value);

    /**
     * Returns the value of the '<em><b>Operations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operations</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operations</em>' containment reference.
     * @see #setOperations(OperationsType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesImplementationType_Operations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='operations' namespace='##targetNamespace'"
     * @generated
     */
    OperationsType getOperations();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getOperations <em>Operations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operations</em>' containment reference.
     * @see #getOperations()
     * @generated
     */
    void setOperations(OperationsType value);

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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRulesImplementationType_Properties()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
     * @generated
     */
    PropertiesType getProperties();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
    void setProperties(PropertiesType value);

} // RulesImplementationType
