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
package org.switchyard.tools.ui.editor;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;

/**
 * @author bfitzpat
 *
 */
public class ImageProvider extends AbstractImageProvider {

    private static final String DOT16 = ".16";
    private static final String ICONS_16 = "icons/16/";
    private static final String PREFIX = ImageProvider.class.getPackage().getName() + ".";

    /** Image for Composite. **/
    public static final String IMG_16_COMPOSITE = PREFIX + Composite.class.getSimpleName().toLowerCase() + DOT16;
    
    /** Image for Implementation. **/
    public static final String IMG_16_IMPLEMENTATION_TYPE = PREFIX + Implementation.class.getSimpleName().toLowerCase()
            + DOT16;
    
    /** Image for Component. **/
    public static final String IMG_16_COMPONENT = PREFIX + Component.class.getSimpleName().toLowerCase() + DOT16;
    
    /** Image for Service. **/
    public static final String IMG_16_SERVICE = PREFIX + Service.class.getSimpleName().toLowerCase() + DOT16;
    
    /** Image for Reference. **/
    public static final String IMG_16_REFERENCE = PREFIX + Reference.class.getSimpleName().toLowerCase() + DOT16;
    
    /** Image for Component Service. **/
    public static final String IMG_16_COMPONENT_SERVICE = PREFIX + ComponentService.class.getSimpleName().toLowerCase()
            + DOT16;
    
    /** Image for Component Reference. **/
    public static final String IMG_16_COMPONENT_REFERENCE = PREFIX
            + ComponentReference.class.getSimpleName().toLowerCase() + DOT16;
    
    /** Image for Connection. **/
    public static final String IMG_16_CONNECTION = PREFIX + "connection" + DOT16;

    /** Image for Chain decorator. **/
    public static final String IMG_16_CHAIN = PREFIX + "binding" + DOT16;
    
    /** Image for Plus. **/
    public static final String IMG_16_PLUS = PREFIX + "plus" + DOT16;

    /** Image for Interface. **/
    public static final String IMG_16_INTERFACE = PREFIX + Interface.class.getSimpleName().toLowerCase() + DOT16;

    /** Image for Interface override. **/
    public static final String IMG_16_INTERFACE_OVERRIDE = PREFIX + Interface.class.getSimpleName().toLowerCase() + "plus" + DOT16;

    /** Image for SwitchYard override. **/
    public static final String IMG_16_SWITCHYARD = PREFIX + "SwitchYard" + DOT16;

    /** Image for synchronize command. **/
    public static final String IMG_16_SYNCHRONIZE = PREFIX + "synchronize" + DOT16;

    @Override
    protected void addAvailableImages() {
        addImageFilePath(IMG_16_COMPOSITE, ICONS_16 + "Composite.gif");
        addImageFilePath(IMG_16_COMPONENT, ICONS_16 + "Component.gif");
        addImageFilePath(IMG_16_SERVICE, ICONS_16 + "Service.gif");
        addImageFilePath(IMG_16_REFERENCE, ICONS_16 + "Reference.gif");
        addImageFilePath(IMG_16_COMPONENT_SERVICE, ICONS_16 + "Service.gif");
        addImageFilePath(IMG_16_COMPONENT_REFERENCE, ICONS_16 + "Reference.gif");
        addImageFilePath(IMG_16_CONNECTION, ICONS_16 + "Wire.gif");
        addImageFilePath(IMG_16_CHAIN, ICONS_16 + "chain_small.png");
        addImageFilePath(IMG_16_PLUS, ICONS_16 + "plus.png");
        addImageFilePath(IMG_16_IMPLEMENTATION_TYPE, ICONS_16 + "ImplementationType.gif");
        addImageFilePath(IMG_16_INTERFACE, ICONS_16 + "interface.gif");
        addImageFilePath(IMG_16_INTERFACE_OVERRIDE, ICONS_16 + "interface_override.gif");
        addImageFilePath(IMG_16_SWITCHYARD, ICONS_16 + "switchyard_icon_16px.png");
        addImageFilePath(IMG_16_SYNCHRONIZE, ICONS_16 + "synchronize.gif");
    }

}
