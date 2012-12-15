/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.provider;


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

import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelFtpsBindingTypeItemProvider
    extends CamelFtpBindingTypeItemProvider
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
    public CamelFtpsBindingTypeItemProvider(AdapterFactory adapterFactory) {
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

            addSecurityProtocolPropertyDescriptor(object);
            addIsImplicitPropertyDescriptor(object);
            addExecPbszPropertyDescriptor(object);
            addExecProtPropertyDescriptor(object);
            addDisableSecureDataChannelDefaultsPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Security Protocol feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSecurityProtocolPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFtpsBindingType_securityProtocol_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpsBindingType_securityProtocol_feature", "_UI_CamelFtpsBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTPS_BINDING_TYPE__SECURITY_PROTOCOL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Implicit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsImplicitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFtpsBindingType_isImplicit_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpsBindingType_isImplicit_feature", "_UI_CamelFtpsBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Exec Pbsz feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecPbszPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFtpsBindingType_execPbsz_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpsBindingType_execPbsz_feature", "_UI_CamelFtpsBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTPS_BINDING_TYPE__EXEC_PBSZ,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Exec Prot feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecProtPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFtpsBindingType_execProt_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpsBindingType_execProt_feature", "_UI_CamelFtpsBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTPS_BINDING_TYPE__EXEC_PROT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Disable Secure Data Channel Defaults feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDisableSecureDataChannelDefaultsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelFtpsBindingType_disableSecureDataChannelDefaults_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelFtpsBindingType_disableSecureDataChannelDefaults_feature", "_UI_CamelFtpsBindingType_type"),
                 FtpPackage.Literals.CAMEL_FTPS_BINDING_TYPE__DISABLE_SECURE_DATA_CHANNEL_DEFAULTS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CamelFtpsBindingType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelFtpsBindingType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelFtpsBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelFtpsBindingType_type") :
            getString("_UI_CamelFtpsBindingType_type") + " " + label;
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

        switch (notification.getFeatureID(CamelFtpsBindingType.class)) {
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__SECURITY_PROTOCOL:
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT:
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__EXEC_PBSZ:
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__EXEC_PROT:
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__DISABLE_SECURE_DATA_CHANNEL_DEFAULTS:
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
