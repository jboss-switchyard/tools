/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelRemoteBindingTypeItemProvider
    extends GenericFileBindingTypeItemProvider
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
    public CamelRemoteBindingTypeItemProvider(AdapterFactory adapterFactory) {
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
                 getString("_UI_CamelRemoteBindingType_host_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelRemoteBindingType_host_feature", "_UI_CamelRemoteBindingType_type"),
                 CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__HOST,
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
                 getString("_UI_CamelRemoteBindingType_port_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelRemoteBindingType_port_feature", "_UI_CamelRemoteBindingType_type"),
                 CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__PORT,
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
                 getString("_UI_CamelRemoteBindingType_username_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelRemoteBindingType_username_feature", "_UI_CamelRemoteBindingType_type"),
                 CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__USERNAME,
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
                 getString("_UI_CamelRemoteBindingType_password_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelRemoteBindingType_password_feature", "_UI_CamelRemoteBindingType_type"),
                 CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__PASSWORD,
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
                 getString("_UI_CamelRemoteBindingType_binary_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelRemoteBindingType_binary_feature", "_UI_CamelRemoteBindingType_type"),
                 CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__BINARY,
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
                 getString("_UI_CamelRemoteBindingType_connectTimeout_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelRemoteBindingType_connectTimeout_feature", "_UI_CamelRemoteBindingType_type"),
                 CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT,
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
                 getString("_UI_CamelRemoteBindingType_disconnect_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelRemoteBindingType_disconnect_feature", "_UI_CamelRemoteBindingType_type"),
                 CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__DISCONNECT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_CamelRemoteBindingType_maximumReconnectAttempts_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelRemoteBindingType_maximumReconnectAttempts_feature", "_UI_CamelRemoteBindingType_type"),
                 CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS,
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
                 getString("_UI_CamelRemoteBindingType_reconnectDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelRemoteBindingType_reconnectDelay_feature", "_UI_CamelRemoteBindingType_type"),
                 CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY,
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
                 getString("_UI_CamelRemoteBindingType_separator_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelRemoteBindingType_separator_feature", "_UI_CamelRemoteBindingType_type"),
                 CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__SEPARATOR,
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
                 getString("_UI_CamelRemoteBindingType_stepwise_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelRemoteBindingType_stepwise_feature", "_UI_CamelRemoteBindingType_type"),
                 CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__STEPWISE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_CamelRemoteBindingType_throwExceptionOnConnectFailed_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelRemoteBindingType_throwExceptionOnConnectFailed_feature", "_UI_CamelRemoteBindingType_type"),
                 CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
            childrenFeatures.add(CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__CONSUME);
            childrenFeatures.add(CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__PRODUCE);
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
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelRemoteBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelRemoteBindingType_type") :
            getString("_UI_CamelRemoteBindingType_type") + " " + label;
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

        switch (notification.getFeatureID(CamelRemoteBindingType.class)) {
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__HOST:
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PORT:
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__USERNAME:
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PASSWORD:
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__BINARY:
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT:
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__DISCONNECT:
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY:
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__SEPARATOR:
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__STEPWISE:
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__CONSUME:
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PRODUCE:
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
                (CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__CONSUME,
                 CamelFactory.eINSTANCE.createRemoteFileConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE__PRODUCE,
                 CamelFactory.eINSTANCE.createRemoteFileProducerType()));
    }

}
