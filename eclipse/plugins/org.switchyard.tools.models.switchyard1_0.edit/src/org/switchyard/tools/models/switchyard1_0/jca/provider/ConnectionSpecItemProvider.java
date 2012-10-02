/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorFactory;
import org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage;
import org.switchyard.tools.models.switchyard1_0.http.HttpFactory;
import org.switchyard.tools.models.switchyard1_0.http.HttpPackage;
import org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;

import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyFactory;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionSpecItemProvider
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
    public ConnectionSpecItemProvider(AdapterFactory adapterFactory) {
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

            addTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectionSpec_type_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionSpec_type_feature", "_UI_ConnectionSpec_type"),
                 JcaPackage.Literals.CONNECTION_SPEC__TYPE,
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
            childrenFeatures.add(JcaPackage.Literals.CONNECTION_SPEC__PROPERTY);
            childrenFeatures.add(JcaPackage.Literals.CONNECTION_SPEC__ANY);
            childrenFeatures.add(JcaPackage.Literals.CONNECTION_SPEC__ANY_ATTRIBUTE);
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
     * This returns ConnectionSpec.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ConnectionSpec"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ConnectionSpec)object).getType();
        return label == null || label.length() == 0 ?
            getString("_UI_ConnectionSpec_type") :
            getString("_UI_ConnectionSpec_type") + " " + label;
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

        switch (notification.getFeatureID(ConnectionSpec.class)) {
            case JcaPackage.CONNECTION_SPEC__TYPE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case JcaPackage.CONNECTION_SPEC__PROPERTY:
            case JcaPackage.CONNECTION_SPEC__ANY:
            case JcaPackage.CONNECTION_SPEC__ANY_ATTRIBUTE:
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
                (JcaPackage.Literals.CONNECTION_SPEC__PROPERTY,
                 JcaFactory.eINSTANCE.createProperty()));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.CONNECTION_SPEC__ANY,
                 FeatureMapUtil.createEntry
                    (ResteasyPackage.Literals.DOCUMENT_ROOT__BINDING_REST,
                     ResteasyFactory.eINSTANCE.createRESTBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.CONNECTION_SPEC__ANY,
                 FeatureMapUtil.createEntry
                    (ResteasyPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER,
                     ResteasyFactory.eINSTANCE.createRESTContextMapperType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.CONNECTION_SPEC__ANY,
                 FeatureMapUtil.createEntry
                    (ResteasyPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER,
                     ResteasyFactory.eINSTANCE.createRESTMessageComposerType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.CONNECTION_SPEC__ANY,
                 FeatureMapUtil.createEntry
                    (CommonselectorPackage.Literals.DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR,
                     CommonselectorFactory.eINSTANCE.createStaticOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.CONNECTION_SPEC__ANY,
                 FeatureMapUtil.createEntry
                    (CommonselectorPackage.Literals.DOCUMENT_ROOT__XPATH_OPERATION_SELECTOR,
                     CommonselectorFactory.eINSTANCE.createXPathOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.CONNECTION_SPEC__ANY,
                 FeatureMapUtil.createEntry
                    (CommonselectorPackage.Literals.DOCUMENT_ROOT__REGEX_OPERATION_SELECTOR,
                     CommonselectorFactory.eINSTANCE.createRegexOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.CONNECTION_SPEC__ANY,
                 FeatureMapUtil.createEntry
                    (CommonselectorPackage.Literals.DOCUMENT_ROOT__JAVA_OPERATION_SELECTOR,
                     CommonselectorFactory.eINSTANCE.createJavaOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.CONNECTION_SPEC__ANY,
                 FeatureMapUtil.createEntry
                    (HttpPackage.Literals.DOCUMENT_ROOT__BINDING_HTTP,
                     HttpFactory.eINSTANCE.createHttpBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.CONNECTION_SPEC__ANY,
                 FeatureMapUtil.createEntry
                    (HttpPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER,
                     HttpFactory.eINSTANCE.createHttpContextMapperType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.CONNECTION_SPEC__ANY,
                 FeatureMapUtil.createEntry
                    (HttpPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER,
                     HttpFactory.eINSTANCE.createHttpMessageComposerType())));
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
