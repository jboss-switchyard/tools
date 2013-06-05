/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm.provider;


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

import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot} object.
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
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__ACTION);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__ACTIONS);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__CHANNEL);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__CHANNELS);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__CONTAINER);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__GLOBAL);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__GLOBALS);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_BPM);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__INPUT);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__INPUTS);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__LISTENER);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__LISTENERS);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__LOGGER);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__LOGGERS);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__MANIFEST);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__OUTPUT);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__OUTPUTS);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__PROPERTIES);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__PROPERTY);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__RESOURCE);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__RESOURCES);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__WORK_ITEM_HANDLER);
            childrenFeatures.add(BPMPackage.Literals.DOCUMENT_ROOT__WORK_ITEM_HANDLERS);
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
            case BPMPackage.DOCUMENT_ROOT__ACTION:
            case BPMPackage.DOCUMENT_ROOT__ACTIONS:
            case BPMPackage.DOCUMENT_ROOT__CHANNEL:
            case BPMPackage.DOCUMENT_ROOT__CHANNELS:
            case BPMPackage.DOCUMENT_ROOT__CONTAINER:
            case BPMPackage.DOCUMENT_ROOT__GLOBAL:
            case BPMPackage.DOCUMENT_ROOT__GLOBALS:
            case BPMPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPM:
            case BPMPackage.DOCUMENT_ROOT__INPUT:
            case BPMPackage.DOCUMENT_ROOT__INPUTS:
            case BPMPackage.DOCUMENT_ROOT__LISTENER:
            case BPMPackage.DOCUMENT_ROOT__LISTENERS:
            case BPMPackage.DOCUMENT_ROOT__LOGGER:
            case BPMPackage.DOCUMENT_ROOT__LOGGERS:
            case BPMPackage.DOCUMENT_ROOT__MANIFEST:
            case BPMPackage.DOCUMENT_ROOT__OUTPUT:
            case BPMPackage.DOCUMENT_ROOT__OUTPUTS:
            case BPMPackage.DOCUMENT_ROOT__PROPERTIES:
            case BPMPackage.DOCUMENT_ROOT__PROPERTY:
            case BPMPackage.DOCUMENT_ROOT__RESOURCE:
            case BPMPackage.DOCUMENT_ROOT__RESOURCES:
            case BPMPackage.DOCUMENT_ROOT__WORK_ITEM_HANDLER:
            case BPMPackage.DOCUMENT_ROOT__WORK_ITEM_HANDLERS:
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
                (BPMPackage.Literals.DOCUMENT_ROOT__ACTION,
                 BPMFactory.eINSTANCE.createActionType1()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__ACTIONS,
                 BPMFactory.eINSTANCE.createActionsType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__CHANNEL,
                 BPMFactory.eINSTANCE.createChannelType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__CHANNELS,
                 BPMFactory.eINSTANCE.createChannelsType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__CONTAINER,
                 BPMFactory.eINSTANCE.createContainerType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__GLOBAL,
                 BPMFactory.eINSTANCE.createMappingType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__GLOBALS,
                 BPMFactory.eINSTANCE.createGlobalsType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_BPM,
                 BPMFactory.eINSTANCE.createBPMImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__INPUT,
                 BPMFactory.eINSTANCE.createMappingType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__INPUTS,
                 BPMFactory.eINSTANCE.createInputsType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__LISTENER,
                 BPMFactory.eINSTANCE.createListenerType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__LISTENERS,
                 BPMFactory.eINSTANCE.createListenersType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__LOGGER,
                 BPMFactory.eINSTANCE.createLoggerType1()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__LOGGERS,
                 BPMFactory.eINSTANCE.createLoggersType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__MANIFEST,
                 BPMFactory.eINSTANCE.createManifestType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__OUTPUT,
                 BPMFactory.eINSTANCE.createMappingType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__OUTPUTS,
                 BPMFactory.eINSTANCE.createOutputsType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__PROPERTIES,
                 BPMFactory.eINSTANCE.createPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__PROPERTY,
                 BPMFactory.eINSTANCE.createPropertyType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__RESOURCE,
                 BPMFactory.eINSTANCE.createResourceType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__RESOURCES,
                 BPMFactory.eINSTANCE.createResourcesType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__WORK_ITEM_HANDLER,
                 BPMFactory.eINSTANCE.createWorkItemHandlerType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.DOCUMENT_ROOT__WORK_ITEM_HANDLERS,
                 BPMFactory.eINSTANCE.createWorkItemHandlersType()));
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
            childFeature == BPMPackage.Literals.DOCUMENT_ROOT__GLOBAL ||
            childFeature == BPMPackage.Literals.DOCUMENT_ROOT__INPUT ||
            childFeature == BPMPackage.Literals.DOCUMENT_ROOT__OUTPUT;

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
