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

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

import org.eclipse.soa.sca.sca1_1.model.sca.provider.OperationSelectorTypeItemProvider;

import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpFactory;
import org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpPackage;
import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomFactory;
import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage;
import org.switchyard.tools.models.switchyard1_0.camel.core.CoreFactory;
import org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage;
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
import org.switchyard.tools.models.switchyard1_0.remote.RemoteFactory;
import org.switchyard.tools.models.switchyard1_0.remote.RemotePackage;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyFactory;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchYardOperationSelectorTypeItemProvider
    extends OperationSelectorTypeItemProvider
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
    public SwitchYardOperationSelectorTypeItemProvider(AdapterFactory adapterFactory) {
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
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_SwitchYardOperationSelectorType_type");
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
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (CamelPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_CAMEL,
                     CamelFactory.eINSTANCE.createCamelImplementationType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (ResteasyPackage.Literals.DOCUMENT_ROOT__BINDING_REST,
                     ResteasyFactory.eINSTANCE.createRESTBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (ResteasyPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER,
                     ResteasyFactory.eINSTANCE.createRESTContextMapperType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (ResteasyPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER,
                     ResteasyFactory.eINSTANCE.createRESTMessageComposerType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (HttpPackage.Literals.DOCUMENT_ROOT__BINDING_HTTP,
                     HttpFactory.eINSTANCE.createHttpBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (HttpPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER,
                     HttpFactory.eINSTANCE.createHttpContextMapperType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (HttpPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER,
                     HttpFactory.eINSTANCE.createHttpMessageComposerType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (RemotePackage.Literals.DOCUMENT_ROOT__REMOTE_BINDING,
                     RemoteFactory.eINSTANCE.createRemoteBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (CorePackage.Literals.DOCUMENT_ROOT__BINDING_CAMEL,
                     CoreFactory.eINSTANCE.createCamelBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (CorePackage.Literals.DOCUMENT_ROOT__BINDING_DIRECT,
                     CoreFactory.eINSTANCE.createCamelDirectBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (CorePackage.Literals.DOCUMENT_ROOT__BINDING_MOCK,
                     CoreFactory.eINSTANCE.createCamelMockBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (CorePackage.Literals.DOCUMENT_ROOT__BINDING_SEDA,
                     CoreFactory.eINSTANCE.createCamelSedaBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (CorePackage.Literals.DOCUMENT_ROOT__BINDING_TIMER,
                     CoreFactory.eINSTANCE.createCamelTimerBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (AmqpPackage.Literals.DOCUMENT_ROOT__BINDING_AMQP,
                     AmqpFactory.eINSTANCE.createCamelAmqpBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (AtomPackage.Literals.DOCUMENT_ROOT__BINDING_ATOM,
                     AtomFactory.eINSTANCE.createCamelAtomBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (FilePackage.Literals.DOCUMENT_ROOT__BINDING_FILE,
                     FileFactory.eINSTANCE.createCamelFileBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (FtpPackage.Literals.DOCUMENT_ROOT__BINDING_FTP,
                     FtpFactory.eINSTANCE.createCamelFtpBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (FtpPackage.Literals.DOCUMENT_ROOT__BINDING_FTP,
                     FtpFactory.eINSTANCE.createCamelFtpsBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (FtpPackage.Literals.DOCUMENT_ROOT__BINDING_FTPS,
                     FtpFactory.eINSTANCE.createCamelFtpsBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (FtpPackage.Literals.DOCUMENT_ROOT__BINDING_SFTP,
                     FtpFactory.eINSTANCE.createCamelSftpBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (JmsPackage.Literals.DOCUMENT_ROOT__BINDING_JMS,
                     JmsFactory.eINSTANCE.createCamelJmsBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (JpaPackage.Literals.DOCUMENT_ROOT__BINDING_JPA,
                     JpaFactory.eINSTANCE.createCamelJPABindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (MailPackage.Literals.DOCUMENT_ROOT__BINDING_MAIL,
                     MailFactory.eINSTANCE.createCamelMailBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (NettyPackage.Literals.DOCUMENT_ROOT__BINDING_NETTY_UDP,
                     NettyFactory.eINSTANCE.createCamelNettyUdpBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (NettyPackage.Literals.DOCUMENT_ROOT__BINDING_NETTY_TCP,
                     NettyFactory.eINSTANCE.createCamelNettyTcpBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (QuartzPackage.Literals.DOCUMENT_ROOT__BINDING_QUARTZ,
                     QuartzFactory.eINSTANCE.createCamelQuartzBindingType())));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getOperationSelectorType_Any(),
                 FeatureMapUtil.createEntry
                    (SqlPackage.Literals.DOCUMENT_ROOT__BINDING_SQL,
                     SqlFactory.eINSTANCE.createCamelSqlBindingType())));
    }

}
