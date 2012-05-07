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
package org.switchyard.tools.ui.operations;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Map.Entry;

import javax.wsdl.factory.WSDLFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.ide.undo.CreateFileOperation;
import org.switchyard.tools.cxf.Java2WSDLOperation;
import org.switchyard.tools.cxf.Java2WSDLOptions;
import org.switchyard.tools.ui.Activator;
import org.w3c.dom.Element;

/**
 * CreateWSDLFromJavaOperation
 * 
 * <p/>
 * Create a WSDL file from a Java class/interface.
 * 
 * @author Rob Cernich
 */
public class CreateWSDLFromJavaOperation implements IWorkspaceRunnable {

    private final MultiStatus _status = new MultiStatus(Activator.PLUGIN_ID, 0, "Java2WSDL Operation Status", null);
    private final Java2WSDLOptions _options;
    private final IFile _wsdlFile;

    /**
     * Create a new CreateWSDLFromJavaOperation.
     * 
     * @param options the options to use when creating the WSDL
     * @param wsdlFile the target file for the generated WSDL.
     */
    public CreateWSDLFromJavaOperation(Java2WSDLOptions options, IFile wsdlFile) {
        _options = options;
        _wsdlFile = wsdlFile;
    }

    /**
     * @return the status of the operation.
     */
    public IStatus getStatus() {
        return _status;
    }

    @Override
    public void run(IProgressMonitor monitor) throws CoreException {
        final Java2WSDLOperation java2wsdl = new Java2WSDLOperation(_options);
        try {
            java2wsdl.run(monitor);
        } catch (InvocationTargetException e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "WSDL generation failed.",
                    e.getTargetException()));
        } catch (Exception e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "WSDL generation failed.", e));
        }
        _status.add(new Status(Status.INFO, Activator.PLUGIN_ID, "WSDL generated successfully."));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        InputStream is = null;
        try {
            WSDLFactory.newInstance().newWSDLWriter().writeWSDL(java2wsdl.getGeneratedWSDL(), baos);
            is = new ByteArrayInputStream(baos.toByteArray());
            final CreateFileOperation op = new CreateFileOperation(_wsdlFile, null, is, "Writing WSDL File: "
                    + _wsdlFile.getName());
            op.execute(monitor, null);
        } catch (Exception e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error writing WSDL to file.", e));
        } finally {
            try {
                baos.close();
            } catch (IOException e) {
                e.fillInStackTrace();
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.fillInStackTrace();
                }
            }
            baos = null;
            is = null;
        }
        _status.add(new Status(Status.INFO, Activator.PLUGIN_ID, "WSDL file written successfully."));

        try {
            final Transformer transformer = createTransformer();
            for (Entry<String, Element> schemaEntry : java2wsdl.getGeneratedSchema().entrySet()) {
                final IFile schemaFile = _wsdlFile.getParent().getFile(new Path(schemaEntry.getKey()));
                if (schemaFile.exists()) {
                    // TODO: prompt overwrite
                    continue;
                }
                try {
                    baos = new ByteArrayOutputStream();
                    final DOMSource source = new DOMSource(schemaEntry.getValue());
                    final StreamResult result = new StreamResult(baos);
                    transformer.transform(source, result);
                    is = new ByteArrayInputStream(baos.toByteArray());
                    final CreateFileOperation op = new CreateFileOperation(schemaFile, null, is,
                            "Writing Schema File: " + schemaFile.getName());
                    op.execute(monitor, null);
                    _status.add(new Status(Status.INFO, Activator.PLUGIN_ID, schemaFile.getName()
                            + " written successfully."));
                } catch (Exception e) {
                    _status.add(new Status(Status.WARNING, Activator.PLUGIN_ID, "Error writing imported schema: "
                            + schemaFile.getName(), e));
                } finally {
                    try {
                        if (baos != null) {
                            baos.close();
                        }
                    } catch (IOException e) {
                        e.fillInStackTrace();
                    }
                    if (is != null) {
                        try {
                            is.close();
                        } catch (IOException e) {
                            e.fillInStackTrace();
                        }
                    }
                    baos = null;
                    is = null;
                }
            }
        } catch (Exception e) {
            _status.add(new Status(Status.WARNING, Activator.PLUGIN_ID, "Error writing included schema files.", e));
        }
    }

    private Transformer createTransformer() throws TransformerConfigurationException,
            TransformerFactoryConfigurationError {
        final Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
        return transformer;
    }
}
