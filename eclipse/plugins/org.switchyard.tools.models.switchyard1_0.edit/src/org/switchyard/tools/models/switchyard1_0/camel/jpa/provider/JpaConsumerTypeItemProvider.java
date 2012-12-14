/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa.provider;


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

import org.switchyard.tools.models.switchyard1_0.camel.core.provider.ScheduledBatchPollConsumerTypeItemProvider;

import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JpaConsumerTypeItemProvider
    extends ScheduledBatchPollConsumerTypeItemProvider
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
    public JpaConsumerTypeItemProvider(AdapterFactory adapterFactory) {
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

            addConsumeDeletePropertyDescriptor(object);
            addConsumeLockEntityPropertyDescriptor(object);
            addMaximumResultsPropertyDescriptor(object);
            addConsumerQueryPropertyDescriptor(object);
            addConsumerNamedQueryPropertyDescriptor(object);
            addConsumerNativeQueryPropertyDescriptor(object);
            addConsumerResultClassPropertyDescriptor(object);
            addConsumerTransactedPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Consume Delete feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConsumeDeletePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JpaConsumerType_consumeDelete_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JpaConsumerType_consumeDelete_feature", "_UI_JpaConsumerType_type"),
                 JpaPackage.Literals.JPA_CONSUMER_TYPE__CONSUME_DELETE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Consume Lock Entity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConsumeLockEntityPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JpaConsumerType_consumeLockEntity_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JpaConsumerType_consumeLockEntity_feature", "_UI_JpaConsumerType_type"),
                 JpaPackage.Literals.JPA_CONSUMER_TYPE__CONSUME_LOCK_ENTITY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Maximum Results feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaximumResultsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JpaConsumerType_maximumResults_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JpaConsumerType_maximumResults_feature", "_UI_JpaConsumerType_type"),
                 JpaPackage.Literals.JPA_CONSUMER_TYPE__MAXIMUM_RESULTS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Consumer Query feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConsumerQueryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JpaConsumerType_consumerQuery_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JpaConsumerType_consumerQuery_feature", "_UI_JpaConsumerType_type"),
                 JpaPackage.Literals.JPA_CONSUMER_TYPE__CONSUMER_QUERY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Consumer Named Query feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConsumerNamedQueryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JpaConsumerType_consumerNamedQuery_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JpaConsumerType_consumerNamedQuery_feature", "_UI_JpaConsumerType_type"),
                 JpaPackage.Literals.JPA_CONSUMER_TYPE__CONSUMER_NAMED_QUERY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Consumer Native Query feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConsumerNativeQueryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JpaConsumerType_consumerNativeQuery_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JpaConsumerType_consumerNativeQuery_feature", "_UI_JpaConsumerType_type"),
                 JpaPackage.Literals.JPA_CONSUMER_TYPE__CONSUMER_NATIVE_QUERY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Consumer Result Class feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConsumerResultClassPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JpaConsumerType_consumerResultClass_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JpaConsumerType_consumerResultClass_feature", "_UI_JpaConsumerType_type"),
                 JpaPackage.Literals.JPA_CONSUMER_TYPE__CONSUMER_RESULT_CLASS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Consumer Transacted feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConsumerTransactedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JpaConsumerType_consumerTransacted_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JpaConsumerType_consumerTransacted_feature", "_UI_JpaConsumerType_type"),
                 JpaPackage.Literals.JPA_CONSUMER_TYPE__CONSUMER_TRANSACTED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns JpaConsumerType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/JpaConsumerType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((JpaConsumerType)object).getConsumerNamedQuery();
        return label == null || label.length() == 0 ?
            getString("_UI_JpaConsumerType_type") :
            getString("_UI_JpaConsumerType_type") + " " + label;
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

        switch (notification.getFeatureID(JpaConsumerType.class)) {
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUME_DELETE:
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUME_LOCK_ENTITY:
            case JpaPackage.JPA_CONSUMER_TYPE__MAXIMUM_RESULTS:
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_QUERY:
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_NAMED_QUERY:
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_NATIVE_QUERY:
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_RESULT_CLASS:
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_TRANSACTED:
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
