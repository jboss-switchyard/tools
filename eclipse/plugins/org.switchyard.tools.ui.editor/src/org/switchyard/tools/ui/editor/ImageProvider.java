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

    /** Image for bean. **/
    public static final String IMG_16_BEAN = PREFIX + "bean" + DOT16;
    
    /** Image for bpmn. **/
    public static final String IMG_16_BPMN = PREFIX + "bpmn" + DOT16;
    
    /** Image for camel. **/
    public static final String IMG_16_CAMEL = PREFIX + "camel" + DOT16;
    
    /** Image for camel. **/
    public static final String IMG_16_CAMEL_XML = PREFIX + "camel.xml" + DOT16;

    /** Image for camel. **/
    public static final String IMG_16_CAMEL_JAVA = PREFIX + "camel.java" + DOT16;

    /** Image for file. **/
    public static final String IMG_16_FILE = PREFIX + "file" + DOT16;
    
    /** Image for ftp. **/
    public static final String IMG_16_FTP = PREFIX + "ftp" + DOT16;
    
    /** Image for http. **/
    public static final String IMG_16_HTTP = PREFIX + "http" + DOT16;
    
    /** Image for netty. **/
    public static final String IMG_16_NETTY = PREFIX + "netty" + DOT16;
    
    /** Image for netty tcp. **/
    public static final String IMG_16_NETTY_TCP = PREFIX + "netty.tcp" + DOT16;

    /** Image for netty udp. **/
    public static final String IMG_16_NETTY_UDP = PREFIX + "netty.udp" + DOT16;

    /** Image for JMS. **/
    public static final String IMG_16_QUEUE = PREFIX + "queue" + DOT16;
    
    /** Image for Rules. **/
    public static final String IMG_16_RULES = PREFIX + "rules" + DOT16;
    
    /** Image for Schedulers. **/
    public static final String IMG_16_SCHEDULER = PREFIX + "scheduler" + DOT16;
    
    /** Image for SOAP. **/
    public static final String IMG_16_SOAP = PREFIX + "soap" + DOT16;
    
    /** Image for SQL. **/
    public static final String IMG_16_SQL = PREFIX + "sql" + DOT16;
    
    /** Image for BPEL. **/
    public static final String IMG_16_BPEL = PREFIX + "BPEL" + DOT16;

    /** Image for HORNETQ. **/
    public static final String IMG_16_HORNETQ = PREFIX + "HORNETQ" + DOT16;

    /** Image for JCA. **/
    public static final String IMG_16_JCA = PREFIX + "JCA" + DOT16;

    /** Image for RESTEASY. **/
    public static final String IMG_16_RESTEASY = PREFIX + "RESTEASY" + DOT16;

    /** Image for ESB interface. **/
    public static final String IMG_16_ESB = PREFIX + "ESB" + DOT16;

    /** Image for WSDL interface. **/
    public static final String IMG_16_WSDL = PREFIX + "WSDL" + DOT16;

    /** Image for CLOJURE. **/
    public static final String IMG_16_CLOJURE = PREFIX + "CLOJURE" + DOT16;
    
    /** Image for Remote **/
    public static final String IMG_16_REMOTE = PREFIX + "REMOTE" + DOT16;

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
        addImageFilePath(IMG_16_BEAN, ICONS_16 + "bean.png");
        addImageFilePath(IMG_16_BPMN, ICONS_16 + "bpmn.png");
        addImageFilePath(IMG_16_CAMEL, ICONS_16 + "camel.png");
        addImageFilePath(IMG_16_CAMEL_XML, ICONS_16 + "camel_xml.png");
        addImageFilePath(IMG_16_CAMEL_JAVA, ICONS_16 + "camel_java.png");
        addImageFilePath(IMG_16_FILE, ICONS_16 + "file.png");
        addImageFilePath(IMG_16_FTP, ICONS_16 + "ftp.png");
        addImageFilePath(IMG_16_HTTP, ICONS_16 + "http.png");
        addImageFilePath(IMG_16_NETTY, ICONS_16 + "netty.png");
        addImageFilePath(IMG_16_NETTY_TCP, ICONS_16 + "netty_tcp.png");
        addImageFilePath(IMG_16_NETTY_UDP, ICONS_16 + "netty_udp.png");
        addImageFilePath(IMG_16_QUEUE, ICONS_16 + "queue.png");
        addImageFilePath(IMG_16_RULES, ICONS_16 + "drools.png");
        addImageFilePath(IMG_16_SCHEDULER, ICONS_16 + "scheduler.png");
        addImageFilePath(IMG_16_SOAP, ICONS_16 + "soap.png");
        addImageFilePath(IMG_16_SQL, ICONS_16 + "sql.png");
        addImageFilePath(IMG_16_BPEL, ICONS_16 + "bpel.png");
        addImageFilePath(IMG_16_HORNETQ, ICONS_16 + "hornetQ.png");
        addImageFilePath(IMG_16_JCA, ICONS_16 + "jca.png");
        addImageFilePath(IMG_16_RESTEASY, ICONS_16 + "resteasy.png");
        addImageFilePath(IMG_16_ESB, ICONS_16 + "esb.png");
        addImageFilePath(IMG_16_WSDL, ICONS_16 + "wsdl.png");
        addImageFilePath(IMG_16_CLOJURE, ICONS_16 + "clojure.png");
        addImageFilePath(IMG_16_REMOTE, ICONS_16 + "remote.png");
    }

}
