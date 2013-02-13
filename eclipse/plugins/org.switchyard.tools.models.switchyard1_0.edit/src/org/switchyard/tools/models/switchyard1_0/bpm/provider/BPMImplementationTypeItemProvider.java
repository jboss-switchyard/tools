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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.soa.sca.sca1_1.model.sca.provider.ImplementationItemProvider;
import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMImplementationTypeItemProvider
    extends ImplementationItemProvider
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
    public BPMImplementationTypeItemProvider(AdapterFactory adapterFactory) {
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

            addPersistentPropertyDescriptor(object);
            addProcessIdPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Process Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProcessIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BPMImplementationType_processId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BPMImplementationType_processId_feature", "_UI_BPMImplementationType_type"),
                 BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__PROCESS_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Persistent feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPersistentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BPMImplementationType_persistent_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BPMImplementationType_persistent_feature", "_UI_BPMImplementationType_type"),
                 BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__PERSISTENT,
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
            childrenFeatures.add(BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__ACTIONS);
            childrenFeatures.add(BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__CHANNELS);
            childrenFeatures.add(BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__LISTENERS);
            childrenFeatures.add(BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__LOGGERS);
            childrenFeatures.add(BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__MANIFEST);
            childrenFeatures.add(BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__PROPERTIES);
            childrenFeatures.add(BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS);
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
     * This returns BPMImplementationType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/BPMImplementationType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        List labelValue = ((BPMImplementationType)object).getPolicySets();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ?
            getString("_UI_BPMImplementationType_type") :
            getString("_UI_BPMImplementationType_type") + " " + label;
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

        switch (notification.getFeatureID(BPMImplementationType.class)) {
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PERSISTENT:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_ID:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTIONS:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__CHANNELS:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__LISTENERS:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__LOGGERS:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MANIFEST:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROPERTIES:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS:
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
                (BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__ACTIONS,
                 BPMFactory.eINSTANCE.createActionsType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__CHANNELS,
                 BPMFactory.eINSTANCE.createChannelsType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__LISTENERS,
                 BPMFactory.eINSTANCE.createListenersType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__LOGGERS,
                 BPMFactory.eINSTANCE.createLoggersType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__MANIFEST,
                 BPMFactory.eINSTANCE.createManifestType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__PROPERTIES,
                 BPMFactory.eINSTANCE.createPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS,
                 BPMFactory.eINSTANCE.createWorkItemHandlersType()));
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
