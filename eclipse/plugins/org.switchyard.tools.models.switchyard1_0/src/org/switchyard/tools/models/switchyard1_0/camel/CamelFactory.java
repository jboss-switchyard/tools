/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage
 * @generated
 */
public interface CamelFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	CamelFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Java DSL Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Java DSL Type</em>'.
     * @generated
     */
    JavaDSLType createJavaDSLType();

    /**
     * Returns a new object of class '<em>XMLDSL Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XMLDSL Type</em>'.
     * @generated
     */
    XMLDSLType createXMLDSLType();

    /**
     * Returns a new object of class '<em>Implementation Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Implementation Type</em>'.
     * @generated
     */
    CamelImplementationType createCamelImplementationType();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
	DocumentRoot createDocumentRoot();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	CamelPackage getCamelPackage();

} //CamelFactory
