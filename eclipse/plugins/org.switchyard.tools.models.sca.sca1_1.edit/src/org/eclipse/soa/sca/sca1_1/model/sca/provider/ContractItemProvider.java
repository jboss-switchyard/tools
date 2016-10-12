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
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.soa.sca.sca1_1.model.sca.Contract} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContractItemProvider
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
	public ContractItemProvider(AdapterFactory adapterFactory) {
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

            addNamePropertyDescriptor(object);
            addPolicySetsPropertyDescriptor(object);
            addRequiresPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
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
                 getString("_UI_Contract_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Contract_name_feature", "_UI_Contract_type"),
                 ScaPackage.eINSTANCE.getContract_Name(),
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
                 getString("_UI_Contract_policySets_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Contract_policySets_feature", "_UI_Contract_type"),
                 ScaPackage.eINSTANCE.getContract_PolicySets(),
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
                 getString("_UI_Contract_requires_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Contract_requires_feature", "_UI_Contract_type"),
                 ScaPackage.eINSTANCE.getContract_Requires(),
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
            childrenFeatures.add(ScaPackage.eINSTANCE.getContract_InterfaceGroup());
            childrenFeatures.add(ScaPackage.eINSTANCE.getContract_BindingGroup());
            childrenFeatures.add(ScaPackage.eINSTANCE.getContract_Callback());
            childrenFeatures.add(ScaPackage.eINSTANCE.getContract_Any());
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
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((Contract)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Contract_type") :
            getString("_UI_Contract_type") + " " + label;
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

        switch (notification.getFeatureID(Contract.class)) {
            case ScaPackage.CONTRACT__NAME:
            case ScaPackage.CONTRACT__POLICY_SETS:
            case ScaPackage.CONTRACT__REQUIRES:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case ScaPackage.CONTRACT__INTERFACE_GROUP:
            case ScaPackage.CONTRACT__BINDING_GROUP:
            case ScaPackage.CONTRACT__CALLBACK:
            case ScaPackage.CONTRACT__ANY:
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
                (ScaPackage.eINSTANCE.getContract_InterfaceGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getContract_Interface(),
                     ScaFactory.eINSTANCE.createCInterface())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getContract_InterfaceGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getContract_Interface(),
                     ScaFactory.eINSTANCE.createCPPInterface())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getContract_InterfaceGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getContract_Interface(),
                     ScaFactory.eINSTANCE.createJavaInterface())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getContract_InterfaceGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getContract_Interface(),
                     ScaFactory.eINSTANCE.createWSDLPortType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getContract_BindingGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getContract_Binding(),
                     ScaFactory.eINSTANCE.createEJBSessionBeanBinding())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getContract_BindingGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getContract_Binding(),
                     ScaFactory.eINSTANCE.createJCABinding())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getContract_BindingGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getContract_Binding(),
                     ScaFactory.eINSTANCE.createJMSBinding())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getContract_BindingGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getContract_Binding(),
                     ScaFactory.eINSTANCE.createSCABinding())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getContract_BindingGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getContract_Binding(),
                     ScaFactory.eINSTANCE.createWebServiceBinding())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getContract_Callback(),
                 ScaFactory.eINSTANCE.createCallback()));
    }

}
