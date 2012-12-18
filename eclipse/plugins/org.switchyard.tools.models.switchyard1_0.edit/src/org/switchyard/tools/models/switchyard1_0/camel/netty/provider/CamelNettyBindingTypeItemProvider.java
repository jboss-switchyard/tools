/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.netty.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelNettyBindingTypeItemProvider
    extends BaseCamelBindingItemProvider
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelNettyBindingTypeItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addHostPropertyDescriptor(object);
            addPortPropertyDescriptor(object);
            addReceiveBufferSizePropertyDescriptor(object);
            addSendBufferSizePropertyDescriptor(object);
            addReuseAddressPropertyDescriptor(object);
            addEncodersPropertyDescriptor(object);
            addDecodersPropertyDescriptor(object);
            addAllowDefaultCodecPropertyDescriptor(object);
            addWorkerCountPropertyDescriptor(object);
            addSyncPropertyDescriptor(object);
            addDisconnectPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Host feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHostPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelNettyBindingType_host_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelNettyBindingType_host_feature", "_UI_CamelNettyBindingType_type"),
                 NettyPackage.Literals.CAMEL_NETTY_BINDING_TYPE__HOST,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Port feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPortPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelNettyBindingType_port_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelNettyBindingType_port_feature", "_UI_CamelNettyBindingType_type"),
                 NettyPackage.Literals.CAMEL_NETTY_BINDING_TYPE__PORT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Receive Buffer Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReceiveBufferSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelNettyBindingType_receiveBufferSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelNettyBindingType_receiveBufferSize_feature", "_UI_CamelNettyBindingType_type"),
                 NettyPackage.Literals.CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Send Buffer Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSendBufferSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelNettyBindingType_sendBufferSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelNettyBindingType_sendBufferSize_feature", "_UI_CamelNettyBindingType_type"),
                 NettyPackage.Literals.CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Reuse Address feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReuseAddressPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelNettyBindingType_reuseAddress_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelNettyBindingType_reuseAddress_feature", "_UI_CamelNettyBindingType_type"),
                 NettyPackage.Literals.CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Encoders feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEncodersPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelNettyBindingType_encoders_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelNettyBindingType_encoders_feature", "_UI_CamelNettyBindingType_type"),
                 NettyPackage.Literals.CAMEL_NETTY_BINDING_TYPE__ENCODERS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Decoders feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDecodersPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelNettyBindingType_decoders_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelNettyBindingType_decoders_feature", "_UI_CamelNettyBindingType_type"),
                 NettyPackage.Literals.CAMEL_NETTY_BINDING_TYPE__DECODERS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Allow Default Codec feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAllowDefaultCodecPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelNettyBindingType_allowDefaultCodec_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelNettyBindingType_allowDefaultCodec_feature", "_UI_CamelNettyBindingType_type"),
                 NettyPackage.Literals.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Worker Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWorkerCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelNettyBindingType_workerCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelNettyBindingType_workerCount_feature", "_UI_CamelNettyBindingType_type"),
                 NettyPackage.Literals.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Sync feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSyncPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelNettyBindingType_sync_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelNettyBindingType_sync_feature", "_UI_CamelNettyBindingType_type"),
                 NettyPackage.Literals.CAMEL_NETTY_BINDING_TYPE__SYNC,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Disconnect feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDisconnectPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelNettyBindingType_disconnect_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelNettyBindingType_disconnect_feature", "_UI_CamelNettyBindingType_type"),
                 NettyPackage.Literals.CAMEL_NETTY_BINDING_TYPE__DISCONNECT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelNettyBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelNettyBindingType_type") :
            getString("_UI_CamelNettyBindingType_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(CamelNettyBindingType.class)) {
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__HOST:
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__PORT:
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE:
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE:
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS:
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__ENCODERS:
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__DECODERS:
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC:
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT:
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SYNC:
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
