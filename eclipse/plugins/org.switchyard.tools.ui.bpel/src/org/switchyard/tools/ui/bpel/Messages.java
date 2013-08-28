package org.switchyard.tools.ui.bpel;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "org.switchyard.tools.ui.bpel.messages"; //$NON-NLS-1$
    public static String BPELComponentFactory_typeName;
    public static String BPELComponentTypeExtension_componentToolItemDescription;
    public static String BPELComponentTypeExtension_componentToolItemName;
    public static String BPELComponentTypeExtension_featureDescription;
    public static String BPELComponentTypeExtension_featureName;
    public static String BPELComponentTypeExtension_implementationToolItemDescription;
    public static String BPELComponentTypeExtension_implementationToolItemName;
    public static String BPELComponentTypeExtension_typeName;
    public static String BPELComponentWizard_errorMessageCreatingBPELFile;
    public static String BPELComponentWizard_errorMessageCreatingBPELService;
    public static String BPELComponentWizard_errorMessageOpeningBPELFile;
    public static String BPELComponentWizard_wizardPageDescription;
    public static String BPELComponentWizard_wizardPageTitle;
    public static String BPELImplementationComposite_browseBPELFileButton;
    public static String BPELImplementationComposite_newBPELFileLinkLabel;
    public static String BPELImplementationPropertySection_textLabel;
    public static String BPELImplementationPropertySection_browseButtonLabel;
    public static String BPELImplementationWizardPage_browseBPELFileButton;
    public static String BPELImplementationWizardPage_errorMessageSelectBPELFile;
    public static String BPELImplementationWizardPage_newBPELFileLinkLabel;
    public static String BPELImplementationWizardPage_wizardPageDescription;
    public static String BPELImplementationWizardPage_wizardPageTitle;
    public static String BPELProcessDetailsWizardPage_errorMessageSpecifyName;
    public static String BPELProcessDetailsWizardPage_errorMessageSpecifyNamespace;
    public static String BPELProcessDetailsWizardPage_processNameLabel;
    public static String BPELProcessDetailsWizardPage_processNamespaceLabel;
    public static String BPELProcessDetailsWizardPage_wizardPageDescription;
    public static String BPELProcessDetailsWizardPage_wizardPageTitle;
    public static String NewBPELFileUtils_errorMessage_messageContainsMoreThanOnePart;
    public static String NewBPELFileUtils_errorMessage_messageNotFound;
    public static String NewBPELFileUtils_errorMessage_xmlTypeCouldNotBeSetForVariable;
    public static String NewBPELFileUtils_exception_wsdlFileCouldNotBeImportedInProject;
    public static String NewBPELFileUtils_exception_wsdlFileNotFoundAfterImport;
    public static String NewBPELFileUtils_subtaskName_generatingBPELFile;
    public static String NewBPELFileUtils_subtaskName_generatingWSDLForArtifacts;
    public static String NewBPELFileUtils_taskName_creatingResourcesFromWSDL;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
