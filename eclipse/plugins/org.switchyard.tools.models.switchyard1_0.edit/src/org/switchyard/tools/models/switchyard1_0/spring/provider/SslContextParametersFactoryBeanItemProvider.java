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

import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SslContextParametersFactoryBeanItemProvider
    extends AbstractJsseUtilFactoryBeanItemProvider
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
    public SslContextParametersFactoryBeanItemProvider(AdapterFactory adapterFactory) {
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

            addProviderPropertyDescriptor(object);
            addSecureSocketProtocolPropertyDescriptor(object);
            addSessionTimeoutPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Provider feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProviderPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SslContextParametersFactoryBean_provider_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SslContextParametersFactoryBean_provider_feature", "_UI_SslContextParametersFactoryBean_type"),
                 SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_Provider(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Secure Socket Protocol feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSecureSocketProtocolPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SslContextParametersFactoryBean_secureSocketProtocol_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SslContextParametersFactoryBean_secureSocketProtocol_feature", "_UI_SslContextParametersFactoryBean_type"),
                 SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_SecureSocketProtocol(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Session Timeout feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSessionTimeoutPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SslContextParametersFactoryBean_sessionTimeout_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SslContextParametersFactoryBean_sessionTimeout_feature", "_UI_SslContextParametersFactoryBean_type"),
                 SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_SessionTimeout(),
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
            childrenFeatures.add(SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_CipherSuites());
            childrenFeatures.add(SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_CipherSuitesFilter());
            childrenFeatures.add(SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_SecureSocketProtocols());
            childrenFeatures.add(SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_SecureSocketProtocolsFilter());
            childrenFeatures.add(SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_KeyManagers());
            childrenFeatures.add(SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_TrustManagers());
            childrenFeatures.add(SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_SecureRandom());
            childrenFeatures.add(SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_ClientParameters());
            childrenFeatures.add(SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_ServerParameters());
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
     * This returns SslContextParametersFactoryBean.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SslContextParametersFactoryBean"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((SslContextParametersFactoryBean)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_SslContextParametersFactoryBean_type") :
            getString("_UI_SslContextParametersFactoryBean_type") + " " + label;
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

        switch (notification.getFeatureID(SslContextParametersFactoryBean.class)) {
            case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__PROVIDER:
            case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOL:
            case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SESSION_TIMEOUT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES:
            case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER:
            case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS:
            case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER:
            case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__KEY_MANAGERS:
            case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__TRUST_MANAGERS:
            case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_RANDOM:
            case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CLIENT_PARAMETERS:
            case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SERVER_PARAMETERS:
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
                (SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_CipherSuites(),
                 SpringFactory.eINSTANCE.createCipherSuitesParameters()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_CipherSuitesFilter(),
                 SpringFactory.eINSTANCE.createFilterParameters()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_SecureSocketProtocols(),
                 SpringFactory.eINSTANCE.createSecureSocketProtocolsParameters()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_SecureSocketProtocolsFilter(),
                 SpringFactory.eINSTANCE.createFilterParameters()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_KeyManagers(),
                 SpringFactory.eINSTANCE.createKeyManagersParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_TrustManagers(),
                 SpringFactory.eINSTANCE.createTrustManagersParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_SecureRandom(),
                 SpringFactory.eINSTANCE.createSecureRandomParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_ClientParameters(),
                 SpringFactory.eINSTANCE.createSslContextClientParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_ServerParameters(),
                 SpringFactory.eINSTANCE.createSslContextServerParametersFactoryBean()));
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

        boolean qualify =
            childFeature == SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_CipherSuitesFilter() ||
            childFeature == SpringPackage.eINSTANCE.getSslContextParametersFactoryBean_SecureSocketProtocolsFilter();

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
