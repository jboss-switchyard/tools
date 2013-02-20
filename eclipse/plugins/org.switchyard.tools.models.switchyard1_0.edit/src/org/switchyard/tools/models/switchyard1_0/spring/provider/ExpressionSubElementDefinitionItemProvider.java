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

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.soa.sca.core.model.addressing.AddressingFactory;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;

import org.open.oasis.docs.ns.opencsa.sca.bpel.BPELFactory;

import org.switchyard.tools.models.switchyard1_0.bean.BeanFactory;

import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;

import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpFactory;
import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomFactory;
import org.switchyard.tools.models.switchyard1_0.camel.core.CoreFactory;
import org.switchyard.tools.models.switchyard1_0.camel.file.FileFactory;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpFactory;
import org.switchyard.tools.models.switchyard1_0.camel.jms.JmsFactory;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaFactory;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailFactory;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyFactory;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzFactory;
import org.switchyard.tools.models.switchyard1_0.camel.sql.SqlFactory;

import org.switchyard.tools.models.switchyard1_0.clojure.ClojureFactory;

import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQFactory;

import org.switchyard.tools.models.switchyard1_0.http.HttpFactory;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;

import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyFactory;

import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;

import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;

import org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;

import org.switchyard.tools.models.switchyard1_0.transform.TransformFactory;

