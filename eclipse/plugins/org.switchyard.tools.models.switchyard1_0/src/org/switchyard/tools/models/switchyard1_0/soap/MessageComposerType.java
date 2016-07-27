/**
 */
package org.switchyard.tools.models.switchyard1_0.soap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Composer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType#isCopyNamespaces <em>Copy Namespaces</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType#isUnwrapped <em>Unwrapped</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getMessageComposerType()
 * @model extendedMetaData="name='MessageComposerType' kind='empty'"
 * @generated
 */
public interface MessageComposerType extends org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType {
    /**
     * Returns the value of the '<em><b>Copy Namespaces</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Copy Namespaces</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Copy Namespaces</em>' attribute.
     * @see #isSetCopyNamespaces()
     * @see #unsetCopyNamespaces()
     * @see #setCopyNamespaces(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getMessageComposerType_CopyNamespaces()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='copyNamespaces'"
     * @generated
     */
    boolean isCopyNamespaces();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType#isCopyNamespaces <em>Copy Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Copy Namespaces</em>' attribute.
     * @see #isSetCopyNamespaces()
     * @see #unsetCopyNamespaces()
     * @see #isCopyNamespaces()
     * @generated
     */
    void setCopyNamespaces(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType#isCopyNamespaces <em>Copy Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCopyNamespaces()
     * @see #isCopyNamespaces()
     * @see #setCopyNamespaces(boolean)
     * @generated
     */
    void unsetCopyNamespaces();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType#isCopyNamespaces <em>Copy Namespaces</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Copy Namespaces</em>' attribute is set.
     * @see #unsetCopyNamespaces()
     * @see #isCopyNamespaces()
     * @see #setCopyNamespaces(boolean)
     * @generated
     */
    boolean isSetCopyNamespaces();

    /**
     * Returns the value of the '<em><b>Unwrapped</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unwrapped</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unwrapped</em>' attribute.
     * @see #isSetUnwrapped()
     * @see #unsetUnwrapped()
     * @see #setUnwrapped(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getMessageComposerType_Unwrapped()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='unwrapped'"
     * @generated
     */
    boolean isUnwrapped();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType#isUnwrapped <em>Unwrapped</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unwrapped</em>' attribute.
     * @see #isSetUnwrapped()
     * @see #unsetUnwrapped()
     * @see #isUnwrapped()
     * @generated
     */
    void setUnwrapped(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType#isUnwrapped <em>Unwrapped</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnwrapped()
     * @see #isUnwrapped()
     * @see #setUnwrapped(boolean)
     * @generated
     */
    void unsetUnwrapped();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType#isUnwrapped <em>Unwrapped</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Unwrapped</em>' attribute is set.
     * @see #unsetUnwrapped()
     * @see #isUnwrapped()
     * @see #setUnwrapped(boolean)
     * @generated
     */
    boolean isSetUnwrapped();

} // MessageComposerType
