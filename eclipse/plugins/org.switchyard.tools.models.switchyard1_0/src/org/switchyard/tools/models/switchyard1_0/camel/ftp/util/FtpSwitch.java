/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

import org.switchyard.tools.models.switchyard1_0.camel.core.BaseCamelBinding;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType;
import org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledBatchPollConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.*;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage
 * @generated
 */
public class FtpSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static FtpPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FtpSwitch() {
        if (modelPackage == null) {
            modelPackage = FtpPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case FtpPackage.CAMEL_FTP_BINDING_TYPE: {
                CamelFtpBindingType camelFtpBindingType = (CamelFtpBindingType)theEObject;
                T result = caseCamelFtpBindingType(camelFtpBindingType);
                if (result == null) result = caseCamelRemoteBindingType(camelFtpBindingType);
                if (result == null) result = caseGenericFileBindingType(camelFtpBindingType);
                if (result == null) result = caseBaseCamelBinding(camelFtpBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelFtpBindingType);
                if (result == null) result = caseBinding(camelFtpBindingType);
                if (result == null) result = caseCommonExtensionBase(camelFtpBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE: {
                CamelFtpsBindingType camelFtpsBindingType = (CamelFtpsBindingType)theEObject;
                T result = caseCamelFtpsBindingType(camelFtpsBindingType);
                if (result == null) result = caseCamelFtpBindingType(camelFtpsBindingType);
                if (result == null) result = caseCamelRemoteBindingType(camelFtpsBindingType);
                if (result == null) result = caseGenericFileBindingType(camelFtpsBindingType);
                if (result == null) result = caseBaseCamelBinding(camelFtpsBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelFtpsBindingType);
                if (result == null) result = caseBinding(camelFtpsBindingType);
                if (result == null) result = caseCommonExtensionBase(camelFtpsBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE: {
                CamelSftpBindingType camelSftpBindingType = (CamelSftpBindingType)theEObject;
                T result = caseCamelSftpBindingType(camelSftpBindingType);
                if (result == null) result = caseCamelRemoteBindingType(camelSftpBindingType);
                if (result == null) result = caseGenericFileBindingType(camelSftpBindingType);
                if (result == null) result = caseBaseCamelBinding(camelSftpBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelSftpBindingType);
                if (result == null) result = caseBinding(camelSftpBindingType);
                if (result == null) result = caseCommonExtensionBase(camelSftpBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE: {
                RemoteFileConsumerType remoteFileConsumerType = (RemoteFileConsumerType)theEObject;
                T result = caseRemoteFileConsumerType(remoteFileConsumerType);
                if (result == null) result = caseGenericFileConsumerType(remoteFileConsumerType);
                if (result == null) result = caseScheduledBatchPollConsumerType(remoteFileConsumerType);
                if (result == null) result = caseScheduledPollConsumerType(remoteFileConsumerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FtpPackage.REMOTE_FILE_PRODUCER_TYPE: {
                RemoteFileProducerType remoteFileProducerType = (RemoteFileProducerType)theEObject;
                T result = caseRemoteFileProducerType(remoteFileProducerType);
                if (result == null) result = caseGenericFileProducerType(remoteFileProducerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FtpPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Ftp Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Ftp Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelFtpBindingType(CamelFtpBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Ftps Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Ftps Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelFtpsBindingType(CamelFtpsBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Sftp Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Sftp Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelSftpBindingType(CamelSftpBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remote File Consumer Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remote File Consumer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemoteFileConsumerType(RemoteFileConsumerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remote File Producer Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remote File Producer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemoteFileProducerType(RemoteFileProducerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentRoot(DocumentRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Common Extension Base</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Common Extension Base</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommonExtensionBase(CommonExtensionBase object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBinding(Binding object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Yard Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Yard Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchYardBindingType(SwitchYardBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Camel Binding</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Camel Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseCamelBinding(BaseCamelBinding object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generic File Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generic File Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericFileBindingType(GenericFileBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remote Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remote Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelRemoteBindingType(CamelRemoteBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scheduled Poll Consumer Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scheduled Poll Consumer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScheduledPollConsumerType(ScheduledPollConsumerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scheduled Batch Poll Consumer Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scheduled Batch Poll Consumer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScheduledBatchPollConsumerType(ScheduledBatchPollConsumerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generic File Consumer Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generic File Consumer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericFileConsumerType(GenericFileConsumerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generic File Producer Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generic File Producer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericFileProducerType(GenericFileProducerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //FtpSwitch
