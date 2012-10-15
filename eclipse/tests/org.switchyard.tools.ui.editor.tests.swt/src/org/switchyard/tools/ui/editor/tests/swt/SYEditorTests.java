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
package org.switchyard.tools.ui.editor.tests.swt;

import junit.framework.Assert;

import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.switchyard.tools.ui.editor.tests.swt.common.SYEditorBot;

/**
 *  Verify that we can get to all the main parts of the SwitchYard editor.
 */
public class SYEditorTests extends SWTBotGefTestCase {

    private SYEditorBot syEditorBot; 
    
    public static final String TOOL_COMPONENT = "Component";
    public static final String TOOL_BEAN_IMPL = "Bean";
    public static final String TOOL_SERVICE = "Service";
    public static final String TOOL_REFERENCE = "Reference";
    public static final String TOOL_PROMOTE = "Promote";
    public static final String TOOL_CAMEL_JAVA = "Camel (Java)";
    public static final String TOOL_SOAP = "SOAP";
    public static final String TOOL_BPMN = "Process (BPMN)";
    
    @Before
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("[SYEditorTests]");
        SWTBotPreferences.TIMEOUT = 30000; // increase to 30 second delay
        syEditorBot = new SYEditorBot();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
        SWTBotPreferences.TIMEOUT = 5000; // return to 5 second delay
        System.out.println("[/SYEditorTests]");
    }

    @Test
    public void testActivateTool() {
        String[] components = new String[] {TOOL_BEAN_IMPL, 
                TOOL_COMPONENT, TOOL_PROMOTE, TOOL_REFERENCE, TOOL_SERVICE};
        for (String componentStr : components) {
            syEditorBot.getToolComponent(componentStr);
        }
    }
    
    @Test
    public void testFindCompositeOnCanvas() {
        Shape composite = syEditorBot.findShapeForEClass(Composite.class);
        Composite root = (Composite) syEditorBot.getBOforPE(composite);
        String compositeName = root.getName();
        Assert.assertEquals(ProjectCreationTests.PROJECT_NAME, compositeName);
    }

    @Test
    public void testFindEditorPages() {
        syEditorBot.getEditorPage("Source");
        syEditorBot.getEditorPage("Design");
    }

    @Test
    public void testCleanupDiagram() {
        syEditorBot.autoLayoutDiagram();
    }
}
