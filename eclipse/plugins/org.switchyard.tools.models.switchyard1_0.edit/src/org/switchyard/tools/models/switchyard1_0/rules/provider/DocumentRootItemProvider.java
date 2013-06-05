/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot} object.
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

        }
        return itemPropertyDescriptors;
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
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__ACTION);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__ACTIONS);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__CHANNEL);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__CHANNELS);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__CONTAINER);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__GLOBAL);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__GLOBALS);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_RULES);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__INPUT);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__INPUTS);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__LISTENER);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__LISTENERS);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__LOGGER);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__LOGGERS);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__MANIFEST);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__OUTPUT);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__OUTPUTS);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__PROPERTIES);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__PROPERTY);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__RESOURCE);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__RESOURCES);
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
        return getString("_UI_DocumentRoot_type");
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
            case RulesPackage.DOCUMENT_ROOT__ACTION:
            case RulesPackage.DOCUMENT_ROOT__ACTIONS:
            case RulesPackage.DOCUMENT_ROOT__CHANNEL:
            case RulesPackage.DOCUMENT_ROOT__CHANNELS:
            case RulesPackage.DOCUMENT_ROOT__CONTAINER:
            case RulesPackage.DOCUMENT_ROOT__GLOBAL:
            case RulesPackage.DOCUMENT_ROOT__GLOBALS:
            case RulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_RULES:
            case RulesPackage.DOCUMENT_ROOT__INPUT:
            case RulesPackage.DOCUMENT_ROOT__INPUTS:
            case RulesPackage.DOCUMENT_ROOT__LISTENER:
            case RulesPackage.DOCUMENT_ROOT__LISTENERS:
            case RulesPackage.DOCUMENT_ROOT__LOGGER:
            case RulesPackage.DOCUMENT_ROOT__LOGGERS:
            case RulesPackage.DOCUMENT_ROOT__MANIFEST:
            case RulesPackage.DOCUMENT_ROOT__OUTPUT:
            case RulesPackage.DOCUMENT_ROOT__OUTPUTS:
            case RulesPackage.DOCUMENT_ROOT__PROPERTIES:
            case RulesPackage.DOCUMENT_ROOT__PROPERTY:
            case RulesPackage.DOCUMENT_ROOT__RESOURCE:
            case RulesPackage.DOCUMENT_ROOT__RESOURCES:
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
                (RulesPackage.Literals.DOCUMENT_ROOT__ACTION,
                 RulesFactory.eINSTANCE.createActionType1()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__ACTIONS,
                 RulesFactory.eINSTANCE.createActionsType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__CHANNEL,
                 RulesFactory.eINSTANCE.createChannelType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__CHANNELS,
                 RulesFactory.eINSTANCE.createChannelsType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__CONTAINER,
                 RulesFactory.eINSTANCE.createContainerType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__GLOBAL,
                 RulesFactory.eINSTANCE.createMappingType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__GLOBALS,
                 RulesFactory.eINSTANCE.createGlobalsType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_RULES,
                 RulesFactory.eINSTANCE.createRulesImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__INPUT,
                 RulesFactory.eINSTANCE.createMappingType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__INPUTS,
                 RulesFactory.eINSTANCE.createInputsType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__LISTENER,
                 RulesFactory.eINSTANCE.createListenerType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__LISTENERS,
                 RulesFactory.eINSTANCE.createListenersType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__LOGGER,
                 RulesFactory.eINSTANCE.createLoggerType1()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__LOGGERS,
                 RulesFactory.eINSTANCE.createLoggersType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__MANIFEST,
                 RulesFactory.eINSTANCE.createManifestType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__OUTPUT,
                 RulesFactory.eINSTANCE.createMappingType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__OUTPUTS,
                 RulesFactory.eINSTANCE.createOutputsType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__PROPERTIES,
                 RulesFactory.eINSTANCE.createPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__PROPERTY,
                 RulesFactory.eINSTANCE.createPropertyType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__RESOURCE,
                 RulesFactory.eINSTANCE.createResourceType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__RESOURCES,
                 RulesFactory.eINSTANCE.createResourcesType()));
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

        boolean qualify =
            childFeature == RulesPackage.Literals.DOCUMENT_ROOT__GLOBAL ||
            childFeature == RulesPackage.Literals.DOCUMENT_ROOT__INPUT ||
            childFeature == RulesPackage.Literals.DOCUMENT_ROOT__OUTPUT;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
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
