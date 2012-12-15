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
import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.models.switchyard1_0.camel.*;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType;
import org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType;

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
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseCommonExtensionBase(CommonExtensionBase object) {
                return createCommonExtensionBaseAdapter();
            }
            @Override
            public Adapter caseImplementation(Implementation object) {
                return createImplementationAdapter();
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
