/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.netty;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Netty Tcp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getTextline <em>Textline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getTcpNoDelay <em>Tcp No Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getKeepAlive <em>Keep Alive</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyTcpBindingType()
 * @model extendedMetaData="name='CamelNettyTcpBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelNettyTcpBindingType extends CamelNettyBindingType {
    /**
     * Returns the value of the '<em><b>Textline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Textline</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Textline</em>' attribute.
     * @see #isSetTextline()
     * @see #unsetTextline()
     * @see #setTextline(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyTcpBindingType_Textline()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='textline' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getTextline();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getTextline <em>Textline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Textline</em>' attribute.
     * @see #isSetTextline()
     * @see #unsetTextline()
     * @see #getTextline()
     * @generated
     */
    void setTextline(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getTextline <em>Textline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTextline()
     * @see #getTextline()
     * @see #setTextline(Boolean)
     * @generated
     */
    void unsetTextline();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getTextline <em>Textline</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Textline</em>' attribute is set.
     * @see #unsetTextline()
     * @see #getTextline()
     * @see #setTextline(Boolean)
     * @generated
     */
    boolean isSetTextline();

    /**
     * Returns the value of the '<em><b>Tcp No Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tcp No Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tcp No Delay</em>' attribute.
     * @see #isSetTcpNoDelay()
     * @see #unsetTcpNoDelay()
     * @see #setTcpNoDelay(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyTcpBindingType_TcpNoDelay()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='tcpNoDelay' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getTcpNoDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getTcpNoDelay <em>Tcp No Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tcp No Delay</em>' attribute.
     * @see #isSetTcpNoDelay()
     * @see #unsetTcpNoDelay()
     * @see #getTcpNoDelay()
     * @generated
     */
    void setTcpNoDelay(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getTcpNoDelay <em>Tcp No Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTcpNoDelay()
     * @see #getTcpNoDelay()
     * @see #setTcpNoDelay(Boolean)
     * @generated
     */
    void unsetTcpNoDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getTcpNoDelay <em>Tcp No Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tcp No Delay</em>' attribute is set.
     * @see #unsetTcpNoDelay()
     * @see #getTcpNoDelay()
     * @see #setTcpNoDelay(Boolean)
     * @generated
     */
    boolean isSetTcpNoDelay();

    /**
     * Returns the value of the '<em><b>Keep Alive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Keep Alive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Keep Alive</em>' attribute.
     * @see #isSetKeepAlive()
     * @see #unsetKeepAlive()
     * @see #setKeepAlive(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyTcpBindingType_KeepAlive()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='keepAlive' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getKeepAlive();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getKeepAlive <em>Keep Alive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Keep Alive</em>' attribute.
     * @see #isSetKeepAlive()
     * @see #unsetKeepAlive()
     * @see #getKeepAlive()
     * @generated
     */
    void setKeepAlive(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getKeepAlive <em>Keep Alive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKeepAlive()
     * @see #getKeepAlive()
     * @see #setKeepAlive(Boolean)
     * @generated
     */
    void unsetKeepAlive();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getKeepAlive <em>Keep Alive</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Keep Alive</em>' attribute is set.
     * @see #unsetKeepAlive()
     * @see #getKeepAlive()
     * @see #setKeepAlive(Boolean)
     * @generated
     */
    boolean isSetKeepAlive();

} // CamelNettyTcpBindingType
