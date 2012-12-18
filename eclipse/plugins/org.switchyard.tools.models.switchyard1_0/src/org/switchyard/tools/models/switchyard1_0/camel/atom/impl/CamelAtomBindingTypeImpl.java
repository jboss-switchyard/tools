/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.atom.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage;
import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Atom Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.CamelAtomBindingTypeImpl#getFeedURI <em>Feed URI</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.CamelAtomBindingTypeImpl#getSplitEntries <em>Split Entries</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.CamelAtomBindingTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.CamelAtomBindingTypeImpl#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.CamelAtomBindingTypeImpl#getThrottleEntries <em>Throttle Entries</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.CamelAtomBindingTypeImpl#getFeedHeader <em>Feed Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.CamelAtomBindingTypeImpl#getSortEntries <em>Sort Entries</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.CamelAtomBindingTypeImpl#getConsume <em>Consume</em>}</li>
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
     * The default value of the '{@link #getSplitEntries() <em>Split Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSplitEntries()
     * @generated
     * @ordered
     */
    protected static final Boolean SPLIT_ENTRIES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSplitEntries() <em>Split Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSplitEntries()
     * @generated
     * @ordered
     */
    protected Boolean splitEntries = SPLIT_ENTRIES_EDEFAULT;

    /**
     * This is true if the Split Entries attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean splitEntriesESet;

    /**
     * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilter()
     * @generated
     * @ordered
     */
    protected static final Boolean FILTER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilter()
     * @generated
     * @ordered
     */
    protected Boolean filter = FILTER_EDEFAULT;

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
     * The default value of the '{@link #getThrottleEntries() <em>Throttle Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThrottleEntries()
     * @generated
     * @ordered
     */
    protected static final Boolean THROTTLE_ENTRIES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThrottleEntries() <em>Throttle Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThrottleEntries()
     * @generated
     * @ordered
     */
    protected Boolean throttleEntries = THROTTLE_ENTRIES_EDEFAULT;

    /**
     * This is true if the Throttle Entries attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean throttleEntriesESet;

    /**
     * The default value of the '{@link #getFeedHeader() <em>Feed Header</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeedHeader()
     * @generated
     * @ordered
     */
    protected static final Boolean FEED_HEADER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFeedHeader() <em>Feed Header</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeedHeader()
     * @generated
     * @ordered
     */
    protected Boolean feedHeader = FEED_HEADER_EDEFAULT;

    /**
     * This is true if the Feed Header attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean feedHeaderESet;

    /**
     * The default value of the '{@link #getSortEntries() <em>Sort Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSortEntries()
     * @generated
     * @ordered
     */
    protected static final Boolean SORT_ENTRIES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSortEntries() <em>Sort Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSortEntries()
     * @generated
     * @ordered
     */
    protected Boolean sortEntries = SORT_ENTRIES_EDEFAULT;

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
    protected AtomScheduledPollConsumerType consume;

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
        return AtomPackage.Literals.CAMEL_ATOM_BINDING_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.CAMEL_ATOM_BINDING_TYPE__FEED_URI, oldFeedURI, feedURI));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getSplitEntries() {
        return splitEntries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSplitEntries(Boolean newSplitEntries) {
        Boolean oldSplitEntries = splitEntries;
        splitEntries = newSplitEntries;
        boolean oldSplitEntriesESet = splitEntriesESet;
        splitEntriesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES, oldSplitEntries, splitEntries, !oldSplitEntriesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSplitEntries() {
        Boolean oldSplitEntries = splitEntries;
        boolean oldSplitEntriesESet = splitEntriesESet;
        splitEntries = SPLIT_ENTRIES_EDEFAULT;
        splitEntriesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, AtomPackage.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES, oldSplitEntries, SPLIT_ENTRIES_EDEFAULT, oldSplitEntriesESet));
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
    public Boolean getFilter() {
        return filter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFilter(Boolean newFilter) {
        Boolean oldFilter = filter;
        filter = newFilter;
        boolean oldFilterESet = filterESet;
        filterESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.CAMEL_ATOM_BINDING_TYPE__FILTER, oldFilter, filter, !oldFilterESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFilter() {
        Boolean oldFilter = filter;
        boolean oldFilterESet = filterESet;
        filter = FILTER_EDEFAULT;
        filterESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, AtomPackage.CAMEL_ATOM_BINDING_TYPE__FILTER, oldFilter, FILTER_EDEFAULT, oldFilterESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE, oldLastUpdate, lastUpdate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getThrottleEntries() {
        return throttleEntries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setThrottleEntries(Boolean newThrottleEntries) {
        Boolean oldThrottleEntries = throttleEntries;
        throttleEntries = newThrottleEntries;
        boolean oldThrottleEntriesESet = throttleEntriesESet;
        throttleEntriesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES, oldThrottleEntries, throttleEntries, !oldThrottleEntriesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetThrottleEntries() {
        Boolean oldThrottleEntries = throttleEntries;
        boolean oldThrottleEntriesESet = throttleEntriesESet;
        throttleEntries = THROTTLE_ENTRIES_EDEFAULT;
        throttleEntriesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, AtomPackage.CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES, oldThrottleEntries, THROTTLE_ENTRIES_EDEFAULT, oldThrottleEntriesESet));
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
    public Boolean getFeedHeader() {
        return feedHeader;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFeedHeader(Boolean newFeedHeader) {
        Boolean oldFeedHeader = feedHeader;
        feedHeader = newFeedHeader;
        boolean oldFeedHeaderESet = feedHeaderESet;
        feedHeaderESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.CAMEL_ATOM_BINDING_TYPE__FEED_HEADER, oldFeedHeader, feedHeader, !oldFeedHeaderESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFeedHeader() {
        Boolean oldFeedHeader = feedHeader;
        boolean oldFeedHeaderESet = feedHeaderESet;
        feedHeader = FEED_HEADER_EDEFAULT;
        feedHeaderESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, AtomPackage.CAMEL_ATOM_BINDING_TYPE__FEED_HEADER, oldFeedHeader, FEED_HEADER_EDEFAULT, oldFeedHeaderESet));
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
    public Boolean getSortEntries() {
        return sortEntries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSortEntries(Boolean newSortEntries) {
        Boolean oldSortEntries = sortEntries;
        sortEntries = newSortEntries;
        boolean oldSortEntriesESet = sortEntriesESet;
        sortEntriesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES, oldSortEntries, sortEntries, !oldSortEntriesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSortEntries() {
        Boolean oldSortEntries = sortEntries;
        boolean oldSortEntriesESet = sortEntriesESet;
        sortEntries = SORT_ENTRIES_EDEFAULT;
        sortEntriesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, AtomPackage.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES, oldSortEntries, SORT_ENTRIES_EDEFAULT, oldSortEntriesESet));
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
    public AtomScheduledPollConsumerType getConsume() {
        return consume;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConsume(AtomScheduledPollConsumerType newConsume, NotificationChain msgs) {
        AtomScheduledPollConsumerType oldConsume = consume;
        consume = newConsume;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtomPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME, oldConsume, newConsume);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsume(AtomScheduledPollConsumerType newConsume) {
        if (newConsume != consume) {
            NotificationChain msgs = null;
            if (consume != null)
                msgs = ((InternalEObject)consume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtomPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME, null, msgs);
            if (newConsume != null)
                msgs = ((InternalEObject)newConsume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtomPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME, null, msgs);
            msgs = basicSetConsume(newConsume, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME, newConsume, newConsume));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME:
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
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__FEED_URI:
                return getFeedURI();
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES:
                return getSplitEntries();
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__FILTER:
                return getFilter();
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE:
                return getLastUpdate();
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES:
                return getThrottleEntries();
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__FEED_HEADER:
                return getFeedHeader();
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES:
                return getSortEntries();
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME:
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
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__FEED_URI:
                setFeedURI((String)newValue);
                return;
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES:
                setSplitEntries((Boolean)newValue);
                return;
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__FILTER:
                setFilter((Boolean)newValue);
                return;
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE:
                setLastUpdate((XMLGregorianCalendar)newValue);
                return;
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES:
                setThrottleEntries((Boolean)newValue);
                return;
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__FEED_HEADER:
                setFeedHeader((Boolean)newValue);
                return;
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES:
                setSortEntries((Boolean)newValue);
                return;
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME:
                setConsume((AtomScheduledPollConsumerType)newValue);
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
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__FEED_URI:
                setFeedURI(FEED_URI_EDEFAULT);
                return;
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES:
                unsetSplitEntries();
                return;
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__FILTER:
                unsetFilter();
                return;
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE:
                setLastUpdate(LAST_UPDATE_EDEFAULT);
                return;
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES:
                unsetThrottleEntries();
                return;
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__FEED_HEADER:
                unsetFeedHeader();
                return;
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES:
                unsetSortEntries();
                return;
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME:
                setConsume((AtomScheduledPollConsumerType)null);
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
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__FEED_URI:
                return FEED_URI_EDEFAULT == null ? feedURI != null : !FEED_URI_EDEFAULT.equals(feedURI);
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES:
                return isSetSplitEntries();
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__FILTER:
                return isSetFilter();
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE:
                return LAST_UPDATE_EDEFAULT == null ? lastUpdate != null : !LAST_UPDATE_EDEFAULT.equals(lastUpdate);
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES:
                return isSetThrottleEntries();
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__FEED_HEADER:
                return isSetFeedHeader();
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES:
                return isSetSortEntries();
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE__CONSUME:
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

} //CamelAtomBindingTypeImpl
