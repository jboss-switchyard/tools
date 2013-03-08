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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isSplitEntries <em>Split Entries</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isThrottleEntries <em>Throttle Entries</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isFeedHeader <em>Feed Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isSortEntries <em>Sort Entries</em>}</li>
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
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
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
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Split Entries</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Split Entries</em>' attribute.
     * @see #isSetSplitEntries()
     * @see #unsetSplitEntries()
     * @see #setSplitEntries(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getCamelAtomBindingType_SplitEntries()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='splitEntries' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSplitEntries();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isSplitEntries <em>Split Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Split Entries</em>' attribute.
     * @see #isSetSplitEntries()
     * @see #unsetSplitEntries()
     * @see #isSplitEntries()
     * @generated
     */
    void setSplitEntries(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isSplitEntries <em>Split Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSplitEntries()
     * @see #isSplitEntries()
     * @see #setSplitEntries(boolean)
     * @generated
     */
    void unsetSplitEntries();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isSplitEntries <em>Split Entries</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Split Entries</em>' attribute is set.
     * @see #unsetSplitEntries()
     * @see #isSplitEntries()
     * @see #setSplitEntries(boolean)
     * @generated
     */
    boolean isSetSplitEntries();

    /**
     * Returns the value of the '<em><b>Filter</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Filter</em>' attribute.
     * @see #isSetFilter()
     * @see #unsetFilter()
     * @see #setFilter(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getCamelAtomBindingType_Filter()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
     * @generated
     */
    boolean isFilter();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isFilter <em>Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Filter</em>' attribute.
     * @see #isSetFilter()
     * @see #unsetFilter()
     * @see #isFilter()
     * @generated
     */
    void setFilter(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isFilter <em>Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFilter()
     * @see #isFilter()
     * @see #setFilter(boolean)
     * @generated
     */
    void unsetFilter();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isFilter <em>Filter</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Filter</em>' attribute is set.
     * @see #unsetFilter()
     * @see #isFilter()
     * @see #setFilter(boolean)
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
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Throttle Entries</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Throttle Entries</em>' attribute.
     * @see #isSetThrottleEntries()
     * @see #unsetThrottleEntries()
     * @see #setThrottleEntries(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getCamelAtomBindingType_ThrottleEntries()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='throttleEntries' namespace='##targetNamespace'"
     * @generated
     */
    boolean isThrottleEntries();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isThrottleEntries <em>Throttle Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Throttle Entries</em>' attribute.
     * @see #isSetThrottleEntries()
     * @see #unsetThrottleEntries()
     * @see #isThrottleEntries()
     * @generated
     */
    void setThrottleEntries(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isThrottleEntries <em>Throttle Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThrottleEntries()
     * @see #isThrottleEntries()
     * @see #setThrottleEntries(boolean)
     * @generated
     */
    void unsetThrottleEntries();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isThrottleEntries <em>Throttle Entries</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Throttle Entries</em>' attribute is set.
     * @see #unsetThrottleEntries()
     * @see #isThrottleEntries()
     * @see #setThrottleEntries(boolean)
     * @generated
     */
    boolean isSetThrottleEntries();

    /**
     * Returns the value of the '<em><b>Feed Header</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feed Header</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feed Header</em>' attribute.
     * @see #isSetFeedHeader()
     * @see #unsetFeedHeader()
     * @see #setFeedHeader(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getCamelAtomBindingType_FeedHeader()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='feedHeader' namespace='##targetNamespace'"
     * @generated
     */
    boolean isFeedHeader();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isFeedHeader <em>Feed Header</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feed Header</em>' attribute.
     * @see #isSetFeedHeader()
     * @see #unsetFeedHeader()
     * @see #isFeedHeader()
     * @generated
     */
    void setFeedHeader(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isFeedHeader <em>Feed Header</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFeedHeader()
     * @see #isFeedHeader()
     * @see #setFeedHeader(boolean)
     * @generated
     */
    void unsetFeedHeader();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isFeedHeader <em>Feed Header</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Feed Header</em>' attribute is set.
     * @see #unsetFeedHeader()
     * @see #isFeedHeader()
     * @see #setFeedHeader(boolean)
     * @generated
     */
    boolean isSetFeedHeader();

    /**
     * Returns the value of the '<em><b>Sort Entries</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sort Entries</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sort Entries</em>' attribute.
     * @see #isSetSortEntries()
     * @see #unsetSortEntries()
     * @see #setSortEntries(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage#getCamelAtomBindingType_SortEntries()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='sortEntries' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSortEntries();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isSortEntries <em>Sort Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sort Entries</em>' attribute.
     * @see #isSetSortEntries()
     * @see #unsetSortEntries()
     * @see #isSortEntries()
     * @generated
     */
    void setSortEntries(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isSortEntries <em>Sort Entries</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSortEntries()
     * @see #isSortEntries()
     * @see #setSortEntries(boolean)
     * @generated
     */
    void unsetSortEntries();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#isSortEntries <em>Sort Entries</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sort Entries</em>' attribute is set.
     * @see #unsetSortEntries()
     * @see #isSortEntries()
     * @see #setSortEntries(boolean)
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
