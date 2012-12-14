/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mail;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Mail Producer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getFrom <em>From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getTo <em>To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getCC <em>CC</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getBCC <em>BCC</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getReplyTo <em>Reply To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailProducerType()
 * @model extendedMetaData="name='CamelMailProducerType' kind='elementOnly'"
 * @generated
 */
public interface CamelMailProducerType extends EObject {
    /**
     * Returns the value of the '<em><b>Subject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subject</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subject</em>' attribute.
     * @see #setSubject(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailProducerType_Subject()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
     * @generated
     */
    String getSubject();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getSubject <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Subject</em>' attribute.
     * @see #getSubject()
     * @generated
     */
    void setSubject(String value);

    /**
     * Returns the value of the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' attribute.
     * @see #setFrom(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailProducerType_From()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='from' namespace='##targetNamespace'"
     * @generated
     */
    String getFrom();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getFrom <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' attribute.
     * @see #getFrom()
     * @generated
     */
    void setFrom(String value);

    /**
     * Returns the value of the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' attribute.
     * @see #setTo(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailProducerType_To()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace'"
     * @generated
     */
    String getTo();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getTo <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' attribute.
     * @see #getTo()
     * @generated
     */
    void setTo(String value);

    /**
     * Returns the value of the '<em><b>CC</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CC</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CC</em>' attribute.
     * @see #setCC(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailProducerType_CC()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='CC' namespace='##targetNamespace'"
     * @generated
     */
    String getCC();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getCC <em>CC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CC</em>' attribute.
     * @see #getCC()
     * @generated
     */
    void setCC(String value);

    /**
     * Returns the value of the '<em><b>BCC</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BCC</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>BCC</em>' attribute.
     * @see #setBCC(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailProducerType_BCC()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='BCC' namespace='##targetNamespace'"
     * @generated
     */
    String getBCC();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getBCC <em>BCC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>BCC</em>' attribute.
     * @see #getBCC()
     * @generated
     */
    void setBCC(String value);

    /**
     * Returns the value of the '<em><b>Reply To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reply To</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reply To</em>' attribute.
     * @see #setReplyTo(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailProducerType_ReplyTo()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='replyTo' namespace='##targetNamespace'"
     * @generated
     */
    String getReplyTo();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getReplyTo <em>Reply To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reply To</em>' attribute.
     * @see #getReplyTo()
     * @generated
     */
    void setReplyTo(String value);

} // CamelMailProducerType
