/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Security Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XmlSecurityDataFormatImpl#getKeyCipherAlgorithm <em>Key Cipher Algorithm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XmlSecurityDataFormatImpl#getKeyOrTrustStoreParametersId <em>Key Or Trust Store Parameters Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XmlSecurityDataFormatImpl#getPassPhrase <em>Pass Phrase</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XmlSecurityDataFormatImpl#getRecipientKeyAlias <em>Recipient Key Alias</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XmlSecurityDataFormatImpl#getSecureTag <em>Secure Tag</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XmlSecurityDataFormatImpl#isSecureTagContents <em>Secure Tag Contents</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XmlSecurityDataFormatImpl#getXmlCipherAlgorithm <em>Xml Cipher Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XmlSecurityDataFormatImpl extends DataFormatImpl implements XmlSecurityDataFormat {
	/**
     * The default value of the '{@link #getKeyCipherAlgorithm() <em>Key Cipher Algorithm</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKeyCipherAlgorithm()
     * @generated
     * @ordered
     */
	protected static final String KEY_CIPHER_ALGORITHM_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getKeyCipherAlgorithm() <em>Key Cipher Algorithm</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKeyCipherAlgorithm()
     * @generated
     * @ordered
     */
	protected String keyCipherAlgorithm = KEY_CIPHER_ALGORITHM_EDEFAULT;

	/**
     * The default value of the '{@link #getKeyOrTrustStoreParametersId() <em>Key Or Trust Store Parameters Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeyOrTrustStoreParametersId()
     * @generated
     * @ordered
     */
    protected static final String KEY_OR_TRUST_STORE_PARAMETERS_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKeyOrTrustStoreParametersId() <em>Key Or Trust Store Parameters Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeyOrTrustStoreParametersId()
     * @generated
     * @ordered
     */
    protected String keyOrTrustStoreParametersId = KEY_OR_TRUST_STORE_PARAMETERS_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getPassPhrase() <em>Pass Phrase</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPassPhrase()
     * @generated
     * @ordered
     */
	protected static final String PASS_PHRASE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPassPhrase() <em>Pass Phrase</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPassPhrase()
     * @generated
     * @ordered
     */
	protected String passPhrase = PASS_PHRASE_EDEFAULT;

	/**
     * The default value of the '{@link #getRecipientKeyAlias() <em>Recipient Key Alias</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRecipientKeyAlias()
     * @generated
     * @ordered
     */
	protected static final String RECIPIENT_KEY_ALIAS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRecipientKeyAlias() <em>Recipient Key Alias</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRecipientKeyAlias()
     * @generated
     * @ordered
     */
	protected String recipientKeyAlias = RECIPIENT_KEY_ALIAS_EDEFAULT;

	/**
     * The default value of the '{@link #getSecureTag() <em>Secure Tag</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSecureTag()
     * @generated
     * @ordered
     */
	protected static final String SECURE_TAG_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSecureTag() <em>Secure Tag</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSecureTag()
     * @generated
     * @ordered
     */
	protected String secureTag = SECURE_TAG_EDEFAULT;

	/**
     * The default value of the '{@link #isSecureTagContents() <em>Secure Tag Contents</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSecureTagContents()
     * @generated
     * @ordered
     */
	protected static final boolean SECURE_TAG_CONTENTS_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isSecureTagContents() <em>Secure Tag Contents</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSecureTagContents()
     * @generated
     * @ordered
     */
	protected boolean secureTagContents = SECURE_TAG_CONTENTS_EDEFAULT;

	/**
     * This is true if the Secure Tag Contents attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean secureTagContentsESet;

	/**
     * The default value of the '{@link #getXmlCipherAlgorithm() <em>Xml Cipher Algorithm</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXmlCipherAlgorithm()
     * @generated
     * @ordered
     */
	protected static final String XML_CIPHER_ALGORITHM_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXmlCipherAlgorithm() <em>Xml Cipher Algorithm</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXmlCipherAlgorithm()
     * @generated
     * @ordered
     */
	protected String xmlCipherAlgorithm = XML_CIPHER_ALGORITHM_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected XmlSecurityDataFormatImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getXmlSecurityDataFormat();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getKeyCipherAlgorithm() {
        return keyCipherAlgorithm;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setKeyCipherAlgorithm(String newKeyCipherAlgorithm) {
        String oldKeyCipherAlgorithm = keyCipherAlgorithm;
        keyCipherAlgorithm = newKeyCipherAlgorithm;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XML_SECURITY_DATA_FORMAT__KEY_CIPHER_ALGORITHM, oldKeyCipherAlgorithm, keyCipherAlgorithm));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKeyOrTrustStoreParametersId() {
        return keyOrTrustStoreParametersId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKeyOrTrustStoreParametersId(String newKeyOrTrustStoreParametersId) {
        String oldKeyOrTrustStoreParametersId = keyOrTrustStoreParametersId;
        keyOrTrustStoreParametersId = newKeyOrTrustStoreParametersId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XML_SECURITY_DATA_FORMAT__KEY_OR_TRUST_STORE_PARAMETERS_ID, oldKeyOrTrustStoreParametersId, keyOrTrustStoreParametersId));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPassPhrase() {
        return passPhrase;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPassPhrase(String newPassPhrase) {
        String oldPassPhrase = passPhrase;
        passPhrase = newPassPhrase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE, oldPassPhrase, passPhrase));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getRecipientKeyAlias() {
        return recipientKeyAlias;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRecipientKeyAlias(String newRecipientKeyAlias) {
        String oldRecipientKeyAlias = recipientKeyAlias;
        recipientKeyAlias = newRecipientKeyAlias;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XML_SECURITY_DATA_FORMAT__RECIPIENT_KEY_ALIAS, oldRecipientKeyAlias, recipientKeyAlias));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSecureTag() {
        return secureTag;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSecureTag(String newSecureTag) {
        String oldSecureTag = secureTag;
        secureTag = newSecureTag;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG, oldSecureTag, secureTag));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSecureTagContents() {
        return secureTagContents;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSecureTagContents(boolean newSecureTagContents) {
        boolean oldSecureTagContents = secureTagContents;
        secureTagContents = newSecureTagContents;
        boolean oldSecureTagContentsESet = secureTagContentsESet;
        secureTagContentsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG_CONTENTS, oldSecureTagContents, secureTagContents, !oldSecureTagContentsESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetSecureTagContents() {
        boolean oldSecureTagContents = secureTagContents;
        boolean oldSecureTagContentsESet = secureTagContentsESet;
        secureTagContents = SECURE_TAG_CONTENTS_EDEFAULT;
        secureTagContentsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG_CONTENTS, oldSecureTagContents, SECURE_TAG_CONTENTS_EDEFAULT, oldSecureTagContentsESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetSecureTagContents() {
        return secureTagContentsESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getXmlCipherAlgorithm() {
        return xmlCipherAlgorithm;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXmlCipherAlgorithm(String newXmlCipherAlgorithm) {
        String oldXmlCipherAlgorithm = xmlCipherAlgorithm;
        xmlCipherAlgorithm = newXmlCipherAlgorithm;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XML_SECURITY_DATA_FORMAT__XML_CIPHER_ALGORITHM, oldXmlCipherAlgorithm, xmlCipherAlgorithm));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.XML_SECURITY_DATA_FORMAT__KEY_CIPHER_ALGORITHM:
                return getKeyCipherAlgorithm();
            case SpringPackage.XML_SECURITY_DATA_FORMAT__KEY_OR_TRUST_STORE_PARAMETERS_ID:
                return getKeyOrTrustStoreParametersId();
            case SpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE:
                return getPassPhrase();
            case SpringPackage.XML_SECURITY_DATA_FORMAT__RECIPIENT_KEY_ALIAS:
                return getRecipientKeyAlias();
            case SpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG:
                return getSecureTag();
            case SpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG_CONTENTS:
                return isSecureTagContents();
            case SpringPackage.XML_SECURITY_DATA_FORMAT__XML_CIPHER_ALGORITHM:
                return getXmlCipherAlgorithm();
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
            case SpringPackage.XML_SECURITY_DATA_FORMAT__KEY_CIPHER_ALGORITHM:
                setKeyCipherAlgorithm((String)newValue);
                return;
            case SpringPackage.XML_SECURITY_DATA_FORMAT__KEY_OR_TRUST_STORE_PARAMETERS_ID:
                setKeyOrTrustStoreParametersId((String)newValue);
                return;
            case SpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE:
                setPassPhrase((String)newValue);
                return;
            case SpringPackage.XML_SECURITY_DATA_FORMAT__RECIPIENT_KEY_ALIAS:
                setRecipientKeyAlias((String)newValue);
                return;
            case SpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG:
                setSecureTag((String)newValue);
                return;
            case SpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG_CONTENTS:
                setSecureTagContents((Boolean)newValue);
                return;
            case SpringPackage.XML_SECURITY_DATA_FORMAT__XML_CIPHER_ALGORITHM:
                setXmlCipherAlgorithm((String)newValue);
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
            case SpringPackage.XML_SECURITY_DATA_FORMAT__KEY_CIPHER_ALGORITHM:
                setKeyCipherAlgorithm(KEY_CIPHER_ALGORITHM_EDEFAULT);
                return;
            case SpringPackage.XML_SECURITY_DATA_FORMAT__KEY_OR_TRUST_STORE_PARAMETERS_ID:
                setKeyOrTrustStoreParametersId(KEY_OR_TRUST_STORE_PARAMETERS_ID_EDEFAULT);
                return;
            case SpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE:
                setPassPhrase(PASS_PHRASE_EDEFAULT);
                return;
            case SpringPackage.XML_SECURITY_DATA_FORMAT__RECIPIENT_KEY_ALIAS:
                setRecipientKeyAlias(RECIPIENT_KEY_ALIAS_EDEFAULT);
                return;
            case SpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG:
                setSecureTag(SECURE_TAG_EDEFAULT);
                return;
            case SpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG_CONTENTS:
                unsetSecureTagContents();
                return;
            case SpringPackage.XML_SECURITY_DATA_FORMAT__XML_CIPHER_ALGORITHM:
                setXmlCipherAlgorithm(XML_CIPHER_ALGORITHM_EDEFAULT);
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
            case SpringPackage.XML_SECURITY_DATA_FORMAT__KEY_CIPHER_ALGORITHM:
                return KEY_CIPHER_ALGORITHM_EDEFAULT == null ? keyCipherAlgorithm != null : !KEY_CIPHER_ALGORITHM_EDEFAULT.equals(keyCipherAlgorithm);
            case SpringPackage.XML_SECURITY_DATA_FORMAT__KEY_OR_TRUST_STORE_PARAMETERS_ID:
                return KEY_OR_TRUST_STORE_PARAMETERS_ID_EDEFAULT == null ? keyOrTrustStoreParametersId != null : !KEY_OR_TRUST_STORE_PARAMETERS_ID_EDEFAULT.equals(keyOrTrustStoreParametersId);
            case SpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE:
                return PASS_PHRASE_EDEFAULT == null ? passPhrase != null : !PASS_PHRASE_EDEFAULT.equals(passPhrase);
            case SpringPackage.XML_SECURITY_DATA_FORMAT__RECIPIENT_KEY_ALIAS:
                return RECIPIENT_KEY_ALIAS_EDEFAULT == null ? recipientKeyAlias != null : !RECIPIENT_KEY_ALIAS_EDEFAULT.equals(recipientKeyAlias);
            case SpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG:
                return SECURE_TAG_EDEFAULT == null ? secureTag != null : !SECURE_TAG_EDEFAULT.equals(secureTag);
            case SpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG_CONTENTS:
                return isSetSecureTagContents();
            case SpringPackage.XML_SECURITY_DATA_FORMAT__XML_CIPHER_ALGORITHM:
                return XML_CIPHER_ALGORITHM_EDEFAULT == null ? xmlCipherAlgorithm != null : !XML_CIPHER_ALGORITHM_EDEFAULT.equals(xmlCipherAlgorithm);
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
        result.append(" (keyCipherAlgorithm: ");
        result.append(keyCipherAlgorithm);
        result.append(", keyOrTrustStoreParametersId: ");
        result.append(keyOrTrustStoreParametersId);
        result.append(", passPhrase: ");
        result.append(passPhrase);
        result.append(", recipientKeyAlias: ");
        result.append(recipientKeyAlias);
        result.append(", secureTag: ");
        result.append(secureTag);
        result.append(", secureTagContents: ");
        if (secureTagContentsESet) result.append(secureTagContents); else result.append("<unset>");
        result.append(", xmlCipherAlgorithm: ");
        result.append(xmlCipherAlgorithm);
        result.append(')');
        return result.toString();
    }

} //XmlSecurityDataFormatImpl
