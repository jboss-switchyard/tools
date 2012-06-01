/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.transform;

import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xslt Transform Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 XSLT Transformer Configuration.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType#getXsltFile <em>Xslt File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType#getFailOnWarning <em>Fail On Warning</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getXsltTransformType()
 * @model extendedMetaData="name='XsltTransformType' kind='empty'"
 * @generated
 */
public interface XsltTransformType extends TransformType {

    /**
     * Returns the value of the '<em><b>Xslt File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xslt File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xslt File</em>' attribute.
     * @see #setXsltFile(String)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getXsltTransformType_XsltFile()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     * @generated
     */
    String getXsltFile();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType#getXsltFile <em>Xslt File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xslt File</em>' attribute.
     * @see #getXsltFile()
     * @generated
     */
    void setXsltFile(String value);

    /**
     * Returns the value of the '<em><b>Fail On Warning</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fail On Warning</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fail On Warning</em>' attribute.
     * @see #setFailOnWarning(String)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getXsltTransformType_FailOnWarning()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getFailOnWarning();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType#getFailOnWarning <em>Fail On Warning</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fail On Warning</em>' attribute.
     * @see #getFailOnWarning()
     * @generated
     */
    void setFailOnWarning(String value);
} // XsltTransformType
