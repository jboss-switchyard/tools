/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.atom;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Atom Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFeedURI <em>Feed URI</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getSplitEntries <em>Split Entries</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getThrottleEntries <em>Throttle Entries</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFeedHeader <em>Feed Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getSortEntries <em>Sort Entries</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getConsume <em>Consume</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getCamelAtomBindingType()
 * @model extendedMetaData="name='CamelAtomBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelAtomBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Feed URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feed URI</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feed URI</em>' attribute.
     * @see #setFeedURI(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getCamelAtomBindingType_FeedURI()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
     *        extendedMetaData="kind='element' name='feedURI' namespace='##targetNamespace'"
     * @generated
     */
    String getFeedURI();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFeedURI <em>Feed URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feed URI</em>' attribute.
     * @see #getFeedURI()
     * @generated
     */
    void setFeedURI(String value);

    /**
     * Returns the value of the '<em><b>Split Entries</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Split Entries</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Split Entries</em>' attribute.
     * @see #isSetSplitEntries()
     * @see #unsetSplitEntries()
     * @see #setSplitEntries(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getCamelAtomBindingType_SplitEntries()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='splitEntries' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getSplitEntries();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getSplitEntries <em>Split Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Split Entries</em>' attribute.
     * @see #isSetSplitEntries()
     * @see #unsetSplitEntries()
     * @see #getSplitEntries()
     * @generated
     */
    void setSplitEntries(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getSplitEntries <em>Split Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSplitEntries()
     * @see #getSplitEntries()
     * @see #setSplitEntries(Boolean)
     * @generated
     */
    void unsetSplitEntries();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getSplitEntries <em>Split Entries</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Split Entries</em>' attribute is set.
     * @see #unsetSplitEntries()
     * @see #getSplitEntries()
     * @see #setSplitEntries(Boolean)
     * @generated
     */
    boolean isSetSplitEntries();

    /**
     * Returns the value of the '<em><b>Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Filter</em>' attribute.
     * @see #isSetFilter()
     * @see #unsetFilter()
     * @see #setFilter(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getCamelAtomBindingType_Filter()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getFilter();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFilter <em>Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Filter</em>' attribute.
     * @see #isSetFilter()
     * @see #unsetFilter()
     * @see #getFilter()
     * @generated
     */
    void setFilter(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFilter <em>Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFilter()
     * @see #getFilter()
     * @see #setFilter(Boolean)
     * @generated
     */
    void unsetFilter();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFilter <em>Filter</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Filter</em>' attribute is set.
     * @see #unsetFilter()
     * @see #getFilter()
     * @see #setFilter(Boolean)
     * @generated
     */
    boolean isSetFilter();

    /**
     * Returns the value of the '<em><b>Last Update</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Update</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Update</em>' attribute.
     * @see #setLastUpdate(XMLGregorianCalendar)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getCamelAtomBindingType_LastUpdate()
     * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
     *        extendedMetaData="kind='element' name='lastUpdate' namespace='##targetNamespace'"
     * @generated
     */
    XMLGregorianCalendar getLastUpdate();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getLastUpdate <em>Last Update</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Update</em>' attribute.
     * @see #getLastUpdate()
     * @generated
     */
    void setLastUpdate(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>Throttle Entries</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Throttle Entries</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Throttle Entries</em>' attribute.
     * @see #isSetThrottleEntries()
     * @see #unsetThrottleEntries()
     * @see #setThrottleEntries(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getCamelAtomBindingType_ThrottleEntries()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='throttleEntries' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getThrottleEntries();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getThrottleEntries <em>Throttle Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Throttle Entries</em>' attribute.
     * @see #isSetThrottleEntries()
     * @see #unsetThrottleEntries()
     * @see #getThrottleEntries()
     * @generated
     */
    void setThrottleEntries(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getThrottleEntries <em>Throttle Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThrottleEntries()
     * @see #getThrottleEntries()
     * @see #setThrottleEntries(Boolean)
     * @generated
     */
    void unsetThrottleEntries();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getThrottleEntries <em>Throttle Entries</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Throttle Entries</em>' attribute is set.
     * @see #unsetThrottleEntries()
     * @see #getThrottleEntries()
     * @see #setThrottleEntries(Boolean)
     * @generated
     */
    boolean isSetThrottleEntries();

    /**
     * Returns the value of the '<em><b>Feed Header</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feed Header</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feed Header</em>' attribute.
     * @see #isSetFeedHeader()
     * @see #unsetFeedHeader()
     * @see #setFeedHeader(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getCamelAtomBindingType_FeedHeader()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='feedHeader' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getFeedHeader();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFeedHeader <em>Feed Header</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feed Header</em>' attribute.
     * @see #isSetFeedHeader()
     * @see #unsetFeedHeader()
     * @see #getFeedHeader()
     * @generated
     */
    void setFeedHeader(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFeedHeader <em>Feed Header</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFeedHeader()
     * @see #getFeedHeader()
     * @see #setFeedHeader(Boolean)
     * @generated
     */
    void unsetFeedHeader();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFeedHeader <em>Feed Header</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Feed Header</em>' attribute is set.
     * @see #unsetFeedHeader()
     * @see #getFeedHeader()
     * @see #setFeedHeader(Boolean)
     * @generated
     */
    boolean isSetFeedHeader();

    /**
     * Returns the value of the '<em><b>Sort Entries</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sort Entries</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sort Entries</em>' attribute.
     * @see #isSetSortEntries()
     * @see #unsetSortEntries()
     * @see #setSortEntries(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getCamelAtomBindingType_SortEntries()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='sortEntries' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getSortEntries();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getSortEntries <em>Sort Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sort Entries</em>' attribute.
     * @see #isSetSortEntries()
     * @see #unsetSortEntries()
     * @see #getSortEntries()
     * @generated
     */
    void setSortEntries(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getSortEntries <em>Sort Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSortEntries()
     * @see #getSortEntries()
     * @see #setSortEntries(Boolean)
     * @generated
     */
    void unsetSortEntries();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getSortEntries <em>Sort Entries</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sort Entries</em>' attribute is set.
     * @see #unsetSortEntries()
     * @see #getSortEntries()
     * @see #setSortEntries(Boolean)
     * @generated
     */
    boolean isSetSortEntries();

    /**
     * Returns the value of the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consume</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consume</em>' containment reference.
     * @see #setConsume(AtomScheduledPollConsumerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getCamelAtomBindingType_Consume()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='consume' namespace='##targetNamespace'"
     * @generated
     */
    AtomScheduledPollConsumerType getConsume();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getConsume <em>Consume</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consume</em>' containment reference.
     * @see #getConsume()
     * @generated
     */
    void setConsume(AtomScheduledPollConsumerType value);

} // CamelAtomBindingType
