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
import junit.framework.Assert;

import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.switchyard.tools.ui.editor.tests.swt.common.ProjectExplorerBot;
import org.switchyard.tools.ui.editor.tests.swt.common.SYEditorBot;
import org.switchyard.tools.ui.editor.tests.swt.utils.TestUtils;

/**
 *  Create a component and add a Bean implementation.
 */
public class DemoGenerateWSDLTests extends SWTBotGefTestCase {

    private SYEditorBot syEditorBot; 
    
    @Before
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("[DemoGenerateWSDLTests]");
        SWTBotPreferences.TIMEOUT = 60000; // increase to 60 second delay
        syEditorBot = new SYEditorBot();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
        SWTBotPreferences.TIMEOUT = 5000; // return to 5 second delay
        System.out.println("[/DemoGenerateWSDLTests]");
    }

    @Test
    public void testGenerateWSDL() {
        ProjectExplorerBot projectExplorerBot = new ProjectExplorerBot();
        if (!projectExplorerBot.getLinkWithEditor()) {
            projectExplorerBot.setLinkWithEditor();
        }
        
        syEditorBot.findShapeWithClassAndClickMenu(ComponentService.class, "Generate WSDL File");
        
        SWTBotShell[] shells = bot.shells();
        SWTBotShell wizard = null;
        for (SWTBotShell shell : shells) {
            if (shell.getText().equals("Java2WSDL")) {
                wizard = shell;
                break;
            }
        }
        wizard.activate();
        bot.button("Finish").click();
        bot.waitUntil(shellCloses(wizard));
        TestUtils.waitForBuildsToFinish();
        
        SWTBotTreeItem wsdlFile = 
                projectExplorerBot.canFindItemInTree("Payments.wsdl");
        Assert.assertNotNull(wsdlFile);
    }
}
