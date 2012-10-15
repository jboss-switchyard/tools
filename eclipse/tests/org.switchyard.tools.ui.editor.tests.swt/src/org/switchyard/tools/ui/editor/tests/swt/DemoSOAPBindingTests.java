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

import static org.eclipse.swtbot.swt.finder.waits.Conditions.shellCloses;

import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.ui.editor.tests.swt.common.SYEditorBot;
import org.switchyard.tools.ui.editor.tests.swt.utils.TestUtils;

/**
 *  Create a component and add a Bean implementation.
 */
public class DemoSOAPBindingTests extends SWTBotGefTestCase {

    private SWTBotGefEditor editor;
    private SYEditorBot syEditorBot; 
    
    @Before
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("[DemoSOAPBindingTests]");
        SWTBotPreferences.TIMEOUT = 60000; // increase to 60 second delay
        syEditorBot = new SYEditorBot();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
        SWTBotPreferences.TIMEOUT = 5000; // return to 5 second delay
        System.out.println("[/DemoSOAPBindingTests]");
    }

    @Test
    public void testAddToService() {
        editor = bot.gefEditor("switchyard.xml");
        editor.activateTool(SYEditorTests.TOOL_SOAP);
        
        Shape service = syEditorBot.findShapeForEClass(Service.class);
        GraphicsAlgorithm serviceGA = service.getGraphicsAlgorithm();
        int x = serviceGA.getX() + 50;
        int y = serviceGA.getY() + 50;
        editor.click(x, y);
        
        SWTBotShell wizard = bot.shell("SOAP Binding");
        wizard.activate();
        bot.checkBox("Unwrapped Payload").click();
        bot.button("Finish").click();
        bot.waitUntil(shellCloses(wizard));
        
        Service serviceBO = (Service) syEditorBot.getBOforPE(service);
        System.out.println("Found service: " + serviceBO.toString());
        if (!(serviceBO.getBinding().get(0) instanceof SOAPBindingType)) {
            fail("Binding not added.");
        }
        try {
            syEditorBot.saveCurrentEditor();
            TestUtils.waitForBuildsToFinish();
            syEditorBot.validateDiagram();
            TestUtils.waitForBuildsToFinish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 }
