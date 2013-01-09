/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.file.provider;


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

import org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.file.FileFactory;
import org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelFileBindingTypeItemProvider
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
    public CamelFileBindingTypeItemProvider(AdapterFactory adapterFactory) {
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

            addDirectoryPropertyDescriptor(object);
            addAutoCreatePropertyDescriptor(object);
            addBufferSizePropertyDescriptor(object);
            addFileNamePropertyDescriptor(object);
            addFlattenPropertyDescriptor(object);
            addCharsetPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Directory feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDirectoryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFileBindingType_directory_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFileBindingType_directory_feature", "_UI_CamelFileBindingType_type"),
                 FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__DIRECTORY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Auto Create feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAutoCreatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFileBindingType_autoCreate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFileBindingType_autoCreate_feature", "_UI_CamelFileBindingType_type"),
                 FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__AUTO_CREATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Buffer Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBufferSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFileBindingType_bufferSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFileBindingType_bufferSize_feature", "_UI_CamelFileBindingType_type"),
                 FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__BUFFER_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the File Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFileNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFileBindingType_fileName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFileBindingType_fileName_feature", "_UI_CamelFileBindingType_type"),
                 FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__FILE_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Flatten feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlattenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFileBindingType_flatten_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFileBindingType_flatten_feature", "_UI_CamelFileBindingType_type"),
                 FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__FLATTEN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Charset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCharsetPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFileBindingType_charset_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFileBindingType_charset_feature", "_UI_CamelFileBindingType_type"),
                 FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__CHARSET,
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
            childrenFeatures.add(FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__CONSUME);
            childrenFeatures.add(FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__PRODUCE);
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
     * This returns CamelFileBindingType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelFileBindingType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelFileBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelFileBindingType_type") :
            getString("_UI_CamelFileBindingType_type") + " " + label;
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

        switch (notification.getFeatureID(CamelFileBindingType.class)) {
            case FilePackage.CAMEL_FILE_BINDING_TYPE__DIRECTORY:
            case FilePackage.CAMEL_FILE_BINDING_TYPE__AUTO_CREATE:
            case FilePackage.CAMEL_FILE_BINDING_TYPE__BUFFER_SIZE:
            case FilePackage.CAMEL_FILE_BINDING_TYPE__FILE_NAME:
            case FilePackage.CAMEL_FILE_BINDING_TYPE__FLATTEN:
            case FilePackage.CAMEL_FILE_BINDING_TYPE__CHARSET:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case FilePackage.CAMEL_FILE_BINDING_TYPE__CONSUME:
            case FilePackage.CAMEL_FILE_BINDING_TYPE__PRODUCE:
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
                (FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__CONSUME,
                 FileFactory.eINSTANCE.createFileConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__PRODUCE,
                 FileFactory.eINSTANCE.createFileProducerType()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
            FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
            childFeature = entry.getEStructuralFeature();
            childObject = entry.getValue();
        }

        boolean qualify =
            childFeature == SwitchyardPackage.Literals.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER ||
            childFeature == FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER ||
            childFeature == SwitchyardPackage.Literals.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER ||
            childFeature == FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
