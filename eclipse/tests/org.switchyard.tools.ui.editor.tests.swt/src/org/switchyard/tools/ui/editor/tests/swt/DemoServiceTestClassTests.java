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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.switchyard.tools.ui.editor.tests.swt.common.MavenConsoleBot;
import org.switchyard.tools.ui.editor.tests.swt.common.MavenTestBot;
import org.switchyard.tools.ui.editor.tests.swt.common.ProjectExplorerBot;
import org.switchyard.tools.ui.editor.tests.swt.common.SYEditorBot;
import org.switchyard.tools.ui.editor.tests.swt.utils.TestUtils;

/**
 *  Create a test class and run it in Maven.
 */
public class DemoServiceTestClassTests extends SWTBotGefTestCase {

    public static final String PAYMENTS_TEST_JAVA = "PaymentsTest.java";
    private SYEditorBot syEditorBot; 
    
    @Before
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("[DemoServiceTestClassTests]");
        SWTBotPreferences.TIMEOUT = 60000; // increase to 30 second delay
        syEditorBot = new SYEditorBot();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
        SWTBotPreferences.TIMEOUT = 5000; // return to 5 second delay
        System.out.println("[/DemoServiceTestClassTests]");
    }

    @Test
    public void testAddServiceTestClass() {
        syEditorBot.findShapeWithClassAndClickMenu(ComponentService.class, "New Service Test Class");
        
        SWTBotShell wizard = bot.shell("Service Test Class");
        wizard.activate();
        bot.button("Finish").click();
        TestUtils.waitForBuildsToFinish();
        
        IProject project = syEditorBot.getProjectForOpenFile();
        try {
            TestUtils.refreshProject(project);
            TestUtils.rebuildProject(project);
        } catch (CoreException e) {
            e.printStackTrace();
        }

        SWTBotEditor javaEditor = bot.editorByTitle(PAYMENTS_TEST_JAVA);
        Assert.assertNotNull("Can't find java editor for test class", javaEditor);

        // Update test class for this step from the code we stashed
        try {
            TestUtils.loadJavaFile(project, "src/test/java", 
                    "com.example.switchyard.SWTBot_Project", 
                    PAYMENTS_TEST_JAVA, "test-files/TestAssertCommented.java");
            TestUtils.refreshProject(project);
        } catch (CoreException e1) {
            e1.printStackTrace();
        }
        
        javaEditor.close();
        executeTest();

        try {
            ProjectExplorerBot projectExplorerBot = new ProjectExplorerBot();
            TestUtils.refreshProject(project);
            SWTBotTreeItem syFileTree = 
                    projectExplorerBot.canFindItemInTree("switchyard.xml");
            assertNotNull(syFileTree);
            syFileTree.select();
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    private void executeTest() {
        MavenTestBot testBot = new MavenTestBot();
        testBot.executeTest();
        
        MavenConsoleBot consoleBot = new MavenConsoleBot();
        Assert.assertEquals(true, consoleBot.isFinished());
        System.out.println(consoleBot.getConsoleText());
        Assert.assertEquals("Test Failed", false, consoleBot.isBuildFailed());
    }

}
