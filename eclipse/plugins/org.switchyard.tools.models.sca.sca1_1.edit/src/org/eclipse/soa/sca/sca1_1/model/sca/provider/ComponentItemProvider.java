/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.soa.sca.core.model.addressing.AddressingFactory;
import org.eclipse.soa.sca.core.model.addressing.AddressingPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.soa.sca.sca1_1.model.sca.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider
	extends CommonExtensionBaseItemProvider
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
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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

            addAutowirePropertyDescriptor(object);
            addConstrainingTypePropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addPolicySetsPropertyDescriptor(object);
            addRequiresPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Autowire feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addAutowirePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Component_autowire_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Component_autowire_feature", "_UI_Component_type"),
                 ScaPackage.eINSTANCE.getComponent_Autowire(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Constraining Type feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addConstrainingTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Component_constrainingType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Component_constrainingType_feature", "_UI_Component_type"),
                 ScaPackage.eINSTANCE.getComponent_ConstrainingType(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Component_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Component_name_feature", "_UI_Component_type"),
                 ScaPackage.eINSTANCE.getComponent_Name(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Policy Sets feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addPolicySetsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Component_policySets_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Component_policySets_feature", "_UI_Component_type"),
                 ScaPackage.eINSTANCE.getComponent_PolicySets(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Requires feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addRequiresPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Component_requires_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Component_requires_feature", "_UI_Component_type"),
                 ScaPackage.eINSTANCE.getComponent_Requires(),
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
            childrenFeatures.add(ScaPackage.eINSTANCE.getComponent_ImplementationGroup());
            childrenFeatures.add(ScaPackage.eINSTANCE.getComponent_Group());
            childrenFeatures.add(ScaPackage.eINSTANCE.getComponent_Any());
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
     * This returns Component.gif.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Component"));
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((Component)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Component_type") :
            getString("_UI_Component_type") + " " + label;
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

        switch (notification.getFeatureID(Component.class)) {
            case ScaPackage.COMPONENT__AUTOWIRE:
            case ScaPackage.COMPONENT__CONSTRAINING_TYPE:
            case ScaPackage.COMPONENT__NAME:
            case ScaPackage.COMPONENT__POLICY_SETS:
            case ScaPackage.COMPONENT__REQUIRES:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case ScaPackage.COMPONENT__IMPLEMENTATION_GROUP:
            case ScaPackage.COMPONENT__GROUP:
            case ScaPackage.COMPONENT__ANY:
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
                (ScaPackage.eINSTANCE.getComponent_ImplementationGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Implementation(),
                     ScaFactory.eINSTANCE.createBPELImplementation())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getComponent_ImplementationGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Implementation(),
                     ScaFactory.eINSTANCE.createCImplementation())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getComponent_ImplementationGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Implementation(),
                     ScaFactory.eINSTANCE.createCPPImplementation())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getComponent_ImplementationGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Implementation(),
                     ScaFactory.eINSTANCE.createEJBImplementation())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getComponent_ImplementationGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Implementation(),
                     ScaFactory.eINSTANCE.createJavaImplementation())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getComponent_ImplementationGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Implementation(),
                     ScaFactory.eINSTANCE.createJEEImplementation())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getComponent_ImplementationGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Implementation(),
                     ScaFactory.eINSTANCE.createSCAImplementation())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getComponent_ImplementationGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Implementation(),
                     ScaFactory.eINSTANCE.createSpringImplementation())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getComponent_ImplementationGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Implementation(),
                     ScaFactory.eINSTANCE.createWebImplementation())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getComponent_Group(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Service(),
                     ScaFactory.eINSTANCE.createComponentService())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getComponent_Group(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Service(),
                     ScaFactory.eINSTANCE.createConstrainingService())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getComponent_Group(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Reference(),
                     ScaFactory.eINSTANCE.createComponentReference())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getComponent_Group(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Reference(),
                     ScaFactory.eINSTANCE.createComponentTypeReference())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getComponent_Group(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Reference(),
                     ScaFactory.eINSTANCE.createConstrainingReference())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getComponent_Group(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getComponent_Property(),
                     ScaFactory.eINSTANCE.createPropertyValue())));
    }

}
