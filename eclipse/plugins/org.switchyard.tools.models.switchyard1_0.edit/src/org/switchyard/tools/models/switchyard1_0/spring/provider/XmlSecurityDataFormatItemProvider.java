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

import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlSecurityDataFormatItemProvider
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
    public XmlSecurityDataFormatItemProvider(AdapterFactory adapterFactory) {
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

            addKeyCipherAlgorithmPropertyDescriptor(object);
            addKeyOrTrustStoreParametersIdPropertyDescriptor(object);
            addPassPhrasePropertyDescriptor(object);
            addRecipientKeyAliasPropertyDescriptor(object);
            addSecureTagPropertyDescriptor(object);
            addSecureTagContentsPropertyDescriptor(object);
            addXmlCipherAlgorithmPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Key Cipher Algorithm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKeyCipherAlgorithmPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_XmlSecurityDataFormat_keyCipherAlgorithm_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_XmlSecurityDataFormat_keyCipherAlgorithm_feature", "_UI_XmlSecurityDataFormat_type"),
                 SpringPackage.eINSTANCE.getXmlSecurityDataFormat_KeyCipherAlgorithm(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Key Or Trust Store Parameters Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKeyOrTrustStoreParametersIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_XmlSecurityDataFormat_keyOrTrustStoreParametersId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_XmlSecurityDataFormat_keyOrTrustStoreParametersId_feature", "_UI_XmlSecurityDataFormat_type"),
                 SpringPackage.eINSTANCE.getXmlSecurityDataFormat_KeyOrTrustStoreParametersId(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Pass Phrase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPassPhrasePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_XmlSecurityDataFormat_passPhrase_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_XmlSecurityDataFormat_passPhrase_feature", "_UI_XmlSecurityDataFormat_type"),
                 SpringPackage.eINSTANCE.getXmlSecurityDataFormat_PassPhrase(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Recipient Key Alias feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRecipientKeyAliasPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_XmlSecurityDataFormat_recipientKeyAlias_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_XmlSecurityDataFormat_recipientKeyAlias_feature", "_UI_XmlSecurityDataFormat_type"),
                 SpringPackage.eINSTANCE.getXmlSecurityDataFormat_RecipientKeyAlias(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Secure Tag feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSecureTagPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_XmlSecurityDataFormat_secureTag_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_XmlSecurityDataFormat_secureTag_feature", "_UI_XmlSecurityDataFormat_type"),
                 SpringPackage.eINSTANCE.getXmlSecurityDataFormat_SecureTag(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Secure Tag Contents feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSecureTagContentsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_XmlSecurityDataFormat_secureTagContents_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_XmlSecurityDataFormat_secureTagContents_feature", "_UI_XmlSecurityDataFormat_type"),
                 SpringPackage.eINSTANCE.getXmlSecurityDataFormat_SecureTagContents(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Xml Cipher Algorithm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXmlCipherAlgorithmPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_XmlSecurityDataFormat_xmlCipherAlgorithm_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_XmlSecurityDataFormat_xmlCipherAlgorithm_feature", "_UI_XmlSecurityDataFormat_type"),
                 SpringPackage.eINSTANCE.getXmlSecurityDataFormat_XmlCipherAlgorithm(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns XmlSecurityDataFormat.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/XmlSecurityDataFormat"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((XmlSecurityDataFormat)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_XmlSecurityDataFormat_type") :
            getString("_UI_XmlSecurityDataFormat_type") + " " + label;
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

        switch (notification.getFeatureID(XmlSecurityDataFormat.class)) {
            case SpringPackage.XML_SECURITY_DATA_FORMAT__KEY_CIPHER_ALGORITHM:
            case SpringPackage.XML_SECURITY_DATA_FORMAT__KEY_OR_TRUST_STORE_PARAMETERS_ID:
            case SpringPackage.XML_SECURITY_DATA_FORMAT__PASS_PHRASE:
            case SpringPackage.XML_SECURITY_DATA_FORMAT__RECIPIENT_KEY_ALIAS:
            case SpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG:
            case SpringPackage.XML_SECURITY_DATA_FORMAT__SECURE_TAG_CONTENTS:
            case SpringPackage.XML_SECURITY_DATA_FORMAT__XML_CIPHER_ALGORITHM:
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
