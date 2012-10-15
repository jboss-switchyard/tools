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
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotText;
import org.eclipse.swtbot.swt.finder.widgets.TimeoutException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.ui.editor.tests.swt.common.MavenConsoleBot;
import org.switchyard.tools.ui.editor.tests.swt.common.MavenTestBot;
import org.switchyard.tools.ui.editor.tests.swt.common.SYEditorBot;
import org.switchyard.tools.ui.editor.tests.swt.utils.TestUtils;

/**
 *  Create a component and add a Bean implementation.
 */
public class DemoUseCamelImplTests extends SWTBotGefTestCase {

    private SWTBotGefEditor editor;
    private SYEditorBot syEditorBot; 
    
    private static String srcFolder;
    private static String packageName;
    private static String camelJavaRouteName;
    
    @Before
    protected void setUp() throws Exception {
        super.setUp();
        SWTBotPreferences.TIMEOUT = 90000; // increase to 90 second delay
        syEditorBot = new SYEditorBot();
        editor = bot.gefEditor("switchyard.xml");
        System.out.println("[DemoUseCamelImplTests]");
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
        SWTBotPreferences.TIMEOUT = 5000; // return to 5 second delay
        System.out.println("[/DemoUseCamelImplTests]");
    }

    @Test
    public void testAddCamelToComponent() {
        editor.activateTool(SYEditorTests.TOOL_CAMEL_JAVA);
        
        Shape component = syEditorBot.findShapeForEClass(Component.class);
        GraphicsAlgorithm componentGA = component.getGraphicsAlgorithm();
        int x = componentGA.getX() + 50;
        int y = componentGA.getY() + 50;
        editor.click(x, y);
        
        if (bot.shell("Replace Current Implementation").isActive()) {
            System.out.println("Closing Replace Current Implementation dialog");
            SWTBotShell areYouSure = bot.shell("Replace Current Implementation");
            areYouSure.activate();
            bot.button("Yes").click();
        }
        
        SWTBotShell camelJavaRoutedialog = bot.shell("Camel Implementation");
        assertNotNull("Found the Camel Java Route Details dialog", camelJavaRoutedialog);
        if (!camelJavaRoutedialog.isActive()) {
            try {
                camelJavaRoutedialog.activate();
            } catch (TimeoutException timeout) {
                fail("Couldn't activate the Java Route Details dialog.");
            }
        }
        camelJavaRoutedialog.bot().link().click();
        
        SWTBotShell routeClassDialog = bot.shell("New Java Class");
        routeClassDialog.activate();
        SWTBotText beanFolderText = bot.textWithLabel("Source folder:");
        srcFolder = beanFolderText.getText();
        SWTBotText beanPackageText = bot.textWithLabel("Package:");
        packageName = beanPackageText.getText();
        SWTBotText camelNameText2 = bot.textWithLabel("Name:", 0);
        camelJavaRouteName = camelNameText2.getText();
        bot.button("Finish").click();
        
        camelJavaRoutedialog.activate();
        bot.button("Finish").click();
        
        Component componentBO = (Component) syEditorBot.getBOforPE(component);
        System.out.println("Found component: " + componentBO.toString());
        if (!(componentBO.getImplementation() instanceof CamelImplementationType)) {
            fail("Implementation not added.");
        }
        
        syEditorBot.autoLayoutDiagram();

        try {
            syEditorBot.saveCurrentEditor();
            TestUtils.waitForBuildsToFinish();
            syEditorBot.validateDiagram();
            TestUtils.waitForBuildsToFinish();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        updateJavaFiles();
        executeTest();
    }
    
    private void updateJavaFiles() {
        IProject project = syEditorBot.getProjectForOpenFile();
        System.out.println(project.toString());
        try {
            if (srcFolder.indexOf(project.getName()) > -1) {
                srcFolder = srcFolder.substring(srcFolder.indexOf('/') + 1);
            }
            System.out.println("Source Folder: " + srcFolder);
            System.out.println("Package name: " + packageName);
            System.out.println("Camel Java Class name: " + camelJavaRouteName);
            TestUtils.loadJavaFile(project, srcFolder,
                    packageName, "PaymentsRoute.java", "test-files/PaymentsRoute.java");
            
            project.refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
            TestUtils.rebuildProject(project);
            TestUtils.waitForBuildsToFinish();

        } catch (CoreException e) {
            e.printStackTrace();
            fail(e.getLocalizedMessage());
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
