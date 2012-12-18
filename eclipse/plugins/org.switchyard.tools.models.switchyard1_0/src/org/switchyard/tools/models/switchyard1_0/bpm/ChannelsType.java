/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channels Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ChannelsType#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getChannelsType()
 * @model extendedMetaData="name='ChannelsType' kind='elementOnly'"
 * @generated
 */
public interface ChannelsType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Channel</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.bpm.ChannelType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Channel</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Channel</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getChannelsType_Channel()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='channel' namespace='##targetNamespace'"
     * @generated
     */
    EList<ChannelType> getChannel();

} // ChannelsType
