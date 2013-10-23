/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.ElementHandlerImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl
 * @generated
 */
public class SwitchyardResourceFactoryImpl extends ResourceFactoryImpl {

    /** The Content type identifier for switchyard.xml files. */
    public static final String CONTENT_TYPE = "org.switchyard.content-type.1.x";

    /**
     * Creates an instance of the resource factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
    public SwitchyardResourceFactoryImpl() {
        super();
    }

    /**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public Resource createResource(URI uri) {
        XMLResource result = new SwitchyardResourceImpl(uri);
        ExtendedMetaData emd = new NamespaceVersionConverter();
        result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, emd);
        result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, emd);

        // result.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
        result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

        result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);

        // added
        result.getDefaultLoadOptions().put(XMLResource.OPTION_DOM_USE_NAMESPACES_IN_SCOPE, Boolean.TRUE);
        // result.getDefaultLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
        result.getDefaultLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        result.getDefaultLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

        result.getDefaultSaveOptions().put(XMLResource.OPTION_ELEMENT_HANDLER, new ElementHandlerImpl(true));
        result.getDefaultSaveOptions().put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);

        return result;
    }

    /**
     * This class converts between the namespaces used in the instance document
     * and those namespaces used in the model. The namespace stored in the
     * extended metadata for the model objects should always be the model
     * namespace. The namespace used during de/serialization should always be
     * the instance namespace.
     */
    public static final class NamespaceVersionConverter extends BasicExtendedMetaData {

        private static final String MODEL_NAMESPACE_VERSION;
        // notice the version is pegged to 1.x
        private static final Pattern SWITCHYARD_NAMESPACE_PATTERN = Pattern
                .compile("(urn:switchyard-(config:|component-).*?:)(1\\.\\d+(\\.\\d+)*)$");
        private static final int NAMESPACE_TYPE_GROUP = 1;
        private static final int NAMESPACE_VERSION_GROUP = 3;

        private String _version;

        private NamespaceVersionConverter() {
            super();
        }

        /**
         * @return the namespace version being used by this resource
         */
        public String getVersion() {
            return _version;
        }
        
        /**
         * This method must be called after the resource is loaded, but before
         * saving the resource.
         * 
         * @param version the namespace version to use for this resource
         */
        public void setVersion(String version) {
            _version = version;
        }

        @Override
        public EPackage getPackage(String namespace) {
            // we're given the instance namespace
            return super.getPackage(convertToModelNamespace(namespace));
        }

        @Override
        public EPackage demandPackage(String namespace) {
            // we're given the instance namespace
            return super.demandPackage(convertToModelNamespace(namespace));
        }

        /*
         * copied from super with a modification which converts the group
         * namespace to the namespace being used by the instance document.
         */
        @Override
        protected EStructuralFeature basicGetGroup(EStructuralFeature eStructuralFeature) {
            EAnnotation eAnnotation = getAnnotation(eStructuralFeature, false);
            if (eAnnotation != null) {
                String qualifiedName = eAnnotation.getDetails().get("group");
                if (qualifiedName != null) {
                    int fragmentIndex = qualifiedName.lastIndexOf('#');
                    if (fragmentIndex == -1) {
                        return getElement(eStructuralFeature.getEContainingClass(), getNamespace(eStructuralFeature
                                .getEContainingClass().getEPackage()), qualifiedName);
                    } else if (fragmentIndex == 0) {
                        return getElement(eStructuralFeature.getEContainingClass(), null, qualifiedName.substring(1));
                    } else {
                        /*
                         * need to convert the namespace to the version used in
                         * the instance document.
                         */
                        return getElement(eStructuralFeature.getEContainingClass(),
                                convertToInstanceNamespace(qualifiedName.substring(0, fragmentIndex)), qualifiedName.substring(fragmentIndex + 1));
                    }
                }
            }
            return null;
        }

        /*
         * copied from super with a modification which converts the affiliated
         * namespace to the namespace being used by the instance document.
         */
        @Override
        protected EStructuralFeature basicGetAffiliation(EStructuralFeature eStructuralFeature) {
            EAnnotation eAnnotation = getAnnotation(eStructuralFeature, false);
            if (eAnnotation != null) {
                String qualifiedName = eAnnotation.getDetails().get("affiliation");
                if (qualifiedName != null) {
                    int fragmentIndex = qualifiedName.lastIndexOf('#');
                    if (fragmentIndex == -1) {
                        return getElement(getNamespace(eStructuralFeature.getEContainingClass().getEPackage()),
                                qualifiedName);
                    } else if (fragmentIndex == 0) {
                        return getElement(null, qualifiedName.substring(1));
                    } else {
                        /*
                         * need to convert the namespace to the version used in
                         * the instance document.
                         */
                        return getElement(convertToInstanceNamespace(qualifiedName.substring(0, fragmentIndex)),
                                qualifiedName.substring(fragmentIndex + 1));
                    }
                }
            }
            return null;
        }

        @Override
        public String getNamespace(EPackage ePackage) {
            return convertToInstanceNamespace(super.getNamespace(ePackage));
        }

        @Override
        public String getNamespace(EStructuralFeature eStructuralFeature) {
            return convertToInstanceNamespace(super.getNamespace(eStructuralFeature));
        }

        @Override
        public void setNamespace(EStructuralFeature eStructuralFeature, String namespace) {
            // we need to ensure the model namespace is set on the feature.
            super.setNamespace(eStructuralFeature, convertToModelNamespace(namespace));
        }

        @Override
        public String basicGetNamespace(EStructuralFeature eStructuralFeature) {
            /*
             * ensure the model namespace is returned. this will get converted
             * back to the instance namespace through one of the above
             * getNamespace() methods.
             */
            return convertToModelNamespace(super.basicGetNamespace(eStructuralFeature));
        }

        private String convertToInstanceNamespace(final String modelNamespace) {
            if (_version != null && modelNamespace != null) {
                final Matcher matcher = SWITCHYARD_NAMESPACE_PATTERN.matcher(modelNamespace);
                if (matcher.matches()) {
                    return matcher.group(NAMESPACE_TYPE_GROUP) + _version;
                }
            }
            return modelNamespace;
        }

        private String convertToModelNamespace(final String namespace) {
            if (namespace == null) {
                return null;
            }
            final Matcher matcher = SWITCHYARD_NAMESPACE_PATTERN.matcher(namespace);
            if (matcher.matches()) {
                if (_version == null) {
                    /*
                     * stow away this version so we can use it when we write out
                     * the document
                     */
                    _version = matcher.group(NAMESPACE_VERSION_GROUP);
                }
                return matcher.group(NAMESPACE_TYPE_GROUP) + MODEL_NAMESPACE_VERSION;
            }
            return namespace;
        }

        static {
            final Matcher matcher = SWITCHYARD_NAMESPACE_PATTERN.matcher(SwitchyardPackage.eNS_URI);
            if (matcher.matches()) {
                MODEL_NAMESPACE_VERSION = matcher.group(NAMESPACE_VERSION_GROUP);
            } else {
                EcorePlugin
                        .getPlugin()
                        .getLog()
                        .log(new Status(Status.WARNING, "org.switchyard.tools.models.switchyard1_0",
                                "Unable to determine namespace version used by default SwitchYard EMF model.  Defaulting to 1.0."));
                MODEL_NAMESPACE_VERSION = "1.0";
            }
        }
    }
} // SwitchyardResourceFactoryImpl
