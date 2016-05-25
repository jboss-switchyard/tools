/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Mapper Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ContextMapperTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ContextMapperTypeImpl#getExcludeNamespaces <em>Exclude Namespaces</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ContextMapperTypeImpl#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ContextMapperTypeImpl#getIncludeNamespaces <em>Include Namespaces</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ContextMapperTypeImpl#getIncludes <em>Includes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextMapperTypeImpl extends EObjectImpl implements ContextMapperType {
	/**
     * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getClass_()
     * @generated
     * @ordered
     */
	protected static final String CLASS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getClass_()
     * @generated
     * @ordered
     */
	protected String class_ = CLASS_EDEFAULT;

	/**
     * The default value of the '{@link #getExcludeNamespaces() <em>Exclude Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExcludeNamespaces()
     * @generated
     * @ordered
     */
	protected static final String EXCLUDE_NAMESPACES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getExcludeNamespaces() <em>Exclude Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExcludeNamespaces()
     * @generated
     * @ordered
     */
	protected String excludeNamespaces = EXCLUDE_NAMESPACES_EDEFAULT;

	/**
     * The default value of the '{@link #getExcludes() <em>Excludes</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExcludes()
     * @generated
     * @ordered
     */
	protected static final String EXCLUDES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExcludes()
     * @generated
     * @ordered
     */
	protected String excludes = EXCLUDES_EDEFAULT;

	/**
     * The default value of the '{@link #getIncludeNamespaces() <em>Include Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIncludeNamespaces()
     * @generated
     * @ordered
     */
	protected static final String INCLUDE_NAMESPACES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getIncludeNamespaces() <em>Include Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIncludeNamespaces()
     * @generated
     * @ordered
     */
	protected String includeNamespaces = INCLUDE_NAMESPACES_EDEFAULT;

	/**
     * The default value of the '{@link #getIncludes() <em>Includes</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIncludes()
     * @generated
     * @ordered
     */
	protected static final String INCLUDES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getIncludes() <em>Includes</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIncludes()
     * @generated
     * @ordered
     */
	protected String includes = INCLUDES_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ContextMapperTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SwitchyardPackage.Literals.CONTEXT_MAPPER_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getClass_() {
        return class_;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setClass(String newClass) {
        String oldClass = class_;
        class_ = newClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.CONTEXT_MAPPER_TYPE__CLASS, oldClass, class_));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getExcludeNamespaces() {
        return excludeNamespaces;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExcludeNamespaces(String newExcludeNamespaces) {
        String oldExcludeNamespaces = excludeNamespaces;
        excludeNamespaces = newExcludeNamespaces;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES, oldExcludeNamespaces, excludeNamespaces));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getExcludes() {
        return excludes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExcludes(String newExcludes) {
        String oldExcludes = excludes;
        excludes = newExcludes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDES, oldExcludes, excludes));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getIncludeNamespaces() {
        return includeNamespaces;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIncludeNamespaces(String newIncludeNamespaces) {
        String oldIncludeNamespaces = includeNamespaces;
        includeNamespaces = newIncludeNamespaces;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES, oldIncludeNamespaces, includeNamespaces));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getIncludes() {
        return includes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIncludes(String newIncludes) {
        String oldIncludes = includes;
        includes = newIncludes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDES, oldIncludes, includes));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__CLASS:
                return getClass_();
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES:
                return getExcludeNamespaces();
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDES:
                return getExcludes();
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES:
                return getIncludeNamespaces();
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDES:
                return getIncludes();
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
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__CLASS:
                setClass((String)newValue);
                return;
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES:
                setExcludeNamespaces((String)newValue);
                return;
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDES:
                setExcludes((String)newValue);
                return;
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES:
                setIncludeNamespaces((String)newValue);
                return;
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDES:
                setIncludes((String)newValue);
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
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__CLASS:
                setClass(CLASS_EDEFAULT);
                return;
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES:
                setExcludeNamespaces(EXCLUDE_NAMESPACES_EDEFAULT);
                return;
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDES:
                setExcludes(EXCLUDES_EDEFAULT);
                return;
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES:
                setIncludeNamespaces(INCLUDE_NAMESPACES_EDEFAULT);
                return;
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDES:
                setIncludes(INCLUDES_EDEFAULT);
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
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__CLASS:
                return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES:
                return EXCLUDE_NAMESPACES_EDEFAULT == null ? excludeNamespaces != null : !EXCLUDE_NAMESPACES_EDEFAULT.equals(excludeNamespaces);
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDES:
                return EXCLUDES_EDEFAULT == null ? excludes != null : !EXCLUDES_EDEFAULT.equals(excludes);
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES:
                return INCLUDE_NAMESPACES_EDEFAULT == null ? includeNamespaces != null : !INCLUDE_NAMESPACES_EDEFAULT.equals(includeNamespaces);
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDES:
                return INCLUDES_EDEFAULT == null ? includes != null : !INCLUDES_EDEFAULT.equals(includes);
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
        result.append(" (class: ");
        result.append(class_);
        result.append(", excludeNamespaces: ");
        result.append(excludeNamespaces);
        result.append(", excludes: ");
        result.append(excludes);
        result.append(", includeNamespaces: ");
        result.append(includeNamespaces);
        result.append(", includes: ");
        result.append(includes);
        result.append(')');
        return result.toString();
    }

} //ContextMapperTypeImpl
