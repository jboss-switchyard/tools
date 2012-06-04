/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.ContributionType;
import org.eclipse.soa.sca.sca1_1.model.sca.DeployableType;
import org.eclipse.soa.sca.sca1_1.model.sca.Export;
import org.eclipse.soa.sca.sca1_1.model.sca.Import;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContributionTypeImpl#getDeployable <em>Deployable</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContributionTypeImpl#getImportBaseGroup <em>Import Base Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContributionTypeImpl#getImportBase <em>Import Base</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContributionTypeImpl#getExportBaseGroup <em>Export Base Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContributionTypeImpl#getExportBase <em>Export Base</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContributionTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContributionTypeImpl extends CommonExtensionBaseImpl implements ContributionType {
	/**
     * The cached value of the '{@link #getDeployable() <em>Deployable</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDeployable()
     * @generated
     * @ordered
     */
	protected EList<DeployableType> deployable;

	/**
     * The cached value of the '{@link #getImportBaseGroup() <em>Import Base Group</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getImportBaseGroup()
     * @generated
     * @ordered
     */
	protected FeatureMap importBaseGroup;

	/**
     * The cached value of the '{@link #getExportBaseGroup() <em>Export Base Group</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExportBaseGroup()
     * @generated
     * @ordered
     */
	protected FeatureMap exportBaseGroup;

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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ContributionTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getContributionType();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<DeployableType> getDeployable() {
        if (deployable == null) {
            deployable = new EObjectContainmentEList<DeployableType>(DeployableType.class, this, ScaPackage.CONTRIBUTION_TYPE__DEPLOYABLE);
        }
        return deployable;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getImportBaseGroup() {
        if (importBaseGroup == null) {
            importBaseGroup = new BasicFeatureMap(this, ScaPackage.CONTRIBUTION_TYPE__IMPORT_BASE_GROUP);
        }
        return importBaseGroup;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Import> getImportBase() {
        return getImportBaseGroup().list(ScaPackage.eINSTANCE.getContributionType_ImportBase());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getExportBaseGroup() {
        if (exportBaseGroup == null) {
            exportBaseGroup = new BasicFeatureMap(this, ScaPackage.CONTRIBUTION_TYPE__EXPORT_BASE_GROUP);
        }
        return exportBaseGroup;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Export> getExportBase() {
        return getExportBaseGroup().list(ScaPackage.eINSTANCE.getContributionType_ExportBase());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.CONTRIBUTION_TYPE__ANY);
        }
        return any;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.CONTRIBUTION_TYPE__DEPLOYABLE:
                return ((InternalEList<?>)getDeployable()).basicRemove(otherEnd, msgs);
            case ScaPackage.CONTRIBUTION_TYPE__IMPORT_BASE_GROUP:
                return ((InternalEList<?>)getImportBaseGroup()).basicRemove(otherEnd, msgs);
            case ScaPackage.CONTRIBUTION_TYPE__IMPORT_BASE:
                return ((InternalEList<?>)getImportBase()).basicRemove(otherEnd, msgs);
            case ScaPackage.CONTRIBUTION_TYPE__EXPORT_BASE_GROUP:
                return ((InternalEList<?>)getExportBaseGroup()).basicRemove(otherEnd, msgs);
            case ScaPackage.CONTRIBUTION_TYPE__EXPORT_BASE:
                return ((InternalEList<?>)getExportBase()).basicRemove(otherEnd, msgs);
            case ScaPackage.CONTRIBUTION_TYPE__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
            case ScaPackage.CONTRIBUTION_TYPE__DEPLOYABLE:
                return getDeployable();
            case ScaPackage.CONTRIBUTION_TYPE__IMPORT_BASE_GROUP:
                if (coreType) return getImportBaseGroup();
                return ((FeatureMap.Internal)getImportBaseGroup()).getWrapper();
            case ScaPackage.CONTRIBUTION_TYPE__IMPORT_BASE:
                return getImportBase();
            case ScaPackage.CONTRIBUTION_TYPE__EXPORT_BASE_GROUP:
                if (coreType) return getExportBaseGroup();
                return ((FeatureMap.Internal)getExportBaseGroup()).getWrapper();
            case ScaPackage.CONTRIBUTION_TYPE__EXPORT_BASE:
                return getExportBase();
            case ScaPackage.CONTRIBUTION_TYPE__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
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
            case ScaPackage.CONTRIBUTION_TYPE__DEPLOYABLE:
                getDeployable().clear();
                getDeployable().addAll((Collection<? extends DeployableType>)newValue);
                return;
            case ScaPackage.CONTRIBUTION_TYPE__IMPORT_BASE_GROUP:
                ((FeatureMap.Internal)getImportBaseGroup()).set(newValue);
                return;
            case ScaPackage.CONTRIBUTION_TYPE__EXPORT_BASE_GROUP:
                ((FeatureMap.Internal)getExportBaseGroup()).set(newValue);
                return;
            case ScaPackage.CONTRIBUTION_TYPE__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
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
            case ScaPackage.CONTRIBUTION_TYPE__DEPLOYABLE:
                getDeployable().clear();
                return;
            case ScaPackage.CONTRIBUTION_TYPE__IMPORT_BASE_GROUP:
                getImportBaseGroup().clear();
                return;
            case ScaPackage.CONTRIBUTION_TYPE__EXPORT_BASE_GROUP:
                getExportBaseGroup().clear();
                return;
            case ScaPackage.CONTRIBUTION_TYPE__ANY:
                getAny().clear();
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
            case ScaPackage.CONTRIBUTION_TYPE__DEPLOYABLE:
                return deployable != null && !deployable.isEmpty();
            case ScaPackage.CONTRIBUTION_TYPE__IMPORT_BASE_GROUP:
                return importBaseGroup != null && !importBaseGroup.isEmpty();
            case ScaPackage.CONTRIBUTION_TYPE__IMPORT_BASE:
                return !getImportBase().isEmpty();
            case ScaPackage.CONTRIBUTION_TYPE__EXPORT_BASE_GROUP:
                return exportBaseGroup != null && !exportBaseGroup.isEmpty();
            case ScaPackage.CONTRIBUTION_TYPE__EXPORT_BASE:
                return !getExportBase().isEmpty();
            case ScaPackage.CONTRIBUTION_TYPE__ANY:
                return any != null && !any.isEmpty();
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
        result.append(" (importBaseGroup: ");
        result.append(importBaseGroup);
        result.append(", exportBaseGroup: ");
        result.append(exportBaseGroup);
        result.append(", any: ");
        result.append(any);
        result.append(')');
        return result.toString();
    }

} //ContributionTypeImpl
