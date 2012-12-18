/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.switchyard.tools.cxf;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.apache.cxf.BusFactory;
import org.apache.cxf.tools.common.ToolConstants;
import org.apache.cxf.tools.common.ToolContext;
import org.apache.cxf.tools.wsdlto.WSDLToJava;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;

/**
 * WSDL2JavaOperation
 * 
 * <p/>
 * Generate Java interfaces from a WSDL document.
 */
public class WSDL2JavaOperation implements IRunnableWithProgress {

    private WSDL2JavaOptions _options;

    /**
     * Create a new WSDL2JavaOperation.
     * 
     * @param options the options
     */
    public WSDL2JavaOperation(WSDL2JavaOptions options) {
        _options = options;
    }

    @Override
    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
        ClassLoader oldLoader = Thread.currentThread().getContextClassLoader();
        try {
            ClassLoader loader = Activator.getProjectBuildClassLoader(_options.getTargetPackage().getJavaProject());
            Thread.currentThread().setContextClassLoader(loader);
            final String[] args = createArgs();
            final WSDLToJava wsdlToJava = new WSDLToJava(args);
            try {
                final ToolContext context = new ToolContext();
                context.addParameters(Collections
                        .<String, Object> singletonMap(ToolConstants.CFG_GEN_SEI, Boolean.TRUE));
                if (_options.isGenerateTypes()) {
                    context.addParameters(Collections.<String, Object> singletonMap(ToolConstants.CFG_GEN_TYPES,
                            Boolean.TRUE));
                }
                wsdlToJava.run(context);
            } catch (Exception e) {
                throw new InvocationTargetException(e);
            } finally {
                monitor.done();
            }
        } catch (Exception e) {
            throw new InvocationTargetException(e);
        } finally {
            Thread.currentThread().setContextClassLoader(oldLoader);
            BusFactory.setDefaultBus(null);
            BusFactory.setThreadDefaultBus(null);
        }
    }

    private String[] createArgs() {
        return _options.toArgs();
    }
}
