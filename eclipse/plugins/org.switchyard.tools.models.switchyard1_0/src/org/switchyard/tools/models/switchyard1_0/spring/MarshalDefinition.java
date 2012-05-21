/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marshal Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getBindy <em>Bindy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getCastor <em>Castor</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getCrypto <em>Crypto</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getCsv <em>Csv</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getCustom <em>Custom</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getFlatpack <em>Flatpack</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getGzip <em>Gzip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getHl7 <em>Hl7</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getJaxb <em>Jaxb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getJibx <em>Jibx</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getJson <em>Json</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getProtobuf <em>Protobuf</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getRss <em>Rss</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getSecureXML <em>Secure XML</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getSerialization <em>Serialization</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getSoapjaxb <em>Soapjaxb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getString <em>String</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getSyslog <em>Syslog</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getTidyMarkup <em>Tidy Markup</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getXmlBeans <em>Xml Beans</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getXstream <em>Xstream</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getPgp <em>Pgp</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getZip <em>Zip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getRef <em>Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition()
 * @model extendedMetaData="name='marshalDefinition' kind='elementOnly'"
 * @generated
 */
public interface MarshalDefinition extends NoOutputDefinition {
	/**
     * Returns the value of the '<em><b>Bindy</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Bindy</em>' containment reference.
     * @see #setBindy(BindyDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Bindy()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='bindy' namespace='##targetNamespace'"
     * @generated
     */
	BindyDataFormat getBindy();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getBindy <em>Bindy</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bindy</em>' containment reference.
     * @see #getBindy()
     * @generated
     */
	void setBindy(BindyDataFormat value);

	/**
     * Returns the value of the '<em><b>Castor</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Castor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Castor</em>' containment reference.
     * @see #setCastor(CastorDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Castor()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='castor' namespace='##targetNamespace'"
     * @generated
     */
	CastorDataFormat getCastor();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getCastor <em>Castor</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Castor</em>' containment reference.
     * @see #getCastor()
     * @generated
     */
	void setCastor(CastorDataFormat value);

	/**
     * Returns the value of the '<em><b>Crypto</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crypto</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Crypto</em>' containment reference.
     * @see #setCrypto(CryptoDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Crypto()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='crypto' namespace='##targetNamespace'"
     * @generated
     */
	CryptoDataFormat getCrypto();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getCrypto <em>Crypto</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crypto</em>' containment reference.
     * @see #getCrypto()
     * @generated
     */
	void setCrypto(CryptoDataFormat value);

	/**
     * Returns the value of the '<em><b>Csv</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csv</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Csv</em>' containment reference.
     * @see #setCsv(CsvDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Csv()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='csv' namespace='##targetNamespace'"
     * @generated
     */
	CsvDataFormat getCsv();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getCsv <em>Csv</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Csv</em>' containment reference.
     * @see #getCsv()
     * @generated
     */
	void setCsv(CsvDataFormat value);

	/**
     * Returns the value of the '<em><b>Custom</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Custom</em>' containment reference.
     * @see #setCustom(CustomDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Custom()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='custom' namespace='##targetNamespace'"
     * @generated
     */
	CustomDataFormat getCustom();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getCustom <em>Custom</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Custom</em>' containment reference.
     * @see #getCustom()
     * @generated
     */
	void setCustom(CustomDataFormat value);

	/**
     * Returns the value of the '<em><b>Flatpack</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flatpack</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Flatpack</em>' containment reference.
     * @see #setFlatpack(FlatpackDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Flatpack()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='flatpack' namespace='##targetNamespace'"
     * @generated
     */
	FlatpackDataFormat getFlatpack();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getFlatpack <em>Flatpack</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flatpack</em>' containment reference.
     * @see #getFlatpack()
     * @generated
     */
	void setFlatpack(FlatpackDataFormat value);

