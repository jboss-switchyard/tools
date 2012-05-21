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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.TokenizerExpressionImpl#getEndToken <em>End Token</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.TokenizerExpressionImpl#getHeaderName <em>Header Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.TokenizerExpressionImpl#isIncludeTokens <em>Include Tokens</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.TokenizerExpressionImpl#getInheritNamespaceTagName <em>Inherit Namespace Tag Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.TokenizerExpressionImpl#isRegex <em>Regex</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.TokenizerExpressionImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.TokenizerExpressionImpl#isXml <em>Xml</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenizerExpressionImpl extends ExpressionImpl implements TokenizerExpression {
	/**
     * The default value of the '{@link #getEndToken() <em>End Token</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndToken()
     * @generated
     * @ordered
     */
    protected static final String END_TOKEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndToken() <em>End Token</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndToken()
     * @generated
     * @ordered
     */
    protected String endToken = END_TOKEN_EDEFAULT;

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
     * The default value of the '{@link #isIncludeTokens() <em>Include Tokens</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIncludeTokens()
     * @generated
     * @ordered
     */
    protected static final boolean INCLUDE_TOKENS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIncludeTokens() <em>Include Tokens</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIncludeTokens()
     * @generated
     * @ordered
     */
    protected boolean includeTokens = INCLUDE_TOKENS_EDEFAULT;

    /**
     * This is true if the Include Tokens attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean includeTokensESet;

    /**
     * The default value of the '{@link #getInheritNamespaceTagName() <em>Inherit Namespace Tag Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInheritNamespaceTagName()
     * @generated
     * @ordered
     */
    protected static final String INHERIT_NAMESPACE_TAG_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInheritNamespaceTagName() <em>Inherit Namespace Tag Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInheritNamespaceTagName()
     * @generated
     * @ordered
     */
    protected String inheritNamespaceTagName = INHERIT_NAMESPACE_TAG_NAME_EDEFAULT;

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
     * The default value of the '{@link #isXml() <em>Xml</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isXml()
     * @generated
     * @ordered
     */
    protected static final boolean XML_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isXml() <em>Xml</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isXml()
     * @generated
     * @ordered
     */
    protected boolean xml = XML_EDEFAULT;

    /**
     * This is true if the Xml attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xmlESet;

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
    public String getEndToken() {
        return endToken;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndToken(String newEndToken) {
        String oldEndToken = endToken;
        endToken = newEndToken;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.TOKENIZER_EXPRESSION__END_TOKEN, oldEndToken, endToken));
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
    public boolean isIncludeTokens() {
        return includeTokens;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIncludeTokens(boolean newIncludeTokens) {
        boolean oldIncludeTokens = includeTokens;
        includeTokens = newIncludeTokens;
        boolean oldIncludeTokensESet = includeTokensESet;
        includeTokensESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.TOKENIZER_EXPRESSION__INCLUDE_TOKENS, oldIncludeTokens, includeTokens, !oldIncludeTokensESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIncludeTokens() {
        boolean oldIncludeTokens = includeTokens;
        boolean oldIncludeTokensESet = includeTokensESet;
        includeTokens = INCLUDE_TOKENS_EDEFAULT;
        includeTokensESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.TOKENIZER_EXPRESSION__INCLUDE_TOKENS, oldIncludeTokens, INCLUDE_TOKENS_EDEFAULT, oldIncludeTokensESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIncludeTokens() {
        return includeTokensESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInheritNamespaceTagName() {
        return inheritNamespaceTagName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInheritNamespaceTagName(String newInheritNamespaceTagName) {
        String oldInheritNamespaceTagName = inheritNamespaceTagName;
        inheritNamespaceTagName = newInheritNamespaceTagName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.TOKENIZER_EXPRESSION__INHERIT_NAMESPACE_TAG_NAME, oldInheritNamespaceTagName, inheritNamespaceTagName));
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
    public boolean isXml() {
        return xml;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXml(boolean newXml) {
        boolean oldXml = xml;
        xml = newXml;
        boolean oldXmlESet = xmlESet;
        xmlESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.TOKENIZER_EXPRESSION__XML, oldXml, xml, !oldXmlESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetXml() {
        boolean oldXml = xml;
        boolean oldXmlESet = xmlESet;
        xml = XML_EDEFAULT;
        xmlESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.TOKENIZER_EXPRESSION__XML, oldXml, XML_EDEFAULT, oldXmlESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetXml() {
        return xmlESet;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.TOKENIZER_EXPRESSION__END_TOKEN:
                return getEndToken();
            case SpringPackage.TOKENIZER_EXPRESSION__HEADER_NAME:
                return getHeaderName();
            case SpringPackage.TOKENIZER_EXPRESSION__INCLUDE_TOKENS:
                return isIncludeTokens();
            case SpringPackage.TOKENIZER_EXPRESSION__INHERIT_NAMESPACE_TAG_NAME:
                return getInheritNamespaceTagName();
            case SpringPackage.TOKENIZER_EXPRESSION__REGEX:
                return isRegex();
            case SpringPackage.TOKENIZER_EXPRESSION__TOKEN:
                return getToken();
            case SpringPackage.TOKENIZER_EXPRESSION__XML:
                return isXml();
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
            case SpringPackage.TOKENIZER_EXPRESSION__END_TOKEN:
                setEndToken((String)newValue);
                return;
            case SpringPackage.TOKENIZER_EXPRESSION__HEADER_NAME:
                setHeaderName((String)newValue);
                return;
            case SpringPackage.TOKENIZER_EXPRESSION__INCLUDE_TOKENS:
                setIncludeTokens((Boolean)newValue);
                return;
            case SpringPackage.TOKENIZER_EXPRESSION__INHERIT_NAMESPACE_TAG_NAME:
                setInheritNamespaceTagName((String)newValue);
                return;
            case SpringPackage.TOKENIZER_EXPRESSION__REGEX:
                setRegex((Boolean)newValue);
                return;
            case SpringPackage.TOKENIZER_EXPRESSION__TOKEN:
                setToken((String)newValue);
                return;
            case SpringPackage.TOKENIZER_EXPRESSION__XML:
                setXml((Boolean)newValue);
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
            case SpringPackage.TOKENIZER_EXPRESSION__END_TOKEN:
                setEndToken(END_TOKEN_EDEFAULT);
                return;
            case SpringPackage.TOKENIZER_EXPRESSION__HEADER_NAME:
                setHeaderName(HEADER_NAME_EDEFAULT);
                return;
            case SpringPackage.TOKENIZER_EXPRESSION__INCLUDE_TOKENS:
                unsetIncludeTokens();
                return;
            case SpringPackage.TOKENIZER_EXPRESSION__INHERIT_NAMESPACE_TAG_NAME:
                setInheritNamespaceTagName(INHERIT_NAMESPACE_TAG_NAME_EDEFAULT);
                return;
            case SpringPackage.TOKENIZER_EXPRESSION__REGEX:
                unsetRegex();
                return;
            case SpringPackage.TOKENIZER_EXPRESSION__TOKEN:
                setToken(TOKEN_EDEFAULT);
                return;
            case SpringPackage.TOKENIZER_EXPRESSION__XML:
                unsetXml();
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
            case SpringPackage.TOKENIZER_EXPRESSION__END_TOKEN:
                return END_TOKEN_EDEFAULT == null ? endToken != null : !END_TOKEN_EDEFAULT.equals(endToken);
            case SpringPackage.TOKENIZER_EXPRESSION__HEADER_NAME:
                return HEADER_NAME_EDEFAULT == null ? headerName != null : !HEADER_NAME_EDEFAULT.equals(headerName);
            case SpringPackage.TOKENIZER_EXPRESSION__INCLUDE_TOKENS:
                return isSetIncludeTokens();
            case SpringPackage.TOKENIZER_EXPRESSION__INHERIT_NAMESPACE_TAG_NAME:
                return INHERIT_NAMESPACE_TAG_NAME_EDEFAULT == null ? inheritNamespaceTagName != null : !INHERIT_NAMESPACE_TAG_NAME_EDEFAULT.equals(inheritNamespaceTagName);
            case SpringPackage.TOKENIZER_EXPRESSION__REGEX:
                return isSetRegex();
            case SpringPackage.TOKENIZER_EXPRESSION__TOKEN:
                return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
            case SpringPackage.TOKENIZER_EXPRESSION__XML:
                return isSetXml();
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
        result.append(" (endToken: ");
        result.append(endToken);
        result.append(", headerName: ");
        result.append(headerName);
        result.append(", includeTokens: ");
        if (includeTokensESet) result.append(includeTokens); else result.append("<unset>");
        result.append(", inheritNamespaceTagName: ");
        result.append(inheritNamespaceTagName);
        result.append(", regex: ");
        if (regexESet) result.append(regex); else result.append("<unset>");
        result.append(", token: ");
        result.append(token);
        result.append(", xml: ");
        if (xmlESet) result.append(xml); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TokenizerExpressionImpl
