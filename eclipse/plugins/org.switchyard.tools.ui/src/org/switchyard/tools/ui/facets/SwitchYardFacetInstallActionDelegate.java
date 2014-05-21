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

import org.apache.maven.artifact.versioning.ArtifactVersion;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.wtp.WTPProjectsUtil;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetDataModelProperties;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.project.facet.core.IDelegate;
import org.eclipse.wst.common.project.facet.core.IFacetedProjectWorkingCopy;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;
import org.eclipse.wst.xml.core.internal.XMLCorePlugin;
import org.eclipse.wst.xml.core.internal.preferences.XMLCorePreferenceNames;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.ISwitchYardProjectWorkingCopy;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.i18n.Messages;
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
        final IFacetedProjectWorkingCopy ifpwc = (IFacetedProjectWorkingCopy) dataModel
                .getProperty(IFacetDataModelProperties.FACETED_PROJECT_WORKING_COPY);
        final ISwitchYardProjectWorkingCopy workingCopy;
        ISwitchYardProject switchYardProject = (ISwitchYardProject) dataModel
                .getProperty(ISwitchYardFacetConstants.SWITCHYARD_PROJECT);
        if (switchYardProject == null) {
            if (ifpwc != null) {
                switchYardProject = SwitchYardProjectManager.instance().getSwitchYardProject(ifpwc.getProject());
            }
        }
        if (switchYardProject == null) {
            throw new CoreException(
                    new Status(
                            Status.ERROR,
                            Activator.PLUGIN_ID,
                            Messages.SwitchYardFacetInstallActionDelegate_exceptionMessage_cannotResolveSYProject));
        }

        Object versionObject = dataModel.getProperty(ISwitchYardFacetConstants.RUNTIME_VERSION);
        String versionString = versionObject instanceof ArtifactVersion ? ((ArtifactVersion) versionObject).toString() : null;

        workingCopy = switchYardProject.createWorkingCopy();
        workingCopy.setRuntimeVersion(versionString);
        workingCopy.addComponents((Collection<ISwitchYardComponentExtension>) dataModel
                .getProperty(ISwitchYardFacetConstants.RUNTIME_COMPONENTS));

        // make sure the sy stuff is in the pom
        new AbstractSwitchYardProjectOperation(workingCopy, ifpwc, false, Messages.SwitchYardFacetInstallActionDelegate_operationLabel_installingSYFacet, null) {
            @Override
            protected void execute(IProgressMonitor monitor) throws CoreException {
                // make sure test folders get removed, save initiating a maven
                // project update
                IMavenProjectFacade projectFacade = MavenPlugin.getMavenProjectRegistry().getProject(getProject());
                if (projectFacade == null || projectFacade.getMavenProject() == null) {
                    throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, Messages.SwitchYardFacetInstallActionDelegate_errorMessage_notAMavenProject));
                }
                WTPProjectsUtil.removeTestFolderLinks(getProject(), workingCopy.getMavenProject(), monitor, "/"); //$NON-NLS-1$
            }

            @Override
            protected IProject getProject() {
                return project;
            }

        }.run(monitor);
        
        workingCopy.dispose();

        if (isOpenShiftProject(project)) {
            handleOpenShiftStandaloneUpdates(project);
        }

        // Turn off "Honor All Schema Locations" in XML validation for SY projects at the
        // project preference level, not the workbench level.
        IScopeContext[] contexts = createPreferenceScopes(null); //project); overridden for SWITCHYARD-1779 fix
        Boolean honorAllSchemaLocationsBoolean = 
                Platform.getPreferencesService().getBoolean(
                        XMLCorePlugin.getDefault().getBundle().getSymbolicName(), 
                        XMLCorePreferenceNames.HONOUR_ALL_SCHEMA_LOCATIONS, true, contexts);
        if (honorAllSchemaLocationsBoolean.booleanValue()) {
            IEclipsePreferences node = contexts[0].getNode(XMLCorePlugin.getDefault().getBundle().getSymbolicName());
            node.putBoolean(XMLCorePreferenceNames.HONOUR_ALL_SCHEMA_LOCATIONS, false);
            if (contexts[0] instanceof ProjectScope) {
                node.putBoolean(XMLCorePreferenceNames.USE_PROJECT_SETTINGS, true);
            }
        }
    }

    @SuppressWarnings("deprecation")
    protected IScopeContext[] createPreferenceScopes(IProject project) {
        if (project != null) {
            return new IScopeContext[]{new ProjectScope(project), new InstanceScope(), new DefaultScope()};
        }
        return new IScopeContext[]{new InstanceScope(), new DefaultScope()};
    }

    private Element createModule(Namespace ns, String identifier, String implClass) {
        Element newModule = new Element("module", ns); //$NON-NLS-1$
        newModule.setAttribute("identifier", identifier); //$NON-NLS-1$
        newModule.setAttribute("implClass", implClass); //$NON-NLS-1$
        return newModule;
    }

    private boolean switchyardExtensionExists(Element extensions) {
        List<?> extensionList = extensions.getChildren("extension", extensions.getNamespace()); //$NON-NLS-1$
        Iterator<?> extensionIter = extensionList.iterator();
        while (extensionIter.hasNext()) {
            Element extension = (Element) extensionIter.next();
            if (extension.getAttribute("module") != null //$NON-NLS-1$
                    && extension.getAttributeValue("module").equalsIgnoreCase("org.switchyard")) { //$NON-NLS-1$ //$NON-NLS-2$
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
                    && subsystem.getNamespace().getURI().equalsIgnoreCase("urn:jboss:domain:switchyard:1.0")) { //$NON-NLS-1$
                return true;
            }
        }
        return false;
    }

    private boolean isOpenShiftProject(IProject project) throws CoreException {
        if (project == null) {
            return false;
        }

        IFolder openshiftFolder = project.getFolder(".openshift"); //$NON-NLS-1$
        if (openshiftFolder != null) {
            IFile configFile = openshiftFolder.getFolder("config").getFile("standalone.xml"); //$NON-NLS-1$ //$NON-NLS-2$
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

        IFolder openshiftFolder = project.getFolder(".openshift"); //$NON-NLS-1$
        if (openshiftFolder != null) {
            IFile configFile = openshiftFolder.getFolder("config").getFile("standalone.xml"); //$NON-NLS-1$ //$NON-NLS-2$

            SAXBuilder builder = new SAXBuilder();
            File xmlFile = new File(configFile.getLocationURI());
            
            if (!xmlFile.exists()) {
                return;
            }

            try {
                Document doc = (Document) builder.build(xmlFile);
                Element rootNode = doc.getRootElement();

                boolean madeChanges = false;
                Element extensions = rootNode.getChild("extensions", rootNode.getNamespace()); //$NON-NLS-1$

                if (extensions != null) {
                    if (!switchyardExtensionExists(extensions)) {
                        Element sy_extension = new Element("extension", extensions.getNamespace()); //$NON-NLS-1$
                        sy_extension.setAttribute("module", "org.switchyard"); //$NON-NLS-1$ //$NON-NLS-2$
                        extensions.addContent(sy_extension);
                        madeChanges = true;
                    }
                }

                Element profiles = rootNode.getChild("profile", rootNode.getNamespace()); //$NON-NLS-1$

                if (profiles != null) {
                    if (!switchyardSubsystemExists(profiles)) {
                        Namespace syNamespace = Namespace.getNamespace("urn:jboss:domain:switchyard:1.0"); //$NON-NLS-1$
                        Element sySubsystem = new Element("subsystem", syNamespace); //$NON-NLS-1$
                        Element syModules = new Element("modules", syNamespace); //$NON-NLS-1$
                        Element beanModule = createModule(syNamespace, "org.switchyard.component.bean", //$NON-NLS-1$
                                "org.switchyard.component.bean.deploy.BeanComponent"); //$NON-NLS-1$
                        syModules.addContent(beanModule);
                        Element soapModule = createModule(syNamespace, "org.switchyard.component.soap", //$NON-NLS-1$
                                "org.switchyard.component.soap.deploy.SOAPComponent"); //$NON-NLS-1$
                        syModules.addContent(soapModule);
                        Element camelModule = createModule(syNamespace, "org.switchyard.component.camel.core", //$NON-NLS-1$
                                "org.switchyard.component.camel.core.deploy.CamelCoreComponent"); //$NON-NLS-1$
                        syModules.addContent(camelModule);
                        Element rulesModule = createModule(syNamespace, "org.switchyard.component.rules", //$NON-NLS-1$
                                "org.switchyard.component.rules.deploy.RulesComponent"); //$NON-NLS-1$
                        syModules.addContent(rulesModule);
                        Element bpmModule = createModule(syNamespace, "org.switchyard.component.bpm", //$NON-NLS-1$
                                "org.switchyard.component.bpm.deploy.BPMComponent"); //$NON-NLS-1$
                        syModules.addContent(bpmModule);
                        Element bpelModule = createModule(syNamespace, "org.switchyard.component.bpel", //$NON-NLS-1$
                                "org.switchyard.component.bpel.deploy.BPELComponent"); //$NON-NLS-1$
                        syModules.addContent(bpelModule);
                        Element restModule = createModule(syNamespace, "org.switchyard.component.resteasy", //$NON-NLS-1$
                                "org.switchyard.component.resteasy.deploy.RESTEasyComponent"); //$NON-NLS-1$
                        syModules.addContent(restModule);
                        Element httpModule = createModule(syNamespace, "org.switchyard.component.http", //$NON-NLS-1$
                                "org.switchyard.component.http.deploy.HttpComponent"); //$NON-NLS-1$
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
