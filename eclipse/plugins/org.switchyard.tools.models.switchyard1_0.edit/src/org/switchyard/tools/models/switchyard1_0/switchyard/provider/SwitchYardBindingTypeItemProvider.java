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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.provider.BindingItemProvider;

import org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorFactory;
import org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchYardBindingTypeItemProvider
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
    public SwitchYardBindingTypeItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(SwitchyardPackage.Literals.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER);
            childrenFeatures.add(SwitchyardPackage.Literals.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER);
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
        String label = ((SwitchYardBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_SwitchYardBindingType_type") :
            getString("_UI_SwitchYardBindingType_type") + " " + label;
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

        switch (notification.getFeatureID(SwitchYardBindingType.class)) {
            case SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER:
            case SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER:
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
                (ScaPackage.eINSTANCE.getBinding_OperationSelectorGroup(),
                 FeatureMapUtil.createEntry
                    (CommonselectorPackage.Literals.DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR,
                     CommonselectorFactory.eINSTANCE.createStaticOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getBinding_OperationSelectorGroup(),
                 FeatureMapUtil.createEntry
                    (CommonselectorPackage.Literals.DOCUMENT_ROOT__XPATH_OPERATION_SELECTOR,
                     CommonselectorFactory.eINSTANCE.createXPathOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getBinding_OperationSelectorGroup(),
                 FeatureMapUtil.createEntry
                    (CommonselectorPackage.Literals.DOCUMENT_ROOT__REGEX_OPERATION_SELECTOR,
                     CommonselectorFactory.eINSTANCE.createRegexOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getBinding_OperationSelectorGroup(),
                 FeatureMapUtil.createEntry
                    (CommonselectorPackage.Literals.DOCUMENT_ROOT__JAVA_OPERATION_SELECTOR,
                     CommonselectorFactory.eINSTANCE.createJavaOperationSelectorType())));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER,
                 SwitchyardFactory.eINSTANCE.createContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER,
                 SOAPFactory.eINSTANCE.createContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER,
                 SwitchyardFactory.eINSTANCE.createMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SwitchyardPackage.Literals.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER,
                 SOAPFactory.eINSTANCE.createSOAPMessageComposerType()));
    }

}
