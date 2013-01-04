/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.jpa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JpaFactoryImpl extends EFactoryImpl implements JpaFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static JpaFactory init() {
        try {
            JpaFactory theJpaFactory = (JpaFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-camel-jpa:config:1.0"); 
            if (theJpaFactory != null) {
                return theJpaFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new JpaFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JpaFactoryImpl() {
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
            case JpaPackage.BASE_CAMEL_BINDING: return createBaseCamelBinding();
            case JpaPackage.CAMEL_JPA_BINDING_TYPE: return createCamelJPABindingType();
            case JpaPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case JpaPackage.JPA_CONSUMER_TYPE: return createJpaConsumerType();
            case JpaPackage.JPA_PRODUCER_TYPE: return createJpaProducerType();
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
            case JpaPackage.TIME_UNIT_TYPE:
                return createTimeUnitTypeFromString(eDataType, initialValue);
            case JpaPackage.TIME_UNIT_TYPE_OBJECT:
                return createTimeUnitTypeObjectFromString(eDataType, initialValue);
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
            case JpaPackage.TIME_UNIT_TYPE:
                return convertTimeUnitTypeToString(eDataType, instanceValue);
            case JpaPackage.TIME_UNIT_TYPE_OBJECT:
                return convertTimeUnitTypeObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseCamelBinding createBaseCamelBinding() {
        BaseCamelBindingImpl baseCamelBinding = new BaseCamelBindingImpl();
        return baseCamelBinding;
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
    public JpaProducerType createJpaProducerType() {
        JpaProducerTypeImpl jpaProducerType = new JpaProducerTypeImpl();
        return jpaProducerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeUnitType createTimeUnitTypeFromString(EDataType eDataType, String initialValue) {
        TimeUnitType result = TimeUnitType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTimeUnitTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeUnitType createTimeUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createTimeUnitTypeFromString(JpaPackage.Literals.TIME_UNIT_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTimeUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTimeUnitTypeToString(JpaPackage.Literals.TIME_UNIT_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JpaConsumerType createJpaConsumerType() {
        JpaConsumerTypeImpl jpaConsumerType = new JpaConsumerTypeImpl();
        return jpaConsumerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelJPABindingType createCamelJPABindingType() {
        CamelJPABindingTypeImpl camelJPABindingType = new CamelJPABindingTypeImpl();
        return camelJPABindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JpaPackage getJpaPackage() {
        return (JpaPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static JpaPackage getPackage() {
        return JpaPackage.eINSTANCE;
    }

} //JpaFactoryImpl
