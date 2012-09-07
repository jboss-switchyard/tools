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

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.WhenDefinition;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.WhenDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WhenDefinitionItemProvider
    extends ExpressionNodeItemProvider
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
    public WhenDefinitionItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(SpringPackage.eINSTANCE.getWhenDefinition_AnyAttribute2());
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
     * This returns WhenDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/WhenDefinition"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((WhenDefinition)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_WhenDefinition_type") :
            getString("_UI_WhenDefinition_type") + " " + label;
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

        switch (notification.getFeatureID(WhenDefinition.class)) {
            case SpringPackage.WHEN_DEFINITION__ANY_ATTRIBUTE2:
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
            childFeature == SpringPackage.eINSTANCE.getOptionalIdentifiedDefinition_Description() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Property() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_ExpressionDefinition() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Constant() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_El() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Groovy() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Header() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_JavaScript() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Jxpath() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Language() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Method() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Mvel() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Ognl() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Php() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Python() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Ref() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Ruby() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Simple() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Spel() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Sql() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Tokenize() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Xpath() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Xquery() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Aggregate() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Aop() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Bean() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_DoCatch() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Choice() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_ConvertBodyTo() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Delay() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_DynamicRouter() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Enrich() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Filter() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_DoFinally() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_IdempotentConsumer() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_InOnly() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_InOut() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Intercept() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_InterceptFrom() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_InterceptToEndpoint() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_LoadBalance() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Log() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Loop() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Marshal() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Multicast() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_OnCompletion() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_OnException() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Otherwise() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Pipeline() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Policy() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_PollEnrich() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Process() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_RecipientList() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_RemoveHeader() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_RemoveHeaders() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_RemoveProperty() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Resequence() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Rollback() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Route() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_RoutingSlip() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Sample() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_SetBody() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_SetExchangePattern() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_SetFaultBody() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_SetHeader() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_SetOutHeader() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_SetProperty() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Sort() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Split() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Stop() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Threads() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Throttle() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_ThrowException() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_To() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Transacted() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Transform() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_DoTry() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Unmarshal() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_Validate() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_When() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionNode_WireTap();

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
