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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getProxy <em>Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getRESTBindingType()
 * @model extendedMetaData="name='RESTBindingType' kind='elementOnly'"
 * @generated
 */
public interface RESTBindingType extends SwitchYardBindingType {
    /**
     * Returns the value of the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specify the ContextMapper to be used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Context Mapper</em>' containment reference.
     * @see #setContextMapper(ContextMapperType)
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getRESTBindingType_ContextMapper()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='contextMapper' namespace='##targetNamespace'"
     * @generated
     */
    ContextMapperType getContextMapper();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getContextMapper <em>Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Mapper</em>' containment reference.
     * @see #getContextMapper()
     * @generated
     */
    void setContextMapper(ContextMapperType value);

    /**
     * Returns the value of the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specify the MessageComposer to be used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Message Composer</em>' containment reference.
     * @see #setMessageComposer(MessageComposerType)
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getRESTBindingType_MessageComposer()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='messageComposer' namespace='##targetNamespace'"
     * @generated
     */
    MessageComposerType getMessageComposer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getMessageComposer <em>Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Composer</em>' containment reference.
     * @see #getMessageComposer()
     * @generated
     */
    void setMessageComposer(MessageComposerType value);

    /**
     * Returns the value of the '<em><b>Interfaces</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interfaces</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A comma separated list of interfaces or abstract/empty classes with REST annotations.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Interfaces</em>' attribute.
     * @see #setInterfaces(String)
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getRESTBindingType_Interfaces()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
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
     * <!-- begin-model-doc -->
     * A URL that points to the root path of resources. This is only applicable for Reference bindings. It is optional and if not specified will default to http://127.0.0.1:8080/.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Address</em>' attribute.
     * @see #setAddress(String)
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getRESTBindingType_Address()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
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
     * <!-- begin-model-doc -->
     * A URI string that represents the root context where this service is hosted.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Context Path</em>' attribute.
     * @see #setContextPath(String)
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getRESTBindingType_ContextPath()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='contextPath' namespace='##targetNamespace'"
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

    /**
     * Returns the value of the '<em><b>Proxy</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Proxy</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Http proxy settings.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Proxy</em>' containment reference.
     * @see #setProxy(ProxyType)
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getRESTBindingType_Proxy()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='proxy' namespace='##targetNamespace'"
     * @generated
     */
    ProxyType getProxy();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType#getProxy <em>Proxy</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Proxy</em>' containment reference.
     * @see #getProxy()
     * @generated
     */
    void setProxy(ProxyType value);

} // RESTBindingType
