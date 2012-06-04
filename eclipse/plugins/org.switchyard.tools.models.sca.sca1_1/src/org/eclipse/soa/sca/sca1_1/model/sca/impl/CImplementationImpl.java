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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.CImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction;
import org.eclipse.soa.sca.sca1_1.model.sca.CImplementationScope;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CImplementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationImpl#isAllowsPassByReference <em>Allows Pass By Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationImpl#isDestoy <em>Destoy</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationImpl#isEagerInit <em>Eager Init</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationImpl#isInit <em>Init</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationImpl#isLibrary <em>Library</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CImplementationImpl extends ImplementationImpl implements CImplementation {
	/**
     * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOperation()
     * @generated
     * @ordered
     */
	protected EList<CImplementationFunction> operation;

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
     * The default value of the '{@link #isDestoy() <em>Destoy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDestoy()
     * @generated
     * @ordered
     */
	protected static final boolean DESTOY_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isDestoy() <em>Destoy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDestoy()
     * @generated
     * @ordered
     */
	protected boolean destoy = DESTOY_EDEFAULT;

	/**
     * This is true if the Destoy attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean destoyESet;

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
     * The default value of the '{@link #isInit() <em>Init</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isInit()
     * @generated
     * @ordered
     */
	protected static final boolean INIT_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isInit() <em>Init</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isInit()
     * @generated
     * @ordered
     */
	protected boolean init = INIT_EDEFAULT;

	/**
     * This is true if the Init attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean initESet;

	/**
     * The default value of the '{@link #isLibrary() <em>Library</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isLibrary()
     * @generated
     * @ordered
     */
	protected static final boolean LIBRARY_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isLibrary() <em>Library</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isLibrary()
     * @generated
     * @ordered
     */
	protected boolean library = LIBRARY_EDEFAULT;

	/**
     * This is true if the Library attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean libraryESet;

	/**
     * The default value of the '{@link #getModule() <em>Module</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getModule()
     * @generated
     * @ordered
     */
	protected static final String MODULE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getModule() <em>Module</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getModule()
     * @generated
     * @ordered
     */
	protected String module = MODULE_EDEFAULT;

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
	protected static final CImplementationScope SCOPE_EDEFAULT = CImplementationScope.STATELESS;

	/**
     * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
	protected CImplementationScope scope = SCOPE_EDEFAULT;

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
	protected CImplementationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getCImplementation();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CImplementationFunction> getOperation() {
        if (operation == null) {
            operation = new EObjectContainmentEList<CImplementationFunction>(CImplementationFunction.class, this, ScaPackage.CIMPLEMENTATION__OPERATION);
        }
        return operation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.CIMPLEMENTATION__ANY);
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CIMPLEMENTATION__ALLOWS_PASS_BY_REFERENCE, oldAllowsPassByReference, allowsPassByReference, !oldAllowsPassByReferenceESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.CIMPLEMENTATION__ALLOWS_PASS_BY_REFERENCE, oldAllowsPassByReference, ALLOWS_PASS_BY_REFERENCE_EDEFAULT, oldAllowsPassByReferenceESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CIMPLEMENTATION__COMPONENT_TYPE, oldComponentType, componentType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isDestoy() {
        return destoy;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestoy(boolean newDestoy) {
        boolean oldDestoy = destoy;
        destoy = newDestoy;
        boolean oldDestoyESet = destoyESet;
        destoyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CIMPLEMENTATION__DESTOY, oldDestoy, destoy, !oldDestoyESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetDestoy() {
        boolean oldDestoy = destoy;
        boolean oldDestoyESet = destoyESet;
        destoy = DESTOY_EDEFAULT;
        destoyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.CIMPLEMENTATION__DESTOY, oldDestoy, DESTOY_EDEFAULT, oldDestoyESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetDestoy() {
        return destoyESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CIMPLEMENTATION__EAGER_INIT, oldEagerInit, eagerInit, !oldEagerInitESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.CIMPLEMENTATION__EAGER_INIT, oldEagerInit, EAGER_INIT_EDEFAULT, oldEagerInitESet));
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
	public boolean isInit() {
        return init;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInit(boolean newInit) {
        boolean oldInit = init;
        init = newInit;
        boolean oldInitESet = initESet;
        initESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CIMPLEMENTATION__INIT, oldInit, init, !oldInitESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetInit() {
        boolean oldInit = init;
        boolean oldInitESet = initESet;
        init = INIT_EDEFAULT;
        initESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.CIMPLEMENTATION__INIT, oldInit, INIT_EDEFAULT, oldInitESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetInit() {
        return initESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isLibrary() {
        return library;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLibrary(boolean newLibrary) {
        boolean oldLibrary = library;
        library = newLibrary;
        boolean oldLibraryESet = libraryESet;
        libraryESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CIMPLEMENTATION__LIBRARY, oldLibrary, library, !oldLibraryESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetLibrary() {
        boolean oldLibrary = library;
        boolean oldLibraryESet = libraryESet;
        library = LIBRARY_EDEFAULT;
        libraryESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.CIMPLEMENTATION__LIBRARY, oldLibrary, LIBRARY_EDEFAULT, oldLibraryESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetLibrary() {
        return libraryESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getModule() {
        return module;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setModule(String newModule) {
        String oldModule = module;
        module = newModule;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CIMPLEMENTATION__MODULE, oldModule, module));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CIMPLEMENTATION__PATH, oldPath, path));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CImplementationScope getScope() {
        return scope;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setScope(CImplementationScope newScope) {
        CImplementationScope oldScope = scope;
        scope = newScope == null ? SCOPE_EDEFAULT : newScope;
        boolean oldScopeESet = scopeESet;
        scopeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CIMPLEMENTATION__SCOPE, oldScope, scope, !oldScopeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetScope() {
        CImplementationScope oldScope = scope;
        boolean oldScopeESet = scopeESet;
        scope = SCOPE_EDEFAULT;
        scopeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.CIMPLEMENTATION__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
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
            anyAttribute1 = new BasicFeatureMap(this, ScaPackage.CIMPLEMENTATION__ANY_ATTRIBUTE1);
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
            case ScaPackage.CIMPLEMENTATION__OPERATION:
                return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
            case ScaPackage.CIMPLEMENTATION__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case ScaPackage.CIMPLEMENTATION__ANY_ATTRIBUTE1:
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
            case ScaPackage.CIMPLEMENTATION__OPERATION:
                return getOperation();
            case ScaPackage.CIMPLEMENTATION__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.CIMPLEMENTATION__ALLOWS_PASS_BY_REFERENCE:
                return isAllowsPassByReference();
            case ScaPackage.CIMPLEMENTATION__COMPONENT_TYPE:
                return getComponentType();
            case ScaPackage.CIMPLEMENTATION__DESTOY:
                return isDestoy();
            case ScaPackage.CIMPLEMENTATION__EAGER_INIT:
                return isEagerInit();
            case ScaPackage.CIMPLEMENTATION__INIT:
                return isInit();
            case ScaPackage.CIMPLEMENTATION__LIBRARY:
                return isLibrary();
            case ScaPackage.CIMPLEMENTATION__MODULE:
                return getModule();
            case ScaPackage.CIMPLEMENTATION__PATH:
                return getPath();
            case ScaPackage.CIMPLEMENTATION__SCOPE:
                return getScope();
            case ScaPackage.CIMPLEMENTATION__ANY_ATTRIBUTE1:
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
            case ScaPackage.CIMPLEMENTATION__OPERATION:
                getOperation().clear();
                getOperation().addAll((Collection<? extends CImplementationFunction>)newValue);
                return;
            case ScaPackage.CIMPLEMENTATION__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.CIMPLEMENTATION__ALLOWS_PASS_BY_REFERENCE:
                setAllowsPassByReference((Boolean)newValue);
                return;
            case ScaPackage.CIMPLEMENTATION__COMPONENT_TYPE:
                setComponentType((String)newValue);
                return;
            case ScaPackage.CIMPLEMENTATION__DESTOY:
                setDestoy((Boolean)newValue);
                return;
            case ScaPackage.CIMPLEMENTATION__EAGER_INIT:
                setEagerInit((Boolean)newValue);
                return;
            case ScaPackage.CIMPLEMENTATION__INIT:
                setInit((Boolean)newValue);
                return;
            case ScaPackage.CIMPLEMENTATION__LIBRARY:
                setLibrary((Boolean)newValue);
                return;
            case ScaPackage.CIMPLEMENTATION__MODULE:
                setModule((String)newValue);
                return;
            case ScaPackage.CIMPLEMENTATION__PATH:
                setPath((String)newValue);
                return;
            case ScaPackage.CIMPLEMENTATION__SCOPE:
                setScope((CImplementationScope)newValue);
                return;
            case ScaPackage.CIMPLEMENTATION__ANY_ATTRIBUTE1:
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
            case ScaPackage.CIMPLEMENTATION__OPERATION:
                getOperation().clear();
                return;
            case ScaPackage.CIMPLEMENTATION__ANY:
                getAny().clear();
                return;
            case ScaPackage.CIMPLEMENTATION__ALLOWS_PASS_BY_REFERENCE:
                unsetAllowsPassByReference();
                return;
            case ScaPackage.CIMPLEMENTATION__COMPONENT_TYPE:
                setComponentType(COMPONENT_TYPE_EDEFAULT);
                return;
            case ScaPackage.CIMPLEMENTATION__DESTOY:
                unsetDestoy();
                return;
            case ScaPackage.CIMPLEMENTATION__EAGER_INIT:
                unsetEagerInit();
                return;
            case ScaPackage.CIMPLEMENTATION__INIT:
                unsetInit();
                return;
            case ScaPackage.CIMPLEMENTATION__LIBRARY:
                unsetLibrary();
                return;
            case ScaPackage.CIMPLEMENTATION__MODULE:
                setModule(MODULE_EDEFAULT);
                return;
            case ScaPackage.CIMPLEMENTATION__PATH:
                setPath(PATH_EDEFAULT);
                return;
            case ScaPackage.CIMPLEMENTATION__SCOPE:
                unsetScope();
                return;
            case ScaPackage.CIMPLEMENTATION__ANY_ATTRIBUTE1:
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
            case ScaPackage.CIMPLEMENTATION__OPERATION:
                return operation != null && !operation.isEmpty();
            case ScaPackage.CIMPLEMENTATION__ANY:
                return any != null && !any.isEmpty();
            case ScaPackage.CIMPLEMENTATION__ALLOWS_PASS_BY_REFERENCE:
                return isSetAllowsPassByReference();
            case ScaPackage.CIMPLEMENTATION__COMPONENT_TYPE:
                return COMPONENT_TYPE_EDEFAULT == null ? componentType != null : !COMPONENT_TYPE_EDEFAULT.equals(componentType);
            case ScaPackage.CIMPLEMENTATION__DESTOY:
                return isSetDestoy();
            case ScaPackage.CIMPLEMENTATION__EAGER_INIT:
                return isSetEagerInit();
            case ScaPackage.CIMPLEMENTATION__INIT:
                return isSetInit();
            case ScaPackage.CIMPLEMENTATION__LIBRARY:
                return isSetLibrary();
            case ScaPackage.CIMPLEMENTATION__MODULE:
                return MODULE_EDEFAULT == null ? module != null : !MODULE_EDEFAULT.equals(module);
            case ScaPackage.CIMPLEMENTATION__PATH:
                return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
            case ScaPackage.CIMPLEMENTATION__SCOPE:
                return isSetScope();
            case ScaPackage.CIMPLEMENTATION__ANY_ATTRIBUTE1:
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
        result.append(", componentType: ");
        result.append(componentType);
        result.append(", destoy: ");
        if (destoyESet) result.append(destoy); else result.append("<unset>");
        result.append(", eagerInit: ");
        if (eagerInitESet) result.append(eagerInit); else result.append("<unset>");
        result.append(", init: ");
        if (initESet) result.append(init); else result.append("<unset>");
        result.append(", library: ");
        if (libraryESet) result.append(library); else result.append("<unset>");
        result.append(", module: ");
        result.append(module);
        result.append(", path: ");
        result.append(path);
        result.append(", scope: ");
        if (scopeESet) result.append(scope); else result.append("<unset>");
        result.append(", anyAttribute1: ");
        result.append(anyAttribute1);
        result.append(')');
        return result.toString();
    }

    @Override
    public EStructuralFeature getDocumentFeature() {
        return ScaPackage.eINSTANCE.getDocumentRoot_ImplementationC();
    }

} //CImplementationImpl
