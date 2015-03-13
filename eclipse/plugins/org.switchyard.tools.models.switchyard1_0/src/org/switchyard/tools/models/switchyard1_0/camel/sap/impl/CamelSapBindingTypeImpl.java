/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcServerType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcServerType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Sap Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl#getIdoclistServer <em>Idoclist Server</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl#getSrfcServer <em>Srfc Server</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl#getTrfcServer <em>Trfc Server</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl#getIdocDestination <em>Idoc Destination</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl#getIdoclistDestination <em>Idoclist Destination</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl#getQidocDestination <em>Qidoc Destination</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl#getQidoclistDestination <em>Qidoclist Destination</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl#getQrfcDestination <em>Qrfc Destination</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl#getSrfcDestination <em>Srfc Destination</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl#getTrfcDestination <em>Trfc Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelSapBindingTypeImpl extends BaseCamelBindingImpl implements CamelSapBindingType {
    /**
     * The cached value of the '{@link #getIdoclistServer() <em>Idoclist Server</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdoclistServer()
     * @generated
     * @ordered
     */
    protected CamelSapIDocListServerType idoclistServer;

    /**
     * The cached value of the '{@link #getSrfcServer() <em>Srfc Server</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrfcServer()
     * @generated
     * @ordered
     */
    protected CamelSapSRfcServerType srfcServer;

    /**
     * The cached value of the '{@link #getTrfcServer() <em>Trfc Server</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrfcServer()
     * @generated
     * @ordered
     */
    protected CamelSapTRfcServerType trfcServer;

    /**
     * The cached value of the '{@link #getIdocDestination() <em>Idoc Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdocDestination()
     * @generated
     * @ordered
     */
    protected CamelSapIDocDestinationType idocDestination;

    /**
     * The cached value of the '{@link #getIdoclistDestination() <em>Idoclist Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdoclistDestination()
     * @generated
     * @ordered
     */
    protected CamelSapIDocListDestinationType idoclistDestination;

    /**
     * The cached value of the '{@link #getQidocDestination() <em>Qidoc Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQidocDestination()
     * @generated
     * @ordered
     */
    protected CamelSapQIDocDestinationType qidocDestination;

    /**
     * The cached value of the '{@link #getQidoclistDestination() <em>Qidoclist Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQidoclistDestination()
     * @generated
     * @ordered
     */
    protected CamelSapQIDocListDestinationType qidoclistDestination;

    /**
     * The cached value of the '{@link #getQrfcDestination() <em>Qrfc Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQrfcDestination()
     * @generated
     * @ordered
     */
    protected CamelSapQRfcDestinationType qrfcDestination;

    /**
     * The cached value of the '{@link #getSrfcDestination() <em>Srfc Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrfcDestination()
     * @generated
     * @ordered
     */
    protected CamelSapSRfcDestinationType srfcDestination;

    /**
     * The cached value of the '{@link #getTrfcDestination() <em>Trfc Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrfcDestination()
     * @generated
     * @ordered
     */
    protected CamelSapTRfcDestinationType trfcDestination;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelSapBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SapPackage.Literals.CAMEL_SAP_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapIDocListServerType getIdoclistServer() {
        return idoclistServer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIdoclistServer(CamelSapIDocListServerType newIdoclistServer, NotificationChain msgs) {
        CamelSapIDocListServerType oldIdoclistServer = idoclistServer;
        idoclistServer = newIdoclistServer;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER, oldIdoclistServer, newIdoclistServer);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdoclistServer(CamelSapIDocListServerType newIdoclistServer) {
        if (newIdoclistServer != idoclistServer) {
            NotificationChain msgs = null;
            if (idoclistServer != null)
                msgs = ((InternalEObject)idoclistServer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER, null, msgs);
            if (newIdoclistServer != null)
                msgs = ((InternalEObject)newIdoclistServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER, null, msgs);
            msgs = basicSetIdoclistServer(newIdoclistServer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER, newIdoclistServer, newIdoclistServer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapSRfcServerType getSrfcServer() {
        return srfcServer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSrfcServer(CamelSapSRfcServerType newSrfcServer, NotificationChain msgs) {
        CamelSapSRfcServerType oldSrfcServer = srfcServer;
        srfcServer = newSrfcServer;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_SERVER, oldSrfcServer, newSrfcServer);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSrfcServer(CamelSapSRfcServerType newSrfcServer) {
        if (newSrfcServer != srfcServer) {
            NotificationChain msgs = null;
            if (srfcServer != null)
                msgs = ((InternalEObject)srfcServer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_SERVER, null, msgs);
            if (newSrfcServer != null)
                msgs = ((InternalEObject)newSrfcServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_SERVER, null, msgs);
            msgs = basicSetSrfcServer(newSrfcServer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_SERVER, newSrfcServer, newSrfcServer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapTRfcServerType getTrfcServer() {
        return trfcServer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTrfcServer(CamelSapTRfcServerType newTrfcServer, NotificationChain msgs) {
        CamelSapTRfcServerType oldTrfcServer = trfcServer;
        trfcServer = newTrfcServer;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_SERVER, oldTrfcServer, newTrfcServer);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrfcServer(CamelSapTRfcServerType newTrfcServer) {
        if (newTrfcServer != trfcServer) {
            NotificationChain msgs = null;
            if (trfcServer != null)
                msgs = ((InternalEObject)trfcServer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_SERVER, null, msgs);
            if (newTrfcServer != null)
                msgs = ((InternalEObject)newTrfcServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_SERVER, null, msgs);
            msgs = basicSetTrfcServer(newTrfcServer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_SERVER, newTrfcServer, newTrfcServer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapIDocDestinationType getIdocDestination() {
        return idocDestination;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIdocDestination(CamelSapIDocDestinationType newIdocDestination, NotificationChain msgs) {
        CamelSapIDocDestinationType oldIdocDestination = idocDestination;
        idocDestination = newIdocDestination;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION, oldIdocDestination, newIdocDestination);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdocDestination(CamelSapIDocDestinationType newIdocDestination) {
        if (newIdocDestination != idocDestination) {
            NotificationChain msgs = null;
            if (idocDestination != null)
                msgs = ((InternalEObject)idocDestination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION, null, msgs);
            if (newIdocDestination != null)
                msgs = ((InternalEObject)newIdocDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION, null, msgs);
            msgs = basicSetIdocDestination(newIdocDestination, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION, newIdocDestination, newIdocDestination));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapIDocListDestinationType getIdoclistDestination() {
        return idoclistDestination;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIdoclistDestination(CamelSapIDocListDestinationType newIdoclistDestination, NotificationChain msgs) {
        CamelSapIDocListDestinationType oldIdoclistDestination = idoclistDestination;
        idoclistDestination = newIdoclistDestination;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION, oldIdoclistDestination, newIdoclistDestination);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdoclistDestination(CamelSapIDocListDestinationType newIdoclistDestination) {
        if (newIdoclistDestination != idoclistDestination) {
            NotificationChain msgs = null;
            if (idoclistDestination != null)
                msgs = ((InternalEObject)idoclistDestination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION, null, msgs);
            if (newIdoclistDestination != null)
                msgs = ((InternalEObject)newIdoclistDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION, null, msgs);
            msgs = basicSetIdoclistDestination(newIdoclistDestination, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION, newIdoclistDestination, newIdoclistDestination));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapQIDocDestinationType getQidocDestination() {
        return qidocDestination;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetQidocDestination(CamelSapQIDocDestinationType newQidocDestination, NotificationChain msgs) {
        CamelSapQIDocDestinationType oldQidocDestination = qidocDestination;
        qidocDestination = newQidocDestination;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION, oldQidocDestination, newQidocDestination);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setQidocDestination(CamelSapQIDocDestinationType newQidocDestination) {
        if (newQidocDestination != qidocDestination) {
            NotificationChain msgs = null;
            if (qidocDestination != null)
                msgs = ((InternalEObject)qidocDestination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION, null, msgs);
            if (newQidocDestination != null)
                msgs = ((InternalEObject)newQidocDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION, null, msgs);
            msgs = basicSetQidocDestination(newQidocDestination, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION, newQidocDestination, newQidocDestination));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapQIDocListDestinationType getQidoclistDestination() {
        return qidoclistDestination;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetQidoclistDestination(CamelSapQIDocListDestinationType newQidoclistDestination, NotificationChain msgs) {
        CamelSapQIDocListDestinationType oldQidoclistDestination = qidoclistDestination;
        qidoclistDestination = newQidoclistDestination;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION, oldQidoclistDestination, newQidoclistDestination);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setQidoclistDestination(CamelSapQIDocListDestinationType newQidoclistDestination) {
        if (newQidoclistDestination != qidoclistDestination) {
            NotificationChain msgs = null;
            if (qidoclistDestination != null)
                msgs = ((InternalEObject)qidoclistDestination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION, null, msgs);
            if (newQidoclistDestination != null)
                msgs = ((InternalEObject)newQidoclistDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION, null, msgs);
            msgs = basicSetQidoclistDestination(newQidoclistDestination, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION, newQidoclistDestination, newQidoclistDestination));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapQRfcDestinationType getQrfcDestination() {
        return qrfcDestination;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetQrfcDestination(CamelSapQRfcDestinationType newQrfcDestination, NotificationChain msgs) {
        CamelSapQRfcDestinationType oldQrfcDestination = qrfcDestination;
        qrfcDestination = newQrfcDestination;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION, oldQrfcDestination, newQrfcDestination);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setQrfcDestination(CamelSapQRfcDestinationType newQrfcDestination) {
        if (newQrfcDestination != qrfcDestination) {
            NotificationChain msgs = null;
            if (qrfcDestination != null)
                msgs = ((InternalEObject)qrfcDestination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION, null, msgs);
            if (newQrfcDestination != null)
                msgs = ((InternalEObject)newQrfcDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION, null, msgs);
            msgs = basicSetQrfcDestination(newQrfcDestination, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION, newQrfcDestination, newQrfcDestination));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapSRfcDestinationType getSrfcDestination() {
        return srfcDestination;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSrfcDestination(CamelSapSRfcDestinationType newSrfcDestination, NotificationChain msgs) {
        CamelSapSRfcDestinationType oldSrfcDestination = srfcDestination;
        srfcDestination = newSrfcDestination;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION, oldSrfcDestination, newSrfcDestination);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSrfcDestination(CamelSapSRfcDestinationType newSrfcDestination) {
        if (newSrfcDestination != srfcDestination) {
            NotificationChain msgs = null;
            if (srfcDestination != null)
                msgs = ((InternalEObject)srfcDestination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION, null, msgs);
            if (newSrfcDestination != null)
                msgs = ((InternalEObject)newSrfcDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION, null, msgs);
            msgs = basicSetSrfcDestination(newSrfcDestination, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION, newSrfcDestination, newSrfcDestination));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapTRfcDestinationType getTrfcDestination() {
        return trfcDestination;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTrfcDestination(CamelSapTRfcDestinationType newTrfcDestination, NotificationChain msgs) {
        CamelSapTRfcDestinationType oldTrfcDestination = trfcDestination;
        trfcDestination = newTrfcDestination;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION, oldTrfcDestination, newTrfcDestination);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrfcDestination(CamelSapTRfcDestinationType newTrfcDestination) {
        if (newTrfcDestination != trfcDestination) {
            NotificationChain msgs = null;
            if (trfcDestination != null)
                msgs = ((InternalEObject)trfcDestination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION, null, msgs);
            if (newTrfcDestination != null)
                msgs = ((InternalEObject)newTrfcDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION, null, msgs);
            msgs = basicSetTrfcDestination(newTrfcDestination, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION, newTrfcDestination, newTrfcDestination));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER:
                return basicSetIdoclistServer(null, msgs);
            case SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_SERVER:
                return basicSetSrfcServer(null, msgs);
            case SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_SERVER:
                return basicSetTrfcServer(null, msgs);
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION:
                return basicSetIdocDestination(null, msgs);
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION:
                return basicSetIdoclistDestination(null, msgs);
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION:
                return basicSetQidocDestination(null, msgs);
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION:
                return basicSetQidoclistDestination(null, msgs);
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION:
                return basicSetQrfcDestination(null, msgs);
            case SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION:
                return basicSetSrfcDestination(null, msgs);
            case SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION:
                return basicSetTrfcDestination(null, msgs);
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
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER:
                return getIdoclistServer();
            case SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_SERVER:
                return getSrfcServer();
            case SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_SERVER:
                return getTrfcServer();
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION:
                return getIdocDestination();
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION:
                return getIdoclistDestination();
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION:
                return getQidocDestination();
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION:
                return getQidoclistDestination();
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION:
                return getQrfcDestination();
            case SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION:
                return getSrfcDestination();
            case SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION:
                return getTrfcDestination();
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
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER:
                setIdoclistServer((CamelSapIDocListServerType)newValue);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_SERVER:
                setSrfcServer((CamelSapSRfcServerType)newValue);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_SERVER:
                setTrfcServer((CamelSapTRfcServerType)newValue);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION:
                setIdocDestination((CamelSapIDocDestinationType)newValue);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION:
                setIdoclistDestination((CamelSapIDocListDestinationType)newValue);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION:
                setQidocDestination((CamelSapQIDocDestinationType)newValue);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION:
                setQidoclistDestination((CamelSapQIDocListDestinationType)newValue);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION:
                setQrfcDestination((CamelSapQRfcDestinationType)newValue);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION:
                setSrfcDestination((CamelSapSRfcDestinationType)newValue);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION:
                setTrfcDestination((CamelSapTRfcDestinationType)newValue);
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
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER:
                setIdoclistServer((CamelSapIDocListServerType)null);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_SERVER:
                setSrfcServer((CamelSapSRfcServerType)null);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_SERVER:
                setTrfcServer((CamelSapTRfcServerType)null);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION:
                setIdocDestination((CamelSapIDocDestinationType)null);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION:
                setIdoclistDestination((CamelSapIDocListDestinationType)null);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION:
                setQidocDestination((CamelSapQIDocDestinationType)null);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION:
                setQidoclistDestination((CamelSapQIDocListDestinationType)null);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION:
                setQrfcDestination((CamelSapQRfcDestinationType)null);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION:
                setSrfcDestination((CamelSapSRfcDestinationType)null);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION:
                setTrfcDestination((CamelSapTRfcDestinationType)null);
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
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER:
                return idoclistServer != null;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_SERVER:
                return srfcServer != null;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_SERVER:
                return trfcServer != null;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION:
                return idocDestination != null;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION:
                return idoclistDestination != null;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION:
                return qidocDestination != null;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION:
                return qidoclistDestination != null;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION:
                return qrfcDestination != null;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION:
                return srfcDestination != null;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION:
                return trfcDestination != null;
        }
        return super.eIsSet(featureID);
    }

} //CamelSapBindingTypeImpl
