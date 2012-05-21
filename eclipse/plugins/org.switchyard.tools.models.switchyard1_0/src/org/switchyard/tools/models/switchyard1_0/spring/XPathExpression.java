/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XPath Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XPathExpression#getFactoryRef <em>Factory Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XPathExpression#getObjectModel <em>Object Model</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XPathExpression#getResultType <em>Result Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XPathExpression#isSaxon <em>Saxon</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XPathExpression#isTraceNamespaces <em>Trace Namespaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXPathExpression()
 * @model extendedMetaData="name='xPathExpression' kind='simple'"
 * @generated
 */
public interface XPathExpression extends NamespaceAwareExpression {
	/**
     * Returns the value of the '<em><b>Factory Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Factory Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Factory Ref</em>' attribute.
     * @see #setFactoryRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXPathExpression_FactoryRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='factoryRef'"
     * @generated
     */
    String getFactoryRef();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XPathExpression#getFactoryRef <em>Factory Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Factory Ref</em>' attribute.
     * @see #getFactoryRef()
     * @generated
     */
    void setFactoryRef(String value);

    /**
     * Returns the value of the '<em><b>Object Model</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object Model</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object Model</em>' attribute.
     * @see #setObjectModel(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXPathExpression_ObjectModel()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='objectModel'"
     * @generated
     */
    String getObjectModel();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XPathExpression#getObjectModel <em>Object Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object Model</em>' attribute.
     * @see #getObjectModel()
     * @generated
     */
    void setObjectModel(String value);

    /**
     * Returns the value of the '<em><b>Result Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Result Type</em>' attribute.
     * @see #setResultType(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXPathExpression_ResultType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='resultType'"
     * @generated
     */
	String getResultType();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XPathExpression#getResultType <em>Result Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Result Type</em>' attribute.
     * @see #getResultType()
     * @generated
     */
	void setResultType(String value);

    /**
     * Returns the value of the '<em><b>Saxon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Saxon</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Saxon</em>' attribute.
     * @see #isSetSaxon()
     * @see #unsetSaxon()
     * @see #setSaxon(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXPathExpression_Saxon()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='saxon'"
     * @generated
     */
    boolean isSaxon();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XPathExpression#isSaxon <em>Saxon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Saxon</em>' attribute.
     * @see #isSetSaxon()
     * @see #unsetSaxon()
     * @see #isSaxon()
     * @generated
     */
    void setSaxon(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XPathExpression#isSaxon <em>Saxon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSaxon()
     * @see #isSaxon()
     * @see #setSaxon(boolean)
     * @generated
     */
    void unsetSaxon();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XPathExpression#isSaxon <em>Saxon</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Saxon</em>' attribute is set.
     * @see #unsetSaxon()
     * @see #isSaxon()
     * @see #setSaxon(boolean)
     * @generated
     */
    boolean isSetSaxon();

    /**
     * Returns the value of the '<em><b>Trace Namespaces</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trace Namespaces</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trace Namespaces</em>' attribute.
     * @see #isSetTraceNamespaces()
     * @see #unsetTraceNamespaces()
     * @see #setTraceNamespaces(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXPathExpression_TraceNamespaces()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='traceNamespaces'"
     * @generated
     */
    boolean isTraceNamespaces();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XPathExpression#isTraceNamespaces <em>Trace Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trace Namespaces</em>' attribute.
     * @see #isSetTraceNamespaces()
     * @see #unsetTraceNamespaces()
     * @see #isTraceNamespaces()
     * @generated
     */
    void setTraceNamespaces(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XPathExpression#isTraceNamespaces <em>Trace Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTraceNamespaces()
     * @see #isTraceNamespaces()
     * @see #setTraceNamespaces(boolean)
     * @generated
     */
    void unsetTraceNamespaces();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XPathExpression#isTraceNamespaces <em>Trace Namespaces</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Trace Namespaces</em>' attribute is set.
     * @see #unsetTraceNamespaces()
     * @see #isTraceNamespaces()
     * @see #setTraceNamespaces(boolean)
     * @generated
     */
    boolean isSetTraceNamespaces();

} // XPathExpression
