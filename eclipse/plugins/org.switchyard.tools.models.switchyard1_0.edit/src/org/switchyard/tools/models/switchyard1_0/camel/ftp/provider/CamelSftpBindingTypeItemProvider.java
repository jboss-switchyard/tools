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

import org.switchyard.tools.models.switchyard1_0.camel.core.provider.CamelRemoteBindingTypeItemProvider;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelSftpBindingTypeItemProvider
    extends CamelRemoteBindingTypeItemProvider
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

            addKnownHostsFilePropertyDescriptor(object);
            addPrivateKeyFilePropertyDescriptor(object);
            addPrivateKeyFilePassphrasePropertyDescriptor(object);
            addConsumePropertyDescriptor(object);
            addProducePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
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

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Switchyard_1EditPlugin.INSTANCE;
    }

}
