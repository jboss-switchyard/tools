/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.provider;


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

import org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelAtomBindingTypeItemProvider
    extends BaseCamelBindingItemProvider
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
    public CamelAtomBindingTypeItemProvider(AdapterFactory adapterFactory) {
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

            addFeedURIPropertyDescriptor(object);
            addSplitEntriesPropertyDescriptor(object);
            addFilterPropertyDescriptor(object);
            addLastUpdatePropertyDescriptor(object);
            addThrottleEntriesPropertyDescriptor(object);
            addFeedHeaderPropertyDescriptor(object);
            addSortEntriesPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Feed URI feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFeedURIPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAtomBindingType_feedURI_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAtomBindingType_feedURI_feature", "_UI_CamelAtomBindingType_type"),
                 CamelPackage.Literals.CAMEL_ATOM_BINDING_TYPE__FEED_URI,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Split Entries feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSplitEntriesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAtomBindingType_splitEntries_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAtomBindingType_splitEntries_feature", "_UI_CamelAtomBindingType_type"),
                 CamelPackage.Literals.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Filter feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFilterPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAtomBindingType_filter_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAtomBindingType_filter_feature", "_UI_CamelAtomBindingType_type"),
                 CamelPackage.Literals.CAMEL_ATOM_BINDING_TYPE__FILTER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Last Update feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastUpdatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAtomBindingType_lastUpdate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAtomBindingType_lastUpdate_feature", "_UI_CamelAtomBindingType_type"),
                 CamelPackage.Literals.CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Throttle Entries feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThrottleEntriesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAtomBindingType_throttleEntries_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAtomBindingType_throttleEntries_feature", "_UI_CamelAtomBindingType_type"),
                 CamelPackage.Literals.CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Feed Header feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFeedHeaderPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAtomBindingType_feedHeader_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAtomBindingType_feedHeader_feature", "_UI_CamelAtomBindingType_type"),
                 CamelPackage.Literals.CAMEL_ATOM_BINDING_TYPE__FEED_HEADER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Sort Entries feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSortEntriesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAtomBindingType_sortEntries_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAtomBindingType_sortEntries_feature", "_UI_CamelAtomBindingType_type"),
                 CamelPackage.Literals.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES,
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
            childrenFeatures.add(CamelPackage.Literals.CAMEL_ATOM_BINDING_TYPE__CONSUME);
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
     * This returns CamelAtomBindingType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelAtomBindingType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelAtomBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelAtomBindingType_type") :
            getString("_UI_CamelAtomBindingType_type") + " " + label;
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

        switch (notification.getFeatureID(CamelAtomBindingType.class)) {
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FEED_URI:
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES:
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FILTER:
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE:
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES:
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FEED_HEADER:
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME:
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
                (CamelPackage.Literals.CAMEL_ATOM_BINDING_TYPE__CONSUME,
                 CamelFactory.eINSTANCE.createScheduledPollConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.CAMEL_ATOM_BINDING_TYPE__CONSUME,
                 CamelFactory.eINSTANCE.createScheduledBatchPollConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.CAMEL_ATOM_BINDING_TYPE__CONSUME,
                 CamelFactory.eINSTANCE.createGenericFileConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.CAMEL_ATOM_BINDING_TYPE__CONSUME,
                 CamelFactory.eINSTANCE.createFileConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.CAMEL_ATOM_BINDING_TYPE__CONSUME,
                 CamelFactory.eINSTANCE.createRemoteFileConsumerType()));
    }

}
