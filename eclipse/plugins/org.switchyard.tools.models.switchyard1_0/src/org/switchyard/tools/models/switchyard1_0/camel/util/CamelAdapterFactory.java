/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;


import org.switchyard.tools.models.switchyard1_0.camel.*;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage
 * @generated
 */
public class CamelAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static CamelPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CamelAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = CamelPackage.eINSTANCE;
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
	protected CamelSwitch<Adapter> modelSwitch =
		new CamelSwitch<Adapter>() {
            @Override
            public Adapter caseBaseCamelBinding(BaseCamelBinding object) {
                return createBaseCamelBindingAdapter();
            }
            @Override
            public Adapter caseCamelBindingType(CamelBindingType object) {
                return createCamelBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelFileBindingType(CamelFileBindingType object) {
                return createCamelFileBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelFtpBindingType(CamelFtpBindingType object) {
                return createCamelFtpBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelFtpsBindingType(CamelFtpsBindingType object) {
                return createCamelFtpsBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelSftpBindingType(CamelSftpBindingType object) {
                return createCamelSftpBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelAtomBindingType(CamelAtomBindingType object) {
                return createCamelAtomBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelDirectBindingType(CamelDirectBindingType object) {
                return createCamelDirectBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelTimerBindingType(CamelTimerBindingType object) {
                return createCamelTimerBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelSedaBindingType(CamelSedaBindingType object) {
                return createCamelSedaBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelMockBindingType(CamelMockBindingType object) {
                return createCamelMockBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelNettyTcpBindingType(CamelNettyTcpBindingType object) {
                return createCamelNettyTcpBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelNettyUdpBindingType(CamelNettyUdpBindingType object) {
                return createCamelNettyUdpBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelNettyBindingType(CamelNettyBindingType object) {
                return createCamelNettyBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelQuartzBindingType(CamelQuartzBindingType object) {
                return createCamelQuartzBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelJmsBindingType(CamelJmsBindingType object) {
                return createCamelJmsBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelSqlBindingType(CamelSqlBindingType object) {
                return createCamelSqlBindingTypeAdapter();
            }
            @Override
            public Adapter caseJavaDSLType(JavaDSLType object) {
                return createJavaDSLTypeAdapter();
            }
            @Override
            public Adapter caseXMLDSLType(XMLDSLType object) {
                return createXMLDSLTypeAdapter();
            }
            @Override
            public Adapter caseCamelImplementationType(CamelImplementationType object) {
                return createCamelImplementationTypeAdapter();
            }
            @Override
            public Adapter caseGenericFileBindingType(GenericFileBindingType object) {
                return createGenericFileBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelRemoteBindingType(CamelRemoteBindingType object) {
                return createCamelRemoteBindingTypeAdapter();
            }
            @Override
            public Adapter caseScheduledPollConsumerType(ScheduledPollConsumerType object) {
                return createScheduledPollConsumerTypeAdapter();
            }
            @Override
            public Adapter caseScheduledBatchPollConsumerType(ScheduledBatchPollConsumerType object) {
                return createScheduledBatchPollConsumerTypeAdapter();
            }
            @Override
            public Adapter caseFileConsumerType(FileConsumerType object) {
                return createFileConsumerTypeAdapter();
            }
            @Override
            public Adapter caseFileProducerType(FileProducerType object) {
                return createFileProducerTypeAdapter();
            }
            @Override
            public Adapter caseRemoteFileConsumerType(RemoteFileConsumerType object) {
                return createRemoteFileConsumerTypeAdapter();
            }
            @Override
            public Adapter caseRemoteFileProducerType(RemoteFileProducerType object) {
                return createRemoteFileProducerTypeAdapter();
            }
            @Override
            public Adapter caseGenericFileConsumerType(GenericFileConsumerType object) {
                return createGenericFileConsumerTypeAdapter();
            }
            @Override
            public Adapter caseGenericFileProducerType(GenericFileProducerType object) {
                return createGenericFileProducerTypeAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseCamelContextMapperType(CamelContextMapperType object) {
                return createCamelContextMapperTypeAdapter();
            }
            @Override
            public Adapter caseCamelMessageComposerType(CamelMessageComposerType object) {
                return createCamelMessageComposerTypeAdapter();
            }
            @Override
            public Adapter caseCamelMailConsumerType(CamelMailConsumerType object) {
                return createCamelMailConsumerTypeAdapter();
            }
            @Override
            public Adapter caseCamelMailProducerType(CamelMailProducerType object) {
                return createCamelMailProducerTypeAdapter();
            }
            @Override
            public Adapter caseCamelMailBindingType(CamelMailBindingType object) {
                return createCamelMailBindingTypeAdapter();
            }
            @Override
            public Adapter caseJpaProducerType(JpaProducerType object) {
                return createJpaProducerTypeAdapter();
            }
            @Override
            public Adapter caseJpaConsumerType(JpaConsumerType object) {
                return createJpaConsumerTypeAdapter();
            }
            @Override
            public Adapter caseCamelJPABindingType(CamelJPABindingType object) {
                return createCamelJPABindingTypeAdapter();
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
            public Adapter caseImplementation(Implementation object) {
                return createImplementationAdapter();
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
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding <em>Base Camel Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding
     * @generated
     */
    public Adapter createBaseCamelBindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType <em>Atom Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType
     * @generated
     */
	public Adapter createCamelAtomBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType <em>Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType
     * @generated
     */
	public Adapter createCamelBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType <em>Direct Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType
     * @generated
     */
	public Adapter createCamelDirectBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType <em>File Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType
     * @generated
     */
	public Adapter createCamelFileBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType <em>Ftp Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType
     * @generated
     */
    public Adapter createCamelFtpBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType <em>Ftps Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType
     * @generated
     */
    public Adapter createCamelFtpsBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType <em>Implementation Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType
     * @generated
     */
	public Adapter createCamelImplementationTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType <em>Jms Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType
     * @generated
     */
    public Adapter createCamelJmsBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType <em>Netty Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType
     * @generated
     */
    public Adapter createCamelNettyBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyUdpBindingType <em>Netty Udp Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelNettyUdpBindingType
     * @generated
     */
    public Adapter createCamelNettyUdpBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyTcpBindingType <em>Netty Tcp Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelNettyTcpBindingType
     * @generated
     */
    public Adapter createCamelNettyTcpBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType <em>Mock Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType
     * @generated
     */
	public Adapter createCamelMockBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType <em>Seda Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType
     * @generated
     */
	public Adapter createCamelSedaBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType <em>Timer Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType
     * @generated
     */
	public Adapter createCamelTimerBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType <em>Sftp Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType
     * @generated
     */
    public Adapter createCamelSftpBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot
     * @generated
     */
	public Adapter createDocumentRootAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelContextMapperType <em>Context Mapper Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelContextMapperType
     * @generated
     */
    public Adapter createCamelContextMapperTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMessageComposerType <em>Message Composer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelMessageComposerType
     * @generated
     */
    public Adapter createCamelMessageComposerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType <em>Mail Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType
     * @generated
     */
    public Adapter createCamelMailConsumerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailProducerType <em>Mail Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelMailProducerType
     * @generated
     */
    public Adapter createCamelMailProducerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailBindingType <em>Mail Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelMailBindingType
     * @generated
     */
    public Adapter createCamelMailBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaProducerType <em>Jpa Producer Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.JpaProducerType
     * @generated
     */
	public Adapter createJpaProducerTypeAdapter() {
        return null;
    }

				/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType <em>Jpa Consumer Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType
     * @generated
     */
	public Adapter createJpaConsumerTypeAdapter() {
        return null;
    }

				/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJPABindingType <em>JPA Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJPABindingType
     * @generated
     */
	public Adapter createCamelJPABindingTypeAdapter() {
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
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType <em>Remote Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType
     * @generated
     */
    public Adapter createCamelRemoteBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType <em>File Consumer Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType
     * @generated
     */
	public Adapter createFileConsumerTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.FileProducerType <em>File Producer Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.FileProducerType
     * @generated
     */
	public Adapter createFileProducerTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType <em>Java DSL Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType
     * @generated
     */
	public Adapter createJavaDSLTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType <em>XMLDSL Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType
     * @generated
     */
    public Adapter createXMLDSLTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType <em>Scheduled Poll Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType
     * @generated
     */
    public Adapter createScheduledPollConsumerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType <em>Generic File Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType
     * @generated
     */
    public Adapter createGenericFileBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.ScheduledBatchPollConsumerType <em>Scheduled Batch Poll Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ScheduledBatchPollConsumerType
     * @generated
     */
    public Adapter createScheduledBatchPollConsumerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType <em>Generic File Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType
     * @generated
     */
    public Adapter createGenericFileConsumerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType <em>Generic File Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType
     * @generated
     */
    public Adapter createGenericFileProducerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.RemoteFileConsumerType <em>Remote File Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.RemoteFileConsumerType
     * @generated
     */
    public Adapter createRemoteFileConsumerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.RemoteFileProducerType <em>Remote File Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.RemoteFileProducerType
     * @generated
     */
    public Adapter createRemoteFileProducerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelQuartzBindingType <em>Quartz Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelQuartzBindingType
     * @generated
     */
    public Adapter createCamelQuartzBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSqlBindingType <em>Sql Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSqlBindingType
     * @generated
     */
    public Adapter createCamelSqlBindingTypeAdapter() {
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
     * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Implementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Implementation
     * @generated
     */
	public Adapter createImplementationAdapter() {
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

} //CamelAdapterFactory
