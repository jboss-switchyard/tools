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
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;

import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyFactory;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JCAInboundInteractionItemProvider
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
    public JCAInboundInteractionItemProvider(AdapterFactory adapterFactory) {
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

            addListenerPropertyDescriptor(object);
            addTransactedPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Listener feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addListenerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JCAInboundInteraction_listener_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JCAInboundInteraction_listener_feature", "_UI_JCAInboundInteraction_type"),
                 JcaPackage.Literals.JCA_INBOUND_INTERACTION__LISTENER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Transacted feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransactedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JCAInboundInteraction_transacted_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JCAInboundInteraction_transacted_feature", "_UI_JCAInboundInteraction_type"),
                 JcaPackage.Literals.JCA_INBOUND_INTERACTION__TRANSACTED,
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
            childrenFeatures.add(JcaPackage.Literals.JCA_INBOUND_INTERACTION__ENDPOINT);
            childrenFeatures.add(JcaPackage.Literals.JCA_INBOUND_INTERACTION__ANY);
            childrenFeatures.add(JcaPackage.Literals.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE);
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
     * This returns JCAInboundInteraction.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/JCAInboundInteraction"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((JCAInboundInteraction)object).getListener();
        return label == null || label.length() == 0 ?
            getString("_UI_JCAInboundInteraction_type") :
            getString("_UI_JCAInboundInteraction_type") + " " + label;
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

        switch (notification.getFeatureID(JCAInboundInteraction.class)) {
            case JcaPackage.JCA_INBOUND_INTERACTION__LISTENER:
            case JcaPackage.JCA_INBOUND_INTERACTION__TRANSACTED:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case JcaPackage.JCA_INBOUND_INTERACTION__ENDPOINT:
            case JcaPackage.JCA_INBOUND_INTERACTION__ANY:
            case JcaPackage.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE:
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
                (JcaPackage.Literals.JCA_INBOUND_INTERACTION__ENDPOINT,
                 JcaFactory.eINSTANCE.createEndpoint()));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_INBOUND_INTERACTION__ANY,
                 FeatureMapUtil.createEntry
                    (ResteasyPackage.Literals.DOCUMENT_ROOT__BINDING_REST,
                     ResteasyFactory.eINSTANCE.createRESTBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_INBOUND_INTERACTION__ANY,
                 FeatureMapUtil.createEntry
                    (CommonselectorPackage.Literals.DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR,
                     CommonselectorFactory.eINSTANCE.createStaticOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_INBOUND_INTERACTION__ANY,
                 FeatureMapUtil.createEntry
                    (CommonselectorPackage.Literals.DOCUMENT_ROOT__XPATH_OPERATION_SELECTOR,
                     CommonselectorFactory.eINSTANCE.createXPathOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_INBOUND_INTERACTION__ANY,
                 FeatureMapUtil.createEntry
                    (CommonselectorPackage.Literals.DOCUMENT_ROOT__REGEX_OPERATION_SELECTOR,
                     CommonselectorFactory.eINSTANCE.createRegexOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_INBOUND_INTERACTION__ANY,
                 FeatureMapUtil.createEntry
                    (CommonselectorPackage.Literals.DOCUMENT_ROOT__JAVA_OPERATION_SELECTOR,
                     CommonselectorFactory.eINSTANCE.createJavaOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_INBOUND_INTERACTION__ANY,
                 FeatureMapUtil.createEntry
                    (HttpPackage.Literals.DOCUMENT_ROOT__BINDING_HTTP,
                     HttpFactory.eINSTANCE.createHttpBindingType())));
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
