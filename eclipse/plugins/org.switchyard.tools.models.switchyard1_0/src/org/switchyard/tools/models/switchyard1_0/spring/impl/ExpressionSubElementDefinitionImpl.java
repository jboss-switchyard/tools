/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.spring.ConstantExpression;
import org.switchyard.tools.models.switchyard1_0.spring.ElExpression;
import org.switchyard.tools.models.switchyard1_0.spring.Expression;
import org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.GroovyExpression;
import org.switchyard.tools.models.switchyard1_0.spring.HeaderExpression;
import org.switchyard.tools.models.switchyard1_0.spring.JavaScriptExpression;
import org.switchyard.tools.models.switchyard1_0.spring.JxPathExpression;
import org.switchyard.tools.models.switchyard1_0.spring.LanguageExpression;
import org.switchyard.tools.models.switchyard1_0.spring.MethodCallExpression;
import org.switchyard.tools.models.switchyard1_0.spring.MvelExpression;
import org.switchyard.tools.models.switchyard1_0.spring.OgnlExpression;
import org.switchyard.tools.models.switchyard1_0.spring.PhpExpression;
import org.switchyard.tools.models.switchyard1_0.spring.PythonExpression;
import org.switchyard.tools.models.switchyard1_0.spring.RefExpression;
import org.switchyard.tools.models.switchyard1_0.spring.RubyExpression;
import org.switchyard.tools.models.switchyard1_0.spring.SimpleExpression;
import org.switchyard.tools.models.switchyard1_0.spring.SpELExpression;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.SqlExpression;
import org.switchyard.tools.models.switchyard1_0.spring.TokenizerExpression;
import org.switchyard.tools.models.switchyard1_0.spring.XPathExpression;
import org.switchyard.tools.models.switchyard1_0.spring.XQueryExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Sub Element Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getExpressionDefinition <em>Expression Definition</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getEl <em>El</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getGroovy <em>Groovy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getJxpath <em>Jxpath</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getJavaScript <em>Java Script</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getMvel <em>Mvel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getOgnl <em>Ognl</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getPhp <em>Php</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getPython <em>Python</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getSpel <em>Spel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getSql <em>Sql</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getTokenize <em>Tokenize</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ExpressionSubElementDefinitionImpl#getXquery <em>Xquery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionSubElementDefinitionImpl extends EObjectImpl implements ExpressionSubElementDefinition {
	/**
	 * The cached value of the '{@link #getExpressionDefinition() <em>Expression Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionDefinition()
	 * @generated
	 * @ordered
	 */
	protected Expression expressionDefinition;

	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected ConstantExpression constant;

	/**
	 * The cached value of the '{@link #getEl() <em>El</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEl()
	 * @generated
	 * @ordered
	 */
	protected ElExpression el;

	/**
	 * The cached value of the '{@link #getGroovy() <em>Groovy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroovy()
	 * @generated
	 * @ordered
	 */
	protected GroovyExpression groovy;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected HeaderExpression header;

	/**
	 * The cached value of the '{@link #getJxpath() <em>Jxpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJxpath()
	 * @generated
	 * @ordered
	 */
	protected JxPathExpression jxpath;

	/**
	 * The cached value of the '{@link #getJavaScript() <em>Java Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaScript()
	 * @generated
	 * @ordered
	 */
	protected JavaScriptExpression javaScript;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected LanguageExpression language;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected MethodCallExpression method;

	/**
	 * The cached value of the '{@link #getMvel() <em>Mvel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMvel()
	 * @generated
	 * @ordered
	 */
	protected MvelExpression mvel;

	/**
	 * The cached value of the '{@link #getOgnl() <em>Ognl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOgnl()
	 * @generated
	 * @ordered
	 */
	protected OgnlExpression ognl;

	/**
	 * The cached value of the '{@link #getPhp() <em>Php</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhp()
	 * @generated
	 * @ordered
	 */
	protected PhpExpression php;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EObject property;

	/**
	 * This is true if the Property containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean propertyESet;

	/**
	 * The cached value of the '{@link #getPython() <em>Python</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPython()
	 * @generated
	 * @ordered
	 */
	protected PythonExpression python;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected RefExpression ref;

	/**
	 * The cached value of the '{@link #getRuby() <em>Ruby</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuby()
	 * @generated
	 * @ordered
	 */
	protected RubyExpression ruby;

	/**
	 * The cached value of the '{@link #getSimple() <em>Simple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimple()
	 * @generated
	 * @ordered
	 */
	protected SimpleExpression simple;

	/**
	 * The cached value of the '{@link #getSpel() <em>Spel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpel()
	 * @generated
	 * @ordered
	 */
	protected SpELExpression spel;

	/**
	 * The cached value of the '{@link #getSql() <em>Sql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSql()
	 * @generated
	 * @ordered
	 */
	protected SqlExpression sql;

	/**
	 * The cached value of the '{@link #getTokenize() <em>Tokenize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenize()
	 * @generated
	 * @ordered
	 */
	protected TokenizerExpression tokenize;

	/**
	 * The cached value of the '{@link #getXpath() <em>Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpath()
	 * @generated
	 * @ordered
	 */
	protected XPathExpression xpath;

	/**
	 * The cached value of the '{@link #getXquery() <em>Xquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXquery()
	 * @generated
	 * @ordered
	 */
	protected XQueryExpression xquery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionSubElementDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getExpressionSubElementDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpressionDefinition() {
		return expressionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionDefinition(Expression newExpressionDefinition, NotificationChain msgs) {
		Expression oldExpressionDefinition = expressionDefinition;
		expressionDefinition = newExpressionDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EXPRESSION_DEFINITION, oldExpressionDefinition, newExpressionDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionDefinition(Expression newExpressionDefinition) {
		if (newExpressionDefinition != expressionDefinition) {
			NotificationChain msgs = null;
			if (expressionDefinition != null)
				msgs = ((InternalEObject)expressionDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EXPRESSION_DEFINITION, null, msgs);
			if (newExpressionDefinition != null)
				msgs = ((InternalEObject)newExpressionDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EXPRESSION_DEFINITION, null, msgs);
			msgs = basicSetExpressionDefinition(newExpressionDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EXPRESSION_DEFINITION, newExpressionDefinition, newExpressionDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantExpression getConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstant(ConstantExpression newConstant, NotificationChain msgs) {
		ConstantExpression oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__CONSTANT, oldConstant, newConstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(ConstantExpression newConstant) {
		if (newConstant != constant) {
			NotificationChain msgs = null;
			if (constant != null)
				msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__CONSTANT, null, msgs);
			if (newConstant != null)
				msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__CONSTANT, null, msgs);
			msgs = basicSetConstant(newConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__CONSTANT, newConstant, newConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElExpression getEl() {
		return el;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEl(ElExpression newEl, NotificationChain msgs) {
		ElExpression oldEl = el;
		el = newEl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EL, oldEl, newEl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEl(ElExpression newEl) {
		if (newEl != el) {
			NotificationChain msgs = null;
			if (el != null)
				msgs = ((InternalEObject)el).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EL, null, msgs);
			if (newEl != null)
				msgs = ((InternalEObject)newEl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EL, null, msgs);
			msgs = basicSetEl(newEl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EL, newEl, newEl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroovyExpression getGroovy() {
		return groovy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroovy(GroovyExpression newGroovy, NotificationChain msgs) {
		GroovyExpression oldGroovy = groovy;
		groovy = newGroovy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__GROOVY, oldGroovy, newGroovy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroovy(GroovyExpression newGroovy) {
		if (newGroovy != groovy) {
			NotificationChain msgs = null;
			if (groovy != null)
				msgs = ((InternalEObject)groovy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__GROOVY, null, msgs);
			if (newGroovy != null)
				msgs = ((InternalEObject)newGroovy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__GROOVY, null, msgs);
			msgs = basicSetGroovy(newGroovy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__GROOVY, newGroovy, newGroovy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderExpression getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeaderExpression newHeader, NotificationChain msgs) {
		HeaderExpression oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(HeaderExpression newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JxPathExpression getJxpath() {
		return jxpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJxpath(JxPathExpression newJxpath, NotificationChain msgs) {
		JxPathExpression oldJxpath = jxpath;
		jxpath = newJxpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JXPATH, oldJxpath, newJxpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJxpath(JxPathExpression newJxpath) {
		if (newJxpath != jxpath) {
			NotificationChain msgs = null;
			if (jxpath != null)
				msgs = ((InternalEObject)jxpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JXPATH, null, msgs);
			if (newJxpath != null)
				msgs = ((InternalEObject)newJxpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JXPATH, null, msgs);
			msgs = basicSetJxpath(newJxpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JXPATH, newJxpath, newJxpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaScriptExpression getJavaScript() {
		return javaScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaScript(JavaScriptExpression newJavaScript, NotificationChain msgs) {
		JavaScriptExpression oldJavaScript = javaScript;
		javaScript = newJavaScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JAVA_SCRIPT, oldJavaScript, newJavaScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaScript(JavaScriptExpression newJavaScript) {
		if (newJavaScript != javaScript) {
			NotificationChain msgs = null;
			if (javaScript != null)
				msgs = ((InternalEObject)javaScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JAVA_SCRIPT, null, msgs);
			if (newJavaScript != null)
				msgs = ((InternalEObject)newJavaScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JAVA_SCRIPT, null, msgs);
			msgs = basicSetJavaScript(newJavaScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JAVA_SCRIPT, newJavaScript, newJavaScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageExpression getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(LanguageExpression newLanguage, NotificationChain msgs) {
		LanguageExpression oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__LANGUAGE, oldLanguage, newLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(LanguageExpression newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCallExpression getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(MethodCallExpression newMethod, NotificationChain msgs) {
		MethodCallExpression oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(MethodCallExpression newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MvelExpression getMvel() {
		return mvel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMvel(MvelExpression newMvel, NotificationChain msgs) {
		MvelExpression oldMvel = mvel;
		mvel = newMvel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__MVEL, oldMvel, newMvel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMvel(MvelExpression newMvel) {
		if (newMvel != mvel) {
			NotificationChain msgs = null;
			if (mvel != null)
				msgs = ((InternalEObject)mvel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__MVEL, null, msgs);
			if (newMvel != null)
				msgs = ((InternalEObject)newMvel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__MVEL, null, msgs);
			msgs = basicSetMvel(newMvel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__MVEL, newMvel, newMvel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OgnlExpression getOgnl() {
		return ognl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOgnl(OgnlExpression newOgnl, NotificationChain msgs) {
		OgnlExpression oldOgnl = ognl;
		ognl = newOgnl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__OGNL, oldOgnl, newOgnl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOgnl(OgnlExpression newOgnl) {
		if (newOgnl != ognl) {
			NotificationChain msgs = null;
			if (ognl != null)
				msgs = ((InternalEObject)ognl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__OGNL, null, msgs);
			if (newOgnl != null)
				msgs = ((InternalEObject)newOgnl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__OGNL, null, msgs);
			msgs = basicSetOgnl(newOgnl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__OGNL, newOgnl, newOgnl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhpExpression getPhp() {
		return php;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhp(PhpExpression newPhp, NotificationChain msgs) {
		PhpExpression oldPhp = php;
		php = newPhp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PHP, oldPhp, newPhp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhp(PhpExpression newPhp) {
		if (newPhp != php) {
			NotificationChain msgs = null;
			if (php != null)
				msgs = ((InternalEObject)php).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PHP, null, msgs);
			if (newPhp != null)
				msgs = ((InternalEObject)newPhp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PHP, null, msgs);
			msgs = basicSetPhp(newPhp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PHP, newPhp, newPhp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(EObject newProperty, NotificationChain msgs) {
		EObject oldProperty = property;
		property = newProperty;
		boolean oldPropertyESet = propertyESet;
		propertyESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PROPERTY, oldProperty, newProperty, !oldPropertyESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(EObject newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPropertyESet = propertyESet;
			propertyESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PROPERTY, newProperty, newProperty, !oldPropertyESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetProperty(NotificationChain msgs) {
		EObject oldProperty = property;
		property = null;
		boolean oldPropertyESet = propertyESet;
		propertyESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PROPERTY, oldProperty, null, oldPropertyESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProperty() {
		if (property != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PROPERTY, null, msgs);
			msgs = basicUnsetProperty(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPropertyESet = propertyESet;
			propertyESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PROPERTY, null, null, oldPropertyESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProperty() {
		return propertyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PythonExpression getPython() {
		return python;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPython(PythonExpression newPython, NotificationChain msgs) {
		PythonExpression oldPython = python;
		python = newPython;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PYTHON, oldPython, newPython);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPython(PythonExpression newPython) {
		if (newPython != python) {
			NotificationChain msgs = null;
			if (python != null)
				msgs = ((InternalEObject)python).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PYTHON, null, msgs);
			if (newPython != null)
				msgs = ((InternalEObject)newPython).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PYTHON, null, msgs);
			msgs = basicSetPython(newPython, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PYTHON, newPython, newPython));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefExpression getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRef(RefExpression newRef, NotificationChain msgs) {
		RefExpression oldRef = ref;
		ref = newRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__REF, oldRef, newRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(RefExpression newRef) {
		if (newRef != ref) {
			NotificationChain msgs = null;
			if (ref != null)
				msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__REF, null, msgs);
			if (newRef != null)
				msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__REF, null, msgs);
			msgs = basicSetRef(newRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__REF, newRef, newRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyExpression getRuby() {
		return ruby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuby(RubyExpression newRuby, NotificationChain msgs) {
		RubyExpression oldRuby = ruby;
		ruby = newRuby;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__RUBY, oldRuby, newRuby);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuby(RubyExpression newRuby) {
		if (newRuby != ruby) {
			NotificationChain msgs = null;
			if (ruby != null)
				msgs = ((InternalEObject)ruby).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__RUBY, null, msgs);
			if (newRuby != null)
				msgs = ((InternalEObject)newRuby).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__RUBY, null, msgs);
			msgs = basicSetRuby(newRuby, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__RUBY, newRuby, newRuby));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleExpression getSimple() {
		return simple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimple(SimpleExpression newSimple, NotificationChain msgs) {
		SimpleExpression oldSimple = simple;
		simple = newSimple;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SIMPLE, oldSimple, newSimple);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimple(SimpleExpression newSimple) {
		if (newSimple != simple) {
			NotificationChain msgs = null;
			if (simple != null)
				msgs = ((InternalEObject)simple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SIMPLE, null, msgs);
			if (newSimple != null)
				msgs = ((InternalEObject)newSimple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SIMPLE, null, msgs);
			msgs = basicSetSimple(newSimple, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SIMPLE, newSimple, newSimple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpELExpression getSpel() {
		return spel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpel(SpELExpression newSpel, NotificationChain msgs) {
		SpELExpression oldSpel = spel;
		spel = newSpel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SPEL, oldSpel, newSpel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpel(SpELExpression newSpel) {
		if (newSpel != spel) {
			NotificationChain msgs = null;
			if (spel != null)
				msgs = ((InternalEObject)spel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SPEL, null, msgs);
			if (newSpel != null)
				msgs = ((InternalEObject)newSpel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SPEL, null, msgs);
			msgs = basicSetSpel(newSpel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SPEL, newSpel, newSpel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlExpression getSql() {
		return sql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSql(SqlExpression newSql, NotificationChain msgs) {
		SqlExpression oldSql = sql;
		sql = newSql;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SQL, oldSql, newSql);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSql(SqlExpression newSql) {
		if (newSql != sql) {
			NotificationChain msgs = null;
			if (sql != null)
				msgs = ((InternalEObject)sql).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SQL, null, msgs);
			if (newSql != null)
				msgs = ((InternalEObject)newSql).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SQL, null, msgs);
			msgs = basicSetSql(newSql, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SQL, newSql, newSql));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenizerExpression getTokenize() {
		return tokenize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTokenize(TokenizerExpression newTokenize, NotificationChain msgs) {
		TokenizerExpression oldTokenize = tokenize;
		tokenize = newTokenize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__TOKENIZE, oldTokenize, newTokenize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenize(TokenizerExpression newTokenize) {
		if (newTokenize != tokenize) {
			NotificationChain msgs = null;
			if (tokenize != null)
				msgs = ((InternalEObject)tokenize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__TOKENIZE, null, msgs);
			if (newTokenize != null)
				msgs = ((InternalEObject)newTokenize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__TOKENIZE, null, msgs);
			msgs = basicSetTokenize(newTokenize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__TOKENIZE, newTokenize, newTokenize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathExpression getXpath() {
		return xpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXpath(XPathExpression newXpath, NotificationChain msgs) {
		XPathExpression oldXpath = xpath;
		xpath = newXpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XPATH, oldXpath, newXpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpath(XPathExpression newXpath) {
		if (newXpath != xpath) {
			NotificationChain msgs = null;
			if (xpath != null)
				msgs = ((InternalEObject)xpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XPATH, null, msgs);
			if (newXpath != null)
				msgs = ((InternalEObject)newXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XPATH, null, msgs);
			msgs = basicSetXpath(newXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XPATH, newXpath, newXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XQueryExpression getXquery() {
		return xquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXquery(XQueryExpression newXquery, NotificationChain msgs) {
		XQueryExpression oldXquery = xquery;
		xquery = newXquery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XQUERY, oldXquery, newXquery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXquery(XQueryExpression newXquery) {
		if (newXquery != xquery) {
			NotificationChain msgs = null;
			if (xquery != null)
				msgs = ((InternalEObject)xquery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XQUERY, null, msgs);
			if (newXquery != null)
				msgs = ((InternalEObject)newXquery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XQUERY, null, msgs);
			msgs = basicSetXquery(newXquery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XQUERY, newXquery, newXquery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EXPRESSION_DEFINITION:
				return basicSetExpressionDefinition(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__CONSTANT:
				return basicSetConstant(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EL:
				return basicSetEl(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__GROOVY:
				return basicSetGroovy(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__HEADER:
				return basicSetHeader(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JXPATH:
				return basicSetJxpath(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JAVA_SCRIPT:
				return basicSetJavaScript(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__METHOD:
				return basicSetMethod(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__MVEL:
				return basicSetMvel(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__OGNL:
				return basicSetOgnl(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PHP:
				return basicSetPhp(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PROPERTY:
				return basicUnsetProperty(msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PYTHON:
				return basicSetPython(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__REF:
				return basicSetRef(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__RUBY:
				return basicSetRuby(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SIMPLE:
				return basicSetSimple(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SPEL:
				return basicSetSpel(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SQL:
				return basicSetSql(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__TOKENIZE:
				return basicSetTokenize(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XPATH:
				return basicSetXpath(null, msgs);
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XQUERY:
				return basicSetXquery(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EXPRESSION_DEFINITION:
				return getExpressionDefinition();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__CONSTANT:
				return getConstant();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EL:
				return getEl();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__GROOVY:
				return getGroovy();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__HEADER:
				return getHeader();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JXPATH:
				return getJxpath();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JAVA_SCRIPT:
				return getJavaScript();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__LANGUAGE:
				return getLanguage();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__METHOD:
				return getMethod();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__MVEL:
				return getMvel();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__OGNL:
				return getOgnl();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PHP:
				return getPhp();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PROPERTY:
				return getProperty();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PYTHON:
				return getPython();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__REF:
				return getRef();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__RUBY:
				return getRuby();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SIMPLE:
				return getSimple();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SPEL:
				return getSpel();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SQL:
				return getSql();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__TOKENIZE:
				return getTokenize();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XPATH:
				return getXpath();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XQUERY:
				return getXquery();
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
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EXPRESSION_DEFINITION:
				setExpressionDefinition((Expression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__CONSTANT:
				setConstant((ConstantExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EL:
				setEl((ElExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__GROOVY:
				setGroovy((GroovyExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__HEADER:
				setHeader((HeaderExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JXPATH:
				setJxpath((JxPathExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JAVA_SCRIPT:
				setJavaScript((JavaScriptExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__LANGUAGE:
				setLanguage((LanguageExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__METHOD:
				setMethod((MethodCallExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__MVEL:
				setMvel((MvelExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__OGNL:
				setOgnl((OgnlExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PHP:
				setPhp((PhpExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PROPERTY:
				setProperty((EObject)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PYTHON:
				setPython((PythonExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__REF:
				setRef((RefExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__RUBY:
				setRuby((RubyExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SIMPLE:
				setSimple((SimpleExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SPEL:
				setSpel((SpELExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SQL:
				setSql((SqlExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__TOKENIZE:
				setTokenize((TokenizerExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XPATH:
				setXpath((XPathExpression)newValue);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XQUERY:
				setXquery((XQueryExpression)newValue);
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
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EXPRESSION_DEFINITION:
				setExpressionDefinition((Expression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__CONSTANT:
				setConstant((ConstantExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EL:
				setEl((ElExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__GROOVY:
				setGroovy((GroovyExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__HEADER:
				setHeader((HeaderExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JXPATH:
				setJxpath((JxPathExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JAVA_SCRIPT:
				setJavaScript((JavaScriptExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__LANGUAGE:
				setLanguage((LanguageExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__METHOD:
				setMethod((MethodCallExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__MVEL:
				setMvel((MvelExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__OGNL:
				setOgnl((OgnlExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PHP:
				setPhp((PhpExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PROPERTY:
				unsetProperty();
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PYTHON:
				setPython((PythonExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__REF:
				setRef((RefExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__RUBY:
				setRuby((RubyExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SIMPLE:
				setSimple((SimpleExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SPEL:
				setSpel((SpELExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SQL:
				setSql((SqlExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__TOKENIZE:
				setTokenize((TokenizerExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XPATH:
				setXpath((XPathExpression)null);
				return;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XQUERY:
				setXquery((XQueryExpression)null);
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
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EXPRESSION_DEFINITION:
				return expressionDefinition != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__CONSTANT:
				return constant != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EL:
				return el != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__GROOVY:
				return groovy != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__HEADER:
				return header != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JXPATH:
				return jxpath != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JAVA_SCRIPT:
				return javaScript != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__LANGUAGE:
				return language != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__METHOD:
				return method != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__MVEL:
				return mvel != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__OGNL:
				return ognl != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PHP:
				return php != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PROPERTY:
				return isSetProperty();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PYTHON:
				return python != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__REF:
				return ref != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__RUBY:
				return ruby != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SIMPLE:
				return simple != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SPEL:
				return spel != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SQL:
				return sql != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__TOKENIZE:
				return tokenize != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XPATH:
				return xpath != null;
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XQUERY:
				return xquery != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionSubElementDefinitionImpl
