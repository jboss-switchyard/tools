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
import org.switchyard.tools.models.switchyard1_0.spring.TokenizerExpression;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.TokenizerExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenizerExpressionItemProvider
    extends ExpressionItemProvider
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
    public TokenizerExpressionItemProvider(AdapterFactory adapterFactory) {
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

            addEndTokenPropertyDescriptor(object);
            addHeaderNamePropertyDescriptor(object);
            addIncludeTokensPropertyDescriptor(object);
            addInheritNamespaceTagNamePropertyDescriptor(object);
            addRegexPropertyDescriptor(object);
            addTokenPropertyDescriptor(object);
            addXmlPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the End Token feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndTokenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TokenizerExpression_endToken_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TokenizerExpression_endToken_feature", "_UI_TokenizerExpression_type"),
                 SpringPackage.eINSTANCE.getTokenizerExpression_EndToken(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Header Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHeaderNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TokenizerExpression_headerName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TokenizerExpression_headerName_feature", "_UI_TokenizerExpression_type"),
                 SpringPackage.eINSTANCE.getTokenizerExpression_HeaderName(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Include Tokens feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIncludeTokensPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TokenizerExpression_includeTokens_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TokenizerExpression_includeTokens_feature", "_UI_TokenizerExpression_type"),
                 SpringPackage.eINSTANCE.getTokenizerExpression_IncludeTokens(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Inherit Namespace Tag Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInheritNamespaceTagNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TokenizerExpression_inheritNamespaceTagName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TokenizerExpression_inheritNamespaceTagName_feature", "_UI_TokenizerExpression_type"),
                 SpringPackage.eINSTANCE.getTokenizerExpression_InheritNamespaceTagName(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Regex feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRegexPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TokenizerExpression_regex_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TokenizerExpression_regex_feature", "_UI_TokenizerExpression_type"),
                 SpringPackage.eINSTANCE.getTokenizerExpression_Regex(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Token feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTokenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TokenizerExpression_token_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TokenizerExpression_token_feature", "_UI_TokenizerExpression_type"),
                 SpringPackage.eINSTANCE.getTokenizerExpression_Token(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Xml feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXmlPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TokenizerExpression_xml_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TokenizerExpression_xml_feature", "_UI_TokenizerExpression_type"),
                 SpringPackage.eINSTANCE.getTokenizerExpression_Xml(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns TokenizerExpression.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/TokenizerExpression"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((TokenizerExpression)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_TokenizerExpression_type") :
            getString("_UI_TokenizerExpression_type") + " " + label;
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

        switch (notification.getFeatureID(TokenizerExpression.class)) {
            case SpringPackage.TOKENIZER_EXPRESSION__END_TOKEN:
            case SpringPackage.TOKENIZER_EXPRESSION__HEADER_NAME:
            case SpringPackage.TOKENIZER_EXPRESSION__INCLUDE_TOKENS:
            case SpringPackage.TOKENIZER_EXPRESSION__INHERIT_NAMESPACE_TAG_NAME:
            case SpringPackage.TOKENIZER_EXPRESSION__REGEX:
            case SpringPackage.TOKENIZER_EXPRESSION__TOKEN:
            case SpringPackage.TOKENIZER_EXPRESSION__XML:
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
