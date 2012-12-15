/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelSftpBindingTypeItemProvider
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
    public CamelSftpBindingTypeItemProvider(AdapterFactory adapterFactory) {
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

            addDirectoryPropertyDescriptor(object);
            addAutoCreatePropertyDescriptor(object);
            addBufferSizePropertyDescriptor(object);
            addFileNamePropertyDescriptor(object);
            addFlattenPropertyDescriptor(object);
            addCharsetPropertyDescriptor(object);
            addHostPropertyDescriptor(object);
            addPortPropertyDescriptor(object);
            addUsernamePropertyDescriptor(object);
            addPasswordPropertyDescriptor(object);
            addBinaryPropertyDescriptor(object);
            addConnectTimeoutPropertyDescriptor(object);
            addDisconnectPropertyDescriptor(object);
            addMaximumReconnectAttemptsPropertyDescriptor(object);
            addReconnectDelayPropertyDescriptor(object);
            addSeparatorPropertyDescriptor(object);
            addStepwisePropertyDescriptor(object);
            addThrowExceptionOnConnectFailedPropertyDescriptor(object);
            addKnownHostsFilePropertyDescriptor(object);
            addPrivateKeyFilePropertyDescriptor(object);
            addPrivateKeyFilePassphrasePropertyDescriptor(object);
            addConsumePropertyDescriptor(object);
            addProducePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Directory feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDirectoryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_directory_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_directory_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__DIRECTORY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Auto Create feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAutoCreatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_autoCreate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_autoCreate_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__AUTO_CREATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Buffer Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBufferSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_bufferSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_bufferSize_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__BUFFER_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the File Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFileNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_fileName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_fileName_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__FILE_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Flatten feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlattenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_flatten_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_flatten_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__FLATTEN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Charset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCharsetPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_charset_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_charset_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__CHARSET,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
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
                 getString("_UI_CamelSftpBindingType_host_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_host_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__HOST,
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
                 getString("_UI_CamelSftpBindingType_port_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_port_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__PORT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Username feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsernamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_username_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_username_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__USERNAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Password feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPasswordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_password_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_password_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__PASSWORD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Binary feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBinaryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_binary_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_binary_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__BINARY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Connect Timeout feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectTimeoutPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_connectTimeout_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_connectTimeout_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__CONNECT_TIMEOUT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
                 getString("_UI_CamelSftpBindingType_disconnect_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_disconnect_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__DISCONNECT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Maximum Reconnect Attempts feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaximumReconnectAttemptsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_maximumReconnectAttempts_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_maximumReconnectAttempts_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Reconnect Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReconnectDelayPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_reconnectDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_reconnectDelay_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__RECONNECT_DELAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Separator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeparatorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_separator_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_separator_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__SEPARATOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Stepwise feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStepwisePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_stepwise_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_stepwise_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__STEPWISE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Throw Exception On Connect Failed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThrowExceptionOnConnectFailedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_throwExceptionOnConnectFailed_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_throwExceptionOnConnectFailed_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Known Hosts File feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKnownHostsFilePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_knownHostsFile_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_knownHostsFile_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Private Key File feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrivateKeyFilePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_privateKeyFile_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_privateKeyFile_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Private Key File Passphrase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrivateKeyFilePassphrasePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_privateKeyFilePassphrase_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_privateKeyFilePassphrase_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Consume feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConsumePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_consume_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_consume_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__CONSUME,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Produce feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProducePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSftpBindingType_produce_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSftpBindingType_produce_feature", "_UI_CamelSftpBindingType_type"),
                 FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE__PRODUCE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns CamelSftpBindingType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelSftpBindingType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelSftpBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelSftpBindingType_type") :
            getString("_UI_CamelSftpBindingType_type") + " " + label;
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

        switch (notification.getFeatureID(CamelSftpBindingType.class)) {
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__DIRECTORY:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__AUTO_CREATE:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__BUFFER_SIZE:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__FILE_NAME:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__FLATTEN:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__CHARSET:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__HOST:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PORT:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__USERNAME:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PASSWORD:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__BINARY:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__CONNECT_TIMEOUT:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__DISCONNECT:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__RECONNECT_DELAY:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__SEPARATOR:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__STEPWISE:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE:
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE:
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