	/**
     * Returns the value of the '<em><b>Gzip</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gzip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Gzip</em>' containment reference.
     * @see #setGzip(GzipDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Gzip()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='gzip' namespace='##targetNamespace'"
     * @generated
     */
	GzipDataFormat getGzip();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getGzip <em>Gzip</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gzip</em>' containment reference.
     * @see #getGzip()
     * @generated
     */
	void setGzip(GzipDataFormat value);

	/**
     * Returns the value of the '<em><b>Hl7</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hl7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Hl7</em>' containment reference.
     * @see #setHl7(Hl7DataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Hl7()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='hl7' namespace='##targetNamespace'"
     * @generated
     */
	Hl7DataFormat getHl7();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getHl7 <em>Hl7</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hl7</em>' containment reference.
     * @see #getHl7()
     * @generated
     */
	void setHl7(Hl7DataFormat value);

	/**
     * Returns the value of the '<em><b>Jaxb</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jaxb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Jaxb</em>' containment reference.
     * @see #setJaxb(JaxbDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Jaxb()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='jaxb' namespace='##targetNamespace'"
     * @generated
     */
	JaxbDataFormat getJaxb();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getJaxb <em>Jaxb</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jaxb</em>' containment reference.
     * @see #getJaxb()
     * @generated
     */
	void setJaxb(JaxbDataFormat value);

	/**
     * Returns the value of the '<em><b>Jibx</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jibx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Jibx</em>' containment reference.
     * @see #setJibx(JibxDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Jibx()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='jibx' namespace='##targetNamespace'"
     * @generated
     */
	JibxDataFormat getJibx();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getJibx <em>Jibx</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jibx</em>' containment reference.
     * @see #getJibx()
     * @generated
     */
	void setJibx(JibxDataFormat value);

	/**
     * Returns the value of the '<em><b>Json</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Json</em>' containment reference.
     * @see #setJson(JsonDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Json()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='json' namespace='##targetNamespace'"
     * @generated
     */
	JsonDataFormat getJson();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getJson <em>Json</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Json</em>' containment reference.
     * @see #getJson()
     * @generated
     */
	void setJson(JsonDataFormat value);

	/**
     * Returns the value of the '<em><b>Protobuf</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protobuf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Protobuf</em>' containment reference.
     * @see #setProtobuf(ProtobufDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Protobuf()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='protobuf' namespace='##targetNamespace'"
     * @generated
     */
	ProtobufDataFormat getProtobuf();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getProtobuf <em>Protobuf</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Protobuf</em>' containment reference.
     * @see #getProtobuf()
     * @generated
     */
	void setProtobuf(ProtobufDataFormat value);

	/**
     * Returns the value of the '<em><b>Rss</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rss</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Rss</em>' containment reference.
     * @see #setRss(RssDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Rss()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='rss' namespace='##targetNamespace'"
     * @generated
     */
	RssDataFormat getRss();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getRss <em>Rss</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rss</em>' containment reference.
     * @see #getRss()
     * @generated
     */
	void setRss(RssDataFormat value);

	/**
     * Returns the value of the '<em><b>Secure XML</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure XML</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Secure XML</em>' containment reference.
     * @see #setSecureXML(XmlSecurityDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_SecureXML()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='secureXML' namespace='##targetNamespace'"
     * @generated
     */
	XmlSecurityDataFormat getSecureXML();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getSecureXML <em>Secure XML</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Secure XML</em>' containment reference.
     * @see #getSecureXML()
     * @generated
     */
	void setSecureXML(XmlSecurityDataFormat value);

	/**
     * Returns the value of the '<em><b>Serialization</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serialization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Serialization</em>' containment reference.
     * @see #setSerialization(SerializationDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Serialization()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='serialization' namespace='##targetNamespace'"
     * @generated
     */
	SerializationDataFormat getSerialization();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getSerialization <em>Serialization</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Serialization</em>' containment reference.
     * @see #getSerialization()
     * @generated
     */
	void setSerialization(SerializationDataFormat value);

