/**
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throttling Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 SCA extension for configuring throttling details.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType#getMaxRequests <em>Max Requests</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType#getTimePeriod <em>Time Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getThrottlingType()
 * @model extendedMetaData="name='ThrottlingType' kind='empty'"
 * @generated
 */
public interface ThrottlingType extends EObject {
    /**
	 * Returns the value of the '<em><b>Max Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The maximum number of requests which can be processed during the specified timePeriod.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Requests</em>' attribute.
	 * @see #setMaxRequests(Object)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getThrottlingType_MaxRequests()
	 * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='maxRequests'"
	 * @generated
	 */
    Object getMaxRequests();

    /**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType#getMaxRequests <em>Max Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Requests</em>' attribute.
	 * @see #getMaxRequests()
	 * @generated
	 */
    void setMaxRequests(Object value);

    /**
	 * Returns the value of the '<em><b>Time Period</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The time period in milliseconds over which requests are counted.  Defaults to 1000 (1 second).
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Period</em>' attribute.
	 * @see #isSetTimePeriod()
	 * @see #unsetTimePeriod()
	 * @see #setTimePeriod(Object)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getThrottlingType_TimePeriod()
	 * @model default="1000" unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropLong"
	 *        extendedMetaData="kind='attribute' name='timePeriod'"
	 * @generated
	 */
    Object getTimePeriod();

    /**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType#getTimePeriod <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' attribute.
	 * @see #isSetTimePeriod()
	 * @see #unsetTimePeriod()
	 * @see #getTimePeriod()
	 * @generated
	 */
    void setTimePeriod(Object value);

    /**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType#getTimePeriod <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetTimePeriod()
	 * @see #getTimePeriod()
	 * @see #setTimePeriod(Object)
	 * @generated
	 */
    void unsetTimePeriod();

    /**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType#getTimePeriod <em>Time Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Period</em>' attribute is set.
	 * @see #unsetTimePeriod()
	 * @see #getTimePeriod()
	 * @see #setTimePeriod(Object)
	 * @generated
	 */
    boolean isSetTimePeriod();

} // ThrottlingType
