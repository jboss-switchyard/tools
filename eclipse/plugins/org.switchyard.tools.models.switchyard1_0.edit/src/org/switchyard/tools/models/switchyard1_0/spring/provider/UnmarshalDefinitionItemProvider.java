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
import org.switchyard.tools.models.switchyard1_0.spring.UnmarshalDefinition;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.UnmarshalDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnmarshalDefinitionItemProvider
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
    public UnmarshalDefinitionItemProvider(AdapterFactory adapterFactory) {
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
                 getString("_UI_UnmarshalDefinition_ref_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_UnmarshalDefinition_ref_feature", "_UI_UnmarshalDefinition_type"),
                 SpringPackage.eINSTANCE.getUnmarshalDefinition_Ref(),
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
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Bindy());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Castor());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Crypto());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Csv());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Custom());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Flatpack());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Gzip());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Hl7());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Jaxb());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Jibx());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Json());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Protobuf());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Rss());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_SecureXML());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Serialization());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Soapjaxb());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_String());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Syslog());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_TidyMarkup());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_XmlBeans());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Xstream());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Pgp());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_Zip());
            childrenFeatures.add(SpringPackage.eINSTANCE.getUnmarshalDefinition_AnyAttribute2());
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
     * This returns UnmarshalDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/UnmarshalDefinition"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((UnmarshalDefinition)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_UnmarshalDefinition_type") :
            getString("_UI_UnmarshalDefinition_type") + " " + label;
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

        switch (notification.getFeatureID(UnmarshalDefinition.class)) {
            case SpringPackage.UNMARSHAL_DEFINITION__REF:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SpringPackage.UNMARSHAL_DEFINITION__BINDY:
            case SpringPackage.UNMARSHAL_DEFINITION__CASTOR:
            case SpringPackage.UNMARSHAL_DEFINITION__CRYPTO:
            case SpringPackage.UNMARSHAL_DEFINITION__CSV:
            case SpringPackage.UNMARSHAL_DEFINITION__CUSTOM:
            case SpringPackage.UNMARSHAL_DEFINITION__FLATPACK:
            case SpringPackage.UNMARSHAL_DEFINITION__GZIP:
            case SpringPackage.UNMARSHAL_DEFINITION__HL7:
            case SpringPackage.UNMARSHAL_DEFINITION__JAXB:
            case SpringPackage.UNMARSHAL_DEFINITION__JIBX:
            case SpringPackage.UNMARSHAL_DEFINITION__JSON:
            case SpringPackage.UNMARSHAL_DEFINITION__PROTOBUF:
            case SpringPackage.UNMARSHAL_DEFINITION__RSS:
            case SpringPackage.UNMARSHAL_DEFINITION__SECURE_XML:
            case SpringPackage.UNMARSHAL_DEFINITION__SERIALIZATION:
            case SpringPackage.UNMARSHAL_DEFINITION__SOAPJAXB:
            case SpringPackage.UNMARSHAL_DEFINITION__STRING:
            case SpringPackage.UNMARSHAL_DEFINITION__SYSLOG:
            case SpringPackage.UNMARSHAL_DEFINITION__TIDY_MARKUP:
            case SpringPackage.UNMARSHAL_DEFINITION__XML_BEANS:
            case SpringPackage.UNMARSHAL_DEFINITION__XSTREAM:
            case SpringPackage.UNMARSHAL_DEFINITION__PGP:
            case SpringPackage.UNMARSHAL_DEFINITION__ZIP:
            case SpringPackage.UNMARSHAL_DEFINITION__ANY_ATTRIBUTE2:
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
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Bindy(),
                 SpringFactory.eINSTANCE.createBindyDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Castor(),
                 SpringFactory.eINSTANCE.createCastorDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Crypto(),
                 SpringFactory.eINSTANCE.createCryptoDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Csv(),
                 SpringFactory.eINSTANCE.createCsvDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Custom(),
                 SpringFactory.eINSTANCE.createCustomDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Flatpack(),
                 SpringFactory.eINSTANCE.createFlatpackDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Gzip(),
                 SpringFactory.eINSTANCE.createGzipDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Hl7(),
                 SpringFactory.eINSTANCE.createHl7DataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Jaxb(),
                 SpringFactory.eINSTANCE.createJaxbDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Jibx(),
                 SpringFactory.eINSTANCE.createJibxDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Json(),
                 SpringFactory.eINSTANCE.createJsonDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Protobuf(),
                 SpringFactory.eINSTANCE.createProtobufDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Rss(),
                 SpringFactory.eINSTANCE.createRssDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_SecureXML(),
                 SpringFactory.eINSTANCE.createXmlSecurityDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Serialization(),
                 SpringFactory.eINSTANCE.createSerializationDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Soapjaxb(),
                 SpringFactory.eINSTANCE.createSoapJaxbDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_String(),
                 SpringFactory.eINSTANCE.createStringDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Syslog(),
                 SpringFactory.eINSTANCE.createSyslogDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_TidyMarkup(),
                 SpringFactory.eINSTANCE.createTidyMarkupDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_XmlBeans(),
                 SpringFactory.eINSTANCE.createXmlBeansDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Xstream(),
                 SpringFactory.eINSTANCE.createXStreamDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Pgp(),
                 SpringFactory.eINSTANCE.createPgpDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getUnmarshalDefinition_Zip(),
                 SpringFactory.eINSTANCE.createZipDataFormat()));
    }

}
