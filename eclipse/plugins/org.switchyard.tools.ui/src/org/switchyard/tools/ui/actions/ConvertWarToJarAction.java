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
package org.switchyard.tools.ui.actions;

import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.SWITCHYARD_FACET;
import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.SWITCHYARD_JAR_PRESET_ID;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.project.IProjectConfigurationManager;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.project.facet.core.IDynamicPreset;
import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.eclipse.wst.common.project.facet.core.IFacetedProjectWorkingCopy;
import org.eclipse.wst.common.project.facet.core.IPreset;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;
import org.eclipse.wst.common.project.facet.ui.ModifyFacetedProjectWizard;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.explorer.ISwitchYardNode;
import org.switchyard.tools.ui.facets.ISwitchYardFacetConstants;
import org.switchyard.tools.ui.facets.SwitchYardFacetInstallWizardPage;

/**
 * ConvertWarToJarAction
 * 
 * <p/>
 * Action implementation for changing the project pom to use JAR packaging instead
 * of WAR packaging along with all the other changes requried by SwitchYardSettingsAction.
 * 
 * @author brianf
 */
public class ConvertWarToJarAction extends SwitchYardSettingsAction {

    private IProject _project;
    private IWorkbenchPart _targetPart;

    @Override
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
        _targetPart = targetPart;
    }

    @Override
    public void run(IAction action) {
        try {
            internalRun();
        } catch (CoreException e) {
            Activator.getDefault().getLog().log(e.getStatus());
        }
    }

    private void internalRun() throws CoreException {
        if (_project == null || _targetPart == null) {
            return;
        }

        // check to see if this is a faceted project
        IFacetedProject ifp = ProjectFacetsManager.create(_project);
        if (ifp == null) {
            // prompt user to add SwitchYard and convert to faceted project.
            if (MessageDialog
                    .openQuestion(
                            _targetPart.getSite().getShell(),
                            "Add SwitchYard Capabilities?",
                            "The selected project is not a SwitchYard project.\n\nDo you wish to add SwitchYard capabilities?\n\n* Note, this will convert the project to Faceted Form.")) {
                convertToFacetedProject();
                updateOpenShiftProject();
            }
            return;
        } else if (!ifp.hasProjectFacet(SWITCHYARD_FACET)) {
            // check to see if SwitchYard is installed
            if (MessageDialog.openQuestion(_targetPart.getSite().getShell(), "Add SwitchYard Capabilities?",
                    "The selected project is not a SwitchYard project.\n\nDo you wish to add SwitchYard capabilities?")) {
                installSwitchYardFacet(ifp.createWorkingCopy());
                updateOpenShiftProject();
            }
            return;
        }
        
        displayPropertyDialog();
    }

    private void convertToFacetedProject() throws CoreException {
        IFacetedProject ifp = ProjectFacetsManager.create(_project, true, new NullProgressMonitor());
        removeOpenShiftFacets(ifp.createWorkingCopy());
        installSwitchYardFacet(ifp.createWorkingCopy());
    }
    
    private void removeOpenShiftFacets(final IFacetedProjectWorkingCopy fpwc) throws CoreException {
        IFacetedProject ifp = ProjectFacetsManager.create(_project, true, new NullProgressMonitor());
        Set<IProjectFacetVersion> ipfvs = ifp.getProjectFacets();
        for (IProjectFacetVersion pf : ipfvs) {
            String id = pf.getProjectFacet().getId();
            if (!(id.equalsIgnoreCase("jboss.m2") || id.equalsIgnoreCase("java") || id.equalsIgnoreCase("jst.cdi"))) {
//                System.out.println("Removing: " + pf.getProjectFacet().getId());
                fpwc.removeProjectFacet(pf);
            }
        }
    }

    private void installSwitchYardFacet(final IFacetedProjectWorkingCopy fpwc) {
        try {
            removeOpenShiftFacets(fpwc);
            
            final String installPresetId  = SWITCHYARD_JAR_PRESET_ID;
            IPreset preset = ProjectFacetsManager.getPreset(installPresetId);
            if (preset instanceof IDynamicPreset) {
                final Map<String, Object> context = new HashMap<String, Object>();
                context.put(IDynamicPreset.CONTEXT_KEY_FACETED_PROJECT, fpwc);
                context.put(IDynamicPreset.CONTEXT_KEY_PRIMARY_RUNTIME, fpwc.getPrimaryRuntime());
                context.put(IDynamicPreset.CONTEXT_KEY_FIXED_FACETS, fpwc.getFixedProjectFacets());
                preset = ((IDynamicPreset) preset).resolve(context);
            }
            if (preset == null) {
                MessageDialog.openError(_targetPart.getSite().getShell(), "Error Installing SwitchYard Facet",
                        "Failed to install SwitchYard facet on project.");
                return;
            }
            // this should setup the java facet correctly
            for (IProjectFacetVersion pfv : preset.getProjectFacets()) {
                fpwc.addProjectFacet(pfv);
            }
            if (fpwc.getProjectFacetAction(SWITCHYARD_FACET) != null) {
                Object config = fpwc.getProjectFacetAction(SWITCHYARD_FACET).getConfig();
                if (config instanceof IDataModel
                        && !((IDataModel) config).isPropertySet(ISwitchYardFacetConstants.RUNTIME_VERSION)) {
                    // display the wizard if the project doesn't have SY
                    // capabilities
                    ModifyFacetedProjectWizard modifyWizard = new ModifyFacetedProjectWizard(fpwc) {
                        @Override
                        public IWizardPage[] getPages() {
                            // we only need to configure switchyard
                            for (IWizardPage page : super.getPages()) {
                                if (page instanceof SwitchYardFacetInstallWizardPage) {
                                    return new IWizardPage[] {page };
                                }
                            }
                            return new IWizardPage[0];
                        }
                    };
                    modifyWizard.setShowFacetsSelectionPage(false);
                    WizardDialog dialog = new WizardDialog(_targetPart.getSite().getShell(), modifyWizard);
                    dialog.setBlockOnOpen(true);
                    dialog.open();
                    // no need to go to open the property page, since the user
                    // just edited the settings
                    return;
                }
            }

            // install the facet
            try {
                PlatformUI.getWorkbench().getProgressService().run(false, true, new IRunnableWithProgress() {
                    @Override
                    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                        try {
                            fpwc.commitChanges(monitor);
                        } catch (CoreException e) {
                            throw new InvocationTargetException(e);
                        }
                    }
                });
            } catch (Exception e) {
                if (e.getCause() instanceof CoreException) {
                    Activator.getDefault().getLog().log(((CoreException) e.getCause()).getStatus());
                } else {
                    Activator
                            .getDefault()
                            .getLog()
                            .log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error initializing SwitchYard facet.",
                                    e));
                }
            }
            displayPropertyDialog();
        } catch (CoreException e1) {
            if (e1.getCause() instanceof CoreException) {
                Activator.getDefault().getLog().log(((CoreException) e1.getCause()).getStatus());
            } else {
                Activator
                        .getDefault()
                        .getLog()
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error initializing SwitchYard facet.",
                                e1));
            }
        } finally {
            fpwc.dispose();
        }
    }

    @Override
    public void selectionChanged(IAction action, ISelection selection) {
        super.selectionChanged(action, selection);
        _project = null;
        if (selection.isEmpty() || !(selection instanceof IStructuredSelection)) {
            return;
        }
        Object obj = ((IStructuredSelection) selection).getFirstElement();
        if (obj instanceof IProject) {
            _project = (IProject) obj;
        } else if (obj instanceof ISwitchYardNode) {
            _project = ((ISwitchYardNode) obj).getRoot().getProject();
        }
    }

    @Override
    public void dispose() {
        _project = null;
        _targetPart = null;
        super.dispose();
    }

    private void displayPropertyDialog() {
        // display project properties dialog, open to SwitchYard Settings
        PreferencesUtil.createPropertyDialogOn(_targetPart.getSite().getShell(), _project,
                "org.switchyard.tools.ui.configuration.page", null, null, PreferencesUtil.OPTION_NONE).open();
    }

    /*
     * Refresh the POM and rebuild the project.
     */
    private void updateProject(IProject project, int waitTime) throws Exception {    
        
        IProjectConfigurationManager configurationManager = MavenPlugin.getProjectConfigurationManager();
        NullProgressMonitor monitor = new NullProgressMonitor();
        configurationManager.updateProjectConfiguration(project, monitor);
        
        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        if (waitTime > 0) {
          Thread.sleep(waitTime);
        }
    }
    
    private Element warProfileExists(Element profiles, Namespace ns) {
        List<?> profileList = profiles.getChildren();
        Iterator<?> profileIter = profileList.iterator();
        while (profileIter.hasNext()) {
            Element profile = (Element) profileIter.next();
            Element build = profile.getChild("build", ns);
            Element plugins = build.getChild("plugins", ns);
            
            List<?> pluginList = plugins.getChildren();
            Iterator<?> pluginIter = pluginList.iterator();
            while (pluginIter.hasNext()) {
                Element plugin = (Element) pluginIter.next();
                Element artifactId = plugin.getChild("artifactId", ns);
                if (artifactId.getText().equalsIgnoreCase("maven-war-plugin")) {
                    return plugin;
                }
            }
        }
        return null;
    }
    
    private void updateOpenShiftProject() {
        // update maven pom from war to jar
        try {
            PlatformUI.getWorkbench().getProgressService().run(false, true, new IRunnableWithProgress() {
                @Override
                public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                    try {
                        handlePOMUpdates();
                    } catch (CoreException e) {
                        throw new InvocationTargetException(e);
                    }
                }
            });
        } catch (Exception e) {
            if (e.getCause() instanceof CoreException) {
                Activator.getDefault().getLog().log(((CoreException) e.getCause()).getStatus());
            } else {
                Activator
                        .getDefault()
                        .getLog()
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error POM for SwitchYard project.",
                                e));
            }
        }
    }

    private void handlePOMUpdates() throws CoreException {
        // looked into doing this with m2e APIs but the POM editing APIs are all internal
        if (_project == null || _targetPart == null) {
            return;
        }

        IFile pomFile = _project.getFile("pom.xml");
        if (pomFile != null) {
            SAXBuilder builder = new SAXBuilder();
            File xmlFile = new File(pomFile.getLocationURI());

            try {
                Document doc = (Document) builder.build(xmlFile);
                Element rootNode = doc.getRootElement();

                boolean madeChanges = false;
                Element packagingNode = rootNode.getChild("packaging", rootNode.getNamespace());

                if (packagingNode != null && packagingNode.getText().equalsIgnoreCase("war")) {
                    packagingNode.setText("jar");
                    madeChanges = true;
                }

                Element profiles = rootNode.getChild("profiles", rootNode.getNamespace());

                if (profiles != null) {
                    Element plugin = warProfileExists(profiles, rootNode.getNamespace());
                    if (plugin != null) {
                        Element artifactId = plugin.getChild("artifactId", rootNode.getNamespace());
                        if (artifactId.getText().equalsIgnoreCase("maven-war-plugin")) {
                            artifactId.setText("maven-jar-plugin");
                            Element version = plugin.getChild("version", rootNode.getNamespace());
                            if (version != null) {
                                // set the version
                                version.setText("2.3.1");
                            }
                            Element configuration = plugin.getChild("configuration", rootNode.getNamespace());
                            if (configuration != null) {
                                // remove this
                                configuration.removeChild("warName", rootNode.getNamespace());
                            }
                            madeChanges = true;
                        }
                    }
                }
                if (madeChanges) {
                    XMLOutputter xmlOutput = new XMLOutputter();

                    // display nicely
                    xmlOutput.setFormat(Format.getPrettyFormat());
                    xmlOutput.output(doc, new FileWriter(xmlFile.getAbsolutePath()));

                    _project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
                    updateProject(_project, -1);
                }
            } catch (JDOMException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
