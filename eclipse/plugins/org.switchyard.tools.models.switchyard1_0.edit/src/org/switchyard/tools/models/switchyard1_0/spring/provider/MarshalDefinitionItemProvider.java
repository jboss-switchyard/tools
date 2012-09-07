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

import org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MarshalDefinitionItemProvider
    extends NoOutputDefinitionItemProvider
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
    public MarshalDefinitionItemProvider(AdapterFactory adapterFactory) {
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

            addRefPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MarshalDefinition_ref_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MarshalDefinition_ref_feature", "_UI_MarshalDefinition_type"),
                 SpringPackage.eINSTANCE.getMarshalDefinition_Ref(),
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
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Bindy());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Castor());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Crypto());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Csv());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Custom());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Flatpack());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Gzip());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Hl7());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Jaxb());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Jibx());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Json());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Protobuf());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Rss());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_SecureXML());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Serialization());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Soapjaxb());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_String());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Syslog());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_TidyMarkup());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_XmlBeans());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Xstream());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Pgp());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_Zip());
            childrenFeatures.add(SpringPackage.eINSTANCE.getMarshalDefinition_AnyAttribute2());
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
     * This returns MarshalDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/MarshalDefinition"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((MarshalDefinition)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_MarshalDefinition_type") :
            getString("_UI_MarshalDefinition_type") + " " + label;
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

        switch (notification.getFeatureID(MarshalDefinition.class)) {
            case SpringPackage.MARSHAL_DEFINITION__REF:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SpringPackage.MARSHAL_DEFINITION__BINDY:
            case SpringPackage.MARSHAL_DEFINITION__CASTOR:
            case SpringPackage.MARSHAL_DEFINITION__CRYPTO:
            case SpringPackage.MARSHAL_DEFINITION__CSV:
            case SpringPackage.MARSHAL_DEFINITION__CUSTOM:
            case SpringPackage.MARSHAL_DEFINITION__FLATPACK:
            case SpringPackage.MARSHAL_DEFINITION__GZIP:
            case SpringPackage.MARSHAL_DEFINITION__HL7:
            case SpringPackage.MARSHAL_DEFINITION__JAXB:
            case SpringPackage.MARSHAL_DEFINITION__JIBX:
            case SpringPackage.MARSHAL_DEFINITION__JSON:
            case SpringPackage.MARSHAL_DEFINITION__PROTOBUF:
            case SpringPackage.MARSHAL_DEFINITION__RSS:
            case SpringPackage.MARSHAL_DEFINITION__SECURE_XML:
            case SpringPackage.MARSHAL_DEFINITION__SERIALIZATION:
            case SpringPackage.MARSHAL_DEFINITION__SOAPJAXB:
            case SpringPackage.MARSHAL_DEFINITION__STRING:
            case SpringPackage.MARSHAL_DEFINITION__SYSLOG:
            case SpringPackage.MARSHAL_DEFINITION__TIDY_MARKUP:
            case SpringPackage.MARSHAL_DEFINITION__XML_BEANS:
            case SpringPackage.MARSHAL_DEFINITION__XSTREAM:
            case SpringPackage.MARSHAL_DEFINITION__PGP:
            case SpringPackage.MARSHAL_DEFINITION__ZIP:
            case SpringPackage.MARSHAL_DEFINITION__ANY_ATTRIBUTE2:
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
                (SpringPackage.eINSTANCE.getMarshalDefinition_Bindy(),
                 SpringFactory.eINSTANCE.createBindyDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Castor(),
                 SpringFactory.eINSTANCE.createCastorDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Crypto(),
                 SpringFactory.eINSTANCE.createCryptoDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Csv(),
                 SpringFactory.eINSTANCE.createCsvDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Custom(),
                 SpringFactory.eINSTANCE.createCustomDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Flatpack(),
                 SpringFactory.eINSTANCE.createFlatpackDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Gzip(),
                 SpringFactory.eINSTANCE.createGzipDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Hl7(),
                 SpringFactory.eINSTANCE.createHl7DataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Jaxb(),
                 SpringFactory.eINSTANCE.createJaxbDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Jibx(),
                 SpringFactory.eINSTANCE.createJibxDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Json(),
                 SpringFactory.eINSTANCE.createJsonDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Protobuf(),
                 SpringFactory.eINSTANCE.createProtobufDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Rss(),
                 SpringFactory.eINSTANCE.createRssDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_SecureXML(),
                 SpringFactory.eINSTANCE.createXmlSecurityDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Serialization(),
                 SpringFactory.eINSTANCE.createSerializationDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Soapjaxb(),
                 SpringFactory.eINSTANCE.createSoapJaxbDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_String(),
                 SpringFactory.eINSTANCE.createStringDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Syslog(),
                 SpringFactory.eINSTANCE.createSyslogDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_TidyMarkup(),
                 SpringFactory.eINSTANCE.createTidyMarkupDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_XmlBeans(),
                 SpringFactory.eINSTANCE.createXmlBeansDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Xstream(),
                 SpringFactory.eINSTANCE.createXStreamDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Pgp(),
                 SpringFactory.eINSTANCE.createPgpDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getMarshalDefinition_Zip(),
                 SpringFactory.eINSTANCE.createZipDataFormat()));
    }

}
