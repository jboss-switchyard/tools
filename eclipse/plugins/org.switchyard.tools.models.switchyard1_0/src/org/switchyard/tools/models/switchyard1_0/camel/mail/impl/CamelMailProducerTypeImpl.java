/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mail.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Mail Producer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailProducerTypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailProducerTypeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailProducerTypeImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailProducerTypeImpl#getCC <em>CC</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailProducerTypeImpl#getBCC <em>BCC</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailProducerTypeImpl#getReplyTo <em>Reply To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelMailProducerTypeImpl extends EObjectImpl implements CamelMailProducerType {
    /**
     * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubject()
     * @generated
     * @ordered
     */
    protected static final String SUBJECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubject()
     * @generated
     * @ordered
     */
    protected String subject = SUBJECT_EDEFAULT;

    /**
     * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected static final String FROM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected String from = FROM_EDEFAULT;

    /**
     * The default value of the '{@link #getTo() <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected static final String TO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected String to = TO_EDEFAULT;

    /**
     * The default value of the '{@link #getCC() <em>CC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCC()
     * @generated
     * @ordered
     */
    protected static final String CC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCC() <em>CC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCC()
     * @generated
     * @ordered
     */
    protected String cC = CC_EDEFAULT;

    /**
     * The default value of the '{@link #getBCC() <em>BCC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBCC()
     * @generated
     * @ordered
     */
    protected static final String BCC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBCC() <em>BCC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBCC()
     * @generated
     * @ordered
     */
    protected String bCC = BCC_EDEFAULT;

    /**
     * The default value of the '{@link #getReplyTo() <em>Reply To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReplyTo()
     * @generated
     * @ordered
     */
    protected static final String REPLY_TO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReplyTo() <em>Reply To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReplyTo()
     * @generated
     * @ordered
     */
    protected String replyTo = REPLY_TO_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelMailProducerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MailPackage.Literals.CAMEL_MAIL_PRODUCER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSubject() {
        return subject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubject(String newSubject) {
        String oldSubject = subject;
        subject = newSubject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_PRODUCER_TYPE__SUBJECT, oldSubject, subject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFrom() {
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFrom(String newFrom) {
        String oldFrom = from;
        from = newFrom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_PRODUCER_TYPE__FROM, oldFrom, from));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTo() {
        return to;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTo(String newTo) {
        String oldTo = to;
        to = newTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_PRODUCER_TYPE__TO, oldTo, to));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCC() {
        return cC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCC(String newCC) {
        String oldCC = cC;
        cC = newCC;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_PRODUCER_TYPE__CC, oldCC, cC));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBCC() {
        return bCC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBCC(String newBCC) {
        String oldBCC = bCC;
        bCC = newBCC;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_PRODUCER_TYPE__BCC, oldBCC, bCC));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReplyTo(String newReplyTo) {
        String oldReplyTo = replyTo;
        replyTo = newReplyTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_PRODUCER_TYPE__REPLY_TO, oldReplyTo, replyTo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__SUBJECT:
                return getSubject();
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__FROM:
                return getFrom();
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__TO:
                return getTo();
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__CC:
                return getCC();
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__BCC:
                return getBCC();
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__REPLY_TO:
                return getReplyTo();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__SUBJECT:
                setSubject((String)newValue);
                return;
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__FROM:
                setFrom((String)newValue);
                return;
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__TO:
                setTo((String)newValue);
                return;
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__CC:
                setCC((String)newValue);
                return;
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__BCC:
                setBCC((String)newValue);
                return;
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__REPLY_TO:
                setReplyTo((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__SUBJECT:
                setSubject(SUBJECT_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__FROM:
                setFrom(FROM_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__TO:
                setTo(TO_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__CC:
                setCC(CC_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__BCC:
                setBCC(BCC_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__REPLY_TO:
                setReplyTo(REPLY_TO_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__SUBJECT:
                return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__FROM:
                return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__TO:
                return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__CC:
                return CC_EDEFAULT == null ? cC != null : !CC_EDEFAULT.equals(cC);
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__BCC:
                return BCC_EDEFAULT == null ? bCC != null : !BCC_EDEFAULT.equals(bCC);
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__REPLY_TO:
                return REPLY_TO_EDEFAULT == null ? replyTo != null : !REPLY_TO_EDEFAULT.equals(replyTo);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (subject: ");
        result.append(subject);
        result.append(", from: ");
        result.append(from);
        result.append(", to: ");
        result.append(to);
        result.append(", cC: ");
        result.append(cC);
        result.append(", bCC: ");
        result.append(bCC);
        result.append(", replyTo: ");
        result.append(replyTo);
        result.append(')');
        return result.toString();
    }

} //CamelMailProducerTypeImpl
