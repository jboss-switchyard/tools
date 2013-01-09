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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isTextline <em>Textline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isTcpNoDelay <em>Tcp No Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isKeepAlive <em>Keep Alive</em>}</li>
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
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Textline</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Textline</em>' attribute.
     * @see #isSetTextline()
     * @see #unsetTextline()
     * @see #setTextline(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyTcpBindingType_Textline()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='textline' namespace='##targetNamespace'"
     * @generated
     */
    boolean isTextline();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isTextline <em>Textline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Textline</em>' attribute.
     * @see #isSetTextline()
     * @see #unsetTextline()
     * @see #isTextline()
     * @generated
     */
    void setTextline(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isTextline <em>Textline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTextline()
     * @see #isTextline()
     * @see #setTextline(boolean)
     * @generated
     */
    void unsetTextline();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isTextline <em>Textline</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Textline</em>' attribute is set.
     * @see #unsetTextline()
     * @see #isTextline()
     * @see #setTextline(boolean)
     * @generated
     */
    boolean isSetTextline();

    /**
     * Returns the value of the '<em><b>Tcp No Delay</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tcp No Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tcp No Delay</em>' attribute.
     * @see #isSetTcpNoDelay()
     * @see #unsetTcpNoDelay()
     * @see #setTcpNoDelay(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyTcpBindingType_TcpNoDelay()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='tcpNoDelay' namespace='##targetNamespace'"
     * @generated
     */
    boolean isTcpNoDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isTcpNoDelay <em>Tcp No Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tcp No Delay</em>' attribute.
     * @see #isSetTcpNoDelay()
     * @see #unsetTcpNoDelay()
     * @see #isTcpNoDelay()
     * @generated
     */
    void setTcpNoDelay(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isTcpNoDelay <em>Tcp No Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTcpNoDelay()
     * @see #isTcpNoDelay()
     * @see #setTcpNoDelay(boolean)
     * @generated
     */
    void unsetTcpNoDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isTcpNoDelay <em>Tcp No Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tcp No Delay</em>' attribute is set.
     * @see #unsetTcpNoDelay()
     * @see #isTcpNoDelay()
     * @see #setTcpNoDelay(boolean)
     * @generated
     */
    boolean isSetTcpNoDelay();

    /**
     * Returns the value of the '<em><b>Keep Alive</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Keep Alive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Keep Alive</em>' attribute.
     * @see #isSetKeepAlive()
     * @see #unsetKeepAlive()
     * @see #setKeepAlive(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyTcpBindingType_KeepAlive()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='keepAlive' namespace='##targetNamespace'"
     * @generated
     */
    boolean isKeepAlive();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isKeepAlive <em>Keep Alive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Keep Alive</em>' attribute.
     * @see #isSetKeepAlive()
     * @see #unsetKeepAlive()
     * @see #isKeepAlive()
     * @generated
     */
    void setKeepAlive(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isKeepAlive <em>Keep Alive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKeepAlive()
     * @see #isKeepAlive()
     * @see #setKeepAlive(boolean)
     * @generated
     */
    void unsetKeepAlive();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isKeepAlive <em>Keep Alive</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Keep Alive</em>' attribute is set.
     * @see #unsetKeepAlive()
     * @see #isKeepAlive()
     * @see #setKeepAlive(boolean)
     * @generated
     */
    boolean isSetKeepAlive();

} // CamelNettyTcpBindingType
