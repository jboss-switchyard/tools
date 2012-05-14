/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implicit Collection List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ImplicitCollectionList#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getImplicitCollectionList()
 * @model extendedMetaData="name='implicitCollectionList' kind='elementOnly'"
 * @generated
 */
public interface ImplicitCollectionList extends EObject {
	/**
     * Returns the value of the '<em><b>Class</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ImplicitCollectionEntry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Class</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getImplicitCollectionList_Class()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
     * @generated
     */
	EList<ImplicitCollectionEntry> getClass_();

} // ImplicitCollectionList
