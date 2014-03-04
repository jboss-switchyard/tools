/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.transform.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage
 * @generated
 */
public class TransformAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static TransformPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TransformAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TransformPackage.eINSTANCE;
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
	protected TransformSwitch<Adapter> modelSwitch =
		new TransformSwitch<Adapter>() {
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseDozerFileEntryType(DozerFileEntryType object) {
                return createDozerFileEntryTypeAdapter();
            }
            @Override
            public Adapter caseDozerMappingFilesType(DozerMappingFilesType object) {
                return createDozerMappingFilesTypeAdapter();
            }
            @Override
            public Adapter caseDozerTransformType(DozerTransformType object) {
                return createDozerTransformTypeAdapter();
            }
            @Override
            public Adapter caseJavaTransformType1(JavaTransformType1 object) {
                return createJavaTransformType1Adapter();
            }
            @Override
            public Adapter caseJAXBTransformType(JAXBTransformType object) {
                return createJAXBTransformTypeAdapter();
            }
            @Override
            public Adapter caseJsonTransformType(JsonTransformType object) {
                return createJsonTransformTypeAdapter();
            }
            @Override
            public Adapter caseSmooksTransformType1(SmooksTransformType1 object) {
                return createSmooksTransformType1Adapter();
            }
            @Override
            public Adapter caseXsltTransformType(XsltTransformType object) {
                return createXsltTransformTypeAdapter();
            }
            @Override
            public Adapter caseTransformType(TransformType object) {
                return createTransformTypeAdapter();
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
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot
     * @generated
     */
	public Adapter createDocumentRootAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.transform.DozerFileEntryType <em>Dozer File Entry Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DozerFileEntryType
     * @generated
     */
    public Adapter createDozerFileEntryTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.transform.DozerMappingFilesType <em>Dozer Mapping Files Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DozerMappingFilesType
     * @generated
     */
    public Adapter createDozerMappingFilesTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.transform.DozerTransformType <em>Dozer Transform Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DozerTransformType
     * @generated
     */
    public Adapter createDozerTransformTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1 <em>Java Transform Type1</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1
     * @generated
     */
	public Adapter createJavaTransformType1Adapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType <em>JAXB Transform Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType
     * @generated
     */
	public Adapter createJAXBTransformTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.transform.JsonTransformType <em>Json Transform Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.transform.JsonTransformType
     * @generated
     */
	public Adapter createJsonTransformTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1 <em>Smooks Transform Type1</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1
     * @generated
     */
	public Adapter createSmooksTransformType1Adapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType <em>Xslt Transform Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType
     * @generated
     */
	public Adapter createXsltTransformTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformType <em>Transform Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.TransformType
     * @generated
     */
	public Adapter createTransformTypeAdapter() {
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

} //TransformAdapterFactory
