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

import org.switchyard.tools.models.switchyard1_0.spring.OnCompletionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.OnCompletionDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OnCompletionDefinitionItemProvider
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
    public OnCompletionDefinitionItemProvider(AdapterFactory adapterFactory) {
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

            addExecutorServiceRefPropertyDescriptor(object);
            addOnCompleteOnlyPropertyDescriptor(object);
            addOnFailureOnlyPropertyDescriptor(object);
            addUseOriginalMessagePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
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
                 getString("_UI_OnCompletionDefinition_executorServiceRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OnCompletionDefinition_executorServiceRef_feature", "_UI_OnCompletionDefinition_type"),
                 SpringPackage.eINSTANCE.getOnCompletionDefinition_ExecutorServiceRef(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the On Complete Only feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOnCompleteOnlyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OnCompletionDefinition_onCompleteOnly_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OnCompletionDefinition_onCompleteOnly_feature", "_UI_OnCompletionDefinition_type"),
                 SpringPackage.eINSTANCE.getOnCompletionDefinition_OnCompleteOnly(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the On Failure Only feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOnFailureOnlyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OnCompletionDefinition_onFailureOnly_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OnCompletionDefinition_onFailureOnly_feature", "_UI_OnCompletionDefinition_type"),
                 SpringPackage.eINSTANCE.getOnCompletionDefinition_OnFailureOnly(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
                 getString("_UI_OnCompletionDefinition_useOriginalMessage_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OnCompletionDefinition_useOriginalMessage_feature", "_UI_OnCompletionDefinition_type"),
                 SpringPackage.eINSTANCE.getOnCompletionDefinition_UseOriginalMessage(),
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
            childrenFeatures.add(SpringPackage.eINSTANCE.getOnCompletionDefinition_OnWhen());
            childrenFeatures.add(SpringPackage.eINSTANCE.getOnCompletionDefinition_Group());
            childrenFeatures.add(SpringPackage.eINSTANCE.getOnCompletionDefinition_AnyAttribute1());
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
     * This returns OnCompletionDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/OnCompletionDefinition"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((OnCompletionDefinition)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_OnCompletionDefinition_type") :
            getString("_UI_OnCompletionDefinition_type") + " " + label;
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

        switch (notification.getFeatureID(OnCompletionDefinition.class)) {
            case SpringPackage.ON_COMPLETION_DEFINITION__EXECUTOR_SERVICE_REF:
            case SpringPackage.ON_COMPLETION_DEFINITION__ON_COMPLETE_ONLY:
            case SpringPackage.ON_COMPLETION_DEFINITION__ON_FAILURE_ONLY:
            case SpringPackage.ON_COMPLETION_DEFINITION__USE_ORIGINAL_MESSAGE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SpringPackage.ON_COMPLETION_DEFINITION__ON_WHEN:
            case SpringPackage.ON_COMPLETION_DEFINITION__GROUP:
            case SpringPackage.ON_COMPLETION_DEFINITION__ANY_ATTRIBUTE1:
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
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_OnWhen(),
                 SpringFactory.eINSTANCE.createWhenDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Aop(),
                     SpringFactory.eINSTANCE.createAopDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Aggregate(),
                     SpringFactory.eINSTANCE.createAggregateDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Bean(),
                     SpringFactory.eINSTANCE.createBeanDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_DoCatch(),
                     SpringFactory.eINSTANCE.createCatchDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_When(),
                     SpringFactory.eINSTANCE.createWhenDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Choice(),
                     SpringFactory.eINSTANCE.createChoiceDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Otherwise(),
                     SpringFactory.eINSTANCE.createOtherwiseDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_ConvertBodyTo(),
                     SpringFactory.eINSTANCE.createConvertBodyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Delay(),
                     SpringFactory.eINSTANCE.createDelayDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_DynamicRouter(),
                     SpringFactory.eINSTANCE.createDynamicRouterDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Enrich(),
                     SpringFactory.eINSTANCE.createEnrichDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Filter(),
                     SpringFactory.eINSTANCE.createFilterDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_DoFinally(),
                     SpringFactory.eINSTANCE.createFinallyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_IdempotentConsumer(),
                     SpringFactory.eINSTANCE.createIdempotentConsumerDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_InOnly(),
                     SpringFactory.eINSTANCE.createInOnlyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_InOut(),
                     SpringFactory.eINSTANCE.createInOutDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Intercept(),
                     SpringFactory.eINSTANCE.createInterceptDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Intercept(),
                     SpringFactory.eINSTANCE.createInterceptFromDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_InterceptFrom(),
                     SpringFactory.eINSTANCE.createInterceptFromDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_InterceptToEndpoint(),
                     SpringFactory.eINSTANCE.createInterceptSendToEndpointDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_LoadBalance(),
                     SpringFactory.eINSTANCE.createLoadBalanceDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Log(),
                     SpringFactory.eINSTANCE.createLogDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Loop(),
                     SpringFactory.eINSTANCE.createLoopDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Marshal(),
                     SpringFactory.eINSTANCE.createMarshalDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Multicast(),
                     SpringFactory.eINSTANCE.createMulticastDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_OnCompletion(),
                     SpringFactory.eINSTANCE.createOnCompletionDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_OnException(),
                     SpringFactory.eINSTANCE.createOnExceptionDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Pipeline(),
                     SpringFactory.eINSTANCE.createPipelineDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Policy(),
                     SpringFactory.eINSTANCE.createPolicyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_PollEnrich(),
                     SpringFactory.eINSTANCE.createPollEnrichDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Process(),
                     SpringFactory.eINSTANCE.createProcessDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_RecipientList(),
                     SpringFactory.eINSTANCE.createRecipientListDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_RemoveHeader(),
                     SpringFactory.eINSTANCE.createRemoveHeaderDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_RemoveHeaders(),
                     SpringFactory.eINSTANCE.createRemoveHeadersDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_RemoveProperty(),
                     SpringFactory.eINSTANCE.createRemovePropertyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Resequence(),
                     SpringFactory.eINSTANCE.createResequenceDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Rollback(),
                     SpringFactory.eINSTANCE.createRollbackDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Route(),
                     SpringFactory.eINSTANCE.createRouteDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_RoutingSlip(),
                     SpringFactory.eINSTANCE.createRoutingSlipDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Sample(),
                     SpringFactory.eINSTANCE.createSamplingDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_SetBody(),
                     SpringFactory.eINSTANCE.createSetBodyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_SetExchangePattern(),
                     SpringFactory.eINSTANCE.createSetExchangePatternDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_SetFaultBody(),
                     SpringFactory.eINSTANCE.createSetFaultBodyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_SetHeader(),
                     SpringFactory.eINSTANCE.createSetHeaderDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_SetOutHeader(),
                     SpringFactory.eINSTANCE.createSetOutHeaderDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_SetProperty(),
                     SpringFactory.eINSTANCE.createSetPropertyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Sort(),
                     SpringFactory.eINSTANCE.createSortDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Split(),
                     SpringFactory.eINSTANCE.createSplitDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Stop(),
                     SpringFactory.eINSTANCE.createStopDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Threads(),
                     SpringFactory.eINSTANCE.createThreadsDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Throttle(),
                     SpringFactory.eINSTANCE.createThrottleDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_ThrowException(),
                     SpringFactory.eINSTANCE.createThrowExceptionDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_To(),
                     SpringFactory.eINSTANCE.createToDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Transacted(),
                     SpringFactory.eINSTANCE.createTransactedDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Transform(),
                     SpringFactory.eINSTANCE.createTransformDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_DoTry(),
                     SpringFactory.eINSTANCE.createTryDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Unmarshal(),
                     SpringFactory.eINSTANCE.createUnmarshalDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_Validate(),
                     SpringFactory.eINSTANCE.createValidateDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getOnCompletionDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getOnCompletionDefinition_WireTap(),
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
            childFeature == SpringPackage.eINSTANCE.getOnCompletionDefinition_OnWhen() ||
            childFeature == SpringPackage.eINSTANCE.getOnCompletionDefinition_When() ||
            childFeature == SpringPackage.eINSTANCE.getOnCompletionDefinition_Intercept() ||
            childFeature == SpringPackage.eINSTANCE.getOnCompletionDefinition_InterceptFrom();

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
