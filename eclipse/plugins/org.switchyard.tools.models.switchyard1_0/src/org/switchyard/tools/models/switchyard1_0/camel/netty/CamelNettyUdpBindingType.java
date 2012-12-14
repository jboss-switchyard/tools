/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.netty;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Netty Udp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType#getBroadcast <em>Broadcast</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyUdpBindingType()
 * @model extendedMetaData="name='CamelNettyUdpBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelNettyUdpBindingType extends CamelNettyBindingType {
    /**
     * Returns the value of the '<em><b>Broadcast</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Broadcast</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Broadcast</em>' attribute.
     * @see #setBroadcast(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyUdpBindingType_Broadcast()
     * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='broadcast' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getBroadcast();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType#getBroadcast <em>Broadcast</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Broadcast</em>' attribute.
     * @see #getBroadcast()
     * @generated
     */
    void setBroadcast(Boolean value);

} // CamelNettyUdpBindingType
