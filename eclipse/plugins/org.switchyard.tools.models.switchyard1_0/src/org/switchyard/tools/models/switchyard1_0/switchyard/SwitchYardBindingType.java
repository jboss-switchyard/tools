/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Yard Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSwitchYardBindingType()
 * @model abstract="true"
 *        extendedMetaData="name='SwitchYardBindingType' kind='elementOnly'"
 * @generated
 */
public interface SwitchYardBindingType extends Binding {

    /**
     * @generated NOT
     */
    void setMessageComposer(MessageComposerType messageComposer);

    /**
     * @generated NOT
     */
    MessageComposerType getMessageComposer();
    
    /**
     * @generated NOT
     */
    void setContextMapper(ContextMapperType contextMapper);

    /**
     * @generated NOT
     */
    ContextMapperType getContextMapper();
} // SwitchYardBindingType