import org.switchyard.tools.models.switchyard1_0.validate.ValidateFactory;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionSubElementDefinitionItemProvider
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
    public ExpressionSubElementDefinitionItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Constant());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_El());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Groovy());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Header());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Jxpath());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_JavaScript());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Language());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Method());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Mvel());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Ognl());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Php());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Python());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Ref());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Ruby());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Simple());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Spel());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Sql());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Tokenize());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Xpath());
            childrenFeatures.add(SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Xquery());
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
     * This returns ExpressionSubElementDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ExpressionSubElementDefinition"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_ExpressionSubElementDefinition_type");
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

        switch (notification.getFeatureID(ExpressionSubElementDefinition.class)) {
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EXPRESSION_DEFINITION:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__CONSTANT:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__EL:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__GROOVY:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__HEADER:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JXPATH:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__JAVA_SCRIPT:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__LANGUAGE:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__METHOD:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__MVEL:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__OGNL:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PHP:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PROPERTY:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__PYTHON:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__REF:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__RUBY:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SIMPLE:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SPEL:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__SQL:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__TOKENIZE:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XPATH:
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION__XQUERY:
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
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createConstantExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createElExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createGroovyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createHeaderExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createJavaScriptExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createJxPathExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createLanguageExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createMethodCallExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createMvelExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createOgnlExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createPhpExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createPropertyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createPythonExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createRefExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createRubyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createSimpleExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createSpELExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createSqlExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createTokenizerExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createXPathExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createXQueryExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Constant(),
                 SpringFactory.eINSTANCE.createConstantExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_El(),
                 SpringFactory.eINSTANCE.createElExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Groovy(),
                 SpringFactory.eINSTANCE.createGroovyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Header(),
                 SpringFactory.eINSTANCE.createHeaderExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Jxpath(),
                 SpringFactory.eINSTANCE.createJxPathExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_JavaScript(),
                 SpringFactory.eINSTANCE.createJavaScriptExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Language(),
                 SpringFactory.eINSTANCE.createLanguageExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Method(),
                 SpringFactory.eINSTANCE.createMethodCallExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Mvel(),
                 SpringFactory.eINSTANCE.createMvelExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Ognl(),
                 SpringFactory.eINSTANCE.createOgnlExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Php(),
                 SpringFactory.eINSTANCE.createPhpExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createAggregateDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createAliasEntry()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createAliasList()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createOutput()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createAopDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createBatchResequencerConfig()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createBeanDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createBindyDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCamelBeanPostProcessor()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCamelConsumerTemplateFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCamelContextFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCamelEndpointFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCamelJMXAgentDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCamelProducerTemplateFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCamelPropertyPlaceholderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCamelProxyFactoryDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCamelRedeliveryPolicyFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCamelRouteContextFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCamelServiceExporterDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCamelThreadPoolFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCastorDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCatchDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createChoiceDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCipherSuitesParameters()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createConstantExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createConstants()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createContextScanDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createConvertBodyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createConverterEntry()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createConverterList()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCryptoDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCsvDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCustomDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createLoadBalancer()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createCustomLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createDataFormatsDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createExpressionNode()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createDelayDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createDescriptionDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createNoOutputExpressionNode()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createDynamicRouterDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createElExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createEnrichDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createErrorHandlerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createExpressionNodeHelper()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createExpressionSubElementDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createFailoverLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createFilterDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createFilterParameters()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createFinallyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createFlatpackDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createFromDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createGroovyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createGzipDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createHeaderExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createHl7DataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createIdempotentConsumerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createImplicitCollectionEntry()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createImplicitCollectionList()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createInOnlyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createInOutDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createInterceptDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createInterceptFromDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createInterceptSendToEndpointDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createJavaScriptExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createJaxbDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createJibxDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createJsonDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createJxPathExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createKeyManagersParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createKeyStoreParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createLanguageExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createLoadBalanceDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createLogDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createLoopDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createMarshalDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createMethodCallExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createModelHelper()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createMulticastDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createMvelExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createNodeFactory()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createOgnlExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createOmitFieldEntry()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createOmitFieldList()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createOnCompletionDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createOnExceptionDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createOtherwiseDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createPackageScanDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createPhpExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createPipelineDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createPgpDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createPolicyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createPollEnrichDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createProcessDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createProcessorDefinitionHelper()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createPropertiesDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createPropertyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createPropertyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createProtobufDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createPythonExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRandomLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRecipientListDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRedeliveryPolicyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRefExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRemoveHeaderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRemoveHeadersDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRemovePropertyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createResequenceDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRollbackDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRoundRobinLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRouteBuilderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRouteContextRefDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRouteDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRouteDefinitionHelper()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRoutesDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRoutingSlipDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRssDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createRubyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSamplingDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSecureRandomParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSecureSocketProtocolsParameters()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSerializationDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSetBodyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSetExchangePatternDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSetFaultBodyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSetHeaderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSetOutHeaderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSetPropertyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSimpleExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSoapJaxbDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSortDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSpELExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSplitDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSqlExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSslContextClientParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSslContextParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSslContextServerParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createStickyLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createStopDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createStreamResequencerConfig()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createStringDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createSyslogDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createThreadPoolProfileDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createThreadsDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createThrottleDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createThrowExceptionDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createTidyMarkupDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createToDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createTokenizerExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createTopicLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createTransactedDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createTransformDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createTrustManagersParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createTryDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createUnmarshalDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createValidateDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createWeightedLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createWhenDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createWireTapDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createXmlBeansDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createXmlSecurityDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createXPathExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createXQueryExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createXStreamDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SpringFactory.eINSTANCE.createZipDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BeanFactory.eINSTANCE.createBeanImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPELFactory.eINSTANCE.createBPELImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createActionsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createActionType1()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createBPMImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createChannelsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createChannelType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createContainerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createListenersType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createListenerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createLoggersType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createLoggerType1()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createManifestType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createMappingsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createMappingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createPropertyType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createResourcesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createResourceType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createWorkItemHandlersType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 BPMFactory.eINSTANCE.createWorkItemHandlerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createArtifactsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createArtifactType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createDomainType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createEsbInterface()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createHandlersType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createHandlerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createPropertyType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createResourceType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createSwitchYardType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createTransformsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createValidatesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createJavaOperationSelectorType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createRegexOperationSelectorType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createStaticOperationSelectorType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createXPathOperationSelectorType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SwitchyardFactory.eINSTANCE.createSecurityType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ClojureFactory.eINSTANCE.createClojureImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 HornetQFactory.eINSTANCE.createBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 HornetQFactory.eINSTANCE.createConfigType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 HornetQFactory.eINSTANCE.createConnectorType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 HornetQFactory.eINSTANCE.createDiscoveryGroupType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 HornetQFactory.eINSTANCE.createPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 HornetQFactory.eINSTANCE.createPropertyType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 HornetQFactory.eINSTANCE.createHornetQContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 HornetQFactory.eINSTANCE.createHornetQMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createActionsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createActionType1()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createChannelsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createChannelType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createContainerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createListenersType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createListenerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createLoggersType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createLoggerType1()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createManifestType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createMappingsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createMappingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createPropertyType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createResourcesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createResourceType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 RulesFactory.eINSTANCE.createRulesImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SOAPFactory.eINSTANCE.createContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SOAPFactory.eINSTANCE.createSOAPMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SOAPFactory.eINSTANCE.createSOAPBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 TransformFactory.eINSTANCE.createJavaTransformType1()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 TransformFactory.eINSTANCE.createJAXBTransformType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 TransformFactory.eINSTANCE.createJsonTransformType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 TransformFactory.eINSTANCE.createSmooksTransformType1()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 TransformFactory.eINSTANCE.createXsltTransformType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ValidateFactory.eINSTANCE.createJavaValidateType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ValidateFactory.eINSTANCE.createXmlValidateType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 CamelFactory.eINSTANCE.createJavaDSLType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 CamelFactory.eINSTANCE.createXMLDSLType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 CamelFactory.eINSTANCE.createCamelImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createActivationSpec()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createConnection()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createConnectionSpec()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createEndpoint()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createInboundOperation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createInteractionSpec()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createJCABinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createJCAInboundConnection()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createJCAInboundInteraction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createJCAOutboundConnection()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createJCAOutboundInteraction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createOperation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createProcessor()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createProperty()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createResourceAdapter()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createJCAContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JcaFactory.eINSTANCE.createJCAMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ResteasyFactory.eINSTANCE.createRESTBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ResteasyFactory.eINSTANCE.createRESTContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ResteasyFactory.eINSTANCE.createRESTMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 HttpFactory.eINSTANCE.createHttpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 HttpFactory.eINSTANCE.createHttpContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 HttpFactory.eINSTANCE.createHttpMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 CoreFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 CoreFactory.eINSTANCE.createCamelBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 CoreFactory.eINSTANCE.createCamelDirectBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 CoreFactory.eINSTANCE.createCamelTimerBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 CoreFactory.eINSTANCE.createCamelSedaBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 CoreFactory.eINSTANCE.createCamelMockBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 AmqpFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 AmqpFactory.eINSTANCE.createCamelAmqpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 AtomFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 AtomFactory.eINSTANCE.createCamelAtomBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 AtomFactory.eINSTANCE.createAtomScheduledPollConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 FileFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 FileFactory.eINSTANCE.createCamelFileBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 FileFactory.eINSTANCE.createFileConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 FileFactory.eINSTANCE.createFileProducerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 FtpFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 FtpFactory.eINSTANCE.createCamelFtpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 FtpFactory.eINSTANCE.createCamelFtpsBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 FtpFactory.eINSTANCE.createCamelSftpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 FtpFactory.eINSTANCE.createRemoteFileConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 FtpFactory.eINSTANCE.createRemoteFileProducerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JmsFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JmsFactory.eINSTANCE.createCamelJmsBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JpaFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JpaFactory.eINSTANCE.createCamelJPABindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JpaFactory.eINSTANCE.createJpaConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 JpaFactory.eINSTANCE.createJpaProducerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 MailFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 MailFactory.eINSTANCE.createCamelMailBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 MailFactory.eINSTANCE.createCamelMailConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 MailFactory.eINSTANCE.createCamelMailProducerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 NettyFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 NettyFactory.eINSTANCE.createCamelNettyTcpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 NettyFactory.eINSTANCE.createCamelNettyUdpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 QuartzFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 QuartzFactory.eINSTANCE.createCamelQuartzBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SqlFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 SqlFactory.eINSTANCE.createCamelSqlBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createActivationSpec()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createCommonExtensionBase()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createBindingProperty()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createBPELImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createCallback()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createCExport()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createCFunction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createCImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createCImplementationFunction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createCImport()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createCInterface()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createComponent()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createComponentReference()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createComponentService()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createComponentType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createComponentTypeReference()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createComposite()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createConnection()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createConnectionSpec()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createSCAPropertyBase()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createProperty()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createConstrainingProperty()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createConstrainingReference()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createConstrainingService()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createConstrainingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createContributionType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createCPPExport()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createCPPFunction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createCPPImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createCPPImplementationFunction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createCPPImport()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createCPPInterface()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createDeployableType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createDocumentation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createEJBImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createEJBSessionBeanBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createExportType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createImportType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createInboundOperation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createInclude()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createIntent()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createIntentMap()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createIntentQualifier()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createInteractionSpec()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJavaExportType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJavaImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJavaImportType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJavaInterface()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJCABinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJCAInboundConnection()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJCAInboundInteraction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJCAOutboundConnection()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJCAOutboundInteraction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJEEImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJMSActivationSpec()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJMSBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJMSConnectionFactory()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJMSDestination()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJMSHeaders()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJMSMessageSelection()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJMSOperationProperties()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJMSResourceAdapter()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createJMSResponse()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createOperation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createPolicySet()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createPolicySetAttachment()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createPolicySetReference()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createPropertyValue()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createQualifier()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createReference()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createResourceAdapter()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createSCABinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createSCAImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createService()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createSpringImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createTDefinitions()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createValueType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createWebImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createWebServiceBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createWire()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 ScaFactory.eINSTANCE.createWSDLPortType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 AddressingFactory.eINSTANCE.createAttributedQNameType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 AddressingFactory.eINSTANCE.createAttributedUnsignedLongType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 AddressingFactory.eINSTANCE.createAttributedURIType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 AddressingFactory.eINSTANCE.createEndpointReferenceType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 AddressingFactory.eINSTANCE.createMetadataType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 AddressingFactory.eINSTANCE.createProblemActionType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 AddressingFactory.eINSTANCE.createReferenceParametersType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 AddressingFactory.eINSTANCE.createRelatesToType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property(),
                 XMLTypeFactory.eINSTANCE.createAnyType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Python(),
                 SpringFactory.eINSTANCE.createPythonExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Ref(),
                 SpringFactory.eINSTANCE.createRefExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Ruby(),
                 SpringFactory.eINSTANCE.createRubyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Simple(),
                 SpringFactory.eINSTANCE.createSimpleExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Spel(),
                 SpringFactory.eINSTANCE.createSpELExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Sql(),
                 SpringFactory.eINSTANCE.createSqlExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Tokenize(),
                 SpringFactory.eINSTANCE.createTokenizerExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Xpath(),
                 SpringFactory.eINSTANCE.createXPathExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Xquery(),
                 SpringFactory.eINSTANCE.createXQueryExpression()));
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
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_ExpressionDefinition() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Property() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Constant() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_El() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Groovy() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Header() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_JavaScript() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Jxpath() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Language() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Method() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Mvel() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Ognl() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Php() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Python() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Ref() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Ruby() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Simple() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Spel() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Sql() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Tokenize() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Xpath() ||
            childFeature == SpringPackage.eINSTANCE.getExpressionSubElementDefinition_Xquery();

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
