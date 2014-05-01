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

    private static final String DOT16 = ".16"; //$NON-NLS-1$
    private static final String ICONS_16 = "icons/16/"; //$NON-NLS-1$
    private static final String ICONS_SCALE = "icons/scale/"; //$NON-NLS-1$
    private static final String PREFIX = ImageProvider.class.getPackage().getName() + "."; //$NON-NLS-1$

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
    
    /** Image for Component Service 24. **/
    public static final String IMG_COMPONENT_SERVICE_SCALEABLE = PREFIX + Service.class.getSimpleName().toLowerCase() + ".scale"; //$NON-NLS-1$

    /** Image for Component Reference. **/
    public static final String IMG_16_COMPONENT_REFERENCE = PREFIX
            + ComponentReference.class.getSimpleName().toLowerCase() + DOT16;
    
    /** Image for Component Service 24. **/
    public static final String IMG_COMPONENT_REFERENCE_SCALEABLE = PREFIX + Reference.class.getSimpleName().toLowerCase() + ".scale"; //$NON-NLS-1$

    /** Image for Connection. **/
    public static final String IMG_16_CONNECTION = PREFIX + "connection" + DOT16; //$NON-NLS-1$

    /** Image for Chain decorator. **/
    public static final String IMG_16_CHAIN = PREFIX + "binding" + DOT16; //$NON-NLS-1$
    
    /** Image for Plus. **/
    public static final String IMG_16_PLUS = PREFIX + "plus" + DOT16; //$NON-NLS-1$

    /** Image for Interface. **/
    public static final String IMG_16_INTERFACE = PREFIX + Interface.class.getSimpleName().toLowerCase() + DOT16;

    /** Image for Interface override. **/
    public static final String IMG_16_INTERFACE_OVERRIDE = PREFIX + Interface.class.getSimpleName().toLowerCase() + "plus" + DOT16; //$NON-NLS-1$

    /** Image for SwitchYard override. **/
    public static final String IMG_16_SWITCHYARD = PREFIX + "SwitchYard" + DOT16; //$NON-NLS-1$

    /** Image for synchronize command. **/
    public static final String IMG_16_SYNCHRONIZE = PREFIX + "synchronize" + DOT16; //$NON-NLS-1$

    /** Image for bean. **/
    public static final String IMG_16_BEAN = PREFIX + "bean" + DOT16; //$NON-NLS-1$
    
    /** Image for bpmn. **/
    public static final String IMG_16_BPMN = PREFIX + "bpmn" + DOT16; //$NON-NLS-1$
    
    /** Image for camel. **/
    public static final String IMG_16_CAMEL = PREFIX + "camel" + DOT16; //$NON-NLS-1$
    
    /** Image for camel. **/
    public static final String IMG_16_CAMEL_XML = PREFIX + "camel.xml" + DOT16; //$NON-NLS-1$

    /** Image for camel. **/
    public static final String IMG_16_CAMEL_JAVA = PREFIX + "camel.java" + DOT16; //$NON-NLS-1$

    /** Image for file. **/
    public static final String IMG_16_FILE = PREFIX + "file" + DOT16; //$NON-NLS-1$
    
    /** Image for ftp. **/
    public static final String IMG_16_FTP = PREFIX + "ftp" + DOT16; //$NON-NLS-1$
    
    /** Image for ftps. **/
    public static final String IMG_16_FTPS = PREFIX + "ftps" + DOT16; //$NON-NLS-1$

    /** Image for sftp. **/
    public static final String IMG_16_SFTP = PREFIX + "sftp" + DOT16; //$NON-NLS-1$

    /** Image for http. **/
    public static final String IMG_16_HTTP = PREFIX + "http" + DOT16; //$NON-NLS-1$
    
    /** Image for netty. **/
    public static final String IMG_16_NETTY = PREFIX + "netty" + DOT16; //$NON-NLS-1$
    
    /** Image for netty tcp. **/
    public static final String IMG_16_NETTY_TCP = PREFIX + "netty.tcp" + DOT16; //$NON-NLS-1$

    /** Image for netty udp. **/
    public static final String IMG_16_NETTY_UDP = PREFIX + "netty.udp" + DOT16; //$NON-NLS-1$

    /** Image for JMS. **/
    public static final String IMG_16_QUEUE = PREFIX + "queue" + DOT16; //$NON-NLS-1$
    
    /** Image for Rules. **/
    public static final String IMG_16_RULES = PREFIX + "rules" + DOT16; //$NON-NLS-1$
    
    /** Image for Schedulers. **/
    public static final String IMG_16_SCHEDULER = PREFIX + "scheduler" + DOT16; //$NON-NLS-1$
    
    /** Image for SOAP. **/
    public static final String IMG_16_SOAP = PREFIX + "soap" + DOT16; //$NON-NLS-1$
    
    /** Image for SQL. **/
    public static final String IMG_16_SQL = PREFIX + "sql" + DOT16; //$NON-NLS-1$
    
    /** Image for BPEL. **/
    public static final String IMG_16_BPEL = PREFIX + "BPEL" + DOT16; //$NON-NLS-1$

    /** Image for HORNETQ. **/
    public static final String IMG_16_HORNETQ = PREFIX + "HORNETQ" + DOT16; //$NON-NLS-1$

    /** Image for JCA. **/
    public static final String IMG_16_JCA = PREFIX + "JCA" + DOT16; //$NON-NLS-1$

    /** Image for RESTEASY. **/
    public static final String IMG_16_RESTEASY = PREFIX + "RESTEASY" + DOT16; //$NON-NLS-1$

    /** Image for ESB interface. **/
    public static final String IMG_16_ESB = PREFIX + "ESB" + DOT16; //$NON-NLS-1$

    /** Image for WSDL interface. **/
    public static final String IMG_16_WSDL = PREFIX + "WSDL" + DOT16; //$NON-NLS-1$

    /** Image for CLOJURE. **/
    public static final String IMG_16_CLOJURE = PREFIX + "CLOJURE" + DOT16; //$NON-NLS-1$
    
    /** Image for Remote. **/
    public static final String IMG_16_REMOTE = PREFIX + "REMOTE" + DOT16; //$NON-NLS-1$

    /** Image for Mail. **/
    public static final String IMG_16_MAIL = PREFIX + "MAIL" + DOT16; //$NON-NLS-1$
    
    /** Image for JPA. **/
    public static final String IMG_16_JPA = PREFIX + "JPA" + DOT16; //$NON-NLS-1$

    /** Image for JPA. **/
    public static final String IMG_16_UNKNOWN_IMPL = PREFIX + "UNKNOWN_IMPL" + DOT16; //$NON-NLS-1$
    
    /** Image for Change Interface floating toolbar button. **/
    public static final String IMG_16_INTERFACE_DELTA = PREFIX + "INTERFACE-DELTA" + DOT16; //$NON-NLS-1$

    /** Image for Edit Interface floating toolbar button. **/
    public static final String IMG_16_EDIT_INTERFACE = PREFIX + "EDIT_INTERFACE" + DOT16; //$NON-NLS-1$

    /** Image for promote floating toolbar button. **/
    public static final String IMG_16_PROMOTE = PREFIX + "PROMOTE" + DOT16; //$NON-NLS-1$

    /** Image for auto-layout floating toolbar button. **/
    public static final String IMG_16_AUTO_LAYOUT = PREFIX + "AUTO_LAYOUT" + DOT16; //$NON-NLS-1$

    /** Image for auto-layout floating toolbar button. **/
    public static final String IMG_16_TEST_CLASS = PREFIX + "TEST_CLASS" + DOT16; //$NON-NLS-1$

    /** Image for Java2WSDL floating toolbar button. **/
    public static final String IMG_16_JAVA_2_WSDL = PREFIX + "JAVA_2_WSDL" + DOT16; //$NON-NLS-1$

    /** Image for WSDL2Javafloating toolbar button. **/
    public static final String IMG_16_WSDL_2_JAVA = PREFIX + "WSDL_2_JAVA" + DOT16; //$NON-NLS-1$

    /** Image for SCA binding. **/
    public static final String IMG_16_SCA = PREFIX + "SCA" + DOT16; //$NON-NLS-1$
    
    /** Image for SAP binding. **/
    public static final String IMG_16_SAP = PREFIX + "SAP" + DOT16; //$NON-NLS-1$

    /** Image for Properties dialog. **/
    public static final String IMG_16_PROPERTIES = PREFIX + "PROPERTIES" + DOT16; //$NON-NLS-1$

    /** Image for breakpoint decorator. **/
    public static final String IMG_16_SERVICE_WATCH = PREFIX + "SERVICE_WATCH" + DOT16; //$NON-NLS-1$

    /** Image for breakpoint decorator. **/
    public static final String IMG_16_VALIDATE_WATCH = PREFIX + "VALIDATE_WATCH" + DOT16; //$NON-NLS-1$

    /** Image for breakpoint decorator. **/
    public static final String IMG_16_TRANSFORM_WATCH = PREFIX + "TRANSFORM_WATCH" + DOT16; //$NON-NLS-1$

    /** Image for RSS & Atom feeds. **/
    public static final String IMG_16_FEED = PREFIX + "FEED" + DOT16; //$NON-NLS-1$

    @Override
    protected void addAvailableImages() {
        addImageFilePath(IMG_16_COMPOSITE, ICONS_16 + "Composite.gif"); //$NON-NLS-1$
        addImageFilePath(IMG_16_COMPONENT, ICONS_16 + "Component.gif"); //$NON-NLS-1$
        addImageFilePath(IMG_16_SERVICE, ICONS_16 + "Service.gif"); //$NON-NLS-1$
        addImageFilePath(IMG_16_REFERENCE, ICONS_16 + "Reference.gif"); //$NON-NLS-1$
        addImageFilePath(IMG_16_COMPONENT_SERVICE, ICONS_16 + "Service.gif"); //$NON-NLS-1$
        addImageFilePath(IMG_COMPONENT_SERVICE_SCALEABLE, ICONS_SCALE + "shaded-service.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_COMPONENT_REFERENCE, ICONS_16 + "Reference.gif"); //$NON-NLS-1$
        addImageFilePath(IMG_COMPONENT_REFERENCE_SCALEABLE, ICONS_SCALE + "shaded-reference.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_CONNECTION, ICONS_16 + "Wire.gif"); //$NON-NLS-1$
        addImageFilePath(IMG_16_CHAIN, ICONS_16 + "chain_small.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_PLUS, ICONS_16 + "plus.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_IMPLEMENTATION_TYPE, ICONS_16 + "ImplementationType.gif"); //$NON-NLS-1$
        addImageFilePath(IMG_16_INTERFACE, ICONS_16 + "interface.gif"); //$NON-NLS-1$
        addImageFilePath(IMG_16_INTERFACE_OVERRIDE, ICONS_16 + "interface_override.gif"); //$NON-NLS-1$
        addImageFilePath(IMG_16_SWITCHYARD, ICONS_16 + "switchyard_icon_16px.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_SYNCHRONIZE, ICONS_16 + "synchronize.gif"); //$NON-NLS-1$
        addImageFilePath(IMG_16_BEAN, ICONS_16 + "bean.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_BPMN, ICONS_16 + "bpmn.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_CAMEL, ICONS_16 + "camel.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_CAMEL_XML, ICONS_16 + "camel_xml.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_CAMEL_JAVA, ICONS_16 + "camel_java.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_FILE, ICONS_16 + "file.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_FTP, ICONS_16 + "ftp.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_FTPS, ICONS_16 + "ftps.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_SFTP, ICONS_16 + "sftp.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_HTTP, ICONS_16 + "http.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_NETTY, ICONS_16 + "netty.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_NETTY_TCP, ICONS_16 + "netty_tcp.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_NETTY_UDP, ICONS_16 + "netty_udp.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_QUEUE, ICONS_16 + "queue.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_RULES, ICONS_16 + "drools.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_SCHEDULER, ICONS_16 + "scheduler.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_SOAP, ICONS_16 + "soap.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_SQL, ICONS_16 + "sql.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_BPEL, ICONS_16 + "bpel.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_HORNETQ, ICONS_16 + "hornetQ.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_JCA, ICONS_16 + "jca.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_RESTEASY, ICONS_16 + "resteasy.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_ESB, ICONS_16 + "esb.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_WSDL, ICONS_16 + "wsdl.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_CLOJURE, ICONS_16 + "clojure.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_REMOTE, ICONS_16 + "remote.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_MAIL, ICONS_16 + "mail.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_JPA, ICONS_16 + "jpa.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_UNKNOWN_IMPL, ICONS_16 + "unknown_impl.gif"); //$NON-NLS-1$
        addImageFilePath(IMG_16_INTERFACE_DELTA, ICONS_16 + "interface-delta.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_EDIT_INTERFACE, ICONS_16 + "intfc-edit.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_PROMOTE, ICONS_16 + "promote.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_AUTO_LAYOUT, ICONS_16 + "layout.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_JAVA_2_WSDL, ICONS_16 + "java2wsdl.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_WSDL_2_JAVA, ICONS_16 + "wsdl2java.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_TEST_CLASS, ICONS_16 + "test-class.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_SCA, ICONS_16 + "sca.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_SAP, ICONS_16 + "sap.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_PROPERTIES, ICONS_16 + "properties.gif"); //$NON-NLS-1$
        addImageFilePath(IMG_16_SERVICE_WATCH, ICONS_16 + "jwatch_obj.gif"); //$NON-NLS-1$
        addImageFilePath(IMG_16_VALIDATE_WATCH, ICONS_16 + "validatewatch.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_TRANSFORM_WATCH, ICONS_16 + "transformwatch.png"); //$NON-NLS-1$
        addImageFilePath(IMG_16_FEED, ICONS_16 + "feed.png"); //$NON-NLS-1$
    }

}
