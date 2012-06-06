/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic File Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileBindingTypeImpl#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileBindingTypeImpl#isAutoCreate <em>Auto Create</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileBindingTypeImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileBindingTypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileBindingTypeImpl#isFlatten <em>Flatten</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileBindingTypeImpl#getCharset <em>Charset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenericFileBindingTypeImpl extends BaseCamelBindingImpl implements GenericFileBindingType {
    /**
     * The default value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirectory()
     * @generated
     * @ordered
     */
    protected static final String DIRECTORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirectory()
     * @generated
     * @ordered
     */
    protected String directory = DIRECTORY_EDEFAULT;

    /**
     * The default value of the '{@link #isAutoCreate() <em>Auto Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAutoCreate()
     * @generated
     * @ordered
     */
    protected static final boolean AUTO_CREATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAutoCreate() <em>Auto Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAutoCreate()
     * @generated
     * @ordered
     */
    protected boolean autoCreate = AUTO_CREATE_EDEFAULT;

    /**
     * This is true if the Auto Create attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean autoCreateESet;

    /**
     * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufferSize()
     * @generated
     * @ordered
     */
    protected static final BigInteger BUFFER_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufferSize()
     * @generated
     * @ordered
     */
    protected BigInteger bufferSize = BUFFER_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileName()
     * @generated
     * @ordered
     */
    protected static final String FILE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileName()
     * @generated
     * @ordered
     */
    protected String fileName = FILE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isFlatten() <em>Flatten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFlatten()
     * @generated
     * @ordered
     */
    protected static final boolean FLATTEN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isFlatten() <em>Flatten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFlatten()
     * @generated
     * @ordered
     */
    protected boolean flatten = FLATTEN_EDEFAULT;

    /**
     * This is true if the Flatten attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flattenESet;

    /**
     * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharset()
     * @generated
     * @ordered
     */
    protected static final String CHARSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCharset() <em>Charset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharset()
     * @generated
     * @ordered
     */
    protected String charset = CHARSET_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GenericFileBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CamelPackage.Literals.GENERIC_FILE_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDirectory(String newDirectory) {
        String oldDirectory = directory;
        directory = newDirectory;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.GENERIC_FILE_BINDING_TYPE__DIRECTORY, oldDirectory, directory));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAutoCreate() {
        return autoCreate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAutoCreate(boolean newAutoCreate) {
        boolean oldAutoCreate = autoCreate;
        autoCreate = newAutoCreate;
        boolean oldAutoCreateESet = autoCreateESet;
        autoCreateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.GENERIC_FILE_BINDING_TYPE__AUTO_CREATE, oldAutoCreate, autoCreate, !oldAutoCreateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAutoCreate() {
        boolean oldAutoCreate = autoCreate;
        boolean oldAutoCreateESet = autoCreateESet;
        autoCreate = AUTO_CREATE_EDEFAULT;
        autoCreateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.GENERIC_FILE_BINDING_TYPE__AUTO_CREATE, oldAutoCreate, AUTO_CREATE_EDEFAULT, oldAutoCreateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAutoCreate() {
        return autoCreateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getBufferSize() {
        return bufferSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBufferSize(BigInteger newBufferSize) {
        BigInteger oldBufferSize = bufferSize;
        bufferSize = newBufferSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.GENERIC_FILE_BINDING_TYPE__BUFFER_SIZE, oldBufferSize, bufferSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFileName(String newFileName) {
        String oldFileName = fileName;
        fileName = newFileName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.GENERIC_FILE_BINDING_TYPE__FILE_NAME, oldFileName, fileName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFlatten() {
        return flatten;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFlatten(boolean newFlatten) {
        boolean oldFlatten = flatten;
        flatten = newFlatten;
        boolean oldFlattenESet = flattenESet;
        flattenESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.GENERIC_FILE_BINDING_TYPE__FLATTEN, oldFlatten, flatten, !oldFlattenESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFlatten() {
        boolean oldFlatten = flatten;
        boolean oldFlattenESet = flattenESet;
        flatten = FLATTEN_EDEFAULT;
        flattenESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.GENERIC_FILE_BINDING_TYPE__FLATTEN, oldFlatten, FLATTEN_EDEFAULT, oldFlattenESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFlatten() {
        return flattenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCharset() {
        return charset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCharset(String newCharset) {
        String oldCharset = charset;
        charset = newCharset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.GENERIC_FILE_BINDING_TYPE__CHARSET, oldCharset, charset));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__DIRECTORY:
                return getDirectory();
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__AUTO_CREATE:
                return isAutoCreate();
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__BUFFER_SIZE:
                return getBufferSize();
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__FILE_NAME:
                return getFileName();
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__FLATTEN:
                return isFlatten();
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__CHARSET:
                return getCharset();
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
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__DIRECTORY:
                setDirectory((String)newValue);
                return;
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__AUTO_CREATE:
                setAutoCreate((Boolean)newValue);
                return;
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__BUFFER_SIZE:
                setBufferSize((BigInteger)newValue);
                return;
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__FILE_NAME:
                setFileName((String)newValue);
                return;
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__FLATTEN:
                setFlatten((Boolean)newValue);
                return;
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__CHARSET:
                setCharset((String)newValue);
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
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__DIRECTORY:
                setDirectory(DIRECTORY_EDEFAULT);
                return;
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__AUTO_CREATE:
                unsetAutoCreate();
                return;
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__BUFFER_SIZE:
                setBufferSize(BUFFER_SIZE_EDEFAULT);
                return;
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__FILE_NAME:
                setFileName(FILE_NAME_EDEFAULT);
                return;
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__FLATTEN:
                unsetFlatten();
                return;
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__CHARSET:
                setCharset(CHARSET_EDEFAULT);
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
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__DIRECTORY:
                return DIRECTORY_EDEFAULT == null ? directory != null : !DIRECTORY_EDEFAULT.equals(directory);
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__AUTO_CREATE:
                return isSetAutoCreate();
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__BUFFER_SIZE:
                return BUFFER_SIZE_EDEFAULT == null ? bufferSize != null : !BUFFER_SIZE_EDEFAULT.equals(bufferSize);
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__FILE_NAME:
                return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__FLATTEN:
                return isSetFlatten();
            case CamelPackage.GENERIC_FILE_BINDING_TYPE__CHARSET:
                return CHARSET_EDEFAULT == null ? charset != null : !CHARSET_EDEFAULT.equals(charset);
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
        result.append(" (directory: ");
        result.append(directory);
        result.append(", autoCreate: ");
        if (autoCreateESet) result.append(autoCreate); else result.append("<unset>");
        result.append(", bufferSize: ");
        result.append(bufferSize);
        result.append(", fileName: ");
        result.append(fileName);
        result.append(", flatten: ");
        if (flattenESet) result.append(flatten); else result.append("<unset>");
        result.append(", charset: ");
        result.append(charset);
        result.append(')');
        return result.toString();
    }

} //GenericFileBindingTypeImpl
