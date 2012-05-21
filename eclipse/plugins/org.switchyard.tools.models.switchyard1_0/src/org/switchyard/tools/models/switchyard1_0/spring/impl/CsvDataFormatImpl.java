/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Csv Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CsvDataFormatImpl#isAutogenColumns <em>Autogen Columns</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CsvDataFormatImpl#getConfigRef <em>Config Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CsvDataFormatImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CsvDataFormatImpl#getStrategyRef <em>Strategy Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CsvDataFormatImpl extends DataFormatImpl implements CsvDataFormat {
	/**
     * The default value of the '{@link #isAutogenColumns() <em>Autogen Columns</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAutogenColumns()
     * @generated
     * @ordered
     */
    protected static final boolean AUTOGEN_COLUMNS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAutogenColumns() <em>Autogen Columns</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAutogenColumns()
     * @generated
     * @ordered
     */
    protected boolean autogenColumns = AUTOGEN_COLUMNS_EDEFAULT;

    /**
     * This is true if the Autogen Columns attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean autogenColumnsESet;

    /**
     * The default value of the '{@link #getConfigRef() <em>Config Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigRef()
     * @generated
     * @ordered
     */
    protected static final String CONFIG_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConfigRef() <em>Config Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigRef()
     * @generated
     * @ordered
     */
    protected String configRef = CONFIG_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDelimiter()
     * @generated
     * @ordered
     */
	protected static final String DELIMITER_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDelimiter()
     * @generated
     * @ordered
     */
	protected String delimiter = DELIMITER_EDEFAULT;

	/**
     * The default value of the '{@link #getStrategyRef() <em>Strategy Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrategyRef()
     * @generated
     * @ordered
     */
    protected static final String STRATEGY_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStrategyRef() <em>Strategy Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrategyRef()
     * @generated
     * @ordered
     */
    protected String strategyRef = STRATEGY_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CsvDataFormatImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getCsvDataFormat();
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAutogenColumns() {
        return autogenColumns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAutogenColumns(boolean newAutogenColumns) {
        boolean oldAutogenColumns = autogenColumns;
        autogenColumns = newAutogenColumns;
        boolean oldAutogenColumnsESet = autogenColumnsESet;
        autogenColumnsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CSV_DATA_FORMAT__AUTOGEN_COLUMNS, oldAutogenColumns, autogenColumns, !oldAutogenColumnsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAutogenColumns() {
        boolean oldAutogenColumns = autogenColumns;
        boolean oldAutogenColumnsESet = autogenColumnsESet;
        autogenColumns = AUTOGEN_COLUMNS_EDEFAULT;
        autogenColumnsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.CSV_DATA_FORMAT__AUTOGEN_COLUMNS, oldAutogenColumns, AUTOGEN_COLUMNS_EDEFAULT, oldAutogenColumnsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAutogenColumns() {
        return autogenColumnsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConfigRef() {
        return configRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfigRef(String newConfigRef) {
        String oldConfigRef = configRef;
        configRef = newConfigRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CSV_DATA_FORMAT__CONFIG_REF, oldConfigRef, configRef));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDelimiter() {
        return delimiter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDelimiter(String newDelimiter) {
        String oldDelimiter = delimiter;
        delimiter = newDelimiter;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CSV_DATA_FORMAT__DELIMITER, oldDelimiter, delimiter));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStrategyRef() {
        return strategyRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStrategyRef(String newStrategyRef) {
        String oldStrategyRef = strategyRef;
        strategyRef = newStrategyRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CSV_DATA_FORMAT__STRATEGY_REF, oldStrategyRef, strategyRef));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.CSV_DATA_FORMAT__AUTOGEN_COLUMNS:
                return isAutogenColumns();
            case SpringPackage.CSV_DATA_FORMAT__CONFIG_REF:
                return getConfigRef();
            case SpringPackage.CSV_DATA_FORMAT__DELIMITER:
                return getDelimiter();
            case SpringPackage.CSV_DATA_FORMAT__STRATEGY_REF:
                return getStrategyRef();
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
            case SpringPackage.CSV_DATA_FORMAT__AUTOGEN_COLUMNS:
                setAutogenColumns((Boolean)newValue);
                return;
            case SpringPackage.CSV_DATA_FORMAT__CONFIG_REF:
                setConfigRef((String)newValue);
                return;
            case SpringPackage.CSV_DATA_FORMAT__DELIMITER:
                setDelimiter((String)newValue);
                return;
            case SpringPackage.CSV_DATA_FORMAT__STRATEGY_REF:
                setStrategyRef((String)newValue);
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
            case SpringPackage.CSV_DATA_FORMAT__AUTOGEN_COLUMNS:
                unsetAutogenColumns();
                return;
            case SpringPackage.CSV_DATA_FORMAT__CONFIG_REF:
                setConfigRef(CONFIG_REF_EDEFAULT);
                return;
            case SpringPackage.CSV_DATA_FORMAT__DELIMITER:
                setDelimiter(DELIMITER_EDEFAULT);
                return;
            case SpringPackage.CSV_DATA_FORMAT__STRATEGY_REF:
                setStrategyRef(STRATEGY_REF_EDEFAULT);
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
            case SpringPackage.CSV_DATA_FORMAT__AUTOGEN_COLUMNS:
                return isSetAutogenColumns();
            case SpringPackage.CSV_DATA_FORMAT__CONFIG_REF:
                return CONFIG_REF_EDEFAULT == null ? configRef != null : !CONFIG_REF_EDEFAULT.equals(configRef);
            case SpringPackage.CSV_DATA_FORMAT__DELIMITER:
                return DELIMITER_EDEFAULT == null ? delimiter != null : !DELIMITER_EDEFAULT.equals(delimiter);
            case SpringPackage.CSV_DATA_FORMAT__STRATEGY_REF:
                return STRATEGY_REF_EDEFAULT == null ? strategyRef != null : !STRATEGY_REF_EDEFAULT.equals(strategyRef);
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
        result.append(" (autogenColumns: ");
        if (autogenColumnsESet) result.append(autogenColumns); else result.append("<unset>");
        result.append(", configRef: ");
        result.append(configRef);
        result.append(", delimiter: ");
        result.append(delimiter);
        result.append(", strategyRef: ");
        result.append(strategyRef);
        result.append(')');
        return result.toString();
    }

} //CsvDataFormatImpl
