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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelJMXAgentDefinitionItemProvider
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
    public CamelJMXAgentDefinitionItemProvider(AdapterFactory adapterFactory) {
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

            addConnectorPortPropertyDescriptor(object);
            addCreateConnectorPropertyDescriptor(object);
            addDisabledPropertyDescriptor(object);
            addMbeanObjectDomainNamePropertyDescriptor(object);
            addMbeanServerDefaultDomainPropertyDescriptor(object);
            addOnlyRegisterProcessorWithCustomIdPropertyDescriptor(object);
            addRegisterAlwaysPropertyDescriptor(object);
            addRegisterNewRoutesPropertyDescriptor(object);
            addRegistryPortPropertyDescriptor(object);
            addServiceUrlPathPropertyDescriptor(object);
            addStatisticsLevelPropertyDescriptor(object);
            addUsePlatformMBeanServerPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Connector Port feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectorPortPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelJMXAgentDefinition_connectorPort_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJMXAgentDefinition_connectorPort_feature", "_UI_CamelJMXAgentDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelJMXAgentDefinition_ConnectorPort(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Create Connector feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCreateConnectorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelJMXAgentDefinition_createConnector_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJMXAgentDefinition_createConnector_feature", "_UI_CamelJMXAgentDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelJMXAgentDefinition_CreateConnector(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Disabled feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDisabledPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelJMXAgentDefinition_disabled_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJMXAgentDefinition_disabled_feature", "_UI_CamelJMXAgentDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelJMXAgentDefinition_Disabled(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Mbean Object Domain Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMbeanObjectDomainNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelJMXAgentDefinition_mbeanObjectDomainName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJMXAgentDefinition_mbeanObjectDomainName_feature", "_UI_CamelJMXAgentDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelJMXAgentDefinition_MbeanObjectDomainName(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Mbean Server Default Domain feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMbeanServerDefaultDomainPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelJMXAgentDefinition_mbeanServerDefaultDomain_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJMXAgentDefinition_mbeanServerDefaultDomain_feature", "_UI_CamelJMXAgentDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelJMXAgentDefinition_MbeanServerDefaultDomain(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Only Register Processor With Custom Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOnlyRegisterProcessorWithCustomIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelJMXAgentDefinition_onlyRegisterProcessorWithCustomId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJMXAgentDefinition_onlyRegisterProcessorWithCustomId_feature", "_UI_CamelJMXAgentDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelJMXAgentDefinition_OnlyRegisterProcessorWithCustomId(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Register Always feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRegisterAlwaysPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelJMXAgentDefinition_registerAlways_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJMXAgentDefinition_registerAlways_feature", "_UI_CamelJMXAgentDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelJMXAgentDefinition_RegisterAlways(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Register New Routes feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRegisterNewRoutesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelJMXAgentDefinition_registerNewRoutes_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJMXAgentDefinition_registerNewRoutes_feature", "_UI_CamelJMXAgentDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelJMXAgentDefinition_RegisterNewRoutes(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Registry Port feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRegistryPortPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelJMXAgentDefinition_registryPort_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJMXAgentDefinition_registryPort_feature", "_UI_CamelJMXAgentDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelJMXAgentDefinition_RegistryPort(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Service Url Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceUrlPathPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelJMXAgentDefinition_serviceUrlPath_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJMXAgentDefinition_serviceUrlPath_feature", "_UI_CamelJMXAgentDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelJMXAgentDefinition_ServiceUrlPath(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Statistics Level feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStatisticsLevelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelJMXAgentDefinition_statisticsLevel_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJMXAgentDefinition_statisticsLevel_feature", "_UI_CamelJMXAgentDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelJMXAgentDefinition_StatisticsLevel(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Use Platform MBean Server feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsePlatformMBeanServerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelJMXAgentDefinition_usePlatformMBeanServer_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJMXAgentDefinition_usePlatformMBeanServer_feature", "_UI_CamelJMXAgentDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelJMXAgentDefinition_UsePlatformMBeanServer(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CamelJMXAgentDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelJMXAgentDefinition"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelJMXAgentDefinition)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelJMXAgentDefinition_type") :
            getString("_UI_CamelJMXAgentDefinition_type") + " " + label;
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

        switch (notification.getFeatureID(CamelJMXAgentDefinition.class)) {
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__CONNECTOR_PORT:
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__CREATE_CONNECTOR:
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__DISABLED:
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_OBJECT_DOMAIN_NAME:
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_SERVER_DEFAULT_DOMAIN:
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID:
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_ALWAYS:
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_NEW_ROUTES:
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTRY_PORT:
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__SERVICE_URL_PATH:
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__STATISTICS_LEVEL:
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_PLATFORM_MBEAN_SERVER:
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
