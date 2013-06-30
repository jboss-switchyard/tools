/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.provider;


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

import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelFtpBindingTypeItemProvider
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
    public CamelFtpBindingTypeItemProvider(AdapterFactory adapterFactory) {
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
            addPassiveModePropertyDescriptor(object);
            addTimeoutPropertyDescriptor(object);
            addSoTimeoutPropertyDescriptor(object);
            addSiteCommandPropertyDescriptor(object);
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
                 getString("_UI_CamelFtpBindingType_directory_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_directory_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__DIRECTORY,
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
                 getString("_UI_CamelFtpBindingType_autoCreate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_autoCreate_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__AUTO_CREATE,
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
                 getString("_UI_CamelFtpBindingType_bufferSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_bufferSize_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE,
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
                 getString("_UI_CamelFtpBindingType_fileName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_fileName_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__FILE_NAME,
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
                 getString("_UI_CamelFtpBindingType_flatten_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_flatten_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__FLATTEN,
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
                 getString("_UI_CamelFtpBindingType_charset_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_charset_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__CHARSET,
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
                 getString("_UI_CamelFtpBindingType_host_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_host_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__HOST,
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
                 getString("_UI_CamelFtpBindingType_port_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_port_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__PORT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_CamelFtpBindingType_username_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_username_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__USERNAME,
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
                 getString("_UI_CamelFtpBindingType_password_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_password_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__PASSWORD,
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
                 getString("_UI_CamelFtpBindingType_binary_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_binary_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__BINARY,
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
                 getString("_UI_CamelFtpBindingType_connectTimeout_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_connectTimeout_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT,
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
                 getString("_UI_CamelFtpBindingType_disconnect_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_disconnect_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__DISCONNECT,
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
                 getString("_UI_CamelFtpBindingType_maximumReconnectAttempts_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_maximumReconnectAttempts_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_CamelFtpBindingType_reconnectDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_reconnectDelay_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_CamelFtpBindingType_separator_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_separator_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__SEPARATOR,
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
                 getString("_UI_CamelFtpBindingType_stepwise_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_stepwise_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__STEPWISE,
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
                 getString("_UI_CamelFtpBindingType_throwExceptionOnConnectFailed_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_throwExceptionOnConnectFailed_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Passive Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPassiveModePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFtpBindingType_passiveMode_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_passiveMode_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Timeout feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimeoutPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFtpBindingType_timeout_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_timeout_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__TIMEOUT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the So Timeout feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSoTimeoutPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFtpBindingType_soTimeout_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_soTimeout_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Site Command feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSiteCommandPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFtpBindingType_siteCommand_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_siteCommand_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND,
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
                 getString("_UI_CamelFtpBindingType_consume_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_consume_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__CONSUME,
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
                 getString("_UI_CamelFtpBindingType_produce_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpBindingType_produce_feature", "_UI_CamelFtpBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE__PRODUCE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns CamelFtpBindingType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelFtpBindingType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelFtpBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelFtpBindingType_type") :
            getString("_UI_CamelFtpBindingType_type") + " " + label;
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

        switch (notification.getFeatureID(CamelFtpBindingType.class)) {
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__DIRECTORY:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__AUTO_CREATE:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__FILE_NAME:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__FLATTEN:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CHARSET:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__HOST:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PORT:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__USERNAME:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSWORD:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__BINARY:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__DISCONNECT:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SEPARATOR:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__STEPWISE:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT:
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND:
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
