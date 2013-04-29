/*************************************************************************************
 * Copyright (c) 2011 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.facets;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.m2e.wtp.WTPProjectsUtil;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetDataModelProperties;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.project.facet.core.IDelegate;
import org.eclipse.wst.common.project.facet.core.IFacetedProjectWorkingCopy;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.ISwitchYardProjectWorkingCopy;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.operations.AbstractSwitchYardProjectOperation;

/**
 * SwitchYardFacetInstallActionDelegate
 * 
 * Add SwitchYard specific details to project.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class SwitchYardFacetInstallActionDelegate implements IDelegate {

    @Override
    @SuppressWarnings("unchecked")
    public void execute(final IProject project, IProjectFacetVersion fv, Object config, IProgressMonitor monitor)
            throws CoreException {
        IDataModel dataModel = (IDataModel) config;

        // TODO: get selected components
        final ISwitchYardProjectWorkingCopy workingCopy;
        ISwitchYardProject switchYardProject = (ISwitchYardProject) dataModel
                .getProperty(ISwitchYardFacetConstants.SWITCHYARD_PROJECT);
        if (switchYardProject == null) {
            IFacetedProjectWorkingCopy ifpwc = (IFacetedProjectWorkingCopy) dataModel
                    .getProperty(IFacetDataModelProperties.FACETED_PROJECT_WORKING_COPY);
            if (ifpwc != null) {
                switchYardProject = SwitchYardProjectManager.instance().getSwitchYardProject(ifpwc.getProject());
            }
        }
        if (switchYardProject == null) {
            throw new CoreException(
                    new Status(
                            Status.ERROR,
                            Activator.PLUGIN_ID,
                            "Could not resolve SwitchYard project.  SwitchYard facet installation is incomplete.  Project POM has not been updated."));
        }

        Object versionObject = dataModel.getProperty(ISwitchYardFacetConstants.RUNTIME_VERSION);
        String versionString = versionObject instanceof Version ? ((Version) versionObject).toString() : null;

        workingCopy = switchYardProject.createWorkingCopy();
        workingCopy.setRuntimeVersion(versionString);
        workingCopy.addComponents((Collection<ISwitchYardComponentExtension>) dataModel
                .getProperty(ISwitchYardFacetConstants.RUNTIME_COMPONENTS));

        // make sure the sy stuff is in the pom
        new AbstractSwitchYardProjectOperation(workingCopy, false, "Installing SwitchYard Facet", null) {
            @Override
            protected void execute(IProgressMonitor monitor) throws CoreException {
                // make sure test folders get removed, save initiating a maven
                // project update
                WTPProjectsUtil.removeTestFolderLinks(getProject(), workingCopy.getMavenProject(), monitor, "/");
            }

            @Override
            protected IProject getProject() {
                return project;
            }

        }.run(monitor);
        
        if (isOpenShiftProject(project)) {
            handleOpenShiftStandaloneUpdates(project);
        }

    }

    private Element createModule(Namespace ns, String identifier, String implClass) {
        Element newModule = new Element("module", ns);
        newModule.setAttribute("identifier", identifier);
        newModule.setAttribute("implClass", implClass);
        return newModule;
    }

    private boolean switchyardExtensionExists(Element extensions) {
        List<?> extensionList = extensions.getChildren("extension", extensions.getNamespace());
        Iterator<?> extensionIter = extensionList.iterator();
        while (extensionIter.hasNext()) {
            Element extension = (Element) extensionIter.next();
            if (extension.getAttribute("module") != null
                    && extension.getAttributeValue("module").equalsIgnoreCase("org.switchyard")) {
                return true;
            }
        }
        return false;
    }

    private boolean switchyardSubsystemExists(Element profile) {
        List<?> subsystemList = profile.getChildren();
        Iterator<?> subsystemIter = subsystemList.iterator();
        while (subsystemIter.hasNext()) {
            Element subsystem = (Element) subsystemIter.next();
            if (subsystem.getNamespace() != null
                    && subsystem.getNamespace().getURI().equalsIgnoreCase("urn:jboss:domain:switchyard:1.0")) {
                return true;
            }
        }
        return false;
    }

    private boolean isOpenShiftProject(IProject project) throws CoreException {
        if (project == null) {
            return false;
        }

        IFolder openshiftFolder = project.getFolder(".openshift");
        if (openshiftFolder != null) {
            IFile configFile = openshiftFolder.getFolder("config").getFile("standalone.xml");
            if (configFile != null) {
                return true;
            }
        }
        return false;
    }

    private void handleOpenShiftStandaloneUpdates(IProject project) throws CoreException {
        if (project == null) {
            return;
        }

        IFolder openshiftFolder = project.getFolder(".openshift");
        if (openshiftFolder != null) {
            IFile configFile = openshiftFolder.getFolder("config").getFile("standalone.xml");

            SAXBuilder builder = new SAXBuilder();
            File xmlFile = new File(configFile.getLocationURI());
            
            if (!xmlFile.exists()) {
                return;
            }

            try {
                Document doc = (Document) builder.build(xmlFile);
                Element rootNode = doc.getRootElement();

                boolean madeChanges = false;
                Element extensions = rootNode.getChild("extensions", rootNode.getNamespace());

                if (extensions != null) {
                    if (!switchyardExtensionExists(extensions)) {
                        Element sy_extension = new Element("extension", extensions.getNamespace());
                        sy_extension.setAttribute("module", "org.switchyard");
                        extensions.addContent(sy_extension);
                        madeChanges = true;
                    }
                }

                Element profiles = rootNode.getChild("profile", rootNode.getNamespace());

                if (profiles != null) {
                    if (!switchyardSubsystemExists(profiles)) {
                        Namespace syNamespace = Namespace.getNamespace("urn:jboss:domain:switchyard:1.0");
                        Element sySubsystem = new Element("subsystem", syNamespace);
                        Element syModules = new Element("modules", syNamespace);
                        Element beanModule = createModule(syNamespace, "org.switchyard.component.bean",
                                "org.switchyard.component.bean.deploy.BeanComponent");
                        syModules.addContent(beanModule);
                        Element soapModule = createModule(syNamespace, "org.switchyard.component.soap",
                                "org.switchyard.component.soap.deploy.SOAPComponent");
                        syModules.addContent(soapModule);
                        Element camelModule = createModule(syNamespace, "org.switchyard.component.camel.core",
                                "org.switchyard.component.camel.core.deploy.CamelCoreComponent");
                        syModules.addContent(camelModule);
                        Element rulesModule = createModule(syNamespace, "org.switchyard.component.rules",
                                "org.switchyard.component.rules.deploy.RulesComponent");
                        syModules.addContent(rulesModule);
                        Element bpmModule = createModule(syNamespace, "org.switchyard.component.bpm",
                                "org.switchyard.component.bpm.deploy.BPMComponent");
                        syModules.addContent(bpmModule);
                        Element bpelModule = createModule(syNamespace, "org.switchyard.component.bpel",
                                "org.switchyard.component.bpel.deploy.BPELComponent");
                        syModules.addContent(bpelModule);
                        Element restModule = createModule(syNamespace, "org.switchyard.component.resteasy",
                                "org.switchyard.component.resteasy.deploy.RESTEasyComponent");
                        syModules.addContent(restModule);
                        Element httpModule = createModule(syNamespace, "org.switchyard.component.http",
                                "org.switchyard.component.http.deploy.HttpComponent");
                        syModules.addContent(httpModule);
                        sySubsystem.addContent(syModules);
                        profiles.addContent(sySubsystem);
                        madeChanges = true;
                    }
                }

                if (madeChanges) {
                    XMLOutputter xmlOutput = new XMLOutputter();

                    // display nicely
                    xmlOutput.setFormat(Format.getPrettyFormat());
                    xmlOutput.output(doc, new FileWriter(xmlFile.getAbsolutePath()));

                    project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
                }
            } catch (JDOMException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
