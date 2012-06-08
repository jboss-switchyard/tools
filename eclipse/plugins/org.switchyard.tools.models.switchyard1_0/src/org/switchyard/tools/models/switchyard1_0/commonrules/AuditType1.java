/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonrules;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.AuditType1#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.AuditType1#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.AuditType1#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getAuditType1()
 * @model abstract="true"
 *        extendedMetaData="name='AuditType' kind='empty'"
 * @generated
 */
public interface AuditType1 extends CommonExtensionBase {

    /**
     * Returns the value of the '<em><b>Interval</b></em>' attribute.
     * The default value is <code>"1000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interval</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interval</em>' attribute.
     * @see #setInterval(int)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getAuditType1_Interval()
     * @model default="1000" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='interval'"
     * @generated
     */
    int getInterval();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.AuditType1#getInterval <em>Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interval</em>' attribute.
     * @see #getInterval()
     * @generated
     */
    void setInterval(int value);

    /**
     * Returns the value of the '<em><b>Log</b></em>' attribute.
     * The default value is <code>"event"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Log</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Log</em>' attribute.
     * @see #setLog(String)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getAuditType1_Log()
     * @model default="event" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='log'"
     * @generated
     */
    String getLog();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.AuditType1#getLog <em>Log</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log</em>' attribute.
     * @see #getLog()
     * @generated
     */
    void setLog(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"THREADED_FILE"</code>.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.commonrules.AuditType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.AuditType
     * @see #setType(AuditType)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getAuditType1_Type()
     * @model default="THREADED_FILE"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    AuditType getType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.AuditType1#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.AuditType
     * @see #getType()
     * @generated
     */
    void setType(AuditType value);
} // AuditType1
