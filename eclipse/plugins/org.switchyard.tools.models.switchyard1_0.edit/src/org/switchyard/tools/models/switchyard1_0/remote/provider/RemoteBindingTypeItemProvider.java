/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.remote.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

import org.eclipse.soa.sca.sca1_1.model.sca.provider.BindingItemProvider;

import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.remote.RemoteBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.remote.RemoteBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoteBindingTypeItemProvider
    extends BindingItemProvider
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
    public RemoteBindingTypeItemProvider(AdapterFactory adapterFactory) {
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
     * This returns RemoteBindingType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/RemoteBindingType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((RemoteBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_RemoteBindingType_type") :
            getString("_UI_RemoteBindingType_type") + " " + label;
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
                (ScaPackage.eINSTANCE.getBinding_OperationSelectorGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getBinding_OperationSelector(),
                     SwitchyardFactory.eINSTANCE.createJavaOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getBinding_OperationSelectorGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getBinding_OperationSelector(),
                     SwitchyardFactory.eINSTANCE.createRegexOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getBinding_OperationSelectorGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getBinding_OperationSelector(),
                     SwitchyardFactory.eINSTANCE.createStaticOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getBinding_OperationSelectorGroup(),
                 FeatureMapUtil.createEntry
                    (ScaPackage.eINSTANCE.getBinding_OperationSelector(),
                     SwitchyardFactory.eINSTANCE.createXPathOperationSelectorType())));
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
