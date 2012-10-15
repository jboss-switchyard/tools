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
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotText;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.switchyard.tools.models.switchyard1_0.bean.BeanImplementationType;
import org.switchyard.tools.ui.editor.tests.swt.common.SYEditorBot;
import org.switchyard.tools.ui.editor.tests.swt.utils.TestUtils;

/**
 *  Create a component and add a Bean implementation.
 */
public class DemoBeanTests extends SWTBotGefTestCase {

    private SWTBotGefEditor editor;
    private SYEditorBot syEditorBot; 
    
    private static String srcFolder;
    private static String packageName;
    private static String beanName;
    private static String intfcName;
    
    @Before
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("[DemoBeanTests]");
        SWTBotPreferences.TIMEOUT = 90000; // increase to 90 second delay
        syEditorBot = new SYEditorBot();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
        SWTBotPreferences.TIMEOUT = 5000; // return to 5 second delay
        System.out.println("[/DemoBeanTests]");
    }

    @Test
    public void testAddShapeToCanvasFromPalette() {
        editor = bot.gefEditor("switchyard.xml");
        editor.activateTool(SYEditorTests.TOOL_COMPONENT);
        editor.click(50, 50);

        Shape componentPE = syEditorBot.findShapeForEClass(Component.class);
        assertNotNull("Can't find New Component shape", componentPE);
        Component component = (Component) syEditorBot.getBOforPE(componentPE);
        Assert.assertEquals("Component name incorrect", "Component", component.getName());
    }
    
    @Test
    public void testAddToComponent() {
        editor = bot.gefEditor("switchyard.xml");
        editor.activateTool(SYEditorTests.TOOL_BEAN_IMPL);
        
        Shape composite = syEditorBot.findShapeForEClass(Composite.class);
        int x = composite.getGraphicsAlgorithm().getX();
        int y = composite.getGraphicsAlgorithm().getY();
        
        Shape component = syEditorBot.findShapeForEClass(Component.class);
        x = x + component.getGraphicsAlgorithm().getX() + 10;
        y = y + component.getGraphicsAlgorithm().getY() + 10;
        System.out.println("X = " + x + ", Y = " + y);
        
        editor.click(x, y);
        
        SWTBotShell wizard = bot.shell("Bean Implementation");
        wizard.bot().link().click();
        
        SWTBotShell beandialog = bot.shell("New Bean Service");
        beandialog.activate();
        SWTBotText beanNameText = bot.textWithLabel("Name:", 0);
        beanNameText.setText("Payments");
        bot.link().click();
        
        SWTBotShell interfaceDialog = bot.shell("New Java Interface");
        interfaceDialog.activate();
        bot.textWithLabel("Name:").setText("Payments");
        intfcName = "Payments.java";
        bot.button("Finish").click();
        bot.waitUntil(shellCloses(interfaceDialog));
        
        beandialog.activate();
        SWTBotText beanFolderText = bot.textWithLabel("Source folder:");
        srcFolder = beanFolderText.getText();
        SWTBotText beanPackageText = bot.textWithLabel("Package:");
        packageName = beanPackageText.getText();
        SWTBotText beanNameText2 = bot.textWithLabel("Name:", 0);
        beanName = beanNameText2.getText();
        
        bot.button("Finish").click();
        bot.waitUntil(shellCloses(beandialog));
        
        wizard.activate();
        bot.button("Finish").click();
        bot.waitUntil(shellCloses(wizard));

        Component componentBO = (Component) syEditorBot.getBOforPE(component);
        System.out.println("Found component: " + componentBO.toString());
        if (!(componentBO.getImplementation() instanceof BeanImplementationType)) {
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
    }
    
    @Test
    public void testUpdateJavaFiles() {
        IProject project = syEditorBot.getProjectForOpenFile();
        System.out.println(project.toString());
        try {
            if (srcFolder.indexOf(project.getName()) > -1) {
                srcFolder = srcFolder.substring(srcFolder.indexOf('/') + 1);
            }
            System.out.println("Source Folder: " + srcFolder);
            System.out.println("Package name: " + packageName);
            System.out.println("Interface Name: " + intfcName);
            System.out.println("Bean name: " + beanName);
            TestUtils.loadJavaFile(project, srcFolder, 
                    packageName, intfcName, "test-files/Payments.java");
            
            TestUtils.loadJavaFile(project, srcFolder,
                    packageName, "Invoice.java", "test-files/Invoice.java");
            
            TestUtils.loadJavaFile(project, srcFolder,
                    packageName, "PaymentsBean.java", "test-files/PaymentsBean.java");

            project.refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
            TestUtils.rebuildProject(project);
            TestUtils.waitForBuildsToFinish();

        } catch (CoreException e) {
            e.printStackTrace();
            fail(e.getLocalizedMessage());
        }
    }
}
