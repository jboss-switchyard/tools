/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loggers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.LoggersType#getLogger <em>Logger</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getLoggersType()
 * @model extendedMetaData="name='LoggersType' kind='elementOnly'"
 * @generated
 */
public interface LoggersType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Logger</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.bpm.LoggerType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Logger</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Logger</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getLoggersType_Logger()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='logger' namespace='##targetNamespace'"
     * @generated
     */
    EList<LoggerType1> getLogger();

} // LoggersType
