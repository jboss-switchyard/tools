/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Sub Element Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getExpressionDefinition <em>Expression Definition</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getEl <em>El</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getGroovy <em>Groovy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getHeader <em>Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getJxpath <em>Jxpath</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getJavaScript <em>Java Script</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getMethod <em>Method</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getMvel <em>Mvel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getOgnl <em>Ognl</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getPhp <em>Php</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getPython <em>Python</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getRef <em>Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getSpel <em>Spel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getSql <em>Sql</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getTokenize <em>Tokenize</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getXquery <em>Xquery</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition()
 * @model extendedMetaData="name='expressionSubElementDefinition' kind='elementOnly'"
 * @generated
 */
public interface ExpressionSubElementDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Definition</em>' containment reference.
	 * @see #setExpressionDefinition(Expression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_ExpressionDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expressionDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getExpressionDefinition();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getExpressionDefinition <em>Expression Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Definition</em>' containment reference.
	 * @see #getExpressionDefinition()
	 * @generated
	 */
	void setExpressionDefinition(Expression value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference.
	 * @see #setConstant(ConstantExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Constant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constant' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstantExpression getConstant();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getConstant <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' containment reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(ConstantExpression value);

	/**
	 * Returns the value of the '<em><b>El</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>El</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>El</em>' containment reference.
	 * @see #setEl(ElExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_El()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='el' namespace='##targetNamespace'"
	 * @generated
	 */
	ElExpression getEl();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getEl <em>El</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>El</em>' containment reference.
	 * @see #getEl()
	 * @generated
	 */
	void setEl(ElExpression value);

	/**
	 * Returns the value of the '<em><b>Groovy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groovy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groovy</em>' containment reference.
	 * @see #setGroovy(GroovyExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Groovy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groovy' namespace='##targetNamespace'"
	 * @generated
	 */
	GroovyExpression getGroovy();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getGroovy <em>Groovy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groovy</em>' containment reference.
	 * @see #getGroovy()
	 * @generated
	 */
	void setGroovy(GroovyExpression value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HeaderExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderExpression getHeader();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(HeaderExpression value);

	/**
	 * Returns the value of the '<em><b>Jxpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jxpath</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jxpath</em>' containment reference.
	 * @see #setJxpath(JxPathExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Jxpath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jxpath' namespace='##targetNamespace'"
	 * @generated
	 */
	JxPathExpression getJxpath();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getJxpath <em>Jxpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jxpath</em>' containment reference.
	 * @see #getJxpath()
	 * @generated
	 */
	void setJxpath(JxPathExpression value);

	/**
	 * Returns the value of the '<em><b>Java Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Script</em>' containment reference.
	 * @see #setJavaScript(JavaScriptExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_JavaScript()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='javaScript' namespace='##targetNamespace'"
	 * @generated
	 */
	JavaScriptExpression getJavaScript();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getJavaScript <em>Java Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Script</em>' containment reference.
	 * @see #getJavaScript()
	 * @generated
	 */
	void setJavaScript(JavaScriptExpression value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(LanguageExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageExpression getLanguage();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageExpression value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(MethodCallExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodCallExpression getMethod();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(MethodCallExpression value);

	/**
	 * Returns the value of the '<em><b>Mvel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mvel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mvel</em>' containment reference.
	 * @see #setMvel(MvelExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Mvel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mvel' namespace='##targetNamespace'"
	 * @generated
	 */
	MvelExpression getMvel();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getMvel <em>Mvel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mvel</em>' containment reference.
	 * @see #getMvel()
	 * @generated
	 */
	void setMvel(MvelExpression value);

	/**
	 * Returns the value of the '<em><b>Ognl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ognl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ognl</em>' containment reference.
	 * @see #setOgnl(OgnlExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Ognl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ognl' namespace='##targetNamespace'"
	 * @generated
	 */
	OgnlExpression getOgnl();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getOgnl <em>Ognl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ognl</em>' containment reference.
	 * @see #getOgnl()
	 * @generated
	 */
	void setOgnl(OgnlExpression value);

	/**
	 * Returns the value of the '<em><b>Php</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Php</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Php</em>' containment reference.
	 * @see #setPhp(PhpExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Php()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='php' namespace='##targetNamespace'"
	 * @generated
	 */
	PhpExpression getPhp();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getPhp <em>Php</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Php</em>' containment reference.
	 * @see #getPhp()
	 * @generated
	 */
	void setPhp(PhpExpression value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #isSetProperty()
	 * @see #unsetProperty()
	 * @see #setProperty(EObject)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Property()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getProperty();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #isSetProperty()
	 * @see #unsetProperty()
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(EObject value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProperty()
	 * @see #getProperty()
	 * @see #setProperty(EObject)
	 * @generated
	 */
	void unsetProperty();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getProperty <em>Property</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property</em>' containment reference is set.
	 * @see #unsetProperty()
	 * @see #getProperty()
	 * @see #setProperty(EObject)
	 * @generated
	 */
	boolean isSetProperty();

	/**
	 * Returns the value of the '<em><b>Python</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Python</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Python</em>' containment reference.
	 * @see #setPython(PythonExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Python()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='python' namespace='##targetNamespace'"
	 * @generated
	 */
	PythonExpression getPython();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getPython <em>Python</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Python</em>' containment reference.
	 * @see #getPython()
	 * @generated
	 */
	void setPython(PythonExpression value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference.
	 * @see #setRef(RefExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Ref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	RefExpression getRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(RefExpression value);

	/**
	 * Returns the value of the '<em><b>Ruby</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruby</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruby</em>' containment reference.
	 * @see #setRuby(RubyExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Ruby()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruby' namespace='##targetNamespace'"
	 * @generated
	 */
	RubyExpression getRuby();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getRuby <em>Ruby</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruby</em>' containment reference.
	 * @see #getRuby()
	 * @generated
	 */
	void setRuby(RubyExpression value);

	/**
	 * Returns the value of the '<em><b>Simple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple</em>' containment reference.
	 * @see #setSimple(SimpleExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Simple()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simple' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleExpression getSimple();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getSimple <em>Simple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple</em>' containment reference.
	 * @see #getSimple()
	 * @generated
	 */
	void setSimple(SimpleExpression value);

	/**
	 * Returns the value of the '<em><b>Spel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spel</em>' containment reference.
	 * @see #setSpel(SpELExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Spel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spel' namespace='##targetNamespace'"
	 * @generated
	 */
	SpELExpression getSpel();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getSpel <em>Spel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spel</em>' containment reference.
	 * @see #getSpel()
	 * @generated
	 */
	void setSpel(SpELExpression value);

	/**
	 * Returns the value of the '<em><b>Sql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql</em>' containment reference.
	 * @see #setSql(SqlExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Sql()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sql' namespace='##targetNamespace'"
	 * @generated
	 */
	SqlExpression getSql();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getSql <em>Sql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql</em>' containment reference.
	 * @see #getSql()
	 * @generated
	 */
	void setSql(SqlExpression value);

	/**
	 * Returns the value of the '<em><b>Tokenize</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokenize</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokenize</em>' containment reference.
	 * @see #setTokenize(TokenizerExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Tokenize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tokenize' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenizerExpression getTokenize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getTokenize <em>Tokenize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokenize</em>' containment reference.
	 * @see #getTokenize()
	 * @generated
	 */
	void setTokenize(TokenizerExpression value);

	/**
	 * Returns the value of the '<em><b>Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xpath</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpath</em>' containment reference.
	 * @see #setXpath(XPathExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Xpath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xpath' namespace='##targetNamespace'"
	 * @generated
	 */
	XPathExpression getXpath();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getXpath <em>Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath</em>' containment reference.
	 * @see #getXpath()
	 * @generated
	 */
	void setXpath(XPathExpression value);

	/**
	 * Returns the value of the '<em><b>Xquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xquery</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xquery</em>' containment reference.
	 * @see #setXquery(XQueryExpression)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getExpressionSubElementDefinition_Xquery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xquery' namespace='##targetNamespace'"
	 * @generated
	 */
	XQueryExpression getXquery();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition#getXquery <em>Xquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xquery</em>' containment reference.
	 * @see #getXquery()
	 * @generated
	 */
	void setXquery(XQueryExpression value);

} // ExpressionSubElementDefinition
