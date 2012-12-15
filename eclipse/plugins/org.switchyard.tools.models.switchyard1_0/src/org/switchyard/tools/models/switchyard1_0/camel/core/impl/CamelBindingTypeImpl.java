/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelBindingTypeImpl#getConfigURI <em>Config URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelBindingTypeImpl extends BaseCamelBindingImpl implements CamelBindingType {
    /**
     * The default value of the '{@link #getConfigURI() <em>Config URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigURI()
     * @generated
     * @ordered
     */
    protected static final String CONFIG_URI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConfigURI() <em>Config URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigURI()
     * @generated
     * @ordered
     */
    protected String configURI = CONFIG_URI_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CorePackage.Literals.CAMEL_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConfigURI() {
        return configURI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfigURI(String newConfigURI) {
        String oldConfigURI = configURI;
        configURI = newConfigURI;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CAMEL_BINDING_TYPE__CONFIG_URI, oldConfigURI, configURI));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CorePackage.CAMEL_BINDING_TYPE__CONFIG_URI:
                return getConfigURI();
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
            case CorePackage.CAMEL_BINDING_TYPE__CONFIG_URI:
                setConfigURI((String)newValue);
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
            case CorePackage.CAMEL_BINDING_TYPE__CONFIG_URI:
                setConfigURI(CONFIG_URI_EDEFAULT);
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
            case CorePackage.CAMEL_BINDING_TYPE__CONFIG_URI:
                return CONFIG_URI_EDEFAULT == null ? configURI != null : !CONFIG_URI_EDEFAULT.equals(configURI);
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
        result.append(" (configURI: ");
        result.append(configURI);
        result.append(')');
        return result.toString();
    }

} //CamelBindingTypeImpl
