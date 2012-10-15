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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.waits.ICondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotText;
import org.eclipse.swtbot.swt.finder.widgets.TimeoutException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.switchyard.tools.ui.editor.tests.swt.common.MavenConsoleBot;
import org.switchyard.tools.ui.editor.tests.swt.common.MavenTestBot;
import org.switchyard.tools.ui.editor.tests.swt.common.SYEditorBot;
import org.switchyard.tools.ui.editor.tests.swt.common.TableHasItems;
import org.switchyard.tools.ui.editor.tests.swt.utils.TestUtils;

/**
 *  Create a component and add a Bean implementation.
 */
public class DemoAddReferenceTests extends SWTBotGefTestCase {

    private SWTBotGefEditor editor;
    private SYEditorBot syEditorBot; 

    @Before
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("[DemoAddReferenceTests]");
        SWTBotPreferences.TIMEOUT = 60000; // increase to 60 second delay
        syEditorBot = new SYEditorBot();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
        SWTBotPreferences.TIMEOUT = 5000; // return to 5 second delay
        System.out.println("[/DemoAddReferenceTests]");
    }

    @Test
    public void testAddReference() {
        editor = bot.gefEditor("switchyard.xml");
        editor.activateTool(SYEditorTests.TOOL_REFERENCE);
        
        Shape[] shapes = syEditorBot.findShapesForEClass(Component.class);
        Shape componentPE = null;
        for (Shape shape : shapes) {
            Component component = (Component) syEditorBot.getBOforPE(shape);
            if (component.getName().contentEquals("Component")) {
                componentPE = shape;
                break;
            }
        }
        assertNotNull("Can't find New Component shape", componentPE);
        Component component = (Component) syEditorBot.getBOforPE(componentPE);
        Assert.assertEquals("Component name incorrect", "Component", component.getName());

        GraphicsAlgorithm serviceGA = componentPE.getGraphicsAlgorithm();
        int x = serviceGA.getX() + 50;
        int y = serviceGA.getY() + 50;
        editor.click(x, y);
        
        SWTBotShell referenceDialog = bot.shell("New Reference");
        referenceDialog.activate();
        
        SWTBotButton browseBtn = bot.button("Browse...");
        browseBtn.click();
        
        SWTBotShell browseDialog = bot.activeShell();
        System.out.println("browse dialog: " + browseDialog.toString());
        browseDialog.activate();
        SWTBotText intfcClassText = bot.text();
        System.out.println("interface class: " + intfcClassText.toString());
        intfcClassText.setText("Payments");
        SWTBotTable list = bot.table();
        System.out.println("table: " + list.toString());
        try {
            System.out.println("Waiting for table to have items");
            ICondition listHasItems = new TableHasItems(list,1);
            bot.waitUntil(listHasItems, 45000);
        } catch (TimeoutException te) {
            Assert.fail("No items");
        }
        System.out.println("okButton: " + bot.button(0).toString());
        bot.button(0).click();
        bot.waitUntil(shellCloses(browseDialog));
        
        referenceDialog.activate();
        SWTBotText intfcNameText = bot.textWithLabel("Name:");
        intfcNameText.setText("AccountsPayable");

        bot.button("Finish").click();
        bot.waitUntil(shellCloses(referenceDialog));
        
        syEditorBot.autoLayoutDiagram();

        try {
            editor.save();
            TestUtils.waitForBuildsToFinish();
            syEditorBot.validateDiagram();
            TestUtils.waitForBuildsToFinish();
            updateJavaFiles();
            executeTest();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    private void updateJavaFiles() {
        IProject project = syEditorBot.getProjectForOpenFile();
        System.out.println(project.toString());
        try {
            String srcFolder = "src/main/java";
            String packageName = "com.example.switchyard.SWTBot_Project";
            TestUtils.loadJavaFile(project, srcFolder,
                    packageName, "PaymentsRoute.java", "test-files/PaymentsRoute2.java");
            
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
