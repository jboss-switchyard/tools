/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.provider;


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

import org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorHandlerDefinitionItemProvider
    extends IdentifiedTypeItemProvider
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
    public ErrorHandlerDefinitionItemProvider(AdapterFactory adapterFactory) {
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

            addDeadLetterUriPropertyDescriptor(object);
            addExecutorServiceRefPropertyDescriptor(object);
            addLevelPropertyDescriptor(object);
            addLogNamePropertyDescriptor(object);
            addOnRedeliveryRefPropertyDescriptor(object);
            addRedeliveryPolicyRefPropertyDescriptor(object);
            addRetryWhileRefPropertyDescriptor(object);
            addRollbackLoggingLevelPropertyDescriptor(object);
            addTransactionManagerRefPropertyDescriptor(object);
            addTransactionTemplateRefPropertyDescriptor(object);
            addTypePropertyDescriptor(object);
            addUseOriginalMessagePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dead Letter Uri feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDeadLetterUriPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ErrorHandlerDefinition_deadLetterUri_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ErrorHandlerDefinition_deadLetterUri_feature", "_UI_ErrorHandlerDefinition_type"),
                 SpringPackage.eINSTANCE.getErrorHandlerDefinition_DeadLetterUri(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Executor Service Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecutorServiceRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ErrorHandlerDefinition_executorServiceRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ErrorHandlerDefinition_executorServiceRef_feature", "_UI_ErrorHandlerDefinition_type"),
                 SpringPackage.eINSTANCE.getErrorHandlerDefinition_ExecutorServiceRef(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Level feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLevelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ErrorHandlerDefinition_level_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ErrorHandlerDefinition_level_feature", "_UI_ErrorHandlerDefinition_type"),
                 SpringPackage.eINSTANCE.getErrorHandlerDefinition_Level(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Log Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ErrorHandlerDefinition_logName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ErrorHandlerDefinition_logName_feature", "_UI_ErrorHandlerDefinition_type"),
                 SpringPackage.eINSTANCE.getErrorHandlerDefinition_LogName(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the On Redelivery Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOnRedeliveryRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ErrorHandlerDefinition_onRedeliveryRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ErrorHandlerDefinition_onRedeliveryRef_feature", "_UI_ErrorHandlerDefinition_type"),
                 SpringPackage.eINSTANCE.getErrorHandlerDefinition_OnRedeliveryRef(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Redelivery Policy Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRedeliveryPolicyRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ErrorHandlerDefinition_redeliveryPolicyRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ErrorHandlerDefinition_redeliveryPolicyRef_feature", "_UI_ErrorHandlerDefinition_type"),
                 SpringPackage.eINSTANCE.getErrorHandlerDefinition_RedeliveryPolicyRef(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Retry While Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRetryWhileRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ErrorHandlerDefinition_retryWhileRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ErrorHandlerDefinition_retryWhileRef_feature", "_UI_ErrorHandlerDefinition_type"),
                 SpringPackage.eINSTANCE.getErrorHandlerDefinition_RetryWhileRef(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Rollback Logging Level feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRollbackLoggingLevelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ErrorHandlerDefinition_rollbackLoggingLevel_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ErrorHandlerDefinition_rollbackLoggingLevel_feature", "_UI_ErrorHandlerDefinition_type"),
                 SpringPackage.eINSTANCE.getErrorHandlerDefinition_RollbackLoggingLevel(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Transaction Manager Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransactionManagerRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ErrorHandlerDefinition_transactionManagerRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ErrorHandlerDefinition_transactionManagerRef_feature", "_UI_ErrorHandlerDefinition_type"),
                 SpringPackage.eINSTANCE.getErrorHandlerDefinition_TransactionManagerRef(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Transaction Template Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransactionTemplateRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ErrorHandlerDefinition_transactionTemplateRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ErrorHandlerDefinition_transactionTemplateRef_feature", "_UI_ErrorHandlerDefinition_type"),
                 SpringPackage.eINSTANCE.getErrorHandlerDefinition_TransactionTemplateRef(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ErrorHandlerDefinition_type_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ErrorHandlerDefinition_type_feature", "_UI_ErrorHandlerDefinition_type"),
                 SpringPackage.eINSTANCE.getErrorHandlerDefinition_Type(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Use Original Message feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseOriginalMessagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ErrorHandlerDefinition_useOriginalMessage_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ErrorHandlerDefinition_useOriginalMessage_feature", "_UI_ErrorHandlerDefinition_type"),
                 SpringPackage.eINSTANCE.getErrorHandlerDefinition_UseOriginalMessage(),
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
            childrenFeatures.add(SpringPackage.eINSTANCE.getErrorHandlerDefinition_RedeliveryPolicy());
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
     * This returns ErrorHandlerDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ErrorHandlerDefinition"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ErrorHandlerDefinition)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_ErrorHandlerDefinition_type") :
            getString("_UI_ErrorHandlerDefinition_type") + " " + label;
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

        switch (notification.getFeatureID(ErrorHandlerDefinition.class)) {
            case SpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_URI:
            case SpringPackage.ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF:
            case SpringPackage.ERROR_HANDLER_DEFINITION__LEVEL:
            case SpringPackage.ERROR_HANDLER_DEFINITION__LOG_NAME:
            case SpringPackage.ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF:
            case SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF:
            case SpringPackage.ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF:
            case SpringPackage.ERROR_HANDLER_DEFINITION__ROLLBACK_LOGGING_LEVEL:
            case SpringPackage.ERROR_HANDLER_DEFINITION__TRANSACTION_MANAGER_REF:
            case SpringPackage.ERROR_HANDLER_DEFINITION__TRANSACTION_TEMPLATE_REF:
            case SpringPackage.ERROR_HANDLER_DEFINITION__TYPE:
            case SpringPackage.ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
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
                (SpringPackage.eINSTANCE.getErrorHandlerDefinition_RedeliveryPolicy(),
                 SpringFactory.eINSTANCE.createCamelRedeliveryPolicyFactoryBean()));
    }

}
