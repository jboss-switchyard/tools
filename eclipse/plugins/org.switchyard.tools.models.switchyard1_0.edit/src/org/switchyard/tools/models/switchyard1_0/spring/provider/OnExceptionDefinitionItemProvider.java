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

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.spring.OnExceptionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.OnExceptionDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OnExceptionDefinitionItemProvider
    extends ProcessorDefinitionItemProvider
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
    public OnExceptionDefinitionItemProvider(AdapterFactory adapterFactory) {
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

            addExceptionPropertyDescriptor(object);
            addOnRedeliveryRefPropertyDescriptor(object);
            addRedeliveryPolicyRefPropertyDescriptor(object);
            addUseOriginalMessagePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Exception feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExceptionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OnExceptionDefinition_exception_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OnExceptionDefinition_exception_feature", "_UI_OnExceptionDefinition_type"),
                 SpringPackage.eINSTANCE.getOnExceptionDefinition_Exception(),
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
                 getString("_UI_OnExceptionDefinition_onRedeliveryRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OnExceptionDefinition_onRedeliveryRef_feature", "_UI_OnExceptionDefinition_type"),
                 SpringPackage.eINSTANCE.getOnExceptionDefinition_OnRedeliveryRef(),
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
                 getString("_UI_OnExceptionDefinition_redeliveryPolicyRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OnExceptionDefinition_redeliveryPolicyRef_feature", "_UI_OnExceptionDefinition_type"),
                 SpringPackage.eINSTANCE.getOnExceptionDefinition_RedeliveryPolicyRef(),
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
                 getString("_UI_OnExceptionDefinition_useOriginalMessage_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OnExceptionDefinition_useOriginalMessage_feature", "_UI_OnExceptionDefinition_type"),
                 SpringPackage.eINSTANCE.getOnExceptionDefinition_UseOriginalMessage(),
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
            childrenFeatures.add(SpringPackage.eINSTANCE.getOnExceptionDefinition_OnWhen());
            childrenFeatures.add(SpringPackage.eINSTANCE.getOnExceptionDefinition_RetryWhile());
            childrenFeatures.add(SpringPackage.eINSTANCE.getOnExceptionDefinition_RedeliveryPolicy());
            childrenFeatures.add(SpringPackage.eINSTANCE.getOnExceptionDefinition_Handled());
            childrenFeatures.add(SpringPackage.eINSTANCE.getOnExceptionDefinition_Continued());
            childrenFeatures.add(SpringPackage.eINSTANCE.getOnExceptionDefinition_Group());
            childrenFeatures.add(SpringPackage.eINSTANCE.getOnExceptionDefinition_AnyAttribute1());
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
     * This returns OnExceptionDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/OnExceptionDefinition"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((OnExceptionDefinition)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_OnExceptionDefinition_type") :
            getString("_UI_OnExceptionDefinition_type") + " " + label;
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

        switch (notification.getFeatureID(OnExceptionDefinition.class)) {
            case SpringPackage.ON_EXCEPTION_DEFINITION__EXCEPTION:
            case SpringPackage.ON_EXCEPTION_DEFINITION__ON_REDELIVERY_REF:
            case SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY_REF:
            case SpringPackage.ON_EXCEPTION_DEFINITION__USE_ORIGINAL_MESSAGE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SpringPackage.ON_EXCEPTION_DEFINITION__ON_WHEN:
            case SpringPackage.ON_EXCEPTION_DEFINITION__RETRY_WHILE:
            case SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY:
            case SpringPackage.ON_EXCEPTION_DEFINITION__HANDLED:
            case SpringPackage.ON_EXCEPTION_DEFINITION__CONTINUED:
            case SpringPackage.ON_EXCEPTION_DEFINITION__GROUP:
            case SpringPackage.ON_EXCEPTION_DEFINITION__ANY_ATTRIBUTE1:
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
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_OnWhen(),
                 SpringFactory.eINSTANCE.createWhenDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_RetryWhile(),
                 SpringFactory.eINSTANCE.createExpressionSubElementDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_RedeliveryPolicy(),
                 SpringFactory.eINSTANCE.createRedeliveryPolicyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Handled(),
                 SpringFactory.eINSTANCE.createExpressionSubElementDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Continued(),
                 SpringFactory.eINSTANCE.createExpressionSubElementDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Aop(),
                     SpringFactory.eINSTANCE.createAopDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Aggregate(),
                     SpringFactory.eINSTANCE.createAggregateDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Bean(),
                     SpringFactory.eINSTANCE.createBeanDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_DoCatch(),
                     SpringFactory.eINSTANCE.createCatchDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_When(),
                     SpringFactory.eINSTANCE.createWhenDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Choice(),
                     SpringFactory.eINSTANCE.createChoiceDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Otherwise(),
                     SpringFactory.eINSTANCE.createOtherwiseDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_ConvertBodyTo(),
                     SpringFactory.eINSTANCE.createConvertBodyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Delay(),
                     SpringFactory.eINSTANCE.createDelayDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_DynamicRouter(),
                     SpringFactory.eINSTANCE.createDynamicRouterDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Enrich(),
                     SpringFactory.eINSTANCE.createEnrichDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Filter(),
                     SpringFactory.eINSTANCE.createFilterDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_DoFinally(),
                     SpringFactory.eINSTANCE.createFinallyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_IdempotentConsumer(),
                     SpringFactory.eINSTANCE.createIdempotentConsumerDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_InOnly(),
                     SpringFactory.eINSTANCE.createInOnlyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_InOut(),
                     SpringFactory.eINSTANCE.createInOutDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Intercept(),
                     SpringFactory.eINSTANCE.createInterceptDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Intercept(),
                     SpringFactory.eINSTANCE.createInterceptFromDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_InterceptFrom(),
                     SpringFactory.eINSTANCE.createInterceptFromDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_InterceptToEndpoint(),
                     SpringFactory.eINSTANCE.createInterceptSendToEndpointDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_LoadBalance(),
                     SpringFactory.eINSTANCE.createLoadBalanceDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Log(),
                     SpringFactory.eINSTANCE.createLogDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Loop(),
                     SpringFactory.eINSTANCE.createLoopDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Marshal(),
                     SpringFactory.eINSTANCE.createMarshalDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Multicast(),
                     SpringFactory.eINSTANCE.createMulticastDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_OnCompletion(),
                     SpringFactory.eINSTANCE.createOnCompletionDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_OnException(),
                     SpringFactory.eINSTANCE.createOnExceptionDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Pipeline(),
                     SpringFactory.eINSTANCE.createPipelineDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Policy(),
                     SpringFactory.eINSTANCE.createPolicyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_PollEnrich(),
                     SpringFactory.eINSTANCE.createPollEnrichDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Process(),
                     SpringFactory.eINSTANCE.createProcessDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_RecipientList(),
                     SpringFactory.eINSTANCE.createRecipientListDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_RemoveHeader(),
                     SpringFactory.eINSTANCE.createRemoveHeaderDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_RemoveHeaders(),
                     SpringFactory.eINSTANCE.createRemoveHeadersDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_RemoveProperty(),
                     SpringFactory.eINSTANCE.createRemovePropertyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Resequence(),
                     SpringFactory.eINSTANCE.createResequenceDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Rollback(),
                     SpringFactory.eINSTANCE.createRollbackDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Route(),
                     SpringFactory.eINSTANCE.createRouteDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_RoutingSlip(),
                     SpringFactory.eINSTANCE.createRoutingSlipDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Sample(),
                     SpringFactory.eINSTANCE.createSamplingDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_SetBody(),
                     SpringFactory.eINSTANCE.createSetBodyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_SetExchangePattern(),
                     SpringFactory.eINSTANCE.createSetExchangePatternDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_SetFaultBody(),
                     SpringFactory.eINSTANCE.createSetFaultBodyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_SetHeader(),
                     SpringFactory.eINSTANCE.createSetHeaderDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_SetOutHeader(),
                     SpringFactory.eINSTANCE.createSetOutHeaderDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_SetProperty(),
                     SpringFactory.eINSTANCE.createSetPropertyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Sort(),
                     SpringFactory.eINSTANCE.createSortDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Split(),
                     SpringFactory.eINSTANCE.createSplitDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Stop(),
                     SpringFactory.eINSTANCE.createStopDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Threads(),
                     SpringFactory.eINSTANCE.createThreadsDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Throttle(),
                     SpringFactory.eINSTANCE.createThrottleDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_ThrowException(),
                     SpringFactory.eINSTANCE.createThrowExceptionDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_To(),
                     SpringFactory.eINSTANCE.createToDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Transacted(),
                     SpringFactory.eINSTANCE.createTransactedDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Transform(),
                     SpringFactory.eINSTANCE.createTransformDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_DoTry(),
                     SpringFactory.eINSTANCE.createTryDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Unmarshal(),
                     SpringFactory.eINSTANCE.createUnmarshalDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_Validate(),
                     SpringFactory.eINSTANCE.createValidateDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnExceptionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnExceptionDefinition_WireTap(),
                     SpringFactory.eINSTANCE.createWireTapDefinition())));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
            FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
            childFeature = entry.getEStructuralFeature();
            childObject = entry.getValue();
        }

        boolean qualify =
            childFeature == SpringPackage.eINSTANCE.getOnExceptionDefinition_OnWhen() ||
            childFeature == SpringPackage.eINSTANCE.getOnExceptionDefinition_When() ||
            childFeature == SpringPackage.eINSTANCE.getOnExceptionDefinition_RetryWhile() ||
            childFeature == SpringPackage.eINSTANCE.getOnExceptionDefinition_Handled() ||
            childFeature == SpringPackage.eINSTANCE.getOnExceptionDefinition_Continued() ||
            childFeature == SpringPackage.eINSTANCE.getOnExceptionDefinition_Intercept() ||
            childFeature == SpringPackage.eINSTANCE.getOnExceptionDefinition_InterceptFrom();

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
