/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.validate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;


import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.ValidateTypeImpl;
import org.switchyard.tools.models.switchyard1_0.validate.SchemaCatalogsType;
import org.switchyard.tools.models.switchyard1_0.validate.SchemaFilesType;
import org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage;
import org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType;
import org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Validate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.impl.XmlValidateTypeImpl#getSchemaFiles <em>Schema Files</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.impl.XmlValidateTypeImpl#getSchemaCatalogs <em>Schema Catalogs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.impl.XmlValidateTypeImpl#getSchemaType <em>Schema Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.impl.XmlValidateTypeImpl#getFailOnWarning <em>Fail On Warning</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.impl.XmlValidateTypeImpl#getNamespaceAware <em>Namespace Aware</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XmlValidateTypeImpl extends ValidateTypeImpl implements XmlValidateType {
	/**
     * The cached value of the '{@link #getSchemaFiles() <em>Schema Files</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchemaFiles()
     * @generated
     * @ordered
     */
    protected SchemaFilesType schemaFiles;
    /**
     * The cached value of the '{@link #getSchemaCatalogs() <em>Schema Catalogs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchemaCatalogs()
     * @generated
     * @ordered
     */
    protected SchemaCatalogsType schemaCatalogs;
    /**
     * The default value of the '{@link #getSchemaType() <em>Schema Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchemaType()
     * @generated
     * @ordered
     */
	protected static final XmlSchemaType SCHEMA_TYPE_EDEFAULT = XmlSchemaType.DTD;
	/**
     * The cached value of the '{@link #getSchemaType() <em>Schema Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchemaType()
     * @generated
     * @ordered
     */
	protected XmlSchemaType schemaType = SCHEMA_TYPE_EDEFAULT;
	/**
     * The default value of the '{@link #getFailOnWarning() <em>Fail On Warning</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFailOnWarning()
     * @generated
     * @ordered
     */
	protected static final String FAIL_ON_WARNING_EDEFAULT = null;
	/**
     * The cached value of the '{@link #getFailOnWarning() <em>Fail On Warning</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFailOnWarning()
     * @generated
     * @ordered
     */
	protected String failOnWarning = FAIL_ON_WARNING_EDEFAULT;

	/**
     * The default value of the '{@link #getNamespaceAware() <em>Namespace Aware</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespaceAware()
     * @generated
     * @ordered
     */
    protected static final String NAMESPACE_AWARE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getNamespaceAware() <em>Namespace Aware</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespaceAware()
     * @generated
     * @ordered
     */
    protected String namespaceAware = NAMESPACE_AWARE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected XmlValidateTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ValidatePackage.Literals.XML_VALIDATE_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaFilesType getSchemaFiles() {
        return schemaFiles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSchemaFiles(SchemaFilesType newSchemaFiles, NotificationChain msgs) {
        SchemaFilesType oldSchemaFiles = schemaFiles;
        schemaFiles = newSchemaFiles;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_FILES, oldSchemaFiles, newSchemaFiles);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSchemaFiles(SchemaFilesType newSchemaFiles) {
        if (newSchemaFiles != schemaFiles) {
            NotificationChain msgs = null;
            if (schemaFiles != null)
                msgs = ((InternalEObject)schemaFiles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_FILES, null, msgs);
            if (newSchemaFiles != null)
                msgs = ((InternalEObject)newSchemaFiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_FILES, null, msgs);
            msgs = basicSetSchemaFiles(newSchemaFiles, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_FILES, newSchemaFiles, newSchemaFiles));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaCatalogsType getSchemaCatalogs() {
        return schemaCatalogs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSchemaCatalogs(SchemaCatalogsType newSchemaCatalogs, NotificationChain msgs) {
        SchemaCatalogsType oldSchemaCatalogs = schemaCatalogs;
        schemaCatalogs = newSchemaCatalogs;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_CATALOGS, oldSchemaCatalogs, newSchemaCatalogs);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSchemaCatalogs(SchemaCatalogsType newSchemaCatalogs) {
        if (newSchemaCatalogs != schemaCatalogs) {
            NotificationChain msgs = null;
            if (schemaCatalogs != null)
                msgs = ((InternalEObject)schemaCatalogs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_CATALOGS, null, msgs);
            if (newSchemaCatalogs != null)
                msgs = ((InternalEObject)newSchemaCatalogs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_CATALOGS, null, msgs);
            msgs = basicSetSchemaCatalogs(newSchemaCatalogs, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_CATALOGS, newSchemaCatalogs, newSchemaCatalogs));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XmlSchemaType getSchemaType() {
        return schemaType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSchemaType(XmlSchemaType newSchemaType) {
        XmlSchemaType oldSchemaType = schemaType;
        schemaType = newSchemaType == null ? SCHEMA_TYPE_EDEFAULT : newSchemaType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_TYPE, oldSchemaType, schemaType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getFailOnWarning() {
        return failOnWarning;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFailOnWarning(String newFailOnWarning) {
        String oldFailOnWarning = failOnWarning;
        failOnWarning = newFailOnWarning;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ValidatePackage.XML_VALIDATE_TYPE__FAIL_ON_WARNING, oldFailOnWarning, failOnWarning));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNamespaceAware() {
        return namespaceAware;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNamespaceAware(String newNamespaceAware) {
        String oldNamespaceAware = namespaceAware;
        namespaceAware = newNamespaceAware;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ValidatePackage.XML_VALIDATE_TYPE__NAMESPACE_AWARE, oldNamespaceAware, namespaceAware));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_FILES:
                return basicSetSchemaFiles(null, msgs);
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_CATALOGS:
                return basicSetSchemaCatalogs(null, msgs);
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
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_FILES:
                return getSchemaFiles();
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_CATALOGS:
                return getSchemaCatalogs();
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_TYPE:
                return getSchemaType();
            case ValidatePackage.XML_VALIDATE_TYPE__FAIL_ON_WARNING:
                return getFailOnWarning();
            case ValidatePackage.XML_VALIDATE_TYPE__NAMESPACE_AWARE:
                return getNamespaceAware();
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
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_FILES:
                setSchemaFiles((SchemaFilesType)newValue);
                return;
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_CATALOGS:
                setSchemaCatalogs((SchemaCatalogsType)newValue);
                return;
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_TYPE:
                setSchemaType((XmlSchemaType)newValue);
                return;
            case ValidatePackage.XML_VALIDATE_TYPE__FAIL_ON_WARNING:
                setFailOnWarning((String)newValue);
                return;
            case ValidatePackage.XML_VALIDATE_TYPE__NAMESPACE_AWARE:
                setNamespaceAware((String)newValue);
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
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_FILES:
                setSchemaFiles((SchemaFilesType)null);
                return;
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_CATALOGS:
                setSchemaCatalogs((SchemaCatalogsType)null);
                return;
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_TYPE:
                setSchemaType(SCHEMA_TYPE_EDEFAULT);
                return;
            case ValidatePackage.XML_VALIDATE_TYPE__FAIL_ON_WARNING:
                setFailOnWarning(FAIL_ON_WARNING_EDEFAULT);
                return;
            case ValidatePackage.XML_VALIDATE_TYPE__NAMESPACE_AWARE:
                setNamespaceAware(NAMESPACE_AWARE_EDEFAULT);
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
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_FILES:
                return schemaFiles != null;
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_CATALOGS:
                return schemaCatalogs != null;
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_TYPE:
                return schemaType != SCHEMA_TYPE_EDEFAULT;
            case ValidatePackage.XML_VALIDATE_TYPE__FAIL_ON_WARNING:
                return FAIL_ON_WARNING_EDEFAULT == null ? failOnWarning != null : !FAIL_ON_WARNING_EDEFAULT.equals(failOnWarning);
            case ValidatePackage.XML_VALIDATE_TYPE__NAMESPACE_AWARE:
                return NAMESPACE_AWARE_EDEFAULT == null ? namespaceAware != null : !NAMESPACE_AWARE_EDEFAULT.equals(namespaceAware);
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
        result.append(" (schemaType: ");
        result.append(schemaType);
        result.append(", failOnWarning: ");
        result.append(failOnWarning);
        result.append(", namespaceAware: ");
        result.append(namespaceAware);
        result.append(')');
        return result.toString();
    }

} //XmlValidateTypeImpl
