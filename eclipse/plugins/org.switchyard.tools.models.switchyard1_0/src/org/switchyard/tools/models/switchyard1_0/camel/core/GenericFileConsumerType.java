/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic File Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getRecursive <em>Recursive</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getNoop <em>Noop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getPreMove <em>Pre Move</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getMove <em>Move</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getMoveFailed <em>Move Failed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getInclude <em>Include</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getIdempotent <em>Idempotent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getIdempotentRepository <em>Idempotent Repository</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getInProgressRepository <em>In Progress Repository</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getSorter <em>Sorter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLock <em>Read Lock</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLockCheckInterval <em>Read Lock Check Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getProcessStrategy <em>Process Strategy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDirectoryMustExist <em>Directory Must Exist</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDoneFileName <em>Done File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType()
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
     * @see #setDelete(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_Delete()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='delete' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getDelete();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDelete <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delete</em>' attribute.
     * @see #isSetDelete()
     * @see #unsetDelete()
     * @see #getDelete()
     * @generated
     */
    void setDelete(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDelete <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDelete()
     * @see #getDelete()
     * @see #setDelete(Boolean)
     * @generated
     */
    void unsetDelete();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDelete <em>Delete</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Delete</em>' attribute is set.
     * @see #unsetDelete()
     * @see #getDelete()
     * @see #setDelete(Boolean)
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
     * @see #setRecursive(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_Recursive()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='recursive' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getRecursive();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getRecursive <em>Recursive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Recursive</em>' attribute.
     * @see #isSetRecursive()
     * @see #unsetRecursive()
     * @see #getRecursive()
     * @generated
     */
    void setRecursive(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getRecursive <em>Recursive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRecursive()
     * @see #getRecursive()
     * @see #setRecursive(Boolean)
     * @generated
     */
    void unsetRecursive();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getRecursive <em>Recursive</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Recursive</em>' attribute is set.
     * @see #unsetRecursive()
     * @see #getRecursive()
     * @see #setRecursive(Boolean)
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
     * @see #setNoop(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_Noop()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='noop' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getNoop();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getNoop <em>Noop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Noop</em>' attribute.
     * @see #isSetNoop()
     * @see #unsetNoop()
     * @see #getNoop()
     * @generated
     */
    void setNoop(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getNoop <em>Noop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNoop()
     * @see #getNoop()
     * @see #setNoop(Boolean)
     * @generated
     */
    void unsetNoop();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getNoop <em>Noop</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Noop</em>' attribute is set.
     * @see #unsetNoop()
     * @see #getNoop()
     * @see #setNoop(Boolean)
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_PreMove()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='preMove' namespace='##targetNamespace'"
     * @generated
     */
    String getPreMove();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getPreMove <em>Pre Move</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_Move()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='move' namespace='##targetNamespace'"
     * @generated
     */
    String getMove();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getMove <em>Move</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_MoveFailed()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='moveFailed' namespace='##targetNamespace'"
     * @generated
     */
    String getMoveFailed();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getMoveFailed <em>Move Failed</em>}' attribute.
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
     * @see #isSetInclude()
     * @see #unsetInclude()
     * @see #setInclude(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_Include()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
     * @generated
     */
    String getInclude();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getInclude <em>Include</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Include</em>' attribute.
     * @see #isSetInclude()
     * @see #unsetInclude()
     * @see #getInclude()
     * @generated
     */
    void setInclude(String value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getInclude <em>Include</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInclude()
     * @see #getInclude()
     * @see #setInclude(String)
     * @generated
     */
    void unsetInclude();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getInclude <em>Include</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Include</em>' attribute is set.
     * @see #unsetInclude()
     * @see #getInclude()
     * @see #setInclude(String)
     * @generated
     */
    boolean isSetInclude();

    /**
     * Returns the value of the '<em><b>Exclude</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exclude</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exclude</em>' attribute.
     * @see #isSetExclude()
     * @see #unsetExclude()
     * @see #setExclude(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_Exclude()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
     * @generated
     */
    String getExclude();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getExclude <em>Exclude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exclude</em>' attribute.
     * @see #isSetExclude()
     * @see #unsetExclude()
     * @see #getExclude()
     * @generated
     */
    void setExclude(String value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getExclude <em>Exclude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExclude()
     * @see #getExclude()
     * @see #setExclude(String)
     * @generated
     */
    void unsetExclude();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getExclude <em>Exclude</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Exclude</em>' attribute is set.
     * @see #unsetExclude()
     * @see #getExclude()
     * @see #setExclude(String)
     * @generated
     */
    boolean isSetExclude();

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
     * @see #setIdempotent(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_Idempotent()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='idempotent' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getIdempotent();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getIdempotent <em>Idempotent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idempotent</em>' attribute.
     * @see #isSetIdempotent()
     * @see #unsetIdempotent()
     * @see #getIdempotent()
     * @generated
     */
    void setIdempotent(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getIdempotent <em>Idempotent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIdempotent()
     * @see #getIdempotent()
     * @see #setIdempotent(Boolean)
     * @generated
     */
    void unsetIdempotent();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getIdempotent <em>Idempotent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Idempotent</em>' attribute is set.
     * @see #unsetIdempotent()
     * @see #getIdempotent()
     * @see #setIdempotent(Boolean)
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
     * @see #isSetIdempotentRepository()
     * @see #unsetIdempotentRepository()
     * @see #setIdempotentRepository(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_IdempotentRepository()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='idempotentRepository' namespace='##targetNamespace'"
     * @generated
     */
    String getIdempotentRepository();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getIdempotentRepository <em>Idempotent Repository</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idempotent Repository</em>' attribute.
     * @see #isSetIdempotentRepository()
     * @see #unsetIdempotentRepository()
     * @see #getIdempotentRepository()
     * @generated
     */
    void setIdempotentRepository(String value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getIdempotentRepository <em>Idempotent Repository</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIdempotentRepository()
     * @see #getIdempotentRepository()
     * @see #setIdempotentRepository(String)
     * @generated
     */
    void unsetIdempotentRepository();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getIdempotentRepository <em>Idempotent Repository</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Idempotent Repository</em>' attribute is set.
     * @see #unsetIdempotentRepository()
     * @see #getIdempotentRepository()
     * @see #setIdempotentRepository(String)
     * @generated
     */
    boolean isSetIdempotentRepository();

    /**
     * Returns the value of the '<em><b>In Progress Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Progress Repository</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Progress Repository</em>' attribute.
     * @see #isSetInProgressRepository()
     * @see #unsetInProgressRepository()
     * @see #setInProgressRepository(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_InProgressRepository()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='inProgressRepository' namespace='##targetNamespace'"
     * @generated
     */
    String getInProgressRepository();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getInProgressRepository <em>In Progress Repository</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Progress Repository</em>' attribute.
     * @see #isSetInProgressRepository()
     * @see #unsetInProgressRepository()
     * @see #getInProgressRepository()
     * @generated
     */
    void setInProgressRepository(String value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getInProgressRepository <em>In Progress Repository</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInProgressRepository()
     * @see #getInProgressRepository()
     * @see #setInProgressRepository(String)
     * @generated
     */
    void unsetInProgressRepository();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getInProgressRepository <em>In Progress Repository</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>In Progress Repository</em>' attribute is set.
     * @see #unsetInProgressRepository()
     * @see #getInProgressRepository()
     * @see #setInProgressRepository(String)
     * @generated
     */
    boolean isSetInProgressRepository();

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
     * @see #setFilter(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_Filter()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
     * @generated
     */
    String getFilter();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getFilter <em>Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Filter</em>' attribute.
     * @see #isSetFilter()
     * @see #unsetFilter()
     * @see #getFilter()
     * @generated
     */
    void setFilter(String value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getFilter <em>Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFilter()
     * @see #getFilter()
     * @see #setFilter(String)
     * @generated
     */
    void unsetFilter();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getFilter <em>Filter</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Filter</em>' attribute is set.
     * @see #unsetFilter()
     * @see #getFilter()
     * @see #setFilter(String)
     * @generated
     */
    boolean isSetFilter();

    /**
     * Returns the value of the '<em><b>Sorter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sorter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sorter</em>' attribute.
     * @see #isSetSorter()
     * @see #unsetSorter()
     * @see #setSorter(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_Sorter()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='sorter' namespace='##targetNamespace'"
     * @generated
     */
    String getSorter();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getSorter <em>Sorter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sorter</em>' attribute.
     * @see #isSetSorter()
     * @see #unsetSorter()
     * @see #getSorter()
     * @generated
     */
    void setSorter(String value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getSorter <em>Sorter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSorter()
     * @see #getSorter()
     * @see #setSorter(String)
     * @generated
     */
    void unsetSorter();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getSorter <em>Sorter</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sorter</em>' attribute is set.
     * @see #unsetSorter()
     * @see #getSorter()
     * @see #setSorter(String)
     * @generated
     */
    boolean isSetSorter();

    /**
     * Returns the value of the '<em><b>Sort By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sort By</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sort By</em>' attribute.
     * @see #isSetSortBy()
     * @see #unsetSortBy()
     * @see #setSortBy(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_SortBy()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='sortBy' namespace='##targetNamespace'"
     * @generated
     */
    String getSortBy();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getSortBy <em>Sort By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sort By</em>' attribute.
     * @see #isSetSortBy()
     * @see #unsetSortBy()
     * @see #getSortBy()
     * @generated
     */
    void setSortBy(String value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getSortBy <em>Sort By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSortBy()
     * @see #getSortBy()
     * @see #setSortBy(String)
     * @generated
     */
    void unsetSortBy();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getSortBy <em>Sort By</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sort By</em>' attribute is set.
     * @see #unsetSortBy()
     * @see #getSortBy()
     * @see #setSortBy(String)
     * @generated
     */
    boolean isSetSortBy();

    /**
     * Returns the value of the '<em><b>Read Lock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Read Lock</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Read Lock</em>' attribute.
     * @see #isSetReadLock()
     * @see #unsetReadLock()
     * @see #setReadLock(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_ReadLock()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='readLock' namespace='##targetNamespace'"
     * @generated
     */
    String getReadLock();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLock <em>Read Lock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Read Lock</em>' attribute.
     * @see #isSetReadLock()
     * @see #unsetReadLock()
     * @see #getReadLock()
     * @generated
     */
    void setReadLock(String value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLock <em>Read Lock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReadLock()
     * @see #getReadLock()
     * @see #setReadLock(String)
     * @generated
     */
    void unsetReadLock();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLock <em>Read Lock</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Read Lock</em>' attribute is set.
     * @see #unsetReadLock()
     * @see #getReadLock()
     * @see #setReadLock(String)
     * @generated
     */
    boolean isSetReadLock();

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
     * @see #setReadLockTimeout(Long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_ReadLockTimeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.LongObject"
     *        extendedMetaData="kind='element' name='readLockTimeout' namespace='##targetNamespace'"
     * @generated
     */
    Long getReadLockTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Read Lock Timeout</em>' attribute.
     * @see #isSetReadLockTimeout()
     * @see #unsetReadLockTimeout()
     * @see #getReadLockTimeout()
     * @generated
     */
    void setReadLockTimeout(Long value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReadLockTimeout()
     * @see #getReadLockTimeout()
     * @see #setReadLockTimeout(Long)
     * @generated
     */
    void unsetReadLockTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Read Lock Timeout</em>' attribute is set.
     * @see #unsetReadLockTimeout()
     * @see #getReadLockTimeout()
     * @see #setReadLockTimeout(Long)
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
     * @see #isSetReadLockCheckInterval()
     * @see #unsetReadLockCheckInterval()
     * @see #setReadLockCheckInterval(BigInteger)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_ReadLockCheckInterval()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
     *        extendedMetaData="kind='element' name='readLockCheckInterval' namespace='##targetNamespace'"
     * @generated
     */
    BigInteger getReadLockCheckInterval();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLockCheckInterval <em>Read Lock Check Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Read Lock Check Interval</em>' attribute.
     * @see #isSetReadLockCheckInterval()
     * @see #unsetReadLockCheckInterval()
     * @see #getReadLockCheckInterval()
     * @generated
     */
    void setReadLockCheckInterval(BigInteger value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLockCheckInterval <em>Read Lock Check Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReadLockCheckInterval()
     * @see #getReadLockCheckInterval()
     * @see #setReadLockCheckInterval(BigInteger)
     * @generated
     */
    void unsetReadLockCheckInterval();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLockCheckInterval <em>Read Lock Check Interval</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Read Lock Check Interval</em>' attribute is set.
     * @see #unsetReadLockCheckInterval()
     * @see #getReadLockCheckInterval()
     * @see #setReadLockCheckInterval(BigInteger)
     * @generated
     */
    boolean isSetReadLockCheckInterval();

    /**
     * Returns the value of the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exclusive Read Lock Strategy</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exclusive Read Lock Strategy</em>' attribute.
     * @see #isSetExclusiveReadLockStrategy()
     * @see #unsetExclusiveReadLockStrategy()
     * @see #setExclusiveReadLockStrategy(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_ExclusiveReadLockStrategy()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='exclusiveReadLockStrategy' namespace='##targetNamespace'"
     * @generated
     */
    String getExclusiveReadLockStrategy();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exclusive Read Lock Strategy</em>' attribute.
     * @see #isSetExclusiveReadLockStrategy()
     * @see #unsetExclusiveReadLockStrategy()
     * @see #getExclusiveReadLockStrategy()
     * @generated
     */
    void setExclusiveReadLockStrategy(String value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExclusiveReadLockStrategy()
     * @see #getExclusiveReadLockStrategy()
     * @see #setExclusiveReadLockStrategy(String)
     * @generated
     */
    void unsetExclusiveReadLockStrategy();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Exclusive Read Lock Strategy</em>' attribute is set.
     * @see #unsetExclusiveReadLockStrategy()
     * @see #getExclusiveReadLockStrategy()
     * @see #setExclusiveReadLockStrategy(String)
     * @generated
     */
    boolean isSetExclusiveReadLockStrategy();

    /**
     * Returns the value of the '<em><b>Process Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Strategy</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Strategy</em>' attribute.
     * @see #isSetProcessStrategy()
     * @see #unsetProcessStrategy()
     * @see #setProcessStrategy(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_ProcessStrategy()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='processStrategy' namespace='##targetNamespace'"
     * @generated
     */
    String getProcessStrategy();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getProcessStrategy <em>Process Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Strategy</em>' attribute.
     * @see #isSetProcessStrategy()
     * @see #unsetProcessStrategy()
     * @see #getProcessStrategy()
     * @generated
     */
    void setProcessStrategy(String value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getProcessStrategy <em>Process Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcessStrategy()
     * @see #getProcessStrategy()
     * @see #setProcessStrategy(String)
     * @generated
     */
    void unsetProcessStrategy();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getProcessStrategy <em>Process Strategy</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Process Strategy</em>' attribute is set.
     * @see #unsetProcessStrategy()
     * @see #getProcessStrategy()
     * @see #setProcessStrategy(String)
     * @generated
     */
    boolean isSetProcessStrategy();

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
     * @see #setStartingDirectoryMustExist(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_StartingDirectoryMustExist()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='startingDirectoryMustExist' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getStartingDirectoryMustExist();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Starting Directory Must Exist</em>' attribute.
     * @see #isSetStartingDirectoryMustExist()
     * @see #unsetStartingDirectoryMustExist()
     * @see #getStartingDirectoryMustExist()
     * @generated
     */
    void setStartingDirectoryMustExist(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartingDirectoryMustExist()
     * @see #getStartingDirectoryMustExist()
     * @see #setStartingDirectoryMustExist(Boolean)
     * @generated
     */
    void unsetStartingDirectoryMustExist();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Starting Directory Must Exist</em>' attribute is set.
     * @see #unsetStartingDirectoryMustExist()
     * @see #getStartingDirectoryMustExist()
     * @see #setStartingDirectoryMustExist(Boolean)
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
     * @see #setDirectoryMustExist(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_DirectoryMustExist()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='directoryMustExist' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getDirectoryMustExist();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDirectoryMustExist <em>Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Directory Must Exist</em>' attribute.
     * @see #isSetDirectoryMustExist()
     * @see #unsetDirectoryMustExist()
     * @see #getDirectoryMustExist()
     * @generated
     */
    void setDirectoryMustExist(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDirectoryMustExist <em>Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDirectoryMustExist()
     * @see #getDirectoryMustExist()
     * @see #setDirectoryMustExist(Boolean)
     * @generated
     */
    void unsetDirectoryMustExist();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDirectoryMustExist <em>Directory Must Exist</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Directory Must Exist</em>' attribute is set.
     * @see #unsetDirectoryMustExist()
     * @see #getDirectoryMustExist()
     * @see #setDirectoryMustExist(Boolean)
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
     * @see #isSetDoneFileName()
     * @see #unsetDoneFileName()
     * @see #setDoneFileName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileConsumerType_DoneFileName()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='doneFileName' namespace='##targetNamespace'"
     * @generated
     */
    String getDoneFileName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDoneFileName <em>Done File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Done File Name</em>' attribute.
     * @see #isSetDoneFileName()
     * @see #unsetDoneFileName()
     * @see #getDoneFileName()
     * @generated
     */
    void setDoneFileName(String value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDoneFileName <em>Done File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDoneFileName()
     * @see #getDoneFileName()
     * @see #setDoneFileName(String)
     * @generated
     */
    void unsetDoneFileName();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDoneFileName <em>Done File Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Done File Name</em>' attribute is set.
     * @see #unsetDoneFileName()
     * @see #getDoneFileName()
     * @see #setDoneFileName(String)
     * @generated
     */
    boolean isSetDoneFileName();

} // GenericFileConsumerType
