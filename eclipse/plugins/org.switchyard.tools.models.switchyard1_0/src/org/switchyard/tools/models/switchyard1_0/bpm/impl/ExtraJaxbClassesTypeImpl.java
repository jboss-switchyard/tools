/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.ExtraJaxbClassesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extra Jaxb Classes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ExtraJaxbClassesTypeImpl#getExtraJaxbClass <em>Extra Jaxb Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtraJaxbClassesTypeImpl extends CommonExtensionBaseImpl implements ExtraJaxbClassesType {
    /**
     * The cached value of the '{@link #getExtraJaxbClass() <em>Extra Jaxb Class</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtraJaxbClass()
     * @generated
     * @ordered
     */
    protected EList<String> extraJaxbClass;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtraJaxbClassesTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BPMPackage.Literals.EXTRA_JAXB_CLASSES_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getExtraJaxbClass() {
        if (extraJaxbClass == null) {
            extraJaxbClass = new EDataTypeEList<String>(String.class, this, BPMPackage.EXTRA_JAXB_CLASSES_TYPE__EXTRA_JAXB_CLASS);
        }
        return extraJaxbClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BPMPackage.EXTRA_JAXB_CLASSES_TYPE__EXTRA_JAXB_CLASS:
                return getExtraJaxbClass();
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
            case BPMPackage.EXTRA_JAXB_CLASSES_TYPE__EXTRA_JAXB_CLASS:
                getExtraJaxbClass().clear();
                getExtraJaxbClass().addAll((Collection<? extends String>)newValue);
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
            case BPMPackage.EXTRA_JAXB_CLASSES_TYPE__EXTRA_JAXB_CLASS:
                getExtraJaxbClass().clear();
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
            case BPMPackage.EXTRA_JAXB_CLASSES_TYPE__EXTRA_JAXB_CLASS:
                return extraJaxbClass != null && !extraJaxbClass.isEmpty();
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
        result.append(" (extraJaxbClass: ");
        result.append(extraJaxbClass);
        result.append(')');
        return result.toString();
    }

} //ExtraJaxbClassesTypeImpl
