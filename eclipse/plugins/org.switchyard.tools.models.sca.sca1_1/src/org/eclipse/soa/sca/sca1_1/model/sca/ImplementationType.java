/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getAlwaysProvides <em>Always Provides</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getMayProvide <em>May Provide</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getImplementationType()
 * @model extendedMetaData="name='ImplementationType' kind='elementOnly'"
 * @generated
 */
public interface ImplementationType extends CommonExtensionBase {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getImplementationType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Always Provides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Always Provides</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Always Provides</em>' attribute.
	 * @see #setAlwaysProvides(List)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getImplementationType_AlwaysProvides()
	 * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
	 *        extendedMetaData="kind='attribute' name='alwaysProvides'"
	 * @generated
	 */
	List<QName> getAlwaysProvides();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getAlwaysProvides <em>Always Provides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Always Provides</em>' attribute.
	 * @see #getAlwaysProvides()
	 * @generated
	 */
	void setAlwaysProvides(List<QName> value);

	/**
	 * Returns the value of the '<em><b>May Provide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>May Provide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>May Provide</em>' attribute.
	 * @see #setMayProvide(List)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getImplementationType_MayProvide()
	 * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
	 *        extendedMetaData="kind='attribute' name='mayProvide'"
	 * @generated
	 */
	List<QName> getMayProvide();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getMayProvide <em>May Provide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>May Provide</em>' attribute.
	 * @see #getMayProvide()
	 * @generated
	 */
	void setMayProvide(List<QName> value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(QName)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getImplementationType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	QName getType();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(QName value);

} // ImplementationType
