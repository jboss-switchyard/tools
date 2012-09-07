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

import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;

import org.switchyard.tools.models.switchyard1_0.commonrules.provider.CommonImplementationTypeItemProvider;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMImplementationTypeItemProvider
    extends CommonImplementationTypeItemProvider
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

            addProcessDefinitionPropertyDescriptor(object);
            addProcessDefinitionTypePropertyDescriptor(object);
            addProcessIdPropertyDescriptor(object);
            addMessageContentInNamePropertyDescriptor(object);
            addMessageContentOutNamePropertyDescriptor(object);
            addPersistentPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Process Definition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProcessDefinitionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BPMImplementationType_processDefinition_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BPMImplementationType_processDefinition_feature", "_UI_BPMImplementationType_type"),
                 BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Process Definition Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProcessDefinitionTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BPMImplementationType_processDefinitionType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BPMImplementationType_processDefinitionType_feature", "_UI_BPMImplementationType_type"),
                 BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
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
     * This adds a property descriptor for the Message Content In Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMessageContentInNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BPMImplementationType_messageContentInName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BPMImplementationType_messageContentInName_feature", "_UI_BPMImplementationType_type"),
                 BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_IN_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Message Content Out Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMessageContentOutNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BPMImplementationType_messageContentOutName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BPMImplementationType_messageContentOutName_feature", "_UI_BPMImplementationType_type"),
                 BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_OUT_NAME,
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
            childrenFeatures.add(BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__ACTION);
            childrenFeatures.add(BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__AUDIT);
            childrenFeatures.add(BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER);
            childrenFeatures.add(BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__RESOURCE);
            childrenFeatures.add(BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__PARAMETERS);
            childrenFeatures.add(BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__RESULTS);
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
        String label = ((BPMImplementationType)object).getMessageContentInName();
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
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION_TYPE:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_ID:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_IN_NAME:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_OUT_NAME:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PERSISTENT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTION:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESOURCE:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PARAMETERS:
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESULTS:
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
                (BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__ACTION,
                 BPMFactory.eINSTANCE.createActionType1()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__AUDIT,
                 BPMFactory.eINSTANCE.createAuditType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER,
                 BPMFactory.eINSTANCE.createTaskHandlerType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__RESOURCE,
                 BPMFactory.eINSTANCE.createResourceType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__PARAMETERS,
                 BPMFactory.eINSTANCE.createParametersType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE__RESULTS,
                 BPMFactory.eINSTANCE.createResultsType()));
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
