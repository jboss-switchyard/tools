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

import org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelContextFactoryBeanItemProvider
    extends AbstractCamelContextFactoryBeanItemProvider
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
    public CamelContextFactoryBeanItemProvider(AdapterFactory adapterFactory) {
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

            addPackagePropertyDescriptor(object);
            addAutoStartupPropertyDescriptor(object);
            addDelayerPropertyDescriptor(object);
            addDependsOnPropertyDescriptor(object);
            addErrorHandlerRefPropertyDescriptor(object);
            addHandleFaultPropertyDescriptor(object);
            addLazyLoadTypeConvertersPropertyDescriptor(object);
            addShutdownRoutePropertyDescriptor(object);
            addShutdownRunningTaskPropertyDescriptor(object);
            addStreamCachePropertyDescriptor(object);
            addTracePropertyDescriptor(object);
            addUseBreadcrumbPropertyDescriptor(object);
            addUseMDCLoggingPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Package feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPackagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelContextFactoryBean_package_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelContextFactoryBean_package_feature", "_UI_CamelContextFactoryBean_type"),
                 SpringPackage.eINSTANCE.getCamelContextFactoryBean_Package(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Auto Startup feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAutoStartupPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelContextFactoryBean_autoStartup_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelContextFactoryBean_autoStartup_feature", "_UI_CamelContextFactoryBean_type"),
                 SpringPackage.eINSTANCE.getCamelContextFactoryBean_AutoStartup(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Delayer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDelayerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelContextFactoryBean_delayer_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelContextFactoryBean_delayer_feature", "_UI_CamelContextFactoryBean_type"),
                 SpringPackage.eINSTANCE.getCamelContextFactoryBean_Delayer(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Depends On feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDependsOnPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelContextFactoryBean_dependsOn_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelContextFactoryBean_dependsOn_feature", "_UI_CamelContextFactoryBean_type"),
                 SpringPackage.eINSTANCE.getCamelContextFactoryBean_DependsOn(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Error Handler Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addErrorHandlerRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelContextFactoryBean_errorHandlerRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelContextFactoryBean_errorHandlerRef_feature", "_UI_CamelContextFactoryBean_type"),
                 SpringPackage.eINSTANCE.getCamelContextFactoryBean_ErrorHandlerRef(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Handle Fault feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHandleFaultPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelContextFactoryBean_handleFault_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelContextFactoryBean_handleFault_feature", "_UI_CamelContextFactoryBean_type"),
                 SpringPackage.eINSTANCE.getCamelContextFactoryBean_HandleFault(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Lazy Load Type Converters feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLazyLoadTypeConvertersPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelContextFactoryBean_lazyLoadTypeConverters_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelContextFactoryBean_lazyLoadTypeConverters_feature", "_UI_CamelContextFactoryBean_type"),
                 SpringPackage.eINSTANCE.getCamelContextFactoryBean_LazyLoadTypeConverters(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Shutdown Route feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShutdownRoutePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelContextFactoryBean_shutdownRoute_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelContextFactoryBean_shutdownRoute_feature", "_UI_CamelContextFactoryBean_type"),
                 SpringPackage.eINSTANCE.getCamelContextFactoryBean_ShutdownRoute(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Shutdown Running Task feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShutdownRunningTaskPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelContextFactoryBean_shutdownRunningTask_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelContextFactoryBean_shutdownRunningTask_feature", "_UI_CamelContextFactoryBean_type"),
                 SpringPackage.eINSTANCE.getCamelContextFactoryBean_ShutdownRunningTask(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Stream Cache feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStreamCachePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelContextFactoryBean_streamCache_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelContextFactoryBean_streamCache_feature", "_UI_CamelContextFactoryBean_type"),
                 SpringPackage.eINSTANCE.getCamelContextFactoryBean_StreamCache(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Trace feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTracePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelContextFactoryBean_trace_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelContextFactoryBean_trace_feature", "_UI_CamelContextFactoryBean_type"),
                 SpringPackage.eINSTANCE.getCamelContextFactoryBean_Trace(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Use Breadcrumb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseBreadcrumbPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelContextFactoryBean_useBreadcrumb_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelContextFactoryBean_useBreadcrumb_feature", "_UI_CamelContextFactoryBean_type"),
                 SpringPackage.eINSTANCE.getCamelContextFactoryBean_UseBreadcrumb(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Use MDC Logging feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseMDCLoggingPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelContextFactoryBean_useMDCLogging_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelContextFactoryBean_useMDCLogging_feature", "_UI_CamelContextFactoryBean_type"),
                 SpringPackage.eINSTANCE.getCamelContextFactoryBean_UseMDCLogging(),
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
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_Properties());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_PropertyPlaceholder());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_PackageScan());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_ContextScan());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_JmxAgent());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_Group());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_RouteBuilder());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_RouteContextRef());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_ThreadPoolProfile());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_ThreadPool());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_Endpoint());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_DataFormats());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_RedeliveryPolicyProfile());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_OnException());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_OnCompletion());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_Intercept());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_InterceptFrom());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_InterceptSendToEndpoint());
            childrenFeatures.add(SpringPackage.eINSTANCE.getCamelContextFactoryBean_Route());
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
     * This returns CamelContextFactoryBean.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelContextFactoryBean"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelContextFactoryBean)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelContextFactoryBean_type") :
            getString("_UI_CamelContextFactoryBean_type") + " " + label;
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

        switch (notification.getFeatureID(CamelContextFactoryBean.class)) {
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTO_STARTUP:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DELAYER:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEPENDS_ON:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER_REF:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__HANDLE_FAULT:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LAZY_LOAD_TYPE_CONVERTERS:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_ROUTE:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_RUNNING_TASK:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHE:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_BREADCRUMB:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_MDC_LOGGING:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTIES:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GROUP:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_BUILDER:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTEXT_REF:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL_PROFILE:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ENDPOINT:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REDELIVERY_POLICY_PROFILE:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_EXCEPTION:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_COMPLETION:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_FROM:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_SEND_TO_ENDPOINT:
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE:
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
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_Properties(),
                 SpringFactory.eINSTANCE.createPropertiesDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_PropertyPlaceholder(),
                 SpringFactory.eINSTANCE.createCamelPropertyPlaceholderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_PackageScan(),
                 SpringFactory.eINSTANCE.createPackageScanDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_ContextScan(),
                 SpringFactory.eINSTANCE.createContextScanDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_JmxAgent(),
                 SpringFactory.eINSTANCE.createCamelJMXAgentDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getCamelContextFactoryBean_Template(),
                     SpringFactory.eINSTANCE.createCamelProducerTemplateFactoryBean())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getCamelContextFactoryBean_ConsumerTemplate(),
                     SpringFactory.eINSTANCE.createCamelConsumerTemplateFactoryBean())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getCamelContextFactoryBean_Proxy(),
                     SpringFactory.eINSTANCE.createCamelProxyFactoryDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getCamelContextFactoryBean_Export(),
                     SpringFactory.eINSTANCE.createCamelServiceExporterDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getCamelContextFactoryBean_ErrorHandler(),
                     SpringFactory.eINSTANCE.createErrorHandlerDefinition())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_RouteBuilder(),
                 SpringFactory.eINSTANCE.createRouteBuilderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_RouteContextRef(),
                 SpringFactory.eINSTANCE.createRouteContextRefDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_ThreadPoolProfile(),
                 SpringFactory.eINSTANCE.createThreadPoolProfileDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_ThreadPool(),
                 SpringFactory.eINSTANCE.createCamelThreadPoolFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_Endpoint(),
                 SpringFactory.eINSTANCE.createCamelEndpointFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_DataFormats(),
                 SpringFactory.eINSTANCE.createDataFormatsDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_RedeliveryPolicyProfile(),
                 SpringFactory.eINSTANCE.createCamelRedeliveryPolicyFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_OnException(),
                 SpringFactory.eINSTANCE.createOnExceptionDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_OnCompletion(),
                 SpringFactory.eINSTANCE.createOnCompletionDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_Intercept(),
                 SpringFactory.eINSTANCE.createInterceptDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_Intercept(),
                 SpringFactory.eINSTANCE.createInterceptFromDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_InterceptFrom(),
                 SpringFactory.eINSTANCE.createInterceptFromDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_InterceptSendToEndpoint(),
                 SpringFactory.eINSTANCE.createInterceptSendToEndpointDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getCamelContextFactoryBean_Route(),
                 SpringFactory.eINSTANCE.createRouteDefinition()));
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
            childFeature == SpringPackage.eINSTANCE.getCamelContextFactoryBean_Intercept() ||
            childFeature == SpringPackage.eINSTANCE.getCamelContextFactoryBean_InterceptFrom();

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
