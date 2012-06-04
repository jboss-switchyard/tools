/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


import org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atom Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelAtomBindingTypeImpl#getFeedURI <em>Feed URI</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelAtomBindingTypeImpl#isSplitEntries <em>Split Entries</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelAtomBindingTypeImpl#isFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelAtomBindingTypeImpl#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelAtomBindingTypeImpl#isThrottleEntries <em>Throttle Entries</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelAtomBindingTypeImpl#isFeedHeader <em>Feed Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelAtomBindingTypeImpl#isSortEntries <em>Sort Entries</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelAtomBindingTypeImpl#getConsume <em>Consume</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelAtomBindingTypeImpl extends BaseCamelBindingImpl implements CamelAtomBindingType {
	/**
     * The default value of the '{@link #getFeedURI() <em>Feed URI</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFeedURI()
     * @generated
     * @ordered
     */
	protected static final String FEED_URI_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getFeedURI() <em>Feed URI</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFeedURI()
     * @generated
     * @ordered
     */
	protected String feedURI = FEED_URI_EDEFAULT;

	/**
     * The default value of the '{@link #isSplitEntries() <em>Split Entries</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSplitEntries()
     * @generated
     * @ordered
     */
	protected static final boolean SPLIT_ENTRIES_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isSplitEntries() <em>Split Entries</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSplitEntries()
     * @generated
     * @ordered
     */
	protected boolean splitEntries = SPLIT_ENTRIES_EDEFAULT;

	/**
     * This is true if the Split Entries attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean splitEntriesESet;

	/**
     * The default value of the '{@link #isFilter() <em>Filter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isFilter()
     * @generated
     * @ordered
     */
	protected static final boolean FILTER_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isFilter() <em>Filter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isFilter()
     * @generated
     * @ordered
     */
	protected boolean filter = FILTER_EDEFAULT;

	/**
     * This is true if the Filter attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean filterESet;

	/**
     * The default value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLastUpdate()
     * @generated
     * @ordered
     */
	protected static final XMLGregorianCalendar LAST_UPDATE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLastUpdate()
     * @generated
     * @ordered
     */
	protected XMLGregorianCalendar lastUpdate = LAST_UPDATE_EDEFAULT;

	/**
     * The default value of the '{@link #isThrottleEntries() <em>Throttle Entries</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isThrottleEntries()
     * @generated
     * @ordered
     */
	protected static final boolean THROTTLE_ENTRIES_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isThrottleEntries() <em>Throttle Entries</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isThrottleEntries()
     * @generated
     * @ordered
     */
	protected boolean throttleEntries = THROTTLE_ENTRIES_EDEFAULT;

	/**
     * This is true if the Throttle Entries attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean throttleEntriesESet;

	/**
     * The default value of the '{@link #isFeedHeader() <em>Feed Header</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isFeedHeader()
     * @generated
     * @ordered
     */
	protected static final boolean FEED_HEADER_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isFeedHeader() <em>Feed Header</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isFeedHeader()
     * @generated
     * @ordered
     */
	protected boolean feedHeader = FEED_HEADER_EDEFAULT;

	/**
     * This is true if the Feed Header attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean feedHeaderESet;

	/**
     * The default value of the '{@link #isSortEntries() <em>Sort Entries</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSortEntries()
     * @generated
     * @ordered
     */
	protected static final boolean SORT_ENTRIES_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isSortEntries() <em>Sort Entries</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSortEntries()
     * @generated
     * @ordered
     */
	protected boolean sortEntries = SORT_ENTRIES_EDEFAULT;

	/**
     * This is true if the Sort Entries attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean sortEntriesESet;

	/**
     * The cached value of the '{@link #getConsume() <em>Consume</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsume()
     * @generated
     * @ordered
     */
    protected ScheduledPollConsumerType consume;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CamelAtomBindingTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return CamelPackage.Literals.CAMEL_ATOM_BINDING_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getFeedURI() {
        return feedURI;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFeedURI(String newFeedURI) {
        String oldFeedURI = feedURI;
        feedURI = newFeedURI;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_ATOM_BINDING_TYPE__FEED_URI, oldFeedURI, feedURI));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSplitEntries() {
        return splitEntries;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSplitEntries(boolean newSplitEntries) {
        boolean oldSplitEntries = splitEntries;
        splitEntries = newSplitEntries;
        boolean oldSplitEntriesESet = splitEntriesESet;
        splitEntriesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES, oldSplitEntries, splitEntries, !oldSplitEntriesESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetSplitEntries() {
        boolean oldSplitEntries = splitEntries;
        boolean oldSplitEntriesESet = splitEntriesESet;
        splitEntries = SPLIT_ENTRIES_EDEFAULT;
        splitEntriesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES, oldSplitEntries, SPLIT_ENTRIES_EDEFAULT, oldSplitEntriesESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetSplitEntries() {
        return splitEntriesESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isFilter() {
        return filter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFilter(boolean newFilter) {
        boolean oldFilter = filter;
        filter = newFilter;
        boolean oldFilterESet = filterESet;
        filterESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_ATOM_BINDING_TYPE__FILTER, oldFilter, filter, !oldFilterESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetFilter() {
        boolean oldFilter = filter;
        boolean oldFilterESet = filterESet;
        filter = FILTER_EDEFAULT;
        filterESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_ATOM_BINDING_TYPE__FILTER, oldFilter, FILTER_EDEFAULT, oldFilterESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetFilter() {
        return filterESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLastUpdate(XMLGregorianCalendar newLastUpdate) {
        XMLGregorianCalendar oldLastUpdate = lastUpdate;
        lastUpdate = newLastUpdate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE, oldLastUpdate, lastUpdate));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isThrottleEntries() {
        return throttleEntries;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setThrottleEntries(boolean newThrottleEntries) {
        boolean oldThrottleEntries = throttleEntries;
        throttleEntries = newThrottleEntries;
        boolean oldThrottleEntriesESet = throttleEntriesESet;
        throttleEntriesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES, oldThrottleEntries, throttleEntries, !oldThrottleEntriesESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetThrottleEntries() {
        boolean oldThrottleEntries = throttleEntries;
        boolean oldThrottleEntriesESet = throttleEntriesESet;
        throttleEntries = THROTTLE_ENTRIES_EDEFAULT;
        throttleEntriesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES, oldThrottleEntries, THROTTLE_ENTRIES_EDEFAULT, oldThrottleEntriesESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetThrottleEntries() {
        return throttleEntriesESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isFeedHeader() {
        return feedHeader;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFeedHeader(boolean newFeedHeader) {
        boolean oldFeedHeader = feedHeader;
        feedHeader = newFeedHeader;
        boolean oldFeedHeaderESet = feedHeaderESet;
        feedHeaderESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_ATOM_BINDING_TYPE__FEED_HEADER, oldFeedHeader, feedHeader, !oldFeedHeaderESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetFeedHeader() {
        boolean oldFeedHeader = feedHeader;
        boolean oldFeedHeaderESet = feedHeaderESet;
        feedHeader = FEED_HEADER_EDEFAULT;
        feedHeaderESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_ATOM_BINDING_TYPE__FEED_HEADER, oldFeedHeader, FEED_HEADER_EDEFAULT, oldFeedHeaderESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetFeedHeader() {
        return feedHeaderESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSortEntries() {
        return sortEntries;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSortEntries(boolean newSortEntries) {
        boolean oldSortEntries = sortEntries;
        sortEntries = newSortEntries;
        boolean oldSortEntriesESet = sortEntriesESet;
        sortEntriesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES, oldSortEntries, sortEntries, !oldSortEntriesESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetSortEntries() {
        boolean oldSortEntries = sortEntries;
        boolean oldSortEntriesESet = sortEntriesESet;
        sortEntries = SORT_ENTRIES_EDEFAULT;
        sortEntriesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES, oldSortEntries, SORT_ENTRIES_EDEFAULT, oldSortEntriesESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetSortEntries() {
        return sortEntriesESet;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScheduledPollConsumerType getConsume() {
        return consume;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConsume(ScheduledPollConsumerType newConsume, NotificationChain msgs) {
        ScheduledPollConsumerType oldConsume = consume;
        consume = newConsume;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME, oldConsume, newConsume);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsume(ScheduledPollConsumerType newConsume) {
        if (newConsume != consume) {
            NotificationChain msgs = null;
            if (consume != null)
                msgs = ((InternalEObject)consume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME, null, msgs);
            if (newConsume != null)
                msgs = ((InternalEObject)newConsume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME, null, msgs);
            msgs = basicSetConsume(newConsume, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME, newConsume, newConsume));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME:
                return basicSetConsume(null, msgs);
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
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FEED_URI:
                return getFeedURI();
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES:
                return isSplitEntries();
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FILTER:
                return isFilter();
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE:
                return getLastUpdate();
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES:
                return isThrottleEntries();
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FEED_HEADER:
                return isFeedHeader();
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES:
                return isSortEntries();
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME:
                return getConsume();
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
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FEED_URI:
                setFeedURI((String)newValue);
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES:
                setSplitEntries((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FILTER:
                setFilter((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE:
                setLastUpdate((XMLGregorianCalendar)newValue);
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES:
                setThrottleEntries((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FEED_HEADER:
                setFeedHeader((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES:
                setSortEntries((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME:
                setConsume((ScheduledPollConsumerType)newValue);
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
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FEED_URI:
                setFeedURI(FEED_URI_EDEFAULT);
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES:
                unsetSplitEntries();
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FILTER:
                unsetFilter();
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE:
                setLastUpdate(LAST_UPDATE_EDEFAULT);
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES:
                unsetThrottleEntries();
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FEED_HEADER:
                unsetFeedHeader();
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES:
                unsetSortEntries();
                return;
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME:
                setConsume((ScheduledPollConsumerType)null);
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
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FEED_URI:
                return FEED_URI_EDEFAULT == null ? feedURI != null : !FEED_URI_EDEFAULT.equals(feedURI);
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES:
                return isSetSplitEntries();
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FILTER:
                return isSetFilter();
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE:
                return LAST_UPDATE_EDEFAULT == null ? lastUpdate != null : !LAST_UPDATE_EDEFAULT.equals(lastUpdate);
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES:
                return isSetThrottleEntries();
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__FEED_HEADER:
                return isSetFeedHeader();
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES:
                return isSetSortEntries();
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME:
                return consume != null;
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
        result.append(" (feedURI: ");
        result.append(feedURI);
        result.append(", splitEntries: ");
        if (splitEntriesESet) result.append(splitEntries); else result.append("<unset>");
        result.append(", filter: ");
        if (filterESet) result.append(filter); else result.append("<unset>");
        result.append(", lastUpdate: ");
        result.append(lastUpdate);
        result.append(", throttleEntries: ");
        if (throttleEntriesESet) result.append(throttleEntries); else result.append("<unset>");
        result.append(", feedHeader: ");
        if (feedHeaderESet) result.append(feedHeader); else result.append("<unset>");
        result.append(", sortEntries: ");
        if (sortEntriesESet) result.append(sortEntries); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    public EStructuralFeature getDocumentFeature() {
        return CamelPackage.eINSTANCE.getDocumentRoot_BindingAtom();
    }

} //CamelAtomBindingTypeImpl
