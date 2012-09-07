/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CryptoDataFormatItemProvider
    extends DataFormatItemProvider
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
    public CryptoDataFormatItemProvider(AdapterFactory adapterFactory) {
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

            addAlgorithmPropertyDescriptor(object);
            addAlgorithmParameterRefPropertyDescriptor(object);
            addBuffersizePropertyDescriptor(object);
            addCryptoProviderPropertyDescriptor(object);
            addInitVectorRefPropertyDescriptor(object);
            addInlinePropertyDescriptor(object);
            addKeyRefPropertyDescriptor(object);
            addMacAlgorithmPropertyDescriptor(object);
            addShouldAppendHMACPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Algorithm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAlgorithmPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CryptoDataFormat_algorithm_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CryptoDataFormat_algorithm_feature", "_UI_CryptoDataFormat_type"),
                 SpringPackage.eINSTANCE.getCryptoDataFormat_Algorithm(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Algorithm Parameter Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAlgorithmParameterRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CryptoDataFormat_algorithmParameterRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CryptoDataFormat_algorithmParameterRef_feature", "_UI_CryptoDataFormat_type"),
                 SpringPackage.eINSTANCE.getCryptoDataFormat_AlgorithmParameterRef(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Buffersize feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBuffersizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CryptoDataFormat_buffersize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CryptoDataFormat_buffersize_feature", "_UI_CryptoDataFormat_type"),
                 SpringPackage.eINSTANCE.getCryptoDataFormat_Buffersize(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Crypto Provider feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCryptoProviderPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CryptoDataFormat_cryptoProvider_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CryptoDataFormat_cryptoProvider_feature", "_UI_CryptoDataFormat_type"),
                 SpringPackage.eINSTANCE.getCryptoDataFormat_CryptoProvider(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Init Vector Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitVectorRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CryptoDataFormat_initVectorRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CryptoDataFormat_initVectorRef_feature", "_UI_CryptoDataFormat_type"),
                 SpringPackage.eINSTANCE.getCryptoDataFormat_InitVectorRef(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Inline feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInlinePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CryptoDataFormat_inline_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CryptoDataFormat_inline_feature", "_UI_CryptoDataFormat_type"),
                 SpringPackage.eINSTANCE.getCryptoDataFormat_Inline(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Key Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKeyRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CryptoDataFormat_keyRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CryptoDataFormat_keyRef_feature", "_UI_CryptoDataFormat_type"),
                 SpringPackage.eINSTANCE.getCryptoDataFormat_KeyRef(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Mac Algorithm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMacAlgorithmPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CryptoDataFormat_macAlgorithm_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CryptoDataFormat_macAlgorithm_feature", "_UI_CryptoDataFormat_type"),
                 SpringPackage.eINSTANCE.getCryptoDataFormat_MacAlgorithm(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Should Append HMAC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShouldAppendHMACPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CryptoDataFormat_shouldAppendHMAC_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CryptoDataFormat_shouldAppendHMAC_feature", "_UI_CryptoDataFormat_type"),
                 SpringPackage.eINSTANCE.getCryptoDataFormat_ShouldAppendHMAC(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CryptoDataFormat.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CryptoDataFormat"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CryptoDataFormat)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_CryptoDataFormat_type") :
            getString("_UI_CryptoDataFormat_type") + " " + label;
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

        switch (notification.getFeatureID(CryptoDataFormat.class)) {
            case SpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM:
            case SpringPackage.CRYPTO_DATA_FORMAT__ALGORITHM_PARAMETER_REF:
            case SpringPackage.CRYPTO_DATA_FORMAT__BUFFERSIZE:
            case SpringPackage.CRYPTO_DATA_FORMAT__CRYPTO_PROVIDER:
            case SpringPackage.CRYPTO_DATA_FORMAT__INIT_VECTOR_REF:
            case SpringPackage.CRYPTO_DATA_FORMAT__INLINE:
            case SpringPackage.CRYPTO_DATA_FORMAT__KEY_REF:
            case SpringPackage.CRYPTO_DATA_FORMAT__MAC_ALGORITHM:
            case SpringPackage.CRYPTO_DATA_FORMAT__SHOULD_APPEND_HMAC:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
    }

}
