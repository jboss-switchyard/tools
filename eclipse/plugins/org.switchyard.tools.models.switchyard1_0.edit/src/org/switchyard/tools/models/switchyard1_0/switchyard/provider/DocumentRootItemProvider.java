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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

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
            case SwitchyardPackage.DOCUMENT_ROOT__BINDING_SWITCHYARD:
            case SwitchyardPackage.DOCUMENT_ROOT__RESOURCE:
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
