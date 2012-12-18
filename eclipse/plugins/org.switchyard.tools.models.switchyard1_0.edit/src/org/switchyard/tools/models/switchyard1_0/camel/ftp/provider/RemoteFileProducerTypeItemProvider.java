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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoteFileProducerTypeItemProvider
    extends ItemProviderAdapter
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
    public RemoteFileProducerTypeItemProvider(AdapterFactory adapterFactory) {
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

            addFileExistPropertyDescriptor(object);
            addTempPrefixPropertyDescriptor(object);
            addTempFileNamePropertyDescriptor(object);
            addKeepLastModifiedPropertyDescriptor(object);
            addEagerDeleteTargetFilePropertyDescriptor(object);
            addDoneFileNamePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the File Exist feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFileExistPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileProducerType_fileExist_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileProducerType_fileExist_feature", "_UI_RemoteFileProducerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_PRODUCER_TYPE__FILE_EXIST,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Temp Prefix feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTempPrefixPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileProducerType_tempPrefix_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileProducerType_tempPrefix_feature", "_UI_RemoteFileProducerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_PRODUCER_TYPE__TEMP_PREFIX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Temp File Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTempFileNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileProducerType_tempFileName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileProducerType_tempFileName_feature", "_UI_RemoteFileProducerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_PRODUCER_TYPE__TEMP_FILE_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Keep Last Modified feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKeepLastModifiedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileProducerType_keepLastModified_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileProducerType_keepLastModified_feature", "_UI_RemoteFileProducerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Eager Delete Target File feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEagerDeleteTargetFilePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileProducerType_eagerDeleteTargetFile_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileProducerType_eagerDeleteTargetFile_feature", "_UI_RemoteFileProducerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Done File Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDoneFileNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileProducerType_doneFileName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileProducerType_doneFileName_feature", "_UI_RemoteFileProducerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_PRODUCER_TYPE__DONE_FILE_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns RemoteFileProducerType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/RemoteFileProducerType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((RemoteFileProducerType)object).getTempFileName();
        return label == null || label.length() == 0 ?
            getString("_UI_RemoteFileProducerType_type") :
            getString("_UI_RemoteFileProducerType_type") + " " + label;
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

        switch (notification.getFeatureID(RemoteFileProducerType.class)) {
            case FtpPackage.REMOTE_FILE_PRODUCER_TYPE__FILE_EXIST:
            case FtpPackage.REMOTE_FILE_PRODUCER_TYPE__TEMP_PREFIX:
            case FtpPackage.REMOTE_FILE_PRODUCER_TYPE__TEMP_FILE_NAME:
            case FtpPackage.REMOTE_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED:
            case FtpPackage.REMOTE_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE:
            case FtpPackage.REMOTE_FILE_PRODUCER_TYPE__DONE_FILE_NAME:
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
