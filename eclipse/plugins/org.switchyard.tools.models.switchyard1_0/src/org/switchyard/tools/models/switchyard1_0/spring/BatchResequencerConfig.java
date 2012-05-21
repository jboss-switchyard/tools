/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Batch Resequencer Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#isAllowDuplicates <em>Allow Duplicates</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#getBatchTimeout <em>Batch Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#isIgnoreInvalidExchanges <em>Ignore Invalid Exchanges</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#isReverse <em>Reverse</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getBatchResequencerConfig()
 * @model extendedMetaData="name='batchResequencerConfig' kind='empty'"
 * @generated
 */
public interface BatchResequencerConfig extends ResequencerConfig {
	/**
     * Returns the value of the '<em><b>Allow Duplicates</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Duplicates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Allow Duplicates</em>' attribute.
     * @see #isSetAllowDuplicates()
     * @see #unsetAllowDuplicates()
     * @see #setAllowDuplicates(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getBatchResequencerConfig_AllowDuplicates()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='allowDuplicates'"
     * @generated
     */
	boolean isAllowDuplicates();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#isAllowDuplicates <em>Allow Duplicates</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Allow Duplicates</em>' attribute.
     * @see #isSetAllowDuplicates()
     * @see #unsetAllowDuplicates()
     * @see #isAllowDuplicates()
     * @generated
     */
	void setAllowDuplicates(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#isAllowDuplicates <em>Allow Duplicates</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetAllowDuplicates()
     * @see #isAllowDuplicates()
     * @see #setAllowDuplicates(boolean)
     * @generated
     */
	void unsetAllowDuplicates();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#isAllowDuplicates <em>Allow Duplicates</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Allow Duplicates</em>' attribute is set.
     * @see #unsetAllowDuplicates()
     * @see #isAllowDuplicates()
     * @see #setAllowDuplicates(boolean)
     * @generated
     */
	boolean isSetAllowDuplicates();

	/**
     * Returns the value of the '<em><b>Batch Size</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batch Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Batch Size</em>' attribute.
     * @see #isSetBatchSize()
     * @see #unsetBatchSize()
     * @see #setBatchSize(int)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getBatchResequencerConfig_BatchSize()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='batchSize'"
     * @generated
     */
	int getBatchSize();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#getBatchSize <em>Batch Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Batch Size</em>' attribute.
     * @see #isSetBatchSize()
     * @see #unsetBatchSize()
     * @see #getBatchSize()
     * @generated
     */
	void setBatchSize(int value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#getBatchSize <em>Batch Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetBatchSize()
     * @see #getBatchSize()
     * @see #setBatchSize(int)
     * @generated
     */
	void unsetBatchSize();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#getBatchSize <em>Batch Size</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Batch Size</em>' attribute is set.
     * @see #unsetBatchSize()
     * @see #getBatchSize()
     * @see #setBatchSize(int)
     * @generated
     */
	boolean isSetBatchSize();

	/**
     * Returns the value of the '<em><b>Batch Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batch Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Batch Timeout</em>' attribute.
     * @see #isSetBatchTimeout()
     * @see #unsetBatchTimeout()
     * @see #setBatchTimeout(long)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getBatchResequencerConfig_BatchTimeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        extendedMetaData="kind='attribute' name='batchTimeout'"
     * @generated
     */
	long getBatchTimeout();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#getBatchTimeout <em>Batch Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Batch Timeout</em>' attribute.
     * @see #isSetBatchTimeout()
     * @see #unsetBatchTimeout()
     * @see #getBatchTimeout()
     * @generated
     */
	void setBatchTimeout(long value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#getBatchTimeout <em>Batch Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetBatchTimeout()
     * @see #getBatchTimeout()
     * @see #setBatchTimeout(long)
     * @generated
     */
	void unsetBatchTimeout();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#getBatchTimeout <em>Batch Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Batch Timeout</em>' attribute is set.
     * @see #unsetBatchTimeout()
     * @see #getBatchTimeout()
     * @see #setBatchTimeout(long)
     * @generated
     */
	boolean isSetBatchTimeout();

	/**
     * Returns the value of the '<em><b>Ignore Invalid Exchanges</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ignore Invalid Exchanges</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ignore Invalid Exchanges</em>' attribute.
     * @see #isSetIgnoreInvalidExchanges()
     * @see #unsetIgnoreInvalidExchanges()
     * @see #setIgnoreInvalidExchanges(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getBatchResequencerConfig_IgnoreInvalidExchanges()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='ignoreInvalidExchanges'"
     * @generated
     */
    boolean isIgnoreInvalidExchanges();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#isIgnoreInvalidExchanges <em>Ignore Invalid Exchanges</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ignore Invalid Exchanges</em>' attribute.
     * @see #isSetIgnoreInvalidExchanges()
     * @see #unsetIgnoreInvalidExchanges()
     * @see #isIgnoreInvalidExchanges()
     * @generated
     */
    void setIgnoreInvalidExchanges(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#isIgnoreInvalidExchanges <em>Ignore Invalid Exchanges</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIgnoreInvalidExchanges()
     * @see #isIgnoreInvalidExchanges()
     * @see #setIgnoreInvalidExchanges(boolean)
     * @generated
     */
    void unsetIgnoreInvalidExchanges();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#isIgnoreInvalidExchanges <em>Ignore Invalid Exchanges</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ignore Invalid Exchanges</em>' attribute is set.
     * @see #unsetIgnoreInvalidExchanges()
     * @see #isIgnoreInvalidExchanges()
     * @see #setIgnoreInvalidExchanges(boolean)
     * @generated
     */
    boolean isSetIgnoreInvalidExchanges();

    /**
     * Returns the value of the '<em><b>Reverse</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Reverse</em>' attribute.
     * @see #isSetReverse()
     * @see #unsetReverse()
     * @see #setReverse(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getBatchResequencerConfig_Reverse()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='reverse'"
     * @generated
     */
	boolean isReverse();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#isReverse <em>Reverse</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reverse</em>' attribute.
     * @see #isSetReverse()
     * @see #unsetReverse()
     * @see #isReverse()
     * @generated
     */
	void setReverse(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#isReverse <em>Reverse</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetReverse()
     * @see #isReverse()
     * @see #setReverse(boolean)
     * @generated
     */
	void unsetReverse();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig#isReverse <em>Reverse</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reverse</em>' attribute is set.
     * @see #unsetReverse()
     * @see #isReverse()
     * @see #setReverse(boolean)
     * @generated
     */
	boolean isSetReverse();

} // BatchResequencerConfig
