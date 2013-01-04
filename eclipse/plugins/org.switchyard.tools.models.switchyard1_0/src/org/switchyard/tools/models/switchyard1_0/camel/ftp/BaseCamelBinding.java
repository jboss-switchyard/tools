/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Camel Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.BaseCamelBinding#getCamelContextMapper <em>Camel Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.BaseCamelBinding#getCamelMessageComposer <em>Camel Message Composer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getBaseCamelBinding()
 * @model extendedMetaData="name='BaseCamelBinding' kind='elementOnly'"
 * @generated
 */
public interface BaseCamelBinding extends SwitchYardBindingType {

    /**
     * Returns the value of the '<em><b>Camel Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Camel Context Mapper</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Camel Context Mapper</em>' containment reference.
     * @see #setCamelContextMapper(ContextMapperType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getBaseCamelBinding_CamelContextMapper()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='contextMapper' namespace='##targetNamespace'"
     * @generated
     */
    ContextMapperType getCamelContextMapper();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.BaseCamelBinding#getCamelContextMapper <em>Camel Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Camel Context Mapper</em>' containment reference.
     * @see #getCamelContextMapper()
     * @generated
     */
    void setCamelContextMapper(ContextMapperType value);

    /**
     * Returns the value of the '<em><b>Camel Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Camel Message Composer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Camel Message Composer</em>' containment reference.
     * @see #setCamelMessageComposer(MessageComposerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getBaseCamelBinding_CamelMessageComposer()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='messageComposer' namespace='##targetNamespace'"
     * @generated
     */
    MessageComposerType getCamelMessageComposer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.BaseCamelBinding#getCamelMessageComposer <em>Camel Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Camel Message Composer</em>' containment reference.
     * @see #getCamelMessageComposer()
     * @generated
     */
    void setCamelMessageComposer(MessageComposerType value);
} // BaseCamelBinding
