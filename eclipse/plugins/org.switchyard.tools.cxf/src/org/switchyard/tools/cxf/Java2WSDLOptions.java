/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.cxf;

import org.apache.cxf.common.WSDLConstants;
import org.eclipse.jdt.core.IType;

/**
 * Java2WSDLOptions
 * 
 * <p/>
 * Options used when generating WSDL from a Java class/interface.
 * 
 * @author Rob Cernich
 */
public class Java2WSDLOptions {

    private IType _serviceInterface;
    private String _serviceName;
    private String _targetNamespace;
    private String _targetNamespacePrefix = WSDLConstants.TNS_PREFIX;
    private String _locationURI;
    private String _style = WSDLConstants.DOCUMENT;
    private String _use = WSDLConstants.LITERAL;
    private boolean _useImportedSchema = false;
    private boolean _wrapped = false;

    /**
     * Get the serviceInterface.
     * 
     * @return the serviceInterface.
     */
    public IType getServiceInterface() {
        return _serviceInterface;
    }

    /**
     * Set the serviceInterface.
     * 
     * @param serviceInterface The Java interface used to generate the WSDL.
     */
    public void setServiceInterface(IType serviceInterface) {
        _serviceInterface = serviceInterface;
    }

    /**
     * Get the serviceName. Defaults to getServiceInterface().getElementName().
     * 
     * @return the serviceName.
     */
    public String getServiceName() {
        if (_serviceName == null || _serviceName.length() == 0) {
            if (_serviceInterface != null) {
                return _serviceInterface.getElementName();
            }
        }
        return _serviceName;
    }

    /**
     * 
     * @param serviceName The name for the generated service.
     */
    public void setServiceName(String serviceName) {
        _serviceName = serviceName;
    }

    /**
     * Get the targetNamespace.
     * 
     * @return the targetNamespace.
     */
    public String getTargetNamespace() {
        return _targetNamespace;
    }

    /**
     * Set the targetNamespace.
     * 
     * @param targetNamespace The target namespace for the WSDL.
     */
    public void setTargetNamespace(String targetNamespace) {
        _targetNamespace = targetNamespace;
    }

    /**
     * Get the targetNamespacePrefix. Defaults to "tns".
     * 
     * @return the targetNamespacePrefix.
     */
    public String getTargetNamespacePrefix() {
        return _targetNamespacePrefix;
    }

    /**
     * Set the targetNamespacePrefix.
     * 
     * @param targetNamespacePrefix The prefix to use for the WSDL target
     *            namespace.
     */
    public void setTargetNamespacePrefix(String targetNamespacePrefix) {
        _targetNamespacePrefix = targetNamespacePrefix;
    }

    /**
     * Get the locationURI. Defaults to "http://localhost:8081/" +
     * getServiceName().
     * 
     * @return the location URI.
     */
    public String getLocationURI() {
        if (_locationURI == null || _locationURI.length() == 0) {
            return "http://localhost:8081/" + getServiceName(); //$NON-NLS-1$
        }
        return _locationURI;
    }

    /**
     * @param locationURI The location URI for the SOAP port.
     */
    public void setLocationURI(String locationURI) {
        _locationURI = locationURI;
    }

    /**
     * @return true if WSDL should be generated using imported schema (as
     *         opposed to embeded).
     */
    public boolean isUseImportedSchema() {
        return _useImportedSchema;
    }

    /**
     * @param useImportedSchema true if WSDL should be generated using imported
     *            schema (as opposed to embeded).
     */
    public void setUseImportedSchema(boolean useImportedSchema) {
        _useImportedSchema = useImportedSchema;
    }

    /**
     * Get the style.
     * 
     * @return the style.
     */
    public String getStyle() {
        return _style;
    }

    /**
     * Set the style.
     * 
     * @param style The WSDL messaging style (document/rpc).
     */
    public void setStyle(String style) {
        _style = style;
    }

    /**
     * Get the use.
     * 
     * @return the use.
     */
    public String getUse() {
        return _use;
    }

    /**
     * Set the use.
     * 
     * @param use The WSDL messaging encoding (literal/encoded).
     */
    public void setUse(String use) {
        _use = use;
    }

    /**
     * @return true if WSDL should generated "wrapped" i/o types.
     */
    public boolean isWrapped() {
        return _wrapped;
    }

    /**
     * @param wrapped the new "wrapped" value.
     */
    public void setWrapped(boolean wrapped) {
        _wrapped = wrapped;
    }
}
