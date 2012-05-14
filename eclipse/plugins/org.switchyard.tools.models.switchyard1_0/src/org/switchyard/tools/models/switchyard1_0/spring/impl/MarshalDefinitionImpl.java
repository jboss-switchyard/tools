/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.BindyDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.CustomDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.FlatpackDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.GzipDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.Hl7DataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.JibxDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.JsonDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition;
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
 * An implementation of the model object '<em><b>Marshal Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getBindy <em>Bindy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getCastor <em>Castor</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getCrypto <em>Crypto</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getCsv <em>Csv</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getCustom <em>Custom</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getFlatpack <em>Flatpack</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getGzip <em>Gzip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getHl7 <em>Hl7</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getJaxb <em>Jaxb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getJibx <em>Jibx</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getJson <em>Json</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getProtobuf <em>Protobuf</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getRss <em>Rss</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getSecureXML <em>Secure XML</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getSerialization <em>Serialization</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getSoapjaxb <em>Soapjaxb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getString <em>String</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getSyslog <em>Syslog</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getTidyMarkup <em>Tidy Markup</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getXmlBeans <em>Xml Beans</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getXstream <em>Xstream</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getZip <em>Zip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MarshalDefinitionImpl#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarshalDefinitionImpl extends NoOutputDefinitionImpl implements MarshalDefinition {
	/**
     * The cached value of the '{@link #getBindy() <em>Bindy</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBindy()
     * @generated
     * @ordered
     */
	protected BindyDataFormat bindy;

	/**
     * The cached value of the '{@link #getCastor() <em>Castor</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCastor()
     * @generated
     * @ordered
     */
	protected CastorDataFormat castor;

	/**
     * The cached value of the '{@link #getCrypto() <em>Crypto</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCrypto()
     * @generated
     * @ordered
     */
	protected CryptoDataFormat crypto;

	/**
     * The cached value of the '{@link #getCsv() <em>Csv</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCsv()
     * @generated
     * @ordered
     */
	protected CsvDataFormat csv;

	/**
     * The cached value of the '{@link #getCustom() <em>Custom</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCustom()
     * @generated
     * @ordered
     */
	protected CustomDataFormat custom;

	/**
     * The cached value of the '{@link #getFlatpack() <em>Flatpack</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFlatpack()
     * @generated
     * @ordered
     */
	protected FlatpackDataFormat flatpack;

	/**
     * The cached value of the '{@link #getGzip() <em>Gzip</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGzip()
     * @generated
     * @ordered
     */
	protected GzipDataFormat gzip;

	/**
     * The cached value of the '{@link #getHl7() <em>Hl7</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHl7()
     * @generated
     * @ordered
     */
	protected Hl7DataFormat hl7;

	/**
     * The cached value of the '{@link #getJaxb() <em>Jaxb</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJaxb()
     * @generated
     * @ordered
     */
	protected JaxbDataFormat jaxb;

	/**
     * The cached value of the '{@link #getJibx() <em>Jibx</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJibx()
     * @generated
     * @ordered
     */
	protected JibxDataFormat jibx;

	/**
     * The cached value of the '{@link #getJson() <em>Json</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJson()
     * @generated
     * @ordered
     */
	protected JsonDataFormat json;

	/**
     * The cached value of the '{@link #getProtobuf() <em>Protobuf</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProtobuf()
     * @generated
     * @ordered
     */
	protected ProtobufDataFormat protobuf;

	/**
     * The cached value of the '{@link #getRss() <em>Rss</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRss()
     * @generated
     * @ordered
     */
	protected RssDataFormat rss;

	/**
     * The cached value of the '{@link #getSecureXML() <em>Secure XML</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSecureXML()
     * @generated
     * @ordered
     */
	protected XmlSecurityDataFormat secureXML;

	/**
     * The cached value of the '{@link #getSerialization() <em>Serialization</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSerialization()
     * @generated
     * @ordered
     */
	protected SerializationDataFormat serialization;

	/**
     * The cached value of the '{@link #getSoapjaxb() <em>Soapjaxb</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSoapjaxb()
     * @generated
     * @ordered
     */
	protected SoapJaxbDataFormat soapjaxb;

	/**
     * The cached value of the '{@link #getString() <em>String</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getString()
     * @generated
     * @ordered
     */
	protected StringDataFormat string;

	/**
     * The cached value of the '{@link #getSyslog() <em>Syslog</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSyslog()
     * @generated
     * @ordered
     */
	protected SyslogDataFormat syslog;

	/**
     * The cached value of the '{@link #getTidyMarkup() <em>Tidy Markup</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTidyMarkup()
     * @generated
     * @ordered
     */
	protected TidyMarkupDataFormat tidyMarkup;

	/**
     * The cached value of the '{@link #getXmlBeans() <em>Xml Beans</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXmlBeans()
     * @generated
     * @ordered
     */
	protected XmlBeansDataFormat xmlBeans;

	/**
     * The cached value of the '{@link #getXstream() <em>Xstream</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXstream()
     * @generated
     * @ordered
     */
	protected XStreamDataFormat xstream;

	/**
     * The cached value of the '{@link #getZip() <em>Zip</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getZip()
     * @generated
     * @ordered
     */
	protected ZipDataFormat zip;

	/**
     * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
	protected static final String REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
	protected String ref = REF_EDEFAULT;

	/**
     * The cached value of the '{@link #getAnyAttribute2() <em>Any Attribute2</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute2()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute2;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MarshalDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getMarshalDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BindyDataFormat getBindy() {
        return bindy;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBindy(BindyDataFormat newBindy, NotificationChain msgs) {
        BindyDataFormat oldBindy = bindy;
        bindy = newBindy;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__BINDY, oldBindy, newBindy);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBindy(BindyDataFormat newBindy) {
        if (newBindy != bindy) {
            NotificationChain msgs = null;
            if (bindy != null)
                msgs = ((InternalEObject)bindy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__BINDY, null, msgs);
            if (newBindy != null)
                msgs = ((InternalEObject)newBindy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__BINDY, null, msgs);
            msgs = basicSetBindy(newBindy, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__BINDY, newBindy, newBindy));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CastorDataFormat getCastor() {
        return castor;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetCastor(CastorDataFormat newCastor, NotificationChain msgs) {
        CastorDataFormat oldCastor = castor;
        castor = newCastor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__CASTOR, oldCastor, newCastor);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCastor(CastorDataFormat newCastor) {
        if (newCastor != castor) {
            NotificationChain msgs = null;
            if (castor != null)
                msgs = ((InternalEObject)castor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__CASTOR, null, msgs);
            if (newCastor != null)
                msgs = ((InternalEObject)newCastor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__CASTOR, null, msgs);
            msgs = basicSetCastor(newCastor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__CASTOR, newCastor, newCastor));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CryptoDataFormat getCrypto() {
        return crypto;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetCrypto(CryptoDataFormat newCrypto, NotificationChain msgs) {
        CryptoDataFormat oldCrypto = crypto;
        crypto = newCrypto;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__CRYPTO, oldCrypto, newCrypto);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCrypto(CryptoDataFormat newCrypto) {
        if (newCrypto != crypto) {
            NotificationChain msgs = null;
            if (crypto != null)
                msgs = ((InternalEObject)crypto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__CRYPTO, null, msgs);
            if (newCrypto != null)
                msgs = ((InternalEObject)newCrypto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__CRYPTO, null, msgs);
            msgs = basicSetCrypto(newCrypto, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__CRYPTO, newCrypto, newCrypto));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CsvDataFormat getCsv() {
        return csv;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetCsv(CsvDataFormat newCsv, NotificationChain msgs) {
        CsvDataFormat oldCsv = csv;
        csv = newCsv;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__CSV, oldCsv, newCsv);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCsv(CsvDataFormat newCsv) {
        if (newCsv != csv) {
            NotificationChain msgs = null;
            if (csv != null)
                msgs = ((InternalEObject)csv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__CSV, null, msgs);
            if (newCsv != null)
                msgs = ((InternalEObject)newCsv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__CSV, null, msgs);
            msgs = basicSetCsv(newCsv, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__CSV, newCsv, newCsv));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CustomDataFormat getCustom() {
        return custom;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetCustom(CustomDataFormat newCustom, NotificationChain msgs) {
        CustomDataFormat oldCustom = custom;
        custom = newCustom;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__CUSTOM, oldCustom, newCustom);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCustom(CustomDataFormat newCustom) {
        if (newCustom != custom) {
            NotificationChain msgs = null;
            if (custom != null)
                msgs = ((InternalEObject)custom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__CUSTOM, null, msgs);
            if (newCustom != null)
                msgs = ((InternalEObject)newCustom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__CUSTOM, null, msgs);
            msgs = basicSetCustom(newCustom, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__CUSTOM, newCustom, newCustom));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FlatpackDataFormat getFlatpack() {
        return flatpack;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetFlatpack(FlatpackDataFormat newFlatpack, NotificationChain msgs) {
        FlatpackDataFormat oldFlatpack = flatpack;
        flatpack = newFlatpack;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__FLATPACK, oldFlatpack, newFlatpack);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFlatpack(FlatpackDataFormat newFlatpack) {
        if (newFlatpack != flatpack) {
            NotificationChain msgs = null;
            if (flatpack != null)
                msgs = ((InternalEObject)flatpack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__FLATPACK, null, msgs);
            if (newFlatpack != null)
                msgs = ((InternalEObject)newFlatpack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__FLATPACK, null, msgs);
            msgs = basicSetFlatpack(newFlatpack, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__FLATPACK, newFlatpack, newFlatpack));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GzipDataFormat getGzip() {
        return gzip;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetGzip(GzipDataFormat newGzip, NotificationChain msgs) {
        GzipDataFormat oldGzip = gzip;
        gzip = newGzip;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__GZIP, oldGzip, newGzip);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setGzip(GzipDataFormat newGzip) {
        if (newGzip != gzip) {
            NotificationChain msgs = null;
            if (gzip != null)
                msgs = ((InternalEObject)gzip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__GZIP, null, msgs);
            if (newGzip != null)
                msgs = ((InternalEObject)newGzip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__GZIP, null, msgs);
            msgs = basicSetGzip(newGzip, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__GZIP, newGzip, newGzip));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Hl7DataFormat getHl7() {
        return hl7;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetHl7(Hl7DataFormat newHl7, NotificationChain msgs) {
        Hl7DataFormat oldHl7 = hl7;
        hl7 = newHl7;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__HL7, oldHl7, newHl7);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHl7(Hl7DataFormat newHl7) {
        if (newHl7 != hl7) {
            NotificationChain msgs = null;
            if (hl7 != null)
                msgs = ((InternalEObject)hl7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__HL7, null, msgs);
            if (newHl7 != null)
                msgs = ((InternalEObject)newHl7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__HL7, null, msgs);
            msgs = basicSetHl7(newHl7, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__HL7, newHl7, newHl7));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JaxbDataFormat getJaxb() {
        return jaxb;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetJaxb(JaxbDataFormat newJaxb, NotificationChain msgs) {
        JaxbDataFormat oldJaxb = jaxb;
        jaxb = newJaxb;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__JAXB, oldJaxb, newJaxb);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setJaxb(JaxbDataFormat newJaxb) {
        if (newJaxb != jaxb) {
            NotificationChain msgs = null;
            if (jaxb != null)
                msgs = ((InternalEObject)jaxb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__JAXB, null, msgs);
            if (newJaxb != null)
                msgs = ((InternalEObject)newJaxb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__JAXB, null, msgs);
            msgs = basicSetJaxb(newJaxb, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__JAXB, newJaxb, newJaxb));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JibxDataFormat getJibx() {
        return jibx;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetJibx(JibxDataFormat newJibx, NotificationChain msgs) {
        JibxDataFormat oldJibx = jibx;
        jibx = newJibx;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__JIBX, oldJibx, newJibx);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setJibx(JibxDataFormat newJibx) {
        if (newJibx != jibx) {
            NotificationChain msgs = null;
            if (jibx != null)
                msgs = ((InternalEObject)jibx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__JIBX, null, msgs);
            if (newJibx != null)
                msgs = ((InternalEObject)newJibx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__JIBX, null, msgs);
            msgs = basicSetJibx(newJibx, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__JIBX, newJibx, newJibx));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JsonDataFormat getJson() {
        return json;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetJson(JsonDataFormat newJson, NotificationChain msgs) {
        JsonDataFormat oldJson = json;
        json = newJson;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__JSON, oldJson, newJson);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setJson(JsonDataFormat newJson) {
        if (newJson != json) {
            NotificationChain msgs = null;
            if (json != null)
                msgs = ((InternalEObject)json).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__JSON, null, msgs);
            if (newJson != null)
                msgs = ((InternalEObject)newJson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__JSON, null, msgs);
            msgs = basicSetJson(newJson, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__JSON, newJson, newJson));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ProtobufDataFormat getProtobuf() {
        return protobuf;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetProtobuf(ProtobufDataFormat newProtobuf, NotificationChain msgs) {
        ProtobufDataFormat oldProtobuf = protobuf;
        protobuf = newProtobuf;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__PROTOBUF, oldProtobuf, newProtobuf);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setProtobuf(ProtobufDataFormat newProtobuf) {
        if (newProtobuf != protobuf) {
            NotificationChain msgs = null;
            if (protobuf != null)
                msgs = ((InternalEObject)protobuf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__PROTOBUF, null, msgs);
            if (newProtobuf != null)
                msgs = ((InternalEObject)newProtobuf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__PROTOBUF, null, msgs);
            msgs = basicSetProtobuf(newProtobuf, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__PROTOBUF, newProtobuf, newProtobuf));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RssDataFormat getRss() {
        return rss;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetRss(RssDataFormat newRss, NotificationChain msgs) {
        RssDataFormat oldRss = rss;
        rss = newRss;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__RSS, oldRss, newRss);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRss(RssDataFormat newRss) {
        if (newRss != rss) {
            NotificationChain msgs = null;
            if (rss != null)
                msgs = ((InternalEObject)rss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__RSS, null, msgs);
            if (newRss != null)
                msgs = ((InternalEObject)newRss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__RSS, null, msgs);
            msgs = basicSetRss(newRss, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__RSS, newRss, newRss));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XmlSecurityDataFormat getSecureXML() {
        return secureXML;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSecureXML(XmlSecurityDataFormat newSecureXML, NotificationChain msgs) {
        XmlSecurityDataFormat oldSecureXML = secureXML;
        secureXML = newSecureXML;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__SECURE_XML, oldSecureXML, newSecureXML);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSecureXML(XmlSecurityDataFormat newSecureXML) {
        if (newSecureXML != secureXML) {
            NotificationChain msgs = null;
            if (secureXML != null)
                msgs = ((InternalEObject)secureXML).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__SECURE_XML, null, msgs);
            if (newSecureXML != null)
                msgs = ((InternalEObject)newSecureXML).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__SECURE_XML, null, msgs);
            msgs = basicSetSecureXML(newSecureXML, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__SECURE_XML, newSecureXML, newSecureXML));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SerializationDataFormat getSerialization() {
        return serialization;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSerialization(SerializationDataFormat newSerialization, NotificationChain msgs) {
        SerializationDataFormat oldSerialization = serialization;
        serialization = newSerialization;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__SERIALIZATION, oldSerialization, newSerialization);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSerialization(SerializationDataFormat newSerialization) {
        if (newSerialization != serialization) {
            NotificationChain msgs = null;
            if (serialization != null)
                msgs = ((InternalEObject)serialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__SERIALIZATION, null, msgs);
            if (newSerialization != null)
                msgs = ((InternalEObject)newSerialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__SERIALIZATION, null, msgs);
            msgs = basicSetSerialization(newSerialization, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__SERIALIZATION, newSerialization, newSerialization));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SoapJaxbDataFormat getSoapjaxb() {
        return soapjaxb;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSoapjaxb(SoapJaxbDataFormat newSoapjaxb, NotificationChain msgs) {
        SoapJaxbDataFormat oldSoapjaxb = soapjaxb;
        soapjaxb = newSoapjaxb;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__SOAPJAXB, oldSoapjaxb, newSoapjaxb);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSoapjaxb(SoapJaxbDataFormat newSoapjaxb) {
        if (newSoapjaxb != soapjaxb) {
            NotificationChain msgs = null;
            if (soapjaxb != null)
                msgs = ((InternalEObject)soapjaxb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__SOAPJAXB, null, msgs);
            if (newSoapjaxb != null)
                msgs = ((InternalEObject)newSoapjaxb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__SOAPJAXB, null, msgs);
            msgs = basicSetSoapjaxb(newSoapjaxb, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__SOAPJAXB, newSoapjaxb, newSoapjaxb));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StringDataFormat getString() {
        return string;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetString(StringDataFormat newString, NotificationChain msgs) {
        StringDataFormat oldString = string;
        string = newString;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__STRING, oldString, newString);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setString(StringDataFormat newString) {
        if (newString != string) {
            NotificationChain msgs = null;
            if (string != null)
                msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__STRING, null, msgs);
            if (newString != null)
                msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__STRING, null, msgs);
            msgs = basicSetString(newString, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__STRING, newString, newString));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SyslogDataFormat getSyslog() {
        return syslog;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSyslog(SyslogDataFormat newSyslog, NotificationChain msgs) {
        SyslogDataFormat oldSyslog = syslog;
        syslog = newSyslog;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__SYSLOG, oldSyslog, newSyslog);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSyslog(SyslogDataFormat newSyslog) {
        if (newSyslog != syslog) {
            NotificationChain msgs = null;
            if (syslog != null)
                msgs = ((InternalEObject)syslog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__SYSLOG, null, msgs);
            if (newSyslog != null)
                msgs = ((InternalEObject)newSyslog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__SYSLOG, null, msgs);
            msgs = basicSetSyslog(newSyslog, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__SYSLOG, newSyslog, newSyslog));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TidyMarkupDataFormat getTidyMarkup() {
        return tidyMarkup;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTidyMarkup(TidyMarkupDataFormat newTidyMarkup, NotificationChain msgs) {
        TidyMarkupDataFormat oldTidyMarkup = tidyMarkup;
        tidyMarkup = newTidyMarkup;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__TIDY_MARKUP, oldTidyMarkup, newTidyMarkup);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTidyMarkup(TidyMarkupDataFormat newTidyMarkup) {
        if (newTidyMarkup != tidyMarkup) {
            NotificationChain msgs = null;
            if (tidyMarkup != null)
                msgs = ((InternalEObject)tidyMarkup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__TIDY_MARKUP, null, msgs);
            if (newTidyMarkup != null)
                msgs = ((InternalEObject)newTidyMarkup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__TIDY_MARKUP, null, msgs);
            msgs = basicSetTidyMarkup(newTidyMarkup, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__TIDY_MARKUP, newTidyMarkup, newTidyMarkup));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XmlBeansDataFormat getXmlBeans() {
        return xmlBeans;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetXmlBeans(XmlBeansDataFormat newXmlBeans, NotificationChain msgs) {
        XmlBeansDataFormat oldXmlBeans = xmlBeans;
        xmlBeans = newXmlBeans;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__XML_BEANS, oldXmlBeans, newXmlBeans);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXmlBeans(XmlBeansDataFormat newXmlBeans) {
        if (newXmlBeans != xmlBeans) {
            NotificationChain msgs = null;
            if (xmlBeans != null)
                msgs = ((InternalEObject)xmlBeans).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__XML_BEANS, null, msgs);
            if (newXmlBeans != null)
                msgs = ((InternalEObject)newXmlBeans).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__XML_BEANS, null, msgs);
            msgs = basicSetXmlBeans(newXmlBeans, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__XML_BEANS, newXmlBeans, newXmlBeans));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XStreamDataFormat getXstream() {
        return xstream;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetXstream(XStreamDataFormat newXstream, NotificationChain msgs) {
        XStreamDataFormat oldXstream = xstream;
        xstream = newXstream;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__XSTREAM, oldXstream, newXstream);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXstream(XStreamDataFormat newXstream) {
        if (newXstream != xstream) {
            NotificationChain msgs = null;
            if (xstream != null)
                msgs = ((InternalEObject)xstream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__XSTREAM, null, msgs);
            if (newXstream != null)
                msgs = ((InternalEObject)newXstream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__XSTREAM, null, msgs);
            msgs = basicSetXstream(newXstream, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__XSTREAM, newXstream, newXstream));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ZipDataFormat getZip() {
        return zip;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetZip(ZipDataFormat newZip, NotificationChain msgs) {
        ZipDataFormat oldZip = zip;
        zip = newZip;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__ZIP, oldZip, newZip);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setZip(ZipDataFormat newZip) {
        if (newZip != zip) {
            NotificationChain msgs = null;
            if (zip != null)
                msgs = ((InternalEObject)zip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__ZIP, null, msgs);
            if (newZip != null)
                msgs = ((InternalEObject)newZip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.MARSHAL_DEFINITION__ZIP, null, msgs);
            msgs = basicSetZip(newZip, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__ZIP, newZip, newZip));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getRef() {
        return ref;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRef(String newRef) {
        String oldRef = ref;
        ref = newRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.MARSHAL_DEFINITION__REF, oldRef, ref));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute2() {
        if (anyAttribute2 == null) {
            anyAttribute2 = new BasicFeatureMap(this, SpringPackage.MARSHAL_DEFINITION__ANY_ATTRIBUTE2);
        }
        return anyAttribute2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SpringPackage.MARSHAL_DEFINITION__BINDY:
                return basicSetBindy(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__CASTOR:
                return basicSetCastor(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__CRYPTO:
                return basicSetCrypto(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__CSV:
                return basicSetCsv(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__CUSTOM:
                return basicSetCustom(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__FLATPACK:
                return basicSetFlatpack(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__GZIP:
                return basicSetGzip(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__HL7:
                return basicSetHl7(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__JAXB:
                return basicSetJaxb(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__JIBX:
                return basicSetJibx(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__JSON:
                return basicSetJson(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__PROTOBUF:
                return basicSetProtobuf(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__RSS:
                return basicSetRss(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__SECURE_XML:
                return basicSetSecureXML(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__SERIALIZATION:
                return basicSetSerialization(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__SOAPJAXB:
                return basicSetSoapjaxb(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__STRING:
                return basicSetString(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__SYSLOG:
                return basicSetSyslog(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__TIDY_MARKUP:
                return basicSetTidyMarkup(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__XML_BEANS:
                return basicSetXmlBeans(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__XSTREAM:
                return basicSetXstream(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__ZIP:
                return basicSetZip(null, msgs);
            case SpringPackage.MARSHAL_DEFINITION__ANY_ATTRIBUTE2:
                return ((InternalEList<?>)getAnyAttribute2()).basicRemove(otherEnd, msgs);
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
            case SpringPackage.MARSHAL_DEFINITION__BINDY:
                return getBindy();
            case SpringPackage.MARSHAL_DEFINITION__CASTOR:
                return getCastor();
            case SpringPackage.MARSHAL_DEFINITION__CRYPTO:
                return getCrypto();
            case SpringPackage.MARSHAL_DEFINITION__CSV:
                return getCsv();
            case SpringPackage.MARSHAL_DEFINITION__CUSTOM:
                return getCustom();
            case SpringPackage.MARSHAL_DEFINITION__FLATPACK:
                return getFlatpack();
            case SpringPackage.MARSHAL_DEFINITION__GZIP:
                return getGzip();
            case SpringPackage.MARSHAL_DEFINITION__HL7:
                return getHl7();
            case SpringPackage.MARSHAL_DEFINITION__JAXB:
                return getJaxb();
            case SpringPackage.MARSHAL_DEFINITION__JIBX:
                return getJibx();
            case SpringPackage.MARSHAL_DEFINITION__JSON:
                return getJson();
            case SpringPackage.MARSHAL_DEFINITION__PROTOBUF:
                return getProtobuf();
            case SpringPackage.MARSHAL_DEFINITION__RSS:
                return getRss();
            case SpringPackage.MARSHAL_DEFINITION__SECURE_XML:
                return getSecureXML();
            case SpringPackage.MARSHAL_DEFINITION__SERIALIZATION:
                return getSerialization();
            case SpringPackage.MARSHAL_DEFINITION__SOAPJAXB:
                return getSoapjaxb();
            case SpringPackage.MARSHAL_DEFINITION__STRING:
                return getString();
            case SpringPackage.MARSHAL_DEFINITION__SYSLOG:
                return getSyslog();
            case SpringPackage.MARSHAL_DEFINITION__TIDY_MARKUP:
                return getTidyMarkup();
            case SpringPackage.MARSHAL_DEFINITION__XML_BEANS:
                return getXmlBeans();
            case SpringPackage.MARSHAL_DEFINITION__XSTREAM:
                return getXstream();
            case SpringPackage.MARSHAL_DEFINITION__ZIP:
                return getZip();
            case SpringPackage.MARSHAL_DEFINITION__REF:
                return getRef();
            case SpringPackage.MARSHAL_DEFINITION__ANY_ATTRIBUTE2:
                if (coreType) return getAnyAttribute2();
                return ((FeatureMap.Internal)getAnyAttribute2()).getWrapper();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SpringPackage.MARSHAL_DEFINITION__BINDY:
                setBindy((BindyDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__CASTOR:
                setCastor((CastorDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__CRYPTO:
                setCrypto((CryptoDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__CSV:
                setCsv((CsvDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__CUSTOM:
                setCustom((CustomDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__FLATPACK:
                setFlatpack((FlatpackDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__GZIP:
                setGzip((GzipDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__HL7:
                setHl7((Hl7DataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__JAXB:
                setJaxb((JaxbDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__JIBX:
                setJibx((JibxDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__JSON:
                setJson((JsonDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__PROTOBUF:
                setProtobuf((ProtobufDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__RSS:
                setRss((RssDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__SECURE_XML:
                setSecureXML((XmlSecurityDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__SERIALIZATION:
                setSerialization((SerializationDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__SOAPJAXB:
                setSoapjaxb((SoapJaxbDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__STRING:
                setString((StringDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__SYSLOG:
                setSyslog((SyslogDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__TIDY_MARKUP:
                setTidyMarkup((TidyMarkupDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__XML_BEANS:
                setXmlBeans((XmlBeansDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__XSTREAM:
                setXstream((XStreamDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__ZIP:
                setZip((ZipDataFormat)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__REF:
                setRef((String)newValue);
                return;
            case SpringPackage.MARSHAL_DEFINITION__ANY_ATTRIBUTE2:
                ((FeatureMap.Internal)getAnyAttribute2()).set(newValue);
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
            case SpringPackage.MARSHAL_DEFINITION__BINDY:
                setBindy((BindyDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__CASTOR:
                setCastor((CastorDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__CRYPTO:
                setCrypto((CryptoDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__CSV:
                setCsv((CsvDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__CUSTOM:
                setCustom((CustomDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__FLATPACK:
                setFlatpack((FlatpackDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__GZIP:
                setGzip((GzipDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__HL7:
                setHl7((Hl7DataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__JAXB:
                setJaxb((JaxbDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__JIBX:
                setJibx((JibxDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__JSON:
                setJson((JsonDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__PROTOBUF:
                setProtobuf((ProtobufDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__RSS:
                setRss((RssDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__SECURE_XML:
                setSecureXML((XmlSecurityDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__SERIALIZATION:
                setSerialization((SerializationDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__SOAPJAXB:
                setSoapjaxb((SoapJaxbDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__STRING:
                setString((StringDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__SYSLOG:
                setSyslog((SyslogDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__TIDY_MARKUP:
                setTidyMarkup((TidyMarkupDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__XML_BEANS:
                setXmlBeans((XmlBeansDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__XSTREAM:
                setXstream((XStreamDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__ZIP:
                setZip((ZipDataFormat)null);
                return;
            case SpringPackage.MARSHAL_DEFINITION__REF:
                setRef(REF_EDEFAULT);
                return;
            case SpringPackage.MARSHAL_DEFINITION__ANY_ATTRIBUTE2:
                getAnyAttribute2().clear();
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
            case SpringPackage.MARSHAL_DEFINITION__BINDY:
                return bindy != null;
            case SpringPackage.MARSHAL_DEFINITION__CASTOR:
                return castor != null;
            case SpringPackage.MARSHAL_DEFINITION__CRYPTO:
                return crypto != null;
            case SpringPackage.MARSHAL_DEFINITION__CSV:
                return csv != null;
            case SpringPackage.MARSHAL_DEFINITION__CUSTOM:
                return custom != null;
            case SpringPackage.MARSHAL_DEFINITION__FLATPACK:
                return flatpack != null;
            case SpringPackage.MARSHAL_DEFINITION__GZIP:
                return gzip != null;
            case SpringPackage.MARSHAL_DEFINITION__HL7:
                return hl7 != null;
            case SpringPackage.MARSHAL_DEFINITION__JAXB:
                return jaxb != null;
            case SpringPackage.MARSHAL_DEFINITION__JIBX:
                return jibx != null;
            case SpringPackage.MARSHAL_DEFINITION__JSON:
                return json != null;
            case SpringPackage.MARSHAL_DEFINITION__PROTOBUF:
                return protobuf != null;
            case SpringPackage.MARSHAL_DEFINITION__RSS:
                return rss != null;
            case SpringPackage.MARSHAL_DEFINITION__SECURE_XML:
                return secureXML != null;
            case SpringPackage.MARSHAL_DEFINITION__SERIALIZATION:
                return serialization != null;
            case SpringPackage.MARSHAL_DEFINITION__SOAPJAXB:
                return soapjaxb != null;
            case SpringPackage.MARSHAL_DEFINITION__STRING:
                return string != null;
            case SpringPackage.MARSHAL_DEFINITION__SYSLOG:
                return syslog != null;
            case SpringPackage.MARSHAL_DEFINITION__TIDY_MARKUP:
                return tidyMarkup != null;
            case SpringPackage.MARSHAL_DEFINITION__XML_BEANS:
                return xmlBeans != null;
            case SpringPackage.MARSHAL_DEFINITION__XSTREAM:
                return xstream != null;
            case SpringPackage.MARSHAL_DEFINITION__ZIP:
                return zip != null;
            case SpringPackage.MARSHAL_DEFINITION__REF:
                return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
            case SpringPackage.MARSHAL_DEFINITION__ANY_ATTRIBUTE2:
                return anyAttribute2 != null && !anyAttribute2.isEmpty();
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
        result.append(" (ref: ");
        result.append(ref);
        result.append(", anyAttribute2: ");
        result.append(anyAttribute2);
        result.append(')');
        return result.toString();
    }

} //MarshalDefinitionImpl
