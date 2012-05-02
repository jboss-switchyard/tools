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

import org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crypto Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CryptoDataFormatImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CryptoDataFormatImpl#getAlgorithmParameterRef <em>Algorithm Parameter Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CryptoDataFormatImpl#getBuffersize <em>Buffersize</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CryptoDataFormatImpl#getCryptoProvider <em>Crypto Provider</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CryptoDataFormatImpl#getInitVectorRef <em>Init Vector Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CryptoDataFormatImpl#isInline <em>Inline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CryptoDataFormatImpl#getKeyRef <em>Key Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CryptoDataFormatImpl#getMacAlgorithm <em>Mac Algorithm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CryptoDataFormatImpl#isShouldAppendHMAC <em>Should Append HMAC</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CryptoDataFormatImpl extends DataFormatImpl implements CryptoDataFormat {
	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithmParameterRef() <em>Algorithm Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmParameterRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_PARAMETER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithmParameterRef() <em>Algorithm Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmParameterRef()
	 * @generated
	 * @ordered
	 */
	protected String algorithmParameterRef = ALGORITHM_PARAMETER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuffersize() <em>Buffersize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffersize()
	 * @generated
	 * @ordered
	 */
	protected static final int BUFFERSIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBuffersize() <em>Buffersize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffersize()
	 * @generated
	 * @ordered
	 */
	protected int buffersize = BUFFERSIZE_EDEFAULT;

	/**
	 * This is true if the Buffersize attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean buffersizeESet;

	/**
	 * The default value of the '{@link #getCryptoProvider() <em>Crypto Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCryptoProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String CRYPTO_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCryptoProvider() <em>Crypto Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCryptoProvider()
	 * @generated
	 * @ordered
	 */
	protected String cryptoProvider = CRYPTO_PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitVectorRef() <em>Init Vector Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitVectorRef()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_VECTOR_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitVectorRef() <em>Init Vector Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitVectorRef()
	 * @generated
	 * @ordered
	 */
	protected String initVectorRef = INIT_VECTOR_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isInline() <em>Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInline() <em>Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInline()
	 * @generated
	 * @ordered
	 */
	protected boolean inline = INLINE_EDEFAULT;

	/**
	 * This is true if the Inline attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inlineESet;

	/**
	 * The default value of the '{@link #getKeyRef() <em>Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyRef() <em>Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyRef()
	 * @generated
	 * @ordered
	 */
	protected String keyRef = KEY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMacAlgorithm() <em>Mac Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMacAlgorithm() <em>Mac Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String macAlgorithm = MAC_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #isShouldAppendHMAC() <em>Should Append HMAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShouldAppendHMAC()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOULD_APPEND_HMAC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShouldAppendHMAC() <em>Should Append HMAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShouldAppendHMAC()
	 * @generated
	 * @ordered
	 */
	protected boolean shouldAppendHMAC = SHOULD_APPEND_HMAC_EDEFAULT;

	/**
	 * This is true if the Should Append HMAC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shouldAppendHMACESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CryptoDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getCryptoDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithmParameterRef() {
		return algorithmParameterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmParameterRef(String newAlgorithmParameterRef) {
		String oldAlgorithmParameterRef = algorithmParameterRef;
		algorithmParameterRef = newAlgorithmParameterRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM_PARAMETER_REF, oldAlgorithmParameterRef, algorithmParameterRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBuffersize() {
		return buffersize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffersize(int newBuffersize) {
		int oldBuffersize = buffersize;
		buffersize = newBuffersize;
		boolean oldBuffersizeESet = buffersizeESet;
		buffersizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CRYPTO_DATA_FORMAT__BUFFERSIZE, oldBuffersize, buffersize, !oldBuffersizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBuffersize() {
		int oldBuffersize = buffersize;
		boolean oldBuffersizeESet = buffersizeESet;
		buffersize = BUFFERSIZE_EDEFAULT;
		buffersizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.CRYPTO_DATA_FORMAT__BUFFERSIZE, oldBuffersize, BUFFERSIZE_EDEFAULT, oldBuffersizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBuffersize() {
		return buffersizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCryptoProvider() {
		return cryptoProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCryptoProvider(String newCryptoProvider) {
		String oldCryptoProvider = cryptoProvider;
		cryptoProvider = newCryptoProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CRYPTO_DATA_FORMAT__CRYPTO_PROVIDER, oldCryptoProvider, cryptoProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitVectorRef() {
		return initVectorRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitVectorRef(String newInitVectorRef) {
		String oldInitVectorRef = initVectorRef;
		initVectorRef = newInitVectorRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CRYPTO_DATA_FORMAT__INIT_VECTOR_REF, oldInitVectorRef, initVectorRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInline() {
		return inline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInline(boolean newInline) {
		boolean oldInline = inline;
		inline = newInline;
		boolean oldInlineESet = inlineESet;
		inlineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CRYPTO_DATA_FORMAT__INLINE, oldInline, inline, !oldInlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInline() {
		boolean oldInline = inline;
		boolean oldInlineESet = inlineESet;
		inline = INLINE_EDEFAULT;
		inlineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.CRYPTO_DATA_FORMAT__INLINE, oldInline, INLINE_EDEFAULT, oldInlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInline() {
		return inlineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyRef() {
		return keyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyRef(String newKeyRef) {
		String oldKeyRef = keyRef;
		keyRef = newKeyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CRYPTO_DATA_FORMAT__KEY_REF, oldKeyRef, keyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMacAlgorithm() {
		return macAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacAlgorithm(String newMacAlgorithm) {
		String oldMacAlgorithm = macAlgorithm;
		macAlgorithm = newMacAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CRYPTO_DATA_FORMAT__MAC_ALGORITHM, oldMacAlgorithm, macAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShouldAppendHMAC() {
		return shouldAppendHMAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShouldAppendHMAC(boolean newShouldAppendHMAC) {
		boolean oldShouldAppendHMAC = shouldAppendHMAC;
		shouldAppendHMAC = newShouldAppendHMAC;
		boolean oldShouldAppendHMACESet = shouldAppendHMACESet;
		shouldAppendHMACESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CRYPTO_DATA_FORMAT__SHOULD_APPEND_HMAC, oldShouldAppendHMAC, shouldAppendHMAC, !oldShouldAppendHMACESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShouldAppendHMAC() {
		boolean oldShouldAppendHMAC = shouldAppendHMAC;
		boolean oldShouldAppendHMACESet = shouldAppendHMACESet;
		shouldAppendHMAC = SHOULD_APPEND_HMAC_EDEFAULT;
		shouldAppendHMACESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.CRYPTO_DATA_FORMAT__SHOULD_APPEND_HMAC, oldShouldAppendHMAC, SHOULD_APPEND_HMAC_EDEFAULT, oldShouldAppendHMACESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShouldAppendHMAC() {
		return shouldAppendHMACESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM:
				return getAlgorithm();
			case SpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM_PARAMETER_REF:
				return getAlgorithmParameterRef();
			case SpringPackage.CRYPTO_DATA_FORMAT__BUFFERSIZE:
				return getBuffersize();
			case SpringPackage.CRYPTO_DATA_FORMAT__CRYPTO_PROVIDER:
				return getCryptoProvider();
			case SpringPackage.CRYPTO_DATA_FORMAT__INIT_VECTOR_REF:
				return getInitVectorRef();
			case SpringPackage.CRYPTO_DATA_FORMAT__INLINE:
				return isInline();
			case SpringPackage.CRYPTO_DATA_FORMAT__KEY_REF:
				return getKeyRef();
			case SpringPackage.CRYPTO_DATA_FORMAT__MAC_ALGORITHM:
				return getMacAlgorithm();
			case SpringPackage.CRYPTO_DATA_FORMAT__SHOULD_APPEND_HMAC:
				return isShouldAppendHMAC();
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
			case SpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM_PARAMETER_REF:
				setAlgorithmParameterRef((String)newValue);
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__BUFFERSIZE:
				setBuffersize((Integer)newValue);
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__CRYPTO_PROVIDER:
				setCryptoProvider((String)newValue);
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__INIT_VECTOR_REF:
				setInitVectorRef((String)newValue);
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__INLINE:
				setInline((Boolean)newValue);
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__KEY_REF:
				setKeyRef((String)newValue);
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__MAC_ALGORITHM:
				setMacAlgorithm((String)newValue);
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__SHOULD_APPEND_HMAC:
				setShouldAppendHMAC((Boolean)newValue);
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
			case SpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM_PARAMETER_REF:
				setAlgorithmParameterRef(ALGORITHM_PARAMETER_REF_EDEFAULT);
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__BUFFERSIZE:
				unsetBuffersize();
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__CRYPTO_PROVIDER:
				setCryptoProvider(CRYPTO_PROVIDER_EDEFAULT);
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__INIT_VECTOR_REF:
				setInitVectorRef(INIT_VECTOR_REF_EDEFAULT);
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__INLINE:
				unsetInline();
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__KEY_REF:
				setKeyRef(KEY_REF_EDEFAULT);
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__MAC_ALGORITHM:
				setMacAlgorithm(MAC_ALGORITHM_EDEFAULT);
				return;
			case SpringPackage.CRYPTO_DATA_FORMAT__SHOULD_APPEND_HMAC:
				unsetShouldAppendHMAC();
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
			case SpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case SpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM_PARAMETER_REF:
				return ALGORITHM_PARAMETER_REF_EDEFAULT == null ? algorithmParameterRef != null : !ALGORITHM_PARAMETER_REF_EDEFAULT.equals(algorithmParameterRef);
			case SpringPackage.CRYPTO_DATA_FORMAT__BUFFERSIZE:
				return isSetBuffersize();
			case SpringPackage.CRYPTO_DATA_FORMAT__CRYPTO_PROVIDER:
				return CRYPTO_PROVIDER_EDEFAULT == null ? cryptoProvider != null : !CRYPTO_PROVIDER_EDEFAULT.equals(cryptoProvider);
			case SpringPackage.CRYPTO_DATA_FORMAT__INIT_VECTOR_REF:
				return INIT_VECTOR_REF_EDEFAULT == null ? initVectorRef != null : !INIT_VECTOR_REF_EDEFAULT.equals(initVectorRef);
			case SpringPackage.CRYPTO_DATA_FORMAT__INLINE:
				return isSetInline();
			case SpringPackage.CRYPTO_DATA_FORMAT__KEY_REF:
				return KEY_REF_EDEFAULT == null ? keyRef != null : !KEY_REF_EDEFAULT.equals(keyRef);
			case SpringPackage.CRYPTO_DATA_FORMAT__MAC_ALGORITHM:
				return MAC_ALGORITHM_EDEFAULT == null ? macAlgorithm != null : !MAC_ALGORITHM_EDEFAULT.equals(macAlgorithm);
			case SpringPackage.CRYPTO_DATA_FORMAT__SHOULD_APPEND_HMAC:
				return isSetShouldAppendHMAC();
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
		result.append(" (algorithm: ");
		result.append(algorithm);
		result.append(", algorithmParameterRef: ");
		result.append(algorithmParameterRef);
		result.append(", buffersize: ");
		if (buffersizeESet) result.append(buffersize); else result.append("<unset>");
		result.append(", cryptoProvider: ");
		result.append(cryptoProvider);
		result.append(", initVectorRef: ");
		result.append(initVectorRef);
		result.append(", inline: ");
		if (inlineESet) result.append(inline); else result.append("<unset>");
		result.append(", keyRef: ");
		result.append(keyRef);
		result.append(", macAlgorithm: ");
		result.append(macAlgorithm);
		result.append(", shouldAppendHMAC: ");
		if (shouldAppendHMACESet) result.append(shouldAppendHMAC); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CryptoDataFormatImpl
