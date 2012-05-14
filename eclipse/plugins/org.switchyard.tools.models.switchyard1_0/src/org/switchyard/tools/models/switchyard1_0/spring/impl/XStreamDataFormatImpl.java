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

import org.switchyard.tools.models.switchyard1_0.spring.AliasList;
import org.switchyard.tools.models.switchyard1_0.spring.ConverterList;
import org.switchyard.tools.models.switchyard1_0.spring.ImplicitCollectionList;
import org.switchyard.tools.models.switchyard1_0.spring.OmitFieldList;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XStream Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XStreamDataFormatImpl#getConverters <em>Converters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XStreamDataFormatImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XStreamDataFormatImpl#getOmitFields <em>Omit Fields</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XStreamDataFormatImpl#getImplicitCollections <em>Implicit Collections</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XStreamDataFormatImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XStreamDataFormatImpl#getDriverRef <em>Driver Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XStreamDataFormatImpl#getEncoding <em>Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XStreamDataFormatImpl extends DataFormatImpl implements XStreamDataFormat {
	/**
     * The cached value of the '{@link #getConverters() <em>Converters</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConverters()
     * @generated
     * @ordered
     */
	protected ConverterList converters;

	/**
     * The cached value of the '{@link #getAliases() <em>Aliases</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAliases()
     * @generated
     * @ordered
     */
	protected AliasList aliases;

	/**
     * The cached value of the '{@link #getOmitFields() <em>Omit Fields</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOmitFields()
     * @generated
     * @ordered
     */
	protected OmitFieldList omitFields;

	/**
     * The cached value of the '{@link #getImplicitCollections() <em>Implicit Collections</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getImplicitCollections()
     * @generated
     * @ordered
     */
	protected ImplicitCollectionList implicitCollections;

	/**
     * The default value of the '{@link #getDriver() <em>Driver</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDriver()
     * @generated
     * @ordered
     */
	protected static final String DRIVER_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDriver() <em>Driver</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDriver()
     * @generated
     * @ordered
     */
	protected String driver = DRIVER_EDEFAULT;

	/**
     * The default value of the '{@link #getDriverRef() <em>Driver Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDriverRef()
     * @generated
     * @ordered
     */
	protected static final String DRIVER_REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDriverRef() <em>Driver Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDriverRef()
     * @generated
     * @ordered
     */
	protected String driverRef = DRIVER_REF_EDEFAULT;

	/**
     * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEncoding()
     * @generated
     * @ordered
     */
	protected static final String ENCODING_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEncoding()
     * @generated
     * @ordered
     */
	protected String encoding = ENCODING_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected XStreamDataFormatImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getXStreamDataFormat();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConverterList getConverters() {
        return converters;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetConverters(ConverterList newConverters, NotificationChain msgs) {
        ConverterList oldConverters = converters;
        converters = newConverters;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.XSTREAM_DATA_FORMAT__CONVERTERS, oldConverters, newConverters);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConverters(ConverterList newConverters) {
        if (newConverters != converters) {
            NotificationChain msgs = null;
            if (converters != null)
                msgs = ((InternalEObject)converters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.XSTREAM_DATA_FORMAT__CONVERTERS, null, msgs);
            if (newConverters != null)
                msgs = ((InternalEObject)newConverters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.XSTREAM_DATA_FORMAT__CONVERTERS, null, msgs);
            msgs = basicSetConverters(newConverters, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XSTREAM_DATA_FORMAT__CONVERTERS, newConverters, newConverters));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AliasList getAliases() {
        return aliases;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetAliases(AliasList newAliases, NotificationChain msgs) {
        AliasList oldAliases = aliases;
        aliases = newAliases;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.XSTREAM_DATA_FORMAT__ALIASES, oldAliases, newAliases);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAliases(AliasList newAliases) {
        if (newAliases != aliases) {
            NotificationChain msgs = null;
            if (aliases != null)
                msgs = ((InternalEObject)aliases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.XSTREAM_DATA_FORMAT__ALIASES, null, msgs);
            if (newAliases != null)
                msgs = ((InternalEObject)newAliases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.XSTREAM_DATA_FORMAT__ALIASES, null, msgs);
            msgs = basicSetAliases(newAliases, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XSTREAM_DATA_FORMAT__ALIASES, newAliases, newAliases));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OmitFieldList getOmitFields() {
        return omitFields;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetOmitFields(OmitFieldList newOmitFields, NotificationChain msgs) {
        OmitFieldList oldOmitFields = omitFields;
        omitFields = newOmitFields;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.XSTREAM_DATA_FORMAT__OMIT_FIELDS, oldOmitFields, newOmitFields);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOmitFields(OmitFieldList newOmitFields) {
        if (newOmitFields != omitFields) {
            NotificationChain msgs = null;
            if (omitFields != null)
                msgs = ((InternalEObject)omitFields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.XSTREAM_DATA_FORMAT__OMIT_FIELDS, null, msgs);
            if (newOmitFields != null)
                msgs = ((InternalEObject)newOmitFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.XSTREAM_DATA_FORMAT__OMIT_FIELDS, null, msgs);
            msgs = basicSetOmitFields(newOmitFields, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XSTREAM_DATA_FORMAT__OMIT_FIELDS, newOmitFields, newOmitFields));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ImplicitCollectionList getImplicitCollections() {
        return implicitCollections;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImplicitCollections(ImplicitCollectionList newImplicitCollections, NotificationChain msgs) {
        ImplicitCollectionList oldImplicitCollections = implicitCollections;
        implicitCollections = newImplicitCollections;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.XSTREAM_DATA_FORMAT__IMPLICIT_COLLECTIONS, oldImplicitCollections, newImplicitCollections);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImplicitCollections(ImplicitCollectionList newImplicitCollections) {
        if (newImplicitCollections != implicitCollections) {
            NotificationChain msgs = null;
            if (implicitCollections != null)
                msgs = ((InternalEObject)implicitCollections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.XSTREAM_DATA_FORMAT__IMPLICIT_COLLECTIONS, null, msgs);
            if (newImplicitCollections != null)
                msgs = ((InternalEObject)newImplicitCollections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.XSTREAM_DATA_FORMAT__IMPLICIT_COLLECTIONS, null, msgs);
            msgs = basicSetImplicitCollections(newImplicitCollections, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XSTREAM_DATA_FORMAT__IMPLICIT_COLLECTIONS, newImplicitCollections, newImplicitCollections));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDriver() {
        return driver;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDriver(String newDriver) {
        String oldDriver = driver;
        driver = newDriver;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XSTREAM_DATA_FORMAT__DRIVER, oldDriver, driver));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDriverRef() {
        return driverRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDriverRef(String newDriverRef) {
        String oldDriverRef = driverRef;
        driverRef = newDriverRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XSTREAM_DATA_FORMAT__DRIVER_REF, oldDriverRef, driverRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getEncoding() {
        return encoding;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEncoding(String newEncoding) {
        String oldEncoding = encoding;
        encoding = newEncoding;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XSTREAM_DATA_FORMAT__ENCODING, oldEncoding, encoding));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SpringPackage.XSTREAM_DATA_FORMAT__CONVERTERS:
                return basicSetConverters(null, msgs);
            case SpringPackage.XSTREAM_DATA_FORMAT__ALIASES:
                return basicSetAliases(null, msgs);
            case SpringPackage.XSTREAM_DATA_FORMAT__OMIT_FIELDS:
                return basicSetOmitFields(null, msgs);
            case SpringPackage.XSTREAM_DATA_FORMAT__IMPLICIT_COLLECTIONS:
                return basicSetImplicitCollections(null, msgs);
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
            case SpringPackage.XSTREAM_DATA_FORMAT__CONVERTERS:
                return getConverters();
            case SpringPackage.XSTREAM_DATA_FORMAT__ALIASES:
                return getAliases();
            case SpringPackage.XSTREAM_DATA_FORMAT__OMIT_FIELDS:
                return getOmitFields();
            case SpringPackage.XSTREAM_DATA_FORMAT__IMPLICIT_COLLECTIONS:
                return getImplicitCollections();
            case SpringPackage.XSTREAM_DATA_FORMAT__DRIVER:
                return getDriver();
            case SpringPackage.XSTREAM_DATA_FORMAT__DRIVER_REF:
                return getDriverRef();
            case SpringPackage.XSTREAM_DATA_FORMAT__ENCODING:
                return getEncoding();
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
            case SpringPackage.XSTREAM_DATA_FORMAT__CONVERTERS:
                setConverters((ConverterList)newValue);
                return;
            case SpringPackage.XSTREAM_DATA_FORMAT__ALIASES:
                setAliases((AliasList)newValue);
                return;
            case SpringPackage.XSTREAM_DATA_FORMAT__OMIT_FIELDS:
                setOmitFields((OmitFieldList)newValue);
                return;
            case SpringPackage.XSTREAM_DATA_FORMAT__IMPLICIT_COLLECTIONS:
                setImplicitCollections((ImplicitCollectionList)newValue);
                return;
            case SpringPackage.XSTREAM_DATA_FORMAT__DRIVER:
                setDriver((String)newValue);
                return;
            case SpringPackage.XSTREAM_DATA_FORMAT__DRIVER_REF:
                setDriverRef((String)newValue);
                return;
            case SpringPackage.XSTREAM_DATA_FORMAT__ENCODING:
                setEncoding((String)newValue);
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
            case SpringPackage.XSTREAM_DATA_FORMAT__CONVERTERS:
                setConverters((ConverterList)null);
                return;
            case SpringPackage.XSTREAM_DATA_FORMAT__ALIASES:
                setAliases((AliasList)null);
                return;
            case SpringPackage.XSTREAM_DATA_FORMAT__OMIT_FIELDS:
                setOmitFields((OmitFieldList)null);
                return;
            case SpringPackage.XSTREAM_DATA_FORMAT__IMPLICIT_COLLECTIONS:
                setImplicitCollections((ImplicitCollectionList)null);
                return;
            case SpringPackage.XSTREAM_DATA_FORMAT__DRIVER:
                setDriver(DRIVER_EDEFAULT);
                return;
            case SpringPackage.XSTREAM_DATA_FORMAT__DRIVER_REF:
                setDriverRef(DRIVER_REF_EDEFAULT);
                return;
            case SpringPackage.XSTREAM_DATA_FORMAT__ENCODING:
                setEncoding(ENCODING_EDEFAULT);
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
            case SpringPackage.XSTREAM_DATA_FORMAT__CONVERTERS:
                return converters != null;
            case SpringPackage.XSTREAM_DATA_FORMAT__ALIASES:
                return aliases != null;
            case SpringPackage.XSTREAM_DATA_FORMAT__OMIT_FIELDS:
                return omitFields != null;
            case SpringPackage.XSTREAM_DATA_FORMAT__IMPLICIT_COLLECTIONS:
                return implicitCollections != null;
            case SpringPackage.XSTREAM_DATA_FORMAT__DRIVER:
                return DRIVER_EDEFAULT == null ? driver != null : !DRIVER_EDEFAULT.equals(driver);
            case SpringPackage.XSTREAM_DATA_FORMAT__DRIVER_REF:
                return DRIVER_REF_EDEFAULT == null ? driverRef != null : !DRIVER_REF_EDEFAULT.equals(driverRef);
            case SpringPackage.XSTREAM_DATA_FORMAT__ENCODING:
                return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
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
        result.append(" (driver: ");
        result.append(driver);
        result.append(", driverRef: ");
        result.append(driverRef);
        result.append(", encoding: ");
        result.append(encoding);
        result.append(')');
        return result.toString();
    }

} //XStreamDataFormatImpl
