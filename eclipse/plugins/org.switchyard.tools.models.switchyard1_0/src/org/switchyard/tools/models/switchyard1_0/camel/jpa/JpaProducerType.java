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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#isFlushOnSend <em>Flush On Send</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#isUsePersist <em>Use Persist</em>}</li>
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
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flush On Send</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flush On Send</em>' attribute.
     * @see #isSetFlushOnSend()
     * @see #unsetFlushOnSend()
     * @see #setFlushOnSend(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaProducerType_FlushOnSend()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='flushOnSend' namespace='##targetNamespace'"
     * @generated
     */
    boolean isFlushOnSend();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#isFlushOnSend <em>Flush On Send</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flush On Send</em>' attribute.
     * @see #isSetFlushOnSend()
     * @see #unsetFlushOnSend()
     * @see #isFlushOnSend()
     * @generated
     */
    void setFlushOnSend(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#isFlushOnSend <em>Flush On Send</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlushOnSend()
     * @see #isFlushOnSend()
     * @see #setFlushOnSend(boolean)
     * @generated
     */
    void unsetFlushOnSend();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#isFlushOnSend <em>Flush On Send</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flush On Send</em>' attribute is set.
     * @see #unsetFlushOnSend()
     * @see #isFlushOnSend()
     * @see #setFlushOnSend(boolean)
     * @generated
     */
    boolean isSetFlushOnSend();

    /**
     * Returns the value of the '<em><b>Use Persist</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Persist</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Persist</em>' attribute.
     * @see #isSetUsePersist()
     * @see #unsetUsePersist()
     * @see #setUsePersist(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#getJpaProducerType_UsePersist()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='usePersist' namespace='##targetNamespace'"
     * @generated
     */
    boolean isUsePersist();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#isUsePersist <em>Use Persist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Persist</em>' attribute.
     * @see #isSetUsePersist()
     * @see #unsetUsePersist()
     * @see #isUsePersist()
     * @generated
     */
    void setUsePersist(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#isUsePersist <em>Use Persist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsePersist()
     * @see #isUsePersist()
     * @see #setUsePersist(boolean)
     * @generated
     */
    void unsetUsePersist();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#isUsePersist <em>Use Persist</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Use Persist</em>' attribute is set.
     * @see #unsetUsePersist()
     * @see #isUsePersist()
     * @see #setUsePersist(boolean)
     * @generated
     */
    boolean isSetUsePersist();

} // JpaProducerType
