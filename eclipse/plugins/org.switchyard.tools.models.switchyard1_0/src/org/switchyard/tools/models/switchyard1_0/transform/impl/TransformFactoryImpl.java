/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.transform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.transform.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformFactoryImpl extends EFactoryImpl implements TransformFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static TransformFactory init() {
        try {
            TransformFactory theTransformFactory = (TransformFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-config:transform:1.0"); 
            if (theTransformFactory != null) {
                return theTransformFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TransformFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TransformFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case TransformPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case TransformPackage.JAVA_TRANSFORM_TYPE1: return createJavaTransformType1();
            case TransformPackage.JAXB_TRANSFORM_TYPE: return createJAXBTransformType();
            case TransformPackage.JSON_TRANSFORM_TYPE: return createJsonTransformType();
            case TransformPackage.SMOOKS_TRANSFORM_TYPE1: return createSmooksTransformType1();
            case TransformPackage.XSLT_TRANSFORM_TYPE: return createXsltTransformType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case TransformPackage.JAVA_TRANSFORM_TYPE:
                return createJavaTransformTypeFromString(eDataType, initialValue);
            case TransformPackage.SMOOKS_TRANSFORM_TYPE:
                return createSmooksTransformTypeFromString(eDataType, initialValue);
            case TransformPackage.JAVA_TRANSFORM_TYPE_OBJECT:
                return createJavaTransformTypeObjectFromString(eDataType, initialValue);
            case TransformPackage.SMOOKS_TRANSFORM_TYPE_OBJECT:
                return createSmooksTransformTypeObjectFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case TransformPackage.JAVA_TRANSFORM_TYPE:
                return convertJavaTransformTypeToString(eDataType, instanceValue);
            case TransformPackage.SMOOKS_TRANSFORM_TYPE:
                return convertSmooksTransformTypeToString(eDataType, instanceValue);
            case TransformPackage.JAVA_TRANSFORM_TYPE_OBJECT:
                return convertJavaTransformTypeObjectToString(eDataType, instanceValue);
            case TransformPackage.SMOOKS_TRANSFORM_TYPE_OBJECT:
                return convertSmooksTransformTypeObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaTransformType1 createJavaTransformType1() {
        JavaTransformType1Impl javaTransformType1 = new JavaTransformType1Impl();
        return javaTransformType1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JAXBTransformType createJAXBTransformType() {
        JAXBTransformTypeImpl jaxbTransformType = new JAXBTransformTypeImpl();
        return jaxbTransformType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JsonTransformType createJsonTransformType() {
        JsonTransformTypeImpl jsonTransformType = new JsonTransformTypeImpl();
        return jsonTransformType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SmooksTransformType1 createSmooksTransformType1() {
        SmooksTransformType1Impl smooksTransformType1 = new SmooksTransformType1Impl();
        return smooksTransformType1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XsltTransformType createXsltTransformType() {
        XsltTransformTypeImpl xsltTransformType = new XsltTransformTypeImpl();
        return xsltTransformType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaTransformType createJavaTransformTypeFromString(EDataType eDataType, String initialValue) {
        JavaTransformType result = JavaTransformType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertJavaTransformTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SmooksTransformType createSmooksTransformTypeFromString(EDataType eDataType, String initialValue) {
        SmooksTransformType result = SmooksTransformType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertSmooksTransformTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaTransformType createJavaTransformTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createJavaTransformTypeFromString(TransformPackage.Literals.JAVA_TRANSFORM_TYPE, initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertJavaTransformTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertJavaTransformTypeToString(TransformPackage.Literals.JAVA_TRANSFORM_TYPE, instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SmooksTransformType createSmooksTransformTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createSmooksTransformTypeFromString(TransformPackage.Literals.SMOOKS_TRANSFORM_TYPE, initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertSmooksTransformTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertSmooksTransformTypeToString(TransformPackage.Literals.SMOOKS_TRANSFORM_TYPE, instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TransformPackage getTransformPackage() {
        return (TransformPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static TransformPackage getPackage() {
        return TransformPackage.eINSTANCE;
    }

} //TransformFactoryImpl
