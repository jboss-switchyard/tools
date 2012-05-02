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
import org.switchyard.tools.models.switchyard1_0.spring.TokenizerExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tokenizer Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.TokenizerExpressionImpl#getHeaderName <em>Header Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.TokenizerExpressionImpl#isRegex <em>Regex</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.TokenizerExpressionImpl#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenizerExpressionImpl extends ExpressionImpl implements TokenizerExpression {
	/**
	 * The default value of the '{@link #getHeaderName() <em>Header Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderName()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderName() <em>Header Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderName()
	 * @generated
	 * @ordered
	 */
	protected String headerName = HEADER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegex()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGEX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegex()
	 * @generated
	 * @ordered
	 */
	protected boolean regex = REGEX_EDEFAULT;

	/**
	 * This is true if the Regex attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean regexESet;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenizerExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getTokenizerExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeaderName() {
		return headerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderName(String newHeaderName) {
		String oldHeaderName = headerName;
		headerName = newHeaderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.TOKENIZER_EXPRESSION__HEADER_NAME, oldHeaderName, headerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRegex() {
		return regex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegex(boolean newRegex) {
		boolean oldRegex = regex;
		regex = newRegex;
		boolean oldRegexESet = regexESet;
		regexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.TOKENIZER_EXPRESSION__REGEX, oldRegex, regex, !oldRegexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRegex() {
		boolean oldRegex = regex;
		boolean oldRegexESet = regexESet;
		regex = REGEX_EDEFAULT;
		regexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.TOKENIZER_EXPRESSION__REGEX, oldRegex, REGEX_EDEFAULT, oldRegexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRegex() {
		return regexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.TOKENIZER_EXPRESSION__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringPackage.TOKENIZER_EXPRESSION__HEADER_NAME:
				return getHeaderName();
			case SpringPackage.TOKENIZER_EXPRESSION__REGEX:
				return isRegex();
			case SpringPackage.TOKENIZER_EXPRESSION__TOKEN:
				return getToken();
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
			case SpringPackage.TOKENIZER_EXPRESSION__HEADER_NAME:
				setHeaderName((String)newValue);
				return;
			case SpringPackage.TOKENIZER_EXPRESSION__REGEX:
				setRegex((Boolean)newValue);
				return;
			case SpringPackage.TOKENIZER_EXPRESSION__TOKEN:
				setToken((String)newValue);
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
			case SpringPackage.TOKENIZER_EXPRESSION__HEADER_NAME:
				setHeaderName(HEADER_NAME_EDEFAULT);
				return;
			case SpringPackage.TOKENIZER_EXPRESSION__REGEX:
				unsetRegex();
				return;
			case SpringPackage.TOKENIZER_EXPRESSION__TOKEN:
				setToken(TOKEN_EDEFAULT);
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
			case SpringPackage.TOKENIZER_EXPRESSION__HEADER_NAME:
				return HEADER_NAME_EDEFAULT == null ? headerName != null : !HEADER_NAME_EDEFAULT.equals(headerName);
			case SpringPackage.TOKENIZER_EXPRESSION__REGEX:
				return isSetRegex();
			case SpringPackage.TOKENIZER_EXPRESSION__TOKEN:
				return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
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
		result.append(" (headerName: ");
		result.append(headerName);
		result.append(", regex: ");
		if (regexESet) result.append(regex); else result.append("<unset>");
		result.append(", token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} //TokenizerExpressionImpl
