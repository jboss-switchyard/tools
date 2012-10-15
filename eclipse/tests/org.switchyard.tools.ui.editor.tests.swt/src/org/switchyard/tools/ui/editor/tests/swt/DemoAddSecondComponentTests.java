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
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
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
import org.switchyard.tools.models.switchyard1_0.bean.BeanImplementationType;
import org.switchyard.tools.ui.editor.tests.swt.common.SYEditorBot;
import org.switchyard.tools.ui.editor.tests.swt.common.TableHasItems;
import org.switchyard.tools.ui.editor.tests.swt.utils.TestUtils;

/**
 *  Create a second component and add a bean implementation.
 */
public class DemoAddSecondComponentTests extends SWTBotGefTestCase {

    public static final String ACCOUNTS_PAYABLE = "AccountsPayable";
    public static final String ACCOUNTS_PAYABLE_BEAN = "AccountsPayableBean";
    private SWTBotGefEditor editor;
    private SYEditorBot syEditorBot; 
    
    private static String srcFolder;
    private static String packageName;
    private static String beanName;
    private static String intfcName;
    
    @Before
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("[DemoAddSecondComponentTests]");
        SWTBotPreferences.TIMEOUT = 60000; // increase to 60 second delay
        syEditorBot = new SYEditorBot();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
        SWTBotPreferences.TIMEOUT = 5000; // return to 5 second delay
        System.out.println("[/DemoAddSecondComponentTests]");
    }

    @Test
    public void testAddNewAccountsPayableComponent() {
        editor = bot.gefEditor("switchyard.xml");
        editor.activateTool(SYEditorTests.TOOL_BEAN_IMPL);
        editor.click(50, 50);
        
        SWTBotShell beandialog = bot.shell("New Bean Service");
        beandialog.activate();
        
        // browse for the Payments.java interface class
        SWTBotButton browseBtn = bot.button("Browse...", 2);
        browseBtn.click();
        SWTBotShell browseDialog = bot.activeShell();
        System.out.println("browse dialog: " + browseDialog.toString());
        browseDialog.activate();
        SWTBotText classNameText = bot.text();
        System.out.println("classNameText: " + classNameText.toString());
        classNameText.setText("Payments");
        SWTBotTable list = bot.table();
        System.out.println("table: " + list.toString());
        try {
            System.out.println("Waiting for table to have items");
            ICondition listHasItems = new TableHasItems(list,1);
            bot.waitUntil(listHasItems, 60000);
        } catch (TimeoutException te) {
            Assert.fail("No items");
        }
        System.out.println("okButton: " + bot.button(0).toString());
        bot.button(0).click();
        bot.waitUntil(shellCloses(browseDialog));
        
        beandialog.activate();
        SWTBotText serviceNameText = bot.textWithLabel("Name:", 0);
        System.out.println("serviceNameText: " + serviceNameText.toString());
        System.out.println("serviceNameText: (old value) " + serviceNameText.getText());
        serviceNameText.setText(ACCOUNTS_PAYABLE_BEAN);
        System.out.println("serviceName set to: " + serviceNameText.getText());
        SWTBotText interfaceNameText = bot.textWithLabel("Name:", 2);
        System.out.println("interfaceNameText: " + interfaceNameText.toString());
        System.out.println("interfaceNameText: (old value) " + interfaceNameText.getText());
        interfaceNameText.setText(ACCOUNTS_PAYABLE);
        System.out.println("interfaceNameText set to: " + interfaceNameText.getText());
        beanName = serviceNameText.getText();
//        System.out.println("Service name: " + beanName);
        

        SWTBotText beanFolderText = bot.textWithLabel("Source folder:");
        srcFolder = beanFolderText.getText();
        SWTBotText beanPackageText = bot.textWithLabel("Package:");
        packageName = beanPackageText.getText();
        beanName = serviceNameText.getText();

        bot.button("Finish").click();
        bot.waitUntil(shellCloses(beandialog));
        
        syEditorBot.autoLayoutDiagram();
        
        Shape[] shapes = syEditorBot.findShapesForEClass(Component.class);
        Shape componentPE = null;
        for (Shape shape : shapes) {
            Component component = (Component) syEditorBot.getBOforPE(shape);
            if (component.getName().contentEquals(ACCOUNTS_PAYABLE_BEAN)) {
                componentPE = shape;
                break;
            }
        }
        assertNotNull("Can't find New Component shape", componentPE);
        Component component = (Component) syEditorBot.getBOforPE(componentPE);
        if (!(component.getImplementation() instanceof BeanImplementationType)) {
            fail("Implementation not added.");
        }
        
        ComponentService cservice = component.getService().get(0);
        assertNotNull("Couldn't find new component service on component", cservice);
        assertEquals("Names don't match", cservice.getName(), ACCOUNTS_PAYABLE);
        
        syEditorBot.autoLayoutDiagram();

        try {
            editor.save();
            TestUtils.waitForBuildsToFinish();
            syEditorBot.validateDiagram();
            TestUtils.waitForBuildsToFinish();
            updateJavaFiles();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            System.out.println("Interface Name: " + intfcName);
            System.out.println("Bean name: " + beanName);
            TestUtils.loadJavaFile(project, srcFolder, 
                    packageName, "AccountsPayableBean.java", "test-files/AccountsPayableBean.java");
            
            project.refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
            TestUtils.rebuildProject(project);
            TestUtils.waitForBuildsToFinish();

        } catch (CoreException e) {
            e.printStackTrace();
            fail(e.getLocalizedMessage());
        }
    }
}
