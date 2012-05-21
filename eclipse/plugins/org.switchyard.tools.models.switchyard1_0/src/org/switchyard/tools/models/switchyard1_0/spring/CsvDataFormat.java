/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Csv Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat#isAutogenColumns <em>Autogen Columns</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat#getConfigRef <em>Config Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat#getStrategyRef <em>Strategy Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCsvDataFormat()
 * @model extendedMetaData="name='csvDataFormat' kind='empty'"
 * @generated
 */
public interface CsvDataFormat extends DataFormat {
	/**
     * Returns the value of the '<em><b>Autogen Columns</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Autogen Columns</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Autogen Columns</em>' attribute.
     * @see #isSetAutogenColumns()
     * @see #unsetAutogenColumns()
     * @see #setAutogenColumns(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCsvDataFormat_AutogenColumns()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='autogenColumns'"
     * @generated
     */
    boolean isAutogenColumns();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat#isAutogenColumns <em>Autogen Columns</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Autogen Columns</em>' attribute.
     * @see #isSetAutogenColumns()
     * @see #unsetAutogenColumns()
     * @see #isAutogenColumns()
     * @generated
     */
    void setAutogenColumns(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat#isAutogenColumns <em>Autogen Columns</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAutogenColumns()
     * @see #isAutogenColumns()
     * @see #setAutogenColumns(boolean)
     * @generated
     */
    void unsetAutogenColumns();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat#isAutogenColumns <em>Autogen Columns</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Autogen Columns</em>' attribute is set.
     * @see #unsetAutogenColumns()
     * @see #isAutogenColumns()
     * @see #setAutogenColumns(boolean)
     * @generated
     */
    boolean isSetAutogenColumns();

    /**
     * Returns the value of the '<em><b>Config Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Config Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Config Ref</em>' attribute.
     * @see #setConfigRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCsvDataFormat_ConfigRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='configRef'"
     * @generated
     */
    String getConfigRef();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat#getConfigRef <em>Config Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Config Ref</em>' attribute.
     * @see #getConfigRef()
     * @generated
     */
    void setConfigRef(String value);

    /**
     * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Delimiter</em>' attribute.
     * @see #setDelimiter(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCsvDataFormat_Delimiter()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='delimiter'"
     * @generated
     */
	String getDelimiter();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat#getDelimiter <em>Delimiter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delimiter</em>' attribute.
     * @see #getDelimiter()
     * @generated
     */
	void setDelimiter(String value);

    /**
     * Returns the value of the '<em><b>Strategy Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Strategy Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Strategy Ref</em>' attribute.
     * @see #setStrategyRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCsvDataFormat_StrategyRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='strategyRef'"
     * @generated
     */
    String getStrategyRef();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat#getStrategyRef <em>Strategy Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Strategy Ref</em>' attribute.
     * @see #getStrategyRef()
     * @generated
     */
    void setStrategyRef(String value);

} // CsvDataFormat
