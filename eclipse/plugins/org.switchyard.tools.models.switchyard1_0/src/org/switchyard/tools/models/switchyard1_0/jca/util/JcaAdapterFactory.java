/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

import org.switchyard.tools.models.switchyard1_0.jca.*;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage
 * @generated
 */
public class JcaAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static JcaPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JcaAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = JcaPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JcaSwitch<Adapter> modelSwitch =
        new JcaSwitch<Adapter>() {
            @Override
            public Adapter caseActivationSpec(ActivationSpec object) {
                return createActivationSpecAdapter();
            }
            @Override
            public Adapter caseConnection(Connection object) {
                return createConnectionAdapter();
            }
            @Override
            public Adapter caseConnectionSpec(ConnectionSpec object) {
                return createConnectionSpecAdapter();
            }
            @Override
            public Adapter caseEndpoint(Endpoint object) {
                return createEndpointAdapter();
            }
            @Override
            public Adapter caseInboundOperation(InboundOperation object) {
                return createInboundOperationAdapter();
            }
            @Override
            public Adapter caseInteractionSpec(InteractionSpec object) {
                return createInteractionSpecAdapter();
            }
            @Override
            public Adapter caseJCABinding(JCABinding object) {
                return createJCABindingAdapter();
            }
            @Override
            public Adapter caseJCAInboundConnection(JCAInboundConnection object) {
                return createJCAInboundConnectionAdapter();
            }
            @Override
            public Adapter caseJCAInboundInteraction(JCAInboundInteraction object) {
                return createJCAInboundInteractionAdapter();
            }
            @Override
            public Adapter caseJCAOutboundConnection(JCAOutboundConnection object) {
                return createJCAOutboundConnectionAdapter();
            }
            @Override
            public Adapter caseJCAOutboundInteraction(JCAOutboundInteraction object) {
                return createJCAOutboundInteractionAdapter();
            }
            @Override
            public Adapter caseOperation(Operation object) {
                return createOperationAdapter();
            }
            @Override
            public Adapter caseProcessor(Processor object) {
                return createProcessorAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter caseResourceAdapter(ResourceAdapter object) {
                return createResourceAdapterAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseJCAContextMapperType(JCAContextMapperType object) {
                return createJCAContextMapperTypeAdapter();
            }
            @Override
            public Adapter caseJCAMessageComposerType(JCAMessageComposerType object) {
                return createJCAMessageComposerTypeAdapter();
            }
            @Override
            public Adapter caseBatchCommit(BatchCommit object) {
                return createBatchCommitAdapter();
            }
            @Override
            public Adapter caseCommonExtensionBase(CommonExtensionBase object) {
                return createCommonExtensionBaseAdapter();
            }
            @Override
            public Adapter caseBinding(Binding object) {
                return createBindingAdapter();
            }
            @Override
            public Adapter caseSwitchYardBindingType(SwitchYardBindingType object) {
                return createSwitchYardBindingTypeAdapter();
            }
            @Override
            public Adapter caseContextMapperType(ContextMapperType object) {
                return createContextMapperTypeAdapter();
            }
            @Override
            public Adapter caseMessageComposerType(MessageComposerType object) {
                return createMessageComposerTypeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec <em>Activation Spec</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec
     * @generated
     */
    public Adapter createActivationSpecAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.Connection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Connection
     * @generated
     */
    public Adapter createConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec <em>Connection Spec</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec
     * @generated
     */
    public Adapter createConnectionSpecAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAContextMapperType <em>JCA Context Mapper Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAContextMapperType
     * @generated
     */
    public Adapter createJCAContextMapperTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAMessageComposerType <em>JCA Message Composer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAMessageComposerType
     * @generated
     */
    public Adapter createJCAMessageComposerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.BatchCommit <em>Batch Commit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.BatchCommit
     * @generated
     */
    public Adapter createBatchCommitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType <em>Context Mapper Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType
     * @generated
     */
    public Adapter createContextMapperTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType <em>Message Composer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType
     * @generated
     */
    public Adapter createMessageComposerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.InboundOperation <em>Inbound Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.InboundOperation
     * @generated
     */
    public Adapter createInboundOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec <em>Interaction Spec</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec
     * @generated
     */
    public Adapter createInteractionSpecAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding <em>JCA Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding
     * @generated
     */
    public Adapter createJCABindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection <em>JCA Inbound Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection
     * @generated
     */
    public Adapter createJCAInboundConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction <em>JCA Inbound Interaction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction
     * @generated
     */
    public Adapter createJCAInboundInteractionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection <em>JCA Outbound Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection
     * @generated
     */
    public Adapter createJCAOutboundConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction <em>JCA Outbound Interaction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction
     * @generated
     */
    public Adapter createJCAOutboundInteractionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Operation
     * @generated
     */
    public Adapter createOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter <em>Resource Adapter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter
     * @generated
     */
    public Adapter createResourceAdapterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.Processor <em>Processor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Processor
     * @generated
     */
    public Adapter createProcessorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.jca.Endpoint <em>Endpoint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Endpoint
     * @generated
     */
    public Adapter createEndpointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase <em>Common Extension Base</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase
     * @generated
     */
    public Adapter createCommonExtensionBaseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Binding <em>Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Binding
     * @generated
     */
    public Adapter createBindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType <em>Switch Yard Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType
     * @generated
     */
    public Adapter createSwitchYardBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //JcaAdapterFactory
