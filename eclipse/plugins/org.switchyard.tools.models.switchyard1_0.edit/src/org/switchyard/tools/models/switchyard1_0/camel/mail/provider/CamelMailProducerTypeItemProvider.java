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

import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelMailProducerTypeItemProvider
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
    public CamelMailProducerTypeItemProvider(AdapterFactory adapterFactory) {
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

            addSubjectPropertyDescriptor(object);
            addFromPropertyDescriptor(object);
            addToPropertyDescriptor(object);
            addCCPropertyDescriptor(object);
            addBCCPropertyDescriptor(object);
            addReplyToPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Subject feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSubjectPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailProducerType_subject_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailProducerType_subject_feature", "_UI_CamelMailProducerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_PRODUCER_TYPE__SUBJECT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the From feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFromPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailProducerType_from_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailProducerType_from_feature", "_UI_CamelMailProducerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_PRODUCER_TYPE__FROM,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the To feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addToPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailProducerType_to_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailProducerType_to_feature", "_UI_CamelMailProducerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_PRODUCER_TYPE__TO,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the CC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCCPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailProducerType_CC_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailProducerType_CC_feature", "_UI_CamelMailProducerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_PRODUCER_TYPE__CC,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the BCC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBCCPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailProducerType_BCC_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailProducerType_BCC_feature", "_UI_CamelMailProducerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_PRODUCER_TYPE__BCC,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Reply To feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReplyToPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelMailProducerType_replyTo_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelMailProducerType_replyTo_feature", "_UI_CamelMailProducerType_type"),
                 MailPackage.Literals.CAMEL_MAIL_PRODUCER_TYPE__REPLY_TO,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CamelMailProducerType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelMailProducerType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelMailProducerType)object).getSubject();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelMailProducerType_type") :
            getString("_UI_CamelMailProducerType_type") + " " + label;
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

        switch (notification.getFeatureID(CamelMailProducerType.class)) {
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__SUBJECT:
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__FROM:
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__TO:
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__CC:
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__BCC:
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE__REPLY_TO:
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
