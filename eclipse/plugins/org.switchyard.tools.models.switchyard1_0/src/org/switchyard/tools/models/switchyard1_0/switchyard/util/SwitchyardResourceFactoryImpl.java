/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.ElementHandlerImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl
 * @generated
 */
public class SwitchyardResourceFactoryImpl extends ResourceFactoryImpl {

    /** The Content type identifier for switchyard.xml files. */
    public static final String CONTENT_TYPE = "org.switchyard.tools.ui.editor.content-type.xml";

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
		result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		//result.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		
		// added
		result.getDefaultLoadOptions().put(XMLResource.OPTION_DOM_USE_NAMESPACES_IN_SCOPE, Boolean.TRUE);
        //result.getDefaultLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
        result.getDefaultLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);

        result.getDefaultSaveOptions().put(XMLResource.OPTION_ELEMENT_HANDLER, new ElementHandlerImpl(true));
        result.getDefaultSaveOptions().put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);

        return result;
	}

} //SwitchyardResourceFactoryImpl
