/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpFactory;
import org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpPackage;
import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomFactory;
import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage;
import org.switchyard.tools.models.switchyard1_0.camel.file.FileFactory;
import org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpFactory;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;
import org.switchyard.tools.models.switchyard1_0.camel.jms.JmsFactory;
import org.switchyard.tools.models.switchyard1_0.camel.jms.JmsPackage;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaFactory;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailFactory;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyFactory;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzFactory;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage;
import org.switchyard.tools.models.switchyard1_0.camel.sql.SqlFactory;
import org.switchyard.tools.models.switchyard1_0.camel.sql.SqlPackage;
import org.switchyard.tools.models.switchyard1_0.http.HttpFactory;
import org.switchyard.tools.models.switchyard1_0.http.HttpPackage;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.ResAuth;

import org.switchyard.tools.models.switchyard1_0.remote.RemoteFactory;
import org.switchyard.tools.models.switchyard1_0.remote.RemotePackage;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyFactory;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JCAOutboundConnectionItemProvider
    extends ItemProviderAdapter
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
    public JCAOutboundConnectionItemProvider(AdapterFactory adapterFactory) {
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

            addResAuthPropertyDescriptor(object);
            addManagedPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Res Auth feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addResAuthPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JCAOutboundConnection_resAuth_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JCAOutboundConnection_resAuth_feature", "_UI_JCAOutboundConnection_type"),
                 JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__RES_AUTH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Managed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addManagedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JCAOutboundConnection_managed_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JCAOutboundConnection_managed_feature", "_UI_JCAOutboundConnection_type"),
                 JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__MANAGED,
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
            childrenFeatures.add(JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER);
            childrenFeatures.add(JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__CONNECTION);
            childrenFeatures.add(JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY);
            childrenFeatures.add(JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY_ATTRIBUTE);
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
     * This returns JCAOutboundConnection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/JCAOutboundConnection"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        ResAuth labelValue = ((JCAOutboundConnection)object).getResAuth();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ?
            getString("_UI_JCAOutboundConnection_type") :
            getString("_UI_JCAOutboundConnection_type") + " " + label;
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

        switch (notification.getFeatureID(JCAOutboundConnection.class)) {
            case JcaPackage.JCA_OUTBOUND_CONNECTION__RES_AUTH:
            case JcaPackage.JCA_OUTBOUND_CONNECTION__MANAGED:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case JcaPackage.JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER:
            case JcaPackage.JCA_OUTBOUND_CONNECTION__CONNECTION:
            case JcaPackage.JCA_OUTBOUND_CONNECTION__ANY:
            case JcaPackage.JCA_OUTBOUND_CONNECTION__ANY_ATTRIBUTE:
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
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER,
                 JcaFactory.eINSTANCE.createResourceAdapter()));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__CONNECTION,
                 JcaFactory.eINSTANCE.createConnection()));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (ResteasyPackage.Literals.DOCUMENT_ROOT__BINDING_REST,
                     ResteasyFactory.eINSTANCE.createRESTBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (ResteasyPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER,
                     ResteasyFactory.eINSTANCE.createRESTContextMapperType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (ResteasyPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER,
                     ResteasyFactory.eINSTANCE.createRESTMessageComposerType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (HttpPackage.Literals.DOCUMENT_ROOT__BINDING_HTTP,
                     HttpFactory.eINSTANCE.createHttpBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (HttpPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER,
                     HttpFactory.eINSTANCE.createHttpContextMapperType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (HttpPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER,
                     HttpFactory.eINSTANCE.createHttpMessageComposerType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (RemotePackage.Literals.DOCUMENT_ROOT__REMOTE_BINDING,
                     RemoteFactory.eINSTANCE.createRemoteBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (AmqpPackage.Literals.DOCUMENT_ROOT__BINDING_AMQP,
                     AmqpFactory.eINSTANCE.createCamelAmqpBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (AtomPackage.Literals.DOCUMENT_ROOT__BINDING_ATOM,
                     AtomFactory.eINSTANCE.createCamelAtomBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (FilePackage.Literals.DOCUMENT_ROOT__BINDING_FILE,
                     FileFactory.eINSTANCE.createCamelFileBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (FtpPackage.Literals.DOCUMENT_ROOT__BINDING_FTP,
                     FtpFactory.eINSTANCE.createCamelFtpBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (FtpPackage.Literals.DOCUMENT_ROOT__BINDING_FTP,
                     FtpFactory.eINSTANCE.createCamelFtpsBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (FtpPackage.Literals.DOCUMENT_ROOT__BINDING_FTPS,
                     FtpFactory.eINSTANCE.createCamelFtpsBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (FtpPackage.Literals.DOCUMENT_ROOT__BINDING_SFTP,
                     FtpFactory.eINSTANCE.createCamelSftpBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (JmsPackage.Literals.DOCUMENT_ROOT__BINDING_JMS,
                     JmsFactory.eINSTANCE.createCamelJmsBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (JpaPackage.Literals.DOCUMENT_ROOT__BINDING_JPA,
                     JpaFactory.eINSTANCE.createCamelJPABindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (MailPackage.Literals.DOCUMENT_ROOT__BINDING_MAIL,
                     MailFactory.eINSTANCE.createCamelMailBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (NettyPackage.Literals.DOCUMENT_ROOT__BINDING_NETTY_UDP,
                     NettyFactory.eINSTANCE.createCamelNettyUdpBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (NettyPackage.Literals.DOCUMENT_ROOT__BINDING_NETTY_TCP,
                     NettyFactory.eINSTANCE.createCamelNettyTcpBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (QuartzPackage.Literals.DOCUMENT_ROOT__BINDING_QUARTZ,
                     QuartzFactory.eINSTANCE.createCamelQuartzBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__ANY,
                 FeatureMapUtil.createEntry
                    (SqlPackage.Literals.DOCUMENT_ROOT__BINDING_SQL,
                     SqlFactory.eINSTANCE.createCamelSqlBindingType())));
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
            childFeature == AmqpPackage.Literals.DOCUMENT_ROOT__BINDING_AMQP ||
            childFeature == JmsPackage.Literals.DOCUMENT_ROOT__BINDING_JMS ||
            childFeature == FtpPackage.Literals.DOCUMENT_ROOT__BINDING_FTP ||
            childFeature == FtpPackage.Literals.DOCUMENT_ROOT__BINDING_FTPS;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
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
