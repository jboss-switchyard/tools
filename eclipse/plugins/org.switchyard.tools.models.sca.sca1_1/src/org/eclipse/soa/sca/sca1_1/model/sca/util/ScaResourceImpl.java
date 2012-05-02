/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.util;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.xml.sax.helpers.DefaultHandler;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.soa.sca.sca1_1.model.sca.util.ScaResourceFactoryImpl
 * @generated
 */
public class ScaResourceImpl extends XMLResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated NOT
	 */
	public ScaResourceImpl(URI uri) {
		super(uri);
		eObjectToIDMap = new HashMap<EObject, String>();
		idToEObjectMap = new HashMap<String, EObject>();
	}

    @Override
    protected XMLLoad createXMLLoad() {
        return new XMLLoadImpl(createXMLHelper()) {
            @Override
            protected DefaultHandler makeDefaultHandler() {
                return new SAXXMLHandler(resource, helper, options) {
                    @Override
                    protected void setValueFromId(EObject object, EReference eReference, String ids) {
                        if (eReference == ScaPackage.eINSTANCE.getService_Promote()) {
                            int sep = ids.indexOf('/');
                            if (sep > 0) {
                                ids = ids.replace('/', ':');
                            } else {
                                ids = ':' + ids;
                            }
                            ids = "#ComponentService:" + ids;
                        } else if (eReference == ScaPackage.eINSTANCE.getReference_Promote()) {
                            int sep = ids.indexOf('/');
                            if (sep > 0) {
                                ids = ids.replace('/', ':');
                            } else {
                                ids = ':' + ids;
                            }
                            ids = "#ComponentReference:" + ids;
                        }
                        super.setValueFromId(object, eReference, ids);
                    }

                    @Override
                    protected void processObject(EObject object) {
                        super.processObject(object);
                        final EClass objectClass = object.eClass();
                        if (objectClass == ScaPackage.eINSTANCE.getComponentService()
                                || objectClass == ScaPackage.eINSTANCE.getComponentReference()) {
                            String id = EcoreUtil.getID(object);
                            if (id == null) {
                                return;
                            }
                            setID(object, id);
                            id = id.substring(0, id.indexOf(':') + 1) + id.substring(id.lastIndexOf(':'));
                            if (getEObjectByID(id) == null) {
                                getIDToEObjectMap().put(id, object);
                            } else {
                                getIDToEObjectMap().remove(id);
                            }
                        }
                    }
                };
            }
        };
    }

    @Override
    protected XMLHelper createXMLHelper() {
        return new XMLHelperImpl(this) {
            @Override
            public String getIDREF(EObject obj) {
                // get the "correct" id's for promote fields
                if (obj.eClass() == ScaPackage.eINSTANCE.getComponentService()) {
                	if (obj.eContainer() == null || 
                			obj.eContainer().eContainer() == null || 
                			((Component) obj.eContainer()).getName() == null) {
                		return null;
                	}
                    return ((Component) obj.eContainer()).getName() + '/' + ((ComponentService) obj).getName();
                } else if (obj.eClass() == ScaPackage.eINSTANCE.getComponentReference()) {
                	if (obj.eContainer() == null || 
                			obj.eContainer().eContainer() == null || 
                				((Component) obj.eContainer()).getName() == null) {
                		return null;
                	}
                    return ((Component) obj.eContainer()).getName() + '/' + ((ComponentReference) obj).getName();
                }

                return super.getIDREF(obj);
            }

            @Override
            public String getID(EObject obj) {
                if (obj.eClass() == ScaPackage.eINSTANCE.getComponentService()
                        || obj.eClass() == ScaPackage.eINSTANCE.getComponentReference()) {
                    // don't persist id fields for component services or
                    // references
                    return null;
                }
                return super.getID(obj);
            }

            /**
             * if the prefix is not set, use the default prefix for the package
             * instead of _#.
             */
            @Override
            protected void addNSDeclaration(String prefix, String uri) {
                if (prefix == null || prefix.length() == 0) {
                    final EPackage nsEPackage = EPackage.Registry.INSTANCE.getEPackage(uri);
                    if (nsEPackage != null) {
                        prefix = getPrefix(nsEPackage);
                    }
                }
                super.addNSDeclaration(prefix, uri);
            }

        };
    }

} //ScaResourceImpl
