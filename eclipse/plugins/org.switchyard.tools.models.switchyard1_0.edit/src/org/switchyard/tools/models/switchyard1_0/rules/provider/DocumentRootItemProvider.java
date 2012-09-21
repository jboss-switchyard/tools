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
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__AUDIT);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__CHANNEL);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__GLOBALS);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_RULES);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__MAPPING);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__RESOURCE);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__FACTS);
            childrenFeatures.add(RulesPackage.Literals.DOCUMENT_ROOT__EVENT_LISTENER);
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
            case RulesPackage.DOCUMENT_ROOT__AUDIT:
            case RulesPackage.DOCUMENT_ROOT__CHANNEL:
            case RulesPackage.DOCUMENT_ROOT__GLOBALS:
            case RulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_RULES:
            case RulesPackage.DOCUMENT_ROOT__MAPPING:
            case RulesPackage.DOCUMENT_ROOT__RESOURCE:
            case RulesPackage.DOCUMENT_ROOT__FACTS:
            case RulesPackage.DOCUMENT_ROOT__EVENT_LISTENER:
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
                (RulesPackage.Literals.DOCUMENT_ROOT__AUDIT,
                 RulesFactory.eINSTANCE.createAuditType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__CHANNEL,
                 RulesFactory.eINSTANCE.createChannelType()));

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
                (RulesPackage.Literals.DOCUMENT_ROOT__MAPPING,
                 RulesFactory.eINSTANCE.createMappingType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__RESOURCE,
                 RulesFactory.eINSTANCE.createResourceType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__FACTS,
                 RulesFactory.eINSTANCE.createFactsType()));

        newChildDescriptors.add
            (createChildParameter
                (RulesPackage.Literals.DOCUMENT_ROOT__EVENT_LISTENER,
                 RulesFactory.eINSTANCE.createEventListenerType()));
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
