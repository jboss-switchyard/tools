/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.resteasy;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getContextPath <em>Context Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getRESTBindingType()
 * @model extendedMetaData="name='RESTBindingType' kind='empty'"
 * @generated
 */
public interface RESTBindingType extends SwitchYardBindingType {
    /**
     * Returns the value of the '<em><b>Interfaces</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interfaces</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interfaces</em>' attribute.
     * @see #setInterfaces(String)
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getRESTBindingType_Interfaces()
     * @model required="true"
     *        extendedMetaData="kind='element' name='interfaces' namespace='##targetNamespace'"
     * @generated
     */
    String getInterfaces();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getInterfaces <em>Interfaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interfaces</em>' attribute.
     * @see #getInterfaces()
     * @generated
     */
    void setInterfaces(String value);

    /**
     * Returns the value of the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Address</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Address</em>' attribute.
     * @see #setAddress(String)
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getRESTBindingType_Address()
     * @model extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
     * @generated
     */
    String getAddress();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getAddress <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address</em>' attribute.
     * @see #getAddress()
     * @generated
     */
    void setAddress(String value);

    /**
     * Returns the value of the '<em><b>Context Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Path</em>' attribute.
     * @see #setContextPath(String)
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getRESTBindingType_ContextPath()
     * @model extendedMetaData="kind='element' name='contextPath' namespace='##targetNamespace'"
     * @generated
     */
    String getContextPath();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getContextPath <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Path</em>' attribute.
     * @see #getContextPath()
     * @generated
     */
    void setContextPath(String value);

} // RESTBindingType
