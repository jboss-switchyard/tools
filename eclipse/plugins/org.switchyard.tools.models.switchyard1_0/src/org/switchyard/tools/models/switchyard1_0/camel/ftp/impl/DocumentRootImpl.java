/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.DocumentRootImpl#getBindingFtp <em>Binding Ftp</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.DocumentRootImpl#getBindingFtps <em>Binding Ftps</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.DocumentRootImpl#getBindingSftp <em>Binding Sftp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xSISchemaLocation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FtpPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, FtpPackage.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FtpPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return xMLNSPrefixMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FtpPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelFtpBindingType getBindingFtp() {
        return (CamelFtpBindingType)getMixed().get(FtpPackage.Literals.DOCUMENT_ROOT__BINDING_FTP, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBindingFtp(CamelFtpBindingType newBindingFtp, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(FtpPackage.Literals.DOCUMENT_ROOT__BINDING_FTP, newBindingFtp, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingFtp(CamelFtpBindingType newBindingFtp) {
        ((FeatureMap.Internal)getMixed()).set(FtpPackage.Literals.DOCUMENT_ROOT__BINDING_FTP, newBindingFtp);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelFtpsBindingType getBindingFtps() {
        return (CamelFtpsBindingType)getMixed().get(FtpPackage.Literals.DOCUMENT_ROOT__BINDING_FTPS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBindingFtps(CamelFtpsBindingType newBindingFtps, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(FtpPackage.Literals.DOCUMENT_ROOT__BINDING_FTPS, newBindingFtps, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingFtps(CamelFtpsBindingType newBindingFtps) {
        ((FeatureMap.Internal)getMixed()).set(FtpPackage.Literals.DOCUMENT_ROOT__BINDING_FTPS, newBindingFtps);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSftpBindingType getBindingSftp() {
        return (CamelSftpBindingType)getMixed().get(FtpPackage.Literals.DOCUMENT_ROOT__BINDING_SFTP, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBindingSftp(CamelSftpBindingType newBindingSftp, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(FtpPackage.Literals.DOCUMENT_ROOT__BINDING_SFTP, newBindingSftp, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingSftp(CamelSftpBindingType newBindingSftp) {
        ((FeatureMap.Internal)getMixed()).set(FtpPackage.Literals.DOCUMENT_ROOT__BINDING_SFTP, newBindingSftp);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FtpPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case FtpPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case FtpPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case FtpPackage.DOCUMENT_ROOT__BINDING_FTP:
                return basicSetBindingFtp(null, msgs);
            case FtpPackage.DOCUMENT_ROOT__BINDING_FTPS:
                return basicSetBindingFtps(null, msgs);
            case FtpPackage.DOCUMENT_ROOT__BINDING_SFTP:
                return basicSetBindingSftp(null, msgs);
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
            case FtpPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case FtpPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case FtpPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case FtpPackage.DOCUMENT_ROOT__BINDING_FTP:
                return getBindingFtp();
            case FtpPackage.DOCUMENT_ROOT__BINDING_FTPS:
                return getBindingFtps();
            case FtpPackage.DOCUMENT_ROOT__BINDING_SFTP:
                return getBindingSftp();
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
            case FtpPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case FtpPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case FtpPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case FtpPackage.DOCUMENT_ROOT__BINDING_FTP:
                setBindingFtp((CamelFtpBindingType)newValue);
                return;
            case FtpPackage.DOCUMENT_ROOT__BINDING_FTPS:
                setBindingFtps((CamelFtpsBindingType)newValue);
                return;
            case FtpPackage.DOCUMENT_ROOT__BINDING_SFTP:
                setBindingSftp((CamelSftpBindingType)newValue);
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
            case FtpPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case FtpPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case FtpPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case FtpPackage.DOCUMENT_ROOT__BINDING_FTP:
                setBindingFtp((CamelFtpBindingType)null);
                return;
            case FtpPackage.DOCUMENT_ROOT__BINDING_FTPS:
                setBindingFtps((CamelFtpsBindingType)null);
                return;
            case FtpPackage.DOCUMENT_ROOT__BINDING_SFTP:
                setBindingSftp((CamelSftpBindingType)null);
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
            case FtpPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case FtpPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case FtpPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case FtpPackage.DOCUMENT_ROOT__BINDING_FTP:
                return getBindingFtp() != null;
            case FtpPackage.DOCUMENT_ROOT__BINDING_FTPS:
                return getBindingFtps() != null;
            case FtpPackage.DOCUMENT_ROOT__BINDING_SFTP:
                return getBindingSftp() != null;
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
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
