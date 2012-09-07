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

import org.switchyard.tools.models.switchyard1_0.spring.LoadBalanceDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.LoadBalanceDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadBalanceDefinitionItemProvider
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
    public LoadBalanceDefinitionItemProvider(AdapterFactory adapterFactory) {
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

            addRefPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_LoadBalanceDefinition_ref_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_LoadBalanceDefinition_ref_feature", "_UI_LoadBalanceDefinition_type"),
                 SpringPackage.eINSTANCE.getLoadBalanceDefinition_Ref(),
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
            childrenFeatures.add(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Failover());
            childrenFeatures.add(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Random());
            childrenFeatures.add(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Custom());
            childrenFeatures.add(SpringPackage.eINSTANCE.getLoadBalanceDefinition_RoundRobin());
            childrenFeatures.add(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Sticky());
            childrenFeatures.add(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Topic());
            childrenFeatures.add(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Weighted());
            childrenFeatures.add(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group());
            childrenFeatures.add(SpringPackage.eINSTANCE.getLoadBalanceDefinition_AnyAttribute1());
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
     * This returns LoadBalanceDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/LoadBalanceDefinition"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((LoadBalanceDefinition)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_LoadBalanceDefinition_type") :
            getString("_UI_LoadBalanceDefinition_type") + " " + label;
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

        switch (notification.getFeatureID(LoadBalanceDefinition.class)) {
            case SpringPackage.LOAD_BALANCE_DEFINITION__REF:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SpringPackage.LOAD_BALANCE_DEFINITION__FAILOVER:
            case SpringPackage.LOAD_BALANCE_DEFINITION__RANDOM:
            case SpringPackage.LOAD_BALANCE_DEFINITION__CUSTOM:
            case SpringPackage.LOAD_BALANCE_DEFINITION__ROUND_ROBIN:
            case SpringPackage.LOAD_BALANCE_DEFINITION__STICKY:
            case SpringPackage.LOAD_BALANCE_DEFINITION__TOPIC:
            case SpringPackage.LOAD_BALANCE_DEFINITION__WEIGHTED:
            case SpringPackage.LOAD_BALANCE_DEFINITION__GROUP:
            case SpringPackage.LOAD_BALANCE_DEFINITION__ANY_ATTRIBUTE1:
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
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Failover(),
                 SpringFactory.eINSTANCE.createFailoverLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Random(),
                 SpringFactory.eINSTANCE.createRandomLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Custom(),
                 SpringFactory.eINSTANCE.createCustomLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_RoundRobin(),
                 SpringFactory.eINSTANCE.createRoundRobinLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Sticky(),
                 SpringFactory.eINSTANCE.createStickyLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Topic(),
                 SpringFactory.eINSTANCE.createTopicLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Weighted(),
                 SpringFactory.eINSTANCE.createWeightedLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Aop(),
                     SpringFactory.eINSTANCE.createAopDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Aggregate(),
                     SpringFactory.eINSTANCE.createAggregateDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Bean(),
                     SpringFactory.eINSTANCE.createBeanDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_DoCatch(),
                     SpringFactory.eINSTANCE.createCatchDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_When(),
                     SpringFactory.eINSTANCE.createWhenDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Choice(),
                     SpringFactory.eINSTANCE.createChoiceDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Otherwise(),
                     SpringFactory.eINSTANCE.createOtherwiseDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_ConvertBodyTo(),
                     SpringFactory.eINSTANCE.createConvertBodyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Delay(),
                     SpringFactory.eINSTANCE.createDelayDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_DynamicRouter(),
                     SpringFactory.eINSTANCE.createDynamicRouterDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Enrich(),
                     SpringFactory.eINSTANCE.createEnrichDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Filter(),
                     SpringFactory.eINSTANCE.createFilterDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_DoFinally(),
                     SpringFactory.eINSTANCE.createFinallyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_IdempotentConsumer(),
                     SpringFactory.eINSTANCE.createIdempotentConsumerDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_InOnly(),
                     SpringFactory.eINSTANCE.createInOnlyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_InOut(),
                     SpringFactory.eINSTANCE.createInOutDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Intercept(),
                     SpringFactory.eINSTANCE.createInterceptDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Intercept(),
                     SpringFactory.eINSTANCE.createInterceptFromDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_InterceptFrom(),
                     SpringFactory.eINSTANCE.createInterceptFromDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_InterceptToEndpoint(),
                     SpringFactory.eINSTANCE.createInterceptSendToEndpointDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_LoadBalance(),
                     SpringFactory.eINSTANCE.createLoadBalanceDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Log(),
                     SpringFactory.eINSTANCE.createLogDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Loop(),
                     SpringFactory.eINSTANCE.createLoopDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Marshal(),
                     SpringFactory.eINSTANCE.createMarshalDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Multicast(),
                     SpringFactory.eINSTANCE.createMulticastDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_OnCompletion(),
                     SpringFactory.eINSTANCE.createOnCompletionDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_OnException(),
                     SpringFactory.eINSTANCE.createOnExceptionDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Pipeline(),
                     SpringFactory.eINSTANCE.createPipelineDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Policy(),
                     SpringFactory.eINSTANCE.createPolicyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_PollEnrich(),
                     SpringFactory.eINSTANCE.createPollEnrichDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Process(),
                     SpringFactory.eINSTANCE.createProcessDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_RecipientList(),
                     SpringFactory.eINSTANCE.createRecipientListDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_RemoveHeader(),
                     SpringFactory.eINSTANCE.createRemoveHeaderDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_RemoveHeaders(),
                     SpringFactory.eINSTANCE.createRemoveHeadersDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_RemoveProperty(),
                     SpringFactory.eINSTANCE.createRemovePropertyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Resequence(),
                     SpringFactory.eINSTANCE.createResequenceDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Rollback(),
                     SpringFactory.eINSTANCE.createRollbackDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Route(),
                     SpringFactory.eINSTANCE.createRouteDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_RoutingSlip(),
                     SpringFactory.eINSTANCE.createRoutingSlipDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Sample(),
                     SpringFactory.eINSTANCE.createSamplingDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_SetBody(),
                     SpringFactory.eINSTANCE.createSetBodyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_SetExchangePattern(),
                     SpringFactory.eINSTANCE.createSetExchangePatternDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_SetFaultBody(),
                     SpringFactory.eINSTANCE.createSetFaultBodyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_SetHeader(),
                     SpringFactory.eINSTANCE.createSetHeaderDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_SetOutHeader(),
                     SpringFactory.eINSTANCE.createSetOutHeaderDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_SetProperty(),
                     SpringFactory.eINSTANCE.createSetPropertyDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Sort(),
                     SpringFactory.eINSTANCE.createSortDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Split(),
                     SpringFactory.eINSTANCE.createSplitDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Stop(),
                     SpringFactory.eINSTANCE.createStopDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Threads(),
                     SpringFactory.eINSTANCE.createThreadsDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Throttle(),
                     SpringFactory.eINSTANCE.createThrottleDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_ThrowException(),
                     SpringFactory.eINSTANCE.createThrowExceptionDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_To(),
                     SpringFactory.eINSTANCE.createToDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Transacted(),
                     SpringFactory.eINSTANCE.createTransactedDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Transform(),
                     SpringFactory.eINSTANCE.createTransformDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_DoTry(),
                     SpringFactory.eINSTANCE.createTryDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Unmarshal(),
                     SpringFactory.eINSTANCE.createUnmarshalDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Validate(),
                     SpringFactory.eINSTANCE.createValidateDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getLoadBalanceDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getLoadBalanceDefinition_WireTap(),
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
            childFeature == SpringPackage.eINSTANCE.getLoadBalanceDefinition_Intercept() ||
            childFeature == SpringPackage.eINSTANCE.getLoadBalanceDefinition_InterceptFrom();

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
