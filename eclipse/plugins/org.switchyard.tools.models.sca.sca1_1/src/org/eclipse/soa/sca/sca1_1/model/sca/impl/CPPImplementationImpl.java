/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction;
import org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationScope;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPP Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationImpl#isAllowsPassByReference <em>Allows Pass By Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationImpl#isEagerInit <em>Eager Init</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CPPImplementationImpl extends ImplementationImpl implements CPPImplementation {
	/**
     * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFunction()
     * @generated
     * @ordered
     */
	protected EList<CPPImplementationFunction> function;

	/**
     * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAny()
     * @generated
     * @ordered
     */
	protected FeatureMap any;

	/**
     * The default value of the '{@link #isAllowsPassByReference() <em>Allows Pass By Reference</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isAllowsPassByReference()
     * @generated
     * @ordered
     */
	protected static final boolean ALLOWS_PASS_BY_REFERENCE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isAllowsPassByReference() <em>Allows Pass By Reference</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isAllowsPassByReference()
     * @generated
     * @ordered
     */
	protected boolean allowsPassByReference = ALLOWS_PASS_BY_REFERENCE_EDEFAULT;

	/**
     * This is true if the Allows Pass By Reference attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean allowsPassByReferenceESet;

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
     * The default value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getComponentType()
     * @generated
     * @ordered
     */
	protected static final String COMPONENT_TYPE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getComponentType()
     * @generated
     * @ordered
     */
	protected String componentType = COMPONENT_TYPE_EDEFAULT;

	/**
     * The default value of the '{@link #isEagerInit() <em>Eager Init</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isEagerInit()
     * @generated
     * @ordered
     */
	protected static final boolean EAGER_INIT_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isEagerInit() <em>Eager Init</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isEagerInit()
     * @generated
     * @ordered
     */
	protected boolean eagerInit = EAGER_INIT_EDEFAULT;

	/**
     * This is true if the Eager Init attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean eagerInitESet;

	/**
     * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHeader()
     * @generated
     * @ordered
     */
	protected static final String HEADER_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHeader()
     * @generated
     * @ordered
     */
	protected String header = HEADER_EDEFAULT;

	/**
     * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLibrary()
     * @generated
     * @ordered
     */
	protected static final String LIBRARY_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLibrary()
     * @generated
     * @ordered
     */
	protected String library = LIBRARY_EDEFAULT;

	/**
     * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
	protected static final String PATH_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
	protected String path = PATH_EDEFAULT;

	/**
     * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
	protected static final CPPImplementationScope SCOPE_EDEFAULT = CPPImplementationScope.STATELESS;

	/**
     * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
	protected CPPImplementationScope scope = SCOPE_EDEFAULT;

	/**
     * This is true if the Scope attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean scopeESet;

	/**
     * The cached value of the '{@link #getAnyAttribute1() <em>Any Attribute1</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute1()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute1;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CPPImplementationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getCPPImplementation();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CPPImplementationFunction> getFunction() {
        if (function == null) {
            function = new EObjectContainmentEList<CPPImplementationFunction>(CPPImplementationFunction.class, this, ScaPackage.CPP_IMPLEMENTATION__FUNCTION);
        }
        return function;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.CPP_IMPLEMENTATION__ANY);
        }
        return any;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isAllowsPassByReference() {
        return allowsPassByReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAllowsPassByReference(boolean newAllowsPassByReference) {
        boolean oldAllowsPassByReference = allowsPassByReference;
        allowsPassByReference = newAllowsPassByReference;
        boolean oldAllowsPassByReferenceESet = allowsPassByReferenceESet;
        allowsPassByReferenceESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CPP_IMPLEMENTATION__ALLOWS_PASS_BY_REFERENCE, oldAllowsPassByReference, allowsPassByReference, !oldAllowsPassByReferenceESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetAllowsPassByReference() {
        boolean oldAllowsPassByReference = allowsPassByReference;
        boolean oldAllowsPassByReferenceESet = allowsPassByReferenceESet;
        allowsPassByReference = ALLOWS_PASS_BY_REFERENCE_EDEFAULT;
        allowsPassByReferenceESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.CPP_IMPLEMENTATION__ALLOWS_PASS_BY_REFERENCE, oldAllowsPassByReference, ALLOWS_PASS_BY_REFERENCE_EDEFAULT, oldAllowsPassByReferenceESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetAllowsPassByReference() {
        return allowsPassByReferenceESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CPP_IMPLEMENTATION__CLASS, oldClass, class_));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getComponentType() {
        return componentType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setComponentType(String newComponentType) {
        String oldComponentType = componentType;
        componentType = newComponentType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CPP_IMPLEMENTATION__COMPONENT_TYPE, oldComponentType, componentType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isEagerInit() {
        return eagerInit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEagerInit(boolean newEagerInit) {
        boolean oldEagerInit = eagerInit;
        eagerInit = newEagerInit;
        boolean oldEagerInitESet = eagerInitESet;
        eagerInitESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CPP_IMPLEMENTATION__EAGER_INIT, oldEagerInit, eagerInit, !oldEagerInitESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetEagerInit() {
        boolean oldEagerInit = eagerInit;
        boolean oldEagerInitESet = eagerInitESet;
        eagerInit = EAGER_INIT_EDEFAULT;
        eagerInitESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.CPP_IMPLEMENTATION__EAGER_INIT, oldEagerInit, EAGER_INIT_EDEFAULT, oldEagerInitESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetEagerInit() {
        return eagerInitESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getHeader() {
        return header;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHeader(String newHeader) {
        String oldHeader = header;
        header = newHeader;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CPP_IMPLEMENTATION__HEADER, oldHeader, header));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLibrary() {
        return library;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLibrary(String newLibrary) {
        String oldLibrary = library;
        library = newLibrary;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CPP_IMPLEMENTATION__LIBRARY, oldLibrary, library));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPath() {
        return path;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPath(String newPath) {
        String oldPath = path;
        path = newPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CPP_IMPLEMENTATION__PATH, oldPath, path));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CPPImplementationScope getScope() {
        return scope;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setScope(CPPImplementationScope newScope) {
        CPPImplementationScope oldScope = scope;
        scope = newScope == null ? SCOPE_EDEFAULT : newScope;
        boolean oldScopeESet = scopeESet;
        scopeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CPP_IMPLEMENTATION__SCOPE, oldScope, scope, !oldScopeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetScope() {
        CPPImplementationScope oldScope = scope;
        boolean oldScopeESet = scopeESet;
        scope = SCOPE_EDEFAULT;
        scopeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.CPP_IMPLEMENTATION__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetScope() {
        return scopeESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute1() {
        if (anyAttribute1 == null) {
            anyAttribute1 = new BasicFeatureMap(this, ScaPackage.CPP_IMPLEMENTATION__ANY_ATTRIBUTE1);
        }
        return anyAttribute1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.CPP_IMPLEMENTATION__FUNCTION:
                return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
            case ScaPackage.CPP_IMPLEMENTATION__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case ScaPackage.CPP_IMPLEMENTATION__ANY_ATTRIBUTE1:
                return ((InternalEList<?>)getAnyAttribute1()).basicRemove(otherEnd, msgs);
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
            case ScaPackage.CPP_IMPLEMENTATION__FUNCTION:
                return getFunction();
            case ScaPackage.CPP_IMPLEMENTATION__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.CPP_IMPLEMENTATION__ALLOWS_PASS_BY_REFERENCE:
                return isAllowsPassByReference();
            case ScaPackage.CPP_IMPLEMENTATION__CLASS:
                return getClass_();
            case ScaPackage.CPP_IMPLEMENTATION__COMPONENT_TYPE:
                return getComponentType();
            case ScaPackage.CPP_IMPLEMENTATION__EAGER_INIT:
                return isEagerInit();
            case ScaPackage.CPP_IMPLEMENTATION__HEADER:
                return getHeader();
            case ScaPackage.CPP_IMPLEMENTATION__LIBRARY:
                return getLibrary();
            case ScaPackage.CPP_IMPLEMENTATION__PATH:
                return getPath();
            case ScaPackage.CPP_IMPLEMENTATION__SCOPE:
                return getScope();
            case ScaPackage.CPP_IMPLEMENTATION__ANY_ATTRIBUTE1:
                if (coreType) return getAnyAttribute1();
                return ((FeatureMap.Internal)getAnyAttribute1()).getWrapper();
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
            case ScaPackage.CPP_IMPLEMENTATION__FUNCTION:
                getFunction().clear();
                getFunction().addAll((Collection<? extends CPPImplementationFunction>)newValue);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__ALLOWS_PASS_BY_REFERENCE:
                setAllowsPassByReference((Boolean)newValue);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__CLASS:
                setClass((String)newValue);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__COMPONENT_TYPE:
                setComponentType((String)newValue);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__EAGER_INIT:
                setEagerInit((Boolean)newValue);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__HEADER:
                setHeader((String)newValue);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__LIBRARY:
                setLibrary((String)newValue);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__PATH:
                setPath((String)newValue);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__SCOPE:
                setScope((CPPImplementationScope)newValue);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__ANY_ATTRIBUTE1:
                ((FeatureMap.Internal)getAnyAttribute1()).set(newValue);
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
            case ScaPackage.CPP_IMPLEMENTATION__FUNCTION:
                getFunction().clear();
                return;
            case ScaPackage.CPP_IMPLEMENTATION__ANY:
                getAny().clear();
                return;
            case ScaPackage.CPP_IMPLEMENTATION__ALLOWS_PASS_BY_REFERENCE:
                unsetAllowsPassByReference();
                return;
            case ScaPackage.CPP_IMPLEMENTATION__CLASS:
                setClass(CLASS_EDEFAULT);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__COMPONENT_TYPE:
                setComponentType(COMPONENT_TYPE_EDEFAULT);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__EAGER_INIT:
                unsetEagerInit();
                return;
            case ScaPackage.CPP_IMPLEMENTATION__HEADER:
                setHeader(HEADER_EDEFAULT);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__LIBRARY:
                setLibrary(LIBRARY_EDEFAULT);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__PATH:
                setPath(PATH_EDEFAULT);
                return;
            case ScaPackage.CPP_IMPLEMENTATION__SCOPE:
                unsetScope();
                return;
            case ScaPackage.CPP_IMPLEMENTATION__ANY_ATTRIBUTE1:
                getAnyAttribute1().clear();
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
            case ScaPackage.CPP_IMPLEMENTATION__FUNCTION:
                return function != null && !function.isEmpty();
            case ScaPackage.CPP_IMPLEMENTATION__ANY:
                return any != null && !any.isEmpty();
            case ScaPackage.CPP_IMPLEMENTATION__ALLOWS_PASS_BY_REFERENCE:
                return isSetAllowsPassByReference();
            case ScaPackage.CPP_IMPLEMENTATION__CLASS:
                return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
            case ScaPackage.CPP_IMPLEMENTATION__COMPONENT_TYPE:
                return COMPONENT_TYPE_EDEFAULT == null ? componentType != null : !COMPONENT_TYPE_EDEFAULT.equals(componentType);
            case ScaPackage.CPP_IMPLEMENTATION__EAGER_INIT:
                return isSetEagerInit();
            case ScaPackage.CPP_IMPLEMENTATION__HEADER:
                return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
            case ScaPackage.CPP_IMPLEMENTATION__LIBRARY:
                return LIBRARY_EDEFAULT == null ? library != null : !LIBRARY_EDEFAULT.equals(library);
            case ScaPackage.CPP_IMPLEMENTATION__PATH:
                return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
            case ScaPackage.CPP_IMPLEMENTATION__SCOPE:
                return isSetScope();
            case ScaPackage.CPP_IMPLEMENTATION__ANY_ATTRIBUTE1:
                return anyAttribute1 != null && !anyAttribute1.isEmpty();
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
        result.append(" (any: ");
        result.append(any);
        result.append(", allowsPassByReference: ");
        if (allowsPassByReferenceESet) result.append(allowsPassByReference); else result.append("<unset>");
        result.append(", class: ");
        result.append(class_);
        result.append(", componentType: ");
        result.append(componentType);
        result.append(", eagerInit: ");
        if (eagerInitESet) result.append(eagerInit); else result.append("<unset>");
        result.append(", header: ");
        result.append(header);
        result.append(", library: ");
        result.append(library);
        result.append(", path: ");
        result.append(path);
        result.append(", scope: ");
        if (scopeESet) result.append(scope); else result.append("<unset>");
        result.append(", anyAttribute1: ");
        result.append(anyAttribute1);
        result.append(')');
        return result.toString();
    }

} //CPPImplementationImpl
