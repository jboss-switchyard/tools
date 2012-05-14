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

import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.XmlBeansDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Beans Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.XmlBeansDataFormatImpl#isPrettyPrint <em>Pretty Print</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XmlBeansDataFormatImpl extends DataFormatImpl implements XmlBeansDataFormat {
	/**
     * The default value of the '{@link #isPrettyPrint() <em>Pretty Print</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isPrettyPrint()
     * @generated
     * @ordered
     */
	protected static final boolean PRETTY_PRINT_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isPrettyPrint() <em>Pretty Print</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isPrettyPrint()
     * @generated
     * @ordered
     */
	protected boolean prettyPrint = PRETTY_PRINT_EDEFAULT;

	/**
     * This is true if the Pretty Print attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean prettyPrintESet;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected XmlBeansDataFormatImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getXmlBeansDataFormat();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isPrettyPrint() {
        return prettyPrint;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPrettyPrint(boolean newPrettyPrint) {
        boolean oldPrettyPrint = prettyPrint;
        prettyPrint = newPrettyPrint;
        boolean oldPrettyPrintESet = prettyPrintESet;
        prettyPrintESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.XML_BEANS_DATA_FORMAT__PRETTY_PRINT, oldPrettyPrint, prettyPrint, !oldPrettyPrintESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetPrettyPrint() {
        boolean oldPrettyPrint = prettyPrint;
        boolean oldPrettyPrintESet = prettyPrintESet;
        prettyPrint = PRETTY_PRINT_EDEFAULT;
        prettyPrintESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.XML_BEANS_DATA_FORMAT__PRETTY_PRINT, oldPrettyPrint, PRETTY_PRINT_EDEFAULT, oldPrettyPrintESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetPrettyPrint() {
        return prettyPrintESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.XML_BEANS_DATA_FORMAT__PRETTY_PRINT:
                return isPrettyPrint();
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
            case SpringPackage.XML_BEANS_DATA_FORMAT__PRETTY_PRINT:
                setPrettyPrint((Boolean)newValue);
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
            case SpringPackage.XML_BEANS_DATA_FORMAT__PRETTY_PRINT:
                unsetPrettyPrint();
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
            case SpringPackage.XML_BEANS_DATA_FORMAT__PRETTY_PRINT:
                return isSetPrettyPrint();
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
        result.append(" (prettyPrint: ");
        if (prettyPrintESet) result.append(prettyPrint); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //XmlBeansDataFormatImpl
