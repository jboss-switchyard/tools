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
package org.switchyard.tools.ui.editor.tests.swt.common;

//import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.switchyard.tools.ui.editor.tests.swt.ProjectCreationTests;
import org.switchyard.tools.ui.editor.tests.swt.utils.ContextMenuHelper;
import org.switchyard.tools.ui.editor.tests.swt.utils.TestUtils;

/**
 *  Execute a maven test on the project.
 */
public class MavenTestBot {

    public static final String MAVEN_TEST_MENU = "Maven test";
    public static final String RUN_AS_MENU = "Run As";
    
//    private SWTWorkbenchBot bot= new SWTWorkbenchBot();

    public MavenTestBot() {
    }

    public void executeTest() {
        ProjectExplorerBot projectExplorerBot = new ProjectExplorerBot();
        final SWTBotTreeItem projectentry = 
                projectExplorerBot.canFindItemInTree(ProjectCreationTests.PROJECT_NAME);
//        bot.activeView().setFocus();
        projectentry.select();
        
        ContextMenuHelper.clickContextMenu(projectExplorerBot.getTree(), 
                RUN_AS_MENU, MAVEN_TEST_MENU);
        
        TestUtils.waitForBuildsToFinish();
    }

}
