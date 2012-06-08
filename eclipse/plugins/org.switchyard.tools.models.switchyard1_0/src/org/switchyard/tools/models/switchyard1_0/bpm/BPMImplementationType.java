/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.emf.common.util.EList;

import org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getAction <em>Action</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getAudit <em>Audit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getTaskHandler <em>Task Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getResource <em>Resource</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getResults <em>Results</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessDefinition <em>Process Definition</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessDefinitionType <em>Process Definition Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessId <em>Process Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getMessageContentInName <em>Message Content In Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getMessageContentOutName <em>Message Content Out Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#isPersistent <em>Persistent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType()
 * @model extendedMetaData="name='BPMImplementationType' kind='elementOnly'"
 * @generated
 */
public interface BPMImplementationType extends CommonImplementationType {
	/**
     * Returns the value of the '<em><b>Action</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Action</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Action()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
     * @generated
     */
	EList<ActionType1> getAction();

	/**
     * Returns the value of the '<em><b>Audit</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Audit</em>' containment reference.
     * @see #setAudit(AuditType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Audit()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='audit' namespace='##targetNamespace'"
     * @generated
     */
	AuditType getAudit();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getAudit <em>Audit</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Audit</em>' containment reference.
     * @see #getAudit()
     * @generated
     */
	void setAudit(AuditType value);

	/**
     * Returns the value of the '<em><b>Task Handler</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Handler</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Task Handler</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_TaskHandler()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='taskHandler' namespace='##targetNamespace'"
     * @generated
     */
	EList<TaskHandlerType> getTaskHandler();

	/**
     * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.bpm.ResourceType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resource</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Resource()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
     * @generated
     */
	EList<ResourceType> getResource();

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference.
     * @see #setParameters(ParametersType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Parameters()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
     * @generated
     */
    ParametersType getParameters();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getParameters <em>Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameters</em>' containment reference.
     * @see #getParameters()
     * @generated
     */
    void setParameters(ParametersType value);

    /**
     * Returns the value of the '<em><b>Results</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Results</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Results</em>' containment reference.
     * @see #setResults(ResultsType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Results()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='results' namespace='##targetNamespace'"
     * @generated
     */
    ResultsType getResults();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getResults <em>Results</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Results</em>' containment reference.
     * @see #getResults()
     * @generated
     */
    void setResults(ResultsType value);

    /**
     * Returns the value of the '<em><b>Process Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Definition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Definition</em>' attribute.
     * @see #setProcessDefinition(String)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_ProcessDefinition()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="name='processDefinition' kind='attribute'"
     * @generated
     */
    String getProcessDefinition();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessDefinition <em>Process Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Definition</em>' attribute.
     * @see #getProcessDefinition()
     * @generated
     */
    void setProcessDefinition(String value);

    /**
     * Returns the value of the '<em><b>Process Definition Type</b></em>' attribute.
     * The default value is <code>"BPMN2"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Definition Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Definition Type</em>' attribute.
     * @see #setProcessDefinitionType(String)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_ProcessDefinitionType()
     * @model default="BPMN2" dataType="org.eclipse.emf.ecore.xml.type.NCName"
     *        extendedMetaData="name='processDefinitionType' kind='attribute'"
     * @generated
     */
    String getProcessDefinitionType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessDefinitionType <em>Process Definition Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Definition Type</em>' attribute.
     * @see #getProcessDefinitionType()
     * @generated
     */
    void setProcessDefinitionType(String value);

    /**
     * Returns the value of the '<em><b>Process Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Id</em>' attribute.
     * @see #setProcessId(String)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_ProcessId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="name='processId' kind='attribute'"
     * @generated
     */
    String getProcessId();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessId <em>Process Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Id</em>' attribute.
     * @see #getProcessId()
     * @generated
     */
    void setProcessId(String value);

    /**
     * Returns the value of the '<em><b>Message Content In Name</b></em>' attribute.
     * The default value is <code>"messsageContentIn"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Content In Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Content In Name</em>' attribute.
     * @see #setMessageContentInName(String)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_MessageContentInName()
     * @model default="messsageContentIn" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="name='messageContentInName' kind='attribute'"
     * @generated
     */
    String getMessageContentInName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getMessageContentInName <em>Message Content In Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Content In Name</em>' attribute.
     * @see #getMessageContentInName()
     * @generated
     */
    void setMessageContentInName(String value);

    /**
     * Returns the value of the '<em><b>Message Content Out Name</b></em>' attribute.
     * The default value is <code>"messageContentOut"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Content Out Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Content Out Name</em>' attribute.
     * @see #setMessageContentOutName(String)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_MessageContentOutName()
     * @model default="messageContentOut" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="name='messageContentOutName' kind='attribute'"
     * @generated
     */
    String getMessageContentOutName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getMessageContentOutName <em>Message Content Out Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Content Out Name</em>' attribute.
     * @see #getMessageContentOutName()
     * @generated
     */
    void setMessageContentOutName(String value);

    /**
     * Returns the value of the '<em><b>Persistent</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Persistent</em>' attribute.
     * @see #setPersistent(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getBPMImplementationType_Persistent()
     * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="name='persistent' kind='attribute'"
     * @generated
     */
    boolean isPersistent();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#isPersistent <em>Persistent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Persistent</em>' attribute.
     * @see #isPersistent()
     * @generated
     */
    void setPersistent(boolean value);

} // BPMImplementationType
