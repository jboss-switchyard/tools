/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.BindyDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.CustomDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.FlatpackDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.GzipDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.Hl7DataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.JibxDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.JsonDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.ProtobufDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.RssDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SerializationDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SoapJaxbDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.StringDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SyslogDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.TidyMarkupDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.XmlBeansDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.ZipDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Formats Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getBindy <em>Bindy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getCastor <em>Castor</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getCrypto <em>Crypto</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getCsv <em>Csv</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getCustom <em>Custom</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getFlatpack <em>Flatpack</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getGzip <em>Gzip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getHl7 <em>Hl7</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getJaxb <em>Jaxb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getJibx <em>Jibx</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getJson <em>Json</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getProtobuf <em>Protobuf</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getRss <em>Rss</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getSecureXML <em>Secure XML</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getSerialization <em>Serialization</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getSoapjaxb <em>Soapjaxb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getString <em>String</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getSyslog <em>Syslog</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getTidyMarkup <em>Tidy Markup</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getXmlBeans <em>Xml Beans</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getXstream <em>Xstream</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getPgp <em>Pgp</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DataFormatsDefinitionImpl#getZip <em>Zip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataFormatsDefinitionImpl extends EObjectImpl implements DataFormatsDefinition {
	/**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
	protected FeatureMap group;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DataFormatsDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getDataFormatsDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, SpringPackage.DATA_FORMATS_DEFINITION__GROUP);
        }
        return group;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<BindyDataFormat> getBindy() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Bindy());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CastorDataFormat> getCastor() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Castor());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CryptoDataFormat> getCrypto() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Crypto());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CsvDataFormat> getCsv() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Csv());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CustomDataFormat> getCustom() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Custom());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<FlatpackDataFormat> getFlatpack() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Flatpack());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<GzipDataFormat> getGzip() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Gzip());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Hl7DataFormat> getHl7() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Hl7());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<JaxbDataFormat> getJaxb() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Jaxb());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<JibxDataFormat> getJibx() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Jibx());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<JsonDataFormat> getJson() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Json());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ProtobufDataFormat> getProtobuf() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Protobuf());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RssDataFormat> getRss() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Rss());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<XmlSecurityDataFormat> getSecureXML() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_SecureXML());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SerializationDataFormat> getSerialization() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Serialization());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SoapJaxbDataFormat> getSoapjaxb() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Soapjaxb());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<StringDataFormat> getString() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_String());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SyslogDataFormat> getSyslog() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Syslog());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<TidyMarkupDataFormat> getTidyMarkup() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_TidyMarkup());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<XmlBeansDataFormat> getXmlBeans() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_XmlBeans());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<XStreamDataFormat> getXstream() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Xstream());
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PgpDataFormat> getPgp() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Pgp());
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ZipDataFormat> getZip() {
        return getGroup().list(SpringPackage.eINSTANCE.getDataFormatsDefinition_Zip());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SpringPackage.DATA_FORMATS_DEFINITION__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__BINDY:
                return ((InternalEList<?>)getBindy()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__CASTOR:
                return ((InternalEList<?>)getCastor()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__CRYPTO:
                return ((InternalEList<?>)getCrypto()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__CSV:
                return ((InternalEList<?>)getCsv()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__CUSTOM:
                return ((InternalEList<?>)getCustom()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__FLATPACK:
                return ((InternalEList<?>)getFlatpack()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__GZIP:
                return ((InternalEList<?>)getGzip()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__HL7:
                return ((InternalEList<?>)getHl7()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__JAXB:
                return ((InternalEList<?>)getJaxb()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__JIBX:
                return ((InternalEList<?>)getJibx()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__JSON:
                return ((InternalEList<?>)getJson()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__PROTOBUF:
                return ((InternalEList<?>)getProtobuf()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__RSS:
                return ((InternalEList<?>)getRss()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__SECURE_XML:
                return ((InternalEList<?>)getSecureXML()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__SERIALIZATION:
                return ((InternalEList<?>)getSerialization()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__SOAPJAXB:
                return ((InternalEList<?>)getSoapjaxb()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__STRING:
                return ((InternalEList<?>)getString()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__SYSLOG:
                return ((InternalEList<?>)getSyslog()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__TIDY_MARKUP:
                return ((InternalEList<?>)getTidyMarkup()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__XML_BEANS:
                return ((InternalEList<?>)getXmlBeans()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__XSTREAM:
                return ((InternalEList<?>)getXstream()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__PGP:
                return ((InternalEList<?>)getPgp()).basicRemove(otherEnd, msgs);
            case SpringPackage.DATA_FORMATS_DEFINITION__ZIP:
                return ((InternalEList<?>)getZip()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.DATA_FORMATS_DEFINITION__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case SpringPackage.DATA_FORMATS_DEFINITION__BINDY:
                return getBindy();
            case SpringPackage.DATA_FORMATS_DEFINITION__CASTOR:
                return getCastor();
            case SpringPackage.DATA_FORMATS_DEFINITION__CRYPTO:
                return getCrypto();
            case SpringPackage.DATA_FORMATS_DEFINITION__CSV:
                return getCsv();
            case SpringPackage.DATA_FORMATS_DEFINITION__CUSTOM:
                return getCustom();
            case SpringPackage.DATA_FORMATS_DEFINITION__FLATPACK:
                return getFlatpack();
            case SpringPackage.DATA_FORMATS_DEFINITION__GZIP:
                return getGzip();
            case SpringPackage.DATA_FORMATS_DEFINITION__HL7:
                return getHl7();
            case SpringPackage.DATA_FORMATS_DEFINITION__JAXB:
                return getJaxb();
            case SpringPackage.DATA_FORMATS_DEFINITION__JIBX:
                return getJibx();
            case SpringPackage.DATA_FORMATS_DEFINITION__JSON:
                return getJson();
            case SpringPackage.DATA_FORMATS_DEFINITION__PROTOBUF:
                return getProtobuf();
            case SpringPackage.DATA_FORMATS_DEFINITION__RSS:
                return getRss();
            case SpringPackage.DATA_FORMATS_DEFINITION__SECURE_XML:
                return getSecureXML();
            case SpringPackage.DATA_FORMATS_DEFINITION__SERIALIZATION:
                return getSerialization();
            case SpringPackage.DATA_FORMATS_DEFINITION__SOAPJAXB:
                return getSoapjaxb();
            case SpringPackage.DATA_FORMATS_DEFINITION__STRING:
                return getString();
            case SpringPackage.DATA_FORMATS_DEFINITION__SYSLOG:
                return getSyslog();
            case SpringPackage.DATA_FORMATS_DEFINITION__TIDY_MARKUP:
                return getTidyMarkup();
            case SpringPackage.DATA_FORMATS_DEFINITION__XML_BEANS:
                return getXmlBeans();
            case SpringPackage.DATA_FORMATS_DEFINITION__XSTREAM:
                return getXstream();
            case SpringPackage.DATA_FORMATS_DEFINITION__PGP:
                return getPgp();
            case SpringPackage.DATA_FORMATS_DEFINITION__ZIP:
                return getZip();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SpringPackage.DATA_FORMATS_DEFINITION__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__BINDY:
                getBindy().clear();
                getBindy().addAll((Collection<? extends BindyDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__CASTOR:
                getCastor().clear();
                getCastor().addAll((Collection<? extends CastorDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__CRYPTO:
                getCrypto().clear();
                getCrypto().addAll((Collection<? extends CryptoDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__CSV:
                getCsv().clear();
                getCsv().addAll((Collection<? extends CsvDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__CUSTOM:
                getCustom().clear();
                getCustom().addAll((Collection<? extends CustomDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__FLATPACK:
                getFlatpack().clear();
                getFlatpack().addAll((Collection<? extends FlatpackDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__GZIP:
                getGzip().clear();
                getGzip().addAll((Collection<? extends GzipDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__HL7:
                getHl7().clear();
                getHl7().addAll((Collection<? extends Hl7DataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__JAXB:
                getJaxb().clear();
                getJaxb().addAll((Collection<? extends JaxbDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__JIBX:
                getJibx().clear();
                getJibx().addAll((Collection<? extends JibxDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__JSON:
                getJson().clear();
                getJson().addAll((Collection<? extends JsonDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__PROTOBUF:
                getProtobuf().clear();
                getProtobuf().addAll((Collection<? extends ProtobufDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__RSS:
                getRss().clear();
                getRss().addAll((Collection<? extends RssDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__SECURE_XML:
                getSecureXML().clear();
                getSecureXML().addAll((Collection<? extends XmlSecurityDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__SERIALIZATION:
                getSerialization().clear();
                getSerialization().addAll((Collection<? extends SerializationDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__SOAPJAXB:
                getSoapjaxb().clear();
                getSoapjaxb().addAll((Collection<? extends SoapJaxbDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__STRING:
                getString().clear();
                getString().addAll((Collection<? extends StringDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__SYSLOG:
                getSyslog().clear();
                getSyslog().addAll((Collection<? extends SyslogDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__TIDY_MARKUP:
                getTidyMarkup().clear();
                getTidyMarkup().addAll((Collection<? extends TidyMarkupDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__XML_BEANS:
                getXmlBeans().clear();
                getXmlBeans().addAll((Collection<? extends XmlBeansDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__XSTREAM:
                getXstream().clear();
                getXstream().addAll((Collection<? extends XStreamDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__PGP:
                getPgp().clear();
                getPgp().addAll((Collection<? extends PgpDataFormat>)newValue);
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__ZIP:
                getZip().clear();
                getZip().addAll((Collection<? extends ZipDataFormat>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case SpringPackage.DATA_FORMATS_DEFINITION__GROUP:
                getGroup().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__BINDY:
                getBindy().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__CASTOR:
                getCastor().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__CRYPTO:
                getCrypto().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__CSV:
                getCsv().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__CUSTOM:
                getCustom().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__FLATPACK:
                getFlatpack().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__GZIP:
                getGzip().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__HL7:
                getHl7().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__JAXB:
                getJaxb().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__JIBX:
                getJibx().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__JSON:
                getJson().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__PROTOBUF:
                getProtobuf().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__RSS:
                getRss().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__SECURE_XML:
                getSecureXML().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__SERIALIZATION:
                getSerialization().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__SOAPJAXB:
                getSoapjaxb().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__STRING:
                getString().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__SYSLOG:
                getSyslog().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__TIDY_MARKUP:
                getTidyMarkup().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__XML_BEANS:
                getXmlBeans().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__XSTREAM:
                getXstream().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__PGP:
                getPgp().clear();
                return;
            case SpringPackage.DATA_FORMATS_DEFINITION__ZIP:
                getZip().clear();
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SpringPackage.DATA_FORMATS_DEFINITION__GROUP:
                return group != null && !group.isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__BINDY:
                return !getBindy().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__CASTOR:
                return !getCastor().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__CRYPTO:
                return !getCrypto().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__CSV:
                return !getCsv().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__CUSTOM:
                return !getCustom().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__FLATPACK:
                return !getFlatpack().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__GZIP:
                return !getGzip().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__HL7:
                return !getHl7().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__JAXB:
                return !getJaxb().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__JIBX:
                return !getJibx().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__JSON:
                return !getJson().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__PROTOBUF:
                return !getProtobuf().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__RSS:
                return !getRss().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__SECURE_XML:
                return !getSecureXML().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__SERIALIZATION:
                return !getSerialization().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__SOAPJAXB:
                return !getSoapjaxb().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__STRING:
                return !getString().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__SYSLOG:
                return !getSyslog().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__TIDY_MARKUP:
                return !getTidyMarkup().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__XML_BEANS:
                return !getXmlBeans().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__XSTREAM:
                return !getXstream().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__PGP:
                return !getPgp().isEmpty();
            case SpringPackage.DATA_FORMATS_DEFINITION__ZIP:
                return !getZip().isEmpty();
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (group: ");
        result.append(group);
        result.append(')');
        return result.toString();
    }

} //DataFormatsDefinitionImpl
