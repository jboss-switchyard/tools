/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
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

import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JpaConsumerTypeItemProvider
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

            addInitialDelayPropertyDescriptor(object);
            addDelayPropertyDescriptor(object);
            addUseFixedDelayPropertyDescriptor(object);
            addSendEmptyMessageWhenIdlePropertyDescriptor(object);
            addTimeUnitPropertyDescriptor(object);
            addMaxMessagesPerPollPropertyDescriptor(object);
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
                 getString("_UI_JpaConsumerType_initialDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JpaConsumerType_initialDelay_feature", "_UI_JpaConsumerType_type"),
                 JpaPackage.Literals.JPA_CONSUMER_TYPE__INITIAL_DELAY,
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
                 getString("_UI_JpaConsumerType_delay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JpaConsumerType_delay_feature", "_UI_JpaConsumerType_type"),
                 JpaPackage.Literals.JPA_CONSUMER_TYPE__DELAY,
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
                 getString("_UI_JpaConsumerType_useFixedDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JpaConsumerType_useFixedDelay_feature", "_UI_JpaConsumerType_type"),
                 JpaPackage.Literals.JPA_CONSUMER_TYPE__USE_FIXED_DELAY,
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
                 getString("_UI_JpaConsumerType_sendEmptyMessageWhenIdle_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JpaConsumerType_sendEmptyMessageWhenIdle_feature", "_UI_JpaConsumerType_type"),
                 JpaPackage.Literals.JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE,
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
                 getString("_UI_JpaConsumerType_timeUnit_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JpaConsumerType_timeUnit_feature", "_UI_JpaConsumerType_type"),
                 JpaPackage.Literals.JPA_CONSUMER_TYPE__TIME_UNIT,
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
                 getString("_UI_JpaConsumerType_maxMessagesPerPoll_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JpaConsumerType_maxMessagesPerPoll_feature", "_UI_JpaConsumerType_type"),
                 JpaPackage.Literals.JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
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
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(JpaPackage.Literals.JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE);
            childrenFeatures.add(JpaPackage.Literals.JPA_CONSUMER_TYPE__SCHEDULED_BATCH_POLL_CONSUMER_TYPE);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
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
            case JpaPackage.JPA_CONSUMER_TYPE__INITIAL_DELAY:
            case JpaPackage.JPA_CONSUMER_TYPE__DELAY:
            case JpaPackage.JPA_CONSUMER_TYPE__USE_FIXED_DELAY:
            case JpaPackage.JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
            case JpaPackage.JPA_CONSUMER_TYPE__TIME_UNIT:
            case JpaPackage.JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
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
            case JpaPackage.JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE:
            case JpaPackage.JPA_CONSUMER_TYPE__SCHEDULED_BATCH_POLL_CONSUMER_TYPE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

        newChildDescriptors.add
            (createChildParameter
                (JpaPackage.Literals.JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE,
                 FeatureMapUtil.createEntry
                    (JpaPackage.Literals.JPA_CONSUMER_TYPE__INITIAL_DELAY,
                     SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.Literals.PROP_INTEGER, "1000"))));

        newChildDescriptors.add
            (createChildParameter
                (JpaPackage.Literals.JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE,
                 FeatureMapUtil.createEntry
                    (JpaPackage.Literals.JPA_CONSUMER_TYPE__DELAY,
                     SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.Literals.PROP_INTEGER, "500"))));

        newChildDescriptors.add
            (createChildParameter
                (JpaPackage.Literals.JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE,
                 FeatureMapUtil.createEntry
                    (JpaPackage.Literals.JPA_CONSUMER_TYPE__USE_FIXED_DELAY,
                     XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, "false"))));

        newChildDescriptors.add
            (createChildParameter
                (JpaPackage.Literals.JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE,
                 FeatureMapUtil.createEntry
                    (JpaPackage.Literals.JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE,
                     XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, "false"))));

        newChildDescriptors.add
            (createChildParameter
                (JpaPackage.Literals.JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE,
                 FeatureMapUtil.createEntry
                    (JpaPackage.Literals.JPA_CONSUMER_TYPE__TIME_UNIT,
                     TimeUnitType.MILLISECONDS)));

        newChildDescriptors.add
            (createChildParameter
                (JpaPackage.Literals.JPA_CONSUMER_TYPE__SCHEDULED_BATCH_POLL_CONSUMER_TYPE,
                 FeatureMapUtil.createEntry
                    (JpaPackage.Literals.JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL,
                     SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.Literals.PROP_INTEGER, "0"))));
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
