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

import static org.eclipse.swtbot.swt.finder.waits.Conditions.shellCloses;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;

/**
 *  Fire up the SwitchYard Project editor and update settings.
 */
public class NewSYProjectBot {
    
    private static SWTWorkbenchBot bot = new SWTWorkbenchBot();
    private SWTBotShell shell;
    
    public NewSYProjectBot() {
        bot.menu("File").menu("New").menu("Project...").click();
        shell = bot.shell("New Project");
        shell.activate();
        SWTBotTree tree = bot.tree();
        tree.expandNode("SwitchYard");
        SWTBotTreeItem item = tree.getTreeItem("SwitchYard");
        SWTBotTreeItem wizard = item.getNode("SwitchYard Project");
        wizard.select();
        bot.button("Next >").click();
    }
    
    public void setProjectName(String projectName) {
        bot.textWithLabel("Project name:").setText(projectName);
        bot.button("Next >").click();
    }
    
    public void setComponentChecked(String componentName) {
        SWTBotTable table = bot.tableWithLabel("Components:");
        table.getTableItem(componentName).check();
    }

    public void finish() {
        bot.button("Finish").click();
        bot.waitUntil(shellCloses(shell));
    }
}
