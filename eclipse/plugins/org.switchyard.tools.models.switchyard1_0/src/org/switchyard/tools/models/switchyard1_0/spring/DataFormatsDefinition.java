/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Formats Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getBindy <em>Bindy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getCastor <em>Castor</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getCrypto <em>Crypto</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getCsv <em>Csv</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getCustom <em>Custom</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getFlatpack <em>Flatpack</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getGzip <em>Gzip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getHl7 <em>Hl7</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getJaxb <em>Jaxb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getJibx <em>Jibx</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getJson <em>Json</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getProtobuf <em>Protobuf</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getRss <em>Rss</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getSecureXML <em>Secure XML</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getSerialization <em>Serialization</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getSoapjaxb <em>Soapjaxb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getString <em>String</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getSyslog <em>Syslog</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getTidyMarkup <em>Tidy Markup</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getXmlBeans <em>Xml Beans</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getXstream <em>Xstream</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getPgp <em>Pgp</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition#getZip <em>Zip</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition()
 * @model extendedMetaData="name='dataFormatsDefinition' kind='elementOnly'"
 * @generated
 */
public interface DataFormatsDefinition extends EObject {
	/**
     * Returns the value of the '<em><b>Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
	FeatureMap getGroup();

	/**
     * Returns the value of the '<em><b>Bindy</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.BindyDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Bindy</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Bindy()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='bindy' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<BindyDataFormat> getBindy();

	/**
     * Returns the value of the '<em><b>Castor</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Castor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Castor</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Castor()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='castor' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<CastorDataFormat> getCastor();

	/**
     * Returns the value of the '<em><b>Crypto</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crypto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Crypto</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Crypto()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='crypto' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<CryptoDataFormat> getCrypto();

	/**
     * Returns the value of the '<em><b>Csv</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csv</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Csv</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Csv()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='csv' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<CsvDataFormat> getCsv();

	/**
     * Returns the value of the '<em><b>Custom</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.CustomDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Custom</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Custom()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='custom' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<CustomDataFormat> getCustom();

	/**
     * Returns the value of the '<em><b>Flatpack</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.FlatpackDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flatpack</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Flatpack</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Flatpack()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='flatpack' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<FlatpackDataFormat> getFlatpack();

	/**
     * Returns the value of the '<em><b>Gzip</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.GzipDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gzip</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Gzip</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Gzip()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='gzip' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<GzipDataFormat> getGzip();

	/**
     * Returns the value of the '<em><b>Hl7</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.Hl7DataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hl7</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Hl7</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Hl7()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='hl7' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<Hl7DataFormat> getHl7();

	/**
     * Returns the value of the '<em><b>Jaxb</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jaxb</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Jaxb</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Jaxb()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='jaxb' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<JaxbDataFormat> getJaxb();

	/**
     * Returns the value of the '<em><b>Jibx</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.JibxDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jibx</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Jibx</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Jibx()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='jibx' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<JibxDataFormat> getJibx();

	/**
     * Returns the value of the '<em><b>Json</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.JsonDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Json</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Json()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='json' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<JsonDataFormat> getJson();

	/**
     * Returns the value of the '<em><b>Protobuf</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ProtobufDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protobuf</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Protobuf</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Protobuf()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='protobuf' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<ProtobufDataFormat> getProtobuf();

	/**
     * Returns the value of the '<em><b>Rss</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RssDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rss</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Rss</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Rss()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='rss' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<RssDataFormat> getRss();

	/**
     * Returns the value of the '<em><b>Secure XML</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure XML</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Secure XML</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_SecureXML()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='secureXML' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<XmlSecurityDataFormat> getSecureXML();

	/**
     * Returns the value of the '<em><b>Serialization</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SerializationDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serialization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Serialization</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Serialization()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='serialization' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<SerializationDataFormat> getSerialization();

	/**
     * Returns the value of the '<em><b>Soapjaxb</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SoapJaxbDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soapjaxb</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Soapjaxb</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Soapjaxb()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='soapjaxb' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<SoapJaxbDataFormat> getSoapjaxb();

	/**
     * Returns the value of the '<em><b>String</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.StringDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>String</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_String()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<StringDataFormat> getString();

	/**
     * Returns the value of the '<em><b>Syslog</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SyslogDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syslog</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Syslog</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Syslog()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='syslog' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<SyslogDataFormat> getSyslog();

	/**
     * Returns the value of the '<em><b>Tidy Markup</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.TidyMarkupDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tidy Markup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Tidy Markup</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_TidyMarkup()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='tidyMarkup' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<TidyMarkupDataFormat> getTidyMarkup();

	/**
     * Returns the value of the '<em><b>Xml Beans</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.XmlBeansDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Beans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Xml Beans</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_XmlBeans()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='xmlBeans' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<XmlBeansDataFormat> getXmlBeans();

	/**
     * Returns the value of the '<em><b>Xstream</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xstream</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Xstream</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Xstream()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='xstream' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<XStreamDataFormat> getXstream();

	/**
     * Returns the value of the '<em><b>Pgp</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pgp</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pgp</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Pgp()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='pgp' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<PgpDataFormat> getPgp();

    /**
     * Returns the value of the '<em><b>Zip</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ZipDataFormat}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Zip</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDataFormatsDefinition_Zip()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='zip' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<ZipDataFormat> getZip();

} // DataFormatsDefinition
