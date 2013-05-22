/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQFactory;
import org.switchyard.tools.models.switchyard1_0.http.HttpFactory;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyFactory;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
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
    public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

            addBindingSwitchyardPropertyDescriptor(object);
            addResourcePropertyDescriptor(object);
            addTargetPropertyDescriptor(object);
            addTargetNamespacePropertyDescriptor(object);
            addClusteredPropertyDescriptor(object);
            addLoadBalancePropertyDescriptor(object);
            addSecurityAttrPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Binding Switchyard feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBindingSwitchyardPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_bindingSwitchyard_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_bindingSwitchyard_feature", "_UI_DocumentRoot_type"),
                 SwitchyardPackage.Literals.DOCUMENT_ROOT__BINDING_SWITCHYARD,
                 true,
                 false,
                 false,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Resource feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addResourcePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_resource_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_resource_feature", "_UI_DocumentRoot_type"),
                 SwitchyardPackage.Literals.DOCUMENT_ROOT__RESOURCE,
                 true,
                 false,
                 false,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Target feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_target_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_target_feature", "_UI_DocumentRoot_type"),
                 SwitchyardPackage.Literals.DOCUMENT_ROOT__TARGET,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Target Namespace feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetNamespacePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_targetNamespace_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_targetNamespace_feature", "_UI_DocumentRoot_type"),
                 SwitchyardPackage.Literals.DOCUMENT_ROOT__TARGET_NAMESPACE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Clustered feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addClusteredPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_clustered_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_clustered_feature", "_UI_DocumentRoot_type"),
                 SwitchyardPackage.Literals.DOCUMENT_ROOT__CLUSTERED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Load Balance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLoadBalancePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_loadBalance_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_loadBalance_feature", "_UI_DocumentRoot_type"),
                 SwitchyardPackage.Literals.DOCUMENT_ROOT__LOAD_BALANCE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Security Attr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSecurityAttrPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_securityAttr_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_securityAttr_feature", "_UI_DocumentRoot_type"),
                 SwitchyardPackage.Literals.DOCUMENT_ROOT__SECURITY_ATTR,
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
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__ARTIFACT);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__ARTIFACTS);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__DOMAIN);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__HANDLER);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__HANDLERS);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__INTERFACE_ESB);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__PROPERTIES);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__PROPERTY);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__SWITCHYARD);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__TRANSFORM);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__TRANSFORMS);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__VALIDATE);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__VALIDATES);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__OPERATION_SELECTOR_SWITCHYARD);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__JAVA_OPERATION_SELECTOR_SWITCHYARD);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__REGEX_OPERATION_SELECTOR_SWITCHYARD);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__XPATH_OPERATION_SELECTOR_SWITCHYARD);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR_SWITCHYARD);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__SECURITY);
            childrenFeatures.add(SwitchyardPackage.Literals.DOCUMENT_ROOT__SECURITIES);
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
     * This returns DocumentRoot.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((DocumentRoot)object).getTargetNamespace();
        return label == null || label.length() == 0 ?
            getString("_UI_DocumentRoot_type") :
            getString("_UI_DocumentRoot_type") + " " + label;
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

        switch (notification.getFeatureID(DocumentRoot.class)) {
            case SwitchyardPackage.DOCUMENT_ROOT__BINDING_SWITCHYARD:
            case SwitchyardPackage.DOCUMENT_ROOT__RESOURCE:
            case SwitchyardPackage.DOCUMENT_ROOT__TARGET:
            case SwitchyardPackage.DOCUMENT_ROOT__TARGET_NAMESPACE:
            case SwitchyardPackage.DOCUMENT_ROOT__CLUSTERED:
            case SwitchyardPackage.DOCUMENT_ROOT__LOAD_BALANCE:
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITY_ATTR:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__ARTIFACT:
            case SwitchyardPackage.DOCUMENT_ROOT__ARTIFACTS:
            case SwitchyardPackage.DOCUMENT_ROOT__DOMAIN:
            case SwitchyardPackage.DOCUMENT_ROOT__HANDLER:
            case SwitchyardPackage.DOCUMENT_ROOT__HANDLERS:
            case SwitchyardPackage.DOCUMENT_ROOT__INTERFACE_ESB:
            case SwitchyardPackage.DOCUMENT_ROOT__PROPERTIES:
            case SwitchyardPackage.DOCUMENT_ROOT__PROPERTY:
            case SwitchyardPackage.DOCUMENT_ROOT__SWITCHYARD:
            case SwitchyardPackage.DOCUMENT_ROOT__TRANSFORM:
            case SwitchyardPackage.DOCUMENT_ROOT__TRANSFORMS:
            case SwitchyardPackage.DOCUMENT_ROOT__VALIDATE:
            case SwitchyardPackage.DOCUMENT_ROOT__VALIDATES:
            case SwitchyardPackage.DOCUMENT_ROOT__OPERATION_SELECTOR_SWITCHYARD:
            case SwitchyardPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
            case SwitchyardPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
            case SwitchyardPackage.DOCUMENT_ROOT__JAVA_OPERATION_SELECTOR_SWITCHYARD:
            case SwitchyardPackage.DOCUMENT_ROOT__REGEX_OPERATION_SELECTOR_SWITCHYARD:
            case SwitchyardPackage.DOCUMENT_ROOT__XPATH_OPERATION_SELECTOR_SWITCHYARD:
            case SwitchyardPackage.DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR_SWITCHYARD:
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITY:
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITIES:
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
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__ARTIFACT,
                 SwitchyardFactory.eINSTANCE.createArtifactType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__ARTIFACTS,
                 SwitchyardFactory.eINSTANCE.createArtifactsType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__DOMAIN,
                 SwitchyardFactory.eINSTANCE.createDomainType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__HANDLER,
                 SwitchyardFactory.eINSTANCE.createHandlerType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__HANDLERS,
                 SwitchyardFactory.eINSTANCE.createHandlersType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__INTERFACE_ESB,
                 SwitchyardFactory.eINSTANCE.createEsbInterface()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__PROPERTIES,
                 SwitchyardFactory.eINSTANCE.createPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__PROPERTY,
                 SwitchyardFactory.eINSTANCE.createPropertyType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__SWITCHYARD,
                 SwitchyardFactory.eINSTANCE.createSwitchYardType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__TRANSFORMS,
                 SwitchyardFactory.eINSTANCE.createTransformsType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__VALIDATES,
                 SwitchyardFactory.eINSTANCE.createValidatesType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER,
                 SwitchyardFactory.eINSTANCE.createContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER,
                 HornetQFactory.eINSTANCE.createHornetQContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER,
                 SOAPFactory.eINSTANCE.createContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER,
                 JcaFactory.eINSTANCE.createJCAContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER,
                 ResteasyFactory.eINSTANCE.createRESTContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER,
                 HttpFactory.eINSTANCE.createHttpContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER,
                 SwitchyardFactory.eINSTANCE.createMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER,
                 HornetQFactory.eINSTANCE.createHornetQMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER,
                 SOAPFactory.eINSTANCE.createSOAPMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER,
                 JcaFactory.eINSTANCE.createJCAMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER,
                 ResteasyFactory.eINSTANCE.createRESTMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER,
                 HttpFactory.eINSTANCE.createHttpMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__JAVA_OPERATION_SELECTOR_SWITCHYARD,
                 SwitchyardFactory.eINSTANCE.createJavaOperationSelectorType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__REGEX_OPERATION_SELECTOR_SWITCHYARD,
                 SwitchyardFactory.eINSTANCE.createRegexOperationSelectorType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__XPATH_OPERATION_SELECTOR_SWITCHYARD,
                 SwitchyardFactory.eINSTANCE.createXPathOperationSelectorType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR_SWITCHYARD,
                 SwitchyardFactory.eINSTANCE.createStaticOperationSelectorType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__SECURITY,
                 SwitchyardFactory.eINSTANCE.createSecurityType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.DOCUMENT_ROOT__SECURITIES,
                 SwitchyardFactory.eINSTANCE.createSecuritiesType()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ((IChildCreationExtender)adapterFactory).getResourceLocator();
    }

}
