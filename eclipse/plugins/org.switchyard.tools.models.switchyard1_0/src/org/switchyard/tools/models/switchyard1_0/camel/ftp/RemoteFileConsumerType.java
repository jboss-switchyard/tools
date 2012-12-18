/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote File Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getRecursive <em>Recursive</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getNoop <em>Noop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getPreMove <em>Pre Move</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getMove <em>Move</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getMoveFailed <em>Move Failed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getInclude <em>Include</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getIdempotent <em>Idempotent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getIdempotentRepository <em>Idempotent Repository</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getInProgressRepository <em>In Progress Repository</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getSorter <em>Sorter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getReadLock <em>Read Lock</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getReadLockCheckInterval <em>Read Lock Check Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getProcessStrategy <em>Process Strategy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDirectoryMustExist <em>Directory Must Exist</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDoneFileName <em>Done File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType()
 * @model extendedMetaData="name='RemoteFileConsumerType' kind='elementOnly'"
 * @generated
 */
public interface RemoteFileConsumerType extends EObject {

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_Delete()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='delete' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getDelete();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDelete <em>Delete</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDelete <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDelete()
     * @see #getDelete()
     * @see #setDelete(Boolean)
     * @generated
     */
    void unsetDelete();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDelete <em>Delete</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_Recursive()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='recursive' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getRecursive();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getRecursive <em>Recursive</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getRecursive <em>Recursive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRecursive()
     * @see #getRecursive()
     * @see #setRecursive(Boolean)
     * @generated
     */
    void unsetRecursive();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getRecursive <em>Recursive</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_Noop()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='noop' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getNoop();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getNoop <em>Noop</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getNoop <em>Noop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNoop()
     * @see #getNoop()
     * @see #setNoop(Boolean)
     * @generated
     */
    void unsetNoop();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getNoop <em>Noop</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_PreMove()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='preMove' namespace='##targetNamespace'"
     * @generated
     */
    String getPreMove();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getPreMove <em>Pre Move</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_Move()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='move' namespace='##targetNamespace'"
     * @generated
     */
    String getMove();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getMove <em>Move</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_MoveFailed()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='moveFailed' namespace='##targetNamespace'"
     * @generated
     */
    String getMoveFailed();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getMoveFailed <em>Move Failed</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_Include()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
     * @generated
     */
    String getInclude();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getInclude <em>Include</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_Exclude()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
     * @generated
     */
    String getExclude();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getExclude <em>Exclude</em>}' attribute.
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
     * @see #setIdempotent(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_Idempotent()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='idempotent' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getIdempotent();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getIdempotent <em>Idempotent</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getIdempotent <em>Idempotent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIdempotent()
     * @see #getIdempotent()
     * @see #setIdempotent(Boolean)
     * @generated
     */
    void unsetIdempotent();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getIdempotent <em>Idempotent</em>}' attribute is set.
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
     * @see #setIdempotentRepository(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_IdempotentRepository()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='idempotentRepository' namespace='##targetNamespace'"
     * @generated
     */
    String getIdempotentRepository();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getIdempotentRepository <em>Idempotent Repository</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_InProgressRepository()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='inProgressRepository' namespace='##targetNamespace'"
     * @generated
     */
    String getInProgressRepository();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getInProgressRepository <em>In Progress Repository</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_Filter()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
     * @generated
     */
    String getFilter();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getFilter <em>Filter</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_Sorter()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='sorter' namespace='##targetNamespace'"
     * @generated
     */
    String getSorter();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getSorter <em>Sorter</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_SortBy()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='sortBy' namespace='##targetNamespace'"
     * @generated
     */
    String getSortBy();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getSortBy <em>Sort By</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_ReadLock()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='readLock' namespace='##targetNamespace'"
     * @generated
     */
    String getReadLock();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getReadLock <em>Read Lock</em>}' attribute.
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
     * @see #setReadLockTimeout(Long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_ReadLockTimeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.LongObject"
     *        extendedMetaData="kind='element' name='readLockTimeout' namespace='##targetNamespace'"
     * @generated
     */
    Long getReadLockTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReadLockTimeout()
     * @see #getReadLockTimeout()
     * @see #setReadLockTimeout(Long)
     * @generated
     */
    void unsetReadLockTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}' attribute is set.
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
     * @see #setReadLockCheckInterval(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_ReadLockCheckInterval()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='readLockCheckInterval' namespace='##targetNamespace'"
     * @generated
     */
    Integer getReadLockCheckInterval();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getReadLockCheckInterval <em>Read Lock Check Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Read Lock Check Interval</em>' attribute.
     * @see #getReadLockCheckInterval()
     * @generated
     */
    void setReadLockCheckInterval(Integer value);

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_ExclusiveReadLockStrategy()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='exclusiveReadLockStrategy' namespace='##targetNamespace'"
     * @generated
     */
    String getExclusiveReadLockStrategy();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_ProcessStrategy()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='processStrategy' namespace='##targetNamespace'"
     * @generated
     */
    String getProcessStrategy();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getProcessStrategy <em>Process Strategy</em>}' attribute.
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
     * @see #setStartingDirectoryMustExist(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_StartingDirectoryMustExist()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='startingDirectoryMustExist' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getStartingDirectoryMustExist();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartingDirectoryMustExist()
     * @see #getStartingDirectoryMustExist()
     * @see #setStartingDirectoryMustExist(Boolean)
     * @generated
     */
    void unsetStartingDirectoryMustExist();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_DirectoryMustExist()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='directoryMustExist' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getDirectoryMustExist();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDirectoryMustExist <em>Directory Must Exist</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDirectoryMustExist <em>Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDirectoryMustExist()
     * @see #getDirectoryMustExist()
     * @see #setDirectoryMustExist(Boolean)
     * @generated
     */
    void unsetDirectoryMustExist();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDirectoryMustExist <em>Directory Must Exist</em>}' attribute is set.
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
     * @see #setDoneFileName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_DoneFileName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='doneFileName' namespace='##targetNamespace'"
     * @generated
     */
    String getDoneFileName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDoneFileName <em>Done File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Done File Name</em>' attribute.
     * @see #getDoneFileName()
     * @generated
     */
    void setDoneFileName(String value);

    /**
     * Returns the value of the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Messages Per Poll</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Messages Per Poll</em>' attribute.
     * @see #setMaxMessagesPerPoll(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_MaxMessagesPerPoll()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='maxMessagesPerPoll' namespace='##targetNamespace'"
     * @generated
     */
    Integer getMaxMessagesPerPoll();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Messages Per Poll</em>' attribute.
     * @see #getMaxMessagesPerPoll()
     * @generated
     */
    void setMaxMessagesPerPoll(Integer value);

    /**
     * Returns the value of the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Delay</em>' attribute.
     * @see #setInitialDelay(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_InitialDelay()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='initialDelay' namespace='##targetNamespace'"
     * @generated
     */
    Integer getInitialDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getInitialDelay <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Delay</em>' attribute.
     * @see #getInitialDelay()
     * @generated
     */
    void setInitialDelay(Integer value);

    /**
     * Returns the value of the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' attribute.
     * @see #setDelay(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_Delay()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace'"
     * @generated
     */
    Integer getDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' attribute.
     * @see #getDelay()
     * @generated
     */
    void setDelay(Integer value);

    /**
     * Returns the value of the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Fixed Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Fixed Delay</em>' attribute.
     * @see #isSetUseFixedDelay()
     * @see #unsetUseFixedDelay()
     * @see #setUseFixedDelay(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_UseFixedDelay()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='useFixedDelay' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getUseFixedDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Fixed Delay</em>' attribute.
     * @see #isSetUseFixedDelay()
     * @see #unsetUseFixedDelay()
     * @see #getUseFixedDelay()
     * @generated
     */
    void setUseFixedDelay(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUseFixedDelay()
     * @see #getUseFixedDelay()
     * @see #setUseFixedDelay(Boolean)
     * @generated
     */
    void unsetUseFixedDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Use Fixed Delay</em>' attribute is set.
     * @see #unsetUseFixedDelay()
     * @see #getUseFixedDelay()
     * @see #setUseFixedDelay(Boolean)
     * @generated
     */
    boolean isSetUseFixedDelay();

    /**
     * Returns the value of the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Send Empty Message When Idle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Send Empty Message When Idle</em>' attribute.
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_SendEmptyMessageWhenIdle()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='sendEmptyMessageWhenIdle' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getSendEmptyMessageWhenIdle();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Send Empty Message When Idle</em>' attribute.
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #getSendEmptyMessageWhenIdle()
     * @generated
     */
    void setSendEmptyMessageWhenIdle(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #getSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(Boolean)
     * @generated
     */
    void unsetSendEmptyMessageWhenIdle();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Send Empty Message When Idle</em>' attribute is set.
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #getSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(Boolean)
     * @generated
     */
    boolean isSetSendEmptyMessageWhenIdle();

    /**
     * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Unit</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType
     * @see #isSetTimeUnit()
     * @see #unsetTimeUnit()
     * @see #setTimeUnit(TimeUnitType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileConsumerType_TimeUnit()
     * @model unsettable="true"
     *        extendedMetaData="kind='element' name='timeUnit' namespace='##targetNamespace'"
     * @generated
     */
    TimeUnitType getTimeUnit();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getTimeUnit <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Unit</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType
     * @see #isSetTimeUnit()
     * @see #unsetTimeUnit()
     * @see #getTimeUnit()
     * @generated
     */
    void setTimeUnit(TimeUnitType value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getTimeUnit <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeUnit()
     * @see #getTimeUnit()
     * @see #setTimeUnit(TimeUnitType)
     * @generated
     */
    void unsetTimeUnit();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getTimeUnit <em>Time Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Unit</em>' attribute is set.
     * @see #unsetTimeUnit()
     * @see #getTimeUnit()
     * @see #setTimeUnit(TimeUnitType)
     * @generated
     */
    boolean isSetTimeUnit();
} // RemoteFileConsumerType
