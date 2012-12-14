/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#getFlushOnSend <em>Flush On Send</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#getUsePersist <em>Use Persist</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaProducerType()
 * @model extendedMetaData="name='JpaProducerType' kind='elementOnly'"
 * @generated
 */
public interface JpaProducerType extends EObject {
    /**
     * Returns the value of the '<em><b>Flush On Send</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flush On Send</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flush On Send</em>' attribute.
     * @see #isSetFlushOnSend()
     * @see #unsetFlushOnSend()
     * @see #setFlushOnSend(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaProducerType_FlushOnSend()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='flushOnSend' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getFlushOnSend();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#getFlushOnSend <em>Flush On Send</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flush On Send</em>' attribute.
     * @see #isSetFlushOnSend()
     * @see #unsetFlushOnSend()
     * @see #getFlushOnSend()
     * @generated
     */
    void setFlushOnSend(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#getFlushOnSend <em>Flush On Send</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlushOnSend()
     * @see #getFlushOnSend()
     * @see #setFlushOnSend(Boolean)
     * @generated
     */
    void unsetFlushOnSend();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#getFlushOnSend <em>Flush On Send</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flush On Send</em>' attribute is set.
     * @see #unsetFlushOnSend()
     * @see #getFlushOnSend()
     * @see #setFlushOnSend(Boolean)
     * @generated
     */
    boolean isSetFlushOnSend();

    /**
     * Returns the value of the '<em><b>Use Persist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Persist</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Persist</em>' attribute.
     * @see #isSetUsePersist()
     * @see #unsetUsePersist()
     * @see #setUsePersist(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaProducerType_UsePersist()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='usePersist' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getUsePersist();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#getUsePersist <em>Use Persist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Persist</em>' attribute.
     * @see #isSetUsePersist()
     * @see #unsetUsePersist()
     * @see #getUsePersist()
     * @generated
     */
    void setUsePersist(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#getUsePersist <em>Use Persist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsePersist()
     * @see #getUsePersist()
     * @see #setUsePersist(Boolean)
     * @generated
     */
    void unsetUsePersist();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#getUsePersist <em>Use Persist</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Use Persist</em>' attribute is set.
     * @see #unsetUsePersist()
     * @see #getUsePersist()
     * @see #setUsePersist(Boolean)
     * @generated
     */
    boolean isSetUsePersist();

} // JpaProducerType
