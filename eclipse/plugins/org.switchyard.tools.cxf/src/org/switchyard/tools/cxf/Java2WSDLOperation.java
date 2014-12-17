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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.wsdl.Definition;
import javax.xml.namespace.QName;

import org.apache.cxf.BusFactory;
import org.apache.cxf.binding.soap.SoapBindingConfiguration;
import org.apache.cxf.common.WSDLConstants;
import org.apache.cxf.databinding.AbstractDataBinding;
import org.apache.cxf.frontend.AbstractServiceFactory;
import org.apache.cxf.jaxws.support.JaxWsServiceConfiguration;
import org.apache.cxf.service.factory.AbstractServiceConfiguration;
import org.apache.cxf.service.factory.DefaultServiceConfiguration;
import org.apache.cxf.service.factory.ReflectionServiceFactoryBean;
import org.apache.cxf.service.model.OperationInfo;
import org.apache.cxf.service.model.SchemaInfo;
import org.apache.cxf.service.model.ServiceInfo;
import org.apache.cxf.tools.common.ToolConstants;
import org.apache.cxf.tools.java2wsdl.processor.internal.ServiceBuilderFactory;
import org.apache.cxf.wsdl11.ServiceWSDLBuilder;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.w3c.dom.Element;

/**
 * Java2WSDLOperation
 * 
 * <p/>
 * Generates WSDL from a Java class or interface.
 * 
 * @author Rob Cernich
 */
public class Java2WSDLOperation implements IRunnableWithProgress {

    private Java2WSDLOptions _options;
    private Definition _definition;
    private Map<String, Element> _imports = new HashMap<String, Element>();
    private static final int POLLING_DELAY = 10;

    /**
     * Create a new Java2WSDLOperation.
     * 
     * @param options the options to use when generating the WSDL.
     */
    public Java2WSDLOperation(Java2WSDLOptions options) {
        _options = options;
    }

    /**
     * @return the generated WSDL file.
     */
    public Definition getGeneratedWSDL() {
        return _definition;
    }

    /**
     * @return any generated schema (imported by the generated WSDL), file name
     *         : schema element.
     */
    public Map<String, Element> getGeneratedSchema() {
        return _imports;
    }

    /**
     * Wait for build jobs (taken from the M2E Tests project).
     * @param matcher Matcher to specify which jobs to look for
     * @param maxWaitMillis How long to wait
     */
    public void waitForJobs(IJobMatcher matcher, int maxWaitMillis) {
        while (true) {
            Job job = getJob(matcher);
            if (job == null) {
                return;
            }
            job.wakeUp();
            try {
                Thread.sleep(POLLING_DELAY);
            } catch (InterruptedException e) {
                // ignore and keep waiting
                e.printStackTrace();
            }
        }
    }

    private Job getJob(IJobMatcher matcher) {
        Job[] jobs = Job.getJobManager().find(null);
        for (Job job : jobs) {
            if (matcher.matches(job)) {
                return job;
            }
        }
        return null;
    }  

    private void waitForBuildJobs() {
        waitForJobs(BuildJobMatcher.INSTANCE, 60 * 1000);
    }

    @Override
    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
        // now we wait in case there are build jobs going in the background to avoid any
        // ordering conflicts with the service interface not being able to be found.
        // SWITCHYARD-2291
        waitForBuildJobs();
        
