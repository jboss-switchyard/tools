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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFormatsDefinitionItemProvider
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
    public DataFormatsDefinitionItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(SpringPackage.eINSTANCE.getDataFormatsDefinition_Group());
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
     * This returns DataFormatsDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DataFormatsDefinition"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_DataFormatsDefinition_type");
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

        switch (notification.getFeatureID(DataFormatsDefinition.class)) {
            case SpringPackage.DATA_FORMATS_DEFINITION__GROUP:
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
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Bindy(),
                     SpringFactory.eINSTANCE.createBindyDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Castor(),
                     SpringFactory.eINSTANCE.createCastorDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Crypto(),
                     SpringFactory.eINSTANCE.createCryptoDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Csv(),
                     SpringFactory.eINSTANCE.createCsvDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Custom(),
                     SpringFactory.eINSTANCE.createCustomDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Flatpack(),
                     SpringFactory.eINSTANCE.createFlatpackDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Gzip(),
                     SpringFactory.eINSTANCE.createGzipDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Hl7(),
                     SpringFactory.eINSTANCE.createHl7DataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Jaxb(),
                     SpringFactory.eINSTANCE.createJaxbDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Jibx(),
                     SpringFactory.eINSTANCE.createJibxDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Json(),
                     SpringFactory.eINSTANCE.createJsonDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Protobuf(),
                     SpringFactory.eINSTANCE.createProtobufDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Rss(),
                     SpringFactory.eINSTANCE.createRssDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_SecureXML(),
                     SpringFactory.eINSTANCE.createXmlSecurityDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Serialization(),
                     SpringFactory.eINSTANCE.createSerializationDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Soapjaxb(),
                     SpringFactory.eINSTANCE.createSoapJaxbDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_String(),
                     SpringFactory.eINSTANCE.createStringDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Syslog(),
                     SpringFactory.eINSTANCE.createSyslogDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_TidyMarkup(),
                     SpringFactory.eINSTANCE.createTidyMarkupDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_XmlBeans(),
                     SpringFactory.eINSTANCE.createXmlBeansDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Xstream(),
                     SpringFactory.eINSTANCE.createXStreamDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Pgp(),
                     SpringFactory.eINSTANCE.createPgpDataFormat())));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDataFormatsDefinition_Group(),
                 FeatureMapUtil.createEntry
                    (SpringPackage.eINSTANCE.getDataFormatsDefinition_Zip(),
                     SpringFactory.eINSTANCE.createZipDataFormat())));
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
