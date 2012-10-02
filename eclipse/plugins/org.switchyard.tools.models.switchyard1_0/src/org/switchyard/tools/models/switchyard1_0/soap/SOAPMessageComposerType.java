/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap;

import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Composer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPMessageComposerType#isUnwrapped <em>Unwrapped</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getSOAPMessageComposerType()
 * @model extendedMetaData="name='MessageComposerType' kind='empty' namespace='##targetNamespace'"
 * @generated
 */
public interface SOAPMessageComposerType extends MessageComposerType {
    /**
     * Returns the value of the '<em><b>Unwrapped</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unwrapped</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unwrapped</em>' attribute.
     * @see #setUnwrapped(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getSOAPMessageComposerType_Unwrapped()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='unwrapped'"
     * @generated
     */
    boolean isUnwrapped();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPMessageComposerType#isUnwrapped <em>Unwrapped</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unwrapped</em>' attribute.
     * @see #isUnwrapped()
     * @generated
     */
    void setUnwrapped(boolean value);

} // SOAPMessageComposerType
