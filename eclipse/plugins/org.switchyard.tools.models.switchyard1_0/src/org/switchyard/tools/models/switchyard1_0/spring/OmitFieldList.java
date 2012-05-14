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
 * A representation of the model object '<em><b>Omit Field List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.OmitFieldList#getOmitField <em>Omit Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getOmitFieldList()
 * @model extendedMetaData="name='omitFieldList' kind='elementOnly'"
 * @generated
 */
public interface OmitFieldList extends EObject {
	/**
     * Returns the value of the '<em><b>Omit Field</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.OmitFieldEntry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Omit Field</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getOmitFieldList_OmitField()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='omitField' namespace='##targetNamespace'"
     * @generated
     */
	EList<OmitFieldEntry> getOmitField();

} // OmitFieldList
