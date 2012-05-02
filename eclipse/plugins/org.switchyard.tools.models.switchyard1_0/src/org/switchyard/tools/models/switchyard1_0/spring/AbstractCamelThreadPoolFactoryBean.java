/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Camel Thread Pool Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getKeepAliveTime <em>Keep Alive Time</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getMaxPoolSize <em>Max Pool Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getMaxQueueSize <em>Max Queue Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getRejectedPolicy <em>Rejected Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getThreadName <em>Thread Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelThreadPoolFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractCamelThreadPoolFactoryBean' kind='empty'"
 * @generated
 */
public interface AbstractCamelThreadPoolFactoryBean extends AbstractCamelFactoryBean {
	/**
	 * Returns the value of the '<em><b>Keep Alive Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Alive Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Alive Time</em>' attribute.
	 * @see #setKeepAliveTime(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelThreadPoolFactoryBean_KeepAliveTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keepAliveTime'"
	 * @generated
	 */
	String getKeepAliveTime();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getKeepAliveTime <em>Keep Alive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Alive Time</em>' attribute.
	 * @see #getKeepAliveTime()
	 * @generated
	 */
	void setKeepAliveTime(String value);

	/**
	 * Returns the value of the '<em><b>Max Pool Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Pool Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Pool Size</em>' attribute.
	 * @see #setMaxPoolSize(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelThreadPoolFactoryBean_MaxPoolSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxPoolSize'"
	 * @generated
	 */
	String getMaxPoolSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getMaxPoolSize <em>Max Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pool Size</em>' attribute.
	 * @see #getMaxPoolSize()
	 * @generated
	 */
	void setMaxPoolSize(String value);

	/**
	 * Returns the value of the '<em><b>Max Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Queue Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Queue Size</em>' attribute.
	 * @see #setMaxQueueSize(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelThreadPoolFactoryBean_MaxQueueSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxQueueSize'"
	 * @generated
	 */
	String getMaxQueueSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getMaxQueueSize <em>Max Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Queue Size</em>' attribute.
	 * @see #getMaxQueueSize()
	 * @generated
	 */
	void setMaxQueueSize(String value);

	/**
	 * Returns the value of the '<em><b>Pool Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool Size</em>' attribute.
	 * @see #setPoolSize(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelThreadPoolFactoryBean_PoolSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='poolSize'"
	 * @generated
	 */
	String getPoolSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getPoolSize <em>Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Size</em>' attribute.
	 * @see #getPoolSize()
	 * @generated
	 */
	void setPoolSize(String value);

	/**
	 * Returns the value of the '<em><b>Rejected Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.ThreadPoolRejectedPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rejected Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rejected Policy</em>' attribute.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.ThreadPoolRejectedPolicy
	 * @see #isSetRejectedPolicy()
	 * @see #unsetRejectedPolicy()
	 * @see #setRejectedPolicy(ThreadPoolRejectedPolicy)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelThreadPoolFactoryBean_RejectedPolicy()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rejectedPolicy'"
	 * @generated
	 */
	ThreadPoolRejectedPolicy getRejectedPolicy();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getRejectedPolicy <em>Rejected Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejected Policy</em>' attribute.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.ThreadPoolRejectedPolicy
	 * @see #isSetRejectedPolicy()
	 * @see #unsetRejectedPolicy()
	 * @see #getRejectedPolicy()
	 * @generated
	 */
	void setRejectedPolicy(ThreadPoolRejectedPolicy value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getRejectedPolicy <em>Rejected Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRejectedPolicy()
	 * @see #getRejectedPolicy()
	 * @see #setRejectedPolicy(ThreadPoolRejectedPolicy)
	 * @generated
	 */
	void unsetRejectedPolicy();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getRejectedPolicy <em>Rejected Policy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rejected Policy</em>' attribute is set.
	 * @see #unsetRejectedPolicy()
	 * @see #getRejectedPolicy()
	 * @see #setRejectedPolicy(ThreadPoolRejectedPolicy)
	 * @generated
	 */
	boolean isSetRejectedPolicy();

	/**
	 * Returns the value of the '<em><b>Thread Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Name</em>' attribute.
	 * @see #setThreadName(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelThreadPoolFactoryBean_ThreadName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='threadName'"
	 * @generated
	 */
	String getThreadName();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getThreadName <em>Thread Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Name</em>' attribute.
	 * @see #getThreadName()
	 * @generated
	 */
	void setThreadName(String value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see #setTimeUnit(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelThreadPoolFactoryBean_TimeUnit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeUnit'"
	 * @generated
	 */
	String getTimeUnit();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(String value);

} // AbstractCamelThreadPoolFactoryBean
