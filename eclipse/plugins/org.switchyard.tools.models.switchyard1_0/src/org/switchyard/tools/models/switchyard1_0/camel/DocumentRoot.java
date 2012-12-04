/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingAtom <em>Binding Atom</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingCamel <em>Binding Camel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingDirect <em>Binding Direct</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingFile <em>Binding File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingFtp <em>Binding Ftp</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingFtps <em>Binding Ftps</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingJms <em>Binding Jms</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingMock <em>Binding Mock</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingSeda <em>Binding Seda</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingSftp <em>Binding Sftp</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingTimer <em>Binding Timer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getImplementationCamel <em>Implementation Camel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingNettyUDP <em>Binding Netty UDP</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingNettyTCP <em>Binding Netty TCP</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingQuartz <em>Binding Quartz</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingSql <em>Binding Sql</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingMail <em>Binding Mail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
	FeatureMap getMixed();

	/**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
	EMap<String, String> getXMLNSPrefixMap();

	/**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
	EMap<String, String> getXSISchemaLocation();

	/**
     * Returns the value of the '<em><b>Binding Atom</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Atom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Atom</em>' containment reference.
     * @see #setBindingAtom(CamelAtomBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingAtom()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.atom' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
	CamelAtomBindingType getBindingAtom();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingAtom <em>Binding Atom</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Atom</em>' containment reference.
     * @see #getBindingAtom()
     * @generated
     */
	void setBindingAtom(CamelAtomBindingType value);

	/**
     * Returns the value of the '<em><b>Binding Camel</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Camel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Camel</em>' containment reference.
     * @see #setBindingCamel(CamelBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingCamel()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.camel' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
	CamelBindingType getBindingCamel();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingCamel <em>Binding Camel</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Camel</em>' containment reference.
     * @see #getBindingCamel()
     * @generated
     */
	void setBindingCamel(CamelBindingType value);

	/**
     * Returns the value of the '<em><b>Binding Direct</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Direct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Direct</em>' containment reference.
     * @see #setBindingDirect(CamelDirectBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingDirect()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.direct' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
	CamelDirectBindingType getBindingDirect();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingDirect <em>Binding Direct</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Direct</em>' containment reference.
     * @see #getBindingDirect()
     * @generated
     */
	void setBindingDirect(CamelDirectBindingType value);

	/**
     * Returns the value of the '<em><b>Binding File</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding File</em>' containment reference.
     * @see #setBindingFile(CamelFileBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingFile()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.file' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
	CamelFileBindingType getBindingFile();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingFile <em>Binding File</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding File</em>' containment reference.
     * @see #getBindingFile()
     * @generated
     */
	void setBindingFile(CamelFileBindingType value);

	/**
     * Returns the value of the '<em><b>Binding Ftp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding Ftp</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Ftp</em>' containment reference.
     * @see #setBindingFtp(CamelFtpBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingFtp()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.ftp' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
    CamelFtpBindingType getBindingFtp();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingFtp <em>Binding Ftp</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Ftp</em>' containment reference.
     * @see #getBindingFtp()
     * @generated
     */
    void setBindingFtp(CamelFtpBindingType value);

    /**
     * Returns the value of the '<em><b>Binding Ftps</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding Ftps</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Ftps</em>' containment reference.
     * @see #setBindingFtps(CamelFtpsBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingFtps()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.ftps' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
    CamelFtpsBindingType getBindingFtps();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingFtps <em>Binding Ftps</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Ftps</em>' containment reference.
     * @see #getBindingFtps()
     * @generated
     */
    void setBindingFtps(CamelFtpsBindingType value);

    /**
     * Returns the value of the '<em><b>Binding Jms</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding Jms</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Jms</em>' containment reference.
     * @see #setBindingJms(CamelJmsBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingJms()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.jms' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
    CamelJmsBindingType getBindingJms();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingJms <em>Binding Jms</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Jms</em>' containment reference.
     * @see #getBindingJms()
     * @generated
     */
    void setBindingJms(CamelJmsBindingType value);

    /**
     * Returns the value of the '<em><b>Binding Mock</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Mock</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Mock</em>' containment reference.
     * @see #setBindingMock(CamelMockBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingMock()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.mock' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
	CamelMockBindingType getBindingMock();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingMock <em>Binding Mock</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Mock</em>' containment reference.
     * @see #getBindingMock()
     * @generated
     */
	void setBindingMock(CamelMockBindingType value);

	/**
     * Returns the value of the '<em><b>Binding Seda</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Seda</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Seda</em>' containment reference.
     * @see #setBindingSeda(CamelSedaBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingSeda()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.seda' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
	CamelSedaBindingType getBindingSeda();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingSeda <em>Binding Seda</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Seda</em>' containment reference.
     * @see #getBindingSeda()
     * @generated
     */
	void setBindingSeda(CamelSedaBindingType value);

	/**
     * Returns the value of the '<em><b>Binding Sftp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding Sftp</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Sftp</em>' containment reference.
     * @see #setBindingSftp(CamelSftpBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingSftp()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.sftp' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
    CamelSftpBindingType getBindingSftp();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingSftp <em>Binding Sftp</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Sftp</em>' containment reference.
     * @see #getBindingSftp()
     * @generated
     */
    void setBindingSftp(CamelSftpBindingType value);

    /**
     * Returns the value of the '<em><b>Binding Timer</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Timer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Timer</em>' containment reference.
     * @see #setBindingTimer(CamelTimerBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingTimer()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.timer' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
	CamelTimerBindingType getBindingTimer();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingTimer <em>Binding Timer</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Timer</em>' containment reference.
     * @see #getBindingTimer()
     * @generated
     */
	void setBindingTimer(CamelTimerBindingType value);

	/**
     * Returns the value of the '<em><b>Implementation Camel</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Camel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation Camel</em>' containment reference.
     * @see #setImplementationCamel(CamelImplementationType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_ImplementationCamel()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation.camel' namespace='##targetNamespace' affiliation='http://docs.oasis-open.org/ns/opencsa/sca/200912#implementation'"
     * @generated
     */
	CamelImplementationType getImplementationCamel();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getImplementationCamel <em>Implementation Camel</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation Camel</em>' containment reference.
     * @see #getImplementationCamel()
     * @generated
     */
	void setImplementationCamel(CamelImplementationType value);

    /**
     * Returns the value of the '<em><b>Binding Netty UDP</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding Netty UDP</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Netty UDP</em>' containment reference.
     * @see #setBindingNettyUDP(CamelNettyUdpBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingNettyUDP()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.netty-udp' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
    CamelNettyUdpBindingType getBindingNettyUDP();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingNettyUDP <em>Binding Netty UDP</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Netty UDP</em>' containment reference.
     * @see #getBindingNettyUDP()
     * @generated
     */
    void setBindingNettyUDP(CamelNettyUdpBindingType value);

    /**
     * Returns the value of the '<em><b>Binding Netty TCP</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding Netty TCP</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Netty TCP</em>' containment reference.
     * @see #setBindingNettyTCP(CamelNettyTcpBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingNettyTCP()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.netty-tcp' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
    CamelNettyTcpBindingType getBindingNettyTCP();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingNettyTCP <em>Binding Netty TCP</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Netty TCP</em>' containment reference.
     * @see #getBindingNettyTCP()
     * @generated
     */
    void setBindingNettyTCP(CamelNettyTcpBindingType value);

    /**
     * Returns the value of the '<em><b>Binding Quartz</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding Quartz</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Quartz</em>' containment reference.
     * @see #setBindingQuartz(CamelQuartzBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingQuartz()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.quartz' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
    CamelQuartzBindingType getBindingQuartz();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingQuartz <em>Binding Quartz</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Quartz</em>' containment reference.
     * @see #getBindingQuartz()
     * @generated
     */
    void setBindingQuartz(CamelQuartzBindingType value);

    /**
     * Returns the value of the '<em><b>Binding Sql</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding Sql</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Sql</em>' containment reference.
     * @see #setBindingSql(CamelSqlBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingSql()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.sql' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
    CamelSqlBindingType getBindingSql();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingSql <em>Binding Sql</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Sql</em>' containment reference.
     * @see #getBindingSql()
     * @generated
     */
    void setBindingSql(CamelSqlBindingType value);

    /**
     * Returns the value of the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Mapper</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Mapper</em>' containment reference.
     * @see #setContextMapper(CamelContextMapperType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_ContextMapper()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='contextMapper' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#contextMapper'"
     * @generated
     */
    CamelContextMapperType getContextMapper();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getContextMapper <em>Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Mapper</em>' containment reference.
     * @see #getContextMapper()
     * @generated
     */
    void setContextMapper(CamelContextMapperType value);

    /**
     * Returns the value of the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Composer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Composer</em>' containment reference.
     * @see #setMessageComposer(CamelMessageComposerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_MessageComposer()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='messageComposer' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#messageComposer'"
     * @generated
     */
    CamelMessageComposerType getMessageComposer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getMessageComposer <em>Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Composer</em>' containment reference.
     * @see #getMessageComposer()
     * @generated
     */
    void setMessageComposer(CamelMessageComposerType value);

    /**
     * Returns the value of the '<em><b>Binding Mail</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding Mail</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Mail</em>' containment reference.
     * @see #setBindingMail(CamelMailBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getDocumentRoot_BindingMail()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.mail' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
    CamelMailBindingType getBindingMail();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingMail <em>Binding Mail</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Mail</em>' containment reference.
     * @see #getBindingMail()
     * @generated
     */
    void setBindingMail(CamelMailBindingType value);

} // DocumentRoot
