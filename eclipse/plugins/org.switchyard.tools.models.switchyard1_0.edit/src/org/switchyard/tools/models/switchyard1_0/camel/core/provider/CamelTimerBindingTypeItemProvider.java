/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core.provider;


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

import org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelTimerBindingTypeItemProvider
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
    public CamelTimerBindingTypeItemProvider(AdapterFactory adapterFactory) {
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

            addCamelBindingNamePropertyDescriptor(object);
            addTimePropertyDescriptor(object);
            addPatternPropertyDescriptor(object);
            addPeriodPropertyDescriptor(object);
            addDelayPropertyDescriptor(object);
            addFixedRatePropertyDescriptor(object);
            addDaemonPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Camel Binding Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCamelBindingNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelTimerBindingType_camelBindingName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelTimerBindingType_camelBindingName_feature", "_UI_CamelTimerBindingType_type"),
                 CamelPackage.Literals.CAMEL_TIMER_BINDING_TYPE__CAMEL_BINDING_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelTimerBindingType_time_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelTimerBindingType_time_feature", "_UI_CamelTimerBindingType_type"),
                 CamelPackage.Literals.CAMEL_TIMER_BINDING_TYPE__TIME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Pattern feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPatternPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelTimerBindingType_pattern_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelTimerBindingType_pattern_feature", "_UI_CamelTimerBindingType_type"),
                 CamelPackage.Literals.CAMEL_TIMER_BINDING_TYPE__PATTERN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Period feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPeriodPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelTimerBindingType_period_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelTimerBindingType_period_feature", "_UI_CamelTimerBindingType_type"),
                 CamelPackage.Literals.CAMEL_TIMER_BINDING_TYPE__PERIOD,
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
                 getString("_UI_CamelTimerBindingType_delay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelTimerBindingType_delay_feature", "_UI_CamelTimerBindingType_type"),
                 CamelPackage.Literals.CAMEL_TIMER_BINDING_TYPE__DELAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Fixed Rate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFixedRatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelTimerBindingType_fixedRate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelTimerBindingType_fixedRate_feature", "_UI_CamelTimerBindingType_type"),
                 CamelPackage.Literals.CAMEL_TIMER_BINDING_TYPE__FIXED_RATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Daemon feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDaemonPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelTimerBindingType_daemon_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelTimerBindingType_daemon_feature", "_UI_CamelTimerBindingType_type"),
                 CamelPackage.Literals.CAMEL_TIMER_BINDING_TYPE__DAEMON,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CamelTimerBindingType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelTimerBindingType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelTimerBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelTimerBindingType_type") :
            getString("_UI_CamelTimerBindingType_type") + " " + label;
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

        switch (notification.getFeatureID(CamelTimerBindingType.class)) {
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__CAMEL_BINDING_NAME:
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__TIME:
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PATTERN:
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PERIOD:
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__DELAY:
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__FIXED_RATE:
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__DAEMON:
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