	/**
     * Returns the value of the '<em><b>Soapjaxb</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soapjaxb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Soapjaxb</em>' containment reference.
     * @see #setSoapjaxb(SoapJaxbDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Soapjaxb()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='soapjaxb' namespace='##targetNamespace'"
     * @generated
     */
	SoapJaxbDataFormat getSoapjaxb();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getSoapjaxb <em>Soapjaxb</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Soapjaxb</em>' containment reference.
     * @see #getSoapjaxb()
     * @generated
     */
	void setSoapjaxb(SoapJaxbDataFormat value);

	/**
     * Returns the value of the '<em><b>String</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>String</em>' containment reference.
     * @see #setString(StringDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_String()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace'"
     * @generated
     */
	StringDataFormat getString();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getString <em>String</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>String</em>' containment reference.
     * @see #getString()
     * @generated
     */
	void setString(StringDataFormat value);

	/**
     * Returns the value of the '<em><b>Syslog</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syslog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Syslog</em>' containment reference.
     * @see #setSyslog(SyslogDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Syslog()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='syslog' namespace='##targetNamespace'"
     * @generated
     */
	SyslogDataFormat getSyslog();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getSyslog <em>Syslog</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Syslog</em>' containment reference.
     * @see #getSyslog()
     * @generated
     */
	void setSyslog(SyslogDataFormat value);

	/**
     * Returns the value of the '<em><b>Tidy Markup</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tidy Markup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Tidy Markup</em>' containment reference.
     * @see #setTidyMarkup(TidyMarkupDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_TidyMarkup()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='tidyMarkup' namespace='##targetNamespace'"
     * @generated
     */
	TidyMarkupDataFormat getTidyMarkup();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getTidyMarkup <em>Tidy Markup</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tidy Markup</em>' containment reference.
     * @see #getTidyMarkup()
     * @generated
     */
	void setTidyMarkup(TidyMarkupDataFormat value);

	/**
     * Returns the value of the '<em><b>Xml Beans</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Beans</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Xml Beans</em>' containment reference.
     * @see #setXmlBeans(XmlBeansDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_XmlBeans()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='xmlBeans' namespace='##targetNamespace'"
     * @generated
     */
	XmlBeansDataFormat getXmlBeans();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getXmlBeans <em>Xml Beans</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xml Beans</em>' containment reference.
     * @see #getXmlBeans()
     * @generated
     */
	void setXmlBeans(XmlBeansDataFormat value);

	/**
     * Returns the value of the '<em><b>Xstream</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xstream</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Xstream</em>' containment reference.
     * @see #setXstream(XStreamDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Xstream()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='xstream' namespace='##targetNamespace'"
     * @generated
     */
	XStreamDataFormat getXstream();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getXstream <em>Xstream</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xstream</em>' containment reference.
     * @see #getXstream()
     * @generated
     */
	void setXstream(XStreamDataFormat value);

	/**
     * Returns the value of the '<em><b>Pgp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pgp</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pgp</em>' containment reference.
     * @see #setPgp(PgpDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Pgp()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='pgp' namespace='##targetNamespace'"
     * @generated
     */
    PgpDataFormat getPgp();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getPgp <em>Pgp</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pgp</em>' containment reference.
     * @see #getPgp()
     * @generated
     */
    void setPgp(PgpDataFormat value);

    /**
     * Returns the value of the '<em><b>Zip</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Zip</em>' containment reference.
     * @see #setZip(ZipDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Zip()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='zip' namespace='##targetNamespace'"
     * @generated
     */
	ZipDataFormat getZip();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getZip <em>Zip</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Zip</em>' containment reference.
     * @see #getZip()
     * @generated
     */
	void setZip(ZipDataFormat value);

	/**
     * Returns the value of the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ref</em>' attribute.
     * @see #setRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_Ref()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='ref'"
     * @generated
     */
	String getRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition#getRef <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref</em>' attribute.
     * @see #getRef()
     * @generated
     */
	void setRef(String value);

	/**
     * Returns the value of the '<em><b>Any Attribute2</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Any Attribute2</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMarshalDefinition_AnyAttribute2()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':29' processing='skip'"
     * @generated
     */
	FeatureMap getAnyAttribute2();

} // MarshalDefinition
