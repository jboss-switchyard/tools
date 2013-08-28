/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.wizards;

import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.wst.wsdl.Binding;
import org.eclipse.wst.wsdl.Port;
import org.eclipse.wst.wsdl.Service;
import org.eclipse.wst.wsdl.internal.generator.BindingGenerator;
import org.eclipse.wst.wsdl.internal.impl.DefinitionImpl;
import org.eclipse.wst.wsdl.internal.impl.WSDLFactoryImpl;
import org.eclipse.wst.wsdl.ui.internal.Messages;
import org.eclipse.wst.wsdl.ui.internal.WSDLEditorPlugin;
import org.eclipse.wst.wsdl.ui.internal.asd.contentgenerator.ui.extension.ContentGeneratorUIExtension;
import org.eclipse.wst.wsdl.ui.internal.asd.contentgenerator.ui.extension.ContentGeneratorUIExtensionRegistry;
import org.eclipse.wst.wsdl.ui.internal.util.ComponentReferenceUtil;
import org.eclipse.wst.wsdl.ui.internal.util.CreateWSDLElementHelper;
import org.eclipse.wst.wsdl.ui.internal.wizards.NewWSDLWizard;
import org.eclipse.wst.wsdl.ui.internal.wizards.WSDLNewFileOptionsPage;
import org.eclipse.wst.wsdl.ui.internal.wizards.WSDLNewFilePage;
import org.eclipse.wst.wsdl.util.WSDLResourceImpl;
import org.eclipse.wst.xml.core.internal.contentmodel.util.NamespaceInfo;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings({"restriction" })
public class NewWSDLFileWizard extends NewWSDLWizard {

    private static final String DOT_WSDL = ".wsdl"; //$NON-NLS-1$
    private String _createdFilePath = null;
    private WSDLFileCreationPage _filePage = null;
    private WSDLNewFileOptionsPage _optionsPage;
    private BindingGenerator _generator;
    private String _initialName = null;
    private IStructuredSelection _selection = null;
    private IFile _fNewFile = null;
    private boolean _fOpenEditorWhenFinished = false;

