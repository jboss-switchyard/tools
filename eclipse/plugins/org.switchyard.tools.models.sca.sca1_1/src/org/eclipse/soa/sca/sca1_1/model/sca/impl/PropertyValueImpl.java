/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PropertyValueImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PropertyValueImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PropertyValueImpl#isMany <em>Many</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PropertyValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PropertyValueImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PropertyValueImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PropertyValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PropertyValueImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyValueImpl extends SCAPropertyBaseImpl implements PropertyValue {
	/**
     * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getElement()
     * @generated
     * @ordered
     */
	protected static final QName ELEMENT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getElement()
     * @generated
     * @ordered
     */
	protected QName element = ELEMENT_EDEFAULT;

	/**
     * The default value of the '{@link #getFile() <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFile()
     * @generated
     * @ordered
     */
	protected static final String FILE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFile()
     * @generated
     * @ordered
     */
	protected String file = FILE_EDEFAULT;

	/**
     * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isMany()
     * @generated
     * @ordered
     */
	protected static final boolean MANY_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isMany() <em>Many</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isMany()
     * @generated
     * @ordered
     */
	protected boolean many = MANY_EDEFAULT;

	/**
     * This is true if the Many attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean manyESet;

	/**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected static final String NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected String name = NAME_EDEFAULT;

	/**
     * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
	protected static final String SOURCE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
	protected String source = SOURCE_EDEFAULT;

	/**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected static final QName TYPE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected QName type = TYPE_EDEFAULT;

	/**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
	protected static final String VALUE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
	protected String value = VALUE_EDEFAULT;

	/**
     * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PropertyValueImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getPropertyValue();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QName getElement() {
        return element;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setElement(QName newElement) {
        QName oldElement = element;
        element = newElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.PROPERTY_VALUE__ELEMENT, oldElement, element));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getFile() {
        return file;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFile(String newFile) {
        String oldFile = file;
        file = newFile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.PROPERTY_VALUE__FILE, oldFile, file));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isMany() {
        return many;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMany(boolean newMany) {
        boolean oldMany = many;
        many = newMany;
        boolean oldManyESet = manyESet;
        manyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.PROPERTY_VALUE__MANY, oldMany, many, !oldManyESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetMany() {
        boolean oldMany = many;
        boolean oldManyESet = manyESet;
        many = MANY_EDEFAULT;
        manyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.PROPERTY_VALUE__MANY, oldMany, MANY_EDEFAULT, oldManyESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetMany() {
        return manyESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
        return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.PROPERTY_VALUE__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSource() {
        return source;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSource(String newSource) {
        String oldSource = source;
        source = newSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.PROPERTY_VALUE__SOURCE, oldSource, source));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QName getType() {
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setType(QName newType) {
        QName oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.PROPERTY_VALUE__TYPE, oldType, type));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getValue() {
        return value;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.PROPERTY_VALUE__VALUE, oldValue, value));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute() {
        if (anyAttribute == null) {
            anyAttribute = new BasicFeatureMap(this, ScaPackage.PROPERTY_VALUE__ANY_ATTRIBUTE);
        }
        return anyAttribute;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.PROPERTY_VALUE__ANY_ATTRIBUTE:
                return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
            case ScaPackage.PROPERTY_VALUE__ELEMENT:
                return getElement();
            case ScaPackage.PROPERTY_VALUE__FILE:
                return getFile();
            case ScaPackage.PROPERTY_VALUE__MANY:
                return isMany();
            case ScaPackage.PROPERTY_VALUE__NAME:
                return getName();
            case ScaPackage.PROPERTY_VALUE__SOURCE:
                return getSource();
            case ScaPackage.PROPERTY_VALUE__TYPE:
                return getType();
            case ScaPackage.PROPERTY_VALUE__VALUE:
                return getValue();
            case ScaPackage.PROPERTY_VALUE__ANY_ATTRIBUTE:
                if (coreType) return getAnyAttribute();
                return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
            case ScaPackage.PROPERTY_VALUE__ELEMENT:
                setElement((QName)newValue);
                return;
            case ScaPackage.PROPERTY_VALUE__FILE:
                setFile((String)newValue);
                return;
            case ScaPackage.PROPERTY_VALUE__MANY:
                setMany((Boolean)newValue);
                return;
            case ScaPackage.PROPERTY_VALUE__NAME:
                setName((String)newValue);
                return;
            case ScaPackage.PROPERTY_VALUE__SOURCE:
                setSource((String)newValue);
                return;
            case ScaPackage.PROPERTY_VALUE__TYPE:
                setType((QName)newValue);
                return;
            case ScaPackage.PROPERTY_VALUE__VALUE:
                setValue((String)newValue);
                return;
            case ScaPackage.PROPERTY_VALUE__ANY_ATTRIBUTE:
                ((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
            case ScaPackage.PROPERTY_VALUE__ELEMENT:
                setElement(ELEMENT_EDEFAULT);
                return;
            case ScaPackage.PROPERTY_VALUE__FILE:
                setFile(FILE_EDEFAULT);
                return;
            case ScaPackage.PROPERTY_VALUE__MANY:
                unsetMany();
                return;
            case ScaPackage.PROPERTY_VALUE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ScaPackage.PROPERTY_VALUE__SOURCE:
                setSource(SOURCE_EDEFAULT);
                return;
            case ScaPackage.PROPERTY_VALUE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case ScaPackage.PROPERTY_VALUE__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case ScaPackage.PROPERTY_VALUE__ANY_ATTRIBUTE:
                getAnyAttribute().clear();
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
            case ScaPackage.PROPERTY_VALUE__ELEMENT:
                return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
            case ScaPackage.PROPERTY_VALUE__FILE:
                return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
            case ScaPackage.PROPERTY_VALUE__MANY:
                return isSetMany();
            case ScaPackage.PROPERTY_VALUE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ScaPackage.PROPERTY_VALUE__SOURCE:
                return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
            case ScaPackage.PROPERTY_VALUE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case ScaPackage.PROPERTY_VALUE__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case ScaPackage.PROPERTY_VALUE__ANY_ATTRIBUTE:
                return anyAttribute != null && !anyAttribute.isEmpty();
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
        result.append(" (element: ");
        result.append(element);
        result.append(", file: ");
        result.append(file);
        result.append(", many: ");
        if (manyESet) result.append(many); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(", source: ");
        result.append(source);
        result.append(", type: ");
        result.append(type);
        result.append(", value: ");
        result.append(value);
        result.append(", anyAttribute: ");
        result.append(anyAttribute);
        result.append(')');
        return result.toString();
    }

} //PropertyValueImpl
