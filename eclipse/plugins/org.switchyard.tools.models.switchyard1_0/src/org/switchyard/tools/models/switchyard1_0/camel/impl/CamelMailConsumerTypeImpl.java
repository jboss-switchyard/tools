/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.MailConsumerAccountType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mail Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelMailConsumerTypeImpl#getFolderName <em>Folder Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelMailConsumerTypeImpl#getFetchSize <em>Fetch Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelMailConsumerTypeImpl#getUnseen <em>Unseen</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelMailConsumerTypeImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelMailConsumerTypeImpl#getCopyTo <em>Copy To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelMailConsumerTypeImpl#getDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelMailConsumerTypeImpl#getAccountType <em>Account Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelMailConsumerTypeImpl extends ScheduledBatchPollConsumerTypeImpl implements CamelMailConsumerType {
    /**
     * The default value of the '{@link #getFolderName() <em>Folder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFolderName()
     * @generated
     * @ordered
     */
    protected static final String FOLDER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFolderName() <em>Folder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFolderName()
     * @generated
     * @ordered
     */
    protected String folderName = FOLDER_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFetchSize() <em>Fetch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFetchSize()
     * @generated
     * @ordered
     */
    protected static final Integer FETCH_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFetchSize() <em>Fetch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFetchSize()
     * @generated
     * @ordered
     */
    protected Integer fetchSize = FETCH_SIZE_EDEFAULT;

    /**
     * This is true if the Fetch Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fetchSizeESet;

    /**
     * The default value of the '{@link #getUnseen() <em>Unseen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnseen()
     * @generated
     * @ordered
     */
    protected static final Boolean UNSEEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUnseen() <em>Unseen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnseen()
     * @generated
     * @ordered
     */
    protected Boolean unseen = UNSEEN_EDEFAULT;

    /**
     * This is true if the Unseen attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unseenESet;

    /**
     * The default value of the '{@link #getDelete() <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelete()
     * @generated
     * @ordered
     */
    protected static final Boolean DELETE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDelete() <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelete()
     * @generated
     * @ordered
     */
    protected Boolean delete = DELETE_EDEFAULT;

    /**
     * This is true if the Delete attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean deleteESet;

    /**
     * The default value of the '{@link #getCopyTo() <em>Copy To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCopyTo()
     * @generated
     * @ordered
     */
    protected static final String COPY_TO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCopyTo() <em>Copy To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCopyTo()
     * @generated
     * @ordered
     */
    protected String copyTo = COPY_TO_EDEFAULT;

    /**
     * The default value of the '{@link #getDisconnect() <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisconnect()
     * @generated
     * @ordered
     */
    protected static final Boolean DISCONNECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDisconnect() <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisconnect()
     * @generated
     * @ordered
     */
    protected Boolean disconnect = DISCONNECT_EDEFAULT;

    /**
     * This is true if the Disconnect attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean disconnectESet;

    /**
     * The default value of the '{@link #getAccountType() <em>Account Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccountType()
     * @generated
     * @ordered
     */
    protected static final MailConsumerAccountType ACCOUNT_TYPE_EDEFAULT = MailConsumerAccountType.IMAP;

    /**
     * The cached value of the '{@link #getAccountType() <em>Account Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccountType()
     * @generated
     * @ordered
     */
    protected MailConsumerAccountType accountType = ACCOUNT_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelMailConsumerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CamelPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFolderName(String newFolderName) {
        String oldFolderName = folderName;
        folderName = newFolderName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME, oldFolderName, folderName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getFetchSize() {
        return fetchSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFetchSize(Integer newFetchSize) {
        Integer oldFetchSize = fetchSize;
        fetchSize = newFetchSize;
        boolean oldFetchSizeESet = fetchSizeESet;
        fetchSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE, oldFetchSize, fetchSize, !oldFetchSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFetchSize() {
        Integer oldFetchSize = fetchSize;
        boolean oldFetchSizeESet = fetchSizeESet;
        fetchSize = FETCH_SIZE_EDEFAULT;
        fetchSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE, oldFetchSize, FETCH_SIZE_EDEFAULT, oldFetchSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFetchSize() {
        return fetchSizeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getUnseen() {
        return unseen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnseen(Boolean newUnseen) {
        Boolean oldUnseen = unseen;
        unseen = newUnseen;
        boolean oldUnseenESet = unseenESet;
        unseenESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN, oldUnseen, unseen, !oldUnseenESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUnseen() {
        Boolean oldUnseen = unseen;
        boolean oldUnseenESet = unseenESet;
        unseen = UNSEEN_EDEFAULT;
        unseenESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN, oldUnseen, UNSEEN_EDEFAULT, oldUnseenESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUnseen() {
        return unseenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getDelete() {
        return delete;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelete(Boolean newDelete) {
        Boolean oldDelete = delete;
        delete = newDelete;
        boolean oldDeleteESet = deleteESet;
        deleteESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__DELETE, oldDelete, delete, !oldDeleteESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDelete() {
        Boolean oldDelete = delete;
        boolean oldDeleteESet = deleteESet;
        delete = DELETE_EDEFAULT;
        deleteESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__DELETE, oldDelete, DELETE_EDEFAULT, oldDeleteESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDelete() {
        return deleteESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCopyTo() {
        return copyTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCopyTo(String newCopyTo) {
        String oldCopyTo = copyTo;
        copyTo = newCopyTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__COPY_TO, oldCopyTo, copyTo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getDisconnect() {
        return disconnect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisconnect(Boolean newDisconnect) {
        Boolean oldDisconnect = disconnect;
        disconnect = newDisconnect;
        boolean oldDisconnectESet = disconnectESet;
        disconnectESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT, oldDisconnect, disconnect, !oldDisconnectESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDisconnect() {
        Boolean oldDisconnect = disconnect;
        boolean oldDisconnectESet = disconnectESet;
        disconnect = DISCONNECT_EDEFAULT;
        disconnectESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT, oldDisconnect, DISCONNECT_EDEFAULT, oldDisconnectESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDisconnect() {
        return disconnectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MailConsumerAccountType getAccountType() {
        return accountType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAccountType(MailConsumerAccountType newAccountType) {
        MailConsumerAccountType oldAccountType = accountType;
        accountType = newAccountType == null ? ACCOUNT_TYPE_EDEFAULT : newAccountType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE, oldAccountType, accountType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME:
                return getFolderName();
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE:
                return getFetchSize();
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN:
                return getUnseen();
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__DELETE:
                return getDelete();
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__COPY_TO:
                return getCopyTo();
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT:
                return getDisconnect();
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE:
                return getAccountType();
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
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME:
                setFolderName((String)newValue);
                return;
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE:
                setFetchSize((Integer)newValue);
                return;
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN:
                setUnseen((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__DELETE:
                setDelete((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__COPY_TO:
                setCopyTo((String)newValue);
                return;
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT:
                setDisconnect((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE:
                setAccountType((MailConsumerAccountType)newValue);
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
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME:
                setFolderName(FOLDER_NAME_EDEFAULT);
                return;
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE:
                unsetFetchSize();
                return;
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN:
                unsetUnseen();
                return;
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__DELETE:
                unsetDelete();
                return;
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__COPY_TO:
                setCopyTo(COPY_TO_EDEFAULT);
                return;
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT:
                unsetDisconnect();
                return;
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE:
                setAccountType(ACCOUNT_TYPE_EDEFAULT);
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
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME:
                return FOLDER_NAME_EDEFAULT == null ? folderName != null : !FOLDER_NAME_EDEFAULT.equals(folderName);
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE:
                return isSetFetchSize();
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN:
                return isSetUnseen();
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__DELETE:
                return isSetDelete();
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__COPY_TO:
                return COPY_TO_EDEFAULT == null ? copyTo != null : !COPY_TO_EDEFAULT.equals(copyTo);
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT:
                return isSetDisconnect();
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE:
                return accountType != ACCOUNT_TYPE_EDEFAULT;
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
        result.append(" (folderName: ");
        result.append(folderName);
        result.append(", fetchSize: ");
        if (fetchSizeESet) result.append(fetchSize); else result.append("<unset>");
        result.append(", unseen: ");
        if (unseenESet) result.append(unseen); else result.append("<unset>");
        result.append(", delete: ");
        if (deleteESet) result.append(delete); else result.append("<unset>");
        result.append(", copyTo: ");
        result.append(copyTo);
        result.append(", disconnect: ");
        if (disconnectESet) result.append(disconnect); else result.append("<unset>");
        result.append(", accountType: ");
        result.append(accountType);
        result.append(')');
        return result.toString();
    }

} //CamelMailConsumerTypeImpl
