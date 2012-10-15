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

import org.eclipse.swtbot.eclipse.finder.SWTBotEclipseTestCase;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.switchyard.tools.ui.editor.tests.swt.common.NewSYProjectBot;
import org.switchyard.tools.ui.editor.tests.swt.common.ProjectExplorerBot;
import org.switchyard.tools.ui.editor.tests.swt.utils.TestUtils;

/**
 *  Create a new SwitchYard project and make sure everything is ok.
 */
public class ProjectCreationTests extends SWTBotEclipseTestCase {

    private SWTWorkbenchBot bot = new SWTWorkbenchBot();
    
    public static final String PROJECT_NAME = "SWTBot-Project";

    @Before
    public void setUp() throws Exception {
        super.setUp();
        System.out.println("[ProjectCreationTests]");
        TestUtils.closeWelcomePage(bot);
    }

    @After
    public void tearDown() throws Exception {
        SWTBotPreferences.TIMEOUT = 5000;
        System.out.println("[/ProjectCreationTests]");
    }

    @Test
    public void testCreateProject() {
        SWTBotPreferences.TIMEOUT = 90000; // increase because maven takes a while
        NewSYProjectBot newProjectBot = new NewSYProjectBot();
        newProjectBot.setProjectName(PROJECT_NAME);
        newProjectBot.setComponentChecked("Bean");
        newProjectBot.setComponentChecked("BPM (jBPM)");
        newProjectBot.setComponentChecked("Camel");
        newProjectBot.setComponentChecked("SOAP");
        newProjectBot.finish();
    }
    
    @Test
    public void testDoesProjectExist() {
        SWTBotPreferences.TIMEOUT = 60000;
        ProjectExplorerBot projectExplorerBot = new ProjectExplorerBot();
        projectExplorerBot.canFindItemInTree(PROJECT_NAME);
        projectExplorerBot.doubleClickProject(PROJECT_NAME);
        Assert.assertEquals("Project " + PROJECT_NAME + " could not be found.",
                true, projectExplorerBot.isProjectSelected(PROJECT_NAME));
    }
}
