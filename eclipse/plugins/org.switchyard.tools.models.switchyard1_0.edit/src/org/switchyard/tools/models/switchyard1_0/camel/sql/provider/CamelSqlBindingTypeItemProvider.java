/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sql.provider;


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

import org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.sql.SqlPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelSqlBindingTypeItemProvider
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
    public CamelSqlBindingTypeItemProvider(AdapterFactory adapterFactory) {
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

            addQueryPropertyDescriptor(object);
            addDataSourceRefPropertyDescriptor(object);
            addBatchPropertyDescriptor(object);
            addPlaceholderPropertyDescriptor(object);
            addTimerNamePropertyDescriptor(object);
            addPeriodPropertyDescriptor(object);
            addInitialDelayPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Query feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQueryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSqlBindingType_query_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSqlBindingType_query_feature", "_UI_CamelSqlBindingType_type"),
                 SqlPackage.Literals.CAMEL_SQL_BINDING_TYPE__QUERY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Data Source Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataSourceRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSqlBindingType_dataSourceRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSqlBindingType_dataSourceRef_feature", "_UI_CamelSqlBindingType_type"),
                 SqlPackage.Literals.CAMEL_SQL_BINDING_TYPE__DATA_SOURCE_REF,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Batch feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBatchPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSqlBindingType_batch_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSqlBindingType_batch_feature", "_UI_CamelSqlBindingType_type"),
                 SqlPackage.Literals.CAMEL_SQL_BINDING_TYPE__BATCH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Placeholder feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlaceholderPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSqlBindingType_placeholder_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSqlBindingType_placeholder_feature", "_UI_CamelSqlBindingType_type"),
                 SqlPackage.Literals.CAMEL_SQL_BINDING_TYPE__PLACEHOLDER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Timer Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimerNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSqlBindingType_timerName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSqlBindingType_timerName_feature", "_UI_CamelSqlBindingType_type"),
                 SqlPackage.Literals.CAMEL_SQL_BINDING_TYPE__TIMER_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Period feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPeriodPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSqlBindingType_period_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSqlBindingType_period_feature", "_UI_CamelSqlBindingType_type"),
                 SqlPackage.Literals.CAMEL_SQL_BINDING_TYPE__PERIOD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Initial Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitialDelayPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSqlBindingType_initialDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSqlBindingType_initialDelay_feature", "_UI_CamelSqlBindingType_type"),
                 SqlPackage.Literals.CAMEL_SQL_BINDING_TYPE__INITIAL_DELAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CamelSqlBindingType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelSqlBindingType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelSqlBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelSqlBindingType_type") :
            getString("_UI_CamelSqlBindingType_type") + " " + label;
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

        switch (notification.getFeatureID(CamelSqlBindingType.class)) {
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__QUERY:
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__DATA_SOURCE_REF:
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__BATCH:
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__PLACEHOLDER:
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__TIMER_NAME:
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__PERIOD:
            case SqlPackage.CAMEL_SQL_BINDING_TYPE__INITIAL_DELAY:
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
            childFeature == SqlPackage.Literals.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER ||
            childFeature == SwitchyardPackage.Literals.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER ||
            childFeature == SqlPackage.Literals.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
