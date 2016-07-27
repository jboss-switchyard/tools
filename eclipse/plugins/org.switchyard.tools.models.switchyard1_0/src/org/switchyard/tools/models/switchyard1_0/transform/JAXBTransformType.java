/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.transform;

import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JAXB Transform Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 JAXB Transformer Configuration.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType#getEnableAttachment <em>Enable Attachment</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType#getEnableXOPPackage <em>Enable XOP Package</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getJAXBTransformType()
 * @model extendedMetaData="name='JAXBTransformType' kind='empty'"
 * @generated
 */
public interface JAXBTransformType extends TransformType {

    /**
     * Returns the value of the '<em><b>Context Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                           The JAXB Context Path containing an ObjectFactory definition.
     *                       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Context Path</em>' attribute.
     * @see #setContextPath(String)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getJAXBTransformType_ContextPath()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='contextPath'"
     * @generated
     */
    String getContextPath();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType#getContextPath <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Path</em>' attribute.
     * @see #getContextPath()
     * @generated
     */
    void setContextPath(String value);

    /**
     * Returns the value of the '<em><b>Enable Attachment</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                           whether the binary element should be mapped into external attachment or inline in Java2XML transformation.
     *                           default is false, which means the binary content is inlined into XML body.
     *                       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Enable Attachment</em>' attribute.
     * @see #isSetEnableAttachment()
     * @see #unsetEnableAttachment()
     * @see #setEnableAttachment(Object)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getJAXBTransformType_EnableAttachment()
     * @model default="false" unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropBoolean"
     *        extendedMetaData="kind='attribute' name='enableAttachment'"
     * @generated
     */
    Object getEnableAttachment();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType#getEnableAttachment <em>Enable Attachment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enable Attachment</em>' attribute.
     * @see #isSetEnableAttachment()
     * @see #unsetEnableAttachment()
     * @see #getEnableAttachment()
     * @generated
     */
    void setEnableAttachment(Object value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType#getEnableAttachment <em>Enable Attachment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnableAttachment()
     * @see #getEnableAttachment()
     * @see #setEnableAttachment(Object)
     * @generated
     */
    void unsetEnableAttachment();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType#getEnableAttachment <em>Enable Attachment</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Enable Attachment</em>' attribute is set.
     * @see #unsetEnableAttachment()
     * @see #getEnableAttachment()
     * @see #setEnableAttachment(Object)
     * @generated
     */
    boolean isSetEnableAttachment();

    /**
     * Returns the value of the '<em><b>Enable XOP Package</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                           whether the XOP Package is enabled or not when processing attachment. default is true
     *                       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Enable XOP Package</em>' attribute.
     * @see #isSetEnableXOPPackage()
     * @see #unsetEnableXOPPackage()
     * @see #setEnableXOPPackage(Object)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getJAXBTransformType_EnableXOPPackage()
     * @model default="true" unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropBoolean"
     *        extendedMetaData="kind='attribute' name='enableXOPPackage'"
     * @generated
     */
    Object getEnableXOPPackage();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType#getEnableXOPPackage <em>Enable XOP Package</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enable XOP Package</em>' attribute.
     * @see #isSetEnableXOPPackage()
     * @see #unsetEnableXOPPackage()
     * @see #getEnableXOPPackage()
     * @generated
     */
    void setEnableXOPPackage(Object value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType#getEnableXOPPackage <em>Enable XOP Package</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnableXOPPackage()
     * @see #getEnableXOPPackage()
     * @see #setEnableXOPPackage(Object)
     * @generated
     */
    void unsetEnableXOPPackage();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType#getEnableXOPPackage <em>Enable XOP Package</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Enable XOP Package</em>' attribute is set.
     * @see #unsetEnableXOPPackage()
     * @see #getEnableXOPPackage()
     * @see #setEnableXOPPackage(Object)
     * @generated
     */
    boolean isSetEnableXOPPackage();
} // JAXBTransformType