        ClassLoader oldLoader = Thread.currentThread().getContextClassLoader();
        Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        if (!ResourcesPlugin.getWorkspace().isAutoBuilding()) {
            MessageDialog dg = new MessageDialog(activeShell,
                    "Rebuild project?", null,
                    "The project must be built before a WSDL can be generated. Rebuild now?",
                    MessageDialog.QUESTION_WITH_CANCEL, 
                    new String[]{IDialogConstants.YES_LABEL
                    , IDialogConstants.NO_LABEL, IDialogConstants.CANCEL_LABEL},
                    0);
            switch(dg.open()) {
            case 0: 
                //yes
                BusyIndicator.showWhile(activeShell.getDisplay(), new Runnable() {
                    @Override
                    public void run() {
                        try {
                            _options.getServiceInterface().getJavaProject().getProject()
                            .build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
                        } catch (CoreException e) {
                            // ignore, this gets checked one more time in a bit
                            e.printStackTrace();
                        }
                    }
                });
                break;
            case 1:
                //no, let them continue and potentially fail if the class is not found
                break;
            case 2:
                //cancel and get out of here
                return;
            }
        }
        try {
            // initialize bus using bundle classloader, to prevent project dependencies from leaking in
            Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
            BusFactory.newInstance().createBus();

            ClassLoader loader = Activator.getProjectBuildClassLoader(_options.getServiceInterface().getJavaProject());
            Thread.currentThread().setContextClassLoader(loader);
            ServiceBuilderFactory builderFactory = ServiceBuilderFactory.getInstance(null,
                    ToolConstants.JAXB_DATABINDING);

            try {
                Class<?> serviceInterfaceClass = 
                        loader.loadClass(_options.getServiceInterface().getFullyQualifiedName());
                builderFactory.setServiceClass(serviceInterfaceClass);
            } catch (ClassNotFoundException cnfe) {
                throw new InvocationTargetException(cnfe, "Service interface class not found.");
            }
            builderFactory.setDatabindingName(ToolConstants.JAXB_DATABINDING);

            AbstractServiceFactory builder = (AbstractServiceFactory) builderFactory.newBuilder();
            builder.setServiceName(new QName(_options.getTargetNamespace(), _options.getServiceName()));
            builder.setAddress(_options.getLocationURI());
            // TODO: should this be configurable?
            builder.setTransportId(WSDLConstants.NS_SOAP11);
            builder.setBindingId(WSDLConstants.NS_SOAP11);
            if (builder.getBindingConfig() == null) {
                builder.setBindingConfig(new SoapBindingConfiguration() {
                    @Override
                    public String getStyle() {
                        return _options.getStyle();
                    }

                    @Override
                    public String getUse() {
                        return _options.getUse();
                    }
                });
            }

            ReflectionServiceFactoryBean serviceFactory = builder.getServiceFactory();
            addCustomConfigurations(serviceFactory);

            AbstractDataBinding dataBinding = (AbstractDataBinding) builder.getDataBinding();
            dataBinding.setNamespaceMap(createNamepsaceMap());

            ServiceInfo service = builder.createService();
            service.setTargetNamespace(_options.getTargetNamespace());
            service.setName(new QName(_options.getTargetNamespace(), _options.getServiceName()));

            ServiceWSDLBuilder wsdlBuilder = new ServiceWSDLBuilder(builder.getBus(), service);
            wsdlBuilder.setUseSchemaImports(_options.isUseImportedSchema());
            wsdlBuilder.setBaseFileName(_options.getServiceName());
            Map<String, SchemaInfo> imports = new HashMap<String, SchemaInfo>();
            _definition = wsdlBuilder.build(imports);

            for (Entry<String, SchemaInfo> entry : imports.entrySet()) {
                _imports.put(entry.getKey(), entry.getValue().getElement());
                // TODO: consider adding schemaLocation a la
                // WSDL11Generator.updateImports()
            }

            // if (def.getImports().size() > 0 || (_options.isUseSchemaImports()
            // && _imports.size() > 0)) {
            // // TODO: spit out an error.
            // }
        } catch (Exception e) {
            throw new InvocationTargetException(e);
        } finally {
            Thread.currentThread().setContextClassLoader(oldLoader);
            BusFactory.setDefaultBus(null);
            BusFactory.setThreadDefaultBus(null);
        }
    }

    private void addCustomConfigurations(ReflectionServiceFactoryBean serviceFactory) {
        for (AbstractServiceConfiguration asc : serviceFactory.getConfigurations()) {
            if (asc instanceof JaxWsServiceConfiguration || asc instanceof DefaultServiceConfiguration) {
                // override default param name generation
                serviceFactory.getServiceConfigurations().add(0, new CustomNameServiceConfiguration(asc));
                break;
            }
        }
        serviceFactory.getConfigurations().add(0, new CustomSOAPServiceConfiguration());
    }

    private Map<String, String> createNamepsaceMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put(_options.getTargetNamespace(), _options.getTargetNamespacePrefix());
        return map;
    }

    private final class CustomNameServiceConfiguration extends AbstractServiceConfiguration {
        private AbstractServiceConfiguration _default;

        private CustomNameServiceConfiguration(AbstractServiceConfiguration orig) {
            _default = orig;
        }

        @Override
        public Boolean hasOutMessage(Method m) {
            Boolean defaultValue = _default.hasOutMessage(m);
            // if the return type is a void, there is no "out" message.
            return (defaultValue == null || defaultValue) && !void.class.isAssignableFrom(m.getReturnType());
        }

        @Override
        public QName getInParameterName(OperationInfo op, Method method, int paramNumber) {
            QName name = _default.getInParameterName(op, method, paramNumber);
            if (name == null || !name.getLocalPart().matches("arg\\d*")) { //$NON-NLS-1$
                return name;
            }
            return replaceDefaultWithTypeName(method.getParameterTypes()[paramNumber], name);
        }

        @Override
        public QName getOutParameterName(OperationInfo op, Method method, int paramNumber) {
            QName name = _default.getOutParameterName(op, method, paramNumber);
            if (name == null || !name.getLocalPart().matches("return\\d*")) { //$NON-NLS-1$
                return name;
            }
            return replaceDefaultWithTypeName(method.getReturnType(), name);
        }

        private QName replaceDefaultWithTypeName(Class<?> type, QName name) {
            if (type.isPrimitive()) {
                return name;
            }
            String local = type.getSimpleName();
            if (type.isArray()) {
                local = local.substring(0, local.length() - 2);
            }
            if (local.length() == 0) {
                return name;
            }
            return new QName(name.getNamespaceURI(), local.substring(0, 1).toLowerCase() + local.substring(1));
        }

        @Override
        public String getServiceName() {
            if (_default instanceof DefaultServiceConfiguration) {
                return _options.getServiceName();
            }
            return _default.getServiceName();
        }

        @Override
        public QName getInterfaceName() {
            if (_default instanceof DefaultServiceConfiguration) {
                return new QName(_options.getTargetNamespace(), getServiceName() + "PortType"); //$NON-NLS-1$
            }
            return _default.getInterfaceName();
        }

        @Override
        public QName getEndpointName() {
            if (_default instanceof DefaultServiceConfiguration) {
                return new QName(_options.getTargetNamespace(), getServiceName() + "Port"); //$NON-NLS-1$
            }
            return _default.getEndpointName();
        }

    }

    private final class CustomSOAPServiceConfiguration extends AbstractServiceConfiguration {
        @Override
        public String getAction(OperationInfo op, Method method) {
            String action = super.getAction(op, method);
            if (action == null || action.length() == 0) {
                return op.getName().getLocalPart();
            }
            return action;
        }

        @Override
        public Boolean isWrapped() {
            return _options.isWrapped();
        }
    }

    /**
     * Copied from the M2E Tests projects.
     */
    public interface IJobMatcher {
        /**
         * Find the job specified by the matcher.
         * @param job to find
         * @return true or false 
         */
        boolean matches(Job job);
    }

    static class BuildJobMatcher implements IJobMatcher {

        public static final IJobMatcher INSTANCE = new BuildJobMatcher();

        public boolean matches(Job job) {
            return (job instanceof WorkspaceJob) || job.getClass().getName().matches("(.*\\.AutoBuild.*)")
                    || job.getClass().getName().endsWith("JREUpdateJob");
        }

    }
}