    /**
     * Overridden new wsdl file wizard so we can set the initial filename.
     */
    public NewWSDLFileWizard() {
        super();
        _generator = new BindingGenerator(null, null);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard#performFinish
     * ()
     */
    @Override
    public boolean performFinish() {
        if (_filePage != null) {
            _fNewFile = _filePage.createNewFile();
            if (_fNewFile == null) {
                return false;
            }

            String charSet = "UTF-8"; //$NON-NLS-1$
            String wsdlPrefix = "wsdl"; //$NON-NLS-1$
            Vector<?> namespaces = _optionsPage.getNamespaceInfo();

            String prefix = _optionsPage.getPrefix();
            String definitionName = _optionsPage.getDefinitionName();

            URI uri2 = URI.createPlatformResourceURI(_fNewFile.getFullPath().toOSString(), false);
            ResourceSet resourceSet = new ResourceSetImpl();
            WSDLResourceImpl resource = (WSDLResourceImpl) resourceSet.createResource(URI.createURI("*.wsdl")); //$NON-NLS-1$
            resource.setURI(uri2);

            WSDLFactoryImpl factory = new WSDLFactoryImpl();
            DefinitionImpl definition = (DefinitionImpl) factory.createDefinition();
            resource.getContents().add(definition);

            definition.setTargetNamespace(_optionsPage.getTargetNamespace());
            definition.setLocation(_fNewFile.getLocation().toString());
            definition.setEncoding(charSet);
            definition.setQName(new QName(wsdlPrefix, definitionName));
            definition.addNamespace(prefix, _optionsPage.getTargetNamespace());

            for (int i = 0; i < namespaces.size(); i++) {
                NamespaceInfo info = (NamespaceInfo) namespaces.get(i);

                if (info.prefix.length() > 0) {
                    definition.addNamespace(info.prefix, info.uri);
                } else {
                    definition.addNamespace(null, info.uri);
                }
            }

            definition.updateElement(true);
            try {
                if (_optionsPage.getCreateSkeletonBoolean()) {
                    if (_optionsPage.isSoapDocLiteralProtocol()) {
                        CreateWSDLElementHelper.PART_TYPE_OR_DEFINITION = CreateWSDLElementHelper.PART_INFO_ELEMENT_DECLARATION;
                    } else {
                        CreateWSDLElementHelper.PART_TYPE_OR_DEFINITION = CreateWSDLElementHelper.PART_INFO_TYPE_DEFINITION;
                    }

                    CreateWSDLElementHelper.serviceName = definitionName;

                    // use protocol name (as opposed to protocol label) in port
                    // name
                    String protocolName = new String();
                    String protocol = _optionsPage.getProtocol();
                    ContentGeneratorUIExtensionRegistry registry = WSDLEditorPlugin.getInstance()
                            .getContentGeneratorUIExtensionRegistry();
                    ContentGeneratorUIExtension extension = registry.getExtensionForLabel(protocol);
                    if (extension != null) {
                        protocolName = extension.getName();
                    }
                    CreateWSDLElementHelper.portName = definitionName + protocolName;
                    createPortType(definitionName, wsdlPrefix, prefix, charSet, factory);

                    Service service = CreateWSDLElementHelper.createService(definition);

                    // Generate Binding
                    Iterator<?> bindingIt = definition.getEBindings().iterator();
                    Binding binding = null;
                    if (bindingIt.hasNext()) {
                        binding = (Binding) bindingIt.next();
                    }

                    _generator.setDefinition(definition);
                    _generator.setBinding(binding);
                    Port port = (Port) service.getEPorts().iterator().next();
                    _generator.setName(ComponentReferenceUtil.getName(port.getEBinding()));
                    _generator.setRefName(ComponentReferenceUtil.getPortTypeReference(port.getEBinding()));
                    _generator.setOverwrite(true);
                    _generator.generateBinding();
                    _generator.generatePortContent();
                }
                resource.save(null);
            } catch (Exception e) {
                System.out.println("\nCould not write new WSDL file in WSDL Wizard: " + e); //$NON-NLS-1$
            }

            if (getSelection().getFirstElement() instanceof IPackageFragmentRoot) {
                IPackageFragmentRoot root = (IPackageFragmentRoot) getSelection().getFirstElement();
                IResource pkgresource = root.getResource();
                if (pkgresource == null) {
                    IJavaElement element = root.getParent();
                    pkgresource = element.getResource();
                }
                if (_fNewFile instanceof IFile) {
                    pkgresource = ((IFile) _fNewFile).getParent();
                }
                if (pkgresource instanceof IFolder) {
                    IFolder folder = (IFolder) pkgresource;
                    IFolder parent = (IFolder) folder.getParent();
                    _createdFilePath = _fNewFile.getProjectRelativePath()
                            .makeRelativeTo(parent.getProjectRelativePath()).toPortableString();
                }
            } else {
                _createdFilePath = _fNewFile.getProjectRelativePath().toPortableString();
            }

            if (_fOpenEditorWhenFinished) {
                openEditor(_fNewFile);
            }

            return true;
        }
        return false;
    }

    /**
     * @return the selection
     */
    public IStructuredSelection getSelection() {
        return this._selection;
    }

    /**
     * @return created file path
     */
    public String getCreatedFilePath() {
        return _createdFilePath;
    }

    /**
     * @param filename starting file name
     */
    public void setStartingFileName(String filename) {
        _initialName = filename;
    }

    /**
     * @return the initial filename
     */
    public String getStartingFileName() {
        return _initialName;
    }

    /**
     * @param flag true or false to open when file is created
     */
    public void setOpenOnFinish(boolean flag) {
        this._fOpenEditorWhenFinished = flag;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard#addPages()
     */
    @Override
    public void addPages() {
        _filePage = new WSDLFileCreationPage(getSelection());
        _optionsPage = new WSDLNewFileOptionsPage(Messages._UI_TITLE_OPTIONS, Messages._UI_TITLE_OPTIONS, null,
                _filePage); //$NON-NLS-1$ //$NON-NLS-2$
        _optionsPage.setBindingGenerator(_generator);
        addPage(_filePage);
        addPage(_optionsPage);
    }

    /**
     * @see org.eclipse.wst.wsdl.ui.internal.wizards.NewWSDLWizard#getNewFilePath()
     * @return the new file path
     */
    public IPath getNewFilePath() {
        String fileName = _filePage.getFileName();
        return fileName != null ? new Path(fileName) : null;
    }

    /**
     * @see org.eclipse.wst.wsdl.ui.internal.wizards.NewWSDLWizard#getNewFile()
     * @return new file created
     */
    public IFile getNewFile() {
        return _fNewFile;
    }

    /**
     * @see org.eclipse.wst.wsdl.ui.internal.wizards.NewWSDLWizard#canFinish()
     * @return boolean flag
     */
    public boolean canFinish() {
        if (_filePage.isPageComplete() && _optionsPage.isPageComplete()) {
            return true;
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard#init(org
     * .eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
     */
    @Override
    public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
        super.init(workbench, currentSelection);
        setWindowTitle(org.switchyard.tools.ui.i18n.Messages.NewWSDLFileWizard_wizardTitle);
        _selection = currentSelection;
    }

    private class WSDLFileCreationPage extends WSDLNewFilePage {

        public WSDLFileCreationPage(IStructuredSelection selection) {
            super(selection);
        }

        public void createControl(Composite parent) {
            // inherit default container and name specification widgets
            super.createControl(parent);

            if (getWizard() instanceof NewWSDLFileWizard) {
                NewWSDLFileWizard wizard = (NewWSDLFileWizard) getWizard();
                if (wizard.getStartingFileName() != null) {
                    this.setFileName(wizard.getStartingFileName());
                } else {
                    this.setFileName(computeDefaultFileName());
                }
            }
            setPageComplete(validatePage());
        }

        @Override
        protected void createAdvancedControls(Composite parent) {
            // empty - no controls
        }

        @Override
        protected IStatus validateLinkedResource() {
            return Status.OK_STATUS;
        }

        @Override
        protected void createLinkTarget() {
            // empty
        }
    }

    private void createPortType(String definitionName, String wsdlPrefix, String prefix, String charSet,
            WSDLFactoryImpl factory) throws IOException {
        IPreferenceStore preferenceStore = WSDLEditorPlugin.getInstance().getPreferenceStore();
        boolean createPortTypeInSeparateWSDL = preferenceStore
                .getBoolean(WSDLEditorPlugin.GENERATE_SEPARATE_INTERFACE_PREFERENCE_ID);
        if (createPortTypeInSeparateWSDL) {
            // Create the port type in another WSDL file
            CreateWSDLElementHelper.IMPORT_PORT_TYPE_FROM_ANOTHER_FILE = false;
            CreateWSDLElementHelper.portTypeName = definitionName;

            IFile portTypeFile = getIntfFile(_fNewFile);

            URI portTypeURI = URI.createPlatformResourceURI(portTypeFile.getFullPath().toOSString(), false);
            ResourceSet portTypeResourceSet = new ResourceSetImpl();
            WSDLResourceImpl portTypeResource = (WSDLResourceImpl) portTypeResourceSet.createResource(URI
                    .createURI("*.wsdl")); //$NON-NLS-1$
            portTypeResource.setURI(portTypeURI);

            DefinitionImpl portTypeDefinition = (DefinitionImpl) factory.createDefinition();
            portTypeResource.getContents().add(portTypeDefinition);

            String portTypeNamespace = getPortTypeDefaultTargetNamespace();
            portTypeDefinition.setTargetNamespace(portTypeNamespace);
            portTypeDefinition.setLocation(portTypeFile.getLocation().toString());
            portTypeDefinition.setEncoding(charSet);
            portTypeDefinition.setQName(new QName(wsdlPrefix, definitionName + getPortTypeFileSuffix()));
            portTypeDefinition.addNamespace(prefix, portTypeNamespace);
            portTypeDefinition.updateElement(true);
            CreateWSDLElementHelper.createPortType(portTypeDefinition);
            portTypeResource.save(null);

            CreateWSDLElementHelper.portTypeNamespace = portTypeDefinition.getTargetNamespace();
            CreateWSDLElementHelper.portTypePrefix = getPortTypeDefaultPrefix();
            CreateWSDLElementHelper.portTypeLocation = portTypeFile.getName();

            CreateWSDLElementHelper.IMPORT_PORT_TYPE_FROM_ANOTHER_FILE = true;
        } else {
            CreateWSDLElementHelper.portTypeName = null;
            CreateWSDLElementHelper.portTypeNamespace = null;
            CreateWSDLElementHelper.portTypePrefix = null;
            CreateWSDLElementHelper.portTypeLocation = null;
            CreateWSDLElementHelper.IMPORT_PORT_TYPE_FROM_ANOTHER_FILE = false;
        }
    }

    private String getPortTypeFileSuffix() {
        return WSDLEditorPlugin.getInstance().getPreferenceStore()
                .getString(WSDLEditorPlugin.INTERFACE_FILE_SUFFIX_PREFERENCE_ID);
    }

    private String getPortTypeDefaultPrefix() {
        return WSDLEditorPlugin.getInstance().getPreferenceStore()
                .getString(WSDLEditorPlugin.INTERFACE_PREFIX_PREFERENCE_ID);
    }

    private String getPortTypeDefaultTargetNamespace() {
        return WSDLEditorPlugin.getInstance().getPreferenceStore()
                .getString(WSDLEditorPlugin.INTERFACE_DEFAULT_TARGET_NAMESPACE_PREFERENCE_ID);
    }

    private IFile getIntfFile(IFile file) {
        String baseName = file.getFullPath().removeFileExtension().lastSegment();
        String suffix = getPortTypeFileSuffix() + DOT_WSDL;
        String fileName = baseName + suffix;
        IContainer parent = file.getParent();
        IFile result = parent.getFile(new Path(fileName));
        if (!result.exists()) {
            return result;
        }

        // compute a unique filename if needed
        for (int count = 1; count < 100; count++) {
            fileName = baseName + count + suffix;
            result = parent.getFile(new Path(fileName));
            if (!result.exists()) {
                break;
            }
        }

        return result;
    }
}
