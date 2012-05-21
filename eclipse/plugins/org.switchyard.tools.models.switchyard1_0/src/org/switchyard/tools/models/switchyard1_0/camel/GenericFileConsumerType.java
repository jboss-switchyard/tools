/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic File Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isDelete <em>Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isRecursive <em>Recursive</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isNoop <em>Noop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getPreMove <em>Pre Move</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getMove <em>Move</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getMoveFailed <em>Move Failed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getInclude <em>Include</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isIdempotent <em>Idempotent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getIdempotentRepository <em>Idempotent Repository</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getInProgressRepository <em>In Progress Repository</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getSorter <em>Sorter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getReadLock <em>Read Lock</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getReadLockCheckInterval <em>Read Lock Check Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getProcessStrategy <em>Process Strategy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isDirectoryMustExist <em>Directory Must Exist</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getDoneFileName <em>Done File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType()
 * @model extendedMetaData="name='GenericFileConsumerType' kind='elementOnly'"
 * @generated
 */
public interface GenericFileConsumerType extends ScheduledBatchPollConsumerType {
    /**
     * Returns the value of the '<em><b>Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delete</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delete</em>' attribute.
     * @see #isSetDelete()
     * @see #unsetDelete()
     * @see #setDelete(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_Delete()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='delete' namespace='##targetNamespace'"
     * @generated
     */
    boolean isDelete();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isDelete <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delete</em>' attribute.
     * @see #isSetDelete()
     * @see #unsetDelete()
     * @see #isDelete()
     * @generated
     */
    void setDelete(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isDelete <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDelete()
     * @see #isDelete()
     * @see #setDelete(boolean)
     * @generated
     */
    void unsetDelete();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isDelete <em>Delete</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Delete</em>' attribute is set.
     * @see #unsetDelete()
     * @see #isDelete()
     * @see #setDelete(boolean)
     * @generated
     */
    boolean isSetDelete();

    /**
     * Returns the value of the '<em><b>Recursive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recursive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Recursive</em>' attribute.
     * @see #isSetRecursive()
     * @see #unsetRecursive()
     * @see #setRecursive(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_Recursive()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='recursive' namespace='##targetNamespace'"
     * @generated
     */
    boolean isRecursive();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isRecursive <em>Recursive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Recursive</em>' attribute.
     * @see #isSetRecursive()
     * @see #unsetRecursive()
     * @see #isRecursive()
     * @generated
     */
    void setRecursive(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isRecursive <em>Recursive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRecursive()
     * @see #isRecursive()
     * @see #setRecursive(boolean)
     * @generated
     */
    void unsetRecursive();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isRecursive <em>Recursive</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Recursive</em>' attribute is set.
     * @see #unsetRecursive()
     * @see #isRecursive()
     * @see #setRecursive(boolean)
     * @generated
     */
    boolean isSetRecursive();

    /**
     * Returns the value of the '<em><b>Noop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Noop</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Noop</em>' attribute.
     * @see #isSetNoop()
     * @see #unsetNoop()
     * @see #setNoop(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_Noop()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='noop' namespace='##targetNamespace'"
     * @generated
     */
    boolean isNoop();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isNoop <em>Noop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Noop</em>' attribute.
     * @see #isSetNoop()
     * @see #unsetNoop()
     * @see #isNoop()
     * @generated
     */
    void setNoop(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isNoop <em>Noop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNoop()
     * @see #isNoop()
     * @see #setNoop(boolean)
     * @generated
     */
    void unsetNoop();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isNoop <em>Noop</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Noop</em>' attribute is set.
     * @see #unsetNoop()
     * @see #isNoop()
     * @see #setNoop(boolean)
     * @generated
     */
    boolean isSetNoop();

    /**
     * Returns the value of the '<em><b>Pre Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pre Move</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pre Move</em>' attribute.
     * @see #setPreMove(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_PreMove()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='preMove' namespace='##targetNamespace'"
     * @generated
     */
    String getPreMove();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getPreMove <em>Pre Move</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pre Move</em>' attribute.
     * @see #getPreMove()
     * @generated
     */
    void setPreMove(String value);

    /**
     * Returns the value of the '<em><b>Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Move</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Move</em>' attribute.
     * @see #setMove(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_Move()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='move' namespace='##targetNamespace'"
     * @generated
     */
    String getMove();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getMove <em>Move</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Move</em>' attribute.
     * @see #getMove()
     * @generated
     */
    void setMove(String value);

    /**
     * Returns the value of the '<em><b>Move Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Move Failed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Move Failed</em>' attribute.
     * @see #setMoveFailed(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_MoveFailed()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='moveFailed' namespace='##targetNamespace'"
     * @generated
     */
    String getMoveFailed();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getMoveFailed <em>Move Failed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Move Failed</em>' attribute.
     * @see #getMoveFailed()
     * @generated
     */
    void setMoveFailed(String value);

    /**
     * Returns the value of the '<em><b>Include</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Include</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Include</em>' attribute.
     * @see #setInclude(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_Include()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
     * @generated
     */
    String getInclude();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getInclude <em>Include</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Include</em>' attribute.
     * @see #getInclude()
     * @generated
     */
    void setInclude(String value);

    /**
     * Returns the value of the '<em><b>Exclude</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exclude</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exclude</em>' attribute.
     * @see #setExclude(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_Exclude()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
     * @generated
     */
    String getExclude();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getExclude <em>Exclude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exclude</em>' attribute.
     * @see #getExclude()
     * @generated
     */
    void setExclude(String value);

    /**
     * Returns the value of the '<em><b>Idempotent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Idempotent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Idempotent</em>' attribute.
     * @see #isSetIdempotent()
     * @see #unsetIdempotent()
     * @see #setIdempotent(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_Idempotent()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='idempotent' namespace='##targetNamespace'"
     * @generated
     */
    boolean isIdempotent();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isIdempotent <em>Idempotent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idempotent</em>' attribute.
     * @see #isSetIdempotent()
     * @see #unsetIdempotent()
     * @see #isIdempotent()
     * @generated
     */
    void setIdempotent(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isIdempotent <em>Idempotent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIdempotent()
     * @see #isIdempotent()
     * @see #setIdempotent(boolean)
     * @generated
     */
    void unsetIdempotent();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isIdempotent <em>Idempotent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Idempotent</em>' attribute is set.
     * @see #unsetIdempotent()
     * @see #isIdempotent()
     * @see #setIdempotent(boolean)
     * @generated
     */
    boolean isSetIdempotent();

    /**
     * Returns the value of the '<em><b>Idempotent Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Idempotent Repository</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Idempotent Repository</em>' attribute.
     * @see #setIdempotentRepository(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_IdempotentRepository()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='idempotentRepository' namespace='##targetNamespace'"
     * @generated
     */
    String getIdempotentRepository();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getIdempotentRepository <em>Idempotent Repository</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idempotent Repository</em>' attribute.
     * @see #getIdempotentRepository()
     * @generated
     */
    void setIdempotentRepository(String value);

    /**
     * Returns the value of the '<em><b>In Progress Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Progress Repository</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Progress Repository</em>' attribute.
     * @see #setInProgressRepository(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_InProgressRepository()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='inProgressRepository' namespace='##targetNamespace'"
     * @generated
     */
    String getInProgressRepository();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getInProgressRepository <em>In Progress Repository</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Progress Repository</em>' attribute.
     * @see #getInProgressRepository()
     * @generated
     */
    void setInProgressRepository(String value);

    /**
     * Returns the value of the '<em><b>Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Filter</em>' attribute.
     * @see #setFilter(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_Filter()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
     * @generated
     */
    String getFilter();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getFilter <em>Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Filter</em>' attribute.
     * @see #getFilter()
     * @generated
     */
    void setFilter(String value);

    /**
     * Returns the value of the '<em><b>Sorter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sorter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sorter</em>' attribute.
     * @see #setSorter(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_Sorter()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='sorter' namespace='##targetNamespace'"
     * @generated
     */
    String getSorter();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getSorter <em>Sorter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sorter</em>' attribute.
     * @see #getSorter()
     * @generated
     */
    void setSorter(String value);

    /**
     * Returns the value of the '<em><b>Sort By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sort By</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sort By</em>' attribute.
     * @see #setSortBy(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_SortBy()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='sortBy' namespace='##targetNamespace'"
     * @generated
     */
    String getSortBy();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getSortBy <em>Sort By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sort By</em>' attribute.
     * @see #getSortBy()
     * @generated
     */
    void setSortBy(String value);

    /**
     * Returns the value of the '<em><b>Read Lock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Read Lock</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Read Lock</em>' attribute.
     * @see #setReadLock(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_ReadLock()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='readLock' namespace='##targetNamespace'"
     * @generated
     */
    String getReadLock();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getReadLock <em>Read Lock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Read Lock</em>' attribute.
     * @see #getReadLock()
     * @generated
     */
    void setReadLock(String value);

    /**
     * Returns the value of the '<em><b>Read Lock Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Read Lock Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Read Lock Timeout</em>' attribute.
     * @see #isSetReadLockTimeout()
     * @see #unsetReadLockTimeout()
     * @see #setReadLockTimeout(long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_ReadLockTimeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        extendedMetaData="kind='element' name='readLockTimeout' namespace='##targetNamespace'"
     * @generated
     */
    long getReadLockTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Read Lock Timeout</em>' attribute.
     * @see #isSetReadLockTimeout()
     * @see #unsetReadLockTimeout()
     * @see #getReadLockTimeout()
     * @generated
     */
    void setReadLockTimeout(long value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReadLockTimeout()
     * @see #getReadLockTimeout()
     * @see #setReadLockTimeout(long)
     * @generated
     */
    void unsetReadLockTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Read Lock Timeout</em>' attribute is set.
     * @see #unsetReadLockTimeout()
     * @see #getReadLockTimeout()
     * @see #setReadLockTimeout(long)
     * @generated
     */
    boolean isSetReadLockTimeout();

    /**
     * Returns the value of the '<em><b>Read Lock Check Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Read Lock Check Interval</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Read Lock Check Interval</em>' attribute.
     * @see #setReadLockCheckInterval(BigInteger)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_ReadLockCheckInterval()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
     *        extendedMetaData="kind='element' name='readLockCheckInterval' namespace='##targetNamespace'"
     * @generated
     */
    BigInteger getReadLockCheckInterval();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getReadLockCheckInterval <em>Read Lock Check Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Read Lock Check Interval</em>' attribute.
     * @see #getReadLockCheckInterval()
     * @generated
     */
    void setReadLockCheckInterval(BigInteger value);

    /**
     * Returns the value of the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exclusive Read Lock Strategy</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exclusive Read Lock Strategy</em>' attribute.
     * @see #setExclusiveReadLockStrategy(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_ExclusiveReadLockStrategy()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='exclusiveReadLockStrategy' namespace='##targetNamespace'"
     * @generated
     */
    String getExclusiveReadLockStrategy();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exclusive Read Lock Strategy</em>' attribute.
     * @see #getExclusiveReadLockStrategy()
     * @generated
     */
    void setExclusiveReadLockStrategy(String value);

    /**
     * Returns the value of the '<em><b>Process Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Strategy</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Strategy</em>' attribute.
     * @see #setProcessStrategy(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_ProcessStrategy()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='processStrategy' namespace='##targetNamespace'"
     * @generated
     */
    String getProcessStrategy();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getProcessStrategy <em>Process Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Strategy</em>' attribute.
     * @see #getProcessStrategy()
     * @generated
     */
    void setProcessStrategy(String value);

    /**
     * Returns the value of the '<em><b>Starting Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Starting Directory Must Exist</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Starting Directory Must Exist</em>' attribute.
     * @see #isSetStartingDirectoryMustExist()
     * @see #unsetStartingDirectoryMustExist()
     * @see #setStartingDirectoryMustExist(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_StartingDirectoryMustExist()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='startingDirectoryMustExist' namespace='##targetNamespace'"
     * @generated
     */
    boolean isStartingDirectoryMustExist();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Starting Directory Must Exist</em>' attribute.
     * @see #isSetStartingDirectoryMustExist()
     * @see #unsetStartingDirectoryMustExist()
     * @see #isStartingDirectoryMustExist()
     * @generated
     */
    void setStartingDirectoryMustExist(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartingDirectoryMustExist()
     * @see #isStartingDirectoryMustExist()
     * @see #setStartingDirectoryMustExist(boolean)
     * @generated
     */
    void unsetStartingDirectoryMustExist();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Starting Directory Must Exist</em>' attribute is set.
     * @see #unsetStartingDirectoryMustExist()
     * @see #isStartingDirectoryMustExist()
     * @see #setStartingDirectoryMustExist(boolean)
     * @generated
     */
    boolean isSetStartingDirectoryMustExist();

    /**
     * Returns the value of the '<em><b>Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Directory Must Exist</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Directory Must Exist</em>' attribute.
     * @see #isSetDirectoryMustExist()
     * @see #unsetDirectoryMustExist()
     * @see #setDirectoryMustExist(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_DirectoryMustExist()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='directoryMustExist' namespace='##targetNamespace'"
     * @generated
     */
    boolean isDirectoryMustExist();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isDirectoryMustExist <em>Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Directory Must Exist</em>' attribute.
     * @see #isSetDirectoryMustExist()
     * @see #unsetDirectoryMustExist()
     * @see #isDirectoryMustExist()
     * @generated
     */
    void setDirectoryMustExist(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isDirectoryMustExist <em>Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDirectoryMustExist()
     * @see #isDirectoryMustExist()
     * @see #setDirectoryMustExist(boolean)
     * @generated
     */
    void unsetDirectoryMustExist();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isDirectoryMustExist <em>Directory Must Exist</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Directory Must Exist</em>' attribute is set.
     * @see #unsetDirectoryMustExist()
     * @see #isDirectoryMustExist()
     * @see #setDirectoryMustExist(boolean)
     * @generated
     */
    boolean isSetDirectoryMustExist();

    /**
     * Returns the value of the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Done File Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Done File Name</em>' attribute.
     * @see #setDoneFileName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileConsumerType_DoneFileName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='doneFileName' namespace='##targetNamespace'"
     * @generated
     */
    String getDoneFileName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getDoneFileName <em>Done File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Done File Name</em>' attribute.
     * @see #getDoneFileName()
     * @generated
     */
    void setDoneFileName(String value);

} // GenericFileConsumerType
