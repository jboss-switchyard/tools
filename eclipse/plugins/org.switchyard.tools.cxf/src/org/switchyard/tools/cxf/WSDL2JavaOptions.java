/*************************************************************************************
 * Copyright (c) 2013 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.cxf;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.IPackageFragment;

/**
 * WSDL2JavaOptions
 * 
 * <p/>
 * Options used when generating Java from a WSDL file.
 */
public class WSDL2JavaOptions {

    private IFile _wsdlFile;
    private String _serviceName; // -sn
    private IContainer _outputFolder; // -d
    private IPackageFragment _targetPackage; // -p
    private boolean _overwrite = false; // !-keep
    private boolean _wrapped = false; // -bareMethods
    private boolean _generateTypes = true; // !-noTypes

    /**
     * Get the WSDL file.
     * 
     * @return the WSDL file.
     */
    public IFile getWSDLFile() {
        return _wsdlFile;
    }

    /**
     * Set the WSDL file.
     * 
     * @param wsdlFile The WSDL file used to generate the interface.
     */
    public void setWSDLFile(IFile wsdlFile) {
        _wsdlFile = wsdlFile;
    }

    /**
     * Get the name of the service to generate.
     * 
     * @return the serviceName.
     */
    public String getServiceName() {
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
     * @return the folder in which Java files should be generated.
     */
    public IContainer getOutputFolder() {
        return _outputFolder;
    }

    /**
     * @param outputFolder the folder in which Java files should be generated.
     */
    public void setOutputFolder(IContainer outputFolder) {
        _outputFolder = outputFolder;
    }

    /**
     * @return the name of the Java package in which generated types should be
     *         placed.
     */
    public IPackageFragment getTargetPackage() {
        return _targetPackage;
    }

    /**
     * @param targetPackage the name of the Java package in which generated
     *            types should be placed.
     */
    public void setTargetPackage(IPackageFragment targetPackage) {
        _targetPackage = targetPackage;
    }

    /**
     * @return true if existing files should be overwritten.
     */
    public boolean isOverwrite() {
        return _overwrite;
    }

    /**
     * @param overwrite true if existing files should be overwritten.
     */
    public void setOverwrite(boolean overwrite) {
        _overwrite = overwrite;
    }

    /**
     * @return the whether or not Java methods should receive a "wrapped"
     *         payload (i.e. whether or not the message should be split out into
     *         parts).
     */
    public boolean isWrapped() {
        return _wrapped;
    }

    /**
     * @param wrapped true if Java methods should receive a wrapped payload.
     */
    public void setWrapped(boolean wrapped) {
        _wrapped = wrapped;
    }

    /**
     * @return true if types should be generated.
     */
    public boolean isGenerateTypes() {
        return _generateTypes;
    }

    /**
     * 
     * @param generateTypes true if types should be generated.
     */
    public void setGenerateTypes(boolean generateTypes) {
        _generateTypes = generateTypes;
    }

    /* package */String[] toArgs() {
        final List<String> args = new ArrayList<String>(16);
        if (_serviceName != null && _serviceName.length() > 0) {
            args.add("-sn"); //$NON-NLS-1$
            args.add(_serviceName);
        }
        if (_wrapped) {
            args.add("-bareMethods"); //$NON-NLS-1$
        }
        if (!_overwrite) {
            args.add("-keep"); //$NON-NLS-1$
        }
        args.add("-fe"); //$NON-NLS-1$
        args.add("switchyard"); //$NON-NLS-1$
        args.add("-p"); //$NON-NLS-1$
        args.add(_targetPackage.getElementName());
        args.add("-d"); //$NON-NLS-1$
        args.add(_outputFolder.getLocation().toOSString());
        args.add(_wsdlFile.getLocation().toOSString());
        return args.toArray(new String[args.size()]);
    }

}
