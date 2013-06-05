/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mail.provider;


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

import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelMailConsumerTypeItemProvider
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
    public CamelMailConsumerTypeItemProvider(AdapterFactory adapterFactory) {
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

            addInitialDelayPropertyDescriptor(object);
            addDelayPropertyDescriptor(object);
            addUseFixedDelayPropertyDescriptor(object);
            addSendEmptyMessageWhenIdlePropertyDescriptor(object);
            addTimeUnitPropertyDescriptor(object);
            addMaxMessagesPerPollPropertyDescriptor(object);
            addFolderNamePropertyDescriptor(object);
            addFetchSizePropertyDescriptor(object);
            addUnseenPropertyDescriptor(object);
            addDeletePropertyDescriptor(object);
            addCopyToPropertyDescriptor(object);
            addDisconnectPropertyDescriptor(object);
            addAccountTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Initial Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitialDelayPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailConsumerType_initialDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailConsumerType_initialDelay_feature", "_UI_CamelMailConsumerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE__INITIAL_DELAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDelayPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailConsumerType_delay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailConsumerType_delay_feature", "_UI_CamelMailConsumerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE__DELAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Use Fixed Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseFixedDelayPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailConsumerType_useFixedDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailConsumerType_useFixedDelay_feature", "_UI_CamelMailConsumerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE__USE_FIXED_DELAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Send Empty Message When Idle feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSendEmptyMessageWhenIdlePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailConsumerType_sendEmptyMessageWhenIdle_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailConsumerType_sendEmptyMessageWhenIdle_feature", "_UI_CamelMailConsumerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Time Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimeUnitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailConsumerType_timeUnit_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailConsumerType_timeUnit_feature", "_UI_CamelMailConsumerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE__TIME_UNIT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Messages Per Poll feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxMessagesPerPollPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailConsumerType_maxMessagesPerPoll_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailConsumerType_maxMessagesPerPoll_feature", "_UI_CamelMailConsumerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Folder Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFolderNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailConsumerType_folderName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailConsumerType_folderName_feature", "_UI_CamelMailConsumerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Fetch Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFetchSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailConsumerType_fetchSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailConsumerType_fetchSize_feature", "_UI_CamelMailConsumerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Unseen feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnseenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailConsumerType_unseen_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailConsumerType_unseen_feature", "_UI_CamelMailConsumerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Delete feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDeletePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailConsumerType_delete_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailConsumerType_delete_feature", "_UI_CamelMailConsumerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE__DELETE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Copy To feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCopyToPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailConsumerType_copyTo_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailConsumerType_copyTo_feature", "_UI_CamelMailConsumerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE__COPY_TO,
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
                 getString("_UI_CamelMailConsumerType_disconnect_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailConsumerType_disconnect_feature", "_UI_CamelMailConsumerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Account Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAccountTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailConsumerType_accountType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailConsumerType_accountType_feature", "_UI_CamelMailConsumerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CamelMailConsumerType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelMailConsumerType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelMailConsumerType)object).getFolderName();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelMailConsumerType_type") :
            getString("_UI_CamelMailConsumerType_type") + " " + label;
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

        switch (notification.getFeatureID(CamelMailConsumerType.class)) {
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__INITIAL_DELAY:
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELAY:
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__USE_FIXED_DELAY:
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__TIME_UNIT:
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME:
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE:
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN:
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELETE:
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__COPY_TO:
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT:
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE:
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
