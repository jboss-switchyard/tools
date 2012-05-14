/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;


import org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.FileProducerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl#getTargetDir <em>Target Dir</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl#isAutoCreate <em>Auto Create</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl#isFlatten <em>Flatten</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl#getProduce <em>Produce</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelFileBindingTypeImpl extends SwitchYardBindingTypeImpl implements CamelFileBindingType {
	/**
     * The default value of the '{@link #getTargetDir() <em>Target Dir</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTargetDir()
     * @generated
     * @ordered
     */
	protected static final String TARGET_DIR_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTargetDir() <em>Target Dir</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTargetDir()
     * @generated
     * @ordered
     */
	protected String targetDir = TARGET_DIR_EDEFAULT;

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
     * The cached value of the '{@link #getConsume() <em>Consume</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConsume()
     * @generated
     * @ordered
     */
	protected FileConsumerType consume;

	/**
     * The cached value of the '{@link #getProduce() <em>Produce</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProduce()
     * @generated
     * @ordered
     */
	protected FileProducerType produce;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CamelFileBindingTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return CamelPackage.Literals.CAMEL_FILE_BINDING_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getTargetDir() {
        return targetDir;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTargetDir(String newTargetDir) {
        String oldTargetDir = targetDir;
        targetDir = newTargetDir;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FILE_BINDING_TYPE__TARGET_DIR, oldTargetDir, targetDir));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FILE_BINDING_TYPE__AUTO_CREATE, oldAutoCreate, autoCreate, !oldAutoCreateESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_FILE_BINDING_TYPE__AUTO_CREATE, oldAutoCreate, AUTO_CREATE_EDEFAULT, oldAutoCreateESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FILE_BINDING_TYPE__BUFFER_SIZE, oldBufferSize, bufferSize));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FILE_BINDING_TYPE__FILE_NAME, oldFileName, fileName));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FILE_BINDING_TYPE__FLATTEN, oldFlatten, flatten, !oldFlattenESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_FILE_BINDING_TYPE__FLATTEN, oldFlatten, FLATTEN_EDEFAULT, oldFlattenESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FILE_BINDING_TYPE__CHARSET, oldCharset, charset));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FileConsumerType getConsume() {
        return consume;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetConsume(FileConsumerType newConsume, NotificationChain msgs) {
        FileConsumerType oldConsume = consume;
        consume = newConsume;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME, oldConsume, newConsume);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConsume(FileConsumerType newConsume) {
        if (newConsume != consume) {
            NotificationChain msgs = null;
            if (consume != null)
                msgs = ((InternalEObject)consume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME, null, msgs);
            if (newConsume != null)
                msgs = ((InternalEObject)newConsume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME, null, msgs);
            msgs = basicSetConsume(newConsume, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME, newConsume, newConsume));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FileProducerType getProduce() {
        return produce;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetProduce(FileProducerType newProduce, NotificationChain msgs) {
        FileProducerType oldProduce = produce;
        produce = newProduce;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE, oldProduce, newProduce);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setProduce(FileProducerType newProduce) {
        if (newProduce != produce) {
            NotificationChain msgs = null;
            if (produce != null)
                msgs = ((InternalEObject)produce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE, null, msgs);
            if (newProduce != null)
                msgs = ((InternalEObject)newProduce).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE, null, msgs);
            msgs = basicSetProduce(newProduce, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE, newProduce, newProduce));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME:
                return basicSetConsume(null, msgs);
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE:
                return basicSetProduce(null, msgs);
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
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__TARGET_DIR:
                return getTargetDir();
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__AUTO_CREATE:
                return isAutoCreate();
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__BUFFER_SIZE:
                return getBufferSize();
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__FILE_NAME:
                return getFileName();
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__FLATTEN:
                return isFlatten();
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__CHARSET:
                return getCharset();
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME:
                return getConsume();
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE:
                return getProduce();
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
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__TARGET_DIR:
                setTargetDir((String)newValue);
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__AUTO_CREATE:
                setAutoCreate((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__BUFFER_SIZE:
                setBufferSize((BigInteger)newValue);
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__FILE_NAME:
                setFileName((String)newValue);
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__FLATTEN:
                setFlatten((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__CHARSET:
                setCharset((String)newValue);
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME:
                setConsume((FileConsumerType)newValue);
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE:
                setProduce((FileProducerType)newValue);
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
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__TARGET_DIR:
                setTargetDir(TARGET_DIR_EDEFAULT);
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__AUTO_CREATE:
                unsetAutoCreate();
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__BUFFER_SIZE:
                setBufferSize(BUFFER_SIZE_EDEFAULT);
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__FILE_NAME:
                setFileName(FILE_NAME_EDEFAULT);
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__FLATTEN:
                unsetFlatten();
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__CHARSET:
                setCharset(CHARSET_EDEFAULT);
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME:
                setConsume((FileConsumerType)null);
                return;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE:
                setProduce((FileProducerType)null);
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
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__TARGET_DIR:
                return TARGET_DIR_EDEFAULT == null ? targetDir != null : !TARGET_DIR_EDEFAULT.equals(targetDir);
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__AUTO_CREATE:
                return isSetAutoCreate();
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__BUFFER_SIZE:
                return BUFFER_SIZE_EDEFAULT == null ? bufferSize != null : !BUFFER_SIZE_EDEFAULT.equals(bufferSize);
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__FILE_NAME:
                return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__FLATTEN:
                return isSetFlatten();
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__CHARSET:
                return CHARSET_EDEFAULT == null ? charset != null : !CHARSET_EDEFAULT.equals(charset);
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__CONSUME:
                return consume != null;
            case CamelPackage.CAMEL_FILE_BINDING_TYPE__PRODUCE:
                return produce != null;
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
        result.append(" (targetDir: ");
        result.append(targetDir);
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

} //CamelFileBindingTypeImpl
