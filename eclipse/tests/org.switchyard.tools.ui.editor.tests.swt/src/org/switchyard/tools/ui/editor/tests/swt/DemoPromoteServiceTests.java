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

import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.allOf;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.widgetOfType;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withStyle;
import static org.eclipse.swtbot.swt.finder.waits.Conditions.shellCloses;

import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotRadio;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.switchyard.tools.ui.editor.tests.swt.common.ProjectExplorerBot;
import org.switchyard.tools.ui.editor.tests.swt.common.SYEditorBot;
import org.switchyard.tools.ui.editor.tests.swt.utils.TestUtils;

/**
 *  Create a test class and run it in Maven.
 */
public class DemoPromoteServiceTests extends SWTBotGefTestCase {

    private SYEditorBot syEditorBot; 
    
    @Before
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("[DemoPromoteServiceTests]");
        SWTBotPreferences.TIMEOUT = 60000; // increase to 30 second delay
        syEditorBot = new SYEditorBot();
        syEditorBot.setFocus();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
        SWTBotPreferences.TIMEOUT = 5000; // return to 5 second delay
        System.out.println("[/DemoPromoteServiceTests]");
    }

    void deselectDefaultSelection() {
        UIThreadRunnable
        .syncExec(new VoidResult() {

            @SuppressWarnings("unchecked")
            public void run() {
                Matcher<Widget> matcher = allOf(widgetOfType(Button.class), withStyle(SWT.RADIO, "SWT.RADIO"));
                Button b = (Button) bot.widget(matcher, 0); // the default selection
                b.setSelection(false);
                
            }
            
        });
    }
    
    @Test
    public void testPromoteServiceClass() {
        ProjectExplorerBot projectExplorerBot = new ProjectExplorerBot();
        if (!projectExplorerBot.getLinkWithEditor()) {
            projectExplorerBot.setLinkWithEditor();
        }
        SWTBotTreeItem wsdlFile = 
                projectExplorerBot.canFindItemInTree("Payments.wsdl");
        wsdlFile.select();
        
        syEditorBot.setDiagramEditorFocus();
        syEditorBot.findShapeWithClassAndClickMenu(ComponentService.class, "Promote Component Service");
        
        SWTBotShell wizard = bot.shell("Promote Component Service");
        wizard.activate();
        
        final SWTBotRadio wsdlRadio = bot.radio("WSDL");
        UIThreadRunnable.syncExec(new VoidResult(){

            @Override
            public void run() {
                // this is to work around bugzilla 286897
                // otherwise we could just go wsdlRadio.click() to have it work
                // may only be an issue on 3.7
                deselectDefaultSelection();
                wsdlRadio.click();
            }
        });
        bot.button("Browse...").click();
        
        SWTBotShell browseDialog = bot.shell("Select WSDL file and portType");
        browseDialog.activate();
        bot.sleep(1000);

        final SWTBotButton okBtn = bot.button("OK");
        bot.waitUntil( new DefaultCondition()
        {
            public boolean test() throws Exception {
                if (okBtn.isEnabled()) {
                    return true;
                }
                return false;
            }

            public String getFailureMessage() {
                return "Expected WSDL browse dialog with an 'OK' button.";
            }
        } );
        okBtn.click();
       
        wizard.activate();
        bot.textWithLabel("Name:").setText("PaymentService");
        bot.button("Next >").click();
        
        bot.comboBoxWithLabel("Transformer Type:", 0).setSelection("JAXB Transformer");
        
        bot.button("Finish").click();
        bot.waitUntil(shellCloses(wizard));
        try {
            syEditorBot.setDiagramEditorFocus();
            syEditorBot.autoLayoutDiagram();
            syEditorBot.saveCurrentEditor();
            TestUtils.waitForBuildsToFinish();
//            syEditorBot.validateDiagram();
//            TestUtils.waitForBuildsToFinish();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        bot.sleep(1000);

        Shape servicePE = syEditorBot.findShapeForEClass(Service.class);
        assertNotNull("Can't find New Promoted Service shape", servicePE);
        Service service = (Service) syEditorBot.getBOforPE(servicePE);
        Assert.assertEquals("Service name incorrect", "PaymentService", service.getName());
    }
}
